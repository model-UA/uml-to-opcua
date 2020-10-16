/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Write Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfWriteValue#getWriteValue <em>Write Value</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfWriteValue()
 * @model extendedMetaData="name='ListOfWriteValue' kind='elementOnly'"
 * @generated
 */
public interface ListOfWriteValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Write Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.WriteValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Value</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfWriteValue_WriteValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WriteValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WriteValue> getWriteValue();

} // ListOfWriteValue
