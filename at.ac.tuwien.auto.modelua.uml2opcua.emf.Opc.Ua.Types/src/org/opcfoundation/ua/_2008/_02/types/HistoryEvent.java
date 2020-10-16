/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryEvent#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryEvent()
 * @model extendedMetaData="name='HistoryEvent' kind='elementOnly'"
 * @generated
 */
public interface HistoryEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference.
	 * @see #isSetEvents()
	 * @see #unsetEvents()
	 * @see #setEvents(ListOfHistoryEventFieldList)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryEvent_Events()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Events' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfHistoryEventFieldList getEvents();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryEvent#getEvents <em>Events</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Events</em>' containment reference.
	 * @see #isSetEvents()
	 * @see #unsetEvents()
	 * @see #getEvents()
	 * @generated
	 */
	void setEvents(ListOfHistoryEventFieldList value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryEvent#getEvents <em>Events</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEvents()
	 * @see #getEvents()
	 * @see #setEvents(ListOfHistoryEventFieldList)
	 * @generated
	 */
	void unsetEvents();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryEvent#getEvents <em>Events</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Events</em>' containment reference is set.
	 * @see #unsetEvents()
	 * @see #getEvents()
	 * @see #setEvents(ListOfHistoryEventFieldList)
	 * @generated
	 */
	boolean isSetEvents();

} // HistoryEvent
