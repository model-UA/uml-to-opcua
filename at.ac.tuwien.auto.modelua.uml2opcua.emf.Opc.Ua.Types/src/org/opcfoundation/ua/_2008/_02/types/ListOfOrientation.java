/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Orientation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfOrientation#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfOrientation()
 * @model extendedMetaData="name='ListOfOrientation' kind='elementOnly'"
 * @generated
 */
public interface ListOfOrientation extends EObject {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.Orientation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfOrientation_Orientation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Orientation> getOrientation();

} // ListOfOrientation
