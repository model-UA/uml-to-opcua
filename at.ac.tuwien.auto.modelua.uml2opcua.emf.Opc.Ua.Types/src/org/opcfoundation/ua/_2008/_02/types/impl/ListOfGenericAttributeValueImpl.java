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

import org.opcfoundation.ua._2008._02.types.GenericAttributeValue;
import org.opcfoundation.ua._2008._02.types.ListOfGenericAttributeValue;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Generic Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfGenericAttributeValueImpl#getGenericAttributeValue <em>Generic Attribute Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfGenericAttributeValueImpl extends MinimalEObjectImpl.Container implements ListOfGenericAttributeValue {
	/**
	 * The cached value of the '{@link #getGenericAttributeValue() <em>Generic Attribute Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericAttributeValue()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericAttributeValue> genericAttributeValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfGenericAttributeValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfGenericAttributeValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericAttributeValue> getGenericAttributeValue() {
		if (genericAttributeValue == null) {
			genericAttributeValue = new EObjectContainmentEList<GenericAttributeValue>(GenericAttributeValue.class, this, TypesPackage.LIST_OF_GENERIC_ATTRIBUTE_VALUE__GENERIC_ATTRIBUTE_VALUE);
		}
		return genericAttributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_GENERIC_ATTRIBUTE_VALUE__GENERIC_ATTRIBUTE_VALUE:
				return ((InternalEList<?>)getGenericAttributeValue()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_GENERIC_ATTRIBUTE_VALUE__GENERIC_ATTRIBUTE_VALUE:
				return getGenericAttributeValue();
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
			case TypesPackage.LIST_OF_GENERIC_ATTRIBUTE_VALUE__GENERIC_ATTRIBUTE_VALUE:
				getGenericAttributeValue().clear();
				getGenericAttributeValue().addAll((Collection<? extends GenericAttributeValue>)newValue);
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
			case TypesPackage.LIST_OF_GENERIC_ATTRIBUTE_VALUE__GENERIC_ATTRIBUTE_VALUE:
				getGenericAttributeValue().clear();
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
			case TypesPackage.LIST_OF_GENERIC_ATTRIBUTE_VALUE__GENERIC_ATTRIBUTE_VALUE:
				return genericAttributeValue != null && !genericAttributeValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfGenericAttributeValueImpl
