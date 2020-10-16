/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Uadp Network Message Content Mask</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfUadpNetworkMessageContentMask#getUadpNetworkMessageContentMask <em>Uadp Network Message Content Mask</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUadpNetworkMessageContentMask()
 * @model extendedMetaData="name='ListOfUadpNetworkMessageContentMask' kind='elementOnly'"
 * @generated
 */
public interface ListOfUadpNetworkMessageContentMask extends EObject {
	/**
	 * Returns the value of the '<em><b>Uadp Network Message Content Mask</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uadp Network Message Content Mask</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfUadpNetworkMessageContentMask_UadpNetworkMessageContentMask()
	 * @model unique="false" dataType="org.opcfoundation.ua._2008._02.types.UadpNetworkMessageContentMask"
	 *        extendedMetaData="kind='element' name='UadpNetworkMessageContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Long> getUadpNetworkMessageContentMask();

} // ListOfUadpNetworkMessageContentMask
