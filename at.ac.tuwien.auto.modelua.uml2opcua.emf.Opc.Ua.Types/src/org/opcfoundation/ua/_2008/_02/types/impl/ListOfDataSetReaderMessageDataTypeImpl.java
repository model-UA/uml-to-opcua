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

import org.opcfoundation.ua._2008._02.types.DataSetReaderMessageDataType;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderMessageDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Data Set Reader Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfDataSetReaderMessageDataTypeImpl#getDataSetReaderMessageDataType <em>Data Set Reader Message Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfDataSetReaderMessageDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfDataSetReaderMessageDataType {
	/**
	 * The cached value of the '{@link #getDataSetReaderMessageDataType() <em>Data Set Reader Message Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetReaderMessageDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSetReaderMessageDataType> dataSetReaderMessageDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDataSetReaderMessageDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfDataSetReaderMessageDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSetReaderMessageDataType> getDataSetReaderMessageDataType() {
		if (dataSetReaderMessageDataType == null) {
			dataSetReaderMessageDataType = new EObjectContainmentEList<DataSetReaderMessageDataType>(DataSetReaderMessageDataType.class, this, TypesPackage.LIST_OF_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_READER_MESSAGE_DATA_TYPE);
		}
		return dataSetReaderMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_READER_MESSAGE_DATA_TYPE:
				return ((InternalEList<?>)getDataSetReaderMessageDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_READER_MESSAGE_DATA_TYPE:
				return getDataSetReaderMessageDataType();
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
			case TypesPackage.LIST_OF_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_READER_MESSAGE_DATA_TYPE:
				getDataSetReaderMessageDataType().clear();
				getDataSetReaderMessageDataType().addAll((Collection<? extends DataSetReaderMessageDataType>)newValue);
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
			case TypesPackage.LIST_OF_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_READER_MESSAGE_DATA_TYPE:
				getDataSetReaderMessageDataType().clear();
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
			case TypesPackage.LIST_OF_DATA_SET_READER_MESSAGE_DATA_TYPE__DATA_SET_READER_MESSAGE_DATA_TYPE:
				return dataSetReaderMessageDataType != null && !dataSetReaderMessageDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfDataSetReaderMessageDataTypeImpl
