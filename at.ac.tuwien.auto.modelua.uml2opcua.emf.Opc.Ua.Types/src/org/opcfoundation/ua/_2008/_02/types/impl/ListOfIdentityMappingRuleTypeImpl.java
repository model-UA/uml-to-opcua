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

import org.opcfoundation.ua._2008._02.types.IdentityMappingRuleType;
import org.opcfoundation.ua._2008._02.types.ListOfIdentityMappingRuleType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Identity Mapping Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfIdentityMappingRuleTypeImpl#getIdentityMappingRuleType <em>Identity Mapping Rule Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfIdentityMappingRuleTypeImpl extends MinimalEObjectImpl.Container implements ListOfIdentityMappingRuleType {
	/**
	 * The cached value of the '{@link #getIdentityMappingRuleType() <em>Identity Mapping Rule Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityMappingRuleType()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentityMappingRuleType> identityMappingRuleType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfIdentityMappingRuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfIdentityMappingRuleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentityMappingRuleType> getIdentityMappingRuleType() {
		if (identityMappingRuleType == null) {
			identityMappingRuleType = new EObjectContainmentEList<IdentityMappingRuleType>(IdentityMappingRuleType.class, this, TypesPackage.LIST_OF_IDENTITY_MAPPING_RULE_TYPE__IDENTITY_MAPPING_RULE_TYPE);
		}
		return identityMappingRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_IDENTITY_MAPPING_RULE_TYPE__IDENTITY_MAPPING_RULE_TYPE:
				return ((InternalEList<?>)getIdentityMappingRuleType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_IDENTITY_MAPPING_RULE_TYPE__IDENTITY_MAPPING_RULE_TYPE:
				return getIdentityMappingRuleType();
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
			case TypesPackage.LIST_OF_IDENTITY_MAPPING_RULE_TYPE__IDENTITY_MAPPING_RULE_TYPE:
				getIdentityMappingRuleType().clear();
				getIdentityMappingRuleType().addAll((Collection<? extends IdentityMappingRuleType>)newValue);
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
			case TypesPackage.LIST_OF_IDENTITY_MAPPING_RULE_TYPE__IDENTITY_MAPPING_RULE_TYPE:
				getIdentityMappingRuleType().clear();
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
			case TypesPackage.LIST_OF_IDENTITY_MAPPING_RULE_TYPE__IDENTITY_MAPPING_RULE_TYPE:
				return identityMappingRuleType != null && !identityMappingRuleType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfIdentityMappingRuleTypeImpl
