/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Binary File Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UABinaryFileDataType#getSchemaLocation <em>Schema Location</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UABinaryFileDataType#getFileHeader <em>File Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UABinaryFileDataType#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUABinaryFileDataType()
 * @model extendedMetaData="name='UABinaryFileDataType' kind='elementOnly'"
 * @generated
 */
public interface UABinaryFileDataType extends DataTypeSchemaHeader {
	/**
	 * Returns the value of the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Location</em>' attribute.
	 * @see #isSetSchemaLocation()
	 * @see #unsetSchemaLocation()
	 * @see #setSchemaLocation(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUABinaryFileDataType_SchemaLocation()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SchemaLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSchemaLocation();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UABinaryFileDataType#getSchemaLocation <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Location</em>' attribute.
	 * @see #isSetSchemaLocation()
	 * @see #unsetSchemaLocation()
	 * @see #getSchemaLocation()
	 * @generated
	 */
	void setSchemaLocation(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UABinaryFileDataType#getSchemaLocation <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSchemaLocation()
	 * @see #getSchemaLocation()
	 * @see #setSchemaLocation(String)
	 * @generated
	 */
	void unsetSchemaLocation();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UABinaryFileDataType#getSchemaLocation <em>Schema Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Schema Location</em>' attribute is set.
	 * @see #unsetSchemaLocation()
	 * @see #getSchemaLocation()
	 * @see #setSchemaLocation(String)
	 * @generated
	 */
	boolean isSetSchemaLocation();

	/**
	 * Returns the value of the '<em><b>File Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Header</em>' containment reference.
	 * @see #isSetFileHeader()
	 * @see #unsetFileHeader()
	 * @see #setFileHeader(ListOfKeyValuePair)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUABinaryFileDataType_FileHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='FileHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfKeyValuePair getFileHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UABinaryFileDataType#getFileHeader <em>File Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Header</em>' containment reference.
	 * @see #isSetFileHeader()
	 * @see #unsetFileHeader()
	 * @see #getFileHeader()
	 * @generated
	 */
	void setFileHeader(ListOfKeyValuePair value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UABinaryFileDataType#getFileHeader <em>File Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFileHeader()
	 * @see #getFileHeader()
	 * @see #setFileHeader(ListOfKeyValuePair)
	 * @generated
	 */
	void unsetFileHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UABinaryFileDataType#getFileHeader <em>File Header</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>File Header</em>' containment reference is set.
	 * @see #unsetFileHeader()
	 * @see #getFileHeader()
	 * @see #setFileHeader(ListOfKeyValuePair)
	 * @generated
	 */
	boolean isSetFileHeader();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Variant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUABinaryFileDataType_Body()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Body' namespace='##targetNamespace'"
	 * @generated
	 */
	Variant getBody();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UABinaryFileDataType#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Variant value);

} // UABinaryFileDataType
