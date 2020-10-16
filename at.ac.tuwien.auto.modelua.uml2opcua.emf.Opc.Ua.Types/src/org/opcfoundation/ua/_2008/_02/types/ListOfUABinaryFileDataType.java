/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of UA Binary File Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfUABinaryFileDataType#getUABinaryFileDataType <em>UA Binary File Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUABinaryFileDataType()
 * @model extendedMetaData="name='ListOfUABinaryFileDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfUABinaryFileDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>UA Binary File Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.UABinaryFileDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UA Binary File Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUABinaryFileDataType_UABinaryFileDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UABinaryFileDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UABinaryFileDataType> getUABinaryFileDataType();

} // ListOfUABinaryFileDataType
