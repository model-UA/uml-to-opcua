/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Query Data Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfQueryDataDescription#getQueryDataDescription <em>Query Data Description</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfQueryDataDescription()
 * @model extendedMetaData="name='ListOfQueryDataDescription' kind='elementOnly'"
 * @generated
 */
public interface ListOfQueryDataDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Query Data Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.QueryDataDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Data Description</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfQueryDataDescription_QueryDataDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QueryDataDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QueryDataDescription> getQueryDataDescription();

} // ListOfQueryDataDescription
