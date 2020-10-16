/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ContentFilter#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getContentFilter()
 * @model extendedMetaData="name='ContentFilter' kind='elementOnly'"
 * @generated
 */
public interface ContentFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference.
	 * @see #isSetElements()
	 * @see #unsetElements()
	 * @see #setElements(ListOfContentFilterElement)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getContentFilter_Elements()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Elements' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfContentFilterElement getElements();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilter#getElements <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements</em>' containment reference.
	 * @see #isSetElements()
	 * @see #unsetElements()
	 * @see #getElements()
	 * @generated
	 */
	void setElements(ListOfContentFilterElement value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilter#getElements <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElements()
	 * @see #getElements()
	 * @see #setElements(ListOfContentFilterElement)
	 * @generated
	 */
	void unsetElements();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ContentFilter#getElements <em>Elements</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elements</em>' containment reference is set.
	 * @see #unsetElements()
	 * @see #getElements()
	 * @see #setElements(ListOfContentFilterElement)
	 * @generated
	 */
	boolean isSetElements();

} // ContentFilter
