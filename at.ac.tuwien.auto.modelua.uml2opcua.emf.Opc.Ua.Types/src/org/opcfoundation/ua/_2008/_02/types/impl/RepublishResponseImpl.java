/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.NotificationMessage;
import org.opcfoundation.ua._2008._02.types.RepublishResponse;
import org.opcfoundation.ua._2008._02.types.ResponseHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Republish Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RepublishResponseImpl#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.RepublishResponseImpl#getNotificationMessage <em>Notification Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepublishResponseImpl extends MinimalEObjectImpl.Container implements RepublishResponse {
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
	 * The cached value of the '{@link #getNotificationMessage() <em>Notification Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationMessage()
	 * @generated
	 * @ordered
	 */
	protected NotificationMessage notificationMessage;

	/**
	 * This is true if the Notification Message containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean notificationMessageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepublishResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getRepublishResponse();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.REPUBLISH_RESPONSE__RESPONSE_HEADER, oldResponseHeader, newResponseHeader, !oldResponseHeaderESet);
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
				msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REPUBLISH_RESPONSE__RESPONSE_HEADER, null, msgs);
			if (newResponseHeader != null)
				msgs = ((InternalEObject)newResponseHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REPUBLISH_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicSetResponseHeader(newResponseHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REPUBLISH_RESPONSE__RESPONSE_HEADER, newResponseHeader, newResponseHeader, !oldResponseHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.REPUBLISH_RESPONSE__RESPONSE_HEADER, oldResponseHeader, null, oldResponseHeaderESet);
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
			msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REPUBLISH_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicUnsetResponseHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REPUBLISH_RESPONSE__RESPONSE_HEADER, null, null, oldResponseHeaderESet));
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
	public NotificationMessage getNotificationMessage() {
		return notificationMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotificationMessage(NotificationMessage newNotificationMessage, NotificationChain msgs) {
		NotificationMessage oldNotificationMessage = notificationMessage;
		notificationMessage = newNotificationMessage;
		boolean oldNotificationMessageESet = notificationMessageESet;
		notificationMessageESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.REPUBLISH_RESPONSE__NOTIFICATION_MESSAGE, oldNotificationMessage, newNotificationMessage, !oldNotificationMessageESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationMessage(NotificationMessage newNotificationMessage) {
		if (newNotificationMessage != notificationMessage) {
			NotificationChain msgs = null;
			if (notificationMessage != null)
				msgs = ((InternalEObject)notificationMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REPUBLISH_RESPONSE__NOTIFICATION_MESSAGE, null, msgs);
			if (newNotificationMessage != null)
				msgs = ((InternalEObject)newNotificationMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REPUBLISH_RESPONSE__NOTIFICATION_MESSAGE, null, msgs);
			msgs = basicSetNotificationMessage(newNotificationMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNotificationMessageESet = notificationMessageESet;
			notificationMessageESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.REPUBLISH_RESPONSE__NOTIFICATION_MESSAGE, newNotificationMessage, newNotificationMessage, !oldNotificationMessageESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetNotificationMessage(NotificationChain msgs) {
		NotificationMessage oldNotificationMessage = notificationMessage;
		notificationMessage = null;
		boolean oldNotificationMessageESet = notificationMessageESet;
		notificationMessageESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.REPUBLISH_RESPONSE__NOTIFICATION_MESSAGE, oldNotificationMessage, null, oldNotificationMessageESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNotificationMessage() {
		if (notificationMessage != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)notificationMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.REPUBLISH_RESPONSE__NOTIFICATION_MESSAGE, null, msgs);
			msgs = basicUnsetNotificationMessage(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNotificationMessageESet = notificationMessageESet;
			notificationMessageESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.REPUBLISH_RESPONSE__NOTIFICATION_MESSAGE, null, null, oldNotificationMessageESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNotificationMessage() {
		return notificationMessageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.REPUBLISH_RESPONSE__RESPONSE_HEADER:
				return basicUnsetResponseHeader(msgs);
			case TypesPackage.REPUBLISH_RESPONSE__NOTIFICATION_MESSAGE:
				return basicUnsetNotificationMessage(msgs);
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
			case TypesPackage.REPUBLISH_RESPONSE__RESPONSE_HEADER:
				return getResponseHeader();
			case TypesPackage.REPUBLISH_RESPONSE__NOTIFICATION_MESSAGE:
				return getNotificationMessage();
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
			case TypesPackage.REPUBLISH_RESPONSE__RESPONSE_HEADER:
				setResponseHeader((ResponseHeader)newValue);
				return;
			case TypesPackage.REPUBLISH_RESPONSE__NOTIFICATION_MESSAGE:
				setNotificationMessage((NotificationMessage)newValue);
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
			case TypesPackage.REPUBLISH_RESPONSE__RESPONSE_HEADER:
				unsetResponseHeader();
				return;
			case TypesPackage.REPUBLISH_RESPONSE__NOTIFICATION_MESSAGE:
				unsetNotificationMessage();
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
			case TypesPackage.REPUBLISH_RESPONSE__RESPONSE_HEADER:
				return isSetResponseHeader();
			case TypesPackage.REPUBLISH_RESPONSE__NOTIFICATION_MESSAGE:
				return isSetNotificationMessage();
		}
		return super.eIsSet(featureID);
	}

} //RepublishResponseImpl
