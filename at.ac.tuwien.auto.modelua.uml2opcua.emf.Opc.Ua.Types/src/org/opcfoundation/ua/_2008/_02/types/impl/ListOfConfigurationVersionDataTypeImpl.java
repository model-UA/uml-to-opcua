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

import org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType;
import org.opcfoundation.ua._2008._02.types.ListOfConfigurationVersionDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Configuration Version Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfConfigurationVersionDataTypeImpl#getConfigurationVersionDataType <em>Configuration Version Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfConfigurationVersionDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfConfigurationVersionDataType {
	/**
	 * The cached value of the '{@link #getConfigurationVersionDataType() <em>Configuration Version Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationVersionDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationVersionDataType> configurationVersionDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfConfigurationVersionDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfConfigurationVersionDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationVersionDataType> getConfigurationVersionDataType() {
		if (configurationVersionDataType == null) {
			configurationVersionDataType = new EObjectContainmentEList<ConfigurationVersionDataType>(ConfigurationVersionDataType.class, this, TypesPackage.LIST_OF_CONFIGURATION_VERSION_DATA_TYPE__CONFIGURATION_VERSION_DATA_TYPE);
		}
		return configurationVersionDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_CONFIGURATION_VERSION_DATA_TYPE__CONFIGURATION_VERSION_DATA_TYPE:
				return ((InternalEList<?>)getConfigurationVersionDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_CONFIGURATION_VERSION_DATA_TYPE__CONFIGURATION_VERSION_DATA_TYPE:
				return getConfigurationVersionDataType();
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
			case TypesPackage.LIST_OF_CONFIGURATION_VERSION_DATA_TYPE__CONFIGURATION_VERSION_DATA_TYPE:
				getConfigurationVersionDataType().clear();
				getConfigurationVersionDataType().addAll((Collection<? extends ConfigurationVersionDataType>)newValue);
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
			case TypesPackage.LIST_OF_CONFIGURATION_VERSION_DATA_TYPE__CONFIGURATION_VERSION_DATA_TYPE:
				getConfigurationVersionDataType().clear();
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
			case TypesPackage.LIST_OF_CONFIGURATION_VERSION_DATA_TYPE__CONFIGURATION_VERSION_DATA_TYPE:
				return configurationVersionDataType != null && !configurationVersionDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfConfigurationVersionDataTypeImpl
