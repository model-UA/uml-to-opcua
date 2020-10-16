/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Event Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadEventDetails#getNumValuesPerNode <em>Num Values Per Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadEventDetails#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadEventDetails#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadEventDetails#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadEventDetails()
 * @model extendedMetaData="name='ReadEventDetails' kind='elementOnly'"
 * @generated
 */
public interface ReadEventDetails extends HistoryReadDetails {
	/**
	 * Returns the value of the '<em><b>Num Values Per Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Values Per Node</em>' attribute.
	 * @see #isSetNumValuesPerNode()
	 * @see #unsetNumValuesPerNode()
	 * @see #setNumValuesPerNode(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadEventDetails_NumValuesPerNode()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='NumValuesPerNode' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNumValuesPerNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadEventDetails#getNumValuesPerNode <em>Num Values Per Node</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadEventDetails#getNumValuesPerNode <em>Num Values Per Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumValuesPerNode()
	 * @see #getNumValuesPerNode()
	 * @see #setNumValuesPerNode(long)
	 * @generated
	 */
	void unsetNumValuesPerNode();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadEventDetails#getNumValuesPerNode <em>Num Values Per Node</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadEventDetails_StartTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='StartTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStartTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadEventDetails#getStartTime <em>Start Time</em>}' attribute.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadEventDetails_EndTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='EndTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEndTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadEventDetails#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #isSetFilter()
	 * @see #unsetFilter()
	 * @see #setFilter(EventFilter)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadEventDetails_Filter()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Filter' namespace='##targetNamespace'"
	 * @generated
	 */
	EventFilter getFilter();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadEventDetails#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #isSetFilter()
	 * @see #unsetFilter()
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(EventFilter value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadEventDetails#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilter()
	 * @see #getFilter()
	 * @see #setFilter(EventFilter)
	 * @generated
	 */
	void unsetFilter();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadEventDetails#getFilter <em>Filter</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter</em>' containment reference is set.
	 * @see #unsetFilter()
	 * @see #getFilter()
	 * @see #setFilter(EventFilter)
	 * @generated
	 */
	boolean isSetFilter();

} // ReadEventDetails
