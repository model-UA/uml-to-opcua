/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Broker Writer Group Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfBrokerWriterGroupTransportDataType#getBrokerWriterGroupTransportDataType <em>Broker Writer Group Transport Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrokerWriterGroupTransportDataType()
 * @model extendedMetaData="name='ListOfBrokerWriterGroupTransportDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfBrokerWriterGroupTransportDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Broker Writer Group Transport Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker Writer Group Transport Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrokerWriterGroupTransportDataType_BrokerWriterGroupTransportDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BrokerWriterGroupTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BrokerWriterGroupTransportDataType> getBrokerWriterGroupTransportDataType();

} // ListOfBrokerWriterGroupTransportDataType
