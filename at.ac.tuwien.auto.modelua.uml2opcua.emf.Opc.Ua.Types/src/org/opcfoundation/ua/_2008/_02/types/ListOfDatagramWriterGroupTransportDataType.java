/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Datagram Writer Group Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfDatagramWriterGroupTransportDataType#getDatagramWriterGroupTransportDataType <em>Datagram Writer Group Transport Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDatagramWriterGroupTransportDataType()
 * @model extendedMetaData="name='ListOfDatagramWriterGroupTransportDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfDatagramWriterGroupTransportDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Datagram Writer Group Transport Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.DatagramWriterGroupTransportDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datagram Writer Group Transport Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDatagramWriterGroupTransportDataType_DatagramWriterGroupTransportDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DatagramWriterGroupTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatagramWriterGroupTransportDataType> getDatagramWriterGroupTransportDataType();

} // ListOfDatagramWriterGroupTransportDataType
