/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Filter Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EventFilterResult#getSelectClauseResults <em>Select Clause Results</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EventFilterResult#getSelectClauseDiagnosticInfos <em>Select Clause Diagnostic Infos</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EventFilterResult#getWhereClauseResult <em>Where Clause Result</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEventFilterResult()
 * @model extendedMetaData="name='EventFilterResult' kind='elementOnly'"
 * @generated
 */
public interface EventFilterResult extends MonitoringFilterResult {
	/**
	 * Returns the value of the '<em><b>Select Clause Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Clause Results</em>' containment reference.
	 * @see #isSetSelectClauseResults()
	 * @see #unsetSelectClauseResults()
	 * @see #setSelectClauseResults(ListOfStatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEventFilterResult_SelectClauseResults()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SelectClauseResults' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfStatusCode getSelectClauseResults();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFilterResult#getSelectClauseResults <em>Select Clause Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Clause Results</em>' containment reference.
	 * @see #isSetSelectClauseResults()
	 * @see #unsetSelectClauseResults()
	 * @see #getSelectClauseResults()
	 * @generated
	 */
	void setSelectClauseResults(ListOfStatusCode value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFilterResult#getSelectClauseResults <em>Select Clause Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSelectClauseResults()
	 * @see #getSelectClauseResults()
	 * @see #setSelectClauseResults(ListOfStatusCode)
	 * @generated
	 */
	void unsetSelectClauseResults();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFilterResult#getSelectClauseResults <em>Select Clause Results</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Select Clause Results</em>' containment reference is set.
	 * @see #unsetSelectClauseResults()
	 * @see #getSelectClauseResults()
	 * @see #setSelectClauseResults(ListOfStatusCode)
	 * @generated
	 */
	boolean isSetSelectClauseResults();

	/**
	 * Returns the value of the '<em><b>Select Clause Diagnostic Infos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Clause Diagnostic Infos</em>' containment reference.
	 * @see #isSetSelectClauseDiagnosticInfos()
	 * @see #unsetSelectClauseDiagnosticInfos()
	 * @see #setSelectClauseDiagnosticInfos(ListOfDiagnosticInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEventFilterResult_SelectClauseDiagnosticInfos()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SelectClauseDiagnosticInfos' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDiagnosticInfo getSelectClauseDiagnosticInfos();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFilterResult#getSelectClauseDiagnosticInfos <em>Select Clause Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Clause Diagnostic Infos</em>' containment reference.
	 * @see #isSetSelectClauseDiagnosticInfos()
	 * @see #unsetSelectClauseDiagnosticInfos()
	 * @see #getSelectClauseDiagnosticInfos()
	 * @generated
	 */
	void setSelectClauseDiagnosticInfos(ListOfDiagnosticInfo value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFilterResult#getSelectClauseDiagnosticInfos <em>Select Clause Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSelectClauseDiagnosticInfos()
	 * @see #getSelectClauseDiagnosticInfos()
	 * @see #setSelectClauseDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	void unsetSelectClauseDiagnosticInfos();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFilterResult#getSelectClauseDiagnosticInfos <em>Select Clause Diagnostic Infos</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Select Clause Diagnostic Infos</em>' containment reference is set.
	 * @see #unsetSelectClauseDiagnosticInfos()
	 * @see #getSelectClauseDiagnosticInfos()
	 * @see #setSelectClauseDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	boolean isSetSelectClauseDiagnosticInfos();

	/**
	 * Returns the value of the '<em><b>Where Clause Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where Clause Result</em>' containment reference.
	 * @see #isSetWhereClauseResult()
	 * @see #unsetWhereClauseResult()
	 * @see #setWhereClauseResult(ContentFilterResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEventFilterResult_WhereClauseResult()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='WhereClauseResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentFilterResult getWhereClauseResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFilterResult#getWhereClauseResult <em>Where Clause Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where Clause Result</em>' containment reference.
	 * @see #isSetWhereClauseResult()
	 * @see #unsetWhereClauseResult()
	 * @see #getWhereClauseResult()
	 * @generated
	 */
	void setWhereClauseResult(ContentFilterResult value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFilterResult#getWhereClauseResult <em>Where Clause Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWhereClauseResult()
	 * @see #getWhereClauseResult()
	 * @see #setWhereClauseResult(ContentFilterResult)
	 * @generated
	 */
	void unsetWhereClauseResult();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFilterResult#getWhereClauseResult <em>Where Clause Result</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Where Clause Result</em>' containment reference is set.
	 * @see #unsetWhereClauseResult()
	 * @see #getWhereClauseResult()
	 * @see #setWhereClauseResult(ContentFilterResult)
	 * @generated
	 */
	boolean isSetWhereClauseResult();

} // EventFilterResult
