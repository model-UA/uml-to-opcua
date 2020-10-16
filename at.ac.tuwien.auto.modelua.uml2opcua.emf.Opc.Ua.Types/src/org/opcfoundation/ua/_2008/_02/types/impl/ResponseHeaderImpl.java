/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.DiagnosticInfo;
import org.opcfoundation.ua._2008._02.types.ExtensionObject;
import org.opcfoundation.ua._2008._02.types.ListOfString;
import org.opcfoundation.ua._2008._02.types.ResponseHeader;
import org.opcfoundation.ua._2008._02.types.StatusCode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ResponseHeaderImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ResponseHeaderImpl#getRequestHandle <em>Request Handle</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ResponseHeaderImpl#getServiceResult <em>Service Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ResponseHeaderImpl#getServiceDiagnostics <em>Service Diagnostics</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ResponseHeaderImpl#getStringTable <em>String Table</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ResponseHeaderImpl#getAdditionalHeader <em>Additional Header</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseHeaderImpl extends MinimalEObjectImpl.Container implements ResponseHeader {
	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestHandle() <em>Request Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestHandle()
	 * @generated
	 * @ordered
	 */
	protected static final long REQUEST_HANDLE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRequestHandle() <em>Request Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestHandle()
	 * @generated
	 * @ordered
	 */
	protected long requestHandle = REQUEST_HANDLE_EDEFAULT;

	/**
	 * This is true if the Request Handle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestHandleESet;

	/**
	 * The cached value of the '{@link #getServiceResult() <em>Service Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceResult()
	 * @generated
	 * @ordered
	 */
	protected StatusCode serviceResult;

	/**
	 * The cached value of the '{@link #getServiceDiagnostics() <em>Service Diagnostics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDiagnostics()
	 * @generated
	 * @ordered
	 */
	protected DiagnosticInfo serviceDiagnostics;

	/**
	 * This is true if the Service Diagnostics containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serviceDiagnosticsESet;

	/**
	 * The cached value of the '{@link #getStringTable() <em>String Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringTable()
	 * @generated
	 * @ordered
	 */
	protected ListOfString stringTable;

	/**
	 * This is true if the String Table containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stringTableESet;

	/**
	 * The cached value of the '{@link #getAdditionalHeader() <em>Additional Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalHeader()
	 * @generated
	 * @ordered
	 */
	protected ExtensionObject additionalHeader;

	/**
	 * This is true if the Additional Header containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean additionalHeaderESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getResponseHeader();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(XMLGregorianCalendar newTimestamp) {
		XMLGregorianCalendar oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RESPONSE_HEADER__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRequestHandle() {
		return requestHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestHandle(long newRequestHandle) {
		long oldRequestHandle = requestHandle;
		requestHandle = newRequestHandle;
		boolean oldRequestHandleESet = requestHandleESet;
		requestHandleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RESPONSE_HEADER__REQUEST_HANDLE, oldRequestHandle, requestHandle, !oldRequestHandleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestHandle() {
		long oldRequestHandle = requestHandle;
		boolean oldRequestHandleESet = requestHandleESet;
		requestHandle = REQUEST_HANDLE_EDEFAULT;
		requestHandleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.RESPONSE_HEADER__REQUEST_HANDLE, oldRequestHandle, REQUEST_HANDLE_EDEFAULT, oldRequestHandleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestHandle() {
		return requestHandleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCode getServiceResult() {
		return serviceResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceResult(StatusCode newServiceResult, NotificationChain msgs) {
		StatusCode oldServiceResult = serviceResult;
		serviceResult = newServiceResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.RESPONSE_HEADER__SERVICE_RESULT, oldServiceResult, newServiceResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceResult(StatusCode newServiceResult) {
		if (newServiceResult != serviceResult) {
			NotificationChain msgs = null;
			if (serviceResult != null)
				msgs = ((InternalEObject)serviceResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RESPONSE_HEADER__SERVICE_RESULT, null, msgs);
			if (newServiceResult != null)
				msgs = ((InternalEObject)newServiceResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RESPONSE_HEADER__SERVICE_RESULT, null, msgs);
			msgs = basicSetServiceResult(newServiceResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RESPONSE_HEADER__SERVICE_RESULT, newServiceResult, newServiceResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticInfo getServiceDiagnostics() {
		return serviceDiagnostics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceDiagnostics(DiagnosticInfo newServiceDiagnostics, NotificationChain msgs) {
		DiagnosticInfo oldServiceDiagnostics = serviceDiagnostics;
		serviceDiagnostics = newServiceDiagnostics;
		boolean oldServiceDiagnosticsESet = serviceDiagnosticsESet;
		serviceDiagnosticsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.RESPONSE_HEADER__SERVICE_DIAGNOSTICS, oldServiceDiagnostics, newServiceDiagnostics, !oldServiceDiagnosticsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDiagnostics(DiagnosticInfo newServiceDiagnostics) {
		if (newServiceDiagnostics != serviceDiagnostics) {
			NotificationChain msgs = null;
			if (serviceDiagnostics != null)
				msgs = ((InternalEObject)serviceDiagnostics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RESPONSE_HEADER__SERVICE_DIAGNOSTICS, null, msgs);
			if (newServiceDiagnostics != null)
				msgs = ((InternalEObject)newServiceDiagnostics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RESPONSE_HEADER__SERVICE_DIAGNOSTICS, null, msgs);
			msgs = basicSetServiceDiagnostics(newServiceDiagnostics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServiceDiagnosticsESet = serviceDiagnosticsESet;
			serviceDiagnosticsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RESPONSE_HEADER__SERVICE_DIAGNOSTICS, newServiceDiagnostics, newServiceDiagnostics, !oldServiceDiagnosticsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetServiceDiagnostics(NotificationChain msgs) {
		DiagnosticInfo oldServiceDiagnostics = serviceDiagnostics;
		serviceDiagnostics = null;
		boolean oldServiceDiagnosticsESet = serviceDiagnosticsESet;
		serviceDiagnosticsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.RESPONSE_HEADER__SERVICE_DIAGNOSTICS, oldServiceDiagnostics, null, oldServiceDiagnosticsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServiceDiagnostics() {
		if (serviceDiagnostics != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)serviceDiagnostics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RESPONSE_HEADER__SERVICE_DIAGNOSTICS, null, msgs);
			msgs = basicUnsetServiceDiagnostics(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldServiceDiagnosticsESet = serviceDiagnosticsESet;
			serviceDiagnosticsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.RESPONSE_HEADER__SERVICE_DIAGNOSTICS, null, null, oldServiceDiagnosticsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServiceDiagnostics() {
		return serviceDiagnosticsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfString getStringTable() {
		return stringTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringTable(ListOfString newStringTable, NotificationChain msgs) {
		ListOfString oldStringTable = stringTable;
		stringTable = newStringTable;
		boolean oldStringTableESet = stringTableESet;
		stringTableESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.RESPONSE_HEADER__STRING_TABLE, oldStringTable, newStringTable, !oldStringTableESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringTable(ListOfString newStringTable) {
		if (newStringTable != stringTable) {
			NotificationChain msgs = null;
			if (stringTable != null)
				msgs = ((InternalEObject)stringTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RESPONSE_HEADER__STRING_TABLE, null, msgs);
			if (newStringTable != null)
				msgs = ((InternalEObject)newStringTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RESPONSE_HEADER__STRING_TABLE, null, msgs);
			msgs = basicSetStringTable(newStringTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldStringTableESet = stringTableESet;
			stringTableESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RESPONSE_HEADER__STRING_TABLE, newStringTable, newStringTable, !oldStringTableESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetStringTable(NotificationChain msgs) {
		ListOfString oldStringTable = stringTable;
		stringTable = null;
		boolean oldStringTableESet = stringTableESet;
		stringTableESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.RESPONSE_HEADER__STRING_TABLE, oldStringTable, null, oldStringTableESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStringTable() {
		if (stringTable != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)stringTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RESPONSE_HEADER__STRING_TABLE, null, msgs);
			msgs = basicUnsetStringTable(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldStringTableESet = stringTableESet;
			stringTableESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.RESPONSE_HEADER__STRING_TABLE, null, null, oldStringTableESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStringTable() {
		return stringTableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionObject getAdditionalHeader() {
		return additionalHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalHeader(ExtensionObject newAdditionalHeader, NotificationChain msgs) {
		ExtensionObject oldAdditionalHeader = additionalHeader;
		additionalHeader = newAdditionalHeader;
		boolean oldAdditionalHeaderESet = additionalHeaderESet;
		additionalHeaderESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.RESPONSE_HEADER__ADDITIONAL_HEADER, oldAdditionalHeader, newAdditionalHeader, !oldAdditionalHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalHeader(ExtensionObject newAdditionalHeader) {
		if (newAdditionalHeader != additionalHeader) {
			NotificationChain msgs = null;
			if (additionalHeader != null)
				msgs = ((InternalEObject)additionalHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RESPONSE_HEADER__ADDITIONAL_HEADER, null, msgs);
			if (newAdditionalHeader != null)
				msgs = ((InternalEObject)newAdditionalHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RESPONSE_HEADER__ADDITIONAL_HEADER, null, msgs);
			msgs = basicSetAdditionalHeader(newAdditionalHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAdditionalHeaderESet = additionalHeaderESet;
			additionalHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RESPONSE_HEADER__ADDITIONAL_HEADER, newAdditionalHeader, newAdditionalHeader, !oldAdditionalHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAdditionalHeader(NotificationChain msgs) {
		ExtensionObject oldAdditionalHeader = additionalHeader;
		additionalHeader = null;
		boolean oldAdditionalHeaderESet = additionalHeaderESet;
		additionalHeaderESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.RESPONSE_HEADER__ADDITIONAL_HEADER, oldAdditionalHeader, null, oldAdditionalHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAdditionalHeader() {
		if (additionalHeader != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)additionalHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RESPONSE_HEADER__ADDITIONAL_HEADER, null, msgs);
			msgs = basicUnsetAdditionalHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAdditionalHeaderESet = additionalHeaderESet;
			additionalHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.RESPONSE_HEADER__ADDITIONAL_HEADER, null, null, oldAdditionalHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAdditionalHeader() {
		return additionalHeaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.RESPONSE_HEADER__SERVICE_RESULT:
				return basicSetServiceResult(null, msgs);
			case TypesPackage.RESPONSE_HEADER__SERVICE_DIAGNOSTICS:
				return basicUnsetServiceDiagnostics(msgs);
			case TypesPackage.RESPONSE_HEADER__STRING_TABLE:
				return basicUnsetStringTable(msgs);
			case TypesPackage.RESPONSE_HEADER__ADDITIONAL_HEADER:
				return basicUnsetAdditionalHeader(msgs);
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
			case TypesPackage.RESPONSE_HEADER__TIMESTAMP:
				return getTimestamp();
			case TypesPackage.RESPONSE_HEADER__REQUEST_HANDLE:
				return getRequestHandle();
			case TypesPackage.RESPONSE_HEADER__SERVICE_RESULT:
				return getServiceResult();
			case TypesPackage.RESPONSE_HEADER__SERVICE_DIAGNOSTICS:
				return getServiceDiagnostics();
			case TypesPackage.RESPONSE_HEADER__STRING_TABLE:
				return getStringTable();
			case TypesPackage.RESPONSE_HEADER__ADDITIONAL_HEADER:
				return getAdditionalHeader();
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
			case TypesPackage.RESPONSE_HEADER__TIMESTAMP:
				setTimestamp((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.RESPONSE_HEADER__REQUEST_HANDLE:
				setRequestHandle((Long)newValue);
				return;
			case TypesPackage.RESPONSE_HEADER__SERVICE_RESULT:
				setServiceResult((StatusCode)newValue);
				return;
			case TypesPackage.RESPONSE_HEADER__SERVICE_DIAGNOSTICS:
				setServiceDiagnostics((DiagnosticInfo)newValue);
				return;
			case TypesPackage.RESPONSE_HEADER__STRING_TABLE:
				setStringTable((ListOfString)newValue);
				return;
			case TypesPackage.RESPONSE_HEADER__ADDITIONAL_HEADER:
				setAdditionalHeader((ExtensionObject)newValue);
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
			case TypesPackage.RESPONSE_HEADER__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case TypesPackage.RESPONSE_HEADER__REQUEST_HANDLE:
				unsetRequestHandle();
				return;
			case TypesPackage.RESPONSE_HEADER__SERVICE_RESULT:
				setServiceResult((StatusCode)null);
				return;
			case TypesPackage.RESPONSE_HEADER__SERVICE_DIAGNOSTICS:
				unsetServiceDiagnostics();
				return;
			case TypesPackage.RESPONSE_HEADER__STRING_TABLE:
				unsetStringTable();
				return;
			case TypesPackage.RESPONSE_HEADER__ADDITIONAL_HEADER:
				unsetAdditionalHeader();
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
			case TypesPackage.RESPONSE_HEADER__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case TypesPackage.RESPONSE_HEADER__REQUEST_HANDLE:
				return isSetRequestHandle();
			case TypesPackage.RESPONSE_HEADER__SERVICE_RESULT:
				return serviceResult != null;
			case TypesPackage.RESPONSE_HEADER__SERVICE_DIAGNOSTICS:
				return isSetServiceDiagnostics();
			case TypesPackage.RESPONSE_HEADER__STRING_TABLE:
				return isSetStringTable();
			case TypesPackage.RESPONSE_HEADER__ADDITIONAL_HEADER:
				return isSetAdditionalHeader();
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(", requestHandle: ");
		if (requestHandleESet) result.append(requestHandle); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ResponseHeaderImpl
