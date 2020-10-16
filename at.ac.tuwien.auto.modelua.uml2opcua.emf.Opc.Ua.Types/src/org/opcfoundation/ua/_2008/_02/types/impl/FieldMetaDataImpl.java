/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.FieldMetaData;
import org.opcfoundation.ua._2008._02.types.Guid;
import org.opcfoundation.ua._2008._02.types.ListOfKeyValuePair;
import org.opcfoundation.ua._2008._02.types.ListOfUInt32;
import org.opcfoundation.ua._2008._02.types.LocalizedText;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Meta Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FieldMetaDataImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FieldMetaDataImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FieldMetaDataImpl#getFieldFlags <em>Field Flags</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FieldMetaDataImpl#getBuiltInType <em>Built In Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FieldMetaDataImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FieldMetaDataImpl#getValueRank <em>Value Rank</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FieldMetaDataImpl#getArrayDimensions <em>Array Dimensions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FieldMetaDataImpl#getMaxStringLength <em>Max String Length</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FieldMetaDataImpl#getDataSetFieldId <em>Data Set Field Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FieldMetaDataImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldMetaDataImpl extends MinimalEObjectImpl.Container implements FieldMetaData {
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
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected LocalizedText description;

	/**
	 * This is true if the Description containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionESet;

	/**
	 * The default value of the '{@link #getFieldFlags() <em>Field Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldFlags()
	 * @generated
	 * @ordered
	 */
	protected static final int FIELD_FLAGS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFieldFlags() <em>Field Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldFlags()
	 * @generated
	 * @ordered
	 */
	protected int fieldFlags = FIELD_FLAGS_EDEFAULT;

	/**
	 * This is true if the Field Flags attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fieldFlagsESet;

	/**
	 * The default value of the '{@link #getBuiltInType() <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltInType()
	 * @generated
	 * @ordered
	 */
	protected static final short BUILT_IN_TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBuiltInType() <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltInType()
	 * @generated
	 * @ordered
	 */
	protected short builtInType = BUILT_IN_TYPE_EDEFAULT;

	/**
	 * This is true if the Built In Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean builtInTypeESet;

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
	 * The cached value of the '{@link #getDataSetFieldId() <em>Data Set Field Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetFieldId()
	 * @generated
	 * @ordered
	 */
	protected Guid dataSetFieldId;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected ListOfKeyValuePair properties;

	/**
	 * This is true if the Properties containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean propertiesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldMetaDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getFieldMetaData();
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
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_META_DATA__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_META_DATA__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalizedText getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(LocalizedText newDescription, NotificationChain msgs) {
		LocalizedText oldDescription = description;
		description = newDescription;
		boolean oldDescriptionESet = descriptionESet;
		descriptionESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_META_DATA__DESCRIPTION, oldDescription, newDescription, !oldDescriptionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(LocalizedText newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_META_DATA__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_META_DATA__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionESet = descriptionESet;
			descriptionESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_META_DATA__DESCRIPTION, newDescription, newDescription, !oldDescriptionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDescription(NotificationChain msgs) {
		LocalizedText oldDescription = description;
		description = null;
		boolean oldDescriptionESet = descriptionESet;
		descriptionESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_META_DATA__DESCRIPTION, oldDescription, null, oldDescriptionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		if (description != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_META_DATA__DESCRIPTION, null, msgs);
			msgs = basicUnsetDescription(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionESet = descriptionESet;
			descriptionESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_META_DATA__DESCRIPTION, null, null, oldDescriptionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return descriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFieldFlags() {
		return fieldFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldFlags(int newFieldFlags) {
		int oldFieldFlags = fieldFlags;
		fieldFlags = newFieldFlags;
		boolean oldFieldFlagsESet = fieldFlagsESet;
		fieldFlagsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_META_DATA__FIELD_FLAGS, oldFieldFlags, fieldFlags, !oldFieldFlagsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFieldFlags() {
		int oldFieldFlags = fieldFlags;
		boolean oldFieldFlagsESet = fieldFlagsESet;
		fieldFlags = FIELD_FLAGS_EDEFAULT;
		fieldFlagsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_META_DATA__FIELD_FLAGS, oldFieldFlags, FIELD_FLAGS_EDEFAULT, oldFieldFlagsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFieldFlags() {
		return fieldFlagsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getBuiltInType() {
		return builtInType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuiltInType(short newBuiltInType) {
		short oldBuiltInType = builtInType;
		builtInType = newBuiltInType;
		boolean oldBuiltInTypeESet = builtInTypeESet;
		builtInTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_META_DATA__BUILT_IN_TYPE, oldBuiltInType, builtInType, !oldBuiltInTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBuiltInType() {
		short oldBuiltInType = builtInType;
		boolean oldBuiltInTypeESet = builtInTypeESet;
		builtInType = BUILT_IN_TYPE_EDEFAULT;
		builtInTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_META_DATA__BUILT_IN_TYPE, oldBuiltInType, BUILT_IN_TYPE_EDEFAULT, oldBuiltInTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBuiltInType() {
		return builtInTypeESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_META_DATA__DATA_TYPE, oldDataType, newDataType, !oldDataTypeESet);
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
				msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_META_DATA__DATA_TYPE, null, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_META_DATA__DATA_TYPE, null, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataTypeESet = dataTypeESet;
			dataTypeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_META_DATA__DATA_TYPE, newDataType, newDataType, !oldDataTypeESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_META_DATA__DATA_TYPE, oldDataType, null, oldDataTypeESet);
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
			msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_META_DATA__DATA_TYPE, null, msgs);
			msgs = basicUnsetDataType(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataTypeESet = dataTypeESet;
			dataTypeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_META_DATA__DATA_TYPE, null, null, oldDataTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_META_DATA__VALUE_RANK, oldValueRank, valueRank, !oldValueRankESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_META_DATA__VALUE_RANK, oldValueRank, VALUE_RANK_EDEFAULT, oldValueRankESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_META_DATA__ARRAY_DIMENSIONS, oldArrayDimensions, newArrayDimensions, !oldArrayDimensionsESet);
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
				msgs = ((InternalEObject)arrayDimensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_META_DATA__ARRAY_DIMENSIONS, null, msgs);
			if (newArrayDimensions != null)
				msgs = ((InternalEObject)newArrayDimensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_META_DATA__ARRAY_DIMENSIONS, null, msgs);
			msgs = basicSetArrayDimensions(newArrayDimensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldArrayDimensionsESet = arrayDimensionsESet;
			arrayDimensionsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_META_DATA__ARRAY_DIMENSIONS, newArrayDimensions, newArrayDimensions, !oldArrayDimensionsESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_META_DATA__ARRAY_DIMENSIONS, oldArrayDimensions, null, oldArrayDimensionsESet);
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
			msgs = ((InternalEObject)arrayDimensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_META_DATA__ARRAY_DIMENSIONS, null, msgs);
			msgs = basicUnsetArrayDimensions(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldArrayDimensionsESet = arrayDimensionsESet;
			arrayDimensionsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_META_DATA__ARRAY_DIMENSIONS, null, null, oldArrayDimensionsESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_META_DATA__MAX_STRING_LENGTH, oldMaxStringLength, maxStringLength, !oldMaxStringLengthESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_META_DATA__MAX_STRING_LENGTH, oldMaxStringLength, MAX_STRING_LENGTH_EDEFAULT, oldMaxStringLengthESet));
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
	public Guid getDataSetFieldId() {
		return dataSetFieldId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetFieldId(Guid newDataSetFieldId, NotificationChain msgs) {
		Guid oldDataSetFieldId = dataSetFieldId;
		dataSetFieldId = newDataSetFieldId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_META_DATA__DATA_SET_FIELD_ID, oldDataSetFieldId, newDataSetFieldId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetFieldId(Guid newDataSetFieldId) {
		if (newDataSetFieldId != dataSetFieldId) {
			NotificationChain msgs = null;
			if (dataSetFieldId != null)
				msgs = ((InternalEObject)dataSetFieldId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_META_DATA__DATA_SET_FIELD_ID, null, msgs);
			if (newDataSetFieldId != null)
				msgs = ((InternalEObject)newDataSetFieldId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_META_DATA__DATA_SET_FIELD_ID, null, msgs);
			msgs = basicSetDataSetFieldId(newDataSetFieldId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_META_DATA__DATA_SET_FIELD_ID, newDataSetFieldId, newDataSetFieldId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfKeyValuePair getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(ListOfKeyValuePair newProperties, NotificationChain msgs) {
		ListOfKeyValuePair oldProperties = properties;
		properties = newProperties;
		boolean oldPropertiesESet = propertiesESet;
		propertiesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_META_DATA__PROPERTIES, oldProperties, newProperties, !oldPropertiesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(ListOfKeyValuePair newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_META_DATA__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_META_DATA__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPropertiesESet = propertiesESet;
			propertiesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIELD_META_DATA__PROPERTIES, newProperties, newProperties, !oldPropertiesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetProperties(NotificationChain msgs) {
		ListOfKeyValuePair oldProperties = properties;
		properties = null;
		boolean oldPropertiesESet = propertiesESet;
		propertiesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_META_DATA__PROPERTIES, oldProperties, null, oldPropertiesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProperties() {
		if (properties != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIELD_META_DATA__PROPERTIES, null, msgs);
			msgs = basicUnsetProperties(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPropertiesESet = propertiesESet;
			propertiesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIELD_META_DATA__PROPERTIES, null, null, oldPropertiesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProperties() {
		return propertiesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.FIELD_META_DATA__DESCRIPTION:
				return basicUnsetDescription(msgs);
			case TypesPackage.FIELD_META_DATA__DATA_TYPE:
				return basicUnsetDataType(msgs);
			case TypesPackage.FIELD_META_DATA__ARRAY_DIMENSIONS:
				return basicUnsetArrayDimensions(msgs);
			case TypesPackage.FIELD_META_DATA__DATA_SET_FIELD_ID:
				return basicSetDataSetFieldId(null, msgs);
			case TypesPackage.FIELD_META_DATA__PROPERTIES:
				return basicUnsetProperties(msgs);
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
			case TypesPackage.FIELD_META_DATA__NAME:
				return getName();
			case TypesPackage.FIELD_META_DATA__DESCRIPTION:
				return getDescription();
			case TypesPackage.FIELD_META_DATA__FIELD_FLAGS:
				return getFieldFlags();
			case TypesPackage.FIELD_META_DATA__BUILT_IN_TYPE:
				return getBuiltInType();
			case TypesPackage.FIELD_META_DATA__DATA_TYPE:
				return getDataType();
			case TypesPackage.FIELD_META_DATA__VALUE_RANK:
				return getValueRank();
			case TypesPackage.FIELD_META_DATA__ARRAY_DIMENSIONS:
				return getArrayDimensions();
			case TypesPackage.FIELD_META_DATA__MAX_STRING_LENGTH:
				return getMaxStringLength();
			case TypesPackage.FIELD_META_DATA__DATA_SET_FIELD_ID:
				return getDataSetFieldId();
			case TypesPackage.FIELD_META_DATA__PROPERTIES:
				return getProperties();
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
			case TypesPackage.FIELD_META_DATA__NAME:
				setName((String)newValue);
				return;
			case TypesPackage.FIELD_META_DATA__DESCRIPTION:
				setDescription((LocalizedText)newValue);
				return;
			case TypesPackage.FIELD_META_DATA__FIELD_FLAGS:
				setFieldFlags((Integer)newValue);
				return;
			case TypesPackage.FIELD_META_DATA__BUILT_IN_TYPE:
				setBuiltInType((Short)newValue);
				return;
			case TypesPackage.FIELD_META_DATA__DATA_TYPE:
				setDataType((NodeId)newValue);
				return;
			case TypesPackage.FIELD_META_DATA__VALUE_RANK:
				setValueRank((Integer)newValue);
				return;
			case TypesPackage.FIELD_META_DATA__ARRAY_DIMENSIONS:
				setArrayDimensions((ListOfUInt32)newValue);
				return;
			case TypesPackage.FIELD_META_DATA__MAX_STRING_LENGTH:
				setMaxStringLength((Long)newValue);
				return;
			case TypesPackage.FIELD_META_DATA__DATA_SET_FIELD_ID:
				setDataSetFieldId((Guid)newValue);
				return;
			case TypesPackage.FIELD_META_DATA__PROPERTIES:
				setProperties((ListOfKeyValuePair)newValue);
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
			case TypesPackage.FIELD_META_DATA__NAME:
				unsetName();
				return;
			case TypesPackage.FIELD_META_DATA__DESCRIPTION:
				unsetDescription();
				return;
			case TypesPackage.FIELD_META_DATA__FIELD_FLAGS:
				unsetFieldFlags();
				return;
			case TypesPackage.FIELD_META_DATA__BUILT_IN_TYPE:
				unsetBuiltInType();
				return;
			case TypesPackage.FIELD_META_DATA__DATA_TYPE:
				unsetDataType();
				return;
			case TypesPackage.FIELD_META_DATA__VALUE_RANK:
				unsetValueRank();
				return;
			case TypesPackage.FIELD_META_DATA__ARRAY_DIMENSIONS:
				unsetArrayDimensions();
				return;
			case TypesPackage.FIELD_META_DATA__MAX_STRING_LENGTH:
				unsetMaxStringLength();
				return;
			case TypesPackage.FIELD_META_DATA__DATA_SET_FIELD_ID:
				setDataSetFieldId((Guid)null);
				return;
			case TypesPackage.FIELD_META_DATA__PROPERTIES:
				unsetProperties();
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
			case TypesPackage.FIELD_META_DATA__NAME:
				return isSetName();
			case TypesPackage.FIELD_META_DATA__DESCRIPTION:
				return isSetDescription();
			case TypesPackage.FIELD_META_DATA__FIELD_FLAGS:
				return isSetFieldFlags();
			case TypesPackage.FIELD_META_DATA__BUILT_IN_TYPE:
				return isSetBuiltInType();
			case TypesPackage.FIELD_META_DATA__DATA_TYPE:
				return isSetDataType();
			case TypesPackage.FIELD_META_DATA__VALUE_RANK:
				return isSetValueRank();
			case TypesPackage.FIELD_META_DATA__ARRAY_DIMENSIONS:
				return isSetArrayDimensions();
			case TypesPackage.FIELD_META_DATA__MAX_STRING_LENGTH:
				return isSetMaxStringLength();
			case TypesPackage.FIELD_META_DATA__DATA_SET_FIELD_ID:
				return dataSetFieldId != null;
			case TypesPackage.FIELD_META_DATA__PROPERTIES:
				return isSetProperties();
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
		result.append(" (name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", fieldFlags: ");
		if (fieldFlagsESet) result.append(fieldFlags); else result.append("<unset>");
		result.append(", builtInType: ");
		if (builtInTypeESet) result.append(builtInType); else result.append("<unset>");
		result.append(", valueRank: ");
		if (valueRankESet) result.append(valueRank); else result.append("<unset>");
		result.append(", maxStringLength: ");
		if (maxStringLengthESet) result.append(maxStringLength); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FieldMetaDataImpl
