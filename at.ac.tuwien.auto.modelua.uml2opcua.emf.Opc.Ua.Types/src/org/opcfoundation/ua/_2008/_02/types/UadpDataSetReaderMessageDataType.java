/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uadp Data Set Reader Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getGroupVersion <em>Group Version</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getNetworkMessageNumber <em>Network Message Number</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getDataSetOffset <em>Data Set Offset</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getDataSetClassId <em>Data Set Class Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getNetworkMessageContentMask <em>Network Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getDataSetMessageContentMask <em>Data Set Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getPublishingInterval <em>Publishing Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getReceiveOffset <em>Receive Offset</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getProcessingOffset <em>Processing Offset</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpDataSetReaderMessageDataType()
 * @model extendedMetaData="name='UadpDataSetReaderMessageDataType' kind='elementOnly'"
 * @generated
 */
public interface UadpDataSetReaderMessageDataType extends DataSetReaderMessageDataType {
	/**
	 * Returns the value of the '<em><b>Group Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Version</em>' attribute.
	 * @see #isSetGroupVersion()
	 * @see #unsetGroupVersion()
	 * @see #setGroupVersion(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpDataSetReaderMessageDataType_GroupVersion()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='GroupVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	long getGroupVersion();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getGroupVersion <em>Group Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Version</em>' attribute.
	 * @see #isSetGroupVersion()
	 * @see #unsetGroupVersion()
	 * @see #getGroupVersion()
	 * @generated
	 */
	void setGroupVersion(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getGroupVersion <em>Group Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroupVersion()
	 * @see #getGroupVersion()
	 * @see #setGroupVersion(long)
	 * @generated
	 */
	void unsetGroupVersion();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getGroupVersion <em>Group Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Group Version</em>' attribute is set.
	 * @see #unsetGroupVersion()
	 * @see #getGroupVersion()
	 * @see #setGroupVersion(long)
	 * @generated
	 */
	boolean isSetGroupVersion();

	/**
	 * Returns the value of the '<em><b>Network Message Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Message Number</em>' attribute.
	 * @see #isSetNetworkMessageNumber()
	 * @see #unsetNetworkMessageNumber()
	 * @see #setNetworkMessageNumber(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpDataSetReaderMessageDataType_NetworkMessageNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='element' name='NetworkMessageNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNetworkMessageNumber();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getNetworkMessageNumber <em>Network Message Number</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getNetworkMessageNumber <em>Network Message Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNetworkMessageNumber()
	 * @see #getNetworkMessageNumber()
	 * @see #setNetworkMessageNumber(int)
	 * @generated
	 */
	void unsetNetworkMessageNumber();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getNetworkMessageNumber <em>Network Message Number</em>}' attribute is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpDataSetReaderMessageDataType_DataSetOffset()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='element' name='DataSetOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDataSetOffset();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getDataSetOffset <em>Data Set Offset</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getDataSetOffset <em>Data Set Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetOffset()
	 * @see #getDataSetOffset()
	 * @see #setDataSetOffset(int)
	 * @generated
	 */
	void unsetDataSetOffset();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getDataSetOffset <em>Data Set Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Set Offset</em>' attribute is set.
	 * @see #unsetDataSetOffset()
	 * @see #getDataSetOffset()
	 * @see #setDataSetOffset(int)
	 * @generated
	 */
	boolean isSetDataSetOffset();

	/**
	 * Returns the value of the '<em><b>Data Set Class Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Class Id</em>' containment reference.
	 * @see #setDataSetClassId(Guid)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpDataSetReaderMessageDataType_DataSetClassId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSetClassId' namespace='##targetNamespace'"
	 * @generated
	 */
	Guid getDataSetClassId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getDataSetClassId <em>Data Set Class Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Class Id</em>' containment reference.
	 * @see #getDataSetClassId()
	 * @generated
	 */
	void setDataSetClassId(Guid value);

	/**
	 * Returns the value of the '<em><b>Network Message Content Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Message Content Mask</em>' attribute.
	 * @see #isSetNetworkMessageContentMask()
	 * @see #unsetNetworkMessageContentMask()
	 * @see #setNetworkMessageContentMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpDataSetReaderMessageDataType_NetworkMessageContentMask()
	 * @model unsettable="true" dataType="org.opcfoundation.ua._2008._02.types.UadpNetworkMessageContentMask"
	 *        extendedMetaData="kind='element' name='NetworkMessageContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNetworkMessageContentMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getNetworkMessageContentMask <em>Network Message Content Mask</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getNetworkMessageContentMask <em>Network Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNetworkMessageContentMask()
	 * @see #getNetworkMessageContentMask()
	 * @see #setNetworkMessageContentMask(long)
	 * @generated
	 */
	void unsetNetworkMessageContentMask();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getNetworkMessageContentMask <em>Network Message Content Mask</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Network Message Content Mask</em>' attribute is set.
	 * @see #unsetNetworkMessageContentMask()
	 * @see #getNetworkMessageContentMask()
	 * @see #setNetworkMessageContentMask(long)
	 * @generated
	 */
	boolean isSetNetworkMessageContentMask();

