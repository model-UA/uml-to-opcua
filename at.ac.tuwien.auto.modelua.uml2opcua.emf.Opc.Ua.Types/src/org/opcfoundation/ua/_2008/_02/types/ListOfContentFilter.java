/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Content Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfContentFilter#getContentFilter <em>Content Filter</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfContentFilter()
 * @model extendedMetaData="name='ListOfContentFilter' kind='elementOnly'"
 * @generated
 */
public interface ListOfContentFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Content Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ContentFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Filter</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfContentFilter_ContentFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContentFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContentFilter> getContentFilter();

} // ListOfContentFilter
