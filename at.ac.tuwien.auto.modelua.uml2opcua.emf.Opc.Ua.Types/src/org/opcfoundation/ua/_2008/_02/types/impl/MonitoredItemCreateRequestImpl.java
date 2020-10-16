/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest;
import org.opcfoundation.ua._2008._02.types.MonitoringMode;
import org.opcfoundation.ua._2008._02.types.MonitoringParameters;
import org.opcfoundation.ua._2008._02.types.ReadValueId;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitored Item Create Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.MonitoredItemCreateRequestImpl#getItemToMonitor <em>Item To Monitor</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.MonitoredItemCreateRequestImpl#getMonitoringMode <em>Monitoring Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.MonitoredItemCreateRequestImpl#getRequestedParameters <em>Requested Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitoredItemCreateRequestImpl extends MinimalEObjectImpl.Container implements MonitoredItemCreateRequest {
	/**
	 * The cached value of the '{@link #getItemToMonitor() <em>Item To Monitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemToMonitor()
	 * @generated
	 * @ordered
	 */
	protected ReadValueId itemToMonitor;

	/**
	 * This is true if the Item To Monitor containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean itemToMonitorESet;

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
	 * The cached value of the '{@link #getRequestedParameters() <em>Requested Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedParameters()
	 * @generated
	 * @ordered
	 */
	protected MonitoringParameters requestedParameters;

	/**
	 * This is true if the Requested Parameters containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestedParametersESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitoredItemCreateRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getMonitoredItemCreateRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadValueId getItemToMonitor() {
		return itemToMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemToMonitor(ReadValueId newItemToMonitor, NotificationChain msgs) {
		ReadValueId oldItemToMonitor = itemToMonitor;
		itemToMonitor = newItemToMonitor;
		boolean oldItemToMonitorESet = itemToMonitorESet;
		itemToMonitorESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORED_ITEM_CREATE_REQUEST__ITEM_TO_MONITOR, oldItemToMonitor, newItemToMonitor, !oldItemToMonitorESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemToMonitor(ReadValueId newItemToMonitor) {
		if (newItemToMonitor != itemToMonitor) {
			NotificationChain msgs = null;
			if (itemToMonitor != null)
				msgs = ((InternalEObject)itemToMonitor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORED_ITEM_CREATE_REQUEST__ITEM_TO_MONITOR, null, msgs);
			if (newItemToMonitor != null)
				msgs = ((InternalEObject)newItemToMonitor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORED_ITEM_CREATE_REQUEST__ITEM_TO_MONITOR, null, msgs);
			msgs = basicSetItemToMonitor(newItemToMonitor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldItemToMonitorESet = itemToMonitorESet;
			itemToMonitorESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORED_ITEM_CREATE_REQUEST__ITEM_TO_MONITOR, newItemToMonitor, newItemToMonitor, !oldItemToMonitorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetItemToMonitor(NotificationChain msgs) {
		ReadValueId oldItemToMonitor = itemToMonitor;
		itemToMonitor = null;
		boolean oldItemToMonitorESet = itemToMonitorESet;
		itemToMonitorESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORED_ITEM_CREATE_REQUEST__ITEM_TO_MONITOR, oldItemToMonitor, null, oldItemToMonitorESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetItemToMonitor() {
		if (itemToMonitor != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)itemToMonitor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORED_ITEM_CREATE_REQUEST__ITEM_TO_MONITOR, null, msgs);
			msgs = basicUnsetItemToMonitor(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldItemToMonitorESet = itemToMonitorESet;
			itemToMonitorESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORED_ITEM_CREATE_REQUEST__ITEM_TO_MONITOR, null, null, oldItemToMonitorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItemToMonitor() {
		return itemToMonitorESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORED_ITEM_CREATE_REQUEST__MONITORING_MODE, oldMonitoringMode, monitoringMode, !oldMonitoringModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORED_ITEM_CREATE_REQUEST__MONITORING_MODE, oldMonitoringMode, MONITORING_MODE_EDEFAULT, oldMonitoringModeESet));
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
	public MonitoringParameters getRequestedParameters() {
		return requestedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestedParameters(MonitoringParameters newRequestedParameters, NotificationChain msgs) {
		MonitoringParameters oldRequestedParameters = requestedParameters;
		requestedParameters = newRequestedParameters;
		boolean oldRequestedParametersESet = requestedParametersESet;
		requestedParametersESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORED_ITEM_CREATE_REQUEST__REQUESTED_PARAMETERS, oldRequestedParameters, newRequestedParameters, !oldRequestedParametersESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedParameters(MonitoringParameters newRequestedParameters) {
		if (newRequestedParameters != requestedParameters) {
			NotificationChain msgs = null;
			if (requestedParameters != null)
				msgs = ((InternalEObject)requestedParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORED_ITEM_CREATE_REQUEST__REQUESTED_PARAMETERS, null, msgs);
			if (newRequestedParameters != null)
				msgs = ((InternalEObject)newRequestedParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORED_ITEM_CREATE_REQUEST__REQUESTED_PARAMETERS, null, msgs);
			msgs = basicSetRequestedParameters(newRequestedParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestedParametersESet = requestedParametersESet;
			requestedParametersESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORED_ITEM_CREATE_REQUEST__REQUESTED_PARAMETERS, newRequestedParameters, newRequestedParameters, !oldRequestedParametersESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRequestedParameters(NotificationChain msgs) {
		MonitoringParameters oldRequestedParameters = requestedParameters;
		requestedParameters = null;
		boolean oldRequestedParametersESet = requestedParametersESet;
		requestedParametersESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORED_ITEM_CREATE_REQUEST__REQUESTED_PARAMETERS, oldRequestedParameters, null, oldRequestedParametersESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestedParameters() {
		if (requestedParameters != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)requestedParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORED_ITEM_CREATE_REQUEST__REQUESTED_PARAMETERS, null, msgs);
			msgs = basicUnsetRequestedParameters(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestedParametersESet = requestedParametersESet;
			requestedParametersESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORED_ITEM_CREATE_REQUEST__REQUESTED_PARAMETERS, null, null, oldRequestedParametersESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestedParameters() {
		return requestedParametersESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.MONITORED_ITEM_CREATE_REQUEST__ITEM_TO_MONITOR:
				return basicUnsetItemToMonitor(msgs);
			case TypesPackage.MONITORED_ITEM_CREATE_REQUEST__REQUESTED_PARAMETERS:
				return basicUnsetRequestedParameters(msgs);
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
			case TypesPackage.MONITORED_ITEM_CREATE_REQUEST__ITEM_TO_MONITOR:
				return getItemToMonitor();
			case TypesPackage.MONITORED_ITEM_CREATE_REQUEST__MONITORING_MODE:
				return getMonitoringMode();
			case TypesPackage.MONITORED_ITEM_CREATE_REQUEST__REQUESTED_PARAMETERS:
				return getRequestedParameters();
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
			case TypesPackage.MONITORED_ITEM_CREATE_REQUEST__ITEM_TO_MONITOR:
				setItemToMonitor((ReadValueId)newValue);
				return;
			case TypesPackage.MONITORED_ITEM_CREATE_REQUEST__MONITORING_MODE:
				setMonitoringMode((MonitoringMode)newValue);
				return;
			case TypesPackage.MONITORED_ITEM_CREATE_REQUEST__REQUESTED_PARAMETERS:
				setRequestedParameters((MonitoringParameters)newValue);
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
			case TypesPackage.MONITORED_ITEM_CREATE_REQUEST__ITEM_TO_MONITOR:
				unsetItemToMonitor();
				return;
			case TypesPackage.MONITORED_ITEM_CREATE_REQUEST__MONITORING_MODE:
				unsetMonitoringMode();
				return;
			case TypesPackage.MONITORED_ITEM_CREATE_REQUEST__REQUESTED_PARAMETERS:
				unsetRequestedParameters();
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
			case TypesPackage.MONITORED_ITEM_CREATE_REQUEST__ITEM_TO_MONITOR:
				return isSetItemToMonitor();
			case TypesPackage.MONITORED_ITEM_CREATE_REQUEST__MONITORING_MODE:
				return isSetMonitoringMode();
			case TypesPackage.MONITORED_ITEM_CREATE_REQUEST__REQUESTED_PARAMETERS:
				return isSetRequestedParameters();
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
		result.append(" (monitoringMode: ");
		if (monitoringModeESet) result.append(monitoringMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MonitoredItemCreateRequestImpl
