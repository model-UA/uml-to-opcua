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

import org.opcfoundation.ua._2008._02.types.ListOfStructureDescription;
import org.opcfoundation.ua._2008._02.types.StructureDescription;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Structure Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfStructureDescriptionImpl#getStructureDescription <em>Structure Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfStructureDescriptionImpl extends MinimalEObjectImpl.Container implements ListOfStructureDescription {
	/**
	 * The cached value of the '{@link #getStructureDescription() <em>Structure Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureDescription> structureDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfStructureDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfStructureDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureDescription> getStructureDescription() {
		if (structureDescription == null) {
			structureDescription = new EObjectContainmentEList<StructureDescription>(StructureDescription.class, this, TypesPackage.LIST_OF_STRUCTURE_DESCRIPTION__STRUCTURE_DESCRIPTION);
		}
		return structureDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_STRUCTURE_DESCRIPTION__STRUCTURE_DESCRIPTION:
				return ((InternalEList<?>)getStructureDescription()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_STRUCTURE_DESCRIPTION__STRUCTURE_DESCRIPTION:
				return getStructureDescription();
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
			case TypesPackage.LIST_OF_STRUCTURE_DESCRIPTION__STRUCTURE_DESCRIPTION:
				getStructureDescription().clear();
				getStructureDescription().addAll((Collection<? extends StructureDescription>)newValue);
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
			case TypesPackage.LIST_OF_STRUCTURE_DESCRIPTION__STRUCTURE_DESCRIPTION:
				getStructureDescription().clear();
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
			case TypesPackage.LIST_OF_STRUCTURE_DESCRIPTION__STRUCTURE_DESCRIPTION:
				return structureDescription != null && !structureDescription.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfStructureDescriptionImpl
