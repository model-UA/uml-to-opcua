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

import org.opcfoundation.ua._2008._02.types.DataSetWriterMessageDataType;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterMessageDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Data Set Writer Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfDataSetWriterMessageDataTypeImpl#getDataSetWriterMessageDataType <em>Data Set Writer Message Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfDataSetWriterMessageDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfDataSetWriterMessageDataType {
	/**
	 * The cached value of the '{@link #getDataSetWriterMessageDataType() <em>Data Set Writer Message Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetWriterMessageDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSetWriterMessageDataType> dataSetWriterMessageDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDataSetWriterMessageDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfDataSetWriterMessageDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSetWriterMessageDataType> getDataSetWriterMessageDataType() {
		if (dataSetWriterMessageDataType == null) {
			dataSetWriterMessageDataType = new EObjectContainmentEList<DataSetWriterMessageDataType>(DataSetWriterMessageDataType.class, this, TypesPackage.LIST_OF_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_WRITER_MESSAGE_DATA_TYPE);
		}
		return dataSetWriterMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return ((InternalEList<?>)getDataSetWriterMessageDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return getDataSetWriterMessageDataType();
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
			case TypesPackage.LIST_OF_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				getDataSetWriterMessageDataType().clear();
				getDataSetWriterMessageDataType().addAll((Collection<? extends DataSetWriterMessageDataType>)newValue);
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
			case TypesPackage.LIST_OF_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				getDataSetWriterMessageDataType().clear();
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
			case TypesPackage.LIST_OF_DATA_SET_WRITER_MESSAGE_DATA_TYPE__DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return dataSetWriterMessageDataType != null && !dataSetWriterMessageDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfDataSetWriterMessageDataTypeImpl
