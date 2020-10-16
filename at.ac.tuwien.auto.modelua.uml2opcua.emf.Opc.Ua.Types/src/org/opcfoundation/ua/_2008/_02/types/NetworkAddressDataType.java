/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Address Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NetworkAddressDataType#getNetworkInterface <em>Network Interface</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNetworkAddressDataType()
 * @model extendedMetaData="name='NetworkAddressDataType' kind='elementOnly'"
 * @generated
 */
public interface NetworkAddressDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Network Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Interface</em>' attribute.
	 * @see #isSetNetworkInterface()
	 * @see #unsetNetworkInterface()
	 * @see #setNetworkInterface(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNetworkAddressDataType_NetworkInterface()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='NetworkInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNetworkInterface();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NetworkAddressDataType#getNetworkInterface <em>Network Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Interface</em>' attribute.
	 * @see #isSetNetworkInterface()
	 * @see #unsetNetworkInterface()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	void setNetworkInterface(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.NetworkAddressDataType#getNetworkInterface <em>Network Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNetworkInterface()
	 * @see #getNetworkInterface()
	 * @see #setNetworkInterface(String)
	 * @generated
	 */
	void unsetNetworkInterface();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.NetworkAddressDataType#getNetworkInterface <em>Network Interface</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Network Interface</em>' attribute is set.
	 * @see #unsetNetworkInterface()
	 * @see #getNetworkInterface()
	 * @see #setNetworkInterface(String)
	 * @generated
	 */
	boolean isSetNetworkInterface();

} // NetworkAddressDataType
