/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Modification Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfModificationInfo#getModificationInfo <em>Modification Info</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfModificationInfo()
 * @model extendedMetaData="name='ListOfModificationInfo' kind='elementOnly'"
 * @generated
 */
public interface ListOfModificationInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Modification Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ModificationInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification Info</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfModificationInfo_ModificationInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ModificationInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModificationInfo> getModificationInfo();

} // ListOfModificationInfo
