/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Network Address Url Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfNetworkAddressUrlDataType#getNetworkAddressUrlDataType <em>Network Address Url Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfNetworkAddressUrlDataType()
 * @model extendedMetaData="name='ListOfNetworkAddressUrlDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfNetworkAddressUrlDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Network Address Url Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.NetworkAddressUrlDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Address Url Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfNetworkAddressUrlDataType_NetworkAddressUrlDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NetworkAddressUrlDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NetworkAddressUrlDataType> getNetworkAddressUrlDataType();

} // ListOfNetworkAddressUrlDataType
