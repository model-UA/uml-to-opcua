/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Node Type Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfNodeTypeDescription#getNodeTypeDescription <em>Node Type Description</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfNodeTypeDescription()
 * @model extendedMetaData="name='ListOfNodeTypeDescription' kind='elementOnly'"
 * @generated
 */
public interface ListOfNodeTypeDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Type Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.NodeTypeDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type Description</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfNodeTypeDescription_NodeTypeDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NodeTypeDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NodeTypeDescription> getNodeTypeDescription();

} // ListOfNodeTypeDescription
