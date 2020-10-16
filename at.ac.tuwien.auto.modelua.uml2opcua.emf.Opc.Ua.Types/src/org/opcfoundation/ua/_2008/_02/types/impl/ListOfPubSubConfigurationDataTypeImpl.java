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

import org.opcfoundation.ua._2008._02.types.ListOfPubSubConfigurationDataType;
import org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Pub Sub Configuration Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfPubSubConfigurationDataTypeImpl#getPubSubConfigurationDataType <em>Pub Sub Configuration Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfPubSubConfigurationDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfPubSubConfigurationDataType {
	/**
	 * The cached value of the '{@link #getPubSubConfigurationDataType() <em>Pub Sub Configuration Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubSubConfigurationDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<PubSubConfigurationDataType> pubSubConfigurationDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfPubSubConfigurationDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfPubSubConfigurationDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PubSubConfigurationDataType> getPubSubConfigurationDataType() {
		if (pubSubConfigurationDataType == null) {
			pubSubConfigurationDataType = new EObjectContainmentEList<PubSubConfigurationDataType>(PubSubConfigurationDataType.class, this, TypesPackage.LIST_OF_PUB_SUB_CONFIGURATION_DATA_TYPE__PUB_SUB_CONFIGURATION_DATA_TYPE);
		}
		return pubSubConfigurationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_PUB_SUB_CONFIGURATION_DATA_TYPE__PUB_SUB_CONFIGURATION_DATA_TYPE:
				return ((InternalEList<?>)getPubSubConfigurationDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_PUB_SUB_CONFIGURATION_DATA_TYPE__PUB_SUB_CONFIGURATION_DATA_TYPE:
				return getPubSubConfigurationDataType();
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
			case TypesPackage.LIST_OF_PUB_SUB_CONFIGURATION_DATA_TYPE__PUB_SUB_CONFIGURATION_DATA_TYPE:
				getPubSubConfigurationDataType().clear();
				getPubSubConfigurationDataType().addAll((Collection<? extends PubSubConfigurationDataType>)newValue);
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
			case TypesPackage.LIST_OF_PUB_SUB_CONFIGURATION_DATA_TYPE__PUB_SUB_CONFIGURATION_DATA_TYPE:
				getPubSubConfigurationDataType().clear();
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
			case TypesPackage.LIST_OF_PUB_SUB_CONFIGURATION_DATA_TYPE__PUB_SUB_CONFIGURATION_DATA_TYPE:
				return pubSubConfigurationDataType != null && !pubSubConfigurationDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfPubSubConfigurationDataTypeImpl
