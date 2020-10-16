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

import org.opcfoundation.ua._2008._02.types.FieldTargetDataType;
import org.opcfoundation.ua._2008._02.types.ListOfFieldTargetDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Field Target Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfFieldTargetDataTypeImpl#getFieldTargetDataType <em>Field Target Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfFieldTargetDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfFieldTargetDataType {
	/**
	 * The cached value of the '{@link #getFieldTargetDataType() <em>Field Target Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldTargetDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldTargetDataType> fieldTargetDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfFieldTargetDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfFieldTargetDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldTargetDataType> getFieldTargetDataType() {
		if (fieldTargetDataType == null) {
			fieldTargetDataType = new EObjectContainmentEList<FieldTargetDataType>(FieldTargetDataType.class, this, TypesPackage.LIST_OF_FIELD_TARGET_DATA_TYPE__FIELD_TARGET_DATA_TYPE);
		}
		return fieldTargetDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_FIELD_TARGET_DATA_TYPE__FIELD_TARGET_DATA_TYPE:
				return ((InternalEList<?>)getFieldTargetDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_FIELD_TARGET_DATA_TYPE__FIELD_TARGET_DATA_TYPE:
				return getFieldTargetDataType();
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
			case TypesPackage.LIST_OF_FIELD_TARGET_DATA_TYPE__FIELD_TARGET_DATA_TYPE:
				getFieldTargetDataType().clear();
				getFieldTargetDataType().addAll((Collection<? extends FieldTargetDataType>)newValue);
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
			case TypesPackage.LIST_OF_FIELD_TARGET_DATA_TYPE__FIELD_TARGET_DATA_TYPE:
				getFieldTargetDataType().clear();
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
			case TypesPackage.LIST_OF_FIELD_TARGET_DATA_TYPE__FIELD_TARGET_DATA_TYPE:
				return fieldTargetDataType != null && !fieldTargetDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfFieldTargetDataTypeImpl
