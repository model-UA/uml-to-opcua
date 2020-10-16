/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription Diagnostics Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getSessionId <em>Session Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getPublishingInterval <em>Publishing Interval</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getMaxKeepAliveCount <em>Max Keep Alive Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getMaxLifetimeCount <em>Max Lifetime Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getMaxNotificationsPerPublish <em>Max Notifications Per Publish</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#isPublishingEnabled <em>Publishing Enabled</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getModifyCount <em>Modify Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getEnableCount <em>Enable Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getDisableCount <em>Disable Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getRepublishRequestCount <em>Republish Request Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getRepublishMessageRequestCount <em>Republish Message Request Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getRepublishMessageCount <em>Republish Message Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getTransferRequestCount <em>Transfer Request Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getTransferredToAltClientCount <em>Transferred To Alt Client Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getTransferredToSameClientCount <em>Transferred To Same Client Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getPublishRequestCount <em>Publish Request Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getDataChangeNotificationsCount <em>Data Change Notifications Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getEventNotificationsCount <em>Event Notifications Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getNotificationsCount <em>Notifications Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getLatePublishRequestCount <em>Late Publish Request Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getCurrentKeepAliveCount <em>Current Keep Alive Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getCurrentLifetimeCount <em>Current Lifetime Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getUnacknowledgedMessageCount <em>Unacknowledged Message Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getDiscardedMessageCount <em>Discarded Message Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getMonitoredItemCount <em>Monitored Item Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getDisabledMonitoredItemCount <em>Disabled Monitored Item Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getMonitoringQueueOverflowCount <em>Monitoring Queue Overflow Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getNextSequenceNumber <em>Next Sequence Number</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SubscriptionDiagnosticsDataTypeImpl#getEventQueueOverFlowCount <em>Event Queue Over Flow Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionDiagnosticsDataTypeImpl extends MinimalEObjectImpl.Container implements SubscriptionDiagnosticsDataType {
	/**
	 * The cached value of the '{@link #getSessionId() <em>Session Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionId()
	 * @generated
	 * @ordered
	 */
	protected NodeId sessionId;

	/**
	 * This is true if the Session Id containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sessionIdESet;

	/**
	 * The default value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected static final long SUBSCRIPTION_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected long subscriptionId = SUBSCRIPTION_ID_EDEFAULT;

	/**
	 * This is true if the Subscription Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subscriptionIdESet;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final short PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected short priority = PRIORITY_EDEFAULT;

	/**
	 * This is true if the Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priorityESet;

	/**
	 * The default value of the '{@link #getPublishingInterval() <em>Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishingInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double PUBLISHING_INTERVAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPublishingInterval() <em>Publishing Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishingInterval()
	 * @generated
	 * @ordered
	 */
	protected double publishingInterval = PUBLISHING_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Publishing Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean publishingIntervalESet;

	/**
	 * The default value of the '{@link #getMaxKeepAliveCount() <em>Max Keep Alive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxKeepAliveCount()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_KEEP_ALIVE_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxKeepAliveCount() <em>Max Keep Alive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxKeepAliveCount()
	 * @generated
	 * @ordered
	 */
	protected long maxKeepAliveCount = MAX_KEEP_ALIVE_COUNT_EDEFAULT;

	/**
	 * This is true if the Max Keep Alive Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxKeepAliveCountESet;

	/**
	 * The default value of the '{@link #getMaxLifetimeCount() <em>Max Lifetime Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLifetimeCount()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_LIFETIME_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxLifetimeCount() <em>Max Lifetime Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLifetimeCount()
	 * @generated
	 * @ordered
	 */
	protected long maxLifetimeCount = MAX_LIFETIME_COUNT_EDEFAULT;

	/**
	 * This is true if the Max Lifetime Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxLifetimeCountESet;

	/**
	 * The default value of the '{@link #getMaxNotificationsPerPublish() <em>Max Notifications Per Publish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNotificationsPerPublish()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_NOTIFICATIONS_PER_PUBLISH_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxNotificationsPerPublish() <em>Max Notifications Per Publish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNotificationsPerPublish()
	 * @generated
	 * @ordered
	 */
	protected long maxNotificationsPerPublish = MAX_NOTIFICATIONS_PER_PUBLISH_EDEFAULT;

	/**
	 * This is true if the Max Notifications Per Publish attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxNotificationsPerPublishESet;

	/**
	 * The default value of the '{@link #isPublishingEnabled() <em>Publishing Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublishingEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLISHING_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublishingEnabled() <em>Publishing Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublishingEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean publishingEnabled = PUBLISHING_ENABLED_EDEFAULT;

	/**
	 * This is true if the Publishing Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean publishingEnabledESet;

	/**
	 * The default value of the '{@link #getModifyCount() <em>Modify Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifyCount()
	 * @generated
	 * @ordered
	 */
	protected static final long MODIFY_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getModifyCount() <em>Modify Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifyCount()
	 * @generated
	 * @ordered
	 */
	protected long modifyCount = MODIFY_COUNT_EDEFAULT;

	/**
	 * This is true if the Modify Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modifyCountESet;

	/**
	 * The default value of the '{@link #getEnableCount() <em>Enable Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableCount()
	 * @generated
	 * @ordered
	 */
	protected static final long ENABLE_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEnableCount() <em>Enable Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableCount()
	 * @generated
	 * @ordered
	 */
	protected long enableCount = ENABLE_COUNT_EDEFAULT;

	/**
	 * This is true if the Enable Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enableCountESet;

	/**
	 * The default value of the '{@link #getDisableCount() <em>Disable Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableCount()
	 * @generated
	 * @ordered
	 */
	protected static final long DISABLE_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDisableCount() <em>Disable Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableCount()
	 * @generated
	 * @ordered
	 */
	protected long disableCount = DISABLE_COUNT_EDEFAULT;

	/**
	 * This is true if the Disable Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disableCountESet;

	/**
	 * The default value of the '{@link #getRepublishRequestCount() <em>Republish Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepublishRequestCount()
	 * @generated
	 * @ordered
	 */
	protected static final long REPUBLISH_REQUEST_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRepublishRequestCount() <em>Republish Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepublishRequestCount()
	 * @generated
	 * @ordered
	 */
	protected long republishRequestCount = REPUBLISH_REQUEST_COUNT_EDEFAULT;

	/**
	 * This is true if the Republish Request Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean republishRequestCountESet;

	/**
	 * The default value of the '{@link #getRepublishMessageRequestCount() <em>Republish Message Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepublishMessageRequestCount()
	 * @generated
	 * @ordered
	 */
	protected static final long REPUBLISH_MESSAGE_REQUEST_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRepublishMessageRequestCount() <em>Republish Message Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepublishMessageRequestCount()
	 * @generated
	 * @ordered
	 */
	protected long republishMessageRequestCount = REPUBLISH_MESSAGE_REQUEST_COUNT_EDEFAULT;

	/**
	 * This is true if the Republish Message Request Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean republishMessageRequestCountESet;

	/**
	 * The default value of the '{@link #getRepublishMessageCount() <em>Republish Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepublishMessageCount()
	 * @generated
	 * @ordered
	 */
	protected static final long REPUBLISH_MESSAGE_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRepublishMessageCount() <em>Republish Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepublishMessageCount()
	 * @generated
	 * @ordered
	 */
	protected long republishMessageCount = REPUBLISH_MESSAGE_COUNT_EDEFAULT;

	/**
	 * This is true if the Republish Message Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean republishMessageCountESet;

	/**
	 * The default value of the '{@link #getTransferRequestCount() <em>Transfer Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferRequestCount()
	 * @generated
	 * @ordered
	 */
	protected static final long TRANSFER_REQUEST_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTransferRequestCount() <em>Transfer Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferRequestCount()
	 * @generated
	 * @ordered
	 */
	protected long transferRequestCount = TRANSFER_REQUEST_COUNT_EDEFAULT;

	/**
	 * This is true if the Transfer Request Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transferRequestCountESet;

	/**
	 * The default value of the '{@link #getTransferredToAltClientCount() <em>Transferred To Alt Client Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferredToAltClientCount()
	 * @generated
	 * @ordered
	 */
	protected static final long TRANSFERRED_TO_ALT_CLIENT_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTransferredToAltClientCount() <em>Transferred To Alt Client Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferredToAltClientCount()
	 * @generated
	 * @ordered
	 */
	protected long transferredToAltClientCount = TRANSFERRED_TO_ALT_CLIENT_COUNT_EDEFAULT;

	/**
	 * This is true if the Transferred To Alt Client Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transferredToAltClientCountESet;

	/**
	 * The default value of the '{@link #getTransferredToSameClientCount() <em>Transferred To Same Client Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferredToSameClientCount()
	 * @generated
	 * @ordered
	 */
	protected static final long TRANSFERRED_TO_SAME_CLIENT_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTransferredToSameClientCount() <em>Transferred To Same Client Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferredToSameClientCount()
	 * @generated
	 * @ordered
	 */
	protected long transferredToSameClientCount = TRANSFERRED_TO_SAME_CLIENT_COUNT_EDEFAULT;

	/**
	 * This is true if the Transferred To Same Client Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transferredToSameClientCountESet;

	/**
	 * The default value of the '{@link #getPublishRequestCount() <em>Publish Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishRequestCount()
	 * @generated
	 * @ordered
	 */
	protected static final long PUBLISH_REQUEST_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPublishRequestCount() <em>Publish Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishRequestCount()
	 * @generated
	 * @ordered
	 */
	protected long publishRequestCount = PUBLISH_REQUEST_COUNT_EDEFAULT;

	/**
	 * This is true if the Publish Request Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean publishRequestCountESet;

	/**
	 * The default value of the '{@link #getDataChangeNotificationsCount() <em>Data Change Notifications Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataChangeNotificationsCount()
	 * @generated
	 * @ordered
	 */
	protected static final long DATA_CHANGE_NOTIFICATIONS_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDataChangeNotificationsCount() <em>Data Change Notifications Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataChangeNotificationsCount()
	 * @generated
	 * @ordered
	 */
	protected long dataChangeNotificationsCount = DATA_CHANGE_NOTIFICATIONS_COUNT_EDEFAULT;

	/**
	 * This is true if the Data Change Notifications Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataChangeNotificationsCountESet;

	/**
	 * The default value of the '{@link #getEventNotificationsCount() <em>Event Notifications Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventNotificationsCount()
	 * @generated
	 * @ordered
	 */
	protected static final long EVENT_NOTIFICATIONS_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEventNotificationsCount() <em>Event Notifications Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventNotificationsCount()
	 * @generated
	 * @ordered
	 */
	protected long eventNotificationsCount = EVENT_NOTIFICATIONS_COUNT_EDEFAULT;

	/**
	 * This is true if the Event Notifications Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eventNotificationsCountESet;

	/**
	 * The default value of the '{@link #getNotificationsCount() <em>Notifications Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationsCount()
	 * @generated
	 * @ordered
	 */
	protected static final long NOTIFICATIONS_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNotificationsCount() <em>Notifications Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationsCount()
	 * @generated
	 * @ordered
	 */
	protected long notificationsCount = NOTIFICATIONS_COUNT_EDEFAULT;

	/**
	 * This is true if the Notifications Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean notificationsCountESet;

	/**
	 * The default value of the '{@link #getLatePublishRequestCount() <em>Late Publish Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatePublishRequestCount()
	 * @generated
	 * @ordered
	 */
	protected static final long LATE_PUBLISH_REQUEST_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLatePublishRequestCount() <em>Late Publish Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatePublishRequestCount()
	 * @generated
	 * @ordered
	 */
	protected long latePublishRequestCount = LATE_PUBLISH_REQUEST_COUNT_EDEFAULT;

	/**
	 * This is true if the Late Publish Request Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean latePublishRequestCountESet;

	/**
	 * The default value of the '{@link #getCurrentKeepAliveCount() <em>Current Keep Alive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentKeepAliveCount()
	 * @generated
	 * @ordered
	 */
	protected static final long CURRENT_KEEP_ALIVE_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCurrentKeepAliveCount() <em>Current Keep Alive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentKeepAliveCount()
	 * @generated
	 * @ordered
	 */
	protected long currentKeepAliveCount = CURRENT_KEEP_ALIVE_COUNT_EDEFAULT;

	/**
	 * This is true if the Current Keep Alive Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currentKeepAliveCountESet;

	/**
	 * The default value of the '{@link #getCurrentLifetimeCount() <em>Current Lifetime Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLifetimeCount()
	 * @generated
	 * @ordered
	 */
	protected static final long CURRENT_LIFETIME_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCurrentLifetimeCount() <em>Current Lifetime Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLifetimeCount()
	 * @generated
	 * @ordered
	 */
	protected long currentLifetimeCount = CURRENT_LIFETIME_COUNT_EDEFAULT;

	/**
	 * This is true if the Current Lifetime Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currentLifetimeCountESet;

	/**
	 * The default value of the '{@link #getUnacknowledgedMessageCount() <em>Unacknowledged Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnacknowledgedMessageCount()
	 * @generated
	 * @ordered
	 */
	protected static final long UNACKNOWLEDGED_MESSAGE_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUnacknowledgedMessageCount() <em>Unacknowledged Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnacknowledgedMessageCount()
	 * @generated
	 * @ordered
	 */
	protected long unacknowledgedMessageCount = UNACKNOWLEDGED_MESSAGE_COUNT_EDEFAULT;

	/**
	 * This is true if the Unacknowledged Message Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unacknowledgedMessageCountESet;

	/**
	 * The default value of the '{@link #getDiscardedMessageCount() <em>Discarded Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscardedMessageCount()
	 * @generated
	 * @ordered
	 */
	protected static final long DISCARDED_MESSAGE_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDiscardedMessageCount() <em>Discarded Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscardedMessageCount()
	 * @generated
	 * @ordered
	 */
	protected long discardedMessageCount = DISCARDED_MESSAGE_COUNT_EDEFAULT;

	/**
	 * This is true if the Discarded Message Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean discardedMessageCountESet;

	/**
	 * The default value of the '{@link #getMonitoredItemCount() <em>Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredItemCount()
	 * @generated
	 * @ordered
	 */
	protected static final long MONITORED_ITEM_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMonitoredItemCount() <em>Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredItemCount()
	 * @generated
	 * @ordered
	 */
	protected long monitoredItemCount = MONITORED_ITEM_COUNT_EDEFAULT;

	/**
	 * This is true if the Monitored Item Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean monitoredItemCountESet;

	/**
	 * The default value of the '{@link #getDisabledMonitoredItemCount() <em>Disabled Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabledMonitoredItemCount()
	 * @generated
	 * @ordered
	 */
	protected static final long DISABLED_MONITORED_ITEM_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDisabledMonitoredItemCount() <em>Disabled Monitored Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabledMonitoredItemCount()
	 * @generated
	 * @ordered
	 */
	protected long disabledMonitoredItemCount = DISABLED_MONITORED_ITEM_COUNT_EDEFAULT;

	/**
	 * This is true if the Disabled Monitored Item Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disabledMonitoredItemCountESet;

	/**
	 * The default value of the '{@link #getMonitoringQueueOverflowCount() <em>Monitoring Queue Overflow Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringQueueOverflowCount()
	 * @generated
	 * @ordered
	 */
	protected static final long MONITORING_QUEUE_OVERFLOW_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMonitoringQueueOverflowCount() <em>Monitoring Queue Overflow Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringQueueOverflowCount()
	 * @generated
	 * @ordered
	 */
	protected long monitoringQueueOverflowCount = MONITORING_QUEUE_OVERFLOW_COUNT_EDEFAULT;

	/**
	 * This is true if the Monitoring Queue Overflow Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean monitoringQueueOverflowCountESet;

	/**
	 * The default value of the '{@link #getNextSequenceNumber() <em>Next Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final long NEXT_SEQUENCE_NUMBER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNextSequenceNumber() <em>Next Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected long nextSequenceNumber = NEXT_SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Next Sequence Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nextSequenceNumberESet;

	/**
	 * The default value of the '{@link #getEventQueueOverFlowCount() <em>Event Queue Over Flow Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventQueueOverFlowCount()
	 * @generated
	 * @ordered
	 */
	protected static final long EVENT_QUEUE_OVER_FLOW_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEventQueueOverFlowCount() <em>Event Queue Over Flow Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventQueueOverFlowCount()
	 * @generated
	 * @ordered
	 */
	protected long eventQueueOverFlowCount = EVENT_QUEUE_OVER_FLOW_COUNT_EDEFAULT;

	/**
	 * This is true if the Event Queue Over Flow Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eventQueueOverFlowCountESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionDiagnosticsDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getSubscriptionDiagnosticsDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId getSessionId() {
		return sessionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSessionId(NodeId newSessionId, NotificationChain msgs) {
		NodeId oldSessionId = sessionId;
		sessionId = newSessionId;
		boolean oldSessionIdESet = sessionIdESet;
		sessionIdESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SESSION_ID, oldSessionId, newSessionId, !oldSessionIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionId(NodeId newSessionId) {
		if (newSessionId != sessionId) {
			NotificationChain msgs = null;
			if (sessionId != null)
				msgs = ((InternalEObject)sessionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SESSION_ID, null, msgs);
			if (newSessionId != null)
				msgs = ((InternalEObject)newSessionId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SESSION_ID, null, msgs);
			msgs = basicSetSessionId(newSessionId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSessionIdESet = sessionIdESet;
			sessionIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SESSION_ID, newSessionId, newSessionId, !oldSessionIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSessionId(NotificationChain msgs) {
		NodeId oldSessionId = sessionId;
		sessionId = null;
		boolean oldSessionIdESet = sessionIdESet;
		sessionIdESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SESSION_ID, oldSessionId, null, oldSessionIdESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSessionId() {
		if (sessionId != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)sessionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SESSION_ID, null, msgs);
			msgs = basicUnsetSessionId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSessionIdESet = sessionIdESet;
			sessionIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SESSION_ID, null, null, oldSessionIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSessionId() {
		return sessionIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSubscriptionId() {
		return subscriptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionId(long newSubscriptionId) {
		long oldSubscriptionId = subscriptionId;
		subscriptionId = newSubscriptionId;
		boolean oldSubscriptionIdESet = subscriptionIdESet;
		subscriptionIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SUBSCRIPTION_ID, oldSubscriptionId, subscriptionId, !oldSubscriptionIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSubscriptionId() {
		long oldSubscriptionId = subscriptionId;
		boolean oldSubscriptionIdESet = subscriptionIdESet;
		subscriptionId = SUBSCRIPTION_ID_EDEFAULT;
		subscriptionIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SUBSCRIPTION_ID, oldSubscriptionId, SUBSCRIPTION_ID_EDEFAULT, oldSubscriptionIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubscriptionId() {
		return subscriptionIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(short newPriority) {
		short oldPriority = priority;
		priority = newPriority;
		boolean oldPriorityESet = priorityESet;
		priorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PRIORITY, oldPriority, priority, !oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriority() {
		short oldPriority = priority;
		boolean oldPriorityESet = priorityESet;
		priority = PRIORITY_EDEFAULT;
		priorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PRIORITY, oldPriority, PRIORITY_EDEFAULT, oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriority() {
		return priorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPublishingInterval() {
		return publishingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishingInterval(double newPublishingInterval) {
		double oldPublishingInterval = publishingInterval;
		publishingInterval = newPublishingInterval;
		boolean oldPublishingIntervalESet = publishingIntervalESet;
		publishingIntervalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISHING_INTERVAL, oldPublishingInterval, publishingInterval, !oldPublishingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPublishingInterval() {
		double oldPublishingInterval = publishingInterval;
		boolean oldPublishingIntervalESet = publishingIntervalESet;
		publishingInterval = PUBLISHING_INTERVAL_EDEFAULT;
		publishingIntervalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISHING_INTERVAL, oldPublishingInterval, PUBLISHING_INTERVAL_EDEFAULT, oldPublishingIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPublishingInterval() {
		return publishingIntervalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxKeepAliveCount() {
		return maxKeepAliveCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxKeepAliveCount(long newMaxKeepAliveCount) {
		long oldMaxKeepAliveCount = maxKeepAliveCount;
		maxKeepAliveCount = newMaxKeepAliveCount;
		boolean oldMaxKeepAliveCountESet = maxKeepAliveCountESet;
		maxKeepAliveCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_KEEP_ALIVE_COUNT, oldMaxKeepAliveCount, maxKeepAliveCount, !oldMaxKeepAliveCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxKeepAliveCount() {
		long oldMaxKeepAliveCount = maxKeepAliveCount;
		boolean oldMaxKeepAliveCountESet = maxKeepAliveCountESet;
		maxKeepAliveCount = MAX_KEEP_ALIVE_COUNT_EDEFAULT;
		maxKeepAliveCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_KEEP_ALIVE_COUNT, oldMaxKeepAliveCount, MAX_KEEP_ALIVE_COUNT_EDEFAULT, oldMaxKeepAliveCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxKeepAliveCount() {
		return maxKeepAliveCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxLifetimeCount() {
		return maxLifetimeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLifetimeCount(long newMaxLifetimeCount) {
		long oldMaxLifetimeCount = maxLifetimeCount;
		maxLifetimeCount = newMaxLifetimeCount;
		boolean oldMaxLifetimeCountESet = maxLifetimeCountESet;
		maxLifetimeCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_LIFETIME_COUNT, oldMaxLifetimeCount, maxLifetimeCount, !oldMaxLifetimeCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxLifetimeCount() {
		long oldMaxLifetimeCount = maxLifetimeCount;
		boolean oldMaxLifetimeCountESet = maxLifetimeCountESet;
		maxLifetimeCount = MAX_LIFETIME_COUNT_EDEFAULT;
		maxLifetimeCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_LIFETIME_COUNT, oldMaxLifetimeCount, MAX_LIFETIME_COUNT_EDEFAULT, oldMaxLifetimeCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxLifetimeCount() {
		return maxLifetimeCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxNotificationsPerPublish() {
		return maxNotificationsPerPublish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNotificationsPerPublish(long newMaxNotificationsPerPublish) {
		long oldMaxNotificationsPerPublish = maxNotificationsPerPublish;
		maxNotificationsPerPublish = newMaxNotificationsPerPublish;
		boolean oldMaxNotificationsPerPublishESet = maxNotificationsPerPublishESet;
		maxNotificationsPerPublishESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_NOTIFICATIONS_PER_PUBLISH, oldMaxNotificationsPerPublish, maxNotificationsPerPublish, !oldMaxNotificationsPerPublishESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxNotificationsPerPublish() {
		long oldMaxNotificationsPerPublish = maxNotificationsPerPublish;
		boolean oldMaxNotificationsPerPublishESet = maxNotificationsPerPublishESet;
		maxNotificationsPerPublish = MAX_NOTIFICATIONS_PER_PUBLISH_EDEFAULT;
		maxNotificationsPerPublishESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_NOTIFICATIONS_PER_PUBLISH, oldMaxNotificationsPerPublish, MAX_NOTIFICATIONS_PER_PUBLISH_EDEFAULT, oldMaxNotificationsPerPublishESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxNotificationsPerPublish() {
		return maxNotificationsPerPublishESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublishingEnabled() {
		return publishingEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishingEnabled(boolean newPublishingEnabled) {
		boolean oldPublishingEnabled = publishingEnabled;
		publishingEnabled = newPublishingEnabled;
		boolean oldPublishingEnabledESet = publishingEnabledESet;
		publishingEnabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISHING_ENABLED, oldPublishingEnabled, publishingEnabled, !oldPublishingEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPublishingEnabled() {
		boolean oldPublishingEnabled = publishingEnabled;
		boolean oldPublishingEnabledESet = publishingEnabledESet;
		publishingEnabled = PUBLISHING_ENABLED_EDEFAULT;
		publishingEnabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISHING_ENABLED, oldPublishingEnabled, PUBLISHING_ENABLED_EDEFAULT, oldPublishingEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPublishingEnabled() {
		return publishingEnabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getModifyCount() {
		return modifyCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifyCount(long newModifyCount) {
		long oldModifyCount = modifyCount;
		modifyCount = newModifyCount;
		boolean oldModifyCountESet = modifyCountESet;
		modifyCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MODIFY_COUNT, oldModifyCount, modifyCount, !oldModifyCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModifyCount() {
		long oldModifyCount = modifyCount;
		boolean oldModifyCountESet = modifyCountESet;
		modifyCount = MODIFY_COUNT_EDEFAULT;
		modifyCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MODIFY_COUNT, oldModifyCount, MODIFY_COUNT_EDEFAULT, oldModifyCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModifyCount() {
		return modifyCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEnableCount() {
		return enableCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableCount(long newEnableCount) {
		long oldEnableCount = enableCount;
		enableCount = newEnableCount;
		boolean oldEnableCountESet = enableCountESet;
		enableCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__ENABLE_COUNT, oldEnableCount, enableCount, !oldEnableCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnableCount() {
		long oldEnableCount = enableCount;
		boolean oldEnableCountESet = enableCountESet;
		enableCount = ENABLE_COUNT_EDEFAULT;
		enableCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__ENABLE_COUNT, oldEnableCount, ENABLE_COUNT_EDEFAULT, oldEnableCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnableCount() {
		return enableCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDisableCount() {
		return disableCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisableCount(long newDisableCount) {
		long oldDisableCount = disableCount;
		disableCount = newDisableCount;
		boolean oldDisableCountESet = disableCountESet;
		disableCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISABLE_COUNT, oldDisableCount, disableCount, !oldDisableCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisableCount() {
		long oldDisableCount = disableCount;
		boolean oldDisableCountESet = disableCountESet;
		disableCount = DISABLE_COUNT_EDEFAULT;
		disableCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISABLE_COUNT, oldDisableCount, DISABLE_COUNT_EDEFAULT, oldDisableCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisableCount() {
		return disableCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRepublishRequestCount() {
		return republishRequestCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepublishRequestCount(long newRepublishRequestCount) {
		long oldRepublishRequestCount = republishRequestCount;
		republishRequestCount = newRepublishRequestCount;
		boolean oldRepublishRequestCountESet = republishRequestCountESet;
		republishRequestCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_REQUEST_COUNT, oldRepublishRequestCount, republishRequestCount, !oldRepublishRequestCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepublishRequestCount() {
		long oldRepublishRequestCount = republishRequestCount;
		boolean oldRepublishRequestCountESet = republishRequestCountESet;
		republishRequestCount = REPUBLISH_REQUEST_COUNT_EDEFAULT;
		republishRequestCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_REQUEST_COUNT, oldRepublishRequestCount, REPUBLISH_REQUEST_COUNT_EDEFAULT, oldRepublishRequestCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepublishRequestCount() {
		return republishRequestCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRepublishMessageRequestCount() {
		return republishMessageRequestCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepublishMessageRequestCount(long newRepublishMessageRequestCount) {
		long oldRepublishMessageRequestCount = republishMessageRequestCount;
		republishMessageRequestCount = newRepublishMessageRequestCount;
		boolean oldRepublishMessageRequestCountESet = republishMessageRequestCountESet;
		republishMessageRequestCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_MESSAGE_REQUEST_COUNT, oldRepublishMessageRequestCount, republishMessageRequestCount, !oldRepublishMessageRequestCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepublishMessageRequestCount() {
		long oldRepublishMessageRequestCount = republishMessageRequestCount;
		boolean oldRepublishMessageRequestCountESet = republishMessageRequestCountESet;
		republishMessageRequestCount = REPUBLISH_MESSAGE_REQUEST_COUNT_EDEFAULT;
		republishMessageRequestCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_MESSAGE_REQUEST_COUNT, oldRepublishMessageRequestCount, REPUBLISH_MESSAGE_REQUEST_COUNT_EDEFAULT, oldRepublishMessageRequestCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepublishMessageRequestCount() {
		return republishMessageRequestCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRepublishMessageCount() {
		return republishMessageCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepublishMessageCount(long newRepublishMessageCount) {
		long oldRepublishMessageCount = republishMessageCount;
		republishMessageCount = newRepublishMessageCount;
		boolean oldRepublishMessageCountESet = republishMessageCountESet;
		republishMessageCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_MESSAGE_COUNT, oldRepublishMessageCount, republishMessageCount, !oldRepublishMessageCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepublishMessageCount() {
		long oldRepublishMessageCount = republishMessageCount;
		boolean oldRepublishMessageCountESet = republishMessageCountESet;
		republishMessageCount = REPUBLISH_MESSAGE_COUNT_EDEFAULT;
		republishMessageCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_MESSAGE_COUNT, oldRepublishMessageCount, REPUBLISH_MESSAGE_COUNT_EDEFAULT, oldRepublishMessageCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepublishMessageCount() {
		return republishMessageCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTransferRequestCount() {
		return transferRequestCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferRequestCount(long newTransferRequestCount) {
		long oldTransferRequestCount = transferRequestCount;
		transferRequestCount = newTransferRequestCount;
		boolean oldTransferRequestCountESet = transferRequestCountESet;
		transferRequestCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFER_REQUEST_COUNT, oldTransferRequestCount, transferRequestCount, !oldTransferRequestCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransferRequestCount() {
		long oldTransferRequestCount = transferRequestCount;
		boolean oldTransferRequestCountESet = transferRequestCountESet;
		transferRequestCount = TRANSFER_REQUEST_COUNT_EDEFAULT;
		transferRequestCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFER_REQUEST_COUNT, oldTransferRequestCount, TRANSFER_REQUEST_COUNT_EDEFAULT, oldTransferRequestCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransferRequestCount() {
		return transferRequestCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTransferredToAltClientCount() {
		return transferredToAltClientCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferredToAltClientCount(long newTransferredToAltClientCount) {
		long oldTransferredToAltClientCount = transferredToAltClientCount;
		transferredToAltClientCount = newTransferredToAltClientCount;
		boolean oldTransferredToAltClientCountESet = transferredToAltClientCountESet;
		transferredToAltClientCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFERRED_TO_ALT_CLIENT_COUNT, oldTransferredToAltClientCount, transferredToAltClientCount, !oldTransferredToAltClientCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransferredToAltClientCount() {
		long oldTransferredToAltClientCount = transferredToAltClientCount;
		boolean oldTransferredToAltClientCountESet = transferredToAltClientCountESet;
		transferredToAltClientCount = TRANSFERRED_TO_ALT_CLIENT_COUNT_EDEFAULT;
		transferredToAltClientCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFERRED_TO_ALT_CLIENT_COUNT, oldTransferredToAltClientCount, TRANSFERRED_TO_ALT_CLIENT_COUNT_EDEFAULT, oldTransferredToAltClientCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransferredToAltClientCount() {
		return transferredToAltClientCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTransferredToSameClientCount() {
		return transferredToSameClientCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferredToSameClientCount(long newTransferredToSameClientCount) {
		long oldTransferredToSameClientCount = transferredToSameClientCount;
		transferredToSameClientCount = newTransferredToSameClientCount;
		boolean oldTransferredToSameClientCountESet = transferredToSameClientCountESet;
		transferredToSameClientCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFERRED_TO_SAME_CLIENT_COUNT, oldTransferredToSameClientCount, transferredToSameClientCount, !oldTransferredToSameClientCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransferredToSameClientCount() {
		long oldTransferredToSameClientCount = transferredToSameClientCount;
		boolean oldTransferredToSameClientCountESet = transferredToSameClientCountESet;
		transferredToSameClientCount = TRANSFERRED_TO_SAME_CLIENT_COUNT_EDEFAULT;
		transferredToSameClientCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFERRED_TO_SAME_CLIENT_COUNT, oldTransferredToSameClientCount, TRANSFERRED_TO_SAME_CLIENT_COUNT_EDEFAULT, oldTransferredToSameClientCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransferredToSameClientCount() {
		return transferredToSameClientCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPublishRequestCount() {
		return publishRequestCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishRequestCount(long newPublishRequestCount) {
		long oldPublishRequestCount = publishRequestCount;
		publishRequestCount = newPublishRequestCount;
		boolean oldPublishRequestCountESet = publishRequestCountESet;
		publishRequestCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISH_REQUEST_COUNT, oldPublishRequestCount, publishRequestCount, !oldPublishRequestCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPublishRequestCount() {
		long oldPublishRequestCount = publishRequestCount;
		boolean oldPublishRequestCountESet = publishRequestCountESet;
		publishRequestCount = PUBLISH_REQUEST_COUNT_EDEFAULT;
		publishRequestCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISH_REQUEST_COUNT, oldPublishRequestCount, PUBLISH_REQUEST_COUNT_EDEFAULT, oldPublishRequestCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPublishRequestCount() {
		return publishRequestCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDataChangeNotificationsCount() {
		return dataChangeNotificationsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataChangeNotificationsCount(long newDataChangeNotificationsCount) {
		long oldDataChangeNotificationsCount = dataChangeNotificationsCount;
		dataChangeNotificationsCount = newDataChangeNotificationsCount;
		boolean oldDataChangeNotificationsCountESet = dataChangeNotificationsCountESet;
		dataChangeNotificationsCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DATA_CHANGE_NOTIFICATIONS_COUNT, oldDataChangeNotificationsCount, dataChangeNotificationsCount, !oldDataChangeNotificationsCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataChangeNotificationsCount() {
		long oldDataChangeNotificationsCount = dataChangeNotificationsCount;
		boolean oldDataChangeNotificationsCountESet = dataChangeNotificationsCountESet;
		dataChangeNotificationsCount = DATA_CHANGE_NOTIFICATIONS_COUNT_EDEFAULT;
		dataChangeNotificationsCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DATA_CHANGE_NOTIFICATIONS_COUNT, oldDataChangeNotificationsCount, DATA_CHANGE_NOTIFICATIONS_COUNT_EDEFAULT, oldDataChangeNotificationsCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataChangeNotificationsCount() {
		return dataChangeNotificationsCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEventNotificationsCount() {
		return eventNotificationsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventNotificationsCount(long newEventNotificationsCount) {
		long oldEventNotificationsCount = eventNotificationsCount;
		eventNotificationsCount = newEventNotificationsCount;
		boolean oldEventNotificationsCountESet = eventNotificationsCountESet;
		eventNotificationsCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__EVENT_NOTIFICATIONS_COUNT, oldEventNotificationsCount, eventNotificationsCount, !oldEventNotificationsCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEventNotificationsCount() {
		long oldEventNotificationsCount = eventNotificationsCount;
		boolean oldEventNotificationsCountESet = eventNotificationsCountESet;
		eventNotificationsCount = EVENT_NOTIFICATIONS_COUNT_EDEFAULT;
		eventNotificationsCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__EVENT_NOTIFICATIONS_COUNT, oldEventNotificationsCount, EVENT_NOTIFICATIONS_COUNT_EDEFAULT, oldEventNotificationsCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEventNotificationsCount() {
		return eventNotificationsCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNotificationsCount() {
		return notificationsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationsCount(long newNotificationsCount) {
		long oldNotificationsCount = notificationsCount;
		notificationsCount = newNotificationsCount;
		boolean oldNotificationsCountESet = notificationsCountESet;
		notificationsCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__NOTIFICATIONS_COUNT, oldNotificationsCount, notificationsCount, !oldNotificationsCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNotificationsCount() {
		long oldNotificationsCount = notificationsCount;
		boolean oldNotificationsCountESet = notificationsCountESet;
		notificationsCount = NOTIFICATIONS_COUNT_EDEFAULT;
		notificationsCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__NOTIFICATIONS_COUNT, oldNotificationsCount, NOTIFICATIONS_COUNT_EDEFAULT, oldNotificationsCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNotificationsCount() {
		return notificationsCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLatePublishRequestCount() {
		return latePublishRequestCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatePublishRequestCount(long newLatePublishRequestCount) {
		long oldLatePublishRequestCount = latePublishRequestCount;
		latePublishRequestCount = newLatePublishRequestCount;
		boolean oldLatePublishRequestCountESet = latePublishRequestCountESet;
		latePublishRequestCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__LATE_PUBLISH_REQUEST_COUNT, oldLatePublishRequestCount, latePublishRequestCount, !oldLatePublishRequestCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLatePublishRequestCount() {
		long oldLatePublishRequestCount = latePublishRequestCount;
		boolean oldLatePublishRequestCountESet = latePublishRequestCountESet;
		latePublishRequestCount = LATE_PUBLISH_REQUEST_COUNT_EDEFAULT;
		latePublishRequestCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__LATE_PUBLISH_REQUEST_COUNT, oldLatePublishRequestCount, LATE_PUBLISH_REQUEST_COUNT_EDEFAULT, oldLatePublishRequestCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLatePublishRequestCount() {
		return latePublishRequestCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCurrentKeepAliveCount() {
		return currentKeepAliveCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentKeepAliveCount(long newCurrentKeepAliveCount) {
		long oldCurrentKeepAliveCount = currentKeepAliveCount;
		currentKeepAliveCount = newCurrentKeepAliveCount;
		boolean oldCurrentKeepAliveCountESet = currentKeepAliveCountESet;
		currentKeepAliveCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__CURRENT_KEEP_ALIVE_COUNT, oldCurrentKeepAliveCount, currentKeepAliveCount, !oldCurrentKeepAliveCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrentKeepAliveCount() {
		long oldCurrentKeepAliveCount = currentKeepAliveCount;
		boolean oldCurrentKeepAliveCountESet = currentKeepAliveCountESet;
		currentKeepAliveCount = CURRENT_KEEP_ALIVE_COUNT_EDEFAULT;
		currentKeepAliveCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__CURRENT_KEEP_ALIVE_COUNT, oldCurrentKeepAliveCount, CURRENT_KEEP_ALIVE_COUNT_EDEFAULT, oldCurrentKeepAliveCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrentKeepAliveCount() {
		return currentKeepAliveCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCurrentLifetimeCount() {
		return currentLifetimeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentLifetimeCount(long newCurrentLifetimeCount) {
		long oldCurrentLifetimeCount = currentLifetimeCount;
		currentLifetimeCount = newCurrentLifetimeCount;
		boolean oldCurrentLifetimeCountESet = currentLifetimeCountESet;
		currentLifetimeCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__CURRENT_LIFETIME_COUNT, oldCurrentLifetimeCount, currentLifetimeCount, !oldCurrentLifetimeCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrentLifetimeCount() {
		long oldCurrentLifetimeCount = currentLifetimeCount;
		boolean oldCurrentLifetimeCountESet = currentLifetimeCountESet;
		currentLifetimeCount = CURRENT_LIFETIME_COUNT_EDEFAULT;
		currentLifetimeCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__CURRENT_LIFETIME_COUNT, oldCurrentLifetimeCount, CURRENT_LIFETIME_COUNT_EDEFAULT, oldCurrentLifetimeCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrentLifetimeCount() {
		return currentLifetimeCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUnacknowledgedMessageCount() {
		return unacknowledgedMessageCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnacknowledgedMessageCount(long newUnacknowledgedMessageCount) {
		long oldUnacknowledgedMessageCount = unacknowledgedMessageCount;
		unacknowledgedMessageCount = newUnacknowledgedMessageCount;
		boolean oldUnacknowledgedMessageCountESet = unacknowledgedMessageCountESet;
		unacknowledgedMessageCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__UNACKNOWLEDGED_MESSAGE_COUNT, oldUnacknowledgedMessageCount, unacknowledgedMessageCount, !oldUnacknowledgedMessageCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnacknowledgedMessageCount() {
		long oldUnacknowledgedMessageCount = unacknowledgedMessageCount;
		boolean oldUnacknowledgedMessageCountESet = unacknowledgedMessageCountESet;
		unacknowledgedMessageCount = UNACKNOWLEDGED_MESSAGE_COUNT_EDEFAULT;
		unacknowledgedMessageCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__UNACKNOWLEDGED_MESSAGE_COUNT, oldUnacknowledgedMessageCount, UNACKNOWLEDGED_MESSAGE_COUNT_EDEFAULT, oldUnacknowledgedMessageCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnacknowledgedMessageCount() {
		return unacknowledgedMessageCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDiscardedMessageCount() {
		return discardedMessageCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscardedMessageCount(long newDiscardedMessageCount) {
		long oldDiscardedMessageCount = discardedMessageCount;
		discardedMessageCount = newDiscardedMessageCount;
		boolean oldDiscardedMessageCountESet = discardedMessageCountESet;
		discardedMessageCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISCARDED_MESSAGE_COUNT, oldDiscardedMessageCount, discardedMessageCount, !oldDiscardedMessageCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDiscardedMessageCount() {
		long oldDiscardedMessageCount = discardedMessageCount;
		boolean oldDiscardedMessageCountESet = discardedMessageCountESet;
		discardedMessageCount = DISCARDED_MESSAGE_COUNT_EDEFAULT;
		discardedMessageCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISCARDED_MESSAGE_COUNT, oldDiscardedMessageCount, DISCARDED_MESSAGE_COUNT_EDEFAULT, oldDiscardedMessageCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiscardedMessageCount() {
		return discardedMessageCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMonitoredItemCount() {
		return monitoredItemCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoredItemCount(long newMonitoredItemCount) {
		long oldMonitoredItemCount = monitoredItemCount;
		monitoredItemCount = newMonitoredItemCount;
		boolean oldMonitoredItemCountESet = monitoredItemCountESet;
		monitoredItemCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MONITORED_ITEM_COUNT, oldMonitoredItemCount, monitoredItemCount, !oldMonitoredItemCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMonitoredItemCount() {
		long oldMonitoredItemCount = monitoredItemCount;
		boolean oldMonitoredItemCountESet = monitoredItemCountESet;
		monitoredItemCount = MONITORED_ITEM_COUNT_EDEFAULT;
		monitoredItemCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MONITORED_ITEM_COUNT, oldMonitoredItemCount, MONITORED_ITEM_COUNT_EDEFAULT, oldMonitoredItemCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMonitoredItemCount() {
		return monitoredItemCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDisabledMonitoredItemCount() {
		return disabledMonitoredItemCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabledMonitoredItemCount(long newDisabledMonitoredItemCount) {
		long oldDisabledMonitoredItemCount = disabledMonitoredItemCount;
		disabledMonitoredItemCount = newDisabledMonitoredItemCount;
		boolean oldDisabledMonitoredItemCountESet = disabledMonitoredItemCountESet;
		disabledMonitoredItemCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISABLED_MONITORED_ITEM_COUNT, oldDisabledMonitoredItemCount, disabledMonitoredItemCount, !oldDisabledMonitoredItemCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisabledMonitoredItemCount() {
		long oldDisabledMonitoredItemCount = disabledMonitoredItemCount;
		boolean oldDisabledMonitoredItemCountESet = disabledMonitoredItemCountESet;
		disabledMonitoredItemCount = DISABLED_MONITORED_ITEM_COUNT_EDEFAULT;
		disabledMonitoredItemCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISABLED_MONITORED_ITEM_COUNT, oldDisabledMonitoredItemCount, DISABLED_MONITORED_ITEM_COUNT_EDEFAULT, oldDisabledMonitoredItemCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisabledMonitoredItemCount() {
		return disabledMonitoredItemCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMonitoringQueueOverflowCount() {
		return monitoringQueueOverflowCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoringQueueOverflowCount(long newMonitoringQueueOverflowCount) {
		long oldMonitoringQueueOverflowCount = monitoringQueueOverflowCount;
		monitoringQueueOverflowCount = newMonitoringQueueOverflowCount;
		boolean oldMonitoringQueueOverflowCountESet = monitoringQueueOverflowCountESet;
		monitoringQueueOverflowCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MONITORING_QUEUE_OVERFLOW_COUNT, oldMonitoringQueueOverflowCount, monitoringQueueOverflowCount, !oldMonitoringQueueOverflowCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMonitoringQueueOverflowCount() {
		long oldMonitoringQueueOverflowCount = monitoringQueueOverflowCount;
		boolean oldMonitoringQueueOverflowCountESet = monitoringQueueOverflowCountESet;
		monitoringQueueOverflowCount = MONITORING_QUEUE_OVERFLOW_COUNT_EDEFAULT;
		monitoringQueueOverflowCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MONITORING_QUEUE_OVERFLOW_COUNT, oldMonitoringQueueOverflowCount, MONITORING_QUEUE_OVERFLOW_COUNT_EDEFAULT, oldMonitoringQueueOverflowCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMonitoringQueueOverflowCount() {
		return monitoringQueueOverflowCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNextSequenceNumber() {
		return nextSequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextSequenceNumber(long newNextSequenceNumber) {
		long oldNextSequenceNumber = nextSequenceNumber;
		nextSequenceNumber = newNextSequenceNumber;
		boolean oldNextSequenceNumberESet = nextSequenceNumberESet;
		nextSequenceNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__NEXT_SEQUENCE_NUMBER, oldNextSequenceNumber, nextSequenceNumber, !oldNextSequenceNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNextSequenceNumber() {
		long oldNextSequenceNumber = nextSequenceNumber;
		boolean oldNextSequenceNumberESet = nextSequenceNumberESet;
		nextSequenceNumber = NEXT_SEQUENCE_NUMBER_EDEFAULT;
		nextSequenceNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__NEXT_SEQUENCE_NUMBER, oldNextSequenceNumber, NEXT_SEQUENCE_NUMBER_EDEFAULT, oldNextSequenceNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNextSequenceNumber() {
		return nextSequenceNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEventQueueOverFlowCount() {
		return eventQueueOverFlowCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventQueueOverFlowCount(long newEventQueueOverFlowCount) {
		long oldEventQueueOverFlowCount = eventQueueOverFlowCount;
		eventQueueOverFlowCount = newEventQueueOverFlowCount;
		boolean oldEventQueueOverFlowCountESet = eventQueueOverFlowCountESet;
		eventQueueOverFlowCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__EVENT_QUEUE_OVER_FLOW_COUNT, oldEventQueueOverFlowCount, eventQueueOverFlowCount, !oldEventQueueOverFlowCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEventQueueOverFlowCount() {
		long oldEventQueueOverFlowCount = eventQueueOverFlowCount;
		boolean oldEventQueueOverFlowCountESet = eventQueueOverFlowCountESet;
		eventQueueOverFlowCount = EVENT_QUEUE_OVER_FLOW_COUNT_EDEFAULT;
		eventQueueOverFlowCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__EVENT_QUEUE_OVER_FLOW_COUNT, oldEventQueueOverFlowCount, EVENT_QUEUE_OVER_FLOW_COUNT_EDEFAULT, oldEventQueueOverFlowCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEventQueueOverFlowCount() {
		return eventQueueOverFlowCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SESSION_ID:
				return basicUnsetSessionId(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SESSION_ID:
				return getSessionId();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SUBSCRIPTION_ID:
				return getSubscriptionId();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PRIORITY:
				return getPriority();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISHING_INTERVAL:
				return getPublishingInterval();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_KEEP_ALIVE_COUNT:
				return getMaxKeepAliveCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_LIFETIME_COUNT:
				return getMaxLifetimeCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_NOTIFICATIONS_PER_PUBLISH:
				return getMaxNotificationsPerPublish();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISHING_ENABLED:
				return isPublishingEnabled();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MODIFY_COUNT:
				return getModifyCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__ENABLE_COUNT:
				return getEnableCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISABLE_COUNT:
				return getDisableCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_REQUEST_COUNT:
				return getRepublishRequestCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_MESSAGE_REQUEST_COUNT:
				return getRepublishMessageRequestCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_MESSAGE_COUNT:
				return getRepublishMessageCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFER_REQUEST_COUNT:
				return getTransferRequestCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFERRED_TO_ALT_CLIENT_COUNT:
				return getTransferredToAltClientCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFERRED_TO_SAME_CLIENT_COUNT:
				return getTransferredToSameClientCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISH_REQUEST_COUNT:
				return getPublishRequestCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DATA_CHANGE_NOTIFICATIONS_COUNT:
				return getDataChangeNotificationsCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__EVENT_NOTIFICATIONS_COUNT:
				return getEventNotificationsCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__NOTIFICATIONS_COUNT:
				return getNotificationsCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__LATE_PUBLISH_REQUEST_COUNT:
				return getLatePublishRequestCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__CURRENT_KEEP_ALIVE_COUNT:
				return getCurrentKeepAliveCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__CURRENT_LIFETIME_COUNT:
				return getCurrentLifetimeCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__UNACKNOWLEDGED_MESSAGE_COUNT:
				return getUnacknowledgedMessageCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISCARDED_MESSAGE_COUNT:
				return getDiscardedMessageCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MONITORED_ITEM_COUNT:
				return getMonitoredItemCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISABLED_MONITORED_ITEM_COUNT:
				return getDisabledMonitoredItemCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MONITORING_QUEUE_OVERFLOW_COUNT:
				return getMonitoringQueueOverflowCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__NEXT_SEQUENCE_NUMBER:
				return getNextSequenceNumber();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__EVENT_QUEUE_OVER_FLOW_COUNT:
				return getEventQueueOverFlowCount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SESSION_ID:
				setSessionId((NodeId)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SUBSCRIPTION_ID:
				setSubscriptionId((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PRIORITY:
				setPriority((Short)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISHING_INTERVAL:
				setPublishingInterval((Double)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_KEEP_ALIVE_COUNT:
				setMaxKeepAliveCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_LIFETIME_COUNT:
				setMaxLifetimeCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_NOTIFICATIONS_PER_PUBLISH:
				setMaxNotificationsPerPublish((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISHING_ENABLED:
				setPublishingEnabled((Boolean)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MODIFY_COUNT:
				setModifyCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__ENABLE_COUNT:
				setEnableCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISABLE_COUNT:
				setDisableCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_REQUEST_COUNT:
				setRepublishRequestCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_MESSAGE_REQUEST_COUNT:
				setRepublishMessageRequestCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_MESSAGE_COUNT:
				setRepublishMessageCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFER_REQUEST_COUNT:
				setTransferRequestCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFERRED_TO_ALT_CLIENT_COUNT:
				setTransferredToAltClientCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFERRED_TO_SAME_CLIENT_COUNT:
				setTransferredToSameClientCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISH_REQUEST_COUNT:
				setPublishRequestCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DATA_CHANGE_NOTIFICATIONS_COUNT:
				setDataChangeNotificationsCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__EVENT_NOTIFICATIONS_COUNT:
				setEventNotificationsCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__NOTIFICATIONS_COUNT:
				setNotificationsCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__LATE_PUBLISH_REQUEST_COUNT:
				setLatePublishRequestCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__CURRENT_KEEP_ALIVE_COUNT:
				setCurrentKeepAliveCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__CURRENT_LIFETIME_COUNT:
				setCurrentLifetimeCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__UNACKNOWLEDGED_MESSAGE_COUNT:
				setUnacknowledgedMessageCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISCARDED_MESSAGE_COUNT:
				setDiscardedMessageCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MONITORED_ITEM_COUNT:
				setMonitoredItemCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISABLED_MONITORED_ITEM_COUNT:
				setDisabledMonitoredItemCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MONITORING_QUEUE_OVERFLOW_COUNT:
				setMonitoringQueueOverflowCount((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__NEXT_SEQUENCE_NUMBER:
				setNextSequenceNumber((Long)newValue);
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__EVENT_QUEUE_OVER_FLOW_COUNT:
				setEventQueueOverFlowCount((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SESSION_ID:
				unsetSessionId();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SUBSCRIPTION_ID:
				unsetSubscriptionId();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PRIORITY:
				unsetPriority();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISHING_INTERVAL:
				unsetPublishingInterval();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_KEEP_ALIVE_COUNT:
				unsetMaxKeepAliveCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_LIFETIME_COUNT:
				unsetMaxLifetimeCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_NOTIFICATIONS_PER_PUBLISH:
				unsetMaxNotificationsPerPublish();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISHING_ENABLED:
				unsetPublishingEnabled();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MODIFY_COUNT:
				unsetModifyCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__ENABLE_COUNT:
				unsetEnableCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISABLE_COUNT:
				unsetDisableCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_REQUEST_COUNT:
				unsetRepublishRequestCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_MESSAGE_REQUEST_COUNT:
				unsetRepublishMessageRequestCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_MESSAGE_COUNT:
				unsetRepublishMessageCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFER_REQUEST_COUNT:
				unsetTransferRequestCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFERRED_TO_ALT_CLIENT_COUNT:
				unsetTransferredToAltClientCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFERRED_TO_SAME_CLIENT_COUNT:
				unsetTransferredToSameClientCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISH_REQUEST_COUNT:
				unsetPublishRequestCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DATA_CHANGE_NOTIFICATIONS_COUNT:
				unsetDataChangeNotificationsCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__EVENT_NOTIFICATIONS_COUNT:
				unsetEventNotificationsCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__NOTIFICATIONS_COUNT:
				unsetNotificationsCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__LATE_PUBLISH_REQUEST_COUNT:
				unsetLatePublishRequestCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__CURRENT_KEEP_ALIVE_COUNT:
				unsetCurrentKeepAliveCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__CURRENT_LIFETIME_COUNT:
				unsetCurrentLifetimeCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__UNACKNOWLEDGED_MESSAGE_COUNT:
				unsetUnacknowledgedMessageCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISCARDED_MESSAGE_COUNT:
				unsetDiscardedMessageCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MONITORED_ITEM_COUNT:
				unsetMonitoredItemCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISABLED_MONITORED_ITEM_COUNT:
				unsetDisabledMonitoredItemCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MONITORING_QUEUE_OVERFLOW_COUNT:
				unsetMonitoringQueueOverflowCount();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__NEXT_SEQUENCE_NUMBER:
				unsetNextSequenceNumber();
				return;
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__EVENT_QUEUE_OVER_FLOW_COUNT:
				unsetEventQueueOverFlowCount();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SESSION_ID:
				return isSetSessionId();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__SUBSCRIPTION_ID:
				return isSetSubscriptionId();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PRIORITY:
				return isSetPriority();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISHING_INTERVAL:
				return isSetPublishingInterval();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_KEEP_ALIVE_COUNT:
				return isSetMaxKeepAliveCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_LIFETIME_COUNT:
				return isSetMaxLifetimeCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MAX_NOTIFICATIONS_PER_PUBLISH:
				return isSetMaxNotificationsPerPublish();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISHING_ENABLED:
				return isSetPublishingEnabled();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MODIFY_COUNT:
				return isSetModifyCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__ENABLE_COUNT:
				return isSetEnableCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISABLE_COUNT:
				return isSetDisableCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_REQUEST_COUNT:
				return isSetRepublishRequestCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_MESSAGE_REQUEST_COUNT:
				return isSetRepublishMessageRequestCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_MESSAGE_COUNT:
				return isSetRepublishMessageCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFER_REQUEST_COUNT:
				return isSetTransferRequestCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFERRED_TO_ALT_CLIENT_COUNT:
				return isSetTransferredToAltClientCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__TRANSFERRED_TO_SAME_CLIENT_COUNT:
				return isSetTransferredToSameClientCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__PUBLISH_REQUEST_COUNT:
				return isSetPublishRequestCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DATA_CHANGE_NOTIFICATIONS_COUNT:
				return isSetDataChangeNotificationsCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__EVENT_NOTIFICATIONS_COUNT:
				return isSetEventNotificationsCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__NOTIFICATIONS_COUNT:
				return isSetNotificationsCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__LATE_PUBLISH_REQUEST_COUNT:
				return isSetLatePublishRequestCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__CURRENT_KEEP_ALIVE_COUNT:
				return isSetCurrentKeepAliveCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__CURRENT_LIFETIME_COUNT:
				return isSetCurrentLifetimeCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__UNACKNOWLEDGED_MESSAGE_COUNT:
				return isSetUnacknowledgedMessageCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISCARDED_MESSAGE_COUNT:
				return isSetDiscardedMessageCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MONITORED_ITEM_COUNT:
				return isSetMonitoredItemCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__DISABLED_MONITORED_ITEM_COUNT:
				return isSetDisabledMonitoredItemCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__MONITORING_QUEUE_OVERFLOW_COUNT:
				return isSetMonitoringQueueOverflowCount();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__NEXT_SEQUENCE_NUMBER:
				return isSetNextSequenceNumber();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE__EVENT_QUEUE_OVER_FLOW_COUNT:
				return isSetEventQueueOverFlowCount();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (subscriptionId: ");
		if (subscriptionIdESet) result.append(subscriptionId); else result.append("<unset>");
		result.append(", priority: ");
		if (priorityESet) result.append(priority); else result.append("<unset>");
		result.append(", publishingInterval: ");
		if (publishingIntervalESet) result.append(publishingInterval); else result.append("<unset>");
		result.append(", maxKeepAliveCount: ");
		if (maxKeepAliveCountESet) result.append(maxKeepAliveCount); else result.append("<unset>");
		result.append(", maxLifetimeCount: ");
		if (maxLifetimeCountESet) result.append(maxLifetimeCount); else result.append("<unset>");
		result.append(", maxNotificationsPerPublish: ");
		if (maxNotificationsPerPublishESet) result.append(maxNotificationsPerPublish); else result.append("<unset>");
		result.append(", publishingEnabled: ");
		if (publishingEnabledESet) result.append(publishingEnabled); else result.append("<unset>");
		result.append(", modifyCount: ");
		if (modifyCountESet) result.append(modifyCount); else result.append("<unset>");
		result.append(", enableCount: ");
		if (enableCountESet) result.append(enableCount); else result.append("<unset>");
		result.append(", disableCount: ");
		if (disableCountESet) result.append(disableCount); else result.append("<unset>");
		result.append(", republishRequestCount: ");
		if (republishRequestCountESet) result.append(republishRequestCount); else result.append("<unset>");
		result.append(", republishMessageRequestCount: ");
		if (republishMessageRequestCountESet) result.append(republishMessageRequestCount); else result.append("<unset>");
		result.append(", republishMessageCount: ");
		if (republishMessageCountESet) result.append(republishMessageCount); else result.append("<unset>");
		result.append(", transferRequestCount: ");
		if (transferRequestCountESet) result.append(transferRequestCount); else result.append("<unset>");
		result.append(", transferredToAltClientCount: ");
		if (transferredToAltClientCountESet) result.append(transferredToAltClientCount); else result.append("<unset>");
		result.append(", transferredToSameClientCount: ");
		if (transferredToSameClientCountESet) result.append(transferredToSameClientCount); else result.append("<unset>");
		result.append(", publishRequestCount: ");
		if (publishRequestCountESet) result.append(publishRequestCount); else result.append("<unset>");
		result.append(", dataChangeNotificationsCount: ");
		if (dataChangeNotificationsCountESet) result.append(dataChangeNotificationsCount); else result.append("<unset>");
		result.append(", eventNotificationsCount: ");
		if (eventNotificationsCountESet) result.append(eventNotificationsCount); else result.append("<unset>");
		result.append(", notificationsCount: ");
		if (notificationsCountESet) result.append(notificationsCount); else result.append("<unset>");
		result.append(", latePublishRequestCount: ");
		if (latePublishRequestCountESet) result.append(latePublishRequestCount); else result.append("<unset>");
		result.append(", currentKeepAliveCount: ");
		if (currentKeepAliveCountESet) result.append(currentKeepAliveCount); else result.append("<unset>");
		result.append(", currentLifetimeCount: ");
		if (currentLifetimeCountESet) result.append(currentLifetimeCount); else result.append("<unset>");
		result.append(", unacknowledgedMessageCount: ");
		if (unacknowledgedMessageCountESet) result.append(unacknowledgedMessageCount); else result.append("<unset>");
		result.append(", discardedMessageCount: ");
		if (discardedMessageCountESet) result.append(discardedMessageCount); else result.append("<unset>");
		result.append(", monitoredItemCount: ");
		if (monitoredItemCountESet) result.append(monitoredItemCount); else result.append("<unset>");
		result.append(", disabledMonitoredItemCount: ");
		if (disabledMonitoredItemCountESet) result.append(disabledMonitoredItemCount); else result.append("<unset>");
		result.append(", monitoringQueueOverflowCount: ");
		if (monitoringQueueOverflowCountESet) result.append(monitoringQueueOverflowCount); else result.append("<unset>");
		result.append(", nextSequenceNumber: ");
		if (nextSequenceNumberESet) result.append(nextSequenceNumber); else result.append("<unset>");
		result.append(", eventQueueOverFlowCount: ");
		if (eventQueueOverFlowCountESet) result.append(eventQueueOverFlowCount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SubscriptionDiagnosticsDataTypeImpl
