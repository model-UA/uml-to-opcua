/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemModifyRequest;
import org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TimestampsToReturn;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Monitored Items Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModifyMonitoredItemsRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModifyMonitoredItemsRequestImpl#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModifyMonitoredItemsRequestImpl#getTimestampsToReturn <em>Timestamps To Return</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModifyMonitoredItemsRequestImpl#getItemsToModify <em>Items To Modify</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifyMonitoredItemsRequestImpl extends MinimalEObjectImpl.Container implements ModifyMonitoredItemsRequest {
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
	 * The cached value of the '{@link #getItemsToModify() <em>Items To Modify</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemsToModify()
	 * @generated
	 * @ordered
	 */
	protected ListOfMonitoredItemModifyRequest itemsToModify;

	/**
	 * This is true if the Items To Modify containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean itemsToModifyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyMonitoredItemsRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getModifyMonitoredItemsRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__SUBSCRIPTION_ID, oldSubscriptionId, subscriptionId, !oldSubscriptionIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__SUBSCRIPTION_ID, oldSubscriptionId, SUBSCRIPTION_ID_EDEFAULT, oldSubscriptionIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__TIMESTAMPS_TO_RETURN, oldTimestampsToReturn, timestampsToReturn, !oldTimestampsToReturnESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__TIMESTAMPS_TO_RETURN, oldTimestampsToReturn, TIMESTAMPS_TO_RETURN_EDEFAULT, oldTimestampsToReturnESet));
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
	public ListOfMonitoredItemModifyRequest getItemsToModify() {
		return itemsToModify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemsToModify(ListOfMonitoredItemModifyRequest newItemsToModify, NotificationChain msgs) {
		ListOfMonitoredItemModifyRequest oldItemsToModify = itemsToModify;
		itemsToModify = newItemsToModify;
		boolean oldItemsToModifyESet = itemsToModifyESet;
		itemsToModifyESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__ITEMS_TO_MODIFY, oldItemsToModify, newItemsToModify, !oldItemsToModifyESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemsToModify(ListOfMonitoredItemModifyRequest newItemsToModify) {
		if (newItemsToModify != itemsToModify) {
			NotificationChain msgs = null;
			if (itemsToModify != null)
				msgs = ((InternalEObject)itemsToModify).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__ITEMS_TO_MODIFY, null, msgs);
			if (newItemsToModify != null)
				msgs = ((InternalEObject)newItemsToModify).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__ITEMS_TO_MODIFY, null, msgs);
			msgs = basicSetItemsToModify(newItemsToModify, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldItemsToModifyESet = itemsToModifyESet;
			itemsToModifyESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__ITEMS_TO_MODIFY, newItemsToModify, newItemsToModify, !oldItemsToModifyESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetItemsToModify(NotificationChain msgs) {
		ListOfMonitoredItemModifyRequest oldItemsToModify = itemsToModify;
		itemsToModify = null;
		boolean oldItemsToModifyESet = itemsToModifyESet;
		itemsToModifyESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__ITEMS_TO_MODIFY, oldItemsToModify, null, oldItemsToModifyESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetItemsToModify() {
		if (itemsToModify != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)itemsToModify).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__ITEMS_TO_MODIFY, null, msgs);
			msgs = basicUnsetItemsToModify(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldItemsToModifyESet = itemsToModifyESet;
			itemsToModifyESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__ITEMS_TO_MODIFY, null, null, oldItemsToModifyESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItemsToModify() {
		return itemsToModifyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__ITEMS_TO_MODIFY:
				return basicUnsetItemsToModify(msgs);
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
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__SUBSCRIPTION_ID:
				return getSubscriptionId();
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__TIMESTAMPS_TO_RETURN:
				return getTimestampsToReturn();
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__ITEMS_TO_MODIFY:
				return getItemsToModify();
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
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__SUBSCRIPTION_ID:
				setSubscriptionId((Long)newValue);
				return;
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__TIMESTAMPS_TO_RETURN:
				setTimestampsToReturn((TimestampsToReturn)newValue);
				return;
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__ITEMS_TO_MODIFY:
				setItemsToModify((ListOfMonitoredItemModifyRequest)newValue);
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
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__SUBSCRIPTION_ID:
				unsetSubscriptionId();
				return;
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__TIMESTAMPS_TO_RETURN:
				unsetTimestampsToReturn();
				return;
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__ITEMS_TO_MODIFY:
				unsetItemsToModify();
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
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__SUBSCRIPTION_ID:
				return isSetSubscriptionId();
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__TIMESTAMPS_TO_RETURN:
				return isSetTimestampsToReturn();
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST__ITEMS_TO_MODIFY:
				return isSetItemsToModify();
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

} //ModifyMonitoredItemsRequestImpl
