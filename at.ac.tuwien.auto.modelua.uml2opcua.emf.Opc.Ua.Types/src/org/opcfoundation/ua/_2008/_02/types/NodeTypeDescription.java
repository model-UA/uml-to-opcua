/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Type Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NodeTypeDescription#getTypeDefinitionNode <em>Type Definition Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NodeTypeDescription#isIncludeSubTypes <em>Include Sub Types</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.NodeTypeDescription#getDataToReturn <em>Data To Return</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNodeTypeDescription()
 * @model extendedMetaData="name='NodeTypeDescription' kind='elementOnly'"
 * @generated
 */
public interface NodeTypeDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Definition Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition Node</em>' containment reference.
	 * @see #isSetTypeDefinitionNode()
	 * @see #unsetTypeDefinitionNode()
	 * @see #setTypeDefinitionNode(ExpandedNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNodeTypeDescription_TypeDefinitionNode()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeDefinitionNode' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpandedNodeId getTypeDefinitionNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeTypeDescription#getTypeDefinitionNode <em>Type Definition Node</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeTypeDescription#getTypeDefinitionNode <em>Type Definition Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeDefinitionNode()
	 * @see #getTypeDefinitionNode()
	 * @see #setTypeDefinitionNode(ExpandedNodeId)
	 * @generated
	 */
	void unsetTypeDefinitionNode();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeTypeDescription#getTypeDefinitionNode <em>Type Definition Node</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Include Sub Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Sub Types</em>' attribute.
	 * @see #isSetIncludeSubTypes()
	 * @see #unsetIncludeSubTypes()
	 * @see #setIncludeSubTypes(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNodeTypeDescription_IncludeSubTypes()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IncludeSubTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIncludeSubTypes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeTypeDescription#isIncludeSubTypes <em>Include Sub Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Sub Types</em>' attribute.
	 * @see #isSetIncludeSubTypes()
	 * @see #unsetIncludeSubTypes()
	 * @see #isIncludeSubTypes()
	 * @generated
	 */
	void setIncludeSubTypes(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeTypeDescription#isIncludeSubTypes <em>Include Sub Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIncludeSubTypes()
	 * @see #isIncludeSubTypes()
	 * @see #setIncludeSubTypes(boolean)
	 * @generated
	 */
	void unsetIncludeSubTypes();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeTypeDescription#isIncludeSubTypes <em>Include Sub Types</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Include Sub Types</em>' attribute is set.
	 * @see #unsetIncludeSubTypes()
	 * @see #isIncludeSubTypes()
	 * @see #setIncludeSubTypes(boolean)
	 * @generated
	 */
	boolean isSetIncludeSubTypes();

	/**
	 * Returns the value of the '<em><b>Data To Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data To Return</em>' containment reference.
	 * @see #isSetDataToReturn()
	 * @see #unsetDataToReturn()
	 * @see #setDataToReturn(ListOfQueryDataDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNodeTypeDescription_DataToReturn()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DataToReturn' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfQueryDataDescription getDataToReturn();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeTypeDescription#getDataToReturn <em>Data To Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data To Return</em>' containment reference.
	 * @see #isSetDataToReturn()
	 * @see #unsetDataToReturn()
	 * @see #getDataToReturn()
	 * @generated
	 */
	void setDataToReturn(ListOfQueryDataDescription value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeTypeDescription#getDataToReturn <em>Data To Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataToReturn()
	 * @see #getDataToReturn()
	 * @see #setDataToReturn(ListOfQueryDataDescription)
	 * @generated
	 */
	void unsetDataToReturn();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.NodeTypeDescription#getDataToReturn <em>Data To Return</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data To Return</em>' containment reference is set.
	 * @see #unsetDataToReturn()
	 * @see #getDataToReturn()
	 * @see #setDataToReturn(ListOfQueryDataDescription)
	 * @generated
	 */
	boolean isSetDataToReturn();

} // NodeTypeDescription
