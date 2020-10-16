/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ExtensionObject;
import org.opcfoundation.ua._2008._02.types.ListOfKeyValuePair;
import org.opcfoundation.ua._2008._02.types.ListOfReaderGroupDataType;
import org.opcfoundation.ua._2008._02.types.ListOfWriterGroupDataType;
import org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;
import org.opcfoundation.ua._2008._02.types.Variant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pub Sub Connection Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubConnectionDataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubConnectionDataTypeImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubConnectionDataTypeImpl#getPublisherId <em>Publisher Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubConnectionDataTypeImpl#getTransportProfileUri <em>Transport Profile Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubConnectionDataTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubConnectionDataTypeImpl#getConnectionProperties <em>Connection Properties</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubConnectionDataTypeImpl#getTransportSettings <em>Transport Settings</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubConnectionDataTypeImpl#getWriterGroups <em>Writer Groups</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubConnectionDataTypeImpl#getReaderGroups <em>Reader Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PubSubConnectionDataTypeImpl extends MinimalEObjectImpl.Container implements PubSubConnectionDataType {
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
	 * The default value of the '{@link #getTransportProfileUri() <em>Transport Profile Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportProfileUri()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSPORT_PROFILE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransportProfileUri() <em>Transport Profile Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportProfileUri()
	 * @generated
	 * @ordered
	 */
	protected String transportProfileUri = TRANSPORT_PROFILE_URI_EDEFAULT;

	/**
	 * This is true if the Transport Profile Uri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportProfileUriESet;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected ExtensionObject address;

	/**
	 * This is true if the Address containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean addressESet;

	/**
	 * The cached value of the '{@link #getConnectionProperties() <em>Connection Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionProperties()
	 * @generated
	 * @ordered
	 */
	protected ListOfKeyValuePair connectionProperties;

	/**
	 * This is true if the Connection Properties containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectionPropertiesESet;

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
	 * The cached value of the '{@link #getWriterGroups() <em>Writer Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriterGroups()
	 * @generated
	 * @ordered
	 */
	protected ListOfWriterGroupDataType writerGroups;

	/**
	 * This is true if the Writer Groups containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean writerGroupsESet;

	/**
	 * The cached value of the '{@link #getReaderGroups() <em>Reader Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaderGroups()
	 * @generated
	 * @ordered
	 */
	protected ListOfReaderGroupDataType readerGroups;

	/**
	 * This is true if the Reader Groups containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean readerGroupsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PubSubConnectionDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getPubSubConnectionDataType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__ENABLED, oldEnabled, enabled, !oldEnabledESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__PUBLISHER_ID, oldPublisherId, newPublisherId);
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
				msgs = ((InternalEObject)publisherId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__PUBLISHER_ID, null, msgs);
			if (newPublisherId != null)
				msgs = ((InternalEObject)newPublisherId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__PUBLISHER_ID, null, msgs);
			msgs = basicSetPublisherId(newPublisherId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__PUBLISHER_ID, newPublisherId, newPublisherId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransportProfileUri() {
		return transportProfileUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportProfileUri(String newTransportProfileUri) {
		String oldTransportProfileUri = transportProfileUri;
		transportProfileUri = newTransportProfileUri;
		boolean oldTransportProfileUriESet = transportProfileUriESet;
		transportProfileUriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__TRANSPORT_PROFILE_URI, oldTransportProfileUri, transportProfileUri, !oldTransportProfileUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransportProfileUri() {
		String oldTransportProfileUri = transportProfileUri;
		boolean oldTransportProfileUriESet = transportProfileUriESet;
		transportProfileUri = TRANSPORT_PROFILE_URI_EDEFAULT;
		transportProfileUriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__TRANSPORT_PROFILE_URI, oldTransportProfileUri, TRANSPORT_PROFILE_URI_EDEFAULT, oldTransportProfileUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransportProfileUri() {
		return transportProfileUriESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionObject getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(ExtensionObject newAddress, NotificationChain msgs) {
		ExtensionObject oldAddress = address;
		address = newAddress;
		boolean oldAddressESet = addressESet;
		addressESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__ADDRESS, oldAddress, newAddress, !oldAddressESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(ExtensionObject newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAddressESet = addressESet;
			addressESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__ADDRESS, newAddress, newAddress, !oldAddressESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAddress(NotificationChain msgs) {
		ExtensionObject oldAddress = address;
		address = null;
		boolean oldAddressESet = addressESet;
		addressESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__ADDRESS, oldAddress, null, oldAddressESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAddress() {
		if (address != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__ADDRESS, null, msgs);
			msgs = basicUnsetAddress(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAddressESet = addressESet;
			addressESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__ADDRESS, null, null, oldAddressESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAddress() {
		return addressESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfKeyValuePair getConnectionProperties() {
		return connectionProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionProperties(ListOfKeyValuePair newConnectionProperties, NotificationChain msgs) {
		ListOfKeyValuePair oldConnectionProperties = connectionProperties;
		connectionProperties = newConnectionProperties;
		boolean oldConnectionPropertiesESet = connectionPropertiesESet;
		connectionPropertiesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__CONNECTION_PROPERTIES, oldConnectionProperties, newConnectionProperties, !oldConnectionPropertiesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionProperties(ListOfKeyValuePair newConnectionProperties) {
		if (newConnectionProperties != connectionProperties) {
			NotificationChain msgs = null;
			if (connectionProperties != null)
				msgs = ((InternalEObject)connectionProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__CONNECTION_PROPERTIES, null, msgs);
			if (newConnectionProperties != null)
				msgs = ((InternalEObject)newConnectionProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__CONNECTION_PROPERTIES, null, msgs);
			msgs = basicSetConnectionProperties(newConnectionProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConnectionPropertiesESet = connectionPropertiesESet;
			connectionPropertiesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__CONNECTION_PROPERTIES, newConnectionProperties, newConnectionProperties, !oldConnectionPropertiesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetConnectionProperties(NotificationChain msgs) {
		ListOfKeyValuePair oldConnectionProperties = connectionProperties;
		connectionProperties = null;
		boolean oldConnectionPropertiesESet = connectionPropertiesESet;
		connectionPropertiesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__CONNECTION_PROPERTIES, oldConnectionProperties, null, oldConnectionPropertiesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectionProperties() {
		if (connectionProperties != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)connectionProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__CONNECTION_PROPERTIES, null, msgs);
			msgs = basicUnsetConnectionProperties(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConnectionPropertiesESet = connectionPropertiesESet;
			connectionPropertiesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__CONNECTION_PROPERTIES, null, null, oldConnectionPropertiesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectionProperties() {
		return connectionPropertiesESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__TRANSPORT_SETTINGS, oldTransportSettings, newTransportSettings, !oldTransportSettingsESet);
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
				msgs = ((InternalEObject)transportSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__TRANSPORT_SETTINGS, null, msgs);
			if (newTransportSettings != null)
				msgs = ((InternalEObject)newTransportSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__TRANSPORT_SETTINGS, null, msgs);
			msgs = basicSetTransportSettings(newTransportSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTransportSettingsESet = transportSettingsESet;
			transportSettingsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__TRANSPORT_SETTINGS, newTransportSettings, newTransportSettings, !oldTransportSettingsESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__TRANSPORT_SETTINGS, oldTransportSettings, null, oldTransportSettingsESet);
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
			msgs = ((InternalEObject)transportSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__TRANSPORT_SETTINGS, null, msgs);
			msgs = basicUnsetTransportSettings(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTransportSettingsESet = transportSettingsESet;
			transportSettingsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__TRANSPORT_SETTINGS, null, null, oldTransportSettingsESet));
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
	public ListOfWriterGroupDataType getWriterGroups() {
		return writerGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriterGroups(ListOfWriterGroupDataType newWriterGroups, NotificationChain msgs) {
		ListOfWriterGroupDataType oldWriterGroups = writerGroups;
		writerGroups = newWriterGroups;
		boolean oldWriterGroupsESet = writerGroupsESet;
		writerGroupsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__WRITER_GROUPS, oldWriterGroups, newWriterGroups, !oldWriterGroupsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriterGroups(ListOfWriterGroupDataType newWriterGroups) {
		if (newWriterGroups != writerGroups) {
			NotificationChain msgs = null;
			if (writerGroups != null)
				msgs = ((InternalEObject)writerGroups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__WRITER_GROUPS, null, msgs);
			if (newWriterGroups != null)
				msgs = ((InternalEObject)newWriterGroups).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__WRITER_GROUPS, null, msgs);
			msgs = basicSetWriterGroups(newWriterGroups, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldWriterGroupsESet = writerGroupsESet;
			writerGroupsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__WRITER_GROUPS, newWriterGroups, newWriterGroups, !oldWriterGroupsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetWriterGroups(NotificationChain msgs) {
		ListOfWriterGroupDataType oldWriterGroups = writerGroups;
		writerGroups = null;
		boolean oldWriterGroupsESet = writerGroupsESet;
		writerGroupsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__WRITER_GROUPS, oldWriterGroups, null, oldWriterGroupsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWriterGroups() {
		if (writerGroups != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)writerGroups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__WRITER_GROUPS, null, msgs);
			msgs = basicUnsetWriterGroups(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldWriterGroupsESet = writerGroupsESet;
			writerGroupsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__WRITER_GROUPS, null, null, oldWriterGroupsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWriterGroups() {
		return writerGroupsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfReaderGroupDataType getReaderGroups() {
		return readerGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReaderGroups(ListOfReaderGroupDataType newReaderGroups, NotificationChain msgs) {
		ListOfReaderGroupDataType oldReaderGroups = readerGroups;
		readerGroups = newReaderGroups;
		boolean oldReaderGroupsESet = readerGroupsESet;
		readerGroupsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__READER_GROUPS, oldReaderGroups, newReaderGroups, !oldReaderGroupsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReaderGroups(ListOfReaderGroupDataType newReaderGroups) {
		if (newReaderGroups != readerGroups) {
			NotificationChain msgs = null;
			if (readerGroups != null)
				msgs = ((InternalEObject)readerGroups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__READER_GROUPS, null, msgs);
			if (newReaderGroups != null)
				msgs = ((InternalEObject)newReaderGroups).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__READER_GROUPS, null, msgs);
			msgs = basicSetReaderGroups(newReaderGroups, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReaderGroupsESet = readerGroupsESet;
			readerGroupsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__READER_GROUPS, newReaderGroups, newReaderGroups, !oldReaderGroupsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetReaderGroups(NotificationChain msgs) {
		ListOfReaderGroupDataType oldReaderGroups = readerGroups;
		readerGroups = null;
		boolean oldReaderGroupsESet = readerGroupsESet;
		readerGroupsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__READER_GROUPS, oldReaderGroups, null, oldReaderGroupsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReaderGroups() {
		if (readerGroups != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)readerGroups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__READER_GROUPS, null, msgs);
			msgs = basicUnsetReaderGroups(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReaderGroupsESet = readerGroupsESet;
			readerGroupsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__READER_GROUPS, null, null, oldReaderGroupsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReaderGroups() {
		return readerGroupsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__PUBLISHER_ID:
				return basicSetPublisherId(null, msgs);
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__ADDRESS:
				return basicUnsetAddress(msgs);
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__CONNECTION_PROPERTIES:
				return basicUnsetConnectionProperties(msgs);
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__TRANSPORT_SETTINGS:
				return basicUnsetTransportSettings(msgs);
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__WRITER_GROUPS:
				return basicUnsetWriterGroups(msgs);
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__READER_GROUPS:
				return basicUnsetReaderGroups(msgs);
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
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__NAME:
				return getName();
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__ENABLED:
				return isEnabled();
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__PUBLISHER_ID:
				return getPublisherId();
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__TRANSPORT_PROFILE_URI:
				return getTransportProfileUri();
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__ADDRESS:
				return getAddress();
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__CONNECTION_PROPERTIES:
				return getConnectionProperties();
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__TRANSPORT_SETTINGS:
				return getTransportSettings();
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__WRITER_GROUPS:
				return getWriterGroups();
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__READER_GROUPS:
				return getReaderGroups();
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
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__PUBLISHER_ID:
				setPublisherId((Variant)newValue);
				return;
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__TRANSPORT_PROFILE_URI:
				setTransportProfileUri((String)newValue);
				return;
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__ADDRESS:
				setAddress((ExtensionObject)newValue);
				return;
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__CONNECTION_PROPERTIES:
				setConnectionProperties((ListOfKeyValuePair)newValue);
				return;
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__TRANSPORT_SETTINGS:
				setTransportSettings((ExtensionObject)newValue);
				return;
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__WRITER_GROUPS:
				setWriterGroups((ListOfWriterGroupDataType)newValue);
				return;
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__READER_GROUPS:
				setReaderGroups((ListOfReaderGroupDataType)newValue);
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
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__NAME:
				unsetName();
				return;
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__ENABLED:
				unsetEnabled();
				return;
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__PUBLISHER_ID:
				setPublisherId((Variant)null);
				return;
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__TRANSPORT_PROFILE_URI:
				unsetTransportProfileUri();
				return;
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__ADDRESS:
				unsetAddress();
				return;
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__CONNECTION_PROPERTIES:
				unsetConnectionProperties();
				return;
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__TRANSPORT_SETTINGS:
				unsetTransportSettings();
				return;
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__WRITER_GROUPS:
				unsetWriterGroups();
				return;
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__READER_GROUPS:
				unsetReaderGroups();
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
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__NAME:
				return isSetName();
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__ENABLED:
				return isSetEnabled();
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__PUBLISHER_ID:
				return publisherId != null;
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__TRANSPORT_PROFILE_URI:
				return isSetTransportProfileUri();
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__ADDRESS:
				return isSetAddress();
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__CONNECTION_PROPERTIES:
				return isSetConnectionProperties();
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__TRANSPORT_SETTINGS:
				return isSetTransportSettings();
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__WRITER_GROUPS:
				return isSetWriterGroups();
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE__READER_GROUPS:
				return isSetReaderGroups();
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
		result.append(", transportProfileUri: ");
		if (transportProfileUriESet) result.append(transportProfileUri); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PubSubConnectionDataTypeImpl
