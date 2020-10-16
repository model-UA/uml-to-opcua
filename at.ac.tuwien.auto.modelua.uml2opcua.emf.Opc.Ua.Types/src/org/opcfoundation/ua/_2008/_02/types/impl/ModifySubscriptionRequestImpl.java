/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ModifySubscriptionRequest;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Subscription Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModifySubscriptionRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModifySubscriptionRequestImpl#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModifySubscriptionRequestImpl#getRequestedPublishingInterval <em>Requested Publishing Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModifySubscriptionRequestImpl#getRequestedLifetimeCount <em>Requested Lifetime Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModifySubscriptionRequestImpl#getRequestedMaxKeepAliveCount <em>Requested Max Keep Alive Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModifySubscriptionRequestImpl#getMaxNotificationsPerPublish <em>Max Notifications Per Publish</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModifySubscriptionRequestImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifySubscriptionRequestImpl extends MinimalEObjectImpl.Container implements ModifySubscriptionRequest {
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
	 * The default value of the '{@link #getRequestedPublishingInterval() <em>Requested Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedPublishingInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double REQUESTED_PUBLISHING_INTERVAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRequestedPublishingInterval() <em>Requested Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedPublishingInterval()
	 * @generated
	 * @ordered
	 */
	protected double requestedPublishingInterval = REQUESTED_PUBLISHING_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Requested Publishing Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestedPublishingIntervalESet;

	/**
	 * The default value of the '{@link #getRequestedLifetimeCount() <em>Requested Lifetime Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedLifetimeCount()
	 * @generated
	 * @ordered
	 */
	protected static final long REQUESTED_LIFETIME_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRequestedLifetimeCount() <em>Requested Lifetime Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedLifetimeCount()
	 * @generated
	 * @ordered
	 */
	protected long requestedLifetimeCount = REQUESTED_LIFETIME_COUNT_EDEFAULT;

	/**
	 * This is true if the Requested Lifetime Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestedLifetimeCountESet;

	/**
	 * The default value of the '{@link #getRequestedMaxKeepAliveCount() <em>Requested Max Keep Alive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedMaxKeepAliveCount()
	 * @generated
	 * @ordered
	 */
	protected static final long REQUESTED_MAX_KEEP_ALIVE_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRequestedMaxKeepAliveCount() <em>Requested Max Keep Alive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedMaxKeepAliveCount()
	 * @generated
	 * @ordered
	 */
	protected long requestedMaxKeepAliveCount = REQUESTED_MAX_KEEP_ALIVE_COUNT_EDEFAULT;

	/**
	 * This is true if the Requested Max Keep Alive Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestedMaxKeepAliveCountESet;

	/**
	 * The default value of the '{@link #getMaxNotificationsPerPublish() <em>Max Notifications Per Publish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNotificationsPerPublish()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_NOTIFICATIONS_PER_PUBLISH_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxNotificationsPerPublish() <em>Max Notifications Per Publish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNotificationsPerPublish()
	 * @generated
	 * @ordered
	 */
	protected long maxNotificationsPerPublish = MAX_NOTIFICATIONS_PER_PUBLISH_EDEFAULT;

	/**
	 * This is true if the Max Notifications Per Publish attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxNotificationsPerPublishESet;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final short PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected short priority = PRIORITY_EDEFAULT;

	/**
	 * This is true if the Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priorityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifySubscriptionRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getModifySubscriptionRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__SUBSCRIPTION_ID, oldSubscriptionId, subscriptionId, !oldSubscriptionIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__SUBSCRIPTION_ID, oldSubscriptionId, SUBSCRIPTION_ID_EDEFAULT, oldSubscriptionIdESet));
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
	public double getRequestedPublishingInterval() {
		return requestedPublishingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedPublishingInterval(double newRequestedPublishingInterval) {
		double oldRequestedPublishingInterval = requestedPublishingInterval;
		requestedPublishingInterval = newRequestedPublishingInterval;
		boolean oldRequestedPublishingIntervalESet = requestedPublishingIntervalESet;
		requestedPublishingIntervalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUESTED_PUBLISHING_INTERVAL, oldRequestedPublishingInterval, requestedPublishingInterval, !oldRequestedPublishingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestedPublishingInterval() {
		double oldRequestedPublishingInterval = requestedPublishingInterval;
		boolean oldRequestedPublishingIntervalESet = requestedPublishingIntervalESet;
		requestedPublishingInterval = REQUESTED_PUBLISHING_INTERVAL_EDEFAULT;
		requestedPublishingIntervalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUESTED_PUBLISHING_INTERVAL, oldRequestedPublishingInterval, REQUESTED_PUBLISHING_INTERVAL_EDEFAULT, oldRequestedPublishingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestedPublishingInterval() {
		return requestedPublishingIntervalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRequestedLifetimeCount() {
		return requestedLifetimeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedLifetimeCount(long newRequestedLifetimeCount) {
		long oldRequestedLifetimeCount = requestedLifetimeCount;
		requestedLifetimeCount = newRequestedLifetimeCount;
		boolean oldRequestedLifetimeCountESet = requestedLifetimeCountESet;
		requestedLifetimeCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUESTED_LIFETIME_COUNT, oldRequestedLifetimeCount, requestedLifetimeCount, !oldRequestedLifetimeCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestedLifetimeCount() {
		long oldRequestedLifetimeCount = requestedLifetimeCount;
		boolean oldRequestedLifetimeCountESet = requestedLifetimeCountESet;
		requestedLifetimeCount = REQUESTED_LIFETIME_COUNT_EDEFAULT;
		requestedLifetimeCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUESTED_LIFETIME_COUNT, oldRequestedLifetimeCount, REQUESTED_LIFETIME_COUNT_EDEFAULT, oldRequestedLifetimeCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestedLifetimeCount() {
		return requestedLifetimeCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRequestedMaxKeepAliveCount() {
		return requestedMaxKeepAliveCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedMaxKeepAliveCount(long newRequestedMaxKeepAliveCount) {
		long oldRequestedMaxKeepAliveCount = requestedMaxKeepAliveCount;
		requestedMaxKeepAliveCount = newRequestedMaxKeepAliveCount;
		boolean oldRequestedMaxKeepAliveCountESet = requestedMaxKeepAliveCountESet;
		requestedMaxKeepAliveCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUESTED_MAX_KEEP_ALIVE_COUNT, oldRequestedMaxKeepAliveCount, requestedMaxKeepAliveCount, !oldRequestedMaxKeepAliveCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestedMaxKeepAliveCount() {
		long oldRequestedMaxKeepAliveCount = requestedMaxKeepAliveCount;
		boolean oldRequestedMaxKeepAliveCountESet = requestedMaxKeepAliveCountESet;
		requestedMaxKeepAliveCount = REQUESTED_MAX_KEEP_ALIVE_COUNT_EDEFAULT;
		requestedMaxKeepAliveCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUESTED_MAX_KEEP_ALIVE_COUNT, oldRequestedMaxKeepAliveCount, REQUESTED_MAX_KEEP_ALIVE_COUNT_EDEFAULT, oldRequestedMaxKeepAliveCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestedMaxKeepAliveCount() {
		return requestedMaxKeepAliveCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxNotificationsPerPublish() {
		return maxNotificationsPerPublish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNotificationsPerPublish(long newMaxNotificationsPerPublish) {
		long oldMaxNotificationsPerPublish = maxNotificationsPerPublish;
		maxNotificationsPerPublish = newMaxNotificationsPerPublish;
		boolean oldMaxNotificationsPerPublishESet = maxNotificationsPerPublishESet;
		maxNotificationsPerPublishESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__MAX_NOTIFICATIONS_PER_PUBLISH, oldMaxNotificationsPerPublish, maxNotificationsPerPublish, !oldMaxNotificationsPerPublishESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxNotificationsPerPublish() {
		long oldMaxNotificationsPerPublish = maxNotificationsPerPublish;
		boolean oldMaxNotificationsPerPublishESet = maxNotificationsPerPublishESet;
		maxNotificationsPerPublish = MAX_NOTIFICATIONS_PER_PUBLISH_EDEFAULT;
		maxNotificationsPerPublishESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__MAX_NOTIFICATIONS_PER_PUBLISH, oldMaxNotificationsPerPublish, MAX_NOTIFICATIONS_PER_PUBLISH_EDEFAULT, oldMaxNotificationsPerPublishESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxNotificationsPerPublish() {
		return maxNotificationsPerPublishESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(short newPriority) {
		short oldPriority = priority;
		priority = newPriority;
		boolean oldPriorityESet = priorityESet;
		priorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__PRIORITY, oldPriority, priority, !oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriority() {
		short oldPriority = priority;
		boolean oldPriorityESet = priorityESet;
		priority = PRIORITY_EDEFAULT;
		priorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__PRIORITY, oldPriority, PRIORITY_EDEFAULT, oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriority() {
		return priorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUEST_HEADER:
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
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__SUBSCRIPTION_ID:
				return getSubscriptionId();
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUESTED_PUBLISHING_INTERVAL:
				return getRequestedPublishingInterval();
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUESTED_LIFETIME_COUNT:
				return getRequestedLifetimeCount();
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUESTED_MAX_KEEP_ALIVE_COUNT:
				return getRequestedMaxKeepAliveCount();
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__MAX_NOTIFICATIONS_PER_PUBLISH:
				return getMaxNotificationsPerPublish();
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__PRIORITY:
				return getPriority();
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
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__SUBSCRIPTION_ID:
				setSubscriptionId((Long)newValue);
				return;
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUESTED_PUBLISHING_INTERVAL:
				setRequestedPublishingInterval((Double)newValue);
				return;
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUESTED_LIFETIME_COUNT:
				setRequestedLifetimeCount((Long)newValue);
				return;
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUESTED_MAX_KEEP_ALIVE_COUNT:
				setRequestedMaxKeepAliveCount((Long)newValue);
				return;
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__MAX_NOTIFICATIONS_PER_PUBLISH:
				setMaxNotificationsPerPublish((Long)newValue);
				return;
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__PRIORITY:
				setPriority((Short)newValue);
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
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__SUBSCRIPTION_ID:
				unsetSubscriptionId();
				return;
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUESTED_PUBLISHING_INTERVAL:
				unsetRequestedPublishingInterval();
				return;
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUESTED_LIFETIME_COUNT:
				unsetRequestedLifetimeCount();
				return;
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUESTED_MAX_KEEP_ALIVE_COUNT:
				unsetRequestedMaxKeepAliveCount();
				return;
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__MAX_NOTIFICATIONS_PER_PUBLISH:
				unsetMaxNotificationsPerPublish();
				return;
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__PRIORITY:
				unsetPriority();
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
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__SUBSCRIPTION_ID:
				return isSetSubscriptionId();
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUESTED_PUBLISHING_INTERVAL:
				return isSetRequestedPublishingInterval();
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUESTED_LIFETIME_COUNT:
				return isSetRequestedLifetimeCount();
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__REQUESTED_MAX_KEEP_ALIVE_COUNT:
				return isSetRequestedMaxKeepAliveCount();
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__MAX_NOTIFICATIONS_PER_PUBLISH:
				return isSetMaxNotificationsPerPublish();
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST__PRIORITY:
				return isSetPriority();
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
		result.append(", requestedPublishingInterval: ");
		if (requestedPublishingIntervalESet) result.append(requestedPublishingInterval); else result.append("<unset>");
		result.append(", requestedLifetimeCount: ");
		if (requestedLifetimeCountESet) result.append(requestedLifetimeCount); else result.append("<unset>");
		result.append(", requestedMaxKeepAliveCount: ");
		if (requestedMaxKeepAliveCountESet) result.append(requestedMaxKeepAliveCount); else result.append("<unset>");
		result.append(", maxNotificationsPerPublish: ");
		if (maxNotificationsPerPublishESet) result.append(maxNotificationsPerPublish); else result.append("<unset>");
		result.append(", priority: ");
		if (priorityESet) result.append(priority); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ModifySubscriptionRequestImpl
