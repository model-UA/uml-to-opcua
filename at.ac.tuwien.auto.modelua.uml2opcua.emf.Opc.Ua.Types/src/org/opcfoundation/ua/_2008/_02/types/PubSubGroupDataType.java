/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pub Sub Group Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getName <em>Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getSecurityMode <em>Security Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getSecurityGroupId <em>Security Group Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getSecurityKeyServices <em>Security Key Services</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getMaxNetworkMessageSize <em>Max Network Message Size</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getGroupProperties <em>Group Properties</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubGroupDataType()
 * @model extendedMetaData="name='PubSubGroupDataType' kind='elementOnly'"
 * @generated
 */
public interface PubSubGroupDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubGroupDataType_Name()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #setEnabled(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubGroupDataType_Enabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Enabled' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnabled()
	 * @see #isEnabled()
	 * @see #setEnabled(boolean)
	 * @generated
	 */
	void unsetEnabled();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#isEnabled <em>Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enabled</em>' attribute is set.
	 * @see #unsetEnabled()
	 * @see #isEnabled()
	 * @see #setEnabled(boolean)
	 * @generated
	 */
	boolean isSetEnabled();

	/**
	 * Returns the value of the '<em><b>Security Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.MessageSecurityMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Mode</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.MessageSecurityMode
	 * @see #isSetSecurityMode()
	 * @see #unsetSecurityMode()
	 * @see #setSecurityMode(MessageSecurityMode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubGroupDataType_SecurityMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SecurityMode' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageSecurityMode getSecurityMode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getSecurityMode <em>Security Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Mode</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.MessageSecurityMode
	 * @see #isSetSecurityMode()
	 * @see #unsetSecurityMode()
	 * @see #getSecurityMode()
	 * @generated
	 */
	void setSecurityMode(MessageSecurityMode value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getSecurityMode <em>Security Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityMode()
	 * @see #getSecurityMode()
	 * @see #setSecurityMode(MessageSecurityMode)
	 * @generated
	 */
	void unsetSecurityMode();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getSecurityMode <em>Security Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security Mode</em>' attribute is set.
	 * @see #unsetSecurityMode()
	 * @see #getSecurityMode()
	 * @see #setSecurityMode(MessageSecurityMode)
	 * @generated
	 */
	boolean isSetSecurityMode();

	/**
	 * Returns the value of the '<em><b>Security Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Group Id</em>' attribute.
	 * @see #isSetSecurityGroupId()
	 * @see #unsetSecurityGroupId()
	 * @see #setSecurityGroupId(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubGroupDataType_SecurityGroupId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SecurityGroupId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecurityGroupId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getSecurityGroupId <em>Security Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group Id</em>' attribute.
	 * @see #isSetSecurityGroupId()
	 * @see #unsetSecurityGroupId()
	 * @see #getSecurityGroupId()
	 * @generated
	 */
	void setSecurityGroupId(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getSecurityGroupId <em>Security Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityGroupId()
	 * @see #getSecurityGroupId()
	 * @see #setSecurityGroupId(String)
	 * @generated
	 */
	void unsetSecurityGroupId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getSecurityGroupId <em>Security Group Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security Group Id</em>' attribute is set.
	 * @see #unsetSecurityGroupId()
	 * @see #getSecurityGroupId()
	 * @see #setSecurityGroupId(String)
	 * @generated
	 */
	boolean isSetSecurityGroupId();

	/**
	 * Returns the value of the '<em><b>Security Key Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Key Services</em>' containment reference.
	 * @see #isSetSecurityKeyServices()
	 * @see #unsetSecurityKeyServices()
	 * @see #setSecurityKeyServices(ListOfEndpointDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubGroupDataType_SecurityKeyServices()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SecurityKeyServices' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfEndpointDescription getSecurityKeyServices();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getSecurityKeyServices <em>Security Key Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Key Services</em>' containment reference.
	 * @see #isSetSecurityKeyServices()
	 * @see #unsetSecurityKeyServices()
	 * @see #getSecurityKeyServices()
	 * @generated
	 */
	void setSecurityKeyServices(ListOfEndpointDescription value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getSecurityKeyServices <em>Security Key Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurityKeyServices()
	 * @see #getSecurityKeyServices()
	 * @see #setSecurityKeyServices(ListOfEndpointDescription)
	 * @generated
	 */
	void unsetSecurityKeyServices();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getSecurityKeyServices <em>Security Key Services</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security Key Services</em>' containment reference is set.
	 * @see #unsetSecurityKeyServices()
	 * @see #getSecurityKeyServices()
	 * @see #setSecurityKeyServices(ListOfEndpointDescription)
	 * @generated
	 */
	boolean isSetSecurityKeyServices();

	/**
	 * Returns the value of the '<em><b>Max Network Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Network Message Size</em>' attribute.
	 * @see #isSetMaxNetworkMessageSize()
	 * @see #unsetMaxNetworkMessageSize()
	 * @see #setMaxNetworkMessageSize(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubGroupDataType_MaxNetworkMessageSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MaxNetworkMessageSize' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMaxNetworkMessageSize();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getMaxNetworkMessageSize <em>Max Network Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Network Message Size</em>' attribute.
	 * @see #isSetMaxNetworkMessageSize()
	 * @see #unsetMaxNetworkMessageSize()
	 * @see #getMaxNetworkMessageSize()
	 * @generated
	 */
	void setMaxNetworkMessageSize(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getMaxNetworkMessageSize <em>Max Network Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxNetworkMessageSize()
	 * @see #getMaxNetworkMessageSize()
	 * @see #setMaxNetworkMessageSize(long)
	 * @generated
	 */
	void unsetMaxNetworkMessageSize();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getMaxNetworkMessageSize <em>Max Network Message Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Network Message Size</em>' attribute is set.
	 * @see #unsetMaxNetworkMessageSize()
	 * @see #getMaxNetworkMessageSize()
	 * @see #setMaxNetworkMessageSize(long)
	 * @generated
	 */
	boolean isSetMaxNetworkMessageSize();

	/**
	 * Returns the value of the '<em><b>Group Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Properties</em>' containment reference.
	 * @see #isSetGroupProperties()
	 * @see #unsetGroupProperties()
	 * @see #setGroupProperties(ListOfKeyValuePair)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubGroupDataType_GroupProperties()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='GroupProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfKeyValuePair getGroupProperties();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getGroupProperties <em>Group Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Properties</em>' containment reference.
	 * @see #isSetGroupProperties()
	 * @see #unsetGroupProperties()
	 * @see #getGroupProperties()
	 * @generated
	 */
	void setGroupProperties(ListOfKeyValuePair value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getGroupProperties <em>Group Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroupProperties()
	 * @see #getGroupProperties()
	 * @see #setGroupProperties(ListOfKeyValuePair)
	 * @generated
	 */
	void unsetGroupProperties();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType#getGroupProperties <em>Group Properties</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Group Properties</em>' containment reference is set.
	 * @see #unsetGroupProperties()
	 * @see #getGroupProperties()
	 * @see #setGroupProperties(ListOfKeyValuePair)
	 * @generated
	 */
	boolean isSetGroupProperties();

} // PubSubGroupDataType
