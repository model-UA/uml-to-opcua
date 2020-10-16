/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.TranslationType#getText <em>Text</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.TranslationType#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getTranslationType()
 * @model extendedMetaData="name='TranslationType' kind='elementOnly'"
 * @generated
 */
public interface TranslationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2011._03.ua.node.set.LocalizedText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference list.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getTranslationType_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Text' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocalizedText> getText();

	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2011._03.ua.node.set.StructureTranslationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getTranslationType_Field()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Field' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructureTranslationType> getField();

} // TranslationType
