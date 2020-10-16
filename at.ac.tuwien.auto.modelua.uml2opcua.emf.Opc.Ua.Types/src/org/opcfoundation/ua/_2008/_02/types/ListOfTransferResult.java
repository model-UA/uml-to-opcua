/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Transfer Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfTransferResult#getTransferResult <em>Transfer Result</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfTransferResult()
 * @model extendedMetaData="name='ListOfTransferResult' kind='elementOnly'"
 * @generated
 */
public interface ListOfTransferResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Transfer Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.TransferResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Result</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfTransferResult_TransferResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TransferResult' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TransferResult> getTransferResult();

} // ListOfTransferResult
