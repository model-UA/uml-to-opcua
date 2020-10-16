/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datagram Writer Group Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DatagramWriterGroupTransportDataType#getMessageRepeatCount <em>Message Repeat Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DatagramWriterGroupTransportDataType#getMessageRepeatDelay <em>Message Repeat Delay</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDatagramWriterGroupTransportDataType()
 * @model extendedMetaData="name='DatagramWriterGroupTransportDataType' kind='elementOnly'"
 * @generated
 */
public interface DatagramWriterGroupTransportDataType extends WriterGroupTransportDataType {
	/**
	 * Returns the value of the '<em><b>Message Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Repeat Count</em>' attribute.
	 * @see #isSetMessageRepeatCount()
	 * @see #unsetMessageRepeatCount()
	 * @see #setMessageRepeatCount(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDatagramWriterGroupTransportDataType_MessageRepeatCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='element' name='MessageRepeatCount' namespace='##targetNamespace'"
	 * @generated
	 */
	short getMessageRepeatCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DatagramWriterGroupTransportDataType#getMessageRepeatCount <em>Message Repeat Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Repeat Count</em>' attribute.
	 * @see #isSetMessageRepeatCount()
	 * @see #unsetMessageRepeatCount()
	 * @see #getMessageRepeatCount()
	 * @generated
	 */
	void setMessageRepeatCount(short value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DatagramWriterGroupTransportDataType#getMessageRepeatCount <em>Message Repeat Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessageRepeatCount()
	 * @see #getMessageRepeatCount()
	 * @see #setMessageRepeatCount(short)
	 * @generated
	 */
	void unsetMessageRepeatCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DatagramWriterGroupTransportDataType#getMessageRepeatCount <em>Message Repeat Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Message Repeat Count</em>' attribute is set.
	 * @see #unsetMessageRepeatCount()
	 * @see #getMessageRepeatCount()
	 * @see #setMessageRepeatCount(short)
	 * @generated
	 */
	boolean isSetMessageRepeatCount();

	/**
	 * Returns the value of the '<em><b>Message Repeat Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Repeat Delay</em>' attribute.
	 * @see #isSetMessageRepeatDelay()
	 * @see #unsetMessageRepeatDelay()
	 * @see #setMessageRepeatDelay(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDatagramWriterGroupTransportDataType_MessageRepeatDelay()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='MessageRepeatDelay' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMessageRepeatDelay();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DatagramWriterGroupTransportDataType#getMessageRepeatDelay <em>Message Repeat Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Repeat Delay</em>' attribute.
	 * @see #isSetMessageRepeatDelay()
	 * @see #unsetMessageRepeatDelay()
	 * @see #getMessageRepeatDelay()
	 * @generated
	 */
	void setMessageRepeatDelay(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DatagramWriterGroupTransportDataType#getMessageRepeatDelay <em>Message Repeat Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessageRepeatDelay()
	 * @see #getMessageRepeatDelay()
	 * @see #setMessageRepeatDelay(double)
	 * @generated
	 */
	void unsetMessageRepeatDelay();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DatagramWriterGroupTransportDataType#getMessageRepeatDelay <em>Message Repeat Delay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Message Repeat Delay</em>' attribute is set.
	 * @see #unsetMessageRepeatDelay()
	 * @see #getMessageRepeatDelay()
	 * @see #setMessageRepeatDelay(double)
	 * @generated
	 */
	boolean isSetMessageRepeatDelay();

} // DatagramWriterGroupTransportDataType
