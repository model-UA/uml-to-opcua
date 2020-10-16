/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Rational Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfRationalNumber#getRationalNumber <em>Rational Number</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfRationalNumber()
 * @model extendedMetaData="name='ListOfRationalNumber' kind='elementOnly'"
 * @generated
 */
public interface ListOfRationalNumber extends EObject {
	/**
	 * Returns the value of the '<em><b>Rational Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.RationalNumber}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rational Number</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfRationalNumber_RationalNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RationalNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RationalNumber> getRationalNumber();

} // ListOfRationalNumber
