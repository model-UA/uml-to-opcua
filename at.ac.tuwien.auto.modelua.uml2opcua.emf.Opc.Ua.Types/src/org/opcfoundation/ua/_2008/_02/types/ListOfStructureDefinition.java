/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Structure Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfStructureDefinition#getStructureDefinition <em>Structure Definition</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfStructureDefinition()
 * @model extendedMetaData="name='ListOfStructureDefinition' kind='elementOnly'"
 * @generated
 */
public interface ListOfStructureDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Structure Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.StructureDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Definition</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfStructureDefinition_StructureDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StructureDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructureDefinition> getStructureDefinition();

} // ListOfStructureDefinition
