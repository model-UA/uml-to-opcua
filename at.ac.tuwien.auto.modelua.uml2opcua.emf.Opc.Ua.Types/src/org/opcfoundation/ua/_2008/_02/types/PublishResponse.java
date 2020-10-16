/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publish Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getAvailableSequenceNumbers <em>Available Sequence Numbers</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishResponse#isMoreNotifications <em>More Notifications</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getNotificationMessage <em>Notification Message</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getResults <em>Results</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getDiagnosticInfos <em>Diagnostic Infos</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishResponse()
 * @model extendedMetaData="name='PublishResponse' kind='elementOnly'"
 * @generated
 */
public interface PublishResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishResponse_ResponseHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ResponseHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseHeader getResponseHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getResponseHeader <em>Response Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	void unsetResponseHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getResponseHeader <em>Response Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Subscription Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Id</em>' attribute.
	 * @see #isSetSubscriptionId()
	 * @see #unsetSubscriptionId()
	 * @see #setSubscriptionId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishResponse_SubscriptionId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='SubscriptionId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getSubscriptionId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getSubscriptionId <em>Subscription Id</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getSubscriptionId <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubscriptionId()
	 * @see #getSubscriptionId()
	 * @see #setSubscriptionId(long)
	 * @generated
	 */
	void unsetSubscriptionId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getSubscriptionId <em>Subscription Id</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Available Sequence Numbers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Sequence Numbers</em>' containment reference.
	 * @see #isSetAvailableSequenceNumbers()
	 * @see #unsetAvailableSequenceNumbers()
	 * @see #setAvailableSequenceNumbers(ListOfUInt32)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishResponse_AvailableSequenceNumbers()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AvailableSequenceNumbers' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUInt32 getAvailableSequenceNumbers();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getAvailableSequenceNumbers <em>Available Sequence Numbers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Sequence Numbers</em>' containment reference.
	 * @see #isSetAvailableSequenceNumbers()
	 * @see #unsetAvailableSequenceNumbers()
	 * @see #getAvailableSequenceNumbers()
	 * @generated
	 */
	void setAvailableSequenceNumbers(ListOfUInt32 value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getAvailableSequenceNumbers <em>Available Sequence Numbers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAvailableSequenceNumbers()
	 * @see #getAvailableSequenceNumbers()
	 * @see #setAvailableSequenceNumbers(ListOfUInt32)
	 * @generated
	 */
	void unsetAvailableSequenceNumbers();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getAvailableSequenceNumbers <em>Available Sequence Numbers</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Available Sequence Numbers</em>' containment reference is set.
	 * @see #unsetAvailableSequenceNumbers()
	 * @see #getAvailableSequenceNumbers()
	 * @see #setAvailableSequenceNumbers(ListOfUInt32)
	 * @generated
	 */
	boolean isSetAvailableSequenceNumbers();

	/**
	 * Returns the value of the '<em><b>More Notifications</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>More Notifications</em>' attribute.
	 * @see #isSetMoreNotifications()
	 * @see #unsetMoreNotifications()
	 * @see #setMoreNotifications(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishResponse_MoreNotifications()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='MoreNotifications' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMoreNotifications();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#isMoreNotifications <em>More Notifications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>More Notifications</em>' attribute.
	 * @see #isSetMoreNotifications()
	 * @see #unsetMoreNotifications()
	 * @see #isMoreNotifications()
	 * @generated
	 */
	void setMoreNotifications(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#isMoreNotifications <em>More Notifications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoreNotifications()
	 * @see #isMoreNotifications()
	 * @see #setMoreNotifications(boolean)
	 * @generated
	 */
	void unsetMoreNotifications();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#isMoreNotifications <em>More Notifications</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>More Notifications</em>' attribute is set.
	 * @see #unsetMoreNotifications()
	 * @see #isMoreNotifications()
	 * @see #setMoreNotifications(boolean)
	 * @generated
	 */
	boolean isSetMoreNotifications();

	/**
	 * Returns the value of the '<em><b>Notification Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Message</em>' containment reference.
	 * @see #isSetNotificationMessage()
	 * @see #unsetNotificationMessage()
	 * @see #setNotificationMessage(NotificationMessage)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishResponse_NotificationMessage()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NotificationMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	NotificationMessage getNotificationMessage();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getNotificationMessage <em>Notification Message</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getNotificationMessage <em>Notification Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotificationMessage()
	 * @see #getNotificationMessage()
	 * @see #setNotificationMessage(NotificationMessage)
	 * @generated
	 */
	void unsetNotificationMessage();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getNotificationMessage <em>Notification Message</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Notification Message</em>' containment reference is set.
	 * @see #unsetNotificationMessage()
	 * @see #getNotificationMessage()
	 * @see #setNotificationMessage(NotificationMessage)
	 * @generated
	 */
	boolean isSetNotificationMessage();

	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference.
	 * @see #isSetResults()
	 * @see #unsetResults()
	 * @see #setResults(ListOfStatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishResponse_Results()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Results' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfStatusCode getResults();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getResults <em>Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results</em>' containment reference.
	 * @see #isSetResults()
	 * @see #unsetResults()
	 * @see #getResults()
	 * @generated
	 */
	void setResults(ListOfStatusCode value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getResults <em>Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResults()
	 * @see #getResults()
	 * @see #setResults(ListOfStatusCode)
	 * @generated
	 */
	void unsetResults();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getResults <em>Results</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Results</em>' containment reference is set.
	 * @see #unsetResults()
	 * @see #getResults()
	 * @see #setResults(ListOfStatusCode)
	 * @generated
	 */
	boolean isSetResults();

	/**
	 * Returns the value of the '<em><b>Diagnostic Infos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostic Infos</em>' containment reference.
	 * @see #isSetDiagnosticInfos()
	 * @see #unsetDiagnosticInfos()
	 * @see #setDiagnosticInfos(ListOfDiagnosticInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishResponse_DiagnosticInfos()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DiagnosticInfos' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDiagnosticInfo getDiagnosticInfos();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getDiagnosticInfos <em>Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Infos</em>' containment reference.
	 * @see #isSetDiagnosticInfos()
	 * @see #unsetDiagnosticInfos()
	 * @see #getDiagnosticInfos()
	 * @generated
	 */
	void setDiagnosticInfos(ListOfDiagnosticInfo value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getDiagnosticInfos <em>Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiagnosticInfos()
	 * @see #getDiagnosticInfos()
	 * @see #setDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	void unsetDiagnosticInfos();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishResponse#getDiagnosticInfos <em>Diagnostic Infos</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diagnostic Infos</em>' containment reference is set.
	 * @see #unsetDiagnosticInfos()
	 * @see #getDiagnosticInfos()
	 * @see #setDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	boolean isSetDiagnosticInfos();

} // PublishResponse
