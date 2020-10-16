/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Session Diagnostics Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfSessionDiagnosticsDataType#getSessionDiagnosticsDataType <em>Session Diagnostics Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSessionDiagnosticsDataType()
 * @model extendedMetaData="name='ListOfSessionDiagnosticsDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfSessionDiagnosticsDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Session Diagnostics Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Diagnostics Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSessionDiagnosticsDataType_SessionDiagnosticsDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SessionDiagnosticsDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SessionDiagnosticsDataType> getSessionDiagnosticsDataType();

} // ListOfSessionDiagnosticsDataType
