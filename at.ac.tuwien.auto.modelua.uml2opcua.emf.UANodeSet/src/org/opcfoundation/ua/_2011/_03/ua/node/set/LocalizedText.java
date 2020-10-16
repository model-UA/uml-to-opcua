/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

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
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText#getLocale <em>Locale</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getLocalizedText()
 * @model extendedMetaData="name='LocalizedText' kind='simple'"
 * @generated
 */
public interface LocalizedText extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getLocalizedText_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Locale</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale</em>' attribute.
	 * @see #isSetLocale()
	 * @see #unsetLocale()
	 * @see #setLocale(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getLocalizedText_Locale()
	 * @model default="" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.Locale"
	 *        extendedMetaData="kind='attribute' name='Locale'"
	 * @generated
	 */
	String getLocale();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText#getLocale <em>Locale</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText#getLocale <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocale()
	 * @see #getLocale()
	 * @see #setLocale(String)
	 * @generated
	 */
	void unsetLocale();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText#getLocale <em>Locale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Locale</em>' attribute is set.
	 * @see #unsetLocale()
	 * @see #getLocale()
	 * @see #setLocale(String)
	 * @generated
	 */
	boolean isSetLocale();

} // LocalizedText
