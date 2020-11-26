package at.ac.tuwien.auto.modelua.uml2opcua.qvto.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
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
        
        // get the selected uml file
    	IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
    	ISelectionService service = window.getSelectionService();
    	IStructuredSelection selection = (IStructuredSelection) service.getSelection();
    	
    	if(selection.size() > 1) // Error, only a single file can be transformed at the moment 
    		return null;
        
    	if (! (selection instanceof IStructuredSelection)) // cannot be transformed
    		return null;
		Object selected = ((IStructuredSelection)selection).getFirstElement();
		IAdapterManager am = Platform.getAdapterManager();
		IFile adapter = am.getAdapter(selected, IFile.class);
		IFile file = (IFile)adapter;
		String umlFilePath = file.getRawLocation().makeAbsolute().toString();
		if (!umlFilePath.endsWith("uml")) {
    		MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Error", "The file extension needs to be uml");
			return null;
    	}
		
        String opcuaNodesetFilePath = umlFilePath.replace(".uml", ".xml");
		
		Uml2OpcuaTransformer transformer = new Uml2OpcuaTransformer();
		
		// the transformer uses its internal UML to OPC UA QVTo transformation null is passed instead of a QVTo transformation file
		ModelExtent result = transformer.transform(umlFilePath, null, out);
		if(result != null) {
			transformer.serialize(result, opcuaNodesetFilePath, out);
			
            // Refresh the workspace (causing the new file to appear in the Project Explorer)
            try {
            	file.getProject().refreshLocal( IResource.DEPTH_INFINITE, new NullProgressMonitor() );
    		} catch (CoreException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
		}
		
        // Refresh the workspace (causing the new file to appear in the Project Explorer)
        try {
        	file.getProject().refreshLocal( IResource.DEPTH_INFINITE, new NullProgressMonitor() );
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
        return null;
    }
}
