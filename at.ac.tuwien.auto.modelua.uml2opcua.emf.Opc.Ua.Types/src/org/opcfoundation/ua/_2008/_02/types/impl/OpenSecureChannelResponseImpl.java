/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ChannelSecurityToken;
import org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse;
import org.opcfoundation.ua._2008._02.types.ResponseHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Secure Channel Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.OpenSecureChannelResponseImpl#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.OpenSecureChannelResponseImpl#getServerProtocolVersion <em>Server Protocol Version</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.OpenSecureChannelResponseImpl#getSecurityToken <em>Security Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.OpenSecureChannelResponseImpl#getServerNonce <em>Server Nonce</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenSecureChannelResponseImpl extends MinimalEObjectImpl.Container implements OpenSecureChannelResponse {
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
	 * The default value of the '{@link #getServerProtocolVersion() <em>Server Protocol Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerProtocolVersion()
	 * @generated
	 * @ordered
	 */
	protected static final long SERVER_PROTOCOL_VERSION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getServerProtocolVersion() <em>Server Protocol Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerProtocolVersion()
	 * @generated
	 * @ordered
	 */
	protected long serverProtocolVersion = SERVER_PROTOCOL_VERSION_EDEFAULT;

	/**
	 * This is true if the Server Protocol Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverProtocolVersionESet;

	/**
	 * The cached value of the '{@link #getSecurityToken() <em>Security Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityToken()
	 * @generated
	 * @ordered
	 */
	protected ChannelSecurityToken securityToken;

	/**
	 * This is true if the Security Token containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securityTokenESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenSecureChannelResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getOpenSecureChannelResponse();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__RESPONSE_HEADER, oldResponseHeader, newResponseHeader, !oldResponseHeaderESet);
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
				msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__RESPONSE_HEADER, null, msgs);
			if (newResponseHeader != null)
				msgs = ((InternalEObject)newResponseHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicSetResponseHeader(newResponseHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__RESPONSE_HEADER, newResponseHeader, newResponseHeader, !oldResponseHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__RESPONSE_HEADER, oldResponseHeader, null, oldResponseHeaderESet);
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
			msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicUnsetResponseHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__RESPONSE_HEADER, null, null, oldResponseHeaderESet));
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
	public long getServerProtocolVersion() {
		return serverProtocolVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerProtocolVersion(long newServerProtocolVersion) {
		long oldServerProtocolVersion = serverProtocolVersion;
		serverProtocolVersion = newServerProtocolVersion;
		boolean oldServerProtocolVersionESet = serverProtocolVersionESet;
		serverProtocolVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SERVER_PROTOCOL_VERSION, oldServerProtocolVersion, serverProtocolVersion, !oldServerProtocolVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerProtocolVersion() {
		long oldServerProtocolVersion = serverProtocolVersion;
		boolean oldServerProtocolVersionESet = serverProtocolVersionESet;
		serverProtocolVersion = SERVER_PROTOCOL_VERSION_EDEFAULT;
		serverProtocolVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SERVER_PROTOCOL_VERSION, oldServerProtocolVersion, SERVER_PROTOCOL_VERSION_EDEFAULT, oldServerProtocolVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerProtocolVersion() {
		return serverProtocolVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelSecurityToken getSecurityToken() {
		return securityToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityToken(ChannelSecurityToken newSecurityToken, NotificationChain msgs) {
		ChannelSecurityToken oldSecurityToken = securityToken;
		securityToken = newSecurityToken;
		boolean oldSecurityTokenESet = securityTokenESet;
		securityTokenESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SECURITY_TOKEN, oldSecurityToken, newSecurityToken, !oldSecurityTokenESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityToken(ChannelSecurityToken newSecurityToken) {
		if (newSecurityToken != securityToken) {
			NotificationChain msgs = null;
			if (securityToken != null)
				msgs = ((InternalEObject)securityToken).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SECURITY_TOKEN, null, msgs);
			if (newSecurityToken != null)
				msgs = ((InternalEObject)newSecurityToken).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SECURITY_TOKEN, null, msgs);
			msgs = basicSetSecurityToken(newSecurityToken, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSecurityTokenESet = securityTokenESet;
			securityTokenESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SECURITY_TOKEN, newSecurityToken, newSecurityToken, !oldSecurityTokenESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSecurityToken(NotificationChain msgs) {
		ChannelSecurityToken oldSecurityToken = securityToken;
		securityToken = null;
		boolean oldSecurityTokenESet = securityTokenESet;
		securityTokenESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SECURITY_TOKEN, oldSecurityToken, null, oldSecurityTokenESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurityToken() {
		if (securityToken != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)securityToken).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SECURITY_TOKEN, null, msgs);
			msgs = basicUnsetSecurityToken(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSecurityTokenESet = securityTokenESet;
			securityTokenESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SECURITY_TOKEN, null, null, oldSecurityTokenESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecurityToken() {
		return securityTokenESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SERVER_NONCE, oldServerNonce, serverNonce, !oldServerNonceESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SERVER_NONCE, oldServerNonce, SERVER_NONCE_EDEFAULT, oldServerNonceESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__RESPONSE_HEADER:
				return basicUnsetResponseHeader(msgs);
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SECURITY_TOKEN:
				return basicUnsetSecurityToken(msgs);
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
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__RESPONSE_HEADER:
				return getResponseHeader();
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SERVER_PROTOCOL_VERSION:
				return getServerProtocolVersion();
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SECURITY_TOKEN:
				return getSecurityToken();
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SERVER_NONCE:
				return getServerNonce();
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
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__RESPONSE_HEADER:
				setResponseHeader((ResponseHeader)newValue);
				return;
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SERVER_PROTOCOL_VERSION:
				setServerProtocolVersion((Long)newValue);
				return;
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SECURITY_TOKEN:
				setSecurityToken((ChannelSecurityToken)newValue);
				return;
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SERVER_NONCE:
				setServerNonce((byte[])newValue);
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
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__RESPONSE_HEADER:
				unsetResponseHeader();
				return;
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SERVER_PROTOCOL_VERSION:
				unsetServerProtocolVersion();
				return;
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SECURITY_TOKEN:
				unsetSecurityToken();
				return;
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SERVER_NONCE:
				unsetServerNonce();
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
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__RESPONSE_HEADER:
				return isSetResponseHeader();
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SERVER_PROTOCOL_VERSION:
				return isSetServerProtocolVersion();
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SECURITY_TOKEN:
				return isSetSecurityToken();
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE__SERVER_NONCE:
				return isSetServerNonce();
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
		result.append(" (serverProtocolVersion: ");
		if (serverProtocolVersionESet) result.append(serverProtocolVersion); else result.append("<unset>");
		result.append(", serverNonce: ");
		if (serverNonceESet) result.append(serverNonce); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OpenSecureChannelResponseImpl
