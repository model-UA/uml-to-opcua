/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node To Delete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeToDelete#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeToDelete#isDeleteReverseReferences <em>Delete Reverse References</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getNodeToDelete()
 * @model extendedMetaData="name='NodeToDelete' kind='simple'"
 * @generated
 */
public interface NodeToDelete extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getNodeToDelete_Value()
	 * @model dataType="org.opcfoundation.ua._2011._03.ua.node.set.NodeId"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeToDelete#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Delete Reverse References</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Reverse References</em>' attribute.
	 * @see #isSetDeleteReverseReferences()
	 * @see #unsetDeleteReverseReferences()
	 * @see #setDeleteReverseReferences(boolean)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getNodeToDelete_DeleteReverseReferences()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='DeleteReverseReferences'"
	 * @generated
	 */
	boolean isDeleteReverseReferences();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeToDelete#isDeleteReverseReferences <em>Delete Reverse References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Reverse References</em>' attribute.
	 * @see #isSetDeleteReverseReferences()
	 * @see #unsetDeleteReverseReferences()
	 * @see #isDeleteReverseReferences()
	 * @generated
	 */
	void setDeleteReverseReferences(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeToDelete#isDeleteReverseReferences <em>Delete Reverse References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeleteReverseReferences()
	 * @see #isDeleteReverseReferences()
	 * @see #setDeleteReverseReferences(boolean)
	 * @generated
	 */
	void unsetDeleteReverseReferences();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeToDelete#isDeleteReverseReferences <em>Delete Reverse References</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delete Reverse References</em>' attribute is set.
	 * @see #unsetDeleteReverseReferences()
	 * @see #isDeleteReverseReferences()
	 * @see #setDeleteReverseReferences(boolean)
	 * @generated
	 */
	boolean isSetDeleteReverseReferences();

} // NodeToDelete
