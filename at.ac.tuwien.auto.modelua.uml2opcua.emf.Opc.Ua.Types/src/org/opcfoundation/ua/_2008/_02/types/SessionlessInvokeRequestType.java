/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sessionless Invoke Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getUrisVersion <em>Uris Version</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getNamespaceUris <em>Namespace Uris</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getServerUris <em>Server Uris</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getLocaleIds <em>Locale Ids</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getServiceId <em>Service Id</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionlessInvokeRequestType()
 * @model extendedMetaData="name='SessionlessInvokeRequestType' kind='elementOnly'"
 * @generated
 */
public interface SessionlessInvokeRequestType extends EObject {
	/**
	 * Returns the value of the '<em><b>Uris Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uris Version</em>' containment reference.
	 * @see #isSetUrisVersion()
	 * @see #unsetUrisVersion()
	 * @see #setUrisVersion(ListOfUInt32)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionlessInvokeRequestType_UrisVersion()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='UrisVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUInt32 getUrisVersion();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getUrisVersion <em>Uris Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uris Version</em>' containment reference.
	 * @see #isSetUrisVersion()
	 * @see #unsetUrisVersion()
	 * @see #getUrisVersion()
	 * @generated
	 */
	void setUrisVersion(ListOfUInt32 value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getUrisVersion <em>Uris Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUrisVersion()
	 * @see #getUrisVersion()
	 * @see #setUrisVersion(ListOfUInt32)
	 * @generated
	 */
	void unsetUrisVersion();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getUrisVersion <em>Uris Version</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Uris Version</em>' containment reference is set.
	 * @see #unsetUrisVersion()
	 * @see #getUrisVersion()
	 * @see #setUrisVersion(ListOfUInt32)
	 * @generated
	 */
	boolean isSetUrisVersion();

	/**
	 * Returns the value of the '<em><b>Namespace Uris</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Uris</em>' containment reference.
	 * @see #isSetNamespaceUris()
	 * @see #unsetNamespaceUris()
	 * @see #setNamespaceUris(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionlessInvokeRequestType_NamespaceUris()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='NamespaceUris' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getNamespaceUris();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getNamespaceUris <em>Namespace Uris</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getNamespaceUris <em>Namespace Uris</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNamespaceUris()
	 * @see #getNamespaceUris()
	 * @see #setNamespaceUris(ListOfString)
	 * @generated
	 */
	void unsetNamespaceUris();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getNamespaceUris <em>Namespace Uris</em>}' containment reference is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionlessInvokeRequestType_ServerUris()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ServerUris' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getServerUris();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getServerUris <em>Server Uris</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getServerUris <em>Server Uris</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerUris()
	 * @see #getServerUris()
	 * @see #setServerUris(ListOfString)
	 * @generated
	 */
	void unsetServerUris();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getServerUris <em>Server Uris</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Locale Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale Ids</em>' containment reference.
	 * @see #isSetLocaleIds()
	 * @see #unsetLocaleIds()
	 * @see #setLocaleIds(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionlessInvokeRequestType_LocaleIds()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LocaleIds' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getLocaleIds();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getLocaleIds <em>Locale Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale Ids</em>' containment reference.
	 * @see #isSetLocaleIds()
	 * @see #unsetLocaleIds()
	 * @see #getLocaleIds()
	 * @generated
	 */
	void setLocaleIds(ListOfString value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getLocaleIds <em>Locale Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocaleIds()
	 * @see #getLocaleIds()
	 * @see #setLocaleIds(ListOfString)
	 * @generated
	 */
	void unsetLocaleIds();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getLocaleIds <em>Locale Ids</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Locale Ids</em>' containment reference is set.
	 * @see #unsetLocaleIds()
	 * @see #getLocaleIds()
	 * @see #setLocaleIds(ListOfString)
	 * @generated
	 */
	boolean isSetLocaleIds();

	/**
	 * Returns the value of the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Id</em>' attribute.
	 * @see #isSetServiceId()
	 * @see #unsetServiceId()
	 * @see #setServiceId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionlessInvokeRequestType_ServiceId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='ServiceId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getServiceId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getServiceId <em>Service Id</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getServiceId <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServiceId()
	 * @see #getServiceId()
	 * @see #setServiceId(long)
	 * @generated
	 */
	void unsetServiceId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType#getServiceId <em>Service Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service Id</em>' attribute is set.
	 * @see #unsetServiceId()
	 * @see #getServiceId()
	 * @see #setServiceId(long)
	 * @generated
	 */
	boolean isSetServiceId();

} // SessionlessInvokeRequestType
