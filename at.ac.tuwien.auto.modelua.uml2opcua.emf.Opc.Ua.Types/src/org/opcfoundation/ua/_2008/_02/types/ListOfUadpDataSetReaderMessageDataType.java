/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Uadp Data Set Reader Message Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetReaderMessageDataType#getUadpDataSetReaderMessageDataType <em>Uadp Data Set Reader Message Data Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUadpDataSetReaderMessageDataType()
 * @model extendedMetaData="name='ListOfUadpDataSetReaderMessageDataType' kind='elementOnly'"
 * @generated
 */
public interface ListOfUadpDataSetReaderMessageDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Uadp Data Set Reader Message Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uadp Data Set Reader Message Data Type</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUadpDataSetReaderMessageDataType_UadpDataSetReaderMessageDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UadpDataSetReaderMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UadpDataSetReaderMessageDataType> getUadpDataSetReaderMessageDataType();

} // ListOfUadpDataSetReaderMessageDataType
