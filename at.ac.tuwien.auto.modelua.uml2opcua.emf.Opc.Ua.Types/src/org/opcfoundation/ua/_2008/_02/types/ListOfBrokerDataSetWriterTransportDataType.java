/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Broker Data Set Writer Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfBrokerDataSetWriterTransportDataType#getBrokerDataSetWriterTransportDataType <em>Broker Data Set Writer Transport Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrokerDataSetWriterTransportDataType()
 * @model extendedMetaData="name='ListOfBrokerDataSetWriterTransportDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfBrokerDataSetWriterTransportDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Broker Data Set Writer Transport Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.BrokerDataSetWriterTransportDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker Data Set Writer Transport Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrokerDataSetWriterTransportDataType_BrokerDataSetWriterTransportDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BrokerDataSetWriterTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BrokerDataSetWriterTransportDataType> getBrokerDataSetWriterTransportDataType();

} // ListOfBrokerDataSetWriterTransportDataType
