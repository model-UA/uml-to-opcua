/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Reader Group Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfReaderGroupMessageDataType#getReaderGroupMessageDataType <em>Reader Group Message Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfReaderGroupMessageDataType()
 * @model extendedMetaData="name='ListOfReaderGroupMessageDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfReaderGroupMessageDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Reader Group Message Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ReaderGroupMessageDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader Group Message Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfReaderGroupMessageDataType_ReaderGroupMessageDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReaderGroupMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReaderGroupMessageDataType> getReaderGroupMessageDataType();

} // ListOfReaderGroupMessageDataType
