/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.RolePermission#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.RolePermission#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getRolePermission()
 * @model extendedMetaData="name='RolePermission' kind='simple'"
 * @generated
 */
public interface RolePermission extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getRolePermission_Value()
	 * @model dataType="org.opcfoundation.ua._2011._03.ua.node.set.NodeId"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.RolePermission#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' attribute.
	 * @see #isSetPermissions()
	 * @see #unsetPermissions()
	 * @see #setPermissions(long)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getRolePermission_Permissions()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='Permissions'"
	 * @generated
	 */
	long getPermissions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.RolePermission#getPermissions <em>Permissions</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.RolePermission#getPermissions <em>Permissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPermissions()
	 * @see #getPermissions()
	 * @see #setPermissions(long)
	 * @generated
	 */
	void unsetPermissions();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.RolePermission#getPermissions <em>Permissions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Permissions</em>' attribute is set.
	 * @see #unsetPermissions()
	 * @see #getPermissions()
	 * @see #setPermissions(long)
	 * @generated
	 */
	boolean isSetPermissions();

} // RolePermission
