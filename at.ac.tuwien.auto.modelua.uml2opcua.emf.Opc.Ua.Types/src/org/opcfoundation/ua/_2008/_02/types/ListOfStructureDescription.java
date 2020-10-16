/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Structure Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfStructureDescription#getStructureDescription <em>Structure Description</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfStructureDescription()
 * @model extendedMetaData="name='ListOfStructureDescription' kind='elementOnly'"
 * @generated
 */
public interface ListOfStructureDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Structure Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.StructureDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Description</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfStructureDescription_StructureDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StructureDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructureDescription> getStructureDescription();

} // ListOfStructureDescription
