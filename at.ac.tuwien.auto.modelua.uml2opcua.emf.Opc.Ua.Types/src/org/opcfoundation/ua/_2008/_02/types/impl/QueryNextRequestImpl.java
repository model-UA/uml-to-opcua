/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.QueryNextRequest;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Next Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryNextRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryNextRequestImpl#isReleaseContinuationPoint <em>Release Continuation Point</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryNextRequestImpl#getContinuationPoint <em>Continuation Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryNextRequestImpl extends MinimalEObjectImpl.Container implements QueryNextRequest {
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
	 * The default value of the '{@link #isReleaseContinuationPoint() <em>Release Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReleaseContinuationPoint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELEASE_CONTINUATION_POINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReleaseContinuationPoint() <em>Release Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReleaseContinuationPoint()
	 * @generated
	 * @ordered
	 */
	protected boolean releaseContinuationPoint = RELEASE_CONTINUATION_POINT_EDEFAULT;

	/**
	 * This is true if the Release Continuation Point attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean releaseContinuationPointESet;

	/**
	 * The default value of the '{@link #getContinuationPoint() <em>Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuationPoint()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CONTINUATION_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContinuationPoint() <em>Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuationPoint()
	 * @generated
	 * @ordered
	 */
	protected byte[] continuationPoint = CONTINUATION_POINT_EDEFAULT;

	/**
	 * This is true if the Continuation Point attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean continuationPointESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryNextRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getQueryNextRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_NEXT_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_NEXT_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_NEXT_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_NEXT_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_NEXT_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_NEXT_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_NEXT_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
	public boolean isReleaseContinuationPoint() {
		return releaseContinuationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseContinuationPoint(boolean newReleaseContinuationPoint) {
		boolean oldReleaseContinuationPoint = releaseContinuationPoint;
		releaseContinuationPoint = newReleaseContinuationPoint;
		boolean oldReleaseContinuationPointESet = releaseContinuationPointESet;
		releaseContinuationPointESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_NEXT_REQUEST__RELEASE_CONTINUATION_POINT, oldReleaseContinuationPoint, releaseContinuationPoint, !oldReleaseContinuationPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReleaseContinuationPoint() {
		boolean oldReleaseContinuationPoint = releaseContinuationPoint;
		boolean oldReleaseContinuationPointESet = releaseContinuationPointESet;
		releaseContinuationPoint = RELEASE_CONTINUATION_POINT_EDEFAULT;
		releaseContinuationPointESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_NEXT_REQUEST__RELEASE_CONTINUATION_POINT, oldReleaseContinuationPoint, RELEASE_CONTINUATION_POINT_EDEFAULT, oldReleaseContinuationPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReleaseContinuationPoint() {
		return releaseContinuationPointESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getContinuationPoint() {
		return continuationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinuationPoint(byte[] newContinuationPoint) {
		byte[] oldContinuationPoint = continuationPoint;
		continuationPoint = newContinuationPoint;
		boolean oldContinuationPointESet = continuationPointESet;
		continuationPointESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_NEXT_REQUEST__CONTINUATION_POINT, oldContinuationPoint, continuationPoint, !oldContinuationPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContinuationPoint() {
		byte[] oldContinuationPoint = continuationPoint;
		boolean oldContinuationPointESet = continuationPointESet;
		continuationPoint = CONTINUATION_POINT_EDEFAULT;
		continuationPointESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_NEXT_REQUEST__CONTINUATION_POINT, oldContinuationPoint, CONTINUATION_POINT_EDEFAULT, oldContinuationPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContinuationPoint() {
		return continuationPointESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.QUERY_NEXT_REQUEST__REQUEST_HEADER:
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
			case TypesPackage.QUERY_NEXT_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.QUERY_NEXT_REQUEST__RELEASE_CONTINUATION_POINT:
				return isReleaseContinuationPoint();
			case TypesPackage.QUERY_NEXT_REQUEST__CONTINUATION_POINT:
				return getContinuationPoint();
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
			case TypesPackage.QUERY_NEXT_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.QUERY_NEXT_REQUEST__RELEASE_CONTINUATION_POINT:
				setReleaseContinuationPoint((Boolean)newValue);
				return;
			case TypesPackage.QUERY_NEXT_REQUEST__CONTINUATION_POINT:
				setContinuationPoint((byte[])newValue);
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
			case TypesPackage.QUERY_NEXT_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.QUERY_NEXT_REQUEST__RELEASE_CONTINUATION_POINT:
				unsetReleaseContinuationPoint();
				return;
			case TypesPackage.QUERY_NEXT_REQUEST__CONTINUATION_POINT:
				unsetContinuationPoint();
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
			case TypesPackage.QUERY_NEXT_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.QUERY_NEXT_REQUEST__RELEASE_CONTINUATION_POINT:
				return isSetReleaseContinuationPoint();
			case TypesPackage.QUERY_NEXT_REQUEST__CONTINUATION_POINT:
				return isSetContinuationPoint();
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
		result.append(" (releaseContinuationPoint: ");
		if (releaseContinuationPointESet) result.append(releaseContinuationPoint); else result.append("<unset>");
		result.append(", continuationPoint: ");
		if (continuationPointESet) result.append(continuationPoint); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //QueryNextRequestImpl
