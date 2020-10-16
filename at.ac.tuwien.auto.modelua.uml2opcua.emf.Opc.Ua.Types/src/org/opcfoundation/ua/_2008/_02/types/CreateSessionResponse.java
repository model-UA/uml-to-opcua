/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Session Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getSessionId <em>Session Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getAuthenticationToken <em>Authentication Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getRevisedSessionTimeout <em>Revised Session Timeout</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerNonce <em>Server Nonce</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerCertificate <em>Server Certificate</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerEndpoints <em>Server Endpoints</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerSoftwareCertificates <em>Server Software Certificates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerSignature <em>Server Signature</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getMaxRequestMessageSize <em>Max Request Message Size</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionResponse()
 * @model extendedMetaData="name='CreateSessionResponse' kind='elementOnly'"
 * @generated
 */
public interface CreateSessionResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionResponse_ResponseHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ResponseHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseHeader getResponseHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getResponseHeader <em>Response Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	void unsetResponseHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getResponseHeader <em>Response Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Session Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Id</em>' containment reference.
	 * @see #isSetSessionId()
	 * @see #unsetSessionId()
	 * @see #setSessionId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionResponse_SessionId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SessionId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getSessionId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getSessionId <em>Session Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Id</em>' containment reference.
	 * @see #isSetSessionId()
	 * @see #unsetSessionId()
	 * @see #getSessionId()
	 * @generated
	 */
	void setSessionId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getSessionId <em>Session Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSessionId()
	 * @see #getSessionId()
	 * @see #setSessionId(NodeId)
	 * @generated
	 */
	void unsetSessionId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getSessionId <em>Session Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Session Id</em>' containment reference is set.
	 * @see #unsetSessionId()
	 * @see #getSessionId()
	 * @see #setSessionId(NodeId)
	 * @generated
	 */
	boolean isSetSessionId();

	/**
	 * Returns the value of the '<em><b>Authentication Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Token</em>' containment reference.
	 * @see #isSetAuthenticationToken()
	 * @see #unsetAuthenticationToken()
	 * @see #setAuthenticationToken(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionResponse_AuthenticationToken()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AuthenticationToken' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getAuthenticationToken();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getAuthenticationToken <em>Authentication Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Token</em>' containment reference.
	 * @see #isSetAuthenticationToken()
	 * @see #unsetAuthenticationToken()
	 * @see #getAuthenticationToken()
	 * @generated
	 */
	void setAuthenticationToken(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getAuthenticationToken <em>Authentication Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuthenticationToken()
	 * @see #getAuthenticationToken()
	 * @see #setAuthenticationToken(NodeId)
	 * @generated
	 */
	void unsetAuthenticationToken();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getAuthenticationToken <em>Authentication Token</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Authentication Token</em>' containment reference is set.
	 * @see #unsetAuthenticationToken()
	 * @see #getAuthenticationToken()
	 * @see #setAuthenticationToken(NodeId)
	 * @generated
	 */
	boolean isSetAuthenticationToken();

	/**
	 * Returns the value of the '<em><b>Revised Session Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revised Session Timeout</em>' attribute.
	 * @see #isSetRevisedSessionTimeout()
	 * @see #unsetRevisedSessionTimeout()
	 * @see #setRevisedSessionTimeout(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionResponse_RevisedSessionTimeout()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='RevisedSessionTimeout' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRevisedSessionTimeout();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getRevisedSessionTimeout <em>Revised Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revised Session Timeout</em>' attribute.
	 * @see #isSetRevisedSessionTimeout()
	 * @see #unsetRevisedSessionTimeout()
	 * @see #getRevisedSessionTimeout()
	 * @generated
	 */
	void setRevisedSessionTimeout(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getRevisedSessionTimeout <em>Revised Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisedSessionTimeout()
	 * @see #getRevisedSessionTimeout()
	 * @see #setRevisedSessionTimeout(double)
	 * @generated
	 */
	void unsetRevisedSessionTimeout();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getRevisedSessionTimeout <em>Revised Session Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revised Session Timeout</em>' attribute is set.
	 * @see #unsetRevisedSessionTimeout()
	 * @see #getRevisedSessionTimeout()
	 * @see #setRevisedSessionTimeout(double)
	 * @generated
	 */
	boolean isSetRevisedSessionTimeout();

	/**
	 * Returns the value of the '<em><b>Server Nonce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Nonce</em>' attribute.
	 * @see #isSetServerNonce()
	 * @see #unsetServerNonce()
	 * @see #setServerNonce(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionResponse_ServerNonce()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='ServerNonce' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getServerNonce();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerNonce <em>Server Nonce</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerNonce <em>Server Nonce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerNonce()
	 * @see #getServerNonce()
	 * @see #setServerNonce(byte[])
	 * @generated
	 */
	void unsetServerNonce();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerNonce <em>Server Nonce</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Nonce</em>' attribute is set.
	 * @see #unsetServerNonce()
	 * @see #getServerNonce()
	 * @see #setServerNonce(byte[])
	 * @generated
	 */
	boolean isSetServerNonce();

	/**
	 * Returns the value of the '<em><b>Server Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Certificate</em>' attribute.
	 * @see #isSetServerCertificate()
	 * @see #unsetServerCertificate()
	 * @see #setServerCertificate(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionResponse_ServerCertificate()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='ServerCertificate' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getServerCertificate();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerCertificate <em>Server Certificate</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerCertificate <em>Server Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerCertificate()
	 * @see #getServerCertificate()
	 * @see #setServerCertificate(byte[])
	 * @generated
	 */
	void unsetServerCertificate();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerCertificate <em>Server Certificate</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Server Endpoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Endpoints</em>' containment reference.
	 * @see #isSetServerEndpoints()
	 * @see #unsetServerEndpoints()
	 * @see #setServerEndpoints(ListOfEndpointDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionResponse_ServerEndpoints()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ServerEndpoints' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfEndpointDescription getServerEndpoints();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerEndpoints <em>Server Endpoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Endpoints</em>' containment reference.
	 * @see #isSetServerEndpoints()
	 * @see #unsetServerEndpoints()
	 * @see #getServerEndpoints()
	 * @generated
	 */
	void setServerEndpoints(ListOfEndpointDescription value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerEndpoints <em>Server Endpoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerEndpoints()
	 * @see #getServerEndpoints()
	 * @see #setServerEndpoints(ListOfEndpointDescription)
	 * @generated
	 */
	void unsetServerEndpoints();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerEndpoints <em>Server Endpoints</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Endpoints</em>' containment reference is set.
	 * @see #unsetServerEndpoints()
	 * @see #getServerEndpoints()
	 * @see #setServerEndpoints(ListOfEndpointDescription)
	 * @generated
	 */
	boolean isSetServerEndpoints();

	/**
	 * Returns the value of the '<em><b>Server Software Certificates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Software Certificates</em>' containment reference.
	 * @see #isSetServerSoftwareCertificates()
	 * @see #unsetServerSoftwareCertificates()
	 * @see #setServerSoftwareCertificates(ListOfSignedSoftwareCertificate)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionResponse_ServerSoftwareCertificates()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ServerSoftwareCertificates' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfSignedSoftwareCertificate getServerSoftwareCertificates();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerSoftwareCertificates <em>Server Software Certificates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Software Certificates</em>' containment reference.
	 * @see #isSetServerSoftwareCertificates()
	 * @see #unsetServerSoftwareCertificates()
	 * @see #getServerSoftwareCertificates()
	 * @generated
	 */
	void setServerSoftwareCertificates(ListOfSignedSoftwareCertificate value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerSoftwareCertificates <em>Server Software Certificates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerSoftwareCertificates()
	 * @see #getServerSoftwareCertificates()
	 * @see #setServerSoftwareCertificates(ListOfSignedSoftwareCertificate)
	 * @generated
	 */
	void unsetServerSoftwareCertificates();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerSoftwareCertificates <em>Server Software Certificates</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Software Certificates</em>' containment reference is set.
	 * @see #unsetServerSoftwareCertificates()
	 * @see #getServerSoftwareCertificates()
	 * @see #setServerSoftwareCertificates(ListOfSignedSoftwareCertificate)
	 * @generated
	 */
	boolean isSetServerSoftwareCertificates();

	/**
	 * Returns the value of the '<em><b>Server Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Signature</em>' containment reference.
	 * @see #isSetServerSignature()
	 * @see #unsetServerSignature()
	 * @see #setServerSignature(SignatureData)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionResponse_ServerSignature()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ServerSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatureData getServerSignature();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerSignature <em>Server Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Signature</em>' containment reference.
	 * @see #isSetServerSignature()
	 * @see #unsetServerSignature()
	 * @see #getServerSignature()
	 * @generated
	 */
	void setServerSignature(SignatureData value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerSignature <em>Server Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerSignature()
	 * @see #getServerSignature()
	 * @see #setServerSignature(SignatureData)
	 * @generated
	 */
	void unsetServerSignature();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getServerSignature <em>Server Signature</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Signature</em>' containment reference is set.
	 * @see #unsetServerSignature()
	 * @see #getServerSignature()
	 * @see #setServerSignature(SignatureData)
	 * @generated
	 */
	boolean isSetServerSignature();

	/**
	 * Returns the value of the '<em><b>Max Request Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Request Message Size</em>' attribute.
	 * @see #isSetMaxRequestMessageSize()
	 * @see #unsetMaxRequestMessageSize()
	 * @see #setMaxRequestMessageSize(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSessionResponse_MaxRequestMessageSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MaxRequestMessageSize' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMaxRequestMessageSize();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getMaxRequestMessageSize <em>Max Request Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Request Message Size</em>' attribute.
	 * @see #isSetMaxRequestMessageSize()
	 * @see #unsetMaxRequestMessageSize()
	 * @see #getMaxRequestMessageSize()
	 * @generated
	 */
	void setMaxRequestMessageSize(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getMaxRequestMessageSize <em>Max Request Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxRequestMessageSize()
	 * @see #getMaxRequestMessageSize()
	 * @see #setMaxRequestMessageSize(long)
	 * @generated
	 */
	void unsetMaxRequestMessageSize();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSessionResponse#getMaxRequestMessageSize <em>Max Request Message Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Request Message Size</em>' attribute is set.
	 * @see #unsetMaxRequestMessageSize()
	 * @see #getMaxRequestMessageSize()
	 * @see #setMaxRequestMessageSize(long)
	 * @generated
	 */
	boolean isSetMaxRequestMessageSize();

} // CreateSessionResponse
