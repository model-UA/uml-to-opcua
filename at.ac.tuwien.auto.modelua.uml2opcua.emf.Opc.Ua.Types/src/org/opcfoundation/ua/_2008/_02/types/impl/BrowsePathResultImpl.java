/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.BrowsePathResult;
import org.opcfoundation.ua._2008._02.types.ListOfBrowsePathTarget;
import org.opcfoundation.ua._2008._02.types.StatusCode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Browse Path Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowsePathResultImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.BrowsePathResultImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrowsePathResultImpl extends MinimalEObjectImpl.Container implements BrowsePathResult {
	/**
	 * The cached value of the '{@link #getStatusCode() <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode()
	 * @generated
	 * @ordered
	 */
	protected StatusCode statusCode;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected ListOfBrowsePathTarget targets;

	/**
	 * This is true if the Targets containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowsePathResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getBrowsePathResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCode getStatusCode() {
		return statusCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusCode(StatusCode newStatusCode, NotificationChain msgs) {
		StatusCode oldStatusCode = statusCode;
		statusCode = newStatusCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_PATH_RESULT__STATUS_CODE, oldStatusCode, newStatusCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusCode(StatusCode newStatusCode) {
		if (newStatusCode != statusCode) {
			NotificationChain msgs = null;
			if (statusCode != null)
				msgs = ((InternalEObject)statusCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_PATH_RESULT__STATUS_CODE, null, msgs);
			if (newStatusCode != null)
				msgs = ((InternalEObject)newStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_PATH_RESULT__STATUS_CODE, null, msgs);
			msgs = basicSetStatusCode(newStatusCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_PATH_RESULT__STATUS_CODE, newStatusCode, newStatusCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrowsePathTarget getTargets() {
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargets(ListOfBrowsePathTarget newTargets, NotificationChain msgs) {
		ListOfBrowsePathTarget oldTargets = targets;
		targets = newTargets;
		boolean oldTargetsESet = targetsESet;
		targetsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_PATH_RESULT__TARGETS, oldTargets, newTargets, !oldTargetsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargets(ListOfBrowsePathTarget newTargets) {
		if (newTargets != targets) {
			NotificationChain msgs = null;
			if (targets != null)
				msgs = ((InternalEObject)targets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_PATH_RESULT__TARGETS, null, msgs);
			if (newTargets != null)
				msgs = ((InternalEObject)newTargets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_PATH_RESULT__TARGETS, null, msgs);
			msgs = basicSetTargets(newTargets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTargetsESet = targetsESet;
			targetsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.BROWSE_PATH_RESULT__TARGETS, newTargets, newTargets, !oldTargetsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTargets(NotificationChain msgs) {
		ListOfBrowsePathTarget oldTargets = targets;
		targets = null;
		boolean oldTargetsESet = targetsESet;
		targetsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_PATH_RESULT__TARGETS, oldTargets, null, oldTargetsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargets() {
		if (targets != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)targets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.BROWSE_PATH_RESULT__TARGETS, null, msgs);
			msgs = basicUnsetTargets(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTargetsESet = targetsESet;
			targetsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.BROWSE_PATH_RESULT__TARGETS, null, null, oldTargetsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return targetsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.BROWSE_PATH_RESULT__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
			case TypesPackage.BROWSE_PATH_RESULT__TARGETS:
				return basicUnsetTargets(msgs);
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
			case TypesPackage.BROWSE_PATH_RESULT__STATUS_CODE:
				return getStatusCode();
			case TypesPackage.BROWSE_PATH_RESULT__TARGETS:
				return getTargets();
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
			case TypesPackage.BROWSE_PATH_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)newValue);
				return;
			case TypesPackage.BROWSE_PATH_RESULT__TARGETS:
				setTargets((ListOfBrowsePathTarget)newValue);
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
			case TypesPackage.BROWSE_PATH_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)null);
				return;
			case TypesPackage.BROWSE_PATH_RESULT__TARGETS:
				unsetTargets();
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
			case TypesPackage.BROWSE_PATH_RESULT__STATUS_CODE:
				return statusCode != null;
			case TypesPackage.BROWSE_PATH_RESULT__TARGETS:
				return isSetTargets();
		}
		return super.eIsSet(featureID);
	}

} //BrowsePathResultImpl
