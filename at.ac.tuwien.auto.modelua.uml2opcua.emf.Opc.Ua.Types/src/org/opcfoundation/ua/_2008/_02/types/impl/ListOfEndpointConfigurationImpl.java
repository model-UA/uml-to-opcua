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

import org.opcfoundation.ua._2008._02.types.EndpointConfiguration;
import org.opcfoundation.ua._2008._02.types.ListOfEndpointConfiguration;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Endpoint Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfEndpointConfigurationImpl#getEndpointConfiguration <em>Endpoint Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfEndpointConfigurationImpl extends MinimalEObjectImpl.Container implements ListOfEndpointConfiguration {
	/**
	 * The cached value of the '{@link #getEndpointConfiguration() <em>Endpoint Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<EndpointConfiguration> endpointConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfEndpointConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfEndpointConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndpointConfiguration> getEndpointConfiguration() {
		if (endpointConfiguration == null) {
			endpointConfiguration = new EObjectContainmentEList<EndpointConfiguration>(EndpointConfiguration.class, this, TypesPackage.LIST_OF_ENDPOINT_CONFIGURATION__ENDPOINT_CONFIGURATION);
		}
		return endpointConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_ENDPOINT_CONFIGURATION__ENDPOINT_CONFIGURATION:
				return ((InternalEList<?>)getEndpointConfiguration()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_ENDPOINT_CONFIGURATION__ENDPOINT_CONFIGURATION:
				return getEndpointConfiguration();
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
			case TypesPackage.LIST_OF_ENDPOINT_CONFIGURATION__ENDPOINT_CONFIGURATION:
				getEndpointConfiguration().clear();
				getEndpointConfiguration().addAll((Collection<? extends EndpointConfiguration>)newValue);
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
			case TypesPackage.LIST_OF_ENDPOINT_CONFIGURATION__ENDPOINT_CONFIGURATION:
				getEndpointConfiguration().clear();
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
			case TypesPackage.LIST_OF_ENDPOINT_CONFIGURATION__ENDPOINT_CONFIGURATION:
				return endpointConfiguration != null && !endpointConfiguration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfEndpointConfigurationImpl
