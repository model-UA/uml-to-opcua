/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.EndpointUrlListDataType;
import org.opcfoundation.ua._2008._02.types.ListOfString;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint Url List Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointUrlListDataTypeImpl#getEndpointUrlList <em>Endpoint Url List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndpointUrlListDataTypeImpl extends MinimalEObjectImpl.Container implements EndpointUrlListDataType {
	/**
	 * The cached value of the '{@link #getEndpointUrlList() <em>Endpoint Url List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointUrlList()
	 * @generated
	 * @ordered
	 */
	protected ListOfString endpointUrlList;

	/**
	 * This is true if the Endpoint Url List containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endpointUrlListESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndpointUrlListDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getEndpointUrlListDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfString getEndpointUrlList() {
		return endpointUrlList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpointUrlList(ListOfString newEndpointUrlList, NotificationChain msgs) {
		ListOfString oldEndpointUrlList = endpointUrlList;
		endpointUrlList = newEndpointUrlList;
		boolean oldEndpointUrlListESet = endpointUrlListESet;
		endpointUrlListESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_URL_LIST_DATA_TYPE__ENDPOINT_URL_LIST, oldEndpointUrlList, newEndpointUrlList, !oldEndpointUrlListESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointUrlList(ListOfString newEndpointUrlList) {
		if (newEndpointUrlList != endpointUrlList) {
			NotificationChain msgs = null;
			if (endpointUrlList != null)
				msgs = ((InternalEObject)endpointUrlList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENDPOINT_URL_LIST_DATA_TYPE__ENDPOINT_URL_LIST, null, msgs);
			if (newEndpointUrlList != null)
				msgs = ((InternalEObject)newEndpointUrlList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENDPOINT_URL_LIST_DATA_TYPE__ENDPOINT_URL_LIST, null, msgs);
			msgs = basicSetEndpointUrlList(newEndpointUrlList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEndpointUrlListESet = endpointUrlListESet;
			endpointUrlListESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_URL_LIST_DATA_TYPE__ENDPOINT_URL_LIST, newEndpointUrlList, newEndpointUrlList, !oldEndpointUrlListESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEndpointUrlList(NotificationChain msgs) {
		ListOfString oldEndpointUrlList = endpointUrlList;
		endpointUrlList = null;
		boolean oldEndpointUrlListESet = endpointUrlListESet;
		endpointUrlListESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_URL_LIST_DATA_TYPE__ENDPOINT_URL_LIST, oldEndpointUrlList, null, oldEndpointUrlListESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndpointUrlList() {
		if (endpointUrlList != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)endpointUrlList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENDPOINT_URL_LIST_DATA_TYPE__ENDPOINT_URL_LIST, null, msgs);
			msgs = basicUnsetEndpointUrlList(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEndpointUrlListESet = endpointUrlListESet;
			endpointUrlListESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_URL_LIST_DATA_TYPE__ENDPOINT_URL_LIST, null, null, oldEndpointUrlListESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndpointUrlList() {
		return endpointUrlListESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.ENDPOINT_URL_LIST_DATA_TYPE__ENDPOINT_URL_LIST:
				return basicUnsetEndpointUrlList(msgs);
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
			case TypesPackage.ENDPOINT_URL_LIST_DATA_TYPE__ENDPOINT_URL_LIST:
				return getEndpointUrlList();
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
			case TypesPackage.ENDPOINT_URL_LIST_DATA_TYPE__ENDPOINT_URL_LIST:
				setEndpointUrlList((ListOfString)newValue);
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
			case TypesPackage.ENDPOINT_URL_LIST_DATA_TYPE__ENDPOINT_URL_LIST:
				unsetEndpointUrlList();
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
			case TypesPackage.ENDPOINT_URL_LIST_DATA_TYPE__ENDPOINT_URL_LIST:
				return isSetEndpointUrlList();
		}
		return super.eIsSet(featureID);
	}

} //EndpointUrlListDataTypeImpl
