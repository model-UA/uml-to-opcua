/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session Security Diagnostics Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getSessionId <em>Session Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getClientUserIdOfSession <em>Client User Id Of Session</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getClientUserIdHistory <em>Client User Id History</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getAuthenticationMechanism <em>Authentication Mechanism</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getTransportProtocol <em>Transport Protocol</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getSecurityMode <em>Security Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getSecurityPolicyUri <em>Security Policy Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getClientCertificate <em>Client Certificate</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionSecurityDiagnosticsDataType()
 * @model extendedMetaData="name='SessionSecurityDiagnosticsDataType' kind='elementOnly'"
 * @generated
 */
public interface SessionSecurityDiagnosticsDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Session Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Id</em>' containment reference.
	 * @see #isSetSessionId()
	 * @see #unsetSessionId()
	 * @see #setSessionId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionSecurityDiagnosticsDataType_SessionId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SessionId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getSessionId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getSessionId <em>Session Id</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getSessionId <em>Session Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSessionId()
	 * @see #getSessionId()
	 * @see #setSessionId(NodeId)
	 * @generated
	 */
	void unsetSessionId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getSessionId <em>Session Id</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Client User Id Of Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client User Id Of Session</em>' attribute.
	 * @see #isSetClientUserIdOfSession()
	 * @see #unsetClientUserIdOfSession()
	 * @see #setClientUserIdOfSession(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionSecurityDiagnosticsDataType_ClientUserIdOfSession()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ClientUserIdOfSession' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClientUserIdOfSession();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getClientUserIdOfSession <em>Client User Id Of Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client User Id Of Session</em>' attribute.
	 * @see #isSetClientUserIdOfSession()
	 * @see #unsetClientUserIdOfSession()
	 * @see #getClientUserIdOfSession()
	 * @generated
	 */
	void setClientUserIdOfSession(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getClientUserIdOfSession <em>Client User Id Of Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientUserIdOfSession()
	 * @see #getClientUserIdOfSession()
	 * @see #setClientUserIdOfSession(String)
	 * @generated
	 */
	void unsetClientUserIdOfSession();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getClientUserIdOfSession <em>Client User Id Of Session</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client User Id Of Session</em>' attribute is set.
	 * @see #unsetClientUserIdOfSession()
	 * @see #getClientUserIdOfSession()
	 * @see #setClientUserIdOfSession(String)
	 * @generated
	 */
	boolean isSetClientUserIdOfSession();

	/**
	 * Returns the value of the '<em><b>Client User Id History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client User Id History</em>' containment reference.
	 * @see #isSetClientUserIdHistory()
	 * @see #unsetClientUserIdHistory()
	 * @see #setClientUserIdHistory(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionSecurityDiagnosticsDataType_ClientUserIdHistory()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ClientUserIdHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getClientUserIdHistory();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getClientUserIdHistory <em>Client User Id History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client User Id History</em>' containment reference.
	 * @see #isSetClientUserIdHistory()
	 * @see #unsetClientUserIdHistory()
	 * @see #getClientUserIdHistory()
	 * @generated
	 */
	void setClientUserIdHistory(ListOfString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getClientUserIdHistory <em>Client User Id History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientUserIdHistory()
	 * @see #getClientUserIdHistory()
	 * @see #setClientUserIdHistory(ListOfString)
	 * @generated
	 */
	void unsetClientUserIdHistory();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getClientUserIdHistory <em>Client User Id History</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client User Id History</em>' containment reference is set.
	 * @see #unsetClientUserIdHistory()
	 * @see #getClientUserIdHistory()
	 * @see #setClientUserIdHistory(ListOfString)
	 * @generated
	 */
	boolean isSetClientUserIdHistory();

	/**
	 * Returns the value of the '<em><b>Authentication Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Mechanism</em>' attribute.
	 * @see #isSetAuthenticationMechanism()
	 * @see #unsetAuthenticationMechanism()
	 * @see #setAuthenticationMechanism(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionSecurityDiagnosticsDataType_AuthenticationMechanism()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AuthenticationMechanism' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuthenticationMechanism();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getAuthenticationMechanism <em>Authentication Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Mechanism</em>' attribute.
	 * @see #isSetAuthenticationMechanism()
	 * @see #unsetAuthenticationMechanism()
	 * @see #getAuthenticationMechanism()
	 * @generated
	 */
	void setAuthenticationMechanism(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getAuthenticationMechanism <em>Authentication Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuthenticationMechanism()
	 * @see #getAuthenticationMechanism()
	 * @see #setAuthenticationMechanism(String)
	 * @generated
	 */
	void unsetAuthenticationMechanism();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getAuthenticationMechanism <em>Authentication Mechanism</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Authentication Mechanism</em>' attribute is set.
	 * @see #unsetAuthenticationMechanism()
	 * @see #getAuthenticationMechanism()
	 * @see #setAuthenticationMechanism(String)
	 * @generated
	 */
	boolean isSetAuthenticationMechanism();

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #isSetEncoding()
	 * @see #unsetEncoding()
	 * @see #setEncoding(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionSecurityDiagnosticsDataType_Encoding()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Encoding' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #isSetEncoding()
	 * @see #unsetEncoding()
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEncoding()
	 * @see #getEncoding()
	 * @see #setEncoding(String)
	 * @generated
	 */
	void unsetEncoding();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getEncoding <em>Encoding</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Encoding</em>' attribute is set.
	 * @see #unsetEncoding()
	 * @see #getEncoding()
	 * @see #setEncoding(String)
	 * @generated
	 */
	boolean isSetEncoding();

	/**
	 * Returns the value of the '<em><b>Transport Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Protocol</em>' attribute.
	 * @see #isSetTransportProtocol()
	 * @see #unsetTransportProtocol()
	 * @see #setTransportProtocol(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionSecurityDiagnosticsDataType_TransportProtocol()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='TransportProtocol' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransportProtocol();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getTransportProtocol <em>Transport Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Protocol</em>' attribute.
	 * @see #isSetTransportProtocol()
	 * @see #unsetTransportProtocol()
	 * @see #getTransportProtocol()
	 * @generated
	 */
	void setTransportProtocol(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getTransportProtocol <em>Transport Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportProtocol()
	 * @see #getTransportProtocol()
	 * @see #setTransportProtocol(String)
	 * @generated
	 */
	void unsetTransportProtocol();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getTransportProtocol <em>Transport Protocol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transport Protocol</em>' attribute is set.
	 * @see #unsetTransportProtocol()
	 * @see #getTransportProtocol()
	 * @see #setTransportProtocol(String)
	 * @generated
	 */
	boolean isSetTransportProtocol();

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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionSecurityDiagnosticsDataType_SecurityMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SecurityMode' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageSecurityMode getSecurityMode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getSecurityMode <em>Security Mode</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getSecurityMode <em>Security Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityMode()
	 * @see #getSecurityMode()
	 * @see #setSecurityMode(MessageSecurityMode)
	 * @generated
	 */
	void unsetSecurityMode();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getSecurityMode <em>Security Mode</em>}' attribute is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionSecurityDiagnosticsDataType_SecurityPolicyUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SecurityPolicyUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecurityPolicyUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getSecurityPolicyUri <em>Security Policy Uri</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getSecurityPolicyUri <em>Security Policy Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityPolicyUri()
	 * @see #getSecurityPolicyUri()
	 * @see #setSecurityPolicyUri(String)
	 * @generated
	 */
	void unsetSecurityPolicyUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getSecurityPolicyUri <em>Security Policy Uri</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Client Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Certificate</em>' attribute.
	 * @see #isSetClientCertificate()
	 * @see #unsetClientCertificate()
	 * @see #setClientCertificate(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionSecurityDiagnosticsDataType_ClientCertificate()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='ClientCertificate' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getClientCertificate();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getClientCertificate <em>Client Certificate</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getClientCertificate <em>Client Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientCertificate()
	 * @see #getClientCertificate()
	 * @see #setClientCertificate(byte[])
	 * @generated
	 */
	void unsetClientCertificate();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType#getClientCertificate <em>Client Certificate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client Certificate</em>' attribute is set.
	 * @see #unsetClientCertificate()
	 * @see #getClientCertificate()
	 * @see #setClientCertificate(byte[])
	 * @generated
	 */
	boolean isSetClientCertificate();

} // SessionSecurityDiagnosticsDataType
