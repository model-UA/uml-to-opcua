/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Endpoints Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.GetEndpointsRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.GetEndpointsRequest#getEndpointUrl <em>Endpoint Url</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.GetEndpointsRequest#getLocaleIds <em>Locale Ids</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.GetEndpointsRequest#getProfileUris <em>Profile Uris</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getGetEndpointsRequest()
 * @model extendedMetaData="name='GetEndpointsRequest' kind='elementOnly'"
 * @generated
 */
public interface GetEndpointsRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getGetEndpointsRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getGetEndpointsRequest_EndpointUrl()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='EndpointUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEndpointUrl();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsRequest#getEndpointUrl <em>Endpoint Url</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsRequest#getEndpointUrl <em>Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndpointUrl()
	 * @see #getEndpointUrl()
	 * @see #setEndpointUrl(String)
	 * @generated
	 */
	void unsetEndpointUrl();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsRequest#getEndpointUrl <em>Endpoint Url</em>}' attribute is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getGetEndpointsRequest_LocaleIds()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LocaleIds' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getLocaleIds();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsRequest#getLocaleIds <em>Locale Ids</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsRequest#getLocaleIds <em>Locale Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocaleIds()
	 * @see #getLocaleIds()
	 * @see #setLocaleIds(ListOfString)
	 * @generated
	 */
	void unsetLocaleIds();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsRequest#getLocaleIds <em>Locale Ids</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Profile Uris</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Uris</em>' containment reference.
	 * @see #isSetProfileUris()
	 * @see #unsetProfileUris()
	 * @see #setProfileUris(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getGetEndpointsRequest_ProfileUris()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ProfileUris' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getProfileUris();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsRequest#getProfileUris <em>Profile Uris</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Uris</em>' containment reference.
	 * @see #isSetProfileUris()
	 * @see #unsetProfileUris()
	 * @see #getProfileUris()
	 * @generated
	 */
	void setProfileUris(ListOfString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsRequest#getProfileUris <em>Profile Uris</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProfileUris()
	 * @see #getProfileUris()
	 * @see #setProfileUris(ListOfString)
	 * @generated
	 */
	void unsetProfileUris();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsRequest#getProfileUris <em>Profile Uris</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Profile Uris</em>' containment reference is set.
	 * @see #unsetProfileUris()
	 * @see #getProfileUris()
	 * @see #setProfileUris(ListOfString)
	 * @generated
	 */
	boolean isSetProfileUris();

} // GetEndpointsRequest
