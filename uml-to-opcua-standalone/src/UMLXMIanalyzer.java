import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Attr;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.OutputKeys;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;

import java.util.ArrayList;

import java.util.HashMap;

public class UMLXMIanalyzer {
	
	/**
	 * the uml document*/
	private Document doc;
	/**
	 * the opcua document*/
	private OPCUADocument opcuadoc = null;
	private File inputFile;
	private FileOutputStream outStream;
	
	private String outPath;

	public static void main(String[] args) {
		if(args.length < 2){
			System.out.println("USAGE: java UMLXMIanalyzer inputPath outputPath [xsd]");
			return;			
		}
		String xsd = null;
		if(args.length > 2 && args.length <=3) {
			xsd = args[2];
		}else if(args.length >3){
			System.out.println("USAGE: java UMLXMIanalyzer inputPath outputPath [xsd]");
			return;	
		}
		UMLXMIanalyzer o = new UMLXMIanalyzer(args[0], args[1]);
		
		o.analyze();
		
		if(xsd != null)
			o.validateNodeSetFilewithXSD(xsd);
		else
			o.validateNodeSetFilewithXSD();
		
	}
	
	
	public UMLXMIanalyzer(String filePath, String outputpath){

		try {	
			this.inputFile = new File(filePath);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Error opening file " + filePath + "\n" + e.getMessage());
			return;
		}
		
		if(!this.inputFile.exists()){
			throw new IllegalStateException("File " + filePath + " does not exist!");
		}

		this.outPath = outputpath;
		try{
			this.outStream = new FileOutputStream(outputpath);
		}catch(Exception e){
			e.printStackTrace();
			return;
		}
		

		this.opcuadoc = new OPCUADocument();

	}
	
	/**
	 * analyzes the input model
	 * */
	public void analyze() {
		if(this.opcuadoc==null) {
			throw new IllegalStateException("FATAL ERROR");
		}
		
		try {	
			DocumentBuilderFactory dbFactory 
			= DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			this.doc = dBuilder.parse(this.inputFile);
			this.doc.getDocumentElement().normalize();
			System.out.println("Root element :" 
				+ doc.getDocumentElement().getNodeName());
		} catch (Exception e) {
			System.out.println("[Error] XML Error" + "\n" + e.getMessage());
			e.printStackTrace();
			throw new IllegalArgumentException("DOC ERROR" + e.getMessage());
		}
		
		
		ArrayList<Element> packagedElements = findAndProcessPackagedElements();
		checkProfiles(); //do that before doing the rest, links may get completely wrong otherwise
		checkPackagedElements(packagedElements);

		//opcuadoc.printOPCUAxml(this.outStream);
		//System.out.println(opcuadoc.printOPCUAxml());
		try{
			PrintWriter out = new PrintWriter(this.outPath);
			out.println(opcuadoc.printOPCUAxml());
			out.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			throw new IllegalArgumentException("PRINT ERROR" + e.getMessage());
		}
	}
	
	/**
	 * Standard schema check with the 1.03 nodeset
	 * */
	public void validateNodeSetFilewithXSD() {
		//TODO: more!
		opcuadoc.validateAgainstXSD("https://opcfoundation.org/UA/schemas/1.03/UANodeSet.xsd");
	}
	
	public void validateNodeSetFilewithXSD(String xsdPath) {
		//TODO: more!
		opcuadoc.validateAgainstXSD(xsdPath);
	}
	
	private void println(String s){
		System.out.println(s);
	}
	
