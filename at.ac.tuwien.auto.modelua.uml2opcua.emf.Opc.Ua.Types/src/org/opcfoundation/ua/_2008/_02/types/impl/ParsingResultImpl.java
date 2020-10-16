/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ListOfDiagnosticInfo;
import org.opcfoundation.ua._2008._02.types.ListOfStatusCode;
import org.opcfoundation.ua._2008._02.types.ParsingResult;
import org.opcfoundation.ua._2008._02.types.StatusCode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parsing Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ParsingResultImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ParsingResultImpl#getDataStatusCodes <em>Data Status Codes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ParsingResultImpl#getDataDiagnosticInfos <em>Data Diagnostic Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParsingResultImpl extends MinimalEObjectImpl.Container implements ParsingResult {
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
	 * The cached value of the '{@link #getDataStatusCodes() <em>Data Status Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStatusCodes()
	 * @generated
	 * @ordered
	 */
	protected ListOfStatusCode dataStatusCodes;

	/**
	 * This is true if the Data Status Codes containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataStatusCodesESet;

	/**
	 * The cached value of the '{@link #getDataDiagnosticInfos() <em>Data Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDiagnosticInfos()
	 * @generated
	 * @ordered
	 */
	protected ListOfDiagnosticInfo dataDiagnosticInfos;

	/**
	 * This is true if the Data Diagnostic Infos containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataDiagnosticInfosESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParsingResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getParsingResult();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PARSING_RESULT__STATUS_CODE, oldStatusCode, newStatusCode);
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
				msgs = ((InternalEObject)statusCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PARSING_RESULT__STATUS_CODE, null, msgs);
			if (newStatusCode != null)
				msgs = ((InternalEObject)newStatusCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PARSING_RESULT__STATUS_CODE, null, msgs);
			msgs = basicSetStatusCode(newStatusCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PARSING_RESULT__STATUS_CODE, newStatusCode, newStatusCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStatusCode getDataStatusCodes() {
		return dataStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataStatusCodes(ListOfStatusCode newDataStatusCodes, NotificationChain msgs) {
		ListOfStatusCode oldDataStatusCodes = dataStatusCodes;
		dataStatusCodes = newDataStatusCodes;
		boolean oldDataStatusCodesESet = dataStatusCodesESet;
		dataStatusCodesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PARSING_RESULT__DATA_STATUS_CODES, oldDataStatusCodes, newDataStatusCodes, !oldDataStatusCodesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataStatusCodes(ListOfStatusCode newDataStatusCodes) {
		if (newDataStatusCodes != dataStatusCodes) {
			NotificationChain msgs = null;
			if (dataStatusCodes != null)
				msgs = ((InternalEObject)dataStatusCodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PARSING_RESULT__DATA_STATUS_CODES, null, msgs);
			if (newDataStatusCodes != null)
				msgs = ((InternalEObject)newDataStatusCodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PARSING_RESULT__DATA_STATUS_CODES, null, msgs);
			msgs = basicSetDataStatusCodes(newDataStatusCodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataStatusCodesESet = dataStatusCodesESet;
			dataStatusCodesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PARSING_RESULT__DATA_STATUS_CODES, newDataStatusCodes, newDataStatusCodes, !oldDataStatusCodesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDataStatusCodes(NotificationChain msgs) {
		ListOfStatusCode oldDataStatusCodes = dataStatusCodes;
		dataStatusCodes = null;
		boolean oldDataStatusCodesESet = dataStatusCodesESet;
		dataStatusCodesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PARSING_RESULT__DATA_STATUS_CODES, oldDataStatusCodes, null, oldDataStatusCodesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataStatusCodes() {
		if (dataStatusCodes != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dataStatusCodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PARSING_RESULT__DATA_STATUS_CODES, null, msgs);
			msgs = basicUnsetDataStatusCodes(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataStatusCodesESet = dataStatusCodesESet;
			dataStatusCodesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PARSING_RESULT__DATA_STATUS_CODES, null, null, oldDataStatusCodesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataStatusCodes() {
		return dataStatusCodesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDiagnosticInfo getDataDiagnosticInfos() {
		return dataDiagnosticInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataDiagnosticInfos(ListOfDiagnosticInfo newDataDiagnosticInfos, NotificationChain msgs) {
		ListOfDiagnosticInfo oldDataDiagnosticInfos = dataDiagnosticInfos;
		dataDiagnosticInfos = newDataDiagnosticInfos;
		boolean oldDataDiagnosticInfosESet = dataDiagnosticInfosESet;
		dataDiagnosticInfosESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PARSING_RESULT__DATA_DIAGNOSTIC_INFOS, oldDataDiagnosticInfos, newDataDiagnosticInfos, !oldDataDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataDiagnosticInfos(ListOfDiagnosticInfo newDataDiagnosticInfos) {
		if (newDataDiagnosticInfos != dataDiagnosticInfos) {
			NotificationChain msgs = null;
			if (dataDiagnosticInfos != null)
				msgs = ((InternalEObject)dataDiagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PARSING_RESULT__DATA_DIAGNOSTIC_INFOS, null, msgs);
			if (newDataDiagnosticInfos != null)
				msgs = ((InternalEObject)newDataDiagnosticInfos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PARSING_RESULT__DATA_DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicSetDataDiagnosticInfos(newDataDiagnosticInfos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataDiagnosticInfosESet = dataDiagnosticInfosESet;
			dataDiagnosticInfosESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PARSING_RESULT__DATA_DIAGNOSTIC_INFOS, newDataDiagnosticInfos, newDataDiagnosticInfos, !oldDataDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDataDiagnosticInfos(NotificationChain msgs) {
		ListOfDiagnosticInfo oldDataDiagnosticInfos = dataDiagnosticInfos;
		dataDiagnosticInfos = null;
		boolean oldDataDiagnosticInfosESet = dataDiagnosticInfosESet;
		dataDiagnosticInfosESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.PARSING_RESULT__DATA_DIAGNOSTIC_INFOS, oldDataDiagnosticInfos, null, oldDataDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataDiagnosticInfos() {
		if (dataDiagnosticInfos != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dataDiagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PARSING_RESULT__DATA_DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicUnsetDataDiagnosticInfos(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataDiagnosticInfosESet = dataDiagnosticInfosESet;
			dataDiagnosticInfosESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.PARSING_RESULT__DATA_DIAGNOSTIC_INFOS, null, null, oldDataDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataDiagnosticInfos() {
		return dataDiagnosticInfosESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.PARSING_RESULT__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
			case TypesPackage.PARSING_RESULT__DATA_STATUS_CODES:
				return basicUnsetDataStatusCodes(msgs);
			case TypesPackage.PARSING_RESULT__DATA_DIAGNOSTIC_INFOS:
				return basicUnsetDataDiagnosticInfos(msgs);
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
			case TypesPackage.PARSING_RESULT__STATUS_CODE:
				return getStatusCode();
			case TypesPackage.PARSING_RESULT__DATA_STATUS_CODES:
				return getDataStatusCodes();
			case TypesPackage.PARSING_RESULT__DATA_DIAGNOSTIC_INFOS:
				return getDataDiagnosticInfos();
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
			case TypesPackage.PARSING_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)newValue);
				return;
			case TypesPackage.PARSING_RESULT__DATA_STATUS_CODES:
				setDataStatusCodes((ListOfStatusCode)newValue);
				return;
			case TypesPackage.PARSING_RESULT__DATA_DIAGNOSTIC_INFOS:
				setDataDiagnosticInfos((ListOfDiagnosticInfo)newValue);
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
			case TypesPackage.PARSING_RESULT__STATUS_CODE:
				setStatusCode((StatusCode)null);
				return;
			case TypesPackage.PARSING_RESULT__DATA_STATUS_CODES:
				unsetDataStatusCodes();
				return;
			case TypesPackage.PARSING_RESULT__DATA_DIAGNOSTIC_INFOS:
				unsetDataDiagnosticInfos();
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
			case TypesPackage.PARSING_RESULT__STATUS_CODE:
				return statusCode != null;
			case TypesPackage.PARSING_RESULT__DATA_STATUS_CODES:
				return isSetDataStatusCodes();
			case TypesPackage.PARSING_RESULT__DATA_DIAGNOSTIC_INFOS:
				return isSetDataDiagnosticInfos();
		}
		return super.eIsSet(featureID);
	}

} //ParsingResultImpl
