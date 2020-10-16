/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Change Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.StatusChangeNotification#getStatus <em>Status</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.StatusChangeNotification#getDiagnosticInfo <em>Diagnostic Info</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getStatusChangeNotification()
 * @model extendedMetaData="name='StatusChangeNotification' kind='elementOnly'"
 * @generated
 */
public interface StatusChangeNotification extends NotificationData {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(StatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getStatusChangeNotification_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Status' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusCode getStatus();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.StatusChangeNotification#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Diagnostic Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostic Info</em>' containment reference.
	 * @see #isSetDiagnosticInfo()
	 * @see #unsetDiagnosticInfo()
	 * @see #setDiagnosticInfo(DiagnosticInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getStatusChangeNotification_DiagnosticInfo()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DiagnosticInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticInfo getDiagnosticInfo();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.StatusChangeNotification#getDiagnosticInfo <em>Diagnostic Info</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.StatusChangeNotification#getDiagnosticInfo <em>Diagnostic Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiagnosticInfo()
	 * @see #getDiagnosticInfo()
	 * @see #setDiagnosticInfo(DiagnosticInfo)
	 * @generated
	 */
	void unsetDiagnosticInfo();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.StatusChangeNotification#getDiagnosticInfo <em>Diagnostic Info</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diagnostic Info</em>' containment reference is set.
	 * @see #unsetDiagnosticInfo()
	 * @see #getDiagnosticInfo()
	 * @see #setDiagnosticInfo(DiagnosticInfo)
	 * @generated
	 */
	boolean isSetDiagnosticInfo();

} // StatusChangeNotification
