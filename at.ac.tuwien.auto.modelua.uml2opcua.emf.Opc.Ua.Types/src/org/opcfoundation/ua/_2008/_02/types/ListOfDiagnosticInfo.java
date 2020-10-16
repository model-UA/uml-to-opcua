/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Diagnostic Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfDiagnosticInfo#getDiagnosticInfo <em>Diagnostic Info</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDiagnosticInfo()
 * @model extendedMetaData="name='ListOfDiagnosticInfo' kind='elementOnly'"
 * @generated
 */
public interface ListOfDiagnosticInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagnostic Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostic Info</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDiagnosticInfo_DiagnosticInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DiagnosticInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DiagnosticInfo> getDiagnosticInfo();

} // ListOfDiagnosticInfo
