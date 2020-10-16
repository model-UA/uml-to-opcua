/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Broker Connection Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfBrokerConnectionTransportDataType#getBrokerConnectionTransportDataType <em>Broker Connection Transport Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrokerConnectionTransportDataType()
 * @model extendedMetaData="name='ListOfBrokerConnectionTransportDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfBrokerConnectionTransportDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Broker Connection Transport Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.BrokerConnectionTransportDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker Connection Transport Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrokerConnectionTransportDataType_BrokerConnectionTransportDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BrokerConnectionTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BrokerConnectionTransportDataType> getBrokerConnectionTransportDataType();

} // ListOfBrokerConnectionTransportDataType
