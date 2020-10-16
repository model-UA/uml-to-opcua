/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Monitored Item Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemNotification#getMonitoredItemNotification <em>Monitored Item Notification</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfMonitoredItemNotification()
 * @model extendedMetaData="name='ListOfMonitoredItemNotification' kind='elementOnly'"
 * @generated
 */
public interface ListOfMonitoredItemNotification extends EObject {
	/**
	 * Returns the value of the '<em><b>Monitored Item Notification</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.MonitoredItemNotification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Item Notification</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfMonitoredItemNotification_MonitoredItemNotification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MonitoredItemNotification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MonitoredItemNotification> getMonitoredItemNotification();

} // ListOfMonitoredItemNotification
