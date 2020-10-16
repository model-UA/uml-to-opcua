/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest;
import org.opcfoundation.ua._2008._02.types.ListOfString;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Find Servers On Network Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FindServersOnNetworkRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FindServersOnNetworkRequestImpl#getStartingRecordId <em>Starting Record Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FindServersOnNetworkRequestImpl#getMaxRecordsToReturn <em>Max Records To Return</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.FindServersOnNetworkRequestImpl#getServerCapabilityFilter <em>Server Capability Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindServersOnNetworkRequestImpl extends MinimalEObjectImpl.Container implements FindServersOnNetworkRequest {
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
	 * The default value of the '{@link #getStartingRecordId() <em>Starting Record Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingRecordId()
	 * @generated
	 * @ordered
	 */
	protected static final long STARTING_RECORD_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStartingRecordId() <em>Starting Record Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingRecordId()
	 * @generated
	 * @ordered
	 */
	protected long startingRecordId = STARTING_RECORD_ID_EDEFAULT;

	/**
	 * This is true if the Starting Record Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startingRecordIdESet;

	/**
	 * The default value of the '{@link #getMaxRecordsToReturn() <em>Max Records To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRecordsToReturn()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_RECORDS_TO_RETURN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxRecordsToReturn() <em>Max Records To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRecordsToReturn()
	 * @generated
	 * @ordered
	 */
	protected long maxRecordsToReturn = MAX_RECORDS_TO_RETURN_EDEFAULT;

	/**
	 * This is true if the Max Records To Return attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxRecordsToReturnESet;

	/**
	 * The cached value of the '{@link #getServerCapabilityFilter() <em>Server Capability Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerCapabilityFilter()
	 * @generated
	 * @ordered
	 */
	protected ListOfString serverCapabilityFilter;

	/**
	 * This is true if the Server Capability Filter containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverCapabilityFilterESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindServersOnNetworkRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getFindServersOnNetworkRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
	public long getStartingRecordId() {
		return startingRecordId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingRecordId(long newStartingRecordId) {
		long oldStartingRecordId = startingRecordId;
		startingRecordId = newStartingRecordId;
		boolean oldStartingRecordIdESet = startingRecordIdESet;
		startingRecordIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__STARTING_RECORD_ID, oldStartingRecordId, startingRecordId, !oldStartingRecordIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartingRecordId() {
		long oldStartingRecordId = startingRecordId;
		boolean oldStartingRecordIdESet = startingRecordIdESet;
		startingRecordId = STARTING_RECORD_ID_EDEFAULT;
		startingRecordIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__STARTING_RECORD_ID, oldStartingRecordId, STARTING_RECORD_ID_EDEFAULT, oldStartingRecordIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartingRecordId() {
		return startingRecordIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxRecordsToReturn() {
		return maxRecordsToReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRecordsToReturn(long newMaxRecordsToReturn) {
		long oldMaxRecordsToReturn = maxRecordsToReturn;
		maxRecordsToReturn = newMaxRecordsToReturn;
		boolean oldMaxRecordsToReturnESet = maxRecordsToReturnESet;
		maxRecordsToReturnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__MAX_RECORDS_TO_RETURN, oldMaxRecordsToReturn, maxRecordsToReturn, !oldMaxRecordsToReturnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxRecordsToReturn() {
		long oldMaxRecordsToReturn = maxRecordsToReturn;
		boolean oldMaxRecordsToReturnESet = maxRecordsToReturnESet;
		maxRecordsToReturn = MAX_RECORDS_TO_RETURN_EDEFAULT;
		maxRecordsToReturnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__MAX_RECORDS_TO_RETURN, oldMaxRecordsToReturn, MAX_RECORDS_TO_RETURN_EDEFAULT, oldMaxRecordsToReturnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxRecordsToReturn() {
		return maxRecordsToReturnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfString getServerCapabilityFilter() {
		return serverCapabilityFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerCapabilityFilter(ListOfString newServerCapabilityFilter, NotificationChain msgs) {
		ListOfString oldServerCapabilityFilter = serverCapabilityFilter;
		serverCapabilityFilter = newServerCapabilityFilter;
		boolean oldServerCapabilityFilterESet = serverCapabilityFilterESet;
		serverCapabilityFilterESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__SERVER_CAPABILITY_FILTER, oldServerCapabilityFilter, newServerCapabilityFilter, !oldServerCapabilityFilterESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerCapabilityFilter(ListOfString newServerCapabilityFilter) {
		if (newServerCapabilityFilter != serverCapabilityFilter) {
			NotificationChain msgs = null;
			if (serverCapabilityFilter != null)
				msgs = ((InternalEObject)serverCapabilityFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__SERVER_CAPABILITY_FILTER, null, msgs);
			if (newServerCapabilityFilter != null)
				msgs = ((InternalEObject)newServerCapabilityFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__SERVER_CAPABILITY_FILTER, null, msgs);
			msgs = basicSetServerCapabilityFilter(newServerCapabilityFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerCapabilityFilterESet = serverCapabilityFilterESet;
			serverCapabilityFilterESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__SERVER_CAPABILITY_FILTER, newServerCapabilityFilter, newServerCapabilityFilter, !oldServerCapabilityFilterESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetServerCapabilityFilter(NotificationChain msgs) {
		ListOfString oldServerCapabilityFilter = serverCapabilityFilter;
		serverCapabilityFilter = null;
		boolean oldServerCapabilityFilterESet = serverCapabilityFilterESet;
		serverCapabilityFilterESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__SERVER_CAPABILITY_FILTER, oldServerCapabilityFilter, null, oldServerCapabilityFilterESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerCapabilityFilter() {
		if (serverCapabilityFilter != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)serverCapabilityFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__SERVER_CAPABILITY_FILTER, null, msgs);
			msgs = basicUnsetServerCapabilityFilter(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServerCapabilityFilterESet = serverCapabilityFilterESet;
			serverCapabilityFilterESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__SERVER_CAPABILITY_FILTER, null, null, oldServerCapabilityFilterESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerCapabilityFilter() {
		return serverCapabilityFilterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__SERVER_CAPABILITY_FILTER:
				return basicUnsetServerCapabilityFilter(msgs);
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
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__STARTING_RECORD_ID:
				return getStartingRecordId();
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__MAX_RECORDS_TO_RETURN:
				return getMaxRecordsToReturn();
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__SERVER_CAPABILITY_FILTER:
				return getServerCapabilityFilter();
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
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__STARTING_RECORD_ID:
				setStartingRecordId((Long)newValue);
				return;
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__MAX_RECORDS_TO_RETURN:
				setMaxRecordsToReturn((Long)newValue);
				return;
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__SERVER_CAPABILITY_FILTER:
				setServerCapabilityFilter((ListOfString)newValue);
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
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__STARTING_RECORD_ID:
				unsetStartingRecordId();
				return;
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__MAX_RECORDS_TO_RETURN:
				unsetMaxRecordsToReturn();
				return;
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__SERVER_CAPABILITY_FILTER:
				unsetServerCapabilityFilter();
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
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__STARTING_RECORD_ID:
				return isSetStartingRecordId();
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__MAX_RECORDS_TO_RETURN:
				return isSetMaxRecordsToReturn();
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST__SERVER_CAPABILITY_FILTER:
				return isSetServerCapabilityFilter();
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
		result.append(" (startingRecordId: ");
		if (startingRecordIdESet) result.append(startingRecordId); else result.append("<unset>");
		result.append(", maxRecordsToReturn: ");
		if (maxRecordsToReturnESet) result.append(maxRecordsToReturn); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FindServersOnNetworkRequestImpl
