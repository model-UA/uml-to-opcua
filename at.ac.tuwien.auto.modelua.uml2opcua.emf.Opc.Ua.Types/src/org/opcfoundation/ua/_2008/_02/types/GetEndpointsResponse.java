/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Endpoints Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.GetEndpointsResponse#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.GetEndpointsResponse#getEndpoints <em>Endpoints</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getGetEndpointsResponse()
 * @model extendedMetaData="name='GetEndpointsResponse' kind='elementOnly'"
 * @generated
 */
public interface GetEndpointsResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getGetEndpointsResponse_ResponseHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ResponseHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseHeader getResponseHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsResponse#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #getResponseHeader()
	 * @generated
	 */
	void setResponseHeader(ResponseHeader value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsResponse#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	void unsetResponseHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsResponse#getResponseHeader <em>Response Header</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Response Header</em>' containment reference is set.
	 * @see #unsetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	boolean isSetResponseHeader();

	/**
	 * Returns the value of the '<em><b>Endpoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoints</em>' containment reference.
	 * @see #isSetEndpoints()
	 * @see #unsetEndpoints()
	 * @see #setEndpoints(ListOfEndpointDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getGetEndpointsResponse_Endpoints()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Endpoints' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfEndpointDescription getEndpoints();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsResponse#getEndpoints <em>Endpoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoints</em>' containment reference.
	 * @see #isSetEndpoints()
	 * @see #unsetEndpoints()
	 * @see #getEndpoints()
	 * @generated
	 */
	void setEndpoints(ListOfEndpointDescription value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsResponse#getEndpoints <em>Endpoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndpoints()
	 * @see #getEndpoints()
	 * @see #setEndpoints(ListOfEndpointDescription)
	 * @generated
	 */
	void unsetEndpoints();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.GetEndpointsResponse#getEndpoints <em>Endpoints</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Endpoints</em>' containment reference is set.
	 * @see #unsetEndpoints()
	 * @see #getEndpoints()
	 * @see #setEndpoints(ListOfEndpointDescription)
	 * @generated
	 */
	boolean isSetEndpoints();

} // GetEndpointsResponse
