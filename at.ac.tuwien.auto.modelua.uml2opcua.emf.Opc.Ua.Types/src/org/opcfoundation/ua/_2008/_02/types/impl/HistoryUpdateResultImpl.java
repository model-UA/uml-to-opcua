/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.HistoryUpdateResult;
import org.opcfoundation.ua._2008._02.types.ListOfDiagnosticInfo;
import org.opcfoundation.ua._2008._02.types.ListOfStatusCode;
import org.opcfoundation.ua._2008._02.types.StatusCode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Update Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.HistoryUpdateResultImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.HistoryUpdateResultImpl#getOperationResults <em>Operation Results</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.HistoryUpdateResultImpl#getDiagnosticInfos <em>Diagnostic Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoryUpdateResultImpl extends MinimalEObjectImpl.Container implements HistoryUpdateResult {
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
	 * The cached value of the '{@link #getOperationResults() <em>Operation Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationResults()
	 * @generated
	 * @ordered
	 */
	protected ListOfStatusCode operationResults;

	/**
	 * This is true if the Operation Results containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean operationResultsESet;

	/**
	 * The cached value of the '{@link #getDiagnosticInfos() <em>Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticInfos()
	 * @generated
	 * @ordered
	 */
	protected ListOfDiagnosticInfo diagnosticInfos;

	/**
	 * This is true if the Diagnostic Infos containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean diagnosticInfosESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryUpdateResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getHistoryUpdateResult();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_UPDATE_RESULT__STATUS_CODE, oldStatusCode, newStatusCode);
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
				msgs = ((InternalEObject)statusCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_UPDATE_RESULT__STATUS_CODE, null, msgs);
			if (newStatusCode != null)
				msgs = ((InternalEObject)newStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_UPDATE_RESULT__STATUS_CODE, null, msgs);
			msgs = basicSetStatusCode(newStatusCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_UPDATE_RESULT__STATUS_CODE, newStatusCode, newStatusCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStatusCode getOperationResults() {
		return operationResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationResults(ListOfStatusCode newOperationResults, NotificationChain msgs) {
		ListOfStatusCode oldOperationResults = operationResults;
		operationResults = newOperationResults;
		boolean oldOperationResultsESet = operationResultsESet;
		operationResultsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_UPDATE_RESULT__OPERATION_RESULTS, oldOperationResults, newOperationResults, !oldOperationResultsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationResults(ListOfStatusCode newOperationResults) {
		if (newOperationResults != operationResults) {
			NotificationChain msgs = null;
			if (operationResults != null)
				msgs = ((InternalEObject)operationResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_UPDATE_RESULT__OPERATION_RESULTS, null, msgs);
			if (newOperationResults != null)
				msgs = ((InternalEObject)newOperationResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_UPDATE_RESULT__OPERATION_RESULTS, null, msgs);
			msgs = basicSetOperationResults(newOperationResults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldOperationResultsESet = operationResultsESet;
			operationResultsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_UPDATE_RESULT__OPERATION_RESULTS, newOperationResults, newOperationResults, !oldOperationResultsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetOperationResults(NotificationChain msgs) {
		ListOfStatusCode oldOperationResults = operationResults;
		operationResults = null;
		boolean oldOperationResultsESet = operationResultsESet;
		operationResultsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_UPDATE_RESULT__OPERATION_RESULTS, oldOperationResults, null, oldOperationResultsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperationResults() {
		if (operationResults != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)operationResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_UPDATE_RESULT__OPERATION_RESULTS, null, msgs);
			msgs = basicUnsetOperationResults(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldOperationResultsESet = operationResultsESet;
			operationResultsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_UPDATE_RESULT__OPERATION_RESULTS, null, null, oldOperationResultsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperationResults() {
		return operationResultsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDiagnosticInfo getDiagnosticInfos() {
		return diagnosticInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosticInfos(ListOfDiagnosticInfo newDiagnosticInfos, NotificationChain msgs) {
		ListOfDiagnosticInfo oldDiagnosticInfos = diagnosticInfos;
		diagnosticInfos = newDiagnosticInfos;
		boolean oldDiagnosticInfosESet = diagnosticInfosESet;
		diagnosticInfosESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_UPDATE_RESULT__DIAGNOSTIC_INFOS, oldDiagnosticInfos, newDiagnosticInfos, !oldDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnosticInfos(ListOfDiagnosticInfo newDiagnosticInfos) {
		if (newDiagnosticInfos != diagnosticInfos) {
			NotificationChain msgs = null;
			if (diagnosticInfos != null)
				msgs = ((InternalEObject)diagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_UPDATE_RESULT__DIAGNOSTIC_INFOS, null, msgs);
			if (newDiagnosticInfos != null)
				msgs = ((InternalEObject)newDiagnosticInfos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_UPDATE_RESULT__DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicSetDiagnosticInfos(newDiagnosticInfos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiagnosticInfosESet = diagnosticInfosESet;
			diagnosticInfosESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.HISTORY_UPDATE_RESULT__DIAGNOSTIC_INFOS, newDiagnosticInfos, newDiagnosticInfos, !oldDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDiagnosticInfos(NotificationChain msgs) {
		ListOfDiagnosticInfo oldDiagnosticInfos = diagnosticInfos;
		diagnosticInfos = null;
		boolean oldDiagnosticInfosESet = diagnosticInfosESet;
		diagnosticInfosESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_UPDATE_RESULT__DIAGNOSTIC_INFOS, oldDiagnosticInfos, null, oldDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDiagnosticInfos() {
		if (diagnosticInfos != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)diagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HISTORY_UPDATE_RESULT__DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicUnsetDiagnosticInfos(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiagnosticInfosESet = diagnosticInfosESet;
			diagnosticInfosESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.HISTORY_UPDATE_RESULT__DIAGNOSTIC_INFOS, null, null, oldDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiagnosticInfos() {
		return diagnosticInfosESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.HISTORY_UPDATE_RESULT__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
			case TypesPackage.HISTORY_UPDATE_RESULT__OPERATION_RESULTS:
				return basicUnsetOperationResults(msgs);
			case TypesPackage.HISTORY_UPDATE_RESULT__DIAGNOSTIC_INFOS:
				return basicUnsetDiagnosticInfos(msgs);
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
			case TypesPackage.HISTORY_UPDATE_RESULT__STATUS_CODE:
				return getStatusCode();
			case TypesPackage.HISTORY_UPDATE_RESULT__OPERATION_RESULTS:
				return getOperationResults();
			case TypesPackage.HISTORY_UPDATE_RESULT__DIAGNOSTIC_INFOS:
				return getDiagnosticInfos();
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
			case TypesPackage.HISTORY_UPDATE_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)newValue);
				return;
			case TypesPackage.HISTORY_UPDATE_RESULT__OPERATION_RESULTS:
				setOperationResults((ListOfStatusCode)newValue);
				return;
			case TypesPackage.HISTORY_UPDATE_RESULT__DIAGNOSTIC_INFOS:
				setDiagnosticInfos((ListOfDiagnosticInfo)newValue);
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
			case TypesPackage.HISTORY_UPDATE_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)null);
				return;
			case TypesPackage.HISTORY_UPDATE_RESULT__OPERATION_RESULTS:
				unsetOperationResults();
				return;
			case TypesPackage.HISTORY_UPDATE_RESULT__DIAGNOSTIC_INFOS:
				unsetDiagnosticInfos();
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
			case TypesPackage.HISTORY_UPDATE_RESULT__STATUS_CODE:
				return statusCode != null;
			case TypesPackage.HISTORY_UPDATE_RESULT__OPERATION_RESULTS:
				return isSetOperationResults();
			case TypesPackage.HISTORY_UPDATE_RESULT__DIAGNOSTIC_INFOS:
				return isSetDiagnosticInfos();
		}
		return super.eIsSet(featureID);
	}

} //HistoryUpdateResultImpl
