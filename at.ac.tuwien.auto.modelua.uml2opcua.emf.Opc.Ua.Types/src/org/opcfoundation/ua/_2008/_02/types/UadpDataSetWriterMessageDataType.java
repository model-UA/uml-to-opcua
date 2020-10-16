/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uadp Data Set Writer Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType#getDataSetMessageContentMask <em>Data Set Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType#getConfiguredSize <em>Configured Size</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType#getNetworkMessageNumber <em>Network Message Number</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType#getDataSetOffset <em>Data Set Offset</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpDataSetWriterMessageDataType()
 * @model extendedMetaData="name='UadpDataSetWriterMessageDataType' kind='elementOnly'"
 * @generated
 */
public interface UadpDataSetWriterMessageDataType extends DataSetWriterMessageDataType {
	/**
	 * Returns the value of the '<em><b>Data Set Message Content Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Message Content Mask</em>' attribute.
	 * @see #isSetDataSetMessageContentMask()
	 * @see #unsetDataSetMessageContentMask()
	 * @see #setDataSetMessageContentMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpDataSetWriterMessageDataType_DataSetMessageContentMask()
	 * @model unsettable="true" dataType="org.opcfoundation.ua._2008._02.types.UadpDataSetMessageContentMask"
	 *        extendedMetaData="kind='element' name='DataSetMessageContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getDataSetMessageContentMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType#getDataSetMessageContentMask <em>Data Set Message Content Mask</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType#getDataSetMessageContentMask <em>Data Set Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetMessageContentMask()
	 * @see #getDataSetMessageContentMask()
	 * @see #setDataSetMessageContentMask(long)
	 * @generated
	 */
	void unsetDataSetMessageContentMask();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType#getDataSetMessageContentMask <em>Data Set Message Content Mask</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Set Message Content Mask</em>' attribute is set.
	 * @see #unsetDataSetMessageContentMask()
	 * @see #getDataSetMessageContentMask()
	 * @see #setDataSetMessageContentMask(long)
	 * @generated
	 */
	boolean isSetDataSetMessageContentMask();

	/**
	 * Returns the value of the '<em><b>Configured Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configured Size</em>' attribute.
	 * @see #isSetConfiguredSize()
	 * @see #unsetConfiguredSize()
	 * @see #setConfiguredSize(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpDataSetWriterMessageDataType_ConfiguredSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='element' name='ConfiguredSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getConfiguredSize();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType#getConfiguredSize <em>Configured Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configured Size</em>' attribute.
	 * @see #isSetConfiguredSize()
	 * @see #unsetConfiguredSize()
	 * @see #getConfiguredSize()
	 * @generated
	 */
	void setConfiguredSize(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType#getConfiguredSize <em>Configured Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfiguredSize()
	 * @see #getConfiguredSize()
	 * @see #setConfiguredSize(int)
	 * @generated
	 */
	void unsetConfiguredSize();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType#getConfiguredSize <em>Configured Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Configured Size</em>' attribute is set.
	 * @see #unsetConfiguredSize()
	 * @see #getConfiguredSize()
	 * @see #setConfiguredSize(int)
	 * @generated
	 */
	boolean isSetConfiguredSize();

	/**
	 * Returns the value of the '<em><b>Network Message Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Message Number</em>' attribute.
	 * @see #isSetNetworkMessageNumber()
	 * @see #unsetNetworkMessageNumber()
	 * @see #setNetworkMessageNumber(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpDataSetWriterMessageDataType_NetworkMessageNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='element' name='NetworkMessageNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNetworkMessageNumber();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType#getNetworkMessageNumber <em>Network Message Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Message Number</em>' attribute.
	 * @see #isSetNetworkMessageNumber()
	 * @see #unsetNetworkMessageNumber()
	 * @see #getNetworkMessageNumber()
	 * @generated
	 */
	void setNetworkMessageNumber(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType#getNetworkMessageNumber <em>Network Message Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNetworkMessageNumber()
	 * @see #getNetworkMessageNumber()
	 * @see #setNetworkMessageNumber(int)
	 * @generated
	 */
	void unsetNetworkMessageNumber();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType#getNetworkMessageNumber <em>Network Message Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Network Message Number</em>' attribute is set.
	 * @see #unsetNetworkMessageNumber()
	 * @see #getNetworkMessageNumber()
	 * @see #setNetworkMessageNumber(int)
	 * @generated
	 */
	boolean isSetNetworkMessageNumber();

	/**
	 * Returns the value of the '<em><b>Data Set Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Offset</em>' attribute.
	 * @see #isSetDataSetOffset()
	 * @see #unsetDataSetOffset()
	 * @see #setDataSetOffset(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpDataSetWriterMessageDataType_DataSetOffset()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='element' name='DataSetOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDataSetOffset();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType#getDataSetOffset <em>Data Set Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Offset</em>' attribute.
	 * @see #isSetDataSetOffset()
	 * @see #unsetDataSetOffset()
	 * @see #getDataSetOffset()
	 * @generated
	 */
	void setDataSetOffset(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType#getDataSetOffset <em>Data Set Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetOffset()
	 * @see #getDataSetOffset()
	 * @see #setDataSetOffset(int)
	 * @generated
	 */
	void unsetDataSetOffset();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType#getDataSetOffset <em>Data Set Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Set Offset</em>' attribute is set.
	 * @see #unsetDataSetOffset()
	 * @see #getDataSetOffset()
	 * @see #setDataSetOffset(int)
	 * @generated
	 */
	boolean isSetDataSetOffset();

} // UadpDataSetWriterMessageDataType
