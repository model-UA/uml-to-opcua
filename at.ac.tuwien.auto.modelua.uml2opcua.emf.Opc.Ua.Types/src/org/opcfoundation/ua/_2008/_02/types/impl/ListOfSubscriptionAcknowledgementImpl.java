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

import org.opcfoundation.ua._2008._02.types.ListOfSubscriptionAcknowledgement;
import org.opcfoundation.ua._2008._02.types.SubscriptionAcknowledgement;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Subscription Acknowledgement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfSubscriptionAcknowledgementImpl#getSubscriptionAcknowledgement <em>Subscription Acknowledgement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfSubscriptionAcknowledgementImpl extends MinimalEObjectImpl.Container implements ListOfSubscriptionAcknowledgement {
	/**
	 * The cached value of the '{@link #getSubscriptionAcknowledgement() <em>Subscription Acknowledgement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionAcknowledgement()
	 * @generated
	 * @ordered
	 */
	protected EList<SubscriptionAcknowledgement> subscriptionAcknowledgement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfSubscriptionAcknowledgementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfSubscriptionAcknowledgement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubscriptionAcknowledgement> getSubscriptionAcknowledgement() {
		if (subscriptionAcknowledgement == null) {
			subscriptionAcknowledgement = new EObjectContainmentEList<SubscriptionAcknowledgement>(SubscriptionAcknowledgement.class, this, TypesPackage.LIST_OF_SUBSCRIPTION_ACKNOWLEDGEMENT__SUBSCRIPTION_ACKNOWLEDGEMENT);
		}
		return subscriptionAcknowledgement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_SUBSCRIPTION_ACKNOWLEDGEMENT__SUBSCRIPTION_ACKNOWLEDGEMENT:
				return ((InternalEList<?>)getSubscriptionAcknowledgement()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_SUBSCRIPTION_ACKNOWLEDGEMENT__SUBSCRIPTION_ACKNOWLEDGEMENT:
				return getSubscriptionAcknowledgement();
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
			case TypesPackage.LIST_OF_SUBSCRIPTION_ACKNOWLEDGEMENT__SUBSCRIPTION_ACKNOWLEDGEMENT:
				getSubscriptionAcknowledgement().clear();
				getSubscriptionAcknowledgement().addAll((Collection<? extends SubscriptionAcknowledgement>)newValue);
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
			case TypesPackage.LIST_OF_SUBSCRIPTION_ACKNOWLEDGEMENT__SUBSCRIPTION_ACKNOWLEDGEMENT:
				getSubscriptionAcknowledgement().clear();
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
			case TypesPackage.LIST_OF_SUBSCRIPTION_ACKNOWLEDGEMENT__SUBSCRIPTION_ACKNOWLEDGEMENT:
				return subscriptionAcknowledgement != null && !subscriptionAcknowledgement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfSubscriptionAcknowledgementImpl
