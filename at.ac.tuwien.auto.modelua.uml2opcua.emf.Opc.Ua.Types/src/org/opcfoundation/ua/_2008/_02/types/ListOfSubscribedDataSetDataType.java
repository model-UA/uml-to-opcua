/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Subscribed Data Set Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfSubscribedDataSetDataType#getSubscribedDataSetDataType <em>Subscribed Data Set Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSubscribedDataSetDataType()
 * @model extendedMetaData="name='ListOfSubscribedDataSetDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfSubscribedDataSetDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Subscribed Data Set Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.SubscribedDataSetDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribed Data Set Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSubscribedDataSetDataType_SubscribedDataSetDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubscribedDataSetDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubscribedDataSetDataType> getSubscribedDataSetDataType();

} // ListOfSubscribedDataSetDataType
