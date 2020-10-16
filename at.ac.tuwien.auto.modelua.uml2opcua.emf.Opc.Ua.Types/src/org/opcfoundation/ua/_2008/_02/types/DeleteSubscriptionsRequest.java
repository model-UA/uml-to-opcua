/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Subscriptions Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DeleteSubscriptionsRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DeleteSubscriptionsRequest#getSubscriptionIds <em>Subscription Ids</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteSubscriptionsRequest()
 * @model extendedMetaData="name='DeleteSubscriptionsRequest' kind='elementOnly'"
 * @generated
 */
public interface DeleteSubscriptionsRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteSubscriptionsRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteSubscriptionsRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteSubscriptionsRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteSubscriptionsRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Subscription Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Ids</em>' containment reference.
	 * @see #isSetSubscriptionIds()
	 * @see #unsetSubscriptionIds()
	 * @see #setSubscriptionIds(ListOfUInt32)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteSubscriptionsRequest_SubscriptionIds()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SubscriptionIds' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUInt32 getSubscriptionIds();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteSubscriptionsRequest#getSubscriptionIds <em>Subscription Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Ids</em>' containment reference.
	 * @see #isSetSubscriptionIds()
	 * @see #unsetSubscriptionIds()
	 * @see #getSubscriptionIds()
	 * @generated
	 */
	void setSubscriptionIds(ListOfUInt32 value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteSubscriptionsRequest#getSubscriptionIds <em>Subscription Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubscriptionIds()
	 * @see #getSubscriptionIds()
	 * @see #setSubscriptionIds(ListOfUInt32)
	 * @generated
	 */
	void unsetSubscriptionIds();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteSubscriptionsRequest#getSubscriptionIds <em>Subscription Ids</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Subscription Ids</em>' containment reference is set.
	 * @see #unsetSubscriptionIds()
	 * @see #getSubscriptionIds()
	 * @see #setSubscriptionIds(ListOfUInt32)
	 * @generated
	 */
	boolean isSetSubscriptionIds();

} // DeleteSubscriptionsRequest
