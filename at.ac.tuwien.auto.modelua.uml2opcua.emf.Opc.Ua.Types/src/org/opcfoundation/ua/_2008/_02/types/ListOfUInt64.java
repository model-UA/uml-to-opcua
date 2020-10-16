/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of UInt64</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfUInt64#getUInt64 <em>UInt64</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUInt64()
 * @model extendedMetaData="name='ListOfUInt64' kind='elementOnly'"
 * @generated
 */
public interface ListOfUInt64 extends EObject {
	/**
	 * Returns the value of the '<em><b>UInt64</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UInt64</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUInt64_UInt64()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='element' name='UInt64' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigInteger> getUInt64();

} // ListOfUInt64
