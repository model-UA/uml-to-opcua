/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of UInt16</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfUInt16#getUInt16 <em>UInt16</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUInt16()
 * @model extendedMetaData="name='ListOfUInt16' kind='elementOnly'"
 * @generated
 */
public interface ListOfUInt16 extends EObject {
	/**
	 * Returns the value of the '<em><b>UInt16</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UInt16</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUInt16_UInt16()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='element' name='UInt16' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Integer> getUInt16();

} // ListOfUInt16
