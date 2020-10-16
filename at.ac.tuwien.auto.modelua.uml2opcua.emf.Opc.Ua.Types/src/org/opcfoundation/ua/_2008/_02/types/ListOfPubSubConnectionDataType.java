/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Pub Sub Connection Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfPubSubConnectionDataType#getPubSubConnectionDataType <em>Pub Sub Connection Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfPubSubConnectionDataType()
 * @model extendedMetaData="name='ListOfPubSubConnectionDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfPubSubConnectionDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pub Sub Connection Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub Sub Connection Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfPubSubConnectionDataType_PubSubConnectionDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PubSubConnectionDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PubSubConnectionDataType> getPubSubConnectionDataType();

} // ListOfPubSubConnectionDataType
