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
import org.opcfoundation.ua._2008._02.types.ResponseHeader;
import org.opcfoundation.ua._2008._02.types.SetTriggeringResponse;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Triggering Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SetTriggeringResponseImpl#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SetTriggeringResponseImpl#getAddResults <em>Add Results</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SetTriggeringResponseImpl#getAddDiagnosticInfos <em>Add Diagnostic Infos</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SetTriggeringResponseImpl#getRemoveResults <em>Remove Results</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SetTriggeringResponseImpl#getRemoveDiagnosticInfos <em>Remove Diagnostic Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetTriggeringResponseImpl extends MinimalEObjectImpl.Container implements SetTriggeringResponse {
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
	 * The cached value of the '{@link #getAddResults() <em>Add Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddResults()
	 * @generated
	 * @ordered
	 */
	protected ListOfStatusCode addResults;

	/**
	 * This is true if the Add Results containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean addResultsESet;

	/**
	 * The cached value of the '{@link #getAddDiagnosticInfos() <em>Add Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddDiagnosticInfos()
	 * @generated
	 * @ordered
	 */
	protected ListOfDiagnosticInfo addDiagnosticInfos;

	/**
	 * This is true if the Add Diagnostic Infos containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean addDiagnosticInfosESet;

	/**
	 * The cached value of the '{@link #getRemoveResults() <em>Remove Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveResults()
	 * @generated
	 * @ordered
	 */
	protected ListOfStatusCode removeResults;

	/**
	 * This is true if the Remove Results containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean removeResultsESet;

	/**
	 * The cached value of the '{@link #getRemoveDiagnosticInfos() <em>Remove Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveDiagnosticInfos()
	 * @generated
	 * @ordered
	 */
	protected ListOfDiagnosticInfo removeDiagnosticInfos;

	/**
	 * This is true if the Remove Diagnostic Infos containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean removeDiagnosticInfosESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetTriggeringResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getSetTriggeringResponse();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SET_TRIGGERING_RESPONSE__RESPONSE_HEADER, oldResponseHeader, newResponseHeader, !oldResponseHeaderESet);
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
				msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_RESPONSE__RESPONSE_HEADER, null, msgs);
			if (newResponseHeader != null)
				msgs = ((InternalEObject)newResponseHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicSetResponseHeader(newResponseHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SET_TRIGGERING_RESPONSE__RESPONSE_HEADER, newResponseHeader, newResponseHeader, !oldResponseHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_TRIGGERING_RESPONSE__RESPONSE_HEADER, oldResponseHeader, null, oldResponseHeaderESet);
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
			msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicUnsetResponseHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_TRIGGERING_RESPONSE__RESPONSE_HEADER, null, null, oldResponseHeaderESet));
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
	public ListOfStatusCode getAddResults() {
		return addResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddResults(ListOfStatusCode newAddResults, NotificationChain msgs) {
		ListOfStatusCode oldAddResults = addResults;
		addResults = newAddResults;
		boolean oldAddResultsESet = addResultsESet;
		addResultsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SET_TRIGGERING_RESPONSE__ADD_RESULTS, oldAddResults, newAddResults, !oldAddResultsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddResults(ListOfStatusCode newAddResults) {
		if (newAddResults != addResults) {
			NotificationChain msgs = null;
			if (addResults != null)
				msgs = ((InternalEObject)addResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_RESPONSE__ADD_RESULTS, null, msgs);
			if (newAddResults != null)
				msgs = ((InternalEObject)newAddResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_RESPONSE__ADD_RESULTS, null, msgs);
			msgs = basicSetAddResults(newAddResults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAddResultsESet = addResultsESet;
			addResultsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SET_TRIGGERING_RESPONSE__ADD_RESULTS, newAddResults, newAddResults, !oldAddResultsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAddResults(NotificationChain msgs) {
		ListOfStatusCode oldAddResults = addResults;
		addResults = null;
		boolean oldAddResultsESet = addResultsESet;
		addResultsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_TRIGGERING_RESPONSE__ADD_RESULTS, oldAddResults, null, oldAddResultsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAddResults() {
		if (addResults != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)addResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_RESPONSE__ADD_RESULTS, null, msgs);
			msgs = basicUnsetAddResults(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAddResultsESet = addResultsESet;
			addResultsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_TRIGGERING_RESPONSE__ADD_RESULTS, null, null, oldAddResultsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAddResults() {
		return addResultsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDiagnosticInfo getAddDiagnosticInfos() {
		return addDiagnosticInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddDiagnosticInfos(ListOfDiagnosticInfo newAddDiagnosticInfos, NotificationChain msgs) {
		ListOfDiagnosticInfo oldAddDiagnosticInfos = addDiagnosticInfos;
		addDiagnosticInfos = newAddDiagnosticInfos;
		boolean oldAddDiagnosticInfosESet = addDiagnosticInfosESet;
		addDiagnosticInfosESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SET_TRIGGERING_RESPONSE__ADD_DIAGNOSTIC_INFOS, oldAddDiagnosticInfos, newAddDiagnosticInfos, !oldAddDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddDiagnosticInfos(ListOfDiagnosticInfo newAddDiagnosticInfos) {
		if (newAddDiagnosticInfos != addDiagnosticInfos) {
			NotificationChain msgs = null;
			if (addDiagnosticInfos != null)
				msgs = ((InternalEObject)addDiagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_RESPONSE__ADD_DIAGNOSTIC_INFOS, null, msgs);
			if (newAddDiagnosticInfos != null)
				msgs = ((InternalEObject)newAddDiagnosticInfos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_RESPONSE__ADD_DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicSetAddDiagnosticInfos(newAddDiagnosticInfos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAddDiagnosticInfosESet = addDiagnosticInfosESet;
			addDiagnosticInfosESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SET_TRIGGERING_RESPONSE__ADD_DIAGNOSTIC_INFOS, newAddDiagnosticInfos, newAddDiagnosticInfos, !oldAddDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAddDiagnosticInfos(NotificationChain msgs) {
		ListOfDiagnosticInfo oldAddDiagnosticInfos = addDiagnosticInfos;
		addDiagnosticInfos = null;
		boolean oldAddDiagnosticInfosESet = addDiagnosticInfosESet;
		addDiagnosticInfosESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_TRIGGERING_RESPONSE__ADD_DIAGNOSTIC_INFOS, oldAddDiagnosticInfos, null, oldAddDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAddDiagnosticInfos() {
		if (addDiagnosticInfos != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)addDiagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_RESPONSE__ADD_DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicUnsetAddDiagnosticInfos(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAddDiagnosticInfosESet = addDiagnosticInfosESet;
			addDiagnosticInfosESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_TRIGGERING_RESPONSE__ADD_DIAGNOSTIC_INFOS, null, null, oldAddDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAddDiagnosticInfos() {
		return addDiagnosticInfosESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStatusCode getRemoveResults() {
		return removeResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveResults(ListOfStatusCode newRemoveResults, NotificationChain msgs) {
		ListOfStatusCode oldRemoveResults = removeResults;
		removeResults = newRemoveResults;
		boolean oldRemoveResultsESet = removeResultsESet;
		removeResultsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_RESULTS, oldRemoveResults, newRemoveResults, !oldRemoveResultsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveResults(ListOfStatusCode newRemoveResults) {
		if (newRemoveResults != removeResults) {
			NotificationChain msgs = null;
			if (removeResults != null)
				msgs = ((InternalEObject)removeResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_RESULTS, null, msgs);
			if (newRemoveResults != null)
				msgs = ((InternalEObject)newRemoveResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_RESULTS, null, msgs);
			msgs = basicSetRemoveResults(newRemoveResults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRemoveResultsESet = removeResultsESet;
			removeResultsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_RESULTS, newRemoveResults, newRemoveResults, !oldRemoveResultsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRemoveResults(NotificationChain msgs) {
		ListOfStatusCode oldRemoveResults = removeResults;
		removeResults = null;
		boolean oldRemoveResultsESet = removeResultsESet;
		removeResultsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_RESULTS, oldRemoveResults, null, oldRemoveResultsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRemoveResults() {
		if (removeResults != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)removeResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_RESULTS, null, msgs);
			msgs = basicUnsetRemoveResults(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRemoveResultsESet = removeResultsESet;
			removeResultsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_RESULTS, null, null, oldRemoveResultsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRemoveResults() {
		return removeResultsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDiagnosticInfo getRemoveDiagnosticInfos() {
		return removeDiagnosticInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveDiagnosticInfos(ListOfDiagnosticInfo newRemoveDiagnosticInfos, NotificationChain msgs) {
		ListOfDiagnosticInfo oldRemoveDiagnosticInfos = removeDiagnosticInfos;
		removeDiagnosticInfos = newRemoveDiagnosticInfos;
		boolean oldRemoveDiagnosticInfosESet = removeDiagnosticInfosESet;
		removeDiagnosticInfosESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_DIAGNOSTIC_INFOS, oldRemoveDiagnosticInfos, newRemoveDiagnosticInfos, !oldRemoveDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveDiagnosticInfos(ListOfDiagnosticInfo newRemoveDiagnosticInfos) {
		if (newRemoveDiagnosticInfos != removeDiagnosticInfos) {
			NotificationChain msgs = null;
			if (removeDiagnosticInfos != null)
				msgs = ((InternalEObject)removeDiagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_DIAGNOSTIC_INFOS, null, msgs);
			if (newRemoveDiagnosticInfos != null)
				msgs = ((InternalEObject)newRemoveDiagnosticInfos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicSetRemoveDiagnosticInfos(newRemoveDiagnosticInfos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRemoveDiagnosticInfosESet = removeDiagnosticInfosESet;
			removeDiagnosticInfosESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_DIAGNOSTIC_INFOS, newRemoveDiagnosticInfos, newRemoveDiagnosticInfos, !oldRemoveDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRemoveDiagnosticInfos(NotificationChain msgs) {
		ListOfDiagnosticInfo oldRemoveDiagnosticInfos = removeDiagnosticInfos;
		removeDiagnosticInfos = null;
		boolean oldRemoveDiagnosticInfosESet = removeDiagnosticInfosESet;
		removeDiagnosticInfosESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_DIAGNOSTIC_INFOS, oldRemoveDiagnosticInfos, null, oldRemoveDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRemoveDiagnosticInfos() {
		if (removeDiagnosticInfos != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)removeDiagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicUnsetRemoveDiagnosticInfos(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRemoveDiagnosticInfosESet = removeDiagnosticInfosESet;
			removeDiagnosticInfosESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_DIAGNOSTIC_INFOS, null, null, oldRemoveDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRemoveDiagnosticInfos() {
		return removeDiagnosticInfosESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.SET_TRIGGERING_RESPONSE__RESPONSE_HEADER:
				return basicUnsetResponseHeader(msgs);
			case TypesPackage.SET_TRIGGERING_RESPONSE__ADD_RESULTS:
				return basicUnsetAddResults(msgs);
			case TypesPackage.SET_TRIGGERING_RESPONSE__ADD_DIAGNOSTIC_INFOS:
				return basicUnsetAddDiagnosticInfos(msgs);
			case TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_RESULTS:
				return basicUnsetRemoveResults(msgs);
			case TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_DIAGNOSTIC_INFOS:
				return basicUnsetRemoveDiagnosticInfos(msgs);
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
			case TypesPackage.SET_TRIGGERING_RESPONSE__RESPONSE_HEADER:
				return getResponseHeader();
			case TypesPackage.SET_TRIGGERING_RESPONSE__ADD_RESULTS:
				return getAddResults();
			case TypesPackage.SET_TRIGGERING_RESPONSE__ADD_DIAGNOSTIC_INFOS:
				return getAddDiagnosticInfos();
			case TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_RESULTS:
				return getRemoveResults();
			case TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_DIAGNOSTIC_INFOS:
				return getRemoveDiagnosticInfos();
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
			case TypesPackage.SET_TRIGGERING_RESPONSE__RESPONSE_HEADER:
				setResponseHeader((ResponseHeader)newValue);
				return;
			case TypesPackage.SET_TRIGGERING_RESPONSE__ADD_RESULTS:
				setAddResults((ListOfStatusCode)newValue);
				return;
			case TypesPackage.SET_TRIGGERING_RESPONSE__ADD_DIAGNOSTIC_INFOS:
				setAddDiagnosticInfos((ListOfDiagnosticInfo)newValue);
				return;
			case TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_RESULTS:
				setRemoveResults((ListOfStatusCode)newValue);
				return;
			case TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_DIAGNOSTIC_INFOS:
				setRemoveDiagnosticInfos((ListOfDiagnosticInfo)newValue);
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
			case TypesPackage.SET_TRIGGERING_RESPONSE__RESPONSE_HEADER:
				unsetResponseHeader();
				return;
			case TypesPackage.SET_TRIGGERING_RESPONSE__ADD_RESULTS:
				unsetAddResults();
				return;
			case TypesPackage.SET_TRIGGERING_RESPONSE__ADD_DIAGNOSTIC_INFOS:
				unsetAddDiagnosticInfos();
				return;
			case TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_RESULTS:
				unsetRemoveResults();
				return;
			case TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_DIAGNOSTIC_INFOS:
				unsetRemoveDiagnosticInfos();
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
			case TypesPackage.SET_TRIGGERING_RESPONSE__RESPONSE_HEADER:
				return isSetResponseHeader();
			case TypesPackage.SET_TRIGGERING_RESPONSE__ADD_RESULTS:
				return isSetAddResults();
			case TypesPackage.SET_TRIGGERING_RESPONSE__ADD_DIAGNOSTIC_INFOS:
				return isSetAddDiagnosticInfos();
			case TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_RESULTS:
				return isSetRemoveResults();
			case TypesPackage.SET_TRIGGERING_RESPONSE__REMOVE_DIAGNOSTIC_INFOS:
				return isSetRemoveDiagnosticInfos();
		}
		return super.eIsSet(featureID);
	}

} //SetTriggeringResponseImpl
