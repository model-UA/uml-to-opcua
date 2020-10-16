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

import org.opcfoundation.ua._2008._02.types.ConnectionTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfConnectionTransportDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Connection Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfConnectionTransportDataTypeImpl#getConnectionTransportDataType <em>Connection Transport Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfConnectionTransportDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfConnectionTransportDataType {
	/**
	 * The cached value of the '{@link #getConnectionTransportDataType() <em>Connection Transport Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTransportDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionTransportDataType> connectionTransportDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfConnectionTransportDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfConnectionTransportDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionTransportDataType> getConnectionTransportDataType() {
		if (connectionTransportDataType == null) {
			connectionTransportDataType = new EObjectContainmentEList<ConnectionTransportDataType>(ConnectionTransportDataType.class, this, TypesPackage.LIST_OF_CONNECTION_TRANSPORT_DATA_TYPE__CONNECTION_TRANSPORT_DATA_TYPE);
		}
		return connectionTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_CONNECTION_TRANSPORT_DATA_TYPE__CONNECTION_TRANSPORT_DATA_TYPE:
				return ((InternalEList<?>)getConnectionTransportDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_CONNECTION_TRANSPORT_DATA_TYPE__CONNECTION_TRANSPORT_DATA_TYPE:
				return getConnectionTransportDataType();
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
			case TypesPackage.LIST_OF_CONNECTION_TRANSPORT_DATA_TYPE__CONNECTION_TRANSPORT_DATA_TYPE:
				getConnectionTransportDataType().clear();
				getConnectionTransportDataType().addAll((Collection<? extends ConnectionTransportDataType>)newValue);
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
			case TypesPackage.LIST_OF_CONNECTION_TRANSPORT_DATA_TYPE__CONNECTION_TRANSPORT_DATA_TYPE:
				getConnectionTransportDataType().clear();
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
			case TypesPackage.LIST_OF_CONNECTION_TRANSPORT_DATA_TYPE__CONNECTION_TRANSPORT_DATA_TYPE:
				return connectionTransportDataType != null && !connectionTransportDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfConnectionTransportDataTypeImpl
