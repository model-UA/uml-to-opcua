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

import org.opcfoundation.ua._2008._02.types.AliasNameDataType;
import org.opcfoundation.ua._2008._02.types.ListOfAliasNameDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Alias Name Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfAliasNameDataTypeImpl#getAliasNameDataType <em>Alias Name Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfAliasNameDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfAliasNameDataType {
	/**
	 * The cached value of the '{@link #getAliasNameDataType() <em>Alias Name Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasNameDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<AliasNameDataType> aliasNameDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfAliasNameDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfAliasNameDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AliasNameDataType> getAliasNameDataType() {
		if (aliasNameDataType == null) {
			aliasNameDataType = new EObjectContainmentEList<AliasNameDataType>(AliasNameDataType.class, this, TypesPackage.LIST_OF_ALIAS_NAME_DATA_TYPE__ALIAS_NAME_DATA_TYPE);
		}
		return aliasNameDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_ALIAS_NAME_DATA_TYPE__ALIAS_NAME_DATA_TYPE:
				return ((InternalEList<?>)getAliasNameDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_ALIAS_NAME_DATA_TYPE__ALIAS_NAME_DATA_TYPE:
				return getAliasNameDataType();
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
			case TypesPackage.LIST_OF_ALIAS_NAME_DATA_TYPE__ALIAS_NAME_DATA_TYPE:
				getAliasNameDataType().clear();
				getAliasNameDataType().addAll((Collection<? extends AliasNameDataType>)newValue);
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
			case TypesPackage.LIST_OF_ALIAS_NAME_DATA_TYPE__ALIAS_NAME_DATA_TYPE:
				getAliasNameDataType().clear();
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
			case TypesPackage.LIST_OF_ALIAS_NAME_DATA_TYPE__ALIAS_NAME_DATA_TYPE:
				return aliasNameDataType != null && !aliasNameDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfAliasNameDataTypeImpl
