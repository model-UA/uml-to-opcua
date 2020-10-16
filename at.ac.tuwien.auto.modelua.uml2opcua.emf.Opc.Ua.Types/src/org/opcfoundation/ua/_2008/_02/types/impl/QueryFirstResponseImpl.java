/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ContentFilterResult;
import org.opcfoundation.ua._2008._02.types.ListOfDiagnosticInfo;
import org.opcfoundation.ua._2008._02.types.ListOfParsingResult;
import org.opcfoundation.ua._2008._02.types.ListOfQueryDataSet;
import org.opcfoundation.ua._2008._02.types.QueryFirstResponse;
import org.opcfoundation.ua._2008._02.types.ResponseHeader;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query First Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryFirstResponseImpl#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryFirstResponseImpl#getQueryDataSets <em>Query Data Sets</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryFirstResponseImpl#getContinuationPoint <em>Continuation Point</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryFirstResponseImpl#getParsingResults <em>Parsing Results</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryFirstResponseImpl#getDiagnosticInfos <em>Diagnostic Infos</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.QueryFirstResponseImpl#getFilterResult <em>Filter Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryFirstResponseImpl extends MinimalEObjectImpl.Container implements QueryFirstResponse {
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
	 * The cached value of the '{@link #getQueryDataSets() <em>Query Data Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryDataSets()
	 * @generated
	 * @ordered
	 */
	protected ListOfQueryDataSet queryDataSets;

	/**
	 * This is true if the Query Data Sets containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean queryDataSetsESet;

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
	 * The cached value of the '{@link #getParsingResults() <em>Parsing Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParsingResults()
	 * @generated
	 * @ordered
	 */
	protected ListOfParsingResult parsingResults;

	/**
	 * This is true if the Parsing Results containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean parsingResultsESet;

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
	 * The cached value of the '{@link #getFilterResult() <em>Filter Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterResult()
	 * @generated
	 * @ordered
	 */
	protected ContentFilterResult filterResult;

	/**
	 * This is true if the Filter Result containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filterResultESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryFirstResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getQueryFirstResponse();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_RESPONSE__RESPONSE_HEADER, oldResponseHeader, newResponseHeader, !oldResponseHeaderESet);
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
				msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_RESPONSE__RESPONSE_HEADER, null, msgs);
			if (newResponseHeader != null)
				msgs = ((InternalEObject)newResponseHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicSetResponseHeader(newResponseHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_RESPONSE__RESPONSE_HEADER, newResponseHeader, newResponseHeader, !oldResponseHeaderESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_RESPONSE__RESPONSE_HEADER, oldResponseHeader, null, oldResponseHeaderESet);
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
			msgs = ((InternalEObject)responseHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_RESPONSE__RESPONSE_HEADER, null, msgs);
			msgs = basicUnsetResponseHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldResponseHeaderESet = responseHeaderESet;
			responseHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_RESPONSE__RESPONSE_HEADER, null, null, oldResponseHeaderESet));
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
	public ListOfQueryDataSet getQueryDataSets() {
		return queryDataSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryDataSets(ListOfQueryDataSet newQueryDataSets, NotificationChain msgs) {
		ListOfQueryDataSet oldQueryDataSets = queryDataSets;
		queryDataSets = newQueryDataSets;
		boolean oldQueryDataSetsESet = queryDataSetsESet;
		queryDataSetsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_RESPONSE__QUERY_DATA_SETS, oldQueryDataSets, newQueryDataSets, !oldQueryDataSetsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryDataSets(ListOfQueryDataSet newQueryDataSets) {
		if (newQueryDataSets != queryDataSets) {
			NotificationChain msgs = null;
			if (queryDataSets != null)
				msgs = ((InternalEObject)queryDataSets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_RESPONSE__QUERY_DATA_SETS, null, msgs);
			if (newQueryDataSets != null)
				msgs = ((InternalEObject)newQueryDataSets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_RESPONSE__QUERY_DATA_SETS, null, msgs);
			msgs = basicSetQueryDataSets(newQueryDataSets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldQueryDataSetsESet = queryDataSetsESet;
			queryDataSetsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_RESPONSE__QUERY_DATA_SETS, newQueryDataSets, newQueryDataSets, !oldQueryDataSetsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetQueryDataSets(NotificationChain msgs) {
		ListOfQueryDataSet oldQueryDataSets = queryDataSets;
		queryDataSets = null;
		boolean oldQueryDataSetsESet = queryDataSetsESet;
		queryDataSetsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_RESPONSE__QUERY_DATA_SETS, oldQueryDataSets, null, oldQueryDataSetsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQueryDataSets() {
		if (queryDataSets != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)queryDataSets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_RESPONSE__QUERY_DATA_SETS, null, msgs);
			msgs = basicUnsetQueryDataSets(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldQueryDataSetsESet = queryDataSetsESet;
			queryDataSetsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_RESPONSE__QUERY_DATA_SETS, null, null, oldQueryDataSetsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQueryDataSets() {
		return queryDataSetsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_RESPONSE__CONTINUATION_POINT, oldContinuationPoint, continuationPoint, !oldContinuationPointESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_RESPONSE__CONTINUATION_POINT, oldContinuationPoint, CONTINUATION_POINT_EDEFAULT, oldContinuationPointESet));
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
	public ListOfParsingResult getParsingResults() {
		return parsingResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParsingResults(ListOfParsingResult newParsingResults, NotificationChain msgs) {
		ListOfParsingResult oldParsingResults = parsingResults;
		parsingResults = newParsingResults;
		boolean oldParsingResultsESet = parsingResultsESet;
		parsingResultsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_RESPONSE__PARSING_RESULTS, oldParsingResults, newParsingResults, !oldParsingResultsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParsingResults(ListOfParsingResult newParsingResults) {
		if (newParsingResults != parsingResults) {
			NotificationChain msgs = null;
			if (parsingResults != null)
				msgs = ((InternalEObject)parsingResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_RESPONSE__PARSING_RESULTS, null, msgs);
			if (newParsingResults != null)
				msgs = ((InternalEObject)newParsingResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_RESPONSE__PARSING_RESULTS, null, msgs);
			msgs = basicSetParsingResults(newParsingResults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldParsingResultsESet = parsingResultsESet;
			parsingResultsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_RESPONSE__PARSING_RESULTS, newParsingResults, newParsingResults, !oldParsingResultsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetParsingResults(NotificationChain msgs) {
		ListOfParsingResult oldParsingResults = parsingResults;
		parsingResults = null;
		boolean oldParsingResultsESet = parsingResultsESet;
		parsingResultsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_RESPONSE__PARSING_RESULTS, oldParsingResults, null, oldParsingResultsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetParsingResults() {
		if (parsingResults != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)parsingResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_RESPONSE__PARSING_RESULTS, null, msgs);
			msgs = basicUnsetParsingResults(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldParsingResultsESet = parsingResultsESet;
			parsingResultsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_RESPONSE__PARSING_RESULTS, null, null, oldParsingResultsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParsingResults() {
		return parsingResultsESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_RESPONSE__DIAGNOSTIC_INFOS, oldDiagnosticInfos, newDiagnosticInfos, !oldDiagnosticInfosESet);
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
				msgs = ((InternalEObject)diagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_RESPONSE__DIAGNOSTIC_INFOS, null, msgs);
			if (newDiagnosticInfos != null)
				msgs = ((InternalEObject)newDiagnosticInfos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_RESPONSE__DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicSetDiagnosticInfos(newDiagnosticInfos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiagnosticInfosESet = diagnosticInfosESet;
			diagnosticInfosESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_RESPONSE__DIAGNOSTIC_INFOS, newDiagnosticInfos, newDiagnosticInfos, !oldDiagnosticInfosESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_RESPONSE__DIAGNOSTIC_INFOS, oldDiagnosticInfos, null, oldDiagnosticInfosESet);
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
			msgs = ((InternalEObject)diagnosticInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_RESPONSE__DIAGNOSTIC_INFOS, null, msgs);
			msgs = basicUnsetDiagnosticInfos(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDiagnosticInfosESet = diagnosticInfosESet;
			diagnosticInfosESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_RESPONSE__DIAGNOSTIC_INFOS, null, null, oldDiagnosticInfosESet));
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
	public ContentFilterResult getFilterResult() {
		return filterResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterResult(ContentFilterResult newFilterResult, NotificationChain msgs) {
		ContentFilterResult oldFilterResult = filterResult;
		filterResult = newFilterResult;
		boolean oldFilterResultESet = filterResultESet;
		filterResultESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_RESPONSE__FILTER_RESULT, oldFilterResult, newFilterResult, !oldFilterResultESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterResult(ContentFilterResult newFilterResult) {
		if (newFilterResult != filterResult) {
			NotificationChain msgs = null;
			if (filterResult != null)
				msgs = ((InternalEObject)filterResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_RESPONSE__FILTER_RESULT, null, msgs);
			if (newFilterResult != null)
				msgs = ((InternalEObject)newFilterResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_RESPONSE__FILTER_RESULT, null, msgs);
			msgs = basicSetFilterResult(newFilterResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFilterResultESet = filterResultESet;
			filterResultESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.QUERY_FIRST_RESPONSE__FILTER_RESULT, newFilterResult, newFilterResult, !oldFilterResultESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetFilterResult(NotificationChain msgs) {
		ContentFilterResult oldFilterResult = filterResult;
		filterResult = null;
		boolean oldFilterResultESet = filterResultESet;
		filterResultESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_RESPONSE__FILTER_RESULT, oldFilterResult, null, oldFilterResultESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilterResult() {
		if (filterResult != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)filterResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.QUERY_FIRST_RESPONSE__FILTER_RESULT, null, msgs);
			msgs = basicUnsetFilterResult(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFilterResultESet = filterResultESet;
			filterResultESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.QUERY_FIRST_RESPONSE__FILTER_RESULT, null, null, oldFilterResultESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilterResult() {
		return filterResultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.QUERY_FIRST_RESPONSE__RESPONSE_HEADER:
				return basicUnsetResponseHeader(msgs);
			case TypesPackage.QUERY_FIRST_RESPONSE__QUERY_DATA_SETS:
				return basicUnsetQueryDataSets(msgs);
			case TypesPackage.QUERY_FIRST_RESPONSE__PARSING_RESULTS:
				return basicUnsetParsingResults(msgs);
			case TypesPackage.QUERY_FIRST_RESPONSE__DIAGNOSTIC_INFOS:
				return basicUnsetDiagnosticInfos(msgs);
			case TypesPackage.QUERY_FIRST_RESPONSE__FILTER_RESULT:
				return basicUnsetFilterResult(msgs);
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
			case TypesPackage.QUERY_FIRST_RESPONSE__RESPONSE_HEADER:
				return getResponseHeader();
			case TypesPackage.QUERY_FIRST_RESPONSE__QUERY_DATA_SETS:
				return getQueryDataSets();
			case TypesPackage.QUERY_FIRST_RESPONSE__CONTINUATION_POINT:
				return getContinuationPoint();
			case TypesPackage.QUERY_FIRST_RESPONSE__PARSING_RESULTS:
				return getParsingResults();
			case TypesPackage.QUERY_FIRST_RESPONSE__DIAGNOSTIC_INFOS:
				return getDiagnosticInfos();
			case TypesPackage.QUERY_FIRST_RESPONSE__FILTER_RESULT:
				return getFilterResult();
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
			case TypesPackage.QUERY_FIRST_RESPONSE__RESPONSE_HEADER:
				setResponseHeader((ResponseHeader)newValue);
				return;
			case TypesPackage.QUERY_FIRST_RESPONSE__QUERY_DATA_SETS:
				setQueryDataSets((ListOfQueryDataSet)newValue);
				return;
			case TypesPackage.QUERY_FIRST_RESPONSE__CONTINUATION_POINT:
				setContinuationPoint((byte[])newValue);
				return;
			case TypesPackage.QUERY_FIRST_RESPONSE__PARSING_RESULTS:
				setParsingResults((ListOfParsingResult)newValue);
				return;
			case TypesPackage.QUERY_FIRST_RESPONSE__DIAGNOSTIC_INFOS:
				setDiagnosticInfos((ListOfDiagnosticInfo)newValue);
				return;
			case TypesPackage.QUERY_FIRST_RESPONSE__FILTER_RESULT:
				setFilterResult((ContentFilterResult)newValue);
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
			case TypesPackage.QUERY_FIRST_RESPONSE__RESPONSE_HEADER:
				unsetResponseHeader();
				return;
			case TypesPackage.QUERY_FIRST_RESPONSE__QUERY_DATA_SETS:
				unsetQueryDataSets();
				return;
			case TypesPackage.QUERY_FIRST_RESPONSE__CONTINUATION_POINT:
				unsetContinuationPoint();
				return;
			case TypesPackage.QUERY_FIRST_RESPONSE__PARSING_RESULTS:
				unsetParsingResults();
				return;
			case TypesPackage.QUERY_FIRST_RESPONSE__DIAGNOSTIC_INFOS:
				unsetDiagnosticInfos();
				return;
			case TypesPackage.QUERY_FIRST_RESPONSE__FILTER_RESULT:
				unsetFilterResult();
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
			case TypesPackage.QUERY_FIRST_RESPONSE__RESPONSE_HEADER:
				return isSetResponseHeader();
			case TypesPackage.QUERY_FIRST_RESPONSE__QUERY_DATA_SETS:
				return isSetQueryDataSets();
			case TypesPackage.QUERY_FIRST_RESPONSE__CONTINUATION_POINT:
				return isSetContinuationPoint();
			case TypesPackage.QUERY_FIRST_RESPONSE__PARSING_RESULTS:
				return isSetParsingResults();
			case TypesPackage.QUERY_FIRST_RESPONSE__DIAGNOSTIC_INFOS:
				return isSetDiagnosticInfos();
			case TypesPackage.QUERY_FIRST_RESPONSE__FILTER_RESULT:
				return isSetFilterResult();
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

} //QueryFirstResponseImpl
