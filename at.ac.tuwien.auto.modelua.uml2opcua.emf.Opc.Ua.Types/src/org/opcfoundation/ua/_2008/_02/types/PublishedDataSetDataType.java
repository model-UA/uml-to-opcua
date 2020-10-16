/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Published Data Set Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getDataSetFolder <em>Data Set Folder</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getDataSetMetaData <em>Data Set Meta Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getExtensionFields <em>Extension Fields</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getDataSetSource <em>Data Set Source</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedDataSetDataType()
 * @model extendedMetaData="name='PublishedDataSetDataType' kind='elementOnly'"
 * @generated
 */
public interface PublishedDataSetDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedDataSetDataType_Name()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getName <em>Name</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Data Set Folder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Folder</em>' containment reference.
	 * @see #isSetDataSetFolder()
	 * @see #unsetDataSetFolder()
	 * @see #setDataSetFolder(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedDataSetDataType_DataSetFolder()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataSetFolder' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getDataSetFolder();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getDataSetFolder <em>Data Set Folder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Folder</em>' containment reference.
	 * @see #isSetDataSetFolder()
	 * @see #unsetDataSetFolder()
	 * @see #getDataSetFolder()
	 * @generated
	 */
	void setDataSetFolder(ListOfString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getDataSetFolder <em>Data Set Folder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetFolder()
	 * @see #getDataSetFolder()
	 * @see #setDataSetFolder(ListOfString)
	 * @generated
	 */
	void unsetDataSetFolder();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getDataSetFolder <em>Data Set Folder</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Set Folder</em>' containment reference is set.
	 * @see #unsetDataSetFolder()
	 * @see #getDataSetFolder()
	 * @see #setDataSetFolder(ListOfString)
	 * @generated
	 */
	boolean isSetDataSetFolder();

	/**
	 * Returns the value of the '<em><b>Data Set Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Meta Data</em>' containment reference.
	 * @see #isSetDataSetMetaData()
	 * @see #unsetDataSetMetaData()
	 * @see #setDataSetMetaData(DataSetMetaDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedDataSetDataType_DataSetMetaData()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataSetMetaData' namespace='##targetNamespace'"
	 * @generated
	 */
	DataSetMetaDataType getDataSetMetaData();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getDataSetMetaData <em>Data Set Meta Data</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getDataSetMetaData <em>Data Set Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetMetaData()
	 * @see #getDataSetMetaData()
	 * @see #setDataSetMetaData(DataSetMetaDataType)
	 * @generated
	 */
	void unsetDataSetMetaData();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getDataSetMetaData <em>Data Set Meta Data</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Extension Fields</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Fields</em>' containment reference.
	 * @see #isSetExtensionFields()
	 * @see #unsetExtensionFields()
	 * @see #setExtensionFields(ListOfKeyValuePair)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedDataSetDataType_ExtensionFields()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ExtensionFields' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfKeyValuePair getExtensionFields();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getExtensionFields <em>Extension Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Fields</em>' containment reference.
	 * @see #isSetExtensionFields()
	 * @see #unsetExtensionFields()
	 * @see #getExtensionFields()
	 * @generated
	 */
	void setExtensionFields(ListOfKeyValuePair value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getExtensionFields <em>Extension Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtensionFields()
	 * @see #getExtensionFields()
	 * @see #setExtensionFields(ListOfKeyValuePair)
	 * @generated
	 */
	void unsetExtensionFields();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getExtensionFields <em>Extension Fields</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extension Fields</em>' containment reference is set.
	 * @see #unsetExtensionFields()
	 * @see #getExtensionFields()
	 * @see #setExtensionFields(ListOfKeyValuePair)
	 * @generated
	 */
	boolean isSetExtensionFields();

	/**
	 * Returns the value of the '<em><b>Data Set Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Source</em>' containment reference.
	 * @see #isSetDataSetSource()
	 * @see #unsetDataSetSource()
	 * @see #setDataSetSource(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedDataSetDataType_DataSetSource()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataSetSource' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getDataSetSource();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getDataSetSource <em>Data Set Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Source</em>' containment reference.
	 * @see #isSetDataSetSource()
	 * @see #unsetDataSetSource()
	 * @see #getDataSetSource()
	 * @generated
	 */
	void setDataSetSource(ExtensionObject value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getDataSetSource <em>Data Set Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSetSource()
	 * @see #getDataSetSource()
	 * @see #setDataSetSource(ExtensionObject)
	 * @generated
	 */
	void unsetDataSetSource();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType#getDataSetSource <em>Data Set Source</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Set Source</em>' containment reference is set.
	 * @see #unsetDataSetSource()
	 * @see #getDataSetSource()
	 * @see #setDataSetSource(ExtensionObject)
	 * @generated
	 */
	boolean isSetDataSetSource();

} // PublishedDataSetDataType
