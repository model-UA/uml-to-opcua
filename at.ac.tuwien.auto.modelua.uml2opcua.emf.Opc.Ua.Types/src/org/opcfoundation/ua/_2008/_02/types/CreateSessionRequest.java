/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Session Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getClientDescription <em>Client Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getServerUri <em>Server Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getEndpointUrl <em>Endpoint Url</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getSessionName <em>Session Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getClientNonce <em>Client Nonce</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getClientCertificate <em>Client Certificate</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getRequestedSessionTimeout <em>Requested Session Timeout</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getMaxResponseMessageSize <em>Max Response Message Size</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionRequest()
 * @model extendedMetaData="name='CreateSessionRequest' kind='elementOnly'"
 * @generated
 */
public interface CreateSessionRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Client Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Description</em>' containment reference.
	 * @see #isSetClientDescription()
	 * @see #unsetClientDescription()
	 * @see #setClientDescription(ApplicationDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionRequest_ClientDescription()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ClientDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicationDescription getClientDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getClientDescription <em>Client Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Description</em>' containment reference.
	 * @see #isSetClientDescription()
	 * @see #unsetClientDescription()
	 * @see #getClientDescription()
	 * @generated
	 */
	void setClientDescription(ApplicationDescription value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getClientDescription <em>Client Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientDescription()
	 * @see #getClientDescription()
	 * @see #setClientDescription(ApplicationDescription)
	 * @generated
	 */
	void unsetClientDescription();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getClientDescription <em>Client Description</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client Description</em>' containment reference is set.
	 * @see #unsetClientDescription()
	 * @see #getClientDescription()
	 * @see #setClientDescription(ApplicationDescription)
	 * @generated
	 */
	boolean isSetClientDescription();

	/**
	 * Returns the value of the '<em><b>Server Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Uri</em>' attribute.
	 * @see #isSetServerUri()
	 * @see #unsetServerUri()
	 * @see #setServerUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionRequest_ServerUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ServerUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServerUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getServerUri <em>Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Uri</em>' attribute.
	 * @see #isSetServerUri()
	 * @see #unsetServerUri()
	 * @see #getServerUri()
	 * @generated
	 */
	void setServerUri(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getServerUri <em>Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerUri()
	 * @see #getServerUri()
	 * @see #setServerUri(String)
	 * @generated
	 */
	void unsetServerUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getServerUri <em>Server Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Uri</em>' attribute is set.
	 * @see #unsetServerUri()
	 * @see #getServerUri()
	 * @see #setServerUri(String)
	 * @generated
	 */
	boolean isSetServerUri();

	/**
	 * Returns the value of the '<em><b>Endpoint Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Url</em>' attribute.
	 * @see #isSetEndpointUrl()
	 * @see #unsetEndpointUrl()
	 * @see #setEndpointUrl(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionRequest_EndpointUrl()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='EndpointUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEndpointUrl();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getEndpointUrl <em>Endpoint Url</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getEndpointUrl <em>Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndpointUrl()
	 * @see #getEndpointUrl()
	 * @see #setEndpointUrl(String)
	 * @generated
	 */
	void unsetEndpointUrl();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getEndpointUrl <em>Endpoint Url</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Session Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Name</em>' attribute.
	 * @see #isSetSessionName()
	 * @see #unsetSessionName()
	 * @see #setSessionName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionRequest_SessionName()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SessionName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSessionName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getSessionName <em>Session Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Name</em>' attribute.
	 * @see #isSetSessionName()
	 * @see #unsetSessionName()
	 * @see #getSessionName()
	 * @generated
	 */
	void setSessionName(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getSessionName <em>Session Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSessionName()
	 * @see #getSessionName()
	 * @see #setSessionName(String)
	 * @generated
	 */
	void unsetSessionName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getSessionName <em>Session Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Session Name</em>' attribute is set.
	 * @see #unsetSessionName()
	 * @see #getSessionName()
	 * @see #setSessionName(String)
	 * @generated
	 */
	boolean isSetSessionName();

	/**
	 * Returns the value of the '<em><b>Client Nonce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Nonce</em>' attribute.
	 * @see #isSetClientNonce()
	 * @see #unsetClientNonce()
	 * @see #setClientNonce(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionRequest_ClientNonce()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='ClientNonce' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getClientNonce();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getClientNonce <em>Client Nonce</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getClientNonce <em>Client Nonce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientNonce()
	 * @see #getClientNonce()
	 * @see #setClientNonce(byte[])
	 * @generated
	 */
	void unsetClientNonce();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getClientNonce <em>Client Nonce</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Client Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Certificate</em>' attribute.
	 * @see #isSetClientCertificate()
	 * @see #unsetClientCertificate()
	 * @see #setClientCertificate(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionRequest_ClientCertificate()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='ClientCertificate' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getClientCertificate();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getClientCertificate <em>Client Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Certificate</em>' attribute.
	 * @see #isSetClientCertificate()
	 * @see #unsetClientCertificate()
	 * @see #getClientCertificate()
	 * @generated
	 */
	void setClientCertificate(byte[] value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getClientCertificate <em>Client Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientCertificate()
	 * @see #getClientCertificate()
	 * @see #setClientCertificate(byte[])
	 * @generated
	 */
	void unsetClientCertificate();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getClientCertificate <em>Client Certificate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client Certificate</em>' attribute is set.
	 * @see #unsetClientCertificate()
	 * @see #getClientCertificate()
	 * @see #setClientCertificate(byte[])
	 * @generated
	 */
	boolean isSetClientCertificate();

	/**
	 * Returns the value of the '<em><b>Requested Session Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Session Timeout</em>' attribute.
	 * @see #isSetRequestedSessionTimeout()
	 * @see #unsetRequestedSessionTimeout()
	 * @see #setRequestedSessionTimeout(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionRequest_RequestedSessionTimeout()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='RequestedSessionTimeout' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRequestedSessionTimeout();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getRequestedSessionTimeout <em>Requested Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Session Timeout</em>' attribute.
	 * @see #isSetRequestedSessionTimeout()
	 * @see #unsetRequestedSessionTimeout()
	 * @see #getRequestedSessionTimeout()
	 * @generated
	 */
	void setRequestedSessionTimeout(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getRequestedSessionTimeout <em>Requested Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestedSessionTimeout()
	 * @see #getRequestedSessionTimeout()
	 * @see #setRequestedSessionTimeout(double)
	 * @generated
	 */
	void unsetRequestedSessionTimeout();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getRequestedSessionTimeout <em>Requested Session Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Requested Session Timeout</em>' attribute is set.
	 * @see #unsetRequestedSessionTimeout()
	 * @see #getRequestedSessionTimeout()
	 * @see #setRequestedSessionTimeout(double)
	 * @generated
	 */
	boolean isSetRequestedSessionTimeout();

	/**
	 * Returns the value of the '<em><b>Max Response Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Response Message Size</em>' attribute.
	 * @see #isSetMaxResponseMessageSize()
	 * @see #unsetMaxResponseMessageSize()
	 * @see #setMaxResponseMessageSize(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionRequest_MaxResponseMessageSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MaxResponseMessageSize' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMaxResponseMessageSize();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getMaxResponseMessageSize <em>Max Response Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Response Message Size</em>' attribute.
	 * @see #isSetMaxResponseMessageSize()
	 * @see #unsetMaxResponseMessageSize()
	 * @see #getMaxResponseMessageSize()
	 * @generated
	 */
	void setMaxResponseMessageSize(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getMaxResponseMessageSize <em>Max Response Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxResponseMessageSize()
	 * @see #getMaxResponseMessageSize()
	 * @see #setMaxResponseMessageSize(long)
	 * @generated
	 */
	void unsetMaxResponseMessageSize();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionRequest#getMaxResponseMessageSize <em>Max Response Message Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Response Message Size</em>' attribute is set.
	 * @see #unsetMaxResponseMessageSize()
	 * @see #getMaxResponseMessageSize()
	 * @see #setMaxResponseMessageSize(long)
	 * @generated
	 */
	boolean isSetMaxResponseMessageSize();

} // CreateSessionRequest
