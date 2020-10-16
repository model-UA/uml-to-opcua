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

import org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemModifyResult;
import org.opcfoundation.ua._2008._02.types.MonitoredItemModifyResult;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Monitored Item Modify Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfMonitoredItemModifyResultImpl#getMonitoredItemModifyResult <em>Monitored Item Modify Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfMonitoredItemModifyResultImpl extends MinimalEObjectImpl.Container implements ListOfMonitoredItemModifyResult {
	/**
	 * The cached value of the '{@link #getMonitoredItemModifyResult() <em>Monitored Item Modify Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredItemModifyResult()
	 * @generated
	 * @ordered
	 */
	protected EList<MonitoredItemModifyResult> monitoredItemModifyResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfMonitoredItemModifyResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfMonitoredItemModifyResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MonitoredItemModifyResult> getMonitoredItemModifyResult() {
		if (monitoredItemModifyResult == null) {
			monitoredItemModifyResult = new EObjectContainmentEList<MonitoredItemModifyResult>(MonitoredItemModifyResult.class, this, TypesPackage.LIST_OF_MONITORED_ITEM_MODIFY_RESULT__MONITORED_ITEM_MODIFY_RESULT);
		}
		return monitoredItemModifyResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_MONITORED_ITEM_MODIFY_RESULT__MONITORED_ITEM_MODIFY_RESULT:
				return ((InternalEList<?>)getMonitoredItemModifyResult()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_MONITORED_ITEM_MODIFY_RESULT__MONITORED_ITEM_MODIFY_RESULT:
				return getMonitoredItemModifyResult();
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
			case TypesPackage.LIST_OF_MONITORED_ITEM_MODIFY_RESULT__MONITORED_ITEM_MODIFY_RESULT:
				getMonitoredItemModifyResult().clear();
				getMonitoredItemModifyResult().addAll((Collection<? extends MonitoredItemModifyResult>)newValue);
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
			case TypesPackage.LIST_OF_MONITORED_ITEM_MODIFY_RESULT__MONITORED_ITEM_MODIFY_RESULT:
				getMonitoredItemModifyResult().clear();
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
			case TypesPackage.LIST_OF_MONITORED_ITEM_MODIFY_RESULT__MONITORED_ITEM_MODIFY_RESULT:
				return monitoredItemModifyResult != null && !monitoredItemModifyResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfMonitoredItemModifyResultImpl
