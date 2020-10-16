/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Close Session Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CloseSessionRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CloseSessionRequest#isDeleteSubscriptions <em>Delete Subscriptions</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCloseSessionRequest()
 * @model extendedMetaData="name='CloseSessionRequest' kind='elementOnly'"
 * @generated
 */
public interface CloseSessionRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCloseSessionRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CloseSessionRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CloseSessionRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CloseSessionRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Delete Subscriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Subscriptions</em>' attribute.
	 * @see #isSetDeleteSubscriptions()
	 * @see #unsetDeleteSubscriptions()
	 * @see #setDeleteSubscriptions(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCloseSessionRequest_DeleteSubscriptions()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='DeleteSubscriptions' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDeleteSubscriptions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CloseSessionRequest#isDeleteSubscriptions <em>Delete Subscriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Subscriptions</em>' attribute.
	 * @see #isSetDeleteSubscriptions()
	 * @see #unsetDeleteSubscriptions()
	 * @see #isDeleteSubscriptions()
	 * @generated
	 */
	void setDeleteSubscriptions(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CloseSessionRequest#isDeleteSubscriptions <em>Delete Subscriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeleteSubscriptions()
	 * @see #isDeleteSubscriptions()
	 * @see #setDeleteSubscriptions(boolean)
	 * @generated
	 */
	void unsetDeleteSubscriptions();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CloseSessionRequest#isDeleteSubscriptions <em>Delete Subscriptions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delete Subscriptions</em>' attribute is set.
	 * @see #unsetDeleteSubscriptions()
	 * @see #isDeleteSubscriptions()
	 * @see #setDeleteSubscriptions(boolean)
	 * @generated
	 */
	boolean isSetDeleteSubscriptions();

} // CloseSessionRequest
