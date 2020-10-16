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

import org.opcfoundation.ua._2008._02.types.DataSetWriterTransportDataType;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterTransportDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Data Set Writer Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfDataSetWriterTransportDataTypeImpl#getDataSetWriterTransportDataType <em>Data Set Writer Transport Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfDataSetWriterTransportDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfDataSetWriterTransportDataType {
	/**
	 * The cached value of the '{@link #getDataSetWriterTransportDataType() <em>Data Set Writer Transport Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetWriterTransportDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSetWriterTransportDataType> dataSetWriterTransportDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDataSetWriterTransportDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfDataSetWriterTransportDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSetWriterTransportDataType> getDataSetWriterTransportDataType() {
		if (dataSetWriterTransportDataType == null) {
			dataSetWriterTransportDataType = new EObjectContainmentEList<DataSetWriterTransportDataType>(DataSetWriterTransportDataType.class, this, TypesPackage.LIST_OF_DATA_SET_WRITER_TRANSPORT_DATA_TYPE__DATA_SET_WRITER_TRANSPORT_DATA_TYPE);
		}
		return dataSetWriterTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_DATA_SET_WRITER_TRANSPORT_DATA_TYPE__DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				return ((InternalEList<?>)getDataSetWriterTransportDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_DATA_SET_WRITER_TRANSPORT_DATA_TYPE__DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				return getDataSetWriterTransportDataType();
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
			case TypesPackage.LIST_OF_DATA_SET_WRITER_TRANSPORT_DATA_TYPE__DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				getDataSetWriterTransportDataType().clear();
				getDataSetWriterTransportDataType().addAll((Collection<? extends DataSetWriterTransportDataType>)newValue);
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
			case TypesPackage.LIST_OF_DATA_SET_WRITER_TRANSPORT_DATA_TYPE__DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				getDataSetWriterTransportDataType().clear();
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
			case TypesPackage.LIST_OF_DATA_SET_WRITER_TRANSPORT_DATA_TYPE__DATA_SET_WRITER_TRANSPORT_DATA_TYPE:
				return dataSetWriterTransportDataType != null && !dataSetWriterTransportDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfDataSetWriterTransportDataTypeImpl
