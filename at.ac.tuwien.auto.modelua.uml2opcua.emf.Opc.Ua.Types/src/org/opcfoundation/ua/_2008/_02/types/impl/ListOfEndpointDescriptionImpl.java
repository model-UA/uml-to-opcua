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

import org.opcfoundation.ua._2008._02.types.EndpointDescription;
import org.opcfoundation.ua._2008._02.types.ListOfEndpointDescription;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Endpoint Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfEndpointDescriptionImpl#getEndpointDescription <em>Endpoint Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfEndpointDescriptionImpl extends MinimalEObjectImpl.Container implements ListOfEndpointDescription {
	/**
	 * The cached value of the '{@link #getEndpointDescription() <em>Endpoint Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<EndpointDescription> endpointDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfEndpointDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfEndpointDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndpointDescription> getEndpointDescription() {
		if (endpointDescription == null) {
			endpointDescription = new EObjectContainmentEList<EndpointDescription>(EndpointDescription.class, this, TypesPackage.LIST_OF_ENDPOINT_DESCRIPTION__ENDPOINT_DESCRIPTION);
		}
		return endpointDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_ENDPOINT_DESCRIPTION__ENDPOINT_DESCRIPTION:
				return ((InternalEList<?>)getEndpointDescription()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_ENDPOINT_DESCRIPTION__ENDPOINT_DESCRIPTION:
				return getEndpointDescription();
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
			case TypesPackage.LIST_OF_ENDPOINT_DESCRIPTION__ENDPOINT_DESCRIPTION:
				getEndpointDescription().clear();
				getEndpointDescription().addAll((Collection<? extends EndpointDescription>)newValue);
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
			case TypesPackage.LIST_OF_ENDPOINT_DESCRIPTION__ENDPOINT_DESCRIPTION:
				getEndpointDescription().clear();
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
			case TypesPackage.LIST_OF_ENDPOINT_DESCRIPTION__ENDPOINT_DESCRIPTION:
				return endpointDescription != null && !endpointDescription.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfEndpointDescriptionImpl
