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

import org.opcfoundation.ua._2008._02.types.BrokerDataSetWriterTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfBrokerDataSetWriterTransportDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Broker Data Set Writer Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfBrokerDataSetWriterTransportDataTypeImpl#getBrokerDataSetWriterTransportDataType <em>Broker Data Set Writer Transport Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfBrokerDataSetWriterTransportDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfBrokerDataSetWriterTransportDataType {
	/**
	 * The cached value of the '{@link #getBrokerDataSetWriterTransportDataType() <em>Broker Data Set Writer Transport Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokerDataSetWriterTransportDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<BrokerDataSetWriterTransportDataType> brokerDataSetWriterTransportDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfBrokerDataSetWriterTransportDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfBrokerDataSetWriterTransportDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BrokerDataSetWriterTransportDataType> getBrokerDataSetWriterTransportDataType() {
		if (brokerDataSetWriterTransportDataType == null) {
			brokerDataSetWriterTransportDataType = new EObjectContainmentEList<BrokerDataSetWriterTransportDataType>(BrokerDataSetWriterTransportDataType.class, this, TypesPackage.LIST_OF_BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE__BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE);
		}
		return brokerDataSetWriterTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE__BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				return ((InternalEList<?>)getBrokerDataSetWriterTransportDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE__BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				return getBrokerDataSetWriterTransportDataType();
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
			case TypesPackage.LIST_OF_BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE__BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				getBrokerDataSetWriterTransportDataType().clear();
				getBrokerDataSetWriterTransportDataType().addAll((Collection<? extends BrokerDataSetWriterTransportDataType>)newValue);
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
			case TypesPackage.LIST_OF_BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE__BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				getBrokerDataSetWriterTransportDataType().clear();
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
			case TypesPackage.LIST_OF_BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE__BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				return brokerDataSetWriterTransportDataType != null && !brokerDataSetWriterTransportDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfBrokerDataSetWriterTransportDataTypeImpl
