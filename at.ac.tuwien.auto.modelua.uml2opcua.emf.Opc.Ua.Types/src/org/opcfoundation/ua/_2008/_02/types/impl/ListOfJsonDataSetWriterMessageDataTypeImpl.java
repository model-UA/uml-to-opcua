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

import org.opcfoundation.ua._2008._02.types.JsonDataSetWriterMessageDataType;
import org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetWriterMessageDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Json Data Set Writer Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfJsonDataSetWriterMessageDataTypeImpl#getJsonDataSetWriterMessageDataType <em>Json Data Set Writer Message Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfJsonDataSetWriterMessageDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfJsonDataSetWriterMessageDataType {
	/**
	 * The cached value of the '{@link #getJsonDataSetWriterMessageDataType() <em>Json Data Set Writer Message Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonDataSetWriterMessageDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<JsonDataSetWriterMessageDataType> jsonDataSetWriterMessageDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfJsonDataSetWriterMessageDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfJsonDataSetWriterMessageDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JsonDataSetWriterMessageDataType> getJsonDataSetWriterMessageDataType() {
		if (jsonDataSetWriterMessageDataType == null) {
			jsonDataSetWriterMessageDataType = new EObjectContainmentEList<JsonDataSetWriterMessageDataType>(JsonDataSetWriterMessageDataType.class, this, TypesPackage.LIST_OF_JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE__JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE);
		}
		return jsonDataSetWriterMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE__JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return ((InternalEList<?>)getJsonDataSetWriterMessageDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE__JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return getJsonDataSetWriterMessageDataType();
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
			case TypesPackage.LIST_OF_JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE__JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				getJsonDataSetWriterMessageDataType().clear();
				getJsonDataSetWriterMessageDataType().addAll((Collection<? extends JsonDataSetWriterMessageDataType>)newValue);
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
			case TypesPackage.LIST_OF_JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE__JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				getJsonDataSetWriterMessageDataType().clear();
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
			case TypesPackage.LIST_OF_JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE__JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE:
				return jsonDataSetWriterMessageDataType != null && !jsonDataSetWriterMessageDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfJsonDataSetWriterMessageDataTypeImpl
