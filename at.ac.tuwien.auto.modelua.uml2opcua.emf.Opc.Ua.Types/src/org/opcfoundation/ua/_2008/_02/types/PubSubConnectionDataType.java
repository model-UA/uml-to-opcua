/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pub Sub Connection Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getPublisherId <em>Publisher Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getTransportProfileUri <em>Transport Profile Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getConnectionProperties <em>Connection Properties</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getTransportSettings <em>Transport Settings</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getWriterGroups <em>Writer Groups</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getReaderGroups <em>Reader Groups</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubConnectionDataType()
 * @model extendedMetaData="name='PubSubConnectionDataType' kind='elementOnly'"
 * @generated
 */
public interface PubSubConnectionDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubConnectionDataType_Name()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getName <em>Name</em>}' attribute is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubConnectionDataType_Enabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Enabled' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#isEnabled <em>Enabled</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnabled()
	 * @see #isEnabled()
	 * @see #setEnabled(boolean)
	 * @generated
	 */
	void unsetEnabled();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#isEnabled <em>Enabled</em>}' attribute is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubConnectionDataType_PublisherId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PublisherId' namespace='##targetNamespace'"
	 * @generated
	 */
	Variant getPublisherId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getPublisherId <em>Publisher Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Id</em>' containment reference.
	 * @see #getPublisherId()
	 * @generated
	 */
	void setPublisherId(Variant value);

	/**
	 * Returns the value of the '<em><b>Transport Profile Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Profile Uri</em>' attribute.
	 * @see #isSetTransportProfileUri()
	 * @see #unsetTransportProfileUri()
	 * @see #setTransportProfileUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubConnectionDataType_TransportProfileUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='TransportProfileUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransportProfileUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getTransportProfileUri <em>Transport Profile Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Profile Uri</em>' attribute.
	 * @see #isSetTransportProfileUri()
	 * @see #unsetTransportProfileUri()
	 * @see #getTransportProfileUri()
	 * @generated
	 */
	void setTransportProfileUri(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getTransportProfileUri <em>Transport Profile Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportProfileUri()
	 * @see #getTransportProfileUri()
	 * @see #setTransportProfileUri(String)
	 * @generated
	 */
	void unsetTransportProfileUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getTransportProfileUri <em>Transport Profile Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transport Profile Uri</em>' attribute is set.
	 * @see #unsetTransportProfileUri()
	 * @see #getTransportProfileUri()
	 * @see #setTransportProfileUri(String)
	 * @generated
	 */
	boolean isSetTransportProfileUri();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #isSetAddress()
	 * @see #unsetAddress()
	 * @see #setAddress(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubConnectionDataType_Address()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Address' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getAddress();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #isSetAddress()
	 * @see #unsetAddress()
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(ExtensionObject value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddress()
	 * @see #getAddress()
	 * @see #setAddress(ExtensionObject)
	 * @generated
	 */
	void unsetAddress();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getAddress <em>Address</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Address</em>' containment reference is set.
	 * @see #unsetAddress()
	 * @see #getAddress()
	 * @see #setAddress(ExtensionObject)
	 * @generated
	 */
	boolean isSetAddress();

	/**
	 * Returns the value of the '<em><b>Connection Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Properties</em>' containment reference.
	 * @see #isSetConnectionProperties()
	 * @see #unsetConnectionProperties()
	 * @see #setConnectionProperties(ListOfKeyValuePair)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubConnectionDataType_ConnectionProperties()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ConnectionProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfKeyValuePair getConnectionProperties();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getConnectionProperties <em>Connection Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Properties</em>' containment reference.
	 * @see #isSetConnectionProperties()
	 * @see #unsetConnectionProperties()
	 * @see #getConnectionProperties()
	 * @generated
	 */
	void setConnectionProperties(ListOfKeyValuePair value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getConnectionProperties <em>Connection Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectionProperties()
	 * @see #getConnectionProperties()
	 * @see #setConnectionProperties(ListOfKeyValuePair)
	 * @generated
	 */
	void unsetConnectionProperties();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getConnectionProperties <em>Connection Properties</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connection Properties</em>' containment reference is set.
	 * @see #unsetConnectionProperties()
	 * @see #getConnectionProperties()
	 * @see #setConnectionProperties(ListOfKeyValuePair)
	 * @generated
	 */
	boolean isSetConnectionProperties();

	/**
	 * Returns the value of the '<em><b>Transport Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Settings</em>' containment reference.
	 * @see #isSetTransportSettings()
	 * @see #unsetTransportSettings()
	 * @see #setTransportSettings(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubConnectionDataType_TransportSettings()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TransportSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getTransportSettings();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getTransportSettings <em>Transport Settings</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getTransportSettings <em>Transport Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportSettings()
	 * @see #getTransportSettings()
	 * @see #setTransportSettings(ExtensionObject)
	 * @generated
	 */
	void unsetTransportSettings();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getTransportSettings <em>Transport Settings</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Writer Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writer Groups</em>' containment reference.
	 * @see #isSetWriterGroups()
	 * @see #unsetWriterGroups()
	 * @see #setWriterGroups(ListOfWriterGroupDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubConnectionDataType_WriterGroups()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='WriterGroups' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfWriterGroupDataType getWriterGroups();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getWriterGroups <em>Writer Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writer Groups</em>' containment reference.
	 * @see #isSetWriterGroups()
	 * @see #unsetWriterGroups()
	 * @see #getWriterGroups()
	 * @generated
	 */
	void setWriterGroups(ListOfWriterGroupDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getWriterGroups <em>Writer Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWriterGroups()
	 * @see #getWriterGroups()
	 * @see #setWriterGroups(ListOfWriterGroupDataType)
	 * @generated
	 */
	void unsetWriterGroups();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getWriterGroups <em>Writer Groups</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Writer Groups</em>' containment reference is set.
	 * @see #unsetWriterGroups()
	 * @see #getWriterGroups()
	 * @see #setWriterGroups(ListOfWriterGroupDataType)
	 * @generated
	 */
	boolean isSetWriterGroups();

	/**
	 * Returns the value of the '<em><b>Reader Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader Groups</em>' containment reference.
	 * @see #isSetReaderGroups()
	 * @see #unsetReaderGroups()
	 * @see #setReaderGroups(ListOfReaderGroupDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubConnectionDataType_ReaderGroups()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ReaderGroups' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfReaderGroupDataType getReaderGroups();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getReaderGroups <em>Reader Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reader Groups</em>' containment reference.
	 * @see #isSetReaderGroups()
	 * @see #unsetReaderGroups()
	 * @see #getReaderGroups()
	 * @generated
	 */
	void setReaderGroups(ListOfReaderGroupDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getReaderGroups <em>Reader Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReaderGroups()
	 * @see #getReaderGroups()
	 * @see #setReaderGroups(ListOfReaderGroupDataType)
	 * @generated
	 */
	void unsetReaderGroups();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType#getReaderGroups <em>Reader Groups</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reader Groups</em>' containment reference is set.
	 * @see #unsetReaderGroups()
	 * @see #getReaderGroups()
	 * @see #setReaderGroups(ListOfReaderGroupDataType)
	 * @generated
	 */
	boolean isSetReaderGroups();

} // PubSubConnectionDataType
