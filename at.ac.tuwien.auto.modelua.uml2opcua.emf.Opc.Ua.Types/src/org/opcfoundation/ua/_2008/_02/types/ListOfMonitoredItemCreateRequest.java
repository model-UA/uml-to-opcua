/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Monitored Item Create Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemCreateRequest#getMonitoredItemCreateRequest <em>Monitored Item Create Request</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfMonitoredItemCreateRequest()
 * @model extendedMetaData="name='ListOfMonitoredItemCreateRequest' kind='elementOnly'"
 * @generated
 */
public interface ListOfMonitoredItemCreateRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Monitored Item Create Request</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Item Create Request</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfMonitoredItemCreateRequest_MonitoredItemCreateRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MonitoredItemCreateRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MonitoredItemCreateRequest> getMonitoredItemCreateRequest();

} // ListOfMonitoredItemCreateRequest
