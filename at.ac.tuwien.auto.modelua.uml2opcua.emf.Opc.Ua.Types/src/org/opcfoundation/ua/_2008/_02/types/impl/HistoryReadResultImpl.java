/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ExtensionObject;
import org.opcfoundation.ua._2008._02.types.HistoryReadResult;
import org.opcfoundation.ua._2008._02.types.StatusCode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Read Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.HistoryReadResultImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.HistoryReadResultImpl#getContinuationPoint <em>Continuation Point</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.HistoryReadResultImpl#getHistoryData <em>History Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoryReadResultImpl extends MinimalEObjectImpl.Container implements HistoryReadResult {
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
	 * The cached value of the '{@link #getHistoryData() <em>History Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryData()
	 * @generated
	 * @ordered
	 */
	protected ExtensionObject historyData;

	/**
	 * This is true if the History Data containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean historyDataESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryReadResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getHistoryReadResult();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_READ_RESULT__STATUS_CODE, oldStatusCode, newStatusCode);
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
				msgs = ((InternalEObject)statusCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_READ_RESULT__STATUS_CODE, null, msgs);
			if (newStatusCode != null)
				msgs = ((InternalEObject)newStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_READ_RESULT__STATUS_CODE, null, msgs);
			msgs = basicSetStatusCode(newStatusCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_READ_RESULT__STATUS_CODE, newStatusCode, newStatusCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_READ_RESULT__CONTINUATION_POINT, oldContinuationPoint, continuationPoint, !oldContinuationPointESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_READ_RESULT__CONTINUATION_POINT, oldContinuationPoint, CONTINUATION_POINT_EDEFAULT, oldContinuationPointESet));
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
	public ExtensionObject getHistoryData() {
		return historyData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryData(ExtensionObject newHistoryData, NotificationChain msgs) {
		ExtensionObject oldHistoryData = historyData;
		historyData = newHistoryData;
		boolean oldHistoryDataESet = historyDataESet;
		historyDataESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_READ_RESULT__HISTORY_DATA, oldHistoryData, newHistoryData, !oldHistoryDataESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryData(ExtensionObject newHistoryData) {
		if (newHistoryData != historyData) {
			NotificationChain msgs = null;
			if (historyData != null)
				msgs = ((InternalEObject)historyData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_READ_RESULT__HISTORY_DATA, null, msgs);
			if (newHistoryData != null)
				msgs = ((InternalEObject)newHistoryData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_READ_RESULT__HISTORY_DATA, null, msgs);
			msgs = basicSetHistoryData(newHistoryData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldHistoryDataESet = historyDataESet;
			historyDataESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_READ_RESULT__HISTORY_DATA, newHistoryData, newHistoryData, !oldHistoryDataESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetHistoryData(NotificationChain msgs) {
		ExtensionObject oldHistoryData = historyData;
		historyData = null;
		boolean oldHistoryDataESet = historyDataESet;
		historyDataESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_READ_RESULT__HISTORY_DATA, oldHistoryData, null, oldHistoryDataESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHistoryData() {
		if (historyData != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)historyData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_READ_RESULT__HISTORY_DATA, null, msgs);
			msgs = basicUnsetHistoryData(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldHistoryDataESet = historyDataESet;
			historyDataESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_READ_RESULT__HISTORY_DATA, null, null, oldHistoryDataESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHistoryData() {
		return historyDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.HISTORY_READ_RESULT__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
			case TypesPackage.HISTORY_READ_RESULT__HISTORY_DATA:
				return basicUnsetHistoryData(msgs);
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
			case TypesPackage.HISTORY_READ_RESULT__STATUS_CODE:
				return getStatusCode();
			case TypesPackage.HISTORY_READ_RESULT__CONTINUATION_POINT:
				return getContinuationPoint();
			case TypesPackage.HISTORY_READ_RESULT__HISTORY_DATA:
				return getHistoryData();
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
			case TypesPackage.HISTORY_READ_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)newValue);
				return;
			case TypesPackage.HISTORY_READ_RESULT__CONTINUATION_POINT:
				setContinuationPoint((byte[])newValue);
				return;
			case TypesPackage.HISTORY_READ_RESULT__HISTORY_DATA:
				setHistoryData((ExtensionObject)newValue);
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
			case TypesPackage.HISTORY_READ_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)null);
				return;
			case TypesPackage.HISTORY_READ_RESULT__CONTINUATION_POINT:
				unsetContinuationPoint();
				return;
			case TypesPackage.HISTORY_READ_RESULT__HISTORY_DATA:
				unsetHistoryData();
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
			case TypesPackage.HISTORY_READ_RESULT__STATUS_CODE:
				return statusCode != null;
			case TypesPackage.HISTORY_READ_RESULT__CONTINUATION_POINT:
				return isSetContinuationPoint();
			case TypesPackage.HISTORY_READ_RESULT__HISTORY_DATA:
				return isSetHistoryData();
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
		result.append(" (continuationPoint: ");
		if (continuationPointESet) result.append(continuationPoint); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HistoryReadResultImpl
