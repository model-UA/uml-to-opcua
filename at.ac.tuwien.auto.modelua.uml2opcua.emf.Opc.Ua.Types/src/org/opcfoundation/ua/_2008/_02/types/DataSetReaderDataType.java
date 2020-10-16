/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set Reader Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getPublisherId <em>Publisher Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getWriterGroupId <em>Writer Group Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getDataSetWriterId <em>Data Set Writer Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getDataSetMetaData <em>Data Set Meta Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getDataSetFieldContentMask <em>Data Set Field Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getMessageReceiveTimeout <em>Message Receive Timeout</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getKeyFrameCount <em>Key Frame Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getHeaderLayoutUri <em>Header Layout Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getSecurityMode <em>Security Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getSecurityGroupId <em>Security Group Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getSecurityKeyServices <em>Security Key Services</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getDataSetReaderProperties <em>Data Set Reader Properties</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getTransportSettings <em>Transport Settings</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getMessageSettings <em>Message Settings</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getSubscribedDataSet <em>Subscribed Data Set</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetReaderDataType()
 * @model extendedMetaData="name='DataSetReaderDataType' kind='elementOnly'"
 * @generated
 */
public interface DataSetReaderDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetReaderDataType_Name()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #setEnabled(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetReaderDataType_Enabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Enabled' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnabled()
	 * @see #isEnabled()
	 * @see #setEnabled(boolean)
	 * @generated
	 */
	void unsetEnabled();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#isEnabled <em>Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enabled</em>' attribute is set.
	 * @see #unsetEnabled()
	 * @see #isEnabled()
	 * @see #setEnabled(boolean)
	 * @generated
	 */
	boolean isSetEnabled();

	/**
	 * Returns the value of the '<em><b>Publisher Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher Id</em>' containment reference.
	 * @see #setPublisherId(Variant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetReaderDataType_PublisherId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PublisherId' namespace='##targetNamespace'"
	 * @generated
	 */
	Variant getPublisherId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getPublisherId <em>Publisher Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Id</em>' containment reference.
	 * @see #getPublisherId()
	 * @generated
	 */
	void setPublisherId(Variant value);

	/**
	 * Returns the value of the '<em><b>Writer Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writer Group Id</em>' attribute.
	 * @see #isSetWriterGroupId()
	 * @see #unsetWriterGroupId()
	 * @see #setWriterGroupId(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetReaderDataType_WriterGroupId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='element' name='WriterGroupId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getWriterGroupId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getWriterGroupId <em>Writer Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writer Group Id</em>' attribute.
	 * @see #isSetWriterGroupId()
	 * @see #unsetWriterGroupId()
	 * @see #getWriterGroupId()
	 * @generated
	 */
	void setWriterGroupId(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getWriterGroupId <em>Writer Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWriterGroupId()
	 * @see #getWriterGroupId()
	 * @see #setWriterGroupId(int)
	 * @generated
	 */
	void unsetWriterGroupId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getWriterGroupId <em>Writer Group Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Writer Group Id</em>' attribute is set.
	 * @see #unsetWriterGroupId()
	 * @see #getWriterGroupId()
	 * @see #setWriterGroupId(int)
	 * @generated
	 */
	boolean isSetWriterGroupId();

	/**
	 * Returns the value of the '<em><b>Data Set Writer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Writer Id</em>' attribute.
	 * @see #isSetDataSetWriterId()
	 * @see #unsetDataSetWriterId()
	 * @see #setDataSetWriterId(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetReaderDataType_DataSetWriterId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='element' name='DataSetWriterId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDataSetWriterId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getDataSetWriterId <em>Data Set Writer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Writer Id</em>' attribute.
	 * @see #isSetDataSetWriterId()
	 * @see #unsetDataSetWriterId()
	 * @see #getDataSetWriterId()
	 * @generated
	 */
	void setDataSetWriterId(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getDataSetWriterId <em>Data Set Writer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetWriterId()
	 * @see #getDataSetWriterId()
	 * @see #setDataSetWriterId(int)
	 * @generated
	 */
	void unsetDataSetWriterId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getDataSetWriterId <em>Data Set Writer Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Set Writer Id</em>' attribute is set.
	 * @see #unsetDataSetWriterId()
	 * @see #getDataSetWriterId()
	 * @see #setDataSetWriterId(int)
	 * @generated
	 */
	boolean isSetDataSetWriterId();

	/**
	 * Returns the value of the '<em><b>Data Set Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Meta Data</em>' containment reference.
	 * @see #isSetDataSetMetaData()
	 * @see #unsetDataSetMetaData()
	 * @see #setDataSetMetaData(DataSetMetaDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetReaderDataType_DataSetMetaData()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataSetMetaData' namespace='##targetNamespace'"
	 * @generated
	 */
	DataSetMetaDataType getDataSetMetaData();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getDataSetMetaData <em>Data Set Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Meta Data</em>' containment reference.
	 * @see #isSetDataSetMetaData()
	 * @see #unsetDataSetMetaData()
	 * @see #getDataSetMetaData()
	 * @generated
	 */
	void setDataSetMetaData(DataSetMetaDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getDataSetMetaData <em>Data Set Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetMetaData()
	 * @see #getDataSetMetaData()
	 * @see #setDataSetMetaData(DataSetMetaDataType)
	 * @generated
	 */
	void unsetDataSetMetaData();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getDataSetMetaData <em>Data Set Meta Data</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Set Meta Data</em>' containment reference is set.
	 * @see #unsetDataSetMetaData()
	 * @see #getDataSetMetaData()
	 * @see #setDataSetMetaData(DataSetMetaDataType)
	 * @generated
	 */
	boolean isSetDataSetMetaData();

	/**
	 * Returns the value of the '<em><b>Data Set Field Content Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Field Content Mask</em>' attribute.
	 * @see #isSetDataSetFieldContentMask()
	 * @see #unsetDataSetFieldContentMask()
	 * @see #setDataSetFieldContentMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetReaderDataType_DataSetFieldContentMask()
	 * @model unsettable="true" dataType="org.opcfoundation.ua._2008._02.types.DataSetFieldContentMask"
	 *        extendedMetaData="kind='element' name='DataSetFieldContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getDataSetFieldContentMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getDataSetFieldContentMask <em>Data Set Field Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Field Content Mask</em>' attribute.
	 * @see #isSetDataSetFieldContentMask()
	 * @see #unsetDataSetFieldContentMask()
	 * @see #getDataSetFieldContentMask()
	 * @generated
	 */
	void setDataSetFieldContentMask(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getDataSetFieldContentMask <em>Data Set Field Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetFieldContentMask()
	 * @see #getDataSetFieldContentMask()
	 * @see #setDataSetFieldContentMask(long)
	 * @generated
	 */
	void unsetDataSetFieldContentMask();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getDataSetFieldContentMask <em>Data Set Field Content Mask</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Set Field Content Mask</em>' attribute is set.
	 * @see #unsetDataSetFieldContentMask()
	 * @see #getDataSetFieldContentMask()
	 * @see #setDataSetFieldContentMask(long)
	 * @generated
	 */
	boolean isSetDataSetFieldContentMask();

	/**
	 * Returns the value of the '<em><b>Message Receive Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Receive Timeout</em>' attribute.
	 * @see #isSetMessageReceiveTimeout()
	 * @see #unsetMessageReceiveTimeout()
	 * @see #setMessageReceiveTimeout(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetReaderDataType_MessageReceiveTimeout()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='MessageReceiveTimeout' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMessageReceiveTimeout();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getMessageReceiveTimeout <em>Message Receive Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Receive Timeout</em>' attribute.
	 * @see #isSetMessageReceiveTimeout()
	 * @see #unsetMessageReceiveTimeout()
	 * @see #getMessageReceiveTimeout()
	 * @generated
	 */
	void setMessageReceiveTimeout(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getMessageReceiveTimeout <em>Message Receive Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessageReceiveTimeout()
	 * @see #getMessageReceiveTimeout()
	 * @see #setMessageReceiveTimeout(double)
	 * @generated
	 */
	void unsetMessageReceiveTimeout();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getMessageReceiveTimeout <em>Message Receive Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Message Receive Timeout</em>' attribute is set.
	 * @see #unsetMessageReceiveTimeout()
	 * @see #getMessageReceiveTimeout()
	 * @see #setMessageReceiveTimeout(double)
	 * @generated
	 */
	boolean isSetMessageReceiveTimeout();

	/**
	 * Returns the value of the '<em><b>Key Frame Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Frame Count</em>' attribute.
	 * @see #isSetKeyFrameCount()
	 * @see #unsetKeyFrameCount()
	 * @see #setKeyFrameCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetReaderDataType_KeyFrameCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='KeyFrameCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getKeyFrameCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getKeyFrameCount <em>Key Frame Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Frame Count</em>' attribute.
	 * @see #isSetKeyFrameCount()
	 * @see #unsetKeyFrameCount()
	 * @see #getKeyFrameCount()
	 * @generated
	 */
	void setKeyFrameCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getKeyFrameCount <em>Key Frame Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeyFrameCount()
	 * @see #getKeyFrameCount()
	 * @see #setKeyFrameCount(long)
	 * @generated
	 */
	void unsetKeyFrameCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getKeyFrameCount <em>Key Frame Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key Frame Count</em>' attribute is set.
	 * @see #unsetKeyFrameCount()
	 * @see #getKeyFrameCount()
	 * @see #setKeyFrameCount(long)
	 * @generated
	 */
	boolean isSetKeyFrameCount();

	/**
	 * Returns the value of the '<em><b>Header Layout Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Layout Uri</em>' attribute.
	 * @see #isSetHeaderLayoutUri()
	 * @see #unsetHeaderLayoutUri()
	 * @see #setHeaderLayoutUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetReaderDataType_HeaderLayoutUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='HeaderLayoutUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHeaderLayoutUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getHeaderLayoutUri <em>Header Layout Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Layout Uri</em>' attribute.
	 * @see #isSetHeaderLayoutUri()
	 * @see #unsetHeaderLayoutUri()
	 * @see #getHeaderLayoutUri()
	 * @generated
	 */
	void setHeaderLayoutUri(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getHeaderLayoutUri <em>Header Layout Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeaderLayoutUri()
	 * @see #getHeaderLayoutUri()
	 * @see #setHeaderLayoutUri(String)
	 * @generated
	 */
	void unsetHeaderLayoutUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getHeaderLayoutUri <em>Header Layout Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Header Layout Uri</em>' attribute is set.
	 * @see #unsetHeaderLayoutUri()
	 * @see #getHeaderLayoutUri()
	 * @see #setHeaderLayoutUri(String)
	 * @generated
	 */
	boolean isSetHeaderLayoutUri();

	/**
	 * Returns the value of the '<em><b>Security Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.MessageSecurityMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Mode</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.MessageSecurityMode
	 * @see #isSetSecurityMode()
	 * @see #unsetSecurityMode()
	 * @see #setSecurityMode(MessageSecurityMode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetReaderDataType_SecurityMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SecurityMode' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageSecurityMode getSecurityMode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getSecurityMode <em>Security Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Mode</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.MessageSecurityMode
	 * @see #isSetSecurityMode()
	 * @see #unsetSecurityMode()
	 * @see #getSecurityMode()
	 * @generated
	 */
	void setSecurityMode(MessageSecurityMode value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getSecurityMode <em>Security Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityMode()
	 * @see #getSecurityMode()
	 * @see #setSecurityMode(MessageSecurityMode)
	 * @generated
	 */
	void unsetSecurityMode();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getSecurityMode <em>Security Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security Mode</em>' attribute is set.
	 * @see #unsetSecurityMode()
	 * @see #getSecurityMode()
	 * @see #setSecurityMode(MessageSecurityMode)
	 * @generated
	 */
	boolean isSetSecurityMode();

	/**
	 * Returns the value of the '<em><b>Security Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Group Id</em>' attribute.
	 * @see #isSetSecurityGroupId()
	 * @see #unsetSecurityGroupId()
	 * @see #setSecurityGroupId(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetReaderDataType_SecurityGroupId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SecurityGroupId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecurityGroupId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getSecurityGroupId <em>Security Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group Id</em>' attribute.
	 * @see #isSetSecurityGroupId()
	 * @see #unsetSecurityGroupId()
	 * @see #getSecurityGroupId()
	 * @generated
	 */
	void setSecurityGroupId(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getSecurityGroupId <em>Security Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityGroupId()
	 * @see #getSecurityGroupId()
	 * @see #setSecurityGroupId(String)
	 * @generated
	 */
	void unsetSecurityGroupId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getSecurityGroupId <em>Security Group Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security Group Id</em>' attribute is set.
	 * @see #unsetSecurityGroupId()
	 * @see #getSecurityGroupId()
	 * @see #setSecurityGroupId(String)
	 * @generated
	 */
	boolean isSetSecurityGroupId();

	/**
	 * Returns the value of the '<em><b>Security Key Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Key Services</em>' containment reference.
	 * @see #isSetSecurityKeyServices()
	 * @see #unsetSecurityKeyServices()
	 * @see #setSecurityKeyServices(ListOfEndpointDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetReaderDataType_SecurityKeyServices()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SecurityKeyServices' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfEndpointDescription getSecurityKeyServices();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getSecurityKeyServices <em>Security Key Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Key Services</em>' containment reference.
	 * @see #isSetSecurityKeyServices()
	 * @see #unsetSecurityKeyServices()
	 * @see #getSecurityKeyServices()
	 * @generated
	 */
	void setSecurityKeyServices(ListOfEndpointDescription value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getSecurityKeyServices <em>Security Key Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityKeyServices()
	 * @see #getSecurityKeyServices()
	 * @see #setSecurityKeyServices(ListOfEndpointDescription)
	 * @generated
	 */
	void unsetSecurityKeyServices();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getSecurityKeyServices <em>Security Key Services</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security Key Services</em>' containment reference is set.
	 * @see #unsetSecurityKeyServices()
	 * @see #getSecurityKeyServices()
	 * @see #setSecurityKeyServices(ListOfEndpointDescription)
	 * @generated
	 */
	boolean isSetSecurityKeyServices();

	/**
	 * Returns the value of the '<em><b>Data Set Reader Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Reader Properties</em>' containment reference.
	 * @see #isSetDataSetReaderProperties()
	 * @see #unsetDataSetReaderProperties()
	 * @see #setDataSetReaderProperties(ListOfKeyValuePair)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetReaderDataType_DataSetReaderProperties()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataSetReaderProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfKeyValuePair getDataSetReaderProperties();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getDataSetReaderProperties <em>Data Set Reader Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Reader Properties</em>' containment reference.
	 * @see #isSetDataSetReaderProperties()
	 * @see #unsetDataSetReaderProperties()
	 * @see #getDataSetReaderProperties()
	 * @generated
	 */
	void setDataSetReaderProperties(ListOfKeyValuePair value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getDataSetReaderProperties <em>Data Set Reader Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetReaderProperties()
	 * @see #getDataSetReaderProperties()
	 * @see #setDataSetReaderProperties(ListOfKeyValuePair)
	 * @generated
	 */
	void unsetDataSetReaderProperties();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getDataSetReaderProperties <em>Data Set Reader Properties</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Set Reader Properties</em>' containment reference is set.
	 * @see #unsetDataSetReaderProperties()
	 * @see #getDataSetReaderProperties()
	 * @see #setDataSetReaderProperties(ListOfKeyValuePair)
	 * @generated
	 */
	boolean isSetDataSetReaderProperties();

	/**
	 * Returns the value of the '<em><b>Transport Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Settings</em>' containment reference.
	 * @see #isSetTransportSettings()
	 * @see #unsetTransportSettings()
	 * @see #setTransportSettings(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetReaderDataType_TransportSettings()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TransportSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getTransportSettings();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getTransportSettings <em>Transport Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Settings</em>' containment reference.
	 * @see #isSetTransportSettings()
	 * @see #unsetTransportSettings()
	 * @see #getTransportSettings()
	 * @generated
	 */
	void setTransportSettings(ExtensionObject value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getTransportSettings <em>Transport Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportSettings()
	 * @see #getTransportSettings()
	 * @see #setTransportSettings(ExtensionObject)
	 * @generated
	 */
	void unsetTransportSettings();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getTransportSettings <em>Transport Settings</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transport Settings</em>' containment reference is set.
	 * @see #unsetTransportSettings()
	 * @see #getTransportSettings()
	 * @see #setTransportSettings(ExtensionObject)
	 * @generated
	 */
	boolean isSetTransportSettings();

	/**
	 * Returns the value of the '<em><b>Message Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Settings</em>' containment reference.
	 * @see #isSetMessageSettings()
	 * @see #unsetMessageSettings()
	 * @see #setMessageSettings(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetReaderDataType_MessageSettings()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='MessageSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getMessageSettings();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getMessageSettings <em>Message Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Settings</em>' containment reference.
	 * @see #isSetMessageSettings()
	 * @see #unsetMessageSettings()
	 * @see #getMessageSettings()
	 * @generated
	 */
	void setMessageSettings(ExtensionObject value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getMessageSettings <em>Message Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessageSettings()
	 * @see #getMessageSettings()
	 * @see #setMessageSettings(ExtensionObject)
	 * @generated
	 */
	void unsetMessageSettings();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getMessageSettings <em>Message Settings</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Message Settings</em>' containment reference is set.
	 * @see #unsetMessageSettings()
	 * @see #getMessageSettings()
	 * @see #setMessageSettings(ExtensionObject)
	 * @generated
	 */
	boolean isSetMessageSettings();

	/**
	 * Returns the value of the '<em><b>Subscribed Data Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribed Data Set</em>' containment reference.
	 * @see #isSetSubscribedDataSet()
	 * @see #unsetSubscribedDataSet()
	 * @see #setSubscribedDataSet(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetReaderDataType_SubscribedDataSet()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SubscribedDataSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getSubscribedDataSet();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getSubscribedDataSet <em>Subscribed Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribed Data Set</em>' containment reference.
	 * @see #isSetSubscribedDataSet()
	 * @see #unsetSubscribedDataSet()
	 * @see #getSubscribedDataSet()
	 * @generated
	 */
	void setSubscribedDataSet(ExtensionObject value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getSubscribedDataSet <em>Subscribed Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubscribedDataSet()
	 * @see #getSubscribedDataSet()
	 * @see #setSubscribedDataSet(ExtensionObject)
	 * @generated
	 */
	void unsetSubscribedDataSet();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetReaderDataType#getSubscribedDataSet <em>Subscribed Data Set</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Subscribed Data Set</em>' containment reference is set.
	 * @see #unsetSubscribedDataSet()
	 * @see #getSubscribedDataSet()
	 * @see #setSubscribedDataSet(ExtensionObject)
	 * @generated
	 */
	boolean isSetSubscribedDataSet();

} // DataSetReaderDataType
