/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Method Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CallMethodResult#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CallMethodResult#getInputArgumentResults <em>Input Argument Results</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CallMethodResult#getInputArgumentDiagnosticInfos <em>Input Argument Diagnostic Infos</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CallMethodResult#getOutputArguments <em>Output Arguments</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCallMethodResult()
 * @model extendedMetaData="name='CallMethodResult' kind='elementOnly'"
 * @generated
 */
public interface CallMethodResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code</em>' containment reference.
	 * @see #setStatusCode(StatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCallMethodResult_StatusCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StatusCode' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusCode getStatusCode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodResult#getStatusCode <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' containment reference.
	 * @see #getStatusCode()
	 * @generated
	 */
	void setStatusCode(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Input Argument Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Argument Results</em>' containment reference.
	 * @see #isSetInputArgumentResults()
	 * @see #unsetInputArgumentResults()
	 * @see #setInputArgumentResults(ListOfStatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCallMethodResult_InputArgumentResults()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='InputArgumentResults' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfStatusCode getInputArgumentResults();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodResult#getInputArgumentResults <em>Input Argument Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Argument Results</em>' containment reference.
	 * @see #isSetInputArgumentResults()
	 * @see #unsetInputArgumentResults()
	 * @see #getInputArgumentResults()
	 * @generated
	 */
	void setInputArgumentResults(ListOfStatusCode value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodResult#getInputArgumentResults <em>Input Argument Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInputArgumentResults()
	 * @see #getInputArgumentResults()
	 * @see #setInputArgumentResults(ListOfStatusCode)
	 * @generated
	 */
	void unsetInputArgumentResults();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodResult#getInputArgumentResults <em>Input Argument Results</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Input Argument Results</em>' containment reference is set.
	 * @see #unsetInputArgumentResults()
	 * @see #getInputArgumentResults()
	 * @see #setInputArgumentResults(ListOfStatusCode)
	 * @generated
	 */
	boolean isSetInputArgumentResults();

	/**
	 * Returns the value of the '<em><b>Input Argument Diagnostic Infos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Argument Diagnostic Infos</em>' containment reference.
	 * @see #isSetInputArgumentDiagnosticInfos()
	 * @see #unsetInputArgumentDiagnosticInfos()
	 * @see #setInputArgumentDiagnosticInfos(ListOfDiagnosticInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCallMethodResult_InputArgumentDiagnosticInfos()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='InputArgumentDiagnosticInfos' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDiagnosticInfo getInputArgumentDiagnosticInfos();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodResult#getInputArgumentDiagnosticInfos <em>Input Argument Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Argument Diagnostic Infos</em>' containment reference.
	 * @see #isSetInputArgumentDiagnosticInfos()
	 * @see #unsetInputArgumentDiagnosticInfos()
	 * @see #getInputArgumentDiagnosticInfos()
	 * @generated
	 */
	void setInputArgumentDiagnosticInfos(ListOfDiagnosticInfo value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodResult#getInputArgumentDiagnosticInfos <em>Input Argument Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInputArgumentDiagnosticInfos()
	 * @see #getInputArgumentDiagnosticInfos()
	 * @see #setInputArgumentDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	void unsetInputArgumentDiagnosticInfos();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodResult#getInputArgumentDiagnosticInfos <em>Input Argument Diagnostic Infos</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Input Argument Diagnostic Infos</em>' containment reference is set.
	 * @see #unsetInputArgumentDiagnosticInfos()
	 * @see #getInputArgumentDiagnosticInfos()
	 * @see #setInputArgumentDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	boolean isSetInputArgumentDiagnosticInfos();

	/**
	 * Returns the value of the '<em><b>Output Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Arguments</em>' containment reference.
	 * @see #isSetOutputArguments()
	 * @see #unsetOutputArguments()
	 * @see #setOutputArguments(ListOfVariant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCallMethodResult_OutputArguments()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='OutputArguments' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfVariant getOutputArguments();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodResult#getOutputArguments <em>Output Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Arguments</em>' containment reference.
	 * @see #isSetOutputArguments()
	 * @see #unsetOutputArguments()
	 * @see #getOutputArguments()
	 * @generated
	 */
	void setOutputArguments(ListOfVariant value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodResult#getOutputArguments <em>Output Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOutputArguments()
	 * @see #getOutputArguments()
	 * @see #setOutputArguments(ListOfVariant)
	 * @generated
	 */
	void unsetOutputArguments();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CallMethodResult#getOutputArguments <em>Output Arguments</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Output Arguments</em>' containment reference is set.
	 * @see #unsetOutputArguments()
	 * @see #getOutputArguments()
	 * @see #setOutputArguments(ListOfVariant)
	 * @generated
	 */
	boolean isSetOutputArguments();

} // CallMethodResult
