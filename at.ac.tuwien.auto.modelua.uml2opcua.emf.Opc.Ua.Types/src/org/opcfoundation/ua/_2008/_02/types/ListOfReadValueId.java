/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Read Value Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfReadValueId#getReadValueId <em>Read Value Id</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfReadValueId()
 * @model extendedMetaData="name='ListOfReadValueId' kind='elementOnly'"
 * @generated
 */
public interface ListOfReadValueId extends EObject {
	/**
	 * Returns the value of the '<em><b>Read Value Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ReadValueId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Value Id</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfReadValueId_ReadValueId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReadValueId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReadValueId> getReadValueId();

} // ListOfReadValueId
