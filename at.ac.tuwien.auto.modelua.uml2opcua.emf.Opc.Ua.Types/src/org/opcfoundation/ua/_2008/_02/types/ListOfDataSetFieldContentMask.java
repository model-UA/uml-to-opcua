/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Data Set Field Content Mask</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfDataSetFieldContentMask#getDataSetFieldContentMask <em>Data Set Field Content Mask</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataSetFieldContentMask()
 * @model extendedMetaData="name='ListOfDataSetFieldContentMask' kind='elementOnly'"
 * @generated
 */
public interface ListOfDataSetFieldContentMask extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Set Field Content Mask</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Field Content Mask</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataSetFieldContentMask_DataSetFieldContentMask()
	 * @model unique="false" dataType="org.opcfoundation.ua._2008._02.types.DataSetFieldContentMask"
	 *        extendedMetaData="kind='element' name='DataSetFieldContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Long> getDataSetFieldContentMask();

} // ListOfDataSetFieldContentMask
