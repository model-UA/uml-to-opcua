/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Raw Modified Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DeleteRawModifiedDetails#isIsDeleteModified <em>Is Delete Modified</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DeleteRawModifiedDetails#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DeleteRawModifiedDetails#getEndTime <em>End Time</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteRawModifiedDetails()
 * @model extendedMetaData="name='DeleteRawModifiedDetails' kind='elementOnly'"
 * @generated
 */
public interface DeleteRawModifiedDetails extends HistoryUpdateDetails {
	/**
	 * Returns the value of the '<em><b>Is Delete Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Delete Modified</em>' attribute.
	 * @see #isSetIsDeleteModified()
	 * @see #unsetIsDeleteModified()
	 * @see #setIsDeleteModified(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteRawModifiedDetails_IsDeleteModified()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsDeleteModified' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsDeleteModified();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteRawModifiedDetails#isIsDeleteModified <em>Is Delete Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Delete Modified</em>' attribute.
	 * @see #isSetIsDeleteModified()
	 * @see #unsetIsDeleteModified()
	 * @see #isIsDeleteModified()
	 * @generated
	 */
	void setIsDeleteModified(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteRawModifiedDetails#isIsDeleteModified <em>Is Delete Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDeleteModified()
	 * @see #isIsDeleteModified()
	 * @see #setIsDeleteModified(boolean)
	 * @generated
	 */
	void unsetIsDeleteModified();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteRawModifiedDetails#isIsDeleteModified <em>Is Delete Modified</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Delete Modified</em>' attribute is set.
	 * @see #unsetIsDeleteModified()
	 * @see #isIsDeleteModified()
	 * @see #setIsDeleteModified(boolean)
	 * @generated
	 */
	boolean isSetIsDeleteModified();

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteRawModifiedDetails_StartTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='StartTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStartTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteRawModifiedDetails#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDeleteRawModifiedDetails_EndTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='EndTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEndTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DeleteRawModifiedDetails#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(XMLGregorianCalendar value);

} // DeleteRawModifiedDetails
