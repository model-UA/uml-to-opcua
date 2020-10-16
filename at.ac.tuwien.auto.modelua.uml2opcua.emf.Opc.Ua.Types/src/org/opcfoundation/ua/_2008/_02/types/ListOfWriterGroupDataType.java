/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Writer Group Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfWriterGroupDataType#getWriterGroupDataType <em>Writer Group Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfWriterGroupDataType()
 * @model extendedMetaData="name='ListOfWriterGroupDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfWriterGroupDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Writer Group Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.WriterGroupDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writer Group Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfWriterGroupDataType_WriterGroupDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WriterGroupDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WriterGroupDataType> getWriterGroupDataType();

} // ListOfWriterGroupDataType
