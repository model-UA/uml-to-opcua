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

import org.opcfoundation.ua._2008._02.types.ListOfThreeDOrientation;
import org.opcfoundation.ua._2008._02.types.ThreeDOrientation;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Three DOrientation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfThreeDOrientationImpl#getThreeDOrientation <em>Three DOrientation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfThreeDOrientationImpl extends MinimalEObjectImpl.Container implements ListOfThreeDOrientation {
	/**
	 * The cached value of the '{@link #getThreeDOrientation() <em>Three DOrientation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreeDOrientation()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreeDOrientation> threeDOrientation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfThreeDOrientationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfThreeDOrientation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThreeDOrientation> getThreeDOrientation() {
		if (threeDOrientation == null) {
			threeDOrientation = new EObjectContainmentEList<ThreeDOrientation>(ThreeDOrientation.class, this, TypesPackage.LIST_OF_THREE_DORIENTATION__THREE_DORIENTATION);
		}
		return threeDOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_THREE_DORIENTATION__THREE_DORIENTATION:
				return ((InternalEList<?>)getThreeDOrientation()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_THREE_DORIENTATION__THREE_DORIENTATION:
				return getThreeDOrientation();
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
			case TypesPackage.LIST_OF_THREE_DORIENTATION__THREE_DORIENTATION:
				getThreeDOrientation().clear();
				getThreeDOrientation().addAll((Collection<? extends ThreeDOrientation>)newValue);
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
			case TypesPackage.LIST_OF_THREE_DORIENTATION__THREE_DORIENTATION:
				getThreeDOrientation().clear();
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
			case TypesPackage.LIST_OF_THREE_DORIENTATION__THREE_DORIENTATION:
				return threeDOrientation != null && !threeDOrientation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfThreeDOrientationImpl
