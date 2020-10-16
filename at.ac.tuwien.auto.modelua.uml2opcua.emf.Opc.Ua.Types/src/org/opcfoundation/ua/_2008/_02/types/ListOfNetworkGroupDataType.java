/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Network Group Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfNetworkGroupDataType#getNetworkGroupDataType <em>Network Group Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfNetworkGroupDataType()
 * @model extendedMetaData="name='ListOfNetworkGroupDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfNetworkGroupDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Network Group Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.NetworkGroupDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Group Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfNetworkGroupDataType_NetworkGroupDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NetworkGroupDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NetworkGroupDataType> getNetworkGroupDataType();

} // ListOfNetworkGroupDataType
