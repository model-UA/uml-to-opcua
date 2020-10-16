/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Content Filter Element Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfContentFilterElementResult#getContentFilterElementResult <em>Content Filter Element Result</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfContentFilterElementResult()
 * @model extendedMetaData="name='ListOfContentFilterElementResult' kind='elementOnly'"
 * @generated
 */
public interface ListOfContentFilterElementResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Content Filter Element Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ContentFilterElementResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Filter Element Result</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfContentFilterElementResult_ContentFilterElementResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContentFilterElementResult' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContentFilterElementResult> getContentFilterElementResult();

} // ListOfContentFilterElementResult
