/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.AliasTable#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getAliasTable()
 * @model extendedMetaData="name='AliasTable' kind='elementOnly'"
 * @generated
 */
public interface AliasTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2011._03.ua.node.set.NodeIdAlias}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference list.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getAliasTable_Alias()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Alias' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NodeIdAlias> getAlias();

} // AliasTable
