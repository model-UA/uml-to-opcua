/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.WriteValue#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.WriteValue#getAttributeId <em>Attribute Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.WriteValue#getIndexRange <em>Index Range</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.WriteValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getWriteValue()
 * @model extendedMetaData="name='WriteValue' kind='elementOnly'"
 * @generated
 */
public interface WriteValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' containment reference.
	 * @see #isSetNodeId()
	 * @see #unsetNodeId()
	 * @see #setNodeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getWriteValue_NodeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriteValue#getNodeId <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' containment reference.
	 * @see #isSetNodeId()
	 * @see #unsetNodeId()
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriteValue#getNodeId <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeId()
	 * @see #getNodeId()
	 * @see #setNodeId(NodeId)
	 * @generated
	 */
	void unsetNodeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.WriteValue#getNodeId <em>Node Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Node Id</em>' containment reference is set.
	 * @see #unsetNodeId()
	 * @see #getNodeId()
	 * @see #setNodeId(NodeId)
	 * @generated
	 */
	boolean isSetNodeId();

	/**
	 * Returns the value of the '<em><b>Attribute Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Id</em>' attribute.
	 * @see #isSetAttributeId()
	 * @see #unsetAttributeId()
	 * @see #setAttributeId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getWriteValue_AttributeId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='AttributeId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getAttributeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriteValue#getAttributeId <em>Attribute Id</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriteValue#getAttributeId <em>Attribute Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttributeId()
	 * @see #getAttributeId()
	 * @see #setAttributeId(long)
	 * @generated
	 */
	void unsetAttributeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.WriteValue#getAttributeId <em>Attribute Id</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Index Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Range</em>' attribute.
	 * @see #isSetIndexRange()
	 * @see #unsetIndexRange()
	 * @see #setIndexRange(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getWriteValue_IndexRange()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='IndexRange' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIndexRange();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriteValue#getIndexRange <em>Index Range</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriteValue#getIndexRange <em>Index Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndexRange()
	 * @see #getIndexRange()
	 * @see #setIndexRange(String)
	 * @generated
	 */
	void unsetIndexRange();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.WriteValue#getIndexRange <em>Index Range</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(DataValue)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getWriteValue_Value()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	DataValue getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriteValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DataValue value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.WriteValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(DataValue)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.WriteValue#getValue <em>Value</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' containment reference is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(DataValue)
	 * @generated
	 */
	boolean isSetValue();

} // WriteValue
