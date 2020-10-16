/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Data Set Writer Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterMessageDataType#getDataSetWriterMessageDataType <em>Data Set Writer Message Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataSetWriterMessageDataType()
 * @model extendedMetaData="name='ListOfDataSetWriterMessageDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfDataSetWriterMessageDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Set Writer Message Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.DataSetWriterMessageDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Writer Message Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataSetWriterMessageDataType_DataSetWriterMessageDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSetWriterMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataSetWriterMessageDataType> getDataSetWriterMessageDataType();

} // ListOfDataSetWriterMessageDataType
