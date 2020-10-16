/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getApplicationUri <em>Application Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getProductUri <em>Product Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getApplicationName <em>Application Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getApplicationType <em>Application Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getGatewayServerUri <em>Gateway Server Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getDiscoveryProfileUri <em>Discovery Profile Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getDiscoveryUrls <em>Discovery Urls</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getApplicationDescription()
 * @model extendedMetaData="name='ApplicationDescription' kind='elementOnly'"
 * @generated
 */
public interface ApplicationDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Application Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Uri</em>' attribute.
	 * @see #isSetApplicationUri()
	 * @see #unsetApplicationUri()
	 * @see #setApplicationUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getApplicationDescription_ApplicationUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ApplicationUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getApplicationUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getApplicationUri <em>Application Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Uri</em>' attribute.
	 * @see #isSetApplicationUri()
	 * @see #unsetApplicationUri()
	 * @see #getApplicationUri()
	 * @generated
	 */
	void setApplicationUri(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getApplicationUri <em>Application Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplicationUri()
	 * @see #getApplicationUri()
	 * @see #setApplicationUri(String)
	 * @generated
	 */
	void unsetApplicationUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getApplicationUri <em>Application Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Application Uri</em>' attribute is set.
	 * @see #unsetApplicationUri()
	 * @see #getApplicationUri()
	 * @see #setApplicationUri(String)
	 * @generated
	 */
	boolean isSetApplicationUri();

	/**
	 * Returns the value of the '<em><b>Product Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Uri</em>' attribute.
	 * @see #isSetProductUri()
	 * @see #unsetProductUri()
	 * @see #setProductUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getApplicationDescription_ProductUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ProductUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getProductUri <em>Product Uri</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getProductUri <em>Product Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProductUri()
	 * @see #getProductUri()
	 * @see #setProductUri(String)
	 * @generated
	 */
	void unsetProductUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getProductUri <em>Product Uri</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Application Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Name</em>' containment reference.
	 * @see #isSetApplicationName()
	 * @see #unsetApplicationName()
	 * @see #setApplicationName(LocalizedText)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getApplicationDescription_ApplicationName()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ApplicationName' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedText getApplicationName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getApplicationName <em>Application Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Name</em>' containment reference.
	 * @see #isSetApplicationName()
	 * @see #unsetApplicationName()
	 * @see #getApplicationName()
	 * @generated
	 */
	void setApplicationName(LocalizedText value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getApplicationName <em>Application Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplicationName()
	 * @see #getApplicationName()
	 * @see #setApplicationName(LocalizedText)
	 * @generated
	 */
	void unsetApplicationName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getApplicationName <em>Application Name</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Application Name</em>' containment reference is set.
	 * @see #unsetApplicationName()
	 * @see #getApplicationName()
	 * @see #setApplicationName(LocalizedText)
	 * @generated
	 */
	boolean isSetApplicationName();

	/**
	 * Returns the value of the '<em><b>Application Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.ApplicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.ApplicationType
	 * @see #isSetApplicationType()
	 * @see #unsetApplicationType()
	 * @see #setApplicationType(ApplicationType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getApplicationDescription_ApplicationType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ApplicationType' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicationType getApplicationType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getApplicationType <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.ApplicationType
	 * @see #isSetApplicationType()
	 * @see #unsetApplicationType()
	 * @see #getApplicationType()
	 * @generated
	 */
	void setApplicationType(ApplicationType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getApplicationType <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplicationType()
	 * @see #getApplicationType()
	 * @see #setApplicationType(ApplicationType)
	 * @generated
	 */
	void unsetApplicationType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getApplicationType <em>Application Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Application Type</em>' attribute is set.
	 * @see #unsetApplicationType()
	 * @see #getApplicationType()
	 * @see #setApplicationType(ApplicationType)
	 * @generated
	 */
	boolean isSetApplicationType();

	/**
	 * Returns the value of the '<em><b>Gateway Server Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Server Uri</em>' attribute.
	 * @see #isSetGatewayServerUri()
	 * @see #unsetGatewayServerUri()
	 * @see #setGatewayServerUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getApplicationDescription_GatewayServerUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='GatewayServerUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGatewayServerUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getGatewayServerUri <em>Gateway Server Uri</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getGatewayServerUri <em>Gateway Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGatewayServerUri()
	 * @see #getGatewayServerUri()
	 * @see #setGatewayServerUri(String)
	 * @generated
	 */
	void unsetGatewayServerUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getGatewayServerUri <em>Gateway Server Uri</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Discovery Profile Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovery Profile Uri</em>' attribute.
	 * @see #isSetDiscoveryProfileUri()
	 * @see #unsetDiscoveryProfileUri()
	 * @see #setDiscoveryProfileUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getApplicationDescription_DiscoveryProfileUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DiscoveryProfileUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDiscoveryProfileUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getDiscoveryProfileUri <em>Discovery Profile Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovery Profile Uri</em>' attribute.
	 * @see #isSetDiscoveryProfileUri()
	 * @see #unsetDiscoveryProfileUri()
	 * @see #getDiscoveryProfileUri()
	 * @generated
	 */
	void setDiscoveryProfileUri(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getDiscoveryProfileUri <em>Discovery Profile Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiscoveryProfileUri()
	 * @see #getDiscoveryProfileUri()
	 * @see #setDiscoveryProfileUri(String)
	 * @generated
	 */
	void unsetDiscoveryProfileUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getDiscoveryProfileUri <em>Discovery Profile Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Discovery Profile Uri</em>' attribute is set.
	 * @see #unsetDiscoveryProfileUri()
	 * @see #getDiscoveryProfileUri()
	 * @see #setDiscoveryProfileUri(String)
	 * @generated
	 */
	boolean isSetDiscoveryProfileUri();

	/**
	 * Returns the value of the '<em><b>Discovery Urls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovery Urls</em>' containment reference.
	 * @see #isSetDiscoveryUrls()
	 * @see #unsetDiscoveryUrls()
	 * @see #setDiscoveryUrls(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getApplicationDescription_DiscoveryUrls()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DiscoveryUrls' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getDiscoveryUrls();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getDiscoveryUrls <em>Discovery Urls</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getDiscoveryUrls <em>Discovery Urls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiscoveryUrls()
	 * @see #getDiscoveryUrls()
	 * @see #setDiscoveryUrls(ListOfString)
	 * @generated
	 */
	void unsetDiscoveryUrls();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ApplicationDescription#getDiscoveryUrls <em>Discovery Urls</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Discovery Urls</em>' containment reference is set.
	 * @see #unsetDiscoveryUrls()
	 * @see #getDiscoveryUrls()
	 * @see #setDiscoveryUrls(ListOfString)
	 * @generated
	 */
	boolean isSetDiscoveryUrls();

} // ApplicationDescription
