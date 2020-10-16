/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Pub Sub Group Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfPubSubGroupDataType#getPubSubGroupDataType <em>Pub Sub Group Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfPubSubGroupDataType()
 * @model extendedMetaData="name='ListOfPubSubGroupDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfPubSubGroupDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pub Sub Group Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.PubSubGroupDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub Sub Group Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfPubSubGroupDataType_PubSubGroupDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PubSubGroupDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PubSubGroupDataType> getPubSubGroupDataType();

} // ListOfPubSubGroupDataType
