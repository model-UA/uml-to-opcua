/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Event Field List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryEventFieldList#getEventFields <em>Event Fields</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryEventFieldList()
 * @model extendedMetaData="name='HistoryEventFieldList' kind='elementOnly'"
 * @generated
 */
public interface HistoryEventFieldList extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Fields</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Fields</em>' containment reference.
	 * @see #isSetEventFields()
	 * @see #unsetEventFields()
	 * @see #setEventFields(ListOfVariant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryEventFieldList_EventFields()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='EventFields' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfVariant getEventFields();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryEventFieldList#getEventFields <em>Event Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Fields</em>' containment reference.
	 * @see #isSetEventFields()
	 * @see #unsetEventFields()
	 * @see #getEventFields()
	 * @generated
	 */
	void setEventFields(ListOfVariant value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryEventFieldList#getEventFields <em>Event Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventFields()
	 * @see #getEventFields()
	 * @see #setEventFields(ListOfVariant)
	 * @generated
	 */
	void unsetEventFields();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryEventFieldList#getEventFields <em>Event Fields</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Fields</em>' containment reference is set.
	 * @see #unsetEventFields()
	 * @see #getEventFields()
	 * @see #setEventFields(ListOfVariant)
	 * @generated
	 */
	boolean isSetEventFields();

} // HistoryEventFieldList
