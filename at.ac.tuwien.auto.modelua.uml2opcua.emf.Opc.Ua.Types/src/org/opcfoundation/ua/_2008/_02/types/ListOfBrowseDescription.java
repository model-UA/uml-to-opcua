/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Browse Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfBrowseDescription#getBrowseDescription <em>Browse Description</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrowseDescription()
 * @model extendedMetaData="name='ListOfBrowseDescription' kind='elementOnly'"
 * @generated
 */
public interface ListOfBrowseDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Browse Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.BrowseDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Description</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrowseDescription_BrowseDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BrowseDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BrowseDescription> getBrowseDescription();

} // ListOfBrowseDescription
