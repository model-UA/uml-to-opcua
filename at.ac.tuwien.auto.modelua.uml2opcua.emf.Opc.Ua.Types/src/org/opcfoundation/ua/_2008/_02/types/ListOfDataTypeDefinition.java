/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Data Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfDataTypeDefinition#getDataTypeDefinition <em>Data Type Definition</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataTypeDefinition()
 * @model extendedMetaData="name='ListOfDataTypeDefinition' kind='elementOnly'"
 * @generated
 */
public interface ListOfDataTypeDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Type Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.DataTypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Definition</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfDataTypeDefinition_DataTypeDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataTypeDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataTypeDefinition> getDataTypeDefinition();

} // ListOfDataTypeDefinition
