/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of SByte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfSByte#getSByte <em>SByte</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSByte()
 * @model extendedMetaData="name='ListOfSByte' kind='elementOnly'"
 * @generated
 */
public interface ListOfSByte extends EObject {
	/**
	 * Returns the value of the '<em><b>SByte</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Byte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SByte</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfSByte_SByte()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='element' name='SByte' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Byte> getSByte();

} // ListOfSByte
