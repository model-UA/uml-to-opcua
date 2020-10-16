/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse;
import org.opcfoundation.ua._2008._02.types.ResponseHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Subscription Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModifySubscriptionResponseImpl#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModifySubscriptionResponseImpl#getRevisedPublishingInterval <em>Revised Publishing Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModifySubscriptionResponseImpl#getRevisedLifetimeCount <em>Revised Lifetime Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ModifySubscriptionResponseImpl#getRevisedMaxKeepAliveCount <em>Revised Max Keep Alive Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifySubscriptionResponseImpl extends MinimalEObjectImpl.Container implements ModifySubscriptionResponse {
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
	 * The default value of the '{@link #getRevisedPublishingInterval() <em>Revised Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedPublishingInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double REVISED_PUBLISHING_INTERVAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRevisedPublishingInterval() <em>Revised Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedPublishingInterval()
	 * @generated
	 * @ordered
	 */
	protected double revisedPublishingInterval = REVISED_PUBLISHING_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Revised Publishing Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revisedPublishingIntervalESet;

	/**
	 * The default value of the '{@link #getRevisedLifetimeCount() <em>Revised Lifetime Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedLifetimeCount()
	 * @generated
	 * @ordered
	 */
	protected static final long REVISED_LIFETIME_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRevisedLifetimeCount() <em>Revised Lifetime Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedLifetimeCount()
	 * @generated
	 * @ordered
	 */
	protected long revisedLifetimeCount = REVISED_LIFETIME_COUNT_EDEFAULT;

	/**
	 * This is true if the Revised Lifetime Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revisedLifetimeCountESet;

	/**
	 * The default value of the '{@link #getRevisedMaxKeepAliveCount() <em>Revised Max Keep Alive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedMaxKeepAliveCount()
	 * @generated
	 * @ordered
	 */
	protected static final long REVISED_MAX_KEEP_ALIVE_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRevisedMaxKeepAliveCount() <em>Revised Max Keep Alive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedMaxKeepAliveCount()
	 * @generated
	 * @ordered
	 */
	protected long revisedMaxKeepAliveCount = REVISED_MAX_KEEP_ALIVE_COUNT_EDEFAULT;

	/**
	 * This is true if the Revised Max Keep Alive Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revisedMaxKeepAliveCountESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifySubscriptionResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getModifySubscriptionResponse();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__RESPONSE_HEADER, oldResponseHeader, newResponseHeader, !oldResponseHeaderESet);
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
				msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__RESPONSE_HEADER, null, msgs);
			if (newResponseHeader != null)
				msgs = ((InternalEObject)newResponseHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicSetResponseHeader(newResponseHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__RESPONSE_HEADER, newResponseHeader, newResponseHeader, !oldResponseHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__RESPONSE_HEADER, oldResponseHeader, null, oldResponseHeaderESet);
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
			msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicUnsetResponseHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__RESPONSE_HEADER, null, null, oldResponseHeaderESet));
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
	public double getRevisedPublishingInterval() {
		return revisedPublishingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisedPublishingInterval(double newRevisedPublishingInterval) {
		double oldRevisedPublishingInterval = revisedPublishingInterval;
		revisedPublishingInterval = newRevisedPublishingInterval;
		boolean oldRevisedPublishingIntervalESet = revisedPublishingIntervalESet;
		revisedPublishingIntervalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__REVISED_PUBLISHING_INTERVAL, oldRevisedPublishingInterval, revisedPublishingInterval, !oldRevisedPublishingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRevisedPublishingInterval() {
		double oldRevisedPublishingInterval = revisedPublishingInterval;
		boolean oldRevisedPublishingIntervalESet = revisedPublishingIntervalESet;
		revisedPublishingInterval = REVISED_PUBLISHING_INTERVAL_EDEFAULT;
		revisedPublishingIntervalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__REVISED_PUBLISHING_INTERVAL, oldRevisedPublishingInterval, REVISED_PUBLISHING_INTERVAL_EDEFAULT, oldRevisedPublishingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRevisedPublishingInterval() {
		return revisedPublishingIntervalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRevisedLifetimeCount() {
		return revisedLifetimeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisedLifetimeCount(long newRevisedLifetimeCount) {
		long oldRevisedLifetimeCount = revisedLifetimeCount;
		revisedLifetimeCount = newRevisedLifetimeCount;
		boolean oldRevisedLifetimeCountESet = revisedLifetimeCountESet;
		revisedLifetimeCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__REVISED_LIFETIME_COUNT, oldRevisedLifetimeCount, revisedLifetimeCount, !oldRevisedLifetimeCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRevisedLifetimeCount() {
		long oldRevisedLifetimeCount = revisedLifetimeCount;
		boolean oldRevisedLifetimeCountESet = revisedLifetimeCountESet;
		revisedLifetimeCount = REVISED_LIFETIME_COUNT_EDEFAULT;
		revisedLifetimeCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__REVISED_LIFETIME_COUNT, oldRevisedLifetimeCount, REVISED_LIFETIME_COUNT_EDEFAULT, oldRevisedLifetimeCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRevisedLifetimeCount() {
		return revisedLifetimeCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRevisedMaxKeepAliveCount() {
		return revisedMaxKeepAliveCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisedMaxKeepAliveCount(long newRevisedMaxKeepAliveCount) {
		long oldRevisedMaxKeepAliveCount = revisedMaxKeepAliveCount;
		revisedMaxKeepAliveCount = newRevisedMaxKeepAliveCount;
		boolean oldRevisedMaxKeepAliveCountESet = revisedMaxKeepAliveCountESet;
		revisedMaxKeepAliveCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__REVISED_MAX_KEEP_ALIVE_COUNT, oldRevisedMaxKeepAliveCount, revisedMaxKeepAliveCount, !oldRevisedMaxKeepAliveCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRevisedMaxKeepAliveCount() {
		long oldRevisedMaxKeepAliveCount = revisedMaxKeepAliveCount;
		boolean oldRevisedMaxKeepAliveCountESet = revisedMaxKeepAliveCountESet;
		revisedMaxKeepAliveCount = REVISED_MAX_KEEP_ALIVE_COUNT_EDEFAULT;
		revisedMaxKeepAliveCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__REVISED_MAX_KEEP_ALIVE_COUNT, oldRevisedMaxKeepAliveCount, REVISED_MAX_KEEP_ALIVE_COUNT_EDEFAULT, oldRevisedMaxKeepAliveCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRevisedMaxKeepAliveCount() {
		return revisedMaxKeepAliveCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__RESPONSE_HEADER:
				return basicUnsetResponseHeader(msgs);
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
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__RESPONSE_HEADER:
				return getResponseHeader();
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__REVISED_PUBLISHING_INTERVAL:
				return getRevisedPublishingInterval();
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__REVISED_LIFETIME_COUNT:
				return getRevisedLifetimeCount();
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__REVISED_MAX_KEEP_ALIVE_COUNT:
				return getRevisedMaxKeepAliveCount();
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
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__RESPONSE_HEADER:
				setResponseHeader((ResponseHeader)newValue);
				return;
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__REVISED_PUBLISHING_INTERVAL:
				setRevisedPublishingInterval((Double)newValue);
				return;
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__REVISED_LIFETIME_COUNT:
				setRevisedLifetimeCount((Long)newValue);
				return;
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__REVISED_MAX_KEEP_ALIVE_COUNT:
				setRevisedMaxKeepAliveCount((Long)newValue);
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
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__RESPONSE_HEADER:
				unsetResponseHeader();
				return;
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__REVISED_PUBLISHING_INTERVAL:
				unsetRevisedPublishingInterval();
				return;
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__REVISED_LIFETIME_COUNT:
				unsetRevisedLifetimeCount();
				return;
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__REVISED_MAX_KEEP_ALIVE_COUNT:
				unsetRevisedMaxKeepAliveCount();
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
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__RESPONSE_HEADER:
				return isSetResponseHeader();
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__REVISED_PUBLISHING_INTERVAL:
				return isSetRevisedPublishingInterval();
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__REVISED_LIFETIME_COUNT:
				return isSetRevisedLifetimeCount();
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE__REVISED_MAX_KEEP_ALIVE_COUNT:
				return isSetRevisedMaxKeepAliveCount();
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
		result.append(" (revisedPublishingInterval: ");
		if (revisedPublishingIntervalESet) result.append(revisedPublishingInterval); else result.append("<unset>");
		result.append(", revisedLifetimeCount: ");
		if (revisedLifetimeCountESet) result.append(revisedLifetimeCount); else result.append("<unset>");
		result.append(", revisedMaxKeepAliveCount: ");
		if (revisedMaxKeepAliveCountESet) result.append(revisedMaxKeepAliveCount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ModifySubscriptionResponseImpl
