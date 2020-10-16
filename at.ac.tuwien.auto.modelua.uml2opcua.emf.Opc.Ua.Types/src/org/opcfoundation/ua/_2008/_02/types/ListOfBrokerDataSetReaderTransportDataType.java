/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Broker Data Set Reader Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfBrokerDataSetReaderTransportDataType#getBrokerDataSetReaderTransportDataType <em>Broker Data Set Reader Transport Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrokerDataSetReaderTransportDataType()
 * @model extendedMetaData="name='ListOfBrokerDataSetReaderTransportDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfBrokerDataSetReaderTransportDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Broker Data Set Reader Transport Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.BrokerDataSetReaderTransportDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker Data Set Reader Transport Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrokerDataSetReaderTransportDataType_BrokerDataSetReaderTransportDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BrokerDataSetReaderTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BrokerDataSetReaderTransportDataType> getBrokerDataSetReaderTransportDataType();

} // ListOfBrokerDataSetReaderTransportDataType
