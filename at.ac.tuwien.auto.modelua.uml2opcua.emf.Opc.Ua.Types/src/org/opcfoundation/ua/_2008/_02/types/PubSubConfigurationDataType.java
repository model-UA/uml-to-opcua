/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pub Sub Configuration Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType#getPublishedDataSets <em>Published Data Sets</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType#isEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubConfigurationDataType()
 * @model extendedMetaData="name='PubSubConfigurationDataType' kind='elementOnly'"
 * @generated
 */
public interface PubSubConfigurationDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Published Data Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published Data Sets</em>' containment reference.
	 * @see #isSetPublishedDataSets()
	 * @see #unsetPublishedDataSets()
	 * @see #setPublishedDataSets(ListOfPublishedDataSetDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubConfigurationDataType_PublishedDataSets()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='PublishedDataSets' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfPublishedDataSetDataType getPublishedDataSets();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType#getPublishedDataSets <em>Published Data Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published Data Sets</em>' containment reference.
	 * @see #isSetPublishedDataSets()
	 * @see #unsetPublishedDataSets()
	 * @see #getPublishedDataSets()
	 * @generated
	 */
	void setPublishedDataSets(ListOfPublishedDataSetDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType#getPublishedDataSets <em>Published Data Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPublishedDataSets()
	 * @see #getPublishedDataSets()
	 * @see #setPublishedDataSets(ListOfPublishedDataSetDataType)
	 * @generated
	 */
	void unsetPublishedDataSets();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType#getPublishedDataSets <em>Published Data Sets</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Published Data Sets</em>' containment reference is set.
	 * @see #unsetPublishedDataSets()
	 * @see #getPublishedDataSets()
	 * @see #setPublishedDataSets(ListOfPublishedDataSetDataType)
	 * @generated
	 */
	boolean isSetPublishedDataSets();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference.
	 * @see #isSetConnections()
	 * @see #unsetConnections()
	 * @see #setConnections(ListOfPubSubConnectionDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubConfigurationDataType_Connections()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Connections' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfPubSubConnectionDataType getConnections();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType#getConnections <em>Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connections</em>' containment reference.
	 * @see #isSetConnections()
	 * @see #unsetConnections()
	 * @see #getConnections()
	 * @generated
	 */
	void setConnections(ListOfPubSubConnectionDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType#getConnections <em>Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnections()
	 * @see #getConnections()
	 * @see #setConnections(ListOfPubSubConnectionDataType)
	 * @generated
	 */
	void unsetConnections();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType#getConnections <em>Connections</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connections</em>' containment reference is set.
	 * @see #unsetConnections()
	 * @see #getConnections()
	 * @see #setConnections(ListOfPubSubConnectionDataType)
	 * @generated
	 */
	boolean isSetConnections();

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #setEnabled(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPubSubConfigurationDataType_Enabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Enabled' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType#isEnabled <em>Enabled</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnabled()
	 * @see #isEnabled()
	 * @see #setEnabled(boolean)
	 * @generated
	 */
	void unsetEnabled();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType#isEnabled <em>Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enabled</em>' attribute is set.
	 * @see #unsetEnabled()
	 * @see #isEnabled()
	 * @see #setEnabled(boolean)
	 * @generated
	 */
	boolean isSetEnabled();

} // PubSubConfigurationDataType
