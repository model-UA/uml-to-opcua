/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Node Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfNodeReference#getNodeReference <em>Node Reference</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfNodeReference()
 * @model extendedMetaData="name='ListOfNodeReference' kind='elementOnly'"
 * @generated
 */
public interface ListOfNodeReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.NodeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Reference</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfNodeReference_NodeReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NodeReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NodeReference> getNodeReference();

} // ListOfNodeReference
