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

import org.opcfoundation.ua._2008._02.types.BrokerConnectionTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfBrokerConnectionTransportDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Broker Connection Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfBrokerConnectionTransportDataTypeImpl#getBrokerConnectionTransportDataType <em>Broker Connection Transport Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfBrokerConnectionTransportDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfBrokerConnectionTransportDataType {
	/**
	 * The cached value of the '{@link #getBrokerConnectionTransportDataType() <em>Broker Connection Transport Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokerConnectionTransportDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<BrokerConnectionTransportDataType> brokerConnectionTransportDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfBrokerConnectionTransportDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfBrokerConnectionTransportDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BrokerConnectionTransportDataType> getBrokerConnectionTransportDataType() {
		if (brokerConnectionTransportDataType == null) {
			brokerConnectionTransportDataType = new EObjectContainmentEList<BrokerConnectionTransportDataType>(BrokerConnectionTransportDataType.class, this, TypesPackage.LIST_OF_BROKER_CONNECTION_TRANSPORT_DATA_TYPE__BROKER_CONNECTION_TRANSPORT_DATA_TYPE);
		}
		return brokerConnectionTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_BROKER_CONNECTION_TRANSPORT_DATA_TYPE__BROKER_CONNECTION_TRANSPORT_DATA_TYPE:
				return ((InternalEList<?>)getBrokerConnectionTransportDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_BROKER_CONNECTION_TRANSPORT_DATA_TYPE__BROKER_CONNECTION_TRANSPORT_DATA_TYPE:
				return getBrokerConnectionTransportDataType();
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
			case TypesPackage.LIST_OF_BROKER_CONNECTION_TRANSPORT_DATA_TYPE__BROKER_CONNECTION_TRANSPORT_DATA_TYPE:
				getBrokerConnectionTransportDataType().clear();
				getBrokerConnectionTransportDataType().addAll((Collection<? extends BrokerConnectionTransportDataType>)newValue);
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
			case TypesPackage.LIST_OF_BROKER_CONNECTION_TRANSPORT_DATA_TYPE__BROKER_CONNECTION_TRANSPORT_DATA_TYPE:
				getBrokerConnectionTransportDataType().clear();
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
			case TypesPackage.LIST_OF_BROKER_CONNECTION_TRANSPORT_DATA_TYPE__BROKER_CONNECTION_TRANSPORT_DATA_TYPE:
				return brokerConnectionTransportDataType != null && !brokerConnectionTransportDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfBrokerConnectionTransportDataTypeImpl
