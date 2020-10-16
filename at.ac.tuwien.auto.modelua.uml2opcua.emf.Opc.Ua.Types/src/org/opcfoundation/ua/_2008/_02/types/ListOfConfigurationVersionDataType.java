/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Configuration Version Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfConfigurationVersionDataType#getConfigurationVersionDataType <em>Configuration Version Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfConfigurationVersionDataType()
 * @model extendedMetaData="name='ListOfConfigurationVersionDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfConfigurationVersionDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration Version Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Version Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfConfigurationVersionDataType_ConfigurationVersionDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConfigurationVersionDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConfigurationVersionDataType> getConfigurationVersionDataType();

} // ListOfConfigurationVersionDataType
