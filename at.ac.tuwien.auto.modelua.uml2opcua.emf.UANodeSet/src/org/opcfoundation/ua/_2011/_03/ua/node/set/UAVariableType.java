/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Variable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getArrayDimensions <em>Array Dimensions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getValueRank <em>Value Rank</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAVariableType()
 * @model extendedMetaData="name='UAVariableType' kind='elementOnly'"
 * @generated
 */
public interface UAVariableType extends UAType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueType)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAVariableType_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueType getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueType value);

	/**
	 * Returns the value of the '<em><b>Array Dimensions</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Dimensions</em>' attribute.
	 * @see #isSetArrayDimensions()
	 * @see #unsetArrayDimensions()
	 * @see #setArrayDimensions(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAVariableType_ArrayDimensions()
	 * @model default="" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.ArrayDimensions"
	 *        extendedMetaData="kind='attribute' name='ArrayDimensions'"
	 * @generated
	 */
	String getArrayDimensions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getArrayDimensions <em>Array Dimensions</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getArrayDimensions <em>Array Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArrayDimensions()
	 * @see #getArrayDimensions()
	 * @see #setArrayDimensions(String)
	 * @generated
	 */
	void unsetArrayDimensions();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getArrayDimensions <em>Array Dimensions</em>}' attribute is set.
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
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAVariableType_DataType()
	 * @model default="i=24" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.NodeId"
	 *        extendedMetaData="kind='attribute' name='DataType'"
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getDataType <em>Data Type</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataType()
	 * @see #getDataType()
	 * @see #setDataType(String)
	 * @generated
	 */
	void unsetDataType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getDataType <em>Data Type</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Value Rank</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Rank</em>' attribute.
	 * @see #isSetValueRank()
	 * @see #unsetValueRank()
	 * @see #setValueRank(int)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAVariableType_ValueRank()
	 * @model default="-1" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.ValueRank"
	 *        extendedMetaData="kind='attribute' name='ValueRank'"
	 * @generated
	 */
	int getValueRank();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getValueRank <em>Value Rank</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getValueRank <em>Value Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValueRank()
	 * @see #getValueRank()
	 * @see #setValueRank(int)
	 * @generated
	 */
	void unsetValueRank();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariableType#getValueRank <em>Value Rank</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value Rank</em>' attribute is set.
	 * @see #unsetValueRank()
	 * @see #getValueRank()
	 * @see #setValueRank(int)
	 * @generated
	 */
	boolean isSetValueRank();

} // UAVariableType
