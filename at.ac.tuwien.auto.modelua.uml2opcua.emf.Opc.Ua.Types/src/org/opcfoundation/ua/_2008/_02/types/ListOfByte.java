/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Byte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfByte#getByte <em>Byte</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfByte()
 * @model extendedMetaData="name='ListOfByte' kind='elementOnly'"
 * @generated
 */
public interface ListOfByte extends EObject {
	/**
	 * Returns the value of the '<em><b>Byte</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Short}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfByte_Byte()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='element' name='Byte' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Short> getByte();

} // ListOfByte
