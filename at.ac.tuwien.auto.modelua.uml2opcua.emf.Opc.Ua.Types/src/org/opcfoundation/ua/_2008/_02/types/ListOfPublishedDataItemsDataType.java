/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Published Data Items Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfPublishedDataItemsDataType#getPublishedDataItemsDataType <em>Published Data Items Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfPublishedDataItemsDataType()
 * @model extendedMetaData="name='ListOfPublishedDataItemsDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfPublishedDataItemsDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Published Data Items Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.PublishedDataItemsDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published Data Items Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfPublishedDataItemsDataType_PublishedDataItemsDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PublishedDataItemsDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PublishedDataItemsDataType> getPublishedDataItemsDataType();

} // ListOfPublishedDataItemsDataType
