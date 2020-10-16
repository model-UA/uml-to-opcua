/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Reference Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfReferenceNode#getReferenceNode <em>Reference Node</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfReferenceNode()
 * @model extendedMetaData="name='ListOfReferenceNode' kind='elementOnly'"
 * @generated
 */
public interface ListOfReferenceNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ReferenceNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Node</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfReferenceNode_ReferenceNode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferenceNode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReferenceNode> getReferenceNode();

} // ListOfReferenceNode
