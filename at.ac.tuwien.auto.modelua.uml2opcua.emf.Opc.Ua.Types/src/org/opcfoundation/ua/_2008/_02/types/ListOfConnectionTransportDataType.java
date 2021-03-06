/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Connection Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfConnectionTransportDataType#getConnectionTransportDataType <em>Connection Transport Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfConnectionTransportDataType()
 * @model extendedMetaData="name='ListOfConnectionTransportDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfConnectionTransportDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection Transport Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ConnectionTransportDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Transport Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfConnectionTransportDataType_ConnectionTransportDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConnectionTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConnectionTransportDataType> getConnectionTransportDataType();

} // ListOfConnectionTransportDataType
