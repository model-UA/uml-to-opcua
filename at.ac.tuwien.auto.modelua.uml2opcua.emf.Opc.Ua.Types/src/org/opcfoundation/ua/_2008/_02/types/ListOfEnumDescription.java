/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Enum Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfEnumDescription#getEnumDescription <em>Enum Description</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfEnumDescription()
 * @model extendedMetaData="name='ListOfEnumDescription' kind='elementOnly'"
 * @generated
 */
public interface ListOfEnumDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Enum Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.EnumDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Description</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfEnumDescription_EnumDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EnumDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnumDescription> getEnumDescription();

} // ListOfEnumDescription
