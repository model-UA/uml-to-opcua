/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add References Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getSourceNodeId <em>Source Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getReferenceTypeId <em>Reference Type Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#isIsForward <em>Is Forward</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getTargetServerUri <em>Target Server Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getTargetNodeId <em>Target Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getTargetNodeClass <em>Target Node Class</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddReferencesItem()
 * @model extendedMetaData="name='AddReferencesItem' kind='elementOnly'"
 * @generated
 */
public interface AddReferencesItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Node Id</em>' containment reference.
	 * @see #isSetSourceNodeId()
	 * @see #unsetSourceNodeId()
	 * @see #setSourceNodeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddReferencesItem_SourceNodeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SourceNodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getSourceNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getSourceNodeId <em>Source Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Node Id</em>' containment reference.
	 * @see #isSetSourceNodeId()
	 * @see #unsetSourceNodeId()
	 * @see #getSourceNodeId()
	 * @generated
	 */
	void setSourceNodeId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getSourceNodeId <em>Source Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSourceNodeId()
	 * @see #getSourceNodeId()
	 * @see #setSourceNodeId(NodeId)
	 * @generated
	 */
	void unsetSourceNodeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getSourceNodeId <em>Source Node Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source Node Id</em>' containment reference is set.
	 * @see #unsetSourceNodeId()
	 * @see #getSourceNodeId()
	 * @see #setSourceNodeId(NodeId)
	 * @generated
	 */
	boolean isSetSourceNodeId();

	/**
	 * Returns the value of the '<em><b>Reference Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type Id</em>' containment reference.
	 * @see #isSetReferenceTypeId()
	 * @see #unsetReferenceTypeId()
	 * @see #setReferenceTypeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddReferencesItem_ReferenceTypeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ReferenceTypeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getReferenceTypeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getReferenceTypeId <em>Reference Type Id</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getReferenceTypeId <em>Reference Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceTypeId()
	 * @see #getReferenceTypeId()
	 * @see #setReferenceTypeId(NodeId)
	 * @generated
	 */
	void unsetReferenceTypeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getReferenceTypeId <em>Reference Type Id</em>}' containment reference is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddReferencesItem_IsForward()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsForward' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsForward();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#isIsForward <em>Is Forward</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#isIsForward <em>Is Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsForward()
	 * @see #isIsForward()
	 * @see #setIsForward(boolean)
	 * @generated
	 */
	void unsetIsForward();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#isIsForward <em>Is Forward</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Target Server Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Server Uri</em>' attribute.
	 * @see #isSetTargetServerUri()
	 * @see #unsetTargetServerUri()
	 * @see #setTargetServerUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddReferencesItem_TargetServerUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='TargetServerUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTargetServerUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getTargetServerUri <em>Target Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Server Uri</em>' attribute.
	 * @see #isSetTargetServerUri()
	 * @see #unsetTargetServerUri()
	 * @see #getTargetServerUri()
	 * @generated
	 */
	void setTargetServerUri(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getTargetServerUri <em>Target Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetServerUri()
	 * @see #getTargetServerUri()
	 * @see #setTargetServerUri(String)
	 * @generated
	 */
	void unsetTargetServerUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getTargetServerUri <em>Target Server Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Server Uri</em>' attribute is set.
	 * @see #unsetTargetServerUri()
	 * @see #getTargetServerUri()
	 * @see #setTargetServerUri(String)
	 * @generated
	 */
	boolean isSetTargetServerUri();

	/**
	 * Returns the value of the '<em><b>Target Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Node Id</em>' containment reference.
	 * @see #isSetTargetNodeId()
	 * @see #unsetTargetNodeId()
	 * @see #setTargetNodeId(ExpandedNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddReferencesItem_TargetNodeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TargetNodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpandedNodeId getTargetNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getTargetNodeId <em>Target Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Node Id</em>' containment reference.
	 * @see #isSetTargetNodeId()
	 * @see #unsetTargetNodeId()
	 * @see #getTargetNodeId()
	 * @generated
	 */
	void setTargetNodeId(ExpandedNodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getTargetNodeId <em>Target Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetNodeId()
	 * @see #getTargetNodeId()
	 * @see #setTargetNodeId(ExpandedNodeId)
	 * @generated
	 */
	void unsetTargetNodeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getTargetNodeId <em>Target Node Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Node Id</em>' containment reference is set.
	 * @see #unsetTargetNodeId()
	 * @see #getTargetNodeId()
	 * @see #setTargetNodeId(ExpandedNodeId)
	 * @generated
	 */
	boolean isSetTargetNodeId();

	/**
	 * Returns the value of the '<em><b>Target Node Class</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.NodeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Node Class</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.NodeClass
	 * @see #isSetTargetNodeClass()
	 * @see #unsetTargetNodeClass()
	 * @see #setTargetNodeClass(NodeClass)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAddReferencesItem_TargetNodeClass()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TargetNodeClass' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeClass getTargetNodeClass();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getTargetNodeClass <em>Target Node Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Node Class</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.NodeClass
	 * @see #isSetTargetNodeClass()
	 * @see #unsetTargetNodeClass()
	 * @see #getTargetNodeClass()
	 * @generated
	 */
	void setTargetNodeClass(NodeClass value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getTargetNodeClass <em>Target Node Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetNodeClass()
	 * @see #getTargetNodeClass()
	 * @see #setTargetNodeClass(NodeClass)
	 * @generated
	 */
	void unsetTargetNodeClass();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AddReferencesItem#getTargetNodeClass <em>Target Node Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Node Class</em>' attribute is set.
	 * @see #unsetTargetNodeClass()
	 * @see #getTargetNodeClass()
	 * @see #setTargetNodeClass(NodeClass)
	 * @generated
	 */
	boolean isSetTargetNodeClass();

} // AddReferencesItem
