/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opcfoundation.ua._2008._02.types.ListOfRolePermissionType;
import org.opcfoundation.ua._2008._02.types.RolePermissionType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Role Permission Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfRolePermissionTypeImpl#getRolePermissionType <em>Role Permission Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfRolePermissionTypeImpl extends MinimalEObjectImpl.Container implements ListOfRolePermissionType {
	/**
	 * The cached value of the '{@link #getRolePermissionType() <em>Role Permission Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolePermissionType()
	 * @generated
	 * @ordered
	 */
	protected EList<RolePermissionType> rolePermissionType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfRolePermissionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfRolePermissionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RolePermissionType> getRolePermissionType() {
		if (rolePermissionType == null) {
			rolePermissionType = new EObjectContainmentEList<RolePermissionType>(RolePermissionType.class, this, TypesPackage.LIST_OF_ROLE_PERMISSION_TYPE__ROLE_PERMISSION_TYPE);
		}
		return rolePermissionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_ROLE_PERMISSION_TYPE__ROLE_PERMISSION_TYPE:
				return ((InternalEList<?>)getRolePermissionType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_ROLE_PERMISSION_TYPE__ROLE_PERMISSION_TYPE:
				return getRolePermissionType();
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
			case TypesPackage.LIST_OF_ROLE_PERMISSION_TYPE__ROLE_PERMISSION_TYPE:
				getRolePermissionType().clear();
				getRolePermissionType().addAll((Collection<? extends RolePermissionType>)newValue);
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
			case TypesPackage.LIST_OF_ROLE_PERMISSION_TYPE__ROLE_PERMISSION_TYPE:
				getRolePermissionType().clear();
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
			case TypesPackage.LIST_OF_ROLE_PERMISSION_TYPE__ROLE_PERMISSION_TYPE:
				return rolePermissionType != null && !rolePermissionType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfRolePermissionTypeImpl
