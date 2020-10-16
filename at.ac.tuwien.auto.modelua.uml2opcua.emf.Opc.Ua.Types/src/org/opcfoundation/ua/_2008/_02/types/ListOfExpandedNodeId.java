/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Expanded Node Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfExpandedNodeId#getExpandedNodeId <em>Expanded Node Id</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfExpandedNodeId()
 * @model extendedMetaData="name='ListOfExpandedNodeId' kind='elementOnly'"
 * @generated
 */
public interface ListOfExpandedNodeId extends EObject {
	/**
	 * Returns the value of the '<em><b>Expanded Node Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ExpandedNodeId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expanded Node Id</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfExpandedNodeId_ExpandedNodeId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExpandedNodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExpandedNodeId> getExpandedNodeId();

} // ListOfExpandedNodeId
