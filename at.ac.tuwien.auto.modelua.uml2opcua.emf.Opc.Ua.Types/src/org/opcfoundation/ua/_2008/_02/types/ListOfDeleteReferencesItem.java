/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Delete References Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfDeleteReferencesItem#getDeleteReferencesItem <em>Delete References Item</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDeleteReferencesItem()
 * @model extendedMetaData="name='ListOfDeleteReferencesItem' kind='elementOnly'"
 * @generated
 */
public interface ListOfDeleteReferencesItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Delete References Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.DeleteReferencesItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete References Item</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDeleteReferencesItem_DeleteReferencesItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeleteReferencesItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeleteReferencesItem> getDeleteReferencesItem();

} // ListOfDeleteReferencesItem
