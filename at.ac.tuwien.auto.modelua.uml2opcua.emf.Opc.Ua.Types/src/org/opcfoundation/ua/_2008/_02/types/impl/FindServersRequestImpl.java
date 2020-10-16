/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.FindServersRequest;
import org.opcfoundation.ua._2008._02.types.ListOfString;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Find Servers Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FindServersRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FindServersRequestImpl#getEndpointUrl <em>Endpoint Url</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FindServersRequestImpl#getLocaleIds <em>Locale Ids</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FindServersRequestImpl#getServerUris <em>Server Uris</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindServersRequestImpl extends MinimalEObjectImpl.Container implements FindServersRequest {
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
	 * The cached value of the '{@link #getServerUris() <em>Server Uris</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerUris()
	 * @generated
	 * @ordered
	 */
	protected ListOfString serverUris;

	/**
	 * This is true if the Server Uris containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverUrisESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindServersRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getFindServersRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.FIND_SERVERS_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIND_SERVERS_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIND_SERVERS_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIND_SERVERS_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIND_SERVERS_REQUEST__ENDPOINT_URL, oldEndpointUrl, endpointUrl, !oldEndpointUrlESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIND_SERVERS_REQUEST__ENDPOINT_URL, oldEndpointUrl, ENDPOINT_URL_EDEFAULT, oldEndpointUrlESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.FIND_SERVERS_REQUEST__LOCALE_IDS, oldLocaleIds, newLocaleIds, !oldLocaleIdsESet);
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
				msgs = ((InternalEObject)localeIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_REQUEST__LOCALE_IDS, null, msgs);
			if (newLocaleIds != null)
				msgs = ((InternalEObject)newLocaleIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_REQUEST__LOCALE_IDS, null, msgs);
			msgs = basicSetLocaleIds(newLocaleIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLocaleIdsESet = localeIdsESet;
			localeIdsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIND_SERVERS_REQUEST__LOCALE_IDS, newLocaleIds, newLocaleIds, !oldLocaleIdsESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIND_SERVERS_REQUEST__LOCALE_IDS, oldLocaleIds, null, oldLocaleIdsESet);
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
			msgs = ((InternalEObject)localeIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_REQUEST__LOCALE_IDS, null, msgs);
			msgs = basicUnsetLocaleIds(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLocaleIdsESet = localeIdsESet;
			localeIdsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIND_SERVERS_REQUEST__LOCALE_IDS, null, null, oldLocaleIdsESet));
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
	public ListOfString getServerUris() {
		return serverUris;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerUris(ListOfString newServerUris, NotificationChain msgs) {
		ListOfString oldServerUris = serverUris;
		serverUris = newServerUris;
		boolean oldServerUrisESet = serverUrisESet;
		serverUrisESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.FIND_SERVERS_REQUEST__SERVER_URIS, oldServerUris, newServerUris, !oldServerUrisESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerUris(ListOfString newServerUris) {
		if (newServerUris != serverUris) {
			NotificationChain msgs = null;
			if (serverUris != null)
				msgs = ((InternalEObject)serverUris).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_REQUEST__SERVER_URIS, null, msgs);
			if (newServerUris != null)
				msgs = ((InternalEObject)newServerUris).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_REQUEST__SERVER_URIS, null, msgs);
			msgs = basicSetServerUris(newServerUris, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerUrisESet = serverUrisESet;
			serverUrisESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIND_SERVERS_REQUEST__SERVER_URIS, newServerUris, newServerUris, !oldServerUrisESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetServerUris(NotificationChain msgs) {
		ListOfString oldServerUris = serverUris;
		serverUris = null;
		boolean oldServerUrisESet = serverUrisESet;
		serverUrisESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIND_SERVERS_REQUEST__SERVER_URIS, oldServerUris, null, oldServerUrisESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerUris() {
		if (serverUris != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)serverUris).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_REQUEST__SERVER_URIS, null, msgs);
			msgs = basicUnsetServerUris(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerUrisESet = serverUrisESet;
			serverUrisESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIND_SERVERS_REQUEST__SERVER_URIS, null, null, oldServerUrisESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerUris() {
		return serverUrisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.FIND_SERVERS_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.FIND_SERVERS_REQUEST__LOCALE_IDS:
				return basicUnsetLocaleIds(msgs);
			case TypesPackage.FIND_SERVERS_REQUEST__SERVER_URIS:
				return basicUnsetServerUris(msgs);
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
			case TypesPackage.FIND_SERVERS_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.FIND_SERVERS_REQUEST__ENDPOINT_URL:
				return getEndpointUrl();
			case TypesPackage.FIND_SERVERS_REQUEST__LOCALE_IDS:
				return getLocaleIds();
			case TypesPackage.FIND_SERVERS_REQUEST__SERVER_URIS:
				return getServerUris();
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
			case TypesPackage.FIND_SERVERS_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.FIND_SERVERS_REQUEST__ENDPOINT_URL:
				setEndpointUrl((String)newValue);
				return;
			case TypesPackage.FIND_SERVERS_REQUEST__LOCALE_IDS:
				setLocaleIds((ListOfString)newValue);
				return;
			case TypesPackage.FIND_SERVERS_REQUEST__SERVER_URIS:
				setServerUris((ListOfString)newValue);
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
			case TypesPackage.FIND_SERVERS_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.FIND_SERVERS_REQUEST__ENDPOINT_URL:
				unsetEndpointUrl();
				return;
			case TypesPackage.FIND_SERVERS_REQUEST__LOCALE_IDS:
				unsetLocaleIds();
				return;
			case TypesPackage.FIND_SERVERS_REQUEST__SERVER_URIS:
				unsetServerUris();
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
			case TypesPackage.FIND_SERVERS_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.FIND_SERVERS_REQUEST__ENDPOINT_URL:
				return isSetEndpointUrl();
			case TypesPackage.FIND_SERVERS_REQUEST__LOCALE_IDS:
				return isSetLocaleIds();
			case TypesPackage.FIND_SERVERS_REQUEST__SERVER_URIS:
				return isSetServerUris();
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
		result.append(')');
		return result.toString();
	}

} //FindServersRequestImpl
