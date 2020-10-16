/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ActivateSessionRequest;
import org.opcfoundation.ua._2008._02.types.ExtensionObject;
import org.opcfoundation.ua._2008._02.types.ListOfSignedSoftwareCertificate;
import org.opcfoundation.ua._2008._02.types.ListOfString;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.SignatureData;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activate Session Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ActivateSessionRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ActivateSessionRequestImpl#getClientSignature <em>Client Signature</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ActivateSessionRequestImpl#getClientSoftwareCertificates <em>Client Software Certificates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ActivateSessionRequestImpl#getLocaleIds <em>Locale Ids</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ActivateSessionRequestImpl#getUserIdentityToken <em>User Identity Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ActivateSessionRequestImpl#getUserTokenSignature <em>User Token Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivateSessionRequestImpl extends MinimalEObjectImpl.Container implements ActivateSessionRequest {
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
	 * The cached value of the '{@link #getClientSignature() <em>Client Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientSignature()
	 * @generated
	 * @ordered
	 */
	protected SignatureData clientSignature;

	/**
	 * This is true if the Client Signature containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clientSignatureESet;

	/**
	 * The cached value of the '{@link #getClientSoftwareCertificates() <em>Client Software Certificates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientSoftwareCertificates()
	 * @generated
	 * @ordered
	 */
	protected ListOfSignedSoftwareCertificate clientSoftwareCertificates;

	/**
	 * This is true if the Client Software Certificates containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clientSoftwareCertificatesESet;

	/**
	 * The cached value of the '{@link #getLocaleIds() <em>Locale Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleIds()
	 * @generated
	 * @ordered
	 */
	protected ListOfString localeIds;

	/**
	 * This is true if the Locale Ids containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean localeIdsESet;

	/**
	 * The cached value of the '{@link #getUserIdentityToken() <em>User Identity Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserIdentityToken()
	 * @generated
	 * @ordered
	 */
	protected ExtensionObject userIdentityToken;

	/**
	 * This is true if the User Identity Token containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userIdentityTokenESet;

	/**
	 * The cached value of the '{@link #getUserTokenSignature() <em>User Token Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTokenSignature()
	 * @generated
	 * @ordered
	 */
	protected SignatureData userTokenSignature;

	/**
	 * This is true if the User Token Signature containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userTokenSignatureESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivateSessionRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getActivateSessionRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
	public SignatureData getClientSignature() {
		return clientSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClientSignature(SignatureData newClientSignature, NotificationChain msgs) {
		SignatureData oldClientSignature = clientSignature;
		clientSignature = newClientSignature;
		boolean oldClientSignatureESet = clientSignatureESet;
		clientSignatureESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SIGNATURE, oldClientSignature, newClientSignature, !oldClientSignatureESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientSignature(SignatureData newClientSignature) {
		if (newClientSignature != clientSignature) {
			NotificationChain msgs = null;
			if (clientSignature != null)
				msgs = ((InternalEObject)clientSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SIGNATURE, null, msgs);
			if (newClientSignature != null)
				msgs = ((InternalEObject)newClientSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SIGNATURE, null, msgs);
			msgs = basicSetClientSignature(newClientSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldClientSignatureESet = clientSignatureESet;
			clientSignatureESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SIGNATURE, newClientSignature, newClientSignature, !oldClientSignatureESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetClientSignature(NotificationChain msgs) {
		SignatureData oldClientSignature = clientSignature;
		clientSignature = null;
		boolean oldClientSignatureESet = clientSignatureESet;
		clientSignatureESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SIGNATURE, oldClientSignature, null, oldClientSignatureESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClientSignature() {
		if (clientSignature != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)clientSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SIGNATURE, null, msgs);
			msgs = basicUnsetClientSignature(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldClientSignatureESet = clientSignatureESet;
			clientSignatureESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SIGNATURE, null, null, oldClientSignatureESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClientSignature() {
		return clientSignatureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSignedSoftwareCertificate getClientSoftwareCertificates() {
		return clientSoftwareCertificates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClientSoftwareCertificates(ListOfSignedSoftwareCertificate newClientSoftwareCertificates, NotificationChain msgs) {
		ListOfSignedSoftwareCertificate oldClientSoftwareCertificates = clientSoftwareCertificates;
		clientSoftwareCertificates = newClientSoftwareCertificates;
		boolean oldClientSoftwareCertificatesESet = clientSoftwareCertificatesESet;
		clientSoftwareCertificatesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SOFTWARE_CERTIFICATES, oldClientSoftwareCertificates, newClientSoftwareCertificates, !oldClientSoftwareCertificatesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientSoftwareCertificates(ListOfSignedSoftwareCertificate newClientSoftwareCertificates) {
		if (newClientSoftwareCertificates != clientSoftwareCertificates) {
			NotificationChain msgs = null;
			if (clientSoftwareCertificates != null)
				msgs = ((InternalEObject)clientSoftwareCertificates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SOFTWARE_CERTIFICATES, null, msgs);
			if (newClientSoftwareCertificates != null)
				msgs = ((InternalEObject)newClientSoftwareCertificates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SOFTWARE_CERTIFICATES, null, msgs);
			msgs = basicSetClientSoftwareCertificates(newClientSoftwareCertificates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldClientSoftwareCertificatesESet = clientSoftwareCertificatesESet;
			clientSoftwareCertificatesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SOFTWARE_CERTIFICATES, newClientSoftwareCertificates, newClientSoftwareCertificates, !oldClientSoftwareCertificatesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetClientSoftwareCertificates(NotificationChain msgs) {
		ListOfSignedSoftwareCertificate oldClientSoftwareCertificates = clientSoftwareCertificates;
		clientSoftwareCertificates = null;
		boolean oldClientSoftwareCertificatesESet = clientSoftwareCertificatesESet;
		clientSoftwareCertificatesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SOFTWARE_CERTIFICATES, oldClientSoftwareCertificates, null, oldClientSoftwareCertificatesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClientSoftwareCertificates() {
		if (clientSoftwareCertificates != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)clientSoftwareCertificates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SOFTWARE_CERTIFICATES, null, msgs);
			msgs = basicUnsetClientSoftwareCertificates(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldClientSoftwareCertificatesESet = clientSoftwareCertificatesESet;
			clientSoftwareCertificatesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SOFTWARE_CERTIFICATES, null, null, oldClientSoftwareCertificatesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClientSoftwareCertificates() {
		return clientSoftwareCertificatesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfString getLocaleIds() {
		return localeIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocaleIds(ListOfString newLocaleIds, NotificationChain msgs) {
		ListOfString oldLocaleIds = localeIds;
		localeIds = newLocaleIds;
		boolean oldLocaleIdsESet = localeIdsESet;
		localeIdsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_REQUEST__LOCALE_IDS, oldLocaleIds, newLocaleIds, !oldLocaleIdsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocaleIds(ListOfString newLocaleIds) {
		if (newLocaleIds != localeIds) {
			NotificationChain msgs = null;
			if (localeIds != null)
				msgs = ((InternalEObject)localeIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_REQUEST__LOCALE_IDS, null, msgs);
			if (newLocaleIds != null)
				msgs = ((InternalEObject)newLocaleIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_REQUEST__LOCALE_IDS, null, msgs);
			msgs = basicSetLocaleIds(newLocaleIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLocaleIdsESet = localeIdsESet;
			localeIdsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_REQUEST__LOCALE_IDS, newLocaleIds, newLocaleIds, !oldLocaleIdsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetLocaleIds(NotificationChain msgs) {
		ListOfString oldLocaleIds = localeIds;
		localeIds = null;
		boolean oldLocaleIdsESet = localeIdsESet;
		localeIdsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_REQUEST__LOCALE_IDS, oldLocaleIds, null, oldLocaleIdsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocaleIds() {
		if (localeIds != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)localeIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_REQUEST__LOCALE_IDS, null, msgs);
			msgs = basicUnsetLocaleIds(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLocaleIdsESet = localeIdsESet;
			localeIdsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_REQUEST__LOCALE_IDS, null, null, oldLocaleIdsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocaleIds() {
		return localeIdsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionObject getUserIdentityToken() {
		return userIdentityToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserIdentityToken(ExtensionObject newUserIdentityToken, NotificationChain msgs) {
		ExtensionObject oldUserIdentityToken = userIdentityToken;
		userIdentityToken = newUserIdentityToken;
		boolean oldUserIdentityTokenESet = userIdentityTokenESet;
		userIdentityTokenESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_REQUEST__USER_IDENTITY_TOKEN, oldUserIdentityToken, newUserIdentityToken, !oldUserIdentityTokenESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserIdentityToken(ExtensionObject newUserIdentityToken) {
		if (newUserIdentityToken != userIdentityToken) {
			NotificationChain msgs = null;
			if (userIdentityToken != null)
				msgs = ((InternalEObject)userIdentityToken).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_REQUEST__USER_IDENTITY_TOKEN, null, msgs);
			if (newUserIdentityToken != null)
				msgs = ((InternalEObject)newUserIdentityToken).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_REQUEST__USER_IDENTITY_TOKEN, null, msgs);
			msgs = basicSetUserIdentityToken(newUserIdentityToken, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldUserIdentityTokenESet = userIdentityTokenESet;
			userIdentityTokenESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_REQUEST__USER_IDENTITY_TOKEN, newUserIdentityToken, newUserIdentityToken, !oldUserIdentityTokenESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetUserIdentityToken(NotificationChain msgs) {
		ExtensionObject oldUserIdentityToken = userIdentityToken;
		userIdentityToken = null;
		boolean oldUserIdentityTokenESet = userIdentityTokenESet;
		userIdentityTokenESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_REQUEST__USER_IDENTITY_TOKEN, oldUserIdentityToken, null, oldUserIdentityTokenESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserIdentityToken() {
		if (userIdentityToken != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)userIdentityToken).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_REQUEST__USER_IDENTITY_TOKEN, null, msgs);
			msgs = basicUnsetUserIdentityToken(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldUserIdentityTokenESet = userIdentityTokenESet;
			userIdentityTokenESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_REQUEST__USER_IDENTITY_TOKEN, null, null, oldUserIdentityTokenESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserIdentityToken() {
		return userIdentityTokenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureData getUserTokenSignature() {
		return userTokenSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserTokenSignature(SignatureData newUserTokenSignature, NotificationChain msgs) {
		SignatureData oldUserTokenSignature = userTokenSignature;
		userTokenSignature = newUserTokenSignature;
		boolean oldUserTokenSignatureESet = userTokenSignatureESet;
		userTokenSignatureESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_REQUEST__USER_TOKEN_SIGNATURE, oldUserTokenSignature, newUserTokenSignature, !oldUserTokenSignatureESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserTokenSignature(SignatureData newUserTokenSignature) {
		if (newUserTokenSignature != userTokenSignature) {
			NotificationChain msgs = null;
			if (userTokenSignature != null)
				msgs = ((InternalEObject)userTokenSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_REQUEST__USER_TOKEN_SIGNATURE, null, msgs);
			if (newUserTokenSignature != null)
				msgs = ((InternalEObject)newUserTokenSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_REQUEST__USER_TOKEN_SIGNATURE, null, msgs);
			msgs = basicSetUserTokenSignature(newUserTokenSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldUserTokenSignatureESet = userTokenSignatureESet;
			userTokenSignatureESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_REQUEST__USER_TOKEN_SIGNATURE, newUserTokenSignature, newUserTokenSignature, !oldUserTokenSignatureESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetUserTokenSignature(NotificationChain msgs) {
		SignatureData oldUserTokenSignature = userTokenSignature;
		userTokenSignature = null;
		boolean oldUserTokenSignatureESet = userTokenSignatureESet;
		userTokenSignatureESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_REQUEST__USER_TOKEN_SIGNATURE, oldUserTokenSignature, null, oldUserTokenSignatureESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserTokenSignature() {
		if (userTokenSignature != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)userTokenSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_REQUEST__USER_TOKEN_SIGNATURE, null, msgs);
			msgs = basicUnsetUserTokenSignature(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldUserTokenSignatureESet = userTokenSignatureESet;
			userTokenSignatureESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_REQUEST__USER_TOKEN_SIGNATURE, null, null, oldUserTokenSignatureESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserTokenSignature() {
		return userTokenSignatureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.ACTIVATE_SESSION_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SIGNATURE:
				return basicUnsetClientSignature(msgs);
			case TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SOFTWARE_CERTIFICATES:
				return basicUnsetClientSoftwareCertificates(msgs);
			case TypesPackage.ACTIVATE_SESSION_REQUEST__LOCALE_IDS:
				return basicUnsetLocaleIds(msgs);
			case TypesPackage.ACTIVATE_SESSION_REQUEST__USER_IDENTITY_TOKEN:
				return basicUnsetUserIdentityToken(msgs);
			case TypesPackage.ACTIVATE_SESSION_REQUEST__USER_TOKEN_SIGNATURE:
				return basicUnsetUserTokenSignature(msgs);
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
			case TypesPackage.ACTIVATE_SESSION_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SIGNATURE:
				return getClientSignature();
			case TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SOFTWARE_CERTIFICATES:
				return getClientSoftwareCertificates();
			case TypesPackage.ACTIVATE_SESSION_REQUEST__LOCALE_IDS:
				return getLocaleIds();
			case TypesPackage.ACTIVATE_SESSION_REQUEST__USER_IDENTITY_TOKEN:
				return getUserIdentityToken();
			case TypesPackage.ACTIVATE_SESSION_REQUEST__USER_TOKEN_SIGNATURE:
				return getUserTokenSignature();
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
			case TypesPackage.ACTIVATE_SESSION_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SIGNATURE:
				setClientSignature((SignatureData)newValue);
				return;
			case TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SOFTWARE_CERTIFICATES:
				setClientSoftwareCertificates((ListOfSignedSoftwareCertificate)newValue);
				return;
			case TypesPackage.ACTIVATE_SESSION_REQUEST__LOCALE_IDS:
				setLocaleIds((ListOfString)newValue);
				return;
			case TypesPackage.ACTIVATE_SESSION_REQUEST__USER_IDENTITY_TOKEN:
				setUserIdentityToken((ExtensionObject)newValue);
				return;
			case TypesPackage.ACTIVATE_SESSION_REQUEST__USER_TOKEN_SIGNATURE:
				setUserTokenSignature((SignatureData)newValue);
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
			case TypesPackage.ACTIVATE_SESSION_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SIGNATURE:
				unsetClientSignature();
				return;
			case TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SOFTWARE_CERTIFICATES:
				unsetClientSoftwareCertificates();
				return;
			case TypesPackage.ACTIVATE_SESSION_REQUEST__LOCALE_IDS:
				unsetLocaleIds();
				return;
			case TypesPackage.ACTIVATE_SESSION_REQUEST__USER_IDENTITY_TOKEN:
				unsetUserIdentityToken();
				return;
			case TypesPackage.ACTIVATE_SESSION_REQUEST__USER_TOKEN_SIGNATURE:
				unsetUserTokenSignature();
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
			case TypesPackage.ACTIVATE_SESSION_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SIGNATURE:
				return isSetClientSignature();
			case TypesPackage.ACTIVATE_SESSION_REQUEST__CLIENT_SOFTWARE_CERTIFICATES:
				return isSetClientSoftwareCertificates();
			case TypesPackage.ACTIVATE_SESSION_REQUEST__LOCALE_IDS:
				return isSetLocaleIds();
			case TypesPackage.ACTIVATE_SESSION_REQUEST__USER_IDENTITY_TOKEN:
				return isSetUserIdentityToken();
			case TypesPackage.ACTIVATE_SESSION_REQUEST__USER_TOKEN_SIGNATURE:
				return isSetUserTokenSignature();
		}
		return super.eIsSet(featureID);
	}

} //ActivateSessionRequestImpl
