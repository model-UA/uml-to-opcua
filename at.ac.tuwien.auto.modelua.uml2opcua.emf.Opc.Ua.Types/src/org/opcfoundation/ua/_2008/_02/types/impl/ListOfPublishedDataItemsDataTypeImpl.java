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

import org.opcfoundation.ua._2008._02.types.ListOfPublishedDataItemsDataType;
import org.opcfoundation.ua._2008._02.types.PublishedDataItemsDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Published Data Items Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfPublishedDataItemsDataTypeImpl#getPublishedDataItemsDataType <em>Published Data Items Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfPublishedDataItemsDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfPublishedDataItemsDataType {
	/**
	 * The cached value of the '{@link #getPublishedDataItemsDataType() <em>Published Data Items Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedDataItemsDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<PublishedDataItemsDataType> publishedDataItemsDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfPublishedDataItemsDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfPublishedDataItemsDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PublishedDataItemsDataType> getPublishedDataItemsDataType() {
		if (publishedDataItemsDataType == null) {
			publishedDataItemsDataType = new EObjectContainmentEList<PublishedDataItemsDataType>(PublishedDataItemsDataType.class, this, TypesPackage.LIST_OF_PUBLISHED_DATA_ITEMS_DATA_TYPE__PUBLISHED_DATA_ITEMS_DATA_TYPE);
		}
		return publishedDataItemsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_PUBLISHED_DATA_ITEMS_DATA_TYPE__PUBLISHED_DATA_ITEMS_DATA_TYPE:
				return ((InternalEList<?>)getPublishedDataItemsDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_PUBLISHED_DATA_ITEMS_DATA_TYPE__PUBLISHED_DATA_ITEMS_DATA_TYPE:
				return getPublishedDataItemsDataType();
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
			case TypesPackage.LIST_OF_PUBLISHED_DATA_ITEMS_DATA_TYPE__PUBLISHED_DATA_ITEMS_DATA_TYPE:
				getPublishedDataItemsDataType().clear();
				getPublishedDataItemsDataType().addAll((Collection<? extends PublishedDataItemsDataType>)newValue);
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
			case TypesPackage.LIST_OF_PUBLISHED_DATA_ITEMS_DATA_TYPE__PUBLISHED_DATA_ITEMS_DATA_TYPE:
				getPublishedDataItemsDataType().clear();
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
			case TypesPackage.LIST_OF_PUBLISHED_DATA_ITEMS_DATA_TYPE__PUBLISHED_DATA_ITEMS_DATA_TYPE:
				return publishedDataItemsDataType != null && !publishedDataItemsDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfPublishedDataItemsDataTypeImpl
