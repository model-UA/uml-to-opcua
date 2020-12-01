package at.ac.tuwien.auto.modelua.uml2opcua.qvto;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
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
import org.opcfoundation.ua._2011._03.ua.node.set.util.SetResourceFactoryImpl;


public class Uml2OpcuaTransformer {
	/*
	 * Performs the UML to OPC UA model transformation using a QVTo transformation file.
	 * 
	 * @param umlFilePath Path to the UML XMI file that is used as in input for the transformation, e.g. a file created with Papyrus.
	 * @param qvtTransformationFileUri URI identifying the qvto file to be used for transformation, e.g. a file created with the QVTo Eclipse Plugin. An internal qvto file is used if no qvtoTransformationFileUri is provided. 
	 * @param informationOutputStream Can be used to provide an OutputStream to write Error Messages, etc. to. System.out is used if no informationOutputStream is provided.
	 * @return the model resulting from the transformation process if successful, null otherwise. Information about problems is provided via the informationOutputStream.
	 */ 
	public ModelExtent transform(String umlFilePath, URI qvtoTransformationFileUri, OutputStream informationOutputStream) {
		if(umlFilePath == null || !(new File(umlFilePath).exists())) { // Error: No UML file provided, throw an execption
			return null;
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
		
		PrintWriter informationOutputStreamWriter;
		if(informationOutputStream != null)
			informationOutputStreamWriter = new PrintWriter(informationOutputStream);
		else {
			System.out.println("Not output stream provided, using System.out");
			informationOutputStreamWriter = new PrintWriter(System.out);
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
		ModelExtent input = new BasicModelExtent(eObjects);
		ModelExtent output = new BasicModelExtent();
        // ModelExtent modelParameters = new BasicModelExtent();
		
		// transformationDiagnostic = te.execute(executionContext, input, output);

        // Diagnostic transformationDiagnostic = te.loadTransformation();
		StringBufferLog qvtoLog = new StringBufferLog();
		executionContext.setLog(qvtoLog);
        Diagnostic transformationDiagnostic = transformationExecutor.execute(executionContext, input, output);
        informationOutputStreamWriter.println(qvtoLog.getContents());
        informationOutputStreamWriter.flush();
        if(transformationDiagnostic.getSeverity() != Diagnostic.OK) {
        	informationOutputStreamWriter.println("Executing QVT transformation failed with error " + transformationDiagnostic.toString());
        	informationOutputStreamWriter.flush();
        	return null;
        }
        
		return output;
	}
	
	/*
	 * Serializes a OPC UA model to an OPC UA Nodeset xml file.
	 * 
	 * @param opcUaModel ModelExtent object describing the OPC UA model that shall be serialized. Typically the result of a transformation process.
	 * @param opcuaNodesetFilePath Path to the Nodeset file that will be created. Must have an "xml" file extension.
	 * @param informationOutputStream Can be used to provide an OutputStream to write Error Messages, etc. to. System.out is used if no informationOutputStream is provided.
	 * @return true if successful, false otherwise. Information about problems is provided via the informationOutputStream.
	 */ 
	public boolean serialize(ModelExtent opcUaModel, String opcuaNodesetFilePath, OutputStream informationOutputStream) {
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
}
