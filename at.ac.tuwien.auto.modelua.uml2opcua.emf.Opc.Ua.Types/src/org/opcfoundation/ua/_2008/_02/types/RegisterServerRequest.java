/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register Server Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RegisterServerRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.RegisterServerRequest#getServer <em>Server</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisterServerRequest()
 * @model extendedMetaData="name='RegisterServerRequest' kind='elementOnly'"
 * @generated
 */
public interface RegisterServerRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisterServerRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterServerRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #getRequestHeader()
	 * @generated
	 */
	void setRequestHeader(RequestHeader value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterServerRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterServerRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Request Header</em>' containment reference is set.
	 * @see #unsetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	boolean isSetRequestHeader();

	/**
	 * Returns the value of the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' containment reference.
	 * @see #isSetServer()
	 * @see #unsetServer()
	 * @see #setServer(RegisteredServer)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getRegisterServerRequest_Server()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Server' namespace='##targetNamespace'"
	 * @generated
	 */
	RegisteredServer getServer();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterServerRequest#getServer <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' containment reference.
	 * @see #isSetServer()
	 * @see #unsetServer()
	 * @see #getServer()
	 * @generated
	 */
	void setServer(RegisteredServer value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterServerRequest#getServer <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServer()
	 * @see #getServer()
	 * @see #setServer(RegisteredServer)
	 * @generated
	 */
	void unsetServer();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.RegisterServerRequest#getServer <em>Server</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server</em>' containment reference is set.
	 * @see #unsetServer()
	 * @see #getServer()
	 * @see #setServer(RegisteredServer)
	 * @generated
	 */
	boolean isSetServer();

} // RegisterServerRequest
