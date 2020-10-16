/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SimpleTypeDescription#getBaseDataType <em>Base Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SimpleTypeDescription#getBuiltInType <em>Built In Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSimpleTypeDescription()
 * @model extendedMetaData="name='SimpleTypeDescription' kind='elementOnly'"
 * @generated
 */
public interface SimpleTypeDescription extends DataTypeDescription {
	/**
	 * Returns the value of the '<em><b>Base Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Data Type</em>' containment reference.
	 * @see #isSetBaseDataType()
	 * @see #unsetBaseDataType()
	 * @see #setBaseDataType(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSimpleTypeDescription_BaseDataType()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='BaseDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getBaseDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SimpleTypeDescription#getBaseDataType <em>Base Data Type</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SimpleTypeDescription#getBaseDataType <em>Base Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaseDataType()
	 * @see #getBaseDataType()
	 * @see #setBaseDataType(NodeId)
	 * @generated
	 */
	void unsetBaseDataType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SimpleTypeDescription#getBaseDataType <em>Base Data Type</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Built In Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Built In Type</em>' attribute.
	 * @see #isSetBuiltInType()
	 * @see #unsetBuiltInType()
	 * @see #setBuiltInType(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSimpleTypeDescription_BuiltInType()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='element' name='BuiltInType' namespace='##targetNamespace'"
	 * @generated
	 */
	short getBuiltInType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SimpleTypeDescription#getBuiltInType <em>Built In Type</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SimpleTypeDescription#getBuiltInType <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBuiltInType()
	 * @see #getBuiltInType()
	 * @see #setBuiltInType(short)
	 * @generated
	 */
	void unsetBuiltInType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SimpleTypeDescription#getBuiltInType <em>Built In Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Built In Type</em>' attribute is set.
	 * @see #unsetBuiltInType()
	 * @see #getBuiltInType()
	 * @see #setBuiltInType(short)
	 * @generated
	 */
	boolean isSetBuiltInType();

} // SimpleTypeDescription
