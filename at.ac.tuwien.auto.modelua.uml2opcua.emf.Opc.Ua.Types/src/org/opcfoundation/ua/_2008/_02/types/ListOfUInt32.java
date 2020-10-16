/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of UInt32</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfUInt32#getUInt32 <em>UInt32</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUInt32()
 * @model extendedMetaData="name='ListOfUInt32' kind='elementOnly'"
 * @generated
 */
public interface ListOfUInt32 extends EObject {
	/**
	 * Returns the value of the '<em><b>UInt32</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UInt32</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUInt32_UInt32()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='UInt32' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Long> getUInt32();

} // ListOfUInt32
