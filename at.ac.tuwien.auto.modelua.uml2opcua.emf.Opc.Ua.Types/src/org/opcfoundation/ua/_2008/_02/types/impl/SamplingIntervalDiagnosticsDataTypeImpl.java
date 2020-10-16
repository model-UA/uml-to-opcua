/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sampling Interval Diagnostics Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SamplingIntervalDiagnosticsDataTypeImpl#getSamplingInterval <em>Sampling Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SamplingIntervalDiagnosticsDataTypeImpl#getMonitoredItemCount <em>Monitored Item Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SamplingIntervalDiagnosticsDataTypeImpl#getMaxMonitoredItemCount <em>Max Monitored Item Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SamplingIntervalDiagnosticsDataTypeImpl#getDisabledMonitoredItemCount <em>Disabled Monitored Item Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SamplingIntervalDiagnosticsDataTypeImpl extends MinimalEObjectImpl.Container implements SamplingIntervalDiagnosticsDataType {
	/**
	 * The default value of the '{@link #getSamplingInterval() <em>Sampling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double SAMPLING_INTERVAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSamplingInterval() <em>Sampling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingInterval()
	 * @generated
	 * @ordered
	 */
	protected double samplingInterval = SAMPLING_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Sampling Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean samplingIntervalESet;

	/**
	 * The default value of the '{@link #getMonitoredItemCount() <em>Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredItemCount()
	 * @generated
	 * @ordered
	 */
	protected static final long MONITORED_ITEM_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMonitoredItemCount() <em>Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredItemCount()
	 * @generated
	 * @ordered
	 */
	protected long monitoredItemCount = MONITORED_ITEM_COUNT_EDEFAULT;

	/**
	 * This is true if the Monitored Item Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean monitoredItemCountESet;

	/**
	 * The default value of the '{@link #getMaxMonitoredItemCount() <em>Max Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMonitoredItemCount()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_MONITORED_ITEM_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxMonitoredItemCount() <em>Max Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMonitoredItemCount()
	 * @generated
	 * @ordered
	 */
	protected long maxMonitoredItemCount = MAX_MONITORED_ITEM_COUNT_EDEFAULT;

	/**
	 * This is true if the Max Monitored Item Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxMonitoredItemCountESet;

	/**
	 * The default value of the '{@link #getDisabledMonitoredItemCount() <em>Disabled Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabledMonitoredItemCount()
	 * @generated
	 * @ordered
	 */
	protected static final long DISABLED_MONITORED_ITEM_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDisabledMonitoredItemCount() <em>Disabled Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabledMonitoredItemCount()
	 * @generated
	 * @ordered
	 */
	protected long disabledMonitoredItemCount = DISABLED_MONITORED_ITEM_COUNT_EDEFAULT;

	/**
	 * This is true if the Disabled Monitored Item Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disabledMonitoredItemCountESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SamplingIntervalDiagnosticsDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getSamplingIntervalDiagnosticsDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSamplingInterval() {
		return samplingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplingInterval(double newSamplingInterval) {
		double oldSamplingInterval = samplingInterval;
		samplingInterval = newSamplingInterval;
		boolean oldSamplingIntervalESet = samplingIntervalESet;
		samplingIntervalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__SAMPLING_INTERVAL, oldSamplingInterval, samplingInterval, !oldSamplingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSamplingInterval() {
		double oldSamplingInterval = samplingInterval;
		boolean oldSamplingIntervalESet = samplingIntervalESet;
		samplingInterval = SAMPLING_INTERVAL_EDEFAULT;
		samplingIntervalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__SAMPLING_INTERVAL, oldSamplingInterval, SAMPLING_INTERVAL_EDEFAULT, oldSamplingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSamplingInterval() {
		return samplingIntervalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMonitoredItemCount() {
		return monitoredItemCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoredItemCount(long newMonitoredItemCount) {
		long oldMonitoredItemCount = monitoredItemCount;
		monitoredItemCount = newMonitoredItemCount;
		boolean oldMonitoredItemCountESet = monitoredItemCountESet;
		monitoredItemCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__MONITORED_ITEM_COUNT, oldMonitoredItemCount, monitoredItemCount, !oldMonitoredItemCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMonitoredItemCount() {
		long oldMonitoredItemCount = monitoredItemCount;
		boolean oldMonitoredItemCountESet = monitoredItemCountESet;
		monitoredItemCount = MONITORED_ITEM_COUNT_EDEFAULT;
		monitoredItemCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__MONITORED_ITEM_COUNT, oldMonitoredItemCount, MONITORED_ITEM_COUNT_EDEFAULT, oldMonitoredItemCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMonitoredItemCount() {
		return monitoredItemCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxMonitoredItemCount() {
		return maxMonitoredItemCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxMonitoredItemCount(long newMaxMonitoredItemCount) {
		long oldMaxMonitoredItemCount = maxMonitoredItemCount;
		maxMonitoredItemCount = newMaxMonitoredItemCount;
		boolean oldMaxMonitoredItemCountESet = maxMonitoredItemCountESet;
		maxMonitoredItemCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__MAX_MONITORED_ITEM_COUNT, oldMaxMonitoredItemCount, maxMonitoredItemCount, !oldMaxMonitoredItemCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxMonitoredItemCount() {
		long oldMaxMonitoredItemCount = maxMonitoredItemCount;
		boolean oldMaxMonitoredItemCountESet = maxMonitoredItemCountESet;
		maxMonitoredItemCount = MAX_MONITORED_ITEM_COUNT_EDEFAULT;
		maxMonitoredItemCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__MAX_MONITORED_ITEM_COUNT, oldMaxMonitoredItemCount, MAX_MONITORED_ITEM_COUNT_EDEFAULT, oldMaxMonitoredItemCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxMonitoredItemCount() {
		return maxMonitoredItemCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDisabledMonitoredItemCount() {
		return disabledMonitoredItemCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabledMonitoredItemCount(long newDisabledMonitoredItemCount) {
		long oldDisabledMonitoredItemCount = disabledMonitoredItemCount;
		disabledMonitoredItemCount = newDisabledMonitoredItemCount;
		boolean oldDisabledMonitoredItemCountESet = disabledMonitoredItemCountESet;
		disabledMonitoredItemCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__DISABLED_MONITORED_ITEM_COUNT, oldDisabledMonitoredItemCount, disabledMonitoredItemCount, !oldDisabledMonitoredItemCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisabledMonitoredItemCount() {
		long oldDisabledMonitoredItemCount = disabledMonitoredItemCount;
		boolean oldDisabledMonitoredItemCountESet = disabledMonitoredItemCountESet;
		disabledMonitoredItemCount = DISABLED_MONITORED_ITEM_COUNT_EDEFAULT;
		disabledMonitoredItemCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__DISABLED_MONITORED_ITEM_COUNT, oldDisabledMonitoredItemCount, DISABLED_MONITORED_ITEM_COUNT_EDEFAULT, oldDisabledMonitoredItemCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisabledMonitoredItemCount() {
		return disabledMonitoredItemCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__SAMPLING_INTERVAL:
				return getSamplingInterval();
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__MONITORED_ITEM_COUNT:
				return getMonitoredItemCount();
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__MAX_MONITORED_ITEM_COUNT:
				return getMaxMonitoredItemCount();
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__DISABLED_MONITORED_ITEM_COUNT:
				return getDisabledMonitoredItemCount();
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
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__SAMPLING_INTERVAL:
				setSamplingInterval((Double)newValue);
				return;
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__MONITORED_ITEM_COUNT:
				setMonitoredItemCount((Long)newValue);
				return;
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__MAX_MONITORED_ITEM_COUNT:
				setMaxMonitoredItemCount((Long)newValue);
				return;
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__DISABLED_MONITORED_ITEM_COUNT:
				setDisabledMonitoredItemCount((Long)newValue);
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
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__SAMPLING_INTERVAL:
				unsetSamplingInterval();
				return;
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__MONITORED_ITEM_COUNT:
				unsetMonitoredItemCount();
				return;
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__MAX_MONITORED_ITEM_COUNT:
				unsetMaxMonitoredItemCount();
				return;
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__DISABLED_MONITORED_ITEM_COUNT:
				unsetDisabledMonitoredItemCount();
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
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__SAMPLING_INTERVAL:
				return isSetSamplingInterval();
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__MONITORED_ITEM_COUNT:
				return isSetMonitoredItemCount();
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__MAX_MONITORED_ITEM_COUNT:
				return isSetMaxMonitoredItemCount();
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE__DISABLED_MONITORED_ITEM_COUNT:
				return isSetDisabledMonitoredItemCount();
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
		result.append(" (samplingInterval: ");
		if (samplingIntervalESet) result.append(samplingInterval); else result.append("<unset>");
		result.append(", monitoredItemCount: ");
		if (monitoredItemCountESet) result.append(monitoredItemCount); else result.append("<unset>");
		result.append(", maxMonitoredItemCount: ");
		if (maxMonitoredItemCountESet) result.append(maxMonitoredItemCount); else result.append("<unset>");
		result.append(", disabledMonitoredItemCount: ");
		if (disabledMonitoredItemCountESet) result.append(disabledMonitoredItemCount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SamplingIntervalDiagnosticsDataTypeImpl
