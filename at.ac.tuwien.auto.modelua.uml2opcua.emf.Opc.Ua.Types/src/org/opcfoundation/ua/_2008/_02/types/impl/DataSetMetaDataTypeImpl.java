/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType;
import org.opcfoundation.ua._2008._02.types.DataSetMetaDataType;
import org.opcfoundation.ua._2008._02.types.Guid;
import org.opcfoundation.ua._2008._02.types.ListOfFieldMetaData;
import org.opcfoundation.ua._2008._02.types.LocalizedText;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Set Meta Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetMetaDataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetMetaDataTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetMetaDataTypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetMetaDataTypeImpl#getDataSetClassId <em>Data Set Class Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetMetaDataTypeImpl#getConfigurationVersion <em>Configuration Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSetMetaDataTypeImpl extends DataTypeSchemaHeaderImpl implements DataSetMetaDataType {
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
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected ListOfFieldMetaData fields;

	/**
	 * This is true if the Fields containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fieldsESet;

	/**
	 * The cached value of the '{@link #getDataSetClassId() <em>Data Set Class Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetClassId()
	 * @generated
	 * @ordered
	 */
	protected Guid dataSetClassId;

	/**
	 * The cached value of the '{@link #getConfigurationVersion() <em>Configuration Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationVersion()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationVersionDataType configurationVersion;

	/**
	 * This is true if the Configuration Version containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean configurationVersionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSetMetaDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getDataSetMetaDataType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_META_DATA_TYPE__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_META_DATA_TYPE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_META_DATA_TYPE__DESCRIPTION, oldDescription, newDescription, !oldDescriptionESet);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_META_DATA_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_META_DATA_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionESet = descriptionESet;
			descriptionESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_META_DATA_TYPE__DESCRIPTION, newDescription, newDescription, !oldDescriptionESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_META_DATA_TYPE__DESCRIPTION, oldDescription, null, oldDescriptionESet);
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
			msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_META_DATA_TYPE__DESCRIPTION, null, msgs);
			msgs = basicUnsetDescription(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionESet = descriptionESet;
			descriptionESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_META_DATA_TYPE__DESCRIPTION, null, null, oldDescriptionESet));
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
	public ListOfFieldMetaData getFields() {
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFields(ListOfFieldMetaData newFields, NotificationChain msgs) {
		ListOfFieldMetaData oldFields = fields;
		fields = newFields;
		boolean oldFieldsESet = fieldsESet;
		fieldsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_META_DATA_TYPE__FIELDS, oldFields, newFields, !oldFieldsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFields(ListOfFieldMetaData newFields) {
		if (newFields != fields) {
			NotificationChain msgs = null;
			if (fields != null)
				msgs = ((InternalEObject)fields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_META_DATA_TYPE__FIELDS, null, msgs);
			if (newFields != null)
				msgs = ((InternalEObject)newFields).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_META_DATA_TYPE__FIELDS, null, msgs);
			msgs = basicSetFields(newFields, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFieldsESet = fieldsESet;
			fieldsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_META_DATA_TYPE__FIELDS, newFields, newFields, !oldFieldsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetFields(NotificationChain msgs) {
		ListOfFieldMetaData oldFields = fields;
		fields = null;
		boolean oldFieldsESet = fieldsESet;
		fieldsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_META_DATA_TYPE__FIELDS, oldFields, null, oldFieldsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFields() {
		if (fields != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)fields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_META_DATA_TYPE__FIELDS, null, msgs);
			msgs = basicUnsetFields(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFieldsESet = fieldsESet;
			fieldsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_META_DATA_TYPE__FIELDS, null, null, oldFieldsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFields() {
		return fieldsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guid getDataSetClassId() {
		return dataSetClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetClassId(Guid newDataSetClassId, NotificationChain msgs) {
		Guid oldDataSetClassId = dataSetClassId;
		dataSetClassId = newDataSetClassId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_META_DATA_TYPE__DATA_SET_CLASS_ID, oldDataSetClassId, newDataSetClassId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetClassId(Guid newDataSetClassId) {
		if (newDataSetClassId != dataSetClassId) {
			NotificationChain msgs = null;
			if (dataSetClassId != null)
				msgs = ((InternalEObject)dataSetClassId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_META_DATA_TYPE__DATA_SET_CLASS_ID, null, msgs);
			if (newDataSetClassId != null)
				msgs = ((InternalEObject)newDataSetClassId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_META_DATA_TYPE__DATA_SET_CLASS_ID, null, msgs);
			msgs = basicSetDataSetClassId(newDataSetClassId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_META_DATA_TYPE__DATA_SET_CLASS_ID, newDataSetClassId, newDataSetClassId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationVersionDataType getConfigurationVersion() {
		return configurationVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationVersion(ConfigurationVersionDataType newConfigurationVersion, NotificationChain msgs) {
		ConfigurationVersionDataType oldConfigurationVersion = configurationVersion;
		configurationVersion = newConfigurationVersion;
		boolean oldConfigurationVersionESet = configurationVersionESet;
		configurationVersionESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_META_DATA_TYPE__CONFIGURATION_VERSION, oldConfigurationVersion, newConfigurationVersion, !oldConfigurationVersionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationVersion(ConfigurationVersionDataType newConfigurationVersion) {
		if (newConfigurationVersion != configurationVersion) {
			NotificationChain msgs = null;
			if (configurationVersion != null)
				msgs = ((InternalEObject)configurationVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_META_DATA_TYPE__CONFIGURATION_VERSION, null, msgs);
			if (newConfigurationVersion != null)
				msgs = ((InternalEObject)newConfigurationVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_META_DATA_TYPE__CONFIGURATION_VERSION, null, msgs);
			msgs = basicSetConfigurationVersion(newConfigurationVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConfigurationVersionESet = configurationVersionESet;
			configurationVersionESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_META_DATA_TYPE__CONFIGURATION_VERSION, newConfigurationVersion, newConfigurationVersion, !oldConfigurationVersionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetConfigurationVersion(NotificationChain msgs) {
		ConfigurationVersionDataType oldConfigurationVersion = configurationVersion;
		configurationVersion = null;
		boolean oldConfigurationVersionESet = configurationVersionESet;
		configurationVersionESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_META_DATA_TYPE__CONFIGURATION_VERSION, oldConfigurationVersion, null, oldConfigurationVersionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfigurationVersion() {
		if (configurationVersion != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)configurationVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_META_DATA_TYPE__CONFIGURATION_VERSION, null, msgs);
			msgs = basicUnsetConfigurationVersion(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConfigurationVersionESet = configurationVersionESet;
			configurationVersionESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_META_DATA_TYPE__CONFIGURATION_VERSION, null, null, oldConfigurationVersionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConfigurationVersion() {
		return configurationVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DATA_SET_META_DATA_TYPE__DESCRIPTION:
				return basicUnsetDescription(msgs);
			case TypesPackage.DATA_SET_META_DATA_TYPE__FIELDS:
				return basicUnsetFields(msgs);
			case TypesPackage.DATA_SET_META_DATA_TYPE__DATA_SET_CLASS_ID:
				return basicSetDataSetClassId(null, msgs);
			case TypesPackage.DATA_SET_META_DATA_TYPE__CONFIGURATION_VERSION:
				return basicUnsetConfigurationVersion(msgs);
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
			case TypesPackage.DATA_SET_META_DATA_TYPE__NAME:
				return getName();
			case TypesPackage.DATA_SET_META_DATA_TYPE__DESCRIPTION:
				return getDescription();
			case TypesPackage.DATA_SET_META_DATA_TYPE__FIELDS:
				return getFields();
			case TypesPackage.DATA_SET_META_DATA_TYPE__DATA_SET_CLASS_ID:
				return getDataSetClassId();
			case TypesPackage.DATA_SET_META_DATA_TYPE__CONFIGURATION_VERSION:
				return getConfigurationVersion();
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
			case TypesPackage.DATA_SET_META_DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case TypesPackage.DATA_SET_META_DATA_TYPE__DESCRIPTION:
				setDescription((LocalizedText)newValue);
				return;
			case TypesPackage.DATA_SET_META_DATA_TYPE__FIELDS:
				setFields((ListOfFieldMetaData)newValue);
				return;
			case TypesPackage.DATA_SET_META_DATA_TYPE__DATA_SET_CLASS_ID:
				setDataSetClassId((Guid)newValue);
				return;
			case TypesPackage.DATA_SET_META_DATA_TYPE__CONFIGURATION_VERSION:
				setConfigurationVersion((ConfigurationVersionDataType)newValue);
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
			case TypesPackage.DATA_SET_META_DATA_TYPE__NAME:
				unsetName();
				return;
			case TypesPackage.DATA_SET_META_DATA_TYPE__DESCRIPTION:
				unsetDescription();
				return;
			case TypesPackage.DATA_SET_META_DATA_TYPE__FIELDS:
				unsetFields();
				return;
			case TypesPackage.DATA_SET_META_DATA_TYPE__DATA_SET_CLASS_ID:
				setDataSetClassId((Guid)null);
				return;
			case TypesPackage.DATA_SET_META_DATA_TYPE__CONFIGURATION_VERSION:
				unsetConfigurationVersion();
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
			case TypesPackage.DATA_SET_META_DATA_TYPE__NAME:
				return isSetName();
			case TypesPackage.DATA_SET_META_DATA_TYPE__DESCRIPTION:
				return isSetDescription();
			case TypesPackage.DATA_SET_META_DATA_TYPE__FIELDS:
				return isSetFields();
			case TypesPackage.DATA_SET_META_DATA_TYPE__DATA_SET_CLASS_ID:
				return dataSetClassId != null;
			case TypesPackage.DATA_SET_META_DATA_TYPE__CONFIGURATION_VERSION:
				return isSetConfigurationVersion();
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
		result.append(')');
		return result.toString();
	}

} //DataSetMetaDataTypeImpl
