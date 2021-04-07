package at.ac.tuwien.auto.modelua.uml2opcua.qvto;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import opcuaserializer.OpcuaSerializer;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.StringBufferLog;


public class Uml2OpcuaTransformer {
	/*
	 * Performs the UML to OPC UA model transformation using a QVTo transformation file.
	 * 
	 * @param umlFilePath Path to the UML XMI file that is used as in input for the transformation, e.g. a file created with Papyrus.
	 * @param qvtTransformationFileUri URI identifying the qvto file to be used for transformation, e.g. a file created with the QVTo Eclipse Plugin. An internal qvto file is used if no qvtoTransformationFileUri is provided. 
	 * @param informationOutputStream Can be used to provide an OutputStream to write Error Messages, etc. to. System.out is used if no informationOutputStream is provided.
	 * @param transformationResults[0] opcuaNodesetOutput the OPC UA model resulting from the transformation
	 * @param transformationResults[1] opcuaNodeIdsCsvOutput the NodeIdsCsv model resulting from the transformation
	 * @return true if the transformation process if successful, False otherwise. Information about problems is provided via the informationOutputStream.
	 */ 
	public boolean transform(String umlFilePath, URI qvtoTransformationFileUri, ModelExtent[] transformationResults, OutputStream informationOutputStream) {
		PrintWriter informationOutputStreamWriter;
		if(informationOutputStream != null)
			informationOutputStreamWriter = new PrintWriter(informationOutputStream);
		else {
			System.out.println("No output stream provided, using System.out");
			informationOutputStreamWriter = new PrintWriter(System.out);
		}

		if(umlFilePath == null || !(new File(umlFilePath).exists())) { // Error: No UML file provided, throw an execption
        	informationOutputStreamWriter.println("No umlFilePath or File does not exist provided: " + umlFilePath);
			return false;
		}
		
		if(qvtoTransformationFileUri == null) { // no QVTo transformation file provided, use the one provided by at.ac.tuwien.auto.modelua.uml2opcua.qvto.transformation
	        // Obtain a new resource set
	        ResourceSet resSet = new ResourceSetImpl();
	        
			// register opc ua set metamodel
	        Resource setMetamodel = resSet.getResource(URI.createURI("platform:/plugin/at.ac.tuwien.auto.modelua.uml2opcua.qvto.transformation/metamodels/set.ecore"), true);

			EObject eObject = setMetamodel.getContents().get(0);
			if (eObject instanceof EPackage) {
			    EPackage p = (EPackage)eObject;
			    // rs.getPackageRegistry().put(p.getNsURI(), p);
			    // System.out.println("p.getNsURI(): " + p.getNsURI() );
			    EPackage.Registry.INSTANCE.put(p.getNsURI(), p);
			}

			// register opc ua types metamodel
			// TODO: check if this is actually required
	        Resource typesMetamodel = resSet.getResource(URI.createURI("platform:/plugin/at.ac.tuwien.auto.modelua.uml2opcua.qvto.transformation/metamodels/types.ecore"), true);

			EObject eObject2 = typesMetamodel.getContents().get(0);
			if (eObject2 instanceof EPackage) {
			    EPackage p = (EPackage)eObject2;
			    // rs.getPackageRegistry().put(p.getNsURI(), p);
			    // System.out.println("p.getNsURI(): " + p.getNsURI() );
			    EPackage.Registry.INSTANCE.put(p.getNsURI(), p);
			}
			
			// set uri for qvto transformation file
			qvtoTransformationFileUri = URI.createURI("platform:/plugin/at.ac.tuwien.auto.modelua.uml2opcua.qvto.transformation/transforms/Uml2Opcua.qvto");

		}
		
		// QVTo allows to define blackbox libraries
		// the following line is not needed if the class is registered as blackbox in the plugin.xml file
        // TransformationExecutor.BlackboxRegistry.INSTANCE.registerModule(MyBlackbox.class);
        TransformationExecutor transformationExecutor = new TransformationExecutor(qvtoTransformationFileUri);
        ExecutionContextImpl executionContext = new ExecutionContextImpl();
        Resource umlXmiResource = new XMIResourceImpl(URI.createFileURI(umlFilePath));
        try {
			umlXmiResource.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        EList <EObject> eObjects = umlXmiResource.getContents();
		ModelExtent xmlInput = new BasicModelExtent(eObjects);
		if(transformationResults[0] == null) {
			transformationResults[0] = new BasicModelExtent();
		}
		if (transformationResults[1] == null) {
			transformationResults[1] = new BasicModelExtent();			
		}
        // ModelExtent modelParameters = new BasicModelExtent();
		
		// transformationDiagnostic = te.execute(executionContext, input, output);

        // Diagnostic transformationDiagnostic = te.loadTransformation();
		StringBufferLog qvtoLog = new StringBufferLog();
		executionContext.setLog(qvtoLog);
        Diagnostic transformationDiagnostic = transformationExecutor.execute(executionContext, xmlInput, transformationResults[0], transformationResults[1]);
        informationOutputStreamWriter.println(qvtoLog.getContents());
        informationOutputStreamWriter.flush();
        if(transformationDiagnostic.getSeverity() != Diagnostic.OK) {
        	informationOutputStreamWriter.println("Executing QVT transformation failed with error " + transformationDiagnostic.toString());
        	informationOutputStreamWriter.flush();
        	return false;
        }
        
		return true;
	}
	
	/*
	 * Serializes a OPC UA model to an OPC UA Nodeset xml file.
	 * 
	 * @param opcUaModel ModelExtent object describing the OPC UA model that shall be serialized. Typically the result of a transformation process.
	 * @param opcuaNodesetFilePath Path to the Nodeset file that will be created. Must have an "xml" file extension.
	 * @param informationOutputStream Can be used to provide an OutputStream to write Error Messages, etc. to. System.out is used if no informationOutputStream is provided.
	 * @return true if successful, false otherwise. Information about problems is provided via the informationOutputStream.
	 */ 
	public boolean serializeNodeset(ModelExtent opcUaModel, String opcuaNodesetFilePath, OutputStream informationOutputStream) {
		PrintWriter informationOutputStreamWriter; // An output stream for debug messages and similar
		if(informationOutputStream != null)
			informationOutputStreamWriter = new PrintWriter(informationOutputStream);
		else
			informationOutputStreamWriter = new PrintWriter(System.out);
		
        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Create a new resource and copy all resources from the transformation result to the new Resource Set
        Resource resource = resSet.createResource(URI.createURI(opcuaNodesetFilePath));
        EList <EObject> contents = resource.getContents();
        contents.addAll(opcUaModel.getContents());
        
		// Serialize the resource to an OPC UA Nodeset
		File outputFile = new File(opcuaNodesetFilePath);
		OpcuaSerializer serializer = new OpcuaSerializer();
		try {
			serializer.writeNodeset(resource, outputFile);
		} catch (IOException e) {
			informationOutputStreamWriter.println("Serializing nodeset failed with execption: " + e.getMessage());
			return false;
		}
		
		return true;
	}
	
	/*
	 * Serializes a OPC UA model to an OPC UA Nodeset xml file.
	 * 
	 * @param nodeIdsCsvModel ModelExtent object describing the the contents of the nodeIdsCsv model. Typically the result of a transformation process.
	 * @param nodeIdsCsvFilePath Path to the NodeIdsCsv file that will be created. Must have an "csv" file extension.
	 * @param informationOutputStream Can be used to provide an OutputStream to write Error Messages, etc. to. System.out is used if no informationOutputStream is provided.
	 * @return true if successful, false otherwise. Information about problems is provided via the informationOutputStream.
	 */ 
	public boolean serializeNodeIdsCsv(ModelExtent nodeIdsCsvModel, String nodeIdsCsvFilePath, OutputStream informationOutputStream) {
		PrintWriter informationOutputStreamWriter; // An output stream for debug messages and similar
		if(informationOutputStream != null)
			informationOutputStreamWriter = new PrintWriter(informationOutputStream);
		else
			informationOutputStreamWriter = new PrintWriter(System.out);

        // Create a new resource and copy all resources from the transformation result to the new Resource Set
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.createResource(URI.createURI(nodeIdsCsvFilePath));
        EList <EObject> contents = resource.getContents();
        contents.addAll(nodeIdsCsvModel.getContents());
        
        
		Map<Object,Object> options = new HashMap<Object,Object>();
		URI nodesetURI = URI.createFileURI(nodeIdsCsvFilePath);
		resource.setURI(nodesetURI);
		try {
			resource.save(options);
		} catch (IOException e) {
			informationOutputStreamWriter.println("Serializing NodeIdsCsv failed with execption: " + e.getMessage());
		}

		/*
        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Create a new resource and copy all resources from the transformation result to the new Resource Set
        Resource resource = resSet.createResource(URI.createURI(opcuaNodesetFilePath));
        EList <EObject> contents = resource.getContents();
        contents.addAll(opcUaModel.getContents());
        
		// Serialize the resource to an OPC UA Nodeset
		File outputFile = new File(opcuaNodesetFilePath);
		OpcuaSerializer serializer = new OpcuaSerializer();
		try {
			serializer.writeNodeset(resource, outputFile);
		} catch (IOException e) {
			informationOutputStreamWriter.println("Serializing nodeset failed with execption: " + e.getMessage());
			return false;
		}
		*/
		return true;
	}	
}
