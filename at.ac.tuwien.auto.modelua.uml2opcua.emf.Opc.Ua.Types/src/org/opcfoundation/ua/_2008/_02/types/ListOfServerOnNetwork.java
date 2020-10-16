/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Server On Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfServerOnNetwork#getServerOnNetwork <em>Server On Network</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfServerOnNetwork()
 * @model extendedMetaData="name='ListOfServerOnNetwork' kind='elementOnly'"
 * @generated
 */
public interface ListOfServerOnNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Server On Network</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server On Network</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfServerOnNetwork_ServerOnNetwork()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ServerOnNetwork' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServerOnNetwork> getServerOnNetwork();

} // ListOfServerOnNetwork
