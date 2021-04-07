/**
 */
package at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.util;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl.NodeIdsCsvRowImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.util.NodeIdsCsvResourceFactoryImpl
 * @generated
 */
public class NodeIdsCsvResourceImpl extends ResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public NodeIdsCsvResourceImpl(URI uri) {
		super(uri);
	}
	
	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		if(outputStream instanceof URIConverter.Saveable) {
			((URIConverter.Saveable) outputStream).saveResource(this);
		} else {
			OutputStreamWriter osWriter = new OutputStreamWriter(outputStream, "UTF8");
			List<EObject> modelElements = this.getContents();
			for (final EObject modelElement : modelElements) {
				if (modelElement instanceof NodeIdsCsvRowImpl) {
					NodeIdsCsvRowImpl nodeIdsRow = (NodeIdsCsvRowImpl) modelElement;
					osWriter.write(nodeIdsRow.getSymbolName() + "," + nodeIdsRow.getIdentifier() + "," + nodeIdsRow.getNodeClass() + "\n");
				}
			}
			osWriter.flush();
			osWriter.close();
		}
	}

} //NodeIdsCsvResourceImpl
