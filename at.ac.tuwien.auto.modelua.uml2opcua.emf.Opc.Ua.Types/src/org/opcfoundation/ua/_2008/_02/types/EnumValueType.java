/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EnumValueType#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EnumValueType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.EnumValueType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEnumValueType()
 * @model extendedMetaData="name='EnumValueType' kind='elementOnly'"
 * @generated
 */
public interface EnumValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEnumValueType_Value()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EnumValueType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EnumValueType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(long)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EnumValueType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(long)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference.
	 * @see #isSetDisplayName()
	 * @see #unsetDisplayName()
	 * @see #setDisplayName(LocalizedText)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEnumValueType_DisplayName()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DisplayName' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedText getDisplayName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EnumValueType#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' containment reference.
	 * @see #isSetDisplayName()
	 * @see #unsetDisplayName()
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(LocalizedText value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EnumValueType#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayName()
	 * @see #getDisplayName()
	 * @see #setDisplayName(LocalizedText)
	 * @generated
	 */
	void unsetDisplayName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EnumValueType#getDisplayName <em>Display Name</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Name</em>' containment reference is set.
	 * @see #unsetDisplayName()
	 * @see #getDisplayName()
	 * @see #setDisplayName(LocalizedText)
	 * @generated
	 */
	boolean isSetDisplayName();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(LocalizedText)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getEnumValueType_Description()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedText getDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.EnumValueType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(LocalizedText value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.EnumValueType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(LocalizedText)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.EnumValueType#getDescription <em>Description</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' containment reference is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(LocalizedText)
	 * @generated
	 */
	boolean isSetDescription();

} // EnumValueType
