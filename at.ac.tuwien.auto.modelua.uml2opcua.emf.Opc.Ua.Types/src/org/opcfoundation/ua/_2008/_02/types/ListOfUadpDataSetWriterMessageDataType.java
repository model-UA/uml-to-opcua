/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Uadp Data Set Writer Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetWriterMessageDataType#getUadpDataSetWriterMessageDataType <em>Uadp Data Set Writer Message Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUadpDataSetWriterMessageDataType()
 * @model extendedMetaData="name='ListOfUadpDataSetWriterMessageDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfUadpDataSetWriterMessageDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Uadp Data Set Writer Message Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uadp Data Set Writer Message Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUadpDataSetWriterMessageDataType_UadpDataSetWriterMessageDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UadpDataSetWriterMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UadpDataSetWriterMessageDataType> getUadpDataSetWriterMessageDataType();

} // ListOfUadpDataSetWriterMessageDataType
