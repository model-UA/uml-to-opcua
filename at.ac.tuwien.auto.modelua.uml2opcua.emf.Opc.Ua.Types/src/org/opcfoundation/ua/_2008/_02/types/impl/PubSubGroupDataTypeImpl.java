/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfEndpointDescription;
import org.opcfoundation.ua._2008._02.types.ListOfKeyValuePair;
import org.opcfoundation.ua._2008._02.types.MessageSecurityMode;
import org.opcfoundation.ua._2008._02.types.PubSubGroupDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pub Sub Group Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubGroupDataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubGroupDataTypeImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubGroupDataTypeImpl#getSecurityMode <em>Security Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubGroupDataTypeImpl#getSecurityGroupId <em>Security Group Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubGroupDataTypeImpl#getSecurityKeyServices <em>Security Key Services</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubGroupDataTypeImpl#getMaxNetworkMessageSize <em>Max Network Message Size</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PubSubGroupDataTypeImpl#getGroupProperties <em>Group Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PubSubGroupDataTypeImpl extends MinimalEObjectImpl.Container implements PubSubGroupDataType {
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
	 * The default value of the '{@link #getMaxNetworkMessageSize() <em>Max Network Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNetworkMessageSize()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_NETWORK_MESSAGE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxNetworkMessageSize() <em>Max Network Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNetworkMessageSize()
	 * @generated
	 * @ordered
	 */
	protected long maxNetworkMessageSize = MAX_NETWORK_MESSAGE_SIZE_EDEFAULT;

	/**
	 * This is true if the Max Network Message Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxNetworkMessageSizeESet;

	/**
	 * The cached value of the '{@link #getGroupProperties() <em>Group Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupProperties()
	 * @generated
	 * @ordered
	 */
	protected ListOfKeyValuePair groupProperties;

	/**
	 * This is true if the Group Properties containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groupPropertiesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PubSubGroupDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getPubSubGroupDataType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_GROUP_DATA_TYPE__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_GROUP_DATA_TYPE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_GROUP_DATA_TYPE__ENABLED, oldEnabled, enabled, !oldEnabledESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_GROUP_DATA_TYPE__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_MODE, oldSecurityMode, securityMode, !oldSecurityModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_MODE, oldSecurityMode, SECURITY_MODE_EDEFAULT, oldSecurityModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_GROUP_ID, oldSecurityGroupId, securityGroupId, !oldSecurityGroupIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_GROUP_ID, oldSecurityGroupId, SECURITY_GROUP_ID_EDEFAULT, oldSecurityGroupIdESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_KEY_SERVICES, oldSecurityKeyServices, newSecurityKeyServices, !oldSecurityKeyServicesESet);
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
				msgs = ((InternalEObject)securityKeyServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_KEY_SERVICES, null, msgs);
			if (newSecurityKeyServices != null)
				msgs = ((InternalEObject)newSecurityKeyServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_KEY_SERVICES, null, msgs);
			msgs = basicSetSecurityKeyServices(newSecurityKeyServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSecurityKeyServicesESet = securityKeyServicesESet;
			securityKeyServicesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_KEY_SERVICES, newSecurityKeyServices, newSecurityKeyServices, !oldSecurityKeyServicesESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_KEY_SERVICES, oldSecurityKeyServices, null, oldSecurityKeyServicesESet);
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
			msgs = ((InternalEObject)securityKeyServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_KEY_SERVICES, null, msgs);
			msgs = basicUnsetSecurityKeyServices(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSecurityKeyServicesESet = securityKeyServicesESet;
			securityKeyServicesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_KEY_SERVICES, null, null, oldSecurityKeyServicesESet));
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
	public long getMaxNetworkMessageSize() {
		return maxNetworkMessageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNetworkMessageSize(long newMaxNetworkMessageSize) {
		long oldMaxNetworkMessageSize = maxNetworkMessageSize;
		maxNetworkMessageSize = newMaxNetworkMessageSize;
		boolean oldMaxNetworkMessageSizeESet = maxNetworkMessageSizeESet;
		maxNetworkMessageSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_GROUP_DATA_TYPE__MAX_NETWORK_MESSAGE_SIZE, oldMaxNetworkMessageSize, maxNetworkMessageSize, !oldMaxNetworkMessageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxNetworkMessageSize() {
		long oldMaxNetworkMessageSize = maxNetworkMessageSize;
		boolean oldMaxNetworkMessageSizeESet = maxNetworkMessageSizeESet;
		maxNetworkMessageSize = MAX_NETWORK_MESSAGE_SIZE_EDEFAULT;
		maxNetworkMessageSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_GROUP_DATA_TYPE__MAX_NETWORK_MESSAGE_SIZE, oldMaxNetworkMessageSize, MAX_NETWORK_MESSAGE_SIZE_EDEFAULT, oldMaxNetworkMessageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxNetworkMessageSize() {
		return maxNetworkMessageSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfKeyValuePair getGroupProperties() {
		return groupProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupProperties(ListOfKeyValuePair newGroupProperties, NotificationChain msgs) {
		ListOfKeyValuePair oldGroupProperties = groupProperties;
		groupProperties = newGroupProperties;
		boolean oldGroupPropertiesESet = groupPropertiesESet;
		groupPropertiesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_GROUP_DATA_TYPE__GROUP_PROPERTIES, oldGroupProperties, newGroupProperties, !oldGroupPropertiesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupProperties(ListOfKeyValuePair newGroupProperties) {
		if (newGroupProperties != groupProperties) {
			NotificationChain msgs = null;
			if (groupProperties != null)
				msgs = ((InternalEObject)groupProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_GROUP_DATA_TYPE__GROUP_PROPERTIES, null, msgs);
			if (newGroupProperties != null)
				msgs = ((InternalEObject)newGroupProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_GROUP_DATA_TYPE__GROUP_PROPERTIES, null, msgs);
			msgs = basicSetGroupProperties(newGroupProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGroupPropertiesESet = groupPropertiesESet;
			groupPropertiesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUB_SUB_GROUP_DATA_TYPE__GROUP_PROPERTIES, newGroupProperties, newGroupProperties, !oldGroupPropertiesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetGroupProperties(NotificationChain msgs) {
		ListOfKeyValuePair oldGroupProperties = groupProperties;
		groupProperties = null;
		boolean oldGroupPropertiesESet = groupPropertiesESet;
		groupPropertiesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_GROUP_DATA_TYPE__GROUP_PROPERTIES, oldGroupProperties, null, oldGroupPropertiesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGroupProperties() {
		if (groupProperties != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)groupProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUB_SUB_GROUP_DATA_TYPE__GROUP_PROPERTIES, null, msgs);
			msgs = basicUnsetGroupProperties(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGroupPropertiesESet = groupPropertiesESet;
			groupPropertiesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUB_SUB_GROUP_DATA_TYPE__GROUP_PROPERTIES, null, null, oldGroupPropertiesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGroupProperties() {
		return groupPropertiesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_KEY_SERVICES:
				return basicUnsetSecurityKeyServices(msgs);
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__GROUP_PROPERTIES:
				return basicUnsetGroupProperties(msgs);
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
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__NAME:
				return getName();
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__ENABLED:
				return isEnabled();
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_MODE:
				return getSecurityMode();
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_GROUP_ID:
				return getSecurityGroupId();
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_KEY_SERVICES:
				return getSecurityKeyServices();
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__MAX_NETWORK_MESSAGE_SIZE:
				return getMaxNetworkMessageSize();
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__GROUP_PROPERTIES:
				return getGroupProperties();
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
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_MODE:
				setSecurityMode((MessageSecurityMode)newValue);
				return;
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_GROUP_ID:
				setSecurityGroupId((String)newValue);
				return;
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_KEY_SERVICES:
				setSecurityKeyServices((ListOfEndpointDescription)newValue);
				return;
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__MAX_NETWORK_MESSAGE_SIZE:
				setMaxNetworkMessageSize((Long)newValue);
				return;
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__GROUP_PROPERTIES:
				setGroupProperties((ListOfKeyValuePair)newValue);
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
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__NAME:
				unsetName();
				return;
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__ENABLED:
				unsetEnabled();
				return;
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_MODE:
				unsetSecurityMode();
				return;
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_GROUP_ID:
				unsetSecurityGroupId();
				return;
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_KEY_SERVICES:
				unsetSecurityKeyServices();
				return;
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__MAX_NETWORK_MESSAGE_SIZE:
				unsetMaxNetworkMessageSize();
				return;
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__GROUP_PROPERTIES:
				unsetGroupProperties();
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
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__NAME:
				return isSetName();
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__ENABLED:
				return isSetEnabled();
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_MODE:
				return isSetSecurityMode();
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_GROUP_ID:
				return isSetSecurityGroupId();
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__SECURITY_KEY_SERVICES:
				return isSetSecurityKeyServices();
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__MAX_NETWORK_MESSAGE_SIZE:
				return isSetMaxNetworkMessageSize();
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE__GROUP_PROPERTIES:
				return isSetGroupProperties();
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
		result.append(", securityMode: ");
		if (securityModeESet) result.append(securityMode); else result.append("<unset>");
		result.append(", securityGroupId: ");
		if (securityGroupIdESet) result.append(securityGroupId); else result.append("<unset>");
		result.append(", maxNetworkMessageSize: ");
		if (maxNetworkMessageSizeESet) result.append(maxNetworkMessageSize); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PubSubGroupDataTypeImpl
