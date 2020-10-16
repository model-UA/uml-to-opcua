/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Data Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UpdateDataDetails#getPerformInsertReplace <em>Perform Insert Replace</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UpdateDataDetails#getUpdateValues <em>Update Values</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUpdateDataDetails()
 * @model extendedMetaData="name='UpdateDataDetails' kind='elementOnly'"
 * @generated
 */
public interface UpdateDataDetails extends HistoryUpdateDetails {
	/**
	 * Returns the value of the '<em><b>Perform Insert Replace</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.PerformUpdateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perform Insert Replace</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.PerformUpdateType
	 * @see #isSetPerformInsertReplace()
	 * @see #unsetPerformInsertReplace()
	 * @see #setPerformInsertReplace(PerformUpdateType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUpdateDataDetails_PerformInsertReplace()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PerformInsertReplace' namespace='##targetNamespace'"
	 * @generated
	 */
	PerformUpdateType getPerformInsertReplace();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UpdateDataDetails#getPerformInsertReplace <em>Perform Insert Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perform Insert Replace</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.PerformUpdateType
	 * @see #isSetPerformInsertReplace()
	 * @see #unsetPerformInsertReplace()
	 * @see #getPerformInsertReplace()
	 * @generated
	 */
	void setPerformInsertReplace(PerformUpdateType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UpdateDataDetails#getPerformInsertReplace <em>Perform Insert Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPerformInsertReplace()
	 * @see #getPerformInsertReplace()
	 * @see #setPerformInsertReplace(PerformUpdateType)
	 * @generated
	 */
	void unsetPerformInsertReplace();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UpdateDataDetails#getPerformInsertReplace <em>Perform Insert Replace</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Perform Insert Replace</em>' attribute is set.
	 * @see #unsetPerformInsertReplace()
	 * @see #getPerformInsertReplace()
	 * @see #setPerformInsertReplace(PerformUpdateType)
	 * @generated
	 */
	boolean isSetPerformInsertReplace();

	/**
	 * Returns the value of the '<em><b>Update Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Values</em>' containment reference.
	 * @see #isSetUpdateValues()
	 * @see #unsetUpdateValues()
	 * @see #setUpdateValues(ListOfDataValue)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUpdateDataDetails_UpdateValues()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='UpdateValues' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDataValue getUpdateValues();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UpdateDataDetails#getUpdateValues <em>Update Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Values</em>' containment reference.
	 * @see #isSetUpdateValues()
	 * @see #unsetUpdateValues()
	 * @see #getUpdateValues()
	 * @generated
	 */
	void setUpdateValues(ListOfDataValue value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UpdateDataDetails#getUpdateValues <em>Update Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdateValues()
	 * @see #getUpdateValues()
	 * @see #setUpdateValues(ListOfDataValue)
	 * @generated
	 */
	void unsetUpdateValues();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UpdateDataDetails#getUpdateValues <em>Update Values</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Update Values</em>' containment reference is set.
	 * @see #unsetUpdateValues()
	 * @see #getUpdateValues()
	 * @see #setUpdateValues(ListOfDataValue)
	 * @generated
	 */
	boolean isSetUpdateValues();

} // UpdateDataDetails
