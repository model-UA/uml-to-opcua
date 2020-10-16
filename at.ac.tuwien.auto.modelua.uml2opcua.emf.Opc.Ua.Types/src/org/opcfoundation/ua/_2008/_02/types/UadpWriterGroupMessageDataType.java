/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uadp Writer Group Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getGroupVersion <em>Group Version</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getDataSetOrdering <em>Data Set Ordering</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getNetworkMessageContentMask <em>Network Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getSamplingOffset <em>Sampling Offset</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getPublishingOffset <em>Publishing Offset</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpWriterGroupMessageDataType()
 * @model extendedMetaData="name='UadpWriterGroupMessageDataType' kind='elementOnly'"
 * @generated
 */
public interface UadpWriterGroupMessageDataType extends WriterGroupMessageDataType {
	/**
	 * Returns the value of the '<em><b>Group Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Version</em>' attribute.
	 * @see #isSetGroupVersion()
	 * @see #unsetGroupVersion()
	 * @see #setGroupVersion(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpWriterGroupMessageDataType_GroupVersion()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='GroupVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	long getGroupVersion();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getGroupVersion <em>Group Version</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getGroupVersion <em>Group Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroupVersion()
	 * @see #getGroupVersion()
	 * @see #setGroupVersion(long)
	 * @generated
	 */
	void unsetGroupVersion();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getGroupVersion <em>Group Version</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Data Set Ordering</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.DataSetOrderingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Ordering</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.DataSetOrderingType
	 * @see #isSetDataSetOrdering()
	 * @see #unsetDataSetOrdering()
	 * @see #setDataSetOrdering(DataSetOrderingType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpWriterGroupMessageDataType_DataSetOrdering()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DataSetOrdering' namespace='##targetNamespace'"
	 * @generated
	 */
	DataSetOrderingType getDataSetOrdering();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getDataSetOrdering <em>Data Set Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Ordering</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.DataSetOrderingType
	 * @see #isSetDataSetOrdering()
	 * @see #unsetDataSetOrdering()
	 * @see #getDataSetOrdering()
	 * @generated
	 */
	void setDataSetOrdering(DataSetOrderingType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getDataSetOrdering <em>Data Set Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetOrdering()
	 * @see #getDataSetOrdering()
	 * @see #setDataSetOrdering(DataSetOrderingType)
	 * @generated
	 */
	void unsetDataSetOrdering();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getDataSetOrdering <em>Data Set Ordering</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Set Ordering</em>' attribute is set.
	 * @see #unsetDataSetOrdering()
	 * @see #getDataSetOrdering()
	 * @see #setDataSetOrdering(DataSetOrderingType)
	 * @generated
	 */
	boolean isSetDataSetOrdering();

	/**
	 * Returns the value of the '<em><b>Network Message Content Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Message Content Mask</em>' attribute.
	 * @see #isSetNetworkMessageContentMask()
	 * @see #unsetNetworkMessageContentMask()
	 * @see #setNetworkMessageContentMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpWriterGroupMessageDataType_NetworkMessageContentMask()
	 * @model unsettable="true" dataType="org.opcfoundation.ua._2008._02.types.UadpNetworkMessageContentMask"
	 *        extendedMetaData="kind='element' name='NetworkMessageContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNetworkMessageContentMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getNetworkMessageContentMask <em>Network Message Content Mask</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getNetworkMessageContentMask <em>Network Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNetworkMessageContentMask()
	 * @see #getNetworkMessageContentMask()
	 * @see #setNetworkMessageContentMask(long)
	 * @generated
	 */
	void unsetNetworkMessageContentMask();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getNetworkMessageContentMask <em>Network Message Content Mask</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Sampling Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Offset</em>' attribute.
	 * @see #isSetSamplingOffset()
	 * @see #unsetSamplingOffset()
	 * @see #setSamplingOffset(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpWriterGroupMessageDataType_SamplingOffset()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='SamplingOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	double getSamplingOffset();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getSamplingOffset <em>Sampling Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Offset</em>' attribute.
	 * @see #isSetSamplingOffset()
	 * @see #unsetSamplingOffset()
	 * @see #getSamplingOffset()
	 * @generated
	 */
	void setSamplingOffset(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getSamplingOffset <em>Sampling Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSamplingOffset()
	 * @see #getSamplingOffset()
	 * @see #setSamplingOffset(double)
	 * @generated
	 */
	void unsetSamplingOffset();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getSamplingOffset <em>Sampling Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sampling Offset</em>' attribute is set.
	 * @see #unsetSamplingOffset()
	 * @see #getSamplingOffset()
	 * @see #setSamplingOffset(double)
	 * @generated
	 */
	boolean isSetSamplingOffset();

	/**
	 * Returns the value of the '<em><b>Publishing Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishing Offset</em>' containment reference.
	 * @see #isSetPublishingOffset()
	 * @see #unsetPublishingOffset()
	 * @see #setPublishingOffset(ListOfDouble)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUadpWriterGroupMessageDataType_PublishingOffset()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='PublishingOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDouble getPublishingOffset();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getPublishingOffset <em>Publishing Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publishing Offset</em>' containment reference.
	 * @see #isSetPublishingOffset()
	 * @see #unsetPublishingOffset()
	 * @see #getPublishingOffset()
	 * @generated
	 */
	void setPublishingOffset(ListOfDouble value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getPublishingOffset <em>Publishing Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPublishingOffset()
	 * @see #getPublishingOffset()
	 * @see #setPublishingOffset(ListOfDouble)
	 * @generated
	 */
	void unsetPublishingOffset();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType#getPublishingOffset <em>Publishing Offset</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Publishing Offset</em>' containment reference is set.
	 * @see #unsetPublishingOffset()
	 * @see #getPublishingOffset()
	 * @see #setPublishingOffset(ListOfDouble)
	 * @generated
	 */
	boolean isSetPublishingOffset();

} // UadpWriterGroupMessageDataType
