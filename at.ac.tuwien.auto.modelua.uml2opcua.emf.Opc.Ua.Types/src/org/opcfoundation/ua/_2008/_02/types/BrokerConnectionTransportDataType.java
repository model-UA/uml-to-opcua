/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broker Connection Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrokerConnectionTransportDataType#getResourceUri <em>Resource Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrokerConnectionTransportDataType#getAuthenticationProfileUri <em>Authentication Profile Uri</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrokerConnectionTransportDataType()
 * @model extendedMetaData="name='BrokerConnectionTransportDataType' kind='elementOnly'"
 * @generated
 */
public interface BrokerConnectionTransportDataType extends ConnectionTransportDataType {
	/**
	 * Returns the value of the '<em><b>Resource Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Uri</em>' attribute.
	 * @see #isSetResourceUri()
	 * @see #unsetResourceUri()
	 * @see #setResourceUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrokerConnectionTransportDataType_ResourceUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ResourceUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResourceUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrokerConnectionTransportDataType#getResourceUri <em>Resource Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Uri</em>' attribute.
	 * @see #isSetResourceUri()
	 * @see #unsetResourceUri()
	 * @see #getResourceUri()
	 * @generated
	 */
	void setResourceUri(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrokerConnectionTransportDataType#getResourceUri <em>Resource Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResourceUri()
	 * @see #getResourceUri()
	 * @see #setResourceUri(String)
	 * @generated
	 */
	void unsetResourceUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrokerConnectionTransportDataType#getResourceUri <em>Resource Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resource Uri</em>' attribute is set.
	 * @see #unsetResourceUri()
	 * @see #getResourceUri()
	 * @see #setResourceUri(String)
	 * @generated
	 */
	boolean isSetResourceUri();

	/**
	 * Returns the value of the '<em><b>Authentication Profile Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Profile Uri</em>' attribute.
	 * @see #isSetAuthenticationProfileUri()
	 * @see #unsetAuthenticationProfileUri()
	 * @see #setAuthenticationProfileUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrokerConnectionTransportDataType_AuthenticationProfileUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AuthenticationProfileUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuthenticationProfileUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrokerConnectionTransportDataType#getAuthenticationProfileUri <em>Authentication Profile Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Profile Uri</em>' attribute.
	 * @see #isSetAuthenticationProfileUri()
	 * @see #unsetAuthenticationProfileUri()
	 * @see #getAuthenticationProfileUri()
	 * @generated
	 */
	void setAuthenticationProfileUri(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrokerConnectionTransportDataType#getAuthenticationProfileUri <em>Authentication Profile Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuthenticationProfileUri()
	 * @see #getAuthenticationProfileUri()
	 * @see #setAuthenticationProfileUri(String)
	 * @generated
	 */
	void unsetAuthenticationProfileUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrokerConnectionTransportDataType#getAuthenticationProfileUri <em>Authentication Profile Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Authentication Profile Uri</em>' attribute is set.
	 * @see #unsetAuthenticationProfileUri()
	 * @see #getAuthenticationProfileUri()
	 * @see #setAuthenticationProfileUri(String)
	 * @generated
	 */
	boolean isSetAuthenticationProfileUri();

} // BrokerConnectionTransportDataType
