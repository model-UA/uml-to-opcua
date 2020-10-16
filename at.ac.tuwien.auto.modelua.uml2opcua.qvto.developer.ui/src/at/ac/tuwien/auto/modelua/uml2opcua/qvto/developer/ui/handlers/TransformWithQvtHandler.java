package at.ac.tuwien.auto.modelua.uml2opcua.qvto.developer.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
// Try to get rid of the emf packges
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.handlers.HandlerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import at.ac.tuwien.auto.modelua.uml2opcua.qvto.Uml2OpcuaTransformer;



public class TransformWithQvtHandler extends AbstractHandler {

	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
		if (name.equals(existing[i].getName()))
			return (MessageConsole) existing[i];
		//no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[]{myConsole});
		return myConsole;
	}
	   
	private static final Logger logger = LoggerFactory.getLogger(TransformWithQvtHandler.class);
	
	@Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        System.out.println("TransformWithQvtHandler is executed");
        logger.info("Testing the logger");
        
        MessageConsole myConsole = findConsole("Console");
        MessageConsoleStream out = myConsole.newMessageStream();
        
        // STEP 1: get the selected uml file
        // get workbench window
    	IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
    	ISelectionService service = window.getSelectionService();
    	IStructuredSelection selection = (IStructuredSelection) service.getSelection();
    	
    	if(selection.size() > 1) // Error, only a single file can be transformed at the moment 
    		return null;
    	
    	if (selection instanceof IStructuredSelection) {
    		Object selected = ((IStructuredSelection)selection).getFirstElement();
    		IAdapterManager am = Platform.getAdapterManager();
    		IFile adapter = am.getAdapter(selected, IFile.class);
    		IFile file = (IFile)adapter;
    		
    		//     		IFile file = (IFile)Platform.getAdapterManager().getAdapter(selected, IFile.class);

    		String umlFilePath = file.getRawLocation().makeAbsolute().toString();
    		if (!umlFilePath.endsWith("uml")) {
        		MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Error", "The file extension needs to be uml");
    			return null;
        	}
    		
    		// This is only for now and will later be replaced with a QVT transformation that comes with the plugin
    		// Search for a QVT project in the workspace
    		IProject qvtProject = null;
    		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
    		IProject[] projects = workspaceRoot.getProjects();
    		for(int i = 0; i < projects.length; i++) {
    			IProject project = projects[i];
    			try {
    				if(project.hasNature("org.eclipse.m2m.qvt.oml.project.QVTONature") && project.getName().equals("QvtoTransformationRules")) {
    					qvtProject = project;
    					// System.out.println("found qvt project " + project.toString());
    				}
    			} catch (CoreException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		}
    		
    		if(qvtProject == null) {
        		MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Error", "Please create a QVT project with name  && QvtoVerificationRules and transformation file /transforms/Uml2Opcua.qvto in the same workspace");
    			return null;			
    		}

    		URI qvtTransformationFileUri = URI.createURI("/" + qvtProject.getName() + "/transforms/" + "Uml2Opcua.qvto", true);
            String opcuaNodesetFilePath = umlFilePath.replace(".uml", ".xml");
    		
    		Uml2OpcuaTransformer transformer = new Uml2OpcuaTransformer();
    		ModelExtent result = transformer.transform(umlFilePath, qvtTransformationFileUri, out);
    		transformer.serialize(result, opcuaNodesetFilePath, out);
    		
            // Refresh the workspace (causing the new file to appear in the Project Explorer)
            try {
            	file.getProject().refreshLocal( IResource.DEPTH_INFINITE, new NullProgressMonitor() );
    		} catch (CoreException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}    
    	}
    	else { // cannot be transformed
    		return null;
    	}
    	

/*
    	//check if it is an ISubResourceFile
    	if (!(structured.getFirstElement() instanceof ISubResourceFile) ) {
    		MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Error", "Only UML files can be transformed to OPC UA");
    		return null;
    	}
	
		ISubResourceFile file = (ISubResourceFile) structured.getFirstElement();
		// get the path
		// IPath path = file.getFile().getFullPath();
		
		String umlFilePath = file.getFile().getRawLocation().makeAbsolute().toString();
		// check if it ends with "uml"
		if (!umlFilePath.endsWith("uml")) {
    		MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Error", "The file extension needs to be uml");
			return null;
    	}
		
		// Search for a QVT project in the workspace
		IProject qvtProject = null;
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject[] projects = workspaceRoot.getProjects();
		for(int i = 0; i < projects.length; i++) {
			IProject project = projects[i];
			try {
				if(project.hasNature("org.eclipse.m2m.qvt.oml.project.QVTONature")) {
					qvtProject = project;
					// System.out.println("found qvt project " + project.toString());
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(qvtProject == null) {
    		MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Error", "Please create a QVT project with transformation file Uml2Opcua.qvto in a same workspace");
			return null;			
		}

		/*
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        Object setFactory = null;
        
        System.out.println("Registered resource factories:");
        for(String k : m.keySet()) {
        	System.out.println("\t" + k + " :: " + m.get(k).toString());
        	if(k.contentEquals("set"))
        		setFactory = m.get(k);
        }
        
        int x = 4;
        */
        /*
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("nodeset", new SetResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Create a simple Resource containing the model
        Resource resource = resSet.createResource(URI.createURI("thisIsMyResourceUri.nodeset"));
        resource.getContents().add(documentRoot);
        
		// Serialize the resource to an OPC UA Nodeset
		File outputFile = new File("TestCombineMetamodels.xml");
		OpcuaSerializer serializer = new OpcuaSerializer();
		*/
		// serializer.writeNodeset(resource, outputFile);
			
        /*
        Resource opcuaXmiResource = new XMIResourceImpl(URI.createFileURI(opcuaXmiFilePath));
        opcuaXmiResource.getContents().addAll(output.getContents());
        try {
			opcuaXmiResource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        /*
        String opcuaNodesetFilePath = opcuaXmiFilePath.replace("TempOpcuaXmi", "TempOpcuaNodeset");
        Resource opcuaNodesetResource = new SetResourceImpl(URI.createFileURI(opcuaNodesetFilePath));
        opcuaNodesetResource.getContents().addAll(output.getContents());
        
        try {
        	opcuaNodesetResource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

        try {
            OpcuaSerializer opcuaSerializer = new OpcuaSerializer();
            URI modelURI = URI.createFileURI(opcuaXmiFilePath.toString());
            opcuaSerializer.writeXML(opcuaNodesetResource, opcuaNodesetFilePath);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        */
        /*
		// STEP 3: Serialize the XXX.temp.xmi to a XXXNodest.xml nodeset file in OPCUA format (conforms to http://opcfoundation.org/UA/2011/03/UANodeSet.xsd)
        String opcuaNodesetFilePath = opcuaXmiFilePath.replace(".TempOpcuaXmi", ".xml");

        // prepare the resource set that is required for the serializer
        SetPackage.eINSTANCE.eClass(); // TODO: check what this does
        ResourceSet resourceSet = new ResourceSetImpl();
        ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl()); // TODO: check what this does

        // execute the serializer
        try {
            OpcuaSerializer opcuaSerializer = new OpcuaSerializer();
            URI modelURI = URI.createFileURI(opcuaXmiFilePath.toString());
            opcuaSerializer.writeXML(resourceSet.getResource(modelURI, true), opcuaNodesetFilePath);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        */



        return null;
    }
}
