/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Event Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DeleteEventDetails#getEventIds <em>Event Ids</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteEventDetails()
 * @model extendedMetaData="name='DeleteEventDetails' kind='elementOnly'"
 * @generated
 */
public interface DeleteEventDetails extends HistoryUpdateDetails {
	/**
	 * Returns the value of the '<em><b>Event Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Ids</em>' containment reference.
	 * @see #isSetEventIds()
	 * @see #unsetEventIds()
	 * @see #setEventIds(ListOfByteString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteEventDetails_EventIds()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='EventIds' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfByteString getEventIds();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteEventDetails#getEventIds <em>Event Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Ids</em>' containment reference.
	 * @see #isSetEventIds()
	 * @see #unsetEventIds()
	 * @see #getEventIds()
	 * @generated
	 */
	void setEventIds(ListOfByteString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteEventDetails#getEventIds <em>Event Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventIds()
	 * @see #getEventIds()
	 * @see #setEventIds(ListOfByteString)
	 * @generated
	 */
	void unsetEventIds();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteEventDetails#getEventIds <em>Event Ids</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Ids</em>' containment reference is set.
	 * @see #unsetEventIds()
	 * @see #getEventIds()
	 * @see #setEventIds(ListOfByteString)
	 * @generated
	 */
	boolean isSetEventIds();

} // DeleteEventDetails
