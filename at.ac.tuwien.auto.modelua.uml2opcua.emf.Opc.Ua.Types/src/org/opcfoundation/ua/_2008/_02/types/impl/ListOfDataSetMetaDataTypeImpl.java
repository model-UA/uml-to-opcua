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

import org.opcfoundation.ua._2008._02.types.DataSetMetaDataType;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetMetaDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Data Set Meta Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfDataSetMetaDataTypeImpl#getDataSetMetaDataType <em>Data Set Meta Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfDataSetMetaDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfDataSetMetaDataType {
	/**
	 * The cached value of the '{@link #getDataSetMetaDataType() <em>Data Set Meta Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetMetaDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSetMetaDataType> dataSetMetaDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDataSetMetaDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfDataSetMetaDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSetMetaDataType> getDataSetMetaDataType() {
		if (dataSetMetaDataType == null) {
			dataSetMetaDataType = new EObjectContainmentEList<DataSetMetaDataType>(DataSetMetaDataType.class, this, TypesPackage.LIST_OF_DATA_SET_META_DATA_TYPE__DATA_SET_META_DATA_TYPE);
		}
		return dataSetMetaDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_DATA_SET_META_DATA_TYPE__DATA_SET_META_DATA_TYPE:
				return ((InternalEList<?>)getDataSetMetaDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_DATA_SET_META_DATA_TYPE__DATA_SET_META_DATA_TYPE:
				return getDataSetMetaDataType();
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
			case TypesPackage.LIST_OF_DATA_SET_META_DATA_TYPE__DATA_SET_META_DATA_TYPE:
				getDataSetMetaDataType().clear();
				getDataSetMetaDataType().addAll((Collection<? extends DataSetMetaDataType>)newValue);
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
			case TypesPackage.LIST_OF_DATA_SET_META_DATA_TYPE__DATA_SET_META_DATA_TYPE:
				getDataSetMetaDataType().clear();
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
			case TypesPackage.LIST_OF_DATA_SET_META_DATA_TYPE__DATA_SET_META_DATA_TYPE:
				return dataSetMetaDataType != null && !dataSetMetaDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfDataSetMetaDataTypeImpl
