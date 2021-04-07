/**
 */
package at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl;

import at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvFile;
import at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvPackage;
import at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvRow;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl.NodeIdsCsvFileImpl#getNodeIdsCsvRows <em>Node Ids Csv Rows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeIdsCsvFileImpl extends MinimalEObjectImpl.Container implements NodeIdsCsvFile {
	/**
	 * The cached value of the '{@link #getNodeIdsCsvRows() <em>Node Ids Csv Rows</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeIdsCsvRows()
	 * @generated
	 * @ordered
	 */
	protected NodeIdsCsvRow nodeIdsCsvRows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeIdsCsvFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodeIdsCsvPackage.Literals.NODE_IDS_CSV_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeIdsCsvRow getNodeIdsCsvRows() {
		if (nodeIdsCsvRows != null && nodeIdsCsvRows.eIsProxy()) {
			InternalEObject oldNodeIdsCsvRows = (InternalEObject)nodeIdsCsvRows;
			nodeIdsCsvRows = (NodeIdsCsvRow)eResolveProxy(oldNodeIdsCsvRows);
			if (nodeIdsCsvRows != oldNodeIdsCsvRows) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodeIdsCsvPackage.NODE_IDS_CSV_FILE__NODE_IDS_CSV_ROWS, oldNodeIdsCsvRows, nodeIdsCsvRows));
			}
		}
		return nodeIdsCsvRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeIdsCsvRow basicGetNodeIdsCsvRows() {
		return nodeIdsCsvRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeIdsCsvRows(NodeIdsCsvRow newNodeIdsCsvRows) {
		NodeIdsCsvRow oldNodeIdsCsvRows = nodeIdsCsvRows;
		nodeIdsCsvRows = newNodeIdsCsvRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodeIdsCsvPackage.NODE_IDS_CSV_FILE__NODE_IDS_CSV_ROWS, oldNodeIdsCsvRows, nodeIdsCsvRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NodeIdsCsvPackage.NODE_IDS_CSV_FILE__NODE_IDS_CSV_ROWS:
				if (resolve) return getNodeIdsCsvRows();
				return basicGetNodeIdsCsvRows();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NodeIdsCsvPackage.NODE_IDS_CSV_FILE__NODE_IDS_CSV_ROWS:
				setNodeIdsCsvRows((NodeIdsCsvRow)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NodeIdsCsvPackage.NODE_IDS_CSV_FILE__NODE_IDS_CSV_ROWS:
				setNodeIdsCsvRows((NodeIdsCsvRow)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NodeIdsCsvPackage.NODE_IDS_CSV_FILE__NODE_IDS_CSV_ROWS:
				return nodeIdsCsvRows != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeIdsCsvFileImpl
