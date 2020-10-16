/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Type Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode#getValueRank <em>Value Rank</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode#getArrayDimensions <em>Array Dimensions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getVariableTypeNode()
 * @model extendedMetaData="name='VariableTypeNode' kind='elementOnly'"
 * @generated
 */
public interface VariableTypeNode extends TypeNode {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Variant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getVariableTypeNode_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	Variant getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Variant value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #setDataType(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getVariableTypeNode_DataType()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataType' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode#getDataType <em>Data Type</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataType()
	 * @see #getDataType()
	 * @see #setDataType(NodeId)
	 * @generated
	 */
	void unsetDataType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode#getDataType <em>Data Type</em>}' containment reference is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getVariableTypeNode_ValueRank()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='ValueRank' namespace='##targetNamespace'"
	 * @generated
	 */
	int getValueRank();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode#getValueRank <em>Value Rank</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode#getValueRank <em>Value Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValueRank()
	 * @see #getValueRank()
	 * @see #setValueRank(int)
	 * @generated
	 */
	void unsetValueRank();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode#getValueRank <em>Value Rank</em>}' attribute is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getVariableTypeNode_ArrayDimensions()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ArrayDimensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUInt32 getArrayDimensions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode#getArrayDimensions <em>Array Dimensions</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode#getArrayDimensions <em>Array Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArrayDimensions()
	 * @see #getArrayDimensions()
	 * @see #setArrayDimensions(ListOfUInt32)
	 * @generated
	 */
	void unsetArrayDimensions();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode#getArrayDimensions <em>Array Dimensions</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #isSetIsAbstract()
	 * @see #unsetIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getVariableTypeNode_IsAbstract()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsAbstract' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isSetIsAbstract()
	 * @see #unsetIsAbstract()
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAbstract()
	 * @see #isIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @generated
	 */
	void unsetIsAbstract();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableTypeNode#isIsAbstract <em>Is Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Abstract</em>' attribute is set.
	 * @see #unsetIsAbstract()
	 * @see #isIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @generated
	 */
	boolean isSetIsAbstract();

} // VariableTypeNode
