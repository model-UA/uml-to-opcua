/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfExtensionObject;
import org.opcfoundation.ua._2008._02.types.RegisterServer2Request;
import org.opcfoundation.ua._2008._02.types.RegisteredServer;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Register Server2 Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RegisterServer2RequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RegisterServer2RequestImpl#getServer <em>Server</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RegisterServer2RequestImpl#getDiscoveryConfiguration <em>Discovery Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegisterServer2RequestImpl extends MinimalEObjectImpl.Container implements RegisterServer2Request {
	/**
	 * The cached value of the '{@link #getRequestHeader() <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestHeader()
	 * @generated
	 * @ordered
	 */
	protected RequestHeader requestHeader;

	/**
	 * This is true if the Request Header containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestHeaderESet;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected RegisteredServer server;

	/**
	 * This is true if the Server containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverESet;

	/**
	 * The cached value of the '{@link #getDiscoveryConfiguration() <em>Discovery Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ListOfExtensionObject discoveryConfiguration;

	/**
	 * This is true if the Discovery Configuration containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean discoveryConfigurationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisterServer2RequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getRegisterServer2Request();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestHeader getRequestHeader() {
		return requestHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestHeader(RequestHeader newRequestHeader, NotificationChain msgs) {
		RequestHeader oldRequestHeader = requestHeader;
		requestHeader = newRequestHeader;
		boolean oldRequestHeaderESet = requestHeaderESet;
		requestHeaderESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTER_SERVER2_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestHeader(RequestHeader newRequestHeader) {
		if (newRequestHeader != requestHeader) {
			NotificationChain msgs = null;
			if (requestHeader != null)
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTER_SERVER2_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTER_SERVER2_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTER_SERVER2_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRequestHeader(NotificationChain msgs) {
		RequestHeader oldRequestHeader = requestHeader;
		requestHeader = null;
		boolean oldRequestHeaderESet = requestHeaderESet;
		requestHeaderESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTER_SERVER2_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestHeader() {
		if (requestHeader != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTER_SERVER2_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTER_SERVER2_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestHeader() {
		return requestHeaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredServer getServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServer(RegisteredServer newServer, NotificationChain msgs) {
		RegisteredServer oldServer = server;
		server = newServer;
		boolean oldServerESet = serverESet;
		serverESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTER_SERVER2_REQUEST__SERVER, oldServer, newServer, !oldServerESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(RegisteredServer newServer) {
		if (newServer != server) {
			NotificationChain msgs = null;
			if (server != null)
				msgs = ((InternalEObject)server).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTER_SERVER2_REQUEST__SERVER, null, msgs);
			if (newServer != null)
				msgs = ((InternalEObject)newServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTER_SERVER2_REQUEST__SERVER, null, msgs);
			msgs = basicSetServer(newServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerESet = serverESet;
			serverESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTER_SERVER2_REQUEST__SERVER, newServer, newServer, !oldServerESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetServer(NotificationChain msgs) {
		RegisteredServer oldServer = server;
		server = null;
		boolean oldServerESet = serverESet;
		serverESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTER_SERVER2_REQUEST__SERVER, oldServer, null, oldServerESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServer() {
		if (server != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)server).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTER_SERVER2_REQUEST__SERVER, null, msgs);
			msgs = basicUnsetServer(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerESet = serverESet;
			serverESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTER_SERVER2_REQUEST__SERVER, null, null, oldServerESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServer() {
		return serverESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfExtensionObject getDiscoveryConfiguration() {
		return discoveryConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscoveryConfiguration(ListOfExtensionObject newDiscoveryConfiguration, NotificationChain msgs) {
		ListOfExtensionObject oldDiscoveryConfiguration = discoveryConfiguration;
		discoveryConfiguration = newDiscoveryConfiguration;
		boolean oldDiscoveryConfigurationESet = discoveryConfigurationESet;
		discoveryConfigurationESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTER_SERVER2_REQUEST__DISCOVERY_CONFIGURATION, oldDiscoveryConfiguration, newDiscoveryConfiguration, !oldDiscoveryConfigurationESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoveryConfiguration(ListOfExtensionObject newDiscoveryConfiguration) {
		if (newDiscoveryConfiguration != discoveryConfiguration) {
			NotificationChain msgs = null;
			if (discoveryConfiguration != null)
				msgs = ((InternalEObject)discoveryConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTER_SERVER2_REQUEST__DISCOVERY_CONFIGURATION, null, msgs);
			if (newDiscoveryConfiguration != null)
				msgs = ((InternalEObject)newDiscoveryConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTER_SERVER2_REQUEST__DISCOVERY_CONFIGURATION, null, msgs);
			msgs = basicSetDiscoveryConfiguration(newDiscoveryConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiscoveryConfigurationESet = discoveryConfigurationESet;
			discoveryConfigurationESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REGISTER_SERVER2_REQUEST__DISCOVERY_CONFIGURATION, newDiscoveryConfiguration, newDiscoveryConfiguration, !oldDiscoveryConfigurationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDiscoveryConfiguration(NotificationChain msgs) {
		ListOfExtensionObject oldDiscoveryConfiguration = discoveryConfiguration;
		discoveryConfiguration = null;
		boolean oldDiscoveryConfigurationESet = discoveryConfigurationESet;
		discoveryConfigurationESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTER_SERVER2_REQUEST__DISCOVERY_CONFIGURATION, oldDiscoveryConfiguration, null, oldDiscoveryConfigurationESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDiscoveryConfiguration() {
		if (discoveryConfiguration != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)discoveryConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REGISTER_SERVER2_REQUEST__DISCOVERY_CONFIGURATION, null, msgs);
			msgs = basicUnsetDiscoveryConfiguration(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiscoveryConfigurationESet = discoveryConfigurationESet;
			discoveryConfigurationESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REGISTER_SERVER2_REQUEST__DISCOVERY_CONFIGURATION, null, null, oldDiscoveryConfigurationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiscoveryConfiguration() {
		return discoveryConfigurationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.REGISTER_SERVER2_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.REGISTER_SERVER2_REQUEST__SERVER:
				return basicUnsetServer(msgs);
			case TypesPackage.REGISTER_SERVER2_REQUEST__DISCOVERY_CONFIGURATION:
				return basicUnsetDiscoveryConfiguration(msgs);
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
			case TypesPackage.REGISTER_SERVER2_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.REGISTER_SERVER2_REQUEST__SERVER:
				return getServer();
			case TypesPackage.REGISTER_SERVER2_REQUEST__DISCOVERY_CONFIGURATION:
				return getDiscoveryConfiguration();
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
			case TypesPackage.REGISTER_SERVER2_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.REGISTER_SERVER2_REQUEST__SERVER:
				setServer((RegisteredServer)newValue);
				return;
			case TypesPackage.REGISTER_SERVER2_REQUEST__DISCOVERY_CONFIGURATION:
				setDiscoveryConfiguration((ListOfExtensionObject)newValue);
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
			case TypesPackage.REGISTER_SERVER2_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.REGISTER_SERVER2_REQUEST__SERVER:
				unsetServer();
				return;
			case TypesPackage.REGISTER_SERVER2_REQUEST__DISCOVERY_CONFIGURATION:
				unsetDiscoveryConfiguration();
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
			case TypesPackage.REGISTER_SERVER2_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.REGISTER_SERVER2_REQUEST__SERVER:
				return isSetServer();
			case TypesPackage.REGISTER_SERVER2_REQUEST__DISCOVERY_CONFIGURATION:
				return isSetDiscoveryConfiguration();
		}
		return super.eIsSet(featureID);
	}

} //RegisterServer2RequestImpl
