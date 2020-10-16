/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Three DOrientation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfThreeDOrientation#getThreeDOrientation <em>Three DOrientation</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfThreeDOrientation()
 * @model extendedMetaData="name='ListOfThreeDOrientation' kind='elementOnly'"
 * @generated
 */
public interface ListOfThreeDOrientation extends EObject {
	/**
	 * Returns the value of the '<em><b>Three DOrientation</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ThreeDOrientation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Three DOrientation</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfThreeDOrientation_ThreeDOrientation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ThreeDOrientation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ThreeDOrientation> getThreeDOrientation();

} // ListOfThreeDOrientation
