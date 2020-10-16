/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Published Data Set Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfPublishedDataSetDataType#getPublishedDataSetDataType <em>Published Data Set Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfPublishedDataSetDataType()
 * @model extendedMetaData="name='ListOfPublishedDataSetDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfPublishedDataSetDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Published Data Set Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published Data Set Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfPublishedDataSetDataType_PublishedDataSetDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PublishedDataSetDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PublishedDataSetDataType> getPublishedDataSetDataType();

} // ListOfPublishedDataSetDataType
