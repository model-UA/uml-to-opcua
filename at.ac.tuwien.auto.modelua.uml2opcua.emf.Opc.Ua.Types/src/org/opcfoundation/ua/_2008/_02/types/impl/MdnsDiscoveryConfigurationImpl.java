/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ListOfString;
import org.opcfoundation.ua._2008._02.types.MdnsDiscoveryConfiguration;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mdns Discovery Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.MdnsDiscoveryConfigurationImpl#getMdnsServerName <em>Mdns Server Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.MdnsDiscoveryConfigurationImpl#getServerCapabilities <em>Server Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MdnsDiscoveryConfigurationImpl extends DiscoveryConfigurationImpl implements MdnsDiscoveryConfiguration {
	/**
	 * The default value of the '{@link #getMdnsServerName() <em>Mdns Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdnsServerName()
	 * @generated
	 * @ordered
	 */
	protected static final String MDNS_SERVER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdnsServerName() <em>Mdns Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdnsServerName()
	 * @generated
	 * @ordered
	 */
	protected String mdnsServerName = MDNS_SERVER_NAME_EDEFAULT;

	/**
	 * This is true if the Mdns Server Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mdnsServerNameESet;

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
	protected MdnsDiscoveryConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getMdnsDiscoveryConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMdnsServerName() {
		return mdnsServerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdnsServerName(String newMdnsServerName) {
		String oldMdnsServerName = mdnsServerName;
		mdnsServerName = newMdnsServerName;
		boolean oldMdnsServerNameESet = mdnsServerNameESet;
		mdnsServerNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MDNS_DISCOVERY_CONFIGURATION__MDNS_SERVER_NAME, oldMdnsServerName, mdnsServerName, !oldMdnsServerNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMdnsServerName() {
		String oldMdnsServerName = mdnsServerName;
		boolean oldMdnsServerNameESet = mdnsServerNameESet;
		mdnsServerName = MDNS_SERVER_NAME_EDEFAULT;
		mdnsServerNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MDNS_DISCOVERY_CONFIGURATION__MDNS_SERVER_NAME, oldMdnsServerName, MDNS_SERVER_NAME_EDEFAULT, oldMdnsServerNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMdnsServerName() {
		return mdnsServerNameESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.MDNS_DISCOVERY_CONFIGURATION__SERVER_CAPABILITIES, oldServerCapabilities, newServerCapabilities, !oldServerCapabilitiesESet);
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
				msgs = ((InternalEObject)serverCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MDNS_DISCOVERY_CONFIGURATION__SERVER_CAPABILITIES, null, msgs);
			if (newServerCapabilities != null)
				msgs = ((InternalEObject)newServerCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MDNS_DISCOVERY_CONFIGURATION__SERVER_CAPABILITIES, null, msgs);
			msgs = basicSetServerCapabilities(newServerCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerCapabilitiesESet = serverCapabilitiesESet;
			serverCapabilitiesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MDNS_DISCOVERY_CONFIGURATION__SERVER_CAPABILITIES, newServerCapabilities, newServerCapabilities, !oldServerCapabilitiesESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.MDNS_DISCOVERY_CONFIGURATION__SERVER_CAPABILITIES, oldServerCapabilities, null, oldServerCapabilitiesESet);
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
			msgs = ((InternalEObject)serverCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MDNS_DISCOVERY_CONFIGURATION__SERVER_CAPABILITIES, null, msgs);
			msgs = basicUnsetServerCapabilities(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerCapabilitiesESet = serverCapabilitiesESet;
			serverCapabilitiesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MDNS_DISCOVERY_CONFIGURATION__SERVER_CAPABILITIES, null, null, oldServerCapabilitiesESet));
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
			case TypesPackage.MDNS_DISCOVERY_CONFIGURATION__SERVER_CAPABILITIES:
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
			case TypesPackage.MDNS_DISCOVERY_CONFIGURATION__MDNS_SERVER_NAME:
				return getMdnsServerName();
			case TypesPackage.MDNS_DISCOVERY_CONFIGURATION__SERVER_CAPABILITIES:
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
			case TypesPackage.MDNS_DISCOVERY_CONFIGURATION__MDNS_SERVER_NAME:
				setMdnsServerName((String)newValue);
				return;
			case TypesPackage.MDNS_DISCOVERY_CONFIGURATION__SERVER_CAPABILITIES:
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
			case TypesPackage.MDNS_DISCOVERY_CONFIGURATION__MDNS_SERVER_NAME:
				unsetMdnsServerName();
				return;
			case TypesPackage.MDNS_DISCOVERY_CONFIGURATION__SERVER_CAPABILITIES:
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
			case TypesPackage.MDNS_DISCOVERY_CONFIGURATION__MDNS_SERVER_NAME:
				return isSetMdnsServerName();
			case TypesPackage.MDNS_DISCOVERY_CONFIGURATION__SERVER_CAPABILITIES:
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
		result.append(" (mdnsServerName: ");
		if (mdnsServerNameESet) result.append(mdnsServerName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MdnsDiscoveryConfigurationImpl
