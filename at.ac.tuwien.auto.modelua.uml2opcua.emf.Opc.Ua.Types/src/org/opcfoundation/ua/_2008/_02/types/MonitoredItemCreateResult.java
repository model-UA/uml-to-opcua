/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitored Item Create Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult#getMonitoredItemId <em>Monitored Item Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult#getRevisedSamplingInterval <em>Revised Sampling Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult#getRevisedQueueSize <em>Revised Queue Size</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult#getFilterResult <em>Filter Result</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoredItemCreateResult()
 * @model extendedMetaData="name='MonitoredItemCreateResult' kind='elementOnly'"
 * @generated
 */
public interface MonitoredItemCreateResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code</em>' containment reference.
	 * @see #setStatusCode(StatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoredItemCreateResult_StatusCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StatusCode' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusCode getStatusCode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult#getStatusCode <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' containment reference.
	 * @see #getStatusCode()
	 * @generated
	 */
	void setStatusCode(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Monitored Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Item Id</em>' attribute.
	 * @see #isSetMonitoredItemId()
	 * @see #unsetMonitoredItemId()
	 * @see #setMonitoredItemId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoredItemCreateResult_MonitoredItemId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MonitoredItemId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMonitoredItemId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult#getMonitoredItemId <em>Monitored Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored Item Id</em>' attribute.
	 * @see #isSetMonitoredItemId()
	 * @see #unsetMonitoredItemId()
	 * @see #getMonitoredItemId()
	 * @generated
	 */
	void setMonitoredItemId(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult#getMonitoredItemId <em>Monitored Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonitoredItemId()
	 * @see #getMonitoredItemId()
	 * @see #setMonitoredItemId(long)
	 * @generated
	 */
	void unsetMonitoredItemId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult#getMonitoredItemId <em>Monitored Item Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Monitored Item Id</em>' attribute is set.
	 * @see #unsetMonitoredItemId()
	 * @see #getMonitoredItemId()
	 * @see #setMonitoredItemId(long)
	 * @generated
	 */
	boolean isSetMonitoredItemId();

	/**
	 * Returns the value of the '<em><b>Revised Sampling Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revised Sampling Interval</em>' attribute.
	 * @see #isSetRevisedSamplingInterval()
	 * @see #unsetRevisedSamplingInterval()
	 * @see #setRevisedSamplingInterval(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoredItemCreateResult_RevisedSamplingInterval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='RevisedSamplingInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRevisedSamplingInterval();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult#getRevisedSamplingInterval <em>Revised Sampling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revised Sampling Interval</em>' attribute.
	 * @see #isSetRevisedSamplingInterval()
	 * @see #unsetRevisedSamplingInterval()
	 * @see #getRevisedSamplingInterval()
	 * @generated
	 */
	void setRevisedSamplingInterval(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult#getRevisedSamplingInterval <em>Revised Sampling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisedSamplingInterval()
	 * @see #getRevisedSamplingInterval()
	 * @see #setRevisedSamplingInterval(double)
	 * @generated
	 */
	void unsetRevisedSamplingInterval();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult#getRevisedSamplingInterval <em>Revised Sampling Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revised Sampling Interval</em>' attribute is set.
	 * @see #unsetRevisedSamplingInterval()
	 * @see #getRevisedSamplingInterval()
	 * @see #setRevisedSamplingInterval(double)
	 * @generated
	 */
	boolean isSetRevisedSamplingInterval();

	/**
	 * Returns the value of the '<em><b>Revised Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revised Queue Size</em>' attribute.
	 * @see #isSetRevisedQueueSize()
	 * @see #unsetRevisedQueueSize()
	 * @see #setRevisedQueueSize(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoredItemCreateResult_RevisedQueueSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RevisedQueueSize' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRevisedQueueSize();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult#getRevisedQueueSize <em>Revised Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revised Queue Size</em>' attribute.
	 * @see #isSetRevisedQueueSize()
	 * @see #unsetRevisedQueueSize()
	 * @see #getRevisedQueueSize()
	 * @generated
	 */
	void setRevisedQueueSize(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult#getRevisedQueueSize <em>Revised Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisedQueueSize()
	 * @see #getRevisedQueueSize()
	 * @see #setRevisedQueueSize(long)
	 * @generated
	 */
	void unsetRevisedQueueSize();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult#getRevisedQueueSize <em>Revised Queue Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revised Queue Size</em>' attribute is set.
	 * @see #unsetRevisedQueueSize()
	 * @see #getRevisedQueueSize()
	 * @see #setRevisedQueueSize(long)
	 * @generated
	 */
	boolean isSetRevisedQueueSize();

	/**
	 * Returns the value of the '<em><b>Filter Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Result</em>' containment reference.
	 * @see #isSetFilterResult()
	 * @see #unsetFilterResult()
	 * @see #setFilterResult(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoredItemCreateResult_FilterResult()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='FilterResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getFilterResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult#getFilterResult <em>Filter Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Result</em>' containment reference.
	 * @see #isSetFilterResult()
	 * @see #unsetFilterResult()
	 * @see #getFilterResult()
	 * @generated
	 */
	void setFilterResult(ExtensionObject value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult#getFilterResult <em>Filter Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilterResult()
	 * @see #getFilterResult()
	 * @see #setFilterResult(ExtensionObject)
	 * @generated
	 */
	void unsetFilterResult();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult#getFilterResult <em>Filter Result</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter Result</em>' containment reference is set.
	 * @see #unsetFilterResult()
	 * @see #getFilterResult()
	 * @see #setFilterResult(ExtensionObject)
	 * @generated
	 */
	boolean isSetFilterResult();

} // MonitoredItemCreateResult
