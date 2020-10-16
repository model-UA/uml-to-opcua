/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Reference Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfReferenceDescription#getReferenceDescription <em>Reference Description</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfReferenceDescription()
 * @model extendedMetaData="name='ListOfReferenceDescription' kind='elementOnly'"
 * @generated
 */
public interface ListOfReferenceDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ReferenceDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Description</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfReferenceDescription_ReferenceDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferenceDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReferenceDescription> getReferenceDescription();

} // ListOfReferenceDescription
