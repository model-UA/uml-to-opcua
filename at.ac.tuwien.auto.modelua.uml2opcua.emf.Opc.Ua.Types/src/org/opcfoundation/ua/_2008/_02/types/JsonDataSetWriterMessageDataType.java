/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Data Set Writer Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.JsonDataSetWriterMessageDataType#getDataSetMessageContentMask <em>Data Set Message Content Mask</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getJsonDataSetWriterMessageDataType()
 * @model extendedMetaData="name='JsonDataSetWriterMessageDataType' kind='elementOnly'"
 * @generated
 */
public interface JsonDataSetWriterMessageDataType extends DataSetWriterMessageDataType {
	/**
	 * Returns the value of the '<em><b>Data Set Message Content Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Message Content Mask</em>' attribute.
	 * @see #isSetDataSetMessageContentMask()
	 * @see #unsetDataSetMessageContentMask()
	 * @see #setDataSetMessageContentMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getJsonDataSetWriterMessageDataType_DataSetMessageContentMask()
	 * @model unsettable="true" dataType="org.opcfoundation.ua._2008._02.types.JsonDataSetMessageContentMask"
	 *        extendedMetaData="kind='element' name='DataSetMessageContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getDataSetMessageContentMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.JsonDataSetWriterMessageDataType#getDataSetMessageContentMask <em>Data Set Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Message Content Mask</em>' attribute.
	 * @see #isSetDataSetMessageContentMask()
	 * @see #unsetDataSetMessageContentMask()
	 * @see #getDataSetMessageContentMask()
	 * @generated
	 */
	void setDataSetMessageContentMask(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.JsonDataSetWriterMessageDataType#getDataSetMessageContentMask <em>Data Set Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetMessageContentMask()
	 * @see #getDataSetMessageContentMask()
	 * @see #setDataSetMessageContentMask(long)
	 * @generated
	 */
	void unsetDataSetMessageContentMask();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.JsonDataSetWriterMessageDataType#getDataSetMessageContentMask <em>Data Set Message Content Mask</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Set Message Content Mask</em>' attribute is set.
	 * @see #unsetDataSetMessageContentMask()
	 * @see #getDataSetMessageContentMask()
	 * @see #setDataSetMessageContentMask(long)
	 * @generated
	 */
	boolean isSetDataSetMessageContentMask();

} // JsonDataSetWriterMessageDataType
