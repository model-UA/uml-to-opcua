/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EnumDescription#getEnumDefinition <em>Enum Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EnumDescription#getBuiltInType <em>Built In Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEnumDescription()
 * @model extendedMetaData="name='EnumDescription' kind='elementOnly'"
 * @generated
 */
public interface EnumDescription extends DataTypeDescription {
	/**
	 * Returns the value of the '<em><b>Enum Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Definition</em>' containment reference.
	 * @see #isSetEnumDefinition()
	 * @see #unsetEnumDefinition()
	 * @see #setEnumDefinition(EnumDefinition)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEnumDescription_EnumDefinition()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='EnumDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EnumDefinition getEnumDefinition();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EnumDescription#getEnumDefinition <em>Enum Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Definition</em>' containment reference.
	 * @see #isSetEnumDefinition()
	 * @see #unsetEnumDefinition()
	 * @see #getEnumDefinition()
	 * @generated
	 */
	void setEnumDefinition(EnumDefinition value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EnumDescription#getEnumDefinition <em>Enum Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnumDefinition()
	 * @see #getEnumDefinition()
	 * @see #setEnumDefinition(EnumDefinition)
	 * @generated
	 */
	void unsetEnumDefinition();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EnumDescription#getEnumDefinition <em>Enum Definition</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enum Definition</em>' containment reference is set.
	 * @see #unsetEnumDefinition()
	 * @see #getEnumDefinition()
	 * @see #setEnumDefinition(EnumDefinition)
	 * @generated
	 */
	boolean isSetEnumDefinition();

	/**
	 * Returns the value of the '<em><b>Built In Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Built In Type</em>' attribute.
	 * @see #isSetBuiltInType()
	 * @see #unsetBuiltInType()
	 * @see #setBuiltInType(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEnumDescription_BuiltInType()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='element' name='BuiltInType' namespace='##targetNamespace'"
	 * @generated
	 */
	short getBuiltInType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EnumDescription#getBuiltInType <em>Built In Type</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EnumDescription#getBuiltInType <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBuiltInType()
	 * @see #getBuiltInType()
	 * @see #setBuiltInType(short)
	 * @generated
	 */
	void unsetBuiltInType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EnumDescription#getBuiltInType <em>Built In Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Built In Type</em>' attribute is set.
	 * @see #unsetBuiltInType()
	 * @see #getBuiltInType()
	 * @see #setBuiltInType(short)
	 * @generated
	 */
	boolean isSetBuiltInType();

} // EnumDescription
