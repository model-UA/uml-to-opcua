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

import org.opcfoundation.ua._2008._02.types.ListOfReferenceDescription;
import org.opcfoundation.ua._2008._02.types.ReferenceDescription;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Reference Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfReferenceDescriptionImpl#getReferenceDescription <em>Reference Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfReferenceDescriptionImpl extends MinimalEObjectImpl.Container implements ListOfReferenceDescription {
	/**
	 * The cached value of the '{@link #getReferenceDescription() <em>Reference Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceDescription> referenceDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfReferenceDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfReferenceDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceDescription> getReferenceDescription() {
		if (referenceDescription == null) {
			referenceDescription = new EObjectContainmentEList<ReferenceDescription>(ReferenceDescription.class, this, TypesPackage.LIST_OF_REFERENCE_DESCRIPTION__REFERENCE_DESCRIPTION);
		}
		return referenceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_REFERENCE_DESCRIPTION__REFERENCE_DESCRIPTION:
				return ((InternalEList<?>)getReferenceDescription()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_REFERENCE_DESCRIPTION__REFERENCE_DESCRIPTION:
				return getReferenceDescription();
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
			case TypesPackage.LIST_OF_REFERENCE_DESCRIPTION__REFERENCE_DESCRIPTION:
				getReferenceDescription().clear();
				getReferenceDescription().addAll((Collection<? extends ReferenceDescription>)newValue);
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
			case TypesPackage.LIST_OF_REFERENCE_DESCRIPTION__REFERENCE_DESCRIPTION:
				getReferenceDescription().clear();
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
			case TypesPackage.LIST_OF_REFERENCE_DESCRIPTION__REFERENCE_DESCRIPTION:
				return referenceDescription != null && !referenceDescription.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfReferenceDescriptionImpl
