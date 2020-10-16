/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfBrowsePath;
import org.opcfoundation.ua._2008._02.types.RequestHeader;
import org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsRequest;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Translate Browse Paths To Node Ids Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.TranslateBrowsePathsToNodeIdsRequestImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.TranslateBrowsePathsToNodeIdsRequestImpl#getBrowsePaths <em>Browse Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TranslateBrowsePathsToNodeIdsRequestImpl extends MinimalEObjectImpl.Container implements TranslateBrowsePathsToNodeIdsRequest {
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
	 * The cached value of the '{@link #getBrowsePaths() <em>Browse Paths</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowsePaths()
	 * @generated
	 * @ordered
	 */
	protected ListOfBrowsePath browsePaths;

	/**
	 * This is true if the Browse Paths containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean browsePathsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TranslateBrowsePathsToNodeIdsRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getTranslateBrowsePathsToNodeIdsRequest();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__REQUEST_HEADER, oldRequestHeader, newRequestHeader, !oldRequestHeaderESet);
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
				msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__REQUEST_HEADER, null, msgs);
			if (newRequestHeader != null)
				msgs = ((InternalEObject)newRequestHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicSetRequestHeader(newRequestHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__REQUEST_HEADER, newRequestHeader, newRequestHeader, !oldRequestHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__REQUEST_HEADER, oldRequestHeader, null, oldRequestHeaderESet);
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
			msgs = ((InternalEObject)requestHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__REQUEST_HEADER, null, msgs);
			msgs = basicUnsetRequestHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRequestHeaderESet = requestHeaderESet;
			requestHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__REQUEST_HEADER, null, null, oldRequestHeaderESet));
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
	public ListOfBrowsePath getBrowsePaths() {
		return browsePaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrowsePaths(ListOfBrowsePath newBrowsePaths, NotificationChain msgs) {
		ListOfBrowsePath oldBrowsePaths = browsePaths;
		browsePaths = newBrowsePaths;
		boolean oldBrowsePathsESet = browsePathsESet;
		browsePathsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__BROWSE_PATHS, oldBrowsePaths, newBrowsePaths, !oldBrowsePathsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowsePaths(ListOfBrowsePath newBrowsePaths) {
		if (newBrowsePaths != browsePaths) {
			NotificationChain msgs = null;
			if (browsePaths != null)
				msgs = ((InternalEObject)browsePaths).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__BROWSE_PATHS, null, msgs);
			if (newBrowsePaths != null)
				msgs = ((InternalEObject)newBrowsePaths).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__BROWSE_PATHS, null, msgs);
			msgs = basicSetBrowsePaths(newBrowsePaths, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBrowsePathsESet = browsePathsESet;
			browsePathsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__BROWSE_PATHS, newBrowsePaths, newBrowsePaths, !oldBrowsePathsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetBrowsePaths(NotificationChain msgs) {
		ListOfBrowsePath oldBrowsePaths = browsePaths;
		browsePaths = null;
		boolean oldBrowsePathsESet = browsePathsESet;
		browsePathsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__BROWSE_PATHS, oldBrowsePaths, null, oldBrowsePathsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBrowsePaths() {
		if (browsePaths != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)browsePaths).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__BROWSE_PATHS, null, msgs);
			msgs = basicUnsetBrowsePaths(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBrowsePathsESet = browsePathsESet;
			browsePathsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__BROWSE_PATHS, null, null, oldBrowsePathsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBrowsePaths() {
		return browsePathsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__REQUEST_HEADER:
				return basicUnsetRequestHeader(msgs);
			case TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__BROWSE_PATHS:
				return basicUnsetBrowsePaths(msgs);
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
			case TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__REQUEST_HEADER:
				return getRequestHeader();
			case TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__BROWSE_PATHS:
				return getBrowsePaths();
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
			case TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__REQUEST_HEADER:
				setRequestHeader((RequestHeader)newValue);
				return;
			case TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__BROWSE_PATHS:
				setBrowsePaths((ListOfBrowsePath)newValue);
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
			case TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__REQUEST_HEADER:
				unsetRequestHeader();
				return;
			case TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__BROWSE_PATHS:
				unsetBrowsePaths();
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
			case TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__REQUEST_HEADER:
				return isSetRequestHeader();
			case TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST__BROWSE_PATHS:
				return isSetBrowsePaths();
		}
		return super.eIsSet(featureID);
	}

} //TranslateBrowsePathsToNodeIdsRequestImpl
