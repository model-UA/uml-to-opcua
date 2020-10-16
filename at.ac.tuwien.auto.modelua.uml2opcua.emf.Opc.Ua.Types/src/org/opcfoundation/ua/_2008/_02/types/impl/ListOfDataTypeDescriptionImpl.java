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

import org.opcfoundation.ua._2008._02.types.DataTypeDescription;
import org.opcfoundation.ua._2008._02.types.ListOfDataTypeDescription;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Data Type Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfDataTypeDescriptionImpl#getDataTypeDescription <em>Data Type Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfDataTypeDescriptionImpl extends MinimalEObjectImpl.Container implements ListOfDataTypeDescription {
	/**
	 * The cached value of the '{@link #getDataTypeDescription() <em>Data Type Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<DataTypeDescription> dataTypeDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDataTypeDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfDataTypeDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataTypeDescription> getDataTypeDescription() {
		if (dataTypeDescription == null) {
			dataTypeDescription = new EObjectContainmentEList<DataTypeDescription>(DataTypeDescription.class, this, TypesPackage.LIST_OF_DATA_TYPE_DESCRIPTION__DATA_TYPE_DESCRIPTION);
		}
		return dataTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_DATA_TYPE_DESCRIPTION__DATA_TYPE_DESCRIPTION:
				return ((InternalEList<?>)getDataTypeDescription()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_DATA_TYPE_DESCRIPTION__DATA_TYPE_DESCRIPTION:
				return getDataTypeDescription();
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
			case TypesPackage.LIST_OF_DATA_TYPE_DESCRIPTION__DATA_TYPE_DESCRIPTION:
				getDataTypeDescription().clear();
				getDataTypeDescription().addAll((Collection<? extends DataTypeDescription>)newValue);
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
			case TypesPackage.LIST_OF_DATA_TYPE_DESCRIPTION__DATA_TYPE_DESCRIPTION:
				getDataTypeDescription().clear();
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
			case TypesPackage.LIST_OF_DATA_TYPE_DESCRIPTION__DATA_TYPE_DESCRIPTION:
				return dataTypeDescription != null && !dataTypeDescription.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfDataTypeDescriptionImpl
