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

import org.opcfoundation.ua._2008._02.types.ListOfSimpleAttributeOperand;
import org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Simple Attribute Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfSimpleAttributeOperandImpl#getSimpleAttributeOperand <em>Simple Attribute Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfSimpleAttributeOperandImpl extends MinimalEObjectImpl.Container implements ListOfSimpleAttributeOperand {
	/**
	 * The cached value of the '{@link #getSimpleAttributeOperand() <em>Simple Attribute Operand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleAttributeOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleAttributeOperand> simpleAttributeOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfSimpleAttributeOperandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfSimpleAttributeOperand();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleAttributeOperand> getSimpleAttributeOperand() {
		if (simpleAttributeOperand == null) {
			simpleAttributeOperand = new EObjectContainmentEList<SimpleAttributeOperand>(SimpleAttributeOperand.class, this, TypesPackage.LIST_OF_SIMPLE_ATTRIBUTE_OPERAND__SIMPLE_ATTRIBUTE_OPERAND);
		}
		return simpleAttributeOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_SIMPLE_ATTRIBUTE_OPERAND__SIMPLE_ATTRIBUTE_OPERAND:
				return ((InternalEList<?>)getSimpleAttributeOperand()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_SIMPLE_ATTRIBUTE_OPERAND__SIMPLE_ATTRIBUTE_OPERAND:
				return getSimpleAttributeOperand();
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
			case TypesPackage.LIST_OF_SIMPLE_ATTRIBUTE_OPERAND__SIMPLE_ATTRIBUTE_OPERAND:
				getSimpleAttributeOperand().clear();
				getSimpleAttributeOperand().addAll((Collection<? extends SimpleAttributeOperand>)newValue);
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
			case TypesPackage.LIST_OF_SIMPLE_ATTRIBUTE_OPERAND__SIMPLE_ATTRIBUTE_OPERAND:
				getSimpleAttributeOperand().clear();
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
			case TypesPackage.LIST_OF_SIMPLE_ATTRIBUTE_OPERAND__SIMPLE_ATTRIBUTE_OPERAND:
				return simpleAttributeOperand != null && !simpleAttributeOperand.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfSimpleAttributeOperandImpl
