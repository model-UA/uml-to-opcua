/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Node Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfNodeId#getNodeId <em>Node Id</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfNodeId()
 * @model extendedMetaData="name='ListOfNodeId' kind='elementOnly'"
 * @generated
 */
public interface ListOfNodeId extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.NodeId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfNodeId_NodeId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NodeId> getNodeId();

} // ListOfNodeId
