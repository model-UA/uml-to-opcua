/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Json Writer Group Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfJsonWriterGroupMessageDataType#getJsonWriterGroupMessageDataType <em>Json Writer Group Message Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfJsonWriterGroupMessageDataType()
 * @model extendedMetaData="name='ListOfJsonWriterGroupMessageDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfJsonWriterGroupMessageDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Json Writer Group Message Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.JsonWriterGroupMessageDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Writer Group Message Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfJsonWriterGroupMessageDataType_JsonWriterGroupMessageDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='JsonWriterGroupMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<JsonWriterGroupMessageDataType> getJsonWriterGroupMessageDataType();

} // ListOfJsonWriterGroupMessageDataType
