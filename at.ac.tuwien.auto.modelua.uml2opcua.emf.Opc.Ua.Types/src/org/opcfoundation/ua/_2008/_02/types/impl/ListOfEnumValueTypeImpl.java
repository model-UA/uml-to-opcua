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

import org.opcfoundation.ua._2008._02.types.EnumValueType;
import org.opcfoundation.ua._2008._02.types.ListOfEnumValueType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Enum Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfEnumValueTypeImpl#getEnumValueType <em>Enum Value Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfEnumValueTypeImpl extends MinimalEObjectImpl.Container implements ListOfEnumValueType {
	/**
	 * The cached value of the '{@link #getEnumValueType() <em>Enum Value Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumValueType()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumValueType> enumValueType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfEnumValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfEnumValueType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumValueType> getEnumValueType() {
		if (enumValueType == null) {
			enumValueType = new EObjectContainmentEList<EnumValueType>(EnumValueType.class, this, TypesPackage.LIST_OF_ENUM_VALUE_TYPE__ENUM_VALUE_TYPE);
		}
		return enumValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_ENUM_VALUE_TYPE__ENUM_VALUE_TYPE:
				return ((InternalEList<?>)getEnumValueType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_ENUM_VALUE_TYPE__ENUM_VALUE_TYPE:
				return getEnumValueType();
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
			case TypesPackage.LIST_OF_ENUM_VALUE_TYPE__ENUM_VALUE_TYPE:
				getEnumValueType().clear();
				getEnumValueType().addAll((Collection<? extends EnumValueType>)newValue);
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
			case TypesPackage.LIST_OF_ENUM_VALUE_TYPE__ENUM_VALUE_TYPE:
				getEnumValueType().clear();
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
			case TypesPackage.LIST_OF_ENUM_VALUE_TYPE__ENUM_VALUE_TYPE:
				return enumValueType != null && !enumValueType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfEnumValueTypeImpl
