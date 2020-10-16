/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAType#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAType()
 * @model extendedMetaData="name='UAType' kind='elementOnly'"
 * @generated
 */
public interface UAType extends UANode {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #isSetIsAbstract()
	 * @see #unsetIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAType_IsAbstract()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsAbstract'"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAType#isIsAbstract <em>Is Abstract</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAType#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAbstract()
	 * @see #isIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @generated
	 */
	void unsetIsAbstract();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAType#isIsAbstract <em>Is Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Abstract</em>' attribute is set.
	 * @see #unsetIsAbstract()
	 * @see #isIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @generated
	 */
	boolean isSetIsAbstract();

} // UAType
