import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.Attr;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.OutputKeys;

import java.io.OutputStream;
import java.io.StringWriter;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.Validator;
import javax.xml.transform.stream.StreamSource;
import javax.xml.XMLConstants;

import java.net.URL;

import java.io.FileInputStream;

import java.util.Map;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

public class OPCUADocument{

/***** COMMON IDs*************/
final static private int BASEDATATYPE = 24;
final static private int BASEOBJECTYPE = 58;
final static private int FOLDERTYPE = 61;
final static private int BASEDATAVARIABLETYPE = 63; 
final static private int PROPERTYTYPE = 68;
final static private int MANDATORY = 78;
final static private int MANDATORYPLACEHOLDER = 11510;
final static private int OPTIONAL = 80;
final static private int OPTIONALPLACEHOLDER = 11508;
final static private int OBJECTS = 85;
final static private String ACCESSLEVELREAD = "1";
final static private String ACCESSLEVELWRITE = "2";
final static private String ACCESSLEVELREADWRITE = "3";
/******************************/
	private Document doc;
	private Element rootElement;
	private Element alieasesEle;

	/**
	 * next id for new elem
	 * */
	private int id;
	
	/**
	 * key is xmi:id, value is UA element - xmi:id is from the original uml element the value got mapped to
	 * */
	private HashMap<String, Element> xmiIdElementMap;
	/**
	 * map between ua id and its node
	 * */
	private HashMap<String, Element> uaIdElementMap;
	/**
	 * map of strings and their integer alias
	 * */
	private HashMap<String, Integer> aliasMap;
	
	
	public OPCUADocument(){
		xmiIdElementMap = new HashMap<String, Element>();
		uaIdElementMap = new HashMap<String, Element>();
		aliasMap= new HashMap<>();
		id = 1002;
		createStandardNodes();
	}

