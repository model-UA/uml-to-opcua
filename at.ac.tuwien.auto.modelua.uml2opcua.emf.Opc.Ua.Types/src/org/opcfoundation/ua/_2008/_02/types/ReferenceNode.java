/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReferenceNode#getReferenceTypeId <em>Reference Type Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReferenceNode#isIsInverse <em>Is Inverse</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReferenceNode#getTargetId <em>Target Id</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReferenceNode()
 * @model extendedMetaData="name='ReferenceNode' kind='elementOnly'"
 * @generated
 */
public interface ReferenceNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type Id</em>' containment reference.
	 * @see #isSetReferenceTypeId()
	 * @see #unsetReferenceTypeId()
	 * @see #setReferenceTypeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReferenceNode_ReferenceTypeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ReferenceTypeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getReferenceTypeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceNode#getReferenceTypeId <em>Reference Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Type Id</em>' containment reference.
	 * @see #isSetReferenceTypeId()
	 * @see #unsetReferenceTypeId()
	 * @see #getReferenceTypeId()
	 * @generated
	 */
	void setReferenceTypeId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceNode#getReferenceTypeId <em>Reference Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceTypeId()
	 * @see #getReferenceTypeId()
	 * @see #setReferenceTypeId(NodeId)
	 * @generated
	 */
	void unsetReferenceTypeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceNode#getReferenceTypeId <em>Reference Type Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference Type Id</em>' containment reference is set.
	 * @see #unsetReferenceTypeId()
	 * @see #getReferenceTypeId()
	 * @see #setReferenceTypeId(NodeId)
	 * @generated
	 */
	boolean isSetReferenceTypeId();

	/**
	 * Returns the value of the '<em><b>Is Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Inverse</em>' attribute.
	 * @see #isSetIsInverse()
	 * @see #unsetIsInverse()
	 * @see #setIsInverse(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReferenceNode_IsInverse()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsInverse' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsInverse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceNode#isIsInverse <em>Is Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Inverse</em>' attribute.
	 * @see #isSetIsInverse()
	 * @see #unsetIsInverse()
	 * @see #isIsInverse()
	 * @generated
	 */
	void setIsInverse(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceNode#isIsInverse <em>Is Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsInverse()
	 * @see #isIsInverse()
	 * @see #setIsInverse(boolean)
	 * @generated
	 */
	void unsetIsInverse();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceNode#isIsInverse <em>Is Inverse</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Inverse</em>' attribute is set.
	 * @see #unsetIsInverse()
	 * @see #isIsInverse()
	 * @see #setIsInverse(boolean)
	 * @generated
	 */
	boolean isSetIsInverse();

	/**
	 * Returns the value of the '<em><b>Target Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Id</em>' containment reference.
	 * @see #isSetTargetId()
	 * @see #unsetTargetId()
	 * @see #setTargetId(ExpandedNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReferenceNode_TargetId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TargetId' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpandedNodeId getTargetId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceNode#getTargetId <em>Target Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Id</em>' containment reference.
	 * @see #isSetTargetId()
	 * @see #unsetTargetId()
	 * @see #getTargetId()
	 * @generated
	 */
	void setTargetId(ExpandedNodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceNode#getTargetId <em>Target Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetId()
	 * @see #getTargetId()
	 * @see #setTargetId(ExpandedNodeId)
	 * @generated
	 */
	void unsetTargetId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceNode#getTargetId <em>Target Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Id</em>' containment reference is set.
	 * @see #unsetTargetId()
	 * @see #getTargetId()
	 * @see #setTargetId(ExpandedNodeId)
	 * @generated
	 */
	boolean isSetTargetId();

} // ReferenceNode
