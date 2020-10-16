/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Event Field List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfEventFieldList#getEventFieldList <em>Event Field List</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfEventFieldList()
 * @model extendedMetaData="name='ListOfEventFieldList' kind='elementOnly'"
 * @generated
 */
public interface ListOfEventFieldList extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Field List</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.EventFieldList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Field List</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfEventFieldList_EventFieldList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EventFieldList' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EventFieldList> getEventFieldList();

} // ListOfEventFieldList
