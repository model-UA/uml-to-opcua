/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Node#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Node#getNodeClass <em>Node Class</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Node#getBrowseName <em>Browse Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Node#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Node#getDescription <em>Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Node#getWriteMask <em>Write Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Node#getUserWriteMask <em>User Write Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Node#getRolePermissions <em>Role Permissions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Node#getUserRolePermissions <em>User Role Permissions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Node#getAccessRestrictions <em>Access Restrictions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Node#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNode()
 * @model extendedMetaData="name='Node' kind='elementOnly'"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' containment reference.
	 * @see #isSetNodeId()
	 * @see #unsetNodeId()
	 * @see #setNodeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNode_NodeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getNodeId <em>Node Id</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getNodeId <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeId()
	 * @see #getNodeId()
	 * @see #setNodeId(NodeId)
	 * @generated
	 */
	void unsetNodeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getNodeId <em>Node Id</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Node Class</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.NodeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Class</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.NodeClass
	 * @see #isSetNodeClass()
	 * @see #unsetNodeClass()
	 * @see #setNodeClass(NodeClass)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNode_NodeClass()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NodeClass' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeClass getNodeClass();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getNodeClass <em>Node Class</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getNodeClass <em>Node Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeClass()
	 * @see #getNodeClass()
	 * @see #setNodeClass(NodeClass)
	 * @generated
	 */
	void unsetNodeClass();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getNodeClass <em>Node Class</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Browse Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Name</em>' containment reference.
	 * @see #isSetBrowseName()
	 * @see #unsetBrowseName()
	 * @see #setBrowseName(QualifiedName)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNode_BrowseName()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='BrowseName' namespace='##targetNamespace'"
	 * @generated
	 */
	QualifiedName getBrowseName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getBrowseName <em>Browse Name</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getBrowseName <em>Browse Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBrowseName()
	 * @see #getBrowseName()
	 * @see #setBrowseName(QualifiedName)
	 * @generated
	 */
	void unsetBrowseName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getBrowseName <em>Browse Name</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference.
	 * @see #isSetDisplayName()
	 * @see #unsetDisplayName()
	 * @see #setDisplayName(LocalizedText)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNode_DisplayName()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DisplayName' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedText getDisplayName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' containment reference.
	 * @see #isSetDisplayName()
	 * @see #unsetDisplayName()
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(LocalizedText value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayName()
	 * @see #getDisplayName()
	 * @see #setDisplayName(LocalizedText)
	 * @generated
	 */
	void unsetDisplayName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getDisplayName <em>Display Name</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Name</em>' containment reference is set.
	 * @see #unsetDisplayName()
	 * @see #getDisplayName()
	 * @see #setDisplayName(LocalizedText)
	 * @generated
	 */
	boolean isSetDisplayName();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(LocalizedText)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNode_Description()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedText getDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(LocalizedText value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(LocalizedText)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getDescription <em>Description</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' containment reference is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(LocalizedText)
	 * @generated
	 */
	boolean isSetDescription();

	/**
	 * Returns the value of the '<em><b>Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Mask</em>' attribute.
	 * @see #isSetWriteMask()
	 * @see #unsetWriteMask()
	 * @see #setWriteMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNode_WriteMask()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='WriteMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getWriteMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getWriteMask <em>Write Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Mask</em>' attribute.
	 * @see #isSetWriteMask()
	 * @see #unsetWriteMask()
	 * @see #getWriteMask()
	 * @generated
	 */
	void setWriteMask(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getWriteMask <em>Write Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWriteMask()
	 * @see #getWriteMask()
	 * @see #setWriteMask(long)
	 * @generated
	 */
	void unsetWriteMask();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getWriteMask <em>Write Mask</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write Mask</em>' attribute is set.
	 * @see #unsetWriteMask()
	 * @see #getWriteMask()
	 * @see #setWriteMask(long)
	 * @generated
	 */
	boolean isSetWriteMask();

	/**
	 * Returns the value of the '<em><b>User Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Write Mask</em>' attribute.
	 * @see #isSetUserWriteMask()
	 * @see #unsetUserWriteMask()
	 * @see #setUserWriteMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNode_UserWriteMask()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='UserWriteMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getUserWriteMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getUserWriteMask <em>User Write Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Write Mask</em>' attribute.
	 * @see #isSetUserWriteMask()
	 * @see #unsetUserWriteMask()
	 * @see #getUserWriteMask()
	 * @generated
	 */
	void setUserWriteMask(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getUserWriteMask <em>User Write Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserWriteMask()
	 * @see #getUserWriteMask()
	 * @see #setUserWriteMask(long)
	 * @generated
	 */
	void unsetUserWriteMask();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getUserWriteMask <em>User Write Mask</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Write Mask</em>' attribute is set.
	 * @see #unsetUserWriteMask()
	 * @see #getUserWriteMask()
	 * @see #setUserWriteMask(long)
	 * @generated
	 */
	boolean isSetUserWriteMask();

	/**
	 * Returns the value of the '<em><b>Role Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Permissions</em>' containment reference.
	 * @see #isSetRolePermissions()
	 * @see #unsetRolePermissions()
	 * @see #setRolePermissions(ListOfRolePermissionType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNode_RolePermissions()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RolePermissions' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfRolePermissionType getRolePermissions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getRolePermissions <em>Role Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Permissions</em>' containment reference.
	 * @see #isSetRolePermissions()
	 * @see #unsetRolePermissions()
	 * @see #getRolePermissions()
	 * @generated
	 */
	void setRolePermissions(ListOfRolePermissionType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getRolePermissions <em>Role Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRolePermissions()
	 * @see #getRolePermissions()
	 * @see #setRolePermissions(ListOfRolePermissionType)
	 * @generated
	 */
	void unsetRolePermissions();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getRolePermissions <em>Role Permissions</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Role Permissions</em>' containment reference is set.
	 * @see #unsetRolePermissions()
	 * @see #getRolePermissions()
	 * @see #setRolePermissions(ListOfRolePermissionType)
	 * @generated
	 */
	boolean isSetRolePermissions();

	/**
	 * Returns the value of the '<em><b>User Role Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Role Permissions</em>' containment reference.
	 * @see #isSetUserRolePermissions()
	 * @see #unsetUserRolePermissions()
	 * @see #setUserRolePermissions(ListOfRolePermissionType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNode_UserRolePermissions()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='UserRolePermissions' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfRolePermissionType getUserRolePermissions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getUserRolePermissions <em>User Role Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Role Permissions</em>' containment reference.
	 * @see #isSetUserRolePermissions()
	 * @see #unsetUserRolePermissions()
	 * @see #getUserRolePermissions()
	 * @generated
	 */
	void setUserRolePermissions(ListOfRolePermissionType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getUserRolePermissions <em>User Role Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserRolePermissions()
	 * @see #getUserRolePermissions()
	 * @see #setUserRolePermissions(ListOfRolePermissionType)
	 * @generated
	 */
	void unsetUserRolePermissions();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getUserRolePermissions <em>User Role Permissions</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Role Permissions</em>' containment reference is set.
	 * @see #unsetUserRolePermissions()
	 * @see #getUserRolePermissions()
	 * @see #setUserRolePermissions(ListOfRolePermissionType)
	 * @generated
	 */
	boolean isSetUserRolePermissions();

	/**
	 * Returns the value of the '<em><b>Access Restrictions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Restrictions</em>' attribute.
	 * @see #isSetAccessRestrictions()
	 * @see #unsetAccessRestrictions()
	 * @see #setAccessRestrictions(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNode_AccessRestrictions()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='element' name='AccessRestrictions' namespace='##targetNamespace'"
	 * @generated
	 */
	int getAccessRestrictions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getAccessRestrictions <em>Access Restrictions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Restrictions</em>' attribute.
	 * @see #isSetAccessRestrictions()
	 * @see #unsetAccessRestrictions()
	 * @see #getAccessRestrictions()
	 * @generated
	 */
	void setAccessRestrictions(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getAccessRestrictions <em>Access Restrictions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccessRestrictions()
	 * @see #getAccessRestrictions()
	 * @see #setAccessRestrictions(int)
	 * @generated
	 */
	void unsetAccessRestrictions();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getAccessRestrictions <em>Access Restrictions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Access Restrictions</em>' attribute is set.
	 * @see #unsetAccessRestrictions()
	 * @see #getAccessRestrictions()
	 * @see #setAccessRestrictions(int)
	 * @generated
	 */
	boolean isSetAccessRestrictions();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference.
	 * @see #isSetReferences()
	 * @see #unsetReferences()
	 * @see #setReferences(ListOfReferenceNode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNode_References()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='References' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfReferenceNode getReferences();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getReferences <em>References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' containment reference.
	 * @see #isSetReferences()
	 * @see #unsetReferences()
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(ListOfReferenceNode value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getReferences <em>References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferences()
	 * @see #getReferences()
	 * @see #setReferences(ListOfReferenceNode)
	 * @generated
	 */
	void unsetReferences();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Node#getReferences <em>References</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>References</em>' containment reference is set.
	 * @see #unsetReferences()
	 * @see #getReferences()
	 * @see #setReferences(ListOfReferenceNode)
	 * @generated
	 */
	boolean isSetReferences();

} // Node
