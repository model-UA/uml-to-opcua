/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MethodAttributes#isExecutable <em>Executable</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MethodAttributes#isUserExecutable <em>User Executable</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMethodAttributes()
 * @model extendedMetaData="name='MethodAttributes' kind='elementOnly'"
 * @generated
 */
public interface MethodAttributes extends NodeAttributes {
	/**
	 * Returns the value of the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable</em>' attribute.
	 * @see #isSetExecutable()
	 * @see #unsetExecutable()
	 * @see #setExecutable(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMethodAttributes_Executable()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Executable' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isExecutable();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MethodAttributes#isExecutable <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executable</em>' attribute.
	 * @see #isSetExecutable()
	 * @see #unsetExecutable()
	 * @see #isExecutable()
	 * @generated
	 */
	void setExecutable(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MethodAttributes#isExecutable <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExecutable()
	 * @see #isExecutable()
	 * @see #setExecutable(boolean)
	 * @generated
	 */
	void unsetExecutable();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MethodAttributes#isExecutable <em>Executable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Executable</em>' attribute is set.
	 * @see #unsetExecutable()
	 * @see #isExecutable()
	 * @see #setExecutable(boolean)
	 * @generated
	 */
	boolean isSetExecutable();

	/**
	 * Returns the value of the '<em><b>User Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Executable</em>' attribute.
	 * @see #isSetUserExecutable()
	 * @see #unsetUserExecutable()
	 * @see #setUserExecutable(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMethodAttributes_UserExecutable()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='UserExecutable' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUserExecutable();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MethodAttributes#isUserExecutable <em>User Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Executable</em>' attribute.
	 * @see #isSetUserExecutable()
	 * @see #unsetUserExecutable()
	 * @see #isUserExecutable()
	 * @generated
	 */
	void setUserExecutable(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MethodAttributes#isUserExecutable <em>User Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserExecutable()
	 * @see #isUserExecutable()
	 * @see #setUserExecutable(boolean)
	 * @generated
	 */
	void unsetUserExecutable();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MethodAttributes#isUserExecutable <em>User Executable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Executable</em>' attribute is set.
	 * @see #unsetUserExecutable()
	 * @see #isUserExecutable()
	 * @see #setUserExecutable(boolean)
	 * @generated
	 */
	boolean isSetUserExecutable();

} // MethodAttributes
