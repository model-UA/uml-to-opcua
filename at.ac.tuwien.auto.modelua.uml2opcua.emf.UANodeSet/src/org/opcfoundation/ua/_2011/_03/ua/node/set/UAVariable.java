/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getTranslation <em>Translation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getArrayDimensions <em>Array Dimensions</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#isHistorizing <em>Historizing</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getMinimumSamplingInterval <em>Minimum Sampling Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getUserAccessLevel <em>User Access Level</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getValueRank <em>Value Rank</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAVariable()
 * @model extendedMetaData="name='UAVariable' kind='elementOnly'"
 * @generated
 */
public interface UAVariable extends UAInstance {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueType1)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAVariable_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueType1 getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueType1 value);

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2011._03.ua.node.set.TranslationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference list.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAVariable_Translation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TranslationType> getTranslation();

	/**
	 * Returns the value of the '<em><b>Access Level</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Level</em>' attribute.
	 * @see #isSetAccessLevel()
	 * @see #unsetAccessLevel()
	 * @see #setAccessLevel(long)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAVariable_AccessLevel()
	 * @model default="1" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.AccessLevel"
	 *        extendedMetaData="kind='attribute' name='AccessLevel'"
	 * @generated
	 */
	long getAccessLevel();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getAccessLevel <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Level</em>' attribute.
	 * @see #isSetAccessLevel()
	 * @see #unsetAccessLevel()
	 * @see #getAccessLevel()
	 * @generated
	 */
	void setAccessLevel(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getAccessLevel <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccessLevel()
	 * @see #getAccessLevel()
	 * @see #setAccessLevel(long)
	 * @generated
	 */
	void unsetAccessLevel();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getAccessLevel <em>Access Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Access Level</em>' attribute is set.
	 * @see #unsetAccessLevel()
	 * @see #getAccessLevel()
	 * @see #setAccessLevel(long)
	 * @generated
	 */
	boolean isSetAccessLevel();

	/**
	 * Returns the value of the '<em><b>Array Dimensions</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Dimensions</em>' attribute.
	 * @see #isSetArrayDimensions()
	 * @see #unsetArrayDimensions()
	 * @see #setArrayDimensions(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAVariable_ArrayDimensions()
	 * @model default="" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.ArrayDimensions"
	 *        extendedMetaData="kind='attribute' name='ArrayDimensions'"
	 * @generated
	 */
	String getArrayDimensions();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getArrayDimensions <em>Array Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Dimensions</em>' attribute.
	 * @see #isSetArrayDimensions()
	 * @see #unsetArrayDimensions()
	 * @see #getArrayDimensions()
	 * @generated
	 */
	void setArrayDimensions(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getArrayDimensions <em>Array Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArrayDimensions()
	 * @see #getArrayDimensions()
	 * @see #setArrayDimensions(String)
	 * @generated
	 */
	void unsetArrayDimensions();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getArrayDimensions <em>Array Dimensions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Array Dimensions</em>' attribute is set.
	 * @see #unsetArrayDimensions()
	 * @see #getArrayDimensions()
	 * @see #setArrayDimensions(String)
	 * @generated
	 */
	boolean isSetArrayDimensions();

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The default value is <code>"i=24"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #setDataType(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAVariable_DataType()
	 * @model default="i=24" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.NodeId"
	 *        extendedMetaData="kind='attribute' name='DataType'"
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataType()
	 * @see #getDataType()
	 * @see #setDataType(String)
	 * @generated
	 */
	void unsetDataType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getDataType <em>Data Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Type</em>' attribute is set.
	 * @see #unsetDataType()
	 * @see #getDataType()
	 * @see #setDataType(String)
	 * @generated
	 */
	boolean isSetDataType();

	/**
	 * Returns the value of the '<em><b>Historizing</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Historizing</em>' attribute.
	 * @see #isSetHistorizing()
	 * @see #unsetHistorizing()
	 * @see #setHistorizing(boolean)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAVariable_Historizing()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Historizing'"
	 * @generated
	 */
	boolean isHistorizing();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#isHistorizing <em>Historizing</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#isHistorizing <em>Historizing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHistorizing()
	 * @see #isHistorizing()
	 * @see #setHistorizing(boolean)
	 * @generated
	 */
	void unsetHistorizing();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#isHistorizing <em>Historizing</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Minimum Sampling Interval</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Sampling Interval</em>' attribute.
	 * @see #isSetMinimumSamplingInterval()
	 * @see #unsetMinimumSamplingInterval()
	 * @see #setMinimumSamplingInterval(double)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAVariable_MinimumSamplingInterval()
	 * @model default="0" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.Duration"
	 *        extendedMetaData="kind='attribute' name='MinimumSamplingInterval'"
	 * @generated
	 */
	double getMinimumSamplingInterval();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getMinimumSamplingInterval <em>Minimum Sampling Interval</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getMinimumSamplingInterval <em>Minimum Sampling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumSamplingInterval()
	 * @see #getMinimumSamplingInterval()
	 * @see #setMinimumSamplingInterval(double)
	 * @generated
	 */
	void unsetMinimumSamplingInterval();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getMinimumSamplingInterval <em>Minimum Sampling Interval</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>User Access Level</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Access Level</em>' attribute.
	 * @see #isSetUserAccessLevel()
	 * @see #unsetUserAccessLevel()
	 * @see #setUserAccessLevel(long)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAVariable_UserAccessLevel()
	 * @model default="1" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.AccessLevel"
	 *        extendedMetaData="kind='attribute' name='UserAccessLevel'"
	 * @generated
	 */
	long getUserAccessLevel();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getUserAccessLevel <em>User Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Access Level</em>' attribute.
	 * @see #isSetUserAccessLevel()
	 * @see #unsetUserAccessLevel()
	 * @see #getUserAccessLevel()
	 * @generated
	 */
	void setUserAccessLevel(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getUserAccessLevel <em>User Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserAccessLevel()
	 * @see #getUserAccessLevel()
	 * @see #setUserAccessLevel(long)
	 * @generated
	 */
	void unsetUserAccessLevel();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getUserAccessLevel <em>User Access Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Access Level</em>' attribute is set.
	 * @see #unsetUserAccessLevel()
	 * @see #getUserAccessLevel()
	 * @see #setUserAccessLevel(long)
	 * @generated
	 */
	boolean isSetUserAccessLevel();

	/**
	 * Returns the value of the '<em><b>Value Rank</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Rank</em>' attribute.
	 * @see #isSetValueRank()
	 * @see #unsetValueRank()
	 * @see #setValueRank(int)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAVariable_ValueRank()
	 * @model default="-1" unsettable="true" dataType="org.opcfoundation.ua._2011._03.ua.node.set.ValueRank"
	 *        extendedMetaData="kind='attribute' name='ValueRank'"
	 * @generated
	 */
	int getValueRank();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getValueRank <em>Value Rank</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getValueRank <em>Value Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValueRank()
	 * @see #getValueRank()
	 * @see #setValueRank(int)
	 * @generated
	 */
	void unsetValueRank();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAVariable#getValueRank <em>Value Rank</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value Rank</em>' attribute is set.
	 * @see #unsetValueRank()
	 * @see #getValueRank()
	 * @see #setValueRank(int)
	 * @generated
	 */
	boolean isSetValueRank();

} // UAVariable
