/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XV Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.XVType#getX <em>X</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.XVType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getXVType()
 * @model extendedMetaData="name='XVType' kind='elementOnly'"
 * @generated
 */
public interface XVType extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getXVType_X()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='X' namespace='##targetNamespace'"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.XVType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.XVType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(double)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.XVType#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(double)
	 * @generated
	 */
	boolean isSetX();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(float)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getXVType_Value()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.XVType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.XVType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(float)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.XVType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(float)
	 * @generated
	 */
	boolean isSetValue();

} // XVType
