/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Secure Channel Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse#getServerProtocolVersion <em>Server Protocol Version</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse#getSecurityToken <em>Security Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse#getServerNonce <em>Server Nonce</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getOpenSecureChannelResponse()
 * @model extendedMetaData="name='OpenSecureChannelResponse' kind='elementOnly'"
 * @generated
 */
public interface OpenSecureChannelResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getOpenSecureChannelResponse_ResponseHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ResponseHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseHeader getResponseHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #getResponseHeader()
	 * @generated
	 */
	void setResponseHeader(ResponseHeader value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	void unsetResponseHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse#getResponseHeader <em>Response Header</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Response Header</em>' containment reference is set.
	 * @see #unsetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	boolean isSetResponseHeader();

	/**
	 * Returns the value of the '<em><b>Server Protocol Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Protocol Version</em>' attribute.
	 * @see #isSetServerProtocolVersion()
	 * @see #unsetServerProtocolVersion()
	 * @see #setServerProtocolVersion(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getOpenSecureChannelResponse_ServerProtocolVersion()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='ServerProtocolVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	long getServerProtocolVersion();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse#getServerProtocolVersion <em>Server Protocol Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Protocol Version</em>' attribute.
	 * @see #isSetServerProtocolVersion()
	 * @see #unsetServerProtocolVersion()
	 * @see #getServerProtocolVersion()
	 * @generated
	 */
	void setServerProtocolVersion(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse#getServerProtocolVersion <em>Server Protocol Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerProtocolVersion()
	 * @see #getServerProtocolVersion()
	 * @see #setServerProtocolVersion(long)
	 * @generated
	 */
	void unsetServerProtocolVersion();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse#getServerProtocolVersion <em>Server Protocol Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Protocol Version</em>' attribute is set.
	 * @see #unsetServerProtocolVersion()
	 * @see #getServerProtocolVersion()
	 * @see #setServerProtocolVersion(long)
	 * @generated
	 */
	boolean isSetServerProtocolVersion();

	/**
	 * Returns the value of the '<em><b>Security Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Token</em>' containment reference.
	 * @see #isSetSecurityToken()
	 * @see #unsetSecurityToken()
	 * @see #setSecurityToken(ChannelSecurityToken)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getOpenSecureChannelResponse_SecurityToken()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SecurityToken' namespace='##targetNamespace'"
	 * @generated
	 */
	ChannelSecurityToken getSecurityToken();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse#getSecurityToken <em>Security Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Token</em>' containment reference.
	 * @see #isSetSecurityToken()
	 * @see #unsetSecurityToken()
	 * @see #getSecurityToken()
	 * @generated
	 */
	void setSecurityToken(ChannelSecurityToken value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse#getSecurityToken <em>Security Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityToken()
	 * @see #getSecurityToken()
	 * @see #setSecurityToken(ChannelSecurityToken)
	 * @generated
	 */
	void unsetSecurityToken();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse#getSecurityToken <em>Security Token</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security Token</em>' containment reference is set.
	 * @see #unsetSecurityToken()
	 * @see #getSecurityToken()
	 * @see #setSecurityToken(ChannelSecurityToken)
	 * @generated
	 */
	boolean isSetSecurityToken();

	/**
	 * Returns the value of the '<em><b>Server Nonce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Nonce</em>' attribute.
	 * @see #isSetServerNonce()
	 * @see #unsetServerNonce()
	 * @see #setServerNonce(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getOpenSecureChannelResponse_ServerNonce()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='ServerNonce' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getServerNonce();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse#getServerNonce <em>Server Nonce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Nonce</em>' attribute.
	 * @see #isSetServerNonce()
	 * @see #unsetServerNonce()
	 * @see #getServerNonce()
	 * @generated
	 */
	void setServerNonce(byte[] value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse#getServerNonce <em>Server Nonce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerNonce()
	 * @see #getServerNonce()
	 * @see #setServerNonce(byte[])
	 * @generated
	 */
	void unsetServerNonce();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse#getServerNonce <em>Server Nonce</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Nonce</em>' attribute is set.
	 * @see #unsetServerNonce()
	 * @see #getServerNonce()
	 * @see #setServerNonce(byte[])
	 * @generated
	 */
	boolean isSetServerNonce();

} // OpenSecureChannelResponse
