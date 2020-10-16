/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Role Permission Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfRolePermissionType#getRolePermissionType <em>Role Permission Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfRolePermissionType()
 * @model extendedMetaData="name='ListOfRolePermissionType' kind='elementOnly'"
 * @generated
 */
public interface ListOfRolePermissionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Role Permission Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.RolePermissionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Permission Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfRolePermissionType_RolePermissionType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RolePermissionType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RolePermissionType> getRolePermissionType();

} // ListOfRolePermissionType
