/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register Nodes Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RegisterNodesRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RegisterNodesRequest#getNodesToRegister <em>Nodes To Register</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisterNodesRequest()
 * @model extendedMetaData="name='RegisterNodesRequest' kind='elementOnly'"
 * @generated
 */
public interface RegisterNodesRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisterNodesRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterNodesRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #getRequestHeader()
	 * @generated
	 */
	void setRequestHeader(RequestHeader value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterNodesRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterNodesRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Request Header</em>' containment reference is set.
	 * @see #unsetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	boolean isSetRequestHeader();

	/**
	 * Returns the value of the '<em><b>Nodes To Register</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes To Register</em>' containment reference.
	 * @see #isSetNodesToRegister()
	 * @see #unsetNodesToRegister()
	 * @see #setNodesToRegister(ListOfNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisterNodesRequest_NodesToRegister()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodesToRegister' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfNodeId getNodesToRegister();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterNodesRequest#getNodesToRegister <em>Nodes To Register</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes To Register</em>' containment reference.
	 * @see #isSetNodesToRegister()
	 * @see #unsetNodesToRegister()
	 * @see #getNodesToRegister()
	 * @generated
	 */
	void setNodesToRegister(ListOfNodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterNodesRequest#getNodesToRegister <em>Nodes To Register</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodesToRegister()
	 * @see #getNodesToRegister()
	 * @see #setNodesToRegister(ListOfNodeId)
	 * @generated
	 */
	void unsetNodesToRegister();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterNodesRequest#getNodesToRegister <em>Nodes To Register</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nodes To Register</em>' containment reference is set.
	 * @see #unsetNodesToRegister()
	 * @see #getNodesToRegister()
	 * @see #setNodesToRegister(ListOfNodeId)
	 * @generated
	 */
	boolean isSetNodesToRegister();

} // RegisterNodesRequest
