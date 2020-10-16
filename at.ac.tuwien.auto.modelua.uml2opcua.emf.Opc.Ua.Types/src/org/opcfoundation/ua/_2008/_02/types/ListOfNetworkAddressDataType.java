/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Network Address Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfNetworkAddressDataType#getNetworkAddressDataType <em>Network Address Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfNetworkAddressDataType()
 * @model extendedMetaData="name='ListOfNetworkAddressDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfNetworkAddressDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Network Address Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.NetworkAddressDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Address Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfNetworkAddressDataType_NetworkAddressDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NetworkAddressDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NetworkAddressDataType> getNetworkAddressDataType();

} // ListOfNetworkAddressDataType
