/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.AggregateConfiguration;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AggregateConfigurationImpl#isUseServerCapabilitiesDefaults <em>Use Server Capabilities Defaults</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AggregateConfigurationImpl#isTreatUncertainAsBad <em>Treat Uncertain As Bad</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AggregateConfigurationImpl#getPercentDataBad <em>Percent Data Bad</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AggregateConfigurationImpl#getPercentDataGood <em>Percent Data Good</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.AggregateConfigurationImpl#isUseSlopedExtrapolation <em>Use Sloped Extrapolation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregateConfigurationImpl extends MinimalEObjectImpl.Container implements AggregateConfiguration {
	/**
	 * The default value of the '{@link #isUseServerCapabilitiesDefaults() <em>Use Server Capabilities Defaults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseServerCapabilitiesDefaults()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_SERVER_CAPABILITIES_DEFAULTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseServerCapabilitiesDefaults() <em>Use Server Capabilities Defaults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseServerCapabilitiesDefaults()
	 * @generated
	 * @ordered
	 */
	protected boolean useServerCapabilitiesDefaults = USE_SERVER_CAPABILITIES_DEFAULTS_EDEFAULT;

	/**
	 * This is true if the Use Server Capabilities Defaults attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useServerCapabilitiesDefaultsESet;

	/**
	 * The default value of the '{@link #isTreatUncertainAsBad() <em>Treat Uncertain As Bad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTreatUncertainAsBad()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TREAT_UNCERTAIN_AS_BAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTreatUncertainAsBad() <em>Treat Uncertain As Bad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTreatUncertainAsBad()
	 * @generated
	 * @ordered
	 */
	protected boolean treatUncertainAsBad = TREAT_UNCERTAIN_AS_BAD_EDEFAULT;

	/**
	 * This is true if the Treat Uncertain As Bad attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean treatUncertainAsBadESet;

	/**
	 * The default value of the '{@link #getPercentDataBad() <em>Percent Data Bad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentDataBad()
	 * @generated
	 * @ordered
	 */
	protected static final short PERCENT_DATA_BAD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPercentDataBad() <em>Percent Data Bad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentDataBad()
	 * @generated
	 * @ordered
	 */
	protected short percentDataBad = PERCENT_DATA_BAD_EDEFAULT;

	/**
	 * This is true if the Percent Data Bad attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean percentDataBadESet;

	/**
	 * The default value of the '{@link #getPercentDataGood() <em>Percent Data Good</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentDataGood()
	 * @generated
	 * @ordered
	 */
	protected static final short PERCENT_DATA_GOOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPercentDataGood() <em>Percent Data Good</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentDataGood()
	 * @generated
	 * @ordered
	 */
	protected short percentDataGood = PERCENT_DATA_GOOD_EDEFAULT;

	/**
	 * This is true if the Percent Data Good attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean percentDataGoodESet;

	/**
	 * The default value of the '{@link #isUseSlopedExtrapolation() <em>Use Sloped Extrapolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseSlopedExtrapolation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_SLOPED_EXTRAPOLATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseSlopedExtrapolation() <em>Use Sloped Extrapolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseSlopedExtrapolation()
	 * @generated
	 * @ordered
	 */
	protected boolean useSlopedExtrapolation = USE_SLOPED_EXTRAPOLATION_EDEFAULT;

	/**
	 * This is true if the Use Sloped Extrapolation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useSlopedExtrapolationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getAggregateConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseServerCapabilitiesDefaults() {
		return useServerCapabilitiesDefaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseServerCapabilitiesDefaults(boolean newUseServerCapabilitiesDefaults) {
		boolean oldUseServerCapabilitiesDefaults = useServerCapabilitiesDefaults;
		useServerCapabilitiesDefaults = newUseServerCapabilitiesDefaults;
		boolean oldUseServerCapabilitiesDefaultsESet = useServerCapabilitiesDefaultsESet;
		useServerCapabilitiesDefaultsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.AGGREGATE_CONFIGURATION__USE_SERVER_CAPABILITIES_DEFAULTS, oldUseServerCapabilitiesDefaults, useServerCapabilitiesDefaults, !oldUseServerCapabilitiesDefaultsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseServerCapabilitiesDefaults() {
		boolean oldUseServerCapabilitiesDefaults = useServerCapabilitiesDefaults;
		boolean oldUseServerCapabilitiesDefaultsESet = useServerCapabilitiesDefaultsESet;
		useServerCapabilitiesDefaults = USE_SERVER_CAPABILITIES_DEFAULTS_EDEFAULT;
		useServerCapabilitiesDefaultsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.AGGREGATE_CONFIGURATION__USE_SERVER_CAPABILITIES_DEFAULTS, oldUseServerCapabilitiesDefaults, USE_SERVER_CAPABILITIES_DEFAULTS_EDEFAULT, oldUseServerCapabilitiesDefaultsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseServerCapabilitiesDefaults() {
		return useServerCapabilitiesDefaultsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTreatUncertainAsBad() {
		return treatUncertainAsBad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreatUncertainAsBad(boolean newTreatUncertainAsBad) {
		boolean oldTreatUncertainAsBad = treatUncertainAsBad;
		treatUncertainAsBad = newTreatUncertainAsBad;
		boolean oldTreatUncertainAsBadESet = treatUncertainAsBadESet;
		treatUncertainAsBadESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.AGGREGATE_CONFIGURATION__TREAT_UNCERTAIN_AS_BAD, oldTreatUncertainAsBad, treatUncertainAsBad, !oldTreatUncertainAsBadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTreatUncertainAsBad() {
		boolean oldTreatUncertainAsBad = treatUncertainAsBad;
		boolean oldTreatUncertainAsBadESet = treatUncertainAsBadESet;
		treatUncertainAsBad = TREAT_UNCERTAIN_AS_BAD_EDEFAULT;
		treatUncertainAsBadESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.AGGREGATE_CONFIGURATION__TREAT_UNCERTAIN_AS_BAD, oldTreatUncertainAsBad, TREAT_UNCERTAIN_AS_BAD_EDEFAULT, oldTreatUncertainAsBadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTreatUncertainAsBad() {
		return treatUncertainAsBadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getPercentDataBad() {
		return percentDataBad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentDataBad(short newPercentDataBad) {
		short oldPercentDataBad = percentDataBad;
		percentDataBad = newPercentDataBad;
		boolean oldPercentDataBadESet = percentDataBadESet;
		percentDataBadESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.AGGREGATE_CONFIGURATION__PERCENT_DATA_BAD, oldPercentDataBad, percentDataBad, !oldPercentDataBadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPercentDataBad() {
		short oldPercentDataBad = percentDataBad;
		boolean oldPercentDataBadESet = percentDataBadESet;
		percentDataBad = PERCENT_DATA_BAD_EDEFAULT;
		percentDataBadESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.AGGREGATE_CONFIGURATION__PERCENT_DATA_BAD, oldPercentDataBad, PERCENT_DATA_BAD_EDEFAULT, oldPercentDataBadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPercentDataBad() {
		return percentDataBadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getPercentDataGood() {
		return percentDataGood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentDataGood(short newPercentDataGood) {
		short oldPercentDataGood = percentDataGood;
		percentDataGood = newPercentDataGood;
		boolean oldPercentDataGoodESet = percentDataGoodESet;
		percentDataGoodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.AGGREGATE_CONFIGURATION__PERCENT_DATA_GOOD, oldPercentDataGood, percentDataGood, !oldPercentDataGoodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPercentDataGood() {
		short oldPercentDataGood = percentDataGood;
		boolean oldPercentDataGoodESet = percentDataGoodESet;
		percentDataGood = PERCENT_DATA_GOOD_EDEFAULT;
		percentDataGoodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.AGGREGATE_CONFIGURATION__PERCENT_DATA_GOOD, oldPercentDataGood, PERCENT_DATA_GOOD_EDEFAULT, oldPercentDataGoodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPercentDataGood() {
		return percentDataGoodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseSlopedExtrapolation() {
		return useSlopedExtrapolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseSlopedExtrapolation(boolean newUseSlopedExtrapolation) {
		boolean oldUseSlopedExtrapolation = useSlopedExtrapolation;
		useSlopedExtrapolation = newUseSlopedExtrapolation;
		boolean oldUseSlopedExtrapolationESet = useSlopedExtrapolationESet;
		useSlopedExtrapolationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.AGGREGATE_CONFIGURATION__USE_SLOPED_EXTRAPOLATION, oldUseSlopedExtrapolation, useSlopedExtrapolation, !oldUseSlopedExtrapolationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseSlopedExtrapolation() {
		boolean oldUseSlopedExtrapolation = useSlopedExtrapolation;
		boolean oldUseSlopedExtrapolationESet = useSlopedExtrapolationESet;
		useSlopedExtrapolation = USE_SLOPED_EXTRAPOLATION_EDEFAULT;
		useSlopedExtrapolationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.AGGREGATE_CONFIGURATION__USE_SLOPED_EXTRAPOLATION, oldUseSlopedExtrapolation, USE_SLOPED_EXTRAPOLATION_EDEFAULT, oldUseSlopedExtrapolationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseSlopedExtrapolation() {
		return useSlopedExtrapolationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.AGGREGATE_CONFIGURATION__USE_SERVER_CAPABILITIES_DEFAULTS:
				return isUseServerCapabilitiesDefaults();
			case TypesPackage.AGGREGATE_CONFIGURATION__TREAT_UNCERTAIN_AS_BAD:
				return isTreatUncertainAsBad();
			case TypesPackage.AGGREGATE_CONFIGURATION__PERCENT_DATA_BAD:
				return getPercentDataBad();
			case TypesPackage.AGGREGATE_CONFIGURATION__PERCENT_DATA_GOOD:
				return getPercentDataGood();
			case TypesPackage.AGGREGATE_CONFIGURATION__USE_SLOPED_EXTRAPOLATION:
				return isUseSlopedExtrapolation();
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
			case TypesPackage.AGGREGATE_CONFIGURATION__USE_SERVER_CAPABILITIES_DEFAULTS:
				setUseServerCapabilitiesDefaults((Boolean)newValue);
				return;
			case TypesPackage.AGGREGATE_CONFIGURATION__TREAT_UNCERTAIN_AS_BAD:
				setTreatUncertainAsBad((Boolean)newValue);
				return;
			case TypesPackage.AGGREGATE_CONFIGURATION__PERCENT_DATA_BAD:
				setPercentDataBad((Short)newValue);
				return;
			case TypesPackage.AGGREGATE_CONFIGURATION__PERCENT_DATA_GOOD:
				setPercentDataGood((Short)newValue);
				return;
			case TypesPackage.AGGREGATE_CONFIGURATION__USE_SLOPED_EXTRAPOLATION:
				setUseSlopedExtrapolation((Boolean)newValue);
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
			case TypesPackage.AGGREGATE_CONFIGURATION__USE_SERVER_CAPABILITIES_DEFAULTS:
				unsetUseServerCapabilitiesDefaults();
				return;
			case TypesPackage.AGGREGATE_CONFIGURATION__TREAT_UNCERTAIN_AS_BAD:
				unsetTreatUncertainAsBad();
				return;
			case TypesPackage.AGGREGATE_CONFIGURATION__PERCENT_DATA_BAD:
				unsetPercentDataBad();
				return;
			case TypesPackage.AGGREGATE_CONFIGURATION__PERCENT_DATA_GOOD:
				unsetPercentDataGood();
				return;
			case TypesPackage.AGGREGATE_CONFIGURATION__USE_SLOPED_EXTRAPOLATION:
				unsetUseSlopedExtrapolation();
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
			case TypesPackage.AGGREGATE_CONFIGURATION__USE_SERVER_CAPABILITIES_DEFAULTS:
				return isSetUseServerCapabilitiesDefaults();
			case TypesPackage.AGGREGATE_CONFIGURATION__TREAT_UNCERTAIN_AS_BAD:
				return isSetTreatUncertainAsBad();
			case TypesPackage.AGGREGATE_CONFIGURATION__PERCENT_DATA_BAD:
				return isSetPercentDataBad();
			case TypesPackage.AGGREGATE_CONFIGURATION__PERCENT_DATA_GOOD:
				return isSetPercentDataGood();
			case TypesPackage.AGGREGATE_CONFIGURATION__USE_SLOPED_EXTRAPOLATION:
				return isSetUseSlopedExtrapolation();
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
		result.append(" (useServerCapabilitiesDefaults: ");
		if (useServerCapabilitiesDefaultsESet) result.append(useServerCapabilitiesDefaults); else result.append("<unset>");
		result.append(", treatUncertainAsBad: ");
		if (treatUncertainAsBadESet) result.append(treatUncertainAsBad); else result.append("<unset>");
		result.append(", percentDataBad: ");
		if (percentDataBadESet) result.append(percentDataBad); else result.append("<unset>");
		result.append(", percentDataGood: ");
		if (percentDataGoodESet) result.append(percentDataGood); else result.append("<unset>");
		result.append(", useSlopedExtrapolation: ");
		if (useSlopedExtrapolationESet) result.append(useSlopedExtrapolation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AggregateConfigurationImpl
