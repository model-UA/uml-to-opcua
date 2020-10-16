/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete At Time Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DeleteAtTimeDetails#getReqTimes <em>Req Times</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteAtTimeDetails()
 * @model extendedMetaData="name='DeleteAtTimeDetails' kind='elementOnly'"
 * @generated
 */
public interface DeleteAtTimeDetails extends HistoryUpdateDetails {
	/**
	 * Returns the value of the '<em><b>Req Times</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Times</em>' containment reference.
	 * @see #isSetReqTimes()
	 * @see #unsetReqTimes()
	 * @see #setReqTimes(ListOfDateTime)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteAtTimeDetails_ReqTimes()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ReqTimes' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDateTime getReqTimes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteAtTimeDetails#getReqTimes <em>Req Times</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Times</em>' containment reference.
	 * @see #isSetReqTimes()
	 * @see #unsetReqTimes()
	 * @see #getReqTimes()
	 * @generated
	 */
	void setReqTimes(ListOfDateTime value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteAtTimeDetails#getReqTimes <em>Req Times</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReqTimes()
	 * @see #getReqTimes()
	 * @see #setReqTimes(ListOfDateTime)
	 * @generated
	 */
	void unsetReqTimes();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteAtTimeDetails#getReqTimes <em>Req Times</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Req Times</em>' containment reference is set.
	 * @see #unsetReqTimes()
	 * @see #getReqTimes()
	 * @see #setReqTimes(ListOfDateTime)
	 * @generated
	 */
	boolean isSetReqTimes();

} // DeleteAtTimeDetails
