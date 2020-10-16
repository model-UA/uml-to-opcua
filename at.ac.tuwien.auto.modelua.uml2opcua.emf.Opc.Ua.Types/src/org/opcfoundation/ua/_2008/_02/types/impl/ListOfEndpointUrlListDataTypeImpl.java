/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opcfoundation.ua._2008._02.types.EndpointUrlListDataType;
import org.opcfoundation.ua._2008._02.types.ListOfEndpointUrlListDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Endpoint Url List Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfEndpointUrlListDataTypeImpl#getEndpointUrlListDataType <em>Endpoint Url List Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfEndpointUrlListDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfEndpointUrlListDataType {
	/**
	 * The cached value of the '{@link #getEndpointUrlListDataType() <em>Endpoint Url List Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointUrlListDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<EndpointUrlListDataType> endpointUrlListDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfEndpointUrlListDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfEndpointUrlListDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndpointUrlListDataType> getEndpointUrlListDataType() {
		if (endpointUrlListDataType == null) {
			endpointUrlListDataType = new EObjectContainmentEList<EndpointUrlListDataType>(EndpointUrlListDataType.class, this, TypesPackage.LIST_OF_ENDPOINT_URL_LIST_DATA_TYPE__ENDPOINT_URL_LIST_DATA_TYPE);
		}
		return endpointUrlListDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_ENDPOINT_URL_LIST_DATA_TYPE__ENDPOINT_URL_LIST_DATA_TYPE:
				return ((InternalEList<?>)getEndpointUrlListDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_ENDPOINT_URL_LIST_DATA_TYPE__ENDPOINT_URL_LIST_DATA_TYPE:
				return getEndpointUrlListDataType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.LIST_OF_ENDPOINT_URL_LIST_DATA_TYPE__ENDPOINT_URL_LIST_DATA_TYPE:
				getEndpointUrlListDataType().clear();
				getEndpointUrlListDataType().addAll((Collection<? extends EndpointUrlListDataType>)newValue);
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
			case TypesPackage.LIST_OF_ENDPOINT_URL_LIST_DATA_TYPE__ENDPOINT_URL_LIST_DATA_TYPE:
				getEndpointUrlListDataType().clear();
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
			case TypesPackage.LIST_OF_ENDPOINT_URL_LIST_DATA_TYPE__ENDPOINT_URL_LIST_DATA_TYPE:
				return endpointUrlListDataType != null && !endpointUrlListDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfEndpointUrlListDataTypeImpl
