/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Currency Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType#getNumericCode <em>Numeric Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType#getExponent <em>Exponent</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType#getAlphabeticCode <em>Alphabetic Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType#getCurrency <em>Currency</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCurrencyUnitType()
 * @model extendedMetaData="name='CurrencyUnitType' kind='elementOnly'"
 * @generated
 */
public interface CurrencyUnitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Numeric Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numeric Code</em>' attribute.
	 * @see #isSetNumericCode()
	 * @see #unsetNumericCode()
	 * @see #setNumericCode(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCurrencyUnitType_NumericCode()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
	 *        extendedMetaData="kind='element' name='NumericCode' namespace='##targetNamespace'"
	 * @generated
	 */
	short getNumericCode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType#getNumericCode <em>Numeric Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numeric Code</em>' attribute.
	 * @see #isSetNumericCode()
	 * @see #unsetNumericCode()
	 * @see #getNumericCode()
	 * @generated
	 */
	void setNumericCode(short value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType#getNumericCode <em>Numeric Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumericCode()
	 * @see #getNumericCode()
	 * @see #setNumericCode(short)
	 * @generated
	 */
	void unsetNumericCode();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType#getNumericCode <em>Numeric Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numeric Code</em>' attribute is set.
	 * @see #unsetNumericCode()
	 * @see #getNumericCode()
	 * @see #setNumericCode(short)
	 * @generated
	 */
	boolean isSetNumericCode();

	/**
	 * Returns the value of the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exponent</em>' attribute.
	 * @see #isSetExponent()
	 * @see #unsetExponent()
	 * @see #setExponent(byte)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCurrencyUnitType_Exponent()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='element' name='Exponent' namespace='##targetNamespace'"
	 * @generated
	 */
	byte getExponent();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType#getExponent <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponent</em>' attribute.
	 * @see #isSetExponent()
	 * @see #unsetExponent()
	 * @see #getExponent()
	 * @generated
	 */
	void setExponent(byte value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType#getExponent <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExponent()
	 * @see #getExponent()
	 * @see #setExponent(byte)
	 * @generated
	 */
	void unsetExponent();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType#getExponent <em>Exponent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Exponent</em>' attribute is set.
	 * @see #unsetExponent()
	 * @see #getExponent()
	 * @see #setExponent(byte)
	 * @generated
	 */
	boolean isSetExponent();

	/**
	 * Returns the value of the '<em><b>Alphabetic Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphabetic Code</em>' attribute.
	 * @see #isSetAlphabeticCode()
	 * @see #unsetAlphabeticCode()
	 * @see #setAlphabeticCode(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCurrencyUnitType_AlphabeticCode()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AlphabeticCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAlphabeticCode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType#getAlphabeticCode <em>Alphabetic Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alphabetic Code</em>' attribute.
	 * @see #isSetAlphabeticCode()
	 * @see #unsetAlphabeticCode()
	 * @see #getAlphabeticCode()
	 * @generated
	 */
	void setAlphabeticCode(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType#getAlphabeticCode <em>Alphabetic Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlphabeticCode()
	 * @see #getAlphabeticCode()
	 * @see #setAlphabeticCode(String)
	 * @generated
	 */
	void unsetAlphabeticCode();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType#getAlphabeticCode <em>Alphabetic Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alphabetic Code</em>' attribute is set.
	 * @see #unsetAlphabeticCode()
	 * @see #getAlphabeticCode()
	 * @see #setAlphabeticCode(String)
	 * @generated
	 */
	boolean isSetAlphabeticCode();

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' containment reference.
	 * @see #isSetCurrency()
	 * @see #unsetCurrency()
	 * @see #setCurrency(LocalizedText)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCurrencyUnitType_Currency()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Currency' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedText getCurrency();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType#getCurrency <em>Currency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' containment reference.
	 * @see #isSetCurrency()
	 * @see #unsetCurrency()
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(LocalizedText value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType#getCurrency <em>Currency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrency()
	 * @see #getCurrency()
	 * @see #setCurrency(LocalizedText)
	 * @generated
	 */
	void unsetCurrency();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType#getCurrency <em>Currency</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Currency</em>' containment reference is set.
	 * @see #unsetCurrency()
	 * @see #getCurrency()
	 * @see #setCurrency(LocalizedText)
	 * @generated
	 */
	boolean isSetCurrency();

} // CurrencyUnitType
