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

import org.opcfoundation.ua._2008._02.types.ListOfSubscriptionDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Subscription Diagnostics Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfSubscriptionDiagnosticsDataTypeImpl#getSubscriptionDiagnosticsDataType <em>Subscription Diagnostics Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfSubscriptionDiagnosticsDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfSubscriptionDiagnosticsDataType {
	/**
	 * The cached value of the '{@link #getSubscriptionDiagnosticsDataType() <em>Subscription Diagnostics Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionDiagnosticsDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<SubscriptionDiagnosticsDataType> subscriptionDiagnosticsDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfSubscriptionDiagnosticsDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfSubscriptionDiagnosticsDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubscriptionDiagnosticsDataType> getSubscriptionDiagnosticsDataType() {
		if (subscriptionDiagnosticsDataType == null) {
			subscriptionDiagnosticsDataType = new EObjectContainmentEList<SubscriptionDiagnosticsDataType>(SubscriptionDiagnosticsDataType.class, this, TypesPackage.LIST_OF_SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE);
		}
		return subscriptionDiagnosticsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE:
				return ((InternalEList<?>)getSubscriptionDiagnosticsDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE:
				return getSubscriptionDiagnosticsDataType();
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
			case TypesPackage.LIST_OF_SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE:
				getSubscriptionDiagnosticsDataType().clear();
				getSubscriptionDiagnosticsDataType().addAll((Collection<? extends SubscriptionDiagnosticsDataType>)newValue);
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
			case TypesPackage.LIST_OF_SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE:
				getSubscriptionDiagnosticsDataType().clear();
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
			case TypesPackage.LIST_OF_SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE:
				return subscriptionDiagnosticsDataType != null && !subscriptionDiagnosticsDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfSubscriptionDiagnosticsDataTypeImpl
