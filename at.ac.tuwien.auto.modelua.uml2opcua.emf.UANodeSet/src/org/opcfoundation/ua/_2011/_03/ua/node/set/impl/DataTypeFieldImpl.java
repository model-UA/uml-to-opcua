/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField;
import org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText;
import org.opcfoundation.ua._2011._03.ua.node.set.SetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeFieldImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeFieldImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeFieldImpl#getArrayDimensions <em>Array Dimensions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeFieldImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeFieldImpl#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeFieldImpl#getMaxStringLength <em>Max String Length</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeFieldImpl#getSymbolicName <em>Symbolic Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeFieldImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.impl.DataTypeFieldImpl#getValueRank <em>Value Rank</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeFieldImpl extends MinimalEObjectImpl.Container implements DataTypeField {
	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalizedText> displayName;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalizedText> description;

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
	 * The default value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean isOptional = IS_OPTIONAL_EDEFAULT;

	/**
	 * This is true if the Is Optional attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isOptionalESet;

	/**
	 * The default value of the '{@link #getMaxStringLength() <em>Max String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStringLength()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_STRING_LENGTH_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxStringLength() <em>Max String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStringLength()
	 * @generated
	 * @ordered
	 */
	protected long maxStringLength = MAX_STRING_LENGTH_EDEFAULT;

	/**
	 * This is true if the Max String Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxStringLengthESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbolicName() <em>Symbolic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolicName()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> SYMBOLIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolicName() <em>Symbolic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolicName()
	 * @generated
	 * @ordered
	 */
	protected List<String> symbolicName = SYMBOLIC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

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
	protected DataTypeFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.DATA_TYPE_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalizedText> getDisplayName() {
		if (displayName == null) {
			displayName = new EObjectContainmentEList<LocalizedText>(LocalizedText.class, this, SetPackage.DATA_TYPE_FIELD__DISPLAY_NAME);
		}
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalizedText> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<LocalizedText>(LocalizedText.class, this, SetPackage.DATA_TYPE_FIELD__DESCRIPTION);
		}
		return description;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.DATA_TYPE_FIELD__ARRAY_DIMENSIONS, oldArrayDimensions, arrayDimensions, !oldArrayDimensionsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.DATA_TYPE_FIELD__ARRAY_DIMENSIONS, oldArrayDimensions, ARRAY_DIMENSIONS_EDEFAULT, oldArrayDimensionsESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.DATA_TYPE_FIELD__DATA_TYPE, oldDataType, dataType, !oldDataTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.DATA_TYPE_FIELD__DATA_TYPE, oldDataType, DATA_TYPE_EDEFAULT, oldDataTypeESet));
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
	public boolean isIsOptional() {
		return isOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOptional(boolean newIsOptional) {
		boolean oldIsOptional = isOptional;
		isOptional = newIsOptional;
		boolean oldIsOptionalESet = isOptionalESet;
		isOptionalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.DATA_TYPE_FIELD__IS_OPTIONAL, oldIsOptional, isOptional, !oldIsOptionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsOptional() {
		boolean oldIsOptional = isOptional;
		boolean oldIsOptionalESet = isOptionalESet;
		isOptional = IS_OPTIONAL_EDEFAULT;
		isOptionalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.DATA_TYPE_FIELD__IS_OPTIONAL, oldIsOptional, IS_OPTIONAL_EDEFAULT, oldIsOptionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsOptional() {
		return isOptionalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxStringLength() {
		return maxStringLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxStringLength(long newMaxStringLength) {
		long oldMaxStringLength = maxStringLength;
		maxStringLength = newMaxStringLength;
		boolean oldMaxStringLengthESet = maxStringLengthESet;
		maxStringLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.DATA_TYPE_FIELD__MAX_STRING_LENGTH, oldMaxStringLength, maxStringLength, !oldMaxStringLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxStringLength() {
		long oldMaxStringLength = maxStringLength;
		boolean oldMaxStringLengthESet = maxStringLengthESet;
		maxStringLength = MAX_STRING_LENGTH_EDEFAULT;
		maxStringLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.DATA_TYPE_FIELD__MAX_STRING_LENGTH, oldMaxStringLength, MAX_STRING_LENGTH_EDEFAULT, oldMaxStringLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxStringLength() {
		return maxStringLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.DATA_TYPE_FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getSymbolicName() {
		return symbolicName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolicName(List<String> newSymbolicName) {
		List<String> oldSymbolicName = symbolicName;
		symbolicName = newSymbolicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.DATA_TYPE_FIELD__SYMBOLIC_NAME, oldSymbolicName, symbolicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.DATA_TYPE_FIELD__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		int oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.DATA_TYPE_FIELD__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.DATA_TYPE_FIELD__VALUE_RANK, oldValueRank, valueRank, !oldValueRankESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SetPackage.DATA_TYPE_FIELD__VALUE_RANK, oldValueRank, VALUE_RANK_EDEFAULT, oldValueRankESet));
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
			case SetPackage.DATA_TYPE_FIELD__DISPLAY_NAME:
				return ((InternalEList<?>)getDisplayName()).basicRemove(otherEnd, msgs);
			case SetPackage.DATA_TYPE_FIELD__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
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
			case SetPackage.DATA_TYPE_FIELD__DISPLAY_NAME:
				return getDisplayName();
			case SetPackage.DATA_TYPE_FIELD__DESCRIPTION:
				return getDescription();
			case SetPackage.DATA_TYPE_FIELD__ARRAY_DIMENSIONS:
				return getArrayDimensions();
			case SetPackage.DATA_TYPE_FIELD__DATA_TYPE:
				return getDataType();
			case SetPackage.DATA_TYPE_FIELD__IS_OPTIONAL:
				return isIsOptional();
			case SetPackage.DATA_TYPE_FIELD__MAX_STRING_LENGTH:
				return getMaxStringLength();
			case SetPackage.DATA_TYPE_FIELD__NAME:
				return getName();
			case SetPackage.DATA_TYPE_FIELD__SYMBOLIC_NAME:
				return getSymbolicName();
			case SetPackage.DATA_TYPE_FIELD__VALUE:
				return getValue();
			case SetPackage.DATA_TYPE_FIELD__VALUE_RANK:
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
			case SetPackage.DATA_TYPE_FIELD__DISPLAY_NAME:
				getDisplayName().clear();
				getDisplayName().addAll((Collection<? extends LocalizedText>)newValue);
				return;
			case SetPackage.DATA_TYPE_FIELD__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends LocalizedText>)newValue);
				return;
			case SetPackage.DATA_TYPE_FIELD__ARRAY_DIMENSIONS:
				setArrayDimensions((String)newValue);
				return;
			case SetPackage.DATA_TYPE_FIELD__DATA_TYPE:
				setDataType((String)newValue);
				return;
			case SetPackage.DATA_TYPE_FIELD__IS_OPTIONAL:
				setIsOptional((Boolean)newValue);
				return;
			case SetPackage.DATA_TYPE_FIELD__MAX_STRING_LENGTH:
				setMaxStringLength((Long)newValue);
				return;
			case SetPackage.DATA_TYPE_FIELD__NAME:
				setName((String)newValue);
				return;
			case SetPackage.DATA_TYPE_FIELD__SYMBOLIC_NAME:
				setSymbolicName((List<String>)newValue);
				return;
			case SetPackage.DATA_TYPE_FIELD__VALUE:
				setValue((Integer)newValue);
				return;
			case SetPackage.DATA_TYPE_FIELD__VALUE_RANK:
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
			case SetPackage.DATA_TYPE_FIELD__DISPLAY_NAME:
				getDisplayName().clear();
				return;
			case SetPackage.DATA_TYPE_FIELD__DESCRIPTION:
				getDescription().clear();
				return;
			case SetPackage.DATA_TYPE_FIELD__ARRAY_DIMENSIONS:
				unsetArrayDimensions();
				return;
			case SetPackage.DATA_TYPE_FIELD__DATA_TYPE:
				unsetDataType();
				return;
			case SetPackage.DATA_TYPE_FIELD__IS_OPTIONAL:
				unsetIsOptional();
				return;
			case SetPackage.DATA_TYPE_FIELD__MAX_STRING_LENGTH:
				unsetMaxStringLength();
				return;
			case SetPackage.DATA_TYPE_FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SetPackage.DATA_TYPE_FIELD__SYMBOLIC_NAME:
				setSymbolicName(SYMBOLIC_NAME_EDEFAULT);
				return;
			case SetPackage.DATA_TYPE_FIELD__VALUE:
				unsetValue();
				return;
			case SetPackage.DATA_TYPE_FIELD__VALUE_RANK:
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
			case SetPackage.DATA_TYPE_FIELD__DISPLAY_NAME:
				return displayName != null && !displayName.isEmpty();
			case SetPackage.DATA_TYPE_FIELD__DESCRIPTION:
				return description != null && !description.isEmpty();
			case SetPackage.DATA_TYPE_FIELD__ARRAY_DIMENSIONS:
				return isSetArrayDimensions();
			case SetPackage.DATA_TYPE_FIELD__DATA_TYPE:
				return isSetDataType();
			case SetPackage.DATA_TYPE_FIELD__IS_OPTIONAL:
				return isSetIsOptional();
			case SetPackage.DATA_TYPE_FIELD__MAX_STRING_LENGTH:
				return isSetMaxStringLength();
			case SetPackage.DATA_TYPE_FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SetPackage.DATA_TYPE_FIELD__SYMBOLIC_NAME:
				return SYMBOLIC_NAME_EDEFAULT == null ? symbolicName != null : !SYMBOLIC_NAME_EDEFAULT.equals(symbolicName);
			case SetPackage.DATA_TYPE_FIELD__VALUE:
				return isSetValue();
			case SetPackage.DATA_TYPE_FIELD__VALUE_RANK:
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
		result.append(", isOptional: ");
		if (isOptionalESet) result.append(isOptional); else result.append("<unset>");
		result.append(", maxStringLength: ");
		if (maxStringLengthESet) result.append(maxStringLength); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", symbolicName: ");
		result.append(symbolicName);
		result.append(", value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(", valueRank: ");
		if (valueRankESet) result.append(valueRank); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataTypeFieldImpl
