/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.CallMethodResult;
import org.opcfoundation.ua._2008._02.types.ListOfDiagnosticInfo;
import org.opcfoundation.ua._2008._02.types.ListOfStatusCode;
import org.opcfoundation.ua._2008._02.types.ListOfVariant;
import org.opcfoundation.ua._2008._02.types.StatusCode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Method Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CallMethodResultImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CallMethodResultImpl#getInputArgumentResults <em>Input Argument Results</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CallMethodResultImpl#getInputArgumentDiagnosticInfos <em>Input Argument Diagnostic Infos</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.CallMethodResultImpl#getOutputArguments <em>Output Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallMethodResultImpl extends MinimalEObjectImpl.Container implements CallMethodResult {
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
	 * The cached value of the '{@link #getInputArgumentResults() <em>Input Argument Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputArgumentResults()
	 * @generated
	 * @ordered
	 */
	protected ListOfStatusCode inputArgumentResults;

	/**
	 * This is true if the Input Argument Results containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inputArgumentResultsESet;

	/**
	 * The cached value of the '{@link #getInputArgumentDiagnosticInfos() <em>Input Argument Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputArgumentDiagnosticInfos()
	 * @generated
	 * @ordered
	 */
	protected ListOfDiagnosticInfo inputArgumentDiagnosticInfos;

	/**
	 * This is true if the Input Argument Diagnostic Infos containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inputArgumentDiagnosticInfosESet;

	/**
	 * The cached value of the '{@link #getOutputArguments() <em>Output Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputArguments()
	 * @generated
	 * @ordered
	 */
	protected ListOfVariant outputArguments;

	/**
	 * This is true if the Output Arguments containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean outputArgumentsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallMethodResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getCallMethodResult();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CALL_METHOD_RESULT__STATUS_CODE, oldStatusCode, newStatusCode);
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
				msgs = ((InternalEObject)statusCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_RESULT__STATUS_CODE, null, msgs);
			if (newStatusCode != null)
				msgs = ((InternalEObject)newStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_RESULT__STATUS_CODE, null, msgs);
			msgs = basicSetStatusCode(newStatusCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CALL_METHOD_RESULT__STATUS_CODE, newStatusCode, newStatusCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStatusCode getInputArgumentResults() {
		return inputArgumentResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputArgumentResults(ListOfStatusCode newInputArgumentResults, NotificationChain msgs) {
		ListOfStatusCode oldInputArgumentResults = inputArgumentResults;
		inputArgumentResults = newInputArgumentResults;
		boolean oldInputArgumentResultsESet = inputArgumentResultsESet;
		inputArgumentResultsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_RESULTS, oldInputArgumentResults, newInputArgumentResults, !oldInputArgumentResultsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputArgumentResults(ListOfStatusCode newInputArgumentResults) {
		if (newInputArgumentResults != inputArgumentResults) {
			NotificationChain msgs = null;
			if (inputArgumentResults != null)
				msgs = ((InternalEObject)inputArgumentResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_RESULTS, null, msgs);
			if (newInputArgumentResults != null)
				msgs = ((InternalEObject)newInputArgumentResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_RESULTS, null, msgs);
			msgs = basicSetInputArgumentResults(newInputArgumentResults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldInputArgumentResultsESet = inputArgumentResultsESet;
			inputArgumentResultsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_RESULTS, newInputArgumentResults, newInputArgumentResults, !oldInputArgumentResultsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetInputArgumentResults(NotificationChain msgs) {
		ListOfStatusCode oldInputArgumentResults = inputArgumentResults;
		inputArgumentResults = null;
		boolean oldInputArgumentResultsESet = inputArgumentResultsESet;
		inputArgumentResultsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_RESULTS, oldInputArgumentResults, null, oldInputArgumentResultsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInputArgumentResults() {
		if (inputArgumentResults != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)inputArgumentResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_RESULTS, null, msgs);
			msgs = basicUnsetInputArgumentResults(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldInputArgumentResultsESet = inputArgumentResultsESet;
			inputArgumentResultsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_RESULTS, null, null, oldInputArgumentResultsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputArgumentResults() {
		return inputArgumentResultsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDiagnosticInfo getInputArgumentDiagnosticInfos() {
		return inputArgumentDiagnosticInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputArgumentDiagnosticInfos(ListOfDiagnosticInfo newInputArgumentDiagnosticInfos, NotificationChain msgs) {
		ListOfDiagnosticInfo oldInputArgumentDiagnosticInfos = inputArgumentDiagnosticInfos;
		inputArgumentDiagnosticInfos = newInputArgumentDiagnosticInfos;
		boolean oldInputArgumentDiagnosticInfosESet = inputArgumentDiagnosticInfosESet;
		inputArgumentDiagnosticInfosESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_DIAGNOSTIC_INFOS, oldInputArgumentDiagnosticInfos, newInputArgumentDiagnosticInfos, !oldInputArgumentDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputArgumentDiagnosticInfos(ListOfDiagnosticInfo newInputArgumentDiagnosticInfos) {
		if (newInputArgumentDiagnosticInfos != inputArgumentDiagnosticInfos) {
			NotificationChain msgs = null;
			if (inputArgumentDiagnosticInfos != null)
				msgs = ((InternalEObject)inputArgumentDiagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_DIAGNOSTIC_INFOS, null, msgs);
			if (newInputArgumentDiagnosticInfos != null)
				msgs = ((InternalEObject)newInputArgumentDiagnosticInfos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicSetInputArgumentDiagnosticInfos(newInputArgumentDiagnosticInfos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldInputArgumentDiagnosticInfosESet = inputArgumentDiagnosticInfosESet;
			inputArgumentDiagnosticInfosESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_DIAGNOSTIC_INFOS, newInputArgumentDiagnosticInfos, newInputArgumentDiagnosticInfos, !oldInputArgumentDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetInputArgumentDiagnosticInfos(NotificationChain msgs) {
		ListOfDiagnosticInfo oldInputArgumentDiagnosticInfos = inputArgumentDiagnosticInfos;
		inputArgumentDiagnosticInfos = null;
		boolean oldInputArgumentDiagnosticInfosESet = inputArgumentDiagnosticInfosESet;
		inputArgumentDiagnosticInfosESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_DIAGNOSTIC_INFOS, oldInputArgumentDiagnosticInfos, null, oldInputArgumentDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInputArgumentDiagnosticInfos() {
		if (inputArgumentDiagnosticInfos != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)inputArgumentDiagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicUnsetInputArgumentDiagnosticInfos(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldInputArgumentDiagnosticInfosESet = inputArgumentDiagnosticInfosESet;
			inputArgumentDiagnosticInfosESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_DIAGNOSTIC_INFOS, null, null, oldInputArgumentDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputArgumentDiagnosticInfos() {
		return inputArgumentDiagnosticInfosESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfVariant getOutputArguments() {
		return outputArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputArguments(ListOfVariant newOutputArguments, NotificationChain msgs) {
		ListOfVariant oldOutputArguments = outputArguments;
		outputArguments = newOutputArguments;
		boolean oldOutputArgumentsESet = outputArgumentsESet;
		outputArgumentsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CALL_METHOD_RESULT__OUTPUT_ARGUMENTS, oldOutputArguments, newOutputArguments, !oldOutputArgumentsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputArguments(ListOfVariant newOutputArguments) {
		if (newOutputArguments != outputArguments) {
			NotificationChain msgs = null;
			if (outputArguments != null)
				msgs = ((InternalEObject)outputArguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_RESULT__OUTPUT_ARGUMENTS, null, msgs);
			if (newOutputArguments != null)
				msgs = ((InternalEObject)newOutputArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_RESULT__OUTPUT_ARGUMENTS, null, msgs);
			msgs = basicSetOutputArguments(newOutputArguments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldOutputArgumentsESet = outputArgumentsESet;
			outputArgumentsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CALL_METHOD_RESULT__OUTPUT_ARGUMENTS, newOutputArguments, newOutputArguments, !oldOutputArgumentsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetOutputArguments(NotificationChain msgs) {
		ListOfVariant oldOutputArguments = outputArguments;
		outputArguments = null;
		boolean oldOutputArgumentsESet = outputArgumentsESet;
		outputArgumentsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CALL_METHOD_RESULT__OUTPUT_ARGUMENTS, oldOutputArguments, null, oldOutputArgumentsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOutputArguments() {
		if (outputArguments != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)outputArguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CALL_METHOD_RESULT__OUTPUT_ARGUMENTS, null, msgs);
			msgs = basicUnsetOutputArguments(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldOutputArgumentsESet = outputArgumentsESet;
			outputArgumentsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CALL_METHOD_RESULT__OUTPUT_ARGUMENTS, null, null, oldOutputArgumentsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputArguments() {
		return outputArgumentsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.CALL_METHOD_RESULT__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
			case TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_RESULTS:
				return basicUnsetInputArgumentResults(msgs);
			case TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_DIAGNOSTIC_INFOS:
				return basicUnsetInputArgumentDiagnosticInfos(msgs);
			case TypesPackage.CALL_METHOD_RESULT__OUTPUT_ARGUMENTS:
				return basicUnsetOutputArguments(msgs);
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
			case TypesPackage.CALL_METHOD_RESULT__STATUS_CODE:
				return getStatusCode();
			case TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_RESULTS:
				return getInputArgumentResults();
			case TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_DIAGNOSTIC_INFOS:
				return getInputArgumentDiagnosticInfos();
			case TypesPackage.CALL_METHOD_RESULT__OUTPUT_ARGUMENTS:
				return getOutputArguments();
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
			case TypesPackage.CALL_METHOD_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)newValue);
				return;
			case TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_RESULTS:
				setInputArgumentResults((ListOfStatusCode)newValue);
				return;
			case TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_DIAGNOSTIC_INFOS:
				setInputArgumentDiagnosticInfos((ListOfDiagnosticInfo)newValue);
				return;
			case TypesPackage.CALL_METHOD_RESULT__OUTPUT_ARGUMENTS:
				setOutputArguments((ListOfVariant)newValue);
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
			case TypesPackage.CALL_METHOD_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)null);
				return;
			case TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_RESULTS:
				unsetInputArgumentResults();
				return;
			case TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_DIAGNOSTIC_INFOS:
				unsetInputArgumentDiagnosticInfos();
				return;
			case TypesPackage.CALL_METHOD_RESULT__OUTPUT_ARGUMENTS:
				unsetOutputArguments();
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
			case TypesPackage.CALL_METHOD_RESULT__STATUS_CODE:
				return statusCode != null;
			case TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_RESULTS:
				return isSetInputArgumentResults();
			case TypesPackage.CALL_METHOD_RESULT__INPUT_ARGUMENT_DIAGNOSTIC_INFOS:
				return isSetInputArgumentDiagnosticInfos();
			case TypesPackage.CALL_METHOD_RESULT__OUTPUT_ARGUMENTS:
				return isSetOutputArguments();
		}
		return super.eIsSet(featureID);
	}

} //CallMethodResultImpl
