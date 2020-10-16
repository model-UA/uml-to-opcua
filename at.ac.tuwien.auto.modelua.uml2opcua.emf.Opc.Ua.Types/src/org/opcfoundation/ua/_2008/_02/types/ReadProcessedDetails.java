/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Processed Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadProcessedDetails#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadProcessedDetails#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadProcessedDetails#getProcessingInterval <em>Processing Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadProcessedDetails#getAggregateType <em>Aggregate Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReadProcessedDetails#getAggregateConfiguration <em>Aggregate Configuration</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadProcessedDetails()
 * @model extendedMetaData="name='ReadProcessedDetails' kind='elementOnly'"
 * @generated
 */
public interface ReadProcessedDetails extends HistoryReadDetails {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadProcessedDetails_StartTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='StartTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStartTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadProcessedDetails#getStartTime <em>Start Time</em>}' attribute.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadProcessedDetails_EndTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='EndTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEndTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadProcessedDetails#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Processing Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Interval</em>' attribute.
	 * @see #isSetProcessingInterval()
	 * @see #unsetProcessingInterval()
	 * @see #setProcessingInterval(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadProcessedDetails_ProcessingInterval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='ProcessingInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	double getProcessingInterval();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadProcessedDetails#getProcessingInterval <em>Processing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Interval</em>' attribute.
	 * @see #isSetProcessingInterval()
	 * @see #unsetProcessingInterval()
	 * @see #getProcessingInterval()
	 * @generated
	 */
	void setProcessingInterval(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadProcessedDetails#getProcessingInterval <em>Processing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessingInterval()
	 * @see #getProcessingInterval()
	 * @see #setProcessingInterval(double)
	 * @generated
	 */
	void unsetProcessingInterval();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadProcessedDetails#getProcessingInterval <em>Processing Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Processing Interval</em>' attribute is set.
	 * @see #unsetProcessingInterval()
	 * @see #getProcessingInterval()
	 * @see #setProcessingInterval(double)
	 * @generated
	 */
	boolean isSetProcessingInterval();

	/**
	 * Returns the value of the '<em><b>Aggregate Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Type</em>' containment reference.
	 * @see #isSetAggregateType()
	 * @see #unsetAggregateType()
	 * @see #setAggregateType(ListOfNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadProcessedDetails_AggregateType()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AggregateType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfNodeId getAggregateType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadProcessedDetails#getAggregateType <em>Aggregate Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Type</em>' containment reference.
	 * @see #isSetAggregateType()
	 * @see #unsetAggregateType()
	 * @see #getAggregateType()
	 * @generated
	 */
	void setAggregateType(ListOfNodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadProcessedDetails#getAggregateType <em>Aggregate Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregateType()
	 * @see #getAggregateType()
	 * @see #setAggregateType(ListOfNodeId)
	 * @generated
	 */
	void unsetAggregateType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadProcessedDetails#getAggregateType <em>Aggregate Type</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregate Type</em>' containment reference is set.
	 * @see #unsetAggregateType()
	 * @see #getAggregateType()
	 * @see #setAggregateType(ListOfNodeId)
	 * @generated
	 */
	boolean isSetAggregateType();

	/**
	 * Returns the value of the '<em><b>Aggregate Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Configuration</em>' containment reference.
	 * @see #isSetAggregateConfiguration()
	 * @see #unsetAggregateConfiguration()
	 * @see #setAggregateConfiguration(AggregateConfiguration)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReadProcessedDetails_AggregateConfiguration()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AggregateConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	AggregateConfiguration getAggregateConfiguration();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadProcessedDetails#getAggregateConfiguration <em>Aggregate Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Configuration</em>' containment reference.
	 * @see #isSetAggregateConfiguration()
	 * @see #unsetAggregateConfiguration()
	 * @see #getAggregateConfiguration()
	 * @generated
	 */
	void setAggregateConfiguration(AggregateConfiguration value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadProcessedDetails#getAggregateConfiguration <em>Aggregate Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregateConfiguration()
	 * @see #getAggregateConfiguration()
	 * @see #setAggregateConfiguration(AggregateConfiguration)
	 * @generated
	 */
	void unsetAggregateConfiguration();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReadProcessedDetails#getAggregateConfiguration <em>Aggregate Configuration</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregate Configuration</em>' containment reference is set.
	 * @see #unsetAggregateConfiguration()
	 * @see #getAggregateConfiguration()
	 * @see #setAggregateConfiguration(AggregateConfiguration)
	 * @generated
	 */
	boolean isSetAggregateConfiguration();

} // ReadProcessedDetails
