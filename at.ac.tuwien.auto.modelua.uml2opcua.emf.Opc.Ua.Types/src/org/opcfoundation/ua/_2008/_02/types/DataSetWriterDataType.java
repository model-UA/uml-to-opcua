/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set Writer Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getDataSetWriterId <em>Data Set Writer Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getDataSetFieldContentMask <em>Data Set Field Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getKeyFrameCount <em>Key Frame Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getDataSetName <em>Data Set Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getDataSetWriterProperties <em>Data Set Writer Properties</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getTransportSettings <em>Transport Settings</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getMessageSettings <em>Message Settings</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetWriterDataType()
 * @model extendedMetaData="name='DataSetWriterDataType' kind='elementOnly'"
 * @generated
 */
public interface DataSetWriterDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetWriterDataType_Name()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getName <em>Name</em>}' attribute is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetWriterDataType_Enabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Enabled' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#isEnabled <em>Enabled</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnabled()
	 * @see #isEnabled()
	 * @see #setEnabled(boolean)
	 * @generated
	 */
	void unsetEnabled();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#isEnabled <em>Enabled</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Data Set Writer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Writer Id</em>' attribute.
	 * @see #isSetDataSetWriterId()
	 * @see #unsetDataSetWriterId()
	 * @see #setDataSetWriterId(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetWriterDataType_DataSetWriterId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='element' name='DataSetWriterId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDataSetWriterId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getDataSetWriterId <em>Data Set Writer Id</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getDataSetWriterId <em>Data Set Writer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetWriterId()
	 * @see #getDataSetWriterId()
	 * @see #setDataSetWriterId(int)
	 * @generated
	 */
	void unsetDataSetWriterId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getDataSetWriterId <em>Data Set Writer Id</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Data Set Field Content Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Field Content Mask</em>' attribute.
	 * @see #isSetDataSetFieldContentMask()
	 * @see #unsetDataSetFieldContentMask()
	 * @see #setDataSetFieldContentMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetWriterDataType_DataSetFieldContentMask()
	 * @model unsettable="true" dataType="org.opcfoundation.ua._2008._02.types.DataSetFieldContentMask"
	 *        extendedMetaData="kind='element' name='DataSetFieldContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getDataSetFieldContentMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getDataSetFieldContentMask <em>Data Set Field Content Mask</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getDataSetFieldContentMask <em>Data Set Field Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetFieldContentMask()
	 * @see #getDataSetFieldContentMask()
	 * @see #setDataSetFieldContentMask(long)
	 * @generated
	 */
	void unsetDataSetFieldContentMask();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getDataSetFieldContentMask <em>Data Set Field Content Mask</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Key Frame Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Frame Count</em>' attribute.
	 * @see #isSetKeyFrameCount()
	 * @see #unsetKeyFrameCount()
	 * @see #setKeyFrameCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetWriterDataType_KeyFrameCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='KeyFrameCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getKeyFrameCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getKeyFrameCount <em>Key Frame Count</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getKeyFrameCount <em>Key Frame Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeyFrameCount()
	 * @see #getKeyFrameCount()
	 * @see #setKeyFrameCount(long)
	 * @generated
	 */
	void unsetKeyFrameCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getKeyFrameCount <em>Key Frame Count</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Data Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Name</em>' attribute.
	 * @see #isSetDataSetName()
	 * @see #unsetDataSetName()
	 * @see #setDataSetName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetWriterDataType_DataSetName()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DataSetName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataSetName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getDataSetName <em>Data Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Name</em>' attribute.
	 * @see #isSetDataSetName()
	 * @see #unsetDataSetName()
	 * @see #getDataSetName()
	 * @generated
	 */
	void setDataSetName(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getDataSetName <em>Data Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetName()
	 * @see #getDataSetName()
	 * @see #setDataSetName(String)
	 * @generated
	 */
	void unsetDataSetName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getDataSetName <em>Data Set Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Set Name</em>' attribute is set.
	 * @see #unsetDataSetName()
	 * @see #getDataSetName()
	 * @see #setDataSetName(String)
	 * @generated
	 */
	boolean isSetDataSetName();

	/**
	 * Returns the value of the '<em><b>Data Set Writer Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Writer Properties</em>' containment reference.
	 * @see #isSetDataSetWriterProperties()
	 * @see #unsetDataSetWriterProperties()
	 * @see #setDataSetWriterProperties(ListOfKeyValuePair)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetWriterDataType_DataSetWriterProperties()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataSetWriterProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfKeyValuePair getDataSetWriterProperties();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getDataSetWriterProperties <em>Data Set Writer Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Writer Properties</em>' containment reference.
	 * @see #isSetDataSetWriterProperties()
	 * @see #unsetDataSetWriterProperties()
	 * @see #getDataSetWriterProperties()
	 * @generated
	 */
	void setDataSetWriterProperties(ListOfKeyValuePair value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getDataSetWriterProperties <em>Data Set Writer Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetWriterProperties()
	 * @see #getDataSetWriterProperties()
	 * @see #setDataSetWriterProperties(ListOfKeyValuePair)
	 * @generated
	 */
	void unsetDataSetWriterProperties();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getDataSetWriterProperties <em>Data Set Writer Properties</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Set Writer Properties</em>' containment reference is set.
	 * @see #unsetDataSetWriterProperties()
	 * @see #getDataSetWriterProperties()
	 * @see #setDataSetWriterProperties(ListOfKeyValuePair)
	 * @generated
	 */
	boolean isSetDataSetWriterProperties();

	/**
	 * Returns the value of the '<em><b>Transport Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Settings</em>' containment reference.
	 * @see #isSetTransportSettings()
	 * @see #unsetTransportSettings()
	 * @see #setTransportSettings(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetWriterDataType_TransportSettings()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TransportSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getTransportSettings();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getTransportSettings <em>Transport Settings</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getTransportSettings <em>Transport Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportSettings()
	 * @see #getTransportSettings()
	 * @see #setTransportSettings(ExtensionObject)
	 * @generated
	 */
	void unsetTransportSettings();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getTransportSettings <em>Transport Settings</em>}' containment reference is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetWriterDataType_MessageSettings()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='MessageSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getMessageSettings();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getMessageSettings <em>Message Settings</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getMessageSettings <em>Message Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessageSettings()
	 * @see #getMessageSettings()
	 * @see #setMessageSettings(ExtensionObject)
	 * @generated
	 */
	void unsetMessageSettings();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType#getMessageSettings <em>Message Settings</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Message Settings</em>' containment reference is set.
	 * @see #unsetMessageSettings()
	 * @see #getMessageSettings()
	 * @see #setMessageSettings(ExtensionObject)
	 * @generated
	 */
	boolean isSetMessageSettings();

} // DataSetWriterDataType
