/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Pub Sub Configuration Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfPubSubConfigurationDataType#getPubSubConfigurationDataType <em>Pub Sub Configuration Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfPubSubConfigurationDataType()
 * @model extendedMetaData="name='ListOfPubSubConfigurationDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfPubSubConfigurationDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pub Sub Configuration Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub Sub Configuration Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfPubSubConfigurationDataType_PubSubConfigurationDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PubSubConfigurationDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PubSubConfigurationDataType> getPubSubConfigurationDataType();

} // ListOfPubSubConfigurationDataType
