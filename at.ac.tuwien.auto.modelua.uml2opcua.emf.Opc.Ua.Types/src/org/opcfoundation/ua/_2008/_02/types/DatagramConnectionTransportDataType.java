/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datagram Connection Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DatagramConnectionTransportDataType#getDiscoveryAddress <em>Discovery Address</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDatagramConnectionTransportDataType()
 * @model extendedMetaData="name='DatagramConnectionTransportDataType' kind='elementOnly'"
 * @generated
 */
public interface DatagramConnectionTransportDataType extends ConnectionTransportDataType {
	/**
	 * Returns the value of the '<em><b>Discovery Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovery Address</em>' containment reference.
	 * @see #isSetDiscoveryAddress()
	 * @see #unsetDiscoveryAddress()
	 * @see #setDiscoveryAddress(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDatagramConnectionTransportDataType_DiscoveryAddress()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DiscoveryAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getDiscoveryAddress();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DatagramConnectionTransportDataType#getDiscoveryAddress <em>Discovery Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovery Address</em>' containment reference.
	 * @see #isSetDiscoveryAddress()
	 * @see #unsetDiscoveryAddress()
	 * @see #getDiscoveryAddress()
	 * @generated
	 */
	void setDiscoveryAddress(ExtensionObject value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DatagramConnectionTransportDataType#getDiscoveryAddress <em>Discovery Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiscoveryAddress()
	 * @see #getDiscoveryAddress()
	 * @see #setDiscoveryAddress(ExtensionObject)
	 * @generated
	 */
	void unsetDiscoveryAddress();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DatagramConnectionTransportDataType#getDiscoveryAddress <em>Discovery Address</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Discovery Address</em>' containment reference is set.
	 * @see #unsetDiscoveryAddress()
	 * @see #getDiscoveryAddress()
	 * @see #setDiscoveryAddress(ExtensionObject)
	 * @generated
	 */
	boolean isSetDiscoveryAddress();

} // DatagramConnectionTransportDataType
