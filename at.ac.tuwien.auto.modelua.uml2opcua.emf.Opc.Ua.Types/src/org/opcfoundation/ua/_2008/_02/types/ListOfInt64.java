/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Int64</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfInt64#getInt64 <em>Int64</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfInt64()
 * @model extendedMetaData="name='ListOfInt64' kind='elementOnly'"
 * @generated
 */
public interface ListOfInt64 extends EObject {
	/**
	 * Returns the value of the '<em><b>Int64</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int64</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfInt64_Int64()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='Int64' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Long> getInt64();

} // ListOfInt64
