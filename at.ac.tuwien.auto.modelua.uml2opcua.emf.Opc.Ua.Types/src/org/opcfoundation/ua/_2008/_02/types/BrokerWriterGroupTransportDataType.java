/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broker Writer Group Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType#getQueueName <em>Queue Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType#getResourceUri <em>Resource Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType#getAuthenticationProfileUri <em>Authentication Profile Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType#getRequestedDeliveryGuarantee <em>Requested Delivery Guarantee</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrokerWriterGroupTransportDataType()
 * @model extendedMetaData="name='BrokerWriterGroupTransportDataType' kind='elementOnly'"
 * @generated
 */
public interface BrokerWriterGroupTransportDataType extends WriterGroupTransportDataType {
	/**
	 * Returns the value of the '<em><b>Queue Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Name</em>' attribute.
	 * @see #isSetQueueName()
	 * @see #unsetQueueName()
	 * @see #setQueueName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrokerWriterGroupTransportDataType_QueueName()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='QueueName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQueueName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType#getQueueName <em>Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Name</em>' attribute.
	 * @see #isSetQueueName()
	 * @see #unsetQueueName()
	 * @see #getQueueName()
	 * @generated
	 */
	void setQueueName(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType#getQueueName <em>Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQueueName()
	 * @see #getQueueName()
	 * @see #setQueueName(String)
	 * @generated
	 */
	void unsetQueueName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType#getQueueName <em>Queue Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Queue Name</em>' attribute is set.
	 * @see #unsetQueueName()
	 * @see #getQueueName()
	 * @see #setQueueName(String)
	 * @generated
	 */
	boolean isSetQueueName();

	/**
	 * Returns the value of the '<em><b>Resource Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Uri</em>' attribute.
	 * @see #isSetResourceUri()
	 * @see #unsetResourceUri()
	 * @see #setResourceUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrokerWriterGroupTransportDataType_ResourceUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ResourceUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResourceUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType#getResourceUri <em>Resource Uri</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType#getResourceUri <em>Resource Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResourceUri()
	 * @see #getResourceUri()
	 * @see #setResourceUri(String)
	 * @generated
	 */
	void unsetResourceUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType#getResourceUri <em>Resource Uri</em>}' attribute is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrokerWriterGroupTransportDataType_AuthenticationProfileUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AuthenticationProfileUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuthenticationProfileUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType#getAuthenticationProfileUri <em>Authentication Profile Uri</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType#getAuthenticationProfileUri <em>Authentication Profile Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuthenticationProfileUri()
	 * @see #getAuthenticationProfileUri()
	 * @see #setAuthenticationProfileUri(String)
	 * @generated
	 */
	void unsetAuthenticationProfileUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType#getAuthenticationProfileUri <em>Authentication Profile Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Authentication Profile Uri</em>' attribute is set.
	 * @see #unsetAuthenticationProfileUri()
	 * @see #getAuthenticationProfileUri()
	 * @see #setAuthenticationProfileUri(String)
	 * @generated
	 */
	boolean isSetAuthenticationProfileUri();

	/**
	 * Returns the value of the '<em><b>Requested Delivery Guarantee</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.BrokerTransportQualityOfService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Delivery Guarantee</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.BrokerTransportQualityOfService
	 * @see #isSetRequestedDeliveryGuarantee()
	 * @see #unsetRequestedDeliveryGuarantee()
	 * @see #setRequestedDeliveryGuarantee(BrokerTransportQualityOfService)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrokerWriterGroupTransportDataType_RequestedDeliveryGuarantee()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestedDeliveryGuarantee' namespace='##targetNamespace'"
	 * @generated
	 */
	BrokerTransportQualityOfService getRequestedDeliveryGuarantee();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType#getRequestedDeliveryGuarantee <em>Requested Delivery Guarantee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Delivery Guarantee</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.BrokerTransportQualityOfService
	 * @see #isSetRequestedDeliveryGuarantee()
	 * @see #unsetRequestedDeliveryGuarantee()
	 * @see #getRequestedDeliveryGuarantee()
	 * @generated
	 */
	void setRequestedDeliveryGuarantee(BrokerTransportQualityOfService value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType#getRequestedDeliveryGuarantee <em>Requested Delivery Guarantee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestedDeliveryGuarantee()
	 * @see #getRequestedDeliveryGuarantee()
	 * @see #setRequestedDeliveryGuarantee(BrokerTransportQualityOfService)
	 * @generated
	 */
	void unsetRequestedDeliveryGuarantee();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType#getRequestedDeliveryGuarantee <em>Requested Delivery Guarantee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Requested Delivery Guarantee</em>' attribute is set.
	 * @see #unsetRequestedDeliveryGuarantee()
	 * @see #getRequestedDeliveryGuarantee()
	 * @see #setRequestedDeliveryGuarantee(BrokerTransportQualityOfService)
	 * @generated
	 */
	boolean isSetRequestedDeliveryGuarantee();

} // BrokerWriterGroupTransportDataType
