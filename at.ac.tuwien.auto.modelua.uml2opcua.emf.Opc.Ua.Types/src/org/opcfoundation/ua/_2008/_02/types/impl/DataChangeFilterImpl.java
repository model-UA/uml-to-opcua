/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.DataChangeFilter;
import org.opcfoundation.ua._2008._02.types.DataChangeTrigger;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Change Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataChangeFilterImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataChangeFilterImpl#getDeadbandType <em>Deadband Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataChangeFilterImpl#getDeadbandValue <em>Deadband Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataChangeFilterImpl extends MonitoringFilterImpl implements DataChangeFilter {
	/**
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final DataChangeTrigger TRIGGER_EDEFAULT = DataChangeTrigger.STATUS0;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected DataChangeTrigger trigger = TRIGGER_EDEFAULT;

	/**
	 * This is true if the Trigger attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean triggerESet;

	/**
	 * The default value of the '{@link #getDeadbandType() <em>Deadband Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadbandType()
	 * @generated
	 * @ordered
	 */
	protected static final long DEADBAND_TYPE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDeadbandType() <em>Deadband Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadbandType()
	 * @generated
	 * @ordered
	 */
	protected long deadbandType = DEADBAND_TYPE_EDEFAULT;

	/**
	 * This is true if the Deadband Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deadbandTypeESet;

	/**
	 * The default value of the '{@link #getDeadbandValue() <em>Deadband Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadbandValue()
	 * @generated
	 * @ordered
	 */
	protected static final double DEADBAND_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeadbandValue() <em>Deadband Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadbandValue()
	 * @generated
	 * @ordered
	 */
	protected double deadbandValue = DEADBAND_VALUE_EDEFAULT;

	/**
	 * This is true if the Deadband Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deadbandValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataChangeFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getDataChangeFilter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataChangeTrigger getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(DataChangeTrigger newTrigger) {
		DataChangeTrigger oldTrigger = trigger;
		trigger = newTrigger == null ? TRIGGER_EDEFAULT : newTrigger;
		boolean oldTriggerESet = triggerESet;
		triggerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_CHANGE_FILTER__TRIGGER, oldTrigger, trigger, !oldTriggerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrigger() {
		DataChangeTrigger oldTrigger = trigger;
		boolean oldTriggerESet = triggerESet;
		trigger = TRIGGER_EDEFAULT;
		triggerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_CHANGE_FILTER__TRIGGER, oldTrigger, TRIGGER_EDEFAULT, oldTriggerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrigger() {
		return triggerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDeadbandType() {
		return deadbandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadbandType(long newDeadbandType) {
		long oldDeadbandType = deadbandType;
		deadbandType = newDeadbandType;
		boolean oldDeadbandTypeESet = deadbandTypeESet;
		deadbandTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_CHANGE_FILTER__DEADBAND_TYPE, oldDeadbandType, deadbandType, !oldDeadbandTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeadbandType() {
		long oldDeadbandType = deadbandType;
		boolean oldDeadbandTypeESet = deadbandTypeESet;
		deadbandType = DEADBAND_TYPE_EDEFAULT;
		deadbandTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_CHANGE_FILTER__DEADBAND_TYPE, oldDeadbandType, DEADBAND_TYPE_EDEFAULT, oldDeadbandTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeadbandType() {
		return deadbandTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDeadbandValue() {
		return deadbandValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadbandValue(double newDeadbandValue) {
		double oldDeadbandValue = deadbandValue;
		deadbandValue = newDeadbandValue;
		boolean oldDeadbandValueESet = deadbandValueESet;
		deadbandValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_CHANGE_FILTER__DEADBAND_VALUE, oldDeadbandValue, deadbandValue, !oldDeadbandValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeadbandValue() {
		double oldDeadbandValue = deadbandValue;
		boolean oldDeadbandValueESet = deadbandValueESet;
		deadbandValue = DEADBAND_VALUE_EDEFAULT;
		deadbandValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_CHANGE_FILTER__DEADBAND_VALUE, oldDeadbandValue, DEADBAND_VALUE_EDEFAULT, oldDeadbandValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeadbandValue() {
		return deadbandValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.DATA_CHANGE_FILTER__TRIGGER:
				return getTrigger();
			case TypesPackage.DATA_CHANGE_FILTER__DEADBAND_TYPE:
				return getDeadbandType();
			case TypesPackage.DATA_CHANGE_FILTER__DEADBAND_VALUE:
				return getDeadbandValue();
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
			case TypesPackage.DATA_CHANGE_FILTER__TRIGGER:
				setTrigger((DataChangeTrigger)newValue);
				return;
			case TypesPackage.DATA_CHANGE_FILTER__DEADBAND_TYPE:
				setDeadbandType((Long)newValue);
				return;
			case TypesPackage.DATA_CHANGE_FILTER__DEADBAND_VALUE:
				setDeadbandValue((Double)newValue);
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
			case TypesPackage.DATA_CHANGE_FILTER__TRIGGER:
				unsetTrigger();
				return;
			case TypesPackage.DATA_CHANGE_FILTER__DEADBAND_TYPE:
				unsetDeadbandType();
				return;
			case TypesPackage.DATA_CHANGE_FILTER__DEADBAND_VALUE:
				unsetDeadbandValue();
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
			case TypesPackage.DATA_CHANGE_FILTER__TRIGGER:
				return isSetTrigger();
			case TypesPackage.DATA_CHANGE_FILTER__DEADBAND_TYPE:
				return isSetDeadbandType();
			case TypesPackage.DATA_CHANGE_FILTER__DEADBAND_VALUE:
				return isSetDeadbandValue();
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
		result.append(" (trigger: ");
		if (triggerESet) result.append(trigger); else result.append("<unset>");
		result.append(", deadbandType: ");
		if (deadbandTypeESet) result.append(deadbandType); else result.append("<unset>");
		result.append(", deadbandValue: ");
		if (deadbandValueESet) result.append(deadbandValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataChangeFilterImpl
