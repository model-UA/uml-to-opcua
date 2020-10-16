/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.StructureDefinition#getDefaultEncodingId <em>Default Encoding Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.StructureDefinition#getBaseDataType <em>Base Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.StructureDefinition#getStructureType <em>Structure Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.StructureDefinition#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getStructureDefinition()
 * @model extendedMetaData="name='StructureDefinition' kind='elementOnly'"
 * @generated
 */
public interface StructureDefinition extends DataTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Default Encoding Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Encoding Id</em>' containment reference.
	 * @see #isSetDefaultEncodingId()
	 * @see #unsetDefaultEncodingId()
	 * @see #setDefaultEncodingId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getStructureDefinition_DefaultEncodingId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DefaultEncodingId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getDefaultEncodingId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.StructureDefinition#getDefaultEncodingId <em>Default Encoding Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Encoding Id</em>' containment reference.
	 * @see #isSetDefaultEncodingId()
	 * @see #unsetDefaultEncodingId()
	 * @see #getDefaultEncodingId()
	 * @generated
	 */
	void setDefaultEncodingId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.StructureDefinition#getDefaultEncodingId <em>Default Encoding Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultEncodingId()
	 * @see #getDefaultEncodingId()
	 * @see #setDefaultEncodingId(NodeId)
	 * @generated
	 */
	void unsetDefaultEncodingId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.StructureDefinition#getDefaultEncodingId <em>Default Encoding Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Encoding Id</em>' containment reference is set.
	 * @see #unsetDefaultEncodingId()
	 * @see #getDefaultEncodingId()
	 * @see #setDefaultEncodingId(NodeId)
	 * @generated
	 */
	boolean isSetDefaultEncodingId();

	/**
	 * Returns the value of the '<em><b>Base Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Data Type</em>' containment reference.
	 * @see #isSetBaseDataType()
	 * @see #unsetBaseDataType()
	 * @see #setBaseDataType(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getStructureDefinition_BaseDataType()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='BaseDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getBaseDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.StructureDefinition#getBaseDataType <em>Base Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' containment reference.
	 * @see #isSetBaseDataType()
	 * @see #unsetBaseDataType()
	 * @see #getBaseDataType()
	 * @generated
	 */
	void setBaseDataType(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.StructureDefinition#getBaseDataType <em>Base Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaseDataType()
	 * @see #getBaseDataType()
	 * @see #setBaseDataType(NodeId)
	 * @generated
	 */
	void unsetBaseDataType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.StructureDefinition#getBaseDataType <em>Base Data Type</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Base Data Type</em>' containment reference is set.
	 * @see #unsetBaseDataType()
	 * @see #getBaseDataType()
	 * @see #setBaseDataType(NodeId)
	 * @generated
	 */
	boolean isSetBaseDataType();

	/**
	 * Returns the value of the '<em><b>Structure Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.StructureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.StructureType
	 * @see #isSetStructureType()
	 * @see #unsetStructureType()
	 * @see #setStructureType(StructureType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getStructureDefinition_StructureType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='StructureType' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureType getStructureType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.StructureDefinition#getStructureType <em>Structure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.StructureType
	 * @see #isSetStructureType()
	 * @see #unsetStructureType()
	 * @see #getStructureType()
	 * @generated
	 */
	void setStructureType(StructureType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.StructureDefinition#getStructureType <em>Structure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStructureType()
	 * @see #getStructureType()
	 * @see #setStructureType(StructureType)
	 * @generated
	 */
	void unsetStructureType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.StructureDefinition#getStructureType <em>Structure Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Structure Type</em>' attribute is set.
	 * @see #unsetStructureType()
	 * @see #getStructureType()
	 * @see #setStructureType(StructureType)
	 * @generated
	 */
	boolean isSetStructureType();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference.
	 * @see #isSetFields()
	 * @see #unsetFields()
	 * @see #setFields(ListOfStructureField)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getStructureDefinition_Fields()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Fields' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfStructureField getFields();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.StructureDefinition#getFields <em>Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fields</em>' containment reference.
	 * @see #isSetFields()
	 * @see #unsetFields()
	 * @see #getFields()
	 * @generated
	 */
	void setFields(ListOfStructureField value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.StructureDefinition#getFields <em>Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFields()
	 * @see #getFields()
	 * @see #setFields(ListOfStructureField)
	 * @generated
	 */
	void unsetFields();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.StructureDefinition#getFields <em>Fields</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fields</em>' containment reference is set.
	 * @see #unsetFields()
	 * @see #getFields()
	 * @see #setFields(ListOfStructureField)
	 * @generated
	 */
	boolean isSetFields();

} // StructureDefinition
