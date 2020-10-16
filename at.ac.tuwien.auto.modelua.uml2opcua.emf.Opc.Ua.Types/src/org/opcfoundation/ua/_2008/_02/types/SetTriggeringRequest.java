/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Triggering Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getTriggeringItemId <em>Triggering Item Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getLinksToAdd <em>Links To Add</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getLinksToRemove <em>Links To Remove</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetTriggeringRequest()
 * @model extendedMetaData="name='SetTriggeringRequest' kind='elementOnly'"
 * @generated
 */
public interface SetTriggeringRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetTriggeringRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Subscription Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Id</em>' attribute.
	 * @see #isSetSubscriptionId()
	 * @see #unsetSubscriptionId()
	 * @see #setSubscriptionId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetTriggeringRequest_SubscriptionId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='SubscriptionId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getSubscriptionId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getSubscriptionId <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Id</em>' attribute.
	 * @see #isSetSubscriptionId()
	 * @see #unsetSubscriptionId()
	 * @see #getSubscriptionId()
	 * @generated
	 */
	void setSubscriptionId(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getSubscriptionId <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubscriptionId()
	 * @see #getSubscriptionId()
	 * @see #setSubscriptionId(long)
	 * @generated
	 */
	void unsetSubscriptionId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getSubscriptionId <em>Subscription Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Subscription Id</em>' attribute is set.
	 * @see #unsetSubscriptionId()
	 * @see #getSubscriptionId()
	 * @see #setSubscriptionId(long)
	 * @generated
	 */
	boolean isSetSubscriptionId();

	/**
	 * Returns the value of the '<em><b>Triggering Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggering Item Id</em>' attribute.
	 * @see #isSetTriggeringItemId()
	 * @see #unsetTriggeringItemId()
	 * @see #setTriggeringItemId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetTriggeringRequest_TriggeringItemId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='TriggeringItemId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getTriggeringItemId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getTriggeringItemId <em>Triggering Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggering Item Id</em>' attribute.
	 * @see #isSetTriggeringItemId()
	 * @see #unsetTriggeringItemId()
	 * @see #getTriggeringItemId()
	 * @generated
	 */
	void setTriggeringItemId(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getTriggeringItemId <em>Triggering Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTriggeringItemId()
	 * @see #getTriggeringItemId()
	 * @see #setTriggeringItemId(long)
	 * @generated
	 */
	void unsetTriggeringItemId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getTriggeringItemId <em>Triggering Item Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Triggering Item Id</em>' attribute is set.
	 * @see #unsetTriggeringItemId()
	 * @see #getTriggeringItemId()
	 * @see #setTriggeringItemId(long)
	 * @generated
	 */
	boolean isSetTriggeringItemId();

	/**
	 * Returns the value of the '<em><b>Links To Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Add</em>' containment reference.
	 * @see #isSetLinksToAdd()
	 * @see #unsetLinksToAdd()
	 * @see #setLinksToAdd(ListOfUInt32)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetTriggeringRequest_LinksToAdd()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LinksToAdd' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUInt32 getLinksToAdd();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getLinksToAdd <em>Links To Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Links To Add</em>' containment reference.
	 * @see #isSetLinksToAdd()
	 * @see #unsetLinksToAdd()
	 * @see #getLinksToAdd()
	 * @generated
	 */
	void setLinksToAdd(ListOfUInt32 value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getLinksToAdd <em>Links To Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinksToAdd()
	 * @see #getLinksToAdd()
	 * @see #setLinksToAdd(ListOfUInt32)
	 * @generated
	 */
	void unsetLinksToAdd();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getLinksToAdd <em>Links To Add</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Links To Add</em>' containment reference is set.
	 * @see #unsetLinksToAdd()
	 * @see #getLinksToAdd()
	 * @see #setLinksToAdd(ListOfUInt32)
	 * @generated
	 */
	boolean isSetLinksToAdd();

	/**
	 * Returns the value of the '<em><b>Links To Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Remove</em>' containment reference.
	 * @see #isSetLinksToRemove()
	 * @see #unsetLinksToRemove()
	 * @see #setLinksToRemove(ListOfUInt32)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSetTriggeringRequest_LinksToRemove()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LinksToRemove' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUInt32 getLinksToRemove();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getLinksToRemove <em>Links To Remove</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Links To Remove</em>' containment reference.
	 * @see #isSetLinksToRemove()
	 * @see #unsetLinksToRemove()
	 * @see #getLinksToRemove()
	 * @generated
	 */
	void setLinksToRemove(ListOfUInt32 value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getLinksToRemove <em>Links To Remove</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinksToRemove()
	 * @see #getLinksToRemove()
	 * @see #setLinksToRemove(ListOfUInt32)
	 * @generated
	 */
	void unsetLinksToRemove();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SetTriggeringRequest#getLinksToRemove <em>Links To Remove</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Links To Remove</em>' containment reference is set.
	 * @see #unsetLinksToRemove()
	 * @see #getLinksToRemove()
	 * @see #setLinksToRemove(ListOfUInt32)
	 * @generated
	 */
	boolean isSetLinksToRemove();

} // SetTriggeringRequest
