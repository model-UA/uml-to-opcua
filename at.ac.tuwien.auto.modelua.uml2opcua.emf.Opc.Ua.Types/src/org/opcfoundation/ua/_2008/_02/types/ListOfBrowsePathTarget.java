/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Browse Path Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfBrowsePathTarget#getBrowsePathTarget <em>Browse Path Target</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrowsePathTarget()
 * @model extendedMetaData="name='ListOfBrowsePathTarget' kind='elementOnly'"
 * @generated
 */
public interface ListOfBrowsePathTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Browse Path Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.BrowsePathTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Path Target</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfBrowsePathTarget_BrowsePathTarget()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BrowsePathTarget' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BrowsePathTarget> getBrowsePathTarget();

} // ListOfBrowsePathTarget
