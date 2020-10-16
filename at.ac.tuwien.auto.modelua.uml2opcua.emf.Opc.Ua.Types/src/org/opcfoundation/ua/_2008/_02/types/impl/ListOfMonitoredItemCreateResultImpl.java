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

import org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemCreateResult;
import org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Monitored Item Create Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfMonitoredItemCreateResultImpl#getMonitoredItemCreateResult <em>Monitored Item Create Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfMonitoredItemCreateResultImpl extends MinimalEObjectImpl.Container implements ListOfMonitoredItemCreateResult {
	/**
	 * The cached value of the '{@link #getMonitoredItemCreateResult() <em>Monitored Item Create Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredItemCreateResult()
	 * @generated
	 * @ordered
	 */
	protected EList<MonitoredItemCreateResult> monitoredItemCreateResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfMonitoredItemCreateResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfMonitoredItemCreateResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MonitoredItemCreateResult> getMonitoredItemCreateResult() {
		if (monitoredItemCreateResult == null) {
			monitoredItemCreateResult = new EObjectContainmentEList<MonitoredItemCreateResult>(MonitoredItemCreateResult.class, this, TypesPackage.LIST_OF_MONITORED_ITEM_CREATE_RESULT__MONITORED_ITEM_CREATE_RESULT);
		}
		return monitoredItemCreateResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_MONITORED_ITEM_CREATE_RESULT__MONITORED_ITEM_CREATE_RESULT:
				return ((InternalEList<?>)getMonitoredItemCreateResult()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_MONITORED_ITEM_CREATE_RESULT__MONITORED_ITEM_CREATE_RESULT:
				return getMonitoredItemCreateResult();
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
			case TypesPackage.LIST_OF_MONITORED_ITEM_CREATE_RESULT__MONITORED_ITEM_CREATE_RESULT:
				getMonitoredItemCreateResult().clear();
				getMonitoredItemCreateResult().addAll((Collection<? extends MonitoredItemCreateResult>)newValue);
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
			case TypesPackage.LIST_OF_MONITORED_ITEM_CREATE_RESULT__MONITORED_ITEM_CREATE_RESULT:
				getMonitoredItemCreateResult().clear();
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
			case TypesPackage.LIST_OF_MONITORED_ITEM_CREATE_RESULT__MONITORED_ITEM_CREATE_RESULT:
				return monitoredItemCreateResult != null && !monitoredItemCreateResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfMonitoredItemCreateResultImpl
