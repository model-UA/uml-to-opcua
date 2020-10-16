/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redundant Server Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RedundantServerDataType#getServerId <em>Server Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RedundantServerDataType#getServiceLevel <em>Service Level</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RedundantServerDataType#getServerState <em>Server State</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRedundantServerDataType()
 * @model extendedMetaData="name='RedundantServerDataType' kind='elementOnly'"
 * @generated
 */
public interface RedundantServerDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Server Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Id</em>' attribute.
	 * @see #isSetServerId()
	 * @see #unsetServerId()
	 * @see #setServerId(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRedundantServerDataType_ServerId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ServerId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServerId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RedundantServerDataType#getServerId <em>Server Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Id</em>' attribute.
	 * @see #isSetServerId()
	 * @see #unsetServerId()
	 * @see #getServerId()
	 * @generated
	 */
	void setServerId(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RedundantServerDataType#getServerId <em>Server Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerId()
	 * @see #getServerId()
	 * @see #setServerId(String)
	 * @generated
	 */
	void unsetServerId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RedundantServerDataType#getServerId <em>Server Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Id</em>' attribute is set.
	 * @see #unsetServerId()
	 * @see #getServerId()
	 * @see #setServerId(String)
	 * @generated
	 */
	boolean isSetServerId();

	/**
	 * Returns the value of the '<em><b>Service Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Level</em>' attribute.
	 * @see #isSetServiceLevel()
	 * @see #unsetServiceLevel()
	 * @see #setServiceLevel(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRedundantServerDataType_ServiceLevel()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='element' name='ServiceLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	short getServiceLevel();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RedundantServerDataType#getServiceLevel <em>Service Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Level</em>' attribute.
	 * @see #isSetServiceLevel()
	 * @see #unsetServiceLevel()
	 * @see #getServiceLevel()
	 * @generated
	 */
	void setServiceLevel(short value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RedundantServerDataType#getServiceLevel <em>Service Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServiceLevel()
	 * @see #getServiceLevel()
	 * @see #setServiceLevel(short)
	 * @generated
	 */
	void unsetServiceLevel();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RedundantServerDataType#getServiceLevel <em>Service Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service Level</em>' attribute is set.
	 * @see #unsetServiceLevel()
	 * @see #getServiceLevel()
	 * @see #setServiceLevel(short)
	 * @generated
	 */
	boolean isSetServiceLevel();

	/**
	 * Returns the value of the '<em><b>Server State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.ServerState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server State</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.ServerState
	 * @see #isSetServerState()
	 * @see #unsetServerState()
	 * @see #setServerState(ServerState)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRedundantServerDataType_ServerState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ServerState' namespace='##targetNamespace'"
	 * @generated
	 */
	ServerState getServerState();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RedundantServerDataType#getServerState <em>Server State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server State</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.ServerState
	 * @see #isSetServerState()
	 * @see #unsetServerState()
	 * @see #getServerState()
	 * @generated
	 */
	void setServerState(ServerState value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RedundantServerDataType#getServerState <em>Server State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerState()
	 * @see #getServerState()
	 * @see #setServerState(ServerState)
	 * @generated
	 */
	void unsetServerState();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RedundantServerDataType#getServerState <em>Server State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server State</em>' attribute is set.
	 * @see #unsetServerState()
	 * @see #getServerState()
	 * @see #setServerState(ServerState)
	 * @generated
	 */
	boolean isSetServerState();

} // RedundantServerDataType
