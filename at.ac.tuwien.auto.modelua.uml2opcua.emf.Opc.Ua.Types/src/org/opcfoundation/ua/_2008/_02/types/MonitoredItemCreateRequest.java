/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitored Item Create Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest#getItemToMonitor <em>Item To Monitor</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest#getMonitoringMode <em>Monitoring Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest#getRequestedParameters <em>Requested Parameters</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoredItemCreateRequest()
 * @model extendedMetaData="name='MonitoredItemCreateRequest' kind='elementOnly'"
 * @generated
 */
public interface MonitoredItemCreateRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Item To Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item To Monitor</em>' containment reference.
	 * @see #isSetItemToMonitor()
	 * @see #unsetItemToMonitor()
	 * @see #setItemToMonitor(ReadValueId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoredItemCreateRequest_ItemToMonitor()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ItemToMonitor' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadValueId getItemToMonitor();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest#getItemToMonitor <em>Item To Monitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item To Monitor</em>' containment reference.
	 * @see #isSetItemToMonitor()
	 * @see #unsetItemToMonitor()
	 * @see #getItemToMonitor()
	 * @generated
	 */
	void setItemToMonitor(ReadValueId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest#getItemToMonitor <em>Item To Monitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetItemToMonitor()
	 * @see #getItemToMonitor()
	 * @see #setItemToMonitor(ReadValueId)
	 * @generated
	 */
	void unsetItemToMonitor();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest#getItemToMonitor <em>Item To Monitor</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Item To Monitor</em>' containment reference is set.
	 * @see #unsetItemToMonitor()
	 * @see #getItemToMonitor()
	 * @see #setItemToMonitor(ReadValueId)
	 * @generated
	 */
	boolean isSetItemToMonitor();

	/**
	 * Returns the value of the '<em><b>Monitoring Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.MonitoringMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring Mode</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.MonitoringMode
	 * @see #isSetMonitoringMode()
	 * @see #unsetMonitoringMode()
	 * @see #setMonitoringMode(MonitoringMode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoredItemCreateRequest_MonitoringMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MonitoringMode' namespace='##targetNamespace'"
	 * @generated
	 */
	MonitoringMode getMonitoringMode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest#getMonitoringMode <em>Monitoring Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring Mode</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.MonitoringMode
	 * @see #isSetMonitoringMode()
	 * @see #unsetMonitoringMode()
	 * @see #getMonitoringMode()
	 * @generated
	 */
	void setMonitoringMode(MonitoringMode value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest#getMonitoringMode <em>Monitoring Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonitoringMode()
	 * @see #getMonitoringMode()
	 * @see #setMonitoringMode(MonitoringMode)
	 * @generated
	 */
	void unsetMonitoringMode();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest#getMonitoringMode <em>Monitoring Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Monitoring Mode</em>' attribute is set.
	 * @see #unsetMonitoringMode()
	 * @see #getMonitoringMode()
	 * @see #setMonitoringMode(MonitoringMode)
	 * @generated
	 */
	boolean isSetMonitoringMode();

	/**
	 * Returns the value of the '<em><b>Requested Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Parameters</em>' containment reference.
	 * @see #isSetRequestedParameters()
	 * @see #unsetRequestedParameters()
	 * @see #setRequestedParameters(MonitoringParameters)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoredItemCreateRequest_RequestedParameters()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestedParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	MonitoringParameters getRequestedParameters();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest#getRequestedParameters <em>Requested Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Parameters</em>' containment reference.
	 * @see #isSetRequestedParameters()
	 * @see #unsetRequestedParameters()
	 * @see #getRequestedParameters()
	 * @generated
	 */
	void setRequestedParameters(MonitoringParameters value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest#getRequestedParameters <em>Requested Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestedParameters()
	 * @see #getRequestedParameters()
	 * @see #setRequestedParameters(MonitoringParameters)
	 * @generated
	 */
	void unsetRequestedParameters();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest#getRequestedParameters <em>Requested Parameters</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Requested Parameters</em>' containment reference is set.
	 * @see #unsetRequestedParameters()
	 * @see #getRequestedParameters()
	 * @see #setRequestedParameters(MonitoringParameters)
	 * @generated
	 */
	boolean isSetRequestedParameters();

} // MonitoredItemCreateRequest
