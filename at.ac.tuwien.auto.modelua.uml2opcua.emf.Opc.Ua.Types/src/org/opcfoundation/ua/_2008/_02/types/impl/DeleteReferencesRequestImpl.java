/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.DeleteReferencesRequest;
import org.opcfoundation.ua._2008._02.types.ListOfDeleteReferencesItem;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete References Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DeleteReferencesRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DeleteReferencesRequestImpl#getReferencesToDelete <em>References To Delete</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeleteReferencesRequestImpl extends MinimalEObjectImpl.Container implements DeleteReferencesRequest {
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
	 * The cached value of the '{@link #getReferencesToDelete() <em>References To Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencesToDelete()
	 * @generated
	 * @ordered
	 */
	protected ListOfDeleteReferencesItem referencesToDelete;

	/**
	 * This is true if the References To Delete containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referencesToDeleteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteReferencesRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getDeleteReferencesRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DELETE_REFERENCES_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DELETE_REFERENCES_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DELETE_REFERENCES_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DELETE_REFERENCES_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DELETE_REFERENCES_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DELETE_REFERENCES_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DELETE_REFERENCES_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
	public ListOfDeleteReferencesItem getReferencesToDelete() {
		return referencesToDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencesToDelete(ListOfDeleteReferencesItem newReferencesToDelete, NotificationChain msgs) {
		ListOfDeleteReferencesItem oldReferencesToDelete = referencesToDelete;
		referencesToDelete = newReferencesToDelete;
		boolean oldReferencesToDeleteESet = referencesToDeleteESet;
		referencesToDeleteESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DELETE_REFERENCES_REQUEST__REFERENCES_TO_DELETE, oldReferencesToDelete, newReferencesToDelete, !oldReferencesToDeleteESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencesToDelete(ListOfDeleteReferencesItem newReferencesToDelete) {
		if (newReferencesToDelete != referencesToDelete) {
			NotificationChain msgs = null;
			if (referencesToDelete != null)
				msgs = ((InternalEObject)referencesToDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DELETE_REFERENCES_REQUEST__REFERENCES_TO_DELETE, null, msgs);
			if (newReferencesToDelete != null)
				msgs = ((InternalEObject)newReferencesToDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DELETE_REFERENCES_REQUEST__REFERENCES_TO_DELETE, null, msgs);
			msgs = basicSetReferencesToDelete(newReferencesToDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferencesToDeleteESet = referencesToDeleteESet;
			referencesToDeleteESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DELETE_REFERENCES_REQUEST__REFERENCES_TO_DELETE, newReferencesToDelete, newReferencesToDelete, !oldReferencesToDeleteESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetReferencesToDelete(NotificationChain msgs) {
		ListOfDeleteReferencesItem oldReferencesToDelete = referencesToDelete;
		referencesToDelete = null;
		boolean oldReferencesToDeleteESet = referencesToDeleteESet;
		referencesToDeleteESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DELETE_REFERENCES_REQUEST__REFERENCES_TO_DELETE, oldReferencesToDelete, null, oldReferencesToDeleteESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferencesToDelete() {
		if (referencesToDelete != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)referencesToDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DELETE_REFERENCES_REQUEST__REFERENCES_TO_DELETE, null, msgs);
			msgs = basicUnsetReferencesToDelete(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReferencesToDeleteESet = referencesToDeleteESet;
			referencesToDeleteESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DELETE_REFERENCES_REQUEST__REFERENCES_TO_DELETE, null, null, oldReferencesToDeleteESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferencesToDelete() {
		return referencesToDeleteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DELETE_REFERENCES_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.DELETE_REFERENCES_REQUEST__REFERENCES_TO_DELETE:
				return basicUnsetReferencesToDelete(msgs);
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
			case TypesPackage.DELETE_REFERENCES_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.DELETE_REFERENCES_REQUEST__REFERENCES_TO_DELETE:
				return getReferencesToDelete();
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
			case TypesPackage.DELETE_REFERENCES_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.DELETE_REFERENCES_REQUEST__REFERENCES_TO_DELETE:
				setReferencesToDelete((ListOfDeleteReferencesItem)newValue);
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
			case TypesPackage.DELETE_REFERENCES_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.DELETE_REFERENCES_REQUEST__REFERENCES_TO_DELETE:
				unsetReferencesToDelete();
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
			case TypesPackage.DELETE_REFERENCES_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.DELETE_REFERENCES_REQUEST__REFERENCES_TO_DELETE:
				return isSetReferencesToDelete();
		}
		return super.eIsSet(featureID);
	}

} //DeleteReferencesRequestImpl
