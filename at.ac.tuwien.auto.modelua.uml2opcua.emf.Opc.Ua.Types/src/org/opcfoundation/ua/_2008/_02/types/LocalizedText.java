/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Localized Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.LocalizedText#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.LocalizedText#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getLocalizedText()
 * @model extendedMetaData="name='LocalizedText' kind='elementOnly'"
 * @generated
 */
public interface LocalizedText extends EObject {
	/**
	 * Returns the value of the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale</em>' attribute.
	 * @see #isSetLocale()
	 * @see #unsetLocale()
	 * @see #setLocale(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getLocalizedText_Locale()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Locale' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocale();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.LocalizedText#getLocale <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale</em>' attribute.
	 * @see #isSetLocale()
	 * @see #unsetLocale()
	 * @see #getLocale()
	 * @generated
	 */
	void setLocale(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.LocalizedText#getLocale <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocale()
	 * @see #getLocale()
	 * @see #setLocale(String)
	 * @generated
	 */
	void unsetLocale();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.LocalizedText#getLocale <em>Locale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Locale</em>' attribute is set.
	 * @see #unsetLocale()
	 * @see #getLocale()
	 * @see #setLocale(String)
	 * @generated
	 */
	boolean isSetLocale();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #isSetText()
	 * @see #unsetText()
	 * @see #setText(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getLocalizedText_Text()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Text' namespace='##targetNamespace'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.LocalizedText#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #isSetText()
	 * @see #unsetText()
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.LocalizedText#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetText()
	 * @see #getText()
	 * @see #setText(String)
	 * @generated
	 */
	void unsetText();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.LocalizedText#getText <em>Text</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text</em>' attribute is set.
	 * @see #unsetText()
	 * @see #getText()
	 * @see #setText(String)
	 * @generated
	 */
	boolean isSetText();

} // LocalizedText
