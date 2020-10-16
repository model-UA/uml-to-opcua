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

import org.opcfoundation.ua._2008._02.types.DataSetReaderTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderTransportDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Data Set Reader Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfDataSetReaderTransportDataTypeImpl#getDataSetReaderTransportDataType <em>Data Set Reader Transport Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfDataSetReaderTransportDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfDataSetReaderTransportDataType {
	/**
	 * The cached value of the '{@link #getDataSetReaderTransportDataType() <em>Data Set Reader Transport Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetReaderTransportDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSetReaderTransportDataType> dataSetReaderTransportDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDataSetReaderTransportDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfDataSetReaderTransportDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSetReaderTransportDataType> getDataSetReaderTransportDataType() {
		if (dataSetReaderTransportDataType == null) {
			dataSetReaderTransportDataType = new EObjectContainmentEList<DataSetReaderTransportDataType>(DataSetReaderTransportDataType.class, this, TypesPackage.LIST_OF_DATA_SET_READER_TRANSPORT_DATA_TYPE__DATA_SET_READER_TRANSPORT_DATA_TYPE);
		}
		return dataSetReaderTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_DATA_SET_READER_TRANSPORT_DATA_TYPE__DATA_SET_READER_TRANSPORT_DATA_TYPE:
				return ((InternalEList<?>)getDataSetReaderTransportDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_DATA_SET_READER_TRANSPORT_DATA_TYPE__DATA_SET_READER_TRANSPORT_DATA_TYPE:
				return getDataSetReaderTransportDataType();
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
			case TypesPackage.LIST_OF_DATA_SET_READER_TRANSPORT_DATA_TYPE__DATA_SET_READER_TRANSPORT_DATA_TYPE:
				getDataSetReaderTransportDataType().clear();
				getDataSetReaderTransportDataType().addAll((Collection<? extends DataSetReaderTransportDataType>)newValue);
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
			case TypesPackage.LIST_OF_DATA_SET_READER_TRANSPORT_DATA_TYPE__DATA_SET_READER_TRANSPORT_DATA_TYPE:
				getDataSetReaderTransportDataType().clear();
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
			case TypesPackage.LIST_OF_DATA_SET_READER_TRANSPORT_DATA_TYPE__DATA_SET_READER_TRANSPORT_DATA_TYPE:
				return dataSetReaderTransportDataType != null && !dataSetReaderTransportDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfDataSetReaderTransportDataTypeImpl
