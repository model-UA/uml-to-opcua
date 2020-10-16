/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Enum Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfEnumField#getEnumField <em>Enum Field</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfEnumField()
 * @model extendedMetaData="name='ListOfEnumField' kind='elementOnly'"
 * @generated
 */
public interface ListOfEnumField extends EObject {
	/**
	 * Returns the value of the '<em><b>Enum Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.EnumField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Field</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfEnumField_EnumField()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EnumField' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnumField> getEnumField();

} // ListOfEnumField
