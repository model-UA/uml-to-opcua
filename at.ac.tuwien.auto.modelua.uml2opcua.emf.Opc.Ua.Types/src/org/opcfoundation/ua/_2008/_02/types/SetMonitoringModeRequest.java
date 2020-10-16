/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Monitoring Mode Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest#getMonitoringMode <em>Monitoring Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest#getMonitoredItemIds <em>Monitored Item Ids</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetMonitoringModeRequest()
 * @model extendedMetaData="name='SetMonitoringModeRequest' kind='elementOnly'"
 * @generated
 */
public interface SetMonitoringModeRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetMonitoringModeRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #getRequestHeader()
	 * @generated
	 */
	void setRequestHeader(RequestHeader value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Request Header</em>' containment reference is set.
	 * @see #unsetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	boolean isSetRequestHeader();

	/**
	 * Returns the value of the '<em><b>Subscription Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Id</em>' attribute.
	 * @see #isSetSubscriptionId()
	 * @see #unsetSubscriptionId()
	 * @see #setSubscriptionId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetMonitoringModeRequest_SubscriptionId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='SubscriptionId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getSubscriptionId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest#getSubscriptionId <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Id</em>' attribute.
	 * @see #isSetSubscriptionId()
	 * @see #unsetSubscriptionId()
	 * @see #getSubscriptionId()
	 * @generated
	 */
	void setSubscriptionId(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest#getSubscriptionId <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubscriptionId()
	 * @see #getSubscriptionId()
	 * @see #setSubscriptionId(long)
	 * @generated
	 */
	void unsetSubscriptionId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest#getSubscriptionId <em>Subscription Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Subscription Id</em>' attribute is set.
	 * @see #unsetSubscriptionId()
	 * @see #getSubscriptionId()
	 * @see #setSubscriptionId(long)
	 * @generated
	 */
	boolean isSetSubscriptionId();

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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetMonitoringModeRequest_MonitoringMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MonitoringMode' namespace='##targetNamespace'"
	 * @generated
	 */
	MonitoringMode getMonitoringMode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest#getMonitoringMode <em>Monitoring Mode</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest#getMonitoringMode <em>Monitoring Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonitoringMode()
	 * @see #getMonitoringMode()
	 * @see #setMonitoringMode(MonitoringMode)
	 * @generated
	 */
	void unsetMonitoringMode();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest#getMonitoringMode <em>Monitoring Mode</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Monitored Item Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Item Ids</em>' containment reference.
	 * @see #isSetMonitoredItemIds()
	 * @see #unsetMonitoredItemIds()
	 * @see #setMonitoredItemIds(ListOfUInt32)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetMonitoringModeRequest_MonitoredItemIds()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='MonitoredItemIds' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUInt32 getMonitoredItemIds();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest#getMonitoredItemIds <em>Monitored Item Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored Item Ids</em>' containment reference.
	 * @see #isSetMonitoredItemIds()
	 * @see #unsetMonitoredItemIds()
	 * @see #getMonitoredItemIds()
	 * @generated
	 */
	void setMonitoredItemIds(ListOfUInt32 value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest#getMonitoredItemIds <em>Monitored Item Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonitoredItemIds()
	 * @see #getMonitoredItemIds()
	 * @see #setMonitoredItemIds(ListOfUInt32)
	 * @generated
	 */
	void unsetMonitoredItemIds();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest#getMonitoredItemIds <em>Monitored Item Ids</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Monitored Item Ids</em>' containment reference is set.
	 * @see #unsetMonitoredItemIds()
	 * @see #getMonitoredItemIds()
	 * @see #setMonitoredItemIds(ListOfUInt32)
	 * @generated
	 */
	boolean isSetMonitoredItemIds();

} // SetMonitoringModeRequest
