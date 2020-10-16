/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Datagram Connection Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfDatagramConnectionTransportDataType#getDatagramConnectionTransportDataType <em>Datagram Connection Transport Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDatagramConnectionTransportDataType()
 * @model extendedMetaData="name='ListOfDatagramConnectionTransportDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfDatagramConnectionTransportDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Datagram Connection Transport Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.DatagramConnectionTransportDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datagram Connection Transport Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDatagramConnectionTransportDataType_DatagramConnectionTransportDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DatagramConnectionTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatagramConnectionTransportDataType> getDatagramConnectionTransportDataType();

} // ListOfDatagramConnectionTransportDataType
