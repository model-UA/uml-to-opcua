/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.DataSetMetaDataType;
import org.opcfoundation.ua._2008._02.types.ExtensionObject;
import org.opcfoundation.ua._2008._02.types.ListOfKeyValuePair;
import org.opcfoundation.ua._2008._02.types.ListOfString;
import org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Published Data Set Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishedDataSetDataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishedDataSetDataTypeImpl#getDataSetFolder <em>Data Set Folder</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishedDataSetDataTypeImpl#getDataSetMetaData <em>Data Set Meta Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishedDataSetDataTypeImpl#getExtensionFields <em>Extension Fields</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishedDataSetDataTypeImpl#getDataSetSource <em>Data Set Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublishedDataSetDataTypeImpl extends MinimalEObjectImpl.Container implements PublishedDataSetDataType {
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
	 * The cached value of the '{@link #getDataSetFolder() <em>Data Set Folder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetFolder()
	 * @generated
	 * @ordered
	 */
	protected ListOfString dataSetFolder;

	/**
	 * This is true if the Data Set Folder containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSetFolderESet;

	/**
	 * The cached value of the '{@link #getDataSetMetaData() <em>Data Set Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetMetaData()
	 * @generated
	 * @ordered
	 */
	protected DataSetMetaDataType dataSetMetaData;

	/**
	 * This is true if the Data Set Meta Data containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSetMetaDataESet;

	/**
	 * The cached value of the '{@link #getExtensionFields() <em>Extension Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionFields()
	 * @generated
	 * @ordered
	 */
	protected ListOfKeyValuePair extensionFields;

	/**
	 * This is true if the Extension Fields containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extensionFieldsESet;

	/**
	 * The cached value of the '{@link #getDataSetSource() <em>Data Set Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetSource()
	 * @generated
	 * @ordered
	 */
	protected ExtensionObject dataSetSource;

	/**
	 * This is true if the Data Set Source containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSetSourceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublishedDataSetDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getPublishedDataSetDataType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
	public ListOfString getDataSetFolder() {
		return dataSetFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetFolder(ListOfString newDataSetFolder, NotificationChain msgs) {
		ListOfString oldDataSetFolder = dataSetFolder;
		dataSetFolder = newDataSetFolder;
		boolean oldDataSetFolderESet = dataSetFolderESet;
		dataSetFolderESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_FOLDER, oldDataSetFolder, newDataSetFolder, !oldDataSetFolderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetFolder(ListOfString newDataSetFolder) {
		if (newDataSetFolder != dataSetFolder) {
			NotificationChain msgs = null;
			if (dataSetFolder != null)
				msgs = ((InternalEObject)dataSetFolder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_FOLDER, null, msgs);
			if (newDataSetFolder != null)
				msgs = ((InternalEObject)newDataSetFolder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_FOLDER, null, msgs);
			msgs = basicSetDataSetFolder(newDataSetFolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataSetFolderESet = dataSetFolderESet;
			dataSetFolderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_FOLDER, newDataSetFolder, newDataSetFolder, !oldDataSetFolderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDataSetFolder(NotificationChain msgs) {
		ListOfString oldDataSetFolder = dataSetFolder;
		dataSetFolder = null;
		boolean oldDataSetFolderESet = dataSetFolderESet;
		dataSetFolderESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_FOLDER, oldDataSetFolder, null, oldDataSetFolderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSetFolder() {
		if (dataSetFolder != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dataSetFolder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_FOLDER, null, msgs);
			msgs = basicUnsetDataSetFolder(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataSetFolderESet = dataSetFolderESet;
			dataSetFolderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_FOLDER, null, null, oldDataSetFolderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSetFolder() {
		return dataSetFolderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetMetaDataType getDataSetMetaData() {
		return dataSetMetaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetMetaData(DataSetMetaDataType newDataSetMetaData, NotificationChain msgs) {
		DataSetMetaDataType oldDataSetMetaData = dataSetMetaData;
		dataSetMetaData = newDataSetMetaData;
		boolean oldDataSetMetaDataESet = dataSetMetaDataESet;
		dataSetMetaDataESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_META_DATA, oldDataSetMetaData, newDataSetMetaData, !oldDataSetMetaDataESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetMetaData(DataSetMetaDataType newDataSetMetaData) {
		if (newDataSetMetaData != dataSetMetaData) {
			NotificationChain msgs = null;
			if (dataSetMetaData != null)
				msgs = ((InternalEObject)dataSetMetaData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_META_DATA, null, msgs);
			if (newDataSetMetaData != null)
				msgs = ((InternalEObject)newDataSetMetaData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_META_DATA, null, msgs);
			msgs = basicSetDataSetMetaData(newDataSetMetaData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataSetMetaDataESet = dataSetMetaDataESet;
			dataSetMetaDataESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_META_DATA, newDataSetMetaData, newDataSetMetaData, !oldDataSetMetaDataESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDataSetMetaData(NotificationChain msgs) {
		DataSetMetaDataType oldDataSetMetaData = dataSetMetaData;
		dataSetMetaData = null;
		boolean oldDataSetMetaDataESet = dataSetMetaDataESet;
		dataSetMetaDataESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_META_DATA, oldDataSetMetaData, null, oldDataSetMetaDataESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSetMetaData() {
		if (dataSetMetaData != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dataSetMetaData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_META_DATA, null, msgs);
			msgs = basicUnsetDataSetMetaData(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataSetMetaDataESet = dataSetMetaDataESet;
			dataSetMetaDataESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_META_DATA, null, null, oldDataSetMetaDataESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSetMetaData() {
		return dataSetMetaDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfKeyValuePair getExtensionFields() {
		return extensionFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionFields(ListOfKeyValuePair newExtensionFields, NotificationChain msgs) {
		ListOfKeyValuePair oldExtensionFields = extensionFields;
		extensionFields = newExtensionFields;
		boolean oldExtensionFieldsESet = extensionFieldsESet;
		extensionFieldsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__EXTENSION_FIELDS, oldExtensionFields, newExtensionFields, !oldExtensionFieldsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionFields(ListOfKeyValuePair newExtensionFields) {
		if (newExtensionFields != extensionFields) {
			NotificationChain msgs = null;
			if (extensionFields != null)
				msgs = ((InternalEObject)extensionFields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__EXTENSION_FIELDS, null, msgs);
			if (newExtensionFields != null)
				msgs = ((InternalEObject)newExtensionFields).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__EXTENSION_FIELDS, null, msgs);
			msgs = basicSetExtensionFields(newExtensionFields, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldExtensionFieldsESet = extensionFieldsESet;
			extensionFieldsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__EXTENSION_FIELDS, newExtensionFields, newExtensionFields, !oldExtensionFieldsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetExtensionFields(NotificationChain msgs) {
		ListOfKeyValuePair oldExtensionFields = extensionFields;
		extensionFields = null;
		boolean oldExtensionFieldsESet = extensionFieldsESet;
		extensionFieldsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__EXTENSION_FIELDS, oldExtensionFields, null, oldExtensionFieldsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtensionFields() {
		if (extensionFields != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)extensionFields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__EXTENSION_FIELDS, null, msgs);
			msgs = basicUnsetExtensionFields(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldExtensionFieldsESet = extensionFieldsESet;
			extensionFieldsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__EXTENSION_FIELDS, null, null, oldExtensionFieldsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtensionFields() {
		return extensionFieldsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionObject getDataSetSource() {
		return dataSetSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetSource(ExtensionObject newDataSetSource, NotificationChain msgs) {
		ExtensionObject oldDataSetSource = dataSetSource;
		dataSetSource = newDataSetSource;
		boolean oldDataSetSourceESet = dataSetSourceESet;
		dataSetSourceESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_SOURCE, oldDataSetSource, newDataSetSource, !oldDataSetSourceESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetSource(ExtensionObject newDataSetSource) {
		if (newDataSetSource != dataSetSource) {
			NotificationChain msgs = null;
			if (dataSetSource != null)
				msgs = ((InternalEObject)dataSetSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_SOURCE, null, msgs);
			if (newDataSetSource != null)
				msgs = ((InternalEObject)newDataSetSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_SOURCE, null, msgs);
			msgs = basicSetDataSetSource(newDataSetSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataSetSourceESet = dataSetSourceESet;
			dataSetSourceESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_SOURCE, newDataSetSource, newDataSetSource, !oldDataSetSourceESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDataSetSource(NotificationChain msgs) {
		ExtensionObject oldDataSetSource = dataSetSource;
		dataSetSource = null;
		boolean oldDataSetSourceESet = dataSetSourceESet;
		dataSetSourceESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_SOURCE, oldDataSetSource, null, oldDataSetSourceESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSetSource() {
		if (dataSetSource != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dataSetSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_SOURCE, null, msgs);
			msgs = basicUnsetDataSetSource(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataSetSourceESet = dataSetSourceESet;
			dataSetSourceESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_SOURCE, null, null, oldDataSetSourceESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSetSource() {
		return dataSetSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_FOLDER:
				return basicUnsetDataSetFolder(msgs);
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_META_DATA:
				return basicUnsetDataSetMetaData(msgs);
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__EXTENSION_FIELDS:
				return basicUnsetExtensionFields(msgs);
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_SOURCE:
				return basicUnsetDataSetSource(msgs);
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
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__NAME:
				return getName();
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_FOLDER:
				return getDataSetFolder();
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_META_DATA:
				return getDataSetMetaData();
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__EXTENSION_FIELDS:
				return getExtensionFields();
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_SOURCE:
				return getDataSetSource();
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
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_FOLDER:
				setDataSetFolder((ListOfString)newValue);
				return;
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_META_DATA:
				setDataSetMetaData((DataSetMetaDataType)newValue);
				return;
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__EXTENSION_FIELDS:
				setExtensionFields((ListOfKeyValuePair)newValue);
				return;
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_SOURCE:
				setDataSetSource((ExtensionObject)newValue);
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
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__NAME:
				unsetName();
				return;
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_FOLDER:
				unsetDataSetFolder();
				return;
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_META_DATA:
				unsetDataSetMetaData();
				return;
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__EXTENSION_FIELDS:
				unsetExtensionFields();
				return;
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_SOURCE:
				unsetDataSetSource();
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
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__NAME:
				return isSetName();
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_FOLDER:
				return isSetDataSetFolder();
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_META_DATA:
				return isSetDataSetMetaData();
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__EXTENSION_FIELDS:
				return isSetExtensionFields();
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE__DATA_SET_SOURCE:
				return isSetDataSetSource();
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

} //PublishedDataSetDataTypeImpl
