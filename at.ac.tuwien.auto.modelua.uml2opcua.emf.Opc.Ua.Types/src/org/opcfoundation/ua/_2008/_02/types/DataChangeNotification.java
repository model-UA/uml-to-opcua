/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Change Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataChangeNotification#getMonitoredItems <em>Monitored Items</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataChangeNotification#getDiagnosticInfos <em>Diagnostic Infos</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataChangeNotification()
 * @model extendedMetaData="name='DataChangeNotification' kind='elementOnly'"
 * @generated
 */
public interface DataChangeNotification extends NotificationData {
	/**
	 * Returns the value of the '<em><b>Monitored Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Items</em>' containment reference.
	 * @see #isSetMonitoredItems()
	 * @see #unsetMonitoredItems()
	 * @see #setMonitoredItems(ListOfMonitoredItemNotification)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataChangeNotification_MonitoredItems()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='MonitoredItems' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfMonitoredItemNotification getMonitoredItems();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataChangeNotification#getMonitoredItems <em>Monitored Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored Items</em>' containment reference.
	 * @see #isSetMonitoredItems()
	 * @see #unsetMonitoredItems()
	 * @see #getMonitoredItems()
	 * @generated
	 */
	void setMonitoredItems(ListOfMonitoredItemNotification value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataChangeNotification#getMonitoredItems <em>Monitored Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonitoredItems()
	 * @see #getMonitoredItems()
	 * @see #setMonitoredItems(ListOfMonitoredItemNotification)
	 * @generated
	 */
	void unsetMonitoredItems();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataChangeNotification#getMonitoredItems <em>Monitored Items</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Monitored Items</em>' containment reference is set.
	 * @see #unsetMonitoredItems()
	 * @see #getMonitoredItems()
	 * @see #setMonitoredItems(ListOfMonitoredItemNotification)
	 * @generated
	 */
	boolean isSetMonitoredItems();

	/**
	 * Returns the value of the '<em><b>Diagnostic Infos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostic Infos</em>' containment reference.
	 * @see #isSetDiagnosticInfos()
	 * @see #unsetDiagnosticInfos()
	 * @see #setDiagnosticInfos(ListOfDiagnosticInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataChangeNotification_DiagnosticInfos()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DiagnosticInfos' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDiagnosticInfo getDiagnosticInfos();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataChangeNotification#getDiagnosticInfos <em>Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Infos</em>' containment reference.
	 * @see #isSetDiagnosticInfos()
	 * @see #unsetDiagnosticInfos()
	 * @see #getDiagnosticInfos()
	 * @generated
	 */
	void setDiagnosticInfos(ListOfDiagnosticInfo value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataChangeNotification#getDiagnosticInfos <em>Diagnostic Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiagnosticInfos()
	 * @see #getDiagnosticInfos()
	 * @see #setDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	void unsetDiagnosticInfos();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataChangeNotification#getDiagnosticInfos <em>Diagnostic Infos</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diagnostic Infos</em>' containment reference is set.
	 * @see #unsetDiagnosticInfos()
	 * @see #getDiagnosticInfos()
	 * @see #setDiagnosticInfos(ListOfDiagnosticInfo)
	 * @generated
	 */
	boolean isSetDiagnosticInfos();

} // DataChangeNotification
