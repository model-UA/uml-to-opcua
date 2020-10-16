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

import org.opcfoundation.ua._2008._02.types.ListOfStructureDefinition;
import org.opcfoundation.ua._2008._02.types.StructureDefinition;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Structure Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfStructureDefinitionImpl#getStructureDefinition <em>Structure Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfStructureDefinitionImpl extends MinimalEObjectImpl.Container implements ListOfStructureDefinition {
	/**
	 * The cached value of the '{@link #getStructureDefinition() <em>Structure Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureDefinition> structureDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfStructureDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfStructureDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureDefinition> getStructureDefinition() {
		if (structureDefinition == null) {
			structureDefinition = new EObjectContainmentEList<StructureDefinition>(StructureDefinition.class, this, TypesPackage.LIST_OF_STRUCTURE_DEFINITION__STRUCTURE_DEFINITION);
		}
		return structureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_STRUCTURE_DEFINITION__STRUCTURE_DEFINITION:
				return ((InternalEList<?>)getStructureDefinition()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_STRUCTURE_DEFINITION__STRUCTURE_DEFINITION:
				return getStructureDefinition();
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
			case TypesPackage.LIST_OF_STRUCTURE_DEFINITION__STRUCTURE_DEFINITION:
				getStructureDefinition().clear();
				getStructureDefinition().addAll((Collection<? extends StructureDefinition>)newValue);
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
			case TypesPackage.LIST_OF_STRUCTURE_DEFINITION__STRUCTURE_DEFINITION:
				getStructureDefinition().clear();
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
			case TypesPackage.LIST_OF_STRUCTURE_DEFINITION__STRUCTURE_DEFINITION:
				return structureDefinition != null && !structureDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfStructureDefinitionImpl
