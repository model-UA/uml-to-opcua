/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Uadp Writer Group Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfUadpWriterGroupMessageDataType#getUadpWriterGroupMessageDataType <em>Uadp Writer Group Message Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUadpWriterGroupMessageDataType()
 * @model extendedMetaData="name='ListOfUadpWriterGroupMessageDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfUadpWriterGroupMessageDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Uadp Writer Group Message Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uadp Writer Group Message Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUadpWriterGroupMessageDataType_UadpWriterGroupMessageDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UadpWriterGroupMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UadpWriterGroupMessageDataType> getUadpWriterGroupMessageDataType();

} // ListOfUadpWriterGroupMessageDataType
