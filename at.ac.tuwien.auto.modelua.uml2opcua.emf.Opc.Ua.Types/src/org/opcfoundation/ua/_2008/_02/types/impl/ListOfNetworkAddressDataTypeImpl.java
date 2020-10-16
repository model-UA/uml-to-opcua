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

import org.opcfoundation.ua._2008._02.types.ListOfNetworkAddressDataType;
import org.opcfoundation.ua._2008._02.types.NetworkAddressDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Network Address Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfNetworkAddressDataTypeImpl#getNetworkAddressDataType <em>Network Address Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfNetworkAddressDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfNetworkAddressDataType {
	/**
	 * The cached value of the '{@link #getNetworkAddressDataType() <em>Network Address Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkAddressDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkAddressDataType> networkAddressDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfNetworkAddressDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfNetworkAddressDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkAddressDataType> getNetworkAddressDataType() {
		if (networkAddressDataType == null) {
			networkAddressDataType = new EObjectContainmentEList<NetworkAddressDataType>(NetworkAddressDataType.class, this, TypesPackage.LIST_OF_NETWORK_ADDRESS_DATA_TYPE__NETWORK_ADDRESS_DATA_TYPE);
		}
		return networkAddressDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_NETWORK_ADDRESS_DATA_TYPE__NETWORK_ADDRESS_DATA_TYPE:
				return ((InternalEList<?>)getNetworkAddressDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_NETWORK_ADDRESS_DATA_TYPE__NETWORK_ADDRESS_DATA_TYPE:
				return getNetworkAddressDataType();
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
			case TypesPackage.LIST_OF_NETWORK_ADDRESS_DATA_TYPE__NETWORK_ADDRESS_DATA_TYPE:
				getNetworkAddressDataType().clear();
				getNetworkAddressDataType().addAll((Collection<? extends NetworkAddressDataType>)newValue);
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
			case TypesPackage.LIST_OF_NETWORK_ADDRESS_DATA_TYPE__NETWORK_ADDRESS_DATA_TYPE:
				getNetworkAddressDataType().clear();
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
			case TypesPackage.LIST_OF_NETWORK_ADDRESS_DATA_TYPE__NETWORK_ADDRESS_DATA_TYPE:
				return networkAddressDataType != null && !networkAddressDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfNetworkAddressDataTypeImpl
