/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Secure Channel Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getClientProtocolVersion <em>Client Protocol Version</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getRequestType <em>Request Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getSecurityMode <em>Security Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getClientNonce <em>Client Nonce</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getRequestedLifetime <em>Requested Lifetime</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getOpenSecureChannelRequest()
 * @model extendedMetaData="name='OpenSecureChannelRequest' kind='elementOnly'"
 * @generated
 */
public interface OpenSecureChannelRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getOpenSecureChannelRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Client Protocol Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Protocol Version</em>' attribute.
	 * @see #isSetClientProtocolVersion()
	 * @see #unsetClientProtocolVersion()
	 * @see #setClientProtocolVersion(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getOpenSecureChannelRequest_ClientProtocolVersion()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='ClientProtocolVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	long getClientProtocolVersion();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getClientProtocolVersion <em>Client Protocol Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Protocol Version</em>' attribute.
	 * @see #isSetClientProtocolVersion()
	 * @see #unsetClientProtocolVersion()
	 * @see #getClientProtocolVersion()
	 * @generated
	 */
	void setClientProtocolVersion(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getClientProtocolVersion <em>Client Protocol Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientProtocolVersion()
	 * @see #getClientProtocolVersion()
	 * @see #setClientProtocolVersion(long)
	 * @generated
	 */
	void unsetClientProtocolVersion();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getClientProtocolVersion <em>Client Protocol Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client Protocol Version</em>' attribute is set.
	 * @see #unsetClientProtocolVersion()
	 * @see #getClientProtocolVersion()
	 * @see #setClientProtocolVersion(long)
	 * @generated
	 */
	boolean isSetClientProtocolVersion();

	/**
	 * Returns the value of the '<em><b>Request Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.SecurityTokenRequestType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.SecurityTokenRequestType
	 * @see #isSetRequestType()
	 * @see #unsetRequestType()
	 * @see #setRequestType(SecurityTokenRequestType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getOpenSecureChannelRequest_RequestType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestType' namespace='##targetNamespace'"
	 * @generated
	 */
	SecurityTokenRequestType getRequestType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getRequestType <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.SecurityTokenRequestType
	 * @see #isSetRequestType()
	 * @see #unsetRequestType()
	 * @see #getRequestType()
	 * @generated
	 */
	void setRequestType(SecurityTokenRequestType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getRequestType <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestType()
	 * @see #getRequestType()
	 * @see #setRequestType(SecurityTokenRequestType)
	 * @generated
	 */
	void unsetRequestType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getRequestType <em>Request Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Request Type</em>' attribute is set.
	 * @see #unsetRequestType()
	 * @see #getRequestType()
	 * @see #setRequestType(SecurityTokenRequestType)
	 * @generated
	 */
	boolean isSetRequestType();

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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getOpenSecureChannelRequest_SecurityMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SecurityMode' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageSecurityMode getSecurityMode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getSecurityMode <em>Security Mode</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getSecurityMode <em>Security Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityMode()
	 * @see #getSecurityMode()
	 * @see #setSecurityMode(MessageSecurityMode)
	 * @generated
	 */
	void unsetSecurityMode();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getSecurityMode <em>Security Mode</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Client Nonce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Nonce</em>' attribute.
	 * @see #isSetClientNonce()
	 * @see #unsetClientNonce()
	 * @see #setClientNonce(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getOpenSecureChannelRequest_ClientNonce()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='ClientNonce' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getClientNonce();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getClientNonce <em>Client Nonce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Nonce</em>' attribute.
	 * @see #isSetClientNonce()
	 * @see #unsetClientNonce()
	 * @see #getClientNonce()
	 * @generated
	 */
	void setClientNonce(byte[] value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getClientNonce <em>Client Nonce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientNonce()
	 * @see #getClientNonce()
	 * @see #setClientNonce(byte[])
	 * @generated
	 */
	void unsetClientNonce();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getClientNonce <em>Client Nonce</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client Nonce</em>' attribute is set.
	 * @see #unsetClientNonce()
	 * @see #getClientNonce()
	 * @see #setClientNonce(byte[])
	 * @generated
	 */
	boolean isSetClientNonce();

	/**
	 * Returns the value of the '<em><b>Requested Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Lifetime</em>' attribute.
	 * @see #isSetRequestedLifetime()
	 * @see #unsetRequestedLifetime()
	 * @see #setRequestedLifetime(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getOpenSecureChannelRequest_RequestedLifetime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RequestedLifetime' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRequestedLifetime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getRequestedLifetime <em>Requested Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Lifetime</em>' attribute.
	 * @see #isSetRequestedLifetime()
	 * @see #unsetRequestedLifetime()
	 * @see #getRequestedLifetime()
	 * @generated
	 */
	void setRequestedLifetime(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getRequestedLifetime <em>Requested Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestedLifetime()
	 * @see #getRequestedLifetime()
	 * @see #setRequestedLifetime(long)
	 * @generated
	 */
	void unsetRequestedLifetime();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest#getRequestedLifetime <em>Requested Lifetime</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Requested Lifetime</em>' attribute is set.
	 * @see #unsetRequestedLifetime()
	 * @see #getRequestedLifetime()
	 * @see #setRequestedLifetime(long)
	 * @generated
	 */
	boolean isSetRequestedLifetime();

} // OpenSecureChannelRequest
