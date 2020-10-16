/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Enum Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfEnumDefinition#getEnumDefinition <em>Enum Definition</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfEnumDefinition()
 * @model extendedMetaData="name='ListOfEnumDefinition' kind='elementOnly'"
 * @generated
 */
public interface ListOfEnumDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Enum Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.EnumDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Definition</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfEnumDefinition_EnumDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EnumDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnumDefinition> getEnumDefinition();

} // ListOfEnumDefinition
