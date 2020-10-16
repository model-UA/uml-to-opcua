/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signed Software Certificate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SignedSoftwareCertificate#getCertificateData <em>Certificate Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SignedSoftwareCertificate#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSignedSoftwareCertificate()
 * @model extendedMetaData="name='SignedSoftwareCertificate' kind='elementOnly'"
 * @generated
 */
public interface SignedSoftwareCertificate extends EObject {
	/**
	 * Returns the value of the '<em><b>Certificate Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate Data</em>' attribute.
	 * @see #isSetCertificateData()
	 * @see #unsetCertificateData()
	 * @see #setCertificateData(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSignedSoftwareCertificate_CertificateData()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='CertificateData' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getCertificateData();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SignedSoftwareCertificate#getCertificateData <em>Certificate Data</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SignedSoftwareCertificate#getCertificateData <em>Certificate Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCertificateData()
	 * @see #getCertificateData()
	 * @see #setCertificateData(byte[])
	 * @generated
	 */
	void unsetCertificateData();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SignedSoftwareCertificate#getCertificateData <em>Certificate Data</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Certificate Data</em>' attribute is set.
	 * @see #unsetCertificateData()
	 * @see #getCertificateData()
	 * @see #setCertificateData(byte[])
	 * @generated
	 */
	boolean isSetCertificateData();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #isSetSignature()
	 * @see #unsetSignature()
	 * @see #setSignature(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSignedSoftwareCertificate_Signature()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='Signature' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getSignature();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SignedSoftwareCertificate#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #isSetSignature()
	 * @see #unsetSignature()
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(byte[] value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SignedSoftwareCertificate#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignature()
	 * @see #getSignature()
	 * @see #setSignature(byte[])
	 * @generated
	 */
	void unsetSignature();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SignedSoftwareCertificate#getSignature <em>Signature</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Signature</em>' attribute is set.
	 * @see #unsetSignature()
	 * @see #getSignature()
	 * @see #setSignature(byte[])
	 * @generated
	 */
	boolean isSetSignature();

} // SignedSoftwareCertificate
