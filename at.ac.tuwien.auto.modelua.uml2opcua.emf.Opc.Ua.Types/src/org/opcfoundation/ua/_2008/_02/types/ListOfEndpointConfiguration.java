/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Endpoint Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfEndpointConfiguration#getEndpointConfiguration <em>Endpoint Configuration</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfEndpointConfiguration()
 * @model extendedMetaData="name='ListOfEndpointConfiguration' kind='elementOnly'"
 * @generated
 */
public interface ListOfEndpointConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Endpoint Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.EndpointConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Configuration</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfEndpointConfiguration_EndpointConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EndpointConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EndpointConfiguration> getEndpointConfiguration();

} // ListOfEndpointConfiguration
