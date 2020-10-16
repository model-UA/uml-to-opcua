/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issued Identity Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.IssuedIdentityToken#getTokenData <em>Token Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.IssuedIdentityToken#getEncryptionAlgorithm <em>Encryption Algorithm</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getIssuedIdentityToken()
 * @model extendedMetaData="name='IssuedIdentityToken' kind='elementOnly'"
 * @generated
 */
public interface IssuedIdentityToken extends UserIdentityToken {
	/**
	 * Returns the value of the '<em><b>Token Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Data</em>' attribute.
	 * @see #isSetTokenData()
	 * @see #unsetTokenData()
	 * @see #setTokenData(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getIssuedIdentityToken_TokenData()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='TokenData' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getTokenData();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.IssuedIdentityToken#getTokenData <em>Token Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Data</em>' attribute.
	 * @see #isSetTokenData()
	 * @see #unsetTokenData()
	 * @see #getTokenData()
	 * @generated
	 */
	void setTokenData(byte[] value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.IssuedIdentityToken#getTokenData <em>Token Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTokenData()
	 * @see #getTokenData()
	 * @see #setTokenData(byte[])
	 * @generated
	 */
	void unsetTokenData();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.IssuedIdentityToken#getTokenData <em>Token Data</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Token Data</em>' attribute is set.
	 * @see #unsetTokenData()
	 * @see #getTokenData()
	 * @see #setTokenData(byte[])
	 * @generated
	 */
	boolean isSetTokenData();

	/**
	 * Returns the value of the '<em><b>Encryption Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Algorithm</em>' attribute.
	 * @see #isSetEncryptionAlgorithm()
	 * @see #unsetEncryptionAlgorithm()
	 * @see #setEncryptionAlgorithm(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getIssuedIdentityToken_EncryptionAlgorithm()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='EncryptionAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEncryptionAlgorithm();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.IssuedIdentityToken#getEncryptionAlgorithm <em>Encryption Algorithm</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.IssuedIdentityToken#getEncryptionAlgorithm <em>Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEncryptionAlgorithm()
	 * @see #getEncryptionAlgorithm()
	 * @see #setEncryptionAlgorithm(String)
	 * @generated
	 */
	void unsetEncryptionAlgorithm();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.IssuedIdentityToken#getEncryptionAlgorithm <em>Encryption Algorithm</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Encryption Algorithm</em>' attribute is set.
	 * @see #unsetEncryptionAlgorithm()
	 * @see #getEncryptionAlgorithm()
	 * @see #setEncryptionAlgorithm(String)
	 * @generated
	 */
	boolean isSetEncryptionAlgorithm();

} // IssuedIdentityToken
