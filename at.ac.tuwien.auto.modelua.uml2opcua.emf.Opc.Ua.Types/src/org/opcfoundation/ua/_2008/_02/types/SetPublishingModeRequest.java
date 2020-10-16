/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Publishing Mode Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SetPublishingModeRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SetPublishingModeRequest#isPublishingEnabled <em>Publishing Enabled</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SetPublishingModeRequest#getSubscriptionIds <em>Subscription Ids</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetPublishingModeRequest()
 * @model extendedMetaData="name='SetPublishingModeRequest' kind='elementOnly'"
 * @generated
 */
public interface SetPublishingModeRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetPublishingModeRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetPublishingModeRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetPublishingModeRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SetPublishingModeRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Publishing Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishing Enabled</em>' attribute.
	 * @see #isSetPublishingEnabled()
	 * @see #unsetPublishingEnabled()
	 * @see #setPublishingEnabled(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetPublishingModeRequest_PublishingEnabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='PublishingEnabled' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPublishingEnabled();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetPublishingModeRequest#isPublishingEnabled <em>Publishing Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publishing Enabled</em>' attribute.
	 * @see #isSetPublishingEnabled()
	 * @see #unsetPublishingEnabled()
	 * @see #isPublishingEnabled()
	 * @generated
	 */
	void setPublishingEnabled(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetPublishingModeRequest#isPublishingEnabled <em>Publishing Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPublishingEnabled()
	 * @see #isPublishingEnabled()
	 * @see #setPublishingEnabled(boolean)
	 * @generated
	 */
	void unsetPublishingEnabled();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SetPublishingModeRequest#isPublishingEnabled <em>Publishing Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Publishing Enabled</em>' attribute is set.
	 * @see #unsetPublishingEnabled()
	 * @see #isPublishingEnabled()
	 * @see #setPublishingEnabled(boolean)
	 * @generated
	 */
	boolean isSetPublishingEnabled();

	/**
	 * Returns the value of the '<em><b>Subscription Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Ids</em>' containment reference.
	 * @see #isSetSubscriptionIds()
	 * @see #unsetSubscriptionIds()
	 * @see #setSubscriptionIds(ListOfUInt32)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetPublishingModeRequest_SubscriptionIds()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SubscriptionIds' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUInt32 getSubscriptionIds();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetPublishingModeRequest#getSubscriptionIds <em>Subscription Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Ids</em>' containment reference.
	 * @see #isSetSubscriptionIds()
	 * @see #unsetSubscriptionIds()
	 * @see #getSubscriptionIds()
	 * @generated
	 */
	void setSubscriptionIds(ListOfUInt32 value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetPublishingModeRequest#getSubscriptionIds <em>Subscription Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubscriptionIds()
	 * @see #getSubscriptionIds()
	 * @see #setSubscriptionIds(ListOfUInt32)
	 * @generated
	 */
	void unsetSubscriptionIds();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SetPublishingModeRequest#getSubscriptionIds <em>Subscription Ids</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Subscription Ids</em>' containment reference is set.
	 * @see #unsetSubscriptionIds()
	 * @see #getSubscriptionIds()
	 * @see #setSubscriptionIds(ListOfUInt32)
	 * @generated
	 */
	boolean isSetSubscriptionIds();

} // SetPublishingModeRequest
