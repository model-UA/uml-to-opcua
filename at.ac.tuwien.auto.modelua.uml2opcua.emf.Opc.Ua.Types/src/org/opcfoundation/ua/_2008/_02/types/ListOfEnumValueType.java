/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Enum Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfEnumValueType#getEnumValueType <em>Enum Value Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfEnumValueType()
 * @model extendedMetaData="name='ListOfEnumValueType' kind='elementOnly'"
 * @generated
 */
public interface ListOfEnumValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Enum Value Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.EnumValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Value Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfEnumValueType_EnumValueType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EnumValueType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnumValueType> getEnumValueType();

} // ListOfEnumValueType
