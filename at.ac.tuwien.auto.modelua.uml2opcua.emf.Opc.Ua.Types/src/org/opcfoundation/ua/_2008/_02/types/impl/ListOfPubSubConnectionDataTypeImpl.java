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

import org.opcfoundation.ua._2008._02.types.ListOfPubSubConnectionDataType;
import org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Pub Sub Connection Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfPubSubConnectionDataTypeImpl#getPubSubConnectionDataType <em>Pub Sub Connection Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfPubSubConnectionDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfPubSubConnectionDataType {
	/**
	 * The cached value of the '{@link #getPubSubConnectionDataType() <em>Pub Sub Connection Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubSubConnectionDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<PubSubConnectionDataType> pubSubConnectionDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfPubSubConnectionDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfPubSubConnectionDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PubSubConnectionDataType> getPubSubConnectionDataType() {
		if (pubSubConnectionDataType == null) {
			pubSubConnectionDataType = new EObjectContainmentEList<PubSubConnectionDataType>(PubSubConnectionDataType.class, this, TypesPackage.LIST_OF_PUB_SUB_CONNECTION_DATA_TYPE__PUB_SUB_CONNECTION_DATA_TYPE);
		}
		return pubSubConnectionDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_PUB_SUB_CONNECTION_DATA_TYPE__PUB_SUB_CONNECTION_DATA_TYPE:
				return ((InternalEList<?>)getPubSubConnectionDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_PUB_SUB_CONNECTION_DATA_TYPE__PUB_SUB_CONNECTION_DATA_TYPE:
				return getPubSubConnectionDataType();
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
			case TypesPackage.LIST_OF_PUB_SUB_CONNECTION_DATA_TYPE__PUB_SUB_CONNECTION_DATA_TYPE:
				getPubSubConnectionDataType().clear();
				getPubSubConnectionDataType().addAll((Collection<? extends PubSubConnectionDataType>)newValue);
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
			case TypesPackage.LIST_OF_PUB_SUB_CONNECTION_DATA_TYPE__PUB_SUB_CONNECTION_DATA_TYPE:
				getPubSubConnectionDataType().clear();
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
			case TypesPackage.LIST_OF_PUB_SUB_CONNECTION_DATA_TYPE__PUB_SUB_CONNECTION_DATA_TYPE:
				return pubSubConnectionDataType != null && !pubSubConnectionDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfPubSubConnectionDataTypeImpl
