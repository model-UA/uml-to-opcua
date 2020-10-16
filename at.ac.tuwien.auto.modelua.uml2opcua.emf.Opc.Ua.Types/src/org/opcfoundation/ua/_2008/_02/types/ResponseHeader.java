/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getRequestHandle <em>Request Handle</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getServiceResult <em>Service Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getServiceDiagnostics <em>Service Diagnostics</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getStringTable <em>String Table</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getAdditionalHeader <em>Additional Header</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getResponseHeader()
 * @model extendedMetaData="name='ResponseHeader' kind='elementOnly'"
 * @generated
 */
public interface ResponseHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getResponseHeader_Timestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='Timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTimestamp();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getTimestamp <em>Timestamp</em>}' attribute.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getResponseHeader_RequestHandle()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RequestHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRequestHandle();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getRequestHandle <em>Request Handle</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getRequestHandle <em>Request Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHandle()
	 * @see #getRequestHandle()
	 * @see #setRequestHandle(long)
	 * @generated
	 */
	void unsetRequestHandle();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getRequestHandle <em>Request Handle</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Service Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Result</em>' containment reference.
	 * @see #setServiceResult(StatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getResponseHeader_ServiceResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ServiceResult' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusCode getServiceResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getServiceResult <em>Service Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Result</em>' containment reference.
	 * @see #getServiceResult()
	 * @generated
	 */
	void setServiceResult(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Service Diagnostics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Diagnostics</em>' containment reference.
	 * @see #isSetServiceDiagnostics()
	 * @see #unsetServiceDiagnostics()
	 * @see #setServiceDiagnostics(DiagnosticInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getResponseHeader_ServiceDiagnostics()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ServiceDiagnostics' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticInfo getServiceDiagnostics();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getServiceDiagnostics <em>Service Diagnostics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Diagnostics</em>' containment reference.
	 * @see #isSetServiceDiagnostics()
	 * @see #unsetServiceDiagnostics()
	 * @see #getServiceDiagnostics()
	 * @generated
	 */
	void setServiceDiagnostics(DiagnosticInfo value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getServiceDiagnostics <em>Service Diagnostics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServiceDiagnostics()
	 * @see #getServiceDiagnostics()
	 * @see #setServiceDiagnostics(DiagnosticInfo)
	 * @generated
	 */
	void unsetServiceDiagnostics();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getServiceDiagnostics <em>Service Diagnostics</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service Diagnostics</em>' containment reference is set.
	 * @see #unsetServiceDiagnostics()
	 * @see #getServiceDiagnostics()
	 * @see #setServiceDiagnostics(DiagnosticInfo)
	 * @generated
	 */
	boolean isSetServiceDiagnostics();

	/**
	 * Returns the value of the '<em><b>String Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Table</em>' containment reference.
	 * @see #isSetStringTable()
	 * @see #unsetStringTable()
	 * @see #setStringTable(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getResponseHeader_StringTable()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='StringTable' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getStringTable();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getStringTable <em>String Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Table</em>' containment reference.
	 * @see #isSetStringTable()
	 * @see #unsetStringTable()
	 * @see #getStringTable()
	 * @generated
	 */
	void setStringTable(ListOfString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getStringTable <em>String Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStringTable()
	 * @see #getStringTable()
	 * @see #setStringTable(ListOfString)
	 * @generated
	 */
	void unsetStringTable();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getStringTable <em>String Table</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>String Table</em>' containment reference is set.
	 * @see #unsetStringTable()
	 * @see #getStringTable()
	 * @see #setStringTable(ListOfString)
	 * @generated
	 */
	boolean isSetStringTable();

	/**
	 * Returns the value of the '<em><b>Additional Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Header</em>' containment reference.
	 * @see #isSetAdditionalHeader()
	 * @see #unsetAdditionalHeader()
	 * @see #setAdditionalHeader(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getResponseHeader_AdditionalHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AdditionalHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getAdditionalHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getAdditionalHeader <em>Additional Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getAdditionalHeader <em>Additional Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAdditionalHeader()
	 * @see #getAdditionalHeader()
	 * @see #setAdditionalHeader(ExtensionObject)
	 * @generated
	 */
	void unsetAdditionalHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ResponseHeader#getAdditionalHeader <em>Additional Header</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Additional Header</em>' containment reference is set.
	 * @see #unsetAdditionalHeader()
	 * @see #getAdditionalHeader()
	 * @see #setAdditionalHeader(ExtensionObject)
	 * @generated
	 */
	boolean isSetAdditionalHeader();

} // ResponseHeader
