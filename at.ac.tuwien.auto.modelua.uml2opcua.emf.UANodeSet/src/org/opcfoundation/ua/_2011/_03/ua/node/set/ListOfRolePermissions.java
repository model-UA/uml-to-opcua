/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Role Permissions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.ListOfRolePermissions#getRolePermission <em>Role Permission</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getListOfRolePermissions()
 * @model extendedMetaData="name='ListOfRolePermissions' kind='elementOnly'"
 * @generated
 */
public interface ListOfRolePermissions extends EObject {
	/**
	 * Returns the value of the '<em><b>Role Permission</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2011._03.ua.node.set.RolePermission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Permission</em>' containment reference list.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getListOfRolePermissions_RolePermission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RolePermission' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RolePermission> getRolePermission();

} // ListOfRolePermissions
