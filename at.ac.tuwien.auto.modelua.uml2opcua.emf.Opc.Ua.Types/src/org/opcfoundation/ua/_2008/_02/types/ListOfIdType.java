/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Id Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfIdType#getIdType <em>Id Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfIdType()
 * @model extendedMetaData="name='ListOfIdType' kind='elementOnly'"
 * @generated
 */
public interface ListOfIdType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Type</b></em>' attribute list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.IdType}.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.IdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Type</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.IdType
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfIdType_IdType()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='IdType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdType> getIdType();

} // ListOfIdType
