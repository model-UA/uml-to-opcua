/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Json Data Set Reader Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetReaderMessageDataType#getJsonDataSetReaderMessageDataType <em>Json Data Set Reader Message Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfJsonDataSetReaderMessageDataType()
 * @model extendedMetaData="name='ListOfJsonDataSetReaderMessageDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfJsonDataSetReaderMessageDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Json Data Set Reader Message Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.JsonDataSetReaderMessageDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Data Set Reader Message Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfJsonDataSetReaderMessageDataType_JsonDataSetReaderMessageDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='JsonDataSetReaderMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<JsonDataSetReaderMessageDataType> getJsonDataSetReaderMessageDataType();

} // ListOfJsonDataSetReaderMessageDataType
