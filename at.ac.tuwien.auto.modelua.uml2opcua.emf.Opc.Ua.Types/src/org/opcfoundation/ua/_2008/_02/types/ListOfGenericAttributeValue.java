/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Generic Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfGenericAttributeValue#getGenericAttributeValue <em>Generic Attribute Value</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfGenericAttributeValue()
 * @model extendedMetaData="name='ListOfGenericAttributeValue' kind='elementOnly'"
 * @generated
 */
public interface ListOfGenericAttributeValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Generic Attribute Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.GenericAttributeValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Attribute Value</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfGenericAttributeValue_GenericAttributeValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GenericAttributeValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericAttributeValue> getGenericAttributeValue();

} // ListOfGenericAttributeValue
