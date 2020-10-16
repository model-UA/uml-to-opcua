/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Json Network Message Content Mask</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfJsonNetworkMessageContentMask#getJsonNetworkMessageContentMask <em>Json Network Message Content Mask</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfJsonNetworkMessageContentMask()
 * @model extendedMetaData="name='ListOfJsonNetworkMessageContentMask' kind='elementOnly'"
 * @generated
 */
public interface ListOfJsonNetworkMessageContentMask extends EObject {
	/**
	 * Returns the value of the '<em><b>Json Network Message Content Mask</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Network Message Content Mask</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfJsonNetworkMessageContentMask_JsonNetworkMessageContentMask()
	 * @model unique="false" dataType="org.opcfoundation.ua._2008._02.types.JsonNetworkMessageContentMask"
	 *        extendedMetaData="kind='element' name='JsonNetworkMessageContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Long> getJsonNetworkMessageContentMask();

} // ListOfJsonNetworkMessageContentMask
