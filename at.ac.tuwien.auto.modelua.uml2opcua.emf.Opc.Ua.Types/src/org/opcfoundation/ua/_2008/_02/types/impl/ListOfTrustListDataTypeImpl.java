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

import org.opcfoundation.ua._2008._02.types.ListOfTrustListDataType;
import org.opcfoundation.ua._2008._02.types.TrustListDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Trust List Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfTrustListDataTypeImpl#getTrustListDataType <em>Trust List Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfTrustListDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfTrustListDataType {
	/**
	 * The cached value of the '{@link #getTrustListDataType() <em>Trust List Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustListDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<TrustListDataType> trustListDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfTrustListDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfTrustListDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrustListDataType> getTrustListDataType() {
		if (trustListDataType == null) {
			trustListDataType = new EObjectContainmentEList<TrustListDataType>(TrustListDataType.class, this, TypesPackage.LIST_OF_TRUST_LIST_DATA_TYPE__TRUST_LIST_DATA_TYPE);
		}
		return trustListDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_TRUST_LIST_DATA_TYPE__TRUST_LIST_DATA_TYPE:
				return ((InternalEList<?>)getTrustListDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_TRUST_LIST_DATA_TYPE__TRUST_LIST_DATA_TYPE:
				return getTrustListDataType();
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
			case TypesPackage.LIST_OF_TRUST_LIST_DATA_TYPE__TRUST_LIST_DATA_TYPE:
				getTrustListDataType().clear();
				getTrustListDataType().addAll((Collection<? extends TrustListDataType>)newValue);
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
			case TypesPackage.LIST_OF_TRUST_LIST_DATA_TYPE__TRUST_LIST_DATA_TYPE:
				getTrustListDataType().clear();
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
			case TypesPackage.LIST_OF_TRUST_LIST_DATA_TYPE__TRUST_LIST_DATA_TYPE:
				return trustListDataType != null && !trustListDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfTrustListDataTypeImpl
