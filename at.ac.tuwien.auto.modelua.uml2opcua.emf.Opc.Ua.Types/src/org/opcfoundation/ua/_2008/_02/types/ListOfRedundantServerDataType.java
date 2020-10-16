/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Redundant Server Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfRedundantServerDataType#getRedundantServerDataType <em>Redundant Server Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfRedundantServerDataType()
 * @model extendedMetaData="name='ListOfRedundantServerDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfRedundantServerDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Redundant Server Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.RedundantServerDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redundant Server Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfRedundantServerDataType_RedundantServerDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RedundantServerDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RedundantServerDataType> getRedundantServerDataType();

} // ListOfRedundantServerDataType
