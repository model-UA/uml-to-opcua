/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Writer Group Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getWriterGroupId <em>Writer Group Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getPublishingInterval <em>Publishing Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getKeepAliveTime <em>Keep Alive Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getLocaleIds <em>Locale Ids</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getHeaderLayoutUri <em>Header Layout Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getTransportSettings <em>Transport Settings</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getMessageSettings <em>Message Settings</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getDataSetWriters <em>Data Set Writers</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getWriterGroupDataType()
 * @model extendedMetaData="name='WriterGroupDataType' kind='elementOnly'"
 * @generated
 */
public interface WriterGroupDataType extends PubSubGroupDataType {
	/**
	 * Returns the value of the '<em><b>Writer Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writer Group Id</em>' attribute.
	 * @see #isSetWriterGroupId()
	 * @see #unsetWriterGroupId()
	 * @see #setWriterGroupId(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getWriterGroupDataType_WriterGroupId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='element' name='WriterGroupId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getWriterGroupId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getWriterGroupId <em>Writer Group Id</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getWriterGroupId <em>Writer Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWriterGroupId()
	 * @see #getWriterGroupId()
	 * @see #setWriterGroupId(int)
	 * @generated
	 */
	void unsetWriterGroupId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getWriterGroupId <em>Writer Group Id</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Publishing Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishing Interval</em>' attribute.
	 * @see #isSetPublishingInterval()
	 * @see #unsetPublishingInterval()
	 * @see #setPublishingInterval(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getWriterGroupDataType_PublishingInterval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='PublishingInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	double getPublishingInterval();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getPublishingInterval <em>Publishing Interval</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getPublishingInterval <em>Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPublishingInterval()
	 * @see #getPublishingInterval()
	 * @see #setPublishingInterval(double)
	 * @generated
	 */
	void unsetPublishingInterval();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getPublishingInterval <em>Publishing Interval</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Keep Alive Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Alive Time</em>' attribute.
	 * @see #isSetKeepAliveTime()
	 * @see #unsetKeepAliveTime()
	 * @see #setKeepAliveTime(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getWriterGroupDataType_KeepAliveTime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='KeepAliveTime' namespace='##targetNamespace'"
	 * @generated
	 */
	double getKeepAliveTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getKeepAliveTime <em>Keep Alive Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Alive Time</em>' attribute.
	 * @see #isSetKeepAliveTime()
	 * @see #unsetKeepAliveTime()
	 * @see #getKeepAliveTime()
	 * @generated
	 */
	void setKeepAliveTime(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getKeepAliveTime <em>Keep Alive Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeepAliveTime()
	 * @see #getKeepAliveTime()
	 * @see #setKeepAliveTime(double)
	 * @generated
	 */
	void unsetKeepAliveTime();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getKeepAliveTime <em>Keep Alive Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Keep Alive Time</em>' attribute is set.
	 * @see #unsetKeepAliveTime()
	 * @see #getKeepAliveTime()
	 * @see #setKeepAliveTime(double)
	 * @generated
	 */
	boolean isSetKeepAliveTime();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #setPriority(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getWriterGroupDataType_Priority()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='element' name='Priority' namespace='##targetNamespace'"
	 * @generated
	 */
	short getPriority();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(short value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriority()
	 * @see #getPriority()
	 * @see #setPriority(short)
	 * @generated
	 */
	void unsetPriority();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getPriority <em>Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priority</em>' attribute is set.
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @see #setPriority(short)
	 * @generated
	 */
	boolean isSetPriority();

	/**
	 * Returns the value of the '<em><b>Locale Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale Ids</em>' containment reference.
	 * @see #isSetLocaleIds()
	 * @see #unsetLocaleIds()
	 * @see #setLocaleIds(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getWriterGroupDataType_LocaleIds()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LocaleIds' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getLocaleIds();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getLocaleIds <em>Locale Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale Ids</em>' containment reference.
	 * @see #isSetLocaleIds()
	 * @see #unsetLocaleIds()
	 * @see #getLocaleIds()
	 * @generated
	 */
	void setLocaleIds(ListOfString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getLocaleIds <em>Locale Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocaleIds()
	 * @see #getLocaleIds()
	 * @see #setLocaleIds(ListOfString)
	 * @generated
	 */
	void unsetLocaleIds();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getLocaleIds <em>Locale Ids</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Locale Ids</em>' containment reference is set.
	 * @see #unsetLocaleIds()
	 * @see #getLocaleIds()
	 * @see #setLocaleIds(ListOfString)
	 * @generated
	 */
	boolean isSetLocaleIds();

	/**
	 * Returns the value of the '<em><b>Header Layout Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Layout Uri</em>' attribute.
	 * @see #isSetHeaderLayoutUri()
	 * @see #unsetHeaderLayoutUri()
	 * @see #setHeaderLayoutUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getWriterGroupDataType_HeaderLayoutUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='HeaderLayoutUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHeaderLayoutUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getHeaderLayoutUri <em>Header Layout Uri</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getHeaderLayoutUri <em>Header Layout Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeaderLayoutUri()
	 * @see #getHeaderLayoutUri()
	 * @see #setHeaderLayoutUri(String)
	 * @generated
	 */
	void unsetHeaderLayoutUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getHeaderLayoutUri <em>Header Layout Uri</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Transport Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Settings</em>' containment reference.
	 * @see #isSetTransportSettings()
	 * @see #unsetTransportSettings()
	 * @see #setTransportSettings(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getWriterGroupDataType_TransportSettings()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TransportSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getTransportSettings();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getTransportSettings <em>Transport Settings</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getTransportSettings <em>Transport Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportSettings()
	 * @see #getTransportSettings()
	 * @see #setTransportSettings(ExtensionObject)
	 * @generated
	 */
	void unsetTransportSettings();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getTransportSettings <em>Transport Settings</em>}' containment reference is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getWriterGroupDataType_MessageSettings()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='MessageSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getMessageSettings();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getMessageSettings <em>Message Settings</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getMessageSettings <em>Message Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessageSettings()
	 * @see #getMessageSettings()
	 * @see #setMessageSettings(ExtensionObject)
	 * @generated
	 */
	void unsetMessageSettings();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getMessageSettings <em>Message Settings</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Data Set Writers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Writers</em>' containment reference.
	 * @see #isSetDataSetWriters()
	 * @see #unsetDataSetWriters()
	 * @see #setDataSetWriters(ListOfDataSetWriterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getWriterGroupDataType_DataSetWriters()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataSetWriters' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDataSetWriterDataType getDataSetWriters();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getDataSetWriters <em>Data Set Writers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Writers</em>' containment reference.
	 * @see #isSetDataSetWriters()
	 * @see #unsetDataSetWriters()
	 * @see #getDataSetWriters()
	 * @generated
	 */
	void setDataSetWriters(ListOfDataSetWriterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getDataSetWriters <em>Data Set Writers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetWriters()
	 * @see #getDataSetWriters()
	 * @see #setDataSetWriters(ListOfDataSetWriterDataType)
	 * @generated
	 */
	void unsetDataSetWriters();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType#getDataSetWriters <em>Data Set Writers</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Set Writers</em>' containment reference is set.
	 * @see #unsetDataSetWriters()
	 * @see #getDataSetWriters()
	 * @see #setDataSetWriters(ListOfDataSetWriterDataType)
	 * @generated
	 */
	boolean isSetDataSetWriters();

} // WriterGroupDataType