	public void createStandardNodes(){
	//<UANodeSet xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	//xmlns:uax="http://opcfoundation.org/UA/2008/02/Types.xsd" 
	//xmlns="http://opcfoundation.org/UA/2011/03/UANodeSet.xsd" 
	//xmlns:s1="http://yourorganisation.org/TestProject/Types.xsd" 
	//xmlns:ua="http://unifiedautomation.com/Configuration/NodeSet.xsd" 
	//xmlns:xsd="http://www.w3.org/2001/XMLSchema">
		try{
			
			/*******************************************************/
			/***************STANDARD NODES START *******************/
			/*******************************************************/
			
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			
			doc = docBuilder.newDocument();
			
			Attr attr;
			
			rootElement = doc.createElement("UANodeSet");
			/*********ROOT ************/
			doc.appendChild(rootElement); 
			
			addAttribute(rootElement, "xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
			addAttribute(rootElement, "xmlns:uax", "http://opcfoundation.org/UA/2008/02/Types.xsd");
			addAttribute(rootElement,"xmlns", "http://opcfoundation.org/UA/2011/03/UANodeSet.xsd");
			addAttribute(rootElement, "xmlns:sl", "http://yourorganisation.org/TestProject/Types.xsd");
			addAttribute(rootElement, "xmlns:ua", "http://unifiedautomation.com/Configuration/NodeSet.xsd");
			addAttribute(rootElement, "xmlns:xsd", "http://www.w3.org/2001/XMLSchema");
			//rootElement done
			
			/*********** NAMESPACE ***********/
			Element NamespaceUris = doc.createElement("NamespaceUris");		
			rootElement.appendChild(NamespaceUris);
			
			Element Uri = doc.createElement("Uri");
			NamespaceUris.appendChild(Uri);
			
			Uri.appendChild(doc.createTextNode("http://www.umltoopcua.com/yourproject"));
			
			/****************** STD ALIASES *****************/
			//may not be important at all
			alieasesEle = doc.createElement("Aliases");
			addAlias("Boolean", 1);
			addAlias("Byte", 3);
			addAlias("Int16", 4);
			addAlias("Int32", 6);
			addAlias("UInt32", 7);
			addAlias("Float", 10);
			addAlias("Double", 11);
			addAlias("String", 12);
			addAlias("DataValue", 23);
			
			//TODO: collect more type aliases
			addAlias("Organizes", 35);
			addAlias("HasModellingRule", 37);
			addAlias("HasTypeDefinition", 40);	
			addAlias("HasSubtype", 45);
			addAlias("HasProperty", 46);
			addAlias("HasComponent", 47);
			addAlias("Argument", 296);
						
			rootElement.appendChild(alieasesEle);
			
			/*************EXTENSION ************/
			
			Element Extensions = doc.createElement("Extensions");			
			Element Extension = doc.createElement("Extension");		
			Extensions.appendChild(Extension);
			Element uaModelInfo = doc.createElement("ua:ModelInfo");	
			
			addAttribute(uaModelInfo, "Tool", "UaModeler");
			addAttribute(uaModelInfo, "Hash", "D6/qgC4qzrzjTkCdzREULQ==");
			addAttribute(uaModelInfo, "Version", "1.5.1");

			Extension.appendChild(uaModelInfo);
			rootElement.appendChild(Extensions);
			
			/*******************************************************/
			/*************** STANDARD NODES END ********************/
			/*******************************************************/
		}catch(ParserConfigurationException pce){
			pce.printStackTrace();
		}
	}

	/**
	 * @return a new ua node id
	 * */
	private int getNewId(){
		while(this.uaIdElementMap.get(id) != null)
			this.id++;
		return this.id++;
	}
	
	
	public String toStringId(int id){
		return "i=" + id;
	}

	/**
	 * TODO: can only work with namespace 1 -> add more
	 * @return id with namespace specifier
	 * */
	public String getNewStringId(){
		return "ns=1;i=" +Integer.toString(getNewId());
	}
	
	/**
	 * TODO: add more namespaces
	 * TODO: Browsename may not always be namespace+displayname
	 * @return opcua conform browsename
	 * */
	private String toBrowseName(String name){
		return "1:" + name;
	}
	
	/**
	 * @return 
	 * */
	private Element getReferencesNode(Element e){
		return (Element)e.getElementsByTagName("References").item(0);
	}
	
	/**
	 * @return 
	 * */
	private NodeList getReferenceNodeList(Element e){
		return getReferencesNode(e).getElementsByTagName("Reference");
	}
	
	/**
	 * TODO: support more types
	 * @return 
	 * */
	private String getUAType(String type){
		String DataType = getUANodeDisplayName(type);
		//System.out.println("searching type: " +type);
		if("".equals(DataType)){
			if(type.equals("Integer")){
				return "Int32";
			}else if(type.contains("Double")){
				return "Double";
			}else if(type.contains("Float")){
				return "Float";
			}else if(type.contains("Byte")){
				return "Byte";
			}else if(type.contains("Boolean")){
				return "Boolean";
			}else{
				return "String";
			}	
		}else
			return DataType;
	}

	/**
	 * TODO: support more types
	 * @return std ua type id corresponding to the uml type
	 * */
	private String getUATypeId(String type){
		Element e = xmiIdElementMap.get(type);
		if(type.contains("="))
			return type; //already ua type
		if(e == null){
			if(type.equals("Integer")){
				return "i=6";//"Int32";
			}else if(type.contains("Boolean")){
				return "i=1";
			}else if(type.contains("Float")){
				return "i=10";
			}else if(type.contains("Double")){
				return "i=11";
			}else if(type.contains("Byte")){
				return "i=3";
			}else {
				return "i=12";//std string
			}	
		}else
			return e.getAttribute("NodeId");
	}
	
	/**
	 * adds new reference to the <References> child
	 * */
	public void addReference(Element e, String ReferenceType, String id, boolean IsForward){
		Element refs = getReferencesNode(e);
		Element Reference = doc.createElement("Reference");
		addAttribute(Reference, "ReferenceType", ReferenceType);
		if(!IsForward){
			addAttribute(Reference, "IsForward", "false");
		}
		addTextNode(Reference, id);
		
		refs.appendChild(Reference);
	}
	
	/**
	 * 
	 * */
	public void setModellingRule(Element e,  String id){
		Element refs = getReferencesNode(e);
		//search for the an existing modelling rule node
		NodeList n = refs.getElementsByTagName("Reference");
		for(int i=0; i< n.getLength(); i++) {
			Element tempE = (Element)n.item(i);
			if(tempE.getAttribute("ReferenceType").equals("HasModellingRule")) {
				refs.removeChild(tempE);
				break;
			}
		}
		Element Reference = doc.createElement("Reference");
		addAttribute(Reference, "ReferenceType", "HasModellingRule");
		addTextNode(Reference, id);
		
		refs.appendChild(Reference);
	}
	
	/**
	 * @return referencetype of a reference
	 * */
	private Element getReference(Element e, String refType){
		NodeList l = getReferenceNodeList(e);
		for(int i = 0; i < l.getLength(); i++){
			Element r = (Element)l.item(i);
			if(refType.equals(r.getAttribute("ReferenceType")))
				return r;
		}
		return null; 
	}
	
	/**
	 * 
	 * */
	public void setReference(Element e, String ReferenceType, String id, boolean IsForward){
		Element r = getReference(e, ReferenceType);	
		
		Element refs = getReferencesNode(e);
		Element Reference = doc.createElement("Reference");
		addAttribute(Reference, "ReferenceType", ReferenceType);
		if(!IsForward){
			addAttribute(Reference, "IsForward", "false");
		}
		addTextNode(Reference, id);
		
		refs.replaceChild(Reference, r);
	}
	
	/**
	 * adds a new attribute to child
	 * */
	public void addAttribute(Element e, String attrname, String attrstr){
			Attr attr = doc.createAttribute(attrname);
			attr.setValue(attrstr);
			e.setAttributeNode(attr);
	}
	
	/**
	 * set attribute - creates attribute if not already there
	 * */
	public void setAttribute(Element e, String attrname, String attrstr){
			Attr attr = (Attr)e.getAttributes().getNamedItem(attrname);
			if(attr == null) {
				addAttribute(e, attrname, attrstr);
				return;
			}
			attr.setValue(attrstr);
	}
	
	/**
	 * replaces id of ua element
	 * */
	public void replaceId(Element uae, String value) {
		this.uaIdElementMap.remove(getUANodeId(uae));
		this.uaIdElementMap.put(value, uae);
		setAttribute(uae, "NodeId", value);
	}
	
	/**
	 * expands aliases of document - mostly new variables
	 * */
	public void addAlias(String attrVal, int i){
		Element Alias;
		Alias = doc.createElement("Alias");
		Attr attr = doc.createAttribute("Alias");
		attr.setValue(attrVal);
		Alias.setAttributeNode(attr);
		Alias.appendChild(doc.createTextNode("i="+ i));
		alieasesEle.appendChild(Alias);
		
		aliasMap.put(attrVal, i);
	}
	
	/**
	 * expands aliases of document - mostly new variables
	 * */
	public void addAlias(String attrVal, String i){
		Element Alias;
		Alias = doc.createElement("Alias");
		Attr attr = doc.createAttribute("Alias");
		attr.setValue(attrVal);
		Alias.setAttributeNode(attr);
		Alias.appendChild(doc.createTextNode(i));
		alieasesEle.appendChild(Alias);			
	}
	
	/**
	 * 
	 * */
	public void addTextNode(Element e, String text){
		e.appendChild(doc.createTextNode(text));
	}
	
	/**
	 * @return xmi uml element with id key
	 * */
	public Element getUANodeElementFromID(String key) {
		return this.uaIdElementMap.get(key);
	}
	
	/**
	 * @return UA element the key (an uml:id) corresponds to
	 * */
	public String getUANodeId(String key){
		return getUANodeId(xmiIdElementMap.get(key));
	}
	
	/**
	 * @return UA id of an element
	 * */
	public String getUANodeId(Element e){
		return e.getAttribute("NodeId");
	}
	
	/**
	 * @return BrowseName of of UA element the key (uml:id) corresponds to
	 * */
	public String getUANodeBrowseName(String key){
		return getUANodeBrowseName(xmiIdElementMap.get(key));
	}		
	
	/**
	 * @return BrowseName of element
	 * */
	public String getUANodeBrowseName(Element e){
		return e.getAttribute("BrowseName");
	}	
		
	/**
	 * @return DisplayName of of UA element the key (uml:id) corresponds to
	 * */
	public String getUANodeDisplayName(String key){
		Element e = xmiIdElementMap.get(key);
		if(e == null)
			return "";
		return getUANodeDisplayName(e);
	}
	
	/**
	 * @return DisplayName of of UA element
	 * */
	public String getUANodeDisplayName(Element e){
		return e.getElementsByTagName("DisplayName").item(0).getTextContent();
	}
	
	/**
	 * set DisplayName of UA node
	 * */
	public void setUANodeDisplayName(Element key, String name){
		NodeList n = key.getElementsByTagName("DisplayName"); 
		Element olddispe = n.getLength() == 0 ? null : (Element)n.item(0);
		Element newdispe = doc.createElement("DisplayName");
		addTextNode(newdispe, name);
		if(olddispe == null)
			key.appendChild(newdispe);
		else
			key.replaceChild(newdispe, olddispe);
	}
	
	/**
	 * set NodeId of UA node
	 * */
	public void setNodeId(Element e, String forcedId) {
		setAttribute(e, "NodeId", forcedId);
		if(this.uaIdElementMap.put(forcedId, e) != null)
			System.out.println("WARNING! ID" + forcedId + "is already in use");
	}
	
	/**
	 * add HasTypeDefinition reference (for variables)
	 * */
	public void setBasicTypeDefinition(Element e, boolean isbaseVarType) {
		if(isbaseVarType)
			addReference(e, "HasTypeDefinition", toStringId(BASEDATAVARIABLETYPE), true);
		else
			addReference(e, "HasTypeDefinition", toStringId(PROPERTYTYPE), true);
	}
	
	/**
	 * add Modelling rule
	 * */
	public void addModellingRule(Element e, String rule) {
		switch(rule) {
		case "Mandatory":
			setModellingRule(e, toStringId(MANDATORY));
			break;
		case "Optional":
			setModellingRule(e, toStringId(OPTIONAL));
			break;
		case "MandatoryPlaceholder":
			setModellingRule(e, toStringId(MANDATORYPLACEHOLDER));
			break;
		case "OptionalPlaceholder":
			setModellingRule(e, toStringId(OPTIONALPLACEHOLDER));
			break;
		}
	}
	
	/**
	 * creates UA xml Element with given name without Browse -and DisplayName
	 * @return new element
	 * */
	public Element createUANode(String nodeName){
		Element UAnode = doc.createElement(nodeName);
		
		addAttribute(UAnode, "NodeId", getNewStringId());
		
		setUANodeDisplayName(UAnode, ""); //must be first child!
		
		Element References = doc.createElement("References");
		UAnode.appendChild(References);

		this.rootElement.appendChild(UAnode);
		uaIdElementMap.put(getUANodeId(UAnode), UAnode);
		return UAnode;
	}
	
	/**
	 * creates UA xml Element with given name with Browse -and DisplayName 
	 * @return new element
	 * */
	public Element createUANode(String displayName, String nodeName){
		Element UAnode = doc.createElement(nodeName);		
		
		addAttribute(UAnode, "NodeId", getNewStringId());
		addAttribute(UAnode, "BrowseName", toBrowseName(displayName));
		
		setUANodeDisplayName(UAnode, displayName); //must be first child!
		
		Element References = doc.createElement("References");
		UAnode.appendChild(References);

		this.rootElement.appendChild(UAnode);
		uaIdElementMap.put(getUANodeId(UAnode), UAnode);
		return UAnode;
	}
	
	/**
	 * creates UA xml Element with given name with Browse -and DisplayName, adds corresponding umlID to global umlId map
	 * @return new element
	 * */
	public Element createUANode(String umlID, String name, String NodeName){
		Element UAnode = createUANode(name, NodeName);
		xmiIdElementMap.put(umlID, UAnode);
		return UAnode;
	}
	
	
	/**
	 * basically edited copy of element ->changes NodeId
	 * @return new element
	 * */
	public Element createUANode(Element e){
		setAttribute(e, "NodeId", getNewStringId());
		uaIdElementMap.put(getUANodeId(e), e);
		if("UAMethod".equals(e.getTagName())){
			ArrayList<Element> arguments = deletePropertyRefs(e);
			for(Element cur : arguments){
				Element copiedarg = (Element)cur.cloneNode(true);
				setAttribute(copiedarg, "NodeId", getNewStringId());
				uaIdElementMap.put(getUANodeId(copiedarg), copiedarg);
				this.rootElement.appendChild(copiedarg);
				deletePropertyRefs(copiedarg);
				addReference(copiedarg, "HasProperty", getUANodeId(e), false);
				addReference(e, "HasProperty", getUANodeId(copiedarg), true);
				this.rootElement.appendChild(copiedarg);
				System.out.println("Copies argument! ID: " + getUANodeId(copiedarg));
			}
		}	
		this.rootElement.appendChild(e);
		return e;
	}
	
	/**
	 * creates UA node with forced ID
	 * @return new element
	 * */
	public Element createUANodeWithId(String nodeName, String forcedId){
		Element e = doc.createElement(nodeName);
		
		setUANodeDisplayName(e, ""); //must be first child!
		
		Element References = doc.createElement("References");
		e.appendChild(References);

		this.rootElement.appendChild(e);
		setNodeId(e, forcedId);
		return e;
	}
	
	/**
	 * removes HasProperty references
	 * @return ArrayList of deleted elements
	 * */
	private ArrayList<Element> deletePropertyRefs(Element e){
		ArrayList<Element> eL = new ArrayList<Element>();
		NodeList l = getReferenceNodeList(e);
		System.out.println("List length: " + l.getLength());
		for(int i = 0; i < l.getLength(); i++){
			Element cur = (Element)l.item(i);
			if("HasProperty".equals(cur.getAttribute("ReferenceType"))){
				eL.add(uaIdElementMap.get(cur.getTextContent()));
				System.out.println("Added " + getUANodeDisplayName(uaIdElementMap.get(cur.getTextContent())) + " to list");
				cur.getParentNode().removeChild(cur);
				System.out.println("Property deleted! ID: " + cur.getTextContent());
				i--;
			}else{
				System.out.println("Bo property found! Reftype: " + cur.getAttribute("ReferenceType"));
			}
		}
		return eL;
	}
	
	/**
	 * creates UA ObjectType with no name
	 * @return new element
	 * */
	public Element createObjectType(){
		Element e = createUANode("UAObjectType");
		addReference(e, "HasSubtype", toStringId(BASEOBJECTYPE), false);
		return e; 
	}
	
	/**
	 * creates UA ObjectType with name and corresponding umlID
	 * @return new element
	 * */
	public Element createObjectType(String umlID, String name){
		if(name.length() >= 4 && !name.substring(name.length()-1-4).contains("Type"))
			name += "Type";
		
		Element e = createUANode(umlID, name, "UAObjectType");
		addReference(e, "HasSubtype", toStringId(BASEOBJECTYPE), false);
		return e; 
	}
	
	/**
	 * creates UA ObjectType with forced ID
	 * @return new element
	 * */
	public Element createObjectTypeWithId(String forcedId){
		Element e = createUANodeWithId("UAObjectType", forcedId);
		addReference(e, "HasSubtype", toStringId(BASEOBJECTYPE), false);
		return e; 
	}
	
	/**
	 * creates UA DataType without name
	 * @return new element
	 * */
	public Element createUADataType(){
		Element e = createUANode("UADataType");
		addReference(e, "HasSubtype", toStringId(BASEDATATYPE), false);
		return e;
	}
	
	/**
	 * creates UA DataType with name and corresponding umlID
	 * @return new element
	 * */
	public Element createUADataType(String umlID, String name){
		Element e = createUANode(umlID, name, "UADataType");
		addReference(e, "HasSubtype", toStringId(BASEDATATYPE), false);
		addAlias(name, getUANodeId(e));
		return e;
	}
	
	/**
	 * creates UA DataType with forced ID
	 * @return new element
	 * */
	public Element createUADataTypeWithId(String forcedId){
		Element e = createUANodeWithId("UADataType", forcedId);
		addReference(e, "HasSubtype", toStringId(BASEDATATYPE), false);
		return e;
	}
	
	/**
	 * adds value to UA element
	 * */
	public void addValue(Element e, String type, String val) {
		Element valEle = doc.createElement("Value");
		Element innerValEle = doc.createElement("uax:" + type);
		innerValEle.setTextContent(val);
		valEle.appendChild(innerValEle);
		e.appendChild(valEle);
	}
	
	/**
	 * creates UA Variable without name
	 * @return new element
	 * */
	public Element createUAVariable(){
		Element e = createUANode("UAVariable");
		uaIdElementMap.put(getUANodeId(e), e);
		//addReference(e, "HasTypeDefinition", toStringId(BaseDataVariableType), true);
		addAttribute(e, "NodeId", getNewStringId());
		//TODO: ModellingRule may not be Mandatory
		//addReference(e, "HasModellingRule", toStringId(Mandatory), true);
		
		return e;
	}
	
	/**
	 * creates UA Variable with typedefinition
	 * @return new element
	 * */
	public Element createUAVariable(boolean isbaseVarType){
		Element e = createUANode("UAVariable");
		uaIdElementMap.put(getUANodeId(e), e);
		if(isbaseVarType)
			addReference(e, "HasTypeDefinition", toStringId(BASEDATAVARIABLETYPE), true);
		else
			addReference(e, "HasTypeDefinition", toStringId(PROPERTYTYPE), true);
		addAttribute(e, "NodeId", getNewStringId());
		uaIdElementMap.put(getUANodeId(e), e);
		//TODO: ModellingRule may not be Mandatory
		//addReference(e, "HasModellingRule", toStringId(Mandatory), true);
		
		return e;
	}
	
	/**
	 * creates UA Variable with all needed information
	 * @return new element
	 * */
	public Element createUAVariable(String umlID, String name, String parentXMIid, String type, 
										boolean optional, boolean dynamic, boolean readOnly, String unit, String value){
		Element e = createUANode(umlID, name, "UAVariable");

		addAttribute(e, "DataType", getUAType(type));	
		
		//TODO: UserAccessLevel == AccessLevel?
		if(readOnly) {
			addAttribute(e, "AccessLevel", ACCESSLEVELREAD);
			addAttribute(e, "UserAccessLevel", ACCESSLEVELREAD);
		}else {
			addAttribute(e, "AccessLevel", ACCESSLEVELREADWRITE);
			addAttribute(e, "UserAccessLevel", ACCESSLEVELREADWRITE);
		}
		
		addAttribute(e, "NodeId", getNewStringId());
		uaIdElementMap.put(getUANodeId(e), e);
		addAttribute(e, "ParentNodeId", getUANodeId(parentXMIid));
		
		if(dynamic)
			addReference(e, "HasTypeDefinition", toStringId(BASEDATAVARIABLETYPE), true);
		else
			addReference(e, "HasTypeDefinition", toStringId(PROPERTYTYPE), true);
		
		//TODO: check for errors
		if(optional)
			setModellingRule(e,toStringId(OPTIONAL));
		else
			setModellingRule(e,toStringId(MANDATORY));
		
		addReference(e, "HasComponent", getUANodeId(parentXMIid), false);
		addReference(xmiIdElementMap.get(parentXMIid), "HasComponent", getUANodeId(e), true);
		
		
		if(unit != null) {
			//add Unit property UAVariable Node
			//Value = unit, Name = "Unit", ReadOnly, DAtaType = String
			Element unitNode = createUANode("Unit", "UAVariable");
			//addAttribute(unitNode, "Value", unit);
			addValue(unitNode, "String", unit);
			addAttribute(unitNode, "DataType", "String");
			addAttribute(unitNode, "AccessLevel", ACCESSLEVELREAD);
			addAttribute(unitNode, "UserAccessLevel", ACCESSLEVELREAD);
			addReference(unitNode, "HasModellingRule", toStringId(MANDATORY), true);
			addReference(unitNode, "HasProperty", this.getUANodeId(e), false);
			addReference(e, "HasProperty", getUANodeId(unitNode), true);
		}
		
		if(value != null) {
			addValue(e, getUAType(type) , value);
		}
		
		return e;
	}
	
	/**
	 * creates UA Variable with forced Id, without name but with type definition
	 * @return new element
	 * */
	public Element createUAVariableWithId(String forcedId, boolean isProp){
		Element e = createUANodeWithId("UAVariable", forcedId);
		if(isProp)
			addReference(e, "HasTypeDefinition", toStringId(PROPERTYTYPE), true); 
		else
			addReference(e, "HasTypeDefinition", toStringId(BASEDATAVARIABLETYPE), true); 
		addAttribute(e, "NodeId", getNewStringId());
		//TODO: ModellingRule may not be Mandatory
		//addReference(e, "HasModellingRule", toStringId(Mandatory), true);
		
		return e;
	}
	
	/**
	 * creates UA Variable without name
	 * @return new element
	 * */
	public Element createUAVariableType(){
		Element e = createUANode("UAVariableType");
		addReference(e, "HasTypeDefinition", toStringId(BASEDATAVARIABLETYPE), true);
		//TODO: ModellingRule may not be Mandatory
		addReference(e, "HasModellingRule", toStringId(MANDATORY), true);
		
		return e;
	}
	
	/**
	 * creates UA Method without name
	 * @return new element
	 * */
	public Element createUAMethod(){
		Element e = createUANode("UAMethod");
		
		//TODO: ModellingRule may not be Mandatory
		addReference(e, "HasModellingRule", toStringId(MANDATORY), true);	
	
		return e;
	}
	
	/**
	 * creates UA Method with all needed information
	 * @return new element
	 * */
	public Element createUAMethod(String umlID, String name, String parentXMIid, Map<String, String> in, Map<String, String> out){
		Element e = createUANode(umlID, name, "UAMethod");
	
		addAttribute(e, "ParentNodeId", getUANodeId(parentXMIid));
	
		addReference(e, "HasComponent", getUANodeId(parentXMIid), false);
		addReference(xmiIdElementMap.get(parentXMIid), "HasComponent", getUANodeId(e), true);
		
		//TODO: ModellingRule may not be Mandatory
		addReference(e, "HasModellingRule", toStringId(MANDATORY), true);

		if(in != null)
			createUAArgumentElement(e, "InputArguments", in);			
		if(out != null)
			createUAArgumentElement(e, "OutputArguments", out);		
		return e;
	}
	
	/**
	 * creates UA Method with forced ID
	 * @return new element
	 * */
	public Element createUAMethodWithId(String forcedId){
		Element e = createUANodeWithId("UAMethod", forcedId);
		
		//TODO: ModellingRule may not be Mandatory (but most likely)
		addReference(e, "HasModellingRule", toStringId(MANDATORY), true);	
	
		return e;
	}
	
	/**
	 * creates UA Argument Elemeent. io is either "InputArguments or OutputArguments"
	 * */
	private void createUAArgumentElement(Element e, String io, Map<String, String> arguments){
		Element i = createUANode(io, "UAVariable");
		setAttribute(i, "BrowseName", io);//apparently no "1:"-prefix
		addAttribute(i, "DataType", "Argument");	
		addAttribute(i, "ParentNodeId", getUANodeId(e));
		//addAttribute(i, "ArrayDimensions", 2); //TODO: check number of in args	
		
		addReference(e, "HasProperty", getUANodeId(i), true);
		addReference(i, "HasProperty", getUANodeId(e), false);
		//TODO: ModellingRule may not be Mandatory
		addReference(i, "HasModellingRule", toStringId(MANDATORY), true);
		
		addReference(i, "HasTypeDefinition", toStringId(PROPERTYTYPE), true);
		
		createValueElements(i, arguments);
	}
	
	/**
	 * create Value Element for argumentnode
	 * */
	public void createValueElements(Element e, Map<String, String> m){
		Element Value = doc.createElement("Value");
		
		Element ListOfExtensionObject = doc.createElement("uax:ListOfExtensionObject");
		Value.appendChild(ListOfExtensionObject);
		addExtensionObjects(ListOfExtensionObject, m);
		e.appendChild(Value);
	}
		
	/**
	 * exentsion Objects for argument node
	 * */
	private void addExtensionObjects(Element e,  Map<String, String> m){	
		if(m == null) {
			throw new IllegalArgumentException();
		}
		for (Map.Entry<String, String> entry : m.entrySet()){
			Element ExtensionObject = doc.createElement("uax:ExtensionObject");
			//TypeId
			Element TypeId = doc.createElement("uax:TypeId");
			Element Identifier = doc.createElement("uax:Identifier");
			addTextNode(Identifier, "i=297"); //TODO: dafuq is 297
			TypeId.appendChild(Identifier);
			ExtensionObject.appendChild(TypeId);
			//Body		
			Element Body = doc.createElement("uax:Body");
			Element Argument = doc.createElement("uax:Argument");
			Element Name = doc.createElement("uax:Name");
			addTextNode(Name, entry.getKey());
			Element DataType = doc.createElement("uax:DataType");
			Identifier = doc.createElement("uax:Identifier");
			addTextNode(Identifier, getUATypeId(entry.getValue()));
			DataType.appendChild(Identifier);
			Element ValueRank = doc.createElement("uax:ValueRank");
			addTextNode(ValueRank, "-1"); //TODO: check
			Element ArrayDimensions = doc.createElement("uax:ArrayDimensions");
			Element Description = doc.createElement("uax:Description");
			
			//System.out.println("Add Eo name "+ entry.getKey() + " with datatypeid " + entry.getValue());
			
			Argument.appendChild(Name);
			Argument.appendChild(DataType);
			Argument.appendChild(ValueRank);
			Argument.appendChild(ArrayDimensions);
			Argument.appendChild(Description);
			
			Body.appendChild(Argument);
			
			ExtensionObject.appendChild(Body);
			
			e.appendChild(ExtensionObject);
		}
	}
	
	/**
	 * create HasSubType reference
	 * */
	public void realizeSubType(String subxmi, String upxmi){
		setReference(xmiIdElementMap.get(subxmi), "HasSubtype", xmiIdElementMap.get(upxmi).getAttribute("NodeId"), false);
	}
	
	/**
	 * create UA association (composition)
	 * */
	public void realizeUAAssociation(String id, String parentXMIid, String l, String u){
		Element up = xmiIdElementMap.get(parentXMIid);
		Element sup = xmiIdElementMap.get(id);

		//depending on upper -/and lowervalues of the uml association
		if("1".equals(l) && "1".equals(u)){
			createSimpleCompositionReference(up, sup);
		}else if("0".equals(l) && "1".equals(u)){
			createOptionalCompositionReference(up, sup);
		}else if("0".equals(l) && ("*".equals(u) || Integer.parseInt(u) > 1)){
			createPlaceHolderCompositionReference(up, sup, OPTIONALPLACEHOLDER);
		}else if(Integer.parseInt(l) > 0 && ("*".equals(u) || Integer.parseInt(u) > 1)){
			createPlaceHolderCompositionReference(up, sup, MANDATORYPLACEHOLDER);
		}else
			throw new IllegalArgumentException("Invalid association: >" + l + "<->" + u+"<");
	}
	
	/**
	 * 
	 * */
	private void createPlaceHolderCompositionReference(Element up, Element sup, int phkind){
		Element B = createOptionalCompositionReference(up, sup);
		setReference(B, "HasModellingRule", toStringId(phkind), true);
		setAttribute(B, "BrowseName", "<" + getUANodeBrowseName(B) + ">");
		Element newDispNameEle = doc.createElement("DisplayName");
		newDispNameEle.setTextContent("<" + getUANodeDisplayName(B) + ">");
		B.replaceChild(newDispNameEle, B.getElementsByTagName("DisplayName").item(0));
	}
	
	/**
	 * 
	 * */
	private void createSimpleCompositionReference(Element up, Element sup){
		addReference(up, "HasComponent", getUANodeId(sup), true);
		addAttribute(sup, "ParentNodeId", getUANodeId(up)); //TODO: check if needed
		addReference(sup, "HasComponent", getUANodeId(up), false);
	}
	
	/**
	 * 
	 * */
	private Element createOptionalCompositionReference(Element up, Element sup){
		//Element f = createFolderType(up);
		Element f = createFolderType(up, sup);
		Element B = createUAObject(sup);
		addAttribute(B, "ParentNodeId", getUANodeId(f));
		addReference(B, "HasComponent", getUANodeId(f), false);
		addReference(f, "HasComponent", getUANodeId(B), true);
		addReference(B, "HasTypeDefinition", getUANodeId(sup), true);
		addReference(B, "HasModellingRule", toStringId(OPTIONAL), true);
		return B;
	}
		
	/**
	 * 
	 * */
	private Element createFolderType(Element parent, Element folderElement){
		String fName = getUANodeDisplayName(folderElement);
		if(fName.substring(fName.length()-1-4).contains("Type"))
			fName = fName.substring(0, fName.length()-4);
		Element e = createUANode(fName + "_Folder", "UAObject");
		addAttribute(e, "ParentNodeId", getUANodeId(parent));
		addReference(e, "HasComponent", getUANodeId(parent), false);
		addReference(parent, "HasComponent", getUANodeId(e), true);
		addReference(e, "HasTypeDefinition", toStringId(FOLDERTYPE), true);
		addReference(e, "HasModellingRule", toStringId(MANDATORY), true); //TODO: maybe not
		return e;
	}
	
	/**
	 * 
	 * */
	private Element createFolderType(Element parent){
		Element e = createUANode(getUANodeDisplayName(parent) + "_Folder", "UAObject");
		addAttribute(e, "ParentNodeId", getUANodeId(parent));
		addReference(e, "HasComponent", getUANodeId(parent), false);
		addReference(parent, "HasComponent", getUANodeId(e), true);
		addReference(e, "HasTypeDefinition", toStringId(FOLDERTYPE), true);
		addReference(e, "HasModellingRule", toStringId(MANDATORY), true); //TODO: maybe not
		return e;
	}
	
	/**
	 * 
	 * */
	public Element createUAObject(String xmiID){
		return createUAObject(xmiIdElementMap.get(xmiID));
	}
	
	/**
	 * 
	 * */
	public Element createUAObject(){
		Element e = createUANode("UAObject");
		return e; 
	}
	
	/**
	 * create Object out of given ObjectType
	 * */
	public Element createUAObject(Element objTypeElement){
		String objName = getUANodeDisplayName(objTypeElement);
		if(objName.substring(objName.length()-1-4).contains("Type"))
			objName = objName.substring(0, objName.length()-4);
		Element e = createUANode(objName + "_Object", "UAObject");
		
		//Object needs the same components as the Type
		copyComponents(e, recGatherOfUANodeComps(objTypeElement));
		
		return e; 
	}
	
	/**
	 * 
	 * */
	public Element createUAObjectWithId(String forcedId){
		Element e = createUANodeWithId("UAObject", forcedId);
		return e; 
	}
	
	/**
	 * copies Elements of the list with parent as parent-Element
	 * */
	private void copyComponents(Element parent, ArrayList<Element> toCopyList){
		for(Element e : toCopyList){
			Element copy = (Element)e.cloneNode(true);
			System.out.println("COPY: " + getUANodeDisplayName(e));
			createUANode(copy);
			setAttribute(copy, "ParentNodeId", getUANodeId(parent));
			
			setReference(copy, "HasComponent", getUANodeId(parent), false);//should alrdy have another parent component
			addReference(parent, "HasComponent", getUANodeId(copy), true);
			
			
			
			//System.out.println("COPY IS: " + getUANodeId(uaIdElementMap.get(getUANodeId(copy))) 
			//					+ "ORG IS: " + getUANodeId(uaIdElementMap.get(getUANodeId(e))) );
			//deleteUANodeComponents(copy);		
		}
	}

	/**
	 * recursive search of all nodes e has hierachical references to
	 * @return list of all hierachical elements
	 * */
	private ArrayList<Element> recGatherOfUANodeComps(Element e){
		ArrayList<Element> l = new ArrayList<Element>();
		NodeList nL = getReferenceNodeList(e);
		//System.out.println("gather from " + getUANodeDisplayName(e));
		for(int i = 0; i < nL.getLength(); i++){

			Element cur = (Element)nL.item(i);
			String refType = cur.getAttribute("ReferenceType");
			if(refType.equals("HasSubtype") && cur.getAttribute("IsForward").equals("false")){//IsForward check may not be necessary
				String subtypeId = cur.getTextContent();
				if(!subtypeId.equals(toStringId(BASEOBJECTYPE))){
					//System.out.println("recursive adding!");
					l.addAll(recGatherOfUANodeComps(uaIdElementMap.get(subtypeId)));
				}
			}else if(refType.equals("HasComponent")){
				//System.out.println("adding id " + cur.getTextContent() + " to copylist");
				l.add(uaIdElementMap.get(cur.getTextContent()));
				//System.out.println("added component " + getUANodeDisplayName(uaIdElementMap.get(cur.getTextContent())));
				
			}else if(refType.equals("HasProperty")){
				//System.out.println("adding id " + cur.getTextContent() + " to copylist");
				l.add(uaIdElementMap.get(cur.getTextContent()));
				//System.out.println("added component " + getUANodeDisplayName(uaIdElementMap.get(cur.getTextContent())));
				
			}//else continue
		}
		return l;
	}
	
	
	
	
	/**
	 * Searches for corresponding UA element with given uml ID and applies UML profile to UA element. 
	 * */
	public void applyProfile(String profiledUmlId, HashMap<String, String> profileAttrMap) {
		Element e = this.xmiIdElementMap.get(profiledUmlId);
		if(e == null) {
			System.out.println("No valid Element with uml xmi id " + profiledUmlId + " found!");
			return;
		}
		for(String attrName : profileAttrMap.keySet()) {
			String attrVal = profileAttrMap.get(attrName);
			setUMLProfileUANodeAttribute(e, attrName, attrVal);
		}
	}

	/**
	 * applies specific UML Profile attributes
	 * */
	private void setUMLProfileUANodeAttribute(Element e, String attrName, String attrVal) {
		String lcAttrName = attrName.toLowerCase();
		if(lcAttrName.equals("id") || lcAttrName.equals("nodeid")) {
			correctNodeIdForElement(e, attrVal);
		}
		if(lcAttrName.equals("name")) {
			this.setUANodeDisplayName(e, attrVal);
			this.setAttribute(e, "BrowseName", attrVal);
		}
		if(lcAttrName.equals("browsename")) {
			this.setAttribute(e, "BrowseName", attrVal);
		}
		if(lcAttrName.equals("displayname")) {
			this.setUANodeDisplayName(e, attrVal);
		}
		if(lcAttrName.equals("description")) {
			this.setDescriptionForElement(e, attrVal);
		}
	}
	
	/**
	 * sets description of element 
	 * */
	private void setDescriptionForElement(Element e, String attrVal) {
		Element descNode = this.doc.createElement("Description");
		//needs to be before <References> and after <DisplayName>
		Node dispNameNode = e.getElementsByTagName("DisplayName").item(0);
		dispNameNode.getParentNode().insertBefore(descNode, dispNameNode.getNextSibling());
		descNode.setTextContent(attrVal);
	}

	/**
	 * Corrects the nodeId for Element e 
	 * if attrVal is already assigned to another node, it will get a new one
	 * @param e
	 * @param attrVal
	 */
	private void correctNodeIdForElement(Element e, String attrVal) {
		//look for potential element with wanted Id
		Element potE = this.uaIdElementMap.get(attrVal);
		if(potE != null) {
			String newId = this.getNewStringId();
			this.uaIdElementMap.put(newId, potE);
		}
		this.setNodeId(e, "ns=1;"+attrVal);
	}
	
	
	
	
	
	
	
	//XSD CHECKING
	
	
	public String printOPCUAxml(){
		try{
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);

			StringWriter sw = new StringWriter();
			StreamResult result = new StreamResult(sw);
			
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			
			transformer.transform(source, result);
			return sw.toString();
		}catch(TransformerException tfe){
			tfe.printStackTrace();
		}
		return null;
	}
	
	
	public void printOPCUAxml(OutputStream out){
		try{
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);

			
			StreamResult result = new StreamResult(out);
			
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			
			transformer.transform(source, result);
			
		}catch(TransformerException tfe){
			tfe.printStackTrace();
		}
	}
	
	private InputStream getXmlAsInputStream(){
		try{
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			StreamResult result = new StreamResult(os);
			
			transformer.transform(source, result);
			
			return new ByteArrayInputStream(os.toByteArray());

		}catch(TransformerException tfe){
			tfe.printStackTrace();
			return null;
		}
	}
	
	private void validateAgainstXSDhelper(InputStream xsd) throws Exception{
		InputStream xml = getXmlAsInputStream();
		
		SchemaFactory factory = 
			SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = factory.newSchema(new StreamSource(xsd));
		Validator validator = schema.newValidator();
		validator.validate(new StreamSource(xml));
	}
	private void validateAgainstXSDhelper(String xsdpath) throws Exception{
		InputStream input = null;
		try{
			input = new URL(xsdpath).openStream();
		}catch(Exception ex1){
			try{
				input = new FileInputStream(xsdpath);
			}catch(Exception ex2){
				System.out.println(ex1.getMessage() + "\n" + ex2.getMessage());
			}
		}
		validateAgainstXSDhelper(input);
	}
	
	public void validateAgainstXSD(String xsdpath){
		try{
			validateAgainstXSDhelper(xsdpath);
			System.out.println("OPC UA xml well formed");
		}catch(Exception e){
			System.out.println("[Error] " + e.getMessage());
		}
	}
	
	public void validateAgainstXSD(InputStream xsd){
		try{
			validateAgainstXSDhelper(xsd);
			System.out.println("OPC UA xml well formed");
		}catch(Exception e){
			System.out.println("[Error] " + e.getMessage());
		}
	}	

}






























































