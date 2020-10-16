/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.DiagnosticInfo;
import org.opcfoundation.ua._2008._02.types.StatusCode;
import org.opcfoundation.ua._2008._02.types.StatusResult;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Status Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.StatusResultImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.StatusResultImpl#getDiagnosticInfo <em>Diagnostic Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatusResultImpl extends MinimalEObjectImpl.Container implements StatusResult {
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
	 * The cached value of the '{@link #getDiagnosticInfo() <em>Diagnostic Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticInfo()
	 * @generated
	 * @ordered
	 */
	protected DiagnosticInfo diagnosticInfo;

	/**
	 * This is true if the Diagnostic Info containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean diagnosticInfoESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getStatusResult();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.STATUS_RESULT__STATUS_CODE, oldStatusCode, newStatusCode);
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
				msgs = ((InternalEObject)statusCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STATUS_RESULT__STATUS_CODE, null, msgs);
			if (newStatusCode != null)
				msgs = ((InternalEObject)newStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STATUS_RESULT__STATUS_CODE, null, msgs);
			msgs = basicSetStatusCode(newStatusCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.STATUS_RESULT__STATUS_CODE, newStatusCode, newStatusCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticInfo getDiagnosticInfo() {
		return diagnosticInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosticInfo(DiagnosticInfo newDiagnosticInfo, NotificationChain msgs) {
		DiagnosticInfo oldDiagnosticInfo = diagnosticInfo;
		diagnosticInfo = newDiagnosticInfo;
		boolean oldDiagnosticInfoESet = diagnosticInfoESet;
		diagnosticInfoESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.STATUS_RESULT__DIAGNOSTIC_INFO, oldDiagnosticInfo, newDiagnosticInfo, !oldDiagnosticInfoESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnosticInfo(DiagnosticInfo newDiagnosticInfo) {
		if (newDiagnosticInfo != diagnosticInfo) {
			NotificationChain msgs = null;
			if (diagnosticInfo != null)
				msgs = ((InternalEObject)diagnosticInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STATUS_RESULT__DIAGNOSTIC_INFO, null, msgs);
			if (newDiagnosticInfo != null)
				msgs = ((InternalEObject)newDiagnosticInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STATUS_RESULT__DIAGNOSTIC_INFO, null, msgs);
			msgs = basicSetDiagnosticInfo(newDiagnosticInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiagnosticInfoESet = diagnosticInfoESet;
			diagnosticInfoESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.STATUS_RESULT__DIAGNOSTIC_INFO, newDiagnosticInfo, newDiagnosticInfo, !oldDiagnosticInfoESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDiagnosticInfo(NotificationChain msgs) {
		DiagnosticInfo oldDiagnosticInfo = diagnosticInfo;
		diagnosticInfo = null;
		boolean oldDiagnosticInfoESet = diagnosticInfoESet;
		diagnosticInfoESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.STATUS_RESULT__DIAGNOSTIC_INFO, oldDiagnosticInfo, null, oldDiagnosticInfoESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDiagnosticInfo() {
		if (diagnosticInfo != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)diagnosticInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STATUS_RESULT__DIAGNOSTIC_INFO, null, msgs);
			msgs = basicUnsetDiagnosticInfo(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiagnosticInfoESet = diagnosticInfoESet;
			diagnosticInfoESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.STATUS_RESULT__DIAGNOSTIC_INFO, null, null, oldDiagnosticInfoESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiagnosticInfo() {
		return diagnosticInfoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.STATUS_RESULT__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
			case TypesPackage.STATUS_RESULT__DIAGNOSTIC_INFO:
				return basicUnsetDiagnosticInfo(msgs);
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
			case TypesPackage.STATUS_RESULT__STATUS_CODE:
				return getStatusCode();
			case TypesPackage.STATUS_RESULT__DIAGNOSTIC_INFO:
				return getDiagnosticInfo();
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
			case TypesPackage.STATUS_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)newValue);
				return;
			case TypesPackage.STATUS_RESULT__DIAGNOSTIC_INFO:
				setDiagnosticInfo((DiagnosticInfo)newValue);
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
			case TypesPackage.STATUS_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)null);
				return;
			case TypesPackage.STATUS_RESULT__DIAGNOSTIC_INFO:
				unsetDiagnosticInfo();
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
			case TypesPackage.STATUS_RESULT__STATUS_CODE:
				return statusCode != null;
			case TypesPackage.STATUS_RESULT__DIAGNOSTIC_INFO:
				return isSetDiagnosticInfo();
		}
		return super.eIsSet(featureID);
	}

} //StatusResultImpl
