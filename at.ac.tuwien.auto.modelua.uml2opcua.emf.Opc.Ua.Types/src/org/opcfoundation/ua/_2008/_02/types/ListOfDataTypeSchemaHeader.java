/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Data Type Schema Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfDataTypeSchemaHeader#getDataTypeSchemaHeader <em>Data Type Schema Header</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataTypeSchemaHeader()
 * @model extendedMetaData="name='ListOfDataTypeSchemaHeader' kind='elementOnly'"
 * @generated
 */
public interface ListOfDataTypeSchemaHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Type Schema Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Schema Header</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataTypeSchemaHeader_DataTypeSchemaHeader()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataTypeSchemaHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataTypeSchemaHeader> getDataTypeSchemaHeader();

} // ListOfDataTypeSchemaHeader
