/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Browse Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getBrowseDirection <em>Browse Direction</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getReferenceTypeId <em>Reference Type Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#isIncludeSubtypes <em>Include Subtypes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getNodeClassMask <em>Node Class Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getResultMask <em>Result Mask</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseDescription()
 * @model extendedMetaData="name='BrowseDescription' kind='elementOnly'"
 * @generated
 */
public interface BrowseDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' containment reference.
	 * @see #isSetNodeId()
	 * @see #unsetNodeId()
	 * @see #setNodeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseDescription_NodeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getNodeId <em>Node Id</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getNodeId <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeId()
	 * @see #getNodeId()
	 * @see #setNodeId(NodeId)
	 * @generated
	 */
	void unsetNodeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getNodeId <em>Node Id</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Browse Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.BrowseDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Direction</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.BrowseDirection
	 * @see #isSetBrowseDirection()
	 * @see #unsetBrowseDirection()
	 * @see #setBrowseDirection(BrowseDirection)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseDescription_BrowseDirection()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='BrowseDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	BrowseDirection getBrowseDirection();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getBrowseDirection <em>Browse Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Direction</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.BrowseDirection
	 * @see #isSetBrowseDirection()
	 * @see #unsetBrowseDirection()
	 * @see #getBrowseDirection()
	 * @generated
	 */
	void setBrowseDirection(BrowseDirection value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getBrowseDirection <em>Browse Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBrowseDirection()
	 * @see #getBrowseDirection()
	 * @see #setBrowseDirection(BrowseDirection)
	 * @generated
	 */
	void unsetBrowseDirection();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getBrowseDirection <em>Browse Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Browse Direction</em>' attribute is set.
	 * @see #unsetBrowseDirection()
	 * @see #getBrowseDirection()
	 * @see #setBrowseDirection(BrowseDirection)
	 * @generated
	 */
	boolean isSetBrowseDirection();

	/**
	 * Returns the value of the '<em><b>Reference Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type Id</em>' containment reference.
	 * @see #isSetReferenceTypeId()
	 * @see #unsetReferenceTypeId()
	 * @see #setReferenceTypeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseDescription_ReferenceTypeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ReferenceTypeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getReferenceTypeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getReferenceTypeId <em>Reference Type Id</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getReferenceTypeId <em>Reference Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceTypeId()
	 * @see #getReferenceTypeId()
	 * @see #setReferenceTypeId(NodeId)
	 * @generated
	 */
	void unsetReferenceTypeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getReferenceTypeId <em>Reference Type Id</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Include Subtypes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Subtypes</em>' attribute.
	 * @see #isSetIncludeSubtypes()
	 * @see #unsetIncludeSubtypes()
	 * @see #setIncludeSubtypes(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseDescription_IncludeSubtypes()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IncludeSubtypes' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIncludeSubtypes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#isIncludeSubtypes <em>Include Subtypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Subtypes</em>' attribute.
	 * @see #isSetIncludeSubtypes()
	 * @see #unsetIncludeSubtypes()
	 * @see #isIncludeSubtypes()
	 * @generated
	 */
	void setIncludeSubtypes(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#isIncludeSubtypes <em>Include Subtypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIncludeSubtypes()
	 * @see #isIncludeSubtypes()
	 * @see #setIncludeSubtypes(boolean)
	 * @generated
	 */
	void unsetIncludeSubtypes();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#isIncludeSubtypes <em>Include Subtypes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Include Subtypes</em>' attribute is set.
	 * @see #unsetIncludeSubtypes()
	 * @see #isIncludeSubtypes()
	 * @see #setIncludeSubtypes(boolean)
	 * @generated
	 */
	boolean isSetIncludeSubtypes();

	/**
	 * Returns the value of the '<em><b>Node Class Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Class Mask</em>' attribute.
	 * @see #isSetNodeClassMask()
	 * @see #unsetNodeClassMask()
	 * @see #setNodeClassMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseDescription_NodeClassMask()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='NodeClassMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNodeClassMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getNodeClassMask <em>Node Class Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Class Mask</em>' attribute.
	 * @see #isSetNodeClassMask()
	 * @see #unsetNodeClassMask()
	 * @see #getNodeClassMask()
	 * @generated
	 */
	void setNodeClassMask(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getNodeClassMask <em>Node Class Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeClassMask()
	 * @see #getNodeClassMask()
	 * @see #setNodeClassMask(long)
	 * @generated
	 */
	void unsetNodeClassMask();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getNodeClassMask <em>Node Class Mask</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Node Class Mask</em>' attribute is set.
	 * @see #unsetNodeClassMask()
	 * @see #getNodeClassMask()
	 * @see #setNodeClassMask(long)
	 * @generated
	 */
	boolean isSetNodeClassMask();

	/**
	 * Returns the value of the '<em><b>Result Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Mask</em>' attribute.
	 * @see #isSetResultMask()
	 * @see #unsetResultMask()
	 * @see #setResultMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowseDescription_ResultMask()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='ResultMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getResultMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getResultMask <em>Result Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Mask</em>' attribute.
	 * @see #isSetResultMask()
	 * @see #unsetResultMask()
	 * @see #getResultMask()
	 * @generated
	 */
	void setResultMask(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getResultMask <em>Result Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResultMask()
	 * @see #getResultMask()
	 * @see #setResultMask(long)
	 * @generated
	 */
	void unsetResultMask();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowseDescription#getResultMask <em>Result Mask</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Result Mask</em>' attribute is set.
	 * @see #unsetResultMask()
	 * @see #getResultMask()
	 * @see #setResultMask(long)
	 * @generated
	 */
	boolean isSetResultMask();

} // BrowseDescription
