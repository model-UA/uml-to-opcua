/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Browse Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfBrowseResult#getBrowseResult <em>Browse Result</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrowseResult()
 * @model extendedMetaData="name='ListOfBrowseResult' kind='elementOnly'"
 * @generated
 */
public interface ListOfBrowseResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Browse Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.BrowseResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Result</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrowseResult_BrowseResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BrowseResult' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BrowseResult> getBrowseResult();

} // ListOfBrowseResult
