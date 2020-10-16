/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Guid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfGuid#getGuid <em>Guid</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfGuid()
 * @model extendedMetaData="name='ListOfGuid' kind='elementOnly'"
 * @generated
 */
public interface ListOfGuid extends EObject {
	/**
	 * Returns the value of the '<em><b>Guid</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.Guid}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guid</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfGuid_Guid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Guid' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Guid> getGuid();

} // ListOfGuid