	/**
	 * Finds packagedElements and turns them into ObjectTypes or Types
	 * @return List of all found packagedElements
	 * */
	private ArrayList<Element> findAndProcessPackagedElements(){
		ArrayList<Element> packagedElements = new ArrayList<Element>();
		NodeList nList = doc.getElementsByTagName("packagedElement");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element e = (Element) nNode;
				String type = e.getAttribute("xmi:type");
				String id = e.getAttribute("xmi:id");
				String name = e.getAttribute("name");
				
				Element parent;
				
				if(type.equals("uml:Class")){
					println("Class found! name: " + name);
					parent = opcuadoc.createObjectType(id, name);
					packagedElements.add(e);
				}
				if(type.equals("uml:PrimitiveType")){
					if(name.isEmpty())
						continue;
					println("PrimitiveType found! name: " + name);
					parent = opcuadoc.createUADataType(id, name);
					packagedElements.add(e);
				}
			}
		}
		return packagedElements;
	}
	
	/**
	 * through all transformation relevant children of all packagedElements
	 * */
	public void checkPackagedElements(ArrayList<Element> packagedElements){
		for(Element packagedElement : packagedElements){
		
			checkOwnedAttributes(packagedElement);
			
			checkOwnedOperations(packagedElement);
			
			checkGeneralizations(packagedElement);
			
		}
	}
	
	/**
	 * returns the type of an element
	 * @return either type attribute or one of Modelio's predefined types 
	 * */
	private String getType(Element e){
		String type = e.getAttribute("type");
		if("".equals(type)){
			return ((Element)e.getElementsByTagName("type").item(0)).getAttribute("href").split("#")[1];
		}else{
			return type;
		}
	}
	
	/**
	 * @return lower value of a composition
	 * */
	private String getLowerValue(Element e){
		NodeList l = e.getElementsByTagName("lowerValue");
		if(l == null || l.getLength() == 0)
			return "1";
		String  lower = ((Element)l.item(0)).getAttribute("value");
		return "".equals(lower) ? "0" : lower;
	}
	
	/**
	 * @return upper value of a composition
	 * */
	private String getUpperValue(Element e){
		NodeList u = e.getElementsByTagName("upperValue");
		if(u == null || u.getLength() == 0)
			return "1";
		String  upper = ((Element)u.item(0)).getAttribute("value");
		return "".equals(upper) ? "0" : upper;
	}
	
	/**
	 * 
	 * */
	private void checkOwnedAttributes(Element packagedElement){
		NodeList ownedAttributes = packagedElement.getElementsByTagName("ownedAttribute");
		for(int i=0; i< ownedAttributes.getLength(); i++){
			Node cur = ownedAttributes.item(i);
			if (cur.getNodeType() == Node.ELEMENT_NODE) {
				Element cure = (Element) cur;
				//String type = cure.getAttribute("type");
				//String id = cure.getAttribute("xmi:id");
				//String parametrizedname = cure.getAttribute("name");
				
				//get relevent attributes of the ownedAttribute
				AttributeProperty attrProp = new AttributeProperty();
				try {
					attrProp.analyzeAttribute(cure);
				}catch(Exception e){
					System.out.println(e.getMessage());
					continue;
				}
				String name = attrProp.name;
				String type = attrProp.type;
				String id = attrProp.id;
				boolean optional = attrProp.optional;
				boolean dynamic = attrProp.dynamic;
				String unit = attrProp.unit;
				String value = attrProp.value;
				boolean readOnly = attrProp.readOnly; 
				
				
				println("Type (maybe) found! name: " + name + " - type: "+ type + " - optional? " 
								+ optional + " - dynamic? " + dynamic + " - unit " + unit + " - value: " + value);
				
				if(type.isEmpty()){
					//shouldnt happen anymore
					assert(false);
//					Element etype = (Element)cure.getElementsByTagName("type").item(0);
//					String typehref = etype.getAttribute("href");
//					String actualtype = typehref.split("#")[1];
//					opcuadoc.createUAVariable(id, name, packagedElement.getAttribute("xmi:id"), actualtype, optional, dynamic, readOnly, unit, value);
				}else if(!name.isEmpty() && 
							(cure.getAttribute("aggregation").isEmpty() 
							|| cure.getAttribute("association").isEmpty())
					){//if attribute has a name and is no association => its a variable!
					opcuadoc.createUAVariable(id, name, packagedElement.getAttribute("xmi:id"), type, optional, dynamic, readOnly, unit, value);
				}else{ //else -> association (TODO: check for composition)
					String from = packagedElement.getAttribute("xmi:id"); //if of parent of the attribute
					String to = type; //cure.getAttribute("type");
					String upperValue = getUpperValue(cure);
					String lowerValue = getLowerValue(cure);
					println("lower: " + lowerValue + " upper: " + upperValue);
					opcuadoc.realizeUAAssociation(to, from, lowerValue, upperValue);
				}
			}
		}
	}
	
	/**
	 * 
	 * */
	private void checkOwnedOperations(Element packagedElement){
		NodeList ownedOperations = packagedElement.getElementsByTagName("ownedOperation");
		for(int i=0; i< ownedOperations.getLength(); i++){
			Element curOperationNode = (Element)ownedOperations.item(i);
			
			String opName = curOperationNode.getAttribute("name");
			String opId = curOperationNode.getAttribute("xmi:id");
			
			//default func = void foo()
			HashMap<String, String> in = null;
			HashMap<String, String> out = null;
			
			//check paramaters
			NodeList ownedParameters = curOperationNode.getElementsByTagName("ownedParameter");
			for(int j=0; j< ownedParameters.getLength(); j++){
				Node curParam = ownedParameters.item(j);
				if (curParam.getNodeType() == Node.ELEMENT_NODE) {
					Element cure = (Element) curParam;
					String type = cure.getAttribute("type");
					String id = cure.getAttribute("xmi:id");
					String name = cure.getAttribute("name");
					println("Operation param found! name: " + name + " - type: "+ type);
					
					//createUAMethod(String umlID, String name, String parentXMIid, 
					//				Map<String, String> in, Map<String, String> out)
					if(cure.getAttribute("direction").equals("out")){
						if(out ==null)
							out = new HashMap<String, String>();
						out.put(name, getType(cure));
					}else if(cure.getAttribute("direction").equals("return")) {//return is kind of a special out argument
						if(out ==null)
							out = new HashMap<String, String>();
						out.put("ReturnValue", getType(cure));
					}else{
						if(in == null)
							in = new HashMap<String, String>();
						in.put(name, getType(cure));
					}
				}
			}
			opcuadoc.createUAMethod(opId, opName, packagedElement.getAttribute("xmi:id"), in, out);
		}
	}
		
	private void checkGeneralizations(Element packagedElement){
		NodeList generalizations = packagedElement.getElementsByTagName("generalization");//.getChildNodes()
		for(int i=0; i< generalizations.getLength(); i++){
			Node curgeneral = generalizations.item(i);
			if (curgeneral.getNodeType() == Node.ELEMENT_NODE) {
				Element cure = (Element)curgeneral;
				//subtype from parent packagedElement to the id reffered in general attr
				opcuadoc.realizeSubType(packagedElement.getAttribute("xmi:id"), cure.getAttribute("general"));
			}
		}
	}
	
	/**
	 * checks for UML2 profiles
	 * TODO: needs more checks
	 * */
	private void checkProfiles() {
		NodeList nList = doc.getElementsByTagName("LocalProfile:StdProperty");
		for(int i =0; i < nList.getLength();i++) {
			Element cure =  (Element)nList.item(i);
			
			NamedNodeMap attrs = cure.getAttributes();
			String profiledId = "";
			HashMap<String, String> profileAttrMap = new HashMap<String, String>();
			for(int j =0; j < attrs.getLength(); j++) {
				Attr cura = (Attr)attrs.item(j);
				String attrName = cura.getName();
				
				if(attrName.equals("xmi:id")) {
					continue;// not interesting
				}else if(attrName.equals("base_NamedElement")) {
					profiledId = cura.getValue();
				}else {
					profileAttrMap.put(attrName, cura.getValue());
				}
				//System.out.println("Attrname: " + cura.getName() + " = " + cura.getValue());
			}
			this.opcuadoc.applyProfile(profiledId, profileAttrMap);
		}
	}
	
	
	private class AttributeProperty{
		public String name = "";
		public boolean optional = false;
		public boolean dynamic = true;
		public String unit = null;
		public String type = "";
		public String id = "";
		public String value = null;
		public boolean readOnly = false;
		
		
		public void analyzeAttribute(Element attrValEle) throws IllegalAttributeFormatException{
			this.type = getType(attrValEle);
			this.id = attrValEle.getAttribute("xmi:id");
			String parametrizedname = attrValEle.getAttribute("name");
			this.readOnly = (attrValEle.getAttribute("isReadOnly") != null) ? attrValEle.getAttribute("isReadOnly").equals("true") : false;
			
			
			int indexOfBracket = parametrizedname.indexOf('(');
			int indexOfBracketEnd = parametrizedname.indexOf(')');
			if(((indexOfBracket > 0) && ((indexOfBracketEnd - indexOfBracket) >2)) 
				|| (indexOfBracket < 0 && indexOfBracketEnd > 0))
				throw new IllegalAttributeFormatException("malformed brackets for paramtrized Attribute '" + parametrizedname + "' - \"<attrname>(<('d' xor 's') or 'o'>)\" expected");
	
			int indexOfUnit = parametrizedname.indexOf('[');
			int indexOfUnitEnd = parametrizedname.indexOf(']');
			if(((indexOfUnit > 0) && (indexOfUnitEnd > 0) && (indexOfUnitEnd < indexOfUnit)) 
					|| (indexOfUnit < 0 && indexOfUnitEnd > 0))
					throw new IllegalAttributeFormatException("malformed unit brackets for paramtrized Attribute '" + parametrizedname + "' - \"<attrname>[<Unitname>]\" expected");
		
			if(indexOfBracket > 0) {
				for(int i = indexOfBracket+1; i < indexOfBracketEnd;i++) {
					char c = parametrizedname.charAt(i);
					if(c != 'o' && c != 'd' && c != 's')
						throw new IllegalAttributeFormatException("Illegal char in brackets in paramtrized Attribute '" + parametrizedname + "'");
					
					if(c == 'o')
						this.optional = true;
					if(c == 's')
						this.dynamic = false;
					//since 'd' is default, we dont need to check for that
				}
			}
			
			if(indexOfUnit > 0)
				this.unit = parametrizedname.substring(indexOfUnit+1, indexOfUnitEnd);
			
			if(indexOfBracket == indexOfUnit) {
				this.name = parametrizedname;
			} else if(indexOfBracket > 0 && indexOfUnit < 0
						|| (indexOfBracket > 0 && indexOfBracket < indexOfUnit)) {
				this.name =  parametrizedname.substring(0, indexOfBracket);
			} else if(indexOfUnit > 0 && indexOfBracket < 0
					|| (indexOfUnit > 0 && indexOfUnit < indexOfBracket)){
				this.name =  parametrizedname.substring(0, indexOfUnit);
			}

			
			//get defaultVal if there is one
			NodeList attrEleList = attrValEle.getElementsByTagName("defaultValue");
			if(attrEleList != null && attrEleList.getLength() > 0) {
				Element e = (Element)(attrEleList.item(0)); //only one item possible
				this.value = e.getAttribute("symbol");
				if(this.value == null)
					this.value = e.getAttribute("value");
			}
		}
		
		
		
		
		private class IllegalAttributeFormatException extends Exception{
			public IllegalAttributeFormatException() {
				super();
			}
			
			public IllegalAttributeFormatException(String msg) {
				super(msg);
			}
		}
	}
	
}




























 


































