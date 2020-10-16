/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reader Group Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReaderGroupDataType#getTransportSettings <em>Transport Settings</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReaderGroupDataType#getMessageSettings <em>Message Settings</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReaderGroupDataType#getDataSetReaders <em>Data Set Readers</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReaderGroupDataType()
 * @model extendedMetaData="name='ReaderGroupDataType' kind='elementOnly'"
 * @generated
 */
public interface ReaderGroupDataType extends PubSubGroupDataType {
	/**
	 * Returns the value of the '<em><b>Transport Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Settings</em>' containment reference.
	 * @see #isSetTransportSettings()
	 * @see #unsetTransportSettings()
	 * @see #setTransportSettings(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReaderGroupDataType_TransportSettings()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TransportSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getTransportSettings();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReaderGroupDataType#getTransportSettings <em>Transport Settings</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReaderGroupDataType#getTransportSettings <em>Transport Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportSettings()
	 * @see #getTransportSettings()
	 * @see #setTransportSettings(ExtensionObject)
	 * @generated
	 */
	void unsetTransportSettings();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReaderGroupDataType#getTransportSettings <em>Transport Settings</em>}' containment reference is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReaderGroupDataType_MessageSettings()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='MessageSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getMessageSettings();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReaderGroupDataType#getMessageSettings <em>Message Settings</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReaderGroupDataType#getMessageSettings <em>Message Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessageSettings()
	 * @see #getMessageSettings()
	 * @see #setMessageSettings(ExtensionObject)
	 * @generated
	 */
	void unsetMessageSettings();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReaderGroupDataType#getMessageSettings <em>Message Settings</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Data Set Readers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Readers</em>' containment reference.
	 * @see #isSetDataSetReaders()
	 * @see #unsetDataSetReaders()
	 * @see #setDataSetReaders(ListOfDataSetReaderDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReaderGroupDataType_DataSetReaders()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataSetReaders' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDataSetReaderDataType getDataSetReaders();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReaderGroupDataType#getDataSetReaders <em>Data Set Readers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Readers</em>' containment reference.
	 * @see #isSetDataSetReaders()
	 * @see #unsetDataSetReaders()
	 * @see #getDataSetReaders()
	 * @generated
	 */
	void setDataSetReaders(ListOfDataSetReaderDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReaderGroupDataType#getDataSetReaders <em>Data Set Readers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetReaders()
	 * @see #getDataSetReaders()
	 * @see #setDataSetReaders(ListOfDataSetReaderDataType)
	 * @generated
	 */
	void unsetDataSetReaders();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReaderGroupDataType#getDataSetReaders <em>Data Set Readers</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Set Readers</em>' containment reference is set.
	 * @see #unsetDataSetReaders()
	 * @see #getDataSetReaders()
	 * @see #setDataSetReaders(ListOfDataSetReaderDataType)
	 * @generated
	 */
	boolean isSetDataSetReaders();

} // ReaderGroupDataType
