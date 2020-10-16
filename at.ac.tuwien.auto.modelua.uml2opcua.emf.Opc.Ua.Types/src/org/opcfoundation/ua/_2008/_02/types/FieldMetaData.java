/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Meta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getDescription <em>Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getFieldFlags <em>Field Flags</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getBuiltInType <em>Built In Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getValueRank <em>Value Rank</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getArrayDimensions <em>Array Dimensions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getMaxStringLength <em>Max String Length</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getDataSetFieldId <em>Data Set Field Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldMetaData()
 * @model extendedMetaData="name='FieldMetaData' kind='elementOnly'"
 * @generated
 */
public interface FieldMetaData extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldMetaData_Name()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getName <em>Name</em>}' attribute is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldMetaData_Description()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedText getDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getDescription <em>Description</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(LocalizedText)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getDescription <em>Description</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Field Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Flags</em>' attribute.
	 * @see #isSetFieldFlags()
	 * @see #unsetFieldFlags()
	 * @see #setFieldFlags(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldMetaData_FieldFlags()
	 * @model unsettable="true" dataType="org.opcfoundation.ua._2008._02.types.DataSetFieldFlags"
	 *        extendedMetaData="kind='element' name='FieldFlags' namespace='##targetNamespace'"
	 * @generated
	 */
	int getFieldFlags();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getFieldFlags <em>Field Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Flags</em>' attribute.
	 * @see #isSetFieldFlags()
	 * @see #unsetFieldFlags()
	 * @see #getFieldFlags()
	 * @generated
	 */
	void setFieldFlags(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getFieldFlags <em>Field Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFieldFlags()
	 * @see #getFieldFlags()
	 * @see #setFieldFlags(int)
	 * @generated
	 */
	void unsetFieldFlags();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getFieldFlags <em>Field Flags</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Field Flags</em>' attribute is set.
	 * @see #unsetFieldFlags()
	 * @see #getFieldFlags()
	 * @see #setFieldFlags(int)
	 * @generated
	 */
	boolean isSetFieldFlags();

	/**
	 * Returns the value of the '<em><b>Built In Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Built In Type</em>' attribute.
	 * @see #isSetBuiltInType()
	 * @see #unsetBuiltInType()
	 * @see #setBuiltInType(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldMetaData_BuiltInType()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='element' name='BuiltInType' namespace='##targetNamespace'"
	 * @generated
	 */
	short getBuiltInType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getBuiltInType <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Built In Type</em>' attribute.
	 * @see #isSetBuiltInType()
	 * @see #unsetBuiltInType()
	 * @see #getBuiltInType()
	 * @generated
	 */
	void setBuiltInType(short value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getBuiltInType <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBuiltInType()
	 * @see #getBuiltInType()
	 * @see #setBuiltInType(short)
	 * @generated
	 */
	void unsetBuiltInType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getBuiltInType <em>Built In Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Built In Type</em>' attribute is set.
	 * @see #unsetBuiltInType()
	 * @see #getBuiltInType()
	 * @see #setBuiltInType(short)
	 * @generated
	 */
	boolean isSetBuiltInType();

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #setDataType(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldMetaData_DataType()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataType' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataType()
	 * @see #getDataType()
	 * @see #setDataType(NodeId)
	 * @generated
	 */
	void unsetDataType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getDataType <em>Data Type</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Type</em>' containment reference is set.
	 * @see #unsetDataType()
	 * @see #getDataType()
	 * @see #setDataType(NodeId)
	 * @generated
	 */
	boolean isSetDataType();

	/**
	 * Returns the value of the '<em><b>Value Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Rank</em>' attribute.
	 * @see #isSetValueRank()
	 * @see #unsetValueRank()
	 * @see #setValueRank(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldMetaData_ValueRank()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='ValueRank' namespace='##targetNamespace'"
	 * @generated
	 */
	int getValueRank();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getValueRank <em>Value Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Rank</em>' attribute.
	 * @see #isSetValueRank()
	 * @see #unsetValueRank()
	 * @see #getValueRank()
	 * @generated
	 */
	void setValueRank(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getValueRank <em>Value Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValueRank()
	 * @see #getValueRank()
	 * @see #setValueRank(int)
	 * @generated
	 */
	void unsetValueRank();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getValueRank <em>Value Rank</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value Rank</em>' attribute is set.
	 * @see #unsetValueRank()
	 * @see #getValueRank()
	 * @see #setValueRank(int)
	 * @generated
	 */
	boolean isSetValueRank();

	/**
	 * Returns the value of the '<em><b>Array Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Dimensions</em>' containment reference.
	 * @see #isSetArrayDimensions()
	 * @see #unsetArrayDimensions()
	 * @see #setArrayDimensions(ListOfUInt32)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldMetaData_ArrayDimensions()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ArrayDimensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUInt32 getArrayDimensions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getArrayDimensions <em>Array Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Dimensions</em>' containment reference.
	 * @see #isSetArrayDimensions()
	 * @see #unsetArrayDimensions()
	 * @see #getArrayDimensions()
	 * @generated
	 */
	void setArrayDimensions(ListOfUInt32 value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getArrayDimensions <em>Array Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArrayDimensions()
	 * @see #getArrayDimensions()
	 * @see #setArrayDimensions(ListOfUInt32)
	 * @generated
	 */
	void unsetArrayDimensions();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getArrayDimensions <em>Array Dimensions</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Array Dimensions</em>' containment reference is set.
	 * @see #unsetArrayDimensions()
	 * @see #getArrayDimensions()
	 * @see #setArrayDimensions(ListOfUInt32)
	 * @generated
	 */
	boolean isSetArrayDimensions();

	/**
	 * Returns the value of the '<em><b>Max String Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max String Length</em>' attribute.
	 * @see #isSetMaxStringLength()
	 * @see #unsetMaxStringLength()
	 * @see #setMaxStringLength(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldMetaData_MaxStringLength()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MaxStringLength' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMaxStringLength();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getMaxStringLength <em>Max String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max String Length</em>' attribute.
	 * @see #isSetMaxStringLength()
	 * @see #unsetMaxStringLength()
	 * @see #getMaxStringLength()
	 * @generated
	 */
	void setMaxStringLength(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getMaxStringLength <em>Max String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxStringLength()
	 * @see #getMaxStringLength()
	 * @see #setMaxStringLength(long)
	 * @generated
	 */
	void unsetMaxStringLength();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getMaxStringLength <em>Max String Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max String Length</em>' attribute is set.
	 * @see #unsetMaxStringLength()
	 * @see #getMaxStringLength()
	 * @see #setMaxStringLength(long)
	 * @generated
	 */
	boolean isSetMaxStringLength();

	/**
	 * Returns the value of the '<em><b>Data Set Field Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Field Id</em>' containment reference.
	 * @see #setDataSetFieldId(Guid)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldMetaData_DataSetFieldId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSetFieldId' namespace='##targetNamespace'"
	 * @generated
	 */
	Guid getDataSetFieldId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getDataSetFieldId <em>Data Set Field Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Field Id</em>' containment reference.
	 * @see #getDataSetFieldId()
	 * @generated
	 */
	void setDataSetFieldId(Guid value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #isSetProperties()
	 * @see #unsetProperties()
	 * @see #setProperties(ListOfKeyValuePair)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldMetaData_Properties()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Properties' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfKeyValuePair getProperties();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #isSetProperties()
	 * @see #unsetProperties()
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(ListOfKeyValuePair value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProperties()
	 * @see #getProperties()
	 * @see #setProperties(ListOfKeyValuePair)
	 * @generated
	 */
	void unsetProperties();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldMetaData#getProperties <em>Properties</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Properties</em>' containment reference is set.
	 * @see #unsetProperties()
	 * @see #getProperties()
	 * @see #setProperties(ListOfKeyValuePair)
	 * @generated
	 */
	boolean isSetProperties();

} // FieldMetaData
