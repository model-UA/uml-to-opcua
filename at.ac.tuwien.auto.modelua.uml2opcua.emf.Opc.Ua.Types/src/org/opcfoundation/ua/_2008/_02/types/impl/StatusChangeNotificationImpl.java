/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.DiagnosticInfo;
import org.opcfoundation.ua._2008._02.types.StatusChangeNotification;
import org.opcfoundation.ua._2008._02.types.StatusCode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Status Change Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.StatusChangeNotificationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.StatusChangeNotificationImpl#getDiagnosticInfo <em>Diagnostic Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatusChangeNotificationImpl extends NotificationDataImpl implements StatusChangeNotification {
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusCode status;

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
	protected StatusChangeNotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getStatusChangeNotification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCode getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(StatusCode newStatus, NotificationChain msgs) {
		StatusCode oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.STATUS_CHANGE_NOTIFICATION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusCode newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STATUS_CHANGE_NOTIFICATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STATUS_CHANGE_NOTIFICATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.STATUS_CHANGE_NOTIFICATION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.STATUS_CHANGE_NOTIFICATION__DIAGNOSTIC_INFO, oldDiagnosticInfo, newDiagnosticInfo, !oldDiagnosticInfoESet);
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
				msgs = ((InternalEObject)diagnosticInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STATUS_CHANGE_NOTIFICATION__DIAGNOSTIC_INFO, null, msgs);
			if (newDiagnosticInfo != null)
				msgs = ((InternalEObject)newDiagnosticInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STATUS_CHANGE_NOTIFICATION__DIAGNOSTIC_INFO, null, msgs);
			msgs = basicSetDiagnosticInfo(newDiagnosticInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiagnosticInfoESet = diagnosticInfoESet;
			diagnosticInfoESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.STATUS_CHANGE_NOTIFICATION__DIAGNOSTIC_INFO, newDiagnosticInfo, newDiagnosticInfo, !oldDiagnosticInfoESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.STATUS_CHANGE_NOTIFICATION__DIAGNOSTIC_INFO, oldDiagnosticInfo, null, oldDiagnosticInfoESet);
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
			msgs = ((InternalEObject)diagnosticInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STATUS_CHANGE_NOTIFICATION__DIAGNOSTIC_INFO, null, msgs);
			msgs = basicUnsetDiagnosticInfo(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiagnosticInfoESet = diagnosticInfoESet;
			diagnosticInfoESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.STATUS_CHANGE_NOTIFICATION__DIAGNOSTIC_INFO, null, null, oldDiagnosticInfoESet));
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
			case TypesPackage.STATUS_CHANGE_NOTIFICATION__STATUS:
				return basicSetStatus(null, msgs);
			case TypesPackage.STATUS_CHANGE_NOTIFICATION__DIAGNOSTIC_INFO:
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
			case TypesPackage.STATUS_CHANGE_NOTIFICATION__STATUS:
				return getStatus();
			case TypesPackage.STATUS_CHANGE_NOTIFICATION__DIAGNOSTIC_INFO:
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
			case TypesPackage.STATUS_CHANGE_NOTIFICATION__STATUS:
				setStatus((StatusCode)newValue);
				return;
			case TypesPackage.STATUS_CHANGE_NOTIFICATION__DIAGNOSTIC_INFO:
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
			case TypesPackage.STATUS_CHANGE_NOTIFICATION__STATUS:
				setStatus((StatusCode)null);
				return;
			case TypesPackage.STATUS_CHANGE_NOTIFICATION__DIAGNOSTIC_INFO:
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
			case TypesPackage.STATUS_CHANGE_NOTIFICATION__STATUS:
				return status != null;
			case TypesPackage.STATUS_CHANGE_NOTIFICATION__DIAGNOSTIC_INFO:
				return isSetDiagnosticInfo();
		}
		return super.eIsSet(featureID);
	}

} //StatusChangeNotificationImpl
