/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session Diagnostics Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSessionId <em>Session Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSessionName <em>Session Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getClientDescription <em>Client Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getServerUri <em>Server Uri</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getEndpointUrl <em>Endpoint Url</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getLocaleIds <em>Locale Ids</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getActualSessionTimeout <em>Actual Session Timeout</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getMaxResponseMessageSize <em>Max Response Message Size</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getClientConnectionTime <em>Client Connection Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getClientLastContactTime <em>Client Last Contact Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCurrentSubscriptionsCount <em>Current Subscriptions Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCurrentMonitoredItemsCount <em>Current Monitored Items Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCurrentPublishRequestsInQueue <em>Current Publish Requests In Queue</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getTotalRequestCount <em>Total Request Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getUnauthorizedRequestCount <em>Unauthorized Request Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getReadCount <em>Read Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getHistoryReadCount <em>History Read Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getWriteCount <em>Write Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getHistoryUpdateCount <em>History Update Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCallCount <em>Call Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCreateMonitoredItemsCount <em>Create Monitored Items Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getModifyMonitoredItemsCount <em>Modify Monitored Items Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSetMonitoringModeCount <em>Set Monitoring Mode Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSetTriggeringCount <em>Set Triggering Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getDeleteMonitoredItemsCount <em>Delete Monitored Items Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCreateSubscriptionCount <em>Create Subscription Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getModifySubscriptionCount <em>Modify Subscription Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSetPublishingModeCount <em>Set Publishing Mode Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getPublishCount <em>Publish Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getRepublishCount <em>Republish Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getTransferSubscriptionsCount <em>Transfer Subscriptions Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getDeleteSubscriptionsCount <em>Delete Subscriptions Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getAddNodesCount <em>Add Nodes Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getAddReferencesCount <em>Add References Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getDeleteNodesCount <em>Delete Nodes Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getDeleteReferencesCount <em>Delete References Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getBrowseCount <em>Browse Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getBrowseNextCount <em>Browse Next Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getTranslateBrowsePathsToNodeIdsCount <em>Translate Browse Paths To Node Ids Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getQueryFirstCount <em>Query First Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getQueryNextCount <em>Query Next Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getRegisterNodesCount <em>Register Nodes Count</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getUnregisterNodesCount <em>Unregister Nodes Count</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType()
 * @model extendedMetaData="name='SessionDiagnosticsDataType' kind='elementOnly'"
 * @generated
 */
