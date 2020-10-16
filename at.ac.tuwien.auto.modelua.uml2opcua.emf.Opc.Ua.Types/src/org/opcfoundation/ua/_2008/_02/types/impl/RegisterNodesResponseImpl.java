/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfNodeId;
import org.opcfoundation.ua._2008._02.types.RegisterNodesResponse;
import org.opcfoundation.ua._2008._02.types.ResponseHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Register Nodes Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RegisterNodesResponseImpl#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RegisterNodesResponseImpl#getRegisteredNodeIds <em>Registered Node Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegisterNodesResponseImpl extends MinimalEObjectImpl.Container implements RegisterNodesResponse {
	/**
	 * The cached value of the '{@link #getResponseHeader() <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseHeader()
	 * @generated
	 * @ordered
	 */
	protected ResponseHeader responseHeader;

	/**
	 * This is true if the Response Header containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean responseHeaderESet;

	/**
	 * The cached value of the '{@link #getRegisteredNodeIds() <em>Registered Node Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredNodeIds()
	 * @generated
	 * @ordered
	 */
	protected ListOfNodeId registeredNodeIds;

	/**
	 * This is true if the Registered Node Ids containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean registeredNodeIdsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisterNodesResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getRegisterNodesResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseHeader(ResponseHeader newResponseHeader, NotificationChain msgs) {
		ResponseHeader oldResponseHeader = responseHeader;
		responseHeader = newResponseHeader;
		boolean oldResponseHeaderESet = responseHeaderESet;
		responseHeaderESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTER_NODES_RESPONSE__RESPONSE_HEADER, oldResponseHeader, newResponseHeader, !oldResponseHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseHeader(ResponseHeader newResponseHeader) {
		if (newResponseHeader != responseHeader) {
			NotificationChain msgs = null;
			if (responseHeader != null)
				msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTER_NODES_RESPONSE__RESPONSE_HEADER, null, msgs);
			if (newResponseHeader != null)
				msgs = ((InternalEObject)newResponseHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTER_NODES_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicSetResponseHeader(newResponseHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTER_NODES_RESPONSE__RESPONSE_HEADER, newResponseHeader, newResponseHeader, !oldResponseHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetResponseHeader(NotificationChain msgs) {
		ResponseHeader oldResponseHeader = responseHeader;
		responseHeader = null;
		boolean oldResponseHeaderESet = responseHeaderESet;
		responseHeaderESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTER_NODES_RESPONSE__RESPONSE_HEADER, oldResponseHeader, null, oldResponseHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResponseHeader() {
		if (responseHeader != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTER_NODES_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicUnsetResponseHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTER_NODES_RESPONSE__RESPONSE_HEADER, null, null, oldResponseHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResponseHeader() {
		return responseHeaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfNodeId getRegisteredNodeIds() {
		return registeredNodeIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisteredNodeIds(ListOfNodeId newRegisteredNodeIds, NotificationChain msgs) {
		ListOfNodeId oldRegisteredNodeIds = registeredNodeIds;
		registeredNodeIds = newRegisteredNodeIds;
		boolean oldRegisteredNodeIdsESet = registeredNodeIdsESet;
		registeredNodeIdsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTER_NODES_RESPONSE__REGISTERED_NODE_IDS, oldRegisteredNodeIds, newRegisteredNodeIds, !oldRegisteredNodeIdsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisteredNodeIds(ListOfNodeId newRegisteredNodeIds) {
		if (newRegisteredNodeIds != registeredNodeIds) {
			NotificationChain msgs = null;
			if (registeredNodeIds != null)
				msgs = ((InternalEObject)registeredNodeIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTER_NODES_RESPONSE__REGISTERED_NODE_IDS, null, msgs);
			if (newRegisteredNodeIds != null)
				msgs = ((InternalEObject)newRegisteredNodeIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTER_NODES_RESPONSE__REGISTERED_NODE_IDS, null, msgs);
			msgs = basicSetRegisteredNodeIds(newRegisteredNodeIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRegisteredNodeIdsESet = registeredNodeIdsESet;
			registeredNodeIdsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTER_NODES_RESPONSE__REGISTERED_NODE_IDS, newRegisteredNodeIds, newRegisteredNodeIds, !oldRegisteredNodeIdsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRegisteredNodeIds(NotificationChain msgs) {
		ListOfNodeId oldRegisteredNodeIds = registeredNodeIds;
		registeredNodeIds = null;
		boolean oldRegisteredNodeIdsESet = registeredNodeIdsESet;
		registeredNodeIdsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTER_NODES_RESPONSE__REGISTERED_NODE_IDS, oldRegisteredNodeIds, null, oldRegisteredNodeIdsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRegisteredNodeIds() {
		if (registeredNodeIds != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)registeredNodeIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTER_NODES_RESPONSE__REGISTERED_NODE_IDS, null, msgs);
			msgs = basicUnsetRegisteredNodeIds(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRegisteredNodeIdsESet = registeredNodeIdsESet;
			registeredNodeIdsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTER_NODES_RESPONSE__REGISTERED_NODE_IDS, null, null, oldRegisteredNodeIdsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRegisteredNodeIds() {
		return registeredNodeIdsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.REGISTER_NODES_RESPONSE__RESPONSE_HEADER:
				return basicUnsetResponseHeader(msgs);
			case TypesPackage.REGISTER_NODES_RESPONSE__REGISTERED_NODE_IDS:
				return basicUnsetRegisteredNodeIds(msgs);
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
			case TypesPackage.REGISTER_NODES_RESPONSE__RESPONSE_HEADER:
				return getResponseHeader();
			case TypesPackage.REGISTER_NODES_RESPONSE__REGISTERED_NODE_IDS:
				return getRegisteredNodeIds();
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
			case TypesPackage.REGISTER_NODES_RESPONSE__RESPONSE_HEADER:
				setResponseHeader((ResponseHeader)newValue);
				return;
			case TypesPackage.REGISTER_NODES_RESPONSE__REGISTERED_NODE_IDS:
				setRegisteredNodeIds((ListOfNodeId)newValue);
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
			case TypesPackage.REGISTER_NODES_RESPONSE__RESPONSE_HEADER:
				unsetResponseHeader();
				return;
			case TypesPackage.REGISTER_NODES_RESPONSE__REGISTERED_NODE_IDS:
				unsetRegisteredNodeIds();
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
			case TypesPackage.REGISTER_NODES_RESPONSE__RESPONSE_HEADER:
				return isSetResponseHeader();
			case TypesPackage.REGISTER_NODES_RESPONSE__REGISTERED_NODE_IDS:
				return isSetRegisteredNodeIds();
		}
		return super.eIsSet(featureID);
	}

} //RegisterNodesResponseImpl
