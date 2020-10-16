/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Data Set Ordering Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfDataSetOrderingType#getDataSetOrderingType <em>Data Set Ordering Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataSetOrderingType()
 * @model extendedMetaData="name='ListOfDataSetOrderingType' kind='elementOnly'"
 * @generated
 */
public interface ListOfDataSetOrderingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Set Ordering Type</b></em>' attribute list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.DataSetOrderingType}.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.DataSetOrderingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Ordering Type</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.DataSetOrderingType
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataSetOrderingType_DataSetOrderingType()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='DataSetOrderingType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataSetOrderingType> getDataSetOrderingType();

} // ListOfDataSetOrderingType
