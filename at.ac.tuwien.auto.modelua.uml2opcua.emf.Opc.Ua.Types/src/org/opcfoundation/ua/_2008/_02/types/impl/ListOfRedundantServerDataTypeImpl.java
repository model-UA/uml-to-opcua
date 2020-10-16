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

import org.opcfoundation.ua._2008._02.types.ListOfRedundantServerDataType;
import org.opcfoundation.ua._2008._02.types.RedundantServerDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Redundant Server Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfRedundantServerDataTypeImpl#getRedundantServerDataType <em>Redundant Server Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfRedundantServerDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfRedundantServerDataType {
	/**
	 * The cached value of the '{@link #getRedundantServerDataType() <em>Redundant Server Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedundantServerDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<RedundantServerDataType> redundantServerDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfRedundantServerDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfRedundantServerDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RedundantServerDataType> getRedundantServerDataType() {
		if (redundantServerDataType == null) {
			redundantServerDataType = new EObjectContainmentEList<RedundantServerDataType>(RedundantServerDataType.class, this, TypesPackage.LIST_OF_REDUNDANT_SERVER_DATA_TYPE__REDUNDANT_SERVER_DATA_TYPE);
		}
		return redundantServerDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_REDUNDANT_SERVER_DATA_TYPE__REDUNDANT_SERVER_DATA_TYPE:
				return ((InternalEList<?>)getRedundantServerDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_REDUNDANT_SERVER_DATA_TYPE__REDUNDANT_SERVER_DATA_TYPE:
				return getRedundantServerDataType();
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
			case TypesPackage.LIST_OF_REDUNDANT_SERVER_DATA_TYPE__REDUNDANT_SERVER_DATA_TYPE:
				getRedundantServerDataType().clear();
				getRedundantServerDataType().addAll((Collection<? extends RedundantServerDataType>)newValue);
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
			case TypesPackage.LIST_OF_REDUNDANT_SERVER_DATA_TYPE__REDUNDANT_SERVER_DATA_TYPE:
				getRedundantServerDataType().clear();
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
			case TypesPackage.LIST_OF_REDUNDANT_SERVER_DATA_TYPE__REDUNDANT_SERVER_DATA_TYPE:
				return redundantServerDataType != null && !redundantServerDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfRedundantServerDataTypeImpl
