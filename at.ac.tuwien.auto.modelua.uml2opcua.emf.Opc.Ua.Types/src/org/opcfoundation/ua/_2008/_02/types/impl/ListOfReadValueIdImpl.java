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

import org.opcfoundation.ua._2008._02.types.ListOfReadValueId;
import org.opcfoundation.ua._2008._02.types.ReadValueId;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Read Value Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfReadValueIdImpl#getReadValueId <em>Read Value Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfReadValueIdImpl extends MinimalEObjectImpl.Container implements ListOfReadValueId {
	/**
	 * The cached value of the '{@link #getReadValueId() <em>Read Value Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadValueId()
	 * @generated
	 * @ordered
	 */
	protected EList<ReadValueId> readValueId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfReadValueIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfReadValueId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReadValueId> getReadValueId() {
		if (readValueId == null) {
			readValueId = new EObjectContainmentEList<ReadValueId>(ReadValueId.class, this, TypesPackage.LIST_OF_READ_VALUE_ID__READ_VALUE_ID);
		}
		return readValueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_READ_VALUE_ID__READ_VALUE_ID:
				return ((InternalEList<?>)getReadValueId()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_READ_VALUE_ID__READ_VALUE_ID:
				return getReadValueId();
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
			case TypesPackage.LIST_OF_READ_VALUE_ID__READ_VALUE_ID:
				getReadValueId().clear();
				getReadValueId().addAll((Collection<? extends ReadValueId>)newValue);
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
			case TypesPackage.LIST_OF_READ_VALUE_ID__READ_VALUE_ID:
				getReadValueId().clear();
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
			case TypesPackage.LIST_OF_READ_VALUE_ID__READ_VALUE_ID:
				return readValueId != null && !readValueId.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfReadValueIdImpl
