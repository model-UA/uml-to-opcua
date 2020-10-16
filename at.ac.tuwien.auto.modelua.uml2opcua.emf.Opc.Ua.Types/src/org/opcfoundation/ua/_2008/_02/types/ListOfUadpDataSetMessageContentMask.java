/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Uadp Data Set Message Content Mask</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetMessageContentMask#getUadpDataSetMessageContentMask <em>Uadp Data Set Message Content Mask</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUadpDataSetMessageContentMask()
 * @model extendedMetaData="name='ListOfUadpDataSetMessageContentMask' kind='elementOnly'"
 * @generated
 */
public interface ListOfUadpDataSetMessageContentMask extends EObject {
	/**
	 * Returns the value of the '<em><b>Uadp Data Set Message Content Mask</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uadp Data Set Message Content Mask</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUadpDataSetMessageContentMask_UadpDataSetMessageContentMask()
	 * @model unique="false" dataType="org.opcfoundation.ua._2008._02.types.UadpDataSetMessageContentMask"
	 *        extendedMetaData="kind='element' name='UadpDataSetMessageContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Long> getUadpDataSetMessageContentMask();

} // ListOfUadpDataSetMessageContentMask
