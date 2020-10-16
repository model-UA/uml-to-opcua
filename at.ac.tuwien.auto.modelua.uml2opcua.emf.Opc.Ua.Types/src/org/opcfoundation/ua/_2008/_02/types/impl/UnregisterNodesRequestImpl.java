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
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UnregisterNodesRequest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unregister Nodes Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UnregisterNodesRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.UnregisterNodesRequestImpl#getNodesToUnregister <em>Nodes To Unregister</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnregisterNodesRequestImpl extends MinimalEObjectImpl.Container implements UnregisterNodesRequest {
	/**
	 * The cached value of the '{@link #getRequestHeader() <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestHeader()
	 * @generated
	 * @ordered
	 */
	protected RequestHeader requestHeader;

	/**
	 * This is true if the Request Header containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestHeaderESet;

	/**
	 * The cached value of the '{@link #getNodesToUnregister() <em>Nodes To Unregister</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodesToUnregister()
	 * @generated
	 * @ordered
	 */
	protected ListOfNodeId nodesToUnregister;

	/**
	 * This is true if the Nodes To Unregister containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodesToUnregisterESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnregisterNodesRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getUnregisterNodesRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestHeader getRequestHeader() {
		return requestHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestHeader(RequestHeader newRequestHeader, NotificationChain msgs) {
		RequestHeader oldRequestHeader = requestHeader;
		requestHeader = newRequestHeader;
		boolean oldRequestHeaderESet = requestHeaderESet;
		requestHeaderESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.UNREGISTER_NODES_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestHeader(RequestHeader newRequestHeader) {
		if (newRequestHeader != requestHeader) {
			NotificationChain msgs = null;
			if (requestHeader != null)
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UNREGISTER_NODES_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UNREGISTER_NODES_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UNREGISTER_NODES_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRequestHeader(NotificationChain msgs) {
		RequestHeader oldRequestHeader = requestHeader;
		requestHeader = null;
		boolean oldRequestHeaderESet = requestHeaderESet;
		requestHeaderESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.UNREGISTER_NODES_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestHeader() {
		if (requestHeader != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UNREGISTER_NODES_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UNREGISTER_NODES_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestHeader() {
		return requestHeaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfNodeId getNodesToUnregister() {
		return nodesToUnregister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodesToUnregister(ListOfNodeId newNodesToUnregister, NotificationChain msgs) {
		ListOfNodeId oldNodesToUnregister = nodesToUnregister;
		nodesToUnregister = newNodesToUnregister;
		boolean oldNodesToUnregisterESet = nodesToUnregisterESet;
		nodesToUnregisterESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.UNREGISTER_NODES_REQUEST__NODES_TO_UNREGISTER, oldNodesToUnregister, newNodesToUnregister, !oldNodesToUnregisterESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodesToUnregister(ListOfNodeId newNodesToUnregister) {
		if (newNodesToUnregister != nodesToUnregister) {
			NotificationChain msgs = null;
			if (nodesToUnregister != null)
				msgs = ((InternalEObject)nodesToUnregister).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UNREGISTER_NODES_REQUEST__NODES_TO_UNREGISTER, null, msgs);
			if (newNodesToUnregister != null)
				msgs = ((InternalEObject)newNodesToUnregister).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UNREGISTER_NODES_REQUEST__NODES_TO_UNREGISTER, null, msgs);
			msgs = basicSetNodesToUnregister(newNodesToUnregister, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodesToUnregisterESet = nodesToUnregisterESet;
			nodesToUnregisterESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UNREGISTER_NODES_REQUEST__NODES_TO_UNREGISTER, newNodesToUnregister, newNodesToUnregister, !oldNodesToUnregisterESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetNodesToUnregister(NotificationChain msgs) {
		ListOfNodeId oldNodesToUnregister = nodesToUnregister;
		nodesToUnregister = null;
		boolean oldNodesToUnregisterESet = nodesToUnregisterESet;
		nodesToUnregisterESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.UNREGISTER_NODES_REQUEST__NODES_TO_UNREGISTER, oldNodesToUnregister, null, oldNodesToUnregisterESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodesToUnregister() {
		if (nodesToUnregister != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)nodesToUnregister).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UNREGISTER_NODES_REQUEST__NODES_TO_UNREGISTER, null, msgs);
			msgs = basicUnsetNodesToUnregister(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNodesToUnregisterESet = nodesToUnregisterESet;
			nodesToUnregisterESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.UNREGISTER_NODES_REQUEST__NODES_TO_UNREGISTER, null, null, oldNodesToUnregisterESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodesToUnregister() {
		return nodesToUnregisterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.UNREGISTER_NODES_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.UNREGISTER_NODES_REQUEST__NODES_TO_UNREGISTER:
				return basicUnsetNodesToUnregister(msgs);
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
			case TypesPackage.UNREGISTER_NODES_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.UNREGISTER_NODES_REQUEST__NODES_TO_UNREGISTER:
				return getNodesToUnregister();
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
			case TypesPackage.UNREGISTER_NODES_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.UNREGISTER_NODES_REQUEST__NODES_TO_UNREGISTER:
				setNodesToUnregister((ListOfNodeId)newValue);
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
			case TypesPackage.UNREGISTER_NODES_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.UNREGISTER_NODES_REQUEST__NODES_TO_UNREGISTER:
				unsetNodesToUnregister();
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
			case TypesPackage.UNREGISTER_NODES_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.UNREGISTER_NODES_REQUEST__NODES_TO_UNREGISTER:
				return isSetNodesToUnregister();
		}
		return super.eIsSet(featureID);
	}

} //UnregisterNodesRequestImpl
