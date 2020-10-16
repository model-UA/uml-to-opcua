/**
 */
package org.opcfoundation.ua._2008._02.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.VariableNode#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.VariableNode#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.VariableNode#getValueRank <em>Value Rank</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.VariableNode#getArrayDimensions <em>Array Dimensions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.VariableNode#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.VariableNode#getUserAccessLevel <em>User Access Level</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.VariableNode#getMinimumSamplingInterval <em>Minimum Sampling Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.VariableNode#isHistorizing <em>Historizing</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.VariableNode#getAccessLevelEx <em>Access Level Ex</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getVariableNode()
 * @model extendedMetaData="name='VariableNode' kind='elementOnly'"
 * @generated
 */
public interface VariableNode extends InstanceNode {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Variant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getVariableNode_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	Variant getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Variant value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #setDataType(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getVariableNode_DataType()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataType' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataType()
	 * @see #getDataType()
	 * @see #setDataType(NodeId)
	 * @generated
	 */
	void unsetDataType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getDataType <em>Data Type</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Type</em>' containment reference is set.
	 * @see #unsetDataType()
	 * @see #getDataType()
	 * @see #setDataType(NodeId)
	 * @generated
	 */
	boolean isSetDataType();

	/**
	 * Returns the value of the '<em><b>Value Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Rank</em>' attribute.
	 * @see #isSetValueRank()
	 * @see #unsetValueRank()
	 * @see #setValueRank(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getVariableNode_ValueRank()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='ValueRank' namespace='##targetNamespace'"
	 * @generated
	 */
	int getValueRank();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getValueRank <em>Value Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Rank</em>' attribute.
	 * @see #isSetValueRank()
	 * @see #unsetValueRank()
	 * @see #getValueRank()
	 * @generated
	 */
	void setValueRank(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getValueRank <em>Value Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValueRank()
	 * @see #getValueRank()
	 * @see #setValueRank(int)
	 * @generated
	 */
	void unsetValueRank();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getValueRank <em>Value Rank</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value Rank</em>' attribute is set.
	 * @see #unsetValueRank()
	 * @see #getValueRank()
	 * @see #setValueRank(int)
	 * @generated
	 */
	boolean isSetValueRank();

	/**
	 * Returns the value of the '<em><b>Array Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Dimensions</em>' containment reference.
	 * @see #isSetArrayDimensions()
	 * @see #unsetArrayDimensions()
	 * @see #setArrayDimensions(ListOfUInt32)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getVariableNode_ArrayDimensions()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ArrayDimensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUInt32 getArrayDimensions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getArrayDimensions <em>Array Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Dimensions</em>' containment reference.
	 * @see #isSetArrayDimensions()
	 * @see #unsetArrayDimensions()
	 * @see #getArrayDimensions()
	 * @generated
	 */
	void setArrayDimensions(ListOfUInt32 value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getArrayDimensions <em>Array Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArrayDimensions()
	 * @see #getArrayDimensions()
	 * @see #setArrayDimensions(ListOfUInt32)
	 * @generated
	 */
	void unsetArrayDimensions();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getArrayDimensions <em>Array Dimensions</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Array Dimensions</em>' containment reference is set.
	 * @see #unsetArrayDimensions()
	 * @see #getArrayDimensions()
	 * @see #setArrayDimensions(ListOfUInt32)
	 * @generated
	 */
	boolean isSetArrayDimensions();

	/**
	 * Returns the value of the '<em><b>Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Level</em>' attribute.
	 * @see #isSetAccessLevel()
	 * @see #unsetAccessLevel()
	 * @see #setAccessLevel(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getVariableNode_AccessLevel()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='element' name='AccessLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	short getAccessLevel();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getAccessLevel <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Level</em>' attribute.
	 * @see #isSetAccessLevel()
	 * @see #unsetAccessLevel()
	 * @see #getAccessLevel()
	 * @generated
	 */
	void setAccessLevel(short value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getAccessLevel <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccessLevel()
	 * @see #getAccessLevel()
	 * @see #setAccessLevel(short)
	 * @generated
	 */
	void unsetAccessLevel();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getAccessLevel <em>Access Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Access Level</em>' attribute is set.
	 * @see #unsetAccessLevel()
	 * @see #getAccessLevel()
	 * @see #setAccessLevel(short)
	 * @generated
	 */
	boolean isSetAccessLevel();

	/**
	 * Returns the value of the '<em><b>User Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Access Level</em>' attribute.
	 * @see #isSetUserAccessLevel()
	 * @see #unsetUserAccessLevel()
	 * @see #setUserAccessLevel(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getVariableNode_UserAccessLevel()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='element' name='UserAccessLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	short getUserAccessLevel();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getUserAccessLevel <em>User Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Access Level</em>' attribute.
	 * @see #isSetUserAccessLevel()
	 * @see #unsetUserAccessLevel()
	 * @see #getUserAccessLevel()
	 * @generated
	 */
	void setUserAccessLevel(short value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getUserAccessLevel <em>User Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserAccessLevel()
	 * @see #getUserAccessLevel()
	 * @see #setUserAccessLevel(short)
	 * @generated
	 */
	void unsetUserAccessLevel();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getUserAccessLevel <em>User Access Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Access Level</em>' attribute is set.
	 * @see #unsetUserAccessLevel()
	 * @see #getUserAccessLevel()
	 * @see #setUserAccessLevel(short)
	 * @generated
	 */
	boolean isSetUserAccessLevel();

	/**
	 * Returns the value of the '<em><b>Minimum Sampling Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Sampling Interval</em>' attribute.
	 * @see #isSetMinimumSamplingInterval()
	 * @see #unsetMinimumSamplingInterval()
	 * @see #setMinimumSamplingInterval(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getVariableNode_MinimumSamplingInterval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='MinimumSamplingInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinimumSamplingInterval();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getMinimumSamplingInterval <em>Minimum Sampling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Sampling Interval</em>' attribute.
	 * @see #isSetMinimumSamplingInterval()
	 * @see #unsetMinimumSamplingInterval()
	 * @see #getMinimumSamplingInterval()
	 * @generated
	 */
	void setMinimumSamplingInterval(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getMinimumSamplingInterval <em>Minimum Sampling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumSamplingInterval()
	 * @see #getMinimumSamplingInterval()
	 * @see #setMinimumSamplingInterval(double)
	 * @generated
	 */
	void unsetMinimumSamplingInterval();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getMinimumSamplingInterval <em>Minimum Sampling Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Sampling Interval</em>' attribute is set.
	 * @see #unsetMinimumSamplingInterval()
	 * @see #getMinimumSamplingInterval()
	 * @see #setMinimumSamplingInterval(double)
	 * @generated
	 */
	boolean isSetMinimumSamplingInterval();

	/**
	 * Returns the value of the '<em><b>Historizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Historizing</em>' attribute.
	 * @see #isSetHistorizing()
	 * @see #unsetHistorizing()
	 * @see #setHistorizing(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getVariableNode_Historizing()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Historizing' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHistorizing();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#isHistorizing <em>Historizing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Historizing</em>' attribute.
	 * @see #isSetHistorizing()
	 * @see #unsetHistorizing()
	 * @see #isHistorizing()
	 * @generated
	 */
	void setHistorizing(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#isHistorizing <em>Historizing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHistorizing()
	 * @see #isHistorizing()
	 * @see #setHistorizing(boolean)
	 * @generated
	 */
	void unsetHistorizing();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#isHistorizing <em>Historizing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Historizing</em>' attribute is set.
	 * @see #unsetHistorizing()
	 * @see #isHistorizing()
	 * @see #setHistorizing(boolean)
	 * @generated
	 */
	boolean isSetHistorizing();

	/**
	 * Returns the value of the '<em><b>Access Level Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Level Ex</em>' attribute.
	 * @see #isSetAccessLevelEx()
	 * @see #unsetAccessLevelEx()
	 * @see #setAccessLevelEx(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getVariableNode_AccessLevelEx()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='AccessLevelEx' namespace='##targetNamespace'"
	 * @generated
	 */
	long getAccessLevelEx();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getAccessLevelEx <em>Access Level Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Level Ex</em>' attribute.
	 * @see #isSetAccessLevelEx()
	 * @see #unsetAccessLevelEx()
	 * @see #getAccessLevelEx()
	 * @generated
	 */
	void setAccessLevelEx(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getAccessLevelEx <em>Access Level Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccessLevelEx()
	 * @see #getAccessLevelEx()
	 * @see #setAccessLevelEx(long)
	 * @generated
	 */
	void unsetAccessLevelEx();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.VariableNode#getAccessLevelEx <em>Access Level Ex</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Access Level Ex</em>' attribute is set.
	 * @see #unsetAccessLevelEx()
	 * @see #getAccessLevelEx()
	 * @see #setAccessLevelEx(long)
	 * @generated
	 */
	boolean isSetAccessLevelEx();

} // VariableNode
