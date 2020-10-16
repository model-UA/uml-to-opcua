/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Filter Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AggregateFilterResult#getRevisedStartTime <em>Revised Start Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AggregateFilterResult#getRevisedProcessingInterval <em>Revised Processing Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AggregateFilterResult#getRevisedAggregateConfiguration <em>Revised Aggregate Configuration</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAggregateFilterResult()
 * @model extendedMetaData="name='AggregateFilterResult' kind='elementOnly'"
 * @generated
 */
public interface AggregateFilterResult extends MonitoringFilterResult {
	/**
	 * Returns the value of the '<em><b>Revised Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revised Start Time</em>' attribute.
	 * @see #setRevisedStartTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAggregateFilterResult_RevisedStartTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='RevisedStartTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getRevisedStartTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateFilterResult#getRevisedStartTime <em>Revised Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revised Start Time</em>' attribute.
	 * @see #getRevisedStartTime()
	 * @generated
	 */
	void setRevisedStartTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Revised Processing Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revised Processing Interval</em>' attribute.
	 * @see #isSetRevisedProcessingInterval()
	 * @see #unsetRevisedProcessingInterval()
	 * @see #setRevisedProcessingInterval(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAggregateFilterResult_RevisedProcessingInterval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='RevisedProcessingInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRevisedProcessingInterval();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateFilterResult#getRevisedProcessingInterval <em>Revised Processing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revised Processing Interval</em>' attribute.
	 * @see #isSetRevisedProcessingInterval()
	 * @see #unsetRevisedProcessingInterval()
	 * @see #getRevisedProcessingInterval()
	 * @generated
	 */
	void setRevisedProcessingInterval(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateFilterResult#getRevisedProcessingInterval <em>Revised Processing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisedProcessingInterval()
	 * @see #getRevisedProcessingInterval()
	 * @see #setRevisedProcessingInterval(double)
	 * @generated
	 */
	void unsetRevisedProcessingInterval();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateFilterResult#getRevisedProcessingInterval <em>Revised Processing Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revised Processing Interval</em>' attribute is set.
	 * @see #unsetRevisedProcessingInterval()
	 * @see #getRevisedProcessingInterval()
	 * @see #setRevisedProcessingInterval(double)
	 * @generated
	 */
	boolean isSetRevisedProcessingInterval();

	/**
	 * Returns the value of the '<em><b>Revised Aggregate Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revised Aggregate Configuration</em>' containment reference.
	 * @see #isSetRevisedAggregateConfiguration()
	 * @see #unsetRevisedAggregateConfiguration()
	 * @see #setRevisedAggregateConfiguration(AggregateConfiguration)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAggregateFilterResult_RevisedAggregateConfiguration()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RevisedAggregateConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	AggregateConfiguration getRevisedAggregateConfiguration();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateFilterResult#getRevisedAggregateConfiguration <em>Revised Aggregate Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revised Aggregate Configuration</em>' containment reference.
	 * @see #isSetRevisedAggregateConfiguration()
	 * @see #unsetRevisedAggregateConfiguration()
	 * @see #getRevisedAggregateConfiguration()
	 * @generated
	 */
	void setRevisedAggregateConfiguration(AggregateConfiguration value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateFilterResult#getRevisedAggregateConfiguration <em>Revised Aggregate Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisedAggregateConfiguration()
	 * @see #getRevisedAggregateConfiguration()
	 * @see #setRevisedAggregateConfiguration(AggregateConfiguration)
	 * @generated
	 */
	void unsetRevisedAggregateConfiguration();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AggregateFilterResult#getRevisedAggregateConfiguration <em>Revised Aggregate Configuration</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revised Aggregate Configuration</em>' containment reference is set.
	 * @see #unsetRevisedAggregateConfiguration()
	 * @see #getRevisedAggregateConfiguration()
	 * @see #setRevisedAggregateConfiguration(AggregateConfiguration)
	 * @generated
	 */
	boolean isSetRevisedAggregateConfiguration();

} // AggregateFilterResult
