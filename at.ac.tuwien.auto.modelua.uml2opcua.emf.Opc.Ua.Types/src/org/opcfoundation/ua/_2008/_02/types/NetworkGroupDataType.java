/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Group Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NetworkGroupDataType#getServerUri <em>Server Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NetworkGroupDataType#getNetworkPaths <em>Network Paths</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNetworkGroupDataType()
 * @model extendedMetaData="name='NetworkGroupDataType' kind='elementOnly'"
 * @generated
 */
public interface NetworkGroupDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Server Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Uri</em>' attribute.
	 * @see #isSetServerUri()
	 * @see #unsetServerUri()
	 * @see #setServerUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNetworkGroupDataType_ServerUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ServerUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServerUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NetworkGroupDataType#getServerUri <em>Server Uri</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.NetworkGroupDataType#getServerUri <em>Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerUri()
	 * @see #getServerUri()
	 * @see #setServerUri(String)
	 * @generated
	 */
	void unsetServerUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.NetworkGroupDataType#getServerUri <em>Server Uri</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Network Paths</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Paths</em>' containment reference.
	 * @see #isSetNetworkPaths()
	 * @see #unsetNetworkPaths()
	 * @see #setNetworkPaths(ListOfEndpointUrlListDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNetworkGroupDataType_NetworkPaths()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NetworkPaths' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfEndpointUrlListDataType getNetworkPaths();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NetworkGroupDataType#getNetworkPaths <em>Network Paths</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Paths</em>' containment reference.
	 * @see #isSetNetworkPaths()
	 * @see #unsetNetworkPaths()
	 * @see #getNetworkPaths()
	 * @generated
	 */
	void setNetworkPaths(ListOfEndpointUrlListDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.NetworkGroupDataType#getNetworkPaths <em>Network Paths</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNetworkPaths()
	 * @see #getNetworkPaths()
	 * @see #setNetworkPaths(ListOfEndpointUrlListDataType)
	 * @generated
	 */
	void unsetNetworkPaths();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.NetworkGroupDataType#getNetworkPaths <em>Network Paths</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Network Paths</em>' containment reference is set.
	 * @see #unsetNetworkPaths()
	 * @see #getNetworkPaths()
	 * @see #setNetworkPaths(ListOfEndpointUrlListDataType)
	 * @generated
	 */
	boolean isSetNetworkPaths();

} // NetworkGroupDataType
