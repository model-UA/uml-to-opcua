/**
 */
package at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl;

import at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeIdsCsvFactoryImpl extends EFactoryImpl implements NodeIdsCsvFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NodeIdsCsvFactory init() {
		try {
			NodeIdsCsvFactory theNodeIdsCsvFactory = (NodeIdsCsvFactory)EPackage.Registry.INSTANCE.getEFactory(NodeIdsCsvPackage.eNS_URI);
			if (theNodeIdsCsvFactory != null) {
				return theNodeIdsCsvFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NodeIdsCsvFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeIdsCsvFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NodeIdsCsvPackage.NODE_IDS_CSV_ROW: return createNodeIdsCsvRow();
			case NodeIdsCsvPackage.NODE_IDS_CSV_FILE: return createNodeIdsCsvFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeIdsCsvRow createNodeIdsCsvRow() {
		NodeIdsCsvRowImpl nodeIdsCsvRow = new NodeIdsCsvRowImpl();
		return nodeIdsCsvRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeIdsCsvFile createNodeIdsCsvFile() {
		NodeIdsCsvFileImpl nodeIdsCsvFile = new NodeIdsCsvFileImpl();
		return nodeIdsCsvFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeIdsCsvPackage getNodeIdsCsvPackage() {
		return (NodeIdsCsvPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NodeIdsCsvPackage getPackage() {
		return NodeIdsCsvPackage.eINSTANCE;
	}

} //NodeIdsCsvFactoryImpl
