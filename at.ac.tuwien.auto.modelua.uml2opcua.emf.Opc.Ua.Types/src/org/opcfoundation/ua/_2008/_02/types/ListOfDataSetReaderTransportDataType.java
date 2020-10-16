/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Data Set Reader Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderTransportDataType#getDataSetReaderTransportDataType <em>Data Set Reader Transport Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataSetReaderTransportDataType()
 * @model extendedMetaData="name='ListOfDataSetReaderTransportDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfDataSetReaderTransportDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Set Reader Transport Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.DataSetReaderTransportDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Reader Transport Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataSetReaderTransportDataType_DataSetReaderTransportDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSetReaderTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataSetReaderTransportDataType> getDataSetReaderTransportDataType();

} // ListOfDataSetReaderTransportDataType
