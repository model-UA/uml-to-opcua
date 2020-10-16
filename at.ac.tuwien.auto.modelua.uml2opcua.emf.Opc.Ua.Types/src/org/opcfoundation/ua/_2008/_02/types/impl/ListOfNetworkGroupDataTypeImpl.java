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

import org.opcfoundation.ua._2008._02.types.ListOfNetworkGroupDataType;
import org.opcfoundation.ua._2008._02.types.NetworkGroupDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Network Group Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfNetworkGroupDataTypeImpl#getNetworkGroupDataType <em>Network Group Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfNetworkGroupDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfNetworkGroupDataType {
	/**
	 * The cached value of the '{@link #getNetworkGroupDataType() <em>Network Group Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkGroupDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkGroupDataType> networkGroupDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfNetworkGroupDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfNetworkGroupDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkGroupDataType> getNetworkGroupDataType() {
		if (networkGroupDataType == null) {
			networkGroupDataType = new EObjectContainmentEList<NetworkGroupDataType>(NetworkGroupDataType.class, this, TypesPackage.LIST_OF_NETWORK_GROUP_DATA_TYPE__NETWORK_GROUP_DATA_TYPE);
		}
		return networkGroupDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_NETWORK_GROUP_DATA_TYPE__NETWORK_GROUP_DATA_TYPE:
				return ((InternalEList<?>)getNetworkGroupDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_NETWORK_GROUP_DATA_TYPE__NETWORK_GROUP_DATA_TYPE:
				return getNetworkGroupDataType();
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
			case TypesPackage.LIST_OF_NETWORK_GROUP_DATA_TYPE__NETWORK_GROUP_DATA_TYPE:
				getNetworkGroupDataType().clear();
				getNetworkGroupDataType().addAll((Collection<? extends NetworkGroupDataType>)newValue);
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
			case TypesPackage.LIST_OF_NETWORK_GROUP_DATA_TYPE__NETWORK_GROUP_DATA_TYPE:
				getNetworkGroupDataType().clear();
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
			case TypesPackage.LIST_OF_NETWORK_GROUP_DATA_TYPE__NETWORK_GROUP_DATA_TYPE:
				return networkGroupDataType != null && !networkGroupDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfNetworkGroupDataTypeImpl
