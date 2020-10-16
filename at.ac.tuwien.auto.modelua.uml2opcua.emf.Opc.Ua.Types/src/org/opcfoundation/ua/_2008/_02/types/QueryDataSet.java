/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryDataSet#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryDataSet#getTypeDefinitionNode <em>Type Definition Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.QueryDataSet#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryDataSet()
 * @model extendedMetaData="name='QueryDataSet' kind='elementOnly'"
 * @generated
 */
public interface QueryDataSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' containment reference.
	 * @see #isSetNodeId()
	 * @see #unsetNodeId()
	 * @see #setNodeId(ExpandedNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryDataSet_NodeId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpandedNodeId getNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryDataSet#getNodeId <em>Node Id</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryDataSet#getNodeId <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeId()
	 * @see #getNodeId()
	 * @see #setNodeId(ExpandedNodeId)
	 * @generated
	 */
	void unsetNodeId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryDataSet#getNodeId <em>Node Id</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Type Definition Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition Node</em>' containment reference.
	 * @see #isSetTypeDefinitionNode()
	 * @see #unsetTypeDefinitionNode()
	 * @see #setTypeDefinitionNode(ExpandedNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryDataSet_TypeDefinitionNode()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeDefinitionNode' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpandedNodeId getTypeDefinitionNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryDataSet#getTypeDefinitionNode <em>Type Definition Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition Node</em>' containment reference.
	 * @see #isSetTypeDefinitionNode()
	 * @see #unsetTypeDefinitionNode()
	 * @see #getTypeDefinitionNode()
	 * @generated
	 */
	void setTypeDefinitionNode(ExpandedNodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryDataSet#getTypeDefinitionNode <em>Type Definition Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeDefinitionNode()
	 * @see #getTypeDefinitionNode()
	 * @see #setTypeDefinitionNode(ExpandedNodeId)
	 * @generated
	 */
	void unsetTypeDefinitionNode();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryDataSet#getTypeDefinitionNode <em>Type Definition Node</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Definition Node</em>' containment reference is set.
	 * @see #unsetTypeDefinitionNode()
	 * @see #getTypeDefinitionNode()
	 * @see #setTypeDefinitionNode(ExpandedNodeId)
	 * @generated
	 */
	boolean isSetTypeDefinitionNode();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference.
	 * @see #isSetValues()
	 * @see #unsetValues()
	 * @see #setValues(ListOfVariant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getQueryDataSet_Values()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Values' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfVariant getValues();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryDataSet#getValues <em>Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' containment reference.
	 * @see #isSetValues()
	 * @see #unsetValues()
	 * @see #getValues()
	 * @generated
	 */
	void setValues(ListOfVariant value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryDataSet#getValues <em>Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValues()
	 * @see #getValues()
	 * @see #setValues(ListOfVariant)
	 * @generated
	 */
	void unsetValues();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.QueryDataSet#getValues <em>Values</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Values</em>' containment reference is set.
	 * @see #unsetValues()
	 * @see #getValues()
	 * @see #setValues(ListOfVariant)
	 * @generated
	 */
	boolean isSetValues();

} // QueryDataSet
