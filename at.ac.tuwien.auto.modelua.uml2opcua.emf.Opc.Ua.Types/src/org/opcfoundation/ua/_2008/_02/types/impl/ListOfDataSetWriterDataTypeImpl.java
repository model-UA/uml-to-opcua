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

import org.opcfoundation.ua._2008._02.types.DataSetWriterDataType;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Data Set Writer Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfDataSetWriterDataTypeImpl#getDataSetWriterDataType <em>Data Set Writer Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfDataSetWriterDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfDataSetWriterDataType {
	/**
	 * The cached value of the '{@link #getDataSetWriterDataType() <em>Data Set Writer Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetWriterDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSetWriterDataType> dataSetWriterDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDataSetWriterDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfDataSetWriterDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSetWriterDataType> getDataSetWriterDataType() {
		if (dataSetWriterDataType == null) {
			dataSetWriterDataType = new EObjectContainmentEList<DataSetWriterDataType>(DataSetWriterDataType.class, this, TypesPackage.LIST_OF_DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_DATA_TYPE);
		}
		return dataSetWriterDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_DATA_TYPE:
				return ((InternalEList<?>)getDataSetWriterDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_DATA_TYPE:
				return getDataSetWriterDataType();
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
			case TypesPackage.LIST_OF_DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_DATA_TYPE:
				getDataSetWriterDataType().clear();
				getDataSetWriterDataType().addAll((Collection<? extends DataSetWriterDataType>)newValue);
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
			case TypesPackage.LIST_OF_DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_DATA_TYPE:
				getDataSetWriterDataType().clear();
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
			case TypesPackage.LIST_OF_DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_DATA_TYPE:
				return dataSetWriterDataType != null && !dataSetWriterDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfDataSetWriterDataTypeImpl
