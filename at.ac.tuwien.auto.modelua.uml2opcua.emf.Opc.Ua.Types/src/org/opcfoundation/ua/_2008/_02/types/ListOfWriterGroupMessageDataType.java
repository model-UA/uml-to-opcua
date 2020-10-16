/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Writer Group Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfWriterGroupMessageDataType#getWriterGroupMessageDataType <em>Writer Group Message Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfWriterGroupMessageDataType()
 * @model extendedMetaData="name='ListOfWriterGroupMessageDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfWriterGroupMessageDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Writer Group Message Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.WriterGroupMessageDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writer Group Message Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfWriterGroupMessageDataType_WriterGroupMessageDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WriterGroupMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WriterGroupMessageDataType> getWriterGroupMessageDataType();

} // ListOfWriterGroupMessageDataType
