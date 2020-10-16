/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sessionless Invoke Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeResponseType#getNamespaceUris <em>Namespace Uris</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeResponseType#getServerUris <em>Server Uris</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeResponseType#getServiceId <em>Service Id</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionlessInvokeResponseType()
 * @model extendedMetaData="name='SessionlessInvokeResponseType' kind='elementOnly'"
 * @generated
 */
public interface SessionlessInvokeResponseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespace Uris</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Uris</em>' containment reference.
	 * @see #isSetNamespaceUris()
	 * @see #unsetNamespaceUris()
	 * @see #setNamespaceUris(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionlessInvokeResponseType_NamespaceUris()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NamespaceUris' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getNamespaceUris();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeResponseType#getNamespaceUris <em>Namespace Uris</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Uris</em>' containment reference.
	 * @see #isSetNamespaceUris()
	 * @see #unsetNamespaceUris()
	 * @see #getNamespaceUris()
	 * @generated
	 */
	void setNamespaceUris(ListOfString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeResponseType#getNamespaceUris <em>Namespace Uris</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNamespaceUris()
	 * @see #getNamespaceUris()
	 * @see #setNamespaceUris(ListOfString)
	 * @generated
	 */
	void unsetNamespaceUris();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeResponseType#getNamespaceUris <em>Namespace Uris</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Namespace Uris</em>' containment reference is set.
	 * @see #unsetNamespaceUris()
	 * @see #getNamespaceUris()
	 * @see #setNamespaceUris(ListOfString)
	 * @generated
	 */
	boolean isSetNamespaceUris();

	/**
	 * Returns the value of the '<em><b>Server Uris</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Uris</em>' containment reference.
	 * @see #isSetServerUris()
	 * @see #unsetServerUris()
	 * @see #setServerUris(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionlessInvokeResponseType_ServerUris()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ServerUris' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getServerUris();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeResponseType#getServerUris <em>Server Uris</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Uris</em>' containment reference.
	 * @see #isSetServerUris()
	 * @see #unsetServerUris()
	 * @see #getServerUris()
	 * @generated
	 */
	void setServerUris(ListOfString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeResponseType#getServerUris <em>Server Uris</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerUris()
	 * @see #getServerUris()
	 * @see #setServerUris(ListOfString)
	 * @generated
	 */
	void unsetServerUris();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeResponseType#getServerUris <em>Server Uris</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Uris</em>' containment reference is set.
	 * @see #unsetServerUris()
	 * @see #getServerUris()
	 * @see #setServerUris(ListOfString)
	 * @generated
	 */
	boolean isSetServerUris();

	/**
	 * Returns the value of the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Id</em>' attribute.
	 * @see #isSetServiceId()
	 * @see #unsetServiceId()
	 * @see #setServiceId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionlessInvokeResponseType_ServiceId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='ServiceId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getServiceId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeResponseType#getServiceId <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Id</em>' attribute.
	 * @see #isSetServiceId()
	 * @see #unsetServiceId()
	 * @see #getServiceId()
	 * @generated
	 */
	void setServiceId(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeResponseType#getServiceId <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServiceId()
	 * @see #getServiceId()
	 * @see #setServiceId(long)
	 * @generated
	 */
	void unsetServiceId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeResponseType#getServiceId <em>Service Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service Id</em>' attribute is set.
	 * @see #unsetServiceId()
	 * @see #getServiceId()
	 * @see #setServiceId(long)
	 * @generated
	 */
	boolean isSetServiceId();

} // SessionlessInvokeResponseType
