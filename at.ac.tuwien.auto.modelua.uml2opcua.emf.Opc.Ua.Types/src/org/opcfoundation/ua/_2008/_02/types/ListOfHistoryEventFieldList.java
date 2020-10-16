/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of History Event Field List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfHistoryEventFieldList#getHistoryEventFieldList <em>History Event Field List</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfHistoryEventFieldList()
 * @model extendedMetaData="name='ListOfHistoryEventFieldList' kind='elementOnly'"
 * @generated
 */
public interface ListOfHistoryEventFieldList extends EObject {
	/**
	 * Returns the value of the '<em><b>History Event Field List</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.HistoryEventFieldList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Event Field List</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfHistoryEventFieldList_HistoryEventFieldList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HistoryEventFieldList' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HistoryEventFieldList> getHistoryEventFieldList();

} // ListOfHistoryEventFieldList
