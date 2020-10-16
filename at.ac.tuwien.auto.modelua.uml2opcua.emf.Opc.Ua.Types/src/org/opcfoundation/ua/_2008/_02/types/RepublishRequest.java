/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Republish Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RepublishRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RepublishRequest#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RepublishRequest#getRetransmitSequenceNumber <em>Retransmit Sequence Number</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRepublishRequest()
 * @model extendedMetaData="name='RepublishRequest' kind='elementOnly'"
 * @generated
 */
public interface RepublishRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRepublishRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RepublishRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RepublishRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RepublishRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Subscription Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Id</em>' attribute.
	 * @see #isSetSubscriptionId()
	 * @see #unsetSubscriptionId()
	 * @see #setSubscriptionId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRepublishRequest_SubscriptionId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='SubscriptionId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getSubscriptionId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RepublishRequest#getSubscriptionId <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Id</em>' attribute.
	 * @see #isSetSubscriptionId()
	 * @see #unsetSubscriptionId()
	 * @see #getSubscriptionId()
	 * @generated
	 */
	void setSubscriptionId(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RepublishRequest#getSubscriptionId <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubscriptionId()
	 * @see #getSubscriptionId()
	 * @see #setSubscriptionId(long)
	 * @generated
	 */
	void unsetSubscriptionId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RepublishRequest#getSubscriptionId <em>Subscription Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Subscription Id</em>' attribute is set.
	 * @see #unsetSubscriptionId()
	 * @see #getSubscriptionId()
	 * @see #setSubscriptionId(long)
	 * @generated
	 */
	boolean isSetSubscriptionId();

	/**
	 * Returns the value of the '<em><b>Retransmit Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retransmit Sequence Number</em>' attribute.
	 * @see #isSetRetransmitSequenceNumber()
	 * @see #unsetRetransmitSequenceNumber()
	 * @see #setRetransmitSequenceNumber(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRepublishRequest_RetransmitSequenceNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RetransmitSequenceNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRetransmitSequenceNumber();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RepublishRequest#getRetransmitSequenceNumber <em>Retransmit Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retransmit Sequence Number</em>' attribute.
	 * @see #isSetRetransmitSequenceNumber()
	 * @see #unsetRetransmitSequenceNumber()
	 * @see #getRetransmitSequenceNumber()
	 * @generated
	 */
	void setRetransmitSequenceNumber(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RepublishRequest#getRetransmitSequenceNumber <em>Retransmit Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRetransmitSequenceNumber()
	 * @see #getRetransmitSequenceNumber()
	 * @see #setRetransmitSequenceNumber(long)
	 * @generated
	 */
	void unsetRetransmitSequenceNumber();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RepublishRequest#getRetransmitSequenceNumber <em>Retransmit Sequence Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Retransmit Sequence Number</em>' attribute is set.
	 * @see #unsetRetransmitSequenceNumber()
	 * @see #getRetransmitSequenceNumber()
	 * @see #setRetransmitSequenceNumber(long)
	 * @generated
	 */
	boolean isSetRetransmitSequenceNumber();

} // RepublishRequest
