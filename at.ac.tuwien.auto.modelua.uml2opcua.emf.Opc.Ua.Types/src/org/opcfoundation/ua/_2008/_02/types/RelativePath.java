/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RelativePath#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRelativePath()
 * @model extendedMetaData="name='RelativePath' kind='elementOnly'"
 * @generated
 */
public interface RelativePath extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference.
	 * @see #isSetElements()
	 * @see #unsetElements()
	 * @see #setElements(ListOfRelativePathElement)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRelativePath_Elements()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Elements' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfRelativePathElement getElements();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RelativePath#getElements <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements</em>' containment reference.
	 * @see #isSetElements()
	 * @see #unsetElements()
	 * @see #getElements()
	 * @generated
	 */
	void setElements(ListOfRelativePathElement value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RelativePath#getElements <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElements()
	 * @see #getElements()
	 * @see #setElements(ListOfRelativePathElement)
	 * @generated
	 */
	void unsetElements();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RelativePath#getElements <em>Elements</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elements</em>' containment reference is set.
	 * @see #unsetElements()
	 * @see #getElements()
	 * @see #setElements(ListOfRelativePathElement)
	 * @generated
	 */
	boolean isSetElements();

} // RelativePath
