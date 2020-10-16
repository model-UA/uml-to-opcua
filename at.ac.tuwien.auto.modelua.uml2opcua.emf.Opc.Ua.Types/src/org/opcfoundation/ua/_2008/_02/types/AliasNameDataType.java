/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias Name Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AliasNameDataType#getAliasName <em>Alias Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.AliasNameDataType#getReferencedNodes <em>Referenced Nodes</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAliasNameDataType()
 * @model extendedMetaData="name='AliasNameDataType' kind='elementOnly'"
 * @generated
 */
public interface AliasNameDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Alias Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Name</em>' containment reference.
	 * @see #isSetAliasName()
	 * @see #unsetAliasName()
	 * @see #setAliasName(QualifiedName)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAliasNameDataType_AliasName()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AliasName' namespace='##targetNamespace'"
	 * @generated
	 */
	QualifiedName getAliasName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AliasNameDataType#getAliasName <em>Alias Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias Name</em>' containment reference.
	 * @see #isSetAliasName()
	 * @see #unsetAliasName()
	 * @see #getAliasName()
	 * @generated
	 */
	void setAliasName(QualifiedName value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AliasNameDataType#getAliasName <em>Alias Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAliasName()
	 * @see #getAliasName()
	 * @see #setAliasName(QualifiedName)
	 * @generated
	 */
	void unsetAliasName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AliasNameDataType#getAliasName <em>Alias Name</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alias Name</em>' containment reference is set.
	 * @see #unsetAliasName()
	 * @see #getAliasName()
	 * @see #setAliasName(QualifiedName)
	 * @generated
	 */
	boolean isSetAliasName();

	/**
	 * Returns the value of the '<em><b>Referenced Nodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Nodes</em>' containment reference.
	 * @see #isSetReferencedNodes()
	 * @see #unsetReferencedNodes()
	 * @see #setReferencedNodes(ListOfExpandedNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getAliasNameDataType_ReferencedNodes()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ReferencedNodes' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfExpandedNodeId getReferencedNodes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.AliasNameDataType#getReferencedNodes <em>Referenced Nodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Nodes</em>' containment reference.
	 * @see #isSetReferencedNodes()
	 * @see #unsetReferencedNodes()
	 * @see #getReferencedNodes()
	 * @generated
	 */
	void setReferencedNodes(ListOfExpandedNodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.AliasNameDataType#getReferencedNodes <em>Referenced Nodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferencedNodes()
	 * @see #getReferencedNodes()
	 * @see #setReferencedNodes(ListOfExpandedNodeId)
	 * @generated
	 */
	void unsetReferencedNodes();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.AliasNameDataType#getReferencedNodes <em>Referenced Nodes</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Referenced Nodes</em>' containment reference is set.
	 * @see #unsetReferencedNodes()
	 * @see #getReferencedNodes()
	 * @see #setReferencedNodes(ListOfExpandedNodeId)
	 * @generated
	 */
	boolean isSetReferencedNodes();

} // AliasNameDataType
