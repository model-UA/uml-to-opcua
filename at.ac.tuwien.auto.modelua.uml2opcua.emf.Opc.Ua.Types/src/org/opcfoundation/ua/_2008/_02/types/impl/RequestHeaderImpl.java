/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ExtensionObject;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RequestHeaderImpl#getAuthenticationToken <em>Authentication Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RequestHeaderImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RequestHeaderImpl#getRequestHandle <em>Request Handle</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RequestHeaderImpl#getReturnDiagnostics <em>Return Diagnostics</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RequestHeaderImpl#getAuditEntryId <em>Audit Entry Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RequestHeaderImpl#getTimeoutHint <em>Timeout Hint</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RequestHeaderImpl#getAdditionalHeader <em>Additional Header</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestHeaderImpl extends MinimalEObjectImpl.Container implements RequestHeader {
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
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestHandle() <em>Request Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestHandle()
	 * @generated
	 * @ordered
	 */
	protected static final long REQUEST_HANDLE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRequestHandle() <em>Request Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestHandle()
	 * @generated
	 * @ordered
	 */
	protected long requestHandle = REQUEST_HANDLE_EDEFAULT;

	/**
	 * This is true if the Request Handle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestHandleESet;

	/**
	 * The default value of the '{@link #getReturnDiagnostics() <em>Return Diagnostics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnDiagnostics()
	 * @generated
	 * @ordered
	 */
	protected static final long RETURN_DIAGNOSTICS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getReturnDiagnostics() <em>Return Diagnostics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnDiagnostics()
	 * @generated
	 * @ordered
	 */
	protected long returnDiagnostics = RETURN_DIAGNOSTICS_EDEFAULT;

	/**
	 * This is true if the Return Diagnostics attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean returnDiagnosticsESet;

	/**
	 * The default value of the '{@link #getAuditEntryId() <em>Audit Entry Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditEntryId()
	 * @generated
	 * @ordered
	 */
	protected static final String AUDIT_ENTRY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuditEntryId() <em>Audit Entry Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditEntryId()
	 * @generated
	 * @ordered
	 */
	protected String auditEntryId = AUDIT_ENTRY_ID_EDEFAULT;

	/**
	 * This is true if the Audit Entry Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean auditEntryIdESet;

	/**
	 * The default value of the '{@link #getTimeoutHint() <em>Timeout Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutHint()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMEOUT_HINT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimeoutHint() <em>Timeout Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutHint()
	 * @generated
	 * @ordered
	 */
	protected long timeoutHint = TIMEOUT_HINT_EDEFAULT;

	/**
	 * This is true if the Timeout Hint attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeoutHintESet;

	/**
	 * The cached value of the '{@link #getAdditionalHeader() <em>Additional Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalHeader()
	 * @generated
	 * @ordered
	 */
	protected ExtensionObject additionalHeader;

	/**
	 * This is true if the Additional Header containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean additionalHeaderESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getRequestHeader();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.REQUEST_HEADER__AUTHENTICATION_TOKEN, oldAuthenticationToken, newAuthenticationToken, !oldAuthenticationTokenESet);
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
				msgs = ((InternalEObject)authenticationToken).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REQUEST_HEADER__AUTHENTICATION_TOKEN, null, msgs);
			if (newAuthenticationToken != null)
				msgs = ((InternalEObject)newAuthenticationToken).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REQUEST_HEADER__AUTHENTICATION_TOKEN, null, msgs);
			msgs = basicSetAuthenticationToken(newAuthenticationToken, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAuthenticationTokenESet = authenticationTokenESet;
			authenticationTokenESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REQUEST_HEADER__AUTHENTICATION_TOKEN, newAuthenticationToken, newAuthenticationToken, !oldAuthenticationTokenESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.REQUEST_HEADER__AUTHENTICATION_TOKEN, oldAuthenticationToken, null, oldAuthenticationTokenESet);
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
			msgs = ((InternalEObject)authenticationToken).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REQUEST_HEADER__AUTHENTICATION_TOKEN, null, msgs);
			msgs = basicUnsetAuthenticationToken(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAuthenticationTokenESet = authenticationTokenESet;
			authenticationTokenESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REQUEST_HEADER__AUTHENTICATION_TOKEN, null, null, oldAuthenticationTokenESet));
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
	public XMLGregorianCalendar getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(XMLGregorianCalendar newTimestamp) {
		XMLGregorianCalendar oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REQUEST_HEADER__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRequestHandle() {
		return requestHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestHandle(long newRequestHandle) {
		long oldRequestHandle = requestHandle;
		requestHandle = newRequestHandle;
		boolean oldRequestHandleESet = requestHandleESet;
		requestHandleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REQUEST_HEADER__REQUEST_HANDLE, oldRequestHandle, requestHandle, !oldRequestHandleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestHandle() {
		long oldRequestHandle = requestHandle;
		boolean oldRequestHandleESet = requestHandleESet;
		requestHandle = REQUEST_HANDLE_EDEFAULT;
		requestHandleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REQUEST_HEADER__REQUEST_HANDLE, oldRequestHandle, REQUEST_HANDLE_EDEFAULT, oldRequestHandleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestHandle() {
		return requestHandleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getReturnDiagnostics() {
		return returnDiagnostics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnDiagnostics(long newReturnDiagnostics) {
		long oldReturnDiagnostics = returnDiagnostics;
		returnDiagnostics = newReturnDiagnostics;
		boolean oldReturnDiagnosticsESet = returnDiagnosticsESet;
		returnDiagnosticsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REQUEST_HEADER__RETURN_DIAGNOSTICS, oldReturnDiagnostics, returnDiagnostics, !oldReturnDiagnosticsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReturnDiagnostics() {
		long oldReturnDiagnostics = returnDiagnostics;
		boolean oldReturnDiagnosticsESet = returnDiagnosticsESet;
		returnDiagnostics = RETURN_DIAGNOSTICS_EDEFAULT;
		returnDiagnosticsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REQUEST_HEADER__RETURN_DIAGNOSTICS, oldReturnDiagnostics, RETURN_DIAGNOSTICS_EDEFAULT, oldReturnDiagnosticsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReturnDiagnostics() {
		return returnDiagnosticsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuditEntryId() {
		return auditEntryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditEntryId(String newAuditEntryId) {
		String oldAuditEntryId = auditEntryId;
		auditEntryId = newAuditEntryId;
		boolean oldAuditEntryIdESet = auditEntryIdESet;
		auditEntryIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REQUEST_HEADER__AUDIT_ENTRY_ID, oldAuditEntryId, auditEntryId, !oldAuditEntryIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAuditEntryId() {
		String oldAuditEntryId = auditEntryId;
		boolean oldAuditEntryIdESet = auditEntryIdESet;
		auditEntryId = AUDIT_ENTRY_ID_EDEFAULT;
		auditEntryIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REQUEST_HEADER__AUDIT_ENTRY_ID, oldAuditEntryId, AUDIT_ENTRY_ID_EDEFAULT, oldAuditEntryIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAuditEntryId() {
		return auditEntryIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeoutHint() {
		return timeoutHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeoutHint(long newTimeoutHint) {
		long oldTimeoutHint = timeoutHint;
		timeoutHint = newTimeoutHint;
		boolean oldTimeoutHintESet = timeoutHintESet;
		timeoutHintESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REQUEST_HEADER__TIMEOUT_HINT, oldTimeoutHint, timeoutHint, !oldTimeoutHintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimeoutHint() {
		long oldTimeoutHint = timeoutHint;
		boolean oldTimeoutHintESet = timeoutHintESet;
		timeoutHint = TIMEOUT_HINT_EDEFAULT;
		timeoutHintESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REQUEST_HEADER__TIMEOUT_HINT, oldTimeoutHint, TIMEOUT_HINT_EDEFAULT, oldTimeoutHintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimeoutHint() {
		return timeoutHintESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionObject getAdditionalHeader() {
		return additionalHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalHeader(ExtensionObject newAdditionalHeader, NotificationChain msgs) {
		ExtensionObject oldAdditionalHeader = additionalHeader;
		additionalHeader = newAdditionalHeader;
		boolean oldAdditionalHeaderESet = additionalHeaderESet;
		additionalHeaderESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.REQUEST_HEADER__ADDITIONAL_HEADER, oldAdditionalHeader, newAdditionalHeader, !oldAdditionalHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalHeader(ExtensionObject newAdditionalHeader) {
		if (newAdditionalHeader != additionalHeader) {
			NotificationChain msgs = null;
			if (additionalHeader != null)
				msgs = ((InternalEObject)additionalHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REQUEST_HEADER__ADDITIONAL_HEADER, null, msgs);
			if (newAdditionalHeader != null)
				msgs = ((InternalEObject)newAdditionalHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REQUEST_HEADER__ADDITIONAL_HEADER, null, msgs);
			msgs = basicSetAdditionalHeader(newAdditionalHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAdditionalHeaderESet = additionalHeaderESet;
			additionalHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REQUEST_HEADER__ADDITIONAL_HEADER, newAdditionalHeader, newAdditionalHeader, !oldAdditionalHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAdditionalHeader(NotificationChain msgs) {
		ExtensionObject oldAdditionalHeader = additionalHeader;
		additionalHeader = null;
		boolean oldAdditionalHeaderESet = additionalHeaderESet;
		additionalHeaderESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.REQUEST_HEADER__ADDITIONAL_HEADER, oldAdditionalHeader, null, oldAdditionalHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAdditionalHeader() {
		if (additionalHeader != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)additionalHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REQUEST_HEADER__ADDITIONAL_HEADER, null, msgs);
			msgs = basicUnsetAdditionalHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAdditionalHeaderESet = additionalHeaderESet;
			additionalHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REQUEST_HEADER__ADDITIONAL_HEADER, null, null, oldAdditionalHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAdditionalHeader() {
		return additionalHeaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.REQUEST_HEADER__AUTHENTICATION_TOKEN:
				return basicUnsetAuthenticationToken(msgs);
			case TypesPackage.REQUEST_HEADER__ADDITIONAL_HEADER:
				return basicUnsetAdditionalHeader(msgs);
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
			case TypesPackage.REQUEST_HEADER__AUTHENTICATION_TOKEN:
				return getAuthenticationToken();
			case TypesPackage.REQUEST_HEADER__TIMESTAMP:
				return getTimestamp();
			case TypesPackage.REQUEST_HEADER__REQUEST_HANDLE:
				return getRequestHandle();
			case TypesPackage.REQUEST_HEADER__RETURN_DIAGNOSTICS:
				return getReturnDiagnostics();
			case TypesPackage.REQUEST_HEADER__AUDIT_ENTRY_ID:
				return getAuditEntryId();
			case TypesPackage.REQUEST_HEADER__TIMEOUT_HINT:
				return getTimeoutHint();
			case TypesPackage.REQUEST_HEADER__ADDITIONAL_HEADER:
				return getAdditionalHeader();
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
			case TypesPackage.REQUEST_HEADER__AUTHENTICATION_TOKEN:
				setAuthenticationToken((NodeId)newValue);
				return;
			case TypesPackage.REQUEST_HEADER__TIMESTAMP:
				setTimestamp((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.REQUEST_HEADER__REQUEST_HANDLE:
				setRequestHandle((Long)newValue);
				return;
			case TypesPackage.REQUEST_HEADER__RETURN_DIAGNOSTICS:
				setReturnDiagnostics((Long)newValue);
				return;
			case TypesPackage.REQUEST_HEADER__AUDIT_ENTRY_ID:
				setAuditEntryId((String)newValue);
				return;
			case TypesPackage.REQUEST_HEADER__TIMEOUT_HINT:
				setTimeoutHint((Long)newValue);
				return;
			case TypesPackage.REQUEST_HEADER__ADDITIONAL_HEADER:
				setAdditionalHeader((ExtensionObject)newValue);
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
			case TypesPackage.REQUEST_HEADER__AUTHENTICATION_TOKEN:
				unsetAuthenticationToken();
				return;
			case TypesPackage.REQUEST_HEADER__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case TypesPackage.REQUEST_HEADER__REQUEST_HANDLE:
				unsetRequestHandle();
				return;
			case TypesPackage.REQUEST_HEADER__RETURN_DIAGNOSTICS:
				unsetReturnDiagnostics();
				return;
			case TypesPackage.REQUEST_HEADER__AUDIT_ENTRY_ID:
				unsetAuditEntryId();
				return;
			case TypesPackage.REQUEST_HEADER__TIMEOUT_HINT:
				unsetTimeoutHint();
				return;
			case TypesPackage.REQUEST_HEADER__ADDITIONAL_HEADER:
				unsetAdditionalHeader();
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
			case TypesPackage.REQUEST_HEADER__AUTHENTICATION_TOKEN:
				return isSetAuthenticationToken();
			case TypesPackage.REQUEST_HEADER__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case TypesPackage.REQUEST_HEADER__REQUEST_HANDLE:
				return isSetRequestHandle();
			case TypesPackage.REQUEST_HEADER__RETURN_DIAGNOSTICS:
				return isSetReturnDiagnostics();
			case TypesPackage.REQUEST_HEADER__AUDIT_ENTRY_ID:
				return isSetAuditEntryId();
			case TypesPackage.REQUEST_HEADER__TIMEOUT_HINT:
				return isSetTimeoutHint();
			case TypesPackage.REQUEST_HEADER__ADDITIONAL_HEADER:
				return isSetAdditionalHeader();
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(", requestHandle: ");
		if (requestHandleESet) result.append(requestHandle); else result.append("<unset>");
		result.append(", returnDiagnostics: ");
		if (returnDiagnosticsESet) result.append(returnDiagnostics); else result.append("<unset>");
		result.append(", auditEntryId: ");
		if (auditEntryIdESet) result.append(auditEntryId); else result.append("<unset>");
		result.append(", timeoutHint: ");
		if (timeoutHintESet) result.append(timeoutHint); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RequestHeaderImpl
