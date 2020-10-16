/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.MonitoredItemModifyRequest;
import org.opcfoundation.ua._2008._02.types.MonitoringParameters;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitored Item Modify Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.MonitoredItemModifyRequestImpl#getMonitoredItemId <em>Monitored Item Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.MonitoredItemModifyRequestImpl#getRequestedParameters <em>Requested Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitoredItemModifyRequestImpl extends MinimalEObjectImpl.Container implements MonitoredItemModifyRequest {
	/**
	 * The default value of the '{@link #getMonitoredItemId() <em>Monitored Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredItemId()
	 * @generated
	 * @ordered
	 */
	protected static final long MONITORED_ITEM_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMonitoredItemId() <em>Monitored Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredItemId()
	 * @generated
	 * @ordered
	 */
	protected long monitoredItemId = MONITORED_ITEM_ID_EDEFAULT;

	/**
	 * This is true if the Monitored Item Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean monitoredItemIdESet;

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
	protected MonitoredItemModifyRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getMonitoredItemModifyRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMonitoredItemId() {
		return monitoredItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoredItemId(long newMonitoredItemId) {
		long oldMonitoredItemId = monitoredItemId;
		monitoredItemId = newMonitoredItemId;
		boolean oldMonitoredItemIdESet = monitoredItemIdESet;
		monitoredItemIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORED_ITEM_MODIFY_REQUEST__MONITORED_ITEM_ID, oldMonitoredItemId, monitoredItemId, !oldMonitoredItemIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMonitoredItemId() {
		long oldMonitoredItemId = monitoredItemId;
		boolean oldMonitoredItemIdESet = monitoredItemIdESet;
		monitoredItemId = MONITORED_ITEM_ID_EDEFAULT;
		monitoredItemIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORED_ITEM_MODIFY_REQUEST__MONITORED_ITEM_ID, oldMonitoredItemId, MONITORED_ITEM_ID_EDEFAULT, oldMonitoredItemIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMonitoredItemId() {
		return monitoredItemIdESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORED_ITEM_MODIFY_REQUEST__REQUESTED_PARAMETERS, oldRequestedParameters, newRequestedParameters, !oldRequestedParametersESet);
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
				msgs = ((InternalEObject)requestedParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORED_ITEM_MODIFY_REQUEST__REQUESTED_PARAMETERS, null, msgs);
			if (newRequestedParameters != null)
				msgs = ((InternalEObject)newRequestedParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORED_ITEM_MODIFY_REQUEST__REQUESTED_PARAMETERS, null, msgs);
			msgs = basicSetRequestedParameters(newRequestedParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestedParametersESet = requestedParametersESet;
			requestedParametersESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORED_ITEM_MODIFY_REQUEST__REQUESTED_PARAMETERS, newRequestedParameters, newRequestedParameters, !oldRequestedParametersESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORED_ITEM_MODIFY_REQUEST__REQUESTED_PARAMETERS, oldRequestedParameters, null, oldRequestedParametersESet);
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
			msgs = ((InternalEObject)requestedParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORED_ITEM_MODIFY_REQUEST__REQUESTED_PARAMETERS, null, msgs);
			msgs = basicUnsetRequestedParameters(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestedParametersESet = requestedParametersESet;
			requestedParametersESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORED_ITEM_MODIFY_REQUEST__REQUESTED_PARAMETERS, null, null, oldRequestedParametersESet));
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
			case TypesPackage.MONITORED_ITEM_MODIFY_REQUEST__REQUESTED_PARAMETERS:
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
			case TypesPackage.MONITORED_ITEM_MODIFY_REQUEST__MONITORED_ITEM_ID:
				return getMonitoredItemId();
			case TypesPackage.MONITORED_ITEM_MODIFY_REQUEST__REQUESTED_PARAMETERS:
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
			case TypesPackage.MONITORED_ITEM_MODIFY_REQUEST__MONITORED_ITEM_ID:
				setMonitoredItemId((Long)newValue);
				return;
			case TypesPackage.MONITORED_ITEM_MODIFY_REQUEST__REQUESTED_PARAMETERS:
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
			case TypesPackage.MONITORED_ITEM_MODIFY_REQUEST__MONITORED_ITEM_ID:
				unsetMonitoredItemId();
				return;
			case TypesPackage.MONITORED_ITEM_MODIFY_REQUEST__REQUESTED_PARAMETERS:
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
			case TypesPackage.MONITORED_ITEM_MODIFY_REQUEST__MONITORED_ITEM_ID:
				return isSetMonitoredItemId();
			case TypesPackage.MONITORED_ITEM_MODIFY_REQUEST__REQUESTED_PARAMETERS:
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
		result.append(" (monitoredItemId: ");
		if (monitoredItemIdESet) result.append(monitoredItemId); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MonitoredItemModifyRequestImpl
