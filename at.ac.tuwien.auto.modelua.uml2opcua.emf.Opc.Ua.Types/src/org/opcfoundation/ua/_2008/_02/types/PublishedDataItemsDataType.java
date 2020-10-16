/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Published Data Items Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishedDataItemsDataType#getPublishedData <em>Published Data</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedDataItemsDataType()
 * @model extendedMetaData="name='PublishedDataItemsDataType' kind='elementOnly'"
 * @generated
 */
public interface PublishedDataItemsDataType extends PublishedDataSetSourceDataType {
	/**
	 * Returns the value of the '<em><b>Published Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published Data</em>' containment reference.
	 * @see #isSetPublishedData()
	 * @see #unsetPublishedData()
	 * @see #setPublishedData(ListOfPublishedVariableDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedDataItemsDataType_PublishedData()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='PublishedData' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfPublishedVariableDataType getPublishedData();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedDataItemsDataType#getPublishedData <em>Published Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published Data</em>' containment reference.
	 * @see #isSetPublishedData()
	 * @see #unsetPublishedData()
	 * @see #getPublishedData()
	 * @generated
	 */
	void setPublishedData(ListOfPublishedVariableDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedDataItemsDataType#getPublishedData <em>Published Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPublishedData()
	 * @see #getPublishedData()
	 * @see #setPublishedData(ListOfPublishedVariableDataType)
	 * @generated
	 */
	void unsetPublishedData();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedDataItemsDataType#getPublishedData <em>Published Data</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Published Data</em>' containment reference is set.
	 * @see #unsetPublishedData()
	 * @see #getPublishedData()
	 * @see #setPublishedData(ListOfPublishedVariableDataType)
	 * @generated
	 */
	boolean isSetPublishedData();

} // PublishedDataItemsDataType
