/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.OptionSet#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.OptionSet#getValidBits <em>Valid Bits</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getOptionSet()
 * @model extendedMetaData="name='OptionSet' kind='elementOnly'"
 * @generated
 */
public interface OptionSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getOptionSet_Value()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.OptionSet#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(byte[] value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.OptionSet#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(byte[])
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.OptionSet#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(byte[])
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Valid Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Bits</em>' attribute.
	 * @see #isSetValidBits()
	 * @see #unsetValidBits()
	 * @see #setValidBits(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getOptionSet_ValidBits()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='ValidBits' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getValidBits();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.OptionSet#getValidBits <em>Valid Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Bits</em>' attribute.
	 * @see #isSetValidBits()
	 * @see #unsetValidBits()
	 * @see #getValidBits()
	 * @generated
	 */
	void setValidBits(byte[] value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.OptionSet#getValidBits <em>Valid Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidBits()
	 * @see #getValidBits()
	 * @see #setValidBits(byte[])
	 * @generated
	 */
	void unsetValidBits();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.OptionSet#getValidBits <em>Valid Bits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valid Bits</em>' attribute is set.
	 * @see #unsetValidBits()
	 * @see #getValidBits()
	 * @see #setValidBits(byte[])
	 * @generated
	 */
	boolean isSetValidBits();

} // OptionSet
