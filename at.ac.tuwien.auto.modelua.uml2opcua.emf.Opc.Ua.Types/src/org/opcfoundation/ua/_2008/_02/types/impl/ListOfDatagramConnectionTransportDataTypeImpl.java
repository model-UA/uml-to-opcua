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

import org.opcfoundation.ua._2008._02.types.DatagramConnectionTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfDatagramConnectionTransportDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Datagram Connection Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfDatagramConnectionTransportDataTypeImpl#getDatagramConnectionTransportDataType <em>Datagram Connection Transport Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfDatagramConnectionTransportDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfDatagramConnectionTransportDataType {
	/**
	 * The cached value of the '{@link #getDatagramConnectionTransportDataType() <em>Datagram Connection Transport Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatagramConnectionTransportDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<DatagramConnectionTransportDataType> datagramConnectionTransportDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDatagramConnectionTransportDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfDatagramConnectionTransportDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatagramConnectionTransportDataType> getDatagramConnectionTransportDataType() {
		if (datagramConnectionTransportDataType == null) {
			datagramConnectionTransportDataType = new EObjectContainmentEList<DatagramConnectionTransportDataType>(DatagramConnectionTransportDataType.class, this, TypesPackage.LIST_OF_DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE__DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE);
		}
		return datagramConnectionTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE__DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE:
				return ((InternalEList<?>)getDatagramConnectionTransportDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE__DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE:
				return getDatagramConnectionTransportDataType();
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
			case TypesPackage.LIST_OF_DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE__DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE:
				getDatagramConnectionTransportDataType().clear();
				getDatagramConnectionTransportDataType().addAll((Collection<? extends DatagramConnectionTransportDataType>)newValue);
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
			case TypesPackage.LIST_OF_DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE__DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE:
				getDatagramConnectionTransportDataType().clear();
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
			case TypesPackage.LIST_OF_DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE__DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE:
				return datagramConnectionTransportDataType != null && !datagramConnectionTransportDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfDatagramConnectionTransportDataTypeImpl
