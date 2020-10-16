/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Data Set Writer Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterTransportDataType#getDataSetWriterTransportDataType <em>Data Set Writer Transport Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataSetWriterTransportDataType()
 * @model extendedMetaData="name='ListOfDataSetWriterTransportDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfDataSetWriterTransportDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Set Writer Transport Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.DataSetWriterTransportDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Writer Transport Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataSetWriterTransportDataType_DataSetWriterTransportDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSetWriterTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataSetWriterTransportDataType> getDataSetWriterTransportDataType();

} // ListOfDataSetWriterTransportDataType
