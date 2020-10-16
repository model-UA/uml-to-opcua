/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.opcfoundation.ua._2008._02.types.BrokerTransportQualityOfService;
import org.opcfoundation.ua._2008._02.types.ListOfBrokerTransportQualityOfService;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Broker Transport Quality Of Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfBrokerTransportQualityOfServiceImpl#getBrokerTransportQualityOfService <em>Broker Transport Quality Of Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfBrokerTransportQualityOfServiceImpl extends MinimalEObjectImpl.Container implements ListOfBrokerTransportQualityOfService {
	/**
	 * The cached value of the '{@link #getBrokerTransportQualityOfService() <em>Broker Transport Quality Of Service</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokerTransportQualityOfService()
	 * @generated
	 * @ordered
	 */
	protected EList<BrokerTransportQualityOfService> brokerTransportQualityOfService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfBrokerTransportQualityOfServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfBrokerTransportQualityOfService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BrokerTransportQualityOfService> getBrokerTransportQualityOfService() {
		if (brokerTransportQualityOfService == null) {
			brokerTransportQualityOfService = new EDataTypeEList<BrokerTransportQualityOfService>(BrokerTransportQualityOfService.class, this, TypesPackage.LIST_OF_BROKER_TRANSPORT_QUALITY_OF_SERVICE__BROKER_TRANSPORT_QUALITY_OF_SERVICE);
		}
		return brokerTransportQualityOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.LIST_OF_BROKER_TRANSPORT_QUALITY_OF_SERVICE__BROKER_TRANSPORT_QUALITY_OF_SERVICE:
				return getBrokerTransportQualityOfService();
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
			case TypesPackage.LIST_OF_BROKER_TRANSPORT_QUALITY_OF_SERVICE__BROKER_TRANSPORT_QUALITY_OF_SERVICE:
				getBrokerTransportQualityOfService().clear();
				getBrokerTransportQualityOfService().addAll((Collection<? extends BrokerTransportQualityOfService>)newValue);
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
			case TypesPackage.LIST_OF_BROKER_TRANSPORT_QUALITY_OF_SERVICE__BROKER_TRANSPORT_QUALITY_OF_SERVICE:
				getBrokerTransportQualityOfService().clear();
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
			case TypesPackage.LIST_OF_BROKER_TRANSPORT_QUALITY_OF_SERVICE__BROKER_TRANSPORT_QUALITY_OF_SERVICE:
				return brokerTransportQualityOfService != null && !brokerTransportQualityOfService.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (brokerTransportQualityOfService: ");
		result.append(brokerTransportQualityOfService);
		result.append(')');
		return result.toString();
	}

} //ListOfBrokerTransportQualityOfServiceImpl
