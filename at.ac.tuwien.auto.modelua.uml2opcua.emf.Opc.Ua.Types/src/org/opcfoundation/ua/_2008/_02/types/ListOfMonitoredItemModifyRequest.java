/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Monitored Item Modify Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemModifyRequest#getMonitoredItemModifyRequest <em>Monitored Item Modify Request</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfMonitoredItemModifyRequest()
 * @model extendedMetaData="name='ListOfMonitoredItemModifyRequest' kind='elementOnly'"
 * @generated
 */
public interface ListOfMonitoredItemModifyRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Monitored Item Modify Request</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.MonitoredItemModifyRequest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Item Modify Request</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfMonitoredItemModifyRequest_MonitoredItemModifyRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MonitoredItemModifyRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MonitoredItemModifyRequest> getMonitoredItemModifyRequest();

} // ListOfMonitoredItemModifyRequest
