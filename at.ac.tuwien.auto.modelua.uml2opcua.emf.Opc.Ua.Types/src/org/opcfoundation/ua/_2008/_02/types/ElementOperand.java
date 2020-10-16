/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ElementOperand#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getElementOperand()
 * @model extendedMetaData="name='ElementOperand' kind='elementOnly'"
 * @generated
 */
public interface ElementOperand extends FilterOperand {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #isSetIndex()
	 * @see #unsetIndex()
	 * @see #setIndex(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getElementOperand_Index()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='Index' namespace='##targetNamespace'"
	 * @generated
	 */
	long getIndex();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ElementOperand#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #isSetIndex()
	 * @see #unsetIndex()
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ElementOperand#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndex()
	 * @see #getIndex()
	 * @see #setIndex(long)
	 * @generated
	 */
	void unsetIndex();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ElementOperand#getIndex <em>Index</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Index</em>' attribute is set.
	 * @see #unsetIndex()
	 * @see #getIndex()
	 * @see #setIndex(long)
	 * @generated
	 */
	boolean isSetIndex();

} // ElementOperand