	/**
	 * Returns the value of the '<em><b>Data Set Message Content Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Message Content Mask</em>' attribute.
	 * @see #isSetDataSetMessageContentMask()
	 * @see #unsetDataSetMessageContentMask()
	 * @see #setDataSetMessageContentMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpDataSetReaderMessageDataType_DataSetMessageContentMask()
	 * @model unsettable="true" dataType="org.opcfoundation.ua._2008._02.types.UadpDataSetMessageContentMask"
	 *        extendedMetaData="kind='element' name='DataSetMessageContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getDataSetMessageContentMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getDataSetMessageContentMask <em>Data Set Message Content Mask</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getDataSetMessageContentMask <em>Data Set Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetMessageContentMask()
	 * @see #getDataSetMessageContentMask()
	 * @see #setDataSetMessageContentMask(long)
	 * @generated
	 */
	void unsetDataSetMessageContentMask();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getDataSetMessageContentMask <em>Data Set Message Content Mask</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Publishing Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishing Interval</em>' attribute.
	 * @see #isSetPublishingInterval()
	 * @see #unsetPublishingInterval()
	 * @see #setPublishingInterval(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpDataSetReaderMessageDataType_PublishingInterval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='PublishingInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	double getPublishingInterval();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getPublishingInterval <em>Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publishing Interval</em>' attribute.
	 * @see #isSetPublishingInterval()
	 * @see #unsetPublishingInterval()
	 * @see #getPublishingInterval()
	 * @generated
	 */
	void setPublishingInterval(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getPublishingInterval <em>Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPublishingInterval()
	 * @see #getPublishingInterval()
	 * @see #setPublishingInterval(double)
	 * @generated
	 */
	void unsetPublishingInterval();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getPublishingInterval <em>Publishing Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Publishing Interval</em>' attribute is set.
	 * @see #unsetPublishingInterval()
	 * @see #getPublishingInterval()
	 * @see #setPublishingInterval(double)
	 * @generated
	 */
	boolean isSetPublishingInterval();

	/**
	 * Returns the value of the '<em><b>Receive Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Offset</em>' attribute.
	 * @see #isSetReceiveOffset()
	 * @see #unsetReceiveOffset()
	 * @see #setReceiveOffset(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpDataSetReaderMessageDataType_ReceiveOffset()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='ReceiveOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	double getReceiveOffset();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getReceiveOffset <em>Receive Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Offset</em>' attribute.
	 * @see #isSetReceiveOffset()
	 * @see #unsetReceiveOffset()
	 * @see #getReceiveOffset()
	 * @generated
	 */
	void setReceiveOffset(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getReceiveOffset <em>Receive Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReceiveOffset()
	 * @see #getReceiveOffset()
	 * @see #setReceiveOffset(double)
	 * @generated
	 */
	void unsetReceiveOffset();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getReceiveOffset <em>Receive Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Receive Offset</em>' attribute is set.
	 * @see #unsetReceiveOffset()
	 * @see #getReceiveOffset()
	 * @see #setReceiveOffset(double)
	 * @generated
	 */
	boolean isSetReceiveOffset();

	/**
	 * Returns the value of the '<em><b>Processing Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Offset</em>' attribute.
	 * @see #isSetProcessingOffset()
	 * @see #unsetProcessingOffset()
	 * @see #setProcessingOffset(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpDataSetReaderMessageDataType_ProcessingOffset()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='ProcessingOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	double getProcessingOffset();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getProcessingOffset <em>Processing Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Offset</em>' attribute.
	 * @see #isSetProcessingOffset()
	 * @see #unsetProcessingOffset()
	 * @see #getProcessingOffset()
	 * @generated
	 */
	void setProcessingOffset(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getProcessingOffset <em>Processing Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessingOffset()
	 * @see #getProcessingOffset()
	 * @see #setProcessingOffset(double)
	 * @generated
	 */
	void unsetProcessingOffset();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType#getProcessingOffset <em>Processing Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Processing Offset</em>' attribute is set.
	 * @see #unsetProcessingOffset()
	 * @see #getProcessingOffset()
	 * @see #setProcessingOffset(double)
	 * @generated
	 */
	boolean isSetProcessingOffset();

} // UadpDataSetReaderMessageDataType
