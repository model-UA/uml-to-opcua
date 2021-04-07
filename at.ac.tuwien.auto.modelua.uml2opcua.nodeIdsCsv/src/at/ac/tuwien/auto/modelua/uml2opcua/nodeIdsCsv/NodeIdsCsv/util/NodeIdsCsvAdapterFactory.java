/**
 */
package at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.util;

import at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvPackage
 * @generated
 */
public class NodeIdsCsvAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NodeIdsCsvPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeIdsCsvAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NodeIdsCsvPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeIdsCsvSwitch<Adapter> modelSwitch =
		new NodeIdsCsvSwitch<Adapter>() {
			@Override
			public Adapter caseNodeIdsCsvRow(NodeIdsCsvRow object) {
				return createNodeIdsCsvRowAdapter();
			}
			@Override
			public Adapter caseNodeIdsCsvFile(NodeIdsCsvFile object) {
				return createNodeIdsCsvFileAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvRow
	 * @generated
	 */
	public Adapter createNodeIdsCsvRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvFile
	 * @generated
	 */
	public Adapter createNodeIdsCsvFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NodeIdsCsvAdapterFactory
