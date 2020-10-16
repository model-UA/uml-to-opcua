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

import org.opcfoundation.ua._2008._02.types.ListOfPubSubGroupDataType;
import org.opcfoundation.ua._2008._02.types.PubSubGroupDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Pub Sub Group Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfPubSubGroupDataTypeImpl#getPubSubGroupDataType <em>Pub Sub Group Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfPubSubGroupDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfPubSubGroupDataType {
	/**
	 * The cached value of the '{@link #getPubSubGroupDataType() <em>Pub Sub Group Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubSubGroupDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<PubSubGroupDataType> pubSubGroupDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfPubSubGroupDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfPubSubGroupDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PubSubGroupDataType> getPubSubGroupDataType() {
		if (pubSubGroupDataType == null) {
			pubSubGroupDataType = new EObjectContainmentEList<PubSubGroupDataType>(PubSubGroupDataType.class, this, TypesPackage.LIST_OF_PUB_SUB_GROUP_DATA_TYPE__PUB_SUB_GROUP_DATA_TYPE);
		}
		return pubSubGroupDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_PUB_SUB_GROUP_DATA_TYPE__PUB_SUB_GROUP_DATA_TYPE:
				return ((InternalEList<?>)getPubSubGroupDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_PUB_SUB_GROUP_DATA_TYPE__PUB_SUB_GROUP_DATA_TYPE:
				return getPubSubGroupDataType();
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
			case TypesPackage.LIST_OF_PUB_SUB_GROUP_DATA_TYPE__PUB_SUB_GROUP_DATA_TYPE:
				getPubSubGroupDataType().clear();
				getPubSubGroupDataType().addAll((Collection<? extends PubSubGroupDataType>)newValue);
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
			case TypesPackage.LIST_OF_PUB_SUB_GROUP_DATA_TYPE__PUB_SUB_GROUP_DATA_TYPE:
				getPubSubGroupDataType().clear();
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
			case TypesPackage.LIST_OF_PUB_SUB_GROUP_DATA_TYPE__PUB_SUB_GROUP_DATA_TYPE:
				return pubSubGroupDataType != null && !pubSubGroupDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfPubSubGroupDataTypeImpl
