/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.TransferResult#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.TransferResult#getAvailableSequenceNumbers <em>Available Sequence Numbers</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTransferResult()
 * @model extendedMetaData="name='TransferResult' kind='elementOnly'"
 * @generated
 */
public interface TransferResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code</em>' containment reference.
	 * @see #setStatusCode(StatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTransferResult_StatusCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StatusCode' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusCode getStatusCode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.TransferResult#getStatusCode <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' containment reference.
	 * @see #getStatusCode()
	 * @generated
	 */
	void setStatusCode(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Available Sequence Numbers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Sequence Numbers</em>' containment reference.
	 * @see #isSetAvailableSequenceNumbers()
	 * @see #unsetAvailableSequenceNumbers()
	 * @see #setAvailableSequenceNumbers(ListOfUInt32)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTransferResult_AvailableSequenceNumbers()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AvailableSequenceNumbers' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUInt32 getAvailableSequenceNumbers();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.TransferResult#getAvailableSequenceNumbers <em>Available Sequence Numbers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Sequence Numbers</em>' containment reference.
	 * @see #isSetAvailableSequenceNumbers()
	 * @see #unsetAvailableSequenceNumbers()
	 * @see #getAvailableSequenceNumbers()
	 * @generated
	 */
	void setAvailableSequenceNumbers(ListOfUInt32 value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.TransferResult#getAvailableSequenceNumbers <em>Available Sequence Numbers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAvailableSequenceNumbers()
	 * @see #getAvailableSequenceNumbers()
	 * @see #setAvailableSequenceNumbers(ListOfUInt32)
	 * @generated
	 */
	void unsetAvailableSequenceNumbers();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.TransferResult#getAvailableSequenceNumbers <em>Available Sequence Numbers</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Available Sequence Numbers</em>' containment reference is set.
	 * @see #unsetAvailableSequenceNumbers()
	 * @see #getAvailableSequenceNumbers()
	 * @see #setAvailableSequenceNumbers(ListOfUInt32)
	 * @generated
	 */
	boolean isSetAvailableSequenceNumbers();

} // TransferResult
