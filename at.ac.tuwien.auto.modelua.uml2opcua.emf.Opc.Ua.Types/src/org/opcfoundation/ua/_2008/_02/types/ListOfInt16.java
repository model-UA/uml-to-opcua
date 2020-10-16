/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Int16</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfInt16#getInt16 <em>Int16</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfInt16()
 * @model extendedMetaData="name='ListOfInt16' kind='elementOnly'"
 * @generated
 */
public interface ListOfInt16 extends EObject {
	/**
	 * Returns the value of the '<em><b>Int16</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Short}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int16</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfInt16_Int16()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Short"
	 *        extendedMetaData="kind='element' name='Int16' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Short> getInt16();

} // ListOfInt16
