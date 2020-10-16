/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.BrowseNextRequest;
import org.opcfoundation.ua._2008._02.types.ListOfByteString;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Browse Next Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowseNextRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowseNextRequestImpl#isReleaseContinuationPoints <em>Release Continuation Points</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowseNextRequestImpl#getContinuationPoints <em>Continuation Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrowseNextRequestImpl extends MinimalEObjectImpl.Container implements BrowseNextRequest {
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
	 * The default value of the '{@link #isReleaseContinuationPoints() <em>Release Continuation Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReleaseContinuationPoints()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELEASE_CONTINUATION_POINTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReleaseContinuationPoints() <em>Release Continuation Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReleaseContinuationPoints()
	 * @generated
	 * @ordered
	 */
	protected boolean releaseContinuationPoints = RELEASE_CONTINUATION_POINTS_EDEFAULT;

	/**
	 * This is true if the Release Continuation Points attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean releaseContinuationPointsESet;

	/**
	 * The cached value of the '{@link #getContinuationPoints() <em>Continuation Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuationPoints()
	 * @generated
	 * @ordered
	 */
	protected ListOfByteString continuationPoints;

	/**
	 * This is true if the Continuation Points containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean continuationPointsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowseNextRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getBrowseNextRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_NEXT_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_NEXT_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_NEXT_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_NEXT_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_NEXT_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_NEXT_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_NEXT_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
	public boolean isReleaseContinuationPoints() {
		return releaseContinuationPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseContinuationPoints(boolean newReleaseContinuationPoints) {
		boolean oldReleaseContinuationPoints = releaseContinuationPoints;
		releaseContinuationPoints = newReleaseContinuationPoints;
		boolean oldReleaseContinuationPointsESet = releaseContinuationPointsESet;
		releaseContinuationPointsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_NEXT_REQUEST__RELEASE_CONTINUATION_POINTS, oldReleaseContinuationPoints, releaseContinuationPoints, !oldReleaseContinuationPointsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReleaseContinuationPoints() {
		boolean oldReleaseContinuationPoints = releaseContinuationPoints;
		boolean oldReleaseContinuationPointsESet = releaseContinuationPointsESet;
		releaseContinuationPoints = RELEASE_CONTINUATION_POINTS_EDEFAULT;
		releaseContinuationPointsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_NEXT_REQUEST__RELEASE_CONTINUATION_POINTS, oldReleaseContinuationPoints, RELEASE_CONTINUATION_POINTS_EDEFAULT, oldReleaseContinuationPointsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReleaseContinuationPoints() {
		return releaseContinuationPointsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfByteString getContinuationPoints() {
		return continuationPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContinuationPoints(ListOfByteString newContinuationPoints, NotificationChain msgs) {
		ListOfByteString oldContinuationPoints = continuationPoints;
		continuationPoints = newContinuationPoints;
		boolean oldContinuationPointsESet = continuationPointsESet;
		continuationPointsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_NEXT_REQUEST__CONTINUATION_POINTS, oldContinuationPoints, newContinuationPoints, !oldContinuationPointsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinuationPoints(ListOfByteString newContinuationPoints) {
		if (newContinuationPoints != continuationPoints) {
			NotificationChain msgs = null;
			if (continuationPoints != null)
				msgs = ((InternalEObject)continuationPoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_NEXT_REQUEST__CONTINUATION_POINTS, null, msgs);
			if (newContinuationPoints != null)
				msgs = ((InternalEObject)newContinuationPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_NEXT_REQUEST__CONTINUATION_POINTS, null, msgs);
			msgs = basicSetContinuationPoints(newContinuationPoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldContinuationPointsESet = continuationPointsESet;
			continuationPointsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_NEXT_REQUEST__CONTINUATION_POINTS, newContinuationPoints, newContinuationPoints, !oldContinuationPointsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetContinuationPoints(NotificationChain msgs) {
		ListOfByteString oldContinuationPoints = continuationPoints;
		continuationPoints = null;
		boolean oldContinuationPointsESet = continuationPointsESet;
		continuationPointsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_NEXT_REQUEST__CONTINUATION_POINTS, oldContinuationPoints, null, oldContinuationPointsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContinuationPoints() {
		if (continuationPoints != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)continuationPoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_NEXT_REQUEST__CONTINUATION_POINTS, null, msgs);
			msgs = basicUnsetContinuationPoints(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldContinuationPointsESet = continuationPointsESet;
			continuationPointsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_NEXT_REQUEST__CONTINUATION_POINTS, null, null, oldContinuationPointsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContinuationPoints() {
		return continuationPointsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.BROWSE_NEXT_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.BROWSE_NEXT_REQUEST__CONTINUATION_POINTS:
				return basicUnsetContinuationPoints(msgs);
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
			case TypesPackage.BROWSE_NEXT_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.BROWSE_NEXT_REQUEST__RELEASE_CONTINUATION_POINTS:
				return isReleaseContinuationPoints();
			case TypesPackage.BROWSE_NEXT_REQUEST__CONTINUATION_POINTS:
				return getContinuationPoints();
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
			case TypesPackage.BROWSE_NEXT_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.BROWSE_NEXT_REQUEST__RELEASE_CONTINUATION_POINTS:
				setReleaseContinuationPoints((Boolean)newValue);
				return;
			case TypesPackage.BROWSE_NEXT_REQUEST__CONTINUATION_POINTS:
				setContinuationPoints((ListOfByteString)newValue);
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
			case TypesPackage.BROWSE_NEXT_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.BROWSE_NEXT_REQUEST__RELEASE_CONTINUATION_POINTS:
				unsetReleaseContinuationPoints();
				return;
			case TypesPackage.BROWSE_NEXT_REQUEST__CONTINUATION_POINTS:
				unsetContinuationPoints();
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
			case TypesPackage.BROWSE_NEXT_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.BROWSE_NEXT_REQUEST__RELEASE_CONTINUATION_POINTS:
				return isSetReleaseContinuationPoints();
			case TypesPackage.BROWSE_NEXT_REQUEST__CONTINUATION_POINTS:
				return isSetContinuationPoints();
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
		result.append(" (releaseContinuationPoints: ");
		if (releaseContinuationPointsESet) result.append(releaseContinuationPoints); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BrowseNextRequestImpl
