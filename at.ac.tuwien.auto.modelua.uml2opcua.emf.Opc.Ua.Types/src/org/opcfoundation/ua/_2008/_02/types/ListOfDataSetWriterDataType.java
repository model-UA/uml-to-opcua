/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Data Set Writer Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterDataType#getDataSetWriterDataType <em>Data Set Writer Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataSetWriterDataType()
 * @model extendedMetaData="name='ListOfDataSetWriterDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfDataSetWriterDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Set Writer Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.DataSetWriterDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Writer Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataSetWriterDataType_DataSetWriterDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSetWriterDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataSetWriterDataType> getDataSetWriterDataType();

} // ListOfDataSetWriterDataType
