/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfVector#getVector <em>Vector</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfVector()
 * @model extendedMetaData="name='ListOfVector' kind='elementOnly'"
 * @generated
 */
public interface ListOfVector extends EObject {
	/**
	 * Returns the value of the '<em><b>Vector</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.Vector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfVector_Vector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vector' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Vector> getVector();

} // ListOfVector
