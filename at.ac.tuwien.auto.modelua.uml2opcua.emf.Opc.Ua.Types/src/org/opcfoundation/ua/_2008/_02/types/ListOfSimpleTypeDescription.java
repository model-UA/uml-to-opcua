/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Simple Type Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfSimpleTypeDescription#getSimpleTypeDescription <em>Simple Type Description</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSimpleTypeDescription()
 * @model extendedMetaData="name='ListOfSimpleTypeDescription' kind='elementOnly'"
 * @generated
 */
public interface ListOfSimpleTypeDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Simple Type Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.SimpleTypeDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Type Description</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSimpleTypeDescription_SimpleTypeDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SimpleTypeDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SimpleTypeDescription> getSimpleTypeDescription();

} // ListOfSimpleTypeDescription
