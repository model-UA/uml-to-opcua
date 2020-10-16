/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getReferenceTypeId <em>Reference Type Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#isIsForward <em>Is Forward</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getBrowseName <em>Browse Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getNodeClass <em>Node Class</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReferenceDescription()
 * @model extendedMetaData="name='ReferenceDescription' kind='elementOnly'"
 * @generated
 */
public interface ReferenceDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type Id</em>' containment reference.
	 * @see #isSetReferenceTypeId()
	 * @see #unsetReferenceTypeId()
	 * @see #setReferenceTypeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReferenceDescription_ReferenceTypeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ReferenceTypeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getReferenceTypeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getReferenceTypeId <em>Reference Type Id</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getReferenceTypeId <em>Reference Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceTypeId()
	 * @see #getReferenceTypeId()
	 * @see #setReferenceTypeId(NodeId)
	 * @generated
	 */
	void unsetReferenceTypeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getReferenceTypeId <em>Reference Type Id</em>}' containment reference is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReferenceDescription_IsForward()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsForward' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsForward();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#isIsForward <em>Is Forward</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#isIsForward <em>Is Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsForward()
	 * @see #isIsForward()
	 * @see #setIsForward(boolean)
	 * @generated
	 */
	void unsetIsForward();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#isIsForward <em>Is Forward</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' containment reference.
	 * @see #isSetNodeId()
	 * @see #unsetNodeId()
	 * @see #setNodeId(ExpandedNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReferenceDescription_NodeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpandedNodeId getNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getNodeId <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' containment reference.
	 * @see #isSetNodeId()
	 * @see #unsetNodeId()
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(ExpandedNodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getNodeId <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeId()
	 * @see #getNodeId()
	 * @see #setNodeId(ExpandedNodeId)
	 * @generated
	 */
	void unsetNodeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getNodeId <em>Node Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Node Id</em>' containment reference is set.
	 * @see #unsetNodeId()
	 * @see #getNodeId()
	 * @see #setNodeId(ExpandedNodeId)
	 * @generated
	 */
	boolean isSetNodeId();

	/**
	 * Returns the value of the '<em><b>Browse Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Name</em>' containment reference.
	 * @see #isSetBrowseName()
	 * @see #unsetBrowseName()
	 * @see #setBrowseName(QualifiedName)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReferenceDescription_BrowseName()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='BrowseName' namespace='##targetNamespace'"
	 * @generated
	 */
	QualifiedName getBrowseName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getBrowseName <em>Browse Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Name</em>' containment reference.
	 * @see #isSetBrowseName()
	 * @see #unsetBrowseName()
	 * @see #getBrowseName()
	 * @generated
	 */
	void setBrowseName(QualifiedName value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getBrowseName <em>Browse Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBrowseName()
	 * @see #getBrowseName()
	 * @see #setBrowseName(QualifiedName)
	 * @generated
	 */
	void unsetBrowseName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getBrowseName <em>Browse Name</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Browse Name</em>' containment reference is set.
	 * @see #unsetBrowseName()
	 * @see #getBrowseName()
	 * @see #setBrowseName(QualifiedName)
	 * @generated
	 */
	boolean isSetBrowseName();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference.
	 * @see #isSetDisplayName()
	 * @see #unsetDisplayName()
	 * @see #setDisplayName(LocalizedText)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReferenceDescription_DisplayName()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DisplayName' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedText getDisplayName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' containment reference.
	 * @see #isSetDisplayName()
	 * @see #unsetDisplayName()
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(LocalizedText value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayName()
	 * @see #getDisplayName()
	 * @see #setDisplayName(LocalizedText)
	 * @generated
	 */
	void unsetDisplayName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getDisplayName <em>Display Name</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Name</em>' containment reference is set.
	 * @see #unsetDisplayName()
	 * @see #getDisplayName()
	 * @see #setDisplayName(LocalizedText)
	 * @generated
	 */
	boolean isSetDisplayName();

	/**
	 * Returns the value of the '<em><b>Node Class</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.NodeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Class</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.NodeClass
	 * @see #isSetNodeClass()
	 * @see #unsetNodeClass()
	 * @see #setNodeClass(NodeClass)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReferenceDescription_NodeClass()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NodeClass' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeClass getNodeClass();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getNodeClass <em>Node Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Class</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.NodeClass
	 * @see #isSetNodeClass()
	 * @see #unsetNodeClass()
	 * @see #getNodeClass()
	 * @generated
	 */
	void setNodeClass(NodeClass value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getNodeClass <em>Node Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeClass()
	 * @see #getNodeClass()
	 * @see #setNodeClass(NodeClass)
	 * @generated
	 */
	void unsetNodeClass();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getNodeClass <em>Node Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Node Class</em>' attribute is set.
	 * @see #unsetNodeClass()
	 * @see #getNodeClass()
	 * @see #setNodeClass(NodeClass)
	 * @generated
	 */
	boolean isSetNodeClass();

	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition</em>' containment reference.
	 * @see #isSetTypeDefinition()
	 * @see #unsetTypeDefinition()
	 * @see #setTypeDefinition(ExpandedNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getReferenceDescription_TypeDefinition()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpandedNodeId getTypeDefinition();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getTypeDefinition <em>Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition</em>' containment reference.
	 * @see #isSetTypeDefinition()
	 * @see #unsetTypeDefinition()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	void setTypeDefinition(ExpandedNodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getTypeDefinition <em>Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeDefinition()
	 * @see #getTypeDefinition()
	 * @see #setTypeDefinition(ExpandedNodeId)
	 * @generated
	 */
	void unsetTypeDefinition();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ReferenceDescription#getTypeDefinition <em>Type Definition</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Definition</em>' containment reference is set.
	 * @see #unsetTypeDefinition()
	 * @see #getTypeDefinition()
	 * @see #setTypeDefinition(ExpandedNodeId)
	 * @generated
	 */
	boolean isSetTypeDefinition();

} // ReferenceDescription
