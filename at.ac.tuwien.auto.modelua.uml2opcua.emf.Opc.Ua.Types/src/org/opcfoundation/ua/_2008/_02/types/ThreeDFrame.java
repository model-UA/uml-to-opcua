/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Three DFrame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ThreeDFrame#getCartesianCoordinates <em>Cartesian Coordinates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ThreeDFrame#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getThreeDFrame()
 * @model extendedMetaData="name='ThreeDFrame' kind='elementOnly'"
 * @generated
 */
public interface ThreeDFrame extends Frame {
	/**
	 * Returns the value of the '<em><b>Cartesian Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartesian Coordinates</em>' containment reference.
	 * @see #isSetCartesianCoordinates()
	 * @see #unsetCartesianCoordinates()
	 * @see #setCartesianCoordinates(ThreeDCartesianCoordinates)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getThreeDFrame_CartesianCoordinates()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='CartesianCoordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	ThreeDCartesianCoordinates getCartesianCoordinates();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ThreeDFrame#getCartesianCoordinates <em>Cartesian Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian Coordinates</em>' containment reference.
	 * @see #isSetCartesianCoordinates()
	 * @see #unsetCartesianCoordinates()
	 * @see #getCartesianCoordinates()
	 * @generated
	 */
	void setCartesianCoordinates(ThreeDCartesianCoordinates value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ThreeDFrame#getCartesianCoordinates <em>Cartesian Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCartesianCoordinates()
	 * @see #getCartesianCoordinates()
	 * @see #setCartesianCoordinates(ThreeDCartesianCoordinates)
	 * @generated
	 */
	void unsetCartesianCoordinates();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ThreeDFrame#getCartesianCoordinates <em>Cartesian Coordinates</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cartesian Coordinates</em>' containment reference is set.
	 * @see #unsetCartesianCoordinates()
	 * @see #getCartesianCoordinates()
	 * @see #setCartesianCoordinates(ThreeDCartesianCoordinates)
	 * @generated
	 */
	boolean isSetCartesianCoordinates();

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #setOrientation(ThreeDOrientation)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getThreeDFrame_Orientation()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	ThreeDOrientation getOrientation();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ThreeDFrame#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(ThreeDOrientation value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ThreeDFrame#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(ThreeDOrientation)
	 * @generated
	 */
	void unsetOrientation();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ThreeDFrame#getOrientation <em>Orientation</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orientation</em>' containment reference is set.
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(ThreeDOrientation)
	 * @generated
	 */
	boolean isSetOrientation();

} // ThreeDFrame
