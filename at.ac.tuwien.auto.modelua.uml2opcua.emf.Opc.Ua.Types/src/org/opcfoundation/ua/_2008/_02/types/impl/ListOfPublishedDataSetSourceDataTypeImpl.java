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

import org.opcfoundation.ua._2008._02.types.ListOfPublishedDataSetSourceDataType;
import org.opcfoundation.ua._2008._02.types.PublishedDataSetSourceDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Published Data Set Source Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfPublishedDataSetSourceDataTypeImpl#getPublishedDataSetSourceDataType <em>Published Data Set Source Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfPublishedDataSetSourceDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfPublishedDataSetSourceDataType {
	/**
	 * The cached value of the '{@link #getPublishedDataSetSourceDataType() <em>Published Data Set Source Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedDataSetSourceDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<PublishedDataSetSourceDataType> publishedDataSetSourceDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfPublishedDataSetSourceDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfPublishedDataSetSourceDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PublishedDataSetSourceDataType> getPublishedDataSetSourceDataType() {
		if (publishedDataSetSourceDataType == null) {
			publishedDataSetSourceDataType = new EObjectContainmentEList<PublishedDataSetSourceDataType>(PublishedDataSetSourceDataType.class, this, TypesPackage.LIST_OF_PUBLISHED_DATA_SET_SOURCE_DATA_TYPE__PUBLISHED_DATA_SET_SOURCE_DATA_TYPE);
		}
		return publishedDataSetSourceDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_PUBLISHED_DATA_SET_SOURCE_DATA_TYPE__PUBLISHED_DATA_SET_SOURCE_DATA_TYPE:
				return ((InternalEList<?>)getPublishedDataSetSourceDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_PUBLISHED_DATA_SET_SOURCE_DATA_TYPE__PUBLISHED_DATA_SET_SOURCE_DATA_TYPE:
				return getPublishedDataSetSourceDataType();
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
			case TypesPackage.LIST_OF_PUBLISHED_DATA_SET_SOURCE_DATA_TYPE__PUBLISHED_DATA_SET_SOURCE_DATA_TYPE:
				getPublishedDataSetSourceDataType().clear();
				getPublishedDataSetSourceDataType().addAll((Collection<? extends PublishedDataSetSourceDataType>)newValue);
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
			case TypesPackage.LIST_OF_PUBLISHED_DATA_SET_SOURCE_DATA_TYPE__PUBLISHED_DATA_SET_SOURCE_DATA_TYPE:
				getPublishedDataSetSourceDataType().clear();
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
			case TypesPackage.LIST_OF_PUBLISHED_DATA_SET_SOURCE_DATA_TYPE__PUBLISHED_DATA_SET_SOURCE_DATA_TYPE:
				return publishedDataSetSourceDataType != null && !publishedDataSetSourceDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfPublishedDataSetSourceDataTypeImpl
