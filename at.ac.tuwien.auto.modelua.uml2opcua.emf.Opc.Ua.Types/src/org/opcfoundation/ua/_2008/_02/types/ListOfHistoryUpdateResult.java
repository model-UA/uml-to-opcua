/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of History Update Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfHistoryUpdateResult#getHistoryUpdateResult <em>History Update Result</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfHistoryUpdateResult()
 * @model extendedMetaData="name='ListOfHistoryUpdateResult' kind='elementOnly'"
 * @generated
 */
public interface ListOfHistoryUpdateResult extends EObject {
	/**
	 * Returns the value of the '<em><b>History Update Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.HistoryUpdateResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Update Result</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfHistoryUpdateResult_HistoryUpdateResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HistoryUpdateResult' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HistoryUpdateResult> getHistoryUpdateResult();

} // ListOfHistoryUpdateResult
