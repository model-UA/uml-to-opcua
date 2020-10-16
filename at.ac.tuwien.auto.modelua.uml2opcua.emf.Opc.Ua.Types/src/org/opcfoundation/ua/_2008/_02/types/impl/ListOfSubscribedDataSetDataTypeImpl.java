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

import org.opcfoundation.ua._2008._02.types.ListOfSubscribedDataSetDataType;
import org.opcfoundation.ua._2008._02.types.SubscribedDataSetDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Subscribed Data Set Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfSubscribedDataSetDataTypeImpl#getSubscribedDataSetDataType <em>Subscribed Data Set Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfSubscribedDataSetDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfSubscribedDataSetDataType {
	/**
	 * The cached value of the '{@link #getSubscribedDataSetDataType() <em>Subscribed Data Set Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribedDataSetDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<SubscribedDataSetDataType> subscribedDataSetDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfSubscribedDataSetDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfSubscribedDataSetDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubscribedDataSetDataType> getSubscribedDataSetDataType() {
		if (subscribedDataSetDataType == null) {
			subscribedDataSetDataType = new EObjectContainmentEList<SubscribedDataSetDataType>(SubscribedDataSetDataType.class, this, TypesPackage.LIST_OF_SUBSCRIBED_DATA_SET_DATA_TYPE__SUBSCRIBED_DATA_SET_DATA_TYPE);
		}
		return subscribedDataSetDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_SUBSCRIBED_DATA_SET_DATA_TYPE__SUBSCRIBED_DATA_SET_DATA_TYPE:
				return ((InternalEList<?>)getSubscribedDataSetDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_SUBSCRIBED_DATA_SET_DATA_TYPE__SUBSCRIBED_DATA_SET_DATA_TYPE:
				return getSubscribedDataSetDataType();
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
			case TypesPackage.LIST_OF_SUBSCRIBED_DATA_SET_DATA_TYPE__SUBSCRIBED_DATA_SET_DATA_TYPE:
				getSubscribedDataSetDataType().clear();
				getSubscribedDataSetDataType().addAll((Collection<? extends SubscribedDataSetDataType>)newValue);
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
			case TypesPackage.LIST_OF_SUBSCRIBED_DATA_SET_DATA_TYPE__SUBSCRIBED_DATA_SET_DATA_TYPE:
				getSubscribedDataSetDataType().clear();
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
			case TypesPackage.LIST_OF_SUBSCRIBED_DATA_SET_DATA_TYPE__SUBSCRIBED_DATA_SET_DATA_TYPE:
				return subscribedDataSetDataType != null && !subscribedDataSetDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfSubscribedDataSetDataTypeImpl
