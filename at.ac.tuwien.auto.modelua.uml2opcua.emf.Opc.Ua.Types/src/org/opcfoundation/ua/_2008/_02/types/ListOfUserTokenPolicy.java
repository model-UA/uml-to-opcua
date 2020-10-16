/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of User Token Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfUserTokenPolicy#getUserTokenPolicy <em>User Token Policy</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUserTokenPolicy()
 * @model extendedMetaData="name='ListOfUserTokenPolicy' kind='elementOnly'"
 * @generated
 */
public interface ListOfUserTokenPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>User Token Policy</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Token Policy</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUserTokenPolicy_UserTokenPolicy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UserTokenPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UserTokenPolicy> getUserTokenPolicy();

} // ListOfUserTokenPolicy
