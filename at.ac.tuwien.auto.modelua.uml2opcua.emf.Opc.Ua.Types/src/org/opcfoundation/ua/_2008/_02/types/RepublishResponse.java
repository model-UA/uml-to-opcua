/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Republish Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RepublishResponse#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RepublishResponse#getNotificationMessage <em>Notification Message</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRepublishResponse()
 * @model extendedMetaData="name='RepublishResponse' kind='elementOnly'"
 * @generated
 */
public interface RepublishResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRepublishResponse_ResponseHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ResponseHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseHeader getResponseHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RepublishResponse#getResponseHeader <em>Response Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RepublishResponse#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	void unsetResponseHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RepublishResponse#getResponseHeader <em>Response Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Notification Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Message</em>' containment reference.
	 * @see #isSetNotificationMessage()
	 * @see #unsetNotificationMessage()
	 * @see #setNotificationMessage(NotificationMessage)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRepublishResponse_NotificationMessage()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NotificationMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	NotificationMessage getNotificationMessage();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RepublishResponse#getNotificationMessage <em>Notification Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Message</em>' containment reference.
	 * @see #isSetNotificationMessage()
	 * @see #unsetNotificationMessage()
	 * @see #getNotificationMessage()
	 * @generated
	 */
	void setNotificationMessage(NotificationMessage value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RepublishResponse#getNotificationMessage <em>Notification Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotificationMessage()
	 * @see #getNotificationMessage()
	 * @see #setNotificationMessage(NotificationMessage)
	 * @generated
	 */
	void unsetNotificationMessage();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RepublishResponse#getNotificationMessage <em>Notification Message</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Notification Message</em>' containment reference is set.
	 * @see #unsetNotificationMessage()
	 * @see #getNotificationMessage()
	 * @see #setNotificationMessage(NotificationMessage)
	 * @generated
	 */
	boolean isSetNotificationMessage();

} // RepublishResponse
