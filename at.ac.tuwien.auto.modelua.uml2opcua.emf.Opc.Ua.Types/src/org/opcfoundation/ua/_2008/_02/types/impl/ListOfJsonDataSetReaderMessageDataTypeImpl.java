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

import org.opcfoundation.ua._2008._02.types.JsonDataSetReaderMessageDataType;
import org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetReaderMessageDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Json Data Set Reader Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfJsonDataSetReaderMessageDataTypeImpl#getJsonDataSetReaderMessageDataType <em>Json Data Set Reader Message Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfJsonDataSetReaderMessageDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfJsonDataSetReaderMessageDataType {
	/**
	 * The cached value of the '{@link #getJsonDataSetReaderMessageDataType() <em>Json Data Set Reader Message Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonDataSetReaderMessageDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<JsonDataSetReaderMessageDataType> jsonDataSetReaderMessageDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfJsonDataSetReaderMessageDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfJsonDataSetReaderMessageDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JsonDataSetReaderMessageDataType> getJsonDataSetReaderMessageDataType() {
		if (jsonDataSetReaderMessageDataType == null) {
			jsonDataSetReaderMessageDataType = new EObjectContainmentEList<JsonDataSetReaderMessageDataType>(JsonDataSetReaderMessageDataType.class, this, TypesPackage.LIST_OF_JSON_DATA_SET_READER_MESSAGE_DATA_TYPE__JSON_DATA_SET_READER_MESSAGE_DATA_TYPE);
		}
		return jsonDataSetReaderMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_JSON_DATA_SET_READER_MESSAGE_DATA_TYPE__JSON_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return ((InternalEList<?>)getJsonDataSetReaderMessageDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_JSON_DATA_SET_READER_MESSAGE_DATA_TYPE__JSON_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return getJsonDataSetReaderMessageDataType();
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
			case TypesPackage.LIST_OF_JSON_DATA_SET_READER_MESSAGE_DATA_TYPE__JSON_DATA_SET_READER_MESSAGE_DATA_TYPE:
				getJsonDataSetReaderMessageDataType().clear();
				getJsonDataSetReaderMessageDataType().addAll((Collection<? extends JsonDataSetReaderMessageDataType>)newValue);
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
			case TypesPackage.LIST_OF_JSON_DATA_SET_READER_MESSAGE_DATA_TYPE__JSON_DATA_SET_READER_MESSAGE_DATA_TYPE:
				getJsonDataSetReaderMessageDataType().clear();
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
			case TypesPackage.LIST_OF_JSON_DATA_SET_READER_MESSAGE_DATA_TYPE__JSON_DATA_SET_READER_MESSAGE_DATA_TYPE:
				return jsonDataSetReaderMessageDataType != null && !jsonDataSetReaderMessageDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfJsonDataSetReaderMessageDataTypeImpl
