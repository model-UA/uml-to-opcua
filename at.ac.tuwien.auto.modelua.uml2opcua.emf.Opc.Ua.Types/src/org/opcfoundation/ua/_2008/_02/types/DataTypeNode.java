/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataTypeNode#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataTypeNode#getDataTypeDefinition <em>Data Type Definition</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataTypeNode()
 * @model extendedMetaData="name='DataTypeNode' kind='elementOnly'"
 * @generated
 */
public interface DataTypeNode extends TypeNode {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #isSetIsAbstract()
	 * @see #unsetIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataTypeNode_IsAbstract()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsAbstract' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeNode#isIsAbstract <em>Is Abstract</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeNode#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAbstract()
	 * @see #isIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @generated
	 */
	void unsetIsAbstract();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeNode#isIsAbstract <em>Is Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Abstract</em>' attribute is set.
	 * @see #unsetIsAbstract()
	 * @see #isIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @generated
	 */
	boolean isSetIsAbstract();

	/**
	 * Returns the value of the '<em><b>Data Type Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Definition</em>' containment reference.
	 * @see #isSetDataTypeDefinition()
	 * @see #unsetDataTypeDefinition()
	 * @see #setDataTypeDefinition(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataTypeNode_DataTypeDefinition()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataTypeDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getDataTypeDefinition();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeNode#getDataTypeDefinition <em>Data Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Definition</em>' containment reference.
	 * @see #isSetDataTypeDefinition()
	 * @see #unsetDataTypeDefinition()
	 * @see #getDataTypeDefinition()
	 * @generated
	 */
	void setDataTypeDefinition(ExtensionObject value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeNode#getDataTypeDefinition <em>Data Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataTypeDefinition()
	 * @see #getDataTypeDefinition()
	 * @see #setDataTypeDefinition(ExtensionObject)
	 * @generated
	 */
	void unsetDataTypeDefinition();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataTypeNode#getDataTypeDefinition <em>Data Type Definition</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Type Definition</em>' containment reference is set.
	 * @see #unsetDataTypeDefinition()
	 * @see #getDataTypeDefinition()
	 * @see #setDataTypeDefinition(ExtensionObject)
	 * @generated
	 */
	boolean isSetDataTypeDefinition();

} // DataTypeNode
