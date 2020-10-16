/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint Url List Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EndpointUrlListDataType#getEndpointUrlList <em>Endpoint Url List</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointUrlListDataType()
 * @model extendedMetaData="name='EndpointUrlListDataType' kind='elementOnly'"
 * @generated
 */
public interface EndpointUrlListDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Endpoint Url List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Url List</em>' containment reference.
	 * @see #isSetEndpointUrlList()
	 * @see #unsetEndpointUrlList()
	 * @see #setEndpointUrlList(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEndpointUrlListDataType_EndpointUrlList()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='EndpointUrlList' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getEndpointUrlList();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointUrlListDataType#getEndpointUrlList <em>Endpoint Url List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Url List</em>' containment reference.
	 * @see #isSetEndpointUrlList()
	 * @see #unsetEndpointUrlList()
	 * @see #getEndpointUrlList()
	 * @generated
	 */
	void setEndpointUrlList(ListOfString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointUrlListDataType#getEndpointUrlList <em>Endpoint Url List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndpointUrlList()
	 * @see #getEndpointUrlList()
	 * @see #setEndpointUrlList(ListOfString)
	 * @generated
	 */
	void unsetEndpointUrlList();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EndpointUrlListDataType#getEndpointUrlList <em>Endpoint Url List</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Endpoint Url List</em>' containment reference is set.
	 * @see #unsetEndpointUrlList()
	 * @see #getEndpointUrlList()
	 * @see #setEndpointUrlList(ListOfString)
	 * @generated
	 */
	boolean isSetEndpointUrlList();

} // EndpointUrlListDataType
