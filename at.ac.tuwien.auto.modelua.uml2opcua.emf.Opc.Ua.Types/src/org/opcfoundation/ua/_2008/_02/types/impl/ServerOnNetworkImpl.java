/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfString;
import org.opcfoundation.ua._2008._02.types.ServerOnNetwork;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server On Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerOnNetworkImpl#getRecordId <em>Record Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerOnNetworkImpl#getServerName <em>Server Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerOnNetworkImpl#getDiscoveryUrl <em>Discovery Url</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ServerOnNetworkImpl#getServerCapabilities <em>Server Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerOnNetworkImpl extends MinimalEObjectImpl.Container implements ServerOnNetwork {
	/**
	 * The default value of the '{@link #getRecordId() <em>Record Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordId()
	 * @generated
	 * @ordered
	 */
	protected static final long RECORD_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRecordId() <em>Record Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordId()
	 * @generated
	 * @ordered
	 */
	protected long recordId = RECORD_ID_EDEFAULT;

	/**
	 * This is true if the Record Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean recordIdESet;

	/**
	 * The default value of the '{@link #getServerName() <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerName() <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerName()
	 * @generated
	 * @ordered
	 */
	protected String serverName = SERVER_NAME_EDEFAULT;

	/**
	 * This is true if the Server Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverNameESet;

	/**
	 * The default value of the '{@link #getDiscoveryUrl() <em>Discovery Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCOVERY_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscoveryUrl() <em>Discovery Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryUrl()
	 * @generated
	 * @ordered
	 */
	protected String discoveryUrl = DISCOVERY_URL_EDEFAULT;

	/**
	 * This is true if the Discovery Url attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean discoveryUrlESet;

	/**
	 * The cached value of the '{@link #getServerCapabilities() <em>Server Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerCapabilities()
	 * @generated
	 * @ordered
	 */
	protected ListOfString serverCapabilities;

	/**
	 * This is true if the Server Capabilities containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverCapabilitiesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerOnNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getServerOnNetwork();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRecordId() {
		return recordId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordId(long newRecordId) {
		long oldRecordId = recordId;
		recordId = newRecordId;
		boolean oldRecordIdESet = recordIdESet;
		recordIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_ON_NETWORK__RECORD_ID, oldRecordId, recordId, !oldRecordIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRecordId() {
		long oldRecordId = recordId;
		boolean oldRecordIdESet = recordIdESet;
		recordId = RECORD_ID_EDEFAULT;
		recordIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_ON_NETWORK__RECORD_ID, oldRecordId, RECORD_ID_EDEFAULT, oldRecordIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRecordId() {
		return recordIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerName() {
		return serverName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerName(String newServerName) {
		String oldServerName = serverName;
		serverName = newServerName;
		boolean oldServerNameESet = serverNameESet;
		serverNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_ON_NETWORK__SERVER_NAME, oldServerName, serverName, !oldServerNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerName() {
		String oldServerName = serverName;
		boolean oldServerNameESet = serverNameESet;
		serverName = SERVER_NAME_EDEFAULT;
		serverNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_ON_NETWORK__SERVER_NAME, oldServerName, SERVER_NAME_EDEFAULT, oldServerNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerName() {
		return serverNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscoveryUrl() {
		return discoveryUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoveryUrl(String newDiscoveryUrl) {
		String oldDiscoveryUrl = discoveryUrl;
		discoveryUrl = newDiscoveryUrl;
		boolean oldDiscoveryUrlESet = discoveryUrlESet;
		discoveryUrlESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_ON_NETWORK__DISCOVERY_URL, oldDiscoveryUrl, discoveryUrl, !oldDiscoveryUrlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDiscoveryUrl() {
		String oldDiscoveryUrl = discoveryUrl;
		boolean oldDiscoveryUrlESet = discoveryUrlESet;
		discoveryUrl = DISCOVERY_URL_EDEFAULT;
		discoveryUrlESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_ON_NETWORK__DISCOVERY_URL, oldDiscoveryUrl, DISCOVERY_URL_EDEFAULT, oldDiscoveryUrlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiscoveryUrl() {
		return discoveryUrlESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfString getServerCapabilities() {
		return serverCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerCapabilities(ListOfString newServerCapabilities, NotificationChain msgs) {
		ListOfString oldServerCapabilities = serverCapabilities;
		serverCapabilities = newServerCapabilities;
		boolean oldServerCapabilitiesESet = serverCapabilitiesESet;
		serverCapabilitiesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_ON_NETWORK__SERVER_CAPABILITIES, oldServerCapabilities, newServerCapabilities, !oldServerCapabilitiesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerCapabilities(ListOfString newServerCapabilities) {
		if (newServerCapabilities != serverCapabilities) {
			NotificationChain msgs = null;
			if (serverCapabilities != null)
				msgs = ((InternalEObject)serverCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SERVER_ON_NETWORK__SERVER_CAPABILITIES, null, msgs);
			if (newServerCapabilities != null)
				msgs = ((InternalEObject)newServerCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SERVER_ON_NETWORK__SERVER_CAPABILITIES, null, msgs);
			msgs = basicSetServerCapabilities(newServerCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerCapabilitiesESet = serverCapabilitiesESet;
			serverCapabilitiesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SERVER_ON_NETWORK__SERVER_CAPABILITIES, newServerCapabilities, newServerCapabilities, !oldServerCapabilitiesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetServerCapabilities(NotificationChain msgs) {
		ListOfString oldServerCapabilities = serverCapabilities;
		serverCapabilities = null;
		boolean oldServerCapabilitiesESet = serverCapabilitiesESet;
		serverCapabilitiesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_ON_NETWORK__SERVER_CAPABILITIES, oldServerCapabilities, null, oldServerCapabilitiesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerCapabilities() {
		if (serverCapabilities != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)serverCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SERVER_ON_NETWORK__SERVER_CAPABILITIES, null, msgs);
			msgs = basicUnsetServerCapabilities(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerCapabilitiesESet = serverCapabilitiesESet;
			serverCapabilitiesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SERVER_ON_NETWORK__SERVER_CAPABILITIES, null, null, oldServerCapabilitiesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerCapabilities() {
		return serverCapabilitiesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.SERVER_ON_NETWORK__SERVER_CAPABILITIES:
				return basicUnsetServerCapabilities(msgs);
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
			case TypesPackage.SERVER_ON_NETWORK__RECORD_ID:
				return getRecordId();
			case TypesPackage.SERVER_ON_NETWORK__SERVER_NAME:
				return getServerName();
			case TypesPackage.SERVER_ON_NETWORK__DISCOVERY_URL:
				return getDiscoveryUrl();
			case TypesPackage.SERVER_ON_NETWORK__SERVER_CAPABILITIES:
				return getServerCapabilities();
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
			case TypesPackage.SERVER_ON_NETWORK__RECORD_ID:
				setRecordId((Long)newValue);
				return;
			case TypesPackage.SERVER_ON_NETWORK__SERVER_NAME:
				setServerName((String)newValue);
				return;
			case TypesPackage.SERVER_ON_NETWORK__DISCOVERY_URL:
				setDiscoveryUrl((String)newValue);
				return;
			case TypesPackage.SERVER_ON_NETWORK__SERVER_CAPABILITIES:
				setServerCapabilities((ListOfString)newValue);
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
			case TypesPackage.SERVER_ON_NETWORK__RECORD_ID:
				unsetRecordId();
				return;
			case TypesPackage.SERVER_ON_NETWORK__SERVER_NAME:
				unsetServerName();
				return;
			case TypesPackage.SERVER_ON_NETWORK__DISCOVERY_URL:
				unsetDiscoveryUrl();
				return;
			case TypesPackage.SERVER_ON_NETWORK__SERVER_CAPABILITIES:
				unsetServerCapabilities();
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
			case TypesPackage.SERVER_ON_NETWORK__RECORD_ID:
				return isSetRecordId();
			case TypesPackage.SERVER_ON_NETWORK__SERVER_NAME:
				return isSetServerName();
			case TypesPackage.SERVER_ON_NETWORK__DISCOVERY_URL:
				return isSetDiscoveryUrl();
			case TypesPackage.SERVER_ON_NETWORK__SERVER_CAPABILITIES:
				return isSetServerCapabilities();
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
		result.append(" (recordId: ");
		if (recordIdESet) result.append(recordId); else result.append("<unset>");
		result.append(", serverName: ");
		if (serverNameESet) result.append(serverName); else result.append("<unset>");
		result.append(", discoveryUrl: ");
		if (discoveryUrlESet) result.append(discoveryUrl); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ServerOnNetworkImpl
