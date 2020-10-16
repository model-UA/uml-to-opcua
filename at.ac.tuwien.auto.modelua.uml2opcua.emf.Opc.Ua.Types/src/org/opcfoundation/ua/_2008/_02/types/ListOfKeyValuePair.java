/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Key Value Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfKeyValuePair#getKeyValuePair <em>Key Value Pair</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfKeyValuePair()
 * @model extendedMetaData="name='ListOfKeyValuePair' kind='elementOnly'"
 * @generated
 */
public interface ListOfKeyValuePair extends EObject {
	/**
	 * Returns the value of the '<em><b>Key Value Pair</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Value Pair</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfKeyValuePair_KeyValuePair()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='KeyValuePair' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KeyValuePair> getKeyValuePair();

} // ListOfKeyValuePair
