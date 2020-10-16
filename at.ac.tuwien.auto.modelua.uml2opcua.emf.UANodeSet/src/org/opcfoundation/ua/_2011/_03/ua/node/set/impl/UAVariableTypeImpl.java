/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;
import org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType;
import org.opcfoundation.ua._2011._03.ua.node.set.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UA Variable Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableTypeImpl#getArrayDimensions <em>Array Dimensions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableTypeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.UAVariableTypeImpl#getValueRank <em>Value Rank</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UAVariableTypeImpl extends UATypeImpl implements UAVariableType {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ValueType value;

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
	protected UAVariableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.UA_VARIABLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ValueType newValue, NotificationChain msgs) {
		ValueType oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.UA_VARIABLE_TYPE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(ValueType newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_VARIABLE_TYPE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.UA_VARIABLE_TYPE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_VARIABLE_TYPE__VALUE, newValue, newValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_VARIABLE_TYPE__ARRAY_DIMENSIONS, oldArrayDimensions, arrayDimensions, !oldArrayDimensionsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.UA_VARIABLE_TYPE__ARRAY_DIMENSIONS, oldArrayDimensions, ARRAY_DIMENSIONS_EDEFAULT, oldArrayDimensionsESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_VARIABLE_TYPE__DATA_TYPE, oldDataType, dataType, !oldDataTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.UA_VARIABLE_TYPE__DATA_TYPE, oldDataType, DATA_TYPE_EDEFAULT, oldDataTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.UA_VARIABLE_TYPE__VALUE_RANK, oldValueRank, valueRank, !oldValueRankESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.UA_VARIABLE_TYPE__VALUE_RANK, oldValueRank, VALUE_RANK_EDEFAULT, oldValueRankESet));
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
			case SetPackage.UA_VARIABLE_TYPE__VALUE:
				return basicSetValue(null, msgs);
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
			case SetPackage.UA_VARIABLE_TYPE__VALUE:
				return getValue();
			case SetPackage.UA_VARIABLE_TYPE__ARRAY_DIMENSIONS:
				return getArrayDimensions();
			case SetPackage.UA_VARIABLE_TYPE__DATA_TYPE:
				return getDataType();
			case SetPackage.UA_VARIABLE_TYPE__VALUE_RANK:
				return getValueRank();
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
			case SetPackage.UA_VARIABLE_TYPE__VALUE:
				setValue((ValueType)newValue);
				return;
			case SetPackage.UA_VARIABLE_TYPE__ARRAY_DIMENSIONS:
				setArrayDimensions((String)newValue);
				return;
			case SetPackage.UA_VARIABLE_TYPE__DATA_TYPE:
				setDataType((String)newValue);
				return;
			case SetPackage.UA_VARIABLE_TYPE__VALUE_RANK:
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
			case SetPackage.UA_VARIABLE_TYPE__VALUE:
				setValue((ValueType)null);
				return;
			case SetPackage.UA_VARIABLE_TYPE__ARRAY_DIMENSIONS:
				unsetArrayDimensions();
				return;
			case SetPackage.UA_VARIABLE_TYPE__DATA_TYPE:
				unsetDataType();
				return;
			case SetPackage.UA_VARIABLE_TYPE__VALUE_RANK:
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
			case SetPackage.UA_VARIABLE_TYPE__VALUE:
				return value != null;
			case SetPackage.UA_VARIABLE_TYPE__ARRAY_DIMENSIONS:
				return isSetArrayDimensions();
			case SetPackage.UA_VARIABLE_TYPE__DATA_TYPE:
				return isSetDataType();
			case SetPackage.UA_VARIABLE_TYPE__VALUE_RANK:
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
		result.append(" (arrayDimensions: ");
		if (arrayDimensionsESet) result.append(arrayDimensions); else result.append("<unset>");
		result.append(", dataType: ");
		if (dataTypeESet) result.append(dataType); else result.append("<unset>");
		result.append(", valueRank: ");
		if (valueRankESet) result.append(valueRank); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UAVariableTypeImpl
