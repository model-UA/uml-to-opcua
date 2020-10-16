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

import org.opcfoundation.ua._2008._02.types.ListOfSimpleTypeDescription;
import org.opcfoundation.ua._2008._02.types.SimpleTypeDescription;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Simple Type Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfSimpleTypeDescriptionImpl#getSimpleTypeDescription <em>Simple Type Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfSimpleTypeDescriptionImpl extends MinimalEObjectImpl.Container implements ListOfSimpleTypeDescription {
	/**
	 * The cached value of the '{@link #getSimpleTypeDescription() <em>Simple Type Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleTypeDescription> simpleTypeDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfSimpleTypeDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfSimpleTypeDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleTypeDescription> getSimpleTypeDescription() {
		if (simpleTypeDescription == null) {
			simpleTypeDescription = new EObjectContainmentEList<SimpleTypeDescription>(SimpleTypeDescription.class, this, TypesPackage.LIST_OF_SIMPLE_TYPE_DESCRIPTION__SIMPLE_TYPE_DESCRIPTION);
		}
		return simpleTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_SIMPLE_TYPE_DESCRIPTION__SIMPLE_TYPE_DESCRIPTION:
				return ((InternalEList<?>)getSimpleTypeDescription()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_SIMPLE_TYPE_DESCRIPTION__SIMPLE_TYPE_DESCRIPTION:
				return getSimpleTypeDescription();
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
			case TypesPackage.LIST_OF_SIMPLE_TYPE_DESCRIPTION__SIMPLE_TYPE_DESCRIPTION:
				getSimpleTypeDescription().clear();
				getSimpleTypeDescription().addAll((Collection<? extends SimpleTypeDescription>)newValue);
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
			case TypesPackage.LIST_OF_SIMPLE_TYPE_DESCRIPTION__SIMPLE_TYPE_DESCRIPTION:
				getSimpleTypeDescription().clear();
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
			case TypesPackage.LIST_OF_SIMPLE_TYPE_DESCRIPTION__SIMPLE_TYPE_DESCRIPTION:
				return simpleTypeDescription != null && !simpleTypeDescription.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfSimpleTypeDescriptionImpl
