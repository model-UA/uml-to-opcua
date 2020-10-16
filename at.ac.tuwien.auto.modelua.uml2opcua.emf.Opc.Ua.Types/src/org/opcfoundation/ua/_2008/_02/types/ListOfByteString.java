/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Byte String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfByteString#getByteString <em>Byte String</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfByteString()
 * @model extendedMetaData="name='ListOfByteString' kind='elementOnly'"
 * @generated
 */
public interface ListOfByteString extends EObject {
	/**
	 * Returns the value of the '<em><b>Byte String</b></em>' attribute list.
	 * The list contents are of type {@link byte}<code>[]</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte String</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfByteString_ByteString()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='ByteString' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<byte[]> getByteString();

} // ListOfByteString
