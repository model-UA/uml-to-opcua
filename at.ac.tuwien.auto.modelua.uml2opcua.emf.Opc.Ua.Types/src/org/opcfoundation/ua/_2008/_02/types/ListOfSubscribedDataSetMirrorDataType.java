/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Subscribed Data Set Mirror Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfSubscribedDataSetMirrorDataType#getSubscribedDataSetMirrorDataType <em>Subscribed Data Set Mirror Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSubscribedDataSetMirrorDataType()
 * @model extendedMetaData="name='ListOfSubscribedDataSetMirrorDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfSubscribedDataSetMirrorDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Subscribed Data Set Mirror Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.SubscribedDataSetMirrorDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribed Data Set Mirror Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSubscribedDataSetMirrorDataType_SubscribedDataSetMirrorDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubscribedDataSetMirrorDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubscribedDataSetMirrorDataType> getSubscribedDataSetMirrorDataType();

} // ListOfSubscribedDataSetMirrorDataType
