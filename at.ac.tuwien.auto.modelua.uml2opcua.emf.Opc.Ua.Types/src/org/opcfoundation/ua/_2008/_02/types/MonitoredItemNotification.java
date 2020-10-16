/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitored Item Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MonitoredItemNotification#getClientHandle <em>Client Handle</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.MonitoredItemNotification#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoredItemNotification()
 * @model extendedMetaData="name='MonitoredItemNotification' kind='elementOnly'"
 * @generated
 */
public interface MonitoredItemNotification extends EObject {
	/**
	 * Returns the value of the '<em><b>Client Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Handle</em>' attribute.
	 * @see #isSetClientHandle()
	 * @see #unsetClientHandle()
	 * @see #setClientHandle(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoredItemNotification_ClientHandle()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='ClientHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	long getClientHandle();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemNotification#getClientHandle <em>Client Handle</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemNotification#getClientHandle <em>Client Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientHandle()
	 * @see #getClientHandle()
	 * @see #setClientHandle(long)
	 * @generated
	 */
	void unsetClientHandle();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemNotification#getClientHandle <em>Client Handle</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(DataValue)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getMonitoredItemNotification_Value()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	DataValue getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemNotification#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DataValue value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemNotification#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(DataValue)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.MonitoredItemNotification#getValue <em>Value</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' containment reference is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(DataValue)
	 * @generated
	 */
	boolean isSetValue();

} // MonitoredItemNotification
