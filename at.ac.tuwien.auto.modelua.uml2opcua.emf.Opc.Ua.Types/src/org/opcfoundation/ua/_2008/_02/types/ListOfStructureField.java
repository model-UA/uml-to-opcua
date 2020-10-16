/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Structure Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfStructureField#getStructureField <em>Structure Field</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfStructureField()
 * @model extendedMetaData="name='ListOfStructureField' kind='elementOnly'"
 * @generated
 */
public interface ListOfStructureField extends EObject {
	/**
	 * Returns the value of the '<em><b>Structure Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.StructureField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Field</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfStructureField_StructureField()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StructureField' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructureField> getStructureField();

} // ListOfStructureField
