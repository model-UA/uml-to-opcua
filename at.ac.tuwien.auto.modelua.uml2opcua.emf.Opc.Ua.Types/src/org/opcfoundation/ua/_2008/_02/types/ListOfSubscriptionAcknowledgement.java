/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Subscription Acknowledgement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfSubscriptionAcknowledgement#getSubscriptionAcknowledgement <em>Subscription Acknowledgement</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSubscriptionAcknowledgement()
 * @model extendedMetaData="name='ListOfSubscriptionAcknowledgement' kind='elementOnly'"
 * @generated
 */
public interface ListOfSubscriptionAcknowledgement extends EObject {
	/**
	 * Returns the value of the '<em><b>Subscription Acknowledgement</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.SubscriptionAcknowledgement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Acknowledgement</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSubscriptionAcknowledgement_SubscriptionAcknowledgement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubscriptionAcknowledgement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubscriptionAcknowledgement> getSubscriptionAcknowledgement();

} // ListOfSubscriptionAcknowledgement
