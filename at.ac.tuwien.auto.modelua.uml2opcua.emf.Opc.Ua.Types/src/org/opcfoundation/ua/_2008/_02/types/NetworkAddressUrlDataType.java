/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Address Url Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NetworkAddressUrlDataType#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNetworkAddressUrlDataType()
 * @model extendedMetaData="name='NetworkAddressUrlDataType' kind='elementOnly'"
 * @generated
 */
public interface NetworkAddressUrlDataType extends NetworkAddressDataType {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #isSetUrl()
	 * @see #unsetUrl()
	 * @see #setUrl(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNetworkAddressUrlDataType_Url()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NetworkAddressUrlDataType#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #isSetUrl()
	 * @see #unsetUrl()
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.NetworkAddressUrlDataType#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUrl()
	 * @see #getUrl()
	 * @see #setUrl(String)
	 * @generated
	 */
	void unsetUrl();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.NetworkAddressUrlDataType#getUrl <em>Url</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Url</em>' attribute is set.
	 * @see #unsetUrl()
	 * @see #getUrl()
	 * @see #setUrl(String)
	 * @generated
	 */
	boolean isSetUrl();

} // NetworkAddressUrlDataType
