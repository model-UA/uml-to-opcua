/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ExtensionObject;
import org.opcfoundation.ua._2008._02.types.MonitoredItemModifyResult;
import org.opcfoundation.ua._2008._02.types.StatusCode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitored Item Modify Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.MonitoredItemModifyResultImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.MonitoredItemModifyResultImpl#getRevisedSamplingInterval <em>Revised Sampling Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.MonitoredItemModifyResultImpl#getRevisedQueueSize <em>Revised Queue Size</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.MonitoredItemModifyResultImpl#getFilterResult <em>Filter Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitoredItemModifyResultImpl extends MinimalEObjectImpl.Container implements MonitoredItemModifyResult {
	/**
	 * The cached value of the '{@link #getStatusCode() <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode()
	 * @generated
	 * @ordered
	 */
	protected StatusCode statusCode;

	/**
	 * The default value of the '{@link #getRevisedSamplingInterval() <em>Revised Sampling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedSamplingInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double REVISED_SAMPLING_INTERVAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRevisedSamplingInterval() <em>Revised Sampling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedSamplingInterval()
	 * @generated
	 * @ordered
	 */
	protected double revisedSamplingInterval = REVISED_SAMPLING_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Revised Sampling Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revisedSamplingIntervalESet;

	/**
	 * The default value of the '{@link #getRevisedQueueSize() <em>Revised Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedQueueSize()
	 * @generated
	 * @ordered
	 */
	protected static final long REVISED_QUEUE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRevisedQueueSize() <em>Revised Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedQueueSize()
	 * @generated
	 * @ordered
	 */
	protected long revisedQueueSize = REVISED_QUEUE_SIZE_EDEFAULT;

	/**
	 * This is true if the Revised Queue Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revisedQueueSizeESet;

	/**
	 * The cached value of the '{@link #getFilterResult() <em>Filter Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterResult()
	 * @generated
	 * @ordered
	 */
	protected ExtensionObject filterResult;

	/**
	 * This is true if the Filter Result containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filterResultESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitoredItemModifyResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getMonitoredItemModifyResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCode getStatusCode() {
		return statusCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusCode(StatusCode newStatusCode, NotificationChain msgs) {
		StatusCode oldStatusCode = statusCode;
		statusCode = newStatusCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORED_ITEM_MODIFY_RESULT__STATUS_CODE, oldStatusCode, newStatusCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusCode(StatusCode newStatusCode) {
		if (newStatusCode != statusCode) {
			NotificationChain msgs = null;
			if (statusCode != null)
				msgs = ((InternalEObject)statusCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORED_ITEM_MODIFY_RESULT__STATUS_CODE, null, msgs);
			if (newStatusCode != null)
				msgs = ((InternalEObject)newStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORED_ITEM_MODIFY_RESULT__STATUS_CODE, null, msgs);
			msgs = basicSetStatusCode(newStatusCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORED_ITEM_MODIFY_RESULT__STATUS_CODE, newStatusCode, newStatusCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRevisedSamplingInterval() {
		return revisedSamplingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisedSamplingInterval(double newRevisedSamplingInterval) {
		double oldRevisedSamplingInterval = revisedSamplingInterval;
		revisedSamplingInterval = newRevisedSamplingInterval;
		boolean oldRevisedSamplingIntervalESet = revisedSamplingIntervalESet;
		revisedSamplingIntervalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORED_ITEM_MODIFY_RESULT__REVISED_SAMPLING_INTERVAL, oldRevisedSamplingInterval, revisedSamplingInterval, !oldRevisedSamplingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRevisedSamplingInterval() {
		double oldRevisedSamplingInterval = revisedSamplingInterval;
		boolean oldRevisedSamplingIntervalESet = revisedSamplingIntervalESet;
		revisedSamplingInterval = REVISED_SAMPLING_INTERVAL_EDEFAULT;
		revisedSamplingIntervalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORED_ITEM_MODIFY_RESULT__REVISED_SAMPLING_INTERVAL, oldRevisedSamplingInterval, REVISED_SAMPLING_INTERVAL_EDEFAULT, oldRevisedSamplingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRevisedSamplingInterval() {
		return revisedSamplingIntervalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRevisedQueueSize() {
		return revisedQueueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisedQueueSize(long newRevisedQueueSize) {
		long oldRevisedQueueSize = revisedQueueSize;
		revisedQueueSize = newRevisedQueueSize;
		boolean oldRevisedQueueSizeESet = revisedQueueSizeESet;
		revisedQueueSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORED_ITEM_MODIFY_RESULT__REVISED_QUEUE_SIZE, oldRevisedQueueSize, revisedQueueSize, !oldRevisedQueueSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRevisedQueueSize() {
		long oldRevisedQueueSize = revisedQueueSize;
		boolean oldRevisedQueueSizeESet = revisedQueueSizeESet;
		revisedQueueSize = REVISED_QUEUE_SIZE_EDEFAULT;
		revisedQueueSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORED_ITEM_MODIFY_RESULT__REVISED_QUEUE_SIZE, oldRevisedQueueSize, REVISED_QUEUE_SIZE_EDEFAULT, oldRevisedQueueSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRevisedQueueSize() {
		return revisedQueueSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionObject getFilterResult() {
		return filterResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterResult(ExtensionObject newFilterResult, NotificationChain msgs) {
		ExtensionObject oldFilterResult = filterResult;
		filterResult = newFilterResult;
		boolean oldFilterResultESet = filterResultESet;
		filterResultESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORED_ITEM_MODIFY_RESULT__FILTER_RESULT, oldFilterResult, newFilterResult, !oldFilterResultESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterResult(ExtensionObject newFilterResult) {
		if (newFilterResult != filterResult) {
			NotificationChain msgs = null;
			if (filterResult != null)
				msgs = ((InternalEObject)filterResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORED_ITEM_MODIFY_RESULT__FILTER_RESULT, null, msgs);
			if (newFilterResult != null)
				msgs = ((InternalEObject)newFilterResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORED_ITEM_MODIFY_RESULT__FILTER_RESULT, null, msgs);
			msgs = basicSetFilterResult(newFilterResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFilterResultESet = filterResultESet;
			filterResultESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORED_ITEM_MODIFY_RESULT__FILTER_RESULT, newFilterResult, newFilterResult, !oldFilterResultESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetFilterResult(NotificationChain msgs) {
		ExtensionObject oldFilterResult = filterResult;
		filterResult = null;
		boolean oldFilterResultESet = filterResultESet;
		filterResultESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORED_ITEM_MODIFY_RESULT__FILTER_RESULT, oldFilterResult, null, oldFilterResultESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilterResult() {
		if (filterResult != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)filterResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORED_ITEM_MODIFY_RESULT__FILTER_RESULT, null, msgs);
			msgs = basicUnsetFilterResult(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFilterResultESet = filterResultESet;
			filterResultESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORED_ITEM_MODIFY_RESULT__FILTER_RESULT, null, null, oldFilterResultESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilterResult() {
		return filterResultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT__FILTER_RESULT:
				return basicUnsetFilterResult(msgs);
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
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT__STATUS_CODE:
				return getStatusCode();
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT__REVISED_SAMPLING_INTERVAL:
				return getRevisedSamplingInterval();
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT__REVISED_QUEUE_SIZE:
				return getRevisedQueueSize();
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT__FILTER_RESULT:
				return getFilterResult();
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
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)newValue);
				return;
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT__REVISED_SAMPLING_INTERVAL:
				setRevisedSamplingInterval((Double)newValue);
				return;
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT__REVISED_QUEUE_SIZE:
				setRevisedQueueSize((Long)newValue);
				return;
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT__FILTER_RESULT:
				setFilterResult((ExtensionObject)newValue);
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
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)null);
				return;
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT__REVISED_SAMPLING_INTERVAL:
				unsetRevisedSamplingInterval();
				return;
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT__REVISED_QUEUE_SIZE:
				unsetRevisedQueueSize();
				return;
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT__FILTER_RESULT:
				unsetFilterResult();
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
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT__STATUS_CODE:
				return statusCode != null;
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT__REVISED_SAMPLING_INTERVAL:
				return isSetRevisedSamplingInterval();
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT__REVISED_QUEUE_SIZE:
				return isSetRevisedQueueSize();
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT__FILTER_RESULT:
				return isSetFilterResult();
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
		result.append(" (revisedSamplingInterval: ");
		if (revisedSamplingIntervalESet) result.append(revisedSamplingInterval); else result.append("<unset>");
		result.append(", revisedQueueSize: ");
		if (revisedQueueSizeESet) result.append(revisedQueueSize); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MonitoredItemModifyResultImpl
