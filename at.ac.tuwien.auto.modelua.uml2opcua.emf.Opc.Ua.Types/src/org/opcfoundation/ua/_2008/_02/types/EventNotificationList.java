/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Notification List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EventNotificationList#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEventNotificationList()
 * @model extendedMetaData="name='EventNotificationList' kind='elementOnly'"
 * @generated
 */
public interface EventNotificationList extends NotificationData {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference.
	 * @see #isSetEvents()
	 * @see #unsetEvents()
	 * @see #setEvents(ListOfEventFieldList)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEventNotificationList_Events()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Events' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfEventFieldList getEvents();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EventNotificationList#getEvents <em>Events</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Events</em>' containment reference.
	 * @see #isSetEvents()
	 * @see #unsetEvents()
	 * @see #getEvents()
	 * @generated
	 */
	void setEvents(ListOfEventFieldList value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EventNotificationList#getEvents <em>Events</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEvents()
	 * @see #getEvents()
	 * @see #setEvents(ListOfEventFieldList)
	 * @generated
	 */
	void unsetEvents();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EventNotificationList#getEvents <em>Events</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Events</em>' containment reference is set.
	 * @see #unsetEvents()
	 * @see #getEvents()
	 * @see #setEvents(ListOfEventFieldList)
	 * @generated
	 */
	boolean isSetEvents();

} // EventNotificationList
