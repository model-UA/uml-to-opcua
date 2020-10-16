/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Json Data Set Writer Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetWriterMessageDataType#getJsonDataSetWriterMessageDataType <em>Json Data Set Writer Message Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfJsonDataSetWriterMessageDataType()
 * @model extendedMetaData="name='ListOfJsonDataSetWriterMessageDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfJsonDataSetWriterMessageDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Json Data Set Writer Message Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.JsonDataSetWriterMessageDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Data Set Writer Message Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfJsonDataSetWriterMessageDataType_JsonDataSetWriterMessageDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='JsonDataSetWriterMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<JsonDataSetWriterMessageDataType> getJsonDataSetWriterMessageDataType();

} // ListOfJsonDataSetWriterMessageDataType
