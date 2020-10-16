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

import org.opcfoundation.ua._2008._02.types.ListOfPublishedDataSetDataType;
import org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Published Data Set Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfPublishedDataSetDataTypeImpl#getPublishedDataSetDataType <em>Published Data Set Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfPublishedDataSetDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfPublishedDataSetDataType {
	/**
	 * The cached value of the '{@link #getPublishedDataSetDataType() <em>Published Data Set Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedDataSetDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<PublishedDataSetDataType> publishedDataSetDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfPublishedDataSetDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfPublishedDataSetDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PublishedDataSetDataType> getPublishedDataSetDataType() {
		if (publishedDataSetDataType == null) {
			publishedDataSetDataType = new EObjectContainmentEList<PublishedDataSetDataType>(PublishedDataSetDataType.class, this, TypesPackage.LIST_OF_PUBLISHED_DATA_SET_DATA_TYPE__PUBLISHED_DATA_SET_DATA_TYPE);
		}
		return publishedDataSetDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_PUBLISHED_DATA_SET_DATA_TYPE__PUBLISHED_DATA_SET_DATA_TYPE:
				return ((InternalEList<?>)getPublishedDataSetDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_PUBLISHED_DATA_SET_DATA_TYPE__PUBLISHED_DATA_SET_DATA_TYPE:
				return getPublishedDataSetDataType();
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
			case TypesPackage.LIST_OF_PUBLISHED_DATA_SET_DATA_TYPE__PUBLISHED_DATA_SET_DATA_TYPE:
				getPublishedDataSetDataType().clear();
				getPublishedDataSetDataType().addAll((Collection<? extends PublishedDataSetDataType>)newValue);
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
			case TypesPackage.LIST_OF_PUBLISHED_DATA_SET_DATA_TYPE__PUBLISHED_DATA_SET_DATA_TYPE:
				getPublishedDataSetDataType().clear();
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
			case TypesPackage.LIST_OF_PUBLISHED_DATA_SET_DATA_TYPE__PUBLISHED_DATA_SET_DATA_TYPE:
				return publishedDataSetDataType != null && !publishedDataSetDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfPublishedDataSetDataTypeImpl
