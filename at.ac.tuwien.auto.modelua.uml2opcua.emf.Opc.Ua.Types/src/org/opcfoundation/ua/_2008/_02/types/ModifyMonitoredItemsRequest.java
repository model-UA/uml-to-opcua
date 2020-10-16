/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Monitored Items Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest#getTimestampsToReturn <em>Timestamps To Return</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest#getItemsToModify <em>Items To Modify</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModifyMonitoredItemsRequest()
 * @model extendedMetaData="name='ModifyMonitoredItemsRequest' kind='elementOnly'"
 * @generated
 */
public interface ModifyMonitoredItemsRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModifyMonitoredItemsRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModifyMonitoredItemsRequest_SubscriptionId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='SubscriptionId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getSubscriptionId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest#getSubscriptionId <em>Subscription Id</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest#getSubscriptionId <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubscriptionId()
	 * @see #getSubscriptionId()
	 * @see #setSubscriptionId(long)
	 * @generated
	 */
	void unsetSubscriptionId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest#getSubscriptionId <em>Subscription Id</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Timestamps To Return</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.TimestampsToReturn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamps To Return</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.TimestampsToReturn
	 * @see #isSetTimestampsToReturn()
	 * @see #unsetTimestampsToReturn()
	 * @see #setTimestampsToReturn(TimestampsToReturn)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModifyMonitoredItemsRequest_TimestampsToReturn()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TimestampsToReturn' namespace='##targetNamespace'"
	 * @generated
	 */
	TimestampsToReturn getTimestampsToReturn();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest#getTimestampsToReturn <em>Timestamps To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamps To Return</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.TimestampsToReturn
	 * @see #isSetTimestampsToReturn()
	 * @see #unsetTimestampsToReturn()
	 * @see #getTimestampsToReturn()
	 * @generated
	 */
	void setTimestampsToReturn(TimestampsToReturn value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest#getTimestampsToReturn <em>Timestamps To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimestampsToReturn()
	 * @see #getTimestampsToReturn()
	 * @see #setTimestampsToReturn(TimestampsToReturn)
	 * @generated
	 */
	void unsetTimestampsToReturn();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest#getTimestampsToReturn <em>Timestamps To Return</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Timestamps To Return</em>' attribute is set.
	 * @see #unsetTimestampsToReturn()
	 * @see #getTimestampsToReturn()
	 * @see #setTimestampsToReturn(TimestampsToReturn)
	 * @generated
	 */
	boolean isSetTimestampsToReturn();

	/**
	 * Returns the value of the '<em><b>Items To Modify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items To Modify</em>' containment reference.
	 * @see #isSetItemsToModify()
	 * @see #unsetItemsToModify()
	 * @see #setItemsToModify(ListOfMonitoredItemModifyRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getModifyMonitoredItemsRequest_ItemsToModify()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ItemsToModify' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfMonitoredItemModifyRequest getItemsToModify();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest#getItemsToModify <em>Items To Modify</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items To Modify</em>' containment reference.
	 * @see #isSetItemsToModify()
	 * @see #unsetItemsToModify()
	 * @see #getItemsToModify()
	 * @generated
	 */
	void setItemsToModify(ListOfMonitoredItemModifyRequest value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest#getItemsToModify <em>Items To Modify</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetItemsToModify()
	 * @see #getItemsToModify()
	 * @see #setItemsToModify(ListOfMonitoredItemModifyRequest)
	 * @generated
	 */
	void unsetItemsToModify();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest#getItemsToModify <em>Items To Modify</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Items To Modify</em>' containment reference is set.
	 * @see #unsetItemsToModify()
	 * @see #getItemsToModify()
	 * @see #setItemsToModify(ListOfMonitoredItemModifyRequest)
	 * @generated
	 */
	boolean isSetItemsToModify();

} // ModifyMonitoredItemsRequest
