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

import org.opcfoundation.ua._2008._02.types.ListOfSemanticChangeStructureDataType;
import org.opcfoundation.ua._2008._02.types.SemanticChangeStructureDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Semantic Change Structure Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfSemanticChangeStructureDataTypeImpl#getSemanticChangeStructureDataType <em>Semantic Change Structure Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfSemanticChangeStructureDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfSemanticChangeStructureDataType {
	/**
	 * The cached value of the '{@link #getSemanticChangeStructureDataType() <em>Semantic Change Structure Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticChangeStructureDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticChangeStructureDataType> semanticChangeStructureDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfSemanticChangeStructureDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfSemanticChangeStructureDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticChangeStructureDataType> getSemanticChangeStructureDataType() {
		if (semanticChangeStructureDataType == null) {
			semanticChangeStructureDataType = new EObjectContainmentEList<SemanticChangeStructureDataType>(SemanticChangeStructureDataType.class, this, TypesPackage.LIST_OF_SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE);
		}
		return semanticChangeStructureDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE:
				return ((InternalEList<?>)getSemanticChangeStructureDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE:
				return getSemanticChangeStructureDataType();
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
			case TypesPackage.LIST_OF_SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE:
				getSemanticChangeStructureDataType().clear();
				getSemanticChangeStructureDataType().addAll((Collection<? extends SemanticChangeStructureDataType>)newValue);
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
			case TypesPackage.LIST_OF_SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE:
				getSemanticChangeStructureDataType().clear();
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
			case TypesPackage.LIST_OF_SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE__SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE:
				return semanticChangeStructureDataType != null && !semanticChangeStructureDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfSemanticChangeStructureDataTypeImpl
