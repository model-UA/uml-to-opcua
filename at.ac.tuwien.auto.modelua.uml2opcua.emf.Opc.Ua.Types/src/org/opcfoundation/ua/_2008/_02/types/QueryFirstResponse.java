/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query First Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getQueryDataSets <em>Query Data Sets</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getContinuationPoint <em>Continuation Point</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getParsingResults <em>Parsing Results</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getDiagnosticInfos <em>Diagnostic Infos</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getFilterResult <em>Filter Result</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryFirstResponse()
 * @model extendedMetaData="name='QueryFirstResponse' kind='elementOnly'"
 * @generated
 */
public interface QueryFirstResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryFirstResponse_ResponseHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ResponseHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseHeader getResponseHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #getResponseHeader()
	 * @generated
	 */
	void setResponseHeader(ResponseHeader value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	void unsetResponseHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getResponseHeader <em>Response Header</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Response Header</em>' containment reference is set.
	 * @see #unsetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	boolean isSetResponseHeader();

	/**
	 * Returns the value of the '<em><b>Query Data Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Data Sets</em>' containment reference.
	 * @see #isSetQueryDataSets()
	 * @see #unsetQueryDataSets()
	 * @see #setQueryDataSets(ListOfQueryDataSet)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryFirstResponse_QueryDataSets()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='QueryDataSets' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfQueryDataSet getQueryDataSets();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getQueryDataSets <em>Query Data Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Data Sets</em>' containment reference.
	 * @see #isSetQueryDataSets()
	 * @see #unsetQueryDataSets()
	 * @see #getQueryDataSets()
	 * @generated
	 */
	void setQueryDataSets(ListOfQueryDataSet value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getQueryDataSets <em>Query Data Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQueryDataSets()
	 * @see #getQueryDataSets()
	 * @see #setQueryDataSets(ListOfQueryDataSet)
	 * @generated
	 */
	void unsetQueryDataSets();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getQueryDataSets <em>Query Data Sets</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Query Data Sets</em>' containment reference is set.
	 * @see #unsetQueryDataSets()
	 * @see #getQueryDataSets()
	 * @see #setQueryDataSets(ListOfQueryDataSet)
	 * @generated
	 */
	boolean isSetQueryDataSets();

	/**
	 * Returns the value of the '<em><b>Continuation Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continuation Point</em>' attribute.
	 * @see #isSetContinuationPoint()
	 * @see #unsetContinuationPoint()
	 * @see #setContinuationPoint(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryFirstResponse_ContinuationPoint()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='ContinuationPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getContinuationPoint();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getContinuationPoint <em>Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuation Point</em>' attribute.
	 * @see #isSetContinuationPoint()
	 * @see #unsetContinuationPoint()
	 * @see #getContinuationPoint()
	 * @generated
	 */
	void setContinuationPoint(byte[] value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getContinuationPoint <em>Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContinuationPoint()
	 * @see #getContinuationPoint()
	 * @see #setContinuationPoint(byte[])
	 * @generated
	 */
	void unsetContinuationPoint();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getContinuationPoint <em>Continuation Point</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Continuation Point</em>' attribute is set.
	 * @see #unsetContinuationPoint()
	 * @see #getContinuationPoint()
	 * @see #setContinuationPoint(byte[])
	 * @generated
	 */
	boolean isSetContinuationPoint();

	/**
	 * Returns the value of the '<em><b>Parsing Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parsing Results</em>' containment reference.
	 * @see #isSetParsingResults()
	 * @see #unsetParsingResults()
	 * @see #setParsingResults(ListOfParsingResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryFirstResponse_ParsingResults()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ParsingResults' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfParsingResult getParsingResults();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getParsingResults <em>Parsing Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parsing Results</em>' containment reference.
	 * @see #isSetParsingResults()
	 * @see #unsetParsingResults()
	 * @see #getParsingResults()
	 * @generated
	 */
	void setParsingResults(ListOfParsingResult value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getParsingResults <em>Parsing Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParsingResults()
	 * @see #getParsingResults()
	 * @see #setParsingResults(ListOfParsingResult)
	 * @generated
	 */
	void unsetParsingResults();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getParsingResults <em>Parsing Results</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parsing Results</em>' containment reference is set.
	 * @see #unsetParsingResults()
	 * @see #getParsingResults()
	 * @see #setParsingResults(ListOfParsingResult)
	 * @generated
	 */
	boolean isSetParsingResults();

	/**
	 * Returns the value of the '<em><b>Diagnostic Infos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostic Infos</em>' containment reference.
	 * @see #isSetDiagnosticInfos()
	 * @see #unsetDiagnosticInfos()
	 * @see #setDiagnosticInfos(ListOfDiagnosticInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryFirstResponse_DiagnosticInfos()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DiagnosticInfos' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDiagnosticInfo getDiagnosticInfos();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getDiagnosticInfos <em>Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Infos</em>' containment reference.
	 * @see #isSetDiagnosticInfos()
	 * @see #unsetDiagnosticInfos()
	 * @see #getDiagnosticInfos()
	 * @generated
	 */
	void setDiagnosticInfos(ListOfDiagnosticInfo value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getDiagnosticInfos <em>Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiagnosticInfos()
	 * @see #getDiagnosticInfos()
	 * @see #setDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	void unsetDiagnosticInfos();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getDiagnosticInfos <em>Diagnostic Infos</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diagnostic Infos</em>' containment reference is set.
	 * @see #unsetDiagnosticInfos()
	 * @see #getDiagnosticInfos()
	 * @see #setDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	boolean isSetDiagnosticInfos();

	/**
	 * Returns the value of the '<em><b>Filter Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Result</em>' containment reference.
	 * @see #isSetFilterResult()
	 * @see #unsetFilterResult()
	 * @see #setFilterResult(ContentFilterResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryFirstResponse_FilterResult()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='FilterResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentFilterResult getFilterResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getFilterResult <em>Filter Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Result</em>' containment reference.
	 * @see #isSetFilterResult()
	 * @see #unsetFilterResult()
	 * @see #getFilterResult()
	 * @generated
	 */
	void setFilterResult(ContentFilterResult value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getFilterResult <em>Filter Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilterResult()
	 * @see #getFilterResult()
	 * @see #setFilterResult(ContentFilterResult)
	 * @generated
	 */
	void unsetFilterResult();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryFirstResponse#getFilterResult <em>Filter Result</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter Result</em>' containment reference is set.
	 * @see #unsetFilterResult()
	 * @see #getFilterResult()
	 * @see #setFilterResult(ContentFilterResult)
	 * @generated
	 */
	boolean isSetFilterResult();

} // QueryFirstResponse
