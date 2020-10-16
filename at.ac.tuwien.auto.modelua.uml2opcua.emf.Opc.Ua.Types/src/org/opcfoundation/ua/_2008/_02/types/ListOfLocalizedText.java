/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Localized Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfLocalizedText#getLocalizedText <em>Localized Text</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfLocalizedText()
 * @model extendedMetaData="name='ListOfLocalizedText' kind='elementOnly'"
 * @generated
 */
public interface ListOfLocalizedText extends EObject {
	/**
	 * Returns the value of the '<em><b>Localized Text</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.LocalizedText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localized Text</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfLocalizedText_LocalizedText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocalizedText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocalizedText> getLocalizedText();

} // ListOfLocalizedText
