/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parsing Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ParsingResult#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ParsingResult#getDataStatusCodes <em>Data Status Codes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ParsingResult#getDataDiagnosticInfos <em>Data Diagnostic Infos</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getParsingResult()
 * @model extendedMetaData="name='ParsingResult' kind='elementOnly'"
 * @generated
 */
public interface ParsingResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code</em>' containment reference.
	 * @see #setStatusCode(StatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getParsingResult_StatusCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StatusCode' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusCode getStatusCode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ParsingResult#getStatusCode <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' containment reference.
	 * @see #getStatusCode()
	 * @generated
	 */
	void setStatusCode(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Data Status Codes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Status Codes</em>' containment reference.
	 * @see #isSetDataStatusCodes()
	 * @see #unsetDataStatusCodes()
	 * @see #setDataStatusCodes(ListOfStatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getParsingResult_DataStatusCodes()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataStatusCodes' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfStatusCode getDataStatusCodes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ParsingResult#getDataStatusCodes <em>Data Status Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Status Codes</em>' containment reference.
	 * @see #isSetDataStatusCodes()
	 * @see #unsetDataStatusCodes()
	 * @see #getDataStatusCodes()
	 * @generated
	 */
	void setDataStatusCodes(ListOfStatusCode value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ParsingResult#getDataStatusCodes <em>Data Status Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataStatusCodes()
	 * @see #getDataStatusCodes()
	 * @see #setDataStatusCodes(ListOfStatusCode)
	 * @generated
	 */
	void unsetDataStatusCodes();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ParsingResult#getDataStatusCodes <em>Data Status Codes</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Status Codes</em>' containment reference is set.
	 * @see #unsetDataStatusCodes()
	 * @see #getDataStatusCodes()
	 * @see #setDataStatusCodes(ListOfStatusCode)
	 * @generated
	 */
	boolean isSetDataStatusCodes();

	/**
	 * Returns the value of the '<em><b>Data Diagnostic Infos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Diagnostic Infos</em>' containment reference.
	 * @see #isSetDataDiagnosticInfos()
	 * @see #unsetDataDiagnosticInfos()
	 * @see #setDataDiagnosticInfos(ListOfDiagnosticInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getParsingResult_DataDiagnosticInfos()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataDiagnosticInfos' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDiagnosticInfo getDataDiagnosticInfos();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ParsingResult#getDataDiagnosticInfos <em>Data Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Diagnostic Infos</em>' containment reference.
	 * @see #isSetDataDiagnosticInfos()
	 * @see #unsetDataDiagnosticInfos()
	 * @see #getDataDiagnosticInfos()
	 * @generated
	 */
	void setDataDiagnosticInfos(ListOfDiagnosticInfo value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ParsingResult#getDataDiagnosticInfos <em>Data Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataDiagnosticInfos()
	 * @see #getDataDiagnosticInfos()
	 * @see #setDataDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	void unsetDataDiagnosticInfos();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ParsingResult#getDataDiagnosticInfos <em>Data Diagnostic Infos</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Diagnostic Infos</em>' containment reference is set.
	 * @see #unsetDataDiagnosticInfos()
	 * @see #getDataDiagnosticInfos()
	 * @see #setDataDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	boolean isSetDataDiagnosticInfos();

} // ParsingResult
