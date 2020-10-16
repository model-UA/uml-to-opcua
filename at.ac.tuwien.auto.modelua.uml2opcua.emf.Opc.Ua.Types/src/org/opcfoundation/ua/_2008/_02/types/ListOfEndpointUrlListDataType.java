/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Endpoint Url List Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfEndpointUrlListDataType#getEndpointUrlListDataType <em>Endpoint Url List Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfEndpointUrlListDataType()
 * @model extendedMetaData="name='ListOfEndpointUrlListDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfEndpointUrlListDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Endpoint Url List Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.EndpointUrlListDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Url List Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfEndpointUrlListDataType_EndpointUrlListDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EndpointUrlListDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EndpointUrlListDataType> getEndpointUrlListDataType();

} // ListOfEndpointUrlListDataType
