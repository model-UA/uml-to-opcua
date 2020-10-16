/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetMessageContentMask;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Json Data Set Message Content Mask</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfJsonDataSetMessageContentMaskImpl#getJsonDataSetMessageContentMask <em>Json Data Set Message Content Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfJsonDataSetMessageContentMaskImpl extends MinimalEObjectImpl.Container implements ListOfJsonDataSetMessageContentMask {
	/**
	 * The cached value of the '{@link #getJsonDataSetMessageContentMask() <em>Json Data Set Message Content Mask</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonDataSetMessageContentMask()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> jsonDataSetMessageContentMask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfJsonDataSetMessageContentMaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfJsonDataSetMessageContentMask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Long> getJsonDataSetMessageContentMask() {
		if (jsonDataSetMessageContentMask == null) {
			jsonDataSetMessageContentMask = new EDataTypeEList<Long>(Long.class, this, TypesPackage.LIST_OF_JSON_DATA_SET_MESSAGE_CONTENT_MASK__JSON_DATA_SET_MESSAGE_CONTENT_MASK);
		}
		return jsonDataSetMessageContentMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.LIST_OF_JSON_DATA_SET_MESSAGE_CONTENT_MASK__JSON_DATA_SET_MESSAGE_CONTENT_MASK:
				return getJsonDataSetMessageContentMask();
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
			case TypesPackage.LIST_OF_JSON_DATA_SET_MESSAGE_CONTENT_MASK__JSON_DATA_SET_MESSAGE_CONTENT_MASK:
				getJsonDataSetMessageContentMask().clear();
				getJsonDataSetMessageContentMask().addAll((Collection<? extends Long>)newValue);
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
			case TypesPackage.LIST_OF_JSON_DATA_SET_MESSAGE_CONTENT_MASK__JSON_DATA_SET_MESSAGE_CONTENT_MASK:
				getJsonDataSetMessageContentMask().clear();
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
			case TypesPackage.LIST_OF_JSON_DATA_SET_MESSAGE_CONTENT_MASK__JSON_DATA_SET_MESSAGE_CONTENT_MASK:
				return jsonDataSetMessageContentMask != null && !jsonDataSetMessageContentMask.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (jsonDataSetMessageContentMask: ");
		result.append(jsonDataSetMessageContentMask);
		result.append(')');
		return result.toString();
	}

} //ListOfJsonDataSetMessageContentMaskImpl
