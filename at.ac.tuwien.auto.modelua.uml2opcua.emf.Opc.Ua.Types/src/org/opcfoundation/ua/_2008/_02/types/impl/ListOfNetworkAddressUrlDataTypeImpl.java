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

import org.opcfoundation.ua._2008._02.types.ListOfNetworkAddressUrlDataType;
import org.opcfoundation.ua._2008._02.types.NetworkAddressUrlDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Network Address Url Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfNetworkAddressUrlDataTypeImpl#getNetworkAddressUrlDataType <em>Network Address Url Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfNetworkAddressUrlDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfNetworkAddressUrlDataType {
	/**
	 * The cached value of the '{@link #getNetworkAddressUrlDataType() <em>Network Address Url Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkAddressUrlDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkAddressUrlDataType> networkAddressUrlDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfNetworkAddressUrlDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfNetworkAddressUrlDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkAddressUrlDataType> getNetworkAddressUrlDataType() {
		if (networkAddressUrlDataType == null) {
			networkAddressUrlDataType = new EObjectContainmentEList<NetworkAddressUrlDataType>(NetworkAddressUrlDataType.class, this, TypesPackage.LIST_OF_NETWORK_ADDRESS_URL_DATA_TYPE__NETWORK_ADDRESS_URL_DATA_TYPE);
		}
		return networkAddressUrlDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_NETWORK_ADDRESS_URL_DATA_TYPE__NETWORK_ADDRESS_URL_DATA_TYPE:
				return ((InternalEList<?>)getNetworkAddressUrlDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_NETWORK_ADDRESS_URL_DATA_TYPE__NETWORK_ADDRESS_URL_DATA_TYPE:
				return getNetworkAddressUrlDataType();
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
			case TypesPackage.LIST_OF_NETWORK_ADDRESS_URL_DATA_TYPE__NETWORK_ADDRESS_URL_DATA_TYPE:
				getNetworkAddressUrlDataType().clear();
				getNetworkAddressUrlDataType().addAll((Collection<? extends NetworkAddressUrlDataType>)newValue);
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
			case TypesPackage.LIST_OF_NETWORK_ADDRESS_URL_DATA_TYPE__NETWORK_ADDRESS_URL_DATA_TYPE:
				getNetworkAddressUrlDataType().clear();
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
			case TypesPackage.LIST_OF_NETWORK_ADDRESS_URL_DATA_TYPE__NETWORK_ADDRESS_URL_DATA_TYPE:
				return networkAddressUrlDataType != null && !networkAddressUrlDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfNetworkAddressUrlDataTypeImpl
