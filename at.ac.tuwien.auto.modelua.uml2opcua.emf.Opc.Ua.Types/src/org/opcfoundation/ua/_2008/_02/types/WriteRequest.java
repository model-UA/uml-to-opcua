/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.WriteRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.WriteRequest#getNodesToWrite <em>Nodes To Write</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getWriteRequest()
 * @model extendedMetaData="name='WriteRequest' kind='elementOnly'"
 * @generated
 */
public interface WriteRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getWriteRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriteRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriteRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.WriteRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Nodes To Write</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes To Write</em>' containment reference.
	 * @see #isSetNodesToWrite()
	 * @see #unsetNodesToWrite()
	 * @see #setNodesToWrite(ListOfWriteValue)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getWriteRequest_NodesToWrite()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodesToWrite' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfWriteValue getNodesToWrite();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriteRequest#getNodesToWrite <em>Nodes To Write</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes To Write</em>' containment reference.
	 * @see #isSetNodesToWrite()
	 * @see #unsetNodesToWrite()
	 * @see #getNodesToWrite()
	 * @generated
	 */
	void setNodesToWrite(ListOfWriteValue value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriteRequest#getNodesToWrite <em>Nodes To Write</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodesToWrite()
	 * @see #getNodesToWrite()
	 * @see #setNodesToWrite(ListOfWriteValue)
	 * @generated
	 */
	void unsetNodesToWrite();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.WriteRequest#getNodesToWrite <em>Nodes To Write</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nodes To Write</em>' containment reference is set.
	 * @see #unsetNodesToWrite()
	 * @see #getNodesToWrite()
	 * @see #setNodesToWrite(ListOfWriteValue)
	 * @generated
	 */
	boolean isSetNodesToWrite();

} // WriteRequest
