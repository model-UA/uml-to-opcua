/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Complex Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DoubleComplexNumberType#getReal <em>Real</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DoubleComplexNumberType#getImaginary <em>Imaginary</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDoubleComplexNumberType()
 * @model extendedMetaData="name='DoubleComplexNumberType' kind='elementOnly'"
 * @generated
 */
public interface DoubleComplexNumberType extends EObject {
	/**
	 * Returns the value of the '<em><b>Real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real</em>' attribute.
	 * @see #isSetReal()
	 * @see #unsetReal()
	 * @see #setReal(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDoubleComplexNumberType_Real()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='Real' namespace='##targetNamespace'"
	 * @generated
	 */
	double getReal();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DoubleComplexNumberType#getReal <em>Real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real</em>' attribute.
	 * @see #isSetReal()
	 * @see #unsetReal()
	 * @see #getReal()
	 * @generated
	 */
	void setReal(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DoubleComplexNumberType#getReal <em>Real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReal()
	 * @see #getReal()
	 * @see #setReal(double)
	 * @generated
	 */
	void unsetReal();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DoubleComplexNumberType#getReal <em>Real</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Real</em>' attribute is set.
	 * @see #unsetReal()
	 * @see #getReal()
	 * @see #setReal(double)
	 * @generated
	 */
	boolean isSetReal();

	/**
	 * Returns the value of the '<em><b>Imaginary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imaginary</em>' attribute.
	 * @see #isSetImaginary()
	 * @see #unsetImaginary()
	 * @see #setImaginary(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDoubleComplexNumberType_Imaginary()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='Imaginary' namespace='##targetNamespace'"
	 * @generated
	 */
	double getImaginary();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DoubleComplexNumberType#getImaginary <em>Imaginary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imaginary</em>' attribute.
	 * @see #isSetImaginary()
	 * @see #unsetImaginary()
	 * @see #getImaginary()
	 * @generated
	 */
	void setImaginary(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DoubleComplexNumberType#getImaginary <em>Imaginary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImaginary()
	 * @see #getImaginary()
	 * @see #setImaginary(double)
	 * @generated
	 */
	void unsetImaginary();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DoubleComplexNumberType#getImaginary <em>Imaginary</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Imaginary</em>' attribute is set.
	 * @see #unsetImaginary()
	 * @see #getImaginary()
	 * @see #setImaginary(double)
	 * @generated
	 */
	boolean isSetImaginary();

} // DoubleComplexNumberType
