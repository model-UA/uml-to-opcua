/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Add Nodes Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfAddNodesItem#getAddNodesItem <em>Add Nodes Item</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfAddNodesItem()
 * @model extendedMetaData="name='ListOfAddNodesItem' kind='elementOnly'"
 * @generated
 */
public interface ListOfAddNodesItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Add Nodes Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.AddNodesItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Nodes Item</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfAddNodesItem_AddNodesItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddNodesItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddNodesItem> getAddNodesItem();

} // ListOfAddNodesItem
