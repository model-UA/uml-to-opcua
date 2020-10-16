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

import org.opcfoundation.ua._2008._02.types.FindServersOnNetworkResponse;
import org.opcfoundation.ua._2008._02.types.ListOfServerOnNetwork;
import org.opcfoundation.ua._2008._02.types.ResponseHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Find Servers On Network Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FindServersOnNetworkResponseImpl#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FindServersOnNetworkResponseImpl#getLastCounterResetTime <em>Last Counter Reset Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FindServersOnNetworkResponseImpl#getServers <em>Servers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindServersOnNetworkResponseImpl extends MinimalEObjectImpl.Container implements FindServersOnNetworkResponse {
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
	 * The default value of the '{@link #getLastCounterResetTime() <em>Last Counter Reset Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCounterResetTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_COUNTER_RESET_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastCounterResetTime() <em>Last Counter Reset Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCounterResetTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastCounterResetTime = LAST_COUNTER_RESET_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServers() <em>Servers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServers()
	 * @generated
	 * @ordered
	 */
	protected ListOfServerOnNetwork servers;

	/**
	 * This is true if the Servers containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serversESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindServersOnNetworkResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getFindServersOnNetworkResponse();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__RESPONSE_HEADER, oldResponseHeader, newResponseHeader, !oldResponseHeaderESet);
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
				msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__RESPONSE_HEADER, null, msgs);
			if (newResponseHeader != null)
				msgs = ((InternalEObject)newResponseHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicSetResponseHeader(newResponseHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__RESPONSE_HEADER, newResponseHeader, newResponseHeader, !oldResponseHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__RESPONSE_HEADER, oldResponseHeader, null, oldResponseHeaderESet);
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
			msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicUnsetResponseHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__RESPONSE_HEADER, null, null, oldResponseHeaderESet));
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
	public XMLGregorianCalendar getLastCounterResetTime() {
		return lastCounterResetTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastCounterResetTime(XMLGregorianCalendar newLastCounterResetTime) {
		XMLGregorianCalendar oldLastCounterResetTime = lastCounterResetTime;
		lastCounterResetTime = newLastCounterResetTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__LAST_COUNTER_RESET_TIME, oldLastCounterResetTime, lastCounterResetTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfServerOnNetwork getServers() {
		return servers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServers(ListOfServerOnNetwork newServers, NotificationChain msgs) {
		ListOfServerOnNetwork oldServers = servers;
		servers = newServers;
		boolean oldServersESet = serversESet;
		serversESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__SERVERS, oldServers, newServers, !oldServersESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServers(ListOfServerOnNetwork newServers) {
		if (newServers != servers) {
			NotificationChain msgs = null;
			if (servers != null)
				msgs = ((InternalEObject)servers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__SERVERS, null, msgs);
			if (newServers != null)
				msgs = ((InternalEObject)newServers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__SERVERS, null, msgs);
			msgs = basicSetServers(newServers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServersESet = serversESet;
			serversESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__SERVERS, newServers, newServers, !oldServersESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetServers(NotificationChain msgs) {
		ListOfServerOnNetwork oldServers = servers;
		servers = null;
		boolean oldServersESet = serversESet;
		serversESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__SERVERS, oldServers, null, oldServersESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServers() {
		if (servers != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)servers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__SERVERS, null, msgs);
			msgs = basicUnsetServers(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServersESet = serversESet;
			serversESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__SERVERS, null, null, oldServersESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServers() {
		return serversESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__RESPONSE_HEADER:
				return basicUnsetResponseHeader(msgs);
			case TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__SERVERS:
				return basicUnsetServers(msgs);
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
			case TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__RESPONSE_HEADER:
				return getResponseHeader();
			case TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__LAST_COUNTER_RESET_TIME:
				return getLastCounterResetTime();
			case TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__SERVERS:
				return getServers();
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
			case TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__RESPONSE_HEADER:
				setResponseHeader((ResponseHeader)newValue);
				return;
			case TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__LAST_COUNTER_RESET_TIME:
				setLastCounterResetTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__SERVERS:
				setServers((ListOfServerOnNetwork)newValue);
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
			case TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__RESPONSE_HEADER:
				unsetResponseHeader();
				return;
			case TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__LAST_COUNTER_RESET_TIME:
				setLastCounterResetTime(LAST_COUNTER_RESET_TIME_EDEFAULT);
				return;
			case TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__SERVERS:
				unsetServers();
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
			case TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__RESPONSE_HEADER:
				return isSetResponseHeader();
			case TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__LAST_COUNTER_RESET_TIME:
				return LAST_COUNTER_RESET_TIME_EDEFAULT == null ? lastCounterResetTime != null : !LAST_COUNTER_RESET_TIME_EDEFAULT.equals(lastCounterResetTime);
			case TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE__SERVERS:
				return isSetServers();
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
		result.append(" (lastCounterResetTime: ");
		result.append(lastCounterResetTime);
		result.append(')');
		return result.toString();
	}

} //FindServersOnNetworkResponseImpl
