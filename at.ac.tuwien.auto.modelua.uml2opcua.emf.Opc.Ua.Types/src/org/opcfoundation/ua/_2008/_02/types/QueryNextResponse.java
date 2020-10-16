/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Next Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryNextResponse#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryNextResponse#getQueryDataSets <em>Query Data Sets</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryNextResponse#getRevisedContinuationPoint <em>Revised Continuation Point</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryNextResponse()
 * @model extendedMetaData="name='QueryNextResponse' kind='elementOnly'"
 * @generated
 */
public interface QueryNextResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryNextResponse_ResponseHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ResponseHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseHeader getResponseHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryNextResponse#getResponseHeader <em>Response Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryNextResponse#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	void unsetResponseHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryNextResponse#getResponseHeader <em>Response Header</em>}' containment reference is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryNextResponse_QueryDataSets()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='QueryDataSets' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfQueryDataSet getQueryDataSets();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryNextResponse#getQueryDataSets <em>Query Data Sets</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryNextResponse#getQueryDataSets <em>Query Data Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQueryDataSets()
	 * @see #getQueryDataSets()
	 * @see #setQueryDataSets(ListOfQueryDataSet)
	 * @generated
	 */
	void unsetQueryDataSets();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryNextResponse#getQueryDataSets <em>Query Data Sets</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Revised Continuation Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revised Continuation Point</em>' attribute.
	 * @see #isSetRevisedContinuationPoint()
	 * @see #unsetRevisedContinuationPoint()
	 * @see #setRevisedContinuationPoint(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryNextResponse_RevisedContinuationPoint()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='RevisedContinuationPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getRevisedContinuationPoint();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryNextResponse#getRevisedContinuationPoint <em>Revised Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revised Continuation Point</em>' attribute.
	 * @see #isSetRevisedContinuationPoint()
	 * @see #unsetRevisedContinuationPoint()
	 * @see #getRevisedContinuationPoint()
	 * @generated
	 */
	void setRevisedContinuationPoint(byte[] value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryNextResponse#getRevisedContinuationPoint <em>Revised Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisedContinuationPoint()
	 * @see #getRevisedContinuationPoint()
	 * @see #setRevisedContinuationPoint(byte[])
	 * @generated
	 */
	void unsetRevisedContinuationPoint();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryNextResponse#getRevisedContinuationPoint <em>Revised Continuation Point</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revised Continuation Point</em>' attribute is set.
	 * @see #unsetRevisedContinuationPoint()
	 * @see #getRevisedContinuationPoint()
	 * @see #setRevisedContinuationPoint(byte[])
	 * @generated
	 */
	boolean isSetRevisedContinuationPoint();

} // QueryNextResponse
