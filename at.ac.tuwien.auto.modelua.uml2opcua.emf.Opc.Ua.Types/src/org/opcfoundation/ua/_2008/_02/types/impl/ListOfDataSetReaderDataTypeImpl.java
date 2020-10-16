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

import org.opcfoundation.ua._2008._02.types.DataSetReaderDataType;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Data Set Reader Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfDataSetReaderDataTypeImpl#getDataSetReaderDataType <em>Data Set Reader Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfDataSetReaderDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfDataSetReaderDataType {
	/**
	 * The cached value of the '{@link #getDataSetReaderDataType() <em>Data Set Reader Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetReaderDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSetReaderDataType> dataSetReaderDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDataSetReaderDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfDataSetReaderDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSetReaderDataType> getDataSetReaderDataType() {
		if (dataSetReaderDataType == null) {
			dataSetReaderDataType = new EObjectContainmentEList<DataSetReaderDataType>(DataSetReaderDataType.class, this, TypesPackage.LIST_OF_DATA_SET_READER_DATA_TYPE__DATA_SET_READER_DATA_TYPE);
		}
		return dataSetReaderDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_DATA_SET_READER_DATA_TYPE__DATA_SET_READER_DATA_TYPE:
				return ((InternalEList<?>)getDataSetReaderDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_DATA_SET_READER_DATA_TYPE__DATA_SET_READER_DATA_TYPE:
				return getDataSetReaderDataType();
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
			case TypesPackage.LIST_OF_DATA_SET_READER_DATA_TYPE__DATA_SET_READER_DATA_TYPE:
				getDataSetReaderDataType().clear();
				getDataSetReaderDataType().addAll((Collection<? extends DataSetReaderDataType>)newValue);
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
			case TypesPackage.LIST_OF_DATA_SET_READER_DATA_TYPE__DATA_SET_READER_DATA_TYPE:
				getDataSetReaderDataType().clear();
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
			case TypesPackage.LIST_OF_DATA_SET_READER_DATA_TYPE__DATA_SET_READER_DATA_TYPE:
				return dataSetReaderDataType != null && !dataSetReaderDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfDataSetReaderDataTypeImpl
