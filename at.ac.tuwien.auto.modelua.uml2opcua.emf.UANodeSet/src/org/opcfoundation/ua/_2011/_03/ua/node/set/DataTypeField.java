/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getDescription <em>Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getArrayDimensions <em>Array Dimensions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getMaxStringLength <em>Max String Length</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getSymbolicName <em>Symbolic Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getValueRank <em>Value Rank</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDataTypeField()
 * @model extendedMetaData="name='DataTypeField' kind='elementOnly'"
 * @generated
 */
public interface DataTypeField extends EObject {
	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference list.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDataTypeField_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DisplayName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocalizedText> getDisplayName();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDataTypeField_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocalizedText> getDescription();

	/**
	 * Returns the value of the '<em><b>Array Dimensions</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Dimensions</em>' attribute.
	 * @see #isSetArrayDimensions()
	 * @see #unsetArrayDimensions()
	 * @see #setArrayDimensions(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDataTypeField_ArrayDimensions()
	 * @model default="" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.ArrayDimensions"
	 *        extendedMetaData="kind='attribute' name='ArrayDimensions'"
	 * @generated
	 */
	String getArrayDimensions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getArrayDimensions <em>Array Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Dimensions</em>' attribute.
	 * @see #isSetArrayDimensions()
	 * @see #unsetArrayDimensions()
	 * @see #getArrayDimensions()
	 * @generated
	 */
	void setArrayDimensions(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getArrayDimensions <em>Array Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArrayDimensions()
	 * @see #getArrayDimensions()
	 * @see #setArrayDimensions(String)
	 * @generated
	 */
	void unsetArrayDimensions();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getArrayDimensions <em>Array Dimensions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Array Dimensions</em>' attribute is set.
	 * @see #unsetArrayDimensions()
	 * @see #getArrayDimensions()
	 * @see #setArrayDimensions(String)
	 * @generated
	 */
	boolean isSetArrayDimensions();

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The default value is <code>"i=24"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #setDataType(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDataTypeField_DataType()
	 * @model default="i=24" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.NodeId"
	 *        extendedMetaData="kind='attribute' name='DataType'"
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataType()
	 * @see #getDataType()
	 * @see #setDataType(String)
	 * @generated
	 */
	void unsetDataType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getDataType <em>Data Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Type</em>' attribute is set.
	 * @see #unsetDataType()
	 * @see #getDataType()
	 * @see #setDataType(String)
	 * @generated
	 */
	boolean isSetDataType();

	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #isSetIsOptional()
	 * @see #unsetIsOptional()
	 * @see #setIsOptional(boolean)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDataTypeField_IsOptional()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsOptional'"
	 * @generated
	 */
	boolean isIsOptional();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #isSetIsOptional()
	 * @see #unsetIsOptional()
	 * @see #isIsOptional()
	 * @generated
	 */
	void setIsOptional(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsOptional()
	 * @see #isIsOptional()
	 * @see #setIsOptional(boolean)
	 * @generated
	 */
	void unsetIsOptional();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#isIsOptional <em>Is Optional</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Optional</em>' attribute is set.
	 * @see #unsetIsOptional()
	 * @see #isIsOptional()
	 * @see #setIsOptional(boolean)
	 * @generated
	 */
	boolean isSetIsOptional();

	/**
	 * Returns the value of the '<em><b>Max String Length</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max String Length</em>' attribute.
	 * @see #isSetMaxStringLength()
	 * @see #unsetMaxStringLength()
	 * @see #setMaxStringLength(long)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDataTypeField_MaxStringLength()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='MaxStringLength'"
	 * @generated
	 */
	long getMaxStringLength();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getMaxStringLength <em>Max String Length</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getMaxStringLength <em>Max String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxStringLength()
	 * @see #getMaxStringLength()
	 * @see #setMaxStringLength(long)
	 * @generated
	 */
	void unsetMaxStringLength();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getMaxStringLength <em>Max String Length</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDataTypeField_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbolic Name</em>' attribute.
	 * @see #setSymbolicName(List)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDataTypeField_SymbolicName()
	 * @model dataType="org.opcfoundation.ua._2011._03.ua.node.set.SymbolicName" many="false"
	 *        extendedMetaData="kind='attribute' name='SymbolicName'"
	 * @generated
	 */
	List<String> getSymbolicName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getSymbolicName <em>Symbolic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbolic Name</em>' attribute.
	 * @see #getSymbolicName()
	 * @generated
	 */
	void setSymbolicName(List<String> value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(int)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDataTypeField_Value()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='Value'"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(int)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(int)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Value Rank</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Rank</em>' attribute.
	 * @see #isSetValueRank()
	 * @see #unsetValueRank()
	 * @see #setValueRank(int)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getDataTypeField_ValueRank()
	 * @model default="-1" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.ValueRank"
	 *        extendedMetaData="kind='attribute' name='ValueRank'"
	 * @generated
	 */
	int getValueRank();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getValueRank <em>Value Rank</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getValueRank <em>Value Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValueRank()
	 * @see #getValueRank()
	 * @see #setValueRank(int)
	 * @generated
	 */
	void unsetValueRank();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypeField#getValueRank <em>Value Rank</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value Rank</em>' attribute is set.
	 * @see #unsetValueRank()
	 * @see #getValueRank()
	 * @see #setValueRank(int)
	 * @generated
	 */
	boolean isSetValueRank();

} // DataTypeField
