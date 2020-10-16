/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;
import org.opcfoundation.ua._2011._03.ua.node.set.TranslationType;
import org.opcfoundation.ua._2011._03.ua.node.set.UAVariable;
import org.opcfoundation.ua._2011._03.ua.node.set.ValueType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UA Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableImpl#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableImpl#getArrayDimensions <em>Array Dimensions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableImpl#isHistorizing <em>Historizing</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableImpl#getMinimumSamplingInterval <em>Minimum Sampling Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableImpl#getUserAccessLevel <em>User Access Level</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableImpl#getValueRank <em>Value Rank</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UAVariableImpl extends UAInstanceImpl implements UAVariable {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ValueType1 value;

	/**
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected EList<TranslationType> translation;

	/**
	 * The default value of the '{@link #getAccessLevel() <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLevel()
	 * @generated
	 * @ordered
	 */
	protected static final long ACCESS_LEVEL_EDEFAULT = 1L;

	/**
	 * The cached value of the '{@link #getAccessLevel() <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLevel()
	 * @generated
	 * @ordered
	 */
	protected long accessLevel = ACCESS_LEVEL_EDEFAULT;

	/**
	 * This is true if the Access Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accessLevelESet;

	/**
	 * The default value of the '{@link #getArrayDimensions() <em>Array Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final String ARRAY_DIMENSIONS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getArrayDimensions() <em>Array Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayDimensions()
	 * @generated
	 * @ordered
	 */
	protected String arrayDimensions = ARRAY_DIMENSIONS_EDEFAULT;

	/**
	 * This is true if the Array Dimensions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean arrayDimensionsESet;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_EDEFAULT = "i=24";

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected String dataType = DATA_TYPE_EDEFAULT;

	/**
	 * This is true if the Data Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataTypeESet;

	/**
	 * The default value of the '{@link #isHistorizing() <em>Historizing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHistorizing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HISTORIZING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHistorizing() <em>Historizing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHistorizing()
	 * @generated
	 * @ordered
	 */
	protected boolean historizing = HISTORIZING_EDEFAULT;

	/**
	 * This is true if the Historizing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean historizingESet;

	/**
	 * The default value of the '{@link #getMinimumSamplingInterval() <em>Minimum Sampling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSamplingInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_SAMPLING_INTERVAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumSamplingInterval() <em>Minimum Sampling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSamplingInterval()
	 * @generated
	 * @ordered
	 */
	protected double minimumSamplingInterval = MINIMUM_SAMPLING_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Minimum Sampling Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumSamplingIntervalESet;

	/**
	 * The default value of the '{@link #getUserAccessLevel() <em>User Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAccessLevel()
	 * @generated
	 * @ordered
	 */
	protected static final long USER_ACCESS_LEVEL_EDEFAULT = 1L;

	/**
	 * The cached value of the '{@link #getUserAccessLevel() <em>User Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAccessLevel()
	 * @generated
	 * @ordered
	 */
	protected long userAccessLevel = USER_ACCESS_LEVEL_EDEFAULT;

	/**
	 * This is true if the User Access Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userAccessLevelESet;

	/**
	 * The default value of the '{@link #getValueRank() <em>Value Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRank()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_RANK_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getValueRank() <em>Value Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRank()
	 * @generated
	 * @ordered
	 */
	protected int valueRank = VALUE_RANK_EDEFAULT;

	/**
	 * This is true if the Value Rank attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueRankESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UAVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.UA_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType1 getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ValueType1 newValue, NotificationChain msgs) {
		ValueType1 oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_VARIABLE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(ValueType1 newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_VARIABLE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_VARIABLE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_VARIABLE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TranslationType> getTranslation() {
		if (translation == null) {
			translation = new EObjectContainmentEList<TranslationType>(TranslationType.class, this, SetPackage.UA_VARIABLE__TRANSLATION);
		}
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAccessLevel() {
		return accessLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessLevel(long newAccessLevel) {
		long oldAccessLevel = accessLevel;
		accessLevel = newAccessLevel;
		boolean oldAccessLevelESet = accessLevelESet;
		accessLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_VARIABLE__ACCESS_LEVEL, oldAccessLevel, accessLevel, !oldAccessLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAccessLevel() {
		long oldAccessLevel = accessLevel;
		boolean oldAccessLevelESet = accessLevelESet;
		accessLevel = ACCESS_LEVEL_EDEFAULT;
		accessLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.UA_VARIABLE__ACCESS_LEVEL, oldAccessLevel, ACCESS_LEVEL_EDEFAULT, oldAccessLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAccessLevel() {
		return accessLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArrayDimensions() {
		return arrayDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrayDimensions(String newArrayDimensions) {
		String oldArrayDimensions = arrayDimensions;
		arrayDimensions = newArrayDimensions;
		boolean oldArrayDimensionsESet = arrayDimensionsESet;
		arrayDimensionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_VARIABLE__ARRAY_DIMENSIONS, oldArrayDimensions, arrayDimensions, !oldArrayDimensionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArrayDimensions() {
		String oldArrayDimensions = arrayDimensions;
		boolean oldArrayDimensionsESet = arrayDimensionsESet;
		arrayDimensions = ARRAY_DIMENSIONS_EDEFAULT;
		arrayDimensionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.UA_VARIABLE__ARRAY_DIMENSIONS, oldArrayDimensions, ARRAY_DIMENSIONS_EDEFAULT, oldArrayDimensionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArrayDimensions() {
		return arrayDimensionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(String newDataType) {
		String oldDataType = dataType;
		dataType = newDataType;
		boolean oldDataTypeESet = dataTypeESet;
		dataTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_VARIABLE__DATA_TYPE, oldDataType, dataType, !oldDataTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataType() {
		String oldDataType = dataType;
		boolean oldDataTypeESet = dataTypeESet;
		dataType = DATA_TYPE_EDEFAULT;
		dataTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.UA_VARIABLE__DATA_TYPE, oldDataType, DATA_TYPE_EDEFAULT, oldDataTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataType() {
		return dataTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHistorizing() {
		return historizing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistorizing(boolean newHistorizing) {
		boolean oldHistorizing = historizing;
		historizing = newHistorizing;
		boolean oldHistorizingESet = historizingESet;
		historizingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_VARIABLE__HISTORIZING, oldHistorizing, historizing, !oldHistorizingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHistorizing() {
		boolean oldHistorizing = historizing;
		boolean oldHistorizingESet = historizingESet;
		historizing = HISTORIZING_EDEFAULT;
		historizingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.UA_VARIABLE__HISTORIZING, oldHistorizing, HISTORIZING_EDEFAULT, oldHistorizingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHistorizing() {
		return historizingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumSamplingInterval() {
		return minimumSamplingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumSamplingInterval(double newMinimumSamplingInterval) {
		double oldMinimumSamplingInterval = minimumSamplingInterval;
		minimumSamplingInterval = newMinimumSamplingInterval;
		boolean oldMinimumSamplingIntervalESet = minimumSamplingIntervalESet;
		minimumSamplingIntervalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_VARIABLE__MINIMUM_SAMPLING_INTERVAL, oldMinimumSamplingInterval, minimumSamplingInterval, !oldMinimumSamplingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumSamplingInterval() {
		double oldMinimumSamplingInterval = minimumSamplingInterval;
		boolean oldMinimumSamplingIntervalESet = minimumSamplingIntervalESet;
		minimumSamplingInterval = MINIMUM_SAMPLING_INTERVAL_EDEFAULT;
		minimumSamplingIntervalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.UA_VARIABLE__MINIMUM_SAMPLING_INTERVAL, oldMinimumSamplingInterval, MINIMUM_SAMPLING_INTERVAL_EDEFAULT, oldMinimumSamplingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumSamplingInterval() {
		return minimumSamplingIntervalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUserAccessLevel() {
		return userAccessLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserAccessLevel(long newUserAccessLevel) {
		long oldUserAccessLevel = userAccessLevel;
		userAccessLevel = newUserAccessLevel;
		boolean oldUserAccessLevelESet = userAccessLevelESet;
		userAccessLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_VARIABLE__USER_ACCESS_LEVEL, oldUserAccessLevel, userAccessLevel, !oldUserAccessLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserAccessLevel() {
		long oldUserAccessLevel = userAccessLevel;
		boolean oldUserAccessLevelESet = userAccessLevelESet;
		userAccessLevel = USER_ACCESS_LEVEL_EDEFAULT;
		userAccessLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.UA_VARIABLE__USER_ACCESS_LEVEL, oldUserAccessLevel, USER_ACCESS_LEVEL_EDEFAULT, oldUserAccessLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserAccessLevel() {
		return userAccessLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValueRank() {
		return valueRank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueRank(int newValueRank) {
		int oldValueRank = valueRank;
		valueRank = newValueRank;
		boolean oldValueRankESet = valueRankESet;
		valueRankESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_VARIABLE__VALUE_RANK, oldValueRank, valueRank, !oldValueRankESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValueRank() {
		int oldValueRank = valueRank;
		boolean oldValueRankESet = valueRankESet;
		valueRank = VALUE_RANK_EDEFAULT;
		valueRankESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.UA_VARIABLE__VALUE_RANK, oldValueRank, VALUE_RANK_EDEFAULT, oldValueRankESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValueRank() {
		return valueRankESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.UA_VARIABLE__VALUE:
				return basicSetValue(null, msgs);
			case SetPackage.UA_VARIABLE__TRANSLATION:
				return ((InternalEList<?>)getTranslation()).basicRemove(otherEnd, msgs);
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
			case SetPackage.UA_VARIABLE__VALUE:
				return getValue();
			case SetPackage.UA_VARIABLE__TRANSLATION:
				return getTranslation();
			case SetPackage.UA_VARIABLE__ACCESS_LEVEL:
				return getAccessLevel();
			case SetPackage.UA_VARIABLE__ARRAY_DIMENSIONS:
				return getArrayDimensions();
			case SetPackage.UA_VARIABLE__DATA_TYPE:
				return getDataType();
			case SetPackage.UA_VARIABLE__HISTORIZING:
				return isHistorizing();
			case SetPackage.UA_VARIABLE__MINIMUM_SAMPLING_INTERVAL:
				return getMinimumSamplingInterval();
			case SetPackage.UA_VARIABLE__USER_ACCESS_LEVEL:
				return getUserAccessLevel();
			case SetPackage.UA_VARIABLE__VALUE_RANK:
				return getValueRank();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SetPackage.UA_VARIABLE__VALUE:
				setValue((ValueType1)newValue);
				return;
			case SetPackage.UA_VARIABLE__TRANSLATION:
				getTranslation().clear();
				getTranslation().addAll((Collection<? extends TranslationType>)newValue);
				return;
			case SetPackage.UA_VARIABLE__ACCESS_LEVEL:
				setAccessLevel((Long)newValue);
				return;
			case SetPackage.UA_VARIABLE__ARRAY_DIMENSIONS:
				setArrayDimensions((String)newValue);
				return;
			case SetPackage.UA_VARIABLE__DATA_TYPE:
				setDataType((String)newValue);
				return;
			case SetPackage.UA_VARIABLE__HISTORIZING:
				setHistorizing((Boolean)newValue);
				return;
			case SetPackage.UA_VARIABLE__MINIMUM_SAMPLING_INTERVAL:
				setMinimumSamplingInterval((Double)newValue);
				return;
			case SetPackage.UA_VARIABLE__USER_ACCESS_LEVEL:
				setUserAccessLevel((Long)newValue);
				return;
			case SetPackage.UA_VARIABLE__VALUE_RANK:
				setValueRank((Integer)newValue);
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
			case SetPackage.UA_VARIABLE__VALUE:
				setValue((ValueType1)null);
				return;
			case SetPackage.UA_VARIABLE__TRANSLATION:
				getTranslation().clear();
				return;
			case SetPackage.UA_VARIABLE__ACCESS_LEVEL:
				unsetAccessLevel();
				return;
			case SetPackage.UA_VARIABLE__ARRAY_DIMENSIONS:
				unsetArrayDimensions();
				return;
			case SetPackage.UA_VARIABLE__DATA_TYPE:
				unsetDataType();
				return;
			case SetPackage.UA_VARIABLE__HISTORIZING:
				unsetHistorizing();
				return;
			case SetPackage.UA_VARIABLE__MINIMUM_SAMPLING_INTERVAL:
				unsetMinimumSamplingInterval();
				return;
			case SetPackage.UA_VARIABLE__USER_ACCESS_LEVEL:
				unsetUserAccessLevel();
				return;
			case SetPackage.UA_VARIABLE__VALUE_RANK:
				unsetValueRank();
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
			case SetPackage.UA_VARIABLE__VALUE:
				return value != null;
			case SetPackage.UA_VARIABLE__TRANSLATION:
				return translation != null && !translation.isEmpty();
			case SetPackage.UA_VARIABLE__ACCESS_LEVEL:
				return isSetAccessLevel();
			case SetPackage.UA_VARIABLE__ARRAY_DIMENSIONS:
				return isSetArrayDimensions();
			case SetPackage.UA_VARIABLE__DATA_TYPE:
				return isSetDataType();
			case SetPackage.UA_VARIABLE__HISTORIZING:
				return isSetHistorizing();
			case SetPackage.UA_VARIABLE__MINIMUM_SAMPLING_INTERVAL:
				return isSetMinimumSamplingInterval();
			case SetPackage.UA_VARIABLE__USER_ACCESS_LEVEL:
				return isSetUserAccessLevel();
			case SetPackage.UA_VARIABLE__VALUE_RANK:
				return isSetValueRank();
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
		result.append(" (accessLevel: ");
		if (accessLevelESet) result.append(accessLevel); else result.append("<unset>");
		result.append(", arrayDimensions: ");
		if (arrayDimensionsESet) result.append(arrayDimensions); else result.append("<unset>");
		result.append(", dataType: ");
		if (dataTypeESet) result.append(dataType); else result.append("<unset>");
		result.append(", historizing: ");
		if (historizingESet) result.append(historizing); else result.append("<unset>");
		result.append(", minimumSamplingInterval: ");
		if (minimumSamplingIntervalESet) result.append(minimumSamplingInterval); else result.append("<unset>");
		result.append(", userAccessLevel: ");
		if (userAccessLevelESet) result.append(userAccessLevel); else result.append("<unset>");
		result.append(", valueRank: ");
		if (valueRankESet) result.append(valueRank); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UAVariableImpl
