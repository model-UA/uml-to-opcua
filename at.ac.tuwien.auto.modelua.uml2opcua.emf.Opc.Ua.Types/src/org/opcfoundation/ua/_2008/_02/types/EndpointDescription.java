/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getEndpointUrl <em>Endpoint Url</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getServer <em>Server</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getServerCertificate <em>Server Certificate</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getSecurityMode <em>Security Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getSecurityPolicyUri <em>Security Policy Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getUserIdentityTokens <em>User Identity Tokens</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getTransportProfileUri <em>Transport Profile Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getSecurityLevel <em>Security Level</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointDescription()
 * @model extendedMetaData="name='EndpointDescription' kind='elementOnly'"
 * @generated
 */
public interface EndpointDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Endpoint Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Url</em>' attribute.
	 * @see #isSetEndpointUrl()
	 * @see #unsetEndpointUrl()
	 * @see #setEndpointUrl(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointDescription_EndpointUrl()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='EndpointUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEndpointUrl();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getEndpointUrl <em>Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Url</em>' attribute.
	 * @see #isSetEndpointUrl()
	 * @see #unsetEndpointUrl()
	 * @see #getEndpointUrl()
	 * @generated
	 */
	void setEndpointUrl(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getEndpointUrl <em>Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndpointUrl()
	 * @see #getEndpointUrl()
	 * @see #setEndpointUrl(String)
	 * @generated
	 */
	void unsetEndpointUrl();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getEndpointUrl <em>Endpoint Url</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Endpoint Url</em>' attribute is set.
	 * @see #unsetEndpointUrl()
	 * @see #getEndpointUrl()
	 * @see #setEndpointUrl(String)
	 * @generated
	 */
	boolean isSetEndpointUrl();

	/**
	 * Returns the value of the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' containment reference.
	 * @see #isSetServer()
	 * @see #unsetServer()
	 * @see #setServer(ApplicationDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointDescription_Server()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Server' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicationDescription getServer();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getServer <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' containment reference.
	 * @see #isSetServer()
	 * @see #unsetServer()
	 * @see #getServer()
	 * @generated
	 */
	void setServer(ApplicationDescription value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getServer <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServer()
	 * @see #getServer()
	 * @see #setServer(ApplicationDescription)
	 * @generated
	 */
	void unsetServer();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getServer <em>Server</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server</em>' containment reference is set.
	 * @see #unsetServer()
	 * @see #getServer()
	 * @see #setServer(ApplicationDescription)
	 * @generated
	 */
	boolean isSetServer();

	/**
	 * Returns the value of the '<em><b>Server Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Certificate</em>' attribute.
	 * @see #isSetServerCertificate()
	 * @see #unsetServerCertificate()
	 * @see #setServerCertificate(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointDescription_ServerCertificate()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='ServerCertificate' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getServerCertificate();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getServerCertificate <em>Server Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Certificate</em>' attribute.
	 * @see #isSetServerCertificate()
	 * @see #unsetServerCertificate()
	 * @see #getServerCertificate()
	 * @generated
	 */
	void setServerCertificate(byte[] value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getServerCertificate <em>Server Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerCertificate()
	 * @see #getServerCertificate()
	 * @see #setServerCertificate(byte[])
	 * @generated
	 */
	void unsetServerCertificate();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getServerCertificate <em>Server Certificate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Certificate</em>' attribute is set.
	 * @see #unsetServerCertificate()
	 * @see #getServerCertificate()
	 * @see #setServerCertificate(byte[])
	 * @generated
	 */
	boolean isSetServerCertificate();

	/**
	 * Returns the value of the '<em><b>Security Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.MessageSecurityMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Mode</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.MessageSecurityMode
	 * @see #isSetSecurityMode()
	 * @see #unsetSecurityMode()
	 * @see #setSecurityMode(MessageSecurityMode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointDescription_SecurityMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SecurityMode' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageSecurityMode getSecurityMode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getSecurityMode <em>Security Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Mode</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.MessageSecurityMode
	 * @see #isSetSecurityMode()
	 * @see #unsetSecurityMode()
	 * @see #getSecurityMode()
	 * @generated
	 */
	void setSecurityMode(MessageSecurityMode value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getSecurityMode <em>Security Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityMode()
	 * @see #getSecurityMode()
	 * @see #setSecurityMode(MessageSecurityMode)
	 * @generated
	 */
	void unsetSecurityMode();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getSecurityMode <em>Security Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security Mode</em>' attribute is set.
	 * @see #unsetSecurityMode()
	 * @see #getSecurityMode()
	 * @see #setSecurityMode(MessageSecurityMode)
	 * @generated
	 */
	boolean isSetSecurityMode();

	/**
	 * Returns the value of the '<em><b>Security Policy Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Policy Uri</em>' attribute.
	 * @see #isSetSecurityPolicyUri()
	 * @see #unsetSecurityPolicyUri()
	 * @see #setSecurityPolicyUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointDescription_SecurityPolicyUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SecurityPolicyUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecurityPolicyUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getSecurityPolicyUri <em>Security Policy Uri</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getSecurityPolicyUri <em>Security Policy Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityPolicyUri()
	 * @see #getSecurityPolicyUri()
	 * @see #setSecurityPolicyUri(String)
	 * @generated
	 */
	void unsetSecurityPolicyUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getSecurityPolicyUri <em>Security Policy Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security Policy Uri</em>' attribute is set.
	 * @see #unsetSecurityPolicyUri()
	 * @see #getSecurityPolicyUri()
	 * @see #setSecurityPolicyUri(String)
	 * @generated
	 */
	boolean isSetSecurityPolicyUri();

	/**
	 * Returns the value of the '<em><b>User Identity Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Identity Tokens</em>' containment reference.
	 * @see #isSetUserIdentityTokens()
	 * @see #unsetUserIdentityTokens()
	 * @see #setUserIdentityTokens(ListOfUserTokenPolicy)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointDescription_UserIdentityTokens()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='UserIdentityTokens' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUserTokenPolicy getUserIdentityTokens();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getUserIdentityTokens <em>User Identity Tokens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Identity Tokens</em>' containment reference.
	 * @see #isSetUserIdentityTokens()
	 * @see #unsetUserIdentityTokens()
	 * @see #getUserIdentityTokens()
	 * @generated
	 */
	void setUserIdentityTokens(ListOfUserTokenPolicy value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getUserIdentityTokens <em>User Identity Tokens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserIdentityTokens()
	 * @see #getUserIdentityTokens()
	 * @see #setUserIdentityTokens(ListOfUserTokenPolicy)
	 * @generated
	 */
	void unsetUserIdentityTokens();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getUserIdentityTokens <em>User Identity Tokens</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Identity Tokens</em>' containment reference is set.
	 * @see #unsetUserIdentityTokens()
	 * @see #getUserIdentityTokens()
	 * @see #setUserIdentityTokens(ListOfUserTokenPolicy)
	 * @generated
	 */
	boolean isSetUserIdentityTokens();

	/**
	 * Returns the value of the '<em><b>Transport Profile Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Profile Uri</em>' attribute.
	 * @see #isSetTransportProfileUri()
	 * @see #unsetTransportProfileUri()
	 * @see #setTransportProfileUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointDescription_TransportProfileUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='TransportProfileUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransportProfileUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getTransportProfileUri <em>Transport Profile Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Profile Uri</em>' attribute.
	 * @see #isSetTransportProfileUri()
	 * @see #unsetTransportProfileUri()
	 * @see #getTransportProfileUri()
	 * @generated
	 */
	void setTransportProfileUri(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getTransportProfileUri <em>Transport Profile Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportProfileUri()
	 * @see #getTransportProfileUri()
	 * @see #setTransportProfileUri(String)
	 * @generated
	 */
	void unsetTransportProfileUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getTransportProfileUri <em>Transport Profile Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transport Profile Uri</em>' attribute is set.
	 * @see #unsetTransportProfileUri()
	 * @see #getTransportProfileUri()
	 * @see #setTransportProfileUri(String)
	 * @generated
	 */
	boolean isSetTransportProfileUri();

	/**
	 * Returns the value of the '<em><b>Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level</em>' attribute.
	 * @see #isSetSecurityLevel()
	 * @see #unsetSecurityLevel()
	 * @see #setSecurityLevel(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointDescription_SecurityLevel()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='element' name='SecurityLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	short getSecurityLevel();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getSecurityLevel <em>Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level</em>' attribute.
	 * @see #isSetSecurityLevel()
	 * @see #unsetSecurityLevel()
	 * @see #getSecurityLevel()
	 * @generated
	 */
	void setSecurityLevel(short value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getSecurityLevel <em>Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityLevel()
	 * @see #getSecurityLevel()
	 * @see #setSecurityLevel(short)
	 * @generated
	 */
	void unsetSecurityLevel();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointDescription#getSecurityLevel <em>Security Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security Level</em>' attribute is set.
	 * @see #unsetSecurityLevel()
	 * @see #getSecurityLevel()
	 * @see #setSecurityLevel(short)
	 * @generated
	 */
	boolean isSetSecurityLevel();

} // EndpointDescription
