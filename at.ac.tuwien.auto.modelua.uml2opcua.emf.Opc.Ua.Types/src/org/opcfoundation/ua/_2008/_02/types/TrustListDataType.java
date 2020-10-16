/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trust List Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getSpecifiedLists <em>Specified Lists</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getTrustedCertificates <em>Trusted Certificates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getTrustedCrls <em>Trusted Crls</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getIssuerCertificates <em>Issuer Certificates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getIssuerCrls <em>Issuer Crls</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTrustListDataType()
 * @model extendedMetaData="name='TrustListDataType' kind='elementOnly'"
 * @generated
 */
public interface TrustListDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Specified Lists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specified Lists</em>' attribute.
	 * @see #isSetSpecifiedLists()
	 * @see #unsetSpecifiedLists()
	 * @see #setSpecifiedLists(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTrustListDataType_SpecifiedLists()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='SpecifiedLists' namespace='##targetNamespace'"
	 * @generated
	 */
	long getSpecifiedLists();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getSpecifiedLists <em>Specified Lists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specified Lists</em>' attribute.
	 * @see #isSetSpecifiedLists()
	 * @see #unsetSpecifiedLists()
	 * @see #getSpecifiedLists()
	 * @generated
	 */
	void setSpecifiedLists(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getSpecifiedLists <em>Specified Lists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecifiedLists()
	 * @see #getSpecifiedLists()
	 * @see #setSpecifiedLists(long)
	 * @generated
	 */
	void unsetSpecifiedLists();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getSpecifiedLists <em>Specified Lists</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specified Lists</em>' attribute is set.
	 * @see #unsetSpecifiedLists()
	 * @see #getSpecifiedLists()
	 * @see #setSpecifiedLists(long)
	 * @generated
	 */
	boolean isSetSpecifiedLists();

	/**
	 * Returns the value of the '<em><b>Trusted Certificates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trusted Certificates</em>' containment reference.
	 * @see #isSetTrustedCertificates()
	 * @see #unsetTrustedCertificates()
	 * @see #setTrustedCertificates(ListOfByteString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTrustListDataType_TrustedCertificates()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TrustedCertificates' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfByteString getTrustedCertificates();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getTrustedCertificates <em>Trusted Certificates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trusted Certificates</em>' containment reference.
	 * @see #isSetTrustedCertificates()
	 * @see #unsetTrustedCertificates()
	 * @see #getTrustedCertificates()
	 * @generated
	 */
	void setTrustedCertificates(ListOfByteString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getTrustedCertificates <em>Trusted Certificates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrustedCertificates()
	 * @see #getTrustedCertificates()
	 * @see #setTrustedCertificates(ListOfByteString)
	 * @generated
	 */
	void unsetTrustedCertificates();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getTrustedCertificates <em>Trusted Certificates</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trusted Certificates</em>' containment reference is set.
	 * @see #unsetTrustedCertificates()
	 * @see #getTrustedCertificates()
	 * @see #setTrustedCertificates(ListOfByteString)
	 * @generated
	 */
	boolean isSetTrustedCertificates();

	/**
	 * Returns the value of the '<em><b>Trusted Crls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trusted Crls</em>' containment reference.
	 * @see #isSetTrustedCrls()
	 * @see #unsetTrustedCrls()
	 * @see #setTrustedCrls(ListOfByteString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTrustListDataType_TrustedCrls()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TrustedCrls' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfByteString getTrustedCrls();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getTrustedCrls <em>Trusted Crls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trusted Crls</em>' containment reference.
	 * @see #isSetTrustedCrls()
	 * @see #unsetTrustedCrls()
	 * @see #getTrustedCrls()
	 * @generated
	 */
	void setTrustedCrls(ListOfByteString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getTrustedCrls <em>Trusted Crls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrustedCrls()
	 * @see #getTrustedCrls()
	 * @see #setTrustedCrls(ListOfByteString)
	 * @generated
	 */
	void unsetTrustedCrls();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getTrustedCrls <em>Trusted Crls</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trusted Crls</em>' containment reference is set.
	 * @see #unsetTrustedCrls()
	 * @see #getTrustedCrls()
	 * @see #setTrustedCrls(ListOfByteString)
	 * @generated
	 */
	boolean isSetTrustedCrls();

	/**
	 * Returns the value of the '<em><b>Issuer Certificates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuer Certificates</em>' containment reference.
	 * @see #isSetIssuerCertificates()
	 * @see #unsetIssuerCertificates()
	 * @see #setIssuerCertificates(ListOfByteString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTrustListDataType_IssuerCertificates()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IssuerCertificates' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfByteString getIssuerCertificates();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getIssuerCertificates <em>Issuer Certificates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Certificates</em>' containment reference.
	 * @see #isSetIssuerCertificates()
	 * @see #unsetIssuerCertificates()
	 * @see #getIssuerCertificates()
	 * @generated
	 */
	void setIssuerCertificates(ListOfByteString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getIssuerCertificates <em>Issuer Certificates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIssuerCertificates()
	 * @see #getIssuerCertificates()
	 * @see #setIssuerCertificates(ListOfByteString)
	 * @generated
	 */
	void unsetIssuerCertificates();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getIssuerCertificates <em>Issuer Certificates</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Issuer Certificates</em>' containment reference is set.
	 * @see #unsetIssuerCertificates()
	 * @see #getIssuerCertificates()
	 * @see #setIssuerCertificates(ListOfByteString)
	 * @generated
	 */
	boolean isSetIssuerCertificates();

	/**
	 * Returns the value of the '<em><b>Issuer Crls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuer Crls</em>' containment reference.
	 * @see #isSetIssuerCrls()
	 * @see #unsetIssuerCrls()
	 * @see #setIssuerCrls(ListOfByteString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTrustListDataType_IssuerCrls()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IssuerCrls' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfByteString getIssuerCrls();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getIssuerCrls <em>Issuer Crls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Crls</em>' containment reference.
	 * @see #isSetIssuerCrls()
	 * @see #unsetIssuerCrls()
	 * @see #getIssuerCrls()
	 * @generated
	 */
	void setIssuerCrls(ListOfByteString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getIssuerCrls <em>Issuer Crls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIssuerCrls()
	 * @see #getIssuerCrls()
	 * @see #setIssuerCrls(ListOfByteString)
	 * @generated
	 */
	void unsetIssuerCrls();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.TrustListDataType#getIssuerCrls <em>Issuer Crls</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Issuer Crls</em>' containment reference is set.
	 * @see #unsetIssuerCrls()
	 * @see #getIssuerCrls()
	 * @see #setIssuerCrls(ListOfByteString)
	 * @generated
	 */
	boolean isSetIssuerCrls();

} // TrustListDataType
