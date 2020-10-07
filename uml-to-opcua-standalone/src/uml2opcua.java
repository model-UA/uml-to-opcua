public class uml2opcua{

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

}
