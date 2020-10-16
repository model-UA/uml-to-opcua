/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Token Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getPolicyId <em>Policy Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getTokenType <em>Token Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getIssuedTokenType <em>Issued Token Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getIssuerEndpointUrl <em>Issuer Endpoint Url</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getSecurityPolicyUri <em>Security Policy Uri</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUserTokenPolicy()
 * @model extendedMetaData="name='UserTokenPolicy' kind='elementOnly'"
 * @generated
 */
public interface UserTokenPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Policy Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Id</em>' attribute.
	 * @see #isSetPolicyId()
	 * @see #unsetPolicyId()
	 * @see #setPolicyId(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUserTokenPolicy_PolicyId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='PolicyId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPolicyId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getPolicyId <em>Policy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Id</em>' attribute.
	 * @see #isSetPolicyId()
	 * @see #unsetPolicyId()
	 * @see #getPolicyId()
	 * @generated
	 */
	void setPolicyId(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getPolicyId <em>Policy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPolicyId()
	 * @see #getPolicyId()
	 * @see #setPolicyId(String)
	 * @generated
	 */
	void unsetPolicyId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getPolicyId <em>Policy Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Policy Id</em>' attribute is set.
	 * @see #unsetPolicyId()
	 * @see #getPolicyId()
	 * @see #setPolicyId(String)
	 * @generated
	 */
	boolean isSetPolicyId();

	/**
	 * Returns the value of the '<em><b>Token Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.UserTokenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.UserTokenType
	 * @see #isSetTokenType()
	 * @see #unsetTokenType()
	 * @see #setTokenType(UserTokenType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUserTokenPolicy_TokenType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TokenType' namespace='##targetNamespace'"
	 * @generated
	 */
	UserTokenType getTokenType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getTokenType <em>Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.UserTokenType
	 * @see #isSetTokenType()
	 * @see #unsetTokenType()
	 * @see #getTokenType()
	 * @generated
	 */
	void setTokenType(UserTokenType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getTokenType <em>Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTokenType()
	 * @see #getTokenType()
	 * @see #setTokenType(UserTokenType)
	 * @generated
	 */
	void unsetTokenType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getTokenType <em>Token Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Token Type</em>' attribute is set.
	 * @see #unsetTokenType()
	 * @see #getTokenType()
	 * @see #setTokenType(UserTokenType)
	 * @generated
	 */
	boolean isSetTokenType();

	/**
	 * Returns the value of the '<em><b>Issued Token Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued Token Type</em>' attribute.
	 * @see #isSetIssuedTokenType()
	 * @see #unsetIssuedTokenType()
	 * @see #setIssuedTokenType(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUserTokenPolicy_IssuedTokenType()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='IssuedTokenType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIssuedTokenType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getIssuedTokenType <em>Issued Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued Token Type</em>' attribute.
	 * @see #isSetIssuedTokenType()
	 * @see #unsetIssuedTokenType()
	 * @see #getIssuedTokenType()
	 * @generated
	 */
	void setIssuedTokenType(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getIssuedTokenType <em>Issued Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIssuedTokenType()
	 * @see #getIssuedTokenType()
	 * @see #setIssuedTokenType(String)
	 * @generated
	 */
	void unsetIssuedTokenType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getIssuedTokenType <em>Issued Token Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Issued Token Type</em>' attribute is set.
	 * @see #unsetIssuedTokenType()
	 * @see #getIssuedTokenType()
	 * @see #setIssuedTokenType(String)
	 * @generated
	 */
	boolean isSetIssuedTokenType();

	/**
	 * Returns the value of the '<em><b>Issuer Endpoint Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuer Endpoint Url</em>' attribute.
	 * @see #isSetIssuerEndpointUrl()
	 * @see #unsetIssuerEndpointUrl()
	 * @see #setIssuerEndpointUrl(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUserTokenPolicy_IssuerEndpointUrl()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='IssuerEndpointUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIssuerEndpointUrl();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getIssuerEndpointUrl <em>Issuer Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Endpoint Url</em>' attribute.
	 * @see #isSetIssuerEndpointUrl()
	 * @see #unsetIssuerEndpointUrl()
	 * @see #getIssuerEndpointUrl()
	 * @generated
	 */
	void setIssuerEndpointUrl(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getIssuerEndpointUrl <em>Issuer Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIssuerEndpointUrl()
	 * @see #getIssuerEndpointUrl()
	 * @see #setIssuerEndpointUrl(String)
	 * @generated
	 */
	void unsetIssuerEndpointUrl();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getIssuerEndpointUrl <em>Issuer Endpoint Url</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Issuer Endpoint Url</em>' attribute is set.
	 * @see #unsetIssuerEndpointUrl()
	 * @see #getIssuerEndpointUrl()
	 * @see #setIssuerEndpointUrl(String)
	 * @generated
	 */
	boolean isSetIssuerEndpointUrl();

	/**
	 * Returns the value of the '<em><b>Security Policy Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Policy Uri</em>' attribute.
	 * @see #isSetSecurityPolicyUri()
	 * @see #unsetSecurityPolicyUri()
	 * @see #setSecurityPolicyUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUserTokenPolicy_SecurityPolicyUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SecurityPolicyUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecurityPolicyUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getSecurityPolicyUri <em>Security Policy Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Policy Uri</em>' attribute.
	 * @see #isSetSecurityPolicyUri()
	 * @see #unsetSecurityPolicyUri()
	 * @see #getSecurityPolicyUri()
	 * @generated
	 */
	void setSecurityPolicyUri(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getSecurityPolicyUri <em>Security Policy Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityPolicyUri()
	 * @see #getSecurityPolicyUri()
	 * @see #setSecurityPolicyUri(String)
	 * @generated
	 */
	void unsetSecurityPolicyUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy#getSecurityPolicyUri <em>Security Policy Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security Policy Uri</em>' attribute is set.
	 * @see #unsetSecurityPolicyUri()
	 * @see #getSecurityPolicyUri()
	 * @see #setSecurityPolicyUri(String)
	 * @generated
	 */
	boolean isSetSecurityPolicyUri();

} // UserTokenPolicy
