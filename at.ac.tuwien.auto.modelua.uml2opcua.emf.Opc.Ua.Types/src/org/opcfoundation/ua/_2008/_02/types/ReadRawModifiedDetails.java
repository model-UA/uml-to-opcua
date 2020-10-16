/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Raw Modified Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails#isIsReadModified <em>Is Read Modified</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails#getNumValuesPerNode <em>Num Values Per Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails#isReturnBounds <em>Return Bounds</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadRawModifiedDetails()
 * @model extendedMetaData="name='ReadRawModifiedDetails' kind='elementOnly'"
 * @generated
 */
public interface ReadRawModifiedDetails extends HistoryReadDetails {
	/**
	 * Returns the value of the '<em><b>Is Read Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Modified</em>' attribute.
	 * @see #isSetIsReadModified()
	 * @see #unsetIsReadModified()
	 * @see #setIsReadModified(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadRawModifiedDetails_IsReadModified()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsReadModified' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsReadModified();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails#isIsReadModified <em>Is Read Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Modified</em>' attribute.
	 * @see #isSetIsReadModified()
	 * @see #unsetIsReadModified()
	 * @see #isIsReadModified()
	 * @generated
	 */
	void setIsReadModified(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails#isIsReadModified <em>Is Read Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsReadModified()
	 * @see #isIsReadModified()
	 * @see #setIsReadModified(boolean)
	 * @generated
	 */
	void unsetIsReadModified();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails#isIsReadModified <em>Is Read Modified</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Read Modified</em>' attribute is set.
	 * @see #unsetIsReadModified()
	 * @see #isIsReadModified()
	 * @see #setIsReadModified(boolean)
	 * @generated
	 */
	boolean isSetIsReadModified();

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadRawModifiedDetails_StartTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='StartTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStartTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails#getStartTime <em>Start Time</em>}' attribute.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadRawModifiedDetails_EndTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='EndTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEndTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Num Values Per Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Values Per Node</em>' attribute.
	 * @see #isSetNumValuesPerNode()
	 * @see #unsetNumValuesPerNode()
	 * @see #setNumValuesPerNode(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadRawModifiedDetails_NumValuesPerNode()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='NumValuesPerNode' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNumValuesPerNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails#getNumValuesPerNode <em>Num Values Per Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Values Per Node</em>' attribute.
	 * @see #isSetNumValuesPerNode()
	 * @see #unsetNumValuesPerNode()
	 * @see #getNumValuesPerNode()
	 * @generated
	 */
	void setNumValuesPerNode(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails#getNumValuesPerNode <em>Num Values Per Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumValuesPerNode()
	 * @see #getNumValuesPerNode()
	 * @see #setNumValuesPerNode(long)
	 * @generated
	 */
	void unsetNumValuesPerNode();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails#getNumValuesPerNode <em>Num Values Per Node</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Num Values Per Node</em>' attribute is set.
	 * @see #unsetNumValuesPerNode()
	 * @see #getNumValuesPerNode()
	 * @see #setNumValuesPerNode(long)
	 * @generated
	 */
	boolean isSetNumValuesPerNode();

	/**
	 * Returns the value of the '<em><b>Return Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Bounds</em>' attribute.
	 * @see #isSetReturnBounds()
	 * @see #unsetReturnBounds()
	 * @see #setReturnBounds(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadRawModifiedDetails_ReturnBounds()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='ReturnBounds' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isReturnBounds();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails#isReturnBounds <em>Return Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Bounds</em>' attribute.
	 * @see #isSetReturnBounds()
	 * @see #unsetReturnBounds()
	 * @see #isReturnBounds()
	 * @generated
	 */
	void setReturnBounds(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails#isReturnBounds <em>Return Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReturnBounds()
	 * @see #isReturnBounds()
	 * @see #setReturnBounds(boolean)
	 * @generated
	 */
	void unsetReturnBounds();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails#isReturnBounds <em>Return Bounds</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Return Bounds</em>' attribute is set.
	 * @see #unsetReturnBounds()
	 * @see #isReturnBounds()
	 * @see #setReturnBounds(boolean)
	 * @generated
	 */
	boolean isSetReturnBounds();

} // ReadRawModifiedDetails
