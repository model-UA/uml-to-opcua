/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.DataSetWriterDataType;
import org.opcfoundation.ua._2008._02.types.ExtensionObject;
import org.opcfoundation.ua._2008._02.types.ListOfKeyValuePair;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Set Writer Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetWriterDataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetWriterDataTypeImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetWriterDataTypeImpl#getDataSetWriterId <em>Data Set Writer Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetWriterDataTypeImpl#getDataSetFieldContentMask <em>Data Set Field Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetWriterDataTypeImpl#getKeyFrameCount <em>Key Frame Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetWriterDataTypeImpl#getDataSetName <em>Data Set Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetWriterDataTypeImpl#getDataSetWriterProperties <em>Data Set Writer Properties</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetWriterDataTypeImpl#getTransportSettings <em>Transport Settings</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetWriterDataTypeImpl#getMessageSettings <em>Message Settings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSetWriterDataTypeImpl extends MinimalEObjectImpl.Container implements DataSetWriterDataType {
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
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * This is true if the Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enabledESet;

	/**
	 * The default value of the '{@link #getDataSetWriterId() <em>Data Set Writer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetWriterId()
	 * @generated
	 * @ordered
	 */
	protected static final int DATA_SET_WRITER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDataSetWriterId() <em>Data Set Writer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetWriterId()
	 * @generated
	 * @ordered
	 */
	protected int dataSetWriterId = DATA_SET_WRITER_ID_EDEFAULT;

	/**
	 * This is true if the Data Set Writer Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSetWriterIdESet;

	/**
	 * The default value of the '{@link #getDataSetFieldContentMask() <em>Data Set Field Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetFieldContentMask()
	 * @generated
	 * @ordered
	 */
	protected static final long DATA_SET_FIELD_CONTENT_MASK_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDataSetFieldContentMask() <em>Data Set Field Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetFieldContentMask()
	 * @generated
	 * @ordered
	 */
	protected long dataSetFieldContentMask = DATA_SET_FIELD_CONTENT_MASK_EDEFAULT;

	/**
	 * This is true if the Data Set Field Content Mask attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSetFieldContentMaskESet;

	/**
	 * The default value of the '{@link #getKeyFrameCount() <em>Key Frame Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyFrameCount()
	 * @generated
	 * @ordered
	 */
	protected static final long KEY_FRAME_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getKeyFrameCount() <em>Key Frame Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyFrameCount()
	 * @generated
	 * @ordered
	 */
	protected long keyFrameCount = KEY_FRAME_COUNT_EDEFAULT;

	/**
	 * This is true if the Key Frame Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keyFrameCountESet;

	/**
	 * The default value of the '{@link #getDataSetName() <em>Data Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSetName() <em>Data Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetName()
	 * @generated
	 * @ordered
	 */
	protected String dataSetName = DATA_SET_NAME_EDEFAULT;

	/**
	 * This is true if the Data Set Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSetNameESet;

	/**
	 * The cached value of the '{@link #getDataSetWriterProperties() <em>Data Set Writer Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetWriterProperties()
	 * @generated
	 * @ordered
	 */
	protected ListOfKeyValuePair dataSetWriterProperties;

	/**
	 * This is true if the Data Set Writer Properties containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSetWriterPropertiesESet;

	/**
	 * The cached value of the '{@link #getTransportSettings() <em>Transport Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportSettings()
	 * @generated
	 * @ordered
	 */
	protected ExtensionObject transportSettings;

	/**
	 * This is true if the Transport Settings containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportSettingsESet;

	/**
	 * The cached value of the '{@link #getMessageSettings() <em>Message Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSettings()
	 * @generated
	 * @ordered
	 */
	protected ExtensionObject messageSettings;

	/**
	 * This is true if the Message Settings containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean messageSettingsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSetWriterDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getDataSetWriterDataType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		boolean oldEnabledESet = enabledESet;
		enabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__ENABLED, oldEnabled, enabled, !oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnabled() {
		boolean oldEnabled = enabled;
		boolean oldEnabledESet = enabledESet;
		enabled = ENABLED_EDEFAULT;
		enabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnabled() {
		return enabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDataSetWriterId() {
		return dataSetWriterId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetWriterId(int newDataSetWriterId) {
		int oldDataSetWriterId = dataSetWriterId;
		dataSetWriterId = newDataSetWriterId;
		boolean oldDataSetWriterIdESet = dataSetWriterIdESet;
		dataSetWriterIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_ID, oldDataSetWriterId, dataSetWriterId, !oldDataSetWriterIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSetWriterId() {
		int oldDataSetWriterId = dataSetWriterId;
		boolean oldDataSetWriterIdESet = dataSetWriterIdESet;
		dataSetWriterId = DATA_SET_WRITER_ID_EDEFAULT;
		dataSetWriterIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_ID, oldDataSetWriterId, DATA_SET_WRITER_ID_EDEFAULT, oldDataSetWriterIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSetWriterId() {
		return dataSetWriterIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDataSetFieldContentMask() {
		return dataSetFieldContentMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetFieldContentMask(long newDataSetFieldContentMask) {
		long oldDataSetFieldContentMask = dataSetFieldContentMask;
		dataSetFieldContentMask = newDataSetFieldContentMask;
		boolean oldDataSetFieldContentMaskESet = dataSetFieldContentMaskESet;
		dataSetFieldContentMaskESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_FIELD_CONTENT_MASK, oldDataSetFieldContentMask, dataSetFieldContentMask, !oldDataSetFieldContentMaskESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSetFieldContentMask() {
		long oldDataSetFieldContentMask = dataSetFieldContentMask;
		boolean oldDataSetFieldContentMaskESet = dataSetFieldContentMaskESet;
		dataSetFieldContentMask = DATA_SET_FIELD_CONTENT_MASK_EDEFAULT;
		dataSetFieldContentMaskESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_FIELD_CONTENT_MASK, oldDataSetFieldContentMask, DATA_SET_FIELD_CONTENT_MASK_EDEFAULT, oldDataSetFieldContentMaskESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSetFieldContentMask() {
		return dataSetFieldContentMaskESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getKeyFrameCount() {
		return keyFrameCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyFrameCount(long newKeyFrameCount) {
		long oldKeyFrameCount = keyFrameCount;
		keyFrameCount = newKeyFrameCount;
		boolean oldKeyFrameCountESet = keyFrameCountESet;
		keyFrameCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__KEY_FRAME_COUNT, oldKeyFrameCount, keyFrameCount, !oldKeyFrameCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKeyFrameCount() {
		long oldKeyFrameCount = keyFrameCount;
		boolean oldKeyFrameCountESet = keyFrameCountESet;
		keyFrameCount = KEY_FRAME_COUNT_EDEFAULT;
		keyFrameCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__KEY_FRAME_COUNT, oldKeyFrameCount, KEY_FRAME_COUNT_EDEFAULT, oldKeyFrameCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKeyFrameCount() {
		return keyFrameCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSetName() {
		return dataSetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetName(String newDataSetName) {
		String oldDataSetName = dataSetName;
		dataSetName = newDataSetName;
		boolean oldDataSetNameESet = dataSetNameESet;
		dataSetNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_NAME, oldDataSetName, dataSetName, !oldDataSetNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSetName() {
		String oldDataSetName = dataSetName;
		boolean oldDataSetNameESet = dataSetNameESet;
		dataSetName = DATA_SET_NAME_EDEFAULT;
		dataSetNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_NAME, oldDataSetName, DATA_SET_NAME_EDEFAULT, oldDataSetNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSetName() {
		return dataSetNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfKeyValuePair getDataSetWriterProperties() {
		return dataSetWriterProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetWriterProperties(ListOfKeyValuePair newDataSetWriterProperties, NotificationChain msgs) {
		ListOfKeyValuePair oldDataSetWriterProperties = dataSetWriterProperties;
		dataSetWriterProperties = newDataSetWriterProperties;
		boolean oldDataSetWriterPropertiesESet = dataSetWriterPropertiesESet;
		dataSetWriterPropertiesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_PROPERTIES, oldDataSetWriterProperties, newDataSetWriterProperties, !oldDataSetWriterPropertiesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetWriterProperties(ListOfKeyValuePair newDataSetWriterProperties) {
		if (newDataSetWriterProperties != dataSetWriterProperties) {
			NotificationChain msgs = null;
			if (dataSetWriterProperties != null)
				msgs = ((InternalEObject)dataSetWriterProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_PROPERTIES, null, msgs);
			if (newDataSetWriterProperties != null)
				msgs = ((InternalEObject)newDataSetWriterProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_PROPERTIES, null, msgs);
			msgs = basicSetDataSetWriterProperties(newDataSetWriterProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataSetWriterPropertiesESet = dataSetWriterPropertiesESet;
			dataSetWriterPropertiesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_PROPERTIES, newDataSetWriterProperties, newDataSetWriterProperties, !oldDataSetWriterPropertiesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDataSetWriterProperties(NotificationChain msgs) {
		ListOfKeyValuePair oldDataSetWriterProperties = dataSetWriterProperties;
		dataSetWriterProperties = null;
		boolean oldDataSetWriterPropertiesESet = dataSetWriterPropertiesESet;
		dataSetWriterPropertiesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_PROPERTIES, oldDataSetWriterProperties, null, oldDataSetWriterPropertiesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSetWriterProperties() {
		if (dataSetWriterProperties != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dataSetWriterProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_PROPERTIES, null, msgs);
			msgs = basicUnsetDataSetWriterProperties(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataSetWriterPropertiesESet = dataSetWriterPropertiesESet;
			dataSetWriterPropertiesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_PROPERTIES, null, null, oldDataSetWriterPropertiesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSetWriterProperties() {
		return dataSetWriterPropertiesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionObject getTransportSettings() {
		return transportSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportSettings(ExtensionObject newTransportSettings, NotificationChain msgs) {
		ExtensionObject oldTransportSettings = transportSettings;
		transportSettings = newTransportSettings;
		boolean oldTransportSettingsESet = transportSettingsESet;
		transportSettingsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__TRANSPORT_SETTINGS, oldTransportSettings, newTransportSettings, !oldTransportSettingsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportSettings(ExtensionObject newTransportSettings) {
		if (newTransportSettings != transportSettings) {
			NotificationChain msgs = null;
			if (transportSettings != null)
				msgs = ((InternalEObject)transportSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_WRITER_DATA_TYPE__TRANSPORT_SETTINGS, null, msgs);
			if (newTransportSettings != null)
				msgs = ((InternalEObject)newTransportSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_WRITER_DATA_TYPE__TRANSPORT_SETTINGS, null, msgs);
			msgs = basicSetTransportSettings(newTransportSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTransportSettingsESet = transportSettingsESet;
			transportSettingsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__TRANSPORT_SETTINGS, newTransportSettings, newTransportSettings, !oldTransportSettingsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTransportSettings(NotificationChain msgs) {
		ExtensionObject oldTransportSettings = transportSettings;
		transportSettings = null;
		boolean oldTransportSettingsESet = transportSettingsESet;
		transportSettingsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__TRANSPORT_SETTINGS, oldTransportSettings, null, oldTransportSettingsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransportSettings() {
		if (transportSettings != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)transportSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_WRITER_DATA_TYPE__TRANSPORT_SETTINGS, null, msgs);
			msgs = basicUnsetTransportSettings(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTransportSettingsESet = transportSettingsESet;
			transportSettingsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__TRANSPORT_SETTINGS, null, null, oldTransportSettingsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransportSettings() {
		return transportSettingsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionObject getMessageSettings() {
		return messageSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageSettings(ExtensionObject newMessageSettings, NotificationChain msgs) {
		ExtensionObject oldMessageSettings = messageSettings;
		messageSettings = newMessageSettings;
		boolean oldMessageSettingsESet = messageSettingsESet;
		messageSettingsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__MESSAGE_SETTINGS, oldMessageSettings, newMessageSettings, !oldMessageSettingsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageSettings(ExtensionObject newMessageSettings) {
		if (newMessageSettings != messageSettings) {
			NotificationChain msgs = null;
			if (messageSettings != null)
				msgs = ((InternalEObject)messageSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_WRITER_DATA_TYPE__MESSAGE_SETTINGS, null, msgs);
			if (newMessageSettings != null)
				msgs = ((InternalEObject)newMessageSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_WRITER_DATA_TYPE__MESSAGE_SETTINGS, null, msgs);
			msgs = basicSetMessageSettings(newMessageSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMessageSettingsESet = messageSettingsESet;
			messageSettingsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__MESSAGE_SETTINGS, newMessageSettings, newMessageSettings, !oldMessageSettingsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetMessageSettings(NotificationChain msgs) {
		ExtensionObject oldMessageSettings = messageSettings;
		messageSettings = null;
		boolean oldMessageSettingsESet = messageSettingsESet;
		messageSettingsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__MESSAGE_SETTINGS, oldMessageSettings, null, oldMessageSettingsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMessageSettings() {
		if (messageSettings != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)messageSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_WRITER_DATA_TYPE__MESSAGE_SETTINGS, null, msgs);
			msgs = basicUnsetMessageSettings(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMessageSettingsESet = messageSettingsESet;
			messageSettingsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_WRITER_DATA_TYPE__MESSAGE_SETTINGS, null, null, oldMessageSettingsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMessageSettings() {
		return messageSettingsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_PROPERTIES:
				return basicUnsetDataSetWriterProperties(msgs);
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__TRANSPORT_SETTINGS:
				return basicUnsetTransportSettings(msgs);
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__MESSAGE_SETTINGS:
				return basicUnsetMessageSettings(msgs);
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
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__NAME:
				return getName();
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__ENABLED:
				return isEnabled();
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_ID:
				return getDataSetWriterId();
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_FIELD_CONTENT_MASK:
				return getDataSetFieldContentMask();
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__KEY_FRAME_COUNT:
				return getKeyFrameCount();
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_NAME:
				return getDataSetName();
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_PROPERTIES:
				return getDataSetWriterProperties();
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__TRANSPORT_SETTINGS:
				return getTransportSettings();
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__MESSAGE_SETTINGS:
				return getMessageSettings();
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
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_ID:
				setDataSetWriterId((Integer)newValue);
				return;
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_FIELD_CONTENT_MASK:
				setDataSetFieldContentMask((Long)newValue);
				return;
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__KEY_FRAME_COUNT:
				setKeyFrameCount((Long)newValue);
				return;
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_NAME:
				setDataSetName((String)newValue);
				return;
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_PROPERTIES:
				setDataSetWriterProperties((ListOfKeyValuePair)newValue);
				return;
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__TRANSPORT_SETTINGS:
				setTransportSettings((ExtensionObject)newValue);
				return;
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__MESSAGE_SETTINGS:
				setMessageSettings((ExtensionObject)newValue);
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
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__NAME:
				unsetName();
				return;
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__ENABLED:
				unsetEnabled();
				return;
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_ID:
				unsetDataSetWriterId();
				return;
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_FIELD_CONTENT_MASK:
				unsetDataSetFieldContentMask();
				return;
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__KEY_FRAME_COUNT:
				unsetKeyFrameCount();
				return;
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_NAME:
				unsetDataSetName();
				return;
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_PROPERTIES:
				unsetDataSetWriterProperties();
				return;
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__TRANSPORT_SETTINGS:
				unsetTransportSettings();
				return;
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__MESSAGE_SETTINGS:
				unsetMessageSettings();
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
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__NAME:
				return isSetName();
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__ENABLED:
				return isSetEnabled();
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_ID:
				return isSetDataSetWriterId();
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_FIELD_CONTENT_MASK:
				return isSetDataSetFieldContentMask();
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__KEY_FRAME_COUNT:
				return isSetKeyFrameCount();
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_NAME:
				return isSetDataSetName();
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__DATA_SET_WRITER_PROPERTIES:
				return isSetDataSetWriterProperties();
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__TRANSPORT_SETTINGS:
				return isSetTransportSettings();
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE__MESSAGE_SETTINGS:
				return isSetMessageSettings();
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
		result.append(", enabled: ");
		if (enabledESet) result.append(enabled); else result.append("<unset>");
		result.append(", dataSetWriterId: ");
		if (dataSetWriterIdESet) result.append(dataSetWriterId); else result.append("<unset>");
		result.append(", dataSetFieldContentMask: ");
		if (dataSetFieldContentMaskESet) result.append(dataSetFieldContentMask); else result.append("<unset>");
		result.append(", keyFrameCount: ");
		if (keyFrameCountESet) result.append(keyFrameCount); else result.append("<unset>");
		result.append(", dataSetName: ");
		if (dataSetNameESet) result.append(dataSetName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataSetWriterDataTypeImpl
