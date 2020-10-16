/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Type Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ObjectTypeAttributes#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getObjectTypeAttributes()
 * @model extendedMetaData="name='ObjectTypeAttributes' kind='elementOnly'"
 * @generated
 */
public interface ObjectTypeAttributes extends NodeAttributes {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #isSetIsAbstract()
	 * @see #unsetIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getObjectTypeAttributes_IsAbstract()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsAbstract' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ObjectTypeAttributes#isIsAbstract <em>Is Abstract</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ObjectTypeAttributes#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAbstract()
	 * @see #isIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @generated
	 */
	void unsetIsAbstract();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ObjectTypeAttributes#isIsAbstract <em>Is Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Abstract</em>' attribute is set.
	 * @see #unsetIsAbstract()
	 * @see #isIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @generated
	 */
	boolean isSetIsAbstract();

} // ObjectTypeAttributes
