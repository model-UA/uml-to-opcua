/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointType#getEndpointUrl <em>Endpoint Url</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointType#getSecurityMode <em>Security Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointType#getSecurityPolicyUri <em>Security Policy Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointType#getTransportProfileUri <em>Transport Profile Uri</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointType()
 * @model extendedMetaData="name='EndpointType' kind='elementOnly'"
 * @generated
 */
public interface EndpointType extends EObject {
	/**
	 * Returns the value of the '<em><b>Endpoint Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Url</em>' attribute.
	 * @see #isSetEndpointUrl()
	 * @see #unsetEndpointUrl()
	 * @see #setEndpointUrl(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointType_EndpointUrl()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='EndpointUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEndpointUrl();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointType#getEndpointUrl <em>Endpoint Url</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointType#getEndpointUrl <em>Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndpointUrl()
	 * @see #getEndpointUrl()
	 * @see #setEndpointUrl(String)
	 * @generated
	 */
	void unsetEndpointUrl();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointType#getEndpointUrl <em>Endpoint Url</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Security Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.MessageSecurityMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Mode</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.MessageSecurityMode
	 * @see #isSetSecurityMode()
	 * @see #unsetSecurityMode()
	 * @see #setSecurityMode(MessageSecurityMode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointType_SecurityMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SecurityMode' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageSecurityMode getSecurityMode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointType#getSecurityMode <em>Security Mode</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointType#getSecurityMode <em>Security Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityMode()
	 * @see #getSecurityMode()
	 * @see #setSecurityMode(MessageSecurityMode)
	 * @generated
	 */
	void unsetSecurityMode();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointType#getSecurityMode <em>Security Mode</em>}' attribute is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointType_SecurityPolicyUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SecurityPolicyUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecurityPolicyUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointType#getSecurityPolicyUri <em>Security Policy Uri</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointType#getSecurityPolicyUri <em>Security Policy Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityPolicyUri()
	 * @see #getSecurityPolicyUri()
	 * @see #setSecurityPolicyUri(String)
	 * @generated
	 */
	void unsetSecurityPolicyUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointType#getSecurityPolicyUri <em>Security Policy Uri</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Transport Profile Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Profile Uri</em>' attribute.
	 * @see #isSetTransportProfileUri()
	 * @see #unsetTransportProfileUri()
	 * @see #setTransportProfileUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointType_TransportProfileUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='TransportProfileUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransportProfileUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointType#getTransportProfileUri <em>Transport Profile Uri</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointType#getTransportProfileUri <em>Transport Profile Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportProfileUri()
	 * @see #getTransportProfileUri()
	 * @see #setTransportProfileUri(String)
	 * @generated
	 */
	void unsetTransportProfileUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointType#getTransportProfileUri <em>Transport Profile Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transport Profile Uri</em>' attribute is set.
	 * @see #unsetTransportProfileUri()
	 * @see #getTransportProfileUri()
	 * @see #setTransportProfileUri(String)
	 * @generated
	 */
	boolean isSetTransportProfileUri();

} // EndpointType
