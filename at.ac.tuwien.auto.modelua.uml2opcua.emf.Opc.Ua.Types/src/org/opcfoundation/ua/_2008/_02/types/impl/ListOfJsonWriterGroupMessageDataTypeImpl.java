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

import org.opcfoundation.ua._2008._02.types.JsonWriterGroupMessageDataType;
import org.opcfoundation.ua._2008._02.types.ListOfJsonWriterGroupMessageDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Json Writer Group Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfJsonWriterGroupMessageDataTypeImpl#getJsonWriterGroupMessageDataType <em>Json Writer Group Message Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfJsonWriterGroupMessageDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfJsonWriterGroupMessageDataType {
	/**
	 * The cached value of the '{@link #getJsonWriterGroupMessageDataType() <em>Json Writer Group Message Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonWriterGroupMessageDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<JsonWriterGroupMessageDataType> jsonWriterGroupMessageDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfJsonWriterGroupMessageDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfJsonWriterGroupMessageDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JsonWriterGroupMessageDataType> getJsonWriterGroupMessageDataType() {
		if (jsonWriterGroupMessageDataType == null) {
			jsonWriterGroupMessageDataType = new EObjectContainmentEList<JsonWriterGroupMessageDataType>(JsonWriterGroupMessageDataType.class, this, TypesPackage.LIST_OF_JSON_WRITER_GROUP_MESSAGE_DATA_TYPE__JSON_WRITER_GROUP_MESSAGE_DATA_TYPE);
		}
		return jsonWriterGroupMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_JSON_WRITER_GROUP_MESSAGE_DATA_TYPE__JSON_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return ((InternalEList<?>)getJsonWriterGroupMessageDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_JSON_WRITER_GROUP_MESSAGE_DATA_TYPE__JSON_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return getJsonWriterGroupMessageDataType();
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
			case TypesPackage.LIST_OF_JSON_WRITER_GROUP_MESSAGE_DATA_TYPE__JSON_WRITER_GROUP_MESSAGE_DATA_TYPE:
				getJsonWriterGroupMessageDataType().clear();
				getJsonWriterGroupMessageDataType().addAll((Collection<? extends JsonWriterGroupMessageDataType>)newValue);
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
			case TypesPackage.LIST_OF_JSON_WRITER_GROUP_MESSAGE_DATA_TYPE__JSON_WRITER_GROUP_MESSAGE_DATA_TYPE:
				getJsonWriterGroupMessageDataType().clear();
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
			case TypesPackage.LIST_OF_JSON_WRITER_GROUP_MESSAGE_DATA_TYPE__JSON_WRITER_GROUP_MESSAGE_DATA_TYPE:
				return jsonWriterGroupMessageDataType != null && !jsonWriterGroupMessageDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfJsonWriterGroupMessageDataTypeImpl
