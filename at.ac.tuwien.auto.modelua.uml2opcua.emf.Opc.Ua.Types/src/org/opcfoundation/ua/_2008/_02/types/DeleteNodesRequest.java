/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Nodes Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DeleteNodesRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DeleteNodesRequest#getNodesToDelete <em>Nodes To Delete</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteNodesRequest()
 * @model extendedMetaData="name='DeleteNodesRequest' kind='elementOnly'"
 * @generated
 */
public interface DeleteNodesRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteNodesRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteNodesRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteNodesRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteNodesRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Nodes To Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes To Delete</em>' containment reference.
	 * @see #isSetNodesToDelete()
	 * @see #unsetNodesToDelete()
	 * @see #setNodesToDelete(ListOfDeleteNodesItem)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteNodesRequest_NodesToDelete()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodesToDelete' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDeleteNodesItem getNodesToDelete();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteNodesRequest#getNodesToDelete <em>Nodes To Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes To Delete</em>' containment reference.
	 * @see #isSetNodesToDelete()
	 * @see #unsetNodesToDelete()
	 * @see #getNodesToDelete()
	 * @generated
	 */
	void setNodesToDelete(ListOfDeleteNodesItem value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteNodesRequest#getNodesToDelete <em>Nodes To Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodesToDelete()
	 * @see #getNodesToDelete()
	 * @see #setNodesToDelete(ListOfDeleteNodesItem)
	 * @generated
	 */
	void unsetNodesToDelete();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteNodesRequest#getNodesToDelete <em>Nodes To Delete</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nodes To Delete</em>' containment reference is set.
	 * @see #unsetNodesToDelete()
	 * @see #getNodesToDelete()
	 * @see #setNodesToDelete(ListOfDeleteNodesItem)
	 * @generated
	 */
	boolean isSetNodesToDelete();

} // DeleteNodesRequest
