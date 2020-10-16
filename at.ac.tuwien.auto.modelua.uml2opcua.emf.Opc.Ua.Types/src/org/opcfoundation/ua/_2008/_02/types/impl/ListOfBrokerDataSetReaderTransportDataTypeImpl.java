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

import org.opcfoundation.ua._2008._02.types.BrokerDataSetReaderTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfBrokerDataSetReaderTransportDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Broker Data Set Reader Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfBrokerDataSetReaderTransportDataTypeImpl#getBrokerDataSetReaderTransportDataType <em>Broker Data Set Reader Transport Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfBrokerDataSetReaderTransportDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfBrokerDataSetReaderTransportDataType {
	/**
	 * The cached value of the '{@link #getBrokerDataSetReaderTransportDataType() <em>Broker Data Set Reader Transport Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokerDataSetReaderTransportDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<BrokerDataSetReaderTransportDataType> brokerDataSetReaderTransportDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfBrokerDataSetReaderTransportDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfBrokerDataSetReaderTransportDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BrokerDataSetReaderTransportDataType> getBrokerDataSetReaderTransportDataType() {
		if (brokerDataSetReaderTransportDataType == null) {
			brokerDataSetReaderTransportDataType = new EObjectContainmentEList<BrokerDataSetReaderTransportDataType>(BrokerDataSetReaderTransportDataType.class, this, TypesPackage.LIST_OF_BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE__BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE);
		}
		return brokerDataSetReaderTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE__BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				return ((InternalEList<?>)getBrokerDataSetReaderTransportDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE__BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				return getBrokerDataSetReaderTransportDataType();
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
			case TypesPackage.LIST_OF_BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE__BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				getBrokerDataSetReaderTransportDataType().clear();
				getBrokerDataSetReaderTransportDataType().addAll((Collection<? extends BrokerDataSetReaderTransportDataType>)newValue);
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
			case TypesPackage.LIST_OF_BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE__BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				getBrokerDataSetReaderTransportDataType().clear();
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
			case TypesPackage.LIST_OF_BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE__BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE:
				return brokerDataSetReaderTransportDataType != null && !brokerDataSetReaderTransportDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfBrokerDataSetReaderTransportDataTypeImpl
