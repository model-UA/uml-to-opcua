/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rational Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RationalNumber#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RationalNumber#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRationalNumber()
 * @model extendedMetaData="name='RationalNumber' kind='elementOnly'"
 * @generated
 */
public interface RationalNumber extends EObject {
	/**
	 * Returns the value of the '<em><b>Numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerator</em>' attribute.
	 * @see #isSetNumerator()
	 * @see #unsetNumerator()
	 * @see #setNumerator(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRationalNumber_Numerator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='Numerator' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNumerator();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RationalNumber#getNumerator <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator</em>' attribute.
	 * @see #isSetNumerator()
	 * @see #unsetNumerator()
	 * @see #getNumerator()
	 * @generated
	 */
	void setNumerator(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RationalNumber#getNumerator <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumerator()
	 * @see #getNumerator()
	 * @see #setNumerator(int)
	 * @generated
	 */
	void unsetNumerator();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RationalNumber#getNumerator <em>Numerator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numerator</em>' attribute is set.
	 * @see #unsetNumerator()
	 * @see #getNumerator()
	 * @see #setNumerator(int)
	 * @generated
	 */
	boolean isSetNumerator();

	/**
	 * Returns the value of the '<em><b>Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator</em>' attribute.
	 * @see #isSetDenominator()
	 * @see #unsetDenominator()
	 * @see #setDenominator(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRationalNumber_Denominator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='Denominator' namespace='##targetNamespace'"
	 * @generated
	 */
	long getDenominator();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RationalNumber#getDenominator <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' attribute.
	 * @see #isSetDenominator()
	 * @see #unsetDenominator()
	 * @see #getDenominator()
	 * @generated
	 */
	void setDenominator(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RationalNumber#getDenominator <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDenominator()
	 * @see #getDenominator()
	 * @see #setDenominator(long)
	 * @generated
	 */
	void unsetDenominator();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RationalNumber#getDenominator <em>Denominator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Denominator</em>' attribute is set.
	 * @see #unsetDenominator()
	 * @see #getDenominator()
	 * @see #setDenominator(long)
	 * @generated
	 */
	boolean isSetDenominator();

} // RationalNumber
