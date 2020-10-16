/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Pub Sub State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfPubSubState#getPubSubState <em>Pub Sub State</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfPubSubState()
 * @model extendedMetaData="name='ListOfPubSubState' kind='elementOnly'"
 * @generated
 */
public interface ListOfPubSubState extends EObject {
	/**
	 * Returns the value of the '<em><b>Pub Sub State</b></em>' attribute list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.PubSubState}.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.PubSubState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub Sub State</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.PubSubState
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfPubSubState_PubSubState()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='PubSubState' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PubSubState> getPubSubState();

} // ListOfPubSubState
