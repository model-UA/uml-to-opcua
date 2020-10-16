/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register Nodes Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RegisterNodesResponse#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RegisterNodesResponse#getRegisteredNodeIds <em>Registered Node Ids</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisterNodesResponse()
 * @model extendedMetaData="name='RegisterNodesResponse' kind='elementOnly'"
 * @generated
 */
public interface RegisterNodesResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisterNodesResponse_ResponseHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ResponseHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseHeader getResponseHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterNodesResponse#getResponseHeader <em>Response Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterNodesResponse#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	void unsetResponseHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterNodesResponse#getResponseHeader <em>Response Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Registered Node Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Node Ids</em>' containment reference.
	 * @see #isSetRegisteredNodeIds()
	 * @see #unsetRegisteredNodeIds()
	 * @see #setRegisteredNodeIds(ListOfNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisterNodesResponse_RegisteredNodeIds()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RegisteredNodeIds' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfNodeId getRegisteredNodeIds();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterNodesResponse#getRegisteredNodeIds <em>Registered Node Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registered Node Ids</em>' containment reference.
	 * @see #isSetRegisteredNodeIds()
	 * @see #unsetRegisteredNodeIds()
	 * @see #getRegisteredNodeIds()
	 * @generated
	 */
	void setRegisteredNodeIds(ListOfNodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterNodesResponse#getRegisteredNodeIds <em>Registered Node Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegisteredNodeIds()
	 * @see #getRegisteredNodeIds()
	 * @see #setRegisteredNodeIds(ListOfNodeId)
	 * @generated
	 */
	void unsetRegisteredNodeIds();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterNodesResponse#getRegisteredNodeIds <em>Registered Node Ids</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Registered Node Ids</em>' containment reference is set.
	 * @see #unsetRegisteredNodeIds()
	 * @see #getRegisteredNodeIds()
	 * @see #setRegisteredNodeIds(ListOfNodeId)
	 * @generated
	 */
	boolean isSetRegisteredNodeIds();

} // RegisterNodesResponse
