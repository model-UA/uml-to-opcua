/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAInstance#getParentNodeId <em>Parent Node Id</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAInstance()
 * @model extendedMetaData="name='UAInstance' kind='elementOnly'"
 * @generated
 */
public interface UAInstance extends UANode {
	/**
	 * Returns the value of the '<em><b>Parent Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Node Id</em>' attribute.
	 * @see #setParentNodeId(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAInstance_ParentNodeId()
	 * @model dataType="org.opcfoundation.ua._2011._03.ua.node.set.NodeId"
	 *        extendedMetaData="kind='attribute' name='ParentNodeId'"
	 * @generated
	 */
	String getParentNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAInstance#getParentNodeId <em>Parent Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Node Id</em>' attribute.
	 * @see #getParentNodeId()
	 * @generated
	 */
	void setParentNodeId(String value);

} // UAInstance
