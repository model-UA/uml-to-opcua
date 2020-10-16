/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ComplexNumberType#getReal <em>Real</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ComplexNumberType#getImaginary <em>Imaginary</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getComplexNumberType()
 * @model extendedMetaData="name='ComplexNumberType' kind='elementOnly'"
 * @generated
 */
public interface ComplexNumberType extends EObject {
	/**
	 * Returns the value of the '<em><b>Real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real</em>' attribute.
	 * @see #isSetReal()
	 * @see #unsetReal()
	 * @see #setReal(float)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getComplexNumberType_Real()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='Real' namespace='##targetNamespace'"
	 * @generated
	 */
	float getReal();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ComplexNumberType#getReal <em>Real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real</em>' attribute.
	 * @see #isSetReal()
	 * @see #unsetReal()
	 * @see #getReal()
	 * @generated
	 */
	void setReal(float value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ComplexNumberType#getReal <em>Real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReal()
	 * @see #getReal()
	 * @see #setReal(float)
	 * @generated
	 */
	void unsetReal();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ComplexNumberType#getReal <em>Real</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Real</em>' attribute is set.
	 * @see #unsetReal()
	 * @see #getReal()
	 * @see #setReal(float)
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
	 * @see #setImaginary(float)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getComplexNumberType_Imaginary()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='Imaginary' namespace='##targetNamespace'"
	 * @generated
	 */
	float getImaginary();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ComplexNumberType#getImaginary <em>Imaginary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imaginary</em>' attribute.
	 * @see #isSetImaginary()
	 * @see #unsetImaginary()
	 * @see #getImaginary()
	 * @generated
	 */
	void setImaginary(float value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ComplexNumberType#getImaginary <em>Imaginary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImaginary()
	 * @see #getImaginary()
	 * @see #setImaginary(float)
	 * @generated
	 */
	void unsetImaginary();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ComplexNumberType#getImaginary <em>Imaginary</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Imaginary</em>' attribute is set.
	 * @see #unsetImaginary()
	 * @see #getImaginary()
	 * @see #setImaginary(float)
	 * @generated
	 */
	boolean isSetImaginary();

} // ComplexNumberType
