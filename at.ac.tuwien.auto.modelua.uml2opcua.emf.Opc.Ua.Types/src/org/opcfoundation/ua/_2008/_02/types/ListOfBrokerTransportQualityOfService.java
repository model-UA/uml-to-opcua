/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Broker Transport Quality Of Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfBrokerTransportQualityOfService#getBrokerTransportQualityOfService <em>Broker Transport Quality Of Service</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrokerTransportQualityOfService()
 * @model extendedMetaData="name='ListOfBrokerTransportQualityOfService' kind='elementOnly'"
 * @generated
 */
public interface ListOfBrokerTransportQualityOfService extends EObject {
	/**
	 * Returns the value of the '<em><b>Broker Transport Quality Of Service</b></em>' attribute list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.BrokerTransportQualityOfService}.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.BrokerTransportQualityOfService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker Transport Quality Of Service</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.BrokerTransportQualityOfService
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrokerTransportQualityOfService_BrokerTransportQualityOfService()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='BrokerTransportQualityOfService' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BrokerTransportQualityOfService> getBrokerTransportQualityOfService();

} // ListOfBrokerTransportQualityOfService
