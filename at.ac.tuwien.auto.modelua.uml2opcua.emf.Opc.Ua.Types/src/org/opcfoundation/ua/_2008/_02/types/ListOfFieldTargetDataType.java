/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Field Target Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfFieldTargetDataType#getFieldTargetDataType <em>Field Target Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfFieldTargetDataType()
 * @model extendedMetaData="name='ListOfFieldTargetDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfFieldTargetDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Target Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Target Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfFieldTargetDataType_FieldTargetDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FieldTargetDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FieldTargetDataType> getFieldTargetDataType();

} // ListOfFieldTargetDataType
