/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Data Set Meta Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfDataSetMetaDataType#getDataSetMetaDataType <em>Data Set Meta Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataSetMetaDataType()
 * @model extendedMetaData="name='ListOfDataSetMetaDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfDataSetMetaDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Set Meta Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.DataSetMetaDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Meta Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataSetMetaDataType_DataSetMetaDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSetMetaDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataSetMetaDataType> getDataSetMetaDataType();

} // ListOfDataSetMetaDataType
