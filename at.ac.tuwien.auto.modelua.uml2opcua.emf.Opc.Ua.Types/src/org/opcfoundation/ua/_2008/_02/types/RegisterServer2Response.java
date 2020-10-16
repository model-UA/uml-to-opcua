/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register Server2 Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RegisterServer2Response#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RegisterServer2Response#getConfigurationResults <em>Configuration Results</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RegisterServer2Response#getDiagnosticInfos <em>Diagnostic Infos</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisterServer2Response()
 * @model extendedMetaData="name='RegisterServer2Response' kind='elementOnly'"
 * @generated
 */
public interface RegisterServer2Response extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisterServer2Response_ResponseHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ResponseHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseHeader getResponseHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterServer2Response#getResponseHeader <em>Response Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterServer2Response#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	void unsetResponseHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterServer2Response#getResponseHeader <em>Response Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Configuration Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Results</em>' containment reference.
	 * @see #isSetConfigurationResults()
	 * @see #unsetConfigurationResults()
	 * @see #setConfigurationResults(ListOfStatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisterServer2Response_ConfigurationResults()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ConfigurationResults' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfStatusCode getConfigurationResults();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterServer2Response#getConfigurationResults <em>Configuration Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Results</em>' containment reference.
	 * @see #isSetConfigurationResults()
	 * @see #unsetConfigurationResults()
	 * @see #getConfigurationResults()
	 * @generated
	 */
	void setConfigurationResults(ListOfStatusCode value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterServer2Response#getConfigurationResults <em>Configuration Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfigurationResults()
	 * @see #getConfigurationResults()
	 * @see #setConfigurationResults(ListOfStatusCode)
	 * @generated
	 */
	void unsetConfigurationResults();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterServer2Response#getConfigurationResults <em>Configuration Results</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Configuration Results</em>' containment reference is set.
	 * @see #unsetConfigurationResults()
	 * @see #getConfigurationResults()
	 * @see #setConfigurationResults(ListOfStatusCode)
	 * @generated
	 */
	boolean isSetConfigurationResults();

	/**
	 * Returns the value of the '<em><b>Diagnostic Infos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostic Infos</em>' containment reference.
	 * @see #isSetDiagnosticInfos()
	 * @see #unsetDiagnosticInfos()
	 * @see #setDiagnosticInfos(ListOfDiagnosticInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisterServer2Response_DiagnosticInfos()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DiagnosticInfos' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDiagnosticInfo getDiagnosticInfos();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterServer2Response#getDiagnosticInfos <em>Diagnostic Infos</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterServer2Response#getDiagnosticInfos <em>Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiagnosticInfos()
	 * @see #getDiagnosticInfos()
	 * @see #setDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	void unsetDiagnosticInfos();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterServer2Response#getDiagnosticInfos <em>Diagnostic Infos</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diagnostic Infos</em>' containment reference is set.
	 * @see #unsetDiagnosticInfos()
	 * @see #getDiagnosticInfos()
	 * @see #setDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	boolean isSetDiagnosticInfos();

} // RegisterServer2Response
