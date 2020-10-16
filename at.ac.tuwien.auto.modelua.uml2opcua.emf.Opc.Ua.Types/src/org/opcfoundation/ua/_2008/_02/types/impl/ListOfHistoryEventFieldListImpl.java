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

import org.opcfoundation.ua._2008._02.types.HistoryEventFieldList;
import org.opcfoundation.ua._2008._02.types.ListOfHistoryEventFieldList;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of History Event Field List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfHistoryEventFieldListImpl#getHistoryEventFieldList <em>History Event Field List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfHistoryEventFieldListImpl extends MinimalEObjectImpl.Container implements ListOfHistoryEventFieldList {
	/**
	 * The cached value of the '{@link #getHistoryEventFieldList() <em>History Event Field List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryEventFieldList()
	 * @generated
	 * @ordered
	 */
	protected EList<HistoryEventFieldList> historyEventFieldList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfHistoryEventFieldListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfHistoryEventFieldList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HistoryEventFieldList> getHistoryEventFieldList() {
		if (historyEventFieldList == null) {
			historyEventFieldList = new EObjectContainmentEList<HistoryEventFieldList>(HistoryEventFieldList.class, this, TypesPackage.LIST_OF_HISTORY_EVENT_FIELD_LIST__HISTORY_EVENT_FIELD_LIST);
		}
		return historyEventFieldList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_HISTORY_EVENT_FIELD_LIST__HISTORY_EVENT_FIELD_LIST:
				return ((InternalEList<?>)getHistoryEventFieldList()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_HISTORY_EVENT_FIELD_LIST__HISTORY_EVENT_FIELD_LIST:
				return getHistoryEventFieldList();
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
			case TypesPackage.LIST_OF_HISTORY_EVENT_FIELD_LIST__HISTORY_EVENT_FIELD_LIST:
				getHistoryEventFieldList().clear();
				getHistoryEventFieldList().addAll((Collection<? extends HistoryEventFieldList>)newValue);
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
			case TypesPackage.LIST_OF_HISTORY_EVENT_FIELD_LIST__HISTORY_EVENT_FIELD_LIST:
				getHistoryEventFieldList().clear();
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
			case TypesPackage.LIST_OF_HISTORY_EVENT_FIELD_LIST__HISTORY_EVENT_FIELD_LIST:
				return historyEventFieldList != null && !historyEventFieldList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfHistoryEventFieldListImpl
