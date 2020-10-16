/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.HistoryUpdateDetails;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Update Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.HistoryUpdateDetailsImpl#getNodeId <em>Node Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoryUpdateDetailsImpl extends MinimalEObjectImpl.Container implements HistoryUpdateDetails {
	/**
	 * The cached value of the '{@link #getNodeId() <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected NodeId nodeId;

	/**
	 * This is true if the Node Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodeIdESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryUpdateDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getHistoryUpdateDetails();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getNodeId() {
		return nodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeId(NodeId newNodeId, NotificationChain msgs) {
		NodeId oldNodeId = nodeId;
		nodeId = newNodeId;
		boolean oldNodeIdESet = nodeIdESet;
		nodeIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_UPDATE_DETAILS__NODE_ID, oldNodeId, newNodeId, !oldNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeId(NodeId newNodeId) {
		if (newNodeId != nodeId) {
			NotificationChain msgs = null;
			if (nodeId != null)
				msgs = ((InternalEObject)nodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_UPDATE_DETAILS__NODE_ID, null, msgs);
			if (newNodeId != null)
				msgs = ((InternalEObject)newNodeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_UPDATE_DETAILS__NODE_ID, null, msgs);
			msgs = basicSetNodeId(newNodeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodeIdESet = nodeIdESet;
			nodeIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_UPDATE_DETAILS__NODE_ID, newNodeId, newNodeId, !oldNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetNodeId(NotificationChain msgs) {
		NodeId oldNodeId = nodeId;
		nodeId = null;
		boolean oldNodeIdESet = nodeIdESet;
		nodeIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_UPDATE_DETAILS__NODE_ID, oldNodeId, null, oldNodeIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodeId() {
		if (nodeId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)nodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_UPDATE_DETAILS__NODE_ID, null, msgs);
			msgs = basicUnsetNodeId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodeIdESet = nodeIdESet;
			nodeIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_UPDATE_DETAILS__NODE_ID, null, null, oldNodeIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodeId() {
		return nodeIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.HISTORY_UPDATE_DETAILS__NODE_ID:
				return basicUnsetNodeId(msgs);
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
			case TypesPackage.HISTORY_UPDATE_DETAILS__NODE_ID:
				return getNodeId();
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
			case TypesPackage.HISTORY_UPDATE_DETAILS__NODE_ID:
				setNodeId((NodeId)newValue);
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
			case TypesPackage.HISTORY_UPDATE_DETAILS__NODE_ID:
				unsetNodeId();
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
			case TypesPackage.HISTORY_UPDATE_DETAILS__NODE_ID:
				return isSetNodeId();
		}
		return super.eIsSet(featureID);
	}

} //HistoryUpdateDetailsImpl
