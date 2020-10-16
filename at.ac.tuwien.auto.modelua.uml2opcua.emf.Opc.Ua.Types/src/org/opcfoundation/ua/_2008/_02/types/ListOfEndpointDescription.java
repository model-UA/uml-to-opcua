/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Endpoint Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfEndpointDescription#getEndpointDescription <em>Endpoint Description</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfEndpointDescription()
 * @model extendedMetaData="name='ListOfEndpointDescription' kind='elementOnly'"
 * @generated
 */
public interface ListOfEndpointDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Endpoint Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.EndpointDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Description</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfEndpointDescription_EndpointDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EndpointDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EndpointDescription> getEndpointDescription();

} // ListOfEndpointDescription
