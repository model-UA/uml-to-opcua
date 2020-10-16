/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.HistoryData#getDataValues <em>Data Values</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryData()
 * @model extendedMetaData="name='HistoryData' kind='elementOnly'"
 * @generated
 */
public interface HistoryData extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Values</em>' containment reference.
	 * @see #isSetDataValues()
	 * @see #unsetDataValues()
	 * @see #setDataValues(ListOfDataValue)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getHistoryData_DataValues()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataValues' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDataValue getDataValues();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryData#getDataValues <em>Data Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Values</em>' containment reference.
	 * @see #isSetDataValues()
	 * @see #unsetDataValues()
	 * @see #getDataValues()
	 * @generated
	 */
	void setDataValues(ListOfDataValue value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryData#getDataValues <em>Data Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataValues()
	 * @see #getDataValues()
	 * @see #setDataValues(ListOfDataValue)
	 * @generated
	 */
	void unsetDataValues();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.HistoryData#getDataValues <em>Data Values</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Values</em>' containment reference is set.
	 * @see #unsetDataValues()
	 * @see #getDataValues()
	 * @see #setDataValues(ListOfDataValue)
	 * @generated
	 */
	boolean isSetDataValues();

} // HistoryData
