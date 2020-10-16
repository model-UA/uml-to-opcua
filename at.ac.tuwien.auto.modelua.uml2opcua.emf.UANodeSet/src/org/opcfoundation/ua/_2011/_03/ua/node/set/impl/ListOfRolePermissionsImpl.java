/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opcfoundation.ua._2011._03.ua.node.set.ListOfRolePermissions;
import org.opcfoundation.ua._2011._03.ua.node.set.RolePermission;
import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Role Permissions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.ListOfRolePermissionsImpl#getRolePermission <em>Role Permission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfRolePermissionsImpl extends MinimalEObjectImpl.Container implements ListOfRolePermissions {
	/**
	 * The cached value of the '{@link #getRolePermission() <em>Role Permission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolePermission()
	 * @generated
	 * @ordered
	 */
	protected EList<RolePermission> rolePermission;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfRolePermissionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.LIST_OF_ROLE_PERMISSIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RolePermission> getRolePermission() {
		if (rolePermission == null) {
			rolePermission = new EObjectContainmentEList<RolePermission>(RolePermission.class, this, SetPackage.LIST_OF_ROLE_PERMISSIONS__ROLE_PERMISSION);
		}
		return rolePermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.LIST_OF_ROLE_PERMISSIONS__ROLE_PERMISSION:
				return ((InternalEList<?>)getRolePermission()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SetPackage.LIST_OF_ROLE_PERMISSIONS__ROLE_PERMISSION:
				return getRolePermission();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SetPackage.LIST_OF_ROLE_PERMISSIONS__ROLE_PERMISSION:
				getRolePermission().clear();
				getRolePermission().addAll((Collection<? extends RolePermission>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SetPackage.LIST_OF_ROLE_PERMISSIONS__ROLE_PERMISSION:
				getRolePermission().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SetPackage.LIST_OF_ROLE_PERMISSIONS__ROLE_PERMISSION:
				return rolePermission != null && !rolePermission.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfRolePermissionsImpl
