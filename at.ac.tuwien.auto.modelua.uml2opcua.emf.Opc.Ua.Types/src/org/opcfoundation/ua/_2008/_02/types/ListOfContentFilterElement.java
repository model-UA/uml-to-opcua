/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Content Filter Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfContentFilterElement#getContentFilterElement <em>Content Filter Element</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfContentFilterElement()
 * @model extendedMetaData="name='ListOfContentFilterElement' kind='elementOnly'"
 * @generated
 */
public interface ListOfContentFilterElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Content Filter Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ContentFilterElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Filter Element</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfContentFilterElement_ContentFilterElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContentFilterElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContentFilterElement> getContentFilterElement();

} // ListOfContentFilterElement
