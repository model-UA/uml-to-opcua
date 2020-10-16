/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.GenericAttributes#getAttributeValues <em>Attribute Values</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getGenericAttributes()
 * @model extendedMetaData="name='GenericAttributes' kind='elementOnly'"
 * @generated
 */
public interface GenericAttributes extends NodeAttributes {
	/**
	 * Returns the value of the '<em><b>Attribute Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Values</em>' containment reference.
	 * @see #isSetAttributeValues()
	 * @see #unsetAttributeValues()
	 * @see #setAttributeValues(ListOfGenericAttributeValue)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getGenericAttributes_AttributeValues()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AttributeValues' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfGenericAttributeValue getAttributeValues();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.GenericAttributes#getAttributeValues <em>Attribute Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Values</em>' containment reference.
	 * @see #isSetAttributeValues()
	 * @see #unsetAttributeValues()
	 * @see #getAttributeValues()
	 * @generated
	 */
	void setAttributeValues(ListOfGenericAttributeValue value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.GenericAttributes#getAttributeValues <em>Attribute Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttributeValues()
	 * @see #getAttributeValues()
	 * @see #setAttributeValues(ListOfGenericAttributeValue)
	 * @generated
	 */
	void unsetAttributeValues();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.GenericAttributes#getAttributeValues <em>Attribute Values</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attribute Values</em>' containment reference is set.
	 * @see #unsetAttributeValues()
	 * @see #getAttributeValues()
	 * @see #setAttributeValues(ListOfGenericAttributeValue)
	 * @generated
	 */
	boolean isSetAttributeValues();

} // GenericAttributes
