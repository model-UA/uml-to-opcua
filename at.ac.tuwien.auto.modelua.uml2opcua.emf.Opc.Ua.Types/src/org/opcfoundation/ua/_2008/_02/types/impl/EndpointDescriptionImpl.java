/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ApplicationDescription;
import org.opcfoundation.ua._2008._02.types.EndpointDescription;
import org.opcfoundation.ua._2008._02.types.ListOfUserTokenPolicy;
import org.opcfoundation.ua._2008._02.types.MessageSecurityMode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointDescriptionImpl#getEndpointUrl <em>Endpoint Url</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointDescriptionImpl#getServer <em>Server</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointDescriptionImpl#getServerCertificate <em>Server Certificate</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointDescriptionImpl#getSecurityMode <em>Security Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointDescriptionImpl#getSecurityPolicyUri <em>Security Policy Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointDescriptionImpl#getUserIdentityTokens <em>User Identity Tokens</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointDescriptionImpl#getTransportProfileUri <em>Transport Profile Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EndpointDescriptionImpl#getSecurityLevel <em>Security Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndpointDescriptionImpl extends MinimalEObjectImpl.Container implements EndpointDescription {
	/**
	 * The default value of the '{@link #getEndpointUrl() <em>Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpointUrl() <em>Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointUrl()
	 * @generated
	 * @ordered
	 */
	protected String endpointUrl = ENDPOINT_URL_EDEFAULT;

	/**
	 * This is true if the Endpoint Url attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endpointUrlESet;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected ApplicationDescription server;

	/**
	 * This is true if the Server containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverESet;

	/**
	 * The default value of the '{@link #getServerCertificate() <em>Server Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerCertificate()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] SERVER_CERTIFICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerCertificate() <em>Server Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerCertificate()
	 * @generated
	 * @ordered
	 */
	protected byte[] serverCertificate = SERVER_CERTIFICATE_EDEFAULT;

	/**
	 * This is true if the Server Certificate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverCertificateESet;

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
	 * The default value of the '{@link #getSecurityPolicyUri() <em>Security Policy Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityPolicyUri()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_POLICY_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityPolicyUri() <em>Security Policy Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityPolicyUri()
	 * @generated
	 * @ordered
	 */
	protected String securityPolicyUri = SECURITY_POLICY_URI_EDEFAULT;

	/**
	 * This is true if the Security Policy Uri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securityPolicyUriESet;

	/**
	 * The cached value of the '{@link #getUserIdentityTokens() <em>User Identity Tokens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserIdentityTokens()
	 * @generated
	 * @ordered
	 */
	protected ListOfUserTokenPolicy userIdentityTokens;

	/**
	 * This is true if the User Identity Tokens containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userIdentityTokensESet;

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
	 * The default value of the '{@link #getSecurityLevel() <em>Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final short SECURITY_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecurityLevel() <em>Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected short securityLevel = SECURITY_LEVEL_EDEFAULT;

	/**
	 * This is true if the Security Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securityLevelESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndpointDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getEndpointDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpointUrl() {
		return endpointUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointUrl(String newEndpointUrl) {
		String oldEndpointUrl = endpointUrl;
		endpointUrl = newEndpointUrl;
		boolean oldEndpointUrlESet = endpointUrlESet;
		endpointUrlESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_DESCRIPTION__ENDPOINT_URL, oldEndpointUrl, endpointUrl, !oldEndpointUrlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndpointUrl() {
		String oldEndpointUrl = endpointUrl;
		boolean oldEndpointUrlESet = endpointUrlESet;
		endpointUrl = ENDPOINT_URL_EDEFAULT;
		endpointUrlESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_DESCRIPTION__ENDPOINT_URL, oldEndpointUrl, ENDPOINT_URL_EDEFAULT, oldEndpointUrlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndpointUrl() {
		return endpointUrlESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDescription getServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServer(ApplicationDescription newServer, NotificationChain msgs) {
		ApplicationDescription oldServer = server;
		server = newServer;
		boolean oldServerESet = serverESet;
		serverESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_DESCRIPTION__SERVER, oldServer, newServer, !oldServerESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(ApplicationDescription newServer) {
		if (newServer != server) {
			NotificationChain msgs = null;
			if (server != null)
				msgs = ((InternalEObject)server).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENDPOINT_DESCRIPTION__SERVER, null, msgs);
			if (newServer != null)
				msgs = ((InternalEObject)newServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENDPOINT_DESCRIPTION__SERVER, null, msgs);
			msgs = basicSetServer(newServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerESet = serverESet;
			serverESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_DESCRIPTION__SERVER, newServer, newServer, !oldServerESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetServer(NotificationChain msgs) {
		ApplicationDescription oldServer = server;
		server = null;
		boolean oldServerESet = serverESet;
		serverESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_DESCRIPTION__SERVER, oldServer, null, oldServerESet);
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
			msgs = ((InternalEObject)server).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENDPOINT_DESCRIPTION__SERVER, null, msgs);
			msgs = basicUnsetServer(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerESet = serverESet;
			serverESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_DESCRIPTION__SERVER, null, null, oldServerESet));
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
	public byte[] getServerCertificate() {
		return serverCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerCertificate(byte[] newServerCertificate) {
		byte[] oldServerCertificate = serverCertificate;
		serverCertificate = newServerCertificate;
		boolean oldServerCertificateESet = serverCertificateESet;
		serverCertificateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_DESCRIPTION__SERVER_CERTIFICATE, oldServerCertificate, serverCertificate, !oldServerCertificateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerCertificate() {
		byte[] oldServerCertificate = serverCertificate;
		boolean oldServerCertificateESet = serverCertificateESet;
		serverCertificate = SERVER_CERTIFICATE_EDEFAULT;
		serverCertificateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_DESCRIPTION__SERVER_CERTIFICATE, oldServerCertificate, SERVER_CERTIFICATE_EDEFAULT, oldServerCertificateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerCertificate() {
		return serverCertificateESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_DESCRIPTION__SECURITY_MODE, oldSecurityMode, securityMode, !oldSecurityModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_DESCRIPTION__SECURITY_MODE, oldSecurityMode, SECURITY_MODE_EDEFAULT, oldSecurityModeESet));
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
	public String getSecurityPolicyUri() {
		return securityPolicyUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityPolicyUri(String newSecurityPolicyUri) {
		String oldSecurityPolicyUri = securityPolicyUri;
		securityPolicyUri = newSecurityPolicyUri;
		boolean oldSecurityPolicyUriESet = securityPolicyUriESet;
		securityPolicyUriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_DESCRIPTION__SECURITY_POLICY_URI, oldSecurityPolicyUri, securityPolicyUri, !oldSecurityPolicyUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurityPolicyUri() {
		String oldSecurityPolicyUri = securityPolicyUri;
		boolean oldSecurityPolicyUriESet = securityPolicyUriESet;
		securityPolicyUri = SECURITY_POLICY_URI_EDEFAULT;
		securityPolicyUriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_DESCRIPTION__SECURITY_POLICY_URI, oldSecurityPolicyUri, SECURITY_POLICY_URI_EDEFAULT, oldSecurityPolicyUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecurityPolicyUri() {
		return securityPolicyUriESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUserTokenPolicy getUserIdentityTokens() {
		return userIdentityTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserIdentityTokens(ListOfUserTokenPolicy newUserIdentityTokens, NotificationChain msgs) {
		ListOfUserTokenPolicy oldUserIdentityTokens = userIdentityTokens;
		userIdentityTokens = newUserIdentityTokens;
		boolean oldUserIdentityTokensESet = userIdentityTokensESet;
		userIdentityTokensESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_DESCRIPTION__USER_IDENTITY_TOKENS, oldUserIdentityTokens, newUserIdentityTokens, !oldUserIdentityTokensESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserIdentityTokens(ListOfUserTokenPolicy newUserIdentityTokens) {
		if (newUserIdentityTokens != userIdentityTokens) {
			NotificationChain msgs = null;
			if (userIdentityTokens != null)
				msgs = ((InternalEObject)userIdentityTokens).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENDPOINT_DESCRIPTION__USER_IDENTITY_TOKENS, null, msgs);
			if (newUserIdentityTokens != null)
				msgs = ((InternalEObject)newUserIdentityTokens).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENDPOINT_DESCRIPTION__USER_IDENTITY_TOKENS, null, msgs);
			msgs = basicSetUserIdentityTokens(newUserIdentityTokens, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldUserIdentityTokensESet = userIdentityTokensESet;
			userIdentityTokensESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_DESCRIPTION__USER_IDENTITY_TOKENS, newUserIdentityTokens, newUserIdentityTokens, !oldUserIdentityTokensESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetUserIdentityTokens(NotificationChain msgs) {
		ListOfUserTokenPolicy oldUserIdentityTokens = userIdentityTokens;
		userIdentityTokens = null;
		boolean oldUserIdentityTokensESet = userIdentityTokensESet;
		userIdentityTokensESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_DESCRIPTION__USER_IDENTITY_TOKENS, oldUserIdentityTokens, null, oldUserIdentityTokensESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserIdentityTokens() {
		if (userIdentityTokens != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)userIdentityTokens).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENDPOINT_DESCRIPTION__USER_IDENTITY_TOKENS, null, msgs);
			msgs = basicUnsetUserIdentityTokens(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldUserIdentityTokensESet = userIdentityTokensESet;
			userIdentityTokensESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_DESCRIPTION__USER_IDENTITY_TOKENS, null, null, oldUserIdentityTokensESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserIdentityTokens() {
		return userIdentityTokensESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_DESCRIPTION__TRANSPORT_PROFILE_URI, oldTransportProfileUri, transportProfileUri, !oldTransportProfileUriESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_DESCRIPTION__TRANSPORT_PROFILE_URI, oldTransportProfileUri, TRANSPORT_PROFILE_URI_EDEFAULT, oldTransportProfileUriESet));
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
	public short getSecurityLevel() {
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityLevel(short newSecurityLevel) {
		short oldSecurityLevel = securityLevel;
		securityLevel = newSecurityLevel;
		boolean oldSecurityLevelESet = securityLevelESet;
		securityLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENDPOINT_DESCRIPTION__SECURITY_LEVEL, oldSecurityLevel, securityLevel, !oldSecurityLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurityLevel() {
		short oldSecurityLevel = securityLevel;
		boolean oldSecurityLevelESet = securityLevelESet;
		securityLevel = SECURITY_LEVEL_EDEFAULT;
		securityLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ENDPOINT_DESCRIPTION__SECURITY_LEVEL, oldSecurityLevel, SECURITY_LEVEL_EDEFAULT, oldSecurityLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecurityLevel() {
		return securityLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.ENDPOINT_DESCRIPTION__SERVER:
				return basicUnsetServer(msgs);
			case TypesPackage.ENDPOINT_DESCRIPTION__USER_IDENTITY_TOKENS:
				return basicUnsetUserIdentityTokens(msgs);
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
			case TypesPackage.ENDPOINT_DESCRIPTION__ENDPOINT_URL:
				return getEndpointUrl();
			case TypesPackage.ENDPOINT_DESCRIPTION__SERVER:
				return getServer();
			case TypesPackage.ENDPOINT_DESCRIPTION__SERVER_CERTIFICATE:
				return getServerCertificate();
			case TypesPackage.ENDPOINT_DESCRIPTION__SECURITY_MODE:
				return getSecurityMode();
			case TypesPackage.ENDPOINT_DESCRIPTION__SECURITY_POLICY_URI:
				return getSecurityPolicyUri();
			case TypesPackage.ENDPOINT_DESCRIPTION__USER_IDENTITY_TOKENS:
				return getUserIdentityTokens();
			case TypesPackage.ENDPOINT_DESCRIPTION__TRANSPORT_PROFILE_URI:
				return getTransportProfileUri();
			case TypesPackage.ENDPOINT_DESCRIPTION__SECURITY_LEVEL:
				return getSecurityLevel();
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
			case TypesPackage.ENDPOINT_DESCRIPTION__ENDPOINT_URL:
				setEndpointUrl((String)newValue);
				return;
			case TypesPackage.ENDPOINT_DESCRIPTION__SERVER:
				setServer((ApplicationDescription)newValue);
				return;
			case TypesPackage.ENDPOINT_DESCRIPTION__SERVER_CERTIFICATE:
				setServerCertificate((byte[])newValue);
				return;
			case TypesPackage.ENDPOINT_DESCRIPTION__SECURITY_MODE:
				setSecurityMode((MessageSecurityMode)newValue);
				return;
			case TypesPackage.ENDPOINT_DESCRIPTION__SECURITY_POLICY_URI:
				setSecurityPolicyUri((String)newValue);
				return;
			case TypesPackage.ENDPOINT_DESCRIPTION__USER_IDENTITY_TOKENS:
				setUserIdentityTokens((ListOfUserTokenPolicy)newValue);
				return;
			case TypesPackage.ENDPOINT_DESCRIPTION__TRANSPORT_PROFILE_URI:
				setTransportProfileUri((String)newValue);
				return;
			case TypesPackage.ENDPOINT_DESCRIPTION__SECURITY_LEVEL:
				setSecurityLevel((Short)newValue);
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
			case TypesPackage.ENDPOINT_DESCRIPTION__ENDPOINT_URL:
				unsetEndpointUrl();
				return;
			case TypesPackage.ENDPOINT_DESCRIPTION__SERVER:
				unsetServer();
				return;
			case TypesPackage.ENDPOINT_DESCRIPTION__SERVER_CERTIFICATE:
				unsetServerCertificate();
				return;
			case TypesPackage.ENDPOINT_DESCRIPTION__SECURITY_MODE:
				unsetSecurityMode();
				return;
			case TypesPackage.ENDPOINT_DESCRIPTION__SECURITY_POLICY_URI:
				unsetSecurityPolicyUri();
				return;
			case TypesPackage.ENDPOINT_DESCRIPTION__USER_IDENTITY_TOKENS:
				unsetUserIdentityTokens();
				return;
			case TypesPackage.ENDPOINT_DESCRIPTION__TRANSPORT_PROFILE_URI:
				unsetTransportProfileUri();
				return;
			case TypesPackage.ENDPOINT_DESCRIPTION__SECURITY_LEVEL:
				unsetSecurityLevel();
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
			case TypesPackage.ENDPOINT_DESCRIPTION__ENDPOINT_URL:
				return isSetEndpointUrl();
			case TypesPackage.ENDPOINT_DESCRIPTION__SERVER:
				return isSetServer();
			case TypesPackage.ENDPOINT_DESCRIPTION__SERVER_CERTIFICATE:
				return isSetServerCertificate();
			case TypesPackage.ENDPOINT_DESCRIPTION__SECURITY_MODE:
				return isSetSecurityMode();
			case TypesPackage.ENDPOINT_DESCRIPTION__SECURITY_POLICY_URI:
				return isSetSecurityPolicyUri();
			case TypesPackage.ENDPOINT_DESCRIPTION__USER_IDENTITY_TOKENS:
				return isSetUserIdentityTokens();
			case TypesPackage.ENDPOINT_DESCRIPTION__TRANSPORT_PROFILE_URI:
				return isSetTransportProfileUri();
			case TypesPackage.ENDPOINT_DESCRIPTION__SECURITY_LEVEL:
				return isSetSecurityLevel();
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
		result.append(" (endpointUrl: ");
		if (endpointUrlESet) result.append(endpointUrl); else result.append("<unset>");
		result.append(", serverCertificate: ");
		if (serverCertificateESet) result.append(serverCertificate); else result.append("<unset>");
		result.append(", securityMode: ");
		if (securityModeESet) result.append(securityMode); else result.append("<unset>");
		result.append(", securityPolicyUri: ");
		if (securityPolicyUriESet) result.append(securityPolicyUri); else result.append("<unset>");
		result.append(", transportProfileUri: ");
		if (transportProfileUriESet) result.append(transportProfileUri); else result.append("<unset>");
		result.append(", securityLevel: ");
		if (securityLevelESet) result.append(securityLevel); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EndpointDescriptionImpl
