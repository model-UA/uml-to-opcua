/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Identity Criteria Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfIdentityCriteriaType#getIdentityCriteriaType <em>Identity Criteria Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfIdentityCriteriaType()
 * @model extendedMetaData="name='ListOfIdentityCriteriaType' kind='elementOnly'"
 * @generated
 */
public interface ListOfIdentityCriteriaType extends EObject {
	/**
	 * Returns the value of the '<em><b>Identity Criteria Type</b></em>' attribute list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.IdentityCriteriaType}.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.IdentityCriteriaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity Criteria Type</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.IdentityCriteriaType
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfIdentityCriteriaType_IdentityCriteriaType()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='IdentityCriteriaType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentityCriteriaType> getIdentityCriteriaType();

} // ListOfIdentityCriteriaType
