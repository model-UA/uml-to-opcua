/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Cartesian Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfCartesianCoordinates#getCartesianCoordinates <em>Cartesian Coordinates</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfCartesianCoordinates()
 * @model extendedMetaData="name='ListOfCartesianCoordinates' kind='elementOnly'"
 * @generated
 */
public interface ListOfCartesianCoordinates extends EObject {
	/**
	 * Returns the value of the '<em><b>Cartesian Coordinates</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.CartesianCoordinates}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartesian Coordinates</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfCartesianCoordinates_CartesianCoordinates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CartesianCoordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CartesianCoordinates> getCartesianCoordinates();

} // ListOfCartesianCoordinates
