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

import org.opcfoundation.ua._2008._02.types.BrowseDescription;
import org.opcfoundation.ua._2008._02.types.ListOfBrowseDescription;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Browse Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfBrowseDescriptionImpl#getBrowseDescription <em>Browse Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfBrowseDescriptionImpl extends MinimalEObjectImpl.Container implements ListOfBrowseDescription {
	/**
	 * The cached value of the '{@link #getBrowseDescription() <em>Browse Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowseDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<BrowseDescription> browseDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfBrowseDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfBrowseDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BrowseDescription> getBrowseDescription() {
		if (browseDescription == null) {
			browseDescription = new EObjectContainmentEList<BrowseDescription>(BrowseDescription.class, this, TypesPackage.LIST_OF_BROWSE_DESCRIPTION__BROWSE_DESCRIPTION);
		}
		return browseDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_BROWSE_DESCRIPTION__BROWSE_DESCRIPTION:
				return ((InternalEList<?>)getBrowseDescription()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_BROWSE_DESCRIPTION__BROWSE_DESCRIPTION:
				return getBrowseDescription();
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
			case TypesPackage.LIST_OF_BROWSE_DESCRIPTION__BROWSE_DESCRIPTION:
				getBrowseDescription().clear();
				getBrowseDescription().addAll((Collection<? extends BrowseDescription>)newValue);
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
			case TypesPackage.LIST_OF_BROWSE_DESCRIPTION__BROWSE_DESCRIPTION:
				getBrowseDescription().clear();
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
			case TypesPackage.LIST_OF_BROWSE_DESCRIPTION__BROWSE_DESCRIPTION:
				return browseDescription != null && !browseDescription.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfBrowseDescriptionImpl
