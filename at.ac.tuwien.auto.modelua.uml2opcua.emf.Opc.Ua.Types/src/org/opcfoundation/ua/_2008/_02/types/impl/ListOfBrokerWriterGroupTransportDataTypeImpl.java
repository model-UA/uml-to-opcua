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

import org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfBrokerWriterGroupTransportDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Broker Writer Group Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfBrokerWriterGroupTransportDataTypeImpl#getBrokerWriterGroupTransportDataType <em>Broker Writer Group Transport Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfBrokerWriterGroupTransportDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfBrokerWriterGroupTransportDataType {
	/**
	 * The cached value of the '{@link #getBrokerWriterGroupTransportDataType() <em>Broker Writer Group Transport Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokerWriterGroupTransportDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<BrokerWriterGroupTransportDataType> brokerWriterGroupTransportDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfBrokerWriterGroupTransportDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfBrokerWriterGroupTransportDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BrokerWriterGroupTransportDataType> getBrokerWriterGroupTransportDataType() {
		if (brokerWriterGroupTransportDataType == null) {
			brokerWriterGroupTransportDataType = new EObjectContainmentEList<BrokerWriterGroupTransportDataType>(BrokerWriterGroupTransportDataType.class, this, TypesPackage.LIST_OF_BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE);
		}
		return brokerWriterGroupTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return ((InternalEList<?>)getBrokerWriterGroupTransportDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return getBrokerWriterGroupTransportDataType();
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
			case TypesPackage.LIST_OF_BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				getBrokerWriterGroupTransportDataType().clear();
				getBrokerWriterGroupTransportDataType().addAll((Collection<? extends BrokerWriterGroupTransportDataType>)newValue);
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
			case TypesPackage.LIST_OF_BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				getBrokerWriterGroupTransportDataType().clear();
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
			case TypesPackage.LIST_OF_BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE__BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE:
				return brokerWriterGroupTransportDataType != null && !brokerWriterGroupTransportDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfBrokerWriterGroupTransportDataTypeImpl
