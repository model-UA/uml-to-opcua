/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitored Item Modify Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MonitoredItemModifyRequest#getMonitoredItemId <em>Monitored Item Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MonitoredItemModifyRequest#getRequestedParameters <em>Requested Parameters</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoredItemModifyRequest()
 * @model extendedMetaData="name='MonitoredItemModifyRequest' kind='elementOnly'"
 * @generated
 */
public interface MonitoredItemModifyRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Monitored Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Item Id</em>' attribute.
	 * @see #isSetMonitoredItemId()
	 * @see #unsetMonitoredItemId()
	 * @see #setMonitoredItemId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoredItemModifyRequest_MonitoredItemId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MonitoredItemId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMonitoredItemId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemModifyRequest#getMonitoredItemId <em>Monitored Item Id</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemModifyRequest#getMonitoredItemId <em>Monitored Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonitoredItemId()
	 * @see #getMonitoredItemId()
	 * @see #setMonitoredItemId(long)
	 * @generated
	 */
	void unsetMonitoredItemId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemModifyRequest#getMonitoredItemId <em>Monitored Item Id</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Requested Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Parameters</em>' containment reference.
	 * @see #isSetRequestedParameters()
	 * @see #unsetRequestedParameters()
	 * @see #setRequestedParameters(MonitoringParameters)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoredItemModifyRequest_RequestedParameters()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestedParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	MonitoringParameters getRequestedParameters();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemModifyRequest#getRequestedParameters <em>Requested Parameters</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemModifyRequest#getRequestedParameters <em>Requested Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestedParameters()
	 * @see #getRequestedParameters()
	 * @see #setRequestedParameters(MonitoringParameters)
	 * @generated
	 */
	void unsetRequestedParameters();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemModifyRequest#getRequestedParameters <em>Requested Parameters</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Requested Parameters</em>' containment reference is set.
	 * @see #unsetRequestedParameters()
	 * @see #getRequestedParameters()
	 * @see #setRequestedParameters(MonitoringParameters)
	 * @generated
	 */
	boolean isSetRequestedParameters();

} // MonitoredItemModifyRequest
