/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Browse Path Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfBrowsePathResult#getBrowsePathResult <em>Browse Path Result</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrowsePathResult()
 * @model extendedMetaData="name='ListOfBrowsePathResult' kind='elementOnly'"
 * @generated
 */
public interface ListOfBrowsePathResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Browse Path Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.BrowsePathResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Path Result</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrowsePathResult_BrowsePathResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BrowsePathResult' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BrowsePathResult> getBrowsePathResult();

} // ListOfBrowsePathResult
