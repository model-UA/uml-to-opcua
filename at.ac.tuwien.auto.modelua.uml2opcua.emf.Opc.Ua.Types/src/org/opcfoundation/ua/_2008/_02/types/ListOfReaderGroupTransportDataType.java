/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Reader Group Transport Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfReaderGroupTransportDataType#getReaderGroupTransportDataType <em>Reader Group Transport Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfReaderGroupTransportDataType()
 * @model extendedMetaData="name='ListOfReaderGroupTransportDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfReaderGroupTransportDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Reader Group Transport Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ReaderGroupTransportDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader Group Transport Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfReaderGroupTransportDataType_ReaderGroupTransportDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReaderGroupTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReaderGroupTransportDataType> getReaderGroupTransportDataType();

} // ListOfReaderGroupTransportDataType
