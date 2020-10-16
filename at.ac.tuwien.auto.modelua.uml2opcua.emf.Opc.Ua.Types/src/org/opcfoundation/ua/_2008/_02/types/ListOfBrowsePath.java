/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Browse Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfBrowsePath#getBrowsePath <em>Browse Path</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrowsePath()
 * @model extendedMetaData="name='ListOfBrowsePath' kind='elementOnly'"
 * @generated
 */
public interface ListOfBrowsePath extends EObject {
	/**
	 * Returns the value of the '<em><b>Browse Path</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.BrowsePath}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Path</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrowsePath_BrowsePath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BrowsePath' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BrowsePath> getBrowsePath();

} // ListOfBrowsePath
