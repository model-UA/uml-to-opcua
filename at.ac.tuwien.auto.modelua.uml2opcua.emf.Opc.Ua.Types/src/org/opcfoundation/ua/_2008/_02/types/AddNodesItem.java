/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Nodes Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getParentNodeId <em>Parent Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getReferenceTypeId <em>Reference Type Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getRequestedNewNodeId <em>Requested New Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getBrowseName <em>Browse Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getNodeClass <em>Node Class</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getNodeAttributes <em>Node Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddNodesItem()
 * @model extendedMetaData="name='AddNodesItem' kind='elementOnly'"
 * @generated
 */
public interface AddNodesItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Node Id</em>' containment reference.
	 * @see #isSetParentNodeId()
	 * @see #unsetParentNodeId()
	 * @see #setParentNodeId(ExpandedNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddNodesItem_ParentNodeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ParentNodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpandedNodeId getParentNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getParentNodeId <em>Parent Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Node Id</em>' containment reference.
	 * @see #isSetParentNodeId()
	 * @see #unsetParentNodeId()
	 * @see #getParentNodeId()
	 * @generated
	 */
	void setParentNodeId(ExpandedNodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getParentNodeId <em>Parent Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParentNodeId()
	 * @see #getParentNodeId()
	 * @see #setParentNodeId(ExpandedNodeId)
	 * @generated
	 */
	void unsetParentNodeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getParentNodeId <em>Parent Node Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parent Node Id</em>' containment reference is set.
	 * @see #unsetParentNodeId()
	 * @see #getParentNodeId()
	 * @see #setParentNodeId(ExpandedNodeId)
	 * @generated
	 */
	boolean isSetParentNodeId();

	/**
	 * Returns the value of the '<em><b>Reference Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type Id</em>' containment reference.
	 * @see #isSetReferenceTypeId()
	 * @see #unsetReferenceTypeId()
	 * @see #setReferenceTypeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddNodesItem_ReferenceTypeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ReferenceTypeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getReferenceTypeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getReferenceTypeId <em>Reference Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Type Id</em>' containment reference.
	 * @see #isSetReferenceTypeId()
	 * @see #unsetReferenceTypeId()
	 * @see #getReferenceTypeId()
	 * @generated
	 */
	void setReferenceTypeId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getReferenceTypeId <em>Reference Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceTypeId()
	 * @see #getReferenceTypeId()
	 * @see #setReferenceTypeId(NodeId)
	 * @generated
	 */
	void unsetReferenceTypeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getReferenceTypeId <em>Reference Type Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference Type Id</em>' containment reference is set.
	 * @see #unsetReferenceTypeId()
	 * @see #getReferenceTypeId()
	 * @see #setReferenceTypeId(NodeId)
	 * @generated
	 */
	boolean isSetReferenceTypeId();

	/**
	 * Returns the value of the '<em><b>Requested New Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested New Node Id</em>' containment reference.
	 * @see #isSetRequestedNewNodeId()
	 * @see #unsetRequestedNewNodeId()
	 * @see #setRequestedNewNodeId(ExpandedNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddNodesItem_RequestedNewNodeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestedNewNodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpandedNodeId getRequestedNewNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getRequestedNewNodeId <em>Requested New Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested New Node Id</em>' containment reference.
	 * @see #isSetRequestedNewNodeId()
	 * @see #unsetRequestedNewNodeId()
	 * @see #getRequestedNewNodeId()
	 * @generated
	 */
	void setRequestedNewNodeId(ExpandedNodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getRequestedNewNodeId <em>Requested New Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestedNewNodeId()
	 * @see #getRequestedNewNodeId()
	 * @see #setRequestedNewNodeId(ExpandedNodeId)
	 * @generated
	 */
	void unsetRequestedNewNodeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getRequestedNewNodeId <em>Requested New Node Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Requested New Node Id</em>' containment reference is set.
	 * @see #unsetRequestedNewNodeId()
	 * @see #getRequestedNewNodeId()
	 * @see #setRequestedNewNodeId(ExpandedNodeId)
	 * @generated
	 */
	boolean isSetRequestedNewNodeId();

	/**
	 * Returns the value of the '<em><b>Browse Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Name</em>' containment reference.
	 * @see #isSetBrowseName()
	 * @see #unsetBrowseName()
	 * @see #setBrowseName(QualifiedName)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddNodesItem_BrowseName()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='BrowseName' namespace='##targetNamespace'"
	 * @generated
	 */
	QualifiedName getBrowseName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getBrowseName <em>Browse Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Name</em>' containment reference.
	 * @see #isSetBrowseName()
	 * @see #unsetBrowseName()
	 * @see #getBrowseName()
	 * @generated
	 */
	void setBrowseName(QualifiedName value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getBrowseName <em>Browse Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBrowseName()
	 * @see #getBrowseName()
	 * @see #setBrowseName(QualifiedName)
	 * @generated
	 */
	void unsetBrowseName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getBrowseName <em>Browse Name</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Browse Name</em>' containment reference is set.
	 * @see #unsetBrowseName()
	 * @see #getBrowseName()
	 * @see #setBrowseName(QualifiedName)
	 * @generated
	 */
	boolean isSetBrowseName();

	/**
	 * Returns the value of the '<em><b>Node Class</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.NodeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Class</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.NodeClass
	 * @see #isSetNodeClass()
	 * @see #unsetNodeClass()
	 * @see #setNodeClass(NodeClass)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddNodesItem_NodeClass()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NodeClass' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeClass getNodeClass();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getNodeClass <em>Node Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Class</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.NodeClass
	 * @see #isSetNodeClass()
	 * @see #unsetNodeClass()
	 * @see #getNodeClass()
	 * @generated
	 */
	void setNodeClass(NodeClass value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getNodeClass <em>Node Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeClass()
	 * @see #getNodeClass()
	 * @see #setNodeClass(NodeClass)
	 * @generated
	 */
	void unsetNodeClass();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getNodeClass <em>Node Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Node Class</em>' attribute is set.
	 * @see #unsetNodeClass()
	 * @see #getNodeClass()
	 * @see #setNodeClass(NodeClass)
	 * @generated
	 */
	boolean isSetNodeClass();

	/**
	 * Returns the value of the '<em><b>Node Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Attributes</em>' containment reference.
	 * @see #isSetNodeAttributes()
	 * @see #unsetNodeAttributes()
	 * @see #setNodeAttributes(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddNodesItem_NodeAttributes()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodeAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getNodeAttributes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getNodeAttributes <em>Node Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Attributes</em>' containment reference.
	 * @see #isSetNodeAttributes()
	 * @see #unsetNodeAttributes()
	 * @see #getNodeAttributes()
	 * @generated
	 */
	void setNodeAttributes(ExtensionObject value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getNodeAttributes <em>Node Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeAttributes()
	 * @see #getNodeAttributes()
	 * @see #setNodeAttributes(ExtensionObject)
	 * @generated
	 */
	void unsetNodeAttributes();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getNodeAttributes <em>Node Attributes</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Node Attributes</em>' containment reference is set.
	 * @see #unsetNodeAttributes()
	 * @see #getNodeAttributes()
	 * @see #setNodeAttributes(ExtensionObject)
	 * @generated
	 */
	boolean isSetNodeAttributes();

	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition</em>' containment reference.
	 * @see #isSetTypeDefinition()
	 * @see #unsetTypeDefinition()
	 * @see #setTypeDefinition(ExpandedNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddNodesItem_TypeDefinition()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpandedNodeId getTypeDefinition();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getTypeDefinition <em>Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition</em>' containment reference.
	 * @see #isSetTypeDefinition()
	 * @see #unsetTypeDefinition()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	void setTypeDefinition(ExpandedNodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getTypeDefinition <em>Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeDefinition()
	 * @see #getTypeDefinition()
	 * @see #setTypeDefinition(ExpandedNodeId)
	 * @generated
	 */
	void unsetTypeDefinition();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesItem#getTypeDefinition <em>Type Definition</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Definition</em>' containment reference is set.
	 * @see #unsetTypeDefinition()
	 * @see #getTypeDefinition()
	 * @see #setTypeDefinition(ExpandedNodeId)
	 * @generated
	 */
	boolean isSetTypeDefinition();

} // AddNodesItem
