/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of History Read Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfHistoryReadResult#getHistoryReadResult <em>History Read Result</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfHistoryReadResult()
 * @model extendedMetaData="name='ListOfHistoryReadResult' kind='elementOnly'"
 * @generated
 */
public interface ListOfHistoryReadResult extends EObject {
	/**
	 * Returns the value of the '<em><b>History Read Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.HistoryReadResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Read Result</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfHistoryReadResult_HistoryReadResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HistoryReadResult' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HistoryReadResult> getHistoryReadResult();

} // ListOfHistoryReadResult
