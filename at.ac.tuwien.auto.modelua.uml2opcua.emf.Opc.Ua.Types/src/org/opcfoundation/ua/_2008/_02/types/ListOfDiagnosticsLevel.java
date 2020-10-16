/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Diagnostics Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfDiagnosticsLevel#getDiagnosticsLevel <em>Diagnostics Level</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDiagnosticsLevel()
 * @model extendedMetaData="name='ListOfDiagnosticsLevel' kind='elementOnly'"
 * @generated
 */
public interface ListOfDiagnosticsLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagnostics Level</b></em>' attribute list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.DiagnosticsLevel}.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.DiagnosticsLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostics Level</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.DiagnosticsLevel
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDiagnosticsLevel_DiagnosticsLevel()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='DiagnosticsLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DiagnosticsLevel> getDiagnosticsLevel();

} // ListOfDiagnosticsLevel
