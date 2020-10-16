/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitoring Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#getClientHandle <em>Client Handle</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#getSamplingInterval <em>Sampling Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#isDiscardOldest <em>Discard Oldest</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoringParameters()
 * @model extendedMetaData="name='MonitoringParameters' kind='elementOnly'"
 * @generated
 */
public interface MonitoringParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Client Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Handle</em>' attribute.
	 * @see #isSetClientHandle()
	 * @see #unsetClientHandle()
	 * @see #setClientHandle(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoringParameters_ClientHandle()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='ClientHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	long getClientHandle();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#getClientHandle <em>Client Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Handle</em>' attribute.
	 * @see #isSetClientHandle()
	 * @see #unsetClientHandle()
	 * @see #getClientHandle()
	 * @generated
	 */
	void setClientHandle(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#getClientHandle <em>Client Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientHandle()
	 * @see #getClientHandle()
	 * @see #setClientHandle(long)
	 * @generated
	 */
	void unsetClientHandle();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#getClientHandle <em>Client Handle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client Handle</em>' attribute is set.
	 * @see #unsetClientHandle()
	 * @see #getClientHandle()
	 * @see #setClientHandle(long)
	 * @generated
	 */
	boolean isSetClientHandle();

	/**
	 * Returns the value of the '<em><b>Sampling Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Interval</em>' attribute.
	 * @see #isSetSamplingInterval()
	 * @see #unsetSamplingInterval()
	 * @see #setSamplingInterval(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoringParameters_SamplingInterval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='SamplingInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	double getSamplingInterval();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#getSamplingInterval <em>Sampling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Interval</em>' attribute.
	 * @see #isSetSamplingInterval()
	 * @see #unsetSamplingInterval()
	 * @see #getSamplingInterval()
	 * @generated
	 */
	void setSamplingInterval(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#getSamplingInterval <em>Sampling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSamplingInterval()
	 * @see #getSamplingInterval()
	 * @see #setSamplingInterval(double)
	 * @generated
	 */
	void unsetSamplingInterval();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#getSamplingInterval <em>Sampling Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sampling Interval</em>' attribute is set.
	 * @see #unsetSamplingInterval()
	 * @see #getSamplingInterval()
	 * @see #setSamplingInterval(double)
	 * @generated
	 */
	boolean isSetSamplingInterval();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #isSetFilter()
	 * @see #unsetFilter()
	 * @see #setFilter(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoringParameters_Filter()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Filter' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getFilter();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #isSetFilter()
	 * @see #unsetFilter()
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(ExtensionObject value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilter()
	 * @see #getFilter()
	 * @see #setFilter(ExtensionObject)
	 * @generated
	 */
	void unsetFilter();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#getFilter <em>Filter</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter</em>' containment reference is set.
	 * @see #unsetFilter()
	 * @see #getFilter()
	 * @see #setFilter(ExtensionObject)
	 * @generated
	 */
	boolean isSetFilter();

	/**
	 * Returns the value of the '<em><b>Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Size</em>' attribute.
	 * @see #isSetQueueSize()
	 * @see #unsetQueueSize()
	 * @see #setQueueSize(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoringParameters_QueueSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='QueueSize' namespace='##targetNamespace'"
	 * @generated
	 */
	long getQueueSize();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#getQueueSize <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Size</em>' attribute.
	 * @see #isSetQueueSize()
	 * @see #unsetQueueSize()
	 * @see #getQueueSize()
	 * @generated
	 */
	void setQueueSize(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#getQueueSize <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQueueSize()
	 * @see #getQueueSize()
	 * @see #setQueueSize(long)
	 * @generated
	 */
	void unsetQueueSize();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#getQueueSize <em>Queue Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Queue Size</em>' attribute is set.
	 * @see #unsetQueueSize()
	 * @see #getQueueSize()
	 * @see #setQueueSize(long)
	 * @generated
	 */
	boolean isSetQueueSize();

	/**
	 * Returns the value of the '<em><b>Discard Oldest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discard Oldest</em>' attribute.
	 * @see #isSetDiscardOldest()
	 * @see #unsetDiscardOldest()
	 * @see #setDiscardOldest(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoringParameters_DiscardOldest()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='DiscardOldest' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDiscardOldest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#isDiscardOldest <em>Discard Oldest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discard Oldest</em>' attribute.
	 * @see #isSetDiscardOldest()
	 * @see #unsetDiscardOldest()
	 * @see #isDiscardOldest()
	 * @generated
	 */
	void setDiscardOldest(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#isDiscardOldest <em>Discard Oldest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiscardOldest()
	 * @see #isDiscardOldest()
	 * @see #setDiscardOldest(boolean)
	 * @generated
	 */
	void unsetDiscardOldest();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoringParameters#isDiscardOldest <em>Discard Oldest</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Discard Oldest</em>' attribute is set.
	 * @see #unsetDiscardOldest()
	 * @see #isDiscardOldest()
	 * @see #setDiscardOldest(boolean)
	 * @generated
	 */
	boolean isSetDiscardOldest();

} // MonitoringParameters
