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

import org.opcfoundation.ua._2008._02.types.ListOfSubscribedDataSetMirrorDataType;
import org.opcfoundation.ua._2008._02.types.SubscribedDataSetMirrorDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Subscribed Data Set Mirror Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfSubscribedDataSetMirrorDataTypeImpl#getSubscribedDataSetMirrorDataType <em>Subscribed Data Set Mirror Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfSubscribedDataSetMirrorDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfSubscribedDataSetMirrorDataType {
	/**
	 * The cached value of the '{@link #getSubscribedDataSetMirrorDataType() <em>Subscribed Data Set Mirror Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribedDataSetMirrorDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<SubscribedDataSetMirrorDataType> subscribedDataSetMirrorDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfSubscribedDataSetMirrorDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfSubscribedDataSetMirrorDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubscribedDataSetMirrorDataType> getSubscribedDataSetMirrorDataType() {
		if (subscribedDataSetMirrorDataType == null) {
			subscribedDataSetMirrorDataType = new EObjectContainmentEList<SubscribedDataSetMirrorDataType>(SubscribedDataSetMirrorDataType.class, this, TypesPackage.LIST_OF_SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE);
		}
		return subscribedDataSetMirrorDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE:
				return ((InternalEList<?>)getSubscribedDataSetMirrorDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE:
				return getSubscribedDataSetMirrorDataType();
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
			case TypesPackage.LIST_OF_SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE:
				getSubscribedDataSetMirrorDataType().clear();
				getSubscribedDataSetMirrorDataType().addAll((Collection<? extends SubscribedDataSetMirrorDataType>)newValue);
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
			case TypesPackage.LIST_OF_SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE:
				getSubscribedDataSetMirrorDataType().clear();
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
			case TypesPackage.LIST_OF_SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE__SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE:
				return subscribedDataSetMirrorDataType != null && !subscribedDataSetMirrorDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfSubscribedDataSetMirrorDataTypeImpl
