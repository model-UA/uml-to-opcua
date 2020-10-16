/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Application Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfApplicationDescription#getApplicationDescription <em>Application Description</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfApplicationDescription()
 * @model extendedMetaData="name='ListOfApplicationDescription' kind='elementOnly'"
 * @generated
 */
public interface ListOfApplicationDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Application Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ApplicationDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Description</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfApplicationDescription_ApplicationDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ApplicationDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ApplicationDescription> getApplicationDescription();

} // ListOfApplicationDescription
