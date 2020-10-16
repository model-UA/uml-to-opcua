/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.AddNodesResult;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.StatusCode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Nodes Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AddNodesResultImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AddNodesResultImpl#getAddedNodeId <em>Added Node Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddNodesResultImpl extends MinimalEObjectImpl.Container implements AddNodesResult {
	/**
	 * The cached value of the '{@link #getStatusCode() <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode()
	 * @generated
	 * @ordered
	 */
	protected StatusCode statusCode;

	/**
	 * The cached value of the '{@link #getAddedNodeId() <em>Added Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddedNodeId()
	 * @generated
	 * @ordered
	 */
	protected NodeId addedNodeId;

	/**
	 * This is true if the Added Node Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean addedNodeIdESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddNodesResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getAddNodesResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCode getStatusCode() {
		return statusCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusCode(StatusCode newStatusCode, NotificationChain msgs) {
		StatusCode oldStatusCode = statusCode;
		statusCode = newStatusCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_NODES_RESULT__STATUS_CODE, oldStatusCode, newStatusCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusCode(StatusCode newStatusCode) {
		if (newStatusCode != statusCode) {
			NotificationChain msgs = null;
			if (statusCode != null)
				msgs = ((InternalEObject)statusCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_RESULT__STATUS_CODE, null, msgs);
			if (newStatusCode != null)
				msgs = ((InternalEObject)newStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_RESULT__STATUS_CODE, null, msgs);
			msgs = basicSetStatusCode(newStatusCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_NODES_RESULT__STATUS_CODE, newStatusCode, newStatusCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getAddedNodeId() {
		return addedNodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddedNodeId(NodeId newAddedNodeId, NotificationChain msgs) {
		NodeId oldAddedNodeId = addedNodeId;
		addedNodeId = newAddedNodeId;
		boolean oldAddedNodeIdESet = addedNodeIdESet;
		addedNodeIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_NODES_RESULT__ADDED_NODE_ID, oldAddedNodeId, newAddedNodeId, !oldAddedNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddedNodeId(NodeId newAddedNodeId) {
		if (newAddedNodeId != addedNodeId) {
			NotificationChain msgs = null;
			if (addedNodeId != null)
				msgs = ((InternalEObject)addedNodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_RESULT__ADDED_NODE_ID, null, msgs);
			if (newAddedNodeId != null)
				msgs = ((InternalEObject)newAddedNodeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_RESULT__ADDED_NODE_ID, null, msgs);
			msgs = basicSetAddedNodeId(newAddedNodeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAddedNodeIdESet = addedNodeIdESet;
			addedNodeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_NODES_RESULT__ADDED_NODE_ID, newAddedNodeId, newAddedNodeId, !oldAddedNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAddedNodeId(NotificationChain msgs) {
		NodeId oldAddedNodeId = addedNodeId;
		addedNodeId = null;
		boolean oldAddedNodeIdESet = addedNodeIdESet;
		addedNodeIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_NODES_RESULT__ADDED_NODE_ID, oldAddedNodeId, null, oldAddedNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAddedNodeId() {
		if (addedNodeId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)addedNodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_NODES_RESULT__ADDED_NODE_ID, null, msgs);
			msgs = basicUnsetAddedNodeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAddedNodeIdESet = addedNodeIdESet;
			addedNodeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_NODES_RESULT__ADDED_NODE_ID, null, null, oldAddedNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAddedNodeId() {
		return addedNodeIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.ADD_NODES_RESULT__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
			case TypesPackage.ADD_NODES_RESULT__ADDED_NODE_ID:
				return basicUnsetAddedNodeId(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.ADD_NODES_RESULT__STATUS_CODE:
				return getStatusCode();
			case TypesPackage.ADD_NODES_RESULT__ADDED_NODE_ID:
				return getAddedNodeId();
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
			case TypesPackage.ADD_NODES_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)newValue);
				return;
			case TypesPackage.ADD_NODES_RESULT__ADDED_NODE_ID:
				setAddedNodeId((NodeId)newValue);
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
			case TypesPackage.ADD_NODES_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)null);
				return;
			case TypesPackage.ADD_NODES_RESULT__ADDED_NODE_ID:
				unsetAddedNodeId();
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
			case TypesPackage.ADD_NODES_RESULT__STATUS_CODE:
				return statusCode != null;
			case TypesPackage.ADD_NODES_RESULT__ADDED_NODE_ID:
				return isSetAddedNodeId();
		}
		return super.eIsSet(featureID);
	}

} //AddNodesResultImpl
