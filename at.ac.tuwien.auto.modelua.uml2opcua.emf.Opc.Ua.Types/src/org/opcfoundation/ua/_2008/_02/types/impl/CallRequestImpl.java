/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.CallRequest;
import org.opcfoundation.ua._2008._02.types.ListOfCallMethodRequest;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CallRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CallRequestImpl#getMethodsToCall <em>Methods To Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallRequestImpl extends MinimalEObjectImpl.Container implements CallRequest {
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
	 * The cached value of the '{@link #getMethodsToCall() <em>Methods To Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodsToCall()
	 * @generated
	 * @ordered
	 */
	protected ListOfCallMethodRequest methodsToCall;

	/**
	 * This is true if the Methods To Call containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean methodsToCallESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getCallRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CALL_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CALL_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CALL_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CALL_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
	public ListOfCallMethodRequest getMethodsToCall() {
		return methodsToCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodsToCall(ListOfCallMethodRequest newMethodsToCall, NotificationChain msgs) {
		ListOfCallMethodRequest oldMethodsToCall = methodsToCall;
		methodsToCall = newMethodsToCall;
		boolean oldMethodsToCallESet = methodsToCallESet;
		methodsToCallESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CALL_REQUEST__METHODS_TO_CALL, oldMethodsToCall, newMethodsToCall, !oldMethodsToCallESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodsToCall(ListOfCallMethodRequest newMethodsToCall) {
		if (newMethodsToCall != methodsToCall) {
			NotificationChain msgs = null;
			if (methodsToCall != null)
				msgs = ((InternalEObject)methodsToCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_REQUEST__METHODS_TO_CALL, null, msgs);
			if (newMethodsToCall != null)
				msgs = ((InternalEObject)newMethodsToCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_REQUEST__METHODS_TO_CALL, null, msgs);
			msgs = basicSetMethodsToCall(newMethodsToCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMethodsToCallESet = methodsToCallESet;
			methodsToCallESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CALL_REQUEST__METHODS_TO_CALL, newMethodsToCall, newMethodsToCall, !oldMethodsToCallESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetMethodsToCall(NotificationChain msgs) {
		ListOfCallMethodRequest oldMethodsToCall = methodsToCall;
		methodsToCall = null;
		boolean oldMethodsToCallESet = methodsToCallESet;
		methodsToCallESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CALL_REQUEST__METHODS_TO_CALL, oldMethodsToCall, null, oldMethodsToCallESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMethodsToCall() {
		if (methodsToCall != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)methodsToCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_REQUEST__METHODS_TO_CALL, null, msgs);
			msgs = basicUnsetMethodsToCall(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMethodsToCallESet = methodsToCallESet;
			methodsToCallESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CALL_REQUEST__METHODS_TO_CALL, null, null, oldMethodsToCallESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMethodsToCall() {
		return methodsToCallESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.CALL_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.CALL_REQUEST__METHODS_TO_CALL:
				return basicUnsetMethodsToCall(msgs);
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
			case TypesPackage.CALL_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.CALL_REQUEST__METHODS_TO_CALL:
				return getMethodsToCall();
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
			case TypesPackage.CALL_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.CALL_REQUEST__METHODS_TO_CALL:
				setMethodsToCall((ListOfCallMethodRequest)newValue);
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
			case TypesPackage.CALL_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.CALL_REQUEST__METHODS_TO_CALL:
				unsetMethodsToCall();
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
			case TypesPackage.CALL_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.CALL_REQUEST__METHODS_TO_CALL:
				return isSetMethodsToCall();
		}
		return super.eIsSet(featureID);
	}

} //CallRequestImpl
