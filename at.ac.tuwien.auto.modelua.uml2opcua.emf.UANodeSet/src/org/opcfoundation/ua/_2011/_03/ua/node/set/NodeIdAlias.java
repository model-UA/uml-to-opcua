/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Id Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeIdAlias#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeIdAlias#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getNodeIdAlias()
 * @model extendedMetaData="name='NodeIdAlias' kind='simple'"
 * @generated
 */
public interface NodeIdAlias extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getNodeIdAlias_Value()
	 * @model dataType="org.opcfoundation.ua._2011._03.ua.node.set.NodeId"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeIdAlias#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getNodeIdAlias_Alias()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Alias'"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.NodeIdAlias#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

} // NodeIdAlias
