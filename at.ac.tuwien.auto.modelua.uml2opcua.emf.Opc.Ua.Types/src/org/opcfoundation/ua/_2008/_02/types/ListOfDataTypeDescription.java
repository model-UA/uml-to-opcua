/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Data Type Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfDataTypeDescription#getDataTypeDescription <em>Data Type Description</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataTypeDescription()
 * @model extendedMetaData="name='ListOfDataTypeDescription' kind='elementOnly'"
 * @generated
 */
public interface ListOfDataTypeDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Type Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.DataTypeDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Description</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataTypeDescription_DataTypeDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataTypeDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataTypeDescription> getDataTypeDescription();

} // ListOfDataTypeDescription
