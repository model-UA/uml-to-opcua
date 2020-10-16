/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Subscription Diagnostics Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfSubscriptionDiagnosticsDataType#getSubscriptionDiagnosticsDataType <em>Subscription Diagnostics Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSubscriptionDiagnosticsDataType()
 * @model extendedMetaData="name='ListOfSubscriptionDiagnosticsDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfSubscriptionDiagnosticsDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Subscription Diagnostics Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Diagnostics Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSubscriptionDiagnosticsDataType_SubscriptionDiagnosticsDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubscriptionDiagnosticsDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubscriptionDiagnosticsDataType> getSubscriptionDiagnosticsDataType();

} // ListOfSubscriptionDiagnosticsDataType
