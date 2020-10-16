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

import org.opcfoundation.ua._2008._02.types.CurrencyUnitType;
import org.opcfoundation.ua._2008._02.types.ListOfCurrencyUnitType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Currency Unit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfCurrencyUnitTypeImpl#getCurrencyUnitType <em>Currency Unit Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfCurrencyUnitTypeImpl extends MinimalEObjectImpl.Container implements ListOfCurrencyUnitType {
	/**
	 * The cached value of the '{@link #getCurrencyUnitType() <em>Currency Unit Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUnitType()
	 * @generated
	 * @ordered
	 */
	protected EList<CurrencyUnitType> currencyUnitType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfCurrencyUnitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfCurrencyUnitType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CurrencyUnitType> getCurrencyUnitType() {
		if (currencyUnitType == null) {
			currencyUnitType = new EObjectContainmentEList<CurrencyUnitType>(CurrencyUnitType.class, this, TypesPackage.LIST_OF_CURRENCY_UNIT_TYPE__CURRENCY_UNIT_TYPE);
		}
		return currencyUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_CURRENCY_UNIT_TYPE__CURRENCY_UNIT_TYPE:
				return ((InternalEList<?>)getCurrencyUnitType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_CURRENCY_UNIT_TYPE__CURRENCY_UNIT_TYPE:
				return getCurrencyUnitType();
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
			case TypesPackage.LIST_OF_CURRENCY_UNIT_TYPE__CURRENCY_UNIT_TYPE:
				getCurrencyUnitType().clear();
				getCurrencyUnitType().addAll((Collection<? extends CurrencyUnitType>)newValue);
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
			case TypesPackage.LIST_OF_CURRENCY_UNIT_TYPE__CURRENCY_UNIT_TYPE:
				getCurrencyUnitType().clear();
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
			case TypesPackage.LIST_OF_CURRENCY_UNIT_TYPE__CURRENCY_UNIT_TYPE:
				return currencyUnitType != null && !currencyUnitType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfCurrencyUnitTypeImpl
