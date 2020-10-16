/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Field Meta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfFieldMetaData#getFieldMetaData <em>Field Meta Data</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfFieldMetaData()
 * @model extendedMetaData="name='ListOfFieldMetaData' kind='elementOnly'"
 * @generated
 */
public interface ListOfFieldMetaData extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Meta Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.FieldMetaData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Meta Data</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfFieldMetaData_FieldMetaData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FieldMetaData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FieldMetaData> getFieldMetaData();

} // ListOfFieldMetaData
