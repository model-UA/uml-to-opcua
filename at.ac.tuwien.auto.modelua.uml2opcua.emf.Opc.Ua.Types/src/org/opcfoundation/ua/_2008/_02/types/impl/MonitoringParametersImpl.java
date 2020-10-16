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
import org.opcfoundation.ua._2008._02.types.MonitoringParameters;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitoring Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.MonitoringParametersImpl#getClientHandle <em>Client Handle</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.MonitoringParametersImpl#getSamplingInterval <em>Sampling Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.MonitoringParametersImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.MonitoringParametersImpl#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.MonitoringParametersImpl#isDiscardOldest <em>Discard Oldest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitoringParametersImpl extends MinimalEObjectImpl.Container implements MonitoringParameters {
	/**
	 * The default value of the '{@link #getClientHandle() <em>Client Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientHandle()
	 * @generated
	 * @ordered
	 */
	protected static final long CLIENT_HANDLE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getClientHandle() <em>Client Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientHandle()
	 * @generated
	 * @ordered
	 */
	protected long clientHandle = CLIENT_HANDLE_EDEFAULT;

	/**
	 * This is true if the Client Handle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clientHandleESet;

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
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected ExtensionObject filter;

	/**
	 * This is true if the Filter containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filterESet;

	/**
	 * The default value of the '{@link #getQueueSize() <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSize()
	 * @generated
	 * @ordered
	 */
	protected static final long QUEUE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQueueSize() <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSize()
	 * @generated
	 * @ordered
	 */
	protected long queueSize = QUEUE_SIZE_EDEFAULT;

	/**
	 * This is true if the Queue Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean queueSizeESet;

	/**
	 * The default value of the '{@link #isDiscardOldest() <em>Discard Oldest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiscardOldest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISCARD_OLDEST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDiscardOldest() <em>Discard Oldest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiscardOldest()
	 * @generated
	 * @ordered
	 */
	protected boolean discardOldest = DISCARD_OLDEST_EDEFAULT;

	/**
	 * This is true if the Discard Oldest attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean discardOldestESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitoringParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getMonitoringParameters();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getClientHandle() {
		return clientHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientHandle(long newClientHandle) {
		long oldClientHandle = clientHandle;
		clientHandle = newClientHandle;
		boolean oldClientHandleESet = clientHandleESet;
		clientHandleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORING_PARAMETERS__CLIENT_HANDLE, oldClientHandle, clientHandle, !oldClientHandleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClientHandle() {
		long oldClientHandle = clientHandle;
		boolean oldClientHandleESet = clientHandleESet;
		clientHandle = CLIENT_HANDLE_EDEFAULT;
		clientHandleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORING_PARAMETERS__CLIENT_HANDLE, oldClientHandle, CLIENT_HANDLE_EDEFAULT, oldClientHandleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClientHandle() {
		return clientHandleESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORING_PARAMETERS__SAMPLING_INTERVAL, oldSamplingInterval, samplingInterval, !oldSamplingIntervalESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORING_PARAMETERS__SAMPLING_INTERVAL, oldSamplingInterval, SAMPLING_INTERVAL_EDEFAULT, oldSamplingIntervalESet));
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
	public ExtensionObject getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(ExtensionObject newFilter, NotificationChain msgs) {
		ExtensionObject oldFilter = filter;
		filter = newFilter;
		boolean oldFilterESet = filterESet;
		filterESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORING_PARAMETERS__FILTER, oldFilter, newFilter, !oldFilterESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(ExtensionObject newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORING_PARAMETERS__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORING_PARAMETERS__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFilterESet = filterESet;
			filterESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORING_PARAMETERS__FILTER, newFilter, newFilter, !oldFilterESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetFilter(NotificationChain msgs) {
		ExtensionObject oldFilter = filter;
		filter = null;
		boolean oldFilterESet = filterESet;
		filterESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORING_PARAMETERS__FILTER, oldFilter, null, oldFilterESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilter() {
		if (filter != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MONITORING_PARAMETERS__FILTER, null, msgs);
			msgs = basicUnsetFilter(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFilterESet = filterESet;
			filterESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORING_PARAMETERS__FILTER, null, null, oldFilterESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilter() {
		return filterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQueueSize() {
		return queueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueSize(long newQueueSize) {
		long oldQueueSize = queueSize;
		queueSize = newQueueSize;
		boolean oldQueueSizeESet = queueSizeESet;
		queueSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORING_PARAMETERS__QUEUE_SIZE, oldQueueSize, queueSize, !oldQueueSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQueueSize() {
		long oldQueueSize = queueSize;
		boolean oldQueueSizeESet = queueSizeESet;
		queueSize = QUEUE_SIZE_EDEFAULT;
		queueSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORING_PARAMETERS__QUEUE_SIZE, oldQueueSize, QUEUE_SIZE_EDEFAULT, oldQueueSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQueueSize() {
		return queueSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDiscardOldest() {
		return discardOldest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscardOldest(boolean newDiscardOldest) {
		boolean oldDiscardOldest = discardOldest;
		discardOldest = newDiscardOldest;
		boolean oldDiscardOldestESet = discardOldestESet;
		discardOldestESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MONITORING_PARAMETERS__DISCARD_OLDEST, oldDiscardOldest, discardOldest, !oldDiscardOldestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDiscardOldest() {
		boolean oldDiscardOldest = discardOldest;
		boolean oldDiscardOldestESet = discardOldestESet;
		discardOldest = DISCARD_OLDEST_EDEFAULT;
		discardOldestESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MONITORING_PARAMETERS__DISCARD_OLDEST, oldDiscardOldest, DISCARD_OLDEST_EDEFAULT, oldDiscardOldestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiscardOldest() {
		return discardOldestESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.MONITORING_PARAMETERS__FILTER:
				return basicUnsetFilter(msgs);
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
			case TypesPackage.MONITORING_PARAMETERS__CLIENT_HANDLE:
				return getClientHandle();
			case TypesPackage.MONITORING_PARAMETERS__SAMPLING_INTERVAL:
				return getSamplingInterval();
			case TypesPackage.MONITORING_PARAMETERS__FILTER:
				return getFilter();
			case TypesPackage.MONITORING_PARAMETERS__QUEUE_SIZE:
				return getQueueSize();
			case TypesPackage.MONITORING_PARAMETERS__DISCARD_OLDEST:
				return isDiscardOldest();
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
			case TypesPackage.MONITORING_PARAMETERS__CLIENT_HANDLE:
				setClientHandle((Long)newValue);
				return;
			case TypesPackage.MONITORING_PARAMETERS__SAMPLING_INTERVAL:
				setSamplingInterval((Double)newValue);
				return;
			case TypesPackage.MONITORING_PARAMETERS__FILTER:
				setFilter((ExtensionObject)newValue);
				return;
			case TypesPackage.MONITORING_PARAMETERS__QUEUE_SIZE:
				setQueueSize((Long)newValue);
				return;
			case TypesPackage.MONITORING_PARAMETERS__DISCARD_OLDEST:
				setDiscardOldest((Boolean)newValue);
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
			case TypesPackage.MONITORING_PARAMETERS__CLIENT_HANDLE:
				unsetClientHandle();
				return;
			case TypesPackage.MONITORING_PARAMETERS__SAMPLING_INTERVAL:
				unsetSamplingInterval();
				return;
			case TypesPackage.MONITORING_PARAMETERS__FILTER:
				unsetFilter();
				return;
			case TypesPackage.MONITORING_PARAMETERS__QUEUE_SIZE:
				unsetQueueSize();
				return;
			case TypesPackage.MONITORING_PARAMETERS__DISCARD_OLDEST:
				unsetDiscardOldest();
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
			case TypesPackage.MONITORING_PARAMETERS__CLIENT_HANDLE:
				return isSetClientHandle();
			case TypesPackage.MONITORING_PARAMETERS__SAMPLING_INTERVAL:
				return isSetSamplingInterval();
			case TypesPackage.MONITORING_PARAMETERS__FILTER:
				return isSetFilter();
			case TypesPackage.MONITORING_PARAMETERS__QUEUE_SIZE:
				return isSetQueueSize();
			case TypesPackage.MONITORING_PARAMETERS__DISCARD_OLDEST:
				return isSetDiscardOldest();
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
		result.append(" (clientHandle: ");
		if (clientHandleESet) result.append(clientHandle); else result.append("<unset>");
		result.append(", samplingInterval: ");
		if (samplingIntervalESet) result.append(samplingInterval); else result.append("<unset>");
		result.append(", queueSize: ");
		if (queueSizeESet) result.append(queueSize); else result.append("<unset>");
		result.append(", discardOldest: ");
		if (discardOldestESet) result.append(discardOldest); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MonitoringParametersImpl