public interface SessionDiagnosticsDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Session Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Id</em>' containment reference.
	 * @see #isSetSessionId()
	 * @see #unsetSessionId()
	 * @see #setSessionId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_SessionId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SessionId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getSessionId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSessionId <em>Session Id</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSessionId <em>Session Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSessionId()
	 * @see #getSessionId()
	 * @see #setSessionId(NodeId)
	 * @generated
	 */
	void unsetSessionId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSessionId <em>Session Id</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Session Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Name</em>' attribute.
	 * @see #isSetSessionName()
	 * @see #unsetSessionName()
	 * @see #setSessionName(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_SessionName()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SessionName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSessionName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSessionName <em>Session Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Name</em>' attribute.
	 * @see #isSetSessionName()
	 * @see #unsetSessionName()
	 * @see #getSessionName()
	 * @generated
	 */
	void setSessionName(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSessionName <em>Session Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSessionName()
	 * @see #getSessionName()
	 * @see #setSessionName(String)
	 * @generated
	 */
	void unsetSessionName();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSessionName <em>Session Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Session Name</em>' attribute is set.
	 * @see #unsetSessionName()
	 * @see #getSessionName()
	 * @see #setSessionName(String)
	 * @generated
	 */
	boolean isSetSessionName();

	/**
	 * Returns the value of the '<em><b>Client Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Description</em>' containment reference.
	 * @see #isSetClientDescription()
	 * @see #unsetClientDescription()
	 * @see #setClientDescription(ApplicationDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_ClientDescription()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ClientDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicationDescription getClientDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getClientDescription <em>Client Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Description</em>' containment reference.
	 * @see #isSetClientDescription()
	 * @see #unsetClientDescription()
	 * @see #getClientDescription()
	 * @generated
	 */
	void setClientDescription(ApplicationDescription value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getClientDescription <em>Client Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientDescription()
	 * @see #getClientDescription()
	 * @see #setClientDescription(ApplicationDescription)
	 * @generated
	 */
	void unsetClientDescription();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getClientDescription <em>Client Description</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client Description</em>' containment reference is set.
	 * @see #unsetClientDescription()
	 * @see #getClientDescription()
	 * @see #setClientDescription(ApplicationDescription)
	 * @generated
	 */
	boolean isSetClientDescription();

	/**
	 * Returns the value of the '<em><b>Server Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Uri</em>' attribute.
	 * @see #isSetServerUri()
	 * @see #unsetServerUri()
	 * @see #setServerUri(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_ServerUri()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ServerUri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServerUri();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getServerUri <em>Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Uri</em>' attribute.
	 * @see #isSetServerUri()
	 * @see #unsetServerUri()
	 * @see #getServerUri()
	 * @generated
	 */
	void setServerUri(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getServerUri <em>Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerUri()
	 * @see #getServerUri()
	 * @see #setServerUri(String)
	 * @generated
	 */
	void unsetServerUri();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getServerUri <em>Server Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Uri</em>' attribute is set.
	 * @see #unsetServerUri()
	 * @see #getServerUri()
	 * @see #setServerUri(String)
	 * @generated
	 */
	boolean isSetServerUri();

	/**
	 * Returns the value of the '<em><b>Endpoint Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Url</em>' attribute.
	 * @see #isSetEndpointUrl()
	 * @see #unsetEndpointUrl()
	 * @see #setEndpointUrl(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_EndpointUrl()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='EndpointUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEndpointUrl();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getEndpointUrl <em>Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Url</em>' attribute.
	 * @see #isSetEndpointUrl()
	 * @see #unsetEndpointUrl()
	 * @see #getEndpointUrl()
	 * @generated
	 */
	void setEndpointUrl(String value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getEndpointUrl <em>Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndpointUrl()
	 * @see #getEndpointUrl()
	 * @see #setEndpointUrl(String)
	 * @generated
	 */
	void unsetEndpointUrl();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getEndpointUrl <em>Endpoint Url</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Endpoint Url</em>' attribute is set.
	 * @see #unsetEndpointUrl()
	 * @see #getEndpointUrl()
	 * @see #setEndpointUrl(String)
	 * @generated
	 */
	boolean isSetEndpointUrl();

	/**
	 * Returns the value of the '<em><b>Locale Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale Ids</em>' containment reference.
	 * @see #isSetLocaleIds()
	 * @see #unsetLocaleIds()
	 * @see #setLocaleIds(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_LocaleIds()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LocaleIds' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getLocaleIds();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getLocaleIds <em>Locale Ids</em>}' containment reference.
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
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getLocaleIds <em>Locale Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocaleIds()
	 * @see #getLocaleIds()
	 * @see #setLocaleIds(ListOfString)
	 * @generated
	 */
	void unsetLocaleIds();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getLocaleIds <em>Locale Ids</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Actual Session Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Session Timeout</em>' attribute.
	 * @see #isSetActualSessionTimeout()
	 * @see #unsetActualSessionTimeout()
	 * @see #setActualSessionTimeout(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_ActualSessionTimeout()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='ActualSessionTimeout' namespace='##targetNamespace'"
	 * @generated
	 */
	double getActualSessionTimeout();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getActualSessionTimeout <em>Actual Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Session Timeout</em>' attribute.
	 * @see #isSetActualSessionTimeout()
	 * @see #unsetActualSessionTimeout()
	 * @see #getActualSessionTimeout()
	 * @generated
	 */
	void setActualSessionTimeout(double value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getActualSessionTimeout <em>Actual Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActualSessionTimeout()
	 * @see #getActualSessionTimeout()
	 * @see #setActualSessionTimeout(double)
	 * @generated
	 */
	void unsetActualSessionTimeout();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getActualSessionTimeout <em>Actual Session Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actual Session Timeout</em>' attribute is set.
	 * @see #unsetActualSessionTimeout()
	 * @see #getActualSessionTimeout()
	 * @see #setActualSessionTimeout(double)
	 * @generated
	 */
	boolean isSetActualSessionTimeout();

	/**
	 * Returns the value of the '<em><b>Max Response Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Response Message Size</em>' attribute.
	 * @see #isSetMaxResponseMessageSize()
	 * @see #unsetMaxResponseMessageSize()
	 * @see #setMaxResponseMessageSize(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_MaxResponseMessageSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='MaxResponseMessageSize' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMaxResponseMessageSize();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getMaxResponseMessageSize <em>Max Response Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Response Message Size</em>' attribute.
	 * @see #isSetMaxResponseMessageSize()
	 * @see #unsetMaxResponseMessageSize()
	 * @see #getMaxResponseMessageSize()
	 * @generated
	 */
	void setMaxResponseMessageSize(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getMaxResponseMessageSize <em>Max Response Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxResponseMessageSize()
	 * @see #getMaxResponseMessageSize()
	 * @see #setMaxResponseMessageSize(long)
	 * @generated
	 */
	void unsetMaxResponseMessageSize();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getMaxResponseMessageSize <em>Max Response Message Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Response Message Size</em>' attribute is set.
	 * @see #unsetMaxResponseMessageSize()
	 * @see #getMaxResponseMessageSize()
	 * @see #setMaxResponseMessageSize(long)
	 * @generated
	 */
	boolean isSetMaxResponseMessageSize();

	/**
	 * Returns the value of the '<em><b>Client Connection Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Connection Time</em>' attribute.
	 * @see #setClientConnectionTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_ClientConnectionTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='ClientConnectionTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getClientConnectionTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getClientConnectionTime <em>Client Connection Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Connection Time</em>' attribute.
	 * @see #getClientConnectionTime()
	 * @generated
	 */
	void setClientConnectionTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Client Last Contact Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Last Contact Time</em>' attribute.
	 * @see #setClientLastContactTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_ClientLastContactTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='ClientLastContactTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getClientLastContactTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getClientLastContactTime <em>Client Last Contact Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Last Contact Time</em>' attribute.
	 * @see #getClientLastContactTime()
	 * @generated
	 */
	void setClientLastContactTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Current Subscriptions Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Subscriptions Count</em>' attribute.
	 * @see #isSetCurrentSubscriptionsCount()
	 * @see #unsetCurrentSubscriptionsCount()
	 * @see #setCurrentSubscriptionsCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_CurrentSubscriptionsCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='CurrentSubscriptionsCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getCurrentSubscriptionsCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCurrentSubscriptionsCount <em>Current Subscriptions Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Subscriptions Count</em>' attribute.
	 * @see #isSetCurrentSubscriptionsCount()
	 * @see #unsetCurrentSubscriptionsCount()
	 * @see #getCurrentSubscriptionsCount()
	 * @generated
	 */
	void setCurrentSubscriptionsCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCurrentSubscriptionsCount <em>Current Subscriptions Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrentSubscriptionsCount()
	 * @see #getCurrentSubscriptionsCount()
	 * @see #setCurrentSubscriptionsCount(long)
	 * @generated
	 */
	void unsetCurrentSubscriptionsCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCurrentSubscriptionsCount <em>Current Subscriptions Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current Subscriptions Count</em>' attribute is set.
	 * @see #unsetCurrentSubscriptionsCount()
	 * @see #getCurrentSubscriptionsCount()
	 * @see #setCurrentSubscriptionsCount(long)
	 * @generated
	 */
	boolean isSetCurrentSubscriptionsCount();

	/**
	 * Returns the value of the '<em><b>Current Monitored Items Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Monitored Items Count</em>' attribute.
	 * @see #isSetCurrentMonitoredItemsCount()
	 * @see #unsetCurrentMonitoredItemsCount()
	 * @see #setCurrentMonitoredItemsCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_CurrentMonitoredItemsCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='CurrentMonitoredItemsCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getCurrentMonitoredItemsCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCurrentMonitoredItemsCount <em>Current Monitored Items Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Monitored Items Count</em>' attribute.
	 * @see #isSetCurrentMonitoredItemsCount()
	 * @see #unsetCurrentMonitoredItemsCount()
	 * @see #getCurrentMonitoredItemsCount()
	 * @generated
	 */
	void setCurrentMonitoredItemsCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCurrentMonitoredItemsCount <em>Current Monitored Items Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrentMonitoredItemsCount()
	 * @see #getCurrentMonitoredItemsCount()
	 * @see #setCurrentMonitoredItemsCount(long)
	 * @generated
	 */
	void unsetCurrentMonitoredItemsCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCurrentMonitoredItemsCount <em>Current Monitored Items Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current Monitored Items Count</em>' attribute is set.
	 * @see #unsetCurrentMonitoredItemsCount()
	 * @see #getCurrentMonitoredItemsCount()
	 * @see #setCurrentMonitoredItemsCount(long)
	 * @generated
	 */
	boolean isSetCurrentMonitoredItemsCount();

	/**
	 * Returns the value of the '<em><b>Current Publish Requests In Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Publish Requests In Queue</em>' attribute.
	 * @see #isSetCurrentPublishRequestsInQueue()
	 * @see #unsetCurrentPublishRequestsInQueue()
	 * @see #setCurrentPublishRequestsInQueue(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_CurrentPublishRequestsInQueue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='CurrentPublishRequestsInQueue' namespace='##targetNamespace'"
	 * @generated
	 */
	long getCurrentPublishRequestsInQueue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCurrentPublishRequestsInQueue <em>Current Publish Requests In Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Publish Requests In Queue</em>' attribute.
	 * @see #isSetCurrentPublishRequestsInQueue()
	 * @see #unsetCurrentPublishRequestsInQueue()
	 * @see #getCurrentPublishRequestsInQueue()
	 * @generated
	 */
	void setCurrentPublishRequestsInQueue(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCurrentPublishRequestsInQueue <em>Current Publish Requests In Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrentPublishRequestsInQueue()
	 * @see #getCurrentPublishRequestsInQueue()
	 * @see #setCurrentPublishRequestsInQueue(long)
	 * @generated
	 */
	void unsetCurrentPublishRequestsInQueue();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCurrentPublishRequestsInQueue <em>Current Publish Requests In Queue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current Publish Requests In Queue</em>' attribute is set.
	 * @see #unsetCurrentPublishRequestsInQueue()
	 * @see #getCurrentPublishRequestsInQueue()
	 * @see #setCurrentPublishRequestsInQueue(long)
	 * @generated
	 */
	boolean isSetCurrentPublishRequestsInQueue();

	/**
	 * Returns the value of the '<em><b>Total Request Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Request Count</em>' containment reference.
	 * @see #isSetTotalRequestCount()
	 * @see #unsetTotalRequestCount()
	 * @see #setTotalRequestCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_TotalRequestCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TotalRequestCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getTotalRequestCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getTotalRequestCount <em>Total Request Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Request Count</em>' containment reference.
	 * @see #isSetTotalRequestCount()
	 * @see #unsetTotalRequestCount()
	 * @see #getTotalRequestCount()
	 * @generated
	 */
	void setTotalRequestCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getTotalRequestCount <em>Total Request Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTotalRequestCount()
	 * @see #getTotalRequestCount()
	 * @see #setTotalRequestCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetTotalRequestCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getTotalRequestCount <em>Total Request Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Total Request Count</em>' containment reference is set.
	 * @see #unsetTotalRequestCount()
	 * @see #getTotalRequestCount()
	 * @see #setTotalRequestCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetTotalRequestCount();

	/**
	 * Returns the value of the '<em><b>Unauthorized Request Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unauthorized Request Count</em>' attribute.
	 * @see #isSetUnauthorizedRequestCount()
	 * @see #unsetUnauthorizedRequestCount()
	 * @see #setUnauthorizedRequestCount(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_UnauthorizedRequestCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='UnauthorizedRequestCount' namespace='##targetNamespace'"
	 * @generated
	 */
	long getUnauthorizedRequestCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getUnauthorizedRequestCount <em>Unauthorized Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unauthorized Request Count</em>' attribute.
	 * @see #isSetUnauthorizedRequestCount()
	 * @see #unsetUnauthorizedRequestCount()
	 * @see #getUnauthorizedRequestCount()
	 * @generated
	 */
	void setUnauthorizedRequestCount(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getUnauthorizedRequestCount <em>Unauthorized Request Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnauthorizedRequestCount()
	 * @see #getUnauthorizedRequestCount()
	 * @see #setUnauthorizedRequestCount(long)
	 * @generated
	 */
	void unsetUnauthorizedRequestCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getUnauthorizedRequestCount <em>Unauthorized Request Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unauthorized Request Count</em>' attribute is set.
	 * @see #unsetUnauthorizedRequestCount()
	 * @see #getUnauthorizedRequestCount()
	 * @see #setUnauthorizedRequestCount(long)
	 * @generated
	 */
	boolean isSetUnauthorizedRequestCount();

	/**
	 * Returns the value of the '<em><b>Read Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Count</em>' containment reference.
	 * @see #isSetReadCount()
	 * @see #unsetReadCount()
	 * @see #setReadCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_ReadCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ReadCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getReadCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getReadCount <em>Read Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Count</em>' containment reference.
	 * @see #isSetReadCount()
	 * @see #unsetReadCount()
	 * @see #getReadCount()
	 * @generated
	 */
	void setReadCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getReadCount <em>Read Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadCount()
	 * @see #getReadCount()
	 * @see #setReadCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetReadCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getReadCount <em>Read Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Read Count</em>' containment reference is set.
	 * @see #unsetReadCount()
	 * @see #getReadCount()
	 * @see #setReadCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetReadCount();

	/**
	 * Returns the value of the '<em><b>History Read Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Read Count</em>' containment reference.
	 * @see #isSetHistoryReadCount()
	 * @see #unsetHistoryReadCount()
	 * @see #setHistoryReadCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_HistoryReadCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='HistoryReadCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getHistoryReadCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getHistoryReadCount <em>History Read Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Read Count</em>' containment reference.
	 * @see #isSetHistoryReadCount()
	 * @see #unsetHistoryReadCount()
	 * @see #getHistoryReadCount()
	 * @generated
	 */
	void setHistoryReadCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getHistoryReadCount <em>History Read Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHistoryReadCount()
	 * @see #getHistoryReadCount()
	 * @see #setHistoryReadCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetHistoryReadCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getHistoryReadCount <em>History Read Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>History Read Count</em>' containment reference is set.
	 * @see #unsetHistoryReadCount()
	 * @see #getHistoryReadCount()
	 * @see #setHistoryReadCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetHistoryReadCount();

	/**
	 * Returns the value of the '<em><b>Write Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Count</em>' containment reference.
	 * @see #isSetWriteCount()
	 * @see #unsetWriteCount()
	 * @see #setWriteCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_WriteCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='WriteCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getWriteCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getWriteCount <em>Write Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Count</em>' containment reference.
	 * @see #isSetWriteCount()
	 * @see #unsetWriteCount()
	 * @see #getWriteCount()
	 * @generated
	 */
	void setWriteCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getWriteCount <em>Write Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWriteCount()
	 * @see #getWriteCount()
	 * @see #setWriteCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetWriteCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getWriteCount <em>Write Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write Count</em>' containment reference is set.
	 * @see #unsetWriteCount()
	 * @see #getWriteCount()
	 * @see #setWriteCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetWriteCount();

	/**
	 * Returns the value of the '<em><b>History Update Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Update Count</em>' containment reference.
	 * @see #isSetHistoryUpdateCount()
	 * @see #unsetHistoryUpdateCount()
	 * @see #setHistoryUpdateCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_HistoryUpdateCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='HistoryUpdateCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getHistoryUpdateCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getHistoryUpdateCount <em>History Update Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Update Count</em>' containment reference.
	 * @see #isSetHistoryUpdateCount()
	 * @see #unsetHistoryUpdateCount()
	 * @see #getHistoryUpdateCount()
	 * @generated
	 */
	void setHistoryUpdateCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getHistoryUpdateCount <em>History Update Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHistoryUpdateCount()
	 * @see #getHistoryUpdateCount()
	 * @see #setHistoryUpdateCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetHistoryUpdateCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getHistoryUpdateCount <em>History Update Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>History Update Count</em>' containment reference is set.
	 * @see #unsetHistoryUpdateCount()
	 * @see #getHistoryUpdateCount()
	 * @see #setHistoryUpdateCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetHistoryUpdateCount();

	/**
	 * Returns the value of the '<em><b>Call Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Count</em>' containment reference.
	 * @see #isSetCallCount()
	 * @see #unsetCallCount()
	 * @see #setCallCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_CallCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='CallCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getCallCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCallCount <em>Call Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Count</em>' containment reference.
	 * @see #isSetCallCount()
	 * @see #unsetCallCount()
	 * @see #getCallCount()
	 * @generated
	 */
	void setCallCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCallCount <em>Call Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCallCount()
	 * @see #getCallCount()
	 * @see #setCallCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetCallCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCallCount <em>Call Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Call Count</em>' containment reference is set.
	 * @see #unsetCallCount()
	 * @see #getCallCount()
	 * @see #setCallCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetCallCount();

	/**
	 * Returns the value of the '<em><b>Create Monitored Items Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Monitored Items Count</em>' containment reference.
	 * @see #isSetCreateMonitoredItemsCount()
	 * @see #unsetCreateMonitoredItemsCount()
	 * @see #setCreateMonitoredItemsCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_CreateMonitoredItemsCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='CreateMonitoredItemsCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getCreateMonitoredItemsCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCreateMonitoredItemsCount <em>Create Monitored Items Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Monitored Items Count</em>' containment reference.
	 * @see #isSetCreateMonitoredItemsCount()
	 * @see #unsetCreateMonitoredItemsCount()
	 * @see #getCreateMonitoredItemsCount()
	 * @generated
	 */
	void setCreateMonitoredItemsCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCreateMonitoredItemsCount <em>Create Monitored Items Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreateMonitoredItemsCount()
	 * @see #getCreateMonitoredItemsCount()
	 * @see #setCreateMonitoredItemsCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetCreateMonitoredItemsCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCreateMonitoredItemsCount <em>Create Monitored Items Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Create Monitored Items Count</em>' containment reference is set.
	 * @see #unsetCreateMonitoredItemsCount()
	 * @see #getCreateMonitoredItemsCount()
	 * @see #setCreateMonitoredItemsCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetCreateMonitoredItemsCount();

	/**
	 * Returns the value of the '<em><b>Modify Monitored Items Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Monitored Items Count</em>' containment reference.
	 * @see #isSetModifyMonitoredItemsCount()
	 * @see #unsetModifyMonitoredItemsCount()
	 * @see #setModifyMonitoredItemsCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_ModifyMonitoredItemsCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ModifyMonitoredItemsCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getModifyMonitoredItemsCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getModifyMonitoredItemsCount <em>Modify Monitored Items Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify Monitored Items Count</em>' containment reference.
	 * @see #isSetModifyMonitoredItemsCount()
	 * @see #unsetModifyMonitoredItemsCount()
	 * @see #getModifyMonitoredItemsCount()
	 * @generated
	 */
	void setModifyMonitoredItemsCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getModifyMonitoredItemsCount <em>Modify Monitored Items Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModifyMonitoredItemsCount()
	 * @see #getModifyMonitoredItemsCount()
	 * @see #setModifyMonitoredItemsCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetModifyMonitoredItemsCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getModifyMonitoredItemsCount <em>Modify Monitored Items Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modify Monitored Items Count</em>' containment reference is set.
	 * @see #unsetModifyMonitoredItemsCount()
	 * @see #getModifyMonitoredItemsCount()
	 * @see #setModifyMonitoredItemsCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetModifyMonitoredItemsCount();

	/**
	 * Returns the value of the '<em><b>Set Monitoring Mode Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Monitoring Mode Count</em>' containment reference.
	 * @see #isSetSetMonitoringModeCount()
	 * @see #unsetSetMonitoringModeCount()
	 * @see #setSetMonitoringModeCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_SetMonitoringModeCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SetMonitoringModeCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getSetMonitoringModeCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSetMonitoringModeCount <em>Set Monitoring Mode Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Monitoring Mode Count</em>' containment reference.
	 * @see #isSetSetMonitoringModeCount()
	 * @see #unsetSetMonitoringModeCount()
	 * @see #getSetMonitoringModeCount()
	 * @generated
	 */
	void setSetMonitoringModeCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSetMonitoringModeCount <em>Set Monitoring Mode Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSetMonitoringModeCount()
	 * @see #getSetMonitoringModeCount()
	 * @see #setSetMonitoringModeCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetSetMonitoringModeCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSetMonitoringModeCount <em>Set Monitoring Mode Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Set Monitoring Mode Count</em>' containment reference is set.
	 * @see #unsetSetMonitoringModeCount()
	 * @see #getSetMonitoringModeCount()
	 * @see #setSetMonitoringModeCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetSetMonitoringModeCount();

	/**
	 * Returns the value of the '<em><b>Set Triggering Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Triggering Count</em>' containment reference.
	 * @see #isSetSetTriggeringCount()
	 * @see #unsetSetTriggeringCount()
	 * @see #setSetTriggeringCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_SetTriggeringCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SetTriggeringCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getSetTriggeringCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSetTriggeringCount <em>Set Triggering Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Triggering Count</em>' containment reference.
	 * @see #isSetSetTriggeringCount()
	 * @see #unsetSetTriggeringCount()
	 * @see #getSetTriggeringCount()
	 * @generated
	 */
	void setSetTriggeringCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSetTriggeringCount <em>Set Triggering Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSetTriggeringCount()
	 * @see #getSetTriggeringCount()
	 * @see #setSetTriggeringCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetSetTriggeringCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSetTriggeringCount <em>Set Triggering Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Set Triggering Count</em>' containment reference is set.
	 * @see #unsetSetTriggeringCount()
	 * @see #getSetTriggeringCount()
	 * @see #setSetTriggeringCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetSetTriggeringCount();

	/**
	 * Returns the value of the '<em><b>Delete Monitored Items Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Monitored Items Count</em>' containment reference.
	 * @see #isSetDeleteMonitoredItemsCount()
	 * @see #unsetDeleteMonitoredItemsCount()
	 * @see #setDeleteMonitoredItemsCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_DeleteMonitoredItemsCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DeleteMonitoredItemsCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getDeleteMonitoredItemsCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getDeleteMonitoredItemsCount <em>Delete Monitored Items Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Monitored Items Count</em>' containment reference.
	 * @see #isSetDeleteMonitoredItemsCount()
	 * @see #unsetDeleteMonitoredItemsCount()
	 * @see #getDeleteMonitoredItemsCount()
	 * @generated
	 */
	void setDeleteMonitoredItemsCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getDeleteMonitoredItemsCount <em>Delete Monitored Items Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeleteMonitoredItemsCount()
	 * @see #getDeleteMonitoredItemsCount()
	 * @see #setDeleteMonitoredItemsCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetDeleteMonitoredItemsCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getDeleteMonitoredItemsCount <em>Delete Monitored Items Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delete Monitored Items Count</em>' containment reference is set.
	 * @see #unsetDeleteMonitoredItemsCount()
	 * @see #getDeleteMonitoredItemsCount()
	 * @see #setDeleteMonitoredItemsCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetDeleteMonitoredItemsCount();

	/**
	 * Returns the value of the '<em><b>Create Subscription Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Subscription Count</em>' containment reference.
	 * @see #isSetCreateSubscriptionCount()
	 * @see #unsetCreateSubscriptionCount()
	 * @see #setCreateSubscriptionCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_CreateSubscriptionCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='CreateSubscriptionCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getCreateSubscriptionCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCreateSubscriptionCount <em>Create Subscription Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Subscription Count</em>' containment reference.
	 * @see #isSetCreateSubscriptionCount()
	 * @see #unsetCreateSubscriptionCount()
	 * @see #getCreateSubscriptionCount()
	 * @generated
	 */
	void setCreateSubscriptionCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCreateSubscriptionCount <em>Create Subscription Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreateSubscriptionCount()
	 * @see #getCreateSubscriptionCount()
	 * @see #setCreateSubscriptionCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetCreateSubscriptionCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getCreateSubscriptionCount <em>Create Subscription Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Create Subscription Count</em>' containment reference is set.
	 * @see #unsetCreateSubscriptionCount()
	 * @see #getCreateSubscriptionCount()
	 * @see #setCreateSubscriptionCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetCreateSubscriptionCount();

	/**
	 * Returns the value of the '<em><b>Modify Subscription Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Subscription Count</em>' containment reference.
	 * @see #isSetModifySubscriptionCount()
	 * @see #unsetModifySubscriptionCount()
	 * @see #setModifySubscriptionCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_ModifySubscriptionCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ModifySubscriptionCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getModifySubscriptionCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getModifySubscriptionCount <em>Modify Subscription Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify Subscription Count</em>' containment reference.
	 * @see #isSetModifySubscriptionCount()
	 * @see #unsetModifySubscriptionCount()
	 * @see #getModifySubscriptionCount()
	 * @generated
	 */
	void setModifySubscriptionCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getModifySubscriptionCount <em>Modify Subscription Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModifySubscriptionCount()
	 * @see #getModifySubscriptionCount()
	 * @see #setModifySubscriptionCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetModifySubscriptionCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getModifySubscriptionCount <em>Modify Subscription Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modify Subscription Count</em>' containment reference is set.
	 * @see #unsetModifySubscriptionCount()
	 * @see #getModifySubscriptionCount()
	 * @see #setModifySubscriptionCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetModifySubscriptionCount();

	/**
	 * Returns the value of the '<em><b>Set Publishing Mode Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Publishing Mode Count</em>' containment reference.
	 * @see #isSetSetPublishingModeCount()
	 * @see #unsetSetPublishingModeCount()
	 * @see #setSetPublishingModeCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_SetPublishingModeCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SetPublishingModeCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getSetPublishingModeCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSetPublishingModeCount <em>Set Publishing Mode Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Publishing Mode Count</em>' containment reference.
	 * @see #isSetSetPublishingModeCount()
	 * @see #unsetSetPublishingModeCount()
	 * @see #getSetPublishingModeCount()
	 * @generated
	 */
	void setSetPublishingModeCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSetPublishingModeCount <em>Set Publishing Mode Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSetPublishingModeCount()
	 * @see #getSetPublishingModeCount()
	 * @see #setSetPublishingModeCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetSetPublishingModeCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getSetPublishingModeCount <em>Set Publishing Mode Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Set Publishing Mode Count</em>' containment reference is set.
	 * @see #unsetSetPublishingModeCount()
	 * @see #getSetPublishingModeCount()
	 * @see #setSetPublishingModeCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetSetPublishingModeCount();

	/**
	 * Returns the value of the '<em><b>Publish Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish Count</em>' containment reference.
	 * @see #isSetPublishCount()
	 * @see #unsetPublishCount()
	 * @see #setPublishCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_PublishCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='PublishCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getPublishCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getPublishCount <em>Publish Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish Count</em>' containment reference.
	 * @see #isSetPublishCount()
	 * @see #unsetPublishCount()
	 * @see #getPublishCount()
	 * @generated
	 */
	void setPublishCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getPublishCount <em>Publish Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPublishCount()
	 * @see #getPublishCount()
	 * @see #setPublishCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetPublishCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getPublishCount <em>Publish Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Publish Count</em>' containment reference is set.
	 * @see #unsetPublishCount()
	 * @see #getPublishCount()
	 * @see #setPublishCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetPublishCount();

	/**
	 * Returns the value of the '<em><b>Republish Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Republish Count</em>' containment reference.
	 * @see #isSetRepublishCount()
	 * @see #unsetRepublishCount()
	 * @see #setRepublishCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_RepublishCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RepublishCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getRepublishCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getRepublishCount <em>Republish Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Republish Count</em>' containment reference.
	 * @see #isSetRepublishCount()
	 * @see #unsetRepublishCount()
	 * @see #getRepublishCount()
	 * @generated
	 */
	void setRepublishCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getRepublishCount <em>Republish Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepublishCount()
	 * @see #getRepublishCount()
	 * @see #setRepublishCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetRepublishCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getRepublishCount <em>Republish Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Republish Count</em>' containment reference is set.
	 * @see #unsetRepublishCount()
	 * @see #getRepublishCount()
	 * @see #setRepublishCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetRepublishCount();

	/**
	 * Returns the value of the '<em><b>Transfer Subscriptions Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Subscriptions Count</em>' containment reference.
	 * @see #isSetTransferSubscriptionsCount()
	 * @see #unsetTransferSubscriptionsCount()
	 * @see #setTransferSubscriptionsCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_TransferSubscriptionsCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TransferSubscriptionsCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getTransferSubscriptionsCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getTransferSubscriptionsCount <em>Transfer Subscriptions Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Subscriptions Count</em>' containment reference.
	 * @see #isSetTransferSubscriptionsCount()
	 * @see #unsetTransferSubscriptionsCount()
	 * @see #getTransferSubscriptionsCount()
	 * @generated
	 */
	void setTransferSubscriptionsCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getTransferSubscriptionsCount <em>Transfer Subscriptions Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransferSubscriptionsCount()
	 * @see #getTransferSubscriptionsCount()
	 * @see #setTransferSubscriptionsCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetTransferSubscriptionsCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getTransferSubscriptionsCount <em>Transfer Subscriptions Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transfer Subscriptions Count</em>' containment reference is set.
	 * @see #unsetTransferSubscriptionsCount()
	 * @see #getTransferSubscriptionsCount()
	 * @see #setTransferSubscriptionsCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetTransferSubscriptionsCount();

	/**
	 * Returns the value of the '<em><b>Delete Subscriptions Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Subscriptions Count</em>' containment reference.
	 * @see #isSetDeleteSubscriptionsCount()
	 * @see #unsetDeleteSubscriptionsCount()
	 * @see #setDeleteSubscriptionsCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_DeleteSubscriptionsCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DeleteSubscriptionsCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getDeleteSubscriptionsCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getDeleteSubscriptionsCount <em>Delete Subscriptions Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Subscriptions Count</em>' containment reference.
	 * @see #isSetDeleteSubscriptionsCount()
	 * @see #unsetDeleteSubscriptionsCount()
	 * @see #getDeleteSubscriptionsCount()
	 * @generated
	 */
	void setDeleteSubscriptionsCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getDeleteSubscriptionsCount <em>Delete Subscriptions Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeleteSubscriptionsCount()
	 * @see #getDeleteSubscriptionsCount()
	 * @see #setDeleteSubscriptionsCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetDeleteSubscriptionsCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getDeleteSubscriptionsCount <em>Delete Subscriptions Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delete Subscriptions Count</em>' containment reference is set.
	 * @see #unsetDeleteSubscriptionsCount()
	 * @see #getDeleteSubscriptionsCount()
	 * @see #setDeleteSubscriptionsCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetDeleteSubscriptionsCount();

	/**
	 * Returns the value of the '<em><b>Add Nodes Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Nodes Count</em>' containment reference.
	 * @see #isSetAddNodesCount()
	 * @see #unsetAddNodesCount()
	 * @see #setAddNodesCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_AddNodesCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AddNodesCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getAddNodesCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getAddNodesCount <em>Add Nodes Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Nodes Count</em>' containment reference.
	 * @see #isSetAddNodesCount()
	 * @see #unsetAddNodesCount()
	 * @see #getAddNodesCount()
	 * @generated
	 */
	void setAddNodesCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getAddNodesCount <em>Add Nodes Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddNodesCount()
	 * @see #getAddNodesCount()
	 * @see #setAddNodesCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetAddNodesCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getAddNodesCount <em>Add Nodes Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Add Nodes Count</em>' containment reference is set.
	 * @see #unsetAddNodesCount()
	 * @see #getAddNodesCount()
	 * @see #setAddNodesCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetAddNodesCount();

	/**
	 * Returns the value of the '<em><b>Add References Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add References Count</em>' containment reference.
	 * @see #isSetAddReferencesCount()
	 * @see #unsetAddReferencesCount()
	 * @see #setAddReferencesCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_AddReferencesCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AddReferencesCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getAddReferencesCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getAddReferencesCount <em>Add References Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add References Count</em>' containment reference.
	 * @see #isSetAddReferencesCount()
	 * @see #unsetAddReferencesCount()
	 * @see #getAddReferencesCount()
	 * @generated
	 */
	void setAddReferencesCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getAddReferencesCount <em>Add References Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddReferencesCount()
	 * @see #getAddReferencesCount()
	 * @see #setAddReferencesCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetAddReferencesCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getAddReferencesCount <em>Add References Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Add References Count</em>' containment reference is set.
	 * @see #unsetAddReferencesCount()
	 * @see #getAddReferencesCount()
	 * @see #setAddReferencesCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetAddReferencesCount();

	/**
	 * Returns the value of the '<em><b>Delete Nodes Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Nodes Count</em>' containment reference.
	 * @see #isSetDeleteNodesCount()
	 * @see #unsetDeleteNodesCount()
	 * @see #setDeleteNodesCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_DeleteNodesCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DeleteNodesCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getDeleteNodesCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getDeleteNodesCount <em>Delete Nodes Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Nodes Count</em>' containment reference.
	 * @see #isSetDeleteNodesCount()
	 * @see #unsetDeleteNodesCount()
	 * @see #getDeleteNodesCount()
	 * @generated
	 */
	void setDeleteNodesCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getDeleteNodesCount <em>Delete Nodes Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeleteNodesCount()
	 * @see #getDeleteNodesCount()
	 * @see #setDeleteNodesCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetDeleteNodesCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getDeleteNodesCount <em>Delete Nodes Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delete Nodes Count</em>' containment reference is set.
	 * @see #unsetDeleteNodesCount()
	 * @see #getDeleteNodesCount()
	 * @see #setDeleteNodesCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetDeleteNodesCount();

	/**
	 * Returns the value of the '<em><b>Delete References Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete References Count</em>' containment reference.
	 * @see #isSetDeleteReferencesCount()
	 * @see #unsetDeleteReferencesCount()
	 * @see #setDeleteReferencesCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_DeleteReferencesCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DeleteReferencesCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getDeleteReferencesCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getDeleteReferencesCount <em>Delete References Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete References Count</em>' containment reference.
	 * @see #isSetDeleteReferencesCount()
	 * @see #unsetDeleteReferencesCount()
	 * @see #getDeleteReferencesCount()
	 * @generated
	 */
	void setDeleteReferencesCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getDeleteReferencesCount <em>Delete References Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeleteReferencesCount()
	 * @see #getDeleteReferencesCount()
	 * @see #setDeleteReferencesCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetDeleteReferencesCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getDeleteReferencesCount <em>Delete References Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delete References Count</em>' containment reference is set.
	 * @see #unsetDeleteReferencesCount()
	 * @see #getDeleteReferencesCount()
	 * @see #setDeleteReferencesCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetDeleteReferencesCount();

	/**
	 * Returns the value of the '<em><b>Browse Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Count</em>' containment reference.
	 * @see #isSetBrowseCount()
	 * @see #unsetBrowseCount()
	 * @see #setBrowseCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_BrowseCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='BrowseCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getBrowseCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getBrowseCount <em>Browse Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Count</em>' containment reference.
	 * @see #isSetBrowseCount()
	 * @see #unsetBrowseCount()
	 * @see #getBrowseCount()
	 * @generated
	 */
	void setBrowseCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getBrowseCount <em>Browse Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBrowseCount()
	 * @see #getBrowseCount()
	 * @see #setBrowseCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetBrowseCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getBrowseCount <em>Browse Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Browse Count</em>' containment reference is set.
	 * @see #unsetBrowseCount()
	 * @see #getBrowseCount()
	 * @see #setBrowseCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetBrowseCount();

	/**
	 * Returns the value of the '<em><b>Browse Next Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Next Count</em>' containment reference.
	 * @see #isSetBrowseNextCount()
	 * @see #unsetBrowseNextCount()
	 * @see #setBrowseNextCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_BrowseNextCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='BrowseNextCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getBrowseNextCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getBrowseNextCount <em>Browse Next Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Next Count</em>' containment reference.
	 * @see #isSetBrowseNextCount()
	 * @see #unsetBrowseNextCount()
	 * @see #getBrowseNextCount()
	 * @generated
	 */
	void setBrowseNextCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getBrowseNextCount <em>Browse Next Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBrowseNextCount()
	 * @see #getBrowseNextCount()
	 * @see #setBrowseNextCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetBrowseNextCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getBrowseNextCount <em>Browse Next Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Browse Next Count</em>' containment reference is set.
	 * @see #unsetBrowseNextCount()
	 * @see #getBrowseNextCount()
	 * @see #setBrowseNextCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetBrowseNextCount();

	/**
	 * Returns the value of the '<em><b>Translate Browse Paths To Node Ids Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translate Browse Paths To Node Ids Count</em>' containment reference.
	 * @see #isSetTranslateBrowsePathsToNodeIdsCount()
	 * @see #unsetTranslateBrowsePathsToNodeIdsCount()
	 * @see #setTranslateBrowsePathsToNodeIdsCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_TranslateBrowsePathsToNodeIdsCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TranslateBrowsePathsToNodeIdsCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getTranslateBrowsePathsToNodeIdsCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getTranslateBrowsePathsToNodeIdsCount <em>Translate Browse Paths To Node Ids Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translate Browse Paths To Node Ids Count</em>' containment reference.
	 * @see #isSetTranslateBrowsePathsToNodeIdsCount()
	 * @see #unsetTranslateBrowsePathsToNodeIdsCount()
	 * @see #getTranslateBrowsePathsToNodeIdsCount()
	 * @generated
	 */
	void setTranslateBrowsePathsToNodeIdsCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getTranslateBrowsePathsToNodeIdsCount <em>Translate Browse Paths To Node Ids Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTranslateBrowsePathsToNodeIdsCount()
	 * @see #getTranslateBrowsePathsToNodeIdsCount()
	 * @see #setTranslateBrowsePathsToNodeIdsCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetTranslateBrowsePathsToNodeIdsCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getTranslateBrowsePathsToNodeIdsCount <em>Translate Browse Paths To Node Ids Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Translate Browse Paths To Node Ids Count</em>' containment reference is set.
	 * @see #unsetTranslateBrowsePathsToNodeIdsCount()
	 * @see #getTranslateBrowsePathsToNodeIdsCount()
	 * @see #setTranslateBrowsePathsToNodeIdsCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetTranslateBrowsePathsToNodeIdsCount();

	/**
	 * Returns the value of the '<em><b>Query First Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query First Count</em>' containment reference.
	 * @see #isSetQueryFirstCount()
	 * @see #unsetQueryFirstCount()
	 * @see #setQueryFirstCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_QueryFirstCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='QueryFirstCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getQueryFirstCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getQueryFirstCount <em>Query First Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query First Count</em>' containment reference.
	 * @see #isSetQueryFirstCount()
	 * @see #unsetQueryFirstCount()
	 * @see #getQueryFirstCount()
	 * @generated
	 */
	void setQueryFirstCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getQueryFirstCount <em>Query First Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQueryFirstCount()
	 * @see #getQueryFirstCount()
	 * @see #setQueryFirstCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetQueryFirstCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getQueryFirstCount <em>Query First Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Query First Count</em>' containment reference is set.
	 * @see #unsetQueryFirstCount()
	 * @see #getQueryFirstCount()
	 * @see #setQueryFirstCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetQueryFirstCount();

	/**
	 * Returns the value of the '<em><b>Query Next Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Next Count</em>' containment reference.
	 * @see #isSetQueryNextCount()
	 * @see #unsetQueryNextCount()
	 * @see #setQueryNextCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_QueryNextCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='QueryNextCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getQueryNextCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getQueryNextCount <em>Query Next Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Next Count</em>' containment reference.
	 * @see #isSetQueryNextCount()
	 * @see #unsetQueryNextCount()
	 * @see #getQueryNextCount()
	 * @generated
	 */
	void setQueryNextCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getQueryNextCount <em>Query Next Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQueryNextCount()
	 * @see #getQueryNextCount()
	 * @see #setQueryNextCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetQueryNextCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getQueryNextCount <em>Query Next Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Query Next Count</em>' containment reference is set.
	 * @see #unsetQueryNextCount()
	 * @see #getQueryNextCount()
	 * @see #setQueryNextCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetQueryNextCount();

	/**
	 * Returns the value of the '<em><b>Register Nodes Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Nodes Count</em>' containment reference.
	 * @see #isSetRegisterNodesCount()
	 * @see #unsetRegisterNodesCount()
	 * @see #setRegisterNodesCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_RegisterNodesCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RegisterNodesCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getRegisterNodesCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getRegisterNodesCount <em>Register Nodes Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Nodes Count</em>' containment reference.
	 * @see #isSetRegisterNodesCount()
	 * @see #unsetRegisterNodesCount()
	 * @see #getRegisterNodesCount()
	 * @generated
	 */
	void setRegisterNodesCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getRegisterNodesCount <em>Register Nodes Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegisterNodesCount()
	 * @see #getRegisterNodesCount()
	 * @see #setRegisterNodesCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetRegisterNodesCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getRegisterNodesCount <em>Register Nodes Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Register Nodes Count</em>' containment reference is set.
	 * @see #unsetRegisterNodesCount()
	 * @see #getRegisterNodesCount()
	 * @see #setRegisterNodesCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetRegisterNodesCount();

	/**
	 * Returns the value of the '<em><b>Unregister Nodes Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unregister Nodes Count</em>' containment reference.
	 * @see #isSetUnregisterNodesCount()
	 * @see #unsetUnregisterNodesCount()
	 * @see #setUnregisterNodesCount(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getSessionDiagnosticsDataType_UnregisterNodesCount()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='UnregisterNodesCount' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getUnregisterNodesCount();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getUnregisterNodesCount <em>Unregister Nodes Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unregister Nodes Count</em>' containment reference.
	 * @see #isSetUnregisterNodesCount()
	 * @see #unsetUnregisterNodesCount()
	 * @see #getUnregisterNodesCount()
	 * @generated
	 */
	void setUnregisterNodesCount(ServiceCounterDataType value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getUnregisterNodesCount <em>Unregister Nodes Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnregisterNodesCount()
	 * @see #getUnregisterNodesCount()
	 * @see #setUnregisterNodesCount(ServiceCounterDataType)
	 * @generated
	 */
	void unsetUnregisterNodesCount();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType#getUnregisterNodesCount <em>Unregister Nodes Count</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unregister Nodes Count</em>' containment reference is set.
	 * @see #unsetUnregisterNodesCount()
	 * @see #getUnregisterNodesCount()
	 * @see #setUnregisterNodesCount(ServiceCounterDataType)
	 * @generated
	 */
	boolean isSetUnregisterNodesCount();

} // SessionDiagnosticsDataType
