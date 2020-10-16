/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publish Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishRequest#getSubscriptionAcknowledgements <em>Subscription Acknowledgements</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishRequest()
 * @model extendedMetaData="name='PublishRequest' kind='elementOnly'"
 * @generated
 */
public interface PublishRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Subscription Acknowledgements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Acknowledgements</em>' containment reference.
	 * @see #isSetSubscriptionAcknowledgements()
	 * @see #unsetSubscriptionAcknowledgements()
	 * @see #setSubscriptionAcknowledgements(ListOfSubscriptionAcknowledgement)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishRequest_SubscriptionAcknowledgements()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SubscriptionAcknowledgements' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfSubscriptionAcknowledgement getSubscriptionAcknowledgements();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishRequest#getSubscriptionAcknowledgements <em>Subscription Acknowledgements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Acknowledgements</em>' containment reference.
	 * @see #isSetSubscriptionAcknowledgements()
	 * @see #unsetSubscriptionAcknowledgements()
	 * @see #getSubscriptionAcknowledgements()
	 * @generated
	 */
	void setSubscriptionAcknowledgements(ListOfSubscriptionAcknowledgement value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishRequest#getSubscriptionAcknowledgements <em>Subscription Acknowledgements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubscriptionAcknowledgements()
	 * @see #getSubscriptionAcknowledgements()
	 * @see #setSubscriptionAcknowledgements(ListOfSubscriptionAcknowledgement)
	 * @generated
	 */
	void unsetSubscriptionAcknowledgements();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishRequest#getSubscriptionAcknowledgements <em>Subscription Acknowledgements</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Subscription Acknowledgements</em>' containment reference is set.
	 * @see #unsetSubscriptionAcknowledgements()
	 * @see #getSubscriptionAcknowledgements()
	 * @see #setSubscriptionAcknowledgements(ListOfSubscriptionAcknowledgement)
	 * @generated
	 */
	boolean isSetSubscriptionAcknowledgements();

} // PublishRequest
