/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Field List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EventFieldList#getClientHandle <em>Client Handle</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EventFieldList#getEventFields <em>Event Fields</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEventFieldList()
 * @model extendedMetaData="name='EventFieldList' kind='elementOnly'"
 * @generated
 */
public interface EventFieldList extends EObject {
	/**
	 * Returns the value of the '<em><b>Client Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Handle</em>' attribute.
	 * @see #isSetClientHandle()
	 * @see #unsetClientHandle()
	 * @see #setClientHandle(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEventFieldList_ClientHandle()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='ClientHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	long getClientHandle();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFieldList#getClientHandle <em>Client Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Handle</em>' attribute.
	 * @see #isSetClientHandle()
	 * @see #unsetClientHandle()
	 * @see #getClientHandle()
	 * @generated
	 */
	void setClientHandle(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFieldList#getClientHandle <em>Client Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientHandle()
	 * @see #getClientHandle()
	 * @see #setClientHandle(long)
	 * @generated
	 */
	void unsetClientHandle();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFieldList#getClientHandle <em>Client Handle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client Handle</em>' attribute is set.
	 * @see #unsetClientHandle()
	 * @see #getClientHandle()
	 * @see #setClientHandle(long)
	 * @generated
	 */
	boolean isSetClientHandle();

	/**
	 * Returns the value of the '<em><b>Event Fields</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Fields</em>' containment reference.
	 * @see #isSetEventFields()
	 * @see #unsetEventFields()
	 * @see #setEventFields(ListOfVariant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEventFieldList_EventFields()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='EventFields' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfVariant getEventFields();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFieldList#getEventFields <em>Event Fields</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFieldList#getEventFields <em>Event Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventFields()
	 * @see #getEventFields()
	 * @see #setEventFields(ListOfVariant)
	 * @generated
	 */
	void unsetEventFields();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EventFieldList#getEventFields <em>Event Fields</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Fields</em>' containment reference is set.
	 * @see #unsetEventFields()
	 * @see #getEventFields()
	 * @see #setEventFields(ListOfVariant)
	 * @generated
	 */
	boolean isSetEventFields();

} // EventFieldList
