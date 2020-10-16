/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of History Read Value Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfHistoryReadValueId#getHistoryReadValueId <em>History Read Value Id</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfHistoryReadValueId()
 * @model extendedMetaData="name='ListOfHistoryReadValueId' kind='elementOnly'"
 * @generated
 */
public interface ListOfHistoryReadValueId extends EObject {
	/**
	 * Returns the value of the '<em><b>History Read Value Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.HistoryReadValueId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Read Value Id</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfHistoryReadValueId_HistoryReadValueId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HistoryReadValueId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HistoryReadValueId> getHistoryReadValueId();

} // ListOfHistoryReadValueId
