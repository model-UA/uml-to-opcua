/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfQualifiedName#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfQualifiedName()
 * @model extendedMetaData="name='ListOfQualifiedName' kind='elementOnly'"
 * @generated
 */
public interface ListOfQualifiedName extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.QualifiedName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfQualifiedName_QualifiedName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QualifiedName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QualifiedName> getQualifiedName();

} // ListOfQualifiedName
