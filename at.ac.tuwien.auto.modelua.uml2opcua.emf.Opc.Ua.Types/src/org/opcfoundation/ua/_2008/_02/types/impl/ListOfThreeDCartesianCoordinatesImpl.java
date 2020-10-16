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

import org.opcfoundation.ua._2008._02.types.ListOfThreeDCartesianCoordinates;
import org.opcfoundation.ua._2008._02.types.ThreeDCartesianCoordinates;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Three DCartesian Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfThreeDCartesianCoordinatesImpl#getThreeDCartesianCoordinates <em>Three DCartesian Coordinates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfThreeDCartesianCoordinatesImpl extends MinimalEObjectImpl.Container implements ListOfThreeDCartesianCoordinates {
	/**
	 * The cached value of the '{@link #getThreeDCartesianCoordinates() <em>Three DCartesian Coordinates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreeDCartesianCoordinates()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreeDCartesianCoordinates> threeDCartesianCoordinates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfThreeDCartesianCoordinatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfThreeDCartesianCoordinates();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThreeDCartesianCoordinates> getThreeDCartesianCoordinates() {
		if (threeDCartesianCoordinates == null) {
			threeDCartesianCoordinates = new EObjectContainmentEList<ThreeDCartesianCoordinates>(ThreeDCartesianCoordinates.class, this, TypesPackage.LIST_OF_THREE_DCARTESIAN_COORDINATES__THREE_DCARTESIAN_COORDINATES);
		}
		return threeDCartesianCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_THREE_DCARTESIAN_COORDINATES__THREE_DCARTESIAN_COORDINATES:
				return ((InternalEList<?>)getThreeDCartesianCoordinates()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_THREE_DCARTESIAN_COORDINATES__THREE_DCARTESIAN_COORDINATES:
				return getThreeDCartesianCoordinates();
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
			case TypesPackage.LIST_OF_THREE_DCARTESIAN_COORDINATES__THREE_DCARTESIAN_COORDINATES:
				getThreeDCartesianCoordinates().clear();
				getThreeDCartesianCoordinates().addAll((Collection<? extends ThreeDCartesianCoordinates>)newValue);
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
			case TypesPackage.LIST_OF_THREE_DCARTESIAN_COORDINATES__THREE_DCARTESIAN_COORDINATES:
				getThreeDCartesianCoordinates().clear();
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
			case TypesPackage.LIST_OF_THREE_DCARTESIAN_COORDINATES__THREE_DCARTESIAN_COORDINATES:
				return threeDCartesianCoordinates != null && !threeDCartesianCoordinates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfThreeDCartesianCoordinatesImpl
