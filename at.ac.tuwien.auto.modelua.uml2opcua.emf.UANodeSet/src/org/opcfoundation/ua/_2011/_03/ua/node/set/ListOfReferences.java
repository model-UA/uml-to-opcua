/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of References</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.ListOfReferences#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getListOfReferences()
 * @model extendedMetaData="name='ListOfReferences' kind='elementOnly'"
 * @generated
 */
public interface ListOfReferences extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2011._03.ua.node.set.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getListOfReferences_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Reference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getReference();

} // ListOfReferences
