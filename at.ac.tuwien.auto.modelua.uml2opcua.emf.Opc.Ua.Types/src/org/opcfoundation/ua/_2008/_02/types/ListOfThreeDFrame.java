/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Three DFrame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfThreeDFrame#getThreeDFrame <em>Three DFrame</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfThreeDFrame()
 * @model extendedMetaData="name='ListOfThreeDFrame' kind='elementOnly'"
 * @generated
 */
public interface ListOfThreeDFrame extends EObject {
	/**
	 * Returns the value of the '<em><b>Three DFrame</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ThreeDFrame}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Three DFrame</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfThreeDFrame_ThreeDFrame()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ThreeDFrame' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ThreeDFrame> getThreeDFrame();

} // ListOfThreeDFrame
