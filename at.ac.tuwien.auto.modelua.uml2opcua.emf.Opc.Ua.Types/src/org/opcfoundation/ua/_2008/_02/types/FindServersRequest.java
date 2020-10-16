/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find Servers Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FindServersRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FindServersRequest#getEndpointUrl <em>Endpoint Url</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FindServersRequest#getLocaleIds <em>Locale Ids</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FindServersRequest#getServerUris <em>Server Uris</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFindServersRequest()
 * @model extendedMetaData="name='FindServersRequest' kind='elementOnly'"
 * @generated
 */
public interface FindServersRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFindServersRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Endpoint Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Url</em>' attribute.
	 * @see #isSetEndpointUrl()
	 * @see #unsetEndpointUrl()
	 * @see #setEndpointUrl(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFindServersRequest_EndpointUrl()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='EndpointUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEndpointUrl();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersRequest#getEndpointUrl <em>Endpoint Url</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersRequest#getEndpointUrl <em>Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndpointUrl()
	 * @see #getEndpointUrl()
	 * @see #setEndpointUrl(String)
	 * @generated
	 */
	void unsetEndpointUrl();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersRequest#getEndpointUrl <em>Endpoint Url</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Locale Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale Ids</em>' containment reference.
	 * @see #isSetLocaleIds()
	 * @see #unsetLocaleIds()
	 * @see #setLocaleIds(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFindServersRequest_LocaleIds()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LocaleIds' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getLocaleIds();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersRequest#getLocaleIds <em>Locale Ids</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersRequest#getLocaleIds <em>Locale Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocaleIds()
	 * @see #getLocaleIds()
	 * @see #setLocaleIds(ListOfString)
	 * @generated
	 */
	void unsetLocaleIds();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersRequest#getLocaleIds <em>Locale Ids</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Server Uris</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Uris</em>' containment reference.
	 * @see #isSetServerUris()
	 * @see #unsetServerUris()
	 * @see #setServerUris(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFindServersRequest_ServerUris()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ServerUris' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getServerUris();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersRequest#getServerUris <em>Server Uris</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Uris</em>' containment reference.
	 * @see #isSetServerUris()
	 * @see #unsetServerUris()
	 * @see #getServerUris()
	 * @generated
	 */
	void setServerUris(ListOfString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersRequest#getServerUris <em>Server Uris</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerUris()
	 * @see #getServerUris()
	 * @see #setServerUris(ListOfString)
	 * @generated
	 */
	void unsetServerUris();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersRequest#getServerUris <em>Server Uris</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Uris</em>' containment reference is set.
	 * @see #unsetServerUris()
	 * @see #getServerUris()
	 * @see #setServerUris(ListOfString)
	 * @generated
	 */
	boolean isSetServerUris();

} // FindServersRequest
