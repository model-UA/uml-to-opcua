/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Three DVector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfThreeDVector#getThreeDVector <em>Three DVector</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfThreeDVector()
 * @model extendedMetaData="name='ListOfThreeDVector' kind='elementOnly'"
 * @generated
 */
public interface ListOfThreeDVector extends EObject {
	/**
	 * Returns the value of the '<em><b>Three DVector</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ThreeDVector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Three DVector</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfThreeDVector_ThreeDVector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ThreeDVector' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ThreeDVector> getThreeDVector();

} // ListOfThreeDVector
