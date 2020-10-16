/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find Servers Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FindServersResponse#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FindServersResponse#getServers <em>Servers</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFindServersResponse()
 * @model extendedMetaData="name='FindServersResponse' kind='elementOnly'"
 * @generated
 */
public interface FindServersResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFindServersResponse_ResponseHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ResponseHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseHeader getResponseHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersResponse#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #getResponseHeader()
	 * @generated
	 */
	void setResponseHeader(ResponseHeader value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersResponse#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	void unsetResponseHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersResponse#getResponseHeader <em>Response Header</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Response Header</em>' containment reference is set.
	 * @see #unsetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	boolean isSetResponseHeader();

	/**
	 * Returns the value of the '<em><b>Servers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' containment reference.
	 * @see #isSetServers()
	 * @see #unsetServers()
	 * @see #setServers(ListOfApplicationDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFindServersResponse_Servers()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Servers' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfApplicationDescription getServers();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersResponse#getServers <em>Servers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servers</em>' containment reference.
	 * @see #isSetServers()
	 * @see #unsetServers()
	 * @see #getServers()
	 * @generated
	 */
	void setServers(ListOfApplicationDescription value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersResponse#getServers <em>Servers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServers()
	 * @see #getServers()
	 * @see #setServers(ListOfApplicationDescription)
	 * @generated
	 */
	void unsetServers();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersResponse#getServers <em>Servers</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Servers</em>' containment reference is set.
	 * @see #unsetServers()
	 * @see #getServers()
	 * @see #setServers(ListOfApplicationDescription)
	 * @generated
	 */
	boolean isSetServers();

} // FindServersResponse
