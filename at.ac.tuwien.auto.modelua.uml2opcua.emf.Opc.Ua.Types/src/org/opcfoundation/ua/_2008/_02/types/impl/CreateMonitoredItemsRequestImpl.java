/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.CreateMonitoredItemsRequest;
import org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemCreateRequest;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TimestampsToReturn;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Monitored Items Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateMonitoredItemsRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateMonitoredItemsRequestImpl#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateMonitoredItemsRequestImpl#getTimestampsToReturn <em>Timestamps To Return</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CreateMonitoredItemsRequestImpl#getItemsToCreate <em>Items To Create</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateMonitoredItemsRequestImpl extends MinimalEObjectImpl.Container implements CreateMonitoredItemsRequest {
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
	 * The default value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected static final long SUBSCRIPTION_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected long subscriptionId = SUBSCRIPTION_ID_EDEFAULT;

	/**
	 * This is true if the Subscription Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subscriptionIdESet;

	/**
	 * The default value of the '{@link #getTimestampsToReturn() <em>Timestamps To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestampsToReturn()
	 * @generated
	 * @ordered
	 */
	protected static final TimestampsToReturn TIMESTAMPS_TO_RETURN_EDEFAULT = TimestampsToReturn.SOURCE0;

	/**
	 * The cached value of the '{@link #getTimestampsToReturn() <em>Timestamps To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestampsToReturn()
	 * @generated
	 * @ordered
	 */
	protected TimestampsToReturn timestampsToReturn = TIMESTAMPS_TO_RETURN_EDEFAULT;

	/**
	 * This is true if the Timestamps To Return attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timestampsToReturnESet;

	/**
	 * The cached value of the '{@link #getItemsToCreate() <em>Items To Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemsToCreate()
	 * @generated
	 * @ordered
	 */
	protected ListOfMonitoredItemCreateRequest itemsToCreate;

	/**
	 * This is true if the Items To Create containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean itemsToCreateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateMonitoredItemsRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getCreateMonitoredItemsRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
	public long getSubscriptionId() {
		return subscriptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionId(long newSubscriptionId) {
		long oldSubscriptionId = subscriptionId;
		subscriptionId = newSubscriptionId;
		boolean oldSubscriptionIdESet = subscriptionIdESet;
		subscriptionIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__SUBSCRIPTION_ID, oldSubscriptionId, subscriptionId, !oldSubscriptionIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSubscriptionId() {
		long oldSubscriptionId = subscriptionId;
		boolean oldSubscriptionIdESet = subscriptionIdESet;
		subscriptionId = SUBSCRIPTION_ID_EDEFAULT;
		subscriptionIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__SUBSCRIPTION_ID, oldSubscriptionId, SUBSCRIPTION_ID_EDEFAULT, oldSubscriptionIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubscriptionId() {
		return subscriptionIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampsToReturn getTimestampsToReturn() {
		return timestampsToReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestampsToReturn(TimestampsToReturn newTimestampsToReturn) {
		TimestampsToReturn oldTimestampsToReturn = timestampsToReturn;
		timestampsToReturn = newTimestampsToReturn == null ? TIMESTAMPS_TO_RETURN_EDEFAULT : newTimestampsToReturn;
		boolean oldTimestampsToReturnESet = timestampsToReturnESet;
		timestampsToReturnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__TIMESTAMPS_TO_RETURN, oldTimestampsToReturn, timestampsToReturn, !oldTimestampsToReturnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimestampsToReturn() {
		TimestampsToReturn oldTimestampsToReturn = timestampsToReturn;
		boolean oldTimestampsToReturnESet = timestampsToReturnESet;
		timestampsToReturn = TIMESTAMPS_TO_RETURN_EDEFAULT;
		timestampsToReturnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__TIMESTAMPS_TO_RETURN, oldTimestampsToReturn, TIMESTAMPS_TO_RETURN_EDEFAULT, oldTimestampsToReturnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimestampsToReturn() {
		return timestampsToReturnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfMonitoredItemCreateRequest getItemsToCreate() {
		return itemsToCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemsToCreate(ListOfMonitoredItemCreateRequest newItemsToCreate, NotificationChain msgs) {
		ListOfMonitoredItemCreateRequest oldItemsToCreate = itemsToCreate;
		itemsToCreate = newItemsToCreate;
		boolean oldItemsToCreateESet = itemsToCreateESet;
		itemsToCreateESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__ITEMS_TO_CREATE, oldItemsToCreate, newItemsToCreate, !oldItemsToCreateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemsToCreate(ListOfMonitoredItemCreateRequest newItemsToCreate) {
		if (newItemsToCreate != itemsToCreate) {
			NotificationChain msgs = null;
			if (itemsToCreate != null)
				msgs = ((InternalEObject)itemsToCreate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__ITEMS_TO_CREATE, null, msgs);
			if (newItemsToCreate != null)
				msgs = ((InternalEObject)newItemsToCreate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__ITEMS_TO_CREATE, null, msgs);
			msgs = basicSetItemsToCreate(newItemsToCreate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldItemsToCreateESet = itemsToCreateESet;
			itemsToCreateESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__ITEMS_TO_CREATE, newItemsToCreate, newItemsToCreate, !oldItemsToCreateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetItemsToCreate(NotificationChain msgs) {
		ListOfMonitoredItemCreateRequest oldItemsToCreate = itemsToCreate;
		itemsToCreate = null;
		boolean oldItemsToCreateESet = itemsToCreateESet;
		itemsToCreateESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__ITEMS_TO_CREATE, oldItemsToCreate, null, oldItemsToCreateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetItemsToCreate() {
		if (itemsToCreate != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)itemsToCreate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__ITEMS_TO_CREATE, null, msgs);
			msgs = basicUnsetItemsToCreate(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldItemsToCreateESet = itemsToCreateESet;
			itemsToCreateESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__ITEMS_TO_CREATE, null, null, oldItemsToCreateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItemsToCreate() {
		return itemsToCreateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__ITEMS_TO_CREATE:
				return basicUnsetItemsToCreate(msgs);
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
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__SUBSCRIPTION_ID:
				return getSubscriptionId();
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__TIMESTAMPS_TO_RETURN:
				return getTimestampsToReturn();
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__ITEMS_TO_CREATE:
				return getItemsToCreate();
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
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__SUBSCRIPTION_ID:
				setSubscriptionId((Long)newValue);
				return;
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__TIMESTAMPS_TO_RETURN:
				setTimestampsToReturn((TimestampsToReturn)newValue);
				return;
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__ITEMS_TO_CREATE:
				setItemsToCreate((ListOfMonitoredItemCreateRequest)newValue);
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
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__SUBSCRIPTION_ID:
				unsetSubscriptionId();
				return;
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__TIMESTAMPS_TO_RETURN:
				unsetTimestampsToReturn();
				return;
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__ITEMS_TO_CREATE:
				unsetItemsToCreate();
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
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__SUBSCRIPTION_ID:
				return isSetSubscriptionId();
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__TIMESTAMPS_TO_RETURN:
				return isSetTimestampsToReturn();
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST__ITEMS_TO_CREATE:
				return isSetItemsToCreate();
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
		result.append(" (subscriptionId: ");
		if (subscriptionIdESet) result.append(subscriptionId); else result.append("<unset>");
		result.append(", timestampsToReturn: ");
		if (timestampsToReturnESet) result.append(timestampsToReturn); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CreateMonitoredItemsRequestImpl
