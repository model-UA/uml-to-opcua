/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DecimalDataType#getScale <em>Scale</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DecimalDataType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDecimalDataType()
 * @model extendedMetaData="name='DecimalDataType' kind='elementOnly'"
 * @generated
 */
public interface DecimalDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #setScale(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDecimalDataType_Scale()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
	 *        extendedMetaData="kind='element' name='Scale' namespace='##targetNamespace'"
	 * @generated
	 */
	short getScale();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DecimalDataType#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #getScale()
	 * @generated
	 */
	void setScale(short value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DecimalDataType#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScale()
	 * @see #getScale()
	 * @see #setScale(short)
	 * @generated
	 */
	void unsetScale();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DecimalDataType#getScale <em>Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scale</em>' attribute is set.
	 * @see #unsetScale()
	 * @see #getScale()
	 * @see #setScale(short)
	 * @generated
	 */
	boolean isSetScale();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDecimalDataType_Value()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DecimalDataType#getValue <em>Value</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DecimalDataType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(byte[])
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DecimalDataType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(byte[])
	 * @generated
	 */
	boolean isSetValue();

} // DecimalDataType
