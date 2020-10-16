/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.HistoryUpdateRequest;
import org.opcfoundation.ua._2008._02.types.ListOfExtensionObject;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Update Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.HistoryUpdateRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.HistoryUpdateRequestImpl#getHistoryUpdateDetails <em>History Update Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoryUpdateRequestImpl extends MinimalEObjectImpl.Container implements HistoryUpdateRequest {
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
	 * The cached value of the '{@link #getHistoryUpdateDetails() <em>History Update Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryUpdateDetails()
	 * @generated
	 * @ordered
	 */
	protected ListOfExtensionObject historyUpdateDetails;

	/**
	 * This is true if the History Update Details containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean historyUpdateDetailsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryUpdateRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getHistoryUpdateRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_UPDATE_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_UPDATE_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_UPDATE_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_UPDATE_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_UPDATE_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_UPDATE_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_UPDATE_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
	public ListOfExtensionObject getHistoryUpdateDetails() {
		return historyUpdateDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryUpdateDetails(ListOfExtensionObject newHistoryUpdateDetails, NotificationChain msgs) {
		ListOfExtensionObject oldHistoryUpdateDetails = historyUpdateDetails;
		historyUpdateDetails = newHistoryUpdateDetails;
		boolean oldHistoryUpdateDetailsESet = historyUpdateDetailsESet;
		historyUpdateDetailsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_UPDATE_REQUEST__HISTORY_UPDATE_DETAILS, oldHistoryUpdateDetails, newHistoryUpdateDetails, !oldHistoryUpdateDetailsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryUpdateDetails(ListOfExtensionObject newHistoryUpdateDetails) {
		if (newHistoryUpdateDetails != historyUpdateDetails) {
			NotificationChain msgs = null;
			if (historyUpdateDetails != null)
				msgs = ((InternalEObject)historyUpdateDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_UPDATE_REQUEST__HISTORY_UPDATE_DETAILS, null, msgs);
			if (newHistoryUpdateDetails != null)
				msgs = ((InternalEObject)newHistoryUpdateDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_UPDATE_REQUEST__HISTORY_UPDATE_DETAILS, null, msgs);
			msgs = basicSetHistoryUpdateDetails(newHistoryUpdateDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldHistoryUpdateDetailsESet = historyUpdateDetailsESet;
			historyUpdateDetailsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_UPDATE_REQUEST__HISTORY_UPDATE_DETAILS, newHistoryUpdateDetails, newHistoryUpdateDetails, !oldHistoryUpdateDetailsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetHistoryUpdateDetails(NotificationChain msgs) {
		ListOfExtensionObject oldHistoryUpdateDetails = historyUpdateDetails;
		historyUpdateDetails = null;
		boolean oldHistoryUpdateDetailsESet = historyUpdateDetailsESet;
		historyUpdateDetailsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_UPDATE_REQUEST__HISTORY_UPDATE_DETAILS, oldHistoryUpdateDetails, null, oldHistoryUpdateDetailsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHistoryUpdateDetails() {
		if (historyUpdateDetails != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)historyUpdateDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_UPDATE_REQUEST__HISTORY_UPDATE_DETAILS, null, msgs);
			msgs = basicUnsetHistoryUpdateDetails(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldHistoryUpdateDetailsESet = historyUpdateDetailsESet;
			historyUpdateDetailsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_UPDATE_REQUEST__HISTORY_UPDATE_DETAILS, null, null, oldHistoryUpdateDetailsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHistoryUpdateDetails() {
		return historyUpdateDetailsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.HISTORY_UPDATE_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.HISTORY_UPDATE_REQUEST__HISTORY_UPDATE_DETAILS:
				return basicUnsetHistoryUpdateDetails(msgs);
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
			case TypesPackage.HISTORY_UPDATE_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.HISTORY_UPDATE_REQUEST__HISTORY_UPDATE_DETAILS:
				return getHistoryUpdateDetails();
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
			case TypesPackage.HISTORY_UPDATE_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.HISTORY_UPDATE_REQUEST__HISTORY_UPDATE_DETAILS:
				setHistoryUpdateDetails((ListOfExtensionObject)newValue);
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
			case TypesPackage.HISTORY_UPDATE_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.HISTORY_UPDATE_REQUEST__HISTORY_UPDATE_DETAILS:
				unsetHistoryUpdateDetails();
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
			case TypesPackage.HISTORY_UPDATE_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.HISTORY_UPDATE_REQUEST__HISTORY_UPDATE_DETAILS:
				return isSetHistoryUpdateDetails();
		}
		return super.eIsSet(featureID);
	}

} //HistoryUpdateRequestImpl
