/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Add Nodes Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfAddNodesResult#getAddNodesResult <em>Add Nodes Result</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfAddNodesResult()
 * @model extendedMetaData="name='ListOfAddNodesResult' kind='elementOnly'"
 * @generated
 */
public interface ListOfAddNodesResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Add Nodes Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.AddNodesResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Nodes Result</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfAddNodesResult_AddNodesResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddNodesResult' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddNodesResult> getAddNodesResult();

} // ListOfAddNodesResult
