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

import org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemNotification;
import org.opcfoundation.ua._2008._02.types.MonitoredItemNotification;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Monitored Item Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ListOfMonitoredItemNotificationImpl#getMonitoredItemNotification <em>Monitored Item Notification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfMonitoredItemNotificationImpl extends MinimalEObjectImpl.Container implements ListOfMonitoredItemNotification {
	/**
	 * The cached value of the '{@link #getMonitoredItemNotification() <em>Monitored Item Notification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredItemNotification()
	 * @generated
	 * @ordered
	 */
	protected EList<MonitoredItemNotification> monitoredItemNotification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfMonitoredItemNotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getListOfMonitoredItemNotification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MonitoredItemNotification> getMonitoredItemNotification() {
		if (monitoredItemNotification == null) {
			monitoredItemNotification = new EObjectContainmentEList<MonitoredItemNotification>(MonitoredItemNotification.class, this, TypesPackage.LIST_OF_MONITORED_ITEM_NOTIFICATION__MONITORED_ITEM_NOTIFICATION);
		}
		return monitoredItemNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.LIST_OF_MONITORED_ITEM_NOTIFICATION__MONITORED_ITEM_NOTIFICATION:
				return ((InternalEList<?>)getMonitoredItemNotification()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.LIST_OF_MONITORED_ITEM_NOTIFICATION__MONITORED_ITEM_NOTIFICATION:
				return getMonitoredItemNotification();
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
			case TypesPackage.LIST_OF_MONITORED_ITEM_NOTIFICATION__MONITORED_ITEM_NOTIFICATION:
				getMonitoredItemNotification().clear();
				getMonitoredItemNotification().addAll((Collection<? extends MonitoredItemNotification>)newValue);
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
			case TypesPackage.LIST_OF_MONITORED_ITEM_NOTIFICATION__MONITORED_ITEM_NOTIFICATION:
				getMonitoredItemNotification().clear();
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
			case TypesPackage.LIST_OF_MONITORED_ITEM_NOTIFICATION__MONITORED_ITEM_NOTIFICATION:
				return monitoredItemNotification != null && !monitoredItemNotification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfMonitoredItemNotificationImpl
