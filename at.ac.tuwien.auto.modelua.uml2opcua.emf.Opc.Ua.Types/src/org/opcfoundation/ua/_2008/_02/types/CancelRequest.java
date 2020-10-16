/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cancel Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CancelRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CancelRequest#getRequestHandle <em>Request Handle</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCancelRequest()
 * @model extendedMetaData="name='CancelRequest' kind='elementOnly'"
 * @generated
 */
public interface CancelRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCancelRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CancelRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CancelRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CancelRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Request Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Handle</em>' attribute.
	 * @see #isSetRequestHandle()
	 * @see #unsetRequestHandle()
	 * @see #setRequestHandle(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCancelRequest_RequestHandle()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RequestHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRequestHandle();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CancelRequest#getRequestHandle <em>Request Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Handle</em>' attribute.
	 * @see #isSetRequestHandle()
	 * @see #unsetRequestHandle()
	 * @see #getRequestHandle()
	 * @generated
	 */
	void setRequestHandle(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CancelRequest#getRequestHandle <em>Request Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHandle()
	 * @see #getRequestHandle()
	 * @see #setRequestHandle(long)
	 * @generated
	 */
	void unsetRequestHandle();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CancelRequest#getRequestHandle <em>Request Handle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Request Handle</em>' attribute is set.
	 * @see #unsetRequestHandle()
	 * @see #getRequestHandle()
	 * @see #setRequestHandle(long)
	 * @generated
	 */
	boolean isSetRequestHandle();

} // CancelRequest
