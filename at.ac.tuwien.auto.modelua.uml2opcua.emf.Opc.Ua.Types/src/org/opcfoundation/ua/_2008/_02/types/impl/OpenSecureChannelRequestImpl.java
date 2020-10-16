/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.MessageSecurityMode;
import org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.SecurityTokenRequestType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Secure Channel Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.OpenSecureChannelRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.OpenSecureChannelRequestImpl#getClientProtocolVersion <em>Client Protocol Version</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.OpenSecureChannelRequestImpl#getRequestType <em>Request Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.OpenSecureChannelRequestImpl#getSecurityMode <em>Security Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.OpenSecureChannelRequestImpl#getClientNonce <em>Client Nonce</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.OpenSecureChannelRequestImpl#getRequestedLifetime <em>Requested Lifetime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenSecureChannelRequestImpl extends MinimalEObjectImpl.Container implements OpenSecureChannelRequest {
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
	 * The default value of the '{@link #getClientProtocolVersion() <em>Client Protocol Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientProtocolVersion()
	 * @generated
	 * @ordered
	 */
	protected static final long CLIENT_PROTOCOL_VERSION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getClientProtocolVersion() <em>Client Protocol Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientProtocolVersion()
	 * @generated
	 * @ordered
	 */
	protected long clientProtocolVersion = CLIENT_PROTOCOL_VERSION_EDEFAULT;

	/**
	 * This is true if the Client Protocol Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clientProtocolVersionESet;

	/**
	 * The default value of the '{@link #getRequestType() <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestType()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityTokenRequestType REQUEST_TYPE_EDEFAULT = SecurityTokenRequestType.ISSUE0;

	/**
	 * The cached value of the '{@link #getRequestType() <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestType()
	 * @generated
	 * @ordered
	 */
	protected SecurityTokenRequestType requestType = REQUEST_TYPE_EDEFAULT;

	/**
	 * This is true if the Request Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestTypeESet;

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
	 * The default value of the '{@link #getRequestedLifetime() <em>Requested Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedLifetime()
	 * @generated
	 * @ordered
	 */
	protected static final long REQUESTED_LIFETIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRequestedLifetime() <em>Requested Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedLifetime()
	 * @generated
	 * @ordered
	 */
	protected long requestedLifetime = REQUESTED_LIFETIME_EDEFAULT;

	/**
	 * This is true if the Requested Lifetime attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestedLifetimeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenSecureChannelRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getOpenSecureChannelRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
	public long getClientProtocolVersion() {
		return clientProtocolVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientProtocolVersion(long newClientProtocolVersion) {
		long oldClientProtocolVersion = clientProtocolVersion;
		clientProtocolVersion = newClientProtocolVersion;
		boolean oldClientProtocolVersionESet = clientProtocolVersionESet;
		clientProtocolVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__CLIENT_PROTOCOL_VERSION, oldClientProtocolVersion, clientProtocolVersion, !oldClientProtocolVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClientProtocolVersion() {
		long oldClientProtocolVersion = clientProtocolVersion;
		boolean oldClientProtocolVersionESet = clientProtocolVersionESet;
		clientProtocolVersion = CLIENT_PROTOCOL_VERSION_EDEFAULT;
		clientProtocolVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__CLIENT_PROTOCOL_VERSION, oldClientProtocolVersion, CLIENT_PROTOCOL_VERSION_EDEFAULT, oldClientProtocolVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClientProtocolVersion() {
		return clientProtocolVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityTokenRequestType getRequestType() {
		return requestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestType(SecurityTokenRequestType newRequestType) {
		SecurityTokenRequestType oldRequestType = requestType;
		requestType = newRequestType == null ? REQUEST_TYPE_EDEFAULT : newRequestType;
		boolean oldRequestTypeESet = requestTypeESet;
		requestTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUEST_TYPE, oldRequestType, requestType, !oldRequestTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestType() {
		SecurityTokenRequestType oldRequestType = requestType;
		boolean oldRequestTypeESet = requestTypeESet;
		requestType = REQUEST_TYPE_EDEFAULT;
		requestTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUEST_TYPE, oldRequestType, REQUEST_TYPE_EDEFAULT, oldRequestTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestType() {
		return requestTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__SECURITY_MODE, oldSecurityMode, securityMode, !oldSecurityModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__SECURITY_MODE, oldSecurityMode, SECURITY_MODE_EDEFAULT, oldSecurityModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__CLIENT_NONCE, oldClientNonce, clientNonce, !oldClientNonceESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__CLIENT_NONCE, oldClientNonce, CLIENT_NONCE_EDEFAULT, oldClientNonceESet));
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
	public long getRequestedLifetime() {
		return requestedLifetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedLifetime(long newRequestedLifetime) {
		long oldRequestedLifetime = requestedLifetime;
		requestedLifetime = newRequestedLifetime;
		boolean oldRequestedLifetimeESet = requestedLifetimeESet;
		requestedLifetimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUESTED_LIFETIME, oldRequestedLifetime, requestedLifetime, !oldRequestedLifetimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestedLifetime() {
		long oldRequestedLifetime = requestedLifetime;
		boolean oldRequestedLifetimeESet = requestedLifetimeESet;
		requestedLifetime = REQUESTED_LIFETIME_EDEFAULT;
		requestedLifetimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUESTED_LIFETIME, oldRequestedLifetime, REQUESTED_LIFETIME_EDEFAULT, oldRequestedLifetimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestedLifetime() {
		return requestedLifetimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
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
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__CLIENT_PROTOCOL_VERSION:
				return getClientProtocolVersion();
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUEST_TYPE:
				return getRequestType();
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__SECURITY_MODE:
				return getSecurityMode();
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__CLIENT_NONCE:
				return getClientNonce();
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUESTED_LIFETIME:
				return getRequestedLifetime();
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
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__CLIENT_PROTOCOL_VERSION:
				setClientProtocolVersion((Long)newValue);
				return;
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUEST_TYPE:
				setRequestType((SecurityTokenRequestType)newValue);
				return;
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__SECURITY_MODE:
				setSecurityMode((MessageSecurityMode)newValue);
				return;
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__CLIENT_NONCE:
				setClientNonce((byte[])newValue);
				return;
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUESTED_LIFETIME:
				setRequestedLifetime((Long)newValue);
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
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__CLIENT_PROTOCOL_VERSION:
				unsetClientProtocolVersion();
				return;
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUEST_TYPE:
				unsetRequestType();
				return;
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__SECURITY_MODE:
				unsetSecurityMode();
				return;
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__CLIENT_NONCE:
				unsetClientNonce();
				return;
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUESTED_LIFETIME:
				unsetRequestedLifetime();
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
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__CLIENT_PROTOCOL_VERSION:
				return isSetClientProtocolVersion();
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUEST_TYPE:
				return isSetRequestType();
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__SECURITY_MODE:
				return isSetSecurityMode();
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__CLIENT_NONCE:
				return isSetClientNonce();
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST__REQUESTED_LIFETIME:
				return isSetRequestedLifetime();
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
		result.append(" (clientProtocolVersion: ");
		if (clientProtocolVersionESet) result.append(clientProtocolVersion); else result.append("<unset>");
		result.append(", requestType: ");
		if (requestTypeESet) result.append(requestType); else result.append("<unset>");
		result.append(", securityMode: ");
		if (securityModeESet) result.append(securityMode); else result.append("<unset>");
		result.append(", clientNonce: ");
		if (clientNonceESet) result.append(clientNonce); else result.append("<unset>");
		result.append(", requestedLifetime: ");
		if (requestedLifetimeESet) result.append(requestedLifetime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OpenSecureChannelRequestImpl
