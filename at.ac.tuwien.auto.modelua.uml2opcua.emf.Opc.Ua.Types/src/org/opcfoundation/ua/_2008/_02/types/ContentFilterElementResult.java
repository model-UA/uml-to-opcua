/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Filter Element Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ContentFilterElementResult#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ContentFilterElementResult#getOperandStatusCodes <em>Operand Status Codes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ContentFilterElementResult#getOperandDiagnosticInfos <em>Operand Diagnostic Infos</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getContentFilterElementResult()
 * @model extendedMetaData="name='ContentFilterElementResult' kind='elementOnly'"
 * @generated
 */
public interface ContentFilterElementResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code</em>' containment reference.
	 * @see #setStatusCode(StatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getContentFilterElementResult_StatusCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StatusCode' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusCode getStatusCode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterElementResult#getStatusCode <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' containment reference.
	 * @see #getStatusCode()
	 * @generated
	 */
	void setStatusCode(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Operand Status Codes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand Status Codes</em>' containment reference.
	 * @see #isSetOperandStatusCodes()
	 * @see #unsetOperandStatusCodes()
	 * @see #setOperandStatusCodes(ListOfStatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getContentFilterElementResult_OperandStatusCodes()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='OperandStatusCodes' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfStatusCode getOperandStatusCodes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterElementResult#getOperandStatusCodes <em>Operand Status Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand Status Codes</em>' containment reference.
	 * @see #isSetOperandStatusCodes()
	 * @see #unsetOperandStatusCodes()
	 * @see #getOperandStatusCodes()
	 * @generated
	 */
	void setOperandStatusCodes(ListOfStatusCode value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterElementResult#getOperandStatusCodes <em>Operand Status Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperandStatusCodes()
	 * @see #getOperandStatusCodes()
	 * @see #setOperandStatusCodes(ListOfStatusCode)
	 * @generated
	 */
	void unsetOperandStatusCodes();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterElementResult#getOperandStatusCodes <em>Operand Status Codes</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operand Status Codes</em>' containment reference is set.
	 * @see #unsetOperandStatusCodes()
	 * @see #getOperandStatusCodes()
	 * @see #setOperandStatusCodes(ListOfStatusCode)
	 * @generated
	 */
	boolean isSetOperandStatusCodes();

	/**
	 * Returns the value of the '<em><b>Operand Diagnostic Infos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand Diagnostic Infos</em>' containment reference.
	 * @see #isSetOperandDiagnosticInfos()
	 * @see #unsetOperandDiagnosticInfos()
	 * @see #setOperandDiagnosticInfos(ListOfDiagnosticInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getContentFilterElementResult_OperandDiagnosticInfos()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='OperandDiagnosticInfos' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDiagnosticInfo getOperandDiagnosticInfos();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterElementResult#getOperandDiagnosticInfos <em>Operand Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand Diagnostic Infos</em>' containment reference.
	 * @see #isSetOperandDiagnosticInfos()
	 * @see #unsetOperandDiagnosticInfos()
	 * @see #getOperandDiagnosticInfos()
	 * @generated
	 */
	void setOperandDiagnosticInfos(ListOfDiagnosticInfo value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterElementResult#getOperandDiagnosticInfos <em>Operand Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperandDiagnosticInfos()
	 * @see #getOperandDiagnosticInfos()
	 * @see #setOperandDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	void unsetOperandDiagnosticInfos();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilterElementResult#getOperandDiagnosticInfos <em>Operand Diagnostic Infos</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operand Diagnostic Infos</em>' containment reference is set.
	 * @see #unsetOperandDiagnosticInfos()
	 * @see #getOperandDiagnosticInfos()
	 * @see #setOperandDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	boolean isSetOperandDiagnosticInfos();

} // ContentFilterElementResult
