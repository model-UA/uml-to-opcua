/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfUInt32;
import org.opcfoundation.ua._2008._02.types.MonitoringMode;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Monitoring Mode Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SetMonitoringModeRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SetMonitoringModeRequestImpl#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SetMonitoringModeRequestImpl#getMonitoringMode <em>Monitoring Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SetMonitoringModeRequestImpl#getMonitoredItemIds <em>Monitored Item Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetMonitoringModeRequestImpl extends MinimalEObjectImpl.Container implements SetMonitoringModeRequest {
	/**
	 * The cached value of the '{@link #getRequestHeader() <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestHeader()
	 * @generated
	 * @ordered
	 */
	protected RequestHeader requestHeader;

	/**
	 * This is true if the Request Header containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestHeaderESet;

	/**
	 * The default value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected static final long SUBSCRIPTION_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected long subscriptionId = SUBSCRIPTION_ID_EDEFAULT;

	/**
	 * This is true if the Subscription Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subscriptionIdESet;

	/**
	 * The default value of the '{@link #getMonitoringMode() <em>Monitoring Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringMode()
	 * @generated
	 * @ordered
	 */
	protected static final MonitoringMode MONITORING_MODE_EDEFAULT = MonitoringMode.DISABLED0;

	/**
	 * The cached value of the '{@link #getMonitoringMode() <em>Monitoring Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringMode()
	 * @generated
	 * @ordered
	 */
	protected MonitoringMode monitoringMode = MONITORING_MODE_EDEFAULT;

	/**
	 * This is true if the Monitoring Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean monitoringModeESet;

	/**
	 * The cached value of the '{@link #getMonitoredItemIds() <em>Monitored Item Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredItemIds()
	 * @generated
	 * @ordered
	 */
	protected ListOfUInt32 monitoredItemIds;

	/**
	 * This is true if the Monitored Item Ids containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean monitoredItemIdsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetMonitoringModeRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getSetMonitoringModeRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestHeader getRequestHeader() {
		return requestHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestHeader(RequestHeader newRequestHeader, NotificationChain msgs) {
		RequestHeader oldRequestHeader = requestHeader;
		requestHeader = newRequestHeader;
		boolean oldRequestHeaderESet = requestHeaderESet;
		requestHeaderESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SET_MONITORING_MODE_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestHeader(RequestHeader newRequestHeader) {
		if (newRequestHeader != requestHeader) {
			NotificationChain msgs = null;
			if (requestHeader != null)
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_MONITORING_MODE_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_MONITORING_MODE_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SET_MONITORING_MODE_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRequestHeader(NotificationChain msgs) {
		RequestHeader oldRequestHeader = requestHeader;
		requestHeader = null;
		boolean oldRequestHeaderESet = requestHeaderESet;
		requestHeaderESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_MONITORING_MODE_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestHeader() {
		if (requestHeader != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_MONITORING_MODE_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_MONITORING_MODE_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestHeader() {
		return requestHeaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSubscriptionId() {
		return subscriptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionId(long newSubscriptionId) {
		long oldSubscriptionId = subscriptionId;
		subscriptionId = newSubscriptionId;
		boolean oldSubscriptionIdESet = subscriptionIdESet;
		subscriptionIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SET_MONITORING_MODE_REQUEST__SUBSCRIPTION_ID, oldSubscriptionId, subscriptionId, !oldSubscriptionIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSubscriptionId() {
		long oldSubscriptionId = subscriptionId;
		boolean oldSubscriptionIdESet = subscriptionIdESet;
		subscriptionId = SUBSCRIPTION_ID_EDEFAULT;
		subscriptionIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_MONITORING_MODE_REQUEST__SUBSCRIPTION_ID, oldSubscriptionId, SUBSCRIPTION_ID_EDEFAULT, oldSubscriptionIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubscriptionId() {
		return subscriptionIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringMode getMonitoringMode() {
		return monitoringMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoringMode(MonitoringMode newMonitoringMode) {
		MonitoringMode oldMonitoringMode = monitoringMode;
		monitoringMode = newMonitoringMode == null ? MONITORING_MODE_EDEFAULT : newMonitoringMode;
		boolean oldMonitoringModeESet = monitoringModeESet;
		monitoringModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SET_MONITORING_MODE_REQUEST__MONITORING_MODE, oldMonitoringMode, monitoringMode, !oldMonitoringModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMonitoringMode() {
		MonitoringMode oldMonitoringMode = monitoringMode;
		boolean oldMonitoringModeESet = monitoringModeESet;
		monitoringMode = MONITORING_MODE_EDEFAULT;
		monitoringModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_MONITORING_MODE_REQUEST__MONITORING_MODE, oldMonitoringMode, MONITORING_MODE_EDEFAULT, oldMonitoringModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMonitoringMode() {
		return monitoringModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUInt32 getMonitoredItemIds() {
		return monitoredItemIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoredItemIds(ListOfUInt32 newMonitoredItemIds, NotificationChain msgs) {
		ListOfUInt32 oldMonitoredItemIds = monitoredItemIds;
		monitoredItemIds = newMonitoredItemIds;
		boolean oldMonitoredItemIdsESet = monitoredItemIdsESet;
		monitoredItemIdsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SET_MONITORING_MODE_REQUEST__MONITORED_ITEM_IDS, oldMonitoredItemIds, newMonitoredItemIds, !oldMonitoredItemIdsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoredItemIds(ListOfUInt32 newMonitoredItemIds) {
		if (newMonitoredItemIds != monitoredItemIds) {
			NotificationChain msgs = null;
			if (monitoredItemIds != null)
				msgs = ((InternalEObject)monitoredItemIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_MONITORING_MODE_REQUEST__MONITORED_ITEM_IDS, null, msgs);
			if (newMonitoredItemIds != null)
				msgs = ((InternalEObject)newMonitoredItemIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_MONITORING_MODE_REQUEST__MONITORED_ITEM_IDS, null, msgs);
			msgs = basicSetMonitoredItemIds(newMonitoredItemIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMonitoredItemIdsESet = monitoredItemIdsESet;
			monitoredItemIdsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SET_MONITORING_MODE_REQUEST__MONITORED_ITEM_IDS, newMonitoredItemIds, newMonitoredItemIds, !oldMonitoredItemIdsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetMonitoredItemIds(NotificationChain msgs) {
		ListOfUInt32 oldMonitoredItemIds = monitoredItemIds;
		monitoredItemIds = null;
		boolean oldMonitoredItemIdsESet = monitoredItemIdsESet;
		monitoredItemIdsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_MONITORING_MODE_REQUEST__MONITORED_ITEM_IDS, oldMonitoredItemIds, null, oldMonitoredItemIdsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMonitoredItemIds() {
		if (monitoredItemIds != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)monitoredItemIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_MONITORING_MODE_REQUEST__MONITORED_ITEM_IDS, null, msgs);
			msgs = basicUnsetMonitoredItemIds(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMonitoredItemIdsESet = monitoredItemIdsESet;
			monitoredItemIdsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_MONITORING_MODE_REQUEST__MONITORED_ITEM_IDS, null, null, oldMonitoredItemIdsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMonitoredItemIds() {
		return monitoredItemIdsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.SET_MONITORING_MODE_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.SET_MONITORING_MODE_REQUEST__MONITORED_ITEM_IDS:
				return basicUnsetMonitoredItemIds(msgs);
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
			case TypesPackage.SET_MONITORING_MODE_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.SET_MONITORING_MODE_REQUEST__SUBSCRIPTION_ID:
				return getSubscriptionId();
			case TypesPackage.SET_MONITORING_MODE_REQUEST__MONITORING_MODE:
				return getMonitoringMode();
			case TypesPackage.SET_MONITORING_MODE_REQUEST__MONITORED_ITEM_IDS:
				return getMonitoredItemIds();
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
			case TypesPackage.SET_MONITORING_MODE_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.SET_MONITORING_MODE_REQUEST__SUBSCRIPTION_ID:
				setSubscriptionId((Long)newValue);
				return;
			case TypesPackage.SET_MONITORING_MODE_REQUEST__MONITORING_MODE:
				setMonitoringMode((MonitoringMode)newValue);
				return;
			case TypesPackage.SET_MONITORING_MODE_REQUEST__MONITORED_ITEM_IDS:
				setMonitoredItemIds((ListOfUInt32)newValue);
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
			case TypesPackage.SET_MONITORING_MODE_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.SET_MONITORING_MODE_REQUEST__SUBSCRIPTION_ID:
				unsetSubscriptionId();
				return;
			case TypesPackage.SET_MONITORING_MODE_REQUEST__MONITORING_MODE:
				unsetMonitoringMode();
				return;
			case TypesPackage.SET_MONITORING_MODE_REQUEST__MONITORED_ITEM_IDS:
				unsetMonitoredItemIds();
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
			case TypesPackage.SET_MONITORING_MODE_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.SET_MONITORING_MODE_REQUEST__SUBSCRIPTION_ID:
				return isSetSubscriptionId();
			case TypesPackage.SET_MONITORING_MODE_REQUEST__MONITORING_MODE:
				return isSetMonitoringMode();
			case TypesPackage.SET_MONITORING_MODE_REQUEST__MONITORED_ITEM_IDS:
				return isSetMonitoredItemIds();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (subscriptionId: ");
		if (subscriptionIdESet) result.append(subscriptionId); else result.append("<unset>");
		result.append(", monitoringMode: ");
		if (monitoringModeESet) result.append(monitoringMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SetMonitoringModeRequestImpl
