/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Writer Group Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.JsonWriterGroupMessageDataType#getNetworkMessageContentMask <em>Network Message Content Mask</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getJsonWriterGroupMessageDataType()
 * @model extendedMetaData="name='JsonWriterGroupMessageDataType' kind='elementOnly'"
 * @generated
 */
public interface JsonWriterGroupMessageDataType extends WriterGroupMessageDataType {
	/**
	 * Returns the value of the '<em><b>Network Message Content Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Message Content Mask</em>' attribute.
	 * @see #isSetNetworkMessageContentMask()
	 * @see #unsetNetworkMessageContentMask()
	 * @see #setNetworkMessageContentMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getJsonWriterGroupMessageDataType_NetworkMessageContentMask()
	 * @model unsettable="true" dataType="org.opcfoundation.ua._2008._02.types.JsonNetworkMessageContentMask"
	 *        extendedMetaData="kind='element' name='NetworkMessageContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNetworkMessageContentMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.JsonWriterGroupMessageDataType#getNetworkMessageContentMask <em>Network Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Message Content Mask</em>' attribute.
	 * @see #isSetNetworkMessageContentMask()
	 * @see #unsetNetworkMessageContentMask()
	 * @see #getNetworkMessageContentMask()
	 * @generated
	 */
	void setNetworkMessageContentMask(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.JsonWriterGroupMessageDataType#getNetworkMessageContentMask <em>Network Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNetworkMessageContentMask()
	 * @see #getNetworkMessageContentMask()
	 * @see #setNetworkMessageContentMask(long)
	 * @generated
	 */
	void unsetNetworkMessageContentMask();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.JsonWriterGroupMessageDataType#getNetworkMessageContentMask <em>Network Message Content Mask</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Network Message Content Mask</em>' attribute is set.
	 * @see #unsetNetworkMessageContentMask()
	 * @see #getNetworkMessageContentMask()
	 * @see #setNetworkMessageContentMask(long)
	 * @generated
	 */
	boolean isSetNetworkMessageContentMask();

} // JsonWriterGroupMessageDataType
