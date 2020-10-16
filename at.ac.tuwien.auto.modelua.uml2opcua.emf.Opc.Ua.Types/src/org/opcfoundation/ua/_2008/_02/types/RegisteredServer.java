/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registered Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getServerUri <em>Server Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getProductUri <em>Product Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getServerNames <em>Server Names</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getServerType <em>Server Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getGatewayServerUri <em>Gateway Server Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getDiscoveryUrls <em>Discovery Urls</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getSemaphoreFilePath <em>Semaphore File Path</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#isIsOnline <em>Is Online</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisteredServer()
 * @model extendedMetaData="name='RegisteredServer' kind='elementOnly'"
 * @generated
 */
public interface RegisteredServer extends EObject {
	/**
	 * Returns the value of the '<em><b>Server Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Uri</em>' attribute.
	 * @see #isSetServerUri()
	 * @see #unsetServerUri()
	 * @see #setServerUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisteredServer_ServerUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ServerUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServerUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getServerUri <em>Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Uri</em>' attribute.
	 * @see #isSetServerUri()
	 * @see #unsetServerUri()
	 * @see #getServerUri()
	 * @generated
	 */
	void setServerUri(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getServerUri <em>Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerUri()
	 * @see #getServerUri()
	 * @see #setServerUri(String)
	 * @generated
	 */
	void unsetServerUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getServerUri <em>Server Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Uri</em>' attribute is set.
	 * @see #unsetServerUri()
	 * @see #getServerUri()
	 * @see #setServerUri(String)
	 * @generated
	 */
	boolean isSetServerUri();

	/**
	 * Returns the value of the '<em><b>Product Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Uri</em>' attribute.
	 * @see #isSetProductUri()
	 * @see #unsetProductUri()
	 * @see #setProductUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisteredServer_ProductUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ProductUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getProductUri <em>Product Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Uri</em>' attribute.
	 * @see #isSetProductUri()
	 * @see #unsetProductUri()
	 * @see #getProductUri()
	 * @generated
	 */
	void setProductUri(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getProductUri <em>Product Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProductUri()
	 * @see #getProductUri()
	 * @see #setProductUri(String)
	 * @generated
	 */
	void unsetProductUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getProductUri <em>Product Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Product Uri</em>' attribute is set.
	 * @see #unsetProductUri()
	 * @see #getProductUri()
	 * @see #setProductUri(String)
	 * @generated
	 */
	boolean isSetProductUri();

	/**
	 * Returns the value of the '<em><b>Server Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Names</em>' containment reference.
	 * @see #isSetServerNames()
	 * @see #unsetServerNames()
	 * @see #setServerNames(ListOfLocalizedText)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisteredServer_ServerNames()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ServerNames' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfLocalizedText getServerNames();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getServerNames <em>Server Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Names</em>' containment reference.
	 * @see #isSetServerNames()
	 * @see #unsetServerNames()
	 * @see #getServerNames()
	 * @generated
	 */
	void setServerNames(ListOfLocalizedText value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getServerNames <em>Server Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerNames()
	 * @see #getServerNames()
	 * @see #setServerNames(ListOfLocalizedText)
	 * @generated
	 */
	void unsetServerNames();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getServerNames <em>Server Names</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Names</em>' containment reference is set.
	 * @see #unsetServerNames()
	 * @see #getServerNames()
	 * @see #setServerNames(ListOfLocalizedText)
	 * @generated
	 */
	boolean isSetServerNames();

	/**
	 * Returns the value of the '<em><b>Server Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.ApplicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.ApplicationType
	 * @see #isSetServerType()
	 * @see #unsetServerType()
	 * @see #setServerType(ApplicationType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisteredServer_ServerType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ServerType' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicationType getServerType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getServerType <em>Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.ApplicationType
	 * @see #isSetServerType()
	 * @see #unsetServerType()
	 * @see #getServerType()
	 * @generated
	 */
	void setServerType(ApplicationType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getServerType <em>Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerType()
	 * @see #getServerType()
	 * @see #setServerType(ApplicationType)
	 * @generated
	 */
	void unsetServerType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getServerType <em>Server Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Type</em>' attribute is set.
	 * @see #unsetServerType()
	 * @see #getServerType()
	 * @see #setServerType(ApplicationType)
	 * @generated
	 */
	boolean isSetServerType();

	/**
	 * Returns the value of the '<em><b>Gateway Server Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Server Uri</em>' attribute.
	 * @see #isSetGatewayServerUri()
	 * @see #unsetGatewayServerUri()
	 * @see #setGatewayServerUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisteredServer_GatewayServerUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='GatewayServerUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGatewayServerUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getGatewayServerUri <em>Gateway Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Server Uri</em>' attribute.
	 * @see #isSetGatewayServerUri()
	 * @see #unsetGatewayServerUri()
	 * @see #getGatewayServerUri()
	 * @generated
	 */
	void setGatewayServerUri(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getGatewayServerUri <em>Gateway Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGatewayServerUri()
	 * @see #getGatewayServerUri()
	 * @see #setGatewayServerUri(String)
	 * @generated
	 */
	void unsetGatewayServerUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getGatewayServerUri <em>Gateway Server Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gateway Server Uri</em>' attribute is set.
	 * @see #unsetGatewayServerUri()
	 * @see #getGatewayServerUri()
	 * @see #setGatewayServerUri(String)
	 * @generated
	 */
	boolean isSetGatewayServerUri();

	/**
	 * Returns the value of the '<em><b>Discovery Urls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovery Urls</em>' containment reference.
	 * @see #isSetDiscoveryUrls()
	 * @see #unsetDiscoveryUrls()
	 * @see #setDiscoveryUrls(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisteredServer_DiscoveryUrls()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DiscoveryUrls' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getDiscoveryUrls();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getDiscoveryUrls <em>Discovery Urls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovery Urls</em>' containment reference.
	 * @see #isSetDiscoveryUrls()
	 * @see #unsetDiscoveryUrls()
	 * @see #getDiscoveryUrls()
	 * @generated
	 */
	void setDiscoveryUrls(ListOfString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getDiscoveryUrls <em>Discovery Urls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiscoveryUrls()
	 * @see #getDiscoveryUrls()
	 * @see #setDiscoveryUrls(ListOfString)
	 * @generated
	 */
	void unsetDiscoveryUrls();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getDiscoveryUrls <em>Discovery Urls</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Discovery Urls</em>' containment reference is set.
	 * @see #unsetDiscoveryUrls()
	 * @see #getDiscoveryUrls()
	 * @see #setDiscoveryUrls(ListOfString)
	 * @generated
	 */
	boolean isSetDiscoveryUrls();

	/**
	 * Returns the value of the '<em><b>Semaphore File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semaphore File Path</em>' attribute.
	 * @see #isSetSemaphoreFilePath()
	 * @see #unsetSemaphoreFilePath()
	 * @see #setSemaphoreFilePath(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisteredServer_SemaphoreFilePath()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SemaphoreFilePath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSemaphoreFilePath();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getSemaphoreFilePath <em>Semaphore File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semaphore File Path</em>' attribute.
	 * @see #isSetSemaphoreFilePath()
	 * @see #unsetSemaphoreFilePath()
	 * @see #getSemaphoreFilePath()
	 * @generated
	 */
	void setSemaphoreFilePath(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getSemaphoreFilePath <em>Semaphore File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSemaphoreFilePath()
	 * @see #getSemaphoreFilePath()
	 * @see #setSemaphoreFilePath(String)
	 * @generated
	 */
	void unsetSemaphoreFilePath();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#getSemaphoreFilePath <em>Semaphore File Path</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Semaphore File Path</em>' attribute is set.
	 * @see #unsetSemaphoreFilePath()
	 * @see #getSemaphoreFilePath()
	 * @see #setSemaphoreFilePath(String)
	 * @generated
	 */
	boolean isSetSemaphoreFilePath();

	/**
	 * Returns the value of the '<em><b>Is Online</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Online</em>' attribute.
	 * @see #isSetIsOnline()
	 * @see #unsetIsOnline()
	 * @see #setIsOnline(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisteredServer_IsOnline()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsOnline' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsOnline();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#isIsOnline <em>Is Online</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Online</em>' attribute.
	 * @see #isSetIsOnline()
	 * @see #unsetIsOnline()
	 * @see #isIsOnline()
	 * @generated
	 */
	void setIsOnline(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#isIsOnline <em>Is Online</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsOnline()
	 * @see #isIsOnline()
	 * @see #setIsOnline(boolean)
	 * @generated
	 */
	void unsetIsOnline();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisteredServer#isIsOnline <em>Is Online</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Online</em>' attribute is set.
	 * @see #unsetIsOnline()
	 * @see #isIsOnline()
	 * @see #setIsOnline(boolean)
	 * @generated
	 */
	boolean isSetIsOnline();

} // RegisteredServer
