/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Session Security Diagnostics Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfSessionSecurityDiagnosticsDataType#getSessionSecurityDiagnosticsDataType <em>Session Security Diagnostics Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSessionSecurityDiagnosticsDataType()
 * @model extendedMetaData="name='ListOfSessionSecurityDiagnosticsDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfSessionSecurityDiagnosticsDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Session Security Diagnostics Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Security Diagnostics Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSessionSecurityDiagnosticsDataType_SessionSecurityDiagnosticsDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SessionSecurityDiagnosticsDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SessionSecurityDiagnosticsDataType> getSessionSecurityDiagnosticsDataType();

} // ListOfSessionSecurityDiagnosticsDataType
