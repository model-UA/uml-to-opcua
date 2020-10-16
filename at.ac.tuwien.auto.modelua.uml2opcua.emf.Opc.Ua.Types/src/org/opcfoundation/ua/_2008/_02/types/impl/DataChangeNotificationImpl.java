/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.DataChangeNotification;
import org.opcfoundation.ua._2008._02.types.ListOfDiagnosticInfo;
import org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemNotification;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Change Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataChangeNotificationImpl#getMonitoredItems <em>Monitored Items</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataChangeNotificationImpl#getDiagnosticInfos <em>Diagnostic Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataChangeNotificationImpl extends NotificationDataImpl implements DataChangeNotification {
	/**
	 * The cached value of the '{@link #getMonitoredItems() <em>Monitored Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredItems()
	 * @generated
	 * @ordered
	 */
	protected ListOfMonitoredItemNotification monitoredItems;

	/**
	 * This is true if the Monitored Items containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean monitoredItemsESet;

	/**
	 * The cached value of the '{@link #getDiagnosticInfos() <em>Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticInfos()
	 * @generated
	 * @ordered
	 */
	protected ListOfDiagnosticInfo diagnosticInfos;

	/**
	 * This is true if the Diagnostic Infos containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean diagnosticInfosESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataChangeNotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getDataChangeNotification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfMonitoredItemNotification getMonitoredItems() {
		return monitoredItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoredItems(ListOfMonitoredItemNotification newMonitoredItems, NotificationChain msgs) {
		ListOfMonitoredItemNotification oldMonitoredItems = monitoredItems;
		monitoredItems = newMonitoredItems;
		boolean oldMonitoredItemsESet = monitoredItemsESet;
		monitoredItemsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_CHANGE_NOTIFICATION__MONITORED_ITEMS, oldMonitoredItems, newMonitoredItems, !oldMonitoredItemsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoredItems(ListOfMonitoredItemNotification newMonitoredItems) {
		if (newMonitoredItems != monitoredItems) {
			NotificationChain msgs = null;
			if (monitoredItems != null)
				msgs = ((InternalEObject)monitoredItems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_CHANGE_NOTIFICATION__MONITORED_ITEMS, null, msgs);
			if (newMonitoredItems != null)
				msgs = ((InternalEObject)newMonitoredItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_CHANGE_NOTIFICATION__MONITORED_ITEMS, null, msgs);
			msgs = basicSetMonitoredItems(newMonitoredItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMonitoredItemsESet = monitoredItemsESet;
			monitoredItemsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_CHANGE_NOTIFICATION__MONITORED_ITEMS, newMonitoredItems, newMonitoredItems, !oldMonitoredItemsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetMonitoredItems(NotificationChain msgs) {
		ListOfMonitoredItemNotification oldMonitoredItems = monitoredItems;
		monitoredItems = null;
		boolean oldMonitoredItemsESet = monitoredItemsESet;
		monitoredItemsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_CHANGE_NOTIFICATION__MONITORED_ITEMS, oldMonitoredItems, null, oldMonitoredItemsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMonitoredItems() {
		if (monitoredItems != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)monitoredItems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_CHANGE_NOTIFICATION__MONITORED_ITEMS, null, msgs);
			msgs = basicUnsetMonitoredItems(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMonitoredItemsESet = monitoredItemsESet;
			monitoredItemsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_CHANGE_NOTIFICATION__MONITORED_ITEMS, null, null, oldMonitoredItemsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMonitoredItems() {
		return monitoredItemsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDiagnosticInfo getDiagnosticInfos() {
		return diagnosticInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosticInfos(ListOfDiagnosticInfo newDiagnosticInfos, NotificationChain msgs) {
		ListOfDiagnosticInfo oldDiagnosticInfos = diagnosticInfos;
		diagnosticInfos = newDiagnosticInfos;
		boolean oldDiagnosticInfosESet = diagnosticInfosESet;
		diagnosticInfosESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_CHANGE_NOTIFICATION__DIAGNOSTIC_INFOS, oldDiagnosticInfos, newDiagnosticInfos, !oldDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnosticInfos(ListOfDiagnosticInfo newDiagnosticInfos) {
		if (newDiagnosticInfos != diagnosticInfos) {
			NotificationChain msgs = null;
			if (diagnosticInfos != null)
				msgs = ((InternalEObject)diagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_CHANGE_NOTIFICATION__DIAGNOSTIC_INFOS, null, msgs);
			if (newDiagnosticInfos != null)
				msgs = ((InternalEObject)newDiagnosticInfos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_CHANGE_NOTIFICATION__DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicSetDiagnosticInfos(newDiagnosticInfos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiagnosticInfosESet = diagnosticInfosESet;
			diagnosticInfosESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_CHANGE_NOTIFICATION__DIAGNOSTIC_INFOS, newDiagnosticInfos, newDiagnosticInfos, !oldDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDiagnosticInfos(NotificationChain msgs) {
		ListOfDiagnosticInfo oldDiagnosticInfos = diagnosticInfos;
		diagnosticInfos = null;
		boolean oldDiagnosticInfosESet = diagnosticInfosESet;
		diagnosticInfosESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_CHANGE_NOTIFICATION__DIAGNOSTIC_INFOS, oldDiagnosticInfos, null, oldDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDiagnosticInfos() {
		if (diagnosticInfos != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)diagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_CHANGE_NOTIFICATION__DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicUnsetDiagnosticInfos(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiagnosticInfosESet = diagnosticInfosESet;
			diagnosticInfosESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_CHANGE_NOTIFICATION__DIAGNOSTIC_INFOS, null, null, oldDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiagnosticInfos() {
		return diagnosticInfosESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DATA_CHANGE_NOTIFICATION__MONITORED_ITEMS:
				return basicUnsetMonitoredItems(msgs);
			case TypesPackage.DATA_CHANGE_NOTIFICATION__DIAGNOSTIC_INFOS:
				return basicUnsetDiagnosticInfos(msgs);
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
			case TypesPackage.DATA_CHANGE_NOTIFICATION__MONITORED_ITEMS:
				return getMonitoredItems();
			case TypesPackage.DATA_CHANGE_NOTIFICATION__DIAGNOSTIC_INFOS:
				return getDiagnosticInfos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.DATA_CHANGE_NOTIFICATION__MONITORED_ITEMS:
				setMonitoredItems((ListOfMonitoredItemNotification)newValue);
				return;
			case TypesPackage.DATA_CHANGE_NOTIFICATION__DIAGNOSTIC_INFOS:
				setDiagnosticInfos((ListOfDiagnosticInfo)newValue);
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
			case TypesPackage.DATA_CHANGE_NOTIFICATION__MONITORED_ITEMS:
				unsetMonitoredItems();
				return;
			case TypesPackage.DATA_CHANGE_NOTIFICATION__DIAGNOSTIC_INFOS:
				unsetDiagnosticInfos();
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
			case TypesPackage.DATA_CHANGE_NOTIFICATION__MONITORED_ITEMS:
				return isSetMonitoredItems();
			case TypesPackage.DATA_CHANGE_NOTIFICATION__DIAGNOSTIC_INFOS:
				return isSetDiagnosticInfos();
		}
		return super.eIsSet(featureID);
	}

} //DataChangeNotificationImpl
