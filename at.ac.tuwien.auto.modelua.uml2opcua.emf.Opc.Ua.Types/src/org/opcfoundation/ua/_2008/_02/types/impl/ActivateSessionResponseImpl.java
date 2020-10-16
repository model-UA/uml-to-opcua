/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ActivateSessionResponse;
import org.opcfoundation.ua._2008._02.types.ListOfDiagnosticInfo;
import org.opcfoundation.ua._2008._02.types.ListOfStatusCode;
import org.opcfoundation.ua._2008._02.types.ResponseHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activate Session Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ActivateSessionResponseImpl#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ActivateSessionResponseImpl#getServerNonce <em>Server Nonce</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ActivateSessionResponseImpl#getResults <em>Results</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.ActivateSessionResponseImpl#getDiagnosticInfos <em>Diagnostic Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivateSessionResponseImpl extends MinimalEObjectImpl.Container implements ActivateSessionResponse {
	/**
	 * The cached value of the '{@link #getResponseHeader() <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseHeader()
	 * @generated
	 * @ordered
	 */
	protected ResponseHeader responseHeader;

	/**
	 * This is true if the Response Header containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean responseHeaderESet;

	/**
	 * The default value of the '{@link #getServerNonce() <em>Server Nonce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerNonce()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] SERVER_NONCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerNonce() <em>Server Nonce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerNonce()
	 * @generated
	 * @ordered
	 */
	protected byte[] serverNonce = SERVER_NONCE_EDEFAULT;

	/**
	 * This is true if the Server Nonce attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverNonceESet;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected ListOfStatusCode results;

	/**
	 * This is true if the Results containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resultsESet;

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
	protected ActivateSessionResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getActivateSessionResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseHeader(ResponseHeader newResponseHeader, NotificationChain msgs) {
		ResponseHeader oldResponseHeader = responseHeader;
		responseHeader = newResponseHeader;
		boolean oldResponseHeaderESet = responseHeaderESet;
		responseHeaderESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_RESPONSE__RESPONSE_HEADER, oldResponseHeader, newResponseHeader, !oldResponseHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseHeader(ResponseHeader newResponseHeader) {
		if (newResponseHeader != responseHeader) {
			NotificationChain msgs = null;
			if (responseHeader != null)
				msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_RESPONSE__RESPONSE_HEADER, null, msgs);
			if (newResponseHeader != null)
				msgs = ((InternalEObject)newResponseHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicSetResponseHeader(newResponseHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_RESPONSE__RESPONSE_HEADER, newResponseHeader, newResponseHeader, !oldResponseHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetResponseHeader(NotificationChain msgs) {
		ResponseHeader oldResponseHeader = responseHeader;
		responseHeader = null;
		boolean oldResponseHeaderESet = responseHeaderESet;
		responseHeaderESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_RESPONSE__RESPONSE_HEADER, oldResponseHeader, null, oldResponseHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResponseHeader() {
		if (responseHeader != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicUnsetResponseHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_RESPONSE__RESPONSE_HEADER, null, null, oldResponseHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResponseHeader() {
		return responseHeaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getServerNonce() {
		return serverNonce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerNonce(byte[] newServerNonce) {
		byte[] oldServerNonce = serverNonce;
		serverNonce = newServerNonce;
		boolean oldServerNonceESet = serverNonceESet;
		serverNonceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_RESPONSE__SERVER_NONCE, oldServerNonce, serverNonce, !oldServerNonceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerNonce() {
		byte[] oldServerNonce = serverNonce;
		boolean oldServerNonceESet = serverNonceESet;
		serverNonce = SERVER_NONCE_EDEFAULT;
		serverNonceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_RESPONSE__SERVER_NONCE, oldServerNonce, SERVER_NONCE_EDEFAULT, oldServerNonceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerNonce() {
		return serverNonceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStatusCode getResults() {
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResults(ListOfStatusCode newResults, NotificationChain msgs) {
		ListOfStatusCode oldResults = results;
		results = newResults;
		boolean oldResultsESet = resultsESet;
		resultsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_RESPONSE__RESULTS, oldResults, newResults, !oldResultsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResults(ListOfStatusCode newResults) {
		if (newResults != results) {
			NotificationChain msgs = null;
			if (results != null)
				msgs = ((InternalEObject)results).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_RESPONSE__RESULTS, null, msgs);
			if (newResults != null)
				msgs = ((InternalEObject)newResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_RESPONSE__RESULTS, null, msgs);
			msgs = basicSetResults(newResults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResultsESet = resultsESet;
			resultsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_RESPONSE__RESULTS, newResults, newResults, !oldResultsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetResults(NotificationChain msgs) {
		ListOfStatusCode oldResults = results;
		results = null;
		boolean oldResultsESet = resultsESet;
		resultsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_RESPONSE__RESULTS, oldResults, null, oldResultsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResults() {
		if (results != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)results).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_RESPONSE__RESULTS, null, msgs);
			msgs = basicUnsetResults(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResultsESet = resultsESet;
			resultsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_RESPONSE__RESULTS, null, null, oldResultsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResults() {
		return resultsESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_RESPONSE__DIAGNOSTIC_INFOS, oldDiagnosticInfos, newDiagnosticInfos, !oldDiagnosticInfosESet);
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
				msgs = ((InternalEObject)diagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_RESPONSE__DIAGNOSTIC_INFOS, null, msgs);
			if (newDiagnosticInfos != null)
				msgs = ((InternalEObject)newDiagnosticInfos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_RESPONSE__DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicSetDiagnosticInfos(newDiagnosticInfos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiagnosticInfosESet = diagnosticInfosESet;
			diagnosticInfosESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ACTIVATE_SESSION_RESPONSE__DIAGNOSTIC_INFOS, newDiagnosticInfos, newDiagnosticInfos, !oldDiagnosticInfosESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_RESPONSE__DIAGNOSTIC_INFOS, oldDiagnosticInfos, null, oldDiagnosticInfosESet);
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
			msgs = ((InternalEObject)diagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ACTIVATE_SESSION_RESPONSE__DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicUnsetDiagnosticInfos(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiagnosticInfosESet = diagnosticInfosESet;
			diagnosticInfosESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ACTIVATE_SESSION_RESPONSE__DIAGNOSTIC_INFOS, null, null, oldDiagnosticInfosESet));
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
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__RESPONSE_HEADER:
				return basicUnsetResponseHeader(msgs);
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__RESULTS:
				return basicUnsetResults(msgs);
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__DIAGNOSTIC_INFOS:
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
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__RESPONSE_HEADER:
				return getResponseHeader();
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__SERVER_NONCE:
				return getServerNonce();
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__RESULTS:
				return getResults();
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__DIAGNOSTIC_INFOS:
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
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__RESPONSE_HEADER:
				setResponseHeader((ResponseHeader)newValue);
				return;
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__SERVER_NONCE:
				setServerNonce((byte[])newValue);
				return;
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__RESULTS:
				setResults((ListOfStatusCode)newValue);
				return;
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__DIAGNOSTIC_INFOS:
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
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__RESPONSE_HEADER:
				unsetResponseHeader();
				return;
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__SERVER_NONCE:
				unsetServerNonce();
				return;
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__RESULTS:
				unsetResults();
				return;
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__DIAGNOSTIC_INFOS:
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
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__RESPONSE_HEADER:
				return isSetResponseHeader();
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__SERVER_NONCE:
				return isSetServerNonce();
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__RESULTS:
				return isSetResults();
			case TypesPackage.ACTIVATE_SESSION_RESPONSE__DIAGNOSTIC_INFOS:
				return isSetDiagnosticInfos();
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
		result.append(" (serverNonce: ");
		if (serverNonceESet) result.append(serverNonce); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ActivateSessionResponseImpl
