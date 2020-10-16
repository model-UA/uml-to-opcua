/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.AddReferencesRequest;
import org.opcfoundation.ua._2008._02.types.ListOfAddReferencesItem;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add References Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AddReferencesRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AddReferencesRequestImpl#getReferencesToAdd <em>References To Add</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddReferencesRequestImpl extends MinimalEObjectImpl.Container implements AddReferencesRequest {
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
	 * The cached value of the '{@link #getReferencesToAdd() <em>References To Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencesToAdd()
	 * @generated
	 * @ordered
	 */
	protected ListOfAddReferencesItem referencesToAdd;

	/**
	 * This is true if the References To Add containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referencesToAddESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddReferencesRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getAddReferencesRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_REFERENCES_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_REFERENCES_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_REFERENCES_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_REFERENCES_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_REFERENCES_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_REFERENCES_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_REFERENCES_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
	public ListOfAddReferencesItem getReferencesToAdd() {
		return referencesToAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencesToAdd(ListOfAddReferencesItem newReferencesToAdd, NotificationChain msgs) {
		ListOfAddReferencesItem oldReferencesToAdd = referencesToAdd;
		referencesToAdd = newReferencesToAdd;
		boolean oldReferencesToAddESet = referencesToAddESet;
		referencesToAddESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_REFERENCES_REQUEST__REFERENCES_TO_ADD, oldReferencesToAdd, newReferencesToAdd, !oldReferencesToAddESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencesToAdd(ListOfAddReferencesItem newReferencesToAdd) {
		if (newReferencesToAdd != referencesToAdd) {
			NotificationChain msgs = null;
			if (referencesToAdd != null)
				msgs = ((InternalEObject)referencesToAdd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_REFERENCES_REQUEST__REFERENCES_TO_ADD, null, msgs);
			if (newReferencesToAdd != null)
				msgs = ((InternalEObject)newReferencesToAdd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_REFERENCES_REQUEST__REFERENCES_TO_ADD, null, msgs);
			msgs = basicSetReferencesToAdd(newReferencesToAdd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferencesToAddESet = referencesToAddESet;
			referencesToAddESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ADD_REFERENCES_REQUEST__REFERENCES_TO_ADD, newReferencesToAdd, newReferencesToAdd, !oldReferencesToAddESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetReferencesToAdd(NotificationChain msgs) {
		ListOfAddReferencesItem oldReferencesToAdd = referencesToAdd;
		referencesToAdd = null;
		boolean oldReferencesToAddESet = referencesToAddESet;
		referencesToAddESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_REFERENCES_REQUEST__REFERENCES_TO_ADD, oldReferencesToAdd, null, oldReferencesToAddESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferencesToAdd() {
		if (referencesToAdd != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)referencesToAdd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ADD_REFERENCES_REQUEST__REFERENCES_TO_ADD, null, msgs);
			msgs = basicUnsetReferencesToAdd(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferencesToAddESet = referencesToAddESet;
			referencesToAddESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ADD_REFERENCES_REQUEST__REFERENCES_TO_ADD, null, null, oldReferencesToAddESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferencesToAdd() {
		return referencesToAddESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.ADD_REFERENCES_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.ADD_REFERENCES_REQUEST__REFERENCES_TO_ADD:
				return basicUnsetReferencesToAdd(msgs);
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
			case TypesPackage.ADD_REFERENCES_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.ADD_REFERENCES_REQUEST__REFERENCES_TO_ADD:
				return getReferencesToAdd();
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
			case TypesPackage.ADD_REFERENCES_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.ADD_REFERENCES_REQUEST__REFERENCES_TO_ADD:
				setReferencesToAdd((ListOfAddReferencesItem)newValue);
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
			case TypesPackage.ADD_REFERENCES_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.ADD_REFERENCES_REQUEST__REFERENCES_TO_ADD:
				unsetReferencesToAdd();
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
			case TypesPackage.ADD_REFERENCES_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.ADD_REFERENCES_REQUEST__REFERENCES_TO_ADD:
				return isSetReferencesToAdd();
		}
		return super.eIsSet(featureID);
	}

} //AddReferencesRequestImpl
