/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Published Events Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishedEventsDataType#getEventNotifier <em>Event Notifier</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishedEventsDataType#getSelectedFields <em>Selected Fields</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishedEventsDataType#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedEventsDataType()
 * @model extendedMetaData="name='PublishedEventsDataType' kind='elementOnly'"
 * @generated
 */
public interface PublishedEventsDataType extends PublishedDataSetSourceDataType {
	/**
	 * Returns the value of the '<em><b>Event Notifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Notifier</em>' containment reference.
	 * @see #isSetEventNotifier()
	 * @see #unsetEventNotifier()
	 * @see #setEventNotifier(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedEventsDataType_EventNotifier()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='EventNotifier' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getEventNotifier();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedEventsDataType#getEventNotifier <em>Event Notifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Notifier</em>' containment reference.
	 * @see #isSetEventNotifier()
	 * @see #unsetEventNotifier()
	 * @see #getEventNotifier()
	 * @generated
	 */
	void setEventNotifier(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedEventsDataType#getEventNotifier <em>Event Notifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventNotifier()
	 * @see #getEventNotifier()
	 * @see #setEventNotifier(NodeId)
	 * @generated
	 */
	void unsetEventNotifier();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedEventsDataType#getEventNotifier <em>Event Notifier</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Notifier</em>' containment reference is set.
	 * @see #unsetEventNotifier()
	 * @see #getEventNotifier()
	 * @see #setEventNotifier(NodeId)
	 * @generated
	 */
	boolean isSetEventNotifier();

	/**
	 * Returns the value of the '<em><b>Selected Fields</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Fields</em>' containment reference.
	 * @see #isSetSelectedFields()
	 * @see #unsetSelectedFields()
	 * @see #setSelectedFields(ListOfSimpleAttributeOperand)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedEventsDataType_SelectedFields()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SelectedFields' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfSimpleAttributeOperand getSelectedFields();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedEventsDataType#getSelectedFields <em>Selected Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Fields</em>' containment reference.
	 * @see #isSetSelectedFields()
	 * @see #unsetSelectedFields()
	 * @see #getSelectedFields()
	 * @generated
	 */
	void setSelectedFields(ListOfSimpleAttributeOperand value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedEventsDataType#getSelectedFields <em>Selected Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSelectedFields()
	 * @see #getSelectedFields()
	 * @see #setSelectedFields(ListOfSimpleAttributeOperand)
	 * @generated
	 */
	void unsetSelectedFields();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedEventsDataType#getSelectedFields <em>Selected Fields</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Selected Fields</em>' containment reference is set.
	 * @see #unsetSelectedFields()
	 * @see #getSelectedFields()
	 * @see #setSelectedFields(ListOfSimpleAttributeOperand)
	 * @generated
	 */
	boolean isSetSelectedFields();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #isSetFilter()
	 * @see #unsetFilter()
	 * @see #setFilter(ContentFilter)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedEventsDataType_Filter()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Filter' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentFilter getFilter();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedEventsDataType#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #isSetFilter()
	 * @see #unsetFilter()
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(ContentFilter value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedEventsDataType#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilter()
	 * @see #getFilter()
	 * @see #setFilter(ContentFilter)
	 * @generated
	 */
	void unsetFilter();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedEventsDataType#getFilter <em>Filter</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter</em>' containment reference is set.
	 * @see #unsetFilter()
	 * @see #getFilter()
	 * @see #setFilter(ContentFilter)
	 * @generated
	 */
	boolean isSetFilter();

} // PublishedEventsDataType
