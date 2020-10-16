/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Published Events Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfPublishedEventsDataType#getPublishedEventsDataType <em>Published Events Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfPublishedEventsDataType()
 * @model extendedMetaData="name='ListOfPublishedEventsDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfPublishedEventsDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Published Events Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.PublishedEventsDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published Events Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfPublishedEventsDataType_PublishedEventsDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PublishedEventsDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PublishedEventsDataType> getPublishedEventsDataType();

} // ListOfPublishedEventsDataType
