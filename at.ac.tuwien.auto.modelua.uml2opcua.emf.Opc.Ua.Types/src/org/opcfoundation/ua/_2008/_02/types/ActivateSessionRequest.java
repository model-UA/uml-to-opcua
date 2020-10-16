/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activate Session Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getClientSignature <em>Client Signature</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getClientSoftwareCertificates <em>Client Software Certificates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getLocaleIds <em>Locale Ids</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getUserIdentityToken <em>User Identity Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getUserTokenSignature <em>User Token Signature</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getActivateSessionRequest()
 * @model extendedMetaData="name='ActivateSessionRequest' kind='elementOnly'"
 * @generated
 */
public interface ActivateSessionRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getActivateSessionRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #getRequestHeader()
	 * @generated
	 */
	void setRequestHeader(RequestHeader value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Request Header</em>' containment reference is set.
	 * @see #unsetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	boolean isSetRequestHeader();

	/**
	 * Returns the value of the '<em><b>Client Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Signature</em>' containment reference.
	 * @see #isSetClientSignature()
	 * @see #unsetClientSignature()
	 * @see #setClientSignature(SignatureData)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getActivateSessionRequest_ClientSignature()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ClientSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatureData getClientSignature();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getClientSignature <em>Client Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Signature</em>' containment reference.
	 * @see #isSetClientSignature()
	 * @see #unsetClientSignature()
	 * @see #getClientSignature()
	 * @generated
	 */
	void setClientSignature(SignatureData value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getClientSignature <em>Client Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientSignature()
	 * @see #getClientSignature()
	 * @see #setClientSignature(SignatureData)
	 * @generated
	 */
	void unsetClientSignature();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getClientSignature <em>Client Signature</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client Signature</em>' containment reference is set.
	 * @see #unsetClientSignature()
	 * @see #getClientSignature()
	 * @see #setClientSignature(SignatureData)
	 * @generated
	 */
	boolean isSetClientSignature();

	/**
	 * Returns the value of the '<em><b>Client Software Certificates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Software Certificates</em>' containment reference.
	 * @see #isSetClientSoftwareCertificates()
	 * @see #unsetClientSoftwareCertificates()
	 * @see #setClientSoftwareCertificates(ListOfSignedSoftwareCertificate)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getActivateSessionRequest_ClientSoftwareCertificates()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ClientSoftwareCertificates' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfSignedSoftwareCertificate getClientSoftwareCertificates();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getClientSoftwareCertificates <em>Client Software Certificates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Software Certificates</em>' containment reference.
	 * @see #isSetClientSoftwareCertificates()
	 * @see #unsetClientSoftwareCertificates()
	 * @see #getClientSoftwareCertificates()
	 * @generated
	 */
	void setClientSoftwareCertificates(ListOfSignedSoftwareCertificate value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getClientSoftwareCertificates <em>Client Software Certificates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientSoftwareCertificates()
	 * @see #getClientSoftwareCertificates()
	 * @see #setClientSoftwareCertificates(ListOfSignedSoftwareCertificate)
	 * @generated
	 */
	void unsetClientSoftwareCertificates();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getClientSoftwareCertificates <em>Client Software Certificates</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client Software Certificates</em>' containment reference is set.
	 * @see #unsetClientSoftwareCertificates()
	 * @see #getClientSoftwareCertificates()
	 * @see #setClientSoftwareCertificates(ListOfSignedSoftwareCertificate)
	 * @generated
	 */
	boolean isSetClientSoftwareCertificates();

	/**
	 * Returns the value of the '<em><b>Locale Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale Ids</em>' containment reference.
	 * @see #isSetLocaleIds()
	 * @see #unsetLocaleIds()
	 * @see #setLocaleIds(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getActivateSessionRequest_LocaleIds()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LocaleIds' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getLocaleIds();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getLocaleIds <em>Locale Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale Ids</em>' containment reference.
	 * @see #isSetLocaleIds()
	 * @see #unsetLocaleIds()
	 * @see #getLocaleIds()
	 * @generated
	 */
	void setLocaleIds(ListOfString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getLocaleIds <em>Locale Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocaleIds()
	 * @see #getLocaleIds()
	 * @see #setLocaleIds(ListOfString)
	 * @generated
	 */
	void unsetLocaleIds();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getLocaleIds <em>Locale Ids</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Locale Ids</em>' containment reference is set.
	 * @see #unsetLocaleIds()
	 * @see #getLocaleIds()
	 * @see #setLocaleIds(ListOfString)
	 * @generated
	 */
	boolean isSetLocaleIds();

	/**
	 * Returns the value of the '<em><b>User Identity Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Identity Token</em>' containment reference.
	 * @see #isSetUserIdentityToken()
	 * @see #unsetUserIdentityToken()
	 * @see #setUserIdentityToken(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getActivateSessionRequest_UserIdentityToken()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='UserIdentityToken' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getUserIdentityToken();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getUserIdentityToken <em>User Identity Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Identity Token</em>' containment reference.
	 * @see #isSetUserIdentityToken()
	 * @see #unsetUserIdentityToken()
	 * @see #getUserIdentityToken()
	 * @generated
	 */
	void setUserIdentityToken(ExtensionObject value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getUserIdentityToken <em>User Identity Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserIdentityToken()
	 * @see #getUserIdentityToken()
	 * @see #setUserIdentityToken(ExtensionObject)
	 * @generated
	 */
	void unsetUserIdentityToken();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getUserIdentityToken <em>User Identity Token</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Identity Token</em>' containment reference is set.
	 * @see #unsetUserIdentityToken()
	 * @see #getUserIdentityToken()
	 * @see #setUserIdentityToken(ExtensionObject)
	 * @generated
	 */
	boolean isSetUserIdentityToken();

	/**
	 * Returns the value of the '<em><b>User Token Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Token Signature</em>' containment reference.
	 * @see #isSetUserTokenSignature()
	 * @see #unsetUserTokenSignature()
	 * @see #setUserTokenSignature(SignatureData)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getActivateSessionRequest_UserTokenSignature()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='UserTokenSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatureData getUserTokenSignature();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getUserTokenSignature <em>User Token Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Token Signature</em>' containment reference.
	 * @see #isSetUserTokenSignature()
	 * @see #unsetUserTokenSignature()
	 * @see #getUserTokenSignature()
	 * @generated
	 */
	void setUserTokenSignature(SignatureData value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getUserTokenSignature <em>User Token Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserTokenSignature()
	 * @see #getUserTokenSignature()
	 * @see #setUserTokenSignature(SignatureData)
	 * @generated
	 */
	void unsetUserTokenSignature();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ActivateSessionRequest#getUserTokenSignature <em>User Token Signature</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Token Signature</em>' containment reference is set.
	 * @see #unsetUserTokenSignature()
	 * @see #getUserTokenSignature()
	 * @see #setUserTokenSignature(SignatureData)
	 * @generated
	 */
	boolean isSetUserTokenSignature();

} // ActivateSessionRequest
