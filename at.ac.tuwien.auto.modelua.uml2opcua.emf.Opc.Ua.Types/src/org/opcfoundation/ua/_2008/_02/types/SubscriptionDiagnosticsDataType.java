/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Diagnostics Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getSessionId <em>Session Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getPublishingInterval <em>Publishing Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMaxKeepAliveCount <em>Max Keep Alive Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMaxLifetimeCount <em>Max Lifetime Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMaxNotificationsPerPublish <em>Max Notifications Per Publish</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#isPublishingEnabled <em>Publishing Enabled</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getModifyCount <em>Modify Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getEnableCount <em>Enable Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getDisableCount <em>Disable Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getRepublishRequestCount <em>Republish Request Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getRepublishMessageRequestCount <em>Republish Message Request Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getRepublishMessageCount <em>Republish Message Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getTransferRequestCount <em>Transfer Request Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getTransferredToAltClientCount <em>Transferred To Alt Client Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getTransferredToSameClientCount <em>Transferred To Same Client Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getPublishRequestCount <em>Publish Request Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getDataChangeNotificationsCount <em>Data Change Notifications Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getEventNotificationsCount <em>Event Notifications Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getNotificationsCount <em>Notifications Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getLatePublishRequestCount <em>Late Publish Request Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getCurrentKeepAliveCount <em>Current Keep Alive Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getCurrentLifetimeCount <em>Current Lifetime Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getUnacknowledgedMessageCount <em>Unacknowledged Message Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getDiscardedMessageCount <em>Discarded Message Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMonitoredItemCount <em>Monitored Item Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getDisabledMonitoredItemCount <em>Disabled Monitored Item Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMonitoringQueueOverflowCount <em>Monitoring Queue Overflow Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getNextSequenceNumber <em>Next Sequence Number</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getEventQueueOverFlowCount <em>Event Queue Over Flow Count</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType()
 * @model extendedMetaData="name='SubscriptionDiagnosticsDataType' kind='elementOnly'"
 * @generated
 */
public interface SubscriptionDiagnosticsDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Session Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Id</em>' containment reference.
	 * @see #isSetSessionId()
	 * @see #unsetSessionId()
	 * @see #setSessionId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_SessionId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SessionId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getSessionId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getSessionId <em>Session Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Id</em>' containment reference.
	 * @see #isSetSessionId()
	 * @see #unsetSessionId()
	 * @see #getSessionId()
	 * @generated
	 */
	void setSessionId(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getSessionId <em>Session Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSessionId()
	 * @see #getSessionId()
	 * @see #setSessionId(NodeId)
	 * @generated
	 */
	void unsetSessionId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getSessionId <em>Session Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Session Id</em>' containment reference is set.
	 * @see #unsetSessionId()
	 * @see #getSessionId()
	 * @see #setSessionId(NodeId)
	 * @generated
	 */
	boolean isSetSessionId();

	/**
	 * Returns the value of the '<em><b>Subscription Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Id</em>' attribute.
	 * @see #isSetSubscriptionId()
	 * @see #unsetSubscriptionId()
	 * @see #setSubscriptionId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_SubscriptionId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='SubscriptionId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getSubscriptionId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getSubscriptionId <em>Subscription Id</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getSubscriptionId <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubscriptionId()
	 * @see #getSubscriptionId()
	 * @see #setSubscriptionId(long)
	 * @generated
	 */
	void unsetSubscriptionId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getSubscriptionId <em>Subscription Id</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #setPriority(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_Priority()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='element' name='Priority' namespace='##targetNamespace'"
	 * @generated
	 */
	short getPriority();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getPriority <em>Priority</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriority()
	 * @see #getPriority()
	 * @see #setPriority(short)
	 * @generated
	 */
	void unsetPriority();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getPriority <em>Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priority</em>' attribute is set.
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @see #setPriority(short)
	 * @generated
	 */
	boolean isSetPriority();

	/**
	 * Returns the value of the '<em><b>Publishing Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishing Interval</em>' attribute.
	 * @see #isSetPublishingInterval()
	 * @see #unsetPublishingInterval()
	 * @see #setPublishingInterval(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_PublishingInterval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='PublishingInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	double getPublishingInterval();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getPublishingInterval <em>Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publishing Interval</em>' attribute.
	 * @see #isSetPublishingInterval()
	 * @see #unsetPublishingInterval()
	 * @see #getPublishingInterval()
	 * @generated
	 */
	void setPublishingInterval(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getPublishingInterval <em>Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPublishingInterval()
	 * @see #getPublishingInterval()
	 * @see #setPublishingInterval(double)
	 * @generated
	 */
	void unsetPublishingInterval();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getPublishingInterval <em>Publishing Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Publishing Interval</em>' attribute is set.
	 * @see #unsetPublishingInterval()
	 * @see #getPublishingInterval()
	 * @see #setPublishingInterval(double)
	 * @generated
	 */
	boolean isSetPublishingInterval();

	/**
	 * Returns the value of the '<em><b>Max Keep Alive Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Keep Alive Count</em>' attribute.
	 * @see #isSetMaxKeepAliveCount()
	 * @see #unsetMaxKeepAliveCount()
	 * @see #setMaxKeepAliveCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_MaxKeepAliveCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MaxKeepAliveCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMaxKeepAliveCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMaxKeepAliveCount <em>Max Keep Alive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Keep Alive Count</em>' attribute.
	 * @see #isSetMaxKeepAliveCount()
	 * @see #unsetMaxKeepAliveCount()
	 * @see #getMaxKeepAliveCount()
	 * @generated
	 */
	void setMaxKeepAliveCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMaxKeepAliveCount <em>Max Keep Alive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxKeepAliveCount()
	 * @see #getMaxKeepAliveCount()
	 * @see #setMaxKeepAliveCount(long)
	 * @generated
	 */
	void unsetMaxKeepAliveCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMaxKeepAliveCount <em>Max Keep Alive Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Keep Alive Count</em>' attribute is set.
	 * @see #unsetMaxKeepAliveCount()
	 * @see #getMaxKeepAliveCount()
	 * @see #setMaxKeepAliveCount(long)
	 * @generated
	 */
	boolean isSetMaxKeepAliveCount();

	/**
	 * Returns the value of the '<em><b>Max Lifetime Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Lifetime Count</em>' attribute.
	 * @see #isSetMaxLifetimeCount()
	 * @see #unsetMaxLifetimeCount()
	 * @see #setMaxLifetimeCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_MaxLifetimeCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MaxLifetimeCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMaxLifetimeCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMaxLifetimeCount <em>Max Lifetime Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Lifetime Count</em>' attribute.
	 * @see #isSetMaxLifetimeCount()
	 * @see #unsetMaxLifetimeCount()
	 * @see #getMaxLifetimeCount()
	 * @generated
	 */
	void setMaxLifetimeCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMaxLifetimeCount <em>Max Lifetime Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxLifetimeCount()
	 * @see #getMaxLifetimeCount()
	 * @see #setMaxLifetimeCount(long)
	 * @generated
	 */
	void unsetMaxLifetimeCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMaxLifetimeCount <em>Max Lifetime Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Lifetime Count</em>' attribute is set.
	 * @see #unsetMaxLifetimeCount()
	 * @see #getMaxLifetimeCount()
	 * @see #setMaxLifetimeCount(long)
	 * @generated
	 */
	boolean isSetMaxLifetimeCount();

	/**
	 * Returns the value of the '<em><b>Max Notifications Per Publish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Notifications Per Publish</em>' attribute.
	 * @see #isSetMaxNotificationsPerPublish()
	 * @see #unsetMaxNotificationsPerPublish()
	 * @see #setMaxNotificationsPerPublish(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_MaxNotificationsPerPublish()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MaxNotificationsPerPublish' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMaxNotificationsPerPublish();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMaxNotificationsPerPublish <em>Max Notifications Per Publish</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMaxNotificationsPerPublish <em>Max Notifications Per Publish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxNotificationsPerPublish()
	 * @see #getMaxNotificationsPerPublish()
	 * @see #setMaxNotificationsPerPublish(long)
	 * @generated
	 */
	void unsetMaxNotificationsPerPublish();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMaxNotificationsPerPublish <em>Max Notifications Per Publish</em>}' attribute is set.
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
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_PublishingEnabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='PublishingEnabled' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPublishingEnabled();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#isPublishingEnabled <em>Publishing Enabled</em>}' attribute.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#isPublishingEnabled <em>Publishing Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPublishingEnabled()
	 * @see #isPublishingEnabled()
	 * @see #setPublishingEnabled(boolean)
	 * @generated
	 */
	void unsetPublishingEnabled();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#isPublishingEnabled <em>Publishing Enabled</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Modify Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Count</em>' attribute.
	 * @see #isSetModifyCount()
	 * @see #unsetModifyCount()
	 * @see #setModifyCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_ModifyCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='ModifyCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getModifyCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getModifyCount <em>Modify Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify Count</em>' attribute.
	 * @see #isSetModifyCount()
	 * @see #unsetModifyCount()
	 * @see #getModifyCount()
	 * @generated
	 */
	void setModifyCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getModifyCount <em>Modify Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModifyCount()
	 * @see #getModifyCount()
	 * @see #setModifyCount(long)
	 * @generated
	 */
	void unsetModifyCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getModifyCount <em>Modify Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modify Count</em>' attribute is set.
	 * @see #unsetModifyCount()
	 * @see #getModifyCount()
	 * @see #setModifyCount(long)
	 * @generated
	 */
	boolean isSetModifyCount();

	/**
	 * Returns the value of the '<em><b>Enable Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Count</em>' attribute.
	 * @see #isSetEnableCount()
	 * @see #unsetEnableCount()
	 * @see #setEnableCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_EnableCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='EnableCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getEnableCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getEnableCount <em>Enable Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Count</em>' attribute.
	 * @see #isSetEnableCount()
	 * @see #unsetEnableCount()
	 * @see #getEnableCount()
	 * @generated
	 */
	void setEnableCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getEnableCount <em>Enable Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnableCount()
	 * @see #getEnableCount()
	 * @see #setEnableCount(long)
	 * @generated
	 */
	void unsetEnableCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getEnableCount <em>Enable Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enable Count</em>' attribute is set.
	 * @see #unsetEnableCount()
	 * @see #getEnableCount()
	 * @see #setEnableCount(long)
	 * @generated
	 */
	boolean isSetEnableCount();

	/**
	 * Returns the value of the '<em><b>Disable Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Count</em>' attribute.
	 * @see #isSetDisableCount()
	 * @see #unsetDisableCount()
	 * @see #setDisableCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_DisableCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='DisableCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getDisableCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getDisableCount <em>Disable Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Count</em>' attribute.
	 * @see #isSetDisableCount()
	 * @see #unsetDisableCount()
	 * @see #getDisableCount()
	 * @generated
	 */
	void setDisableCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getDisableCount <em>Disable Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisableCount()
	 * @see #getDisableCount()
	 * @see #setDisableCount(long)
	 * @generated
	 */
	void unsetDisableCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getDisableCount <em>Disable Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disable Count</em>' attribute is set.
	 * @see #unsetDisableCount()
	 * @see #getDisableCount()
	 * @see #setDisableCount(long)
	 * @generated
	 */
	boolean isSetDisableCount();

	/**
	 * Returns the value of the '<em><b>Republish Request Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Republish Request Count</em>' attribute.
	 * @see #isSetRepublishRequestCount()
	 * @see #unsetRepublishRequestCount()
	 * @see #setRepublishRequestCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_RepublishRequestCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RepublishRequestCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRepublishRequestCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getRepublishRequestCount <em>Republish Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Republish Request Count</em>' attribute.
	 * @see #isSetRepublishRequestCount()
	 * @see #unsetRepublishRequestCount()
	 * @see #getRepublishRequestCount()
	 * @generated
	 */
	void setRepublishRequestCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getRepublishRequestCount <em>Republish Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepublishRequestCount()
	 * @see #getRepublishRequestCount()
	 * @see #setRepublishRequestCount(long)
	 * @generated
	 */
	void unsetRepublishRequestCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getRepublishRequestCount <em>Republish Request Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Republish Request Count</em>' attribute is set.
	 * @see #unsetRepublishRequestCount()
	 * @see #getRepublishRequestCount()
	 * @see #setRepublishRequestCount(long)
	 * @generated
	 */
	boolean isSetRepublishRequestCount();

	/**
	 * Returns the value of the '<em><b>Republish Message Request Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Republish Message Request Count</em>' attribute.
	 * @see #isSetRepublishMessageRequestCount()
	 * @see #unsetRepublishMessageRequestCount()
	 * @see #setRepublishMessageRequestCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_RepublishMessageRequestCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RepublishMessageRequestCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRepublishMessageRequestCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getRepublishMessageRequestCount <em>Republish Message Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Republish Message Request Count</em>' attribute.
	 * @see #isSetRepublishMessageRequestCount()
	 * @see #unsetRepublishMessageRequestCount()
	 * @see #getRepublishMessageRequestCount()
	 * @generated
	 */
	void setRepublishMessageRequestCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getRepublishMessageRequestCount <em>Republish Message Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepublishMessageRequestCount()
	 * @see #getRepublishMessageRequestCount()
	 * @see #setRepublishMessageRequestCount(long)
	 * @generated
	 */
	void unsetRepublishMessageRequestCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getRepublishMessageRequestCount <em>Republish Message Request Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Republish Message Request Count</em>' attribute is set.
	 * @see #unsetRepublishMessageRequestCount()
	 * @see #getRepublishMessageRequestCount()
	 * @see #setRepublishMessageRequestCount(long)
	 * @generated
	 */
	boolean isSetRepublishMessageRequestCount();

	/**
	 * Returns the value of the '<em><b>Republish Message Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Republish Message Count</em>' attribute.
	 * @see #isSetRepublishMessageCount()
	 * @see #unsetRepublishMessageCount()
	 * @see #setRepublishMessageCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_RepublishMessageCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RepublishMessageCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRepublishMessageCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getRepublishMessageCount <em>Republish Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Republish Message Count</em>' attribute.
	 * @see #isSetRepublishMessageCount()
	 * @see #unsetRepublishMessageCount()
	 * @see #getRepublishMessageCount()
	 * @generated
	 */
	void setRepublishMessageCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getRepublishMessageCount <em>Republish Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepublishMessageCount()
	 * @see #getRepublishMessageCount()
	 * @see #setRepublishMessageCount(long)
	 * @generated
	 */
	void unsetRepublishMessageCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getRepublishMessageCount <em>Republish Message Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Republish Message Count</em>' attribute is set.
	 * @see #unsetRepublishMessageCount()
	 * @see #getRepublishMessageCount()
	 * @see #setRepublishMessageCount(long)
	 * @generated
	 */
	boolean isSetRepublishMessageCount();

	/**
	 * Returns the value of the '<em><b>Transfer Request Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Request Count</em>' attribute.
	 * @see #isSetTransferRequestCount()
	 * @see #unsetTransferRequestCount()
	 * @see #setTransferRequestCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_TransferRequestCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='TransferRequestCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getTransferRequestCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getTransferRequestCount <em>Transfer Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Request Count</em>' attribute.
	 * @see #isSetTransferRequestCount()
	 * @see #unsetTransferRequestCount()
	 * @see #getTransferRequestCount()
	 * @generated
	 */
	void setTransferRequestCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getTransferRequestCount <em>Transfer Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransferRequestCount()
	 * @see #getTransferRequestCount()
	 * @see #setTransferRequestCount(long)
	 * @generated
	 */
	void unsetTransferRequestCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getTransferRequestCount <em>Transfer Request Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transfer Request Count</em>' attribute is set.
	 * @see #unsetTransferRequestCount()
	 * @see #getTransferRequestCount()
	 * @see #setTransferRequestCount(long)
	 * @generated
	 */
	boolean isSetTransferRequestCount();

	/**
	 * Returns the value of the '<em><b>Transferred To Alt Client Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transferred To Alt Client Count</em>' attribute.
	 * @see #isSetTransferredToAltClientCount()
	 * @see #unsetTransferredToAltClientCount()
	 * @see #setTransferredToAltClientCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_TransferredToAltClientCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='TransferredToAltClientCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getTransferredToAltClientCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getTransferredToAltClientCount <em>Transferred To Alt Client Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transferred To Alt Client Count</em>' attribute.
	 * @see #isSetTransferredToAltClientCount()
	 * @see #unsetTransferredToAltClientCount()
	 * @see #getTransferredToAltClientCount()
	 * @generated
	 */
	void setTransferredToAltClientCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getTransferredToAltClientCount <em>Transferred To Alt Client Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransferredToAltClientCount()
	 * @see #getTransferredToAltClientCount()
	 * @see #setTransferredToAltClientCount(long)
	 * @generated
	 */
	void unsetTransferredToAltClientCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getTransferredToAltClientCount <em>Transferred To Alt Client Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transferred To Alt Client Count</em>' attribute is set.
	 * @see #unsetTransferredToAltClientCount()
	 * @see #getTransferredToAltClientCount()
	 * @see #setTransferredToAltClientCount(long)
	 * @generated
	 */
	boolean isSetTransferredToAltClientCount();

	/**
	 * Returns the value of the '<em><b>Transferred To Same Client Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transferred To Same Client Count</em>' attribute.
	 * @see #isSetTransferredToSameClientCount()
	 * @see #unsetTransferredToSameClientCount()
	 * @see #setTransferredToSameClientCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_TransferredToSameClientCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='TransferredToSameClientCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getTransferredToSameClientCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getTransferredToSameClientCount <em>Transferred To Same Client Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transferred To Same Client Count</em>' attribute.
	 * @see #isSetTransferredToSameClientCount()
	 * @see #unsetTransferredToSameClientCount()
	 * @see #getTransferredToSameClientCount()
	 * @generated
	 */
	void setTransferredToSameClientCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getTransferredToSameClientCount <em>Transferred To Same Client Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransferredToSameClientCount()
	 * @see #getTransferredToSameClientCount()
	 * @see #setTransferredToSameClientCount(long)
	 * @generated
	 */
	void unsetTransferredToSameClientCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getTransferredToSameClientCount <em>Transferred To Same Client Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transferred To Same Client Count</em>' attribute is set.
	 * @see #unsetTransferredToSameClientCount()
	 * @see #getTransferredToSameClientCount()
	 * @see #setTransferredToSameClientCount(long)
	 * @generated
	 */
	boolean isSetTransferredToSameClientCount();

	/**
	 * Returns the value of the '<em><b>Publish Request Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish Request Count</em>' attribute.
	 * @see #isSetPublishRequestCount()
	 * @see #unsetPublishRequestCount()
	 * @see #setPublishRequestCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_PublishRequestCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='PublishRequestCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getPublishRequestCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getPublishRequestCount <em>Publish Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish Request Count</em>' attribute.
	 * @see #isSetPublishRequestCount()
	 * @see #unsetPublishRequestCount()
	 * @see #getPublishRequestCount()
	 * @generated
	 */
	void setPublishRequestCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getPublishRequestCount <em>Publish Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPublishRequestCount()
	 * @see #getPublishRequestCount()
	 * @see #setPublishRequestCount(long)
	 * @generated
	 */
	void unsetPublishRequestCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getPublishRequestCount <em>Publish Request Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Publish Request Count</em>' attribute is set.
	 * @see #unsetPublishRequestCount()
	 * @see #getPublishRequestCount()
	 * @see #setPublishRequestCount(long)
	 * @generated
	 */
	boolean isSetPublishRequestCount();

	/**
	 * Returns the value of the '<em><b>Data Change Notifications Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Change Notifications Count</em>' attribute.
	 * @see #isSetDataChangeNotificationsCount()
	 * @see #unsetDataChangeNotificationsCount()
	 * @see #setDataChangeNotificationsCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_DataChangeNotificationsCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='DataChangeNotificationsCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getDataChangeNotificationsCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getDataChangeNotificationsCount <em>Data Change Notifications Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Change Notifications Count</em>' attribute.
	 * @see #isSetDataChangeNotificationsCount()
	 * @see #unsetDataChangeNotificationsCount()
	 * @see #getDataChangeNotificationsCount()
	 * @generated
	 */
	void setDataChangeNotificationsCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getDataChangeNotificationsCount <em>Data Change Notifications Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataChangeNotificationsCount()
	 * @see #getDataChangeNotificationsCount()
	 * @see #setDataChangeNotificationsCount(long)
	 * @generated
	 */
	void unsetDataChangeNotificationsCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getDataChangeNotificationsCount <em>Data Change Notifications Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Change Notifications Count</em>' attribute is set.
	 * @see #unsetDataChangeNotificationsCount()
	 * @see #getDataChangeNotificationsCount()
	 * @see #setDataChangeNotificationsCount(long)
	 * @generated
	 */
	boolean isSetDataChangeNotificationsCount();

	/**
	 * Returns the value of the '<em><b>Event Notifications Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Notifications Count</em>' attribute.
	 * @see #isSetEventNotificationsCount()
	 * @see #unsetEventNotificationsCount()
	 * @see #setEventNotificationsCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_EventNotificationsCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='EventNotificationsCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getEventNotificationsCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getEventNotificationsCount <em>Event Notifications Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Notifications Count</em>' attribute.
	 * @see #isSetEventNotificationsCount()
	 * @see #unsetEventNotificationsCount()
	 * @see #getEventNotificationsCount()
	 * @generated
	 */
	void setEventNotificationsCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getEventNotificationsCount <em>Event Notifications Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventNotificationsCount()
	 * @see #getEventNotificationsCount()
	 * @see #setEventNotificationsCount(long)
	 * @generated
	 */
	void unsetEventNotificationsCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getEventNotificationsCount <em>Event Notifications Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Notifications Count</em>' attribute is set.
	 * @see #unsetEventNotificationsCount()
	 * @see #getEventNotificationsCount()
	 * @see #setEventNotificationsCount(long)
	 * @generated
	 */
	boolean isSetEventNotificationsCount();

	/**
	 * Returns the value of the '<em><b>Notifications Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifications Count</em>' attribute.
	 * @see #isSetNotificationsCount()
	 * @see #unsetNotificationsCount()
	 * @see #setNotificationsCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_NotificationsCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='NotificationsCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNotificationsCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getNotificationsCount <em>Notifications Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notifications Count</em>' attribute.
	 * @see #isSetNotificationsCount()
	 * @see #unsetNotificationsCount()
	 * @see #getNotificationsCount()
	 * @generated
	 */
	void setNotificationsCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getNotificationsCount <em>Notifications Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotificationsCount()
	 * @see #getNotificationsCount()
	 * @see #setNotificationsCount(long)
	 * @generated
	 */
	void unsetNotificationsCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getNotificationsCount <em>Notifications Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Notifications Count</em>' attribute is set.
	 * @see #unsetNotificationsCount()
	 * @see #getNotificationsCount()
	 * @see #setNotificationsCount(long)
	 * @generated
	 */
	boolean isSetNotificationsCount();

	/**
	 * Returns the value of the '<em><b>Late Publish Request Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Late Publish Request Count</em>' attribute.
	 * @see #isSetLatePublishRequestCount()
	 * @see #unsetLatePublishRequestCount()
	 * @see #setLatePublishRequestCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_LatePublishRequestCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='LatePublishRequestCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getLatePublishRequestCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getLatePublishRequestCount <em>Late Publish Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Late Publish Request Count</em>' attribute.
	 * @see #isSetLatePublishRequestCount()
	 * @see #unsetLatePublishRequestCount()
	 * @see #getLatePublishRequestCount()
	 * @generated
	 */
	void setLatePublishRequestCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getLatePublishRequestCount <em>Late Publish Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLatePublishRequestCount()
	 * @see #getLatePublishRequestCount()
	 * @see #setLatePublishRequestCount(long)
	 * @generated
	 */
	void unsetLatePublishRequestCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getLatePublishRequestCount <em>Late Publish Request Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Late Publish Request Count</em>' attribute is set.
	 * @see #unsetLatePublishRequestCount()
	 * @see #getLatePublishRequestCount()
	 * @see #setLatePublishRequestCount(long)
	 * @generated
	 */
	boolean isSetLatePublishRequestCount();

	/**
	 * Returns the value of the '<em><b>Current Keep Alive Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Keep Alive Count</em>' attribute.
	 * @see #isSetCurrentKeepAliveCount()
	 * @see #unsetCurrentKeepAliveCount()
	 * @see #setCurrentKeepAliveCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_CurrentKeepAliveCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='CurrentKeepAliveCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getCurrentKeepAliveCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getCurrentKeepAliveCount <em>Current Keep Alive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Keep Alive Count</em>' attribute.
	 * @see #isSetCurrentKeepAliveCount()
	 * @see #unsetCurrentKeepAliveCount()
	 * @see #getCurrentKeepAliveCount()
	 * @generated
	 */
	void setCurrentKeepAliveCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getCurrentKeepAliveCount <em>Current Keep Alive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrentKeepAliveCount()
	 * @see #getCurrentKeepAliveCount()
	 * @see #setCurrentKeepAliveCount(long)
	 * @generated
	 */
	void unsetCurrentKeepAliveCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getCurrentKeepAliveCount <em>Current Keep Alive Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current Keep Alive Count</em>' attribute is set.
	 * @see #unsetCurrentKeepAliveCount()
	 * @see #getCurrentKeepAliveCount()
	 * @see #setCurrentKeepAliveCount(long)
	 * @generated
	 */
	boolean isSetCurrentKeepAliveCount();

	/**
	 * Returns the value of the '<em><b>Current Lifetime Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Lifetime Count</em>' attribute.
	 * @see #isSetCurrentLifetimeCount()
	 * @see #unsetCurrentLifetimeCount()
	 * @see #setCurrentLifetimeCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_CurrentLifetimeCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='CurrentLifetimeCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getCurrentLifetimeCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getCurrentLifetimeCount <em>Current Lifetime Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Lifetime Count</em>' attribute.
	 * @see #isSetCurrentLifetimeCount()
	 * @see #unsetCurrentLifetimeCount()
	 * @see #getCurrentLifetimeCount()
	 * @generated
	 */
	void setCurrentLifetimeCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getCurrentLifetimeCount <em>Current Lifetime Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrentLifetimeCount()
	 * @see #getCurrentLifetimeCount()
	 * @see #setCurrentLifetimeCount(long)
	 * @generated
	 */
	void unsetCurrentLifetimeCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getCurrentLifetimeCount <em>Current Lifetime Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current Lifetime Count</em>' attribute is set.
	 * @see #unsetCurrentLifetimeCount()
	 * @see #getCurrentLifetimeCount()
	 * @see #setCurrentLifetimeCount(long)
	 * @generated
	 */
	boolean isSetCurrentLifetimeCount();

	/**
	 * Returns the value of the '<em><b>Unacknowledged Message Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unacknowledged Message Count</em>' attribute.
	 * @see #isSetUnacknowledgedMessageCount()
	 * @see #unsetUnacknowledgedMessageCount()
	 * @see #setUnacknowledgedMessageCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_UnacknowledgedMessageCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='UnacknowledgedMessageCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getUnacknowledgedMessageCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getUnacknowledgedMessageCount <em>Unacknowledged Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unacknowledged Message Count</em>' attribute.
	 * @see #isSetUnacknowledgedMessageCount()
	 * @see #unsetUnacknowledgedMessageCount()
	 * @see #getUnacknowledgedMessageCount()
	 * @generated
	 */
	void setUnacknowledgedMessageCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getUnacknowledgedMessageCount <em>Unacknowledged Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnacknowledgedMessageCount()
	 * @see #getUnacknowledgedMessageCount()
	 * @see #setUnacknowledgedMessageCount(long)
	 * @generated
	 */
	void unsetUnacknowledgedMessageCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getUnacknowledgedMessageCount <em>Unacknowledged Message Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unacknowledged Message Count</em>' attribute is set.
	 * @see #unsetUnacknowledgedMessageCount()
	 * @see #getUnacknowledgedMessageCount()
	 * @see #setUnacknowledgedMessageCount(long)
	 * @generated
	 */
	boolean isSetUnacknowledgedMessageCount();

	/**
	 * Returns the value of the '<em><b>Discarded Message Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discarded Message Count</em>' attribute.
	 * @see #isSetDiscardedMessageCount()
	 * @see #unsetDiscardedMessageCount()
	 * @see #setDiscardedMessageCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_DiscardedMessageCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='DiscardedMessageCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getDiscardedMessageCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getDiscardedMessageCount <em>Discarded Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discarded Message Count</em>' attribute.
	 * @see #isSetDiscardedMessageCount()
	 * @see #unsetDiscardedMessageCount()
	 * @see #getDiscardedMessageCount()
	 * @generated
	 */
	void setDiscardedMessageCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getDiscardedMessageCount <em>Discarded Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiscardedMessageCount()
	 * @see #getDiscardedMessageCount()
	 * @see #setDiscardedMessageCount(long)
	 * @generated
	 */
	void unsetDiscardedMessageCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getDiscardedMessageCount <em>Discarded Message Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Discarded Message Count</em>' attribute is set.
	 * @see #unsetDiscardedMessageCount()
	 * @see #getDiscardedMessageCount()
	 * @see #setDiscardedMessageCount(long)
	 * @generated
	 */
	boolean isSetDiscardedMessageCount();

	/**
	 * Returns the value of the '<em><b>Monitored Item Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Item Count</em>' attribute.
	 * @see #isSetMonitoredItemCount()
	 * @see #unsetMonitoredItemCount()
	 * @see #setMonitoredItemCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_MonitoredItemCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MonitoredItemCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMonitoredItemCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMonitoredItemCount <em>Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored Item Count</em>' attribute.
	 * @see #isSetMonitoredItemCount()
	 * @see #unsetMonitoredItemCount()
	 * @see #getMonitoredItemCount()
	 * @generated
	 */
	void setMonitoredItemCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMonitoredItemCount <em>Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonitoredItemCount()
	 * @see #getMonitoredItemCount()
	 * @see #setMonitoredItemCount(long)
	 * @generated
	 */
	void unsetMonitoredItemCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMonitoredItemCount <em>Monitored Item Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Monitored Item Count</em>' attribute is set.
	 * @see #unsetMonitoredItemCount()
	 * @see #getMonitoredItemCount()
	 * @see #setMonitoredItemCount(long)
	 * @generated
	 */
	boolean isSetMonitoredItemCount();

	/**
	 * Returns the value of the '<em><b>Disabled Monitored Item Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled Monitored Item Count</em>' attribute.
	 * @see #isSetDisabledMonitoredItemCount()
	 * @see #unsetDisabledMonitoredItemCount()
	 * @see #setDisabledMonitoredItemCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_DisabledMonitoredItemCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='DisabledMonitoredItemCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getDisabledMonitoredItemCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getDisabledMonitoredItemCount <em>Disabled Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled Monitored Item Count</em>' attribute.
	 * @see #isSetDisabledMonitoredItemCount()
	 * @see #unsetDisabledMonitoredItemCount()
	 * @see #getDisabledMonitoredItemCount()
	 * @generated
	 */
	void setDisabledMonitoredItemCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getDisabledMonitoredItemCount <em>Disabled Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisabledMonitoredItemCount()
	 * @see #getDisabledMonitoredItemCount()
	 * @see #setDisabledMonitoredItemCount(long)
	 * @generated
	 */
	void unsetDisabledMonitoredItemCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getDisabledMonitoredItemCount <em>Disabled Monitored Item Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disabled Monitored Item Count</em>' attribute is set.
	 * @see #unsetDisabledMonitoredItemCount()
	 * @see #getDisabledMonitoredItemCount()
	 * @see #setDisabledMonitoredItemCount(long)
	 * @generated
	 */
	boolean isSetDisabledMonitoredItemCount();

	/**
	 * Returns the value of the '<em><b>Monitoring Queue Overflow Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring Queue Overflow Count</em>' attribute.
	 * @see #isSetMonitoringQueueOverflowCount()
	 * @see #unsetMonitoringQueueOverflowCount()
	 * @see #setMonitoringQueueOverflowCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_MonitoringQueueOverflowCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MonitoringQueueOverflowCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMonitoringQueueOverflowCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMonitoringQueueOverflowCount <em>Monitoring Queue Overflow Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring Queue Overflow Count</em>' attribute.
	 * @see #isSetMonitoringQueueOverflowCount()
	 * @see #unsetMonitoringQueueOverflowCount()
	 * @see #getMonitoringQueueOverflowCount()
	 * @generated
	 */
	void setMonitoringQueueOverflowCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMonitoringQueueOverflowCount <em>Monitoring Queue Overflow Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonitoringQueueOverflowCount()
	 * @see #getMonitoringQueueOverflowCount()
	 * @see #setMonitoringQueueOverflowCount(long)
	 * @generated
	 */
	void unsetMonitoringQueueOverflowCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getMonitoringQueueOverflowCount <em>Monitoring Queue Overflow Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Monitoring Queue Overflow Count</em>' attribute is set.
	 * @see #unsetMonitoringQueueOverflowCount()
	 * @see #getMonitoringQueueOverflowCount()
	 * @see #setMonitoringQueueOverflowCount(long)
	 * @generated
	 */
	boolean isSetMonitoringQueueOverflowCount();

	/**
	 * Returns the value of the '<em><b>Next Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Sequence Number</em>' attribute.
	 * @see #isSetNextSequenceNumber()
	 * @see #unsetNextSequenceNumber()
	 * @see #setNextSequenceNumber(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_NextSequenceNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='NextSequenceNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNextSequenceNumber();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getNextSequenceNumber <em>Next Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Sequence Number</em>' attribute.
	 * @see #isSetNextSequenceNumber()
	 * @see #unsetNextSequenceNumber()
	 * @see #getNextSequenceNumber()
	 * @generated
	 */
	void setNextSequenceNumber(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getNextSequenceNumber <em>Next Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNextSequenceNumber()
	 * @see #getNextSequenceNumber()
	 * @see #setNextSequenceNumber(long)
	 * @generated
	 */
	void unsetNextSequenceNumber();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getNextSequenceNumber <em>Next Sequence Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Next Sequence Number</em>' attribute is set.
	 * @see #unsetNextSequenceNumber()
	 * @see #getNextSequenceNumber()
	 * @see #setNextSequenceNumber(long)
	 * @generated
	 */
	boolean isSetNextSequenceNumber();

	/**
	 * Returns the value of the '<em><b>Event Queue Over Flow Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Queue Over Flow Count</em>' attribute.
	 * @see #isSetEventQueueOverFlowCount()
	 * @see #unsetEventQueueOverFlowCount()
	 * @see #setEventQueueOverFlowCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSubscriptionDiagnosticsDataType_EventQueueOverFlowCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='EventQueueOverFlowCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getEventQueueOverFlowCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getEventQueueOverFlowCount <em>Event Queue Over Flow Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Queue Over Flow Count</em>' attribute.
	 * @see #isSetEventQueueOverFlowCount()
	 * @see #unsetEventQueueOverFlowCount()
	 * @see #getEventQueueOverFlowCount()
	 * @generated
	 */
	void setEventQueueOverFlowCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getEventQueueOverFlowCount <em>Event Queue Over Flow Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventQueueOverFlowCount()
	 * @see #getEventQueueOverFlowCount()
	 * @see #setEventQueueOverFlowCount(long)
	 * @generated
	 */
	void unsetEventQueueOverFlowCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType#getEventQueueOverFlowCount <em>Event Queue Over Flow Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Queue Over Flow Count</em>' attribute is set.
	 * @see #unsetEventQueueOverFlowCount()
	 * @see #getEventQueueOverFlowCount()
	 * @see #setEventQueueOverFlowCount(long)
	 * @generated
	 */
	boolean isSetEventQueueOverFlowCount();

} // SubscriptionDiagnosticsDataType
