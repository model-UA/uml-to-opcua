/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Zone Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.TimeZoneDataType#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.TimeZoneDataType#isDaylightSavingInOffset <em>Daylight Saving In Offset</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTimeZoneDataType()
 * @model extendedMetaData="name='TimeZoneDataType' kind='elementOnly'"
 * @generated
 */
public interface TimeZoneDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #setOffset(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTimeZoneDataType_Offset()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
	 *        extendedMetaData="kind='element' name='Offset' namespace='##targetNamespace'"
	 * @generated
	 */
	short getOffset();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.TimeZoneDataType#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(short value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.TimeZoneDataType#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOffset()
	 * @see #getOffset()
	 * @see #setOffset(short)
	 * @generated
	 */
	void unsetOffset();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.TimeZoneDataType#getOffset <em>Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Offset</em>' attribute is set.
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @see #setOffset(short)
	 * @generated
	 */
	boolean isSetOffset();

	/**
	 * Returns the value of the '<em><b>Daylight Saving In Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daylight Saving In Offset</em>' attribute.
	 * @see #isSetDaylightSavingInOffset()
	 * @see #unsetDaylightSavingInOffset()
	 * @see #setDaylightSavingInOffset(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTimeZoneDataType_DaylightSavingInOffset()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='DaylightSavingInOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDaylightSavingInOffset();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.TimeZoneDataType#isDaylightSavingInOffset <em>Daylight Saving In Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daylight Saving In Offset</em>' attribute.
	 * @see #isSetDaylightSavingInOffset()
	 * @see #unsetDaylightSavingInOffset()
	 * @see #isDaylightSavingInOffset()
	 * @generated
	 */
	void setDaylightSavingInOffset(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.TimeZoneDataType#isDaylightSavingInOffset <em>Daylight Saving In Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDaylightSavingInOffset()
	 * @see #isDaylightSavingInOffset()
	 * @see #setDaylightSavingInOffset(boolean)
	 * @generated
	 */
	void unsetDaylightSavingInOffset();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.TimeZoneDataType#isDaylightSavingInOffset <em>Daylight Saving In Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Daylight Saving In Offset</em>' attribute is set.
	 * @see #unsetDaylightSavingInOffset()
	 * @see #isDaylightSavingInOffset()
	 * @see #setDaylightSavingInOffset(boolean)
	 * @generated
	 */
	boolean isSetDaylightSavingInOffset();

} // TimeZoneDataType
