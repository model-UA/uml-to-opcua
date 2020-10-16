/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.CreateSessionResponse;
import org.opcfoundation.ua._2008._02.types.ListOfEndpointDescription;
import org.opcfoundation.ua._2008._02.types.ListOfSignedSoftwareCertificate;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.ResponseHeader;
import org.opcfoundation.ua._2008._02.types.SignatureData;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Session Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionResponseImpl#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionResponseImpl#getSessionId <em>Session Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionResponseImpl#getAuthenticationToken <em>Authentication Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionResponseImpl#getRevisedSessionTimeout <em>Revised Session Timeout</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionResponseImpl#getServerNonce <em>Server Nonce</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionResponseImpl#getServerCertificate <em>Server Certificate</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionResponseImpl#getServerEndpoints <em>Server Endpoints</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionResponseImpl#getServerSoftwareCertificates <em>Server Software Certificates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionResponseImpl#getServerSignature <em>Server Signature</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionResponseImpl#getMaxRequestMessageSize <em>Max Request Message Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateSessionResponseImpl extends MinimalEObjectImpl.Container implements CreateSessionResponse {
	/**
	 * The cached value of the '{@link #getResponseHeader() <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseHeader()
	 * @generated
	 * @ordered
	 */
	protected ResponseHeader responseHeader;

	/**
	 * This is true if the Response Header containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean responseHeaderESet;

	/**
	 * The cached value of the '{@link #getSessionId() <em>Session Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionId()
	 * @generated
	 * @ordered
	 */
	protected NodeId sessionId;

	/**
	 * This is true if the Session Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sessionIdESet;

	/**
	 * The cached value of the '{@link #getAuthenticationToken() <em>Authentication Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationToken()
	 * @generated
	 * @ordered
	 */
	protected NodeId authenticationToken;

	/**
	 * This is true if the Authentication Token containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean authenticationTokenESet;

	/**
	 * The default value of the '{@link #getRevisedSessionTimeout() <em>Revised Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedSessionTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final double REVISED_SESSION_TIMEOUT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRevisedSessionTimeout() <em>Revised Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedSessionTimeout()
	 * @generated
	 * @ordered
	 */
	protected double revisedSessionTimeout = REVISED_SESSION_TIMEOUT_EDEFAULT;

	/**
	 * This is true if the Revised Session Timeout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revisedSessionTimeoutESet;

	/**
	 * The default value of the '{@link #getServerNonce() <em>Server Nonce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerNonce()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] SERVER_NONCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerNonce() <em>Server Nonce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerNonce()
	 * @generated
	 * @ordered
	 */
	protected byte[] serverNonce = SERVER_NONCE_EDEFAULT;

	/**
	 * This is true if the Server Nonce attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverNonceESet;

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
	 * The cached value of the '{@link #getServerEndpoints() <em>Server Endpoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerEndpoints()
	 * @generated
	 * @ordered
	 */
	protected ListOfEndpointDescription serverEndpoints;

	/**
	 * This is true if the Server Endpoints containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverEndpointsESet;

	/**
	 * The cached value of the '{@link #getServerSoftwareCertificates() <em>Server Software Certificates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerSoftwareCertificates()
	 * @generated
	 * @ordered
	 */
	protected ListOfSignedSoftwareCertificate serverSoftwareCertificates;

	/**
	 * This is true if the Server Software Certificates containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverSoftwareCertificatesESet;

	/**
	 * The cached value of the '{@link #getServerSignature() <em>Server Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerSignature()
	 * @generated
	 * @ordered
	 */
	protected SignatureData serverSignature;

	/**
	 * This is true if the Server Signature containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverSignatureESet;

	/**
	 * The default value of the '{@link #getMaxRequestMessageSize() <em>Max Request Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRequestMessageSize()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_REQUEST_MESSAGE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxRequestMessageSize() <em>Max Request Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRequestMessageSize()
	 * @generated
	 * @ordered
	 */
	protected long maxRequestMessageSize = MAX_REQUEST_MESSAGE_SIZE_EDEFAULT;

	/**
	 * This is true if the Max Request Message Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxRequestMessageSizeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateSessionResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getCreateSessionResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseHeader(ResponseHeader newResponseHeader, NotificationChain msgs) {
		ResponseHeader oldResponseHeader = responseHeader;
		responseHeader = newResponseHeader;
		boolean oldResponseHeaderESet = responseHeaderESet;
		responseHeaderESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_RESPONSE__RESPONSE_HEADER, oldResponseHeader, newResponseHeader, !oldResponseHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseHeader(ResponseHeader newResponseHeader) {
		if (newResponseHeader != responseHeader) {
			NotificationChain msgs = null;
			if (responseHeader != null)
				msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_RESPONSE__RESPONSE_HEADER, null, msgs);
			if (newResponseHeader != null)
				msgs = ((InternalEObject)newResponseHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicSetResponseHeader(newResponseHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_RESPONSE__RESPONSE_HEADER, newResponseHeader, newResponseHeader, !oldResponseHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetResponseHeader(NotificationChain msgs) {
		ResponseHeader oldResponseHeader = responseHeader;
		responseHeader = null;
		boolean oldResponseHeaderESet = responseHeaderESet;
		responseHeaderESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_RESPONSE__RESPONSE_HEADER, oldResponseHeader, null, oldResponseHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResponseHeader() {
		if (responseHeader != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicUnsetResponseHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_RESPONSE__RESPONSE_HEADER, null, null, oldResponseHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResponseHeader() {
		return responseHeaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getSessionId() {
		return sessionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSessionId(NodeId newSessionId, NotificationChain msgs) {
		NodeId oldSessionId = sessionId;
		sessionId = newSessionId;
		boolean oldSessionIdESet = sessionIdESet;
		sessionIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_RESPONSE__SESSION_ID, oldSessionId, newSessionId, !oldSessionIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionId(NodeId newSessionId) {
		if (newSessionId != sessionId) {
			NotificationChain msgs = null;
			if (sessionId != null)
				msgs = ((InternalEObject)sessionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_RESPONSE__SESSION_ID, null, msgs);
			if (newSessionId != null)
				msgs = ((InternalEObject)newSessionId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_RESPONSE__SESSION_ID, null, msgs);
			msgs = basicSetSessionId(newSessionId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSessionIdESet = sessionIdESet;
			sessionIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_RESPONSE__SESSION_ID, newSessionId, newSessionId, !oldSessionIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSessionId(NotificationChain msgs) {
		NodeId oldSessionId = sessionId;
		sessionId = null;
		boolean oldSessionIdESet = sessionIdESet;
		sessionIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_RESPONSE__SESSION_ID, oldSessionId, null, oldSessionIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSessionId() {
		if (sessionId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)sessionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_RESPONSE__SESSION_ID, null, msgs);
			msgs = basicUnsetSessionId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSessionIdESet = sessionIdESet;
			sessionIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_RESPONSE__SESSION_ID, null, null, oldSessionIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSessionId() {
		return sessionIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getAuthenticationToken() {
		return authenticationToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthenticationToken(NodeId newAuthenticationToken, NotificationChain msgs) {
		NodeId oldAuthenticationToken = authenticationToken;
		authenticationToken = newAuthenticationToken;
		boolean oldAuthenticationTokenESet = authenticationTokenESet;
		authenticationTokenESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_RESPONSE__AUTHENTICATION_TOKEN, oldAuthenticationToken, newAuthenticationToken, !oldAuthenticationTokenESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticationToken(NodeId newAuthenticationToken) {
		if (newAuthenticationToken != authenticationToken) {
			NotificationChain msgs = null;
			if (authenticationToken != null)
				msgs = ((InternalEObject)authenticationToken).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_RESPONSE__AUTHENTICATION_TOKEN, null, msgs);
			if (newAuthenticationToken != null)
				msgs = ((InternalEObject)newAuthenticationToken).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_RESPONSE__AUTHENTICATION_TOKEN, null, msgs);
			msgs = basicSetAuthenticationToken(newAuthenticationToken, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAuthenticationTokenESet = authenticationTokenESet;
			authenticationTokenESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_RESPONSE__AUTHENTICATION_TOKEN, newAuthenticationToken, newAuthenticationToken, !oldAuthenticationTokenESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAuthenticationToken(NotificationChain msgs) {
		NodeId oldAuthenticationToken = authenticationToken;
		authenticationToken = null;
		boolean oldAuthenticationTokenESet = authenticationTokenESet;
		authenticationTokenESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_RESPONSE__AUTHENTICATION_TOKEN, oldAuthenticationToken, null, oldAuthenticationTokenESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAuthenticationToken() {
		if (authenticationToken != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)authenticationToken).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_RESPONSE__AUTHENTICATION_TOKEN, null, msgs);
			msgs = basicUnsetAuthenticationToken(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAuthenticationTokenESet = authenticationTokenESet;
			authenticationTokenESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_RESPONSE__AUTHENTICATION_TOKEN, null, null, oldAuthenticationTokenESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAuthenticationToken() {
		return authenticationTokenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRevisedSessionTimeout() {
		return revisedSessionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisedSessionTimeout(double newRevisedSessionTimeout) {
		double oldRevisedSessionTimeout = revisedSessionTimeout;
		revisedSessionTimeout = newRevisedSessionTimeout;
		boolean oldRevisedSessionTimeoutESet = revisedSessionTimeoutESet;
		revisedSessionTimeoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_RESPONSE__REVISED_SESSION_TIMEOUT, oldRevisedSessionTimeout, revisedSessionTimeout, !oldRevisedSessionTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRevisedSessionTimeout() {
		double oldRevisedSessionTimeout = revisedSessionTimeout;
		boolean oldRevisedSessionTimeoutESet = revisedSessionTimeoutESet;
		revisedSessionTimeout = REVISED_SESSION_TIMEOUT_EDEFAULT;
		revisedSessionTimeoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_RESPONSE__REVISED_SESSION_TIMEOUT, oldRevisedSessionTimeout, REVISED_SESSION_TIMEOUT_EDEFAULT, oldRevisedSessionTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRevisedSessionTimeout() {
		return revisedSessionTimeoutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getServerNonce() {
		return serverNonce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerNonce(byte[] newServerNonce) {
		byte[] oldServerNonce = serverNonce;
		serverNonce = newServerNonce;
		boolean oldServerNonceESet = serverNonceESet;
		serverNonceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_RESPONSE__SERVER_NONCE, oldServerNonce, serverNonce, !oldServerNonceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerNonce() {
		byte[] oldServerNonce = serverNonce;
		boolean oldServerNonceESet = serverNonceESet;
		serverNonce = SERVER_NONCE_EDEFAULT;
		serverNonceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_RESPONSE__SERVER_NONCE, oldServerNonce, SERVER_NONCE_EDEFAULT, oldServerNonceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerNonce() {
		return serverNonceESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_RESPONSE__SERVER_CERTIFICATE, oldServerCertificate, serverCertificate, !oldServerCertificateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_RESPONSE__SERVER_CERTIFICATE, oldServerCertificate, SERVER_CERTIFICATE_EDEFAULT, oldServerCertificateESet));
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
	public ListOfEndpointDescription getServerEndpoints() {
		return serverEndpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerEndpoints(ListOfEndpointDescription newServerEndpoints, NotificationChain msgs) {
		ListOfEndpointDescription oldServerEndpoints = serverEndpoints;
		serverEndpoints = newServerEndpoints;
		boolean oldServerEndpointsESet = serverEndpointsESet;
		serverEndpointsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_RESPONSE__SERVER_ENDPOINTS, oldServerEndpoints, newServerEndpoints, !oldServerEndpointsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerEndpoints(ListOfEndpointDescription newServerEndpoints) {
		if (newServerEndpoints != serverEndpoints) {
			NotificationChain msgs = null;
			if (serverEndpoints != null)
				msgs = ((InternalEObject)serverEndpoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_RESPONSE__SERVER_ENDPOINTS, null, msgs);
			if (newServerEndpoints != null)
				msgs = ((InternalEObject)newServerEndpoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_RESPONSE__SERVER_ENDPOINTS, null, msgs);
			msgs = basicSetServerEndpoints(newServerEndpoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerEndpointsESet = serverEndpointsESet;
			serverEndpointsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_RESPONSE__SERVER_ENDPOINTS, newServerEndpoints, newServerEndpoints, !oldServerEndpointsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetServerEndpoints(NotificationChain msgs) {
		ListOfEndpointDescription oldServerEndpoints = serverEndpoints;
		serverEndpoints = null;
		boolean oldServerEndpointsESet = serverEndpointsESet;
		serverEndpointsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_RESPONSE__SERVER_ENDPOINTS, oldServerEndpoints, null, oldServerEndpointsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerEndpoints() {
		if (serverEndpoints != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)serverEndpoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_RESPONSE__SERVER_ENDPOINTS, null, msgs);
			msgs = basicUnsetServerEndpoints(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerEndpointsESet = serverEndpointsESet;
			serverEndpointsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_RESPONSE__SERVER_ENDPOINTS, null, null, oldServerEndpointsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerEndpoints() {
		return serverEndpointsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSignedSoftwareCertificate getServerSoftwareCertificates() {
		return serverSoftwareCertificates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerSoftwareCertificates(ListOfSignedSoftwareCertificate newServerSoftwareCertificates, NotificationChain msgs) {
		ListOfSignedSoftwareCertificate oldServerSoftwareCertificates = serverSoftwareCertificates;
		serverSoftwareCertificates = newServerSoftwareCertificates;
		boolean oldServerSoftwareCertificatesESet = serverSoftwareCertificatesESet;
		serverSoftwareCertificatesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SOFTWARE_CERTIFICATES, oldServerSoftwareCertificates, newServerSoftwareCertificates, !oldServerSoftwareCertificatesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerSoftwareCertificates(ListOfSignedSoftwareCertificate newServerSoftwareCertificates) {
		if (newServerSoftwareCertificates != serverSoftwareCertificates) {
			NotificationChain msgs = null;
			if (serverSoftwareCertificates != null)
				msgs = ((InternalEObject)serverSoftwareCertificates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SOFTWARE_CERTIFICATES, null, msgs);
			if (newServerSoftwareCertificates != null)
				msgs = ((InternalEObject)newServerSoftwareCertificates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SOFTWARE_CERTIFICATES, null, msgs);
			msgs = basicSetServerSoftwareCertificates(newServerSoftwareCertificates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerSoftwareCertificatesESet = serverSoftwareCertificatesESet;
			serverSoftwareCertificatesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SOFTWARE_CERTIFICATES, newServerSoftwareCertificates, newServerSoftwareCertificates, !oldServerSoftwareCertificatesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetServerSoftwareCertificates(NotificationChain msgs) {
		ListOfSignedSoftwareCertificate oldServerSoftwareCertificates = serverSoftwareCertificates;
		serverSoftwareCertificates = null;
		boolean oldServerSoftwareCertificatesESet = serverSoftwareCertificatesESet;
		serverSoftwareCertificatesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SOFTWARE_CERTIFICATES, oldServerSoftwareCertificates, null, oldServerSoftwareCertificatesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerSoftwareCertificates() {
		if (serverSoftwareCertificates != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)serverSoftwareCertificates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SOFTWARE_CERTIFICATES, null, msgs);
			msgs = basicUnsetServerSoftwareCertificates(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerSoftwareCertificatesESet = serverSoftwareCertificatesESet;
			serverSoftwareCertificatesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SOFTWARE_CERTIFICATES, null, null, oldServerSoftwareCertificatesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerSoftwareCertificates() {
		return serverSoftwareCertificatesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureData getServerSignature() {
		return serverSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerSignature(SignatureData newServerSignature, NotificationChain msgs) {
		SignatureData oldServerSignature = serverSignature;
		serverSignature = newServerSignature;
		boolean oldServerSignatureESet = serverSignatureESet;
		serverSignatureESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SIGNATURE, oldServerSignature, newServerSignature, !oldServerSignatureESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerSignature(SignatureData newServerSignature) {
		if (newServerSignature != serverSignature) {
			NotificationChain msgs = null;
			if (serverSignature != null)
				msgs = ((InternalEObject)serverSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SIGNATURE, null, msgs);
			if (newServerSignature != null)
				msgs = ((InternalEObject)newServerSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SIGNATURE, null, msgs);
			msgs = basicSetServerSignature(newServerSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerSignatureESet = serverSignatureESet;
			serverSignatureESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SIGNATURE, newServerSignature, newServerSignature, !oldServerSignatureESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetServerSignature(NotificationChain msgs) {
		SignatureData oldServerSignature = serverSignature;
		serverSignature = null;
		boolean oldServerSignatureESet = serverSignatureESet;
		serverSignatureESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SIGNATURE, oldServerSignature, null, oldServerSignatureESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerSignature() {
		if (serverSignature != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)serverSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SIGNATURE, null, msgs);
			msgs = basicUnsetServerSignature(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerSignatureESet = serverSignatureESet;
			serverSignatureESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SIGNATURE, null, null, oldServerSignatureESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerSignature() {
		return serverSignatureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxRequestMessageSize() {
		return maxRequestMessageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRequestMessageSize(long newMaxRequestMessageSize) {
		long oldMaxRequestMessageSize = maxRequestMessageSize;
		maxRequestMessageSize = newMaxRequestMessageSize;
		boolean oldMaxRequestMessageSizeESet = maxRequestMessageSizeESet;
		maxRequestMessageSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_RESPONSE__MAX_REQUEST_MESSAGE_SIZE, oldMaxRequestMessageSize, maxRequestMessageSize, !oldMaxRequestMessageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxRequestMessageSize() {
		long oldMaxRequestMessageSize = maxRequestMessageSize;
		boolean oldMaxRequestMessageSizeESet = maxRequestMessageSizeESet;
		maxRequestMessageSize = MAX_REQUEST_MESSAGE_SIZE_EDEFAULT;
		maxRequestMessageSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_RESPONSE__MAX_REQUEST_MESSAGE_SIZE, oldMaxRequestMessageSize, MAX_REQUEST_MESSAGE_SIZE_EDEFAULT, oldMaxRequestMessageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxRequestMessageSize() {
		return maxRequestMessageSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.CREATE_SESSION_RESPONSE__RESPONSE_HEADER:
				return basicUnsetResponseHeader(msgs);
			case TypesPackage.CREATE_SESSION_RESPONSE__SESSION_ID:
				return basicUnsetSessionId(msgs);
			case TypesPackage.CREATE_SESSION_RESPONSE__AUTHENTICATION_TOKEN:
				return basicUnsetAuthenticationToken(msgs);
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_ENDPOINTS:
				return basicUnsetServerEndpoints(msgs);
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SOFTWARE_CERTIFICATES:
				return basicUnsetServerSoftwareCertificates(msgs);
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SIGNATURE:
				return basicUnsetServerSignature(msgs);
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
			case TypesPackage.CREATE_SESSION_RESPONSE__RESPONSE_HEADER:
				return getResponseHeader();
			case TypesPackage.CREATE_SESSION_RESPONSE__SESSION_ID:
				return getSessionId();
			case TypesPackage.CREATE_SESSION_RESPONSE__AUTHENTICATION_TOKEN:
				return getAuthenticationToken();
			case TypesPackage.CREATE_SESSION_RESPONSE__REVISED_SESSION_TIMEOUT:
				return getRevisedSessionTimeout();
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_NONCE:
				return getServerNonce();
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_CERTIFICATE:
				return getServerCertificate();
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_ENDPOINTS:
				return getServerEndpoints();
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SOFTWARE_CERTIFICATES:
				return getServerSoftwareCertificates();
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SIGNATURE:
				return getServerSignature();
			case TypesPackage.CREATE_SESSION_RESPONSE__MAX_REQUEST_MESSAGE_SIZE:
				return getMaxRequestMessageSize();
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
			case TypesPackage.CREATE_SESSION_RESPONSE__RESPONSE_HEADER:
				setResponseHeader((ResponseHeader)newValue);
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__SESSION_ID:
				setSessionId((NodeId)newValue);
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__AUTHENTICATION_TOKEN:
				setAuthenticationToken((NodeId)newValue);
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__REVISED_SESSION_TIMEOUT:
				setRevisedSessionTimeout((Double)newValue);
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_NONCE:
				setServerNonce((byte[])newValue);
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_CERTIFICATE:
				setServerCertificate((byte[])newValue);
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_ENDPOINTS:
				setServerEndpoints((ListOfEndpointDescription)newValue);
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SOFTWARE_CERTIFICATES:
				setServerSoftwareCertificates((ListOfSignedSoftwareCertificate)newValue);
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SIGNATURE:
				setServerSignature((SignatureData)newValue);
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__MAX_REQUEST_MESSAGE_SIZE:
				setMaxRequestMessageSize((Long)newValue);
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
			case TypesPackage.CREATE_SESSION_RESPONSE__RESPONSE_HEADER:
				unsetResponseHeader();
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__SESSION_ID:
				unsetSessionId();
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__AUTHENTICATION_TOKEN:
				unsetAuthenticationToken();
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__REVISED_SESSION_TIMEOUT:
				unsetRevisedSessionTimeout();
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_NONCE:
				unsetServerNonce();
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_CERTIFICATE:
				unsetServerCertificate();
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_ENDPOINTS:
				unsetServerEndpoints();
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SOFTWARE_CERTIFICATES:
				unsetServerSoftwareCertificates();
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SIGNATURE:
				unsetServerSignature();
				return;
			case TypesPackage.CREATE_SESSION_RESPONSE__MAX_REQUEST_MESSAGE_SIZE:
				unsetMaxRequestMessageSize();
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
			case TypesPackage.CREATE_SESSION_RESPONSE__RESPONSE_HEADER:
				return isSetResponseHeader();
			case TypesPackage.CREATE_SESSION_RESPONSE__SESSION_ID:
				return isSetSessionId();
			case TypesPackage.CREATE_SESSION_RESPONSE__AUTHENTICATION_TOKEN:
				return isSetAuthenticationToken();
			case TypesPackage.CREATE_SESSION_RESPONSE__REVISED_SESSION_TIMEOUT:
				return isSetRevisedSessionTimeout();
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_NONCE:
				return isSetServerNonce();
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_CERTIFICATE:
				return isSetServerCertificate();
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_ENDPOINTS:
				return isSetServerEndpoints();
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SOFTWARE_CERTIFICATES:
				return isSetServerSoftwareCertificates();
			case TypesPackage.CREATE_SESSION_RESPONSE__SERVER_SIGNATURE:
				return isSetServerSignature();
			case TypesPackage.CREATE_SESSION_RESPONSE__MAX_REQUEST_MESSAGE_SIZE:
				return isSetMaxRequestMessageSize();
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
		result.append(" (revisedSessionTimeout: ");
		if (revisedSessionTimeoutESet) result.append(revisedSessionTimeout); else result.append("<unset>");
		result.append(", serverNonce: ");
		if (serverNonceESet) result.append(serverNonce); else result.append("<unset>");
		result.append(", serverCertificate: ");
		if (serverCertificateESet) result.append(serverCertificate); else result.append("<unset>");
		result.append(", maxRequestMessageSize: ");
		if (maxRequestMessageSizeESet) result.append(maxRequestMessageSize); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CreateSessionResponseImpl
