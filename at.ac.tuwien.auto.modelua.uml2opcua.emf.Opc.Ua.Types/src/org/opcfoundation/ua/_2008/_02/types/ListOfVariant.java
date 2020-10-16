/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfVariant#getVariant <em>Variant</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfVariant()
 * @model extendedMetaData="name='ListOfVariant' kind='elementOnly'"
 * @generated
 */
public interface ListOfVariant extends EObject {
	/**
	 * Returns the value of the '<em><b>Variant</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfVariant_Variant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Variant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Variant> getVariant();

} // ListOfVariant
