/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfSubscriptionAcknowledgement;
import org.opcfoundation.ua._2008._02.types.PublishRequest;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publish Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.PublishRequestImpl#getSubscriptionAcknowledgements <em>Subscription Acknowledgements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublishRequestImpl extends MinimalEObjectImpl.Container implements PublishRequest {
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
	 * The cached value of the '{@link #getSubscriptionAcknowledgements() <em>Subscription Acknowledgements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionAcknowledgements()
	 * @generated
	 * @ordered
	 */
	protected ListOfSubscriptionAcknowledgement subscriptionAcknowledgements;

	/**
	 * This is true if the Subscription Acknowledgements containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subscriptionAcknowledgementsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublishRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getPublishRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISH_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISH_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISH_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISH_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
	public ListOfSubscriptionAcknowledgement getSubscriptionAcknowledgements() {
		return subscriptionAcknowledgements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriptionAcknowledgements(ListOfSubscriptionAcknowledgement newSubscriptionAcknowledgements, NotificationChain msgs) {
		ListOfSubscriptionAcknowledgement oldSubscriptionAcknowledgements = subscriptionAcknowledgements;
		subscriptionAcknowledgements = newSubscriptionAcknowledgements;
		boolean oldSubscriptionAcknowledgementsESet = subscriptionAcknowledgementsESet;
		subscriptionAcknowledgementsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISH_REQUEST__SUBSCRIPTION_ACKNOWLEDGEMENTS, oldSubscriptionAcknowledgements, newSubscriptionAcknowledgements, !oldSubscriptionAcknowledgementsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionAcknowledgements(ListOfSubscriptionAcknowledgement newSubscriptionAcknowledgements) {
		if (newSubscriptionAcknowledgements != subscriptionAcknowledgements) {
			NotificationChain msgs = null;
			if (subscriptionAcknowledgements != null)
				msgs = ((InternalEObject)subscriptionAcknowledgements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_REQUEST__SUBSCRIPTION_ACKNOWLEDGEMENTS, null, msgs);
			if (newSubscriptionAcknowledgements != null)
				msgs = ((InternalEObject)newSubscriptionAcknowledgements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_REQUEST__SUBSCRIPTION_ACKNOWLEDGEMENTS, null, msgs);
			msgs = basicSetSubscriptionAcknowledgements(newSubscriptionAcknowledgements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSubscriptionAcknowledgementsESet = subscriptionAcknowledgementsESet;
			subscriptionAcknowledgementsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PUBLISH_REQUEST__SUBSCRIPTION_ACKNOWLEDGEMENTS, newSubscriptionAcknowledgements, newSubscriptionAcknowledgements, !oldSubscriptionAcknowledgementsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSubscriptionAcknowledgements(NotificationChain msgs) {
		ListOfSubscriptionAcknowledgement oldSubscriptionAcknowledgements = subscriptionAcknowledgements;
		subscriptionAcknowledgements = null;
		boolean oldSubscriptionAcknowledgementsESet = subscriptionAcknowledgementsESet;
		subscriptionAcknowledgementsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISH_REQUEST__SUBSCRIPTION_ACKNOWLEDGEMENTS, oldSubscriptionAcknowledgements, null, oldSubscriptionAcknowledgementsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSubscriptionAcknowledgements() {
		if (subscriptionAcknowledgements != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)subscriptionAcknowledgements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PUBLISH_REQUEST__SUBSCRIPTION_ACKNOWLEDGEMENTS, null, msgs);
			msgs = basicUnsetSubscriptionAcknowledgements(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSubscriptionAcknowledgementsESet = subscriptionAcknowledgementsESet;
			subscriptionAcknowledgementsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PUBLISH_REQUEST__SUBSCRIPTION_ACKNOWLEDGEMENTS, null, null, oldSubscriptionAcknowledgementsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubscriptionAcknowledgements() {
		return subscriptionAcknowledgementsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.PUBLISH_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.PUBLISH_REQUEST__SUBSCRIPTION_ACKNOWLEDGEMENTS:
				return basicUnsetSubscriptionAcknowledgements(msgs);
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
			case TypesPackage.PUBLISH_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.PUBLISH_REQUEST__SUBSCRIPTION_ACKNOWLEDGEMENTS:
				return getSubscriptionAcknowledgements();
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
			case TypesPackage.PUBLISH_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.PUBLISH_REQUEST__SUBSCRIPTION_ACKNOWLEDGEMENTS:
				setSubscriptionAcknowledgements((ListOfSubscriptionAcknowledgement)newValue);
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
			case TypesPackage.PUBLISH_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.PUBLISH_REQUEST__SUBSCRIPTION_ACKNOWLEDGEMENTS:
				unsetSubscriptionAcknowledgements();
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
			case TypesPackage.PUBLISH_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.PUBLISH_REQUEST__SUBSCRIPTION_ACKNOWLEDGEMENTS:
				return isSetSubscriptionAcknowledgements();
		}
		return super.eIsSet(featureID);
	}

} //PublishRequestImpl
