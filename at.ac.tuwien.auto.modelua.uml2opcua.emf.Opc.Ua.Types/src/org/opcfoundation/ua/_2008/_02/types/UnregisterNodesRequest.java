/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unregister Nodes Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UnregisterNodesRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UnregisterNodesRequest#getNodesToUnregister <em>Nodes To Unregister</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUnregisterNodesRequest()
 * @model extendedMetaData="name='UnregisterNodesRequest' kind='elementOnly'"
 * @generated
 */
public interface UnregisterNodesRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUnregisterNodesRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UnregisterNodesRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UnregisterNodesRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UnregisterNodesRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Nodes To Unregister</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes To Unregister</em>' containment reference.
	 * @see #isSetNodesToUnregister()
	 * @see #unsetNodesToUnregister()
	 * @see #setNodesToUnregister(ListOfNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUnregisterNodesRequest_NodesToUnregister()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodesToUnregister' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfNodeId getNodesToUnregister();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UnregisterNodesRequest#getNodesToUnregister <em>Nodes To Unregister</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes To Unregister</em>' containment reference.
	 * @see #isSetNodesToUnregister()
	 * @see #unsetNodesToUnregister()
	 * @see #getNodesToUnregister()
	 * @generated
	 */
	void setNodesToUnregister(ListOfNodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UnregisterNodesRequest#getNodesToUnregister <em>Nodes To Unregister</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodesToUnregister()
	 * @see #getNodesToUnregister()
	 * @see #setNodesToUnregister(ListOfNodeId)
	 * @generated
	 */
	void unsetNodesToUnregister();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UnregisterNodesRequest#getNodesToUnregister <em>Nodes To Unregister</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nodes To Unregister</em>' containment reference is set.
	 * @see #unsetNodesToUnregister()
	 * @see #getNodesToUnregister()
	 * @see #setNodesToUnregister(ListOfNodeId)
	 * @generated
	 */
	boolean isSetNodesToUnregister();

} // UnregisterNodesRequest
