/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Signed Software Certificate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfSignedSoftwareCertificate#getSignedSoftwareCertificate <em>Signed Software Certificate</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSignedSoftwareCertificate()
 * @model extendedMetaData="name='ListOfSignedSoftwareCertificate' kind='elementOnly'"
 * @generated
 */
public interface ListOfSignedSoftwareCertificate extends EObject {
	/**
	 * Returns the value of the '<em><b>Signed Software Certificate</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.SignedSoftwareCertificate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signed Software Certificate</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSignedSoftwareCertificate_SignedSoftwareCertificate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SignedSoftwareCertificate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SignedSoftwareCertificate> getSignedSoftwareCertificate();

} // ListOfSignedSoftwareCertificate
