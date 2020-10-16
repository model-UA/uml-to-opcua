/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Extension Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfExtensionObject#getExtensionObject <em>Extension Object</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfExtensionObject()
 * @model extendedMetaData="name='ListOfExtensionObject' kind='elementOnly'"
 * @generated
 */
public interface ListOfExtensionObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Extension Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ExtensionObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Object</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfExtensionObject_ExtensionObject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExtensionObject' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExtensionObject> getExtensionObject();

} // ListOfExtensionObject
