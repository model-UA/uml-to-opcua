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
import org.opcfoundation.ua._2008._02.types.DataSetReaderDataType;
import org.opcfoundation.ua._2008._02.types.ExtensionObject;
import org.opcfoundation.ua._2008._02.types.ListOfEndpointDescription;
import org.opcfoundation.ua._2008._02.types.ListOfKeyValuePair;
import org.opcfoundation.ua._2008._02.types.MessageSecurityMode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.Variant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Set Reader Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetReaderDataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetReaderDataTypeImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetReaderDataTypeImpl#getPublisherId <em>Publisher Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetReaderDataTypeImpl#getWriterGroupId <em>Writer Group Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetReaderDataTypeImpl#getDataSetWriterId <em>Data Set Writer Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetReaderDataTypeImpl#getDataSetMetaData <em>Data Set Meta Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetReaderDataTypeImpl#getDataSetFieldContentMask <em>Data Set Field Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetReaderDataTypeImpl#getMessageReceiveTimeout <em>Message Receive Timeout</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetReaderDataTypeImpl#getKeyFrameCount <em>Key Frame Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetReaderDataTypeImpl#getHeaderLayoutUri <em>Header Layout Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetReaderDataTypeImpl#getSecurityMode <em>Security Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetReaderDataTypeImpl#getSecurityGroupId <em>Security Group Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetReaderDataTypeImpl#getSecurityKeyServices <em>Security Key Services</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetReaderDataTypeImpl#getDataSetReaderProperties <em>Data Set Reader Properties</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetReaderDataTypeImpl#getTransportSettings <em>Transport Settings</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetReaderDataTypeImpl#getMessageSettings <em>Message Settings</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.DataSetReaderDataTypeImpl#getSubscribedDataSet <em>Subscribed Data Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSetReaderDataTypeImpl extends MinimalEObjectImpl.Container implements DataSetReaderDataType {
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
	 * The cached value of the '{@link #getPublisherId() <em>Publisher Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherId()
	 * @generated
	 * @ordered
	 */
	protected Variant publisherId;

	/**
	 * The default value of the '{@link #getWriterGroupId() <em>Writer Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriterGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final int WRITER_GROUP_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWriterGroupId() <em>Writer Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriterGroupId()
	 * @generated
	 * @ordered
	 */
	protected int writerGroupId = WRITER_GROUP_ID_EDEFAULT;

	/**
	 * This is true if the Writer Group Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean writerGroupIdESet;

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
	 * The default value of the '{@link #getMessageReceiveTimeout() <em>Message Receive Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageReceiveTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final double MESSAGE_RECEIVE_TIMEOUT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMessageReceiveTimeout() <em>Message Receive Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageReceiveTimeout()
	 * @generated
	 * @ordered
	 */
	protected double messageReceiveTimeout = MESSAGE_RECEIVE_TIMEOUT_EDEFAULT;

	/**
	 * This is true if the Message Receive Timeout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean messageReceiveTimeoutESet;

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
	 * The default value of the '{@link #getHeaderLayoutUri() <em>Header Layout Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderLayoutUri()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_LAYOUT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaderLayoutUri() <em>Header Layout Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderLayoutUri()
	 * @generated
	 * @ordered
	 */
	protected String headerLayoutUri = HEADER_LAYOUT_URI_EDEFAULT;

	/**
	 * This is true if the Header Layout Uri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean headerLayoutUriESet;

	/**
	 * The default value of the '{@link #getSecurityMode() <em>Security Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityMode()
	 * @generated
	 * @ordered
	 */
	protected static final MessageSecurityMode SECURITY_MODE_EDEFAULT = MessageSecurityMode.INVALID0;

	/**
	 * The cached value of the '{@link #getSecurityMode() <em>Security Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityMode()
	 * @generated
	 * @ordered
	 */
	protected MessageSecurityMode securityMode = SECURITY_MODE_EDEFAULT;

	/**
	 * This is true if the Security Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securityModeESet;

	/**
	 * The default value of the '{@link #getSecurityGroupId() <em>Security Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityGroupId() <em>Security Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupId()
	 * @generated
	 * @ordered
	 */
	protected String securityGroupId = SECURITY_GROUP_ID_EDEFAULT;

	/**
	 * This is true if the Security Group Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securityGroupIdESet;

	/**
	 * The cached value of the '{@link #getSecurityKeyServices() <em>Security Key Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityKeyServices()
	 * @generated
	 * @ordered
	 */
	protected ListOfEndpointDescription securityKeyServices;

	/**
	 * This is true if the Security Key Services containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securityKeyServicesESet;

	/**
	 * The cached value of the '{@link #getDataSetReaderProperties() <em>Data Set Reader Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetReaderProperties()
	 * @generated
	 * @ordered
	 */
	protected ListOfKeyValuePair dataSetReaderProperties;

	/**
	 * This is true if the Data Set Reader Properties containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSetReaderPropertiesESet;

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
	 * The cached value of the '{@link #getSubscribedDataSet() <em>Subscribed Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribedDataSet()
	 * @generated
	 * @ordered
	 */
	protected ExtensionObject subscribedDataSet;

	/**
	 * This is true if the Subscribed Data Set containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subscribedDataSetESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSetReaderDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getDataSetReaderDataType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__ENABLED, oldEnabled, enabled, !oldEnabledESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
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
	public Variant getPublisherId() {
		return publisherId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisherId(Variant newPublisherId, NotificationChain msgs) {
		Variant oldPublisherId = publisherId;
		publisherId = newPublisherId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__PUBLISHER_ID, oldPublisherId, newPublisherId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherId(Variant newPublisherId) {
		if (newPublisherId != publisherId) {
			NotificationChain msgs = null;
			if (publisherId != null)
				msgs = ((InternalEObject)publisherId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__PUBLISHER_ID, null, msgs);
			if (newPublisherId != null)
				msgs = ((InternalEObject)newPublisherId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__PUBLISHER_ID, null, msgs);
			msgs = basicSetPublisherId(newPublisherId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__PUBLISHER_ID, newPublisherId, newPublisherId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWriterGroupId() {
		return writerGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriterGroupId(int newWriterGroupId) {
		int oldWriterGroupId = writerGroupId;
		writerGroupId = newWriterGroupId;
		boolean oldWriterGroupIdESet = writerGroupIdESet;
		writerGroupIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__WRITER_GROUP_ID, oldWriterGroupId, writerGroupId, !oldWriterGroupIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWriterGroupId() {
		int oldWriterGroupId = writerGroupId;
		boolean oldWriterGroupIdESet = writerGroupIdESet;
		writerGroupId = WRITER_GROUP_ID_EDEFAULT;
		writerGroupIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__WRITER_GROUP_ID, oldWriterGroupId, WRITER_GROUP_ID_EDEFAULT, oldWriterGroupIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWriterGroupId() {
		return writerGroupIdESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_WRITER_ID, oldDataSetWriterId, dataSetWriterId, !oldDataSetWriterIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_WRITER_ID, oldDataSetWriterId, DATA_SET_WRITER_ID_EDEFAULT, oldDataSetWriterIdESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_META_DATA, oldDataSetMetaData, newDataSetMetaData, !oldDataSetMetaDataESet);
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
				msgs = ((InternalEObject)dataSetMetaData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_META_DATA, null, msgs);
			if (newDataSetMetaData != null)
				msgs = ((InternalEObject)newDataSetMetaData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_META_DATA, null, msgs);
			msgs = basicSetDataSetMetaData(newDataSetMetaData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataSetMetaDataESet = dataSetMetaDataESet;
			dataSetMetaDataESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_META_DATA, newDataSetMetaData, newDataSetMetaData, !oldDataSetMetaDataESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_META_DATA, oldDataSetMetaData, null, oldDataSetMetaDataESet);
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
			msgs = ((InternalEObject)dataSetMetaData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_META_DATA, null, msgs);
			msgs = basicUnsetDataSetMetaData(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataSetMetaDataESet = dataSetMetaDataESet;
			dataSetMetaDataESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_META_DATA, null, null, oldDataSetMetaDataESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_FIELD_CONTENT_MASK, oldDataSetFieldContentMask, dataSetFieldContentMask, !oldDataSetFieldContentMaskESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_FIELD_CONTENT_MASK, oldDataSetFieldContentMask, DATA_SET_FIELD_CONTENT_MASK_EDEFAULT, oldDataSetFieldContentMaskESet));
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
	public double getMessageReceiveTimeout() {
		return messageReceiveTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageReceiveTimeout(double newMessageReceiveTimeout) {
		double oldMessageReceiveTimeout = messageReceiveTimeout;
		messageReceiveTimeout = newMessageReceiveTimeout;
		boolean oldMessageReceiveTimeoutESet = messageReceiveTimeoutESet;
		messageReceiveTimeoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_RECEIVE_TIMEOUT, oldMessageReceiveTimeout, messageReceiveTimeout, !oldMessageReceiveTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMessageReceiveTimeout() {
		double oldMessageReceiveTimeout = messageReceiveTimeout;
		boolean oldMessageReceiveTimeoutESet = messageReceiveTimeoutESet;
		messageReceiveTimeout = MESSAGE_RECEIVE_TIMEOUT_EDEFAULT;
		messageReceiveTimeoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_RECEIVE_TIMEOUT, oldMessageReceiveTimeout, MESSAGE_RECEIVE_TIMEOUT_EDEFAULT, oldMessageReceiveTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMessageReceiveTimeout() {
		return messageReceiveTimeoutESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__KEY_FRAME_COUNT, oldKeyFrameCount, keyFrameCount, !oldKeyFrameCountESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__KEY_FRAME_COUNT, oldKeyFrameCount, KEY_FRAME_COUNT_EDEFAULT, oldKeyFrameCountESet));
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
	public String getHeaderLayoutUri() {
		return headerLayoutUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderLayoutUri(String newHeaderLayoutUri) {
		String oldHeaderLayoutUri = headerLayoutUri;
		headerLayoutUri = newHeaderLayoutUri;
		boolean oldHeaderLayoutUriESet = headerLayoutUriESet;
		headerLayoutUriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__HEADER_LAYOUT_URI, oldHeaderLayoutUri, headerLayoutUri, !oldHeaderLayoutUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeaderLayoutUri() {
		String oldHeaderLayoutUri = headerLayoutUri;
		boolean oldHeaderLayoutUriESet = headerLayoutUriESet;
		headerLayoutUri = HEADER_LAYOUT_URI_EDEFAULT;
		headerLayoutUriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__HEADER_LAYOUT_URI, oldHeaderLayoutUri, HEADER_LAYOUT_URI_EDEFAULT, oldHeaderLayoutUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeaderLayoutUri() {
		return headerLayoutUriESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSecurityMode getSecurityMode() {
		return securityMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityMode(MessageSecurityMode newSecurityMode) {
		MessageSecurityMode oldSecurityMode = securityMode;
		securityMode = newSecurityMode == null ? SECURITY_MODE_EDEFAULT : newSecurityMode;
		boolean oldSecurityModeESet = securityModeESet;
		securityModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_MODE, oldSecurityMode, securityMode, !oldSecurityModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurityMode() {
		MessageSecurityMode oldSecurityMode = securityMode;
		boolean oldSecurityModeESet = securityModeESet;
		securityMode = SECURITY_MODE_EDEFAULT;
		securityModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_MODE, oldSecurityMode, SECURITY_MODE_EDEFAULT, oldSecurityModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecurityMode() {
		return securityModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityGroupId() {
		return securityGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityGroupId(String newSecurityGroupId) {
		String oldSecurityGroupId = securityGroupId;
		securityGroupId = newSecurityGroupId;
		boolean oldSecurityGroupIdESet = securityGroupIdESet;
		securityGroupIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_GROUP_ID, oldSecurityGroupId, securityGroupId, !oldSecurityGroupIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurityGroupId() {
		String oldSecurityGroupId = securityGroupId;
		boolean oldSecurityGroupIdESet = securityGroupIdESet;
		securityGroupId = SECURITY_GROUP_ID_EDEFAULT;
		securityGroupIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_GROUP_ID, oldSecurityGroupId, SECURITY_GROUP_ID_EDEFAULT, oldSecurityGroupIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecurityGroupId() {
		return securityGroupIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEndpointDescription getSecurityKeyServices() {
		return securityKeyServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityKeyServices(ListOfEndpointDescription newSecurityKeyServices, NotificationChain msgs) {
		ListOfEndpointDescription oldSecurityKeyServices = securityKeyServices;
		securityKeyServices = newSecurityKeyServices;
		boolean oldSecurityKeyServicesESet = securityKeyServicesESet;
		securityKeyServicesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_KEY_SERVICES, oldSecurityKeyServices, newSecurityKeyServices, !oldSecurityKeyServicesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityKeyServices(ListOfEndpointDescription newSecurityKeyServices) {
		if (newSecurityKeyServices != securityKeyServices) {
			NotificationChain msgs = null;
			if (securityKeyServices != null)
				msgs = ((InternalEObject)securityKeyServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_KEY_SERVICES, null, msgs);
			if (newSecurityKeyServices != null)
				msgs = ((InternalEObject)newSecurityKeyServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_KEY_SERVICES, null, msgs);
			msgs = basicSetSecurityKeyServices(newSecurityKeyServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSecurityKeyServicesESet = securityKeyServicesESet;
			securityKeyServicesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_KEY_SERVICES, newSecurityKeyServices, newSecurityKeyServices, !oldSecurityKeyServicesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSecurityKeyServices(NotificationChain msgs) {
		ListOfEndpointDescription oldSecurityKeyServices = securityKeyServices;
		securityKeyServices = null;
		boolean oldSecurityKeyServicesESet = securityKeyServicesESet;
		securityKeyServicesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_KEY_SERVICES, oldSecurityKeyServices, null, oldSecurityKeyServicesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurityKeyServices() {
		if (securityKeyServices != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)securityKeyServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_KEY_SERVICES, null, msgs);
			msgs = basicUnsetSecurityKeyServices(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSecurityKeyServicesESet = securityKeyServicesESet;
			securityKeyServicesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_KEY_SERVICES, null, null, oldSecurityKeyServicesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecurityKeyServices() {
		return securityKeyServicesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfKeyValuePair getDataSetReaderProperties() {
		return dataSetReaderProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetReaderProperties(ListOfKeyValuePair newDataSetReaderProperties, NotificationChain msgs) {
		ListOfKeyValuePair oldDataSetReaderProperties = dataSetReaderProperties;
		dataSetReaderProperties = newDataSetReaderProperties;
		boolean oldDataSetReaderPropertiesESet = dataSetReaderPropertiesESet;
		dataSetReaderPropertiesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_READER_PROPERTIES, oldDataSetReaderProperties, newDataSetReaderProperties, !oldDataSetReaderPropertiesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetReaderProperties(ListOfKeyValuePair newDataSetReaderProperties) {
		if (newDataSetReaderProperties != dataSetReaderProperties) {
			NotificationChain msgs = null;
			if (dataSetReaderProperties != null)
				msgs = ((InternalEObject)dataSetReaderProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_READER_PROPERTIES, null, msgs);
			if (newDataSetReaderProperties != null)
				msgs = ((InternalEObject)newDataSetReaderProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_READER_PROPERTIES, null, msgs);
			msgs = basicSetDataSetReaderProperties(newDataSetReaderProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataSetReaderPropertiesESet = dataSetReaderPropertiesESet;
			dataSetReaderPropertiesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_READER_PROPERTIES, newDataSetReaderProperties, newDataSetReaderProperties, !oldDataSetReaderPropertiesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDataSetReaderProperties(NotificationChain msgs) {
		ListOfKeyValuePair oldDataSetReaderProperties = dataSetReaderProperties;
		dataSetReaderProperties = null;
		boolean oldDataSetReaderPropertiesESet = dataSetReaderPropertiesESet;
		dataSetReaderPropertiesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_READER_PROPERTIES, oldDataSetReaderProperties, null, oldDataSetReaderPropertiesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSetReaderProperties() {
		if (dataSetReaderProperties != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dataSetReaderProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_READER_PROPERTIES, null, msgs);
			msgs = basicUnsetDataSetReaderProperties(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataSetReaderPropertiesESet = dataSetReaderPropertiesESet;
			dataSetReaderPropertiesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_READER_PROPERTIES, null, null, oldDataSetReaderPropertiesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSetReaderProperties() {
		return dataSetReaderPropertiesESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__TRANSPORT_SETTINGS, oldTransportSettings, newTransportSettings, !oldTransportSettingsESet);
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
				msgs = ((InternalEObject)transportSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__TRANSPORT_SETTINGS, null, msgs);
			if (newTransportSettings != null)
				msgs = ((InternalEObject)newTransportSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__TRANSPORT_SETTINGS, null, msgs);
			msgs = basicSetTransportSettings(newTransportSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTransportSettingsESet = transportSettingsESet;
			transportSettingsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__TRANSPORT_SETTINGS, newTransportSettings, newTransportSettings, !oldTransportSettingsESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__TRANSPORT_SETTINGS, oldTransportSettings, null, oldTransportSettingsESet);
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
			msgs = ((InternalEObject)transportSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__TRANSPORT_SETTINGS, null, msgs);
			msgs = basicUnsetTransportSettings(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTransportSettingsESet = transportSettingsESet;
			transportSettingsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__TRANSPORT_SETTINGS, null, null, oldTransportSettingsESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_SETTINGS, oldMessageSettings, newMessageSettings, !oldMessageSettingsESet);
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
				msgs = ((InternalEObject)messageSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_SETTINGS, null, msgs);
			if (newMessageSettings != null)
				msgs = ((InternalEObject)newMessageSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_SETTINGS, null, msgs);
			msgs = basicSetMessageSettings(newMessageSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMessageSettingsESet = messageSettingsESet;
			messageSettingsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_SETTINGS, newMessageSettings, newMessageSettings, !oldMessageSettingsESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_SETTINGS, oldMessageSettings, null, oldMessageSettingsESet);
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
			msgs = ((InternalEObject)messageSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_SETTINGS, null, msgs);
			msgs = basicUnsetMessageSettings(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMessageSettingsESet = messageSettingsESet;
			messageSettingsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_SETTINGS, null, null, oldMessageSettingsESet));
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
	public ExtensionObject getSubscribedDataSet() {
		return subscribedDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscribedDataSet(ExtensionObject newSubscribedDataSet, NotificationChain msgs) {
		ExtensionObject oldSubscribedDataSet = subscribedDataSet;
		subscribedDataSet = newSubscribedDataSet;
		boolean oldSubscribedDataSetESet = subscribedDataSetESet;
		subscribedDataSetESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__SUBSCRIBED_DATA_SET, oldSubscribedDataSet, newSubscribedDataSet, !oldSubscribedDataSetESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscribedDataSet(ExtensionObject newSubscribedDataSet) {
		if (newSubscribedDataSet != subscribedDataSet) {
			NotificationChain msgs = null;
			if (subscribedDataSet != null)
				msgs = ((InternalEObject)subscribedDataSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__SUBSCRIBED_DATA_SET, null, msgs);
			if (newSubscribedDataSet != null)
				msgs = ((InternalEObject)newSubscribedDataSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__SUBSCRIBED_DATA_SET, null, msgs);
			msgs = basicSetSubscribedDataSet(newSubscribedDataSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSubscribedDataSetESet = subscribedDataSetESet;
			subscribedDataSetESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_READER_DATA_TYPE__SUBSCRIBED_DATA_SET, newSubscribedDataSet, newSubscribedDataSet, !oldSubscribedDataSetESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSubscribedDataSet(NotificationChain msgs) {
		ExtensionObject oldSubscribedDataSet = subscribedDataSet;
		subscribedDataSet = null;
		boolean oldSubscribedDataSetESet = subscribedDataSetESet;
		subscribedDataSetESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__SUBSCRIBED_DATA_SET, oldSubscribedDataSet, null, oldSubscribedDataSetESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSubscribedDataSet() {
		if (subscribedDataSet != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)subscribedDataSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_READER_DATA_TYPE__SUBSCRIBED_DATA_SET, null, msgs);
			msgs = basicUnsetSubscribedDataSet(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSubscribedDataSetESet = subscribedDataSetESet;
			subscribedDataSetESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_READER_DATA_TYPE__SUBSCRIBED_DATA_SET, null, null, oldSubscribedDataSetESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubscribedDataSet() {
		return subscribedDataSetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DATA_SET_READER_DATA_TYPE__PUBLISHER_ID:
				return basicSetPublisherId(null, msgs);
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_META_DATA:
				return basicUnsetDataSetMetaData(msgs);
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_KEY_SERVICES:
				return basicUnsetSecurityKeyServices(msgs);
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_READER_PROPERTIES:
				return basicUnsetDataSetReaderProperties(msgs);
			case TypesPackage.DATA_SET_READER_DATA_TYPE__TRANSPORT_SETTINGS:
				return basicUnsetTransportSettings(msgs);
			case TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_SETTINGS:
				return basicUnsetMessageSettings(msgs);
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SUBSCRIBED_DATA_SET:
				return basicUnsetSubscribedDataSet(msgs);
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
			case TypesPackage.DATA_SET_READER_DATA_TYPE__NAME:
				return getName();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__ENABLED:
				return isEnabled();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__PUBLISHER_ID:
				return getPublisherId();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__WRITER_GROUP_ID:
				return getWriterGroupId();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_WRITER_ID:
				return getDataSetWriterId();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_META_DATA:
				return getDataSetMetaData();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_FIELD_CONTENT_MASK:
				return getDataSetFieldContentMask();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_RECEIVE_TIMEOUT:
				return getMessageReceiveTimeout();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__KEY_FRAME_COUNT:
				return getKeyFrameCount();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__HEADER_LAYOUT_URI:
				return getHeaderLayoutUri();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_MODE:
				return getSecurityMode();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_GROUP_ID:
				return getSecurityGroupId();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_KEY_SERVICES:
				return getSecurityKeyServices();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_READER_PROPERTIES:
				return getDataSetReaderProperties();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__TRANSPORT_SETTINGS:
				return getTransportSettings();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_SETTINGS:
				return getMessageSettings();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SUBSCRIBED_DATA_SET:
				return getSubscribedDataSet();
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
			case TypesPackage.DATA_SET_READER_DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__PUBLISHER_ID:
				setPublisherId((Variant)newValue);
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__WRITER_GROUP_ID:
				setWriterGroupId((Integer)newValue);
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_WRITER_ID:
				setDataSetWriterId((Integer)newValue);
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_META_DATA:
				setDataSetMetaData((DataSetMetaDataType)newValue);
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_FIELD_CONTENT_MASK:
				setDataSetFieldContentMask((Long)newValue);
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_RECEIVE_TIMEOUT:
				setMessageReceiveTimeout((Double)newValue);
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__KEY_FRAME_COUNT:
				setKeyFrameCount((Long)newValue);
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__HEADER_LAYOUT_URI:
				setHeaderLayoutUri((String)newValue);
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_MODE:
				setSecurityMode((MessageSecurityMode)newValue);
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_GROUP_ID:
				setSecurityGroupId((String)newValue);
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_KEY_SERVICES:
				setSecurityKeyServices((ListOfEndpointDescription)newValue);
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_READER_PROPERTIES:
				setDataSetReaderProperties((ListOfKeyValuePair)newValue);
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__TRANSPORT_SETTINGS:
				setTransportSettings((ExtensionObject)newValue);
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_SETTINGS:
				setMessageSettings((ExtensionObject)newValue);
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SUBSCRIBED_DATA_SET:
				setSubscribedDataSet((ExtensionObject)newValue);
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
			case TypesPackage.DATA_SET_READER_DATA_TYPE__NAME:
				unsetName();
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__ENABLED:
				unsetEnabled();
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__PUBLISHER_ID:
				setPublisherId((Variant)null);
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__WRITER_GROUP_ID:
				unsetWriterGroupId();
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_WRITER_ID:
				unsetDataSetWriterId();
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_META_DATA:
				unsetDataSetMetaData();
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_FIELD_CONTENT_MASK:
				unsetDataSetFieldContentMask();
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_RECEIVE_TIMEOUT:
				unsetMessageReceiveTimeout();
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__KEY_FRAME_COUNT:
				unsetKeyFrameCount();
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__HEADER_LAYOUT_URI:
				unsetHeaderLayoutUri();
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_MODE:
				unsetSecurityMode();
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_GROUP_ID:
				unsetSecurityGroupId();
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_KEY_SERVICES:
				unsetSecurityKeyServices();
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_READER_PROPERTIES:
				unsetDataSetReaderProperties();
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__TRANSPORT_SETTINGS:
				unsetTransportSettings();
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_SETTINGS:
				unsetMessageSettings();
				return;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SUBSCRIBED_DATA_SET:
				unsetSubscribedDataSet();
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
			case TypesPackage.DATA_SET_READER_DATA_TYPE__NAME:
				return isSetName();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__ENABLED:
				return isSetEnabled();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__PUBLISHER_ID:
				return publisherId != null;
			case TypesPackage.DATA_SET_READER_DATA_TYPE__WRITER_GROUP_ID:
				return isSetWriterGroupId();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_WRITER_ID:
				return isSetDataSetWriterId();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_META_DATA:
				return isSetDataSetMetaData();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_FIELD_CONTENT_MASK:
				return isSetDataSetFieldContentMask();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_RECEIVE_TIMEOUT:
				return isSetMessageReceiveTimeout();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__KEY_FRAME_COUNT:
				return isSetKeyFrameCount();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__HEADER_LAYOUT_URI:
				return isSetHeaderLayoutUri();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_MODE:
				return isSetSecurityMode();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_GROUP_ID:
				return isSetSecurityGroupId();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SECURITY_KEY_SERVICES:
				return isSetSecurityKeyServices();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__DATA_SET_READER_PROPERTIES:
				return isSetDataSetReaderProperties();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__TRANSPORT_SETTINGS:
				return isSetTransportSettings();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__MESSAGE_SETTINGS:
				return isSetMessageSettings();
			case TypesPackage.DATA_SET_READER_DATA_TYPE__SUBSCRIBED_DATA_SET:
				return isSetSubscribedDataSet();
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
		result.append(", writerGroupId: ");
		if (writerGroupIdESet) result.append(writerGroupId); else result.append("<unset>");
		result.append(", dataSetWriterId: ");
		if (dataSetWriterIdESet) result.append(dataSetWriterId); else result.append("<unset>");
		result.append(", dataSetFieldContentMask: ");
		if (dataSetFieldContentMaskESet) result.append(dataSetFieldContentMask); else result.append("<unset>");
		result.append(", messageReceiveTimeout: ");
		if (messageReceiveTimeoutESet) result.append(messageReceiveTimeout); else result.append("<unset>");
		result.append(", keyFrameCount: ");
		if (keyFrameCountESet) result.append(keyFrameCount); else result.append("<unset>");
		result.append(", headerLayoutUri: ");
		if (headerLayoutUriESet) result.append(headerLayoutUri); else result.append("<unset>");
		result.append(", securityMode: ");
		if (securityModeESet) result.append(securityMode); else result.append("<unset>");
		result.append(", securityGroupId: ");
		if (securityGroupIdESet) result.append(securityGroupId); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataSetReaderDataTypeImpl
