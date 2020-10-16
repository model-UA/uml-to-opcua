/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Three DCartesian Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfThreeDCartesianCoordinates#getThreeDCartesianCoordinates <em>Three DCartesian Coordinates</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfThreeDCartesianCoordinates()
 * @model extendedMetaData="name='ListOfThreeDCartesianCoordinates' kind='elementOnly'"
 * @generated
 */
public interface ListOfThreeDCartesianCoordinates extends EObject {
	/**
	 * Returns the value of the '<em><b>Three DCartesian Coordinates</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ThreeDCartesianCoordinates}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Three DCartesian Coordinates</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfThreeDCartesianCoordinates_ThreeDCartesianCoordinates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ThreeDCartesianCoordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ThreeDCartesianCoordinates> getThreeDCartesianCoordinates();

} // ListOfThreeDCartesianCoordinates
