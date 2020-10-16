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

import org.opcfoundation.ua._2008._02.types.EventFieldList;
import org.opcfoundation.ua._2008._02.types.ListOfEventFieldList;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Event Field List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfEventFieldListImpl#getEventFieldList <em>Event Field List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfEventFieldListImpl extends MinimalEObjectImpl.Container implements ListOfEventFieldList {
	/**
	 * The cached value of the '{@link #getEventFieldList() <em>Event Field List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventFieldList()
	 * @generated
	 * @ordered
	 */
	protected EList<EventFieldList> eventFieldList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfEventFieldListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfEventFieldList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventFieldList> getEventFieldList() {
		if (eventFieldList == null) {
			eventFieldList = new EObjectContainmentEList<EventFieldList>(EventFieldList.class, this, TypesPackage.LIST_OF_EVENT_FIELD_LIST__EVENT_FIELD_LIST);
		}
		return eventFieldList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_EVENT_FIELD_LIST__EVENT_FIELD_LIST:
				return ((InternalEList<?>)getEventFieldList()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_EVENT_FIELD_LIST__EVENT_FIELD_LIST:
				return getEventFieldList();
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
			case TypesPackage.LIST_OF_EVENT_FIELD_LIST__EVENT_FIELD_LIST:
				getEventFieldList().clear();
				getEventFieldList().addAll((Collection<? extends EventFieldList>)newValue);
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
			case TypesPackage.LIST_OF_EVENT_FIELD_LIST__EVENT_FIELD_LIST:
				getEventFieldList().clear();
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
			case TypesPackage.LIST_OF_EVENT_FIELD_LIST__EVENT_FIELD_LIST:
				return eventFieldList != null && !eventFieldList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfEventFieldListImpl
