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

import org.opcfoundation.ua._2008._02.types.ListOfWriteValue;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.WriteValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Write Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfWriteValueImpl#getWriteValue <em>Write Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfWriteValueImpl extends MinimalEObjectImpl.Container implements ListOfWriteValue {
	/**
	 * The cached value of the '{@link #getWriteValue() <em>Write Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteValue()
	 * @generated
	 * @ordered
	 */
	protected EList<WriteValue> writeValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfWriteValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfWriteValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WriteValue> getWriteValue() {
		if (writeValue == null) {
			writeValue = new EObjectContainmentEList<WriteValue>(WriteValue.class, this, TypesPackage.LIST_OF_WRITE_VALUE__WRITE_VALUE);
		}
		return writeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_WRITE_VALUE__WRITE_VALUE:
				return ((InternalEList<?>)getWriteValue()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_WRITE_VALUE__WRITE_VALUE:
				return getWriteValue();
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
			case TypesPackage.LIST_OF_WRITE_VALUE__WRITE_VALUE:
				getWriteValue().clear();
				getWriteValue().addAll((Collection<? extends WriteValue>)newValue);
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
			case TypesPackage.LIST_OF_WRITE_VALUE__WRITE_VALUE:
				getWriteValue().clear();
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
			case TypesPackage.LIST_OF_WRITE_VALUE__WRITE_VALUE:
				return writeValue != null && !writeValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfWriteValueImpl
