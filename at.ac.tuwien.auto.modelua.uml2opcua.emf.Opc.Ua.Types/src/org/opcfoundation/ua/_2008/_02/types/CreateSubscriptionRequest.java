/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Subscription Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getRequestedPublishingInterval <em>Requested Publishing Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getRequestedLifetimeCount <em>Requested Lifetime Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getRequestedMaxKeepAliveCount <em>Requested Max Keep Alive Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getMaxNotificationsPerPublish <em>Max Notifications Per Publish</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#isPublishingEnabled <em>Publishing Enabled</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSubscriptionRequest()
 * @model extendedMetaData="name='CreateSubscriptionRequest' kind='elementOnly'"
 * @generated
 */
public interface CreateSubscriptionRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #isSetRequestHeader()
	 * @see #unsetRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSubscriptionRequest_RequestHeader()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getRequestHeader <em>Request Header</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestHeader()
	 * @see #getRequestHeader()
	 * @see #setRequestHeader(RequestHeader)
	 * @generated
	 */
	void unsetRequestHeader();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getRequestHeader <em>Request Header</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Requested Publishing Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Publishing Interval</em>' attribute.
	 * @see #isSetRequestedPublishingInterval()
	 * @see #unsetRequestedPublishingInterval()
	 * @see #setRequestedPublishingInterval(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSubscriptionRequest_RequestedPublishingInterval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='RequestedPublishingInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRequestedPublishingInterval();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getRequestedPublishingInterval <em>Requested Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Publishing Interval</em>' attribute.
	 * @see #isSetRequestedPublishingInterval()
	 * @see #unsetRequestedPublishingInterval()
	 * @see #getRequestedPublishingInterval()
	 * @generated
	 */
	void setRequestedPublishingInterval(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getRequestedPublishingInterval <em>Requested Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestedPublishingInterval()
	 * @see #getRequestedPublishingInterval()
	 * @see #setRequestedPublishingInterval(double)
	 * @generated
	 */
	void unsetRequestedPublishingInterval();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getRequestedPublishingInterval <em>Requested Publishing Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Requested Publishing Interval</em>' attribute is set.
	 * @see #unsetRequestedPublishingInterval()
	 * @see #getRequestedPublishingInterval()
	 * @see #setRequestedPublishingInterval(double)
	 * @generated
	 */
	boolean isSetRequestedPublishingInterval();

	/**
	 * Returns the value of the '<em><b>Requested Lifetime Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Lifetime Count</em>' attribute.
	 * @see #isSetRequestedLifetimeCount()
	 * @see #unsetRequestedLifetimeCount()
	 * @see #setRequestedLifetimeCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSubscriptionRequest_RequestedLifetimeCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RequestedLifetimeCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRequestedLifetimeCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getRequestedLifetimeCount <em>Requested Lifetime Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Lifetime Count</em>' attribute.
	 * @see #isSetRequestedLifetimeCount()
	 * @see #unsetRequestedLifetimeCount()
	 * @see #getRequestedLifetimeCount()
	 * @generated
	 */
	void setRequestedLifetimeCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getRequestedLifetimeCount <em>Requested Lifetime Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestedLifetimeCount()
	 * @see #getRequestedLifetimeCount()
	 * @see #setRequestedLifetimeCount(long)
	 * @generated
	 */
	void unsetRequestedLifetimeCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getRequestedLifetimeCount <em>Requested Lifetime Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Requested Lifetime Count</em>' attribute is set.
	 * @see #unsetRequestedLifetimeCount()
	 * @see #getRequestedLifetimeCount()
	 * @see #setRequestedLifetimeCount(long)
	 * @generated
	 */
	boolean isSetRequestedLifetimeCount();

	/**
	 * Returns the value of the '<em><b>Requested Max Keep Alive Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Max Keep Alive Count</em>' attribute.
	 * @see #isSetRequestedMaxKeepAliveCount()
	 * @see #unsetRequestedMaxKeepAliveCount()
	 * @see #setRequestedMaxKeepAliveCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSubscriptionRequest_RequestedMaxKeepAliveCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RequestedMaxKeepAliveCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRequestedMaxKeepAliveCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getRequestedMaxKeepAliveCount <em>Requested Max Keep Alive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Max Keep Alive Count</em>' attribute.
	 * @see #isSetRequestedMaxKeepAliveCount()
	 * @see #unsetRequestedMaxKeepAliveCount()
	 * @see #getRequestedMaxKeepAliveCount()
	 * @generated
	 */
	void setRequestedMaxKeepAliveCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getRequestedMaxKeepAliveCount <em>Requested Max Keep Alive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestedMaxKeepAliveCount()
	 * @see #getRequestedMaxKeepAliveCount()
	 * @see #setRequestedMaxKeepAliveCount(long)
	 * @generated
	 */
	void unsetRequestedMaxKeepAliveCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getRequestedMaxKeepAliveCount <em>Requested Max Keep Alive Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Requested Max Keep Alive Count</em>' attribute is set.
	 * @see #unsetRequestedMaxKeepAliveCount()
	 * @see #getRequestedMaxKeepAliveCount()
	 * @see #setRequestedMaxKeepAliveCount(long)
	 * @generated
	 */
	boolean isSetRequestedMaxKeepAliveCount();

	/**
	 * Returns the value of the '<em><b>Max Notifications Per Publish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Notifications Per Publish</em>' attribute.
	 * @see #isSetMaxNotificationsPerPublish()
	 * @see #unsetMaxNotificationsPerPublish()
	 * @see #setMaxNotificationsPerPublish(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSubscriptionRequest_MaxNotificationsPerPublish()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MaxNotificationsPerPublish' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMaxNotificationsPerPublish();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getMaxNotificationsPerPublish <em>Max Notifications Per Publish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Notifications Per Publish</em>' attribute.
	 * @see #isSetMaxNotificationsPerPublish()
	 * @see #unsetMaxNotificationsPerPublish()
	 * @see #getMaxNotificationsPerPublish()
	 * @generated
	 */
	void setMaxNotificationsPerPublish(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getMaxNotificationsPerPublish <em>Max Notifications Per Publish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxNotificationsPerPublish()
	 * @see #getMaxNotificationsPerPublish()
	 * @see #setMaxNotificationsPerPublish(long)
	 * @generated
	 */
	void unsetMaxNotificationsPerPublish();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getMaxNotificationsPerPublish <em>Max Notifications Per Publish</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Notifications Per Publish</em>' attribute is set.
	 * @see #unsetMaxNotificationsPerPublish()
	 * @see #getMaxNotificationsPerPublish()
	 * @see #setMaxNotificationsPerPublish(long)
	 * @generated
	 */
	boolean isSetMaxNotificationsPerPublish();

	/**
	 * Returns the value of the '<em><b>Publishing Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishing Enabled</em>' attribute.
	 * @see #isSetPublishingEnabled()
	 * @see #unsetPublishingEnabled()
	 * @see #setPublishingEnabled(boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSubscriptionRequest_PublishingEnabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='PublishingEnabled' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPublishingEnabled();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#isPublishingEnabled <em>Publishing Enabled</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#isPublishingEnabled <em>Publishing Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPublishingEnabled()
	 * @see #isPublishingEnabled()
	 * @see #setPublishingEnabled(boolean)
	 * @generated
	 */
	void unsetPublishingEnabled();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#isPublishingEnabled <em>Publishing Enabled</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #setPriority(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getCreateSubscriptionRequest_Priority()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='element' name='Priority' namespace='##targetNamespace'"
	 * @generated
	 */
	short getPriority();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(short value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriority()
	 * @see #getPriority()
	 * @see #setPriority(short)
	 * @generated
	 */
	void unsetPriority();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest#getPriority <em>Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priority</em>' attribute is set.
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @see #setPriority(short)
	 * @generated
	 */
	boolean isSetPriority();

} // CreateSubscriptionRequest
