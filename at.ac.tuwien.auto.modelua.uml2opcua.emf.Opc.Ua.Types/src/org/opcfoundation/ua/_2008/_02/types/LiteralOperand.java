/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.LiteralOperand#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getLiteralOperand()
 * @model extendedMetaData="name='LiteralOperand' kind='elementOnly'"
 * @generated
 */
public interface LiteralOperand extends FilterOperand {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Variant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getLiteralOperand_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	Variant getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.LiteralOperand#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Variant value);

} // LiteralOperand
