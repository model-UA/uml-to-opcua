/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Open File Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfOpenFileMode#getOpenFileMode <em>Open File Mode</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfOpenFileMode()
 * @model extendedMetaData="name='ListOfOpenFileMode' kind='elementOnly'"
 * @generated
 */
public interface ListOfOpenFileMode extends EObject {
	/**
	 * Returns the value of the '<em><b>Open File Mode</b></em>' attribute list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.OpenFileMode}.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.OpenFileMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open File Mode</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.OpenFileMode
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfOpenFileMode_OpenFileMode()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='OpenFileMode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OpenFileMode> getOpenFileMode();

} // ListOfOpenFileMode
