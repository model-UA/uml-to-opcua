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
import org.opcfoundation.ua._2008._02.types.CreateSessionRequest;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Session Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionRequestImpl#getClientDescription <em>Client Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionRequestImpl#getServerUri <em>Server Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionRequestImpl#getEndpointUrl <em>Endpoint Url</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionRequestImpl#getSessionName <em>Session Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionRequestImpl#getClientNonce <em>Client Nonce</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionRequestImpl#getClientCertificate <em>Client Certificate</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionRequestImpl#getRequestedSessionTimeout <em>Requested Session Timeout</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateSessionRequestImpl#getMaxResponseMessageSize <em>Max Response Message Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateSessionRequestImpl extends MinimalEObjectImpl.Container implements CreateSessionRequest {
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
	 * The cached value of the '{@link #getClientDescription() <em>Client Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientDescription()
	 * @generated
	 * @ordered
	 */
	protected ApplicationDescription clientDescription;

	/**
	 * This is true if the Client Description containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clientDescriptionESet;

	/**
	 * The default value of the '{@link #getServerUri() <em>Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerUri()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerUri() <em>Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerUri()
	 * @generated
	 * @ordered
	 */
	protected String serverUri = SERVER_URI_EDEFAULT;

	/**
	 * This is true if the Server Uri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverUriESet;

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
	 * The default value of the '{@link #getSessionName() <em>Session Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionName()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionName() <em>Session Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionName()
	 * @generated
	 * @ordered
	 */
	protected String sessionName = SESSION_NAME_EDEFAULT;

	/**
	 * This is true if the Session Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sessionNameESet;

	/**
	 * The default value of the '{@link #getClientNonce() <em>Client Nonce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientNonce()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CLIENT_NONCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientNonce() <em>Client Nonce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientNonce()
	 * @generated
	 * @ordered
	 */
	protected byte[] clientNonce = CLIENT_NONCE_EDEFAULT;

	/**
	 * This is true if the Client Nonce attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clientNonceESet;

	/**
	 * The default value of the '{@link #getClientCertificate() <em>Client Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientCertificate()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CLIENT_CERTIFICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientCertificate() <em>Client Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientCertificate()
	 * @generated
	 * @ordered
	 */
	protected byte[] clientCertificate = CLIENT_CERTIFICATE_EDEFAULT;

	/**
	 * This is true if the Client Certificate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clientCertificateESet;

	/**
	 * The default value of the '{@link #getRequestedSessionTimeout() <em>Requested Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedSessionTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final double REQUESTED_SESSION_TIMEOUT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRequestedSessionTimeout() <em>Requested Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedSessionTimeout()
	 * @generated
	 * @ordered
	 */
	protected double requestedSessionTimeout = REQUESTED_SESSION_TIMEOUT_EDEFAULT;

	/**
	 * This is true if the Requested Session Timeout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestedSessionTimeoutESet;

	/**
	 * The default value of the '{@link #getMaxResponseMessageSize() <em>Max Response Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxResponseMessageSize()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_RESPONSE_MESSAGE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxResponseMessageSize() <em>Max Response Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxResponseMessageSize()
	 * @generated
	 * @ordered
	 */
	protected long maxResponseMessageSize = MAX_RESPONSE_MESSAGE_SIZE_EDEFAULT;

	/**
	 * This is true if the Max Response Message Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxResponseMessageSizeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateSessionRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getCreateSessionRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
	public ApplicationDescription getClientDescription() {
		return clientDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClientDescription(ApplicationDescription newClientDescription, NotificationChain msgs) {
		ApplicationDescription oldClientDescription = clientDescription;
		clientDescription = newClientDescription;
		boolean oldClientDescriptionESet = clientDescriptionESet;
		clientDescriptionESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_REQUEST__CLIENT_DESCRIPTION, oldClientDescription, newClientDescription, !oldClientDescriptionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientDescription(ApplicationDescription newClientDescription) {
		if (newClientDescription != clientDescription) {
			NotificationChain msgs = null;
			if (clientDescription != null)
				msgs = ((InternalEObject)clientDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_REQUEST__CLIENT_DESCRIPTION, null, msgs);
			if (newClientDescription != null)
				msgs = ((InternalEObject)newClientDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_REQUEST__CLIENT_DESCRIPTION, null, msgs);
			msgs = basicSetClientDescription(newClientDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldClientDescriptionESet = clientDescriptionESet;
			clientDescriptionESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_REQUEST__CLIENT_DESCRIPTION, newClientDescription, newClientDescription, !oldClientDescriptionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetClientDescription(NotificationChain msgs) {
		ApplicationDescription oldClientDescription = clientDescription;
		clientDescription = null;
		boolean oldClientDescriptionESet = clientDescriptionESet;
		clientDescriptionESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_REQUEST__CLIENT_DESCRIPTION, oldClientDescription, null, oldClientDescriptionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClientDescription() {
		if (clientDescription != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)clientDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_SESSION_REQUEST__CLIENT_DESCRIPTION, null, msgs);
			msgs = basicUnsetClientDescription(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldClientDescriptionESet = clientDescriptionESet;
			clientDescriptionESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_REQUEST__CLIENT_DESCRIPTION, null, null, oldClientDescriptionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClientDescription() {
		return clientDescriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerUri() {
		return serverUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerUri(String newServerUri) {
		String oldServerUri = serverUri;
		serverUri = newServerUri;
		boolean oldServerUriESet = serverUriESet;
		serverUriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_REQUEST__SERVER_URI, oldServerUri, serverUri, !oldServerUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerUri() {
		String oldServerUri = serverUri;
		boolean oldServerUriESet = serverUriESet;
		serverUri = SERVER_URI_EDEFAULT;
		serverUriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_REQUEST__SERVER_URI, oldServerUri, SERVER_URI_EDEFAULT, oldServerUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerUri() {
		return serverUriESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_REQUEST__ENDPOINT_URL, oldEndpointUrl, endpointUrl, !oldEndpointUrlESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_REQUEST__ENDPOINT_URL, oldEndpointUrl, ENDPOINT_URL_EDEFAULT, oldEndpointUrlESet));
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
	public String getSessionName() {
		return sessionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionName(String newSessionName) {
		String oldSessionName = sessionName;
		sessionName = newSessionName;
		boolean oldSessionNameESet = sessionNameESet;
		sessionNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_REQUEST__SESSION_NAME, oldSessionName, sessionName, !oldSessionNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSessionName() {
		String oldSessionName = sessionName;
		boolean oldSessionNameESet = sessionNameESet;
		sessionName = SESSION_NAME_EDEFAULT;
		sessionNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_REQUEST__SESSION_NAME, oldSessionName, SESSION_NAME_EDEFAULT, oldSessionNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSessionName() {
		return sessionNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getClientNonce() {
		return clientNonce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientNonce(byte[] newClientNonce) {
		byte[] oldClientNonce = clientNonce;
		clientNonce = newClientNonce;
		boolean oldClientNonceESet = clientNonceESet;
		clientNonceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_REQUEST__CLIENT_NONCE, oldClientNonce, clientNonce, !oldClientNonceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClientNonce() {
		byte[] oldClientNonce = clientNonce;
		boolean oldClientNonceESet = clientNonceESet;
		clientNonce = CLIENT_NONCE_EDEFAULT;
		clientNonceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_REQUEST__CLIENT_NONCE, oldClientNonce, CLIENT_NONCE_EDEFAULT, oldClientNonceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClientNonce() {
		return clientNonceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getClientCertificate() {
		return clientCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientCertificate(byte[] newClientCertificate) {
		byte[] oldClientCertificate = clientCertificate;
		clientCertificate = newClientCertificate;
		boolean oldClientCertificateESet = clientCertificateESet;
		clientCertificateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_REQUEST__CLIENT_CERTIFICATE, oldClientCertificate, clientCertificate, !oldClientCertificateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClientCertificate() {
		byte[] oldClientCertificate = clientCertificate;
		boolean oldClientCertificateESet = clientCertificateESet;
		clientCertificate = CLIENT_CERTIFICATE_EDEFAULT;
		clientCertificateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_REQUEST__CLIENT_CERTIFICATE, oldClientCertificate, CLIENT_CERTIFICATE_EDEFAULT, oldClientCertificateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClientCertificate() {
		return clientCertificateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRequestedSessionTimeout() {
		return requestedSessionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedSessionTimeout(double newRequestedSessionTimeout) {
		double oldRequestedSessionTimeout = requestedSessionTimeout;
		requestedSessionTimeout = newRequestedSessionTimeout;
		boolean oldRequestedSessionTimeoutESet = requestedSessionTimeoutESet;
		requestedSessionTimeoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_REQUEST__REQUESTED_SESSION_TIMEOUT, oldRequestedSessionTimeout, requestedSessionTimeout, !oldRequestedSessionTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestedSessionTimeout() {
		double oldRequestedSessionTimeout = requestedSessionTimeout;
		boolean oldRequestedSessionTimeoutESet = requestedSessionTimeoutESet;
		requestedSessionTimeout = REQUESTED_SESSION_TIMEOUT_EDEFAULT;
		requestedSessionTimeoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_REQUEST__REQUESTED_SESSION_TIMEOUT, oldRequestedSessionTimeout, REQUESTED_SESSION_TIMEOUT_EDEFAULT, oldRequestedSessionTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestedSessionTimeout() {
		return requestedSessionTimeoutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxResponseMessageSize() {
		return maxResponseMessageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxResponseMessageSize(long newMaxResponseMessageSize) {
		long oldMaxResponseMessageSize = maxResponseMessageSize;
		maxResponseMessageSize = newMaxResponseMessageSize;
		boolean oldMaxResponseMessageSizeESet = maxResponseMessageSizeESet;
		maxResponseMessageSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_SESSION_REQUEST__MAX_RESPONSE_MESSAGE_SIZE, oldMaxResponseMessageSize, maxResponseMessageSize, !oldMaxResponseMessageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxResponseMessageSize() {
		long oldMaxResponseMessageSize = maxResponseMessageSize;
		boolean oldMaxResponseMessageSizeESet = maxResponseMessageSizeESet;
		maxResponseMessageSize = MAX_RESPONSE_MESSAGE_SIZE_EDEFAULT;
		maxResponseMessageSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_SESSION_REQUEST__MAX_RESPONSE_MESSAGE_SIZE, oldMaxResponseMessageSize, MAX_RESPONSE_MESSAGE_SIZE_EDEFAULT, oldMaxResponseMessageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxResponseMessageSize() {
		return maxResponseMessageSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.CREATE_SESSION_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.CREATE_SESSION_REQUEST__CLIENT_DESCRIPTION:
				return basicUnsetClientDescription(msgs);
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
			case TypesPackage.CREATE_SESSION_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.CREATE_SESSION_REQUEST__CLIENT_DESCRIPTION:
				return getClientDescription();
			case TypesPackage.CREATE_SESSION_REQUEST__SERVER_URI:
				return getServerUri();
			case TypesPackage.CREATE_SESSION_REQUEST__ENDPOINT_URL:
				return getEndpointUrl();
			case TypesPackage.CREATE_SESSION_REQUEST__SESSION_NAME:
				return getSessionName();
			case TypesPackage.CREATE_SESSION_REQUEST__CLIENT_NONCE:
				return getClientNonce();
			case TypesPackage.CREATE_SESSION_REQUEST__CLIENT_CERTIFICATE:
				return getClientCertificate();
			case TypesPackage.CREATE_SESSION_REQUEST__REQUESTED_SESSION_TIMEOUT:
				return getRequestedSessionTimeout();
			case TypesPackage.CREATE_SESSION_REQUEST__MAX_RESPONSE_MESSAGE_SIZE:
				return getMaxResponseMessageSize();
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
			case TypesPackage.CREATE_SESSION_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.CREATE_SESSION_REQUEST__CLIENT_DESCRIPTION:
				setClientDescription((ApplicationDescription)newValue);
				return;
			case TypesPackage.CREATE_SESSION_REQUEST__SERVER_URI:
				setServerUri((String)newValue);
				return;
			case TypesPackage.CREATE_SESSION_REQUEST__ENDPOINT_URL:
				setEndpointUrl((String)newValue);
				return;
			case TypesPackage.CREATE_SESSION_REQUEST__SESSION_NAME:
				setSessionName((String)newValue);
				return;
			case TypesPackage.CREATE_SESSION_REQUEST__CLIENT_NONCE:
				setClientNonce((byte[])newValue);
				return;
			case TypesPackage.CREATE_SESSION_REQUEST__CLIENT_CERTIFICATE:
				setClientCertificate((byte[])newValue);
				return;
			case TypesPackage.CREATE_SESSION_REQUEST__REQUESTED_SESSION_TIMEOUT:
				setRequestedSessionTimeout((Double)newValue);
				return;
			case TypesPackage.CREATE_SESSION_REQUEST__MAX_RESPONSE_MESSAGE_SIZE:
				setMaxResponseMessageSize((Long)newValue);
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
			case TypesPackage.CREATE_SESSION_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.CREATE_SESSION_REQUEST__CLIENT_DESCRIPTION:
				unsetClientDescription();
				return;
			case TypesPackage.CREATE_SESSION_REQUEST__SERVER_URI:
				unsetServerUri();
				return;
			case TypesPackage.CREATE_SESSION_REQUEST__ENDPOINT_URL:
				unsetEndpointUrl();
				return;
			case TypesPackage.CREATE_SESSION_REQUEST__SESSION_NAME:
				unsetSessionName();
				return;
			case TypesPackage.CREATE_SESSION_REQUEST__CLIENT_NONCE:
				unsetClientNonce();
				return;
			case TypesPackage.CREATE_SESSION_REQUEST__CLIENT_CERTIFICATE:
				unsetClientCertificate();
				return;
			case TypesPackage.CREATE_SESSION_REQUEST__REQUESTED_SESSION_TIMEOUT:
				unsetRequestedSessionTimeout();
				return;
			case TypesPackage.CREATE_SESSION_REQUEST__MAX_RESPONSE_MESSAGE_SIZE:
				unsetMaxResponseMessageSize();
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
			case TypesPackage.CREATE_SESSION_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.CREATE_SESSION_REQUEST__CLIENT_DESCRIPTION:
				return isSetClientDescription();
			case TypesPackage.CREATE_SESSION_REQUEST__SERVER_URI:
				return isSetServerUri();
			case TypesPackage.CREATE_SESSION_REQUEST__ENDPOINT_URL:
				return isSetEndpointUrl();
			case TypesPackage.CREATE_SESSION_REQUEST__SESSION_NAME:
				return isSetSessionName();
			case TypesPackage.CREATE_SESSION_REQUEST__CLIENT_NONCE:
				return isSetClientNonce();
			case TypesPackage.CREATE_SESSION_REQUEST__CLIENT_CERTIFICATE:
				return isSetClientCertificate();
			case TypesPackage.CREATE_SESSION_REQUEST__REQUESTED_SESSION_TIMEOUT:
				return isSetRequestedSessionTimeout();
			case TypesPackage.CREATE_SESSION_REQUEST__MAX_RESPONSE_MESSAGE_SIZE:
				return isSetMaxResponseMessageSize();
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
		result.append(" (serverUri: ");
		if (serverUriESet) result.append(serverUri); else result.append("<unset>");
		result.append(", endpointUrl: ");
		if (endpointUrlESet) result.append(endpointUrl); else result.append("<unset>");
		result.append(", sessionName: ");
		if (sessionNameESet) result.append(sessionName); else result.append("<unset>");
		result.append(", clientNonce: ");
		if (clientNonceESet) result.append(clientNonce); else result.append("<unset>");
		result.append(", clientCertificate: ");
		if (clientCertificateESet) result.append(clientCertificate); else result.append("<unset>");
		result.append(", requestedSessionTimeout: ");
		if (requestedSessionTimeoutESet) result.append(requestedSessionTimeout); else result.append("<unset>");
		result.append(", maxResponseMessageSize: ");
		if (maxResponseMessageSizeESet) result.append(maxResponseMessageSize); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CreateSessionRequestImpl
