/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Trust List Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfTrustListDataType#getTrustListDataType <em>Trust List Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfTrustListDataType()
 * @model extendedMetaData="name='ListOfTrustListDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfTrustListDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Trust List Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.TrustListDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trust List Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfTrustListDataType_TrustListDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TrustListDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TrustListDataType> getTrustListDataType();

} // ListOfTrustListDataType
