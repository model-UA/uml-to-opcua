/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Monitored Item Modify Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemModifyResult#getMonitoredItemModifyResult <em>Monitored Item Modify Result</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfMonitoredItemModifyResult()
 * @model extendedMetaData="name='ListOfMonitoredItemModifyResult' kind='elementOnly'"
 * @generated
 */
public interface ListOfMonitoredItemModifyResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Monitored Item Modify Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.MonitoredItemModifyResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Item Modify Result</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfMonitoredItemModifyResult_MonitoredItemModifyResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MonitoredItemModifyResult' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MonitoredItemModifyResult> getMonitoredItemModifyResult();

} // ListOfMonitoredItemModifyResult
