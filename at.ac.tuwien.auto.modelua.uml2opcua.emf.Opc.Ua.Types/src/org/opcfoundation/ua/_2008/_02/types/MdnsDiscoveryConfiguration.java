/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mdns Discovery Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MdnsDiscoveryConfiguration#getMdnsServerName <em>Mdns Server Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MdnsDiscoveryConfiguration#getServerCapabilities <em>Server Capabilities</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMdnsDiscoveryConfiguration()
 * @model extendedMetaData="name='MdnsDiscoveryConfiguration' kind='elementOnly'"
 * @generated
 */
public interface MdnsDiscoveryConfiguration extends DiscoveryConfiguration {
	/**
	 * Returns the value of the '<em><b>Mdns Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdns Server Name</em>' attribute.
	 * @see #isSetMdnsServerName()
	 * @see #unsetMdnsServerName()
	 * @see #setMdnsServerName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMdnsDiscoveryConfiguration_MdnsServerName()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MdnsServerName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMdnsServerName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MdnsDiscoveryConfiguration#getMdnsServerName <em>Mdns Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdns Server Name</em>' attribute.
	 * @see #isSetMdnsServerName()
	 * @see #unsetMdnsServerName()
	 * @see #getMdnsServerName()
	 * @generated
	 */
	void setMdnsServerName(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MdnsDiscoveryConfiguration#getMdnsServerName <em>Mdns Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMdnsServerName()
	 * @see #getMdnsServerName()
	 * @see #setMdnsServerName(String)
	 * @generated
	 */
	void unsetMdnsServerName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MdnsDiscoveryConfiguration#getMdnsServerName <em>Mdns Server Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mdns Server Name</em>' attribute is set.
	 * @see #unsetMdnsServerName()
	 * @see #getMdnsServerName()
	 * @see #setMdnsServerName(String)
	 * @generated
	 */
	boolean isSetMdnsServerName();

	/**
	 * Returns the value of the '<em><b>Server Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Capabilities</em>' containment reference.
	 * @see #isSetServerCapabilities()
	 * @see #unsetServerCapabilities()
	 * @see #setServerCapabilities(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMdnsDiscoveryConfiguration_ServerCapabilities()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ServerCapabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getServerCapabilities();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MdnsDiscoveryConfiguration#getServerCapabilities <em>Server Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Capabilities</em>' containment reference.
	 * @see #isSetServerCapabilities()
	 * @see #unsetServerCapabilities()
	 * @see #getServerCapabilities()
	 * @generated
	 */
	void setServerCapabilities(ListOfString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MdnsDiscoveryConfiguration#getServerCapabilities <em>Server Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerCapabilities()
	 * @see #getServerCapabilities()
	 * @see #setServerCapabilities(ListOfString)
	 * @generated
	 */
	void unsetServerCapabilities();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MdnsDiscoveryConfiguration#getServerCapabilities <em>Server Capabilities</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Capabilities</em>' containment reference is set.
	 * @see #unsetServerCapabilities()
	 * @see #getServerCapabilities()
	 * @see #setServerCapabilities(ListOfString)
	 * @generated
	 */
	boolean isSetServerCapabilities();

} // MdnsDiscoveryConfiguration
