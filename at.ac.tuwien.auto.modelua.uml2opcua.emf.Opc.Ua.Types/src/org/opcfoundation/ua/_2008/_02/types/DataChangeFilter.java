/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Change Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataChangeFilter#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataChangeFilter#getDeadbandType <em>Deadband Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataChangeFilter#getDeadbandValue <em>Deadband Value</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataChangeFilter()
 * @model extendedMetaData="name='DataChangeFilter' kind='elementOnly'"
 * @generated
 */
public interface DataChangeFilter extends MonitoringFilter {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.DataChangeTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.DataChangeTrigger
	 * @see #isSetTrigger()
	 * @see #unsetTrigger()
	 * @see #setTrigger(DataChangeTrigger)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataChangeFilter_Trigger()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Trigger' namespace='##targetNamespace'"
	 * @generated
	 */
	DataChangeTrigger getTrigger();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataChangeFilter#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.DataChangeTrigger
	 * @see #isSetTrigger()
	 * @see #unsetTrigger()
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(DataChangeTrigger value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataChangeFilter#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrigger()
	 * @see #getTrigger()
	 * @see #setTrigger(DataChangeTrigger)
	 * @generated
	 */
	void unsetTrigger();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataChangeFilter#getTrigger <em>Trigger</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trigger</em>' attribute is set.
	 * @see #unsetTrigger()
	 * @see #getTrigger()
	 * @see #setTrigger(DataChangeTrigger)
	 * @generated
	 */
	boolean isSetTrigger();

	/**
	 * Returns the value of the '<em><b>Deadband Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadband Type</em>' attribute.
	 * @see #isSetDeadbandType()
	 * @see #unsetDeadbandType()
	 * @see #setDeadbandType(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataChangeFilter_DeadbandType()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='DeadbandType' namespace='##targetNamespace'"
	 * @generated
	 */
	long getDeadbandType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataChangeFilter#getDeadbandType <em>Deadband Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadband Type</em>' attribute.
	 * @see #isSetDeadbandType()
	 * @see #unsetDeadbandType()
	 * @see #getDeadbandType()
	 * @generated
	 */
	void setDeadbandType(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataChangeFilter#getDeadbandType <em>Deadband Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeadbandType()
	 * @see #getDeadbandType()
	 * @see #setDeadbandType(long)
	 * @generated
	 */
	void unsetDeadbandType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataChangeFilter#getDeadbandType <em>Deadband Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deadband Type</em>' attribute is set.
	 * @see #unsetDeadbandType()
	 * @see #getDeadbandType()
	 * @see #setDeadbandType(long)
	 * @generated
	 */
	boolean isSetDeadbandType();

	/**
	 * Returns the value of the '<em><b>Deadband Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadband Value</em>' attribute.
	 * @see #isSetDeadbandValue()
	 * @see #unsetDeadbandValue()
	 * @see #setDeadbandValue(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataChangeFilter_DeadbandValue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='DeadbandValue' namespace='##targetNamespace'"
	 * @generated
	 */
	double getDeadbandValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataChangeFilter#getDeadbandValue <em>Deadband Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadband Value</em>' attribute.
	 * @see #isSetDeadbandValue()
	 * @see #unsetDeadbandValue()
	 * @see #getDeadbandValue()
	 * @generated
	 */
	void setDeadbandValue(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataChangeFilter#getDeadbandValue <em>Deadband Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeadbandValue()
	 * @see #getDeadbandValue()
	 * @see #setDeadbandValue(double)
	 * @generated
	 */
	void unsetDeadbandValue();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataChangeFilter#getDeadbandValue <em>Deadband Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deadband Value</em>' attribute is set.
	 * @see #unsetDeadbandValue()
	 * @see #getDeadbandValue()
	 * @see #setDeadbandValue(double)
	 * @generated
	 */
	boolean isSetDeadbandValue();

} // DataChangeFilter
