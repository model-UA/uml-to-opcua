/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getAuthenticationToken <em>Authentication Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getRequestHandle <em>Request Handle</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getReturnDiagnostics <em>Return Diagnostics</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getAuditEntryId <em>Audit Entry Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getTimeoutHint <em>Timeout Hint</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getAdditionalHeader <em>Additional Header</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRequestHeader()
 * @model extendedMetaData="name='RequestHeader' kind='elementOnly'"
 * @generated
 */
public interface RequestHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Authentication Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Token</em>' containment reference.
	 * @see #isSetAuthenticationToken()
	 * @see #unsetAuthenticationToken()
	 * @see #setAuthenticationToken(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRequestHeader_AuthenticationToken()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AuthenticationToken' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getAuthenticationToken();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getAuthenticationToken <em>Authentication Token</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getAuthenticationToken <em>Authentication Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuthenticationToken()
	 * @see #getAuthenticationToken()
	 * @see #setAuthenticationToken(NodeId)
	 * @generated
	 */
	void unsetAuthenticationToken();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getAuthenticationToken <em>Authentication Token</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRequestHeader_Timestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='Timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTimestamp();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Request Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Handle</em>' attribute.
	 * @see #isSetRequestHandle()
	 * @see #unsetRequestHandle()
	 * @see #setRequestHandle(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRequestHeader_RequestHandle()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RequestHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRequestHandle();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getRequestHandle <em>Request Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Handle</em>' attribute.
	 * @see #isSetRequestHandle()
	 * @see #unsetRequestHandle()
	 * @see #getRequestHandle()
	 * @generated
	 */
	void setRequestHandle(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getRequestHandle <em>Request Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHandle()
	 * @see #getRequestHandle()
	 * @see #setRequestHandle(long)
	 * @generated
	 */
	void unsetRequestHandle();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getRequestHandle <em>Request Handle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Request Handle</em>' attribute is set.
	 * @see #unsetRequestHandle()
	 * @see #getRequestHandle()
	 * @see #setRequestHandle(long)
	 * @generated
	 */
	boolean isSetRequestHandle();

	/**
	 * Returns the value of the '<em><b>Return Diagnostics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Diagnostics</em>' attribute.
	 * @see #isSetReturnDiagnostics()
	 * @see #unsetReturnDiagnostics()
	 * @see #setReturnDiagnostics(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRequestHeader_ReturnDiagnostics()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='ReturnDiagnostics' namespace='##targetNamespace'"
	 * @generated
	 */
	long getReturnDiagnostics();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getReturnDiagnostics <em>Return Diagnostics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Diagnostics</em>' attribute.
	 * @see #isSetReturnDiagnostics()
	 * @see #unsetReturnDiagnostics()
	 * @see #getReturnDiagnostics()
	 * @generated
	 */
	void setReturnDiagnostics(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getReturnDiagnostics <em>Return Diagnostics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReturnDiagnostics()
	 * @see #getReturnDiagnostics()
	 * @see #setReturnDiagnostics(long)
	 * @generated
	 */
	void unsetReturnDiagnostics();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getReturnDiagnostics <em>Return Diagnostics</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Return Diagnostics</em>' attribute is set.
	 * @see #unsetReturnDiagnostics()
	 * @see #getReturnDiagnostics()
	 * @see #setReturnDiagnostics(long)
	 * @generated
	 */
	boolean isSetReturnDiagnostics();

	/**
	 * Returns the value of the '<em><b>Audit Entry Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audit Entry Id</em>' attribute.
	 * @see #isSetAuditEntryId()
	 * @see #unsetAuditEntryId()
	 * @see #setAuditEntryId(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRequestHeader_AuditEntryId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AuditEntryId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuditEntryId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getAuditEntryId <em>Audit Entry Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audit Entry Id</em>' attribute.
	 * @see #isSetAuditEntryId()
	 * @see #unsetAuditEntryId()
	 * @see #getAuditEntryId()
	 * @generated
	 */
	void setAuditEntryId(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getAuditEntryId <em>Audit Entry Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuditEntryId()
	 * @see #getAuditEntryId()
	 * @see #setAuditEntryId(String)
	 * @generated
	 */
	void unsetAuditEntryId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getAuditEntryId <em>Audit Entry Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Audit Entry Id</em>' attribute is set.
	 * @see #unsetAuditEntryId()
	 * @see #getAuditEntryId()
	 * @see #setAuditEntryId(String)
	 * @generated
	 */
	boolean isSetAuditEntryId();

	/**
	 * Returns the value of the '<em><b>Timeout Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout Hint</em>' attribute.
	 * @see #isSetTimeoutHint()
	 * @see #unsetTimeoutHint()
	 * @see #setTimeoutHint(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRequestHeader_TimeoutHint()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='TimeoutHint' namespace='##targetNamespace'"
	 * @generated
	 */
	long getTimeoutHint();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getTimeoutHint <em>Timeout Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Hint</em>' attribute.
	 * @see #isSetTimeoutHint()
	 * @see #unsetTimeoutHint()
	 * @see #getTimeoutHint()
	 * @generated
	 */
	void setTimeoutHint(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getTimeoutHint <em>Timeout Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeoutHint()
	 * @see #getTimeoutHint()
	 * @see #setTimeoutHint(long)
	 * @generated
	 */
	void unsetTimeoutHint();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getTimeoutHint <em>Timeout Hint</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Timeout Hint</em>' attribute is set.
	 * @see #unsetTimeoutHint()
	 * @see #getTimeoutHint()
	 * @see #setTimeoutHint(long)
	 * @generated
	 */
	boolean isSetTimeoutHint();

	/**
	 * Returns the value of the '<em><b>Additional Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Header</em>' containment reference.
	 * @see #isSetAdditionalHeader()
	 * @see #unsetAdditionalHeader()
	 * @see #setAdditionalHeader(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRequestHeader_AdditionalHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AdditionalHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getAdditionalHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getAdditionalHeader <em>Additional Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Header</em>' containment reference.
	 * @see #isSetAdditionalHeader()
	 * @see #unsetAdditionalHeader()
	 * @see #getAdditionalHeader()
	 * @generated
	 */
	void setAdditionalHeader(ExtensionObject value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getAdditionalHeader <em>Additional Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAdditionalHeader()
	 * @see #getAdditionalHeader()
	 * @see #setAdditionalHeader(ExtensionObject)
	 * @generated
	 */
	void unsetAdditionalHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RequestHeader#getAdditionalHeader <em>Additional Header</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Additional Header</em>' containment reference is set.
	 * @see #unsetAdditionalHeader()
	 * @see #getAdditionalHeader()
	 * @see #setAdditionalHeader(ExtensionObject)
	 * @generated
	 */
	boolean isSetAdditionalHeader();

} // RequestHeader
