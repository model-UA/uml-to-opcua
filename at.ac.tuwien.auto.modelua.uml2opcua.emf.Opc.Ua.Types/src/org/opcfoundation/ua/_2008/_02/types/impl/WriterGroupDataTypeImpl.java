/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ExtensionObject;
import org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterDataType;
import org.opcfoundation.ua._2008._02.types.ListOfString;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.WriterGroupDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Writer Group Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.WriterGroupDataTypeImpl#getWriterGroupId <em>Writer Group Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.WriterGroupDataTypeImpl#getPublishingInterval <em>Publishing Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.WriterGroupDataTypeImpl#getKeepAliveTime <em>Keep Alive Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.WriterGroupDataTypeImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.WriterGroupDataTypeImpl#getLocaleIds <em>Locale Ids</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.WriterGroupDataTypeImpl#getHeaderLayoutUri <em>Header Layout Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.WriterGroupDataTypeImpl#getTransportSettings <em>Transport Settings</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.WriterGroupDataTypeImpl#getMessageSettings <em>Message Settings</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.WriterGroupDataTypeImpl#getDataSetWriters <em>Data Set Writers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WriterGroupDataTypeImpl extends PubSubGroupDataTypeImpl implements WriterGroupDataType {
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
	 * The default value of the '{@link #getPublishingInterval() <em>Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishingInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double PUBLISHING_INTERVAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPublishingInterval() <em>Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishingInterval()
	 * @generated
	 * @ordered
	 */
	protected double publishingInterval = PUBLISHING_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Publishing Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean publishingIntervalESet;

	/**
	 * The default value of the '{@link #getKeepAliveTime() <em>Keep Alive Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepAliveTime()
	 * @generated
	 * @ordered
	 */
	protected static final double KEEP_ALIVE_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getKeepAliveTime() <em>Keep Alive Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepAliveTime()
	 * @generated
	 * @ordered
	 */
	protected double keepAliveTime = KEEP_ALIVE_TIME_EDEFAULT;

	/**
	 * This is true if the Keep Alive Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keepAliveTimeESet;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final short PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected short priority = PRIORITY_EDEFAULT;

	/**
	 * This is true if the Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priorityESet;

	/**
	 * The cached value of the '{@link #getLocaleIds() <em>Locale Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleIds()
	 * @generated
	 * @ordered
	 */
	protected ListOfString localeIds;

	/**
	 * This is true if the Locale Ids containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean localeIdsESet;

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
	 * The cached value of the '{@link #getDataSetWriters() <em>Data Set Writers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetWriters()
	 * @generated
	 * @ordered
	 */
	protected ListOfDataSetWriterDataType dataSetWriters;

	/**
	 * This is true if the Data Set Writers containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSetWritersESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriterGroupDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getWriterGroupDataType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.WRITER_GROUP_DATA_TYPE__WRITER_GROUP_ID, oldWriterGroupId, writerGroupId, !oldWriterGroupIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.WRITER_GROUP_DATA_TYPE__WRITER_GROUP_ID, oldWriterGroupId, WRITER_GROUP_ID_EDEFAULT, oldWriterGroupIdESet));
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
	public double getPublishingInterval() {
		return publishingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishingInterval(double newPublishingInterval) {
		double oldPublishingInterval = publishingInterval;
		publishingInterval = newPublishingInterval;
		boolean oldPublishingIntervalESet = publishingIntervalESet;
		publishingIntervalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.WRITER_GROUP_DATA_TYPE__PUBLISHING_INTERVAL, oldPublishingInterval, publishingInterval, !oldPublishingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPublishingInterval() {
		double oldPublishingInterval = publishingInterval;
		boolean oldPublishingIntervalESet = publishingIntervalESet;
		publishingInterval = PUBLISHING_INTERVAL_EDEFAULT;
		publishingIntervalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.WRITER_GROUP_DATA_TYPE__PUBLISHING_INTERVAL, oldPublishingInterval, PUBLISHING_INTERVAL_EDEFAULT, oldPublishingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPublishingInterval() {
		return publishingIntervalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getKeepAliveTime() {
		return keepAliveTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeepAliveTime(double newKeepAliveTime) {
		double oldKeepAliveTime = keepAliveTime;
		keepAliveTime = newKeepAliveTime;
		boolean oldKeepAliveTimeESet = keepAliveTimeESet;
		keepAliveTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.WRITER_GROUP_DATA_TYPE__KEEP_ALIVE_TIME, oldKeepAliveTime, keepAliveTime, !oldKeepAliveTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKeepAliveTime() {
		double oldKeepAliveTime = keepAliveTime;
		boolean oldKeepAliveTimeESet = keepAliveTimeESet;
		keepAliveTime = KEEP_ALIVE_TIME_EDEFAULT;
		keepAliveTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.WRITER_GROUP_DATA_TYPE__KEEP_ALIVE_TIME, oldKeepAliveTime, KEEP_ALIVE_TIME_EDEFAULT, oldKeepAliveTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKeepAliveTime() {
		return keepAliveTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(short newPriority) {
		short oldPriority = priority;
		priority = newPriority;
		boolean oldPriorityESet = priorityESet;
		priorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.WRITER_GROUP_DATA_TYPE__PRIORITY, oldPriority, priority, !oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriority() {
		short oldPriority = priority;
		boolean oldPriorityESet = priorityESet;
		priority = PRIORITY_EDEFAULT;
		priorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.WRITER_GROUP_DATA_TYPE__PRIORITY, oldPriority, PRIORITY_EDEFAULT, oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriority() {
		return priorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfString getLocaleIds() {
		return localeIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocaleIds(ListOfString newLocaleIds, NotificationChain msgs) {
		ListOfString oldLocaleIds = localeIds;
		localeIds = newLocaleIds;
		boolean oldLocaleIdsESet = localeIdsESet;
		localeIdsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.WRITER_GROUP_DATA_TYPE__LOCALE_IDS, oldLocaleIds, newLocaleIds, !oldLocaleIdsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocaleIds(ListOfString newLocaleIds) {
		if (newLocaleIds != localeIds) {
			NotificationChain msgs = null;
			if (localeIds != null)
				msgs = ((InternalEObject)localeIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.WRITER_GROUP_DATA_TYPE__LOCALE_IDS, null, msgs);
			if (newLocaleIds != null)
				msgs = ((InternalEObject)newLocaleIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.WRITER_GROUP_DATA_TYPE__LOCALE_IDS, null, msgs);
			msgs = basicSetLocaleIds(newLocaleIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLocaleIdsESet = localeIdsESet;
			localeIdsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.WRITER_GROUP_DATA_TYPE__LOCALE_IDS, newLocaleIds, newLocaleIds, !oldLocaleIdsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetLocaleIds(NotificationChain msgs) {
		ListOfString oldLocaleIds = localeIds;
		localeIds = null;
		boolean oldLocaleIdsESet = localeIdsESet;
		localeIdsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.WRITER_GROUP_DATA_TYPE__LOCALE_IDS, oldLocaleIds, null, oldLocaleIdsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocaleIds() {
		if (localeIds != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)localeIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.WRITER_GROUP_DATA_TYPE__LOCALE_IDS, null, msgs);
			msgs = basicUnsetLocaleIds(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLocaleIdsESet = localeIdsESet;
			localeIdsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.WRITER_GROUP_DATA_TYPE__LOCALE_IDS, null, null, oldLocaleIdsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocaleIds() {
		return localeIdsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.WRITER_GROUP_DATA_TYPE__HEADER_LAYOUT_URI, oldHeaderLayoutUri, headerLayoutUri, !oldHeaderLayoutUriESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.WRITER_GROUP_DATA_TYPE__HEADER_LAYOUT_URI, oldHeaderLayoutUri, HEADER_LAYOUT_URI_EDEFAULT, oldHeaderLayoutUriESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.WRITER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS, oldTransportSettings, newTransportSettings, !oldTransportSettingsESet);
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
				msgs = ((InternalEObject)transportSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.WRITER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS, null, msgs);
			if (newTransportSettings != null)
				msgs = ((InternalEObject)newTransportSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.WRITER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS, null, msgs);
			msgs = basicSetTransportSettings(newTransportSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTransportSettingsESet = transportSettingsESet;
			transportSettingsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.WRITER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS, newTransportSettings, newTransportSettings, !oldTransportSettingsESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.WRITER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS, oldTransportSettings, null, oldTransportSettingsESet);
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
			msgs = ((InternalEObject)transportSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.WRITER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS, null, msgs);
			msgs = basicUnsetTransportSettings(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTransportSettingsESet = transportSettingsESet;
			transportSettingsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.WRITER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS, null, null, oldTransportSettingsESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.WRITER_GROUP_DATA_TYPE__MESSAGE_SETTINGS, oldMessageSettings, newMessageSettings, !oldMessageSettingsESet);
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
				msgs = ((InternalEObject)messageSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.WRITER_GROUP_DATA_TYPE__MESSAGE_SETTINGS, null, msgs);
			if (newMessageSettings != null)
				msgs = ((InternalEObject)newMessageSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.WRITER_GROUP_DATA_TYPE__MESSAGE_SETTINGS, null, msgs);
			msgs = basicSetMessageSettings(newMessageSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMessageSettingsESet = messageSettingsESet;
			messageSettingsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.WRITER_GROUP_DATA_TYPE__MESSAGE_SETTINGS, newMessageSettings, newMessageSettings, !oldMessageSettingsESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.WRITER_GROUP_DATA_TYPE__MESSAGE_SETTINGS, oldMessageSettings, null, oldMessageSettingsESet);
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
			msgs = ((InternalEObject)messageSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.WRITER_GROUP_DATA_TYPE__MESSAGE_SETTINGS, null, msgs);
			msgs = basicUnsetMessageSettings(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMessageSettingsESet = messageSettingsESet;
			messageSettingsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.WRITER_GROUP_DATA_TYPE__MESSAGE_SETTINGS, null, null, oldMessageSettingsESet));
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
	public ListOfDataSetWriterDataType getDataSetWriters() {
		return dataSetWriters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetWriters(ListOfDataSetWriterDataType newDataSetWriters, NotificationChain msgs) {
		ListOfDataSetWriterDataType oldDataSetWriters = dataSetWriters;
		dataSetWriters = newDataSetWriters;
		boolean oldDataSetWritersESet = dataSetWritersESet;
		dataSetWritersESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.WRITER_GROUP_DATA_TYPE__DATA_SET_WRITERS, oldDataSetWriters, newDataSetWriters, !oldDataSetWritersESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetWriters(ListOfDataSetWriterDataType newDataSetWriters) {
		if (newDataSetWriters != dataSetWriters) {
			NotificationChain msgs = null;
			if (dataSetWriters != null)
				msgs = ((InternalEObject)dataSetWriters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.WRITER_GROUP_DATA_TYPE__DATA_SET_WRITERS, null, msgs);
			if (newDataSetWriters != null)
				msgs = ((InternalEObject)newDataSetWriters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.WRITER_GROUP_DATA_TYPE__DATA_SET_WRITERS, null, msgs);
			msgs = basicSetDataSetWriters(newDataSetWriters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataSetWritersESet = dataSetWritersESet;
			dataSetWritersESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.WRITER_GROUP_DATA_TYPE__DATA_SET_WRITERS, newDataSetWriters, newDataSetWriters, !oldDataSetWritersESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDataSetWriters(NotificationChain msgs) {
		ListOfDataSetWriterDataType oldDataSetWriters = dataSetWriters;
		dataSetWriters = null;
		boolean oldDataSetWritersESet = dataSetWritersESet;
		dataSetWritersESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.WRITER_GROUP_DATA_TYPE__DATA_SET_WRITERS, oldDataSetWriters, null, oldDataSetWritersESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSetWriters() {
		if (dataSetWriters != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dataSetWriters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.WRITER_GROUP_DATA_TYPE__DATA_SET_WRITERS, null, msgs);
			msgs = basicUnsetDataSetWriters(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataSetWritersESet = dataSetWritersESet;
			dataSetWritersESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.WRITER_GROUP_DATA_TYPE__DATA_SET_WRITERS, null, null, oldDataSetWritersESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSetWriters() {
		return dataSetWritersESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.WRITER_GROUP_DATA_TYPE__LOCALE_IDS:
				return basicUnsetLocaleIds(msgs);
			case TypesPackage.WRITER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS:
				return basicUnsetTransportSettings(msgs);
			case TypesPackage.WRITER_GROUP_DATA_TYPE__MESSAGE_SETTINGS:
				return basicUnsetMessageSettings(msgs);
			case TypesPackage.WRITER_GROUP_DATA_TYPE__DATA_SET_WRITERS:
				return basicUnsetDataSetWriters(msgs);
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
			case TypesPackage.WRITER_GROUP_DATA_TYPE__WRITER_GROUP_ID:
				return getWriterGroupId();
			case TypesPackage.WRITER_GROUP_DATA_TYPE__PUBLISHING_INTERVAL:
				return getPublishingInterval();
			case TypesPackage.WRITER_GROUP_DATA_TYPE__KEEP_ALIVE_TIME:
				return getKeepAliveTime();
			case TypesPackage.WRITER_GROUP_DATA_TYPE__PRIORITY:
				return getPriority();
			case TypesPackage.WRITER_GROUP_DATA_TYPE__LOCALE_IDS:
				return getLocaleIds();
			case TypesPackage.WRITER_GROUP_DATA_TYPE__HEADER_LAYOUT_URI:
				return getHeaderLayoutUri();
			case TypesPackage.WRITER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS:
				return getTransportSettings();
			case TypesPackage.WRITER_GROUP_DATA_TYPE__MESSAGE_SETTINGS:
				return getMessageSettings();
			case TypesPackage.WRITER_GROUP_DATA_TYPE__DATA_SET_WRITERS:
				return getDataSetWriters();
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
			case TypesPackage.WRITER_GROUP_DATA_TYPE__WRITER_GROUP_ID:
				setWriterGroupId((Integer)newValue);
				return;
			case TypesPackage.WRITER_GROUP_DATA_TYPE__PUBLISHING_INTERVAL:
				setPublishingInterval((Double)newValue);
				return;
			case TypesPackage.WRITER_GROUP_DATA_TYPE__KEEP_ALIVE_TIME:
				setKeepAliveTime((Double)newValue);
				return;
			case TypesPackage.WRITER_GROUP_DATA_TYPE__PRIORITY:
				setPriority((Short)newValue);
				return;
			case TypesPackage.WRITER_GROUP_DATA_TYPE__LOCALE_IDS:
				setLocaleIds((ListOfString)newValue);
				return;
			case TypesPackage.WRITER_GROUP_DATA_TYPE__HEADER_LAYOUT_URI:
				setHeaderLayoutUri((String)newValue);
				return;
			case TypesPackage.WRITER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS:
				setTransportSettings((ExtensionObject)newValue);
				return;
			case TypesPackage.WRITER_GROUP_DATA_TYPE__MESSAGE_SETTINGS:
				setMessageSettings((ExtensionObject)newValue);
				return;
			case TypesPackage.WRITER_GROUP_DATA_TYPE__DATA_SET_WRITERS:
				setDataSetWriters((ListOfDataSetWriterDataType)newValue);
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
			case TypesPackage.WRITER_GROUP_DATA_TYPE__WRITER_GROUP_ID:
				unsetWriterGroupId();
				return;
			case TypesPackage.WRITER_GROUP_DATA_TYPE__PUBLISHING_INTERVAL:
				unsetPublishingInterval();
				return;
			case TypesPackage.WRITER_GROUP_DATA_TYPE__KEEP_ALIVE_TIME:
				unsetKeepAliveTime();
				return;
			case TypesPackage.WRITER_GROUP_DATA_TYPE__PRIORITY:
				unsetPriority();
				return;
			case TypesPackage.WRITER_GROUP_DATA_TYPE__LOCALE_IDS:
				unsetLocaleIds();
				return;
			case TypesPackage.WRITER_GROUP_DATA_TYPE__HEADER_LAYOUT_URI:
				unsetHeaderLayoutUri();
				return;
			case TypesPackage.WRITER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS:
				unsetTransportSettings();
				return;
			case TypesPackage.WRITER_GROUP_DATA_TYPE__MESSAGE_SETTINGS:
				unsetMessageSettings();
				return;
			case TypesPackage.WRITER_GROUP_DATA_TYPE__DATA_SET_WRITERS:
				unsetDataSetWriters();
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
			case TypesPackage.WRITER_GROUP_DATA_TYPE__WRITER_GROUP_ID:
				return isSetWriterGroupId();
			case TypesPackage.WRITER_GROUP_DATA_TYPE__PUBLISHING_INTERVAL:
				return isSetPublishingInterval();
			case TypesPackage.WRITER_GROUP_DATA_TYPE__KEEP_ALIVE_TIME:
				return isSetKeepAliveTime();
			case TypesPackage.WRITER_GROUP_DATA_TYPE__PRIORITY:
				return isSetPriority();
			case TypesPackage.WRITER_GROUP_DATA_TYPE__LOCALE_IDS:
				return isSetLocaleIds();
			case TypesPackage.WRITER_GROUP_DATA_TYPE__HEADER_LAYOUT_URI:
				return isSetHeaderLayoutUri();
			case TypesPackage.WRITER_GROUP_DATA_TYPE__TRANSPORT_SETTINGS:
				return isSetTransportSettings();
			case TypesPackage.WRITER_GROUP_DATA_TYPE__MESSAGE_SETTINGS:
				return isSetMessageSettings();
			case TypesPackage.WRITER_GROUP_DATA_TYPE__DATA_SET_WRITERS:
				return isSetDataSetWriters();
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
		result.append(" (writerGroupId: ");
		if (writerGroupIdESet) result.append(writerGroupId); else result.append("<unset>");
		result.append(", publishingInterval: ");
		if (publishingIntervalESet) result.append(publishingInterval); else result.append("<unset>");
		result.append(", keepAliveTime: ");
		if (keepAliveTimeESet) result.append(keepAliveTime); else result.append("<unset>");
		result.append(", priority: ");
		if (priorityESet) result.append(priority); else result.append("<unset>");
		result.append(", headerLayoutUri: ");
		if (headerLayoutUriESet) result.append(headerLayoutUri); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //WriterGroupDataTypeImpl
