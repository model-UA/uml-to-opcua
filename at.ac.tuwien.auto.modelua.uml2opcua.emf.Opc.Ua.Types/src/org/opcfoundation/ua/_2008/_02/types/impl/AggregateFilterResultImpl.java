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
import org.opcfoundation.ua._2008._02.types.AggregateFilterResult;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate Filter Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AggregateFilterResultImpl#getRevisedStartTime <em>Revised Start Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AggregateFilterResultImpl#getRevisedProcessingInterval <em>Revised Processing Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AggregateFilterResultImpl#getRevisedAggregateConfiguration <em>Revised Aggregate Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregateFilterResultImpl extends MonitoringFilterResultImpl implements AggregateFilterResult {
	/**
	 * The default value of the '{@link #getRevisedStartTime() <em>Revised Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar REVISED_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevisedStartTime() <em>Revised Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedStartTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar revisedStartTime = REVISED_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevisedProcessingInterval() <em>Revised Processing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedProcessingInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double REVISED_PROCESSING_INTERVAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRevisedProcessingInterval() <em>Revised Processing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedProcessingInterval()
	 * @generated
	 * @ordered
	 */
	protected double revisedProcessingInterval = REVISED_PROCESSING_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Revised Processing Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revisedProcessingIntervalESet;

	/**
	 * The cached value of the '{@link #getRevisedAggregateConfiguration() <em>Revised Aggregate Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedAggregateConfiguration()
	 * @generated
	 * @ordered
	 */
	protected AggregateConfiguration revisedAggregateConfiguration;

	/**
	 * This is true if the Revised Aggregate Configuration containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revisedAggregateConfigurationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateFilterResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getAggregateFilterResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getRevisedStartTime() {
		return revisedStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisedStartTime(XMLGregorianCalendar newRevisedStartTime) {
		XMLGregorianCalendar oldRevisedStartTime = revisedStartTime;
		revisedStartTime = newRevisedStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_START_TIME, oldRevisedStartTime, revisedStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRevisedProcessingInterval() {
		return revisedProcessingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisedProcessingInterval(double newRevisedProcessingInterval) {
		double oldRevisedProcessingInterval = revisedProcessingInterval;
		revisedProcessingInterval = newRevisedProcessingInterval;
		boolean oldRevisedProcessingIntervalESet = revisedProcessingIntervalESet;
		revisedProcessingIntervalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_PROCESSING_INTERVAL, oldRevisedProcessingInterval, revisedProcessingInterval, !oldRevisedProcessingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRevisedProcessingInterval() {
		double oldRevisedProcessingInterval = revisedProcessingInterval;
		boolean oldRevisedProcessingIntervalESet = revisedProcessingIntervalESet;
		revisedProcessingInterval = REVISED_PROCESSING_INTERVAL_EDEFAULT;
		revisedProcessingIntervalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_PROCESSING_INTERVAL, oldRevisedProcessingInterval, REVISED_PROCESSING_INTERVAL_EDEFAULT, oldRevisedProcessingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRevisedProcessingInterval() {
		return revisedProcessingIntervalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateConfiguration getRevisedAggregateConfiguration() {
		return revisedAggregateConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevisedAggregateConfiguration(AggregateConfiguration newRevisedAggregateConfiguration, NotificationChain msgs) {
		AggregateConfiguration oldRevisedAggregateConfiguration = revisedAggregateConfiguration;
		revisedAggregateConfiguration = newRevisedAggregateConfiguration;
		boolean oldRevisedAggregateConfigurationESet = revisedAggregateConfigurationESet;
		revisedAggregateConfigurationESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_AGGREGATE_CONFIGURATION, oldRevisedAggregateConfiguration, newRevisedAggregateConfiguration, !oldRevisedAggregateConfigurationESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisedAggregateConfiguration(AggregateConfiguration newRevisedAggregateConfiguration) {
		if (newRevisedAggregateConfiguration != revisedAggregateConfiguration) {
			NotificationChain msgs = null;
			if (revisedAggregateConfiguration != null)
				msgs = ((InternalEObject)revisedAggregateConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_AGGREGATE_CONFIGURATION, null, msgs);
			if (newRevisedAggregateConfiguration != null)
				msgs = ((InternalEObject)newRevisedAggregateConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_AGGREGATE_CONFIGURATION, null, msgs);
			msgs = basicSetRevisedAggregateConfiguration(newRevisedAggregateConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRevisedAggregateConfigurationESet = revisedAggregateConfigurationESet;
			revisedAggregateConfigurationESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_AGGREGATE_CONFIGURATION, newRevisedAggregateConfiguration, newRevisedAggregateConfiguration, !oldRevisedAggregateConfigurationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRevisedAggregateConfiguration(NotificationChain msgs) {
		AggregateConfiguration oldRevisedAggregateConfiguration = revisedAggregateConfiguration;
		revisedAggregateConfiguration = null;
		boolean oldRevisedAggregateConfigurationESet = revisedAggregateConfigurationESet;
		revisedAggregateConfigurationESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_AGGREGATE_CONFIGURATION, oldRevisedAggregateConfiguration, null, oldRevisedAggregateConfigurationESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRevisedAggregateConfiguration() {
		if (revisedAggregateConfiguration != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)revisedAggregateConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_AGGREGATE_CONFIGURATION, null, msgs);
			msgs = basicUnsetRevisedAggregateConfiguration(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRevisedAggregateConfigurationESet = revisedAggregateConfigurationESet;
			revisedAggregateConfigurationESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_AGGREGATE_CONFIGURATION, null, null, oldRevisedAggregateConfigurationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRevisedAggregateConfiguration() {
		return revisedAggregateConfigurationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_AGGREGATE_CONFIGURATION:
				return basicUnsetRevisedAggregateConfiguration(msgs);
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
			case TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_START_TIME:
				return getRevisedStartTime();
			case TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_PROCESSING_INTERVAL:
				return getRevisedProcessingInterval();
			case TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_AGGREGATE_CONFIGURATION:
				return getRevisedAggregateConfiguration();
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
			case TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_START_TIME:
				setRevisedStartTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_PROCESSING_INTERVAL:
				setRevisedProcessingInterval((Double)newValue);
				return;
			case TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_AGGREGATE_CONFIGURATION:
				setRevisedAggregateConfiguration((AggregateConfiguration)newValue);
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
			case TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_START_TIME:
				setRevisedStartTime(REVISED_START_TIME_EDEFAULT);
				return;
			case TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_PROCESSING_INTERVAL:
				unsetRevisedProcessingInterval();
				return;
			case TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_AGGREGATE_CONFIGURATION:
				unsetRevisedAggregateConfiguration();
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
			case TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_START_TIME:
				return REVISED_START_TIME_EDEFAULT == null ? revisedStartTime != null : !REVISED_START_TIME_EDEFAULT.equals(revisedStartTime);
			case TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_PROCESSING_INTERVAL:
				return isSetRevisedProcessingInterval();
			case TypesPackage.AGGREGATE_FILTER_RESULT__REVISED_AGGREGATE_CONFIGURATION:
				return isSetRevisedAggregateConfiguration();
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
		result.append(" (revisedStartTime: ");
		result.append(revisedStartTime);
		result.append(", revisedProcessingInterval: ");
		if (revisedProcessingIntervalESet) result.append(revisedProcessingInterval); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AggregateFilterResultImpl
