/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opcfoundation.ua._2008._02.types.ContentFilterResult;
import org.opcfoundation.ua._2008._02.types.EventFilterResult;
import org.opcfoundation.ua._2008._02.types.ListOfDiagnosticInfo;
import org.opcfoundation.ua._2008._02.types.ListOfStatusCode;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Filter Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EventFilterResultImpl#getSelectClauseResults <em>Select Clause Results</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EventFilterResultImpl#getSelectClauseDiagnosticInfos <em>Select Clause Diagnostic Infos</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.EventFilterResultImpl#getWhereClauseResult <em>Where Clause Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventFilterResultImpl extends MonitoringFilterResultImpl implements EventFilterResult {
	/**
	 * The cached value of the '{@link #getSelectClauseResults() <em>Select Clause Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectClauseResults()
	 * @generated
	 * @ordered
	 */
	protected ListOfStatusCode selectClauseResults;

	/**
	 * This is true if the Select Clause Results containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean selectClauseResultsESet;

	/**
	 * The cached value of the '{@link #getSelectClauseDiagnosticInfos() <em>Select Clause Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectClauseDiagnosticInfos()
	 * @generated
	 * @ordered
	 */
	protected ListOfDiagnosticInfo selectClauseDiagnosticInfos;

	/**
	 * This is true if the Select Clause Diagnostic Infos containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean selectClauseDiagnosticInfosESet;

	/**
	 * The cached value of the '{@link #getWhereClauseResult() <em>Where Clause Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhereClauseResult()
	 * @generated
	 * @ordered
	 */
	protected ContentFilterResult whereClauseResult;

	/**
	 * This is true if the Where Clause Result containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean whereClauseResultESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventFilterResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getEventFilterResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStatusCode getSelectClauseResults() {
		return selectClauseResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectClauseResults(ListOfStatusCode newSelectClauseResults, NotificationChain msgs) {
		ListOfStatusCode oldSelectClauseResults = selectClauseResults;
		selectClauseResults = newSelectClauseResults;
		boolean oldSelectClauseResultsESet = selectClauseResultsESet;
		selectClauseResultsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_RESULTS, oldSelectClauseResults, newSelectClauseResults, !oldSelectClauseResultsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectClauseResults(ListOfStatusCode newSelectClauseResults) {
		if (newSelectClauseResults != selectClauseResults) {
			NotificationChain msgs = null;
			if (selectClauseResults != null)
				msgs = ((InternalEObject)selectClauseResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_RESULTS, null, msgs);
			if (newSelectClauseResults != null)
				msgs = ((InternalEObject)newSelectClauseResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_RESULTS, null, msgs);
			msgs = basicSetSelectClauseResults(newSelectClauseResults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSelectClauseResultsESet = selectClauseResultsESet;
			selectClauseResultsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_RESULTS, newSelectClauseResults, newSelectClauseResults, !oldSelectClauseResultsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSelectClauseResults(NotificationChain msgs) {
		ListOfStatusCode oldSelectClauseResults = selectClauseResults;
		selectClauseResults = null;
		boolean oldSelectClauseResultsESet = selectClauseResultsESet;
		selectClauseResultsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_RESULTS, oldSelectClauseResults, null, oldSelectClauseResultsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSelectClauseResults() {
		if (selectClauseResults != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)selectClauseResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_RESULTS, null, msgs);
			msgs = basicUnsetSelectClauseResults(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSelectClauseResultsESet = selectClauseResultsESet;
			selectClauseResultsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_RESULTS, null, null, oldSelectClauseResultsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSelectClauseResults() {
		return selectClauseResultsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDiagnosticInfo getSelectClauseDiagnosticInfos() {
		return selectClauseDiagnosticInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectClauseDiagnosticInfos(ListOfDiagnosticInfo newSelectClauseDiagnosticInfos, NotificationChain msgs) {
		ListOfDiagnosticInfo oldSelectClauseDiagnosticInfos = selectClauseDiagnosticInfos;
		selectClauseDiagnosticInfos = newSelectClauseDiagnosticInfos;
		boolean oldSelectClauseDiagnosticInfosESet = selectClauseDiagnosticInfosESet;
		selectClauseDiagnosticInfosESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_DIAGNOSTIC_INFOS, oldSelectClauseDiagnosticInfos, newSelectClauseDiagnosticInfos, !oldSelectClauseDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectClauseDiagnosticInfos(ListOfDiagnosticInfo newSelectClauseDiagnosticInfos) {
		if (newSelectClauseDiagnosticInfos != selectClauseDiagnosticInfos) {
			NotificationChain msgs = null;
			if (selectClauseDiagnosticInfos != null)
				msgs = ((InternalEObject)selectClauseDiagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_DIAGNOSTIC_INFOS, null, msgs);
			if (newSelectClauseDiagnosticInfos != null)
				msgs = ((InternalEObject)newSelectClauseDiagnosticInfos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicSetSelectClauseDiagnosticInfos(newSelectClauseDiagnosticInfos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSelectClauseDiagnosticInfosESet = selectClauseDiagnosticInfosESet;
			selectClauseDiagnosticInfosESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_DIAGNOSTIC_INFOS, newSelectClauseDiagnosticInfos, newSelectClauseDiagnosticInfos, !oldSelectClauseDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSelectClauseDiagnosticInfos(NotificationChain msgs) {
		ListOfDiagnosticInfo oldSelectClauseDiagnosticInfos = selectClauseDiagnosticInfos;
		selectClauseDiagnosticInfos = null;
		boolean oldSelectClauseDiagnosticInfosESet = selectClauseDiagnosticInfosESet;
		selectClauseDiagnosticInfosESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_DIAGNOSTIC_INFOS, oldSelectClauseDiagnosticInfos, null, oldSelectClauseDiagnosticInfosESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSelectClauseDiagnosticInfos() {
		if (selectClauseDiagnosticInfos != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)selectClauseDiagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicUnsetSelectClauseDiagnosticInfos(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSelectClauseDiagnosticInfosESet = selectClauseDiagnosticInfosESet;
			selectClauseDiagnosticInfosESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_DIAGNOSTIC_INFOS, null, null, oldSelectClauseDiagnosticInfosESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSelectClauseDiagnosticInfos() {
		return selectClauseDiagnosticInfosESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFilterResult getWhereClauseResult() {
		return whereClauseResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhereClauseResult(ContentFilterResult newWhereClauseResult, NotificationChain msgs) {
		ContentFilterResult oldWhereClauseResult = whereClauseResult;
		whereClauseResult = newWhereClauseResult;
		boolean oldWhereClauseResultESet = whereClauseResultESet;
		whereClauseResultESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.EVENT_FILTER_RESULT__WHERE_CLAUSE_RESULT, oldWhereClauseResult, newWhereClauseResult, !oldWhereClauseResultESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhereClauseResult(ContentFilterResult newWhereClauseResult) {
		if (newWhereClauseResult != whereClauseResult) {
			NotificationChain msgs = null;
			if (whereClauseResult != null)
				msgs = ((InternalEObject)whereClauseResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EVENT_FILTER_RESULT__WHERE_CLAUSE_RESULT, null, msgs);
			if (newWhereClauseResult != null)
				msgs = ((InternalEObject)newWhereClauseResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EVENT_FILTER_RESULT__WHERE_CLAUSE_RESULT, null, msgs);
			msgs = basicSetWhereClauseResult(newWhereClauseResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldWhereClauseResultESet = whereClauseResultESet;
			whereClauseResultESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.EVENT_FILTER_RESULT__WHERE_CLAUSE_RESULT, newWhereClauseResult, newWhereClauseResult, !oldWhereClauseResultESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetWhereClauseResult(NotificationChain msgs) {
		ContentFilterResult oldWhereClauseResult = whereClauseResult;
		whereClauseResult = null;
		boolean oldWhereClauseResultESet = whereClauseResultESet;
		whereClauseResultESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.EVENT_FILTER_RESULT__WHERE_CLAUSE_RESULT, oldWhereClauseResult, null, oldWhereClauseResultESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWhereClauseResult() {
		if (whereClauseResult != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)whereClauseResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.EVENT_FILTER_RESULT__WHERE_CLAUSE_RESULT, null, msgs);
			msgs = basicUnsetWhereClauseResult(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldWhereClauseResultESet = whereClauseResultESet;
			whereClauseResultESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.EVENT_FILTER_RESULT__WHERE_CLAUSE_RESULT, null, null, oldWhereClauseResultESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWhereClauseResult() {
		return whereClauseResultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_RESULTS:
				return basicUnsetSelectClauseResults(msgs);
			case TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_DIAGNOSTIC_INFOS:
				return basicUnsetSelectClauseDiagnosticInfos(msgs);
			case TypesPackage.EVENT_FILTER_RESULT__WHERE_CLAUSE_RESULT:
				return basicUnsetWhereClauseResult(msgs);
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
			case TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_RESULTS:
				return getSelectClauseResults();
			case TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_DIAGNOSTIC_INFOS:
				return getSelectClauseDiagnosticInfos();
			case TypesPackage.EVENT_FILTER_RESULT__WHERE_CLAUSE_RESULT:
				return getWhereClauseResult();
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
			case TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_RESULTS:
				setSelectClauseResults((ListOfStatusCode)newValue);
				return;
			case TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_DIAGNOSTIC_INFOS:
				setSelectClauseDiagnosticInfos((ListOfDiagnosticInfo)newValue);
				return;
			case TypesPackage.EVENT_FILTER_RESULT__WHERE_CLAUSE_RESULT:
				setWhereClauseResult((ContentFilterResult)newValue);
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
			case TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_RESULTS:
				unsetSelectClauseResults();
				return;
			case TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_DIAGNOSTIC_INFOS:
				unsetSelectClauseDiagnosticInfos();
				return;
			case TypesPackage.EVENT_FILTER_RESULT__WHERE_CLAUSE_RESULT:
				unsetWhereClauseResult();
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
			case TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_RESULTS:
				return isSetSelectClauseResults();
			case TypesPackage.EVENT_FILTER_RESULT__SELECT_CLAUSE_DIAGNOSTIC_INFOS:
				return isSetSelectClauseDiagnosticInfos();
			case TypesPackage.EVENT_FILTER_RESULT__WHERE_CLAUSE_RESULT:
				return isSetWhereClauseResult();
		}
		return super.eIsSet(featureID);
	}

} //EventFilterResultImpl
