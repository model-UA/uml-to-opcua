/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Writer Group Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfWriterGroupTransportDataType#getWriterGroupTransportDataType <em>Writer Group Transport Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfWriterGroupTransportDataType()
 * @model extendedMetaData="name='ListOfWriterGroupTransportDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfWriterGroupTransportDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Writer Group Transport Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.WriterGroupTransportDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writer Group Transport Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfWriterGroupTransportDataType_WriterGroupTransportDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WriterGroupTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WriterGroupTransportDataType> getWriterGroupTransportDataType();

} // ListOfWriterGroupTransportDataType
