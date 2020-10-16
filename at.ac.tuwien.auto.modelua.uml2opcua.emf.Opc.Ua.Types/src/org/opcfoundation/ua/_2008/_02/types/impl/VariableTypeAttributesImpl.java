/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ListOfUInt32;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.VariableTypeAttributes;
import org.opcfoundation.ua._2008._02.types.Variant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Type Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.VariableTypeAttributesImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.VariableTypeAttributesImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.VariableTypeAttributesImpl#getValueRank <em>Value Rank</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.VariableTypeAttributesImpl#getArrayDimensions <em>Array Dimensions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.VariableTypeAttributesImpl#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableTypeAttributesImpl extends NodeAttributesImpl implements VariableTypeAttributes {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Variant value;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected NodeId dataType;

	/**
	 * This is true if the Data Type containment reference has been set.
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
	protected static final int VALUE_RANK_EDEFAULT = 0;

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
	 * The cached value of the '{@link #getArrayDimensions() <em>Array Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayDimensions()
	 * @generated
	 * @ordered
	 */
	protected ListOfUInt32 arrayDimensions;

	/**
	 * This is true if the Array Dimensions containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean arrayDimensionsESet;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * This is true if the Is Abstract attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstractESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableTypeAttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getVariableTypeAttributes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Variant newValue, NotificationChain msgs) {
		Variant oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.VARIABLE_TYPE_ATTRIBUTES__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Variant newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.VARIABLE_TYPE_ATTRIBUTES__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.VARIABLE_TYPE_ATTRIBUTES__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.VARIABLE_TYPE_ATTRIBUTES__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataType(NodeId newDataType, NotificationChain msgs) {
		NodeId oldDataType = dataType;
		dataType = newDataType;
		boolean oldDataTypeESet = dataTypeESet;
		dataTypeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.VARIABLE_TYPE_ATTRIBUTES__DATA_TYPE, oldDataType, newDataType, !oldDataTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(NodeId newDataType) {
		if (newDataType != dataType) {
			NotificationChain msgs = null;
			if (dataType != null)
				msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.VARIABLE_TYPE_ATTRIBUTES__DATA_TYPE, null, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.VARIABLE_TYPE_ATTRIBUTES__DATA_TYPE, null, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataTypeESet = dataTypeESet;
			dataTypeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.VARIABLE_TYPE_ATTRIBUTES__DATA_TYPE, newDataType, newDataType, !oldDataTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDataType(NotificationChain msgs) {
		NodeId oldDataType = dataType;
		dataType = null;
		boolean oldDataTypeESet = dataTypeESet;
		dataTypeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.VARIABLE_TYPE_ATTRIBUTES__DATA_TYPE, oldDataType, null, oldDataTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataType() {
		if (dataType != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.VARIABLE_TYPE_ATTRIBUTES__DATA_TYPE, null, msgs);
			msgs = basicUnsetDataType(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataTypeESet = dataTypeESet;
			dataTypeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.VARIABLE_TYPE_ATTRIBUTES__DATA_TYPE, null, null, oldDataTypeESet));
		}
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.VARIABLE_TYPE_ATTRIBUTES__VALUE_RANK, oldValueRank, valueRank, !oldValueRankESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.VARIABLE_TYPE_ATTRIBUTES__VALUE_RANK, oldValueRank, VALUE_RANK_EDEFAULT, oldValueRankESet));
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
	public ListOfUInt32 getArrayDimensions() {
		return arrayDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrayDimensions(ListOfUInt32 newArrayDimensions, NotificationChain msgs) {
		ListOfUInt32 oldArrayDimensions = arrayDimensions;
		arrayDimensions = newArrayDimensions;
		boolean oldArrayDimensionsESet = arrayDimensionsESet;
		arrayDimensionsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.VARIABLE_TYPE_ATTRIBUTES__ARRAY_DIMENSIONS, oldArrayDimensions, newArrayDimensions, !oldArrayDimensionsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrayDimensions(ListOfUInt32 newArrayDimensions) {
		if (newArrayDimensions != arrayDimensions) {
			NotificationChain msgs = null;
			if (arrayDimensions != null)
				msgs = ((InternalEObject)arrayDimensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.VARIABLE_TYPE_ATTRIBUTES__ARRAY_DIMENSIONS, null, msgs);
			if (newArrayDimensions != null)
				msgs = ((InternalEObject)newArrayDimensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.VARIABLE_TYPE_ATTRIBUTES__ARRAY_DIMENSIONS, null, msgs);
			msgs = basicSetArrayDimensions(newArrayDimensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldArrayDimensionsESet = arrayDimensionsESet;
			arrayDimensionsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.VARIABLE_TYPE_ATTRIBUTES__ARRAY_DIMENSIONS, newArrayDimensions, newArrayDimensions, !oldArrayDimensionsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetArrayDimensions(NotificationChain msgs) {
		ListOfUInt32 oldArrayDimensions = arrayDimensions;
		arrayDimensions = null;
		boolean oldArrayDimensionsESet = arrayDimensionsESet;
		arrayDimensionsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.VARIABLE_TYPE_ATTRIBUTES__ARRAY_DIMENSIONS, oldArrayDimensions, null, oldArrayDimensionsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArrayDimensions() {
		if (arrayDimensions != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)arrayDimensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.VARIABLE_TYPE_ATTRIBUTES__ARRAY_DIMENSIONS, null, msgs);
			msgs = basicUnsetArrayDimensions(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldArrayDimensionsESet = arrayDimensionsESet;
			arrayDimensionsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.VARIABLE_TYPE_ATTRIBUTES__ARRAY_DIMENSIONS, null, null, oldArrayDimensionsESet));
		}
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
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		boolean oldIsAbstractESet = isAbstractESet;
		isAbstractESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.VARIABLE_TYPE_ATTRIBUTES__IS_ABSTRACT, oldIsAbstract, isAbstract, !oldIsAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsAbstract() {
		boolean oldIsAbstract = isAbstract;
		boolean oldIsAbstractESet = isAbstractESet;
		isAbstract = IS_ABSTRACT_EDEFAULT;
		isAbstractESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.VARIABLE_TYPE_ATTRIBUTES__IS_ABSTRACT, oldIsAbstract, IS_ABSTRACT_EDEFAULT, oldIsAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsAbstract() {
		return isAbstractESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__VALUE:
				return basicSetValue(null, msgs);
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__DATA_TYPE:
				return basicUnsetDataType(msgs);
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__ARRAY_DIMENSIONS:
				return basicUnsetArrayDimensions(msgs);
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
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__VALUE:
				return getValue();
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__DATA_TYPE:
				return getDataType();
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__VALUE_RANK:
				return getValueRank();
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__ARRAY_DIMENSIONS:
				return getArrayDimensions();
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__IS_ABSTRACT:
				return isIsAbstract();
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
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__VALUE:
				setValue((Variant)newValue);
				return;
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__DATA_TYPE:
				setDataType((NodeId)newValue);
				return;
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__VALUE_RANK:
				setValueRank((Integer)newValue);
				return;
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__ARRAY_DIMENSIONS:
				setArrayDimensions((ListOfUInt32)newValue);
				return;
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
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
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__VALUE:
				setValue((Variant)null);
				return;
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__DATA_TYPE:
				unsetDataType();
				return;
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__VALUE_RANK:
				unsetValueRank();
				return;
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__ARRAY_DIMENSIONS:
				unsetArrayDimensions();
				return;
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__IS_ABSTRACT:
				unsetIsAbstract();
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
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__VALUE:
				return value != null;
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__DATA_TYPE:
				return isSetDataType();
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__VALUE_RANK:
				return isSetValueRank();
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__ARRAY_DIMENSIONS:
				return isSetArrayDimensions();
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES__IS_ABSTRACT:
				return isSetIsAbstract();
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
		result.append(" (valueRank: ");
		if (valueRankESet) result.append(valueRank); else result.append("<unset>");
		result.append(", isAbstract: ");
		if (isAbstractESet) result.append(isAbstract); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VariableTypeAttributesImpl
