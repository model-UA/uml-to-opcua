/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set Meta Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType#getFields <em>Fields</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType#getDataSetClassId <em>Data Set Class Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType#getConfigurationVersion <em>Configuration Version</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetMetaDataType()
 * @model extendedMetaData="name='DataSetMetaDataType' kind='elementOnly'"
 * @generated
 */
public interface DataSetMetaDataType extends DataTypeSchemaHeader {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetMetaDataType_Name()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType#getName <em>Name</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(LocalizedText)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetMetaDataType_Description()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedText getDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(LocalizedText value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(LocalizedText)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType#getDescription <em>Description</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' containment reference is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(LocalizedText)
	 * @generated
	 */
	boolean isSetDescription();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference.
	 * @see #isSetFields()
	 * @see #unsetFields()
	 * @see #setFields(ListOfFieldMetaData)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetMetaDataType_Fields()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Fields' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfFieldMetaData getFields();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType#getFields <em>Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fields</em>' containment reference.
	 * @see #isSetFields()
	 * @see #unsetFields()
	 * @see #getFields()
	 * @generated
	 */
	void setFields(ListOfFieldMetaData value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType#getFields <em>Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFields()
	 * @see #getFields()
	 * @see #setFields(ListOfFieldMetaData)
	 * @generated
	 */
	void unsetFields();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType#getFields <em>Fields</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fields</em>' containment reference is set.
	 * @see #unsetFields()
	 * @see #getFields()
	 * @see #setFields(ListOfFieldMetaData)
	 * @generated
	 */
	boolean isSetFields();

	/**
	 * Returns the value of the '<em><b>Data Set Class Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Class Id</em>' containment reference.
	 * @see #setDataSetClassId(Guid)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetMetaDataType_DataSetClassId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSetClassId' namespace='##targetNamespace'"
	 * @generated
	 */
	Guid getDataSetClassId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType#getDataSetClassId <em>Data Set Class Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Class Id</em>' containment reference.
	 * @see #getDataSetClassId()
	 * @generated
	 */
	void setDataSetClassId(Guid value);

	/**
	 * Returns the value of the '<em><b>Configuration Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Version</em>' containment reference.
	 * @see #isSetConfigurationVersion()
	 * @see #unsetConfigurationVersion()
	 * @see #setConfigurationVersion(ConfigurationVersionDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataSetMetaDataType_ConfigurationVersion()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ConfigurationVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfigurationVersionDataType getConfigurationVersion();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType#getConfigurationVersion <em>Configuration Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Version</em>' containment reference.
	 * @see #isSetConfigurationVersion()
	 * @see #unsetConfigurationVersion()
	 * @see #getConfigurationVersion()
	 * @generated
	 */
	void setConfigurationVersion(ConfigurationVersionDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType#getConfigurationVersion <em>Configuration Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfigurationVersion()
	 * @see #getConfigurationVersion()
	 * @see #setConfigurationVersion(ConfigurationVersionDataType)
	 * @generated
	 */
	void unsetConfigurationVersion();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType#getConfigurationVersion <em>Configuration Version</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Configuration Version</em>' containment reference is set.
	 * @see #unsetConfigurationVersion()
	 * @see #getConfigurationVersion()
	 * @see #setConfigurationVersion(ConfigurationVersionDataType)
	 * @generated
	 */
	boolean isSetConfigurationVersion();

} // DataSetMetaDataType
