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

import org.opcfoundation.ua._2008._02.types.ListOfRationalNumber;
import org.opcfoundation.ua._2008._02.types.RationalNumber;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Rational Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfRationalNumberImpl#getRationalNumber <em>Rational Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfRationalNumberImpl extends MinimalEObjectImpl.Container implements ListOfRationalNumber {
	/**
	 * The cached value of the '{@link #getRationalNumber() <em>Rational Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationalNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<RationalNumber> rationalNumber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfRationalNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfRationalNumber();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RationalNumber> getRationalNumber() {
		if (rationalNumber == null) {
			rationalNumber = new EObjectContainmentEList<RationalNumber>(RationalNumber.class, this, TypesPackage.LIST_OF_RATIONAL_NUMBER__RATIONAL_NUMBER);
		}
		return rationalNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_RATIONAL_NUMBER__RATIONAL_NUMBER:
				return ((InternalEList<?>)getRationalNumber()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_RATIONAL_NUMBER__RATIONAL_NUMBER:
				return getRationalNumber();
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
			case TypesPackage.LIST_OF_RATIONAL_NUMBER__RATIONAL_NUMBER:
				getRationalNumber().clear();
				getRationalNumber().addAll((Collection<? extends RationalNumber>)newValue);
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
			case TypesPackage.LIST_OF_RATIONAL_NUMBER__RATIONAL_NUMBER:
				getRationalNumber().clear();
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
			case TypesPackage.LIST_OF_RATIONAL_NUMBER__RATIONAL_NUMBER:
				return rationalNumber != null && !rationalNumber.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfRationalNumberImpl
