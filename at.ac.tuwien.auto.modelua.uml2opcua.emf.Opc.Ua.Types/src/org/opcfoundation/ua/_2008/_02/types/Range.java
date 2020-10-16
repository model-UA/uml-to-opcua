/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Range#getLow <em>Low</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.Range#getHigh <em>High</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRange()
 * @model extendedMetaData="name='Range' kind='elementOnly'"
 * @generated
 */
public interface Range extends EObject {
	/**
	 * Returns the value of the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low</em>' attribute.
	 * @see #isSetLow()
	 * @see #unsetLow()
	 * @see #setLow(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRange_Low()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='Low' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLow();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Range#getLow <em>Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' attribute.
	 * @see #isSetLow()
	 * @see #unsetLow()
	 * @see #getLow()
	 * @generated
	 */
	void setLow(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Range#getLow <em>Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLow()
	 * @see #getLow()
	 * @see #setLow(double)
	 * @generated
	 */
	void unsetLow();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Range#getLow <em>Low</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Low</em>' attribute is set.
	 * @see #unsetLow()
	 * @see #getLow()
	 * @see #setLow(double)
	 * @generated
	 */
	boolean isSetLow();

	/**
	 * Returns the value of the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High</em>' attribute.
	 * @see #isSetHigh()
	 * @see #unsetHigh()
	 * @see #setHigh(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRange_High()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='High' namespace='##targetNamespace'"
	 * @generated
	 */
	double getHigh();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.Range#getHigh <em>High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' attribute.
	 * @see #isSetHigh()
	 * @see #unsetHigh()
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.Range#getHigh <em>High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHigh()
	 * @see #getHigh()
	 * @see #setHigh(double)
	 * @generated
	 */
	void unsetHigh();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.Range#getHigh <em>High</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>High</em>' attribute is set.
	 * @see #unsetHigh()
	 * @see #getHigh()
	 * @see #setHigh(double)
	 * @generated
	 */
	boolean isSetHigh();

} // Range
