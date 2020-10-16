/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscribed Data Set Mirror Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscribedDataSetMirrorDataType#getParentNodeName <em>Parent Node Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscribedDataSetMirrorDataType#getRolePermissions <em>Role Permissions</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscribedDataSetMirrorDataType()
 * @model extendedMetaData="name='SubscribedDataSetMirrorDataType' kind='elementOnly'"
 * @generated
 */
public interface SubscribedDataSetMirrorDataType extends SubscribedDataSetDataType {
	/**
	 * Returns the value of the '<em><b>Parent Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Node Name</em>' attribute.
	 * @see #isSetParentNodeName()
	 * @see #unsetParentNodeName()
	 * @see #setParentNodeName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscribedDataSetMirrorDataType_ParentNodeName()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ParentNodeName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getParentNodeName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscribedDataSetMirrorDataType#getParentNodeName <em>Parent Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Node Name</em>' attribute.
	 * @see #isSetParentNodeName()
	 * @see #unsetParentNodeName()
	 * @see #getParentNodeName()
	 * @generated
	 */
	void setParentNodeName(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscribedDataSetMirrorDataType#getParentNodeName <em>Parent Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParentNodeName()
	 * @see #getParentNodeName()
	 * @see #setParentNodeName(String)
	 * @generated
	 */
	void unsetParentNodeName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscribedDataSetMirrorDataType#getParentNodeName <em>Parent Node Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parent Node Name</em>' attribute is set.
	 * @see #unsetParentNodeName()
	 * @see #getParentNodeName()
	 * @see #setParentNodeName(String)
	 * @generated
	 */
	boolean isSetParentNodeName();

	/**
	 * Returns the value of the '<em><b>Role Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Permissions</em>' containment reference.
	 * @see #isSetRolePermissions()
	 * @see #unsetRolePermissions()
	 * @see #setRolePermissions(ListOfRolePermissionType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscribedDataSetMirrorDataType_RolePermissions()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RolePermissions' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfRolePermissionType getRolePermissions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscribedDataSetMirrorDataType#getRolePermissions <em>Role Permissions</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscribedDataSetMirrorDataType#getRolePermissions <em>Role Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRolePermissions()
	 * @see #getRolePermissions()
	 * @see #setRolePermissions(ListOfRolePermissionType)
	 * @generated
	 */
	void unsetRolePermissions();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscribedDataSetMirrorDataType#getRolePermissions <em>Role Permissions</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Role Permissions</em>' containment reference is set.
	 * @see #unsetRolePermissions()
	 * @see #getRolePermissions()
	 * @see #setRolePermissions(ListOfRolePermissionType)
	 * @generated
	 */
	boolean isSetRolePermissions();

} // SubscribedDataSetMirrorDataType
