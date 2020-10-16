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

import org.opcfoundation.ua._2008._02.types.ListOfUserTokenPolicy;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UserTokenPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of User Token Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfUserTokenPolicyImpl#getUserTokenPolicy <em>User Token Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfUserTokenPolicyImpl extends MinimalEObjectImpl.Container implements ListOfUserTokenPolicy {
	/**
	 * The cached value of the '{@link #getUserTokenPolicy() <em>User Token Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTokenPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<UserTokenPolicy> userTokenPolicy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfUserTokenPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfUserTokenPolicy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserTokenPolicy> getUserTokenPolicy() {
		if (userTokenPolicy == null) {
			userTokenPolicy = new EObjectContainmentEList<UserTokenPolicy>(UserTokenPolicy.class, this, TypesPackage.LIST_OF_USER_TOKEN_POLICY__USER_TOKEN_POLICY);
		}
		return userTokenPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_USER_TOKEN_POLICY__USER_TOKEN_POLICY:
				return ((InternalEList<?>)getUserTokenPolicy()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_USER_TOKEN_POLICY__USER_TOKEN_POLICY:
				return getUserTokenPolicy();
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
			case TypesPackage.LIST_OF_USER_TOKEN_POLICY__USER_TOKEN_POLICY:
				getUserTokenPolicy().clear();
				getUserTokenPolicy().addAll((Collection<? extends UserTokenPolicy>)newValue);
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
			case TypesPackage.LIST_OF_USER_TOKEN_POLICY__USER_TOKEN_POLICY:
				getUserTokenPolicy().clear();
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
			case TypesPackage.LIST_OF_USER_TOKEN_POLICY__USER_TOKEN_POLICY:
				return userTokenPolicy != null && !userTokenPolicy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfUserTokenPolicyImpl
