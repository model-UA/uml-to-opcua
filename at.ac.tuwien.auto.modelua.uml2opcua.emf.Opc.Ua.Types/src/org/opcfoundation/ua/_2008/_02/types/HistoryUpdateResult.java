/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Update Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateResult#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateResult#getOperationResults <em>Operation Results</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateResult#getDiagnosticInfos <em>Diagnostic Infos</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryUpdateResult()
 * @model extendedMetaData="name='HistoryUpdateResult' kind='elementOnly'"
 * @generated
 */
public interface HistoryUpdateResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code</em>' containment reference.
	 * @see #setStatusCode(StatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryUpdateResult_StatusCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StatusCode' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusCode getStatusCode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateResult#getStatusCode <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' containment reference.
	 * @see #getStatusCode()
	 * @generated
	 */
	void setStatusCode(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Operation Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Results</em>' containment reference.
	 * @see #isSetOperationResults()
	 * @see #unsetOperationResults()
	 * @see #setOperationResults(ListOfStatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryUpdateResult_OperationResults()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='OperationResults' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfStatusCode getOperationResults();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateResult#getOperationResults <em>Operation Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Results</em>' containment reference.
	 * @see #isSetOperationResults()
	 * @see #unsetOperationResults()
	 * @see #getOperationResults()
	 * @generated
	 */
	void setOperationResults(ListOfStatusCode value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateResult#getOperationResults <em>Operation Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperationResults()
	 * @see #getOperationResults()
	 * @see #setOperationResults(ListOfStatusCode)
	 * @generated
	 */
	void unsetOperationResults();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateResult#getOperationResults <em>Operation Results</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operation Results</em>' containment reference is set.
	 * @see #unsetOperationResults()
	 * @see #getOperationResults()
	 * @see #setOperationResults(ListOfStatusCode)
	 * @generated
	 */
	boolean isSetOperationResults();

	/**
	 * Returns the value of the '<em><b>Diagnostic Infos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostic Infos</em>' containment reference.
	 * @see #isSetDiagnosticInfos()
	 * @see #unsetDiagnosticInfos()
	 * @see #setDiagnosticInfos(ListOfDiagnosticInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryUpdateResult_DiagnosticInfos()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DiagnosticInfos' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDiagnosticInfo getDiagnosticInfos();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateResult#getDiagnosticInfos <em>Diagnostic Infos</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateResult#getDiagnosticInfos <em>Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiagnosticInfos()
	 * @see #getDiagnosticInfos()
	 * @see #setDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	void unsetDiagnosticInfos();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryUpdateResult#getDiagnosticInfos <em>Diagnostic Infos</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diagnostic Infos</em>' containment reference is set.
	 * @see #unsetDiagnosticInfos()
	 * @see #getDiagnosticInfos()
	 * @see #setDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	boolean isSetDiagnosticInfos();

} // HistoryUpdateResult
