/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Triggering Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getAddResults <em>Add Results</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getAddDiagnosticInfos <em>Add Diagnostic Infos</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getRemoveResults <em>Remove Results</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getRemoveDiagnosticInfos <em>Remove Diagnostic Infos</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetTriggeringResponse()
 * @model extendedMetaData="name='SetTriggeringResponse' kind='elementOnly'"
 * @generated
 */
public interface SetTriggeringResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetTriggeringResponse_ResponseHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ResponseHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseHeader getResponseHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getResponseHeader <em>Response Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	void unsetResponseHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getResponseHeader <em>Response Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Add Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Results</em>' containment reference.
	 * @see #isSetAddResults()
	 * @see #unsetAddResults()
	 * @see #setAddResults(ListOfStatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetTriggeringResponse_AddResults()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AddResults' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfStatusCode getAddResults();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getAddResults <em>Add Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Results</em>' containment reference.
	 * @see #isSetAddResults()
	 * @see #unsetAddResults()
	 * @see #getAddResults()
	 * @generated
	 */
	void setAddResults(ListOfStatusCode value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getAddResults <em>Add Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddResults()
	 * @see #getAddResults()
	 * @see #setAddResults(ListOfStatusCode)
	 * @generated
	 */
	void unsetAddResults();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getAddResults <em>Add Results</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Add Results</em>' containment reference is set.
	 * @see #unsetAddResults()
	 * @see #getAddResults()
	 * @see #setAddResults(ListOfStatusCode)
	 * @generated
	 */
	boolean isSetAddResults();

	/**
	 * Returns the value of the '<em><b>Add Diagnostic Infos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Diagnostic Infos</em>' containment reference.
	 * @see #isSetAddDiagnosticInfos()
	 * @see #unsetAddDiagnosticInfos()
	 * @see #setAddDiagnosticInfos(ListOfDiagnosticInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetTriggeringResponse_AddDiagnosticInfos()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AddDiagnosticInfos' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDiagnosticInfo getAddDiagnosticInfos();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getAddDiagnosticInfos <em>Add Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Diagnostic Infos</em>' containment reference.
	 * @see #isSetAddDiagnosticInfos()
	 * @see #unsetAddDiagnosticInfos()
	 * @see #getAddDiagnosticInfos()
	 * @generated
	 */
	void setAddDiagnosticInfos(ListOfDiagnosticInfo value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getAddDiagnosticInfos <em>Add Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddDiagnosticInfos()
	 * @see #getAddDiagnosticInfos()
	 * @see #setAddDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	void unsetAddDiagnosticInfos();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getAddDiagnosticInfos <em>Add Diagnostic Infos</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Add Diagnostic Infos</em>' containment reference is set.
	 * @see #unsetAddDiagnosticInfos()
	 * @see #getAddDiagnosticInfos()
	 * @see #setAddDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	boolean isSetAddDiagnosticInfos();

	/**
	 * Returns the value of the '<em><b>Remove Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Results</em>' containment reference.
	 * @see #isSetRemoveResults()
	 * @see #unsetRemoveResults()
	 * @see #setRemoveResults(ListOfStatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetTriggeringResponse_RemoveResults()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RemoveResults' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfStatusCode getRemoveResults();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getRemoveResults <em>Remove Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Results</em>' containment reference.
	 * @see #isSetRemoveResults()
	 * @see #unsetRemoveResults()
	 * @see #getRemoveResults()
	 * @generated
	 */
	void setRemoveResults(ListOfStatusCode value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getRemoveResults <em>Remove Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemoveResults()
	 * @see #getRemoveResults()
	 * @see #setRemoveResults(ListOfStatusCode)
	 * @generated
	 */
	void unsetRemoveResults();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getRemoveResults <em>Remove Results</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remove Results</em>' containment reference is set.
	 * @see #unsetRemoveResults()
	 * @see #getRemoveResults()
	 * @see #setRemoveResults(ListOfStatusCode)
	 * @generated
	 */
	boolean isSetRemoveResults();

	/**
	 * Returns the value of the '<em><b>Remove Diagnostic Infos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Diagnostic Infos</em>' containment reference.
	 * @see #isSetRemoveDiagnosticInfos()
	 * @see #unsetRemoveDiagnosticInfos()
	 * @see #setRemoveDiagnosticInfos(ListOfDiagnosticInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetTriggeringResponse_RemoveDiagnosticInfos()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RemoveDiagnosticInfos' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDiagnosticInfo getRemoveDiagnosticInfos();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getRemoveDiagnosticInfos <em>Remove Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Diagnostic Infos</em>' containment reference.
	 * @see #isSetRemoveDiagnosticInfos()
	 * @see #unsetRemoveDiagnosticInfos()
	 * @see #getRemoveDiagnosticInfos()
	 * @generated
	 */
	void setRemoveDiagnosticInfos(ListOfDiagnosticInfo value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getRemoveDiagnosticInfos <em>Remove Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemoveDiagnosticInfos()
	 * @see #getRemoveDiagnosticInfos()
	 * @see #setRemoveDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	void unsetRemoveDiagnosticInfos();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringResponse#getRemoveDiagnosticInfos <em>Remove Diagnostic Infos</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remove Diagnostic Infos</em>' containment reference is set.
	 * @see #unsetRemoveDiagnosticInfos()
	 * @see #getRemoveDiagnosticInfos()
	 * @see #setRemoveDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	boolean isSetRemoveDiagnosticInfos();

} // SetTriggeringResponse
