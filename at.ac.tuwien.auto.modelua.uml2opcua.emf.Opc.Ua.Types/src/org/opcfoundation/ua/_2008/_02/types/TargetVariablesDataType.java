/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Variables Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.TargetVariablesDataType#getTargetVariables <em>Target Variables</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTargetVariablesDataType()
 * @model extendedMetaData="name='TargetVariablesDataType' kind='elementOnly'"
 * @generated
 */
public interface TargetVariablesDataType extends SubscribedDataSetDataType {
	/**
	 * Returns the value of the '<em><b>Target Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Variables</em>' containment reference.
	 * @see #isSetTargetVariables()
	 * @see #unsetTargetVariables()
	 * @see #setTargetVariables(ListOfFieldTargetDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getTargetVariablesDataType_TargetVariables()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TargetVariables' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfFieldTargetDataType getTargetVariables();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.TargetVariablesDataType#getTargetVariables <em>Target Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Variables</em>' containment reference.
	 * @see #isSetTargetVariables()
	 * @see #unsetTargetVariables()
	 * @see #getTargetVariables()
	 * @generated
	 */
	void setTargetVariables(ListOfFieldTargetDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.TargetVariablesDataType#getTargetVariables <em>Target Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetVariables()
	 * @see #getTargetVariables()
	 * @see #setTargetVariables(ListOfFieldTargetDataType)
	 * @generated
	 */
	void unsetTargetVariables();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.TargetVariablesDataType#getTargetVariables <em>Target Variables</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Variables</em>' containment reference is set.
	 * @see #unsetTargetVariables()
	 * @see #getTargetVariables()
	 * @see #setTargetVariables(ListOfFieldTargetDataType)
	 * @generated
	 */
	boolean isSetTargetVariables();

} // TargetVariablesDataType
