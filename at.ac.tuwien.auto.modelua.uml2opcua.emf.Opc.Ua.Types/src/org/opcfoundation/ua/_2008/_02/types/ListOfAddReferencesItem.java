/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Add References Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfAddReferencesItem#getAddReferencesItem <em>Add References Item</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfAddReferencesItem()
 * @model extendedMetaData="name='ListOfAddReferencesItem' kind='elementOnly'"
 * @generated
 */
public interface ListOfAddReferencesItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Add References Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.AddReferencesItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add References Item</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfAddReferencesItem_AddReferencesItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddReferencesItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddReferencesItem> getAddReferencesItem();

} // ListOfAddReferencesItem
