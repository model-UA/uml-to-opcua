/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cancel Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CancelResponse#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CancelResponse#getCancelCount <em>Cancel Count</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCancelResponse()
 * @model extendedMetaData="name='CancelResponse' kind='elementOnly'"
 * @generated
 */
public interface CancelResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCancelResponse_ResponseHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ResponseHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseHeader getResponseHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CancelResponse#getResponseHeader <em>Response Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CancelResponse#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	void unsetResponseHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CancelResponse#getResponseHeader <em>Response Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Cancel Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Count</em>' attribute.
	 * @see #isSetCancelCount()
	 * @see #unsetCancelCount()
	 * @see #setCancelCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCancelResponse_CancelCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='CancelCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getCancelCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CancelResponse#getCancelCount <em>Cancel Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Count</em>' attribute.
	 * @see #isSetCancelCount()
	 * @see #unsetCancelCount()
	 * @see #getCancelCount()
	 * @generated
	 */
	void setCancelCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CancelResponse#getCancelCount <em>Cancel Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCancelCount()
	 * @see #getCancelCount()
	 * @see #setCancelCount(long)
	 * @generated
	 */
	void unsetCancelCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CancelResponse#getCancelCount <em>Cancel Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cancel Count</em>' attribute is set.
	 * @see #unsetCancelCount()
	 * @see #getCancelCount()
	 * @see #setCancelCount(long)
	 * @generated
	 */
	boolean isSetCancelCount();

} // CancelResponse
