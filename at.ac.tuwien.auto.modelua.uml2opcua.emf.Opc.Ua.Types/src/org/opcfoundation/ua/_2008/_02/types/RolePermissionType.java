/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Permission Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RolePermissionType#getRoleId <em>Role Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RolePermissionType#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRolePermissionType()
 * @model extendedMetaData="name='RolePermissionType' kind='elementOnly'"
 * @generated
 */
public interface RolePermissionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Role Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Id</em>' containment reference.
	 * @see #isSetRoleId()
	 * @see #unsetRoleId()
	 * @see #setRoleId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRolePermissionType_RoleId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RoleId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getRoleId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RolePermissionType#getRoleId <em>Role Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Id</em>' containment reference.
	 * @see #isSetRoleId()
	 * @see #unsetRoleId()
	 * @see #getRoleId()
	 * @generated
	 */
	void setRoleId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RolePermissionType#getRoleId <em>Role Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRoleId()
	 * @see #getRoleId()
	 * @see #setRoleId(NodeId)
	 * @generated
	 */
	void unsetRoleId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RolePermissionType#getRoleId <em>Role Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Role Id</em>' containment reference is set.
	 * @see #unsetRoleId()
	 * @see #getRoleId()
	 * @see #setRoleId(NodeId)
	 * @generated
	 */
	boolean isSetRoleId();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' attribute.
	 * @see #isSetPermissions()
	 * @see #unsetPermissions()
	 * @see #setPermissions(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRolePermissionType_Permissions()
	 * @model unsettable="true" dataType="org.opcfoundation.ua._2008._02.types.PermissionType"
	 *        extendedMetaData="kind='element' name='Permissions' namespace='##targetNamespace'"
	 * @generated
	 */
	long getPermissions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RolePermissionType#getPermissions <em>Permissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' attribute.
	 * @see #isSetPermissions()
	 * @see #unsetPermissions()
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RolePermissionType#getPermissions <em>Permissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPermissions()
	 * @see #getPermissions()
	 * @see #setPermissions(long)
	 * @generated
	 */
	void unsetPermissions();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RolePermissionType#getPermissions <em>Permissions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Permissions</em>' attribute is set.
	 * @see #unsetPermissions()
	 * @see #getPermissions()
	 * @see #setPermissions(long)
	 * @generated
	 */
	boolean isSetPermissions();

} // RolePermissionType
