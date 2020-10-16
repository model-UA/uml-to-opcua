/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>X509 Identity Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.X509IdentityToken#getCertificateData <em>Certificate Data</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getX509IdentityToken()
 * @model extendedMetaData="name='X509IdentityToken' kind='elementOnly'"
 * @generated
 */
public interface X509IdentityToken extends UserIdentityToken {
	/**
	 * Returns the value of the '<em><b>Certificate Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate Data</em>' attribute.
	 * @see #isSetCertificateData()
	 * @see #unsetCertificateData()
	 * @see #setCertificateData(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getX509IdentityToken_CertificateData()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='CertificateData' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getCertificateData();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.X509IdentityToken#getCertificateData <em>Certificate Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Data</em>' attribute.
	 * @see #isSetCertificateData()
	 * @see #unsetCertificateData()
	 * @see #getCertificateData()
	 * @generated
	 */
	void setCertificateData(byte[] value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.X509IdentityToken#getCertificateData <em>Certificate Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCertificateData()
	 * @see #getCertificateData()
	 * @see #setCertificateData(byte[])
	 * @generated
	 */
	void unsetCertificateData();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.X509IdentityToken#getCertificateData <em>Certificate Data</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Certificate Data</em>' attribute is set.
	 * @see #unsetCertificateData()
	 * @see #getCertificateData()
	 * @see #setCertificateData(byte[])
	 * @generated
	 */
	boolean isSetCertificateData();

} // X509IdentityToken
