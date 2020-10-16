/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Set Status List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeSetStatusList#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getNodeSetStatusList()
 * @model extendedMetaData="name='NodeSetStatusList' kind='elementOnly'"
 * @generated
 */
public interface NodeSetStatusList extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2011._03.ua.node.set.NodeSetStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference list.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getNodeSetStatusList_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Status' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NodeSetStatus> getStatus();

} // NodeSetStatusList
