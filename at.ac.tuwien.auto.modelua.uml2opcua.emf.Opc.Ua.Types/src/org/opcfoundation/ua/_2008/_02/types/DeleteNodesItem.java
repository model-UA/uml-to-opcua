/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Nodes Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DeleteNodesItem#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DeleteNodesItem#isDeleteTargetReferences <em>Delete Target References</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteNodesItem()
 * @model extendedMetaData="name='DeleteNodesItem' kind='elementOnly'"
 * @generated
 */
public interface DeleteNodesItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' containment reference.
	 * @see #isSetNodeId()
	 * @see #unsetNodeId()
	 * @see #setNodeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteNodesItem_NodeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteNodesItem#getNodeId <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' containment reference.
	 * @see #isSetNodeId()
	 * @see #unsetNodeId()
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteNodesItem#getNodeId <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeId()
	 * @see #getNodeId()
	 * @see #setNodeId(NodeId)
	 * @generated
	 */
	void unsetNodeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteNodesItem#getNodeId <em>Node Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Node Id</em>' containment reference is set.
	 * @see #unsetNodeId()
	 * @see #getNodeId()
	 * @see #setNodeId(NodeId)
	 * @generated
	 */
	boolean isSetNodeId();

	/**
	 * Returns the value of the '<em><b>Delete Target References</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Target References</em>' attribute.
	 * @see #isSetDeleteTargetReferences()
	 * @see #unsetDeleteTargetReferences()
	 * @see #setDeleteTargetReferences(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteNodesItem_DeleteTargetReferences()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='DeleteTargetReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDeleteTargetReferences();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteNodesItem#isDeleteTargetReferences <em>Delete Target References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Target References</em>' attribute.
	 * @see #isSetDeleteTargetReferences()
	 * @see #unsetDeleteTargetReferences()
	 * @see #isDeleteTargetReferences()
	 * @generated
	 */
	void setDeleteTargetReferences(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteNodesItem#isDeleteTargetReferences <em>Delete Target References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeleteTargetReferences()
	 * @see #isDeleteTargetReferences()
	 * @see #setDeleteTargetReferences(boolean)
	 * @generated
	 */
	void unsetDeleteTargetReferences();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteNodesItem#isDeleteTargetReferences <em>Delete Target References</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delete Target References</em>' attribute is set.
	 * @see #unsetDeleteTargetReferences()
	 * @see #isDeleteTargetReferences()
	 * @see #setDeleteTargetReferences(boolean)
	 * @generated
	 */
	boolean isSetDeleteTargetReferences();

} // DeleteNodesItem
