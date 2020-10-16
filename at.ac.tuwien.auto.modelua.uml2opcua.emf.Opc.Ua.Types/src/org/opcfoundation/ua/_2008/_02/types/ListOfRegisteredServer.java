/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Registered Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ListOfRegisteredServer#getRegisteredServer <em>Registered Server</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfRegisteredServer()
 * @model extendedMetaData="name='ListOfRegisteredServer' kind='elementOnly'"
 * @generated
 */
public interface ListOfRegisteredServer extends EObject {
	/**
	 * Returns the value of the '<em><b>Registered Server</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2008._02.types.RegisteredServer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Server</em>' containment reference list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getListOfRegisteredServer_RegisteredServer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RegisteredServer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RegisteredServer> getRegisteredServer();

} // ListOfRegisteredServer
