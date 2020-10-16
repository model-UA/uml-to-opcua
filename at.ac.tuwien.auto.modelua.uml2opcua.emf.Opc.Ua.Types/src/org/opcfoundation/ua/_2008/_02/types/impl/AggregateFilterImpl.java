/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.AggregateConfiguration;
import org.opcfoundation.ua._2008._02.types.AggregateFilter;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AggregateFilterImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AggregateFilterImpl#getAggregateType <em>Aggregate Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AggregateFilterImpl#getProcessingInterval <em>Processing Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AggregateFilterImpl#getAggregateConfiguration <em>Aggregate Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregateFilterImpl extends MonitoringFilterImpl implements AggregateFilter {
	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar startTime = START_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAggregateType() <em>Aggregate Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateType()
	 * @generated
	 * @ordered
	 */
	protected NodeId aggregateType;

	/**
	 * This is true if the Aggregate Type containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aggregateTypeESet;

	/**
	 * The default value of the '{@link #getProcessingInterval() <em>Processing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double PROCESSING_INTERVAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProcessingInterval() <em>Processing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingInterval()
	 * @generated
	 * @ordered
	 */
	protected double processingInterval = PROCESSING_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Processing Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processingIntervalESet;

	/**
	 * The cached value of the '{@link #getAggregateConfiguration() <em>Aggregate Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateConfiguration()
	 * @generated
	 * @ordered
	 */
	protected AggregateConfiguration aggregateConfiguration;

	/**
	 * This is true if the Aggregate Configuration containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aggregateConfigurationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getAggregateFilter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(XMLGregorianCalendar newStartTime) {
		XMLGregorianCalendar oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.AGGREGATE_FILTER__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getAggregateType() {
		return aggregateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregateType(NodeId newAggregateType, NotificationChain msgs) {
		NodeId oldAggregateType = aggregateType;
		aggregateType = newAggregateType;
		boolean oldAggregateTypeESet = aggregateTypeESet;
		aggregateTypeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.AGGREGATE_FILTER__AGGREGATE_TYPE, oldAggregateType, newAggregateType, !oldAggregateTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregateType(NodeId newAggregateType) {
		if (newAggregateType != aggregateType) {
			NotificationChain msgs = null;
			if (aggregateType != null)
				msgs = ((InternalEObject)aggregateType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AGGREGATE_FILTER__AGGREGATE_TYPE, null, msgs);
			if (newAggregateType != null)
				msgs = ((InternalEObject)newAggregateType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AGGREGATE_FILTER__AGGREGATE_TYPE, null, msgs);
			msgs = basicSetAggregateType(newAggregateType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAggregateTypeESet = aggregateTypeESet;
			aggregateTypeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.AGGREGATE_FILTER__AGGREGATE_TYPE, newAggregateType, newAggregateType, !oldAggregateTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAggregateType(NotificationChain msgs) {
		NodeId oldAggregateType = aggregateType;
		aggregateType = null;
		boolean oldAggregateTypeESet = aggregateTypeESet;
		aggregateTypeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.AGGREGATE_FILTER__AGGREGATE_TYPE, oldAggregateType, null, oldAggregateTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAggregateType() {
		if (aggregateType != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)aggregateType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AGGREGATE_FILTER__AGGREGATE_TYPE, null, msgs);
			msgs = basicUnsetAggregateType(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAggregateTypeESet = aggregateTypeESet;
			aggregateTypeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.AGGREGATE_FILTER__AGGREGATE_TYPE, null, null, oldAggregateTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAggregateType() {
		return aggregateTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProcessingInterval() {
		return processingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingInterval(double newProcessingInterval) {
		double oldProcessingInterval = processingInterval;
		processingInterval = newProcessingInterval;
		boolean oldProcessingIntervalESet = processingIntervalESet;
		processingIntervalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.AGGREGATE_FILTER__PROCESSING_INTERVAL, oldProcessingInterval, processingInterval, !oldProcessingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProcessingInterval() {
		double oldProcessingInterval = processingInterval;
		boolean oldProcessingIntervalESet = processingIntervalESet;
		processingInterval = PROCESSING_INTERVAL_EDEFAULT;
		processingIntervalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.AGGREGATE_FILTER__PROCESSING_INTERVAL, oldProcessingInterval, PROCESSING_INTERVAL_EDEFAULT, oldProcessingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProcessingInterval() {
		return processingIntervalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateConfiguration getAggregateConfiguration() {
		return aggregateConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregateConfiguration(AggregateConfiguration newAggregateConfiguration, NotificationChain msgs) {
		AggregateConfiguration oldAggregateConfiguration = aggregateConfiguration;
		aggregateConfiguration = newAggregateConfiguration;
		boolean oldAggregateConfigurationESet = aggregateConfigurationESet;
		aggregateConfigurationESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.AGGREGATE_FILTER__AGGREGATE_CONFIGURATION, oldAggregateConfiguration, newAggregateConfiguration, !oldAggregateConfigurationESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregateConfiguration(AggregateConfiguration newAggregateConfiguration) {
		if (newAggregateConfiguration != aggregateConfiguration) {
			NotificationChain msgs = null;
			if (aggregateConfiguration != null)
				msgs = ((InternalEObject)aggregateConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AGGREGATE_FILTER__AGGREGATE_CONFIGURATION, null, msgs);
			if (newAggregateConfiguration != null)
				msgs = ((InternalEObject)newAggregateConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AGGREGATE_FILTER__AGGREGATE_CONFIGURATION, null, msgs);
			msgs = basicSetAggregateConfiguration(newAggregateConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAggregateConfigurationESet = aggregateConfigurationESet;
			aggregateConfigurationESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.AGGREGATE_FILTER__AGGREGATE_CONFIGURATION, newAggregateConfiguration, newAggregateConfiguration, !oldAggregateConfigurationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAggregateConfiguration(NotificationChain msgs) {
		AggregateConfiguration oldAggregateConfiguration = aggregateConfiguration;
		aggregateConfiguration = null;
		boolean oldAggregateConfigurationESet = aggregateConfigurationESet;
		aggregateConfigurationESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.AGGREGATE_FILTER__AGGREGATE_CONFIGURATION, oldAggregateConfiguration, null, oldAggregateConfigurationESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAggregateConfiguration() {
		if (aggregateConfiguration != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)aggregateConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AGGREGATE_FILTER__AGGREGATE_CONFIGURATION, null, msgs);
			msgs = basicUnsetAggregateConfiguration(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAggregateConfigurationESet = aggregateConfigurationESet;
			aggregateConfigurationESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.AGGREGATE_FILTER__AGGREGATE_CONFIGURATION, null, null, oldAggregateConfigurationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAggregateConfiguration() {
		return aggregateConfigurationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.AGGREGATE_FILTER__AGGREGATE_TYPE:
				return basicUnsetAggregateType(msgs);
			case TypesPackage.AGGREGATE_FILTER__AGGREGATE_CONFIGURATION:
				return basicUnsetAggregateConfiguration(msgs);
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
			case TypesPackage.AGGREGATE_FILTER__START_TIME:
				return getStartTime();
			case TypesPackage.AGGREGATE_FILTER__AGGREGATE_TYPE:
				return getAggregateType();
			case TypesPackage.AGGREGATE_FILTER__PROCESSING_INTERVAL:
				return getProcessingInterval();
			case TypesPackage.AGGREGATE_FILTER__AGGREGATE_CONFIGURATION:
				return getAggregateConfiguration();
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
			case TypesPackage.AGGREGATE_FILTER__START_TIME:
				setStartTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.AGGREGATE_FILTER__AGGREGATE_TYPE:
				setAggregateType((NodeId)newValue);
				return;
			case TypesPackage.AGGREGATE_FILTER__PROCESSING_INTERVAL:
				setProcessingInterval((Double)newValue);
				return;
			case TypesPackage.AGGREGATE_FILTER__AGGREGATE_CONFIGURATION:
				setAggregateConfiguration((AggregateConfiguration)newValue);
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
			case TypesPackage.AGGREGATE_FILTER__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case TypesPackage.AGGREGATE_FILTER__AGGREGATE_TYPE:
				unsetAggregateType();
				return;
			case TypesPackage.AGGREGATE_FILTER__PROCESSING_INTERVAL:
				unsetProcessingInterval();
				return;
			case TypesPackage.AGGREGATE_FILTER__AGGREGATE_CONFIGURATION:
				unsetAggregateConfiguration();
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
			case TypesPackage.AGGREGATE_FILTER__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case TypesPackage.AGGREGATE_FILTER__AGGREGATE_TYPE:
				return isSetAggregateType();
			case TypesPackage.AGGREGATE_FILTER__PROCESSING_INTERVAL:
				return isSetProcessingInterval();
			case TypesPackage.AGGREGATE_FILTER__AGGREGATE_CONFIGURATION:
				return isSetAggregateConfiguration();
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
		result.append(" (startTime: ");
		result.append(startTime);
		result.append(", processingInterval: ");
		if (processingIntervalESet) result.append(processingInterval); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AggregateFilterImpl
