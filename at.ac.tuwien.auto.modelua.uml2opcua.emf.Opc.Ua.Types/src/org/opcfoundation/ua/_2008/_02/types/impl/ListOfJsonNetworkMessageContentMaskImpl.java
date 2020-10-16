/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.opcfoundation.ua._2008._02.types.ListOfJsonNetworkMessageContentMask;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Json Network Message Content Mask</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfJsonNetworkMessageContentMaskImpl#getJsonNetworkMessageContentMask <em>Json Network Message Content Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfJsonNetworkMessageContentMaskImpl extends MinimalEObjectImpl.Container implements ListOfJsonNetworkMessageContentMask {
	/**
	 * The cached value of the '{@link #getJsonNetworkMessageContentMask() <em>Json Network Message Content Mask</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonNetworkMessageContentMask()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> jsonNetworkMessageContentMask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfJsonNetworkMessageContentMaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfJsonNetworkMessageContentMask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Long> getJsonNetworkMessageContentMask() {
		if (jsonNetworkMessageContentMask == null) {
			jsonNetworkMessageContentMask = new EDataTypeEList<Long>(Long.class, this, TypesPackage.LIST_OF_JSON_NETWORK_MESSAGE_CONTENT_MASK__JSON_NETWORK_MESSAGE_CONTENT_MASK);
		}
		return jsonNetworkMessageContentMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.LIST_OF_JSON_NETWORK_MESSAGE_CONTENT_MASK__JSON_NETWORK_MESSAGE_CONTENT_MASK:
				return getJsonNetworkMessageContentMask();
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
			case TypesPackage.LIST_OF_JSON_NETWORK_MESSAGE_CONTENT_MASK__JSON_NETWORK_MESSAGE_CONTENT_MASK:
				getJsonNetworkMessageContentMask().clear();
				getJsonNetworkMessageContentMask().addAll((Collection<? extends Long>)newValue);
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
			case TypesPackage.LIST_OF_JSON_NETWORK_MESSAGE_CONTENT_MASK__JSON_NETWORK_MESSAGE_CONTENT_MASK:
				getJsonNetworkMessageContentMask().clear();
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
			case TypesPackage.LIST_OF_JSON_NETWORK_MESSAGE_CONTENT_MASK__JSON_NETWORK_MESSAGE_CONTENT_MASK:
				return jsonNetworkMessageContentMask != null && !jsonNetworkMessageContentMask.isEmpty();
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
		result.append(" (jsonNetworkMessageContentMask: ");
		result.append(jsonNetworkMessageContentMask);
		result.append(')');
		return result.toString();
	}

} //ListOfJsonNetworkMessageContentMaskImpl
