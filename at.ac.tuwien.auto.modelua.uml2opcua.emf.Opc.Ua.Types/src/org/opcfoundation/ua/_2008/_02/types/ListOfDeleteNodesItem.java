/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Delete Nodes Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfDeleteNodesItem#getDeleteNodesItem <em>Delete Nodes Item</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDeleteNodesItem()
 * @model extendedMetaData="name='ListOfDeleteNodesItem' kind='elementOnly'"
 * @generated
 */
public interface ListOfDeleteNodesItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Delete Nodes Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.DeleteNodesItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Nodes Item</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDeleteNodesItem_DeleteNodesItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeleteNodesItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeleteNodesItem> getDeleteNodesItem();

} // ListOfDeleteNodesItem
