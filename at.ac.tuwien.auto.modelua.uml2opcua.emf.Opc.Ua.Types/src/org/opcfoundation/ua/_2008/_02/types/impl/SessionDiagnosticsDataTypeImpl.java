/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.opcfoundation.ua._2008._02.types.ApplicationDescription;
import org.opcfoundation.ua._2008._02.types.ListOfString;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2008._02.types.ServiceCounterDataType;
import org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType;
import org.opcfoundation.ua._2008._02.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session Diagnostics Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getSessionId <em>Session Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getSessionName <em>Session Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getClientDescription <em>Client Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getServerUri <em>Server Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getEndpointUrl <em>Endpoint Url</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getLocaleIds <em>Locale Ids</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getActualSessionTimeout <em>Actual Session Timeout</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getMaxResponseMessageSize <em>Max Response Message Size</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getClientConnectionTime <em>Client Connection Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getClientLastContactTime <em>Client Last Contact Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getCurrentSubscriptionsCount <em>Current Subscriptions Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getCurrentMonitoredItemsCount <em>Current Monitored Items Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getCurrentPublishRequestsInQueue <em>Current Publish Requests In Queue</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getTotalRequestCount <em>Total Request Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getUnauthorizedRequestCount <em>Unauthorized Request Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getReadCount <em>Read Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getHistoryReadCount <em>History Read Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getWriteCount <em>Write Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getHistoryUpdateCount <em>History Update Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getCallCount <em>Call Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getCreateMonitoredItemsCount <em>Create Monitored Items Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getModifyMonitoredItemsCount <em>Modify Monitored Items Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getSetMonitoringModeCount <em>Set Monitoring Mode Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getSetTriggeringCount <em>Set Triggering Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getDeleteMonitoredItemsCount <em>Delete Monitored Items Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getCreateSubscriptionCount <em>Create Subscription Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getModifySubscriptionCount <em>Modify Subscription Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getSetPublishingModeCount <em>Set Publishing Mode Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getPublishCount <em>Publish Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getRepublishCount <em>Republish Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getTransferSubscriptionsCount <em>Transfer Subscriptions Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getDeleteSubscriptionsCount <em>Delete Subscriptions Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getAddNodesCount <em>Add Nodes Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getAddReferencesCount <em>Add References Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getDeleteNodesCount <em>Delete Nodes Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getDeleteReferencesCount <em>Delete References Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getBrowseCount <em>Browse Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getBrowseNextCount <em>Browse Next Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getTranslateBrowsePathsToNodeIdsCount <em>Translate Browse Paths To Node Ids Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getQueryFirstCount <em>Query First Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getQueryNextCount <em>Query Next Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getRegisterNodesCount <em>Register Nodes Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.impl.SessionDiagnosticsDataTypeImpl#getUnregisterNodesCount <em>Unregister Nodes Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SessionDiagnosticsDataTypeImpl extends MinimalEObjectImpl.Container implements SessionDiagnosticsDataType {
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
	 * The default value of the '{@link #getSessionName() <em>Session Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionName()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionName() <em>Session Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionName()
	 * @generated
	 * @ordered
	 */
	protected String sessionName = SESSION_NAME_EDEFAULT;

	/**
	 * This is true if the Session Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sessionNameESet;

	/**
	 * The cached value of the '{@link #getClientDescription() <em>Client Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientDescription()
	 * @generated
	 * @ordered
	 */
	protected ApplicationDescription clientDescription;

	/**
	 * This is true if the Client Description containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clientDescriptionESet;

	/**
	 * The default value of the '{@link #getServerUri() <em>Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerUri()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerUri() <em>Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerUri()
	 * @generated
	 * @ordered
	 */
	protected String serverUri = SERVER_URI_EDEFAULT;

	/**
	 * This is true if the Server Uri attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverUriESet;

	/**
	 * The default value of the '{@link #getEndpointUrl() <em>Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpointUrl() <em>Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointUrl()
	 * @generated
	 * @ordered
	 */
	protected String endpointUrl = ENDPOINT_URL_EDEFAULT;

	/**
	 * This is true if the Endpoint Url attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endpointUrlESet;

	/**
	 * The cached value of the '{@link #getLocaleIds() <em>Locale Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleIds()
	 * @generated
	 * @ordered
	 */
	protected ListOfString localeIds;

	/**
	 * This is true if the Locale Ids containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean localeIdsESet;

	/**
	 * The default value of the '{@link #getActualSessionTimeout() <em>Actual Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualSessionTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTUAL_SESSION_TIMEOUT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActualSessionTimeout() <em>Actual Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualSessionTimeout()
	 * @generated
	 * @ordered
	 */
	protected double actualSessionTimeout = ACTUAL_SESSION_TIMEOUT_EDEFAULT;

	/**
	 * This is true if the Actual Session Timeout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actualSessionTimeoutESet;

	/**
	 * The default value of the '{@link #getMaxResponseMessageSize() <em>Max Response Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxResponseMessageSize()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_RESPONSE_MESSAGE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxResponseMessageSize() <em>Max Response Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxResponseMessageSize()
	 * @generated
	 * @ordered
	 */
	protected long maxResponseMessageSize = MAX_RESPONSE_MESSAGE_SIZE_EDEFAULT;

	/**
	 * This is true if the Max Response Message Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxResponseMessageSizeESet;

	/**
	 * The default value of the '{@link #getClientConnectionTime() <em>Client Connection Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientConnectionTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CLIENT_CONNECTION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientConnectionTime() <em>Client Connection Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientConnectionTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar clientConnectionTime = CLIENT_CONNECTION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientLastContactTime() <em>Client Last Contact Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientLastContactTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CLIENT_LAST_CONTACT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientLastContactTime() <em>Client Last Contact Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientLastContactTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar clientLastContactTime = CLIENT_LAST_CONTACT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentSubscriptionsCount() <em>Current Subscriptions Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSubscriptionsCount()
	 * @generated
	 * @ordered
	 */
	protected static final long CURRENT_SUBSCRIPTIONS_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCurrentSubscriptionsCount() <em>Current Subscriptions Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSubscriptionsCount()
	 * @generated
	 * @ordered
	 */
	protected long currentSubscriptionsCount = CURRENT_SUBSCRIPTIONS_COUNT_EDEFAULT;

	/**
	 * This is true if the Current Subscriptions Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currentSubscriptionsCountESet;

	/**
	 * The default value of the '{@link #getCurrentMonitoredItemsCount() <em>Current Monitored Items Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMonitoredItemsCount()
	 * @generated
	 * @ordered
	 */
	protected static final long CURRENT_MONITORED_ITEMS_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCurrentMonitoredItemsCount() <em>Current Monitored Items Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMonitoredItemsCount()
	 * @generated
	 * @ordered
	 */
	protected long currentMonitoredItemsCount = CURRENT_MONITORED_ITEMS_COUNT_EDEFAULT;

	/**
	 * This is true if the Current Monitored Items Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currentMonitoredItemsCountESet;

	/**
	 * The default value of the '{@link #getCurrentPublishRequestsInQueue() <em>Current Publish Requests In Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPublishRequestsInQueue()
	 * @generated
	 * @ordered
	 */
	protected static final long CURRENT_PUBLISH_REQUESTS_IN_QUEUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCurrentPublishRequestsInQueue() <em>Current Publish Requests In Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPublishRequestsInQueue()
	 * @generated
	 * @ordered
	 */
	protected long currentPublishRequestsInQueue = CURRENT_PUBLISH_REQUESTS_IN_QUEUE_EDEFAULT;

	/**
	 * This is true if the Current Publish Requests In Queue attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currentPublishRequestsInQueueESet;

	/**
	 * The cached value of the '{@link #getTotalRequestCount() <em>Total Request Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRequestCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType totalRequestCount;

	/**
	 * This is true if the Total Request Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean totalRequestCountESet;

	/**
	 * The default value of the '{@link #getUnauthorizedRequestCount() <em>Unauthorized Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnauthorizedRequestCount()
	 * @generated
	 * @ordered
	 */
	protected static final long UNAUTHORIZED_REQUEST_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUnauthorizedRequestCount() <em>Unauthorized Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnauthorizedRequestCount()
	 * @generated
	 * @ordered
	 */
	protected long unauthorizedRequestCount = UNAUTHORIZED_REQUEST_COUNT_EDEFAULT;

	/**
	 * This is true if the Unauthorized Request Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unauthorizedRequestCountESet;

	/**
	 * The cached value of the '{@link #getReadCount() <em>Read Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType readCount;

	/**
	 * This is true if the Read Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean readCountESet;

	/**
	 * The cached value of the '{@link #getHistoryReadCount() <em>History Read Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryReadCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType historyReadCount;

	/**
	 * This is true if the History Read Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean historyReadCountESet;

	/**
	 * The cached value of the '{@link #getWriteCount() <em>Write Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType writeCount;

	/**
	 * This is true if the Write Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean writeCountESet;

	/**
	 * The cached value of the '{@link #getHistoryUpdateCount() <em>History Update Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryUpdateCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType historyUpdateCount;

	/**
	 * This is true if the History Update Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean historyUpdateCountESet;

	/**
	 * The cached value of the '{@link #getCallCount() <em>Call Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType callCount;

	/**
	 * This is true if the Call Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean callCountESet;

	/**
	 * The cached value of the '{@link #getCreateMonitoredItemsCount() <em>Create Monitored Items Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateMonitoredItemsCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType createMonitoredItemsCount;

	/**
	 * This is true if the Create Monitored Items Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean createMonitoredItemsCountESet;

	/**
	 * The cached value of the '{@link #getModifyMonitoredItemsCount() <em>Modify Monitored Items Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifyMonitoredItemsCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType modifyMonitoredItemsCount;

	/**
	 * This is true if the Modify Monitored Items Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modifyMonitoredItemsCountESet;

	/**
	 * The cached value of the '{@link #getSetMonitoringModeCount() <em>Set Monitoring Mode Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetMonitoringModeCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType setMonitoringModeCount;

	/**
	 * This is true if the Set Monitoring Mode Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean setMonitoringModeCountESet;

	/**
	 * The cached value of the '{@link #getSetTriggeringCount() <em>Set Triggering Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetTriggeringCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType setTriggeringCount;

	/**
	 * This is true if the Set Triggering Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean setTriggeringCountESet;

	/**
	 * The cached value of the '{@link #getDeleteMonitoredItemsCount() <em>Delete Monitored Items Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteMonitoredItemsCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType deleteMonitoredItemsCount;

	/**
	 * This is true if the Delete Monitored Items Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deleteMonitoredItemsCountESet;

	/**
	 * The cached value of the '{@link #getCreateSubscriptionCount() <em>Create Subscription Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateSubscriptionCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType createSubscriptionCount;

	/**
	 * This is true if the Create Subscription Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean createSubscriptionCountESet;

	/**
	 * The cached value of the '{@link #getModifySubscriptionCount() <em>Modify Subscription Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifySubscriptionCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType modifySubscriptionCount;

	/**
	 * This is true if the Modify Subscription Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modifySubscriptionCountESet;

	/**
	 * The cached value of the '{@link #getSetPublishingModeCount() <em>Set Publishing Mode Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetPublishingModeCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType setPublishingModeCount;

	/**
	 * This is true if the Set Publishing Mode Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean setPublishingModeCountESet;

	/**
	 * The cached value of the '{@link #getPublishCount() <em>Publish Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType publishCount;

	/**
	 * This is true if the Publish Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean publishCountESet;

	/**
	 * The cached value of the '{@link #getRepublishCount() <em>Republish Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepublishCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType republishCount;

	/**
	 * This is true if the Republish Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean republishCountESet;

	/**
	 * The cached value of the '{@link #getTransferSubscriptionsCount() <em>Transfer Subscriptions Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferSubscriptionsCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType transferSubscriptionsCount;

	/**
	 * This is true if the Transfer Subscriptions Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transferSubscriptionsCountESet;

	/**
	 * The cached value of the '{@link #getDeleteSubscriptionsCount() <em>Delete Subscriptions Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteSubscriptionsCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType deleteSubscriptionsCount;

	/**
	 * This is true if the Delete Subscriptions Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deleteSubscriptionsCountESet;

	/**
	 * The cached value of the '{@link #getAddNodesCount() <em>Add Nodes Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddNodesCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType addNodesCount;

	/**
	 * This is true if the Add Nodes Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean addNodesCountESet;

	/**
	 * The cached value of the '{@link #getAddReferencesCount() <em>Add References Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddReferencesCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType addReferencesCount;

	/**
	 * This is true if the Add References Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean addReferencesCountESet;

	/**
	 * The cached value of the '{@link #getDeleteNodesCount() <em>Delete Nodes Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteNodesCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType deleteNodesCount;

	/**
	 * This is true if the Delete Nodes Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deleteNodesCountESet;

	/**
	 * The cached value of the '{@link #getDeleteReferencesCount() <em>Delete References Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteReferencesCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType deleteReferencesCount;

	/**
	 * This is true if the Delete References Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deleteReferencesCountESet;

	/**
	 * The cached value of the '{@link #getBrowseCount() <em>Browse Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowseCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType browseCount;

	/**
	 * This is true if the Browse Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean browseCountESet;

	/**
	 * The cached value of the '{@link #getBrowseNextCount() <em>Browse Next Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowseNextCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType browseNextCount;

	/**
	 * This is true if the Browse Next Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean browseNextCountESet;

	/**
	 * The cached value of the '{@link #getTranslateBrowsePathsToNodeIdsCount() <em>Translate Browse Paths To Node Ids Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslateBrowsePathsToNodeIdsCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType translateBrowsePathsToNodeIdsCount;

	/**
	 * This is true if the Translate Browse Paths To Node Ids Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean translateBrowsePathsToNodeIdsCountESet;

	/**
	 * The cached value of the '{@link #getQueryFirstCount() <em>Query First Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryFirstCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType queryFirstCount;

	/**
	 * This is true if the Query First Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean queryFirstCountESet;

	/**
	 * The cached value of the '{@link #getQueryNextCount() <em>Query Next Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryNextCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType queryNextCount;

	/**
	 * This is true if the Query Next Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean queryNextCountESet;

	/**
	 * The cached value of the '{@link #getRegisterNodesCount() <em>Register Nodes Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterNodesCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType registerNodesCount;

	/**
	 * This is true if the Register Nodes Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean registerNodesCountESet;

	/**
	 * The cached value of the '{@link #getUnregisterNodesCount() <em>Unregister Nodes Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnregisterNodesCount()
	 * @generated
	 * @ordered
	 */
	protected ServiceCounterDataType unregisterNodesCount;

	/**
	 * This is true if the Unregister Nodes Count containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unregisterNodesCountESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionDiagnosticsDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.eINSTANCE.getSessionDiagnosticsDataType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_ID, oldSessionId, newSessionId, !oldSessionIdESet);
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
				msgs = ((InternalEObject)sessionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_ID, null, msgs);
			if (newSessionId != null)
				msgs = ((InternalEObject)newSessionId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_ID, null, msgs);
			msgs = basicSetSessionId(newSessionId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSessionIdESet = sessionIdESet;
			sessionIdESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_ID, newSessionId, newSessionId, !oldSessionIdESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_ID, oldSessionId, null, oldSessionIdESet);
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
			msgs = ((InternalEObject)sessionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_ID, null, msgs);
			msgs = basicUnsetSessionId(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSessionIdESet = sessionIdESet;
			sessionIdESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_ID, null, null, oldSessionIdESet));
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
	public String getSessionName() {
		return sessionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionName(String newSessionName) {
		String oldSessionName = sessionName;
		sessionName = newSessionName;
		boolean oldSessionNameESet = sessionNameESet;
		sessionNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_NAME, oldSessionName, sessionName, !oldSessionNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSessionName() {
		String oldSessionName = sessionName;
		boolean oldSessionNameESet = sessionNameESet;
		sessionName = SESSION_NAME_EDEFAULT;
		sessionNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_NAME, oldSessionName, SESSION_NAME_EDEFAULT, oldSessionNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSessionName() {
		return sessionNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDescription getClientDescription() {
		return clientDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClientDescription(ApplicationDescription newClientDescription, NotificationChain msgs) {
		ApplicationDescription oldClientDescription = clientDescription;
		clientDescription = newClientDescription;
		boolean oldClientDescriptionESet = clientDescriptionESet;
		clientDescriptionESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_DESCRIPTION, oldClientDescription, newClientDescription, !oldClientDescriptionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientDescription(ApplicationDescription newClientDescription) {
		if (newClientDescription != clientDescription) {
			NotificationChain msgs = null;
			if (clientDescription != null)
				msgs = ((InternalEObject)clientDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_DESCRIPTION, null, msgs);
			if (newClientDescription != null)
				msgs = ((InternalEObject)newClientDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_DESCRIPTION, null, msgs);
			msgs = basicSetClientDescription(newClientDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldClientDescriptionESet = clientDescriptionESet;
			clientDescriptionESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_DESCRIPTION, newClientDescription, newClientDescription, !oldClientDescriptionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetClientDescription(NotificationChain msgs) {
		ApplicationDescription oldClientDescription = clientDescription;
		clientDescription = null;
		boolean oldClientDescriptionESet = clientDescriptionESet;
		clientDescriptionESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_DESCRIPTION, oldClientDescription, null, oldClientDescriptionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClientDescription() {
		if (clientDescription != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)clientDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_DESCRIPTION, null, msgs);
			msgs = basicUnsetClientDescription(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldClientDescriptionESet = clientDescriptionESet;
			clientDescriptionESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_DESCRIPTION, null, null, oldClientDescriptionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClientDescription() {
		return clientDescriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerUri() {
		return serverUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerUri(String newServerUri) {
		String oldServerUri = serverUri;
		serverUri = newServerUri;
		boolean oldServerUriESet = serverUriESet;
		serverUriESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SERVER_URI, oldServerUri, serverUri, !oldServerUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerUri() {
		String oldServerUri = serverUri;
		boolean oldServerUriESet = serverUriESet;
		serverUri = SERVER_URI_EDEFAULT;
		serverUriESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SERVER_URI, oldServerUri, SERVER_URI_EDEFAULT, oldServerUriESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerUri() {
		return serverUriESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpointUrl() {
		return endpointUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointUrl(String newEndpointUrl) {
		String oldEndpointUrl = endpointUrl;
		endpointUrl = newEndpointUrl;
		boolean oldEndpointUrlESet = endpointUrlESet;
		endpointUrlESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ENDPOINT_URL, oldEndpointUrl, endpointUrl, !oldEndpointUrlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndpointUrl() {
		String oldEndpointUrl = endpointUrl;
		boolean oldEndpointUrlESet = endpointUrlESet;
		endpointUrl = ENDPOINT_URL_EDEFAULT;
		endpointUrlESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ENDPOINT_URL, oldEndpointUrl, ENDPOINT_URL_EDEFAULT, oldEndpointUrlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndpointUrl() {
		return endpointUrlESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfString getLocaleIds() {
		return localeIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocaleIds(ListOfString newLocaleIds, NotificationChain msgs) {
		ListOfString oldLocaleIds = localeIds;
		localeIds = newLocaleIds;
		boolean oldLocaleIdsESet = localeIdsESet;
		localeIdsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__LOCALE_IDS, oldLocaleIds, newLocaleIds, !oldLocaleIdsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocaleIds(ListOfString newLocaleIds) {
		if (newLocaleIds != localeIds) {
			NotificationChain msgs = null;
			if (localeIds != null)
				msgs = ((InternalEObject)localeIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__LOCALE_IDS, null, msgs);
			if (newLocaleIds != null)
				msgs = ((InternalEObject)newLocaleIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__LOCALE_IDS, null, msgs);
			msgs = basicSetLocaleIds(newLocaleIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLocaleIdsESet = localeIdsESet;
			localeIdsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__LOCALE_IDS, newLocaleIds, newLocaleIds, !oldLocaleIdsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetLocaleIds(NotificationChain msgs) {
		ListOfString oldLocaleIds = localeIds;
		localeIds = null;
		boolean oldLocaleIdsESet = localeIdsESet;
		localeIdsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__LOCALE_IDS, oldLocaleIds, null, oldLocaleIdsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocaleIds() {
		if (localeIds != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)localeIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__LOCALE_IDS, null, msgs);
			msgs = basicUnsetLocaleIds(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLocaleIdsESet = localeIdsESet;
			localeIdsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__LOCALE_IDS, null, null, oldLocaleIdsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocaleIds() {
		return localeIdsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActualSessionTimeout() {
		return actualSessionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualSessionTimeout(double newActualSessionTimeout) {
		double oldActualSessionTimeout = actualSessionTimeout;
		actualSessionTimeout = newActualSessionTimeout;
		boolean oldActualSessionTimeoutESet = actualSessionTimeoutESet;
		actualSessionTimeoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ACTUAL_SESSION_TIMEOUT, oldActualSessionTimeout, actualSessionTimeout, !oldActualSessionTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActualSessionTimeout() {
		double oldActualSessionTimeout = actualSessionTimeout;
		boolean oldActualSessionTimeoutESet = actualSessionTimeoutESet;
		actualSessionTimeout = ACTUAL_SESSION_TIMEOUT_EDEFAULT;
		actualSessionTimeoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ACTUAL_SESSION_TIMEOUT, oldActualSessionTimeout, ACTUAL_SESSION_TIMEOUT_EDEFAULT, oldActualSessionTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActualSessionTimeout() {
		return actualSessionTimeoutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxResponseMessageSize() {
		return maxResponseMessageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxResponseMessageSize(long newMaxResponseMessageSize) {
		long oldMaxResponseMessageSize = maxResponseMessageSize;
		maxResponseMessageSize = newMaxResponseMessageSize;
		boolean oldMaxResponseMessageSizeESet = maxResponseMessageSizeESet;
		maxResponseMessageSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MAX_RESPONSE_MESSAGE_SIZE, oldMaxResponseMessageSize, maxResponseMessageSize, !oldMaxResponseMessageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxResponseMessageSize() {
		long oldMaxResponseMessageSize = maxResponseMessageSize;
		boolean oldMaxResponseMessageSizeESet = maxResponseMessageSizeESet;
		maxResponseMessageSize = MAX_RESPONSE_MESSAGE_SIZE_EDEFAULT;
		maxResponseMessageSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MAX_RESPONSE_MESSAGE_SIZE, oldMaxResponseMessageSize, MAX_RESPONSE_MESSAGE_SIZE_EDEFAULT, oldMaxResponseMessageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxResponseMessageSize() {
		return maxResponseMessageSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getClientConnectionTime() {
		return clientConnectionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientConnectionTime(XMLGregorianCalendar newClientConnectionTime) {
		XMLGregorianCalendar oldClientConnectionTime = clientConnectionTime;
		clientConnectionTime = newClientConnectionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_CONNECTION_TIME, oldClientConnectionTime, clientConnectionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getClientLastContactTime() {
		return clientLastContactTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientLastContactTime(XMLGregorianCalendar newClientLastContactTime) {
		XMLGregorianCalendar oldClientLastContactTime = clientLastContactTime;
		clientLastContactTime = newClientLastContactTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_LAST_CONTACT_TIME, oldClientLastContactTime, clientLastContactTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCurrentSubscriptionsCount() {
		return currentSubscriptionsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentSubscriptionsCount(long newCurrentSubscriptionsCount) {
		long oldCurrentSubscriptionsCount = currentSubscriptionsCount;
		currentSubscriptionsCount = newCurrentSubscriptionsCount;
		boolean oldCurrentSubscriptionsCountESet = currentSubscriptionsCountESet;
		currentSubscriptionsCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_SUBSCRIPTIONS_COUNT, oldCurrentSubscriptionsCount, currentSubscriptionsCount, !oldCurrentSubscriptionsCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrentSubscriptionsCount() {
		long oldCurrentSubscriptionsCount = currentSubscriptionsCount;
		boolean oldCurrentSubscriptionsCountESet = currentSubscriptionsCountESet;
		currentSubscriptionsCount = CURRENT_SUBSCRIPTIONS_COUNT_EDEFAULT;
		currentSubscriptionsCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_SUBSCRIPTIONS_COUNT, oldCurrentSubscriptionsCount, CURRENT_SUBSCRIPTIONS_COUNT_EDEFAULT, oldCurrentSubscriptionsCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrentSubscriptionsCount() {
		return currentSubscriptionsCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCurrentMonitoredItemsCount() {
		return currentMonitoredItemsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentMonitoredItemsCount(long newCurrentMonitoredItemsCount) {
		long oldCurrentMonitoredItemsCount = currentMonitoredItemsCount;
		currentMonitoredItemsCount = newCurrentMonitoredItemsCount;
		boolean oldCurrentMonitoredItemsCountESet = currentMonitoredItemsCountESet;
		currentMonitoredItemsCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_MONITORED_ITEMS_COUNT, oldCurrentMonitoredItemsCount, currentMonitoredItemsCount, !oldCurrentMonitoredItemsCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrentMonitoredItemsCount() {
		long oldCurrentMonitoredItemsCount = currentMonitoredItemsCount;
		boolean oldCurrentMonitoredItemsCountESet = currentMonitoredItemsCountESet;
		currentMonitoredItemsCount = CURRENT_MONITORED_ITEMS_COUNT_EDEFAULT;
		currentMonitoredItemsCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_MONITORED_ITEMS_COUNT, oldCurrentMonitoredItemsCount, CURRENT_MONITORED_ITEMS_COUNT_EDEFAULT, oldCurrentMonitoredItemsCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrentMonitoredItemsCount() {
		return currentMonitoredItemsCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCurrentPublishRequestsInQueue() {
		return currentPublishRequestsInQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentPublishRequestsInQueue(long newCurrentPublishRequestsInQueue) {
		long oldCurrentPublishRequestsInQueue = currentPublishRequestsInQueue;
		currentPublishRequestsInQueue = newCurrentPublishRequestsInQueue;
		boolean oldCurrentPublishRequestsInQueueESet = currentPublishRequestsInQueueESet;
		currentPublishRequestsInQueueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_PUBLISH_REQUESTS_IN_QUEUE, oldCurrentPublishRequestsInQueue, currentPublishRequestsInQueue, !oldCurrentPublishRequestsInQueueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrentPublishRequestsInQueue() {
		long oldCurrentPublishRequestsInQueue = currentPublishRequestsInQueue;
		boolean oldCurrentPublishRequestsInQueueESet = currentPublishRequestsInQueueESet;
		currentPublishRequestsInQueue = CURRENT_PUBLISH_REQUESTS_IN_QUEUE_EDEFAULT;
		currentPublishRequestsInQueueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_PUBLISH_REQUESTS_IN_QUEUE, oldCurrentPublishRequestsInQueue, CURRENT_PUBLISH_REQUESTS_IN_QUEUE_EDEFAULT, oldCurrentPublishRequestsInQueueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrentPublishRequestsInQueue() {
		return currentPublishRequestsInQueueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getTotalRequestCount() {
		return totalRequestCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalRequestCount(ServiceCounterDataType newTotalRequestCount, NotificationChain msgs) {
		ServiceCounterDataType oldTotalRequestCount = totalRequestCount;
		totalRequestCount = newTotalRequestCount;
		boolean oldTotalRequestCountESet = totalRequestCountESet;
		totalRequestCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TOTAL_REQUEST_COUNT, oldTotalRequestCount, newTotalRequestCount, !oldTotalRequestCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalRequestCount(ServiceCounterDataType newTotalRequestCount) {
		if (newTotalRequestCount != totalRequestCount) {
			NotificationChain msgs = null;
			if (totalRequestCount != null)
				msgs = ((InternalEObject)totalRequestCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TOTAL_REQUEST_COUNT, null, msgs);
			if (newTotalRequestCount != null)
				msgs = ((InternalEObject)newTotalRequestCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TOTAL_REQUEST_COUNT, null, msgs);
			msgs = basicSetTotalRequestCount(newTotalRequestCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTotalRequestCountESet = totalRequestCountESet;
			totalRequestCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TOTAL_REQUEST_COUNT, newTotalRequestCount, newTotalRequestCount, !oldTotalRequestCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTotalRequestCount(NotificationChain msgs) {
		ServiceCounterDataType oldTotalRequestCount = totalRequestCount;
		totalRequestCount = null;
		boolean oldTotalRequestCountESet = totalRequestCountESet;
		totalRequestCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TOTAL_REQUEST_COUNT, oldTotalRequestCount, null, oldTotalRequestCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTotalRequestCount() {
		if (totalRequestCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)totalRequestCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TOTAL_REQUEST_COUNT, null, msgs);
			msgs = basicUnsetTotalRequestCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTotalRequestCountESet = totalRequestCountESet;
			totalRequestCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TOTAL_REQUEST_COUNT, null, null, oldTotalRequestCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTotalRequestCount() {
		return totalRequestCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUnauthorizedRequestCount() {
		return unauthorizedRequestCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnauthorizedRequestCount(long newUnauthorizedRequestCount) {
		long oldUnauthorizedRequestCount = unauthorizedRequestCount;
		unauthorizedRequestCount = newUnauthorizedRequestCount;
		boolean oldUnauthorizedRequestCountESet = unauthorizedRequestCountESet;
		unauthorizedRequestCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNAUTHORIZED_REQUEST_COUNT, oldUnauthorizedRequestCount, unauthorizedRequestCount, !oldUnauthorizedRequestCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnauthorizedRequestCount() {
		long oldUnauthorizedRequestCount = unauthorizedRequestCount;
		boolean oldUnauthorizedRequestCountESet = unauthorizedRequestCountESet;
		unauthorizedRequestCount = UNAUTHORIZED_REQUEST_COUNT_EDEFAULT;
		unauthorizedRequestCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNAUTHORIZED_REQUEST_COUNT, oldUnauthorizedRequestCount, UNAUTHORIZED_REQUEST_COUNT_EDEFAULT, oldUnauthorizedRequestCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnauthorizedRequestCount() {
		return unauthorizedRequestCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getReadCount() {
		return readCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadCount(ServiceCounterDataType newReadCount, NotificationChain msgs) {
		ServiceCounterDataType oldReadCount = readCount;
		readCount = newReadCount;
		boolean oldReadCountESet = readCountESet;
		readCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__READ_COUNT, oldReadCount, newReadCount, !oldReadCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadCount(ServiceCounterDataType newReadCount) {
		if (newReadCount != readCount) {
			NotificationChain msgs = null;
			if (readCount != null)
				msgs = ((InternalEObject)readCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__READ_COUNT, null, msgs);
			if (newReadCount != null)
				msgs = ((InternalEObject)newReadCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__READ_COUNT, null, msgs);
			msgs = basicSetReadCount(newReadCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReadCountESet = readCountESet;
			readCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__READ_COUNT, newReadCount, newReadCount, !oldReadCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetReadCount(NotificationChain msgs) {
		ServiceCounterDataType oldReadCount = readCount;
		readCount = null;
		boolean oldReadCountESet = readCountESet;
		readCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__READ_COUNT, oldReadCount, null, oldReadCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReadCount() {
		if (readCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)readCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__READ_COUNT, null, msgs);
			msgs = basicUnsetReadCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReadCountESet = readCountESet;
			readCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__READ_COUNT, null, null, oldReadCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReadCount() {
		return readCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getHistoryReadCount() {
		return historyReadCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryReadCount(ServiceCounterDataType newHistoryReadCount, NotificationChain msgs) {
		ServiceCounterDataType oldHistoryReadCount = historyReadCount;
		historyReadCount = newHistoryReadCount;
		boolean oldHistoryReadCountESet = historyReadCountESet;
		historyReadCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_READ_COUNT, oldHistoryReadCount, newHistoryReadCount, !oldHistoryReadCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryReadCount(ServiceCounterDataType newHistoryReadCount) {
		if (newHistoryReadCount != historyReadCount) {
			NotificationChain msgs = null;
			if (historyReadCount != null)
				msgs = ((InternalEObject)historyReadCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_READ_COUNT, null, msgs);
			if (newHistoryReadCount != null)
				msgs = ((InternalEObject)newHistoryReadCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_READ_COUNT, null, msgs);
			msgs = basicSetHistoryReadCount(newHistoryReadCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldHistoryReadCountESet = historyReadCountESet;
			historyReadCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_READ_COUNT, newHistoryReadCount, newHistoryReadCount, !oldHistoryReadCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetHistoryReadCount(NotificationChain msgs) {
		ServiceCounterDataType oldHistoryReadCount = historyReadCount;
		historyReadCount = null;
		boolean oldHistoryReadCountESet = historyReadCountESet;
		historyReadCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_READ_COUNT, oldHistoryReadCount, null, oldHistoryReadCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHistoryReadCount() {
		if (historyReadCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)historyReadCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_READ_COUNT, null, msgs);
			msgs = basicUnsetHistoryReadCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldHistoryReadCountESet = historyReadCountESet;
			historyReadCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_READ_COUNT, null, null, oldHistoryReadCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHistoryReadCount() {
		return historyReadCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getWriteCount() {
		return writeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriteCount(ServiceCounterDataType newWriteCount, NotificationChain msgs) {
		ServiceCounterDataType oldWriteCount = writeCount;
		writeCount = newWriteCount;
		boolean oldWriteCountESet = writeCountESet;
		writeCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__WRITE_COUNT, oldWriteCount, newWriteCount, !oldWriteCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteCount(ServiceCounterDataType newWriteCount) {
		if (newWriteCount != writeCount) {
			NotificationChain msgs = null;
			if (writeCount != null)
				msgs = ((InternalEObject)writeCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__WRITE_COUNT, null, msgs);
			if (newWriteCount != null)
				msgs = ((InternalEObject)newWriteCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__WRITE_COUNT, null, msgs);
			msgs = basicSetWriteCount(newWriteCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldWriteCountESet = writeCountESet;
			writeCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__WRITE_COUNT, newWriteCount, newWriteCount, !oldWriteCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetWriteCount(NotificationChain msgs) {
		ServiceCounterDataType oldWriteCount = writeCount;
		writeCount = null;
		boolean oldWriteCountESet = writeCountESet;
		writeCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__WRITE_COUNT, oldWriteCount, null, oldWriteCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWriteCount() {
		if (writeCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)writeCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__WRITE_COUNT, null, msgs);
			msgs = basicUnsetWriteCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldWriteCountESet = writeCountESet;
			writeCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__WRITE_COUNT, null, null, oldWriteCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWriteCount() {
		return writeCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getHistoryUpdateCount() {
		return historyUpdateCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryUpdateCount(ServiceCounterDataType newHistoryUpdateCount, NotificationChain msgs) {
		ServiceCounterDataType oldHistoryUpdateCount = historyUpdateCount;
		historyUpdateCount = newHistoryUpdateCount;
		boolean oldHistoryUpdateCountESet = historyUpdateCountESet;
		historyUpdateCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_UPDATE_COUNT, oldHistoryUpdateCount, newHistoryUpdateCount, !oldHistoryUpdateCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryUpdateCount(ServiceCounterDataType newHistoryUpdateCount) {
		if (newHistoryUpdateCount != historyUpdateCount) {
			NotificationChain msgs = null;
			if (historyUpdateCount != null)
				msgs = ((InternalEObject)historyUpdateCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_UPDATE_COUNT, null, msgs);
			if (newHistoryUpdateCount != null)
				msgs = ((InternalEObject)newHistoryUpdateCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_UPDATE_COUNT, null, msgs);
			msgs = basicSetHistoryUpdateCount(newHistoryUpdateCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldHistoryUpdateCountESet = historyUpdateCountESet;
			historyUpdateCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_UPDATE_COUNT, newHistoryUpdateCount, newHistoryUpdateCount, !oldHistoryUpdateCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetHistoryUpdateCount(NotificationChain msgs) {
		ServiceCounterDataType oldHistoryUpdateCount = historyUpdateCount;
		historyUpdateCount = null;
		boolean oldHistoryUpdateCountESet = historyUpdateCountESet;
		historyUpdateCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_UPDATE_COUNT, oldHistoryUpdateCount, null, oldHistoryUpdateCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHistoryUpdateCount() {
		if (historyUpdateCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)historyUpdateCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_UPDATE_COUNT, null, msgs);
			msgs = basicUnsetHistoryUpdateCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldHistoryUpdateCountESet = historyUpdateCountESet;
			historyUpdateCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_UPDATE_COUNT, null, null, oldHistoryUpdateCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHistoryUpdateCount() {
		return historyUpdateCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getCallCount() {
		return callCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallCount(ServiceCounterDataType newCallCount, NotificationChain msgs) {
		ServiceCounterDataType oldCallCount = callCount;
		callCount = newCallCount;
		boolean oldCallCountESet = callCountESet;
		callCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CALL_COUNT, oldCallCount, newCallCount, !oldCallCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallCount(ServiceCounterDataType newCallCount) {
		if (newCallCount != callCount) {
			NotificationChain msgs = null;
			if (callCount != null)
				msgs = ((InternalEObject)callCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CALL_COUNT, null, msgs);
			if (newCallCount != null)
				msgs = ((InternalEObject)newCallCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CALL_COUNT, null, msgs);
			msgs = basicSetCallCount(newCallCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCallCountESet = callCountESet;
			callCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CALL_COUNT, newCallCount, newCallCount, !oldCallCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetCallCount(NotificationChain msgs) {
		ServiceCounterDataType oldCallCount = callCount;
		callCount = null;
		boolean oldCallCountESet = callCountESet;
		callCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CALL_COUNT, oldCallCount, null, oldCallCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCallCount() {
		if (callCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)callCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CALL_COUNT, null, msgs);
			msgs = basicUnsetCallCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCallCountESet = callCountESet;
			callCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CALL_COUNT, null, null, oldCallCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCallCount() {
		return callCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getCreateMonitoredItemsCount() {
		return createMonitoredItemsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateMonitoredItemsCount(ServiceCounterDataType newCreateMonitoredItemsCount, NotificationChain msgs) {
		ServiceCounterDataType oldCreateMonitoredItemsCount = createMonitoredItemsCount;
		createMonitoredItemsCount = newCreateMonitoredItemsCount;
		boolean oldCreateMonitoredItemsCountESet = createMonitoredItemsCountESet;
		createMonitoredItemsCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_MONITORED_ITEMS_COUNT, oldCreateMonitoredItemsCount, newCreateMonitoredItemsCount, !oldCreateMonitoredItemsCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateMonitoredItemsCount(ServiceCounterDataType newCreateMonitoredItemsCount) {
		if (newCreateMonitoredItemsCount != createMonitoredItemsCount) {
			NotificationChain msgs = null;
			if (createMonitoredItemsCount != null)
				msgs = ((InternalEObject)createMonitoredItemsCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_MONITORED_ITEMS_COUNT, null, msgs);
			if (newCreateMonitoredItemsCount != null)
				msgs = ((InternalEObject)newCreateMonitoredItemsCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_MONITORED_ITEMS_COUNT, null, msgs);
			msgs = basicSetCreateMonitoredItemsCount(newCreateMonitoredItemsCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCreateMonitoredItemsCountESet = createMonitoredItemsCountESet;
			createMonitoredItemsCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_MONITORED_ITEMS_COUNT, newCreateMonitoredItemsCount, newCreateMonitoredItemsCount, !oldCreateMonitoredItemsCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetCreateMonitoredItemsCount(NotificationChain msgs) {
		ServiceCounterDataType oldCreateMonitoredItemsCount = createMonitoredItemsCount;
		createMonitoredItemsCount = null;
		boolean oldCreateMonitoredItemsCountESet = createMonitoredItemsCountESet;
		createMonitoredItemsCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_MONITORED_ITEMS_COUNT, oldCreateMonitoredItemsCount, null, oldCreateMonitoredItemsCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreateMonitoredItemsCount() {
		if (createMonitoredItemsCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)createMonitoredItemsCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_MONITORED_ITEMS_COUNT, null, msgs);
			msgs = basicUnsetCreateMonitoredItemsCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCreateMonitoredItemsCountESet = createMonitoredItemsCountESet;
			createMonitoredItemsCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_MONITORED_ITEMS_COUNT, null, null, oldCreateMonitoredItemsCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreateMonitoredItemsCount() {
		return createMonitoredItemsCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getModifyMonitoredItemsCount() {
		return modifyMonitoredItemsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifyMonitoredItemsCount(ServiceCounterDataType newModifyMonitoredItemsCount, NotificationChain msgs) {
		ServiceCounterDataType oldModifyMonitoredItemsCount = modifyMonitoredItemsCount;
		modifyMonitoredItemsCount = newModifyMonitoredItemsCount;
		boolean oldModifyMonitoredItemsCountESet = modifyMonitoredItemsCountESet;
		modifyMonitoredItemsCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_MONITORED_ITEMS_COUNT, oldModifyMonitoredItemsCount, newModifyMonitoredItemsCount, !oldModifyMonitoredItemsCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifyMonitoredItemsCount(ServiceCounterDataType newModifyMonitoredItemsCount) {
		if (newModifyMonitoredItemsCount != modifyMonitoredItemsCount) {
			NotificationChain msgs = null;
			if (modifyMonitoredItemsCount != null)
				msgs = ((InternalEObject)modifyMonitoredItemsCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_MONITORED_ITEMS_COUNT, null, msgs);
			if (newModifyMonitoredItemsCount != null)
				msgs = ((InternalEObject)newModifyMonitoredItemsCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_MONITORED_ITEMS_COUNT, null, msgs);
			msgs = basicSetModifyMonitoredItemsCount(newModifyMonitoredItemsCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldModifyMonitoredItemsCountESet = modifyMonitoredItemsCountESet;
			modifyMonitoredItemsCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_MONITORED_ITEMS_COUNT, newModifyMonitoredItemsCount, newModifyMonitoredItemsCount, !oldModifyMonitoredItemsCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetModifyMonitoredItemsCount(NotificationChain msgs) {
		ServiceCounterDataType oldModifyMonitoredItemsCount = modifyMonitoredItemsCount;
		modifyMonitoredItemsCount = null;
		boolean oldModifyMonitoredItemsCountESet = modifyMonitoredItemsCountESet;
		modifyMonitoredItemsCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_MONITORED_ITEMS_COUNT, oldModifyMonitoredItemsCount, null, oldModifyMonitoredItemsCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModifyMonitoredItemsCount() {
		if (modifyMonitoredItemsCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)modifyMonitoredItemsCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_MONITORED_ITEMS_COUNT, null, msgs);
			msgs = basicUnsetModifyMonitoredItemsCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldModifyMonitoredItemsCountESet = modifyMonitoredItemsCountESet;
			modifyMonitoredItemsCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_MONITORED_ITEMS_COUNT, null, null, oldModifyMonitoredItemsCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModifyMonitoredItemsCount() {
		return modifyMonitoredItemsCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getSetMonitoringModeCount() {
		return setMonitoringModeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetMonitoringModeCount(ServiceCounterDataType newSetMonitoringModeCount, NotificationChain msgs) {
		ServiceCounterDataType oldSetMonitoringModeCount = setMonitoringModeCount;
		setMonitoringModeCount = newSetMonitoringModeCount;
		boolean oldSetMonitoringModeCountESet = setMonitoringModeCountESet;
		setMonitoringModeCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_MONITORING_MODE_COUNT, oldSetMonitoringModeCount, newSetMonitoringModeCount, !oldSetMonitoringModeCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetMonitoringModeCount(ServiceCounterDataType newSetMonitoringModeCount) {
		if (newSetMonitoringModeCount != setMonitoringModeCount) {
			NotificationChain msgs = null;
			if (setMonitoringModeCount != null)
				msgs = ((InternalEObject)setMonitoringModeCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_MONITORING_MODE_COUNT, null, msgs);
			if (newSetMonitoringModeCount != null)
				msgs = ((InternalEObject)newSetMonitoringModeCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_MONITORING_MODE_COUNT, null, msgs);
			msgs = basicSetSetMonitoringModeCount(newSetMonitoringModeCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSetMonitoringModeCountESet = setMonitoringModeCountESet;
			setMonitoringModeCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_MONITORING_MODE_COUNT, newSetMonitoringModeCount, newSetMonitoringModeCount, !oldSetMonitoringModeCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSetMonitoringModeCount(NotificationChain msgs) {
		ServiceCounterDataType oldSetMonitoringModeCount = setMonitoringModeCount;
		setMonitoringModeCount = null;
		boolean oldSetMonitoringModeCountESet = setMonitoringModeCountESet;
		setMonitoringModeCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_MONITORING_MODE_COUNT, oldSetMonitoringModeCount, null, oldSetMonitoringModeCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSetMonitoringModeCount() {
		if (setMonitoringModeCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)setMonitoringModeCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_MONITORING_MODE_COUNT, null, msgs);
			msgs = basicUnsetSetMonitoringModeCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSetMonitoringModeCountESet = setMonitoringModeCountESet;
			setMonitoringModeCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_MONITORING_MODE_COUNT, null, null, oldSetMonitoringModeCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSetMonitoringModeCount() {
		return setMonitoringModeCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getSetTriggeringCount() {
		return setTriggeringCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetTriggeringCount(ServiceCounterDataType newSetTriggeringCount, NotificationChain msgs) {
		ServiceCounterDataType oldSetTriggeringCount = setTriggeringCount;
		setTriggeringCount = newSetTriggeringCount;
		boolean oldSetTriggeringCountESet = setTriggeringCountESet;
		setTriggeringCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_TRIGGERING_COUNT, oldSetTriggeringCount, newSetTriggeringCount, !oldSetTriggeringCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetTriggeringCount(ServiceCounterDataType newSetTriggeringCount) {
		if (newSetTriggeringCount != setTriggeringCount) {
			NotificationChain msgs = null;
			if (setTriggeringCount != null)
				msgs = ((InternalEObject)setTriggeringCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_TRIGGERING_COUNT, null, msgs);
			if (newSetTriggeringCount != null)
				msgs = ((InternalEObject)newSetTriggeringCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_TRIGGERING_COUNT, null, msgs);
			msgs = basicSetSetTriggeringCount(newSetTriggeringCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSetTriggeringCountESet = setTriggeringCountESet;
			setTriggeringCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_TRIGGERING_COUNT, newSetTriggeringCount, newSetTriggeringCount, !oldSetTriggeringCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSetTriggeringCount(NotificationChain msgs) {
		ServiceCounterDataType oldSetTriggeringCount = setTriggeringCount;
		setTriggeringCount = null;
		boolean oldSetTriggeringCountESet = setTriggeringCountESet;
		setTriggeringCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_TRIGGERING_COUNT, oldSetTriggeringCount, null, oldSetTriggeringCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSetTriggeringCount() {
		if (setTriggeringCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)setTriggeringCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_TRIGGERING_COUNT, null, msgs);
			msgs = basicUnsetSetTriggeringCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSetTriggeringCountESet = setTriggeringCountESet;
			setTriggeringCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_TRIGGERING_COUNT, null, null, oldSetTriggeringCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSetTriggeringCount() {
		return setTriggeringCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getDeleteMonitoredItemsCount() {
		return deleteMonitoredItemsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteMonitoredItemsCount(ServiceCounterDataType newDeleteMonitoredItemsCount, NotificationChain msgs) {
		ServiceCounterDataType oldDeleteMonitoredItemsCount = deleteMonitoredItemsCount;
		deleteMonitoredItemsCount = newDeleteMonitoredItemsCount;
		boolean oldDeleteMonitoredItemsCountESet = deleteMonitoredItemsCountESet;
		deleteMonitoredItemsCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_MONITORED_ITEMS_COUNT, oldDeleteMonitoredItemsCount, newDeleteMonitoredItemsCount, !oldDeleteMonitoredItemsCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteMonitoredItemsCount(ServiceCounterDataType newDeleteMonitoredItemsCount) {
		if (newDeleteMonitoredItemsCount != deleteMonitoredItemsCount) {
			NotificationChain msgs = null;
			if (deleteMonitoredItemsCount != null)
				msgs = ((InternalEObject)deleteMonitoredItemsCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_MONITORED_ITEMS_COUNT, null, msgs);
			if (newDeleteMonitoredItemsCount != null)
				msgs = ((InternalEObject)newDeleteMonitoredItemsCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_MONITORED_ITEMS_COUNT, null, msgs);
			msgs = basicSetDeleteMonitoredItemsCount(newDeleteMonitoredItemsCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDeleteMonitoredItemsCountESet = deleteMonitoredItemsCountESet;
			deleteMonitoredItemsCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_MONITORED_ITEMS_COUNT, newDeleteMonitoredItemsCount, newDeleteMonitoredItemsCount, !oldDeleteMonitoredItemsCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDeleteMonitoredItemsCount(NotificationChain msgs) {
		ServiceCounterDataType oldDeleteMonitoredItemsCount = deleteMonitoredItemsCount;
		deleteMonitoredItemsCount = null;
		boolean oldDeleteMonitoredItemsCountESet = deleteMonitoredItemsCountESet;
		deleteMonitoredItemsCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_MONITORED_ITEMS_COUNT, oldDeleteMonitoredItemsCount, null, oldDeleteMonitoredItemsCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeleteMonitoredItemsCount() {
		if (deleteMonitoredItemsCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)deleteMonitoredItemsCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_MONITORED_ITEMS_COUNT, null, msgs);
			msgs = basicUnsetDeleteMonitoredItemsCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDeleteMonitoredItemsCountESet = deleteMonitoredItemsCountESet;
			deleteMonitoredItemsCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_MONITORED_ITEMS_COUNT, null, null, oldDeleteMonitoredItemsCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeleteMonitoredItemsCount() {
		return deleteMonitoredItemsCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getCreateSubscriptionCount() {
		return createSubscriptionCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateSubscriptionCount(ServiceCounterDataType newCreateSubscriptionCount, NotificationChain msgs) {
		ServiceCounterDataType oldCreateSubscriptionCount = createSubscriptionCount;
		createSubscriptionCount = newCreateSubscriptionCount;
		boolean oldCreateSubscriptionCountESet = createSubscriptionCountESet;
		createSubscriptionCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_SUBSCRIPTION_COUNT, oldCreateSubscriptionCount, newCreateSubscriptionCount, !oldCreateSubscriptionCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateSubscriptionCount(ServiceCounterDataType newCreateSubscriptionCount) {
		if (newCreateSubscriptionCount != createSubscriptionCount) {
			NotificationChain msgs = null;
			if (createSubscriptionCount != null)
				msgs = ((InternalEObject)createSubscriptionCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_SUBSCRIPTION_COUNT, null, msgs);
			if (newCreateSubscriptionCount != null)
				msgs = ((InternalEObject)newCreateSubscriptionCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_SUBSCRIPTION_COUNT, null, msgs);
			msgs = basicSetCreateSubscriptionCount(newCreateSubscriptionCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCreateSubscriptionCountESet = createSubscriptionCountESet;
			createSubscriptionCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_SUBSCRIPTION_COUNT, newCreateSubscriptionCount, newCreateSubscriptionCount, !oldCreateSubscriptionCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetCreateSubscriptionCount(NotificationChain msgs) {
		ServiceCounterDataType oldCreateSubscriptionCount = createSubscriptionCount;
		createSubscriptionCount = null;
		boolean oldCreateSubscriptionCountESet = createSubscriptionCountESet;
		createSubscriptionCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_SUBSCRIPTION_COUNT, oldCreateSubscriptionCount, null, oldCreateSubscriptionCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreateSubscriptionCount() {
		if (createSubscriptionCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)createSubscriptionCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_SUBSCRIPTION_COUNT, null, msgs);
			msgs = basicUnsetCreateSubscriptionCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCreateSubscriptionCountESet = createSubscriptionCountESet;
			createSubscriptionCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_SUBSCRIPTION_COUNT, null, null, oldCreateSubscriptionCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreateSubscriptionCount() {
		return createSubscriptionCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getModifySubscriptionCount() {
		return modifySubscriptionCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifySubscriptionCount(ServiceCounterDataType newModifySubscriptionCount, NotificationChain msgs) {
		ServiceCounterDataType oldModifySubscriptionCount = modifySubscriptionCount;
		modifySubscriptionCount = newModifySubscriptionCount;
		boolean oldModifySubscriptionCountESet = modifySubscriptionCountESet;
		modifySubscriptionCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_SUBSCRIPTION_COUNT, oldModifySubscriptionCount, newModifySubscriptionCount, !oldModifySubscriptionCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifySubscriptionCount(ServiceCounterDataType newModifySubscriptionCount) {
		if (newModifySubscriptionCount != modifySubscriptionCount) {
			NotificationChain msgs = null;
			if (modifySubscriptionCount != null)
				msgs = ((InternalEObject)modifySubscriptionCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_SUBSCRIPTION_COUNT, null, msgs);
			if (newModifySubscriptionCount != null)
				msgs = ((InternalEObject)newModifySubscriptionCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_SUBSCRIPTION_COUNT, null, msgs);
			msgs = basicSetModifySubscriptionCount(newModifySubscriptionCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldModifySubscriptionCountESet = modifySubscriptionCountESet;
			modifySubscriptionCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_SUBSCRIPTION_COUNT, newModifySubscriptionCount, newModifySubscriptionCount, !oldModifySubscriptionCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetModifySubscriptionCount(NotificationChain msgs) {
		ServiceCounterDataType oldModifySubscriptionCount = modifySubscriptionCount;
		modifySubscriptionCount = null;
		boolean oldModifySubscriptionCountESet = modifySubscriptionCountESet;
		modifySubscriptionCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_SUBSCRIPTION_COUNT, oldModifySubscriptionCount, null, oldModifySubscriptionCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModifySubscriptionCount() {
		if (modifySubscriptionCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)modifySubscriptionCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_SUBSCRIPTION_COUNT, null, msgs);
			msgs = basicUnsetModifySubscriptionCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldModifySubscriptionCountESet = modifySubscriptionCountESet;
			modifySubscriptionCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_SUBSCRIPTION_COUNT, null, null, oldModifySubscriptionCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModifySubscriptionCount() {
		return modifySubscriptionCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getSetPublishingModeCount() {
		return setPublishingModeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetPublishingModeCount(ServiceCounterDataType newSetPublishingModeCount, NotificationChain msgs) {
		ServiceCounterDataType oldSetPublishingModeCount = setPublishingModeCount;
		setPublishingModeCount = newSetPublishingModeCount;
		boolean oldSetPublishingModeCountESet = setPublishingModeCountESet;
		setPublishingModeCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_PUBLISHING_MODE_COUNT, oldSetPublishingModeCount, newSetPublishingModeCount, !oldSetPublishingModeCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetPublishingModeCount(ServiceCounterDataType newSetPublishingModeCount) {
		if (newSetPublishingModeCount != setPublishingModeCount) {
			NotificationChain msgs = null;
			if (setPublishingModeCount != null)
				msgs = ((InternalEObject)setPublishingModeCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_PUBLISHING_MODE_COUNT, null, msgs);
			if (newSetPublishingModeCount != null)
				msgs = ((InternalEObject)newSetPublishingModeCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_PUBLISHING_MODE_COUNT, null, msgs);
			msgs = basicSetSetPublishingModeCount(newSetPublishingModeCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSetPublishingModeCountESet = setPublishingModeCountESet;
			setPublishingModeCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_PUBLISHING_MODE_COUNT, newSetPublishingModeCount, newSetPublishingModeCount, !oldSetPublishingModeCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSetPublishingModeCount(NotificationChain msgs) {
		ServiceCounterDataType oldSetPublishingModeCount = setPublishingModeCount;
		setPublishingModeCount = null;
		boolean oldSetPublishingModeCountESet = setPublishingModeCountESet;
		setPublishingModeCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_PUBLISHING_MODE_COUNT, oldSetPublishingModeCount, null, oldSetPublishingModeCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSetPublishingModeCount() {
		if (setPublishingModeCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)setPublishingModeCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_PUBLISHING_MODE_COUNT, null, msgs);
			msgs = basicUnsetSetPublishingModeCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSetPublishingModeCountESet = setPublishingModeCountESet;
			setPublishingModeCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_PUBLISHING_MODE_COUNT, null, null, oldSetPublishingModeCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSetPublishingModeCount() {
		return setPublishingModeCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getPublishCount() {
		return publishCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublishCount(ServiceCounterDataType newPublishCount, NotificationChain msgs) {
		ServiceCounterDataType oldPublishCount = publishCount;
		publishCount = newPublishCount;
		boolean oldPublishCountESet = publishCountESet;
		publishCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__PUBLISH_COUNT, oldPublishCount, newPublishCount, !oldPublishCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishCount(ServiceCounterDataType newPublishCount) {
		if (newPublishCount != publishCount) {
			NotificationChain msgs = null;
			if (publishCount != null)
				msgs = ((InternalEObject)publishCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__PUBLISH_COUNT, null, msgs);
			if (newPublishCount != null)
				msgs = ((InternalEObject)newPublishCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__PUBLISH_COUNT, null, msgs);
			msgs = basicSetPublishCount(newPublishCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPublishCountESet = publishCountESet;
			publishCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__PUBLISH_COUNT, newPublishCount, newPublishCount, !oldPublishCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetPublishCount(NotificationChain msgs) {
		ServiceCounterDataType oldPublishCount = publishCount;
		publishCount = null;
		boolean oldPublishCountESet = publishCountESet;
		publishCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__PUBLISH_COUNT, oldPublishCount, null, oldPublishCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPublishCount() {
		if (publishCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)publishCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__PUBLISH_COUNT, null, msgs);
			msgs = basicUnsetPublishCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPublishCountESet = publishCountESet;
			publishCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__PUBLISH_COUNT, null, null, oldPublishCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPublishCount() {
		return publishCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getRepublishCount() {
		return republishCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepublishCount(ServiceCounterDataType newRepublishCount, NotificationChain msgs) {
		ServiceCounterDataType oldRepublishCount = republishCount;
		republishCount = newRepublishCount;
		boolean oldRepublishCountESet = republishCountESet;
		republishCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_COUNT, oldRepublishCount, newRepublishCount, !oldRepublishCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepublishCount(ServiceCounterDataType newRepublishCount) {
		if (newRepublishCount != republishCount) {
			NotificationChain msgs = null;
			if (republishCount != null)
				msgs = ((InternalEObject)republishCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_COUNT, null, msgs);
			if (newRepublishCount != null)
				msgs = ((InternalEObject)newRepublishCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_COUNT, null, msgs);
			msgs = basicSetRepublishCount(newRepublishCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRepublishCountESet = republishCountESet;
			republishCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_COUNT, newRepublishCount, newRepublishCount, !oldRepublishCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRepublishCount(NotificationChain msgs) {
		ServiceCounterDataType oldRepublishCount = republishCount;
		republishCount = null;
		boolean oldRepublishCountESet = republishCountESet;
		republishCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_COUNT, oldRepublishCount, null, oldRepublishCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepublishCount() {
		if (republishCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)republishCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_COUNT, null, msgs);
			msgs = basicUnsetRepublishCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRepublishCountESet = republishCountESet;
			republishCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_COUNT, null, null, oldRepublishCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepublishCount() {
		return republishCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getTransferSubscriptionsCount() {
		return transferSubscriptionsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransferSubscriptionsCount(ServiceCounterDataType newTransferSubscriptionsCount, NotificationChain msgs) {
		ServiceCounterDataType oldTransferSubscriptionsCount = transferSubscriptionsCount;
		transferSubscriptionsCount = newTransferSubscriptionsCount;
		boolean oldTransferSubscriptionsCountESet = transferSubscriptionsCountESet;
		transferSubscriptionsCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSFER_SUBSCRIPTIONS_COUNT, oldTransferSubscriptionsCount, newTransferSubscriptionsCount, !oldTransferSubscriptionsCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferSubscriptionsCount(ServiceCounterDataType newTransferSubscriptionsCount) {
		if (newTransferSubscriptionsCount != transferSubscriptionsCount) {
			NotificationChain msgs = null;
			if (transferSubscriptionsCount != null)
				msgs = ((InternalEObject)transferSubscriptionsCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSFER_SUBSCRIPTIONS_COUNT, null, msgs);
			if (newTransferSubscriptionsCount != null)
				msgs = ((InternalEObject)newTransferSubscriptionsCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSFER_SUBSCRIPTIONS_COUNT, null, msgs);
			msgs = basicSetTransferSubscriptionsCount(newTransferSubscriptionsCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTransferSubscriptionsCountESet = transferSubscriptionsCountESet;
			transferSubscriptionsCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSFER_SUBSCRIPTIONS_COUNT, newTransferSubscriptionsCount, newTransferSubscriptionsCount, !oldTransferSubscriptionsCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTransferSubscriptionsCount(NotificationChain msgs) {
		ServiceCounterDataType oldTransferSubscriptionsCount = transferSubscriptionsCount;
		transferSubscriptionsCount = null;
		boolean oldTransferSubscriptionsCountESet = transferSubscriptionsCountESet;
		transferSubscriptionsCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSFER_SUBSCRIPTIONS_COUNT, oldTransferSubscriptionsCount, null, oldTransferSubscriptionsCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransferSubscriptionsCount() {
		if (transferSubscriptionsCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)transferSubscriptionsCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSFER_SUBSCRIPTIONS_COUNT, null, msgs);
			msgs = basicUnsetTransferSubscriptionsCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTransferSubscriptionsCountESet = transferSubscriptionsCountESet;
			transferSubscriptionsCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSFER_SUBSCRIPTIONS_COUNT, null, null, oldTransferSubscriptionsCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransferSubscriptionsCount() {
		return transferSubscriptionsCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getDeleteSubscriptionsCount() {
		return deleteSubscriptionsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteSubscriptionsCount(ServiceCounterDataType newDeleteSubscriptionsCount, NotificationChain msgs) {
		ServiceCounterDataType oldDeleteSubscriptionsCount = deleteSubscriptionsCount;
		deleteSubscriptionsCount = newDeleteSubscriptionsCount;
		boolean oldDeleteSubscriptionsCountESet = deleteSubscriptionsCountESet;
		deleteSubscriptionsCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_SUBSCRIPTIONS_COUNT, oldDeleteSubscriptionsCount, newDeleteSubscriptionsCount, !oldDeleteSubscriptionsCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteSubscriptionsCount(ServiceCounterDataType newDeleteSubscriptionsCount) {
		if (newDeleteSubscriptionsCount != deleteSubscriptionsCount) {
			NotificationChain msgs = null;
			if (deleteSubscriptionsCount != null)
				msgs = ((InternalEObject)deleteSubscriptionsCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_SUBSCRIPTIONS_COUNT, null, msgs);
			if (newDeleteSubscriptionsCount != null)
				msgs = ((InternalEObject)newDeleteSubscriptionsCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_SUBSCRIPTIONS_COUNT, null, msgs);
			msgs = basicSetDeleteSubscriptionsCount(newDeleteSubscriptionsCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDeleteSubscriptionsCountESet = deleteSubscriptionsCountESet;
			deleteSubscriptionsCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_SUBSCRIPTIONS_COUNT, newDeleteSubscriptionsCount, newDeleteSubscriptionsCount, !oldDeleteSubscriptionsCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDeleteSubscriptionsCount(NotificationChain msgs) {
		ServiceCounterDataType oldDeleteSubscriptionsCount = deleteSubscriptionsCount;
		deleteSubscriptionsCount = null;
		boolean oldDeleteSubscriptionsCountESet = deleteSubscriptionsCountESet;
		deleteSubscriptionsCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_SUBSCRIPTIONS_COUNT, oldDeleteSubscriptionsCount, null, oldDeleteSubscriptionsCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeleteSubscriptionsCount() {
		if (deleteSubscriptionsCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)deleteSubscriptionsCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_SUBSCRIPTIONS_COUNT, null, msgs);
			msgs = basicUnsetDeleteSubscriptionsCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDeleteSubscriptionsCountESet = deleteSubscriptionsCountESet;
			deleteSubscriptionsCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_SUBSCRIPTIONS_COUNT, null, null, oldDeleteSubscriptionsCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeleteSubscriptionsCount() {
		return deleteSubscriptionsCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getAddNodesCount() {
		return addNodesCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddNodesCount(ServiceCounterDataType newAddNodesCount, NotificationChain msgs) {
		ServiceCounterDataType oldAddNodesCount = addNodesCount;
		addNodesCount = newAddNodesCount;
		boolean oldAddNodesCountESet = addNodesCountESet;
		addNodesCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_NODES_COUNT, oldAddNodesCount, newAddNodesCount, !oldAddNodesCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddNodesCount(ServiceCounterDataType newAddNodesCount) {
		if (newAddNodesCount != addNodesCount) {
			NotificationChain msgs = null;
			if (addNodesCount != null)
				msgs = ((InternalEObject)addNodesCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_NODES_COUNT, null, msgs);
			if (newAddNodesCount != null)
				msgs = ((InternalEObject)newAddNodesCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_NODES_COUNT, null, msgs);
			msgs = basicSetAddNodesCount(newAddNodesCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAddNodesCountESet = addNodesCountESet;
			addNodesCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_NODES_COUNT, newAddNodesCount, newAddNodesCount, !oldAddNodesCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAddNodesCount(NotificationChain msgs) {
		ServiceCounterDataType oldAddNodesCount = addNodesCount;
		addNodesCount = null;
		boolean oldAddNodesCountESet = addNodesCountESet;
		addNodesCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_NODES_COUNT, oldAddNodesCount, null, oldAddNodesCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAddNodesCount() {
		if (addNodesCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)addNodesCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_NODES_COUNT, null, msgs);
			msgs = basicUnsetAddNodesCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAddNodesCountESet = addNodesCountESet;
			addNodesCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_NODES_COUNT, null, null, oldAddNodesCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAddNodesCount() {
		return addNodesCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getAddReferencesCount() {
		return addReferencesCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddReferencesCount(ServiceCounterDataType newAddReferencesCount, NotificationChain msgs) {
		ServiceCounterDataType oldAddReferencesCount = addReferencesCount;
		addReferencesCount = newAddReferencesCount;
		boolean oldAddReferencesCountESet = addReferencesCountESet;
		addReferencesCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_REFERENCES_COUNT, oldAddReferencesCount, newAddReferencesCount, !oldAddReferencesCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddReferencesCount(ServiceCounterDataType newAddReferencesCount) {
		if (newAddReferencesCount != addReferencesCount) {
			NotificationChain msgs = null;
			if (addReferencesCount != null)
				msgs = ((InternalEObject)addReferencesCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_REFERENCES_COUNT, null, msgs);
			if (newAddReferencesCount != null)
				msgs = ((InternalEObject)newAddReferencesCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_REFERENCES_COUNT, null, msgs);
			msgs = basicSetAddReferencesCount(newAddReferencesCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAddReferencesCountESet = addReferencesCountESet;
			addReferencesCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_REFERENCES_COUNT, newAddReferencesCount, newAddReferencesCount, !oldAddReferencesCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAddReferencesCount(NotificationChain msgs) {
		ServiceCounterDataType oldAddReferencesCount = addReferencesCount;
		addReferencesCount = null;
		boolean oldAddReferencesCountESet = addReferencesCountESet;
		addReferencesCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_REFERENCES_COUNT, oldAddReferencesCount, null, oldAddReferencesCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAddReferencesCount() {
		if (addReferencesCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)addReferencesCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_REFERENCES_COUNT, null, msgs);
			msgs = basicUnsetAddReferencesCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAddReferencesCountESet = addReferencesCountESet;
			addReferencesCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_REFERENCES_COUNT, null, null, oldAddReferencesCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAddReferencesCount() {
		return addReferencesCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getDeleteNodesCount() {
		return deleteNodesCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteNodesCount(ServiceCounterDataType newDeleteNodesCount, NotificationChain msgs) {
		ServiceCounterDataType oldDeleteNodesCount = deleteNodesCount;
		deleteNodesCount = newDeleteNodesCount;
		boolean oldDeleteNodesCountESet = deleteNodesCountESet;
		deleteNodesCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_NODES_COUNT, oldDeleteNodesCount, newDeleteNodesCount, !oldDeleteNodesCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteNodesCount(ServiceCounterDataType newDeleteNodesCount) {
		if (newDeleteNodesCount != deleteNodesCount) {
			NotificationChain msgs = null;
			if (deleteNodesCount != null)
				msgs = ((InternalEObject)deleteNodesCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_NODES_COUNT, null, msgs);
			if (newDeleteNodesCount != null)
				msgs = ((InternalEObject)newDeleteNodesCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_NODES_COUNT, null, msgs);
			msgs = basicSetDeleteNodesCount(newDeleteNodesCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDeleteNodesCountESet = deleteNodesCountESet;
			deleteNodesCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_NODES_COUNT, newDeleteNodesCount, newDeleteNodesCount, !oldDeleteNodesCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDeleteNodesCount(NotificationChain msgs) {
		ServiceCounterDataType oldDeleteNodesCount = deleteNodesCount;
		deleteNodesCount = null;
		boolean oldDeleteNodesCountESet = deleteNodesCountESet;
		deleteNodesCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_NODES_COUNT, oldDeleteNodesCount, null, oldDeleteNodesCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeleteNodesCount() {
		if (deleteNodesCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)deleteNodesCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_NODES_COUNT, null, msgs);
			msgs = basicUnsetDeleteNodesCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDeleteNodesCountESet = deleteNodesCountESet;
			deleteNodesCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_NODES_COUNT, null, null, oldDeleteNodesCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeleteNodesCount() {
		return deleteNodesCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getDeleteReferencesCount() {
		return deleteReferencesCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteReferencesCount(ServiceCounterDataType newDeleteReferencesCount, NotificationChain msgs) {
		ServiceCounterDataType oldDeleteReferencesCount = deleteReferencesCount;
		deleteReferencesCount = newDeleteReferencesCount;
		boolean oldDeleteReferencesCountESet = deleteReferencesCountESet;
		deleteReferencesCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_REFERENCES_COUNT, oldDeleteReferencesCount, newDeleteReferencesCount, !oldDeleteReferencesCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteReferencesCount(ServiceCounterDataType newDeleteReferencesCount) {
		if (newDeleteReferencesCount != deleteReferencesCount) {
			NotificationChain msgs = null;
			if (deleteReferencesCount != null)
				msgs = ((InternalEObject)deleteReferencesCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_REFERENCES_COUNT, null, msgs);
			if (newDeleteReferencesCount != null)
				msgs = ((InternalEObject)newDeleteReferencesCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_REFERENCES_COUNT, null, msgs);
			msgs = basicSetDeleteReferencesCount(newDeleteReferencesCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDeleteReferencesCountESet = deleteReferencesCountESet;
			deleteReferencesCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_REFERENCES_COUNT, newDeleteReferencesCount, newDeleteReferencesCount, !oldDeleteReferencesCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDeleteReferencesCount(NotificationChain msgs) {
		ServiceCounterDataType oldDeleteReferencesCount = deleteReferencesCount;
		deleteReferencesCount = null;
		boolean oldDeleteReferencesCountESet = deleteReferencesCountESet;
		deleteReferencesCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_REFERENCES_COUNT, oldDeleteReferencesCount, null, oldDeleteReferencesCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeleteReferencesCount() {
		if (deleteReferencesCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)deleteReferencesCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_REFERENCES_COUNT, null, msgs);
			msgs = basicUnsetDeleteReferencesCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDeleteReferencesCountESet = deleteReferencesCountESet;
			deleteReferencesCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_REFERENCES_COUNT, null, null, oldDeleteReferencesCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeleteReferencesCount() {
		return deleteReferencesCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getBrowseCount() {
		return browseCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrowseCount(ServiceCounterDataType newBrowseCount, NotificationChain msgs) {
		ServiceCounterDataType oldBrowseCount = browseCount;
		browseCount = newBrowseCount;
		boolean oldBrowseCountESet = browseCountESet;
		browseCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_COUNT, oldBrowseCount, newBrowseCount, !oldBrowseCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowseCount(ServiceCounterDataType newBrowseCount) {
		if (newBrowseCount != browseCount) {
			NotificationChain msgs = null;
			if (browseCount != null)
				msgs = ((InternalEObject)browseCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_COUNT, null, msgs);
			if (newBrowseCount != null)
				msgs = ((InternalEObject)newBrowseCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_COUNT, null, msgs);
			msgs = basicSetBrowseCount(newBrowseCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBrowseCountESet = browseCountESet;
			browseCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_COUNT, newBrowseCount, newBrowseCount, !oldBrowseCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetBrowseCount(NotificationChain msgs) {
		ServiceCounterDataType oldBrowseCount = browseCount;
		browseCount = null;
		boolean oldBrowseCountESet = browseCountESet;
		browseCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_COUNT, oldBrowseCount, null, oldBrowseCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBrowseCount() {
		if (browseCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)browseCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_COUNT, null, msgs);
			msgs = basicUnsetBrowseCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBrowseCountESet = browseCountESet;
			browseCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_COUNT, null, null, oldBrowseCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBrowseCount() {
		return browseCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getBrowseNextCount() {
		return browseNextCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrowseNextCount(ServiceCounterDataType newBrowseNextCount, NotificationChain msgs) {
		ServiceCounterDataType oldBrowseNextCount = browseNextCount;
		browseNextCount = newBrowseNextCount;
		boolean oldBrowseNextCountESet = browseNextCountESet;
		browseNextCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_NEXT_COUNT, oldBrowseNextCount, newBrowseNextCount, !oldBrowseNextCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowseNextCount(ServiceCounterDataType newBrowseNextCount) {
		if (newBrowseNextCount != browseNextCount) {
			NotificationChain msgs = null;
			if (browseNextCount != null)
				msgs = ((InternalEObject)browseNextCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_NEXT_COUNT, null, msgs);
			if (newBrowseNextCount != null)
				msgs = ((InternalEObject)newBrowseNextCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_NEXT_COUNT, null, msgs);
			msgs = basicSetBrowseNextCount(newBrowseNextCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBrowseNextCountESet = browseNextCountESet;
			browseNextCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_NEXT_COUNT, newBrowseNextCount, newBrowseNextCount, !oldBrowseNextCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetBrowseNextCount(NotificationChain msgs) {
		ServiceCounterDataType oldBrowseNextCount = browseNextCount;
		browseNextCount = null;
		boolean oldBrowseNextCountESet = browseNextCountESet;
		browseNextCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_NEXT_COUNT, oldBrowseNextCount, null, oldBrowseNextCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBrowseNextCount() {
		if (browseNextCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)browseNextCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_NEXT_COUNT, null, msgs);
			msgs = basicUnsetBrowseNextCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBrowseNextCountESet = browseNextCountESet;
			browseNextCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_NEXT_COUNT, null, null, oldBrowseNextCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBrowseNextCount() {
		return browseNextCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getTranslateBrowsePathsToNodeIdsCount() {
		return translateBrowsePathsToNodeIdsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslateBrowsePathsToNodeIdsCount(ServiceCounterDataType newTranslateBrowsePathsToNodeIdsCount, NotificationChain msgs) {
		ServiceCounterDataType oldTranslateBrowsePathsToNodeIdsCount = translateBrowsePathsToNodeIdsCount;
		translateBrowsePathsToNodeIdsCount = newTranslateBrowsePathsToNodeIdsCount;
		boolean oldTranslateBrowsePathsToNodeIdsCountESet = translateBrowsePathsToNodeIdsCountESet;
		translateBrowsePathsToNodeIdsCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_COUNT, oldTranslateBrowsePathsToNodeIdsCount, newTranslateBrowsePathsToNodeIdsCount, !oldTranslateBrowsePathsToNodeIdsCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslateBrowsePathsToNodeIdsCount(ServiceCounterDataType newTranslateBrowsePathsToNodeIdsCount) {
		if (newTranslateBrowsePathsToNodeIdsCount != translateBrowsePathsToNodeIdsCount) {
			NotificationChain msgs = null;
			if (translateBrowsePathsToNodeIdsCount != null)
				msgs = ((InternalEObject)translateBrowsePathsToNodeIdsCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_COUNT, null, msgs);
			if (newTranslateBrowsePathsToNodeIdsCount != null)
				msgs = ((InternalEObject)newTranslateBrowsePathsToNodeIdsCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_COUNT, null, msgs);
			msgs = basicSetTranslateBrowsePathsToNodeIdsCount(newTranslateBrowsePathsToNodeIdsCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTranslateBrowsePathsToNodeIdsCountESet = translateBrowsePathsToNodeIdsCountESet;
			translateBrowsePathsToNodeIdsCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_COUNT, newTranslateBrowsePathsToNodeIdsCount, newTranslateBrowsePathsToNodeIdsCount, !oldTranslateBrowsePathsToNodeIdsCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTranslateBrowsePathsToNodeIdsCount(NotificationChain msgs) {
		ServiceCounterDataType oldTranslateBrowsePathsToNodeIdsCount = translateBrowsePathsToNodeIdsCount;
		translateBrowsePathsToNodeIdsCount = null;
		boolean oldTranslateBrowsePathsToNodeIdsCountESet = translateBrowsePathsToNodeIdsCountESet;
		translateBrowsePathsToNodeIdsCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_COUNT, oldTranslateBrowsePathsToNodeIdsCount, null, oldTranslateBrowsePathsToNodeIdsCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTranslateBrowsePathsToNodeIdsCount() {
		if (translateBrowsePathsToNodeIdsCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)translateBrowsePathsToNodeIdsCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_COUNT, null, msgs);
			msgs = basicUnsetTranslateBrowsePathsToNodeIdsCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTranslateBrowsePathsToNodeIdsCountESet = translateBrowsePathsToNodeIdsCountESet;
			translateBrowsePathsToNodeIdsCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_COUNT, null, null, oldTranslateBrowsePathsToNodeIdsCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTranslateBrowsePathsToNodeIdsCount() {
		return translateBrowsePathsToNodeIdsCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getQueryFirstCount() {
		return queryFirstCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryFirstCount(ServiceCounterDataType newQueryFirstCount, NotificationChain msgs) {
		ServiceCounterDataType oldQueryFirstCount = queryFirstCount;
		queryFirstCount = newQueryFirstCount;
		boolean oldQueryFirstCountESet = queryFirstCountESet;
		queryFirstCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_FIRST_COUNT, oldQueryFirstCount, newQueryFirstCount, !oldQueryFirstCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryFirstCount(ServiceCounterDataType newQueryFirstCount) {
		if (newQueryFirstCount != queryFirstCount) {
			NotificationChain msgs = null;
			if (queryFirstCount != null)
				msgs = ((InternalEObject)queryFirstCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_FIRST_COUNT, null, msgs);
			if (newQueryFirstCount != null)
				msgs = ((InternalEObject)newQueryFirstCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_FIRST_COUNT, null, msgs);
			msgs = basicSetQueryFirstCount(newQueryFirstCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldQueryFirstCountESet = queryFirstCountESet;
			queryFirstCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_FIRST_COUNT, newQueryFirstCount, newQueryFirstCount, !oldQueryFirstCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetQueryFirstCount(NotificationChain msgs) {
		ServiceCounterDataType oldQueryFirstCount = queryFirstCount;
		queryFirstCount = null;
		boolean oldQueryFirstCountESet = queryFirstCountESet;
		queryFirstCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_FIRST_COUNT, oldQueryFirstCount, null, oldQueryFirstCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQueryFirstCount() {
		if (queryFirstCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)queryFirstCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_FIRST_COUNT, null, msgs);
			msgs = basicUnsetQueryFirstCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldQueryFirstCountESet = queryFirstCountESet;
			queryFirstCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_FIRST_COUNT, null, null, oldQueryFirstCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQueryFirstCount() {
		return queryFirstCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getQueryNextCount() {
		return queryNextCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryNextCount(ServiceCounterDataType newQueryNextCount, NotificationChain msgs) {
		ServiceCounterDataType oldQueryNextCount = queryNextCount;
		queryNextCount = newQueryNextCount;
		boolean oldQueryNextCountESet = queryNextCountESet;
		queryNextCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_NEXT_COUNT, oldQueryNextCount, newQueryNextCount, !oldQueryNextCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryNextCount(ServiceCounterDataType newQueryNextCount) {
		if (newQueryNextCount != queryNextCount) {
			NotificationChain msgs = null;
			if (queryNextCount != null)
				msgs = ((InternalEObject)queryNextCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_NEXT_COUNT, null, msgs);
			if (newQueryNextCount != null)
				msgs = ((InternalEObject)newQueryNextCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_NEXT_COUNT, null, msgs);
			msgs = basicSetQueryNextCount(newQueryNextCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldQueryNextCountESet = queryNextCountESet;
			queryNextCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_NEXT_COUNT, newQueryNextCount, newQueryNextCount, !oldQueryNextCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetQueryNextCount(NotificationChain msgs) {
		ServiceCounterDataType oldQueryNextCount = queryNextCount;
		queryNextCount = null;
		boolean oldQueryNextCountESet = queryNextCountESet;
		queryNextCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_NEXT_COUNT, oldQueryNextCount, null, oldQueryNextCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQueryNextCount() {
		if (queryNextCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)queryNextCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_NEXT_COUNT, null, msgs);
			msgs = basicUnsetQueryNextCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldQueryNextCountESet = queryNextCountESet;
			queryNextCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_NEXT_COUNT, null, null, oldQueryNextCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQueryNextCount() {
		return queryNextCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getRegisterNodesCount() {
		return registerNodesCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisterNodesCount(ServiceCounterDataType newRegisterNodesCount, NotificationChain msgs) {
		ServiceCounterDataType oldRegisterNodesCount = registerNodesCount;
		registerNodesCount = newRegisterNodesCount;
		boolean oldRegisterNodesCountESet = registerNodesCountESet;
		registerNodesCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REGISTER_NODES_COUNT, oldRegisterNodesCount, newRegisterNodesCount, !oldRegisterNodesCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterNodesCount(ServiceCounterDataType newRegisterNodesCount) {
		if (newRegisterNodesCount != registerNodesCount) {
			NotificationChain msgs = null;
			if (registerNodesCount != null)
				msgs = ((InternalEObject)registerNodesCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REGISTER_NODES_COUNT, null, msgs);
			if (newRegisterNodesCount != null)
				msgs = ((InternalEObject)newRegisterNodesCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REGISTER_NODES_COUNT, null, msgs);
			msgs = basicSetRegisterNodesCount(newRegisterNodesCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRegisterNodesCountESet = registerNodesCountESet;
			registerNodesCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REGISTER_NODES_COUNT, newRegisterNodesCount, newRegisterNodesCount, !oldRegisterNodesCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRegisterNodesCount(NotificationChain msgs) {
		ServiceCounterDataType oldRegisterNodesCount = registerNodesCount;
		registerNodesCount = null;
		boolean oldRegisterNodesCountESet = registerNodesCountESet;
		registerNodesCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REGISTER_NODES_COUNT, oldRegisterNodesCount, null, oldRegisterNodesCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRegisterNodesCount() {
		if (registerNodesCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)registerNodesCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REGISTER_NODES_COUNT, null, msgs);
			msgs = basicUnsetRegisterNodesCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRegisterNodesCountESet = registerNodesCountESet;
			registerNodesCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REGISTER_NODES_COUNT, null, null, oldRegisterNodesCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRegisterNodesCount() {
		return registerNodesCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType getUnregisterNodesCount() {
		return unregisterNodesCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnregisterNodesCount(ServiceCounterDataType newUnregisterNodesCount, NotificationChain msgs) {
		ServiceCounterDataType oldUnregisterNodesCount = unregisterNodesCount;
		unregisterNodesCount = newUnregisterNodesCount;
		boolean oldUnregisterNodesCountESet = unregisterNodesCountESet;
		unregisterNodesCountESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNREGISTER_NODES_COUNT, oldUnregisterNodesCount, newUnregisterNodesCount, !oldUnregisterNodesCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnregisterNodesCount(ServiceCounterDataType newUnregisterNodesCount) {
		if (newUnregisterNodesCount != unregisterNodesCount) {
			NotificationChain msgs = null;
			if (unregisterNodesCount != null)
				msgs = ((InternalEObject)unregisterNodesCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNREGISTER_NODES_COUNT, null, msgs);
			if (newUnregisterNodesCount != null)
				msgs = ((InternalEObject)newUnregisterNodesCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNREGISTER_NODES_COUNT, null, msgs);
			msgs = basicSetUnregisterNodesCount(newUnregisterNodesCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldUnregisterNodesCountESet = unregisterNodesCountESet;
			unregisterNodesCountESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNREGISTER_NODES_COUNT, newUnregisterNodesCount, newUnregisterNodesCount, !oldUnregisterNodesCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetUnregisterNodesCount(NotificationChain msgs) {
		ServiceCounterDataType oldUnregisterNodesCount = unregisterNodesCount;
		unregisterNodesCount = null;
		boolean oldUnregisterNodesCountESet = unregisterNodesCountESet;
		unregisterNodesCountESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNREGISTER_NODES_COUNT, oldUnregisterNodesCount, null, oldUnregisterNodesCountESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnregisterNodesCount() {
		if (unregisterNodesCount != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)unregisterNodesCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNREGISTER_NODES_COUNT, null, msgs);
			msgs = basicUnsetUnregisterNodesCount(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldUnregisterNodesCountESet = unregisterNodesCountESet;
			unregisterNodesCountESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNREGISTER_NODES_COUNT, null, null, oldUnregisterNodesCountESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnregisterNodesCount() {
		return unregisterNodesCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_ID:
				return basicUnsetSessionId(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_DESCRIPTION:
				return basicUnsetClientDescription(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__LOCALE_IDS:
				return basicUnsetLocaleIds(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TOTAL_REQUEST_COUNT:
				return basicUnsetTotalRequestCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__READ_COUNT:
				return basicUnsetReadCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_READ_COUNT:
				return basicUnsetHistoryReadCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__WRITE_COUNT:
				return basicUnsetWriteCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_UPDATE_COUNT:
				return basicUnsetHistoryUpdateCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CALL_COUNT:
				return basicUnsetCallCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_MONITORED_ITEMS_COUNT:
				return basicUnsetCreateMonitoredItemsCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_MONITORED_ITEMS_COUNT:
				return basicUnsetModifyMonitoredItemsCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_MONITORING_MODE_COUNT:
				return basicUnsetSetMonitoringModeCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_TRIGGERING_COUNT:
				return basicUnsetSetTriggeringCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_MONITORED_ITEMS_COUNT:
				return basicUnsetDeleteMonitoredItemsCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_SUBSCRIPTION_COUNT:
				return basicUnsetCreateSubscriptionCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_SUBSCRIPTION_COUNT:
				return basicUnsetModifySubscriptionCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_PUBLISHING_MODE_COUNT:
				return basicUnsetSetPublishingModeCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__PUBLISH_COUNT:
				return basicUnsetPublishCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_COUNT:
				return basicUnsetRepublishCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSFER_SUBSCRIPTIONS_COUNT:
				return basicUnsetTransferSubscriptionsCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_SUBSCRIPTIONS_COUNT:
				return basicUnsetDeleteSubscriptionsCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_NODES_COUNT:
				return basicUnsetAddNodesCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_REFERENCES_COUNT:
				return basicUnsetAddReferencesCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_NODES_COUNT:
				return basicUnsetDeleteNodesCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_REFERENCES_COUNT:
				return basicUnsetDeleteReferencesCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_COUNT:
				return basicUnsetBrowseCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_NEXT_COUNT:
				return basicUnsetBrowseNextCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_COUNT:
				return basicUnsetTranslateBrowsePathsToNodeIdsCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_FIRST_COUNT:
				return basicUnsetQueryFirstCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_NEXT_COUNT:
				return basicUnsetQueryNextCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REGISTER_NODES_COUNT:
				return basicUnsetRegisterNodesCount(msgs);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNREGISTER_NODES_COUNT:
				return basicUnsetUnregisterNodesCount(msgs);
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
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_ID:
				return getSessionId();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_NAME:
				return getSessionName();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_DESCRIPTION:
				return getClientDescription();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SERVER_URI:
				return getServerUri();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ENDPOINT_URL:
				return getEndpointUrl();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__LOCALE_IDS:
				return getLocaleIds();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ACTUAL_SESSION_TIMEOUT:
				return getActualSessionTimeout();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MAX_RESPONSE_MESSAGE_SIZE:
				return getMaxResponseMessageSize();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_CONNECTION_TIME:
				return getClientConnectionTime();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_LAST_CONTACT_TIME:
				return getClientLastContactTime();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_SUBSCRIPTIONS_COUNT:
				return getCurrentSubscriptionsCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_MONITORED_ITEMS_COUNT:
				return getCurrentMonitoredItemsCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_PUBLISH_REQUESTS_IN_QUEUE:
				return getCurrentPublishRequestsInQueue();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TOTAL_REQUEST_COUNT:
				return getTotalRequestCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNAUTHORIZED_REQUEST_COUNT:
				return getUnauthorizedRequestCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__READ_COUNT:
				return getReadCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_READ_COUNT:
				return getHistoryReadCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__WRITE_COUNT:
				return getWriteCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_UPDATE_COUNT:
				return getHistoryUpdateCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CALL_COUNT:
				return getCallCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_MONITORED_ITEMS_COUNT:
				return getCreateMonitoredItemsCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_MONITORED_ITEMS_COUNT:
				return getModifyMonitoredItemsCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_MONITORING_MODE_COUNT:
				return getSetMonitoringModeCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_TRIGGERING_COUNT:
				return getSetTriggeringCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_MONITORED_ITEMS_COUNT:
				return getDeleteMonitoredItemsCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_SUBSCRIPTION_COUNT:
				return getCreateSubscriptionCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_SUBSCRIPTION_COUNT:
				return getModifySubscriptionCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_PUBLISHING_MODE_COUNT:
				return getSetPublishingModeCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__PUBLISH_COUNT:
				return getPublishCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_COUNT:
				return getRepublishCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSFER_SUBSCRIPTIONS_COUNT:
				return getTransferSubscriptionsCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_SUBSCRIPTIONS_COUNT:
				return getDeleteSubscriptionsCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_NODES_COUNT:
				return getAddNodesCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_REFERENCES_COUNT:
				return getAddReferencesCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_NODES_COUNT:
				return getDeleteNodesCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_REFERENCES_COUNT:
				return getDeleteReferencesCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_COUNT:
				return getBrowseCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_NEXT_COUNT:
				return getBrowseNextCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_COUNT:
				return getTranslateBrowsePathsToNodeIdsCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_FIRST_COUNT:
				return getQueryFirstCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_NEXT_COUNT:
				return getQueryNextCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REGISTER_NODES_COUNT:
				return getRegisterNodesCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNREGISTER_NODES_COUNT:
				return getUnregisterNodesCount();
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
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_ID:
				setSessionId((NodeId)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_NAME:
				setSessionName((String)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_DESCRIPTION:
				setClientDescription((ApplicationDescription)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SERVER_URI:
				setServerUri((String)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ENDPOINT_URL:
				setEndpointUrl((String)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__LOCALE_IDS:
				setLocaleIds((ListOfString)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ACTUAL_SESSION_TIMEOUT:
				setActualSessionTimeout((Double)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MAX_RESPONSE_MESSAGE_SIZE:
				setMaxResponseMessageSize((Long)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_CONNECTION_TIME:
				setClientConnectionTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_LAST_CONTACT_TIME:
				setClientLastContactTime((XMLGregorianCalendar)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_SUBSCRIPTIONS_COUNT:
				setCurrentSubscriptionsCount((Long)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_MONITORED_ITEMS_COUNT:
				setCurrentMonitoredItemsCount((Long)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_PUBLISH_REQUESTS_IN_QUEUE:
				setCurrentPublishRequestsInQueue((Long)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TOTAL_REQUEST_COUNT:
				setTotalRequestCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNAUTHORIZED_REQUEST_COUNT:
				setUnauthorizedRequestCount((Long)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__READ_COUNT:
				setReadCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_READ_COUNT:
				setHistoryReadCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__WRITE_COUNT:
				setWriteCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_UPDATE_COUNT:
				setHistoryUpdateCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CALL_COUNT:
				setCallCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_MONITORED_ITEMS_COUNT:
				setCreateMonitoredItemsCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_MONITORED_ITEMS_COUNT:
				setModifyMonitoredItemsCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_MONITORING_MODE_COUNT:
				setSetMonitoringModeCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_TRIGGERING_COUNT:
				setSetTriggeringCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_MONITORED_ITEMS_COUNT:
				setDeleteMonitoredItemsCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_SUBSCRIPTION_COUNT:
				setCreateSubscriptionCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_SUBSCRIPTION_COUNT:
				setModifySubscriptionCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_PUBLISHING_MODE_COUNT:
				setSetPublishingModeCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__PUBLISH_COUNT:
				setPublishCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_COUNT:
				setRepublishCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSFER_SUBSCRIPTIONS_COUNT:
				setTransferSubscriptionsCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_SUBSCRIPTIONS_COUNT:
				setDeleteSubscriptionsCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_NODES_COUNT:
				setAddNodesCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_REFERENCES_COUNT:
				setAddReferencesCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_NODES_COUNT:
				setDeleteNodesCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_REFERENCES_COUNT:
				setDeleteReferencesCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_COUNT:
				setBrowseCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_NEXT_COUNT:
				setBrowseNextCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_COUNT:
				setTranslateBrowsePathsToNodeIdsCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_FIRST_COUNT:
				setQueryFirstCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_NEXT_COUNT:
				setQueryNextCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REGISTER_NODES_COUNT:
				setRegisterNodesCount((ServiceCounterDataType)newValue);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNREGISTER_NODES_COUNT:
				setUnregisterNodesCount((ServiceCounterDataType)newValue);
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
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_ID:
				unsetSessionId();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_NAME:
				unsetSessionName();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_DESCRIPTION:
				unsetClientDescription();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SERVER_URI:
				unsetServerUri();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ENDPOINT_URL:
				unsetEndpointUrl();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__LOCALE_IDS:
				unsetLocaleIds();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ACTUAL_SESSION_TIMEOUT:
				unsetActualSessionTimeout();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MAX_RESPONSE_MESSAGE_SIZE:
				unsetMaxResponseMessageSize();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_CONNECTION_TIME:
				setClientConnectionTime(CLIENT_CONNECTION_TIME_EDEFAULT);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_LAST_CONTACT_TIME:
				setClientLastContactTime(CLIENT_LAST_CONTACT_TIME_EDEFAULT);
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_SUBSCRIPTIONS_COUNT:
				unsetCurrentSubscriptionsCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_MONITORED_ITEMS_COUNT:
				unsetCurrentMonitoredItemsCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_PUBLISH_REQUESTS_IN_QUEUE:
				unsetCurrentPublishRequestsInQueue();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TOTAL_REQUEST_COUNT:
				unsetTotalRequestCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNAUTHORIZED_REQUEST_COUNT:
				unsetUnauthorizedRequestCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__READ_COUNT:
				unsetReadCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_READ_COUNT:
				unsetHistoryReadCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__WRITE_COUNT:
				unsetWriteCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_UPDATE_COUNT:
				unsetHistoryUpdateCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CALL_COUNT:
				unsetCallCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_MONITORED_ITEMS_COUNT:
				unsetCreateMonitoredItemsCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_MONITORED_ITEMS_COUNT:
				unsetModifyMonitoredItemsCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_MONITORING_MODE_COUNT:
				unsetSetMonitoringModeCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_TRIGGERING_COUNT:
				unsetSetTriggeringCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_MONITORED_ITEMS_COUNT:
				unsetDeleteMonitoredItemsCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_SUBSCRIPTION_COUNT:
				unsetCreateSubscriptionCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_SUBSCRIPTION_COUNT:
				unsetModifySubscriptionCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_PUBLISHING_MODE_COUNT:
				unsetSetPublishingModeCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__PUBLISH_COUNT:
				unsetPublishCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_COUNT:
				unsetRepublishCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSFER_SUBSCRIPTIONS_COUNT:
				unsetTransferSubscriptionsCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_SUBSCRIPTIONS_COUNT:
				unsetDeleteSubscriptionsCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_NODES_COUNT:
				unsetAddNodesCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_REFERENCES_COUNT:
				unsetAddReferencesCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_NODES_COUNT:
				unsetDeleteNodesCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_REFERENCES_COUNT:
				unsetDeleteReferencesCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_COUNT:
				unsetBrowseCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_NEXT_COUNT:
				unsetBrowseNextCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_COUNT:
				unsetTranslateBrowsePathsToNodeIdsCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_FIRST_COUNT:
				unsetQueryFirstCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_NEXT_COUNT:
				unsetQueryNextCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REGISTER_NODES_COUNT:
				unsetRegisterNodesCount();
				return;
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNREGISTER_NODES_COUNT:
				unsetUnregisterNodesCount();
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
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_ID:
				return isSetSessionId();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SESSION_NAME:
				return isSetSessionName();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_DESCRIPTION:
				return isSetClientDescription();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SERVER_URI:
				return isSetServerUri();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ENDPOINT_URL:
				return isSetEndpointUrl();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__LOCALE_IDS:
				return isSetLocaleIds();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ACTUAL_SESSION_TIMEOUT:
				return isSetActualSessionTimeout();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MAX_RESPONSE_MESSAGE_SIZE:
				return isSetMaxResponseMessageSize();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_CONNECTION_TIME:
				return CLIENT_CONNECTION_TIME_EDEFAULT == null ? clientConnectionTime != null : !CLIENT_CONNECTION_TIME_EDEFAULT.equals(clientConnectionTime);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CLIENT_LAST_CONTACT_TIME:
				return CLIENT_LAST_CONTACT_TIME_EDEFAULT == null ? clientLastContactTime != null : !CLIENT_LAST_CONTACT_TIME_EDEFAULT.equals(clientLastContactTime);
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_SUBSCRIPTIONS_COUNT:
				return isSetCurrentSubscriptionsCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_MONITORED_ITEMS_COUNT:
				return isSetCurrentMonitoredItemsCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CURRENT_PUBLISH_REQUESTS_IN_QUEUE:
				return isSetCurrentPublishRequestsInQueue();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TOTAL_REQUEST_COUNT:
				return isSetTotalRequestCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNAUTHORIZED_REQUEST_COUNT:
				return isSetUnauthorizedRequestCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__READ_COUNT:
				return isSetReadCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_READ_COUNT:
				return isSetHistoryReadCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__WRITE_COUNT:
				return isSetWriteCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__HISTORY_UPDATE_COUNT:
				return isSetHistoryUpdateCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CALL_COUNT:
				return isSetCallCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_MONITORED_ITEMS_COUNT:
				return isSetCreateMonitoredItemsCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_MONITORED_ITEMS_COUNT:
				return isSetModifyMonitoredItemsCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_MONITORING_MODE_COUNT:
				return isSetSetMonitoringModeCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_TRIGGERING_COUNT:
				return isSetSetTriggeringCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_MONITORED_ITEMS_COUNT:
				return isSetDeleteMonitoredItemsCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__CREATE_SUBSCRIPTION_COUNT:
				return isSetCreateSubscriptionCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__MODIFY_SUBSCRIPTION_COUNT:
				return isSetModifySubscriptionCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__SET_PUBLISHING_MODE_COUNT:
				return isSetSetPublishingModeCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__PUBLISH_COUNT:
				return isSetPublishCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REPUBLISH_COUNT:
				return isSetRepublishCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSFER_SUBSCRIPTIONS_COUNT:
				return isSetTransferSubscriptionsCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_SUBSCRIPTIONS_COUNT:
				return isSetDeleteSubscriptionsCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_NODES_COUNT:
				return isSetAddNodesCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__ADD_REFERENCES_COUNT:
				return isSetAddReferencesCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_NODES_COUNT:
				return isSetDeleteNodesCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__DELETE_REFERENCES_COUNT:
				return isSetDeleteReferencesCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_COUNT:
				return isSetBrowseCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__BROWSE_NEXT_COUNT:
				return isSetBrowseNextCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_COUNT:
				return isSetTranslateBrowsePathsToNodeIdsCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_FIRST_COUNT:
				return isSetQueryFirstCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__QUERY_NEXT_COUNT:
				return isSetQueryNextCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__REGISTER_NODES_COUNT:
				return isSetRegisterNodesCount();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE__UNREGISTER_NODES_COUNT:
				return isSetUnregisterNodesCount();
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
		result.append(" (sessionName: ");
		if (sessionNameESet) result.append(sessionName); else result.append("<unset>");
		result.append(", serverUri: ");
		if (serverUriESet) result.append(serverUri); else result.append("<unset>");
		result.append(", endpointUrl: ");
		if (endpointUrlESet) result.append(endpointUrl); else result.append("<unset>");
		result.append(", actualSessionTimeout: ");
		if (actualSessionTimeoutESet) result.append(actualSessionTimeout); else result.append("<unset>");
		result.append(", maxResponseMessageSize: ");
		if (maxResponseMessageSizeESet) result.append(maxResponseMessageSize); else result.append("<unset>");
		result.append(", clientConnectionTime: ");
		result.append(clientConnectionTime);
		result.append(", clientLastContactTime: ");
		result.append(clientLastContactTime);
		result.append(", currentSubscriptionsCount: ");
		if (currentSubscriptionsCountESet) result.append(currentSubscriptionsCount); else result.append("<unset>");
		result.append(", currentMonitoredItemsCount: ");
		if (currentMonitoredItemsCountESet) result.append(currentMonitoredItemsCount); else result.append("<unset>");
		result.append(", currentPublishRequestsInQueue: ");
		if (currentPublishRequestsInQueueESet) result.append(currentPublishRequestsInQueue); else result.append("<unset>");
		result.append(", unauthorizedRequestCount: ");
		if (unauthorizedRequestCountESet) result.append(unauthorizedRequestCount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SessionDiagnosticsDataTypeImpl
