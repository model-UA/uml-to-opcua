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

import org.opcfoundation.ua._2008._02.types.ApplicationDescription;
import org.opcfoundation.ua._2008._02.types.ListOfApplicationDescription;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Application Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfApplicationDescriptionImpl#getApplicationDescription <em>Application Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfApplicationDescriptionImpl extends MinimalEObjectImpl.Container implements ListOfApplicationDescription {
	/**
	 * The cached value of the '{@link #getApplicationDescription() <em>Application Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationDescription> applicationDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfApplicationDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfApplicationDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationDescription> getApplicationDescription() {
		if (applicationDescription == null) {
			applicationDescription = new EObjectContainmentEList<ApplicationDescription>(ApplicationDescription.class, this, TypesPackage.LIST_OF_APPLICATION_DESCRIPTION__APPLICATION_DESCRIPTION);
		}
		return applicationDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_APPLICATION_DESCRIPTION__APPLICATION_DESCRIPTION:
				return ((InternalEList<?>)getApplicationDescription()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_APPLICATION_DESCRIPTION__APPLICATION_DESCRIPTION:
				return getApplicationDescription();
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
			case TypesPackage.LIST_OF_APPLICATION_DESCRIPTION__APPLICATION_DESCRIPTION:
				getApplicationDescription().clear();
				getApplicationDescription().addAll((Collection<? extends ApplicationDescription>)newValue);
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
			case TypesPackage.LIST_OF_APPLICATION_DESCRIPTION__APPLICATION_DESCRIPTION:
				getApplicationDescription().clear();
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
			case TypesPackage.LIST_OF_APPLICATION_DESCRIPTION__APPLICATION_DESCRIPTION:
				return applicationDescription != null && !applicationDescription.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfApplicationDescriptionImpl
