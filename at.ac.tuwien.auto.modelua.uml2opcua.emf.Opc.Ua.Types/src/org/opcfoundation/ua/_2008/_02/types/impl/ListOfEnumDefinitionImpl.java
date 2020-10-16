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

import org.opcfoundation.ua._2008._02.types.EnumDefinition;
import org.opcfoundation.ua._2008._02.types.ListOfEnumDefinition;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Enum Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfEnumDefinitionImpl#getEnumDefinition <em>Enum Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfEnumDefinitionImpl extends MinimalEObjectImpl.Container implements ListOfEnumDefinition {
	/**
	 * The cached value of the '{@link #getEnumDefinition() <em>Enum Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumDefinition> enumDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfEnumDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfEnumDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumDefinition> getEnumDefinition() {
		if (enumDefinition == null) {
			enumDefinition = new EObjectContainmentEList<EnumDefinition>(EnumDefinition.class, this, TypesPackage.LIST_OF_ENUM_DEFINITION__ENUM_DEFINITION);
		}
		return enumDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_ENUM_DEFINITION__ENUM_DEFINITION:
				return ((InternalEList<?>)getEnumDefinition()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_ENUM_DEFINITION__ENUM_DEFINITION:
				return getEnumDefinition();
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
			case TypesPackage.LIST_OF_ENUM_DEFINITION__ENUM_DEFINITION:
				getEnumDefinition().clear();
				getEnumDefinition().addAll((Collection<? extends EnumDefinition>)newValue);
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
			case TypesPackage.LIST_OF_ENUM_DEFINITION__ENUM_DEFINITION:
				getEnumDefinition().clear();
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
			case TypesPackage.LIST_OF_ENUM_DEFINITION__ENUM_DEFINITION:
				return enumDefinition != null && !enumDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfEnumDefinitionImpl
