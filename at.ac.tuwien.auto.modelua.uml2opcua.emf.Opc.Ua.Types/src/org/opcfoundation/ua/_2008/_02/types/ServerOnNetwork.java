/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server On Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork#getRecordId <em>Record Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork#getServerName <em>Server Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork#getDiscoveryUrl <em>Discovery Url</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork#getServerCapabilities <em>Server Capabilities</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerOnNetwork()
 * @model extendedMetaData="name='ServerOnNetwork' kind='elementOnly'"
 * @generated
 */
public interface ServerOnNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Record Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Id</em>' attribute.
	 * @see #isSetRecordId()
	 * @see #unsetRecordId()
	 * @see #setRecordId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerOnNetwork_RecordId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RecordId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRecordId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork#getRecordId <em>Record Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Id</em>' attribute.
	 * @see #isSetRecordId()
	 * @see #unsetRecordId()
	 * @see #getRecordId()
	 * @generated
	 */
	void setRecordId(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork#getRecordId <em>Record Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRecordId()
	 * @see #getRecordId()
	 * @see #setRecordId(long)
	 * @generated
	 */
	void unsetRecordId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork#getRecordId <em>Record Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Record Id</em>' attribute is set.
	 * @see #unsetRecordId()
	 * @see #getRecordId()
	 * @see #setRecordId(long)
	 * @generated
	 */
	boolean isSetRecordId();

	/**
	 * Returns the value of the '<em><b>Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Name</em>' attribute.
	 * @see #isSetServerName()
	 * @see #unsetServerName()
	 * @see #setServerName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerOnNetwork_ServerName()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ServerName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServerName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork#getServerName <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Name</em>' attribute.
	 * @see #isSetServerName()
	 * @see #unsetServerName()
	 * @see #getServerName()
	 * @generated
	 */
	void setServerName(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork#getServerName <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerName()
	 * @see #getServerName()
	 * @see #setServerName(String)
	 * @generated
	 */
	void unsetServerName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork#getServerName <em>Server Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Name</em>' attribute is set.
	 * @see #unsetServerName()
	 * @see #getServerName()
	 * @see #setServerName(String)
	 * @generated
	 */
	boolean isSetServerName();

	/**
	 * Returns the value of the '<em><b>Discovery Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovery Url</em>' attribute.
	 * @see #isSetDiscoveryUrl()
	 * @see #unsetDiscoveryUrl()
	 * @see #setDiscoveryUrl(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerOnNetwork_DiscoveryUrl()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DiscoveryUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDiscoveryUrl();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork#getDiscoveryUrl <em>Discovery Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovery Url</em>' attribute.
	 * @see #isSetDiscoveryUrl()
	 * @see #unsetDiscoveryUrl()
	 * @see #getDiscoveryUrl()
	 * @generated
	 */
	void setDiscoveryUrl(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork#getDiscoveryUrl <em>Discovery Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiscoveryUrl()
	 * @see #getDiscoveryUrl()
	 * @see #setDiscoveryUrl(String)
	 * @generated
	 */
	void unsetDiscoveryUrl();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork#getDiscoveryUrl <em>Discovery Url</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Discovery Url</em>' attribute is set.
	 * @see #unsetDiscoveryUrl()
	 * @see #getDiscoveryUrl()
	 * @see #setDiscoveryUrl(String)
	 * @generated
	 */
	boolean isSetDiscoveryUrl();

	/**
	 * Returns the value of the '<em><b>Server Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Capabilities</em>' containment reference.
	 * @see #isSetServerCapabilities()
	 * @see #unsetServerCapabilities()
	 * @see #setServerCapabilities(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getServerOnNetwork_ServerCapabilities()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ServerCapabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getServerCapabilities();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork#getServerCapabilities <em>Server Capabilities</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork#getServerCapabilities <em>Server Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerCapabilities()
	 * @see #getServerCapabilities()
	 * @see #setServerCapabilities(ListOfString)
	 * @generated
	 */
	void unsetServerCapabilities();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork#getServerCapabilities <em>Server Capabilities</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Capabilities</em>' containment reference is set.
	 * @see #unsetServerCapabilities()
	 * @see #getServerCapabilities()
	 * @see #setServerCapabilities(ListOfString)
	 * @generated
	 */
	boolean isSetServerCapabilities();

} // ServerOnNetwork
