/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Modified Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryModifiedData#getModificationInfos <em>Modification Infos</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryModifiedData()
 * @model extendedMetaData="name='HistoryModifiedData' kind='elementOnly'"
 * @generated
 */
public interface HistoryModifiedData extends HistoryData {
	/**
	 * Returns the value of the '<em><b>Modification Infos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification Infos</em>' containment reference.
	 * @see #isSetModificationInfos()
	 * @see #unsetModificationInfos()
	 * @see #setModificationInfos(ListOfModificationInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryModifiedData_ModificationInfos()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ModificationInfos' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfModificationInfo getModificationInfos();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryModifiedData#getModificationInfos <em>Modification Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification Infos</em>' containment reference.
	 * @see #isSetModificationInfos()
	 * @see #unsetModificationInfos()
	 * @see #getModificationInfos()
	 * @generated
	 */
	void setModificationInfos(ListOfModificationInfo value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryModifiedData#getModificationInfos <em>Modification Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModificationInfos()
	 * @see #getModificationInfos()
	 * @see #setModificationInfos(ListOfModificationInfo)
	 * @generated
	 */
	void unsetModificationInfos();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryModifiedData#getModificationInfos <em>Modification Infos</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modification Infos</em>' containment reference is set.
	 * @see #unsetModificationInfos()
	 * @see #getModificationInfos()
	 * @see #setModificationInfos(ListOfModificationInfo)
	 * @generated
	 */
	boolean isSetModificationInfos();

} // HistoryModifiedData
