/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find Servers On Network Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkResponse#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkResponse#getLastCounterResetTime <em>Last Counter Reset Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkResponse#getServers <em>Servers</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFindServersOnNetworkResponse()
 * @model extendedMetaData="name='FindServersOnNetworkResponse' kind='elementOnly'"
 * @generated
 */
public interface FindServersOnNetworkResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Header</em>' containment reference.
	 * @see #isSetResponseHeader()
	 * @see #unsetResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFindServersOnNetworkResponse_ResponseHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ResponseHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseHeader getResponseHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkResponse#getResponseHeader <em>Response Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkResponse#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponseHeader()
	 * @see #getResponseHeader()
	 * @see #setResponseHeader(ResponseHeader)
	 * @generated
	 */
	void unsetResponseHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkResponse#getResponseHeader <em>Response Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Last Counter Reset Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Counter Reset Time</em>' attribute.
	 * @see #setLastCounterResetTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFindServersOnNetworkResponse_LastCounterResetTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastCounterResetTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLastCounterResetTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkResponse#getLastCounterResetTime <em>Last Counter Reset Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Counter Reset Time</em>' attribute.
	 * @see #getLastCounterResetTime()
	 * @generated
	 */
	void setLastCounterResetTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Servers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' containment reference.
	 * @see #isSetServers()
	 * @see #unsetServers()
	 * @see #setServers(ListOfServerOnNetwork)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getFindServersOnNetworkResponse_Servers()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Servers' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfServerOnNetwork getServers();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkResponse#getServers <em>Servers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servers</em>' containment reference.
	 * @see #isSetServers()
	 * @see #unsetServers()
	 * @see #getServers()
	 * @generated
	 */
	void setServers(ListOfServerOnNetwork value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkResponse#getServers <em>Servers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServers()
	 * @see #getServers()
	 * @see #setServers(ListOfServerOnNetwork)
	 * @generated
	 */
	void unsetServers();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.FindServersOnNetworkResponse#getServers <em>Servers</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Servers</em>' containment reference is set.
	 * @see #unsetServers()
	 * @see #getServers()
	 * @see #setServers(ListOfServerOnNetwork)
	 * @generated
	 */
	boolean isSetServers();

} // FindServersOnNetworkResponse
