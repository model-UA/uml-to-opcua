/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Variant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getVariant()
 * @model extendedMetaData="name='Variant' kind='elementOnly'"
 * @generated
 */
public interface Variant extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(ValueType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getVariant_Value()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueType getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Variant#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Variant#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(ValueType)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Variant#getValue <em>Value</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' containment reference is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(ValueType)
	 * @generated
	 */
	boolean isSetValue();

} // Variant
