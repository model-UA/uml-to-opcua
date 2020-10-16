/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ContentFilterElementResult;
import org.opcfoundation.ua._2008._02.types.ListOfDiagnosticInfo;
import org.opcfoundation.ua._2008._02.types.ListOfStatusCode;
import org.opcfoundation.ua._2008._02.types.StatusCode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Filter Element Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ContentFilterElementResultImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ContentFilterElementResultImpl#getOperandStatusCodes <em>Operand Status Codes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ContentFilterElementResultImpl#getOperandDiagnosticInfos <em>Operand Diagnostic Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentFilterElementResultImpl extends MinimalEObjectImpl.Container implements ContentFilterElementResult {
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
	 * The cached value of the '{@link #getOperandStatusCodes() <em>Operand Status Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandStatusCodes()
	 * @generated
	 * @ordered
	 */
	protected ListOfStatusCode operandStatusCodes;

	/**
	 * This is true if the Operand Status Codes containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean operandStatusCodesESet;

	/**
	 * The cached value of the '{@link #getOperandDiagnosticInfos() <em>Operand Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandDiagnosticInfos()
	 * @generated
	 * @ordered
	 */
	protected ListOfDiagnosticInfo operandDiagnosticInfos;

	/**
	 * This is true if the Operand Diagnostic Infos containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean operandDiagnosticInfosESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentFilterElementResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getContentFilterElementResult();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__STATUS_CODE, oldStatusCode, newStatusCode);
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
				msgs = ((InternalEObject)statusCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__STATUS_CODE, null, msgs);
			if (newStatusCode != null)
				msgs = ((InternalEObject)newStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__STATUS_CODE, null, msgs);
			msgs = basicSetStatusCode(newStatusCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__STATUS_CODE, newStatusCode, newStatusCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStatusCode getOperandStatusCodes() {
		return operandStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperandStatusCodes(ListOfStatusCode newOperandStatusCodes, NotificationChain msgs) {
		ListOfStatusCode oldOperandStatusCodes = operandStatusCodes;
		operandStatusCodes = newOperandStatusCodes;
		boolean oldOperandStatusCodesESet = operandStatusCodesESet;
		operandStatusCodesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_STATUS_CODES, oldOperandStatusCodes, newOperandStatusCodes, !oldOperandStatusCodesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperandStatusCodes(ListOfStatusCode newOperandStatusCodes) {
		if (newOperandStatusCodes != operandStatusCodes) {
			NotificationChain msgs = null;
			if (operandStatusCodes != null)
				msgs = ((InternalEObject)operandStatusCodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_STATUS_CODES, null, msgs);
			if (newOperandStatusCodes != null)
				msgs = ((InternalEObject)newOperandStatusCodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_STATUS_CODES, null, msgs);
			msgs = basicSetOperandStatusCodes(newOperandStatusCodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldOperandStatusCodesESet = operandStatusCodesESet;
			operandStatusCodesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_STATUS_CODES, newOperandStatusCodes, newOperandStatusCodes, !oldOperandStatusCodesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetOperandStatusCodes(NotificationChain msgs) {
		ListOfStatusCode oldOperandStatusCodes = operandStatusCodes;
		operandStatusCodes = null;
		boolean oldOperandStatusCodesESet = operandStatusCodesESet;
		operandStatusCodesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_STATUS_CODES, oldOperandStatusCodes, null, oldOperandStatusCodesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperandStatusCodes() {
		if (operandStatusCodes != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)operandStatusCodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_STATUS_CODES, null, msgs);
			msgs = basicUnsetOperandStatusCodes(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldOperandStatusCodesESet = operandStatusCodesESet;
			operandStatusCodesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_STATUS_CODES, null, null, oldOperandStatusCodesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperandStatusCodes() {
		return operandStatusCodesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDiagnosticInfo getOperandDiagnosticInfos() {
		return operandDiagnosticInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperandDiagnosticInfos(ListOfDiagnosticInfo newOperandDiagnosticInfos, NotificationChain msgs) {
		ListOfDiagnosticInfo oldOperandDiagnosticInfos = operandDiagnosticInfos;
		operandDiagnosticInfos = newOperandDiagnosticInfos;
		boolean oldOperandDiagnosticInfosESet = operandDiagnosticInfosESet;
		operandDiagnosticInfosESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_DIAGNOSTIC_INFOS, oldOperandDiagnosticInfos, newOperandDiagnosticInfos, !oldOperandDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperandDiagnosticInfos(ListOfDiagnosticInfo newOperandDiagnosticInfos) {
		if (newOperandDiagnosticInfos != operandDiagnosticInfos) {
			NotificationChain msgs = null;
			if (operandDiagnosticInfos != null)
				msgs = ((InternalEObject)operandDiagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_DIAGNOSTIC_INFOS, null, msgs);
			if (newOperandDiagnosticInfos != null)
				msgs = ((InternalEObject)newOperandDiagnosticInfos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicSetOperandDiagnosticInfos(newOperandDiagnosticInfos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldOperandDiagnosticInfosESet = operandDiagnosticInfosESet;
			operandDiagnosticInfosESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_DIAGNOSTIC_INFOS, newOperandDiagnosticInfos, newOperandDiagnosticInfos, !oldOperandDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetOperandDiagnosticInfos(NotificationChain msgs) {
		ListOfDiagnosticInfo oldOperandDiagnosticInfos = operandDiagnosticInfos;
		operandDiagnosticInfos = null;
		boolean oldOperandDiagnosticInfosESet = operandDiagnosticInfosESet;
		operandDiagnosticInfosESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_DIAGNOSTIC_INFOS, oldOperandDiagnosticInfos, null, oldOperandDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperandDiagnosticInfos() {
		if (operandDiagnosticInfos != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)operandDiagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicUnsetOperandDiagnosticInfos(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldOperandDiagnosticInfosESet = operandDiagnosticInfosESet;
			operandDiagnosticInfosESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_DIAGNOSTIC_INFOS, null, null, oldOperandDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperandDiagnosticInfos() {
		return operandDiagnosticInfosESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
			case TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_STATUS_CODES:
				return basicUnsetOperandStatusCodes(msgs);
			case TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_DIAGNOSTIC_INFOS:
				return basicUnsetOperandDiagnosticInfos(msgs);
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
			case TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__STATUS_CODE:
				return getStatusCode();
			case TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_STATUS_CODES:
				return getOperandStatusCodes();
			case TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_DIAGNOSTIC_INFOS:
				return getOperandDiagnosticInfos();
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
			case TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)newValue);
				return;
			case TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_STATUS_CODES:
				setOperandStatusCodes((ListOfStatusCode)newValue);
				return;
			case TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_DIAGNOSTIC_INFOS:
				setOperandDiagnosticInfos((ListOfDiagnosticInfo)newValue);
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
			case TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)null);
				return;
			case TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_STATUS_CODES:
				unsetOperandStatusCodes();
				return;
			case TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_DIAGNOSTIC_INFOS:
				unsetOperandDiagnosticInfos();
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
			case TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__STATUS_CODE:
				return statusCode != null;
			case TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_STATUS_CODES:
				return isSetOperandStatusCodes();
			case TypesPackage.CONTENT_FILTER_ELEMENT_RESULT__OPERAND_DIAGNOSTIC_INFOS:
				return isSetOperandDiagnosticInfos();
		}
		return super.eIsSet(featureID);
	}

} //ContentFilterElementResultImpl
