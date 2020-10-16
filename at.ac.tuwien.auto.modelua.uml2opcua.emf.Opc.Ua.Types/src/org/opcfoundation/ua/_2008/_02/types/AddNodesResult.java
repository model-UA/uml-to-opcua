/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Nodes Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddNodesResult#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddNodesResult#getAddedNodeId <em>Added Node Id</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddNodesResult()
 * @model extendedMetaData="name='AddNodesResult' kind='elementOnly'"
 * @generated
 */
public interface AddNodesResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code</em>' containment reference.
	 * @see #setStatusCode(StatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddNodesResult_StatusCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StatusCode' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusCode getStatusCode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesResult#getStatusCode <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' containment reference.
	 * @see #getStatusCode()
	 * @generated
	 */
	void setStatusCode(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Added Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Added Node Id</em>' containment reference.
	 * @see #isSetAddedNodeId()
	 * @see #unsetAddedNodeId()
	 * @see #setAddedNodeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddNodesResult_AddedNodeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AddedNodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getAddedNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesResult#getAddedNodeId <em>Added Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Added Node Id</em>' containment reference.
	 * @see #isSetAddedNodeId()
	 * @see #unsetAddedNodeId()
	 * @see #getAddedNodeId()
	 * @generated
	 */
	void setAddedNodeId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesResult#getAddedNodeId <em>Added Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddedNodeId()
	 * @see #getAddedNodeId()
	 * @see #setAddedNodeId(NodeId)
	 * @generated
	 */
	void unsetAddedNodeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesResult#getAddedNodeId <em>Added Node Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Added Node Id</em>' containment reference is set.
	 * @see #unsetAddedNodeId()
	 * @see #getAddedNodeId()
	 * @see #setAddedNodeId(NodeId)
	 * @generated
	 */
	boolean isSetAddedNodeId();

} // AddNodesResult
