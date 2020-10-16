/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.StatusResult#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.StatusResult#getDiagnosticInfo <em>Diagnostic Info</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getStatusResult()
 * @model extendedMetaData="name='StatusResult' kind='elementOnly'"
 * @generated
 */
public interface StatusResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code</em>' containment reference.
	 * @see #setStatusCode(StatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getStatusResult_StatusCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StatusCode' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusCode getStatusCode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.StatusResult#getStatusCode <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' containment reference.
	 * @see #getStatusCode()
	 * @generated
	 */
	void setStatusCode(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Diagnostic Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostic Info</em>' containment reference.
	 * @see #isSetDiagnosticInfo()
	 * @see #unsetDiagnosticInfo()
	 * @see #setDiagnosticInfo(DiagnosticInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getStatusResult_DiagnosticInfo()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DiagnosticInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticInfo getDiagnosticInfo();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.StatusResult#getDiagnosticInfo <em>Diagnostic Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Info</em>' containment reference.
	 * @see #isSetDiagnosticInfo()
	 * @see #unsetDiagnosticInfo()
	 * @see #getDiagnosticInfo()
	 * @generated
	 */
	void setDiagnosticInfo(DiagnosticInfo value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.StatusResult#getDiagnosticInfo <em>Diagnostic Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiagnosticInfo()
	 * @see #getDiagnosticInfo()
	 * @see #setDiagnosticInfo(DiagnosticInfo)
	 * @generated
	 */
	void unsetDiagnosticInfo();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.StatusResult#getDiagnosticInfo <em>Diagnostic Info</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diagnostic Info</em>' containment reference is set.
	 * @see #unsetDiagnosticInfo()
	 * @see #getDiagnosticInfo()
	 * @see #setDiagnosticInfo(DiagnosticInfo)
	 * @generated
	 */
	boolean isSetDiagnosticInfo();

} // StatusResult
