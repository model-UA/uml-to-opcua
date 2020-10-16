/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Target Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getDataSetFieldId <em>Data Set Field Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getReceiverIndexRange <em>Receiver Index Range</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getTargetNodeId <em>Target Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getAttributeId <em>Attribute Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getWriteIndexRange <em>Write Index Range</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getOverrideValueHandling <em>Override Value Handling</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getOverrideValue <em>Override Value</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldTargetDataType()
 * @model extendedMetaData="name='FieldTargetDataType' kind='elementOnly'"
 * @generated
 */
public interface FieldTargetDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Set Field Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Field Id</em>' containment reference.
	 * @see #setDataSetFieldId(Guid)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldTargetDataType_DataSetFieldId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSetFieldId' namespace='##targetNamespace'"
	 * @generated
	 */
	Guid getDataSetFieldId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getDataSetFieldId <em>Data Set Field Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Field Id</em>' containment reference.
	 * @see #getDataSetFieldId()
	 * @generated
	 */
	void setDataSetFieldId(Guid value);

	/**
	 * Returns the value of the '<em><b>Receiver Index Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver Index Range</em>' attribute.
	 * @see #isSetReceiverIndexRange()
	 * @see #unsetReceiverIndexRange()
	 * @see #setReceiverIndexRange(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldTargetDataType_ReceiverIndexRange()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ReceiverIndexRange' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReceiverIndexRange();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getReceiverIndexRange <em>Receiver Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Index Range</em>' attribute.
	 * @see #isSetReceiverIndexRange()
	 * @see #unsetReceiverIndexRange()
	 * @see #getReceiverIndexRange()
	 * @generated
	 */
	void setReceiverIndexRange(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getReceiverIndexRange <em>Receiver Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReceiverIndexRange()
	 * @see #getReceiverIndexRange()
	 * @see #setReceiverIndexRange(String)
	 * @generated
	 */
	void unsetReceiverIndexRange();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getReceiverIndexRange <em>Receiver Index Range</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Receiver Index Range</em>' attribute is set.
	 * @see #unsetReceiverIndexRange()
	 * @see #getReceiverIndexRange()
	 * @see #setReceiverIndexRange(String)
	 * @generated
	 */
	boolean isSetReceiverIndexRange();

	/**
	 * Returns the value of the '<em><b>Target Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Node Id</em>' containment reference.
	 * @see #isSetTargetNodeId()
	 * @see #unsetTargetNodeId()
	 * @see #setTargetNodeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldTargetDataType_TargetNodeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TargetNodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getTargetNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getTargetNodeId <em>Target Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Node Id</em>' containment reference.
	 * @see #isSetTargetNodeId()
	 * @see #unsetTargetNodeId()
	 * @see #getTargetNodeId()
	 * @generated
	 */
	void setTargetNodeId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getTargetNodeId <em>Target Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetNodeId()
	 * @see #getTargetNodeId()
	 * @see #setTargetNodeId(NodeId)
	 * @generated
	 */
	void unsetTargetNodeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getTargetNodeId <em>Target Node Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Node Id</em>' containment reference is set.
	 * @see #unsetTargetNodeId()
	 * @see #getTargetNodeId()
	 * @see #setTargetNodeId(NodeId)
	 * @generated
	 */
	boolean isSetTargetNodeId();

	/**
	 * Returns the value of the '<em><b>Attribute Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Id</em>' attribute.
	 * @see #isSetAttributeId()
	 * @see #unsetAttributeId()
	 * @see #setAttributeId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldTargetDataType_AttributeId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='AttributeId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getAttributeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getAttributeId <em>Attribute Id</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getAttributeId <em>Attribute Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttributeId()
	 * @see #getAttributeId()
	 * @see #setAttributeId(long)
	 * @generated
	 */
	void unsetAttributeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getAttributeId <em>Attribute Id</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Write Index Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Index Range</em>' attribute.
	 * @see #isSetWriteIndexRange()
	 * @see #unsetWriteIndexRange()
	 * @see #setWriteIndexRange(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldTargetDataType_WriteIndexRange()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='WriteIndexRange' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWriteIndexRange();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getWriteIndexRange <em>Write Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Index Range</em>' attribute.
	 * @see #isSetWriteIndexRange()
	 * @see #unsetWriteIndexRange()
	 * @see #getWriteIndexRange()
	 * @generated
	 */
	void setWriteIndexRange(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getWriteIndexRange <em>Write Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWriteIndexRange()
	 * @see #getWriteIndexRange()
	 * @see #setWriteIndexRange(String)
	 * @generated
	 */
	void unsetWriteIndexRange();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getWriteIndexRange <em>Write Index Range</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write Index Range</em>' attribute is set.
	 * @see #unsetWriteIndexRange()
	 * @see #getWriteIndexRange()
	 * @see #setWriteIndexRange(String)
	 * @generated
	 */
	boolean isSetWriteIndexRange();

	/**
	 * Returns the value of the '<em><b>Override Value Handling</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.OverrideValueHandling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Value Handling</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.OverrideValueHandling
	 * @see #isSetOverrideValueHandling()
	 * @see #unsetOverrideValueHandling()
	 * @see #setOverrideValueHandling(OverrideValueHandling)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldTargetDataType_OverrideValueHandling()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='OverrideValueHandling' namespace='##targetNamespace'"
	 * @generated
	 */
	OverrideValueHandling getOverrideValueHandling();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getOverrideValueHandling <em>Override Value Handling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Value Handling</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.OverrideValueHandling
	 * @see #isSetOverrideValueHandling()
	 * @see #unsetOverrideValueHandling()
	 * @see #getOverrideValueHandling()
	 * @generated
	 */
	void setOverrideValueHandling(OverrideValueHandling value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getOverrideValueHandling <em>Override Value Handling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverrideValueHandling()
	 * @see #getOverrideValueHandling()
	 * @see #setOverrideValueHandling(OverrideValueHandling)
	 * @generated
	 */
	void unsetOverrideValueHandling();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getOverrideValueHandling <em>Override Value Handling</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Override Value Handling</em>' attribute is set.
	 * @see #unsetOverrideValueHandling()
	 * @see #getOverrideValueHandling()
	 * @see #setOverrideValueHandling(OverrideValueHandling)
	 * @generated
	 */
	boolean isSetOverrideValueHandling();

	/**
	 * Returns the value of the '<em><b>Override Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Value</em>' containment reference.
	 * @see #setOverrideValue(Variant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFieldTargetDataType_OverrideValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OverrideValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Variant getOverrideValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FieldTargetDataType#getOverrideValue <em>Override Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Value</em>' containment reference.
	 * @see #getOverrideValue()
	 * @generated
	 */
	void setOverrideValue(Variant value);

} // FieldTargetDataType
