/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EnumDefinition#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEnumDefinition()
 * @model extendedMetaData="name='EnumDefinition' kind='elementOnly'"
 * @generated
 */
public interface EnumDefinition extends DataTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference.
	 * @see #isSetFields()
	 * @see #unsetFields()
	 * @see #setFields(ListOfEnumField)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEnumDefinition_Fields()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Fields' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfEnumField getFields();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EnumDefinition#getFields <em>Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fields</em>' containment reference.
	 * @see #isSetFields()
	 * @see #unsetFields()
	 * @see #getFields()
	 * @generated
	 */
	void setFields(ListOfEnumField value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EnumDefinition#getFields <em>Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFields()
	 * @see #getFields()
	 * @see #setFields(ListOfEnumField)
	 * @generated
	 */
	void unsetFields();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EnumDefinition#getFields <em>Fields</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fields</em>' containment reference is set.
	 * @see #unsetFields()
	 * @see #getFields()
	 * @see #setFields(ListOfEnumField)
	 * @generated
	 */
	boolean isSetFields();

} // EnumDefinition
