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

import org.opcfoundation.ua._2008._02.types.FieldMetaData;
import org.opcfoundation.ua._2008._02.types.ListOfFieldMetaData;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Field Meta Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfFieldMetaDataImpl#getFieldMetaData <em>Field Meta Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfFieldMetaDataImpl extends MinimalEObjectImpl.Container implements ListOfFieldMetaData {
	/**
	 * The cached value of the '{@link #getFieldMetaData() <em>Field Meta Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldMetaData()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldMetaData> fieldMetaData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfFieldMetaDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfFieldMetaData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldMetaData> getFieldMetaData() {
		if (fieldMetaData == null) {
			fieldMetaData = new EObjectContainmentEList<FieldMetaData>(FieldMetaData.class, this, TypesPackage.LIST_OF_FIELD_META_DATA__FIELD_META_DATA);
		}
		return fieldMetaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_FIELD_META_DATA__FIELD_META_DATA:
				return ((InternalEList<?>)getFieldMetaData()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_FIELD_META_DATA__FIELD_META_DATA:
				return getFieldMetaData();
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
			case TypesPackage.LIST_OF_FIELD_META_DATA__FIELD_META_DATA:
				getFieldMetaData().clear();
				getFieldMetaData().addAll((Collection<? extends FieldMetaData>)newValue);
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
			case TypesPackage.LIST_OF_FIELD_META_DATA__FIELD_META_DATA:
				getFieldMetaData().clear();
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
			case TypesPackage.LIST_OF_FIELD_META_DATA__FIELD_META_DATA:
				return fieldMetaData != null && !fieldMetaData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfFieldMetaDataImpl
