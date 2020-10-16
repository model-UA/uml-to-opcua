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

import org.opcfoundation.ua._2008._02.types.ListOfPublishedEventsDataType;
import org.opcfoundation.ua._2008._02.types.PublishedEventsDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Published Events Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfPublishedEventsDataTypeImpl#getPublishedEventsDataType <em>Published Events Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfPublishedEventsDataTypeImpl extends MinimalEObjectImpl.Container implements ListOfPublishedEventsDataType {
	/**
	 * The cached value of the '{@link #getPublishedEventsDataType() <em>Published Events Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedEventsDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<PublishedEventsDataType> publishedEventsDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfPublishedEventsDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfPublishedEventsDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PublishedEventsDataType> getPublishedEventsDataType() {
		if (publishedEventsDataType == null) {
			publishedEventsDataType = new EObjectContainmentEList<PublishedEventsDataType>(PublishedEventsDataType.class, this, TypesPackage.LIST_OF_PUBLISHED_EVENTS_DATA_TYPE__PUBLISHED_EVENTS_DATA_TYPE);
		}
		return publishedEventsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_PUBLISHED_EVENTS_DATA_TYPE__PUBLISHED_EVENTS_DATA_TYPE:
				return ((InternalEList<?>)getPublishedEventsDataType()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_PUBLISHED_EVENTS_DATA_TYPE__PUBLISHED_EVENTS_DATA_TYPE:
				return getPublishedEventsDataType();
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
			case TypesPackage.LIST_OF_PUBLISHED_EVENTS_DATA_TYPE__PUBLISHED_EVENTS_DATA_TYPE:
				getPublishedEventsDataType().clear();
				getPublishedEventsDataType().addAll((Collection<? extends PublishedEventsDataType>)newValue);
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
			case TypesPackage.LIST_OF_PUBLISHED_EVENTS_DATA_TYPE__PUBLISHED_EVENTS_DATA_TYPE:
				getPublishedEventsDataType().clear();
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
			case TypesPackage.LIST_OF_PUBLISHED_EVENTS_DATA_TYPE__PUBLISHED_EVENTS_DATA_TYPE:
				return publishedEventsDataType != null && !publishedEventsDataType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfPublishedEventsDataTypeImpl
