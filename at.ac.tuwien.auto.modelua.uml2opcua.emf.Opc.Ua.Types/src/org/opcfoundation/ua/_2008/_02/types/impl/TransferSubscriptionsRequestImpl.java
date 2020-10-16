/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfUInt32;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TransferSubscriptionsRequest;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Subscriptions Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.TransferSubscriptionsRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.TransferSubscriptionsRequestImpl#getSubscriptionIds <em>Subscription Ids</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.TransferSubscriptionsRequestImpl#isSendInitialValues <em>Send Initial Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransferSubscriptionsRequestImpl extends MinimalEObjectImpl.Container implements TransferSubscriptionsRequest {
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
	 * The cached value of the '{@link #getSubscriptionIds() <em>Subscription Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionIds()
	 * @generated
	 * @ordered
	 */
	protected ListOfUInt32 subscriptionIds;

	/**
	 * This is true if the Subscription Ids containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subscriptionIdsESet;

	/**
	 * The default value of the '{@link #isSendInitialValues() <em>Send Initial Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSendInitialValues()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEND_INITIAL_VALUES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSendInitialValues() <em>Send Initial Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSendInitialValues()
	 * @generated
	 * @ordered
	 */
	protected boolean sendInitialValues = SEND_INITIAL_VALUES_EDEFAULT;

	/**
	 * This is true if the Send Initial Values attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sendInitialValuesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferSubscriptionsRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getTransferSubscriptionsRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
	public ListOfUInt32 getSubscriptionIds() {
		return subscriptionIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriptionIds(ListOfUInt32 newSubscriptionIds, NotificationChain msgs) {
		ListOfUInt32 oldSubscriptionIds = subscriptionIds;
		subscriptionIds = newSubscriptionIds;
		boolean oldSubscriptionIdsESet = subscriptionIdsESet;
		subscriptionIdsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__SUBSCRIPTION_IDS, oldSubscriptionIds, newSubscriptionIds, !oldSubscriptionIdsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionIds(ListOfUInt32 newSubscriptionIds) {
		if (newSubscriptionIds != subscriptionIds) {
			NotificationChain msgs = null;
			if (subscriptionIds != null)
				msgs = ((InternalEObject)subscriptionIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__SUBSCRIPTION_IDS, null, msgs);
			if (newSubscriptionIds != null)
				msgs = ((InternalEObject)newSubscriptionIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__SUBSCRIPTION_IDS, null, msgs);
			msgs = basicSetSubscriptionIds(newSubscriptionIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSubscriptionIdsESet = subscriptionIdsESet;
			subscriptionIdsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__SUBSCRIPTION_IDS, newSubscriptionIds, newSubscriptionIds, !oldSubscriptionIdsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSubscriptionIds(NotificationChain msgs) {
		ListOfUInt32 oldSubscriptionIds = subscriptionIds;
		subscriptionIds = null;
		boolean oldSubscriptionIdsESet = subscriptionIdsESet;
		subscriptionIdsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__SUBSCRIPTION_IDS, oldSubscriptionIds, null, oldSubscriptionIdsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSubscriptionIds() {
		if (subscriptionIds != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)subscriptionIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__SUBSCRIPTION_IDS, null, msgs);
			msgs = basicUnsetSubscriptionIds(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSubscriptionIdsESet = subscriptionIdsESet;
			subscriptionIdsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__SUBSCRIPTION_IDS, null, null, oldSubscriptionIdsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubscriptionIds() {
		return subscriptionIdsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSendInitialValues() {
		return sendInitialValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendInitialValues(boolean newSendInitialValues) {
		boolean oldSendInitialValues = sendInitialValues;
		sendInitialValues = newSendInitialValues;
		boolean oldSendInitialValuesESet = sendInitialValuesESet;
		sendInitialValuesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__SEND_INITIAL_VALUES, oldSendInitialValues, sendInitialValues, !oldSendInitialValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSendInitialValues() {
		boolean oldSendInitialValues = sendInitialValues;
		boolean oldSendInitialValuesESet = sendInitialValuesESet;
		sendInitialValues = SEND_INITIAL_VALUES_EDEFAULT;
		sendInitialValuesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__SEND_INITIAL_VALUES, oldSendInitialValues, SEND_INITIAL_VALUES_EDEFAULT, oldSendInitialValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSendInitialValues() {
		return sendInitialValuesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__SUBSCRIPTION_IDS:
				return basicUnsetSubscriptionIds(msgs);
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
			case TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__SUBSCRIPTION_IDS:
				return getSubscriptionIds();
			case TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__SEND_INITIAL_VALUES:
				return isSendInitialValues();
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
			case TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__SUBSCRIPTION_IDS:
				setSubscriptionIds((ListOfUInt32)newValue);
				return;
			case TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__SEND_INITIAL_VALUES:
				setSendInitialValues((Boolean)newValue);
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
			case TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__SUBSCRIPTION_IDS:
				unsetSubscriptionIds();
				return;
			case TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__SEND_INITIAL_VALUES:
				unsetSendInitialValues();
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
			case TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__SUBSCRIPTION_IDS:
				return isSetSubscriptionIds();
			case TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST__SEND_INITIAL_VALUES:
				return isSetSendInitialValues();
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
		result.append(" (sendInitialValues: ");
		if (sendInitialValuesESet) result.append(sendInitialValues); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TransferSubscriptionsRequestImpl
