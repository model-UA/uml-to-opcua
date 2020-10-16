/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NodeReference#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NodeReference#getReferenceTypeId <em>Reference Type Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NodeReference#isIsForward <em>Is Forward</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NodeReference#getReferencedNodeIds <em>Referenced Node Ids</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNodeReference()
 * @model extendedMetaData="name='NodeReference' kind='elementOnly'"
 * @generated
 */
public interface NodeReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' containment reference.
	 * @see #isSetNodeId()
	 * @see #unsetNodeId()
	 * @see #setNodeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNodeReference_NodeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeReference#getNodeId <em>Node Id</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeReference#getNodeId <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeId()
	 * @see #getNodeId()
	 * @see #setNodeId(NodeId)
	 * @generated
	 */
	void unsetNodeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeReference#getNodeId <em>Node Id</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Reference Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type Id</em>' containment reference.
	 * @see #isSetReferenceTypeId()
	 * @see #unsetReferenceTypeId()
	 * @see #setReferenceTypeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNodeReference_ReferenceTypeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ReferenceTypeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getReferenceTypeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeReference#getReferenceTypeId <em>Reference Type Id</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeReference#getReferenceTypeId <em>Reference Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceTypeId()
	 * @see #getReferenceTypeId()
	 * @see #setReferenceTypeId(NodeId)
	 * @generated
	 */
	void unsetReferenceTypeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeReference#getReferenceTypeId <em>Reference Type Id</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Is Forward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Forward</em>' attribute.
	 * @see #isSetIsForward()
	 * @see #unsetIsForward()
	 * @see #setIsForward(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNodeReference_IsForward()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsForward' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsForward();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeReference#isIsForward <em>Is Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forward</em>' attribute.
	 * @see #isSetIsForward()
	 * @see #unsetIsForward()
	 * @see #isIsForward()
	 * @generated
	 */
	void setIsForward(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeReference#isIsForward <em>Is Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsForward()
	 * @see #isIsForward()
	 * @see #setIsForward(boolean)
	 * @generated
	 */
	void unsetIsForward();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeReference#isIsForward <em>Is Forward</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Forward</em>' attribute is set.
	 * @see #unsetIsForward()
	 * @see #isIsForward()
	 * @see #setIsForward(boolean)
	 * @generated
	 */
	boolean isSetIsForward();

	/**
	 * Returns the value of the '<em><b>Referenced Node Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Node Ids</em>' containment reference.
	 * @see #isSetReferencedNodeIds()
	 * @see #unsetReferencedNodeIds()
	 * @see #setReferencedNodeIds(ListOfNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNodeReference_ReferencedNodeIds()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ReferencedNodeIds' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfNodeId getReferencedNodeIds();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeReference#getReferencedNodeIds <em>Referenced Node Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Node Ids</em>' containment reference.
	 * @see #isSetReferencedNodeIds()
	 * @see #unsetReferencedNodeIds()
	 * @see #getReferencedNodeIds()
	 * @generated
	 */
	void setReferencedNodeIds(ListOfNodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeReference#getReferencedNodeIds <em>Referenced Node Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferencedNodeIds()
	 * @see #getReferencedNodeIds()
	 * @see #setReferencedNodeIds(ListOfNodeId)
	 * @generated
	 */
	void unsetReferencedNodeIds();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeReference#getReferencedNodeIds <em>Referenced Node Ids</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Referenced Node Ids</em>' containment reference is set.
	 * @see #unsetReferencedNodeIds()
	 * @see #getReferencedNodeIds()
	 * @see #setReferencedNodeIds(ListOfNodeId)
	 * @generated
	 */
	boolean isSetReferencedNodeIds();

} // NodeReference
