/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Nodes Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddNodesRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddNodesRequest#getNodesToAdd <em>Nodes To Add</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddNodesRequest()
 * @model extendedMetaData="name='AddNodesRequest' kind='elementOnly'"
 * @generated
 */
public interface AddNodesRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddNodesRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Nodes To Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes To Add</em>' containment reference.
	 * @see #isSetNodesToAdd()
	 * @see #unsetNodesToAdd()
	 * @see #setNodesToAdd(ListOfAddNodesItem)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddNodesRequest_NodesToAdd()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodesToAdd' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfAddNodesItem getNodesToAdd();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesRequest#getNodesToAdd <em>Nodes To Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes To Add</em>' containment reference.
	 * @see #isSetNodesToAdd()
	 * @see #unsetNodesToAdd()
	 * @see #getNodesToAdd()
	 * @generated
	 */
	void setNodesToAdd(ListOfAddNodesItem value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesRequest#getNodesToAdd <em>Nodes To Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodesToAdd()
	 * @see #getNodesToAdd()
	 * @see #setNodesToAdd(ListOfAddNodesItem)
	 * @generated
	 */
	void unsetNodesToAdd();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AddNodesRequest#getNodesToAdd <em>Nodes To Add</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nodes To Add</em>' containment reference is set.
	 * @see #unsetNodesToAdd()
	 * @see #getNodesToAdd()
	 * @see #setNodesToAdd(ListOfAddNodesItem)
	 * @generated
	 */
	boolean isSetNodesToAdd();

} // AddNodesRequest
