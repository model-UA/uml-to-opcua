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

import org.opcfoundation.ua._2008._02.types.ListOfUABinaryFileDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.UABinaryFileDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of UA Binary File Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfUABinaryFileDataTypeImpl#getUABinaryFileDataType <em>UA Binary File Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfUABinaryFileDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfUABinaryFileDataType {
	/**
	 * The cached value of the '{@link #getUABinaryFileDataType() <em>UA Binary File Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUABinaryFileDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<UABinaryFileDataType> uABinaryFileDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfUABinaryFileDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfUABinaryFileDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UABinaryFileDataType> getUABinaryFileDataType() {
		if (uABinaryFileDataType == null) {
			uABinaryFileDataType = new EObjectContainmentEList<UABinaryFileDataType>(UABinaryFileDataType.class, this, TypesPackage.LIST_OF_UA_BINARY_FILE_DATA_TYPE__UA_BINARY_FILE_DATA_TYPE);
		}
		return uABinaryFileDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_UA_BINARY_FILE_DATA_TYPE__UA_BINARY_FILE_DATA_TYPE:
				return ((InternalEList<?>)getUABinaryFileDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_UA_BINARY_FILE_DATA_TYPE__UA_BINARY_FILE_DATA_TYPE:
				return getUABinaryFileDataType();
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
			case TypesPackage.LIST_OF_UA_BINARY_FILE_DATA_TYPE__UA_BINARY_FILE_DATA_TYPE:
				getUABinaryFileDataType().clear();
				getUABinaryFileDataType().addAll((Collection<? extends UABinaryFileDataType>)newValue);
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
			case TypesPackage.LIST_OF_UA_BINARY_FILE_DATA_TYPE__UA_BINARY_FILE_DATA_TYPE:
				getUABinaryFileDataType().clear();
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
			case TypesPackage.LIST_OF_UA_BINARY_FILE_DATA_TYPE__UA_BINARY_FILE_DATA_TYPE:
				return uABinaryFileDataType != null && !uABinaryFileDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfUABinaryFileDataTypeImpl
