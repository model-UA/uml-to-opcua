/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UADataType#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UADataType#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUADataType()
 * @model extendedMetaData="name='UADataType' kind='elementOnly'"
 * @generated
 */
public interface UADataType extends UAType {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(DataTypeDefinition)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUADataType_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Definition' namespace='##targetNamespace'"
	 * @generated
	 */
	DataTypeDefinition getDefinition();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UADataType#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(DataTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * The default value is <code>"Normal"</code>.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2011._03.ua.node.set.DataTypePurpose}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypePurpose
	 * @see #isSetPurpose()
	 * @see #unsetPurpose()
	 * @see #setPurpose(DataTypePurpose)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUADataType_Purpose()
	 * @model default="Normal" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Purpose'"
	 * @generated
	 */
	DataTypePurpose getPurpose();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UADataType#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.DataTypePurpose
	 * @see #isSetPurpose()
	 * @see #unsetPurpose()
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(DataTypePurpose value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UADataType#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPurpose()
	 * @see #getPurpose()
	 * @see #setPurpose(DataTypePurpose)
	 * @generated
	 */
	void unsetPurpose();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UADataType#getPurpose <em>Purpose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Purpose</em>' attribute is set.
	 * @see #unsetPurpose()
	 * @see #getPurpose()
	 * @see #setPurpose(DataTypePurpose)
	 * @generated
	 */
	boolean isSetPurpose();

} // UADataType
