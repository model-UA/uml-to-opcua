/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Name Identity Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UserNameIdentityToken#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UserNameIdentityToken#getPassword <em>Password</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UserNameIdentityToken#getEncryptionAlgorithm <em>Encryption Algorithm</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUserNameIdentityToken()
 * @model extendedMetaData="name='UserNameIdentityToken' kind='elementOnly'"
 * @generated
 */
public interface UserNameIdentityToken extends UserIdentityToken {
	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #isSetUserName()
	 * @see #unsetUserName()
	 * @see #setUserName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUserNameIdentityToken_UserName()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='UserName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UserNameIdentityToken#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #isSetUserName()
	 * @see #unsetUserName()
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UserNameIdentityToken#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserName()
	 * @see #getUserName()
	 * @see #setUserName(String)
	 * @generated
	 */
	void unsetUserName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UserNameIdentityToken#getUserName <em>User Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Name</em>' attribute is set.
	 * @see #unsetUserName()
	 * @see #getUserName()
	 * @see #setUserName(String)
	 * @generated
	 */
	boolean isSetUserName();

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #isSetPassword()
	 * @see #unsetPassword()
	 * @see #setPassword(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUserNameIdentityToken_Password()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='Password' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getPassword();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UserNameIdentityToken#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #isSetPassword()
	 * @see #unsetPassword()
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(byte[] value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UserNameIdentityToken#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPassword()
	 * @see #getPassword()
	 * @see #setPassword(byte[])
	 * @generated
	 */
	void unsetPassword();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UserNameIdentityToken#getPassword <em>Password</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Password</em>' attribute is set.
	 * @see #unsetPassword()
	 * @see #getPassword()
	 * @see #setPassword(byte[])
	 * @generated
	 */
	boolean isSetPassword();

	/**
	 * Returns the value of the '<em><b>Encryption Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Algorithm</em>' attribute.
	 * @see #isSetEncryptionAlgorithm()
	 * @see #unsetEncryptionAlgorithm()
	 * @see #setEncryptionAlgorithm(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUserNameIdentityToken_EncryptionAlgorithm()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='EncryptionAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEncryptionAlgorithm();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UserNameIdentityToken#getEncryptionAlgorithm <em>Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Algorithm</em>' attribute.
	 * @see #isSetEncryptionAlgorithm()
	 * @see #unsetEncryptionAlgorithm()
	 * @see #getEncryptionAlgorithm()
	 * @generated
	 */
	void setEncryptionAlgorithm(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UserNameIdentityToken#getEncryptionAlgorithm <em>Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEncryptionAlgorithm()
	 * @see #getEncryptionAlgorithm()
	 * @see #setEncryptionAlgorithm(String)
	 * @generated
	 */
	void unsetEncryptionAlgorithm();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UserNameIdentityToken#getEncryptionAlgorithm <em>Encryption Algorithm</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Encryption Algorithm</em>' attribute is set.
	 * @see #unsetEncryptionAlgorithm()
	 * @see #getEncryptionAlgorithm()
	 * @see #setEncryptionAlgorithm(String)
	 * @generated
	 */
	boolean isSetEncryptionAlgorithm();

} // UserNameIdentityToken
