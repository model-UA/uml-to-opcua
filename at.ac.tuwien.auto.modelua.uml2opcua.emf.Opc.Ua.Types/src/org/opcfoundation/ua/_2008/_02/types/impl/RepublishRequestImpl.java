/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.RepublishRequest;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Republish Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RepublishRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RepublishRequestImpl#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RepublishRequestImpl#getRetransmitSequenceNumber <em>Retransmit Sequence Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepublishRequestImpl extends MinimalEObjectImpl.Container implements RepublishRequest {
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
	 * The default value of the '{@link #getRetransmitSequenceNumber() <em>Retransmit Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetransmitSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final long RETRANSMIT_SEQUENCE_NUMBER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRetransmitSequenceNumber() <em>Retransmit Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetransmitSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected long retransmitSequenceNumber = RETRANSMIT_SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Retransmit Sequence Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean retransmitSequenceNumberESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepublishRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getRepublishRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.REPUBLISH_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REPUBLISH_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REPUBLISH_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REPUBLISH_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.REPUBLISH_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REPUBLISH_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REPUBLISH_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REPUBLISH_REQUEST__SUBSCRIPTION_ID, oldSubscriptionId, subscriptionId, !oldSubscriptionIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REPUBLISH_REQUEST__SUBSCRIPTION_ID, oldSubscriptionId, SUBSCRIPTION_ID_EDEFAULT, oldSubscriptionIdESet));
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
	public long getRetransmitSequenceNumber() {
		return retransmitSequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetransmitSequenceNumber(long newRetransmitSequenceNumber) {
		long oldRetransmitSequenceNumber = retransmitSequenceNumber;
		retransmitSequenceNumber = newRetransmitSequenceNumber;
		boolean oldRetransmitSequenceNumberESet = retransmitSequenceNumberESet;
		retransmitSequenceNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REPUBLISH_REQUEST__RETRANSMIT_SEQUENCE_NUMBER, oldRetransmitSequenceNumber, retransmitSequenceNumber, !oldRetransmitSequenceNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRetransmitSequenceNumber() {
		long oldRetransmitSequenceNumber = retransmitSequenceNumber;
		boolean oldRetransmitSequenceNumberESet = retransmitSequenceNumberESet;
		retransmitSequenceNumber = RETRANSMIT_SEQUENCE_NUMBER_EDEFAULT;
		retransmitSequenceNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REPUBLISH_REQUEST__RETRANSMIT_SEQUENCE_NUMBER, oldRetransmitSequenceNumber, RETRANSMIT_SEQUENCE_NUMBER_EDEFAULT, oldRetransmitSequenceNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRetransmitSequenceNumber() {
		return retransmitSequenceNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.REPUBLISH_REQUEST__REQUEST_HEADER:
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
			case TypesPackage.REPUBLISH_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.REPUBLISH_REQUEST__SUBSCRIPTION_ID:
				return getSubscriptionId();
			case TypesPackage.REPUBLISH_REQUEST__RETRANSMIT_SEQUENCE_NUMBER:
				return getRetransmitSequenceNumber();
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
			case TypesPackage.REPUBLISH_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.REPUBLISH_REQUEST__SUBSCRIPTION_ID:
				setSubscriptionId((Long)newValue);
				return;
			case TypesPackage.REPUBLISH_REQUEST__RETRANSMIT_SEQUENCE_NUMBER:
				setRetransmitSequenceNumber((Long)newValue);
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
			case TypesPackage.REPUBLISH_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.REPUBLISH_REQUEST__SUBSCRIPTION_ID:
				unsetSubscriptionId();
				return;
			case TypesPackage.REPUBLISH_REQUEST__RETRANSMIT_SEQUENCE_NUMBER:
				unsetRetransmitSequenceNumber();
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
			case TypesPackage.REPUBLISH_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.REPUBLISH_REQUEST__SUBSCRIPTION_ID:
				return isSetSubscriptionId();
			case TypesPackage.REPUBLISH_REQUEST__RETRANSMIT_SEQUENCE_NUMBER:
				return isSetRetransmitSequenceNumber();
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
		result.append(", retransmitSequenceNumber: ");
		if (retransmitSequenceNumberESet) result.append(retransmitSequenceNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RepublishRequestImpl
