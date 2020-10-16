/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Reader Group Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfReaderGroupDataType#getReaderGroupDataType <em>Reader Group Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfReaderGroupDataType()
 * @model extendedMetaData="name='ListOfReaderGroupDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfReaderGroupDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Reader Group Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ReaderGroupDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader Group Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfReaderGroupDataType_ReaderGroupDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReaderGroupDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReaderGroupDataType> getReaderGroupDataType();

} // ListOfReaderGroupDataType
