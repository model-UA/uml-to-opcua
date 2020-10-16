/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Monitored Item Create Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemCreateResult#getMonitoredItemCreateResult <em>Monitored Item Create Result</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfMonitoredItemCreateResult()
 * @model extendedMetaData="name='ListOfMonitoredItemCreateResult' kind='elementOnly'"
 * @generated
 */
public interface ListOfMonitoredItemCreateResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Monitored Item Create Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Item Create Result</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfMonitoredItemCreateResult_MonitoredItemCreateResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MonitoredItemCreateResult' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MonitoredItemCreateResult> getMonitoredItemCreateResult();

} // ListOfMonitoredItemCreateResult
