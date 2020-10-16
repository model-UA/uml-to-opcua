/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Subscriptions Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.TransferSubscriptionsRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.TransferSubscriptionsRequest#getSubscriptionIds <em>Subscription Ids</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.TransferSubscriptionsRequest#isSendInitialValues <em>Send Initial Values</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTransferSubscriptionsRequest()
 * @model extendedMetaData="name='TransferSubscriptionsRequest' kind='elementOnly'"
 * @generated
 */
public interface TransferSubscriptionsRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTransferSubscriptionsRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.TransferSubscriptionsRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.TransferSubscriptionsRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.TransferSubscriptionsRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTransferSubscriptionsRequest_SubscriptionIds()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SubscriptionIds' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUInt32 getSubscriptionIds();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.TransferSubscriptionsRequest#getSubscriptionIds <em>Subscription Ids</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.TransferSubscriptionsRequest#getSubscriptionIds <em>Subscription Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubscriptionIds()
	 * @see #getSubscriptionIds()
	 * @see #setSubscriptionIds(ListOfUInt32)
	 * @generated
	 */
	void unsetSubscriptionIds();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.TransferSubscriptionsRequest#getSubscriptionIds <em>Subscription Ids</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Subscription Ids</em>' containment reference is set.
	 * @see #unsetSubscriptionIds()
	 * @see #getSubscriptionIds()
	 * @see #setSubscriptionIds(ListOfUInt32)
	 * @generated
	 */
	boolean isSetSubscriptionIds();

	/**
	 * Returns the value of the '<em><b>Send Initial Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Initial Values</em>' attribute.
	 * @see #isSetSendInitialValues()
	 * @see #unsetSendInitialValues()
	 * @see #setSendInitialValues(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTransferSubscriptionsRequest_SendInitialValues()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='SendInitialValues' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSendInitialValues();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.TransferSubscriptionsRequest#isSendInitialValues <em>Send Initial Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Initial Values</em>' attribute.
	 * @see #isSetSendInitialValues()
	 * @see #unsetSendInitialValues()
	 * @see #isSendInitialValues()
	 * @generated
	 */
	void setSendInitialValues(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.TransferSubscriptionsRequest#isSendInitialValues <em>Send Initial Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSendInitialValues()
	 * @see #isSendInitialValues()
	 * @see #setSendInitialValues(boolean)
	 * @generated
	 */
	void unsetSendInitialValues();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.TransferSubscriptionsRequest#isSendInitialValues <em>Send Initial Values</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Send Initial Values</em>' attribute is set.
	 * @see #unsetSendInitialValues()
	 * @see #isSendInitialValues()
	 * @see #setSendInitialValues(boolean)
	 * @generated
	 */
	boolean isSetSendInitialValues();

} // TransferSubscriptionsRequest
