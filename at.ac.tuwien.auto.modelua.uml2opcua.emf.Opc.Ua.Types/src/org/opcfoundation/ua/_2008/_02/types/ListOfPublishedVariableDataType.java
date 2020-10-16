/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Published Variable Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfPublishedVariableDataType#getPublishedVariableDataType <em>Published Variable Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfPublishedVariableDataType()
 * @model extendedMetaData="name='ListOfPublishedVariableDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfPublishedVariableDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Published Variable Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published Variable Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfPublishedVariableDataType_PublishedVariableDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PublishedVariableDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PublishedVariableDataType> getPublishedVariableDataType();

} // ListOfPublishedVariableDataType
