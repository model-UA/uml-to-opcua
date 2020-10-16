/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Published Variable Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getPublishedVariable <em>Published Variable</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getAttributeId <em>Attribute Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getSamplingIntervalHint <em>Sampling Interval Hint</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getDeadbandType <em>Deadband Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getDeadbandValue <em>Deadband Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getIndexRange <em>Index Range</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getSubstituteValue <em>Substitute Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getMetaDataProperties <em>Meta Data Properties</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedVariableDataType()
 * @model extendedMetaData="name='PublishedVariableDataType' kind='elementOnly'"
 * @generated
 */
public interface PublishedVariableDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Published Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published Variable</em>' containment reference.
	 * @see #isSetPublishedVariable()
	 * @see #unsetPublishedVariable()
	 * @see #setPublishedVariable(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedVariableDataType_PublishedVariable()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='PublishedVariable' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getPublishedVariable();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getPublishedVariable <em>Published Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published Variable</em>' containment reference.
	 * @see #isSetPublishedVariable()
	 * @see #unsetPublishedVariable()
	 * @see #getPublishedVariable()
	 * @generated
	 */
	void setPublishedVariable(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getPublishedVariable <em>Published Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPublishedVariable()
	 * @see #getPublishedVariable()
	 * @see #setPublishedVariable(NodeId)
	 * @generated
	 */
	void unsetPublishedVariable();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getPublishedVariable <em>Published Variable</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Published Variable</em>' containment reference is set.
	 * @see #unsetPublishedVariable()
	 * @see #getPublishedVariable()
	 * @see #setPublishedVariable(NodeId)
	 * @generated
	 */
	boolean isSetPublishedVariable();

	/**
	 * Returns the value of the '<em><b>Attribute Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Id</em>' attribute.
	 * @see #isSetAttributeId()
	 * @see #unsetAttributeId()
	 * @see #setAttributeId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedVariableDataType_AttributeId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='AttributeId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getAttributeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getAttributeId <em>Attribute Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Id</em>' attribute.
	 * @see #isSetAttributeId()
	 * @see #unsetAttributeId()
	 * @see #getAttributeId()
	 * @generated
	 */
	void setAttributeId(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getAttributeId <em>Attribute Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttributeId()
	 * @see #getAttributeId()
	 * @see #setAttributeId(long)
	 * @generated
	 */
	void unsetAttributeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getAttributeId <em>Attribute Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attribute Id</em>' attribute is set.
	 * @see #unsetAttributeId()
	 * @see #getAttributeId()
	 * @see #setAttributeId(long)
	 * @generated
	 */
	boolean isSetAttributeId();

	/**
	 * Returns the value of the '<em><b>Sampling Interval Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Interval Hint</em>' attribute.
	 * @see #isSetSamplingIntervalHint()
	 * @see #unsetSamplingIntervalHint()
	 * @see #setSamplingIntervalHint(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedVariableDataType_SamplingIntervalHint()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='SamplingIntervalHint' namespace='##targetNamespace'"
	 * @generated
	 */
	double getSamplingIntervalHint();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getSamplingIntervalHint <em>Sampling Interval Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Interval Hint</em>' attribute.
	 * @see #isSetSamplingIntervalHint()
	 * @see #unsetSamplingIntervalHint()
	 * @see #getSamplingIntervalHint()
	 * @generated
	 */
	void setSamplingIntervalHint(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getSamplingIntervalHint <em>Sampling Interval Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSamplingIntervalHint()
	 * @see #getSamplingIntervalHint()
	 * @see #setSamplingIntervalHint(double)
	 * @generated
	 */
	void unsetSamplingIntervalHint();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getSamplingIntervalHint <em>Sampling Interval Hint</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sampling Interval Hint</em>' attribute is set.
	 * @see #unsetSamplingIntervalHint()
	 * @see #getSamplingIntervalHint()
	 * @see #setSamplingIntervalHint(double)
	 * @generated
	 */
	boolean isSetSamplingIntervalHint();

	/**
	 * Returns the value of the '<em><b>Deadband Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadband Type</em>' attribute.
	 * @see #isSetDeadbandType()
	 * @see #unsetDeadbandType()
	 * @see #setDeadbandType(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedVariableDataType_DeadbandType()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='DeadbandType' namespace='##targetNamespace'"
	 * @generated
	 */
	long getDeadbandType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getDeadbandType <em>Deadband Type</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getDeadbandType <em>Deadband Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeadbandType()
	 * @see #getDeadbandType()
	 * @see #setDeadbandType(long)
	 * @generated
	 */
	void unsetDeadbandType();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getDeadbandType <em>Deadband Type</em>}' attribute is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedVariableDataType_DeadbandValue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='DeadbandValue' namespace='##targetNamespace'"
	 * @generated
	 */
	double getDeadbandValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getDeadbandValue <em>Deadband Value</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getDeadbandValue <em>Deadband Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeadbandValue()
	 * @see #getDeadbandValue()
	 * @see #setDeadbandValue(double)
	 * @generated
	 */
	void unsetDeadbandValue();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getDeadbandValue <em>Deadband Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deadband Value</em>' attribute is set.
	 * @see #unsetDeadbandValue()
	 * @see #getDeadbandValue()
	 * @see #setDeadbandValue(double)
	 * @generated
	 */
	boolean isSetDeadbandValue();

	/**
	 * Returns the value of the '<em><b>Index Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Range</em>' attribute.
	 * @see #isSetIndexRange()
	 * @see #unsetIndexRange()
	 * @see #setIndexRange(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedVariableDataType_IndexRange()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='IndexRange' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIndexRange();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getIndexRange <em>Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Range</em>' attribute.
	 * @see #isSetIndexRange()
	 * @see #unsetIndexRange()
	 * @see #getIndexRange()
	 * @generated
	 */
	void setIndexRange(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getIndexRange <em>Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndexRange()
	 * @see #getIndexRange()
	 * @see #setIndexRange(String)
	 * @generated
	 */
	void unsetIndexRange();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getIndexRange <em>Index Range</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Index Range</em>' attribute is set.
	 * @see #unsetIndexRange()
	 * @see #getIndexRange()
	 * @see #setIndexRange(String)
	 * @generated
	 */
	boolean isSetIndexRange();

	/**
	 * Returns the value of the '<em><b>Substitute Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitute Value</em>' containment reference.
	 * @see #setSubstituteValue(Variant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedVariableDataType_SubstituteValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstituteValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Variant getSubstituteValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getSubstituteValue <em>Substitute Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitute Value</em>' containment reference.
	 * @see #getSubstituteValue()
	 * @generated
	 */
	void setSubstituteValue(Variant value);

	/**
	 * Returns the value of the '<em><b>Meta Data Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data Properties</em>' containment reference.
	 * @see #isSetMetaDataProperties()
	 * @see #unsetMetaDataProperties()
	 * @see #setMetaDataProperties(ListOfQualifiedName)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getPublishedVariableDataType_MetaDataProperties()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='MetaDataProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfQualifiedName getMetaDataProperties();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getMetaDataProperties <em>Meta Data Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data Properties</em>' containment reference.
	 * @see #isSetMetaDataProperties()
	 * @see #unsetMetaDataProperties()
	 * @see #getMetaDataProperties()
	 * @generated
	 */
	void setMetaDataProperties(ListOfQualifiedName value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getMetaDataProperties <em>Meta Data Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMetaDataProperties()
	 * @see #getMetaDataProperties()
	 * @see #setMetaDataProperties(ListOfQualifiedName)
	 * @generated
	 */
	void unsetMetaDataProperties();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.PublishedVariableDataType#getMetaDataProperties <em>Meta Data Properties</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Meta Data Properties</em>' containment reference is set.
	 * @see #unsetMetaDataProperties()
	 * @see #getMetaDataProperties()
	 * @see #setMetaDataProperties(ListOfQualifiedName)
	 * @generated
	 */
	boolean isSetMetaDataProperties();

} // PublishedVariableDataType
