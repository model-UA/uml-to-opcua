/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Event Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UpdateEventDetails#getPerformInsertReplace <em>Perform Insert Replace</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UpdateEventDetails#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.UpdateEventDetails#getEventData <em>Event Data</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUpdateEventDetails()
 * @model extendedMetaData="name='UpdateEventDetails' kind='elementOnly'"
 * @generated
 */
public interface UpdateEventDetails extends HistoryUpdateDetails {
	/**
	 * Returns the value of the '<em><b>Perform Insert Replace</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.PerformUpdateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perform Insert Replace</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.PerformUpdateType
	 * @see #isSetPerformInsertReplace()
	 * @see #unsetPerformInsertReplace()
	 * @see #setPerformInsertReplace(PerformUpdateType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUpdateEventDetails_PerformInsertReplace()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PerformInsertReplace' namespace='##targetNamespace'"
	 * @generated
	 */
	PerformUpdateType getPerformInsertReplace();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UpdateEventDetails#getPerformInsertReplace <em>Perform Insert Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perform Insert Replace</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.PerformUpdateType
	 * @see #isSetPerformInsertReplace()
	 * @see #unsetPerformInsertReplace()
	 * @see #getPerformInsertReplace()
	 * @generated
	 */
	void setPerformInsertReplace(PerformUpdateType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UpdateEventDetails#getPerformInsertReplace <em>Perform Insert Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPerformInsertReplace()
	 * @see #getPerformInsertReplace()
	 * @see #setPerformInsertReplace(PerformUpdateType)
	 * @generated
	 */
	void unsetPerformInsertReplace();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UpdateEventDetails#getPerformInsertReplace <em>Perform Insert Replace</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Perform Insert Replace</em>' attribute is set.
	 * @see #unsetPerformInsertReplace()
	 * @see #getPerformInsertReplace()
	 * @see #setPerformInsertReplace(PerformUpdateType)
	 * @generated
	 */
	boolean isSetPerformInsertReplace();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #isSetFilter()
	 * @see #unsetFilter()
	 * @see #setFilter(EventFilter)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUpdateEventDetails_Filter()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Filter' namespace='##targetNamespace'"
	 * @generated
	 */
	EventFilter getFilter();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UpdateEventDetails#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #isSetFilter()
	 * @see #unsetFilter()
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(EventFilter value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UpdateEventDetails#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilter()
	 * @see #getFilter()
	 * @see #setFilter(EventFilter)
	 * @generated
	 */
	void unsetFilter();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UpdateEventDetails#getFilter <em>Filter</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter</em>' containment reference is set.
	 * @see #unsetFilter()
	 * @see #getFilter()
	 * @see #setFilter(EventFilter)
	 * @generated
	 */
	boolean isSetFilter();

	/**
	 * Returns the value of the '<em><b>Event Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Data</em>' containment reference.
	 * @see #isSetEventData()
	 * @see #unsetEventData()
	 * @see #setEventData(ListOfHistoryEventFieldList)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getUpdateEventDetails_EventData()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='EventData' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfHistoryEventFieldList getEventData();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.UpdateEventDetails#getEventData <em>Event Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Data</em>' containment reference.
	 * @see #isSetEventData()
	 * @see #unsetEventData()
	 * @see #getEventData()
	 * @generated
	 */
	void setEventData(ListOfHistoryEventFieldList value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.UpdateEventDetails#getEventData <em>Event Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventData()
	 * @see #getEventData()
	 * @see #setEventData(ListOfHistoryEventFieldList)
	 * @generated
	 */
	void unsetEventData();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.UpdateEventDetails#getEventData <em>Event Data</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Data</em>' containment reference is set.
	 * @see #unsetEventData()
	 * @see #getEventData()
	 * @see #setEventData(ListOfHistoryEventFieldList)
	 * @generated
	 */
	boolean isSetEventData();

} // UpdateEventDetails
