/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Relative Path Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfRelativePathElement#getRelativePathElement <em>Relative Path Element</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfRelativePathElement()
 * @model extendedMetaData="name='ListOfRelativePathElement' kind='elementOnly'"
 * @generated
 */
public interface ListOfRelativePathElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Relative Path Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.RelativePathElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Path Element</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfRelativePathElement_RelativePathElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RelativePathElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelativePathElement> getRelativePathElement();

} // ListOfRelativePathElement
