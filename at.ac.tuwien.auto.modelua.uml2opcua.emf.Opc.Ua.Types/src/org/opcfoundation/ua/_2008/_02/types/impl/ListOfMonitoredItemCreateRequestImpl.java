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

import org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemCreateRequest;
import org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Monitored Item Create Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfMonitoredItemCreateRequestImpl#getMonitoredItemCreateRequest <em>Monitored Item Create Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfMonitoredItemCreateRequestImpl extends MinimalEObjectImpl.Container implements ListOfMonitoredItemCreateRequest {
	/**
	 * The cached value of the '{@link #getMonitoredItemCreateRequest() <em>Monitored Item Create Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredItemCreateRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<MonitoredItemCreateRequest> monitoredItemCreateRequest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfMonitoredItemCreateRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfMonitoredItemCreateRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MonitoredItemCreateRequest> getMonitoredItemCreateRequest() {
		if (monitoredItemCreateRequest == null) {
			monitoredItemCreateRequest = new EObjectContainmentEList<MonitoredItemCreateRequest>(MonitoredItemCreateRequest.class, this, TypesPackage.LIST_OF_MONITORED_ITEM_CREATE_REQUEST__MONITORED_ITEM_CREATE_REQUEST);
		}
		return monitoredItemCreateRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_MONITORED_ITEM_CREATE_REQUEST__MONITORED_ITEM_CREATE_REQUEST:
				return ((InternalEList<?>)getMonitoredItemCreateRequest()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_MONITORED_ITEM_CREATE_REQUEST__MONITORED_ITEM_CREATE_REQUEST:
				return getMonitoredItemCreateRequest();
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
			case TypesPackage.LIST_OF_MONITORED_ITEM_CREATE_REQUEST__MONITORED_ITEM_CREATE_REQUEST:
				getMonitoredItemCreateRequest().clear();
				getMonitoredItemCreateRequest().addAll((Collection<? extends MonitoredItemCreateRequest>)newValue);
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
			case TypesPackage.LIST_OF_MONITORED_ITEM_CREATE_REQUEST__MONITORED_ITEM_CREATE_REQUEST:
				getMonitoredItemCreateRequest().clear();
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
			case TypesPackage.LIST_OF_MONITORED_ITEM_CREATE_REQUEST__MONITORED_ITEM_CREATE_REQUEST:
				return monitoredItemCreateRequest != null && !monitoredItemCreateRequest.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfMonitoredItemCreateRequestImpl
