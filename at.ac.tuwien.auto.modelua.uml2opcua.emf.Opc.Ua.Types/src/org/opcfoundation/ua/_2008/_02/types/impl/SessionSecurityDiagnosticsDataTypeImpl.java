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
import org.opcfoundation.ua._2008._02.types.MessageSecurityMode;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session Security Diagnostics Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionSecurityDiagnosticsDataTypeImpl#getSessionId <em>Session Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionSecurityDiagnosticsDataTypeImpl#getClientUserIdOfSession <em>Client User Id Of Session</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionSecurityDiagnosticsDataTypeImpl#getClientUserIdHistory <em>Client User Id History</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionSecurityDiagnosticsDataTypeImpl#getAuthenticationMechanism <em>Authentication Mechanism</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionSecurityDiagnosticsDataTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionSecurityDiagnosticsDataTypeImpl#getTransportProtocol <em>Transport Protocol</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionSecurityDiagnosticsDataTypeImpl#getSecurityMode <em>Security Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionSecurityDiagnosticsDataTypeImpl#getSecurityPolicyUri <em>Security Policy Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionSecurityDiagnosticsDataTypeImpl#getClientCertificate <em>Client Certificate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SessionSecurityDiagnosticsDataTypeImpl extends MinimalEObjectImpl.Container implements SessionSecurityDiagnosticsDataType {
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
	 * The default value of the '{@link #getClientUserIdOfSession() <em>Client User Id Of Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientUserIdOfSession()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_USER_ID_OF_SESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientUserIdOfSession() <em>Client User Id Of Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientUserIdOfSession()
	 * @generated
	 * @ordered
	 */
	protected String clientUserIdOfSession = CLIENT_USER_ID_OF_SESSION_EDEFAULT;

	/**
	 * This is true if the Client User Id Of Session attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clientUserIdOfSessionESet;

	/**
	 * The cached value of the '{@link #getClientUserIdHistory() <em>Client User Id History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientUserIdHistory()
	 * @generated
	 * @ordered
	 */
	protected ListOfString clientUserIdHistory;

	/**
	 * This is true if the Client User Id History containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clientUserIdHistoryESet;

	/**
	 * The default value of the '{@link #getAuthenticationMechanism() <em>Authentication Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHENTICATION_MECHANISM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthenticationMechanism() <em>Authentication Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMechanism()
	 * @generated
	 * @ordered
	 */
	protected String authenticationMechanism = AUTHENTICATION_MECHANISM_EDEFAULT;

	/**
	 * This is true if the Authentication Mechanism attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean authenticationMechanismESet;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * This is true if the Encoding attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean encodingESet;

	/**
	 * The default value of the '{@link #getTransportProtocol() <em>Transport Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSPORT_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransportProtocol() <em>Transport Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportProtocol()
	 * @generated
	 * @ordered
	 */
	protected String transportProtocol = TRANSPORT_PROTOCOL_EDEFAULT;

	/**
	 * This is true if the Transport Protocol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportProtocolESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionSecurityDiagnosticsDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getSessionSecurityDiagnosticsDataType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_ID, oldSessionId, newSessionId, !oldSessionIdESet);
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
				msgs = ((InternalEObject)sessionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_ID, null, msgs);
			if (newSessionId != null)
				msgs = ((InternalEObject)newSessionId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_ID, null, msgs);
			msgs = basicSetSessionId(newSessionId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSessionIdESet = sessionIdESet;
			sessionIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_ID, newSessionId, newSessionId, !oldSessionIdESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_ID, oldSessionId, null, oldSessionIdESet);
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
			msgs = ((InternalEObject)sessionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_ID, null, msgs);
			msgs = basicUnsetSessionId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSessionIdESet = sessionIdESet;
			sessionIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_ID, null, null, oldSessionIdESet));
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
	public String getClientUserIdOfSession() {
		return clientUserIdOfSession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientUserIdOfSession(String newClientUserIdOfSession) {
		String oldClientUserIdOfSession = clientUserIdOfSession;
		clientUserIdOfSession = newClientUserIdOfSession;
		boolean oldClientUserIdOfSessionESet = clientUserIdOfSessionESet;
		clientUserIdOfSessionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_OF_SESSION, oldClientUserIdOfSession, clientUserIdOfSession, !oldClientUserIdOfSessionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClientUserIdOfSession() {
		String oldClientUserIdOfSession = clientUserIdOfSession;
		boolean oldClientUserIdOfSessionESet = clientUserIdOfSessionESet;
		clientUserIdOfSession = CLIENT_USER_ID_OF_SESSION_EDEFAULT;
		clientUserIdOfSessionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_OF_SESSION, oldClientUserIdOfSession, CLIENT_USER_ID_OF_SESSION_EDEFAULT, oldClientUserIdOfSessionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClientUserIdOfSession() {
		return clientUserIdOfSessionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfString getClientUserIdHistory() {
		return clientUserIdHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClientUserIdHistory(ListOfString newClientUserIdHistory, NotificationChain msgs) {
		ListOfString oldClientUserIdHistory = clientUserIdHistory;
		clientUserIdHistory = newClientUserIdHistory;
		boolean oldClientUserIdHistoryESet = clientUserIdHistoryESet;
		clientUserIdHistoryESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_HISTORY, oldClientUserIdHistory, newClientUserIdHistory, !oldClientUserIdHistoryESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientUserIdHistory(ListOfString newClientUserIdHistory) {
		if (newClientUserIdHistory != clientUserIdHistory) {
			NotificationChain msgs = null;
			if (clientUserIdHistory != null)
				msgs = ((InternalEObject)clientUserIdHistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_HISTORY, null, msgs);
			if (newClientUserIdHistory != null)
				msgs = ((InternalEObject)newClientUserIdHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_HISTORY, null, msgs);
			msgs = basicSetClientUserIdHistory(newClientUserIdHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldClientUserIdHistoryESet = clientUserIdHistoryESet;
			clientUserIdHistoryESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_HISTORY, newClientUserIdHistory, newClientUserIdHistory, !oldClientUserIdHistoryESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetClientUserIdHistory(NotificationChain msgs) {
		ListOfString oldClientUserIdHistory = clientUserIdHistory;
		clientUserIdHistory = null;
		boolean oldClientUserIdHistoryESet = clientUserIdHistoryESet;
		clientUserIdHistoryESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_HISTORY, oldClientUserIdHistory, null, oldClientUserIdHistoryESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClientUserIdHistory() {
		if (clientUserIdHistory != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)clientUserIdHistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_HISTORY, null, msgs);
			msgs = basicUnsetClientUserIdHistory(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldClientUserIdHistoryESet = clientUserIdHistoryESet;
			clientUserIdHistoryESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_HISTORY, null, null, oldClientUserIdHistoryESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClientUserIdHistory() {
		return clientUserIdHistoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthenticationMechanism() {
		return authenticationMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticationMechanism(String newAuthenticationMechanism) {
		String oldAuthenticationMechanism = authenticationMechanism;
		authenticationMechanism = newAuthenticationMechanism;
		boolean oldAuthenticationMechanismESet = authenticationMechanismESet;
		authenticationMechanismESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__AUTHENTICATION_MECHANISM, oldAuthenticationMechanism, authenticationMechanism, !oldAuthenticationMechanismESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAuthenticationMechanism() {
		String oldAuthenticationMechanism = authenticationMechanism;
		boolean oldAuthenticationMechanismESet = authenticationMechanismESet;
		authenticationMechanism = AUTHENTICATION_MECHANISM_EDEFAULT;
		authenticationMechanismESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__AUTHENTICATION_MECHANISM, oldAuthenticationMechanism, AUTHENTICATION_MECHANISM_EDEFAULT, oldAuthenticationMechanismESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAuthenticationMechanism() {
		return authenticationMechanismESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		boolean oldEncodingESet = encodingESet;
		encodingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__ENCODING, oldEncoding, encoding, !oldEncodingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEncoding() {
		String oldEncoding = encoding;
		boolean oldEncodingESet = encodingESet;
		encoding = ENCODING_EDEFAULT;
		encodingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__ENCODING, oldEncoding, ENCODING_EDEFAULT, oldEncodingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEncoding() {
		return encodingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransportProtocol() {
		return transportProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportProtocol(String newTransportProtocol) {
		String oldTransportProtocol = transportProtocol;
		transportProtocol = newTransportProtocol;
		boolean oldTransportProtocolESet = transportProtocolESet;
		transportProtocolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__TRANSPORT_PROTOCOL, oldTransportProtocol, transportProtocol, !oldTransportProtocolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransportProtocol() {
		String oldTransportProtocol = transportProtocol;
		boolean oldTransportProtocolESet = transportProtocolESet;
		transportProtocol = TRANSPORT_PROTOCOL_EDEFAULT;
		transportProtocolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__TRANSPORT_PROTOCOL, oldTransportProtocol, TRANSPORT_PROTOCOL_EDEFAULT, oldTransportProtocolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransportProtocol() {
		return transportProtocolESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SECURITY_MODE, oldSecurityMode, securityMode, !oldSecurityModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SECURITY_MODE, oldSecurityMode, SECURITY_MODE_EDEFAULT, oldSecurityModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SECURITY_POLICY_URI, oldSecurityPolicyUri, securityPolicyUri, !oldSecurityPolicyUriESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SECURITY_POLICY_URI, oldSecurityPolicyUri, SECURITY_POLICY_URI_EDEFAULT, oldSecurityPolicyUriESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_CERTIFICATE, oldClientCertificate, clientCertificate, !oldClientCertificateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_CERTIFICATE, oldClientCertificate, CLIENT_CERTIFICATE_EDEFAULT, oldClientCertificateESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_ID:
				return basicUnsetSessionId(msgs);
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_HISTORY:
				return basicUnsetClientUserIdHistory(msgs);
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
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_ID:
				return getSessionId();
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_OF_SESSION:
				return getClientUserIdOfSession();
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_HISTORY:
				return getClientUserIdHistory();
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__AUTHENTICATION_MECHANISM:
				return getAuthenticationMechanism();
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__ENCODING:
				return getEncoding();
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__TRANSPORT_PROTOCOL:
				return getTransportProtocol();
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SECURITY_MODE:
				return getSecurityMode();
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SECURITY_POLICY_URI:
				return getSecurityPolicyUri();
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_CERTIFICATE:
				return getClientCertificate();
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
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_ID:
				setSessionId((NodeId)newValue);
				return;
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_OF_SESSION:
				setClientUserIdOfSession((String)newValue);
				return;
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_HISTORY:
				setClientUserIdHistory((ListOfString)newValue);
				return;
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__AUTHENTICATION_MECHANISM:
				setAuthenticationMechanism((String)newValue);
				return;
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__ENCODING:
				setEncoding((String)newValue);
				return;
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__TRANSPORT_PROTOCOL:
				setTransportProtocol((String)newValue);
				return;
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SECURITY_MODE:
				setSecurityMode((MessageSecurityMode)newValue);
				return;
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SECURITY_POLICY_URI:
				setSecurityPolicyUri((String)newValue);
				return;
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_CERTIFICATE:
				setClientCertificate((byte[])newValue);
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
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_ID:
				unsetSessionId();
				return;
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_OF_SESSION:
				unsetClientUserIdOfSession();
				return;
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_HISTORY:
				unsetClientUserIdHistory();
				return;
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__AUTHENTICATION_MECHANISM:
				unsetAuthenticationMechanism();
				return;
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__ENCODING:
				unsetEncoding();
				return;
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__TRANSPORT_PROTOCOL:
				unsetTransportProtocol();
				return;
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SECURITY_MODE:
				unsetSecurityMode();
				return;
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SECURITY_POLICY_URI:
				unsetSecurityPolicyUri();
				return;
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_CERTIFICATE:
				unsetClientCertificate();
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
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SESSION_ID:
				return isSetSessionId();
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_OF_SESSION:
				return isSetClientUserIdOfSession();
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_USER_ID_HISTORY:
				return isSetClientUserIdHistory();
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__AUTHENTICATION_MECHANISM:
				return isSetAuthenticationMechanism();
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__ENCODING:
				return isSetEncoding();
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__TRANSPORT_PROTOCOL:
				return isSetTransportProtocol();
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SECURITY_MODE:
				return isSetSecurityMode();
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__SECURITY_POLICY_URI:
				return isSetSecurityPolicyUri();
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE__CLIENT_CERTIFICATE:
				return isSetClientCertificate();
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
		result.append(" (clientUserIdOfSession: ");
		if (clientUserIdOfSessionESet) result.append(clientUserIdOfSession); else result.append("<unset>");
		result.append(", authenticationMechanism: ");
		if (authenticationMechanismESet) result.append(authenticationMechanism); else result.append("<unset>");
		result.append(", encoding: ");
		if (encodingESet) result.append(encoding); else result.append("<unset>");
		result.append(", transportProtocol: ");
		if (transportProtocolESet) result.append(transportProtocol); else result.append("<unset>");
		result.append(", securityMode: ");
		if (securityModeESet) result.append(securityMode); else result.append("<unset>");
		result.append(", securityPolicyUri: ");
		if (securityPolicyUriESet) result.append(securityPolicyUri); else result.append("<unset>");
		result.append(", clientCertificate: ");
		if (clientCertificateESet) result.append(clientCertificate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SessionSecurityDiagnosticsDataTypeImpl
