/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAccessLevelExType <em>Access Level Ex Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAccessLevelType <em>Access Level Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getActivateSessionRequest <em>Activate Session Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getActivateSessionResponse <em>Activate Session Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesItem <em>Add Nodes Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesRequest <em>Add Nodes Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesResponse <em>Add Nodes Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesResult <em>Add Nodes Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddReferencesItem <em>Add References Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddReferencesRequest <em>Add References Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddReferencesResponse <em>Add References Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAggregateConfiguration <em>Aggregate Configuration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAggregateFilter <em>Aggregate Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAggregateFilterResult <em>Aggregate Filter Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAliasNameDataType <em>Alias Name Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAnonymousIdentityToken <em>Anonymous Identity Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getApplicationDescription <em>Application Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getApplicationInstanceCertificate <em>Application Instance Certificate</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getApplicationType <em>Application Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAttributeOperand <em>Attribute Operand</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAttributeWriteMask <em>Attribute Write Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAudioDataType <em>Audio Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAxisInformation <em>Axis Information</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAxisScaleEnumeration <em>Axis Scale Enumeration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBitFieldMaskDataType <em>Bit Field Mask Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerConnectionTransportDataType <em>Broker Connection Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerDataSetReaderTransportDataType <em>Broker Data Set Reader Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerDataSetWriterTransportDataType <em>Broker Data Set Writer Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerTransportQualityOfService <em>Broker Transport Quality Of Service</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerWriterGroupTransportDataType <em>Broker Writer Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseDescription <em>Browse Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseDirection <em>Browse Direction</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseNextRequest <em>Browse Next Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseNextResponse <em>Browse Next Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowsePath <em>Browse Path</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowsePathResult <em>Browse Path Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowsePathTarget <em>Browse Path Target</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseRequest <em>Browse Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseResponse <em>Browse Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseResult <em>Browse Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseResultMask <em>Browse Result Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBuildInfo <em>Build Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getByte <em>Byte</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getByteString <em>Byte String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallMethodRequest <em>Call Method Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallMethodResult <em>Call Method Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallRequest <em>Call Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallResponse <em>Call Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCancelRequest <em>Cancel Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCancelResponse <em>Cancel Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCartesianCoordinates <em>Cartesian Coordinates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getChannelSecurityToken <em>Channel Security Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSecureChannelRequest <em>Close Secure Channel Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSecureChannelResponse <em>Close Secure Channel Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSessionRequest <em>Close Session Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSessionResponse <em>Close Session Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getComplexNumberType <em>Complex Number Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getConfigurationVersionDataType <em>Configuration Version Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getConnectionTransportDataType <em>Connection Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilter <em>Content Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilterElement <em>Content Filter Element</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilterElementResult <em>Content Filter Element Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilterResult <em>Content Filter Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContinuationPoint <em>Continuation Point</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCounter <em>Counter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateMonitoredItemsRequest <em>Create Monitored Items Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateMonitoredItemsResponse <em>Create Monitored Items Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSessionRequest <em>Create Session Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSessionResponse <em>Create Session Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSubscriptionRequest <em>Create Subscription Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSubscriptionResponse <em>Create Subscription Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCurrencyUnitType <em>Currency Unit Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataChangeFilter <em>Data Change Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataChangeNotification <em>Data Change Notification</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataChangeTrigger <em>Data Change Trigger</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDatagramConnectionTransportDataType <em>Datagram Connection Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDatagramWriterGroupTransportDataType <em>Datagram Writer Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetFieldContentMask <em>Data Set Field Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetFieldFlags <em>Data Set Field Flags</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetMetaDataType <em>Data Set Meta Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetOrderingType <em>Data Set Ordering Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetReaderDataType <em>Data Set Reader Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetReaderMessageDataType <em>Data Set Reader Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetReaderTransportDataType <em>Data Set Reader Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetWriterDataType <em>Data Set Writer Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetWriterMessageDataType <em>Data Set Writer Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetWriterTransportDataType <em>Data Set Writer Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeAttributes <em>Data Type Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeDefinition <em>Data Type Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeDescription <em>Data Type Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeNode <em>Data Type Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeSchemaHeader <em>Data Type Schema Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataValue <em>Data Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDate <em>Date</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDateString <em>Date String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeadbandType <em>Deadband Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDecimalDataType <em>Decimal Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDecimalString <em>Decimal String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteAtTimeDetails <em>Delete At Time Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteEventDetails <em>Delete Event Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteMonitoredItemsRequest <em>Delete Monitored Items Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteMonitoredItemsResponse <em>Delete Monitored Items Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteNodesItem <em>Delete Nodes Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteNodesRequest <em>Delete Nodes Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteNodesResponse <em>Delete Nodes Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteRawModifiedDetails <em>Delete Raw Modified Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteReferencesItem <em>Delete References Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteReferencesRequest <em>Delete References Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteReferencesResponse <em>Delete References Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteSubscriptionsRequest <em>Delete Subscriptions Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteSubscriptionsResponse <em>Delete Subscriptions Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDiagnosticInfo <em>Diagnostic Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDiagnosticsLevel <em>Diagnostics Level</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDiscoveryConfiguration <em>Discovery Configuration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDouble <em>Double</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDoubleComplexNumberType <em>Double Complex Number Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDurationString <em>Duration String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getElementOperand <em>Element Operand</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointConfiguration <em>Endpoint Configuration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointDescription <em>Endpoint Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointType <em>Endpoint Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointUrlListDataType <em>Endpoint Url List Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumDefinition <em>Enum Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumDescription <em>Enum Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumField <em>Enum Field</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumValueType <em>Enum Value Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEUInformation <em>EU Information</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventFieldList <em>Event Field List</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventFilter <em>Event Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventFilterResult <em>Event Filter Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventNotificationList <em>Event Notification List</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventNotifierType <em>Event Notifier Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getExceptionDeviationFormat <em>Exception Deviation Format</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getExpandedNodeId <em>Expanded Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getExtensionObject <em>Extension Object</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFieldMetaData <em>Field Meta Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFieldTargetDataType <em>Field Target Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFilterOperand <em>Filter Operand</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFilterOperator <em>Filter Operator</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersOnNetworkRequest <em>Find Servers On Network Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersOnNetworkResponse <em>Find Servers On Network Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersRequest <em>Find Servers Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersResponse <em>Find Servers Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFloat <em>Float</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGenericAttributes <em>Generic Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGenericAttributeValue <em>Generic Attribute Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGetEndpointsRequest <em>Get Endpoints Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGetEndpointsResponse <em>Get Endpoints Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGuid <em>Guid</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryData <em>History Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryEvent <em>History Event</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryEventFieldList <em>History Event Field List</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryModifiedData <em>History Modified Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadDetails <em>History Read Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadRequest <em>History Read Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadResponse <em>History Read Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadResult <em>History Read Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadValueId <em>History Read Value Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateDetails <em>History Update Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateRequest <em>History Update Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateResponse <em>History Update Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateResult <em>History Update Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateType <em>History Update Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIdentityCriteriaType <em>Identity Criteria Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIdentityMappingRuleType <em>Identity Mapping Rule Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIdType <em>Id Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getImageBMP <em>Image BMP</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getImageGIF <em>Image GIF</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getImageJPG <em>Image JPG</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getImagePNG <em>Image PNG</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIndex <em>Index</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInstanceNode <em>Instance Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInt16 <em>Int16</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInt32 <em>Int32</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInt64 <em>Int64</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIntegerId <em>Integer Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInvokeServiceRequest <em>Invoke Service Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInvokeServiceResponse <em>Invoke Service Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIssuedIdentityToken <em>Issued Identity Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonDataSetMessageContentMask <em>Json Data Set Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonDataSetReaderMessageDataType <em>Json Data Set Reader Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonDataSetWriterMessageDataType <em>Json Data Set Writer Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonNetworkMessageContentMask <em>Json Network Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonWriterGroupMessageDataType <em>Json Writer Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getKeyValuePair <em>Key Value Pair</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAddNodesItem <em>List Of Add Nodes Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAddNodesResult <em>List Of Add Nodes Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAddReferencesItem <em>List Of Add References Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAliasNameDataType <em>List Of Alias Name Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfApplicationDescription <em>List Of Application Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfArgument <em>List Of Argument</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBoolean <em>List Of Boolean</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerConnectionTransportDataType <em>List Of Broker Connection Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerDataSetReaderTransportDataType <em>List Of Broker Data Set Reader Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerDataSetWriterTransportDataType <em>List Of Broker Data Set Writer Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerTransportQualityOfService <em>List Of Broker Transport Quality Of Service</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerWriterGroupTransportDataType <em>List Of Broker Writer Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowseDescription <em>List Of Browse Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowsePath <em>List Of Browse Path</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowsePathResult <em>List Of Browse Path Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowsePathTarget <em>List Of Browse Path Target</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowseResult <em>List Of Browse Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfByte <em>List Of Byte</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfByteString <em>List Of Byte String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCallMethodRequest <em>List Of Call Method Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCallMethodResult <em>List Of Call Method Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCartesianCoordinates <em>List Of Cartesian Coordinates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfConfigurationVersionDataType <em>List Of Configuration Version Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfConnectionTransportDataType <em>List Of Connection Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfContentFilter <em>List Of Content Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfContentFilterElement <em>List Of Content Filter Element</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfContentFilterElementResult <em>List Of Content Filter Element Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCurrencyUnitType <em>List Of Currency Unit Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDatagramConnectionTransportDataType <em>List Of Datagram Connection Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDatagramWriterGroupTransportDataType <em>List Of Datagram Writer Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetFieldContentMask <em>List Of Data Set Field Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetMetaDataType <em>List Of Data Set Meta Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetOrderingType <em>List Of Data Set Ordering Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetReaderDataType <em>List Of Data Set Reader Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetReaderMessageDataType <em>List Of Data Set Reader Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetReaderTransportDataType <em>List Of Data Set Reader Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetWriterDataType <em>List Of Data Set Writer Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetWriterMessageDataType <em>List Of Data Set Writer Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetWriterTransportDataType <em>List Of Data Set Writer Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataTypeDefinition <em>List Of Data Type Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataTypeDescription <em>List Of Data Type Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataTypeSchemaHeader <em>List Of Data Type Schema Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataValue <em>List Of Data Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDateTime <em>List Of Date Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDeleteNodesItem <em>List Of Delete Nodes Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDeleteReferencesItem <em>List Of Delete References Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDiagnosticInfo <em>List Of Diagnostic Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDiagnosticsLevel <em>List Of Diagnostics Level</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDouble <em>List Of Double</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointConfiguration <em>List Of Endpoint Configuration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointDescription <em>List Of Endpoint Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointType <em>List Of Endpoint Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointUrlListDataType <em>List Of Endpoint Url List Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumDefinition <em>List Of Enum Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumDescription <em>List Of Enum Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumField <em>List Of Enum Field</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumValueType <em>List Of Enum Value Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEventFieldList <em>List Of Event Field List</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfExpandedNodeId <em>List Of Expanded Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfExtensionObject <em>List Of Extension Object</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFieldMetaData <em>List Of Field Meta Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFieldTargetDataType <em>List Of Field Target Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFloat <em>List Of Float</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFrame <em>List Of Frame</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfGenericAttributeValue <em>List Of Generic Attribute Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfGuid <em>List Of Guid</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryEventFieldList <em>List Of History Event Field List</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryReadResult <em>List Of History Read Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryReadValueId <em>List Of History Read Value Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryUpdateResult <em>List Of History Update Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfIdentityCriteriaType <em>List Of Identity Criteria Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfIdentityMappingRuleType <em>List Of Identity Mapping Rule Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfIdType <em>List Of Id Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfInt16 <em>List Of Int16</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfInt32 <em>List Of Int32</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfInt64 <em>List Of Int64</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonDataSetMessageContentMask <em>List Of Json Data Set Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonDataSetReaderMessageDataType <em>List Of Json Data Set Reader Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonDataSetWriterMessageDataType <em>List Of Json Data Set Writer Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonNetworkMessageContentMask <em>List Of Json Network Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonWriterGroupMessageDataType <em>List Of Json Writer Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfKeyValuePair <em>List Of Key Value Pair</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfLocalizedText <em>List Of Localized Text</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfModelChangeStructureDataType <em>List Of Model Change Structure Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfModificationInfo <em>List Of Modification Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemCreateRequest <em>List Of Monitored Item Create Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemCreateResult <em>List Of Monitored Item Create Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemModifyRequest <em>List Of Monitored Item Modify Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemModifyResult <em>List Of Monitored Item Modify Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemNotification <em>List Of Monitored Item Notification</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNetworkAddressDataType <em>List Of Network Address Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNetworkAddressUrlDataType <em>List Of Network Address Url Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNetworkGroupDataType <em>List Of Network Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNode <em>List Of Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNodeId <em>List Of Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNodeReference <em>List Of Node Reference</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNodeTypeDescription <em>List Of Node Type Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOpenFileMode <em>List Of Open File Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOptionSet <em>List Of Option Set</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOrientation <em>List Of Orientation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOverrideValueHandling <em>List Of Override Value Handling</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfParsingResult <em>List Of Parsing Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedDataItemsDataType <em>List Of Published Data Items Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedDataSetDataType <em>List Of Published Data Set Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedDataSetSourceDataType <em>List Of Published Data Set Source Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedEventsDataType <em>List Of Published Events Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedVariableDataType <em>List Of Published Variable Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubConfigurationDataType <em>List Of Pub Sub Configuration Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubConnectionDataType <em>List Of Pub Sub Connection Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubDiagnosticsCounterClassification <em>List Of Pub Sub Diagnostics Counter Classification</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubGroupDataType <em>List Of Pub Sub Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubState <em>List Of Pub Sub State</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfQualifiedName <em>List Of Qualified Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfQueryDataDescription <em>List Of Query Data Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfQueryDataSet <em>List Of Query Data Set</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRationalNumber <em>List Of Rational Number</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReaderGroupDataType <em>List Of Reader Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReaderGroupMessageDataType <em>List Of Reader Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReaderGroupTransportDataType <em>List Of Reader Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReadValueId <em>List Of Read Value Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRedundantServerDataType <em>List Of Redundant Server Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReferenceDescription <em>List Of Reference Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReferenceNode <em>List Of Reference Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRegisteredServer <em>List Of Registered Server</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRelativePathElement <em>List Of Relative Path Element</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRolePermissionType <em>List Of Role Permission Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSamplingIntervalDiagnosticsDataType <em>List Of Sampling Interval Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSByte <em>List Of SByte</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSemanticChangeStructureDataType <em>List Of Semantic Change Structure Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfServerOnNetwork <em>List Of Server On Network</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSessionDiagnosticsDataType <em>List Of Session Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSessionSecurityDiagnosticsDataType <em>List Of Session Security Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSignedSoftwareCertificate <em>List Of Signed Software Certificate</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSimpleAttributeOperand <em>List Of Simple Attribute Operand</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSimpleTypeDescription <em>List Of Simple Type Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStatusCode <em>List Of Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStatusResult <em>List Of Status Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfString <em>List Of String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStructureDefinition <em>List Of Structure Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStructureDescription <em>List Of Structure Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStructureField <em>List Of Structure Field</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscribedDataSetDataType <em>List Of Subscribed Data Set Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscribedDataSetMirrorDataType <em>List Of Subscribed Data Set Mirror Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscriptionAcknowledgement <em>List Of Subscription Acknowledgement</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscriptionDiagnosticsDataType <em>List Of Subscription Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTargetVariablesDataType <em>List Of Target Variables Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDCartesianCoordinates <em>List Of Three DCartesian Coordinates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDFrame <em>List Of Three DFrame</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDOrientation <em>List Of Three DOrientation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDVector <em>List Of Three DVector</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTimeZoneDataType <em>List Of Time Zone Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTransferResult <em>List Of Transfer Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTrustListDataType <em>List Of Trust List Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUABinaryFileDataType <em>List Of UA Binary File Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpDataSetMessageContentMask <em>List Of Uadp Data Set Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpDataSetReaderMessageDataType <em>List Of Uadp Data Set Reader Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpDataSetWriterMessageDataType <em>List Of Uadp Data Set Writer Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpNetworkMessageContentMask <em>List Of Uadp Network Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpWriterGroupMessageDataType <em>List Of Uadp Writer Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUInt16 <em>List Of UInt16</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUInt32 <em>List Of UInt32</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUInt64 <em>List Of UInt64</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUnion <em>List Of Union</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUserTokenPolicy <em>List Of User Token Policy</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfVariant <em>List Of Variant</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfVector <em>List Of Vector</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriterGroupDataType <em>List Of Writer Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriterGroupMessageDataType <em>List Of Writer Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriterGroupTransportDataType <em>List Of Writer Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriteValue <em>List Of Write Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfXmlElement <em>List Of Xml Element</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getLiteralOperand <em>Literal Operand</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getLocaleId <em>Locale Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getLocalizedText <em>Localized Text</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMdnsDiscoveryConfiguration <em>Mdns Discovery Configuration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMessageSecurityMode <em>Message Security Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMethodAttributes <em>Method Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMethodNode <em>Method Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModelChangeStructureDataType <em>Model Change Structure Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModelChangeStructureVerbMask <em>Model Change Structure Verb Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModificationInfo <em>Modification Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifyMonitoredItemsRequest <em>Modify Monitored Items Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifyMonitoredItemsResponse <em>Modify Monitored Items Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifySubscriptionRequest <em>Modify Subscription Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifySubscriptionResponse <em>Modify Subscription Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemCreateRequest <em>Monitored Item Create Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemCreateResult <em>Monitored Item Create Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemModifyRequest <em>Monitored Item Modify Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemModifyResult <em>Monitored Item Modify Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemNotification <em>Monitored Item Notification</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringFilter <em>Monitoring Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringFilterResult <em>Monitoring Filter Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringMode <em>Monitoring Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringParameters <em>Monitoring Parameters</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNetworkAddressDataType <em>Network Address Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNetworkAddressUrlDataType <em>Network Address Url Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNetworkGroupDataType <em>Network Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNode <em>Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeAttributes <em>Node Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeAttributesMask <em>Node Attributes Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeClass <em>Node Class</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeReference <em>Node Reference</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeTypeDescription <em>Node Type Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNormalizedString <em>Normalized String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNotificationData <em>Notification Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNotificationMessage <em>Notification Message</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNumericRange <em>Numeric Range</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectAttributes <em>Object Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectNode <em>Object Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectTypeAttributes <em>Object Type Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectTypeNode <em>Object Type Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOpenFileMode <em>Open File Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOpenSecureChannelRequest <em>Open Secure Channel Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOpenSecureChannelResponse <em>Open Secure Channel Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOptionSet <em>Option Set</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOverrideValueHandling <em>Override Value Handling</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getParsingResult <em>Parsing Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPerformUpdateType <em>Perform Update Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPermissionType <em>Permission Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getProgramDiagnostic2DataType <em>Program Diagnostic2 Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getProgramDiagnosticDataType <em>Program Diagnostic Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedDataItemsDataType <em>Published Data Items Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedDataSetDataType <em>Published Data Set Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedDataSetSourceDataType <em>Published Data Set Source Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedEventsDataType <em>Published Events Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedVariableDataType <em>Published Variable Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishRequest <em>Publish Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishResponse <em>Publish Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubConfigurationDataType <em>Pub Sub Configuration Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubConnectionDataType <em>Pub Sub Connection Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubDiagnosticsCounterClassification <em>Pub Sub Diagnostics Counter Classification</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubGroupDataType <em>Pub Sub Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubState <em>Pub Sub State</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryDataDescription <em>Query Data Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryDataSet <em>Query Data Set</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryFirstRequest <em>Query First Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryFirstResponse <em>Query First Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryNextRequest <em>Query Next Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryNextResponse <em>Query Next Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRange <em>Range</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRationalNumber <em>Rational Number</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadAnnotationDataDetails <em>Read Annotation Data Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadAtTimeDetails <em>Read At Time Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReaderGroupDataType <em>Reader Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReaderGroupMessageDataType <em>Reader Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReaderGroupTransportDataType <em>Reader Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadEventDetails <em>Read Event Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadProcessedDetails <em>Read Processed Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadRawModifiedDetails <em>Read Raw Modified Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadRequest <em>Read Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadResponse <em>Read Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadValueId <em>Read Value Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRedundancySupport <em>Redundancy Support</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRedundantServerDataType <em>Redundant Server Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceDescription <em>Reference Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceNode <em>Reference Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceTypeAttributes <em>Reference Type Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceTypeNode <em>Reference Type Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisteredServer <em>Registered Server</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterNodesRequest <em>Register Nodes Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterNodesResponse <em>Register Nodes Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServer2Request <em>Register Server2 Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServer2Response <em>Register Server2 Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServerRequest <em>Register Server Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServerResponse <em>Register Server Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRelativePath <em>Relative Path</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRelativePathElement <em>Relative Path Element</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRepublishRequest <em>Republish Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRepublishResponse <em>Republish Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRolePermissionType <em>Role Permission Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRsaEncryptedSecret <em>Rsa Encrypted Secret</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSamplingIntervalDiagnosticsDataType <em>Sampling Interval Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSByte <em>SByte</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSecurityTokenRequestType <em>Security Token Request Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSemanticChangeStructureDataType <em>Semantic Change Structure Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerDiagnosticsSummaryDataType <em>Server Diagnostics Summary Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerOnNetwork <em>Server On Network</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerState <em>Server State</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerStatusDataType <em>Server Status Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServiceCounterDataType <em>Service Counter Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServiceFault <em>Service Fault</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionAuthenticationToken <em>Session Authentication Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionDiagnosticsDataType <em>Session Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionlessInvokeRequestType <em>Sessionless Invoke Request Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionlessInvokeResponseType <em>Sessionless Invoke Response Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionSecurityDiagnosticsDataType <em>Session Security Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetMonitoringModeRequest <em>Set Monitoring Mode Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetMonitoringModeResponse <em>Set Monitoring Mode Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetPublishingModeRequest <em>Set Publishing Mode Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetPublishingModeResponse <em>Set Publishing Mode Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetTriggeringRequest <em>Set Triggering Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetTriggeringResponse <em>Set Triggering Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSignatureData <em>Signature Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSignedSoftwareCertificate <em>Signed Software Certificate</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSimpleAttributeOperand <em>Simple Attribute Operand</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSimpleTypeDescription <em>Simple Type Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStatusChangeNotification <em>Status Change Notification</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStatusResult <em>Status Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getString <em>String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureDefinition <em>Structure Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureDescription <em>Structure Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureField <em>Structure Field</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureType <em>Structure Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscribedDataSetDataType <em>Subscribed Data Set Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscribedDataSetMirrorDataType <em>Subscribed Data Set Mirror Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscriptionAcknowledgement <em>Subscription Acknowledgement</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscriptionDiagnosticsDataType <em>Subscription Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTargetVariablesDataType <em>Target Variables Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDCartesianCoordinates <em>Three DCartesian Coordinates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDFrame <em>Three DFrame</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDOrientation <em>Three DOrientation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDVector <em>Three DVector</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTime <em>Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTimestampsToReturn <em>Timestamps To Return</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTimeString <em>Time String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTimeZoneDataType <em>Time Zone Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTransferResult <em>Transfer Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTransferSubscriptionsRequest <em>Transfer Subscriptions Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTransferSubscriptionsResponse <em>Transfer Subscriptions Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTranslateBrowsePathsToNodeIdsRequest <em>Translate Browse Paths To Node Ids Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTranslateBrowsePathsToNodeIdsResponse <em>Translate Browse Paths To Node Ids Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTrustListDataType <em>Trust List Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTrustListMasks <em>Trust List Masks</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTypeNode <em>Type Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUABinaryFileDataType <em>UA Binary File Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpDataSetMessageContentMask <em>Uadp Data Set Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpDataSetReaderMessageDataType <em>Uadp Data Set Reader Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpDataSetWriterMessageDataType <em>Uadp Data Set Writer Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpNetworkMessageContentMask <em>Uadp Network Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpWriterGroupMessageDataType <em>Uadp Writer Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUInt16 <em>UInt16</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUInt32 <em>UInt32</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUInt64 <em>UInt64</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUnion <em>Union</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUnregisterNodesRequest <em>Unregister Nodes Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUnregisterNodesResponse <em>Unregister Nodes Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUpdateDataDetails <em>Update Data Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUpdateEventDetails <em>Update Event Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUpdateStructureDataDetails <em>Update Structure Data Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserIdentityToken <em>User Identity Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserNameIdentityToken <em>User Name Identity Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserTokenPolicy <em>User Token Policy</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserTokenType <em>User Token Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUtcTime <em>Utc Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableAttributes <em>Variable Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableNode <em>Variable Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableTypeAttributes <em>Variable Type Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableTypeNode <em>Variable Type Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVector <em>Vector</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVersionTime <em>Version Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getViewAttributes <em>View Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getViewDescription <em>View Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getViewNode <em>View Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriteRequest <em>Write Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriteResponse <em>Write Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriterGroupDataType <em>Writer Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriterGroupMessageDataType <em>Writer Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriterGroupTransportDataType <em>Writer Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriteValue <em>Write Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getX509IdentityToken <em>X509 Identity Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getXVType <em>XV Type</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Access Level Ex Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Level Ex Type</em>' attribute.
	 * @see #setAccessLevelExType(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AccessLevelExType()
	 * @model unique="false" dataType="org.opcfoundation.ua._2008._02.types.AccessLevelExType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AccessLevelExType' namespace='##targetNamespace'"
	 * @generated
	 */
	long getAccessLevelExType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAccessLevelExType <em>Access Level Ex Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Level Ex Type</em>' attribute.
	 * @see #getAccessLevelExType()
	 * @generated
	 */
	void setAccessLevelExType(long value);

	/**
	 * Returns the value of the '<em><b>Access Level Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Level Type</em>' attribute.
	 * @see #setAccessLevelType(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AccessLevelType()
	 * @model unique="false" dataType="org.opcfoundation.ua._2008._02.types.AccessLevelType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AccessLevelType' namespace='##targetNamespace'"
	 * @generated
	 */
	short getAccessLevelType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAccessLevelType <em>Access Level Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Level Type</em>' attribute.
	 * @see #getAccessLevelType()
	 * @generated
	 */
	void setAccessLevelType(short value);

	/**
	 * Returns the value of the '<em><b>Activate Session Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activate Session Request</em>' containment reference.
	 * @see #setActivateSessionRequest(ActivateSessionRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ActivateSessionRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActivateSessionRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ActivateSessionRequest getActivateSessionRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getActivateSessionRequest <em>Activate Session Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activate Session Request</em>' containment reference.
	 * @see #getActivateSessionRequest()
	 * @generated
	 */
	void setActivateSessionRequest(ActivateSessionRequest value);

	/**
	 * Returns the value of the '<em><b>Activate Session Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activate Session Response</em>' containment reference.
	 * @see #setActivateSessionResponse(ActivateSessionResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ActivateSessionResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActivateSessionResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ActivateSessionResponse getActivateSessionResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getActivateSessionResponse <em>Activate Session Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activate Session Response</em>' containment reference.
	 * @see #getActivateSessionResponse()
	 * @generated
	 */
	void setActivateSessionResponse(ActivateSessionResponse value);

	/**
	 * Returns the value of the '<em><b>Add Nodes Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Nodes Item</em>' containment reference.
	 * @see #setAddNodesItem(AddNodesItem)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AddNodesItem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddNodesItem' namespace='##targetNamespace'"
	 * @generated
	 */
	AddNodesItem getAddNodesItem();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesItem <em>Add Nodes Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Nodes Item</em>' containment reference.
	 * @see #getAddNodesItem()
	 * @generated
	 */
	void setAddNodesItem(AddNodesItem value);

	/**
	 * Returns the value of the '<em><b>Add Nodes Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Nodes Request</em>' containment reference.
	 * @see #setAddNodesRequest(AddNodesRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AddNodesRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddNodesRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	AddNodesRequest getAddNodesRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesRequest <em>Add Nodes Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Nodes Request</em>' containment reference.
	 * @see #getAddNodesRequest()
	 * @generated
	 */
	void setAddNodesRequest(AddNodesRequest value);

	/**
	 * Returns the value of the '<em><b>Add Nodes Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Nodes Response</em>' containment reference.
	 * @see #setAddNodesResponse(AddNodesResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AddNodesResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddNodesResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AddNodesResponse getAddNodesResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesResponse <em>Add Nodes Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Nodes Response</em>' containment reference.
	 * @see #getAddNodesResponse()
	 * @generated
	 */
	void setAddNodesResponse(AddNodesResponse value);

	/**
	 * Returns the value of the '<em><b>Add Nodes Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Nodes Result</em>' containment reference.
	 * @see #setAddNodesResult(AddNodesResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AddNodesResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddNodesResult' namespace='##targetNamespace'"
	 * @generated
	 */
	AddNodesResult getAddNodesResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesResult <em>Add Nodes Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Nodes Result</em>' containment reference.
	 * @see #getAddNodesResult()
	 * @generated
	 */
	void setAddNodesResult(AddNodesResult value);

	/**
	 * Returns the value of the '<em><b>Add References Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add References Item</em>' containment reference.
	 * @see #setAddReferencesItem(AddReferencesItem)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AddReferencesItem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddReferencesItem' namespace='##targetNamespace'"
	 * @generated
	 */
	AddReferencesItem getAddReferencesItem();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddReferencesItem <em>Add References Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add References Item</em>' containment reference.
	 * @see #getAddReferencesItem()
	 * @generated
	 */
	void setAddReferencesItem(AddReferencesItem value);

	/**
	 * Returns the value of the '<em><b>Add References Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add References Request</em>' containment reference.
	 * @see #setAddReferencesRequest(AddReferencesRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AddReferencesRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddReferencesRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	AddReferencesRequest getAddReferencesRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddReferencesRequest <em>Add References Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add References Request</em>' containment reference.
	 * @see #getAddReferencesRequest()
	 * @generated
	 */
	void setAddReferencesRequest(AddReferencesRequest value);

	/**
	 * Returns the value of the '<em><b>Add References Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add References Response</em>' containment reference.
	 * @see #setAddReferencesResponse(AddReferencesResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AddReferencesResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddReferencesResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AddReferencesResponse getAddReferencesResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddReferencesResponse <em>Add References Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add References Response</em>' containment reference.
	 * @see #getAddReferencesResponse()
	 * @generated
	 */
	void setAddReferencesResponse(AddReferencesResponse value);

	/**
	 * Returns the value of the '<em><b>Aggregate Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Configuration</em>' containment reference.
	 * @see #setAggregateConfiguration(AggregateConfiguration)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AggregateConfiguration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AggregateConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	AggregateConfiguration getAggregateConfiguration();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAggregateConfiguration <em>Aggregate Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Configuration</em>' containment reference.
	 * @see #getAggregateConfiguration()
	 * @generated
	 */
	void setAggregateConfiguration(AggregateConfiguration value);

	/**
	 * Returns the value of the '<em><b>Aggregate Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Filter</em>' containment reference.
	 * @see #setAggregateFilter(AggregateFilter)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AggregateFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AggregateFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	AggregateFilter getAggregateFilter();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAggregateFilter <em>Aggregate Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Filter</em>' containment reference.
	 * @see #getAggregateFilter()
	 * @generated
	 */
	void setAggregateFilter(AggregateFilter value);

	/**
	 * Returns the value of the '<em><b>Aggregate Filter Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Filter Result</em>' containment reference.
	 * @see #setAggregateFilterResult(AggregateFilterResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AggregateFilterResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AggregateFilterResult' namespace='##targetNamespace'"
	 * @generated
	 */
	AggregateFilterResult getAggregateFilterResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAggregateFilterResult <em>Aggregate Filter Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Filter Result</em>' containment reference.
	 * @see #getAggregateFilterResult()
	 * @generated
	 */
	void setAggregateFilterResult(AggregateFilterResult value);

	/**
	 * Returns the value of the '<em><b>Alias Name Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Name Data Type</em>' containment reference.
	 * @see #setAliasNameDataType(AliasNameDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AliasNameDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AliasNameDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	AliasNameDataType getAliasNameDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAliasNameDataType <em>Alias Name Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias Name Data Type</em>' containment reference.
	 * @see #getAliasNameDataType()
	 * @generated
	 */
	void setAliasNameDataType(AliasNameDataType value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Annotation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Anonymous Identity Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Identity Token</em>' containment reference.
	 * @see #setAnonymousIdentityToken(AnonymousIdentityToken)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AnonymousIdentityToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AnonymousIdentityToken' namespace='##targetNamespace'"
	 * @generated
	 */
	AnonymousIdentityToken getAnonymousIdentityToken();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAnonymousIdentityToken <em>Anonymous Identity Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous Identity Token</em>' containment reference.
	 * @see #getAnonymousIdentityToken()
	 * @generated
	 */
	void setAnonymousIdentityToken(AnonymousIdentityToken value);

	/**
	 * Returns the value of the '<em><b>Application Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Description</em>' containment reference.
	 * @see #setApplicationDescription(ApplicationDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ApplicationDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ApplicationDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicationDescription getApplicationDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getApplicationDescription <em>Application Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Description</em>' containment reference.
	 * @see #getApplicationDescription()
	 * @generated
	 */
	void setApplicationDescription(ApplicationDescription value);

	/**
	 * Returns the value of the '<em><b>Application Instance Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Instance Certificate</em>' attribute.
	 * @see #setApplicationInstanceCertificate(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ApplicationInstanceCertificate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ApplicationInstanceCertificate' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getApplicationInstanceCertificate();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getApplicationInstanceCertificate <em>Application Instance Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Instance Certificate</em>' attribute.
	 * @see #getApplicationInstanceCertificate()
	 * @generated
	 */
	void setApplicationInstanceCertificate(byte[] value);

	/**
	 * Returns the value of the '<em><b>Application Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.ApplicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.ApplicationType
	 * @see #setApplicationType(ApplicationType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ApplicationType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ApplicationType' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicationType getApplicationType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getApplicationType <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.ApplicationType
	 * @see #getApplicationType()
	 * @generated
	 */
	void setApplicationType(ApplicationType value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(Argument)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Argument()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Argument' namespace='##targetNamespace'"
	 * @generated
	 */
	Argument getArgument();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(Argument value);

	/**
	 * Returns the value of the '<em><b>Attribute Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Operand</em>' containment reference.
	 * @see #setAttributeOperand(AttributeOperand)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AttributeOperand()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AttributeOperand' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeOperand getAttributeOperand();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAttributeOperand <em>Attribute Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Operand</em>' containment reference.
	 * @see #getAttributeOperand()
	 * @generated
	 */
	void setAttributeOperand(AttributeOperand value);

	/**
	 * Returns the value of the '<em><b>Attribute Write Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Write Mask</em>' attribute.
	 * @see #setAttributeWriteMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AttributeWriteMask()
	 * @model unique="false" dataType="org.opcfoundation.ua._2008._02.types.AttributeWriteMask" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AttributeWriteMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getAttributeWriteMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAttributeWriteMask <em>Attribute Write Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Write Mask</em>' attribute.
	 * @see #getAttributeWriteMask()
	 * @generated
	 */
	void setAttributeWriteMask(long value);

	/**
	 * Returns the value of the '<em><b>Audio Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audio Data Type</em>' attribute.
	 * @see #setAudioDataType(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AudioDataType()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AudioDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getAudioDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAudioDataType <em>Audio Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audio Data Type</em>' attribute.
	 * @see #getAudioDataType()
	 * @generated
	 */
	void setAudioDataType(byte[] value);

	/**
	 * Returns the value of the '<em><b>Axis Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Information</em>' containment reference.
	 * @see #setAxisInformation(AxisInformation)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AxisInformation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AxisInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	AxisInformation getAxisInformation();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAxisInformation <em>Axis Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Information</em>' containment reference.
	 * @see #getAxisInformation()
	 * @generated
	 */
	void setAxisInformation(AxisInformation value);

	/**
	 * Returns the value of the '<em><b>Axis Scale Enumeration</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.AxisScaleEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Scale Enumeration</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.AxisScaleEnumeration
	 * @see #setAxisScaleEnumeration(AxisScaleEnumeration)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_AxisScaleEnumeration()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AxisScaleEnumeration' namespace='##targetNamespace'"
	 * @generated
	 */
	AxisScaleEnumeration getAxisScaleEnumeration();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAxisScaleEnumeration <em>Axis Scale Enumeration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Scale Enumeration</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.AxisScaleEnumeration
	 * @see #getAxisScaleEnumeration()
	 * @generated
	 */
	void setAxisScaleEnumeration(AxisScaleEnumeration value);

	/**
	 * Returns the value of the '<em><b>Bit Field Mask Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Field Mask Data Type</em>' attribute.
	 * @see #setBitFieldMaskDataType(BigInteger)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_BitFieldMaskDataType()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BitFieldMaskDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getBitFieldMaskDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBitFieldMaskDataType <em>Bit Field Mask Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Field Mask Data Type</em>' attribute.
	 * @see #getBitFieldMaskDataType()
	 * @generated
	 */
	void setBitFieldMaskDataType(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean</em>' attribute.
	 * @see #setBoolean(Boolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Boolean()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Boolean' namespace='##targetNamespace'"
	 * @generated
	 */
	Boolean getBoolean();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBoolean <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean</em>' attribute.
	 * @see #getBoolean()
	 * @generated
	 */
	void setBoolean(Boolean value);

	/**
	 * Returns the value of the '<em><b>Broker Connection Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker Connection Transport Data Type</em>' containment reference.
	 * @see #setBrokerConnectionTransportDataType(BrokerConnectionTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_BrokerConnectionTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BrokerConnectionTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	BrokerConnectionTransportDataType getBrokerConnectionTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerConnectionTransportDataType <em>Broker Connection Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Broker Connection Transport Data Type</em>' containment reference.
	 * @see #getBrokerConnectionTransportDataType()
	 * @generated
	 */
	void setBrokerConnectionTransportDataType(BrokerConnectionTransportDataType value);

	/**
	 * Returns the value of the '<em><b>Broker Data Set Reader Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker Data Set Reader Transport Data Type</em>' containment reference.
	 * @see #setBrokerDataSetReaderTransportDataType(BrokerDataSetReaderTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_BrokerDataSetReaderTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BrokerDataSetReaderTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	BrokerDataSetReaderTransportDataType getBrokerDataSetReaderTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerDataSetReaderTransportDataType <em>Broker Data Set Reader Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Broker Data Set Reader Transport Data Type</em>' containment reference.
	 * @see #getBrokerDataSetReaderTransportDataType()
	 * @generated
	 */
	void setBrokerDataSetReaderTransportDataType(BrokerDataSetReaderTransportDataType value);

	/**
	 * Returns the value of the '<em><b>Broker Data Set Writer Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker Data Set Writer Transport Data Type</em>' containment reference.
	 * @see #setBrokerDataSetWriterTransportDataType(BrokerDataSetWriterTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_BrokerDataSetWriterTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BrokerDataSetWriterTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	BrokerDataSetWriterTransportDataType getBrokerDataSetWriterTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerDataSetWriterTransportDataType <em>Broker Data Set Writer Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Broker Data Set Writer Transport Data Type</em>' containment reference.
	 * @see #getBrokerDataSetWriterTransportDataType()
	 * @generated
	 */
	void setBrokerDataSetWriterTransportDataType(BrokerDataSetWriterTransportDataType value);

	/**
	 * Returns the value of the '<em><b>Broker Transport Quality Of Service</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.BrokerTransportQualityOfService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker Transport Quality Of Service</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.BrokerTransportQualityOfService
	 * @see #setBrokerTransportQualityOfService(BrokerTransportQualityOfService)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_BrokerTransportQualityOfService()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BrokerTransportQualityOfService' namespace='##targetNamespace'"
	 * @generated
	 */
	BrokerTransportQualityOfService getBrokerTransportQualityOfService();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerTransportQualityOfService <em>Broker Transport Quality Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Broker Transport Quality Of Service</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.BrokerTransportQualityOfService
	 * @see #getBrokerTransportQualityOfService()
	 * @generated
	 */
	void setBrokerTransportQualityOfService(BrokerTransportQualityOfService value);

	/**
	 * Returns the value of the '<em><b>Broker Writer Group Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker Writer Group Transport Data Type</em>' containment reference.
	 * @see #setBrokerWriterGroupTransportDataType(BrokerWriterGroupTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_BrokerWriterGroupTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BrokerWriterGroupTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	BrokerWriterGroupTransportDataType getBrokerWriterGroupTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerWriterGroupTransportDataType <em>Broker Writer Group Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Broker Writer Group Transport Data Type</em>' containment reference.
	 * @see #getBrokerWriterGroupTransportDataType()
	 * @generated
	 */
	void setBrokerWriterGroupTransportDataType(BrokerWriterGroupTransportDataType value);

	/**
	 * Returns the value of the '<em><b>Browse Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Description</em>' containment reference.
	 * @see #setBrowseDescription(BrowseDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_BrowseDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BrowseDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	BrowseDescription getBrowseDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseDescription <em>Browse Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Description</em>' containment reference.
	 * @see #getBrowseDescription()
	 * @generated
	 */
	void setBrowseDescription(BrowseDescription value);

	/**
	 * Returns the value of the '<em><b>Browse Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.BrowseDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Direction</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.BrowseDirection
	 * @see #setBrowseDirection(BrowseDirection)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_BrowseDirection()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BrowseDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	BrowseDirection getBrowseDirection();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseDirection <em>Browse Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Direction</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.BrowseDirection
	 * @see #getBrowseDirection()
	 * @generated
	 */
	void setBrowseDirection(BrowseDirection value);

	/**
	 * Returns the value of the '<em><b>Browse Next Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Next Request</em>' containment reference.
	 * @see #setBrowseNextRequest(BrowseNextRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_BrowseNextRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BrowseNextRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	BrowseNextRequest getBrowseNextRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseNextRequest <em>Browse Next Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Next Request</em>' containment reference.
	 * @see #getBrowseNextRequest()
	 * @generated
	 */
	void setBrowseNextRequest(BrowseNextRequest value);

	/**
	 * Returns the value of the '<em><b>Browse Next Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Next Response</em>' containment reference.
	 * @see #setBrowseNextResponse(BrowseNextResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_BrowseNextResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BrowseNextResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	BrowseNextResponse getBrowseNextResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseNextResponse <em>Browse Next Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Next Response</em>' containment reference.
	 * @see #getBrowseNextResponse()
	 * @generated
	 */
	void setBrowseNextResponse(BrowseNextResponse value);

	/**
	 * Returns the value of the '<em><b>Browse Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Path</em>' containment reference.
	 * @see #setBrowsePath(BrowsePath)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_BrowsePath()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BrowsePath' namespace='##targetNamespace'"
	 * @generated
	 */
	BrowsePath getBrowsePath();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowsePath <em>Browse Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Path</em>' containment reference.
	 * @see #getBrowsePath()
	 * @generated
	 */
	void setBrowsePath(BrowsePath value);

	/**
	 * Returns the value of the '<em><b>Browse Path Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Path Result</em>' containment reference.
	 * @see #setBrowsePathResult(BrowsePathResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_BrowsePathResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BrowsePathResult' namespace='##targetNamespace'"
	 * @generated
	 */
	BrowsePathResult getBrowsePathResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowsePathResult <em>Browse Path Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Path Result</em>' containment reference.
	 * @see #getBrowsePathResult()
	 * @generated
	 */
	void setBrowsePathResult(BrowsePathResult value);

	/**
	 * Returns the value of the '<em><b>Browse Path Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Path Target</em>' containment reference.
	 * @see #setBrowsePathTarget(BrowsePathTarget)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_BrowsePathTarget()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BrowsePathTarget' namespace='##targetNamespace'"
	 * @generated
	 */
	BrowsePathTarget getBrowsePathTarget();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowsePathTarget <em>Browse Path Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Path Target</em>' containment reference.
	 * @see #getBrowsePathTarget()
	 * @generated
	 */
	void setBrowsePathTarget(BrowsePathTarget value);

	/**
	 * Returns the value of the '<em><b>Browse Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Request</em>' containment reference.
	 * @see #setBrowseRequest(BrowseRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_BrowseRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BrowseRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	BrowseRequest getBrowseRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseRequest <em>Browse Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Request</em>' containment reference.
	 * @see #getBrowseRequest()
	 * @generated
	 */
	void setBrowseRequest(BrowseRequest value);

	/**
	 * Returns the value of the '<em><b>Browse Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Response</em>' containment reference.
	 * @see #setBrowseResponse(BrowseResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_BrowseResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BrowseResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	BrowseResponse getBrowseResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseResponse <em>Browse Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Response</em>' containment reference.
	 * @see #getBrowseResponse()
	 * @generated
	 */
	void setBrowseResponse(BrowseResponse value);

	/**
	 * Returns the value of the '<em><b>Browse Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Result</em>' containment reference.
	 * @see #setBrowseResult(BrowseResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_BrowseResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BrowseResult' namespace='##targetNamespace'"
	 * @generated
	 */
	BrowseResult getBrowseResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseResult <em>Browse Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Result</em>' containment reference.
	 * @see #getBrowseResult()
	 * @generated
	 */
	void setBrowseResult(BrowseResult value);

	/**
	 * Returns the value of the '<em><b>Browse Result Mask</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.BrowseResultMask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browse Result Mask</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.BrowseResultMask
	 * @see #setBrowseResultMask(BrowseResultMask)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_BrowseResultMask()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BrowseResultMask' namespace='##targetNamespace'"
	 * @generated
	 */
	BrowseResultMask getBrowseResultMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseResultMask <em>Browse Result Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browse Result Mask</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.BrowseResultMask
	 * @see #getBrowseResultMask()
	 * @generated
	 */
	void setBrowseResultMask(BrowseResultMask value);

	/**
	 * Returns the value of the '<em><b>Build Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Info</em>' containment reference.
	 * @see #setBuildInfo(BuildInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_BuildInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BuildInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	BuildInfo getBuildInfo();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBuildInfo <em>Build Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Info</em>' containment reference.
	 * @see #getBuildInfo()
	 * @generated
	 */
	void setBuildInfo(BuildInfo value);

	/**
	 * Returns the value of the '<em><b>Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte</em>' attribute.
	 * @see #setByte(Short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Byte()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByteObject" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Byte' namespace='##targetNamespace'"
	 * @generated
	 */
	Short getByte();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getByte <em>Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte</em>' attribute.
	 * @see #getByte()
	 * @generated
	 */
	void setByte(Short value);

	/**
	 * Returns the value of the '<em><b>Byte String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte String</em>' attribute.
	 * @see #setByteString(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ByteString()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ByteString' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getByteString();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getByteString <em>Byte String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte String</em>' attribute.
	 * @see #getByteString()
	 * @generated
	 */
	void setByteString(byte[] value);

	/**
	 * Returns the value of the '<em><b>Call Method Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Method Request</em>' containment reference.
	 * @see #setCallMethodRequest(CallMethodRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_CallMethodRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CallMethodRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	CallMethodRequest getCallMethodRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallMethodRequest <em>Call Method Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Method Request</em>' containment reference.
	 * @see #getCallMethodRequest()
	 * @generated
	 */
	void setCallMethodRequest(CallMethodRequest value);

	/**
	 * Returns the value of the '<em><b>Call Method Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Method Result</em>' containment reference.
	 * @see #setCallMethodResult(CallMethodResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_CallMethodResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CallMethodResult' namespace='##targetNamespace'"
	 * @generated
	 */
	CallMethodResult getCallMethodResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallMethodResult <em>Call Method Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Method Result</em>' containment reference.
	 * @see #getCallMethodResult()
	 * @generated
	 */
	void setCallMethodResult(CallMethodResult value);

	/**
	 * Returns the value of the '<em><b>Call Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Request</em>' containment reference.
	 * @see #setCallRequest(CallRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_CallRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CallRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	CallRequest getCallRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallRequest <em>Call Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Request</em>' containment reference.
	 * @see #getCallRequest()
	 * @generated
	 */
	void setCallRequest(CallRequest value);

	/**
	 * Returns the value of the '<em><b>Call Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Response</em>' containment reference.
	 * @see #setCallResponse(CallResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_CallResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CallResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	CallResponse getCallResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallResponse <em>Call Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Response</em>' containment reference.
	 * @see #getCallResponse()
	 * @generated
	 */
	void setCallResponse(CallResponse value);

	/**
	 * Returns the value of the '<em><b>Cancel Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Request</em>' containment reference.
	 * @see #setCancelRequest(CancelRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_CancelRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CancelRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	CancelRequest getCancelRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCancelRequest <em>Cancel Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Request</em>' containment reference.
	 * @see #getCancelRequest()
	 * @generated
	 */
	void setCancelRequest(CancelRequest value);

	/**
	 * Returns the value of the '<em><b>Cancel Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Response</em>' containment reference.
	 * @see #setCancelResponse(CancelResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_CancelResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CancelResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	CancelResponse getCancelResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCancelResponse <em>Cancel Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Response</em>' containment reference.
	 * @see #getCancelResponse()
	 * @generated
	 */
	void setCancelResponse(CancelResponse value);

	/**
	 * Returns the value of the '<em><b>Cartesian Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartesian Coordinates</em>' containment reference.
	 * @see #setCartesianCoordinates(CartesianCoordinates)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_CartesianCoordinates()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CartesianCoordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	CartesianCoordinates getCartesianCoordinates();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCartesianCoordinates <em>Cartesian Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian Coordinates</em>' containment reference.
	 * @see #getCartesianCoordinates()
	 * @generated
	 */
	void setCartesianCoordinates(CartesianCoordinates value);

	/**
	 * Returns the value of the '<em><b>Channel Security Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Security Token</em>' containment reference.
	 * @see #setChannelSecurityToken(ChannelSecurityToken)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ChannelSecurityToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChannelSecurityToken' namespace='##targetNamespace'"
	 * @generated
	 */
	ChannelSecurityToken getChannelSecurityToken();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getChannelSecurityToken <em>Channel Security Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Security Token</em>' containment reference.
	 * @see #getChannelSecurityToken()
	 * @generated
	 */
	void setChannelSecurityToken(ChannelSecurityToken value);

	/**
	 * Returns the value of the '<em><b>Close Secure Channel Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close Secure Channel Request</em>' containment reference.
	 * @see #setCloseSecureChannelRequest(CloseSecureChannelRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_CloseSecureChannelRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CloseSecureChannelRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	CloseSecureChannelRequest getCloseSecureChannelRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSecureChannelRequest <em>Close Secure Channel Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close Secure Channel Request</em>' containment reference.
	 * @see #getCloseSecureChannelRequest()
	 * @generated
	 */
	void setCloseSecureChannelRequest(CloseSecureChannelRequest value);

	/**
	 * Returns the value of the '<em><b>Close Secure Channel Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close Secure Channel Response</em>' containment reference.
	 * @see #setCloseSecureChannelResponse(CloseSecureChannelResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_CloseSecureChannelResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CloseSecureChannelResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	CloseSecureChannelResponse getCloseSecureChannelResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSecureChannelResponse <em>Close Secure Channel Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close Secure Channel Response</em>' containment reference.
	 * @see #getCloseSecureChannelResponse()
	 * @generated
	 */
	void setCloseSecureChannelResponse(CloseSecureChannelResponse value);

	/**
	 * Returns the value of the '<em><b>Close Session Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close Session Request</em>' containment reference.
	 * @see #setCloseSessionRequest(CloseSessionRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_CloseSessionRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CloseSessionRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	CloseSessionRequest getCloseSessionRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSessionRequest <em>Close Session Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close Session Request</em>' containment reference.
	 * @see #getCloseSessionRequest()
	 * @generated
	 */
	void setCloseSessionRequest(CloseSessionRequest value);

	/**
	 * Returns the value of the '<em><b>Close Session Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close Session Response</em>' containment reference.
	 * @see #setCloseSessionResponse(CloseSessionResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_CloseSessionResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CloseSessionResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	CloseSessionResponse getCloseSessionResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSessionResponse <em>Close Session Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close Session Response</em>' containment reference.
	 * @see #getCloseSessionResponse()
	 * @generated
	 */
	void setCloseSessionResponse(CloseSessionResponse value);

	/**
	 * Returns the value of the '<em><b>Complex Number Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Number Type</em>' containment reference.
	 * @see #setComplexNumberType(ComplexNumberType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ComplexNumberType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ComplexNumberType' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexNumberType getComplexNumberType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getComplexNumberType <em>Complex Number Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Number Type</em>' containment reference.
	 * @see #getComplexNumberType()
	 * @generated
	 */
	void setComplexNumberType(ComplexNumberType value);

	/**
	 * Returns the value of the '<em><b>Configuration Version Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Version Data Type</em>' containment reference.
	 * @see #setConfigurationVersionDataType(ConfigurationVersionDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ConfigurationVersionDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConfigurationVersionDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfigurationVersionDataType getConfigurationVersionDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getConfigurationVersionDataType <em>Configuration Version Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Version Data Type</em>' containment reference.
	 * @see #getConfigurationVersionDataType()
	 * @generated
	 */
	void setConfigurationVersionDataType(ConfigurationVersionDataType value);

	/**
	 * Returns the value of the '<em><b>Connection Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Transport Data Type</em>' containment reference.
	 * @see #setConnectionTransportDataType(ConnectionTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ConnectionTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConnectionTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionTransportDataType getConnectionTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getConnectionTransportDataType <em>Connection Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Transport Data Type</em>' containment reference.
	 * @see #getConnectionTransportDataType()
	 * @generated
	 */
	void setConnectionTransportDataType(ConnectionTransportDataType value);

	/**
	 * Returns the value of the '<em><b>Content Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Filter</em>' containment reference.
	 * @see #setContentFilter(ContentFilter)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ContentFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContentFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentFilter getContentFilter();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilter <em>Content Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Filter</em>' containment reference.
	 * @see #getContentFilter()
	 * @generated
	 */
	void setContentFilter(ContentFilter value);

	/**
	 * Returns the value of the '<em><b>Content Filter Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Filter Element</em>' containment reference.
	 * @see #setContentFilterElement(ContentFilterElement)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ContentFilterElement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContentFilterElement' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentFilterElement getContentFilterElement();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilterElement <em>Content Filter Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Filter Element</em>' containment reference.
	 * @see #getContentFilterElement()
	 * @generated
	 */
	void setContentFilterElement(ContentFilterElement value);

	/**
	 * Returns the value of the '<em><b>Content Filter Element Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Filter Element Result</em>' containment reference.
	 * @see #setContentFilterElementResult(ContentFilterElementResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ContentFilterElementResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContentFilterElementResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentFilterElementResult getContentFilterElementResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilterElementResult <em>Content Filter Element Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Filter Element Result</em>' containment reference.
	 * @see #getContentFilterElementResult()
	 * @generated
	 */
	void setContentFilterElementResult(ContentFilterElementResult value);

	/**
	 * Returns the value of the '<em><b>Content Filter Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Filter Result</em>' containment reference.
	 * @see #setContentFilterResult(ContentFilterResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ContentFilterResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContentFilterResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentFilterResult getContentFilterResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilterResult <em>Content Filter Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Filter Result</em>' containment reference.
	 * @see #getContentFilterResult()
	 * @generated
	 */
	void setContentFilterResult(ContentFilterResult value);

	/**
	 * Returns the value of the '<em><b>Continuation Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continuation Point</em>' attribute.
	 * @see #setContinuationPoint(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ContinuationPoint()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContinuationPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getContinuationPoint();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContinuationPoint <em>Continuation Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuation Point</em>' attribute.
	 * @see #getContinuationPoint()
	 * @generated
	 */
	void setContinuationPoint(byte[] value);

	/**
	 * Returns the value of the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' attribute.
	 * @see #setCounter(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Counter()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Counter' namespace='##targetNamespace'"
	 * @generated
	 */
	long getCounter();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCounter <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' attribute.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(long value);

	/**
	 * Returns the value of the '<em><b>Create Monitored Items Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Monitored Items Request</em>' containment reference.
	 * @see #setCreateMonitoredItemsRequest(CreateMonitoredItemsRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_CreateMonitoredItemsRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CreateMonitoredItemsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	CreateMonitoredItemsRequest getCreateMonitoredItemsRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateMonitoredItemsRequest <em>Create Monitored Items Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Monitored Items Request</em>' containment reference.
	 * @see #getCreateMonitoredItemsRequest()
	 * @generated
	 */
	void setCreateMonitoredItemsRequest(CreateMonitoredItemsRequest value);

	/**
	 * Returns the value of the '<em><b>Create Monitored Items Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Monitored Items Response</em>' containment reference.
	 * @see #setCreateMonitoredItemsResponse(CreateMonitoredItemsResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_CreateMonitoredItemsResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CreateMonitoredItemsResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	CreateMonitoredItemsResponse getCreateMonitoredItemsResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateMonitoredItemsResponse <em>Create Monitored Items Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Monitored Items Response</em>' containment reference.
	 * @see #getCreateMonitoredItemsResponse()
	 * @generated
	 */
	void setCreateMonitoredItemsResponse(CreateMonitoredItemsResponse value);

	/**
	 * Returns the value of the '<em><b>Create Session Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Session Request</em>' containment reference.
	 * @see #setCreateSessionRequest(CreateSessionRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_CreateSessionRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CreateSessionRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	CreateSessionRequest getCreateSessionRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSessionRequest <em>Create Session Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Session Request</em>' containment reference.
	 * @see #getCreateSessionRequest()
	 * @generated
	 */
	void setCreateSessionRequest(CreateSessionRequest value);

	/**
	 * Returns the value of the '<em><b>Create Session Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Session Response</em>' containment reference.
	 * @see #setCreateSessionResponse(CreateSessionResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_CreateSessionResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CreateSessionResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	CreateSessionResponse getCreateSessionResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSessionResponse <em>Create Session Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Session Response</em>' containment reference.
	 * @see #getCreateSessionResponse()
	 * @generated
	 */
	void setCreateSessionResponse(CreateSessionResponse value);

	/**
	 * Returns the value of the '<em><b>Create Subscription Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Subscription Request</em>' containment reference.
	 * @see #setCreateSubscriptionRequest(CreateSubscriptionRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_CreateSubscriptionRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CreateSubscriptionRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	CreateSubscriptionRequest getCreateSubscriptionRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSubscriptionRequest <em>Create Subscription Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Subscription Request</em>' containment reference.
	 * @see #getCreateSubscriptionRequest()
	 * @generated
	 */
	void setCreateSubscriptionRequest(CreateSubscriptionRequest value);

	/**
	 * Returns the value of the '<em><b>Create Subscription Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Subscription Response</em>' containment reference.
	 * @see #setCreateSubscriptionResponse(CreateSubscriptionResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_CreateSubscriptionResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CreateSubscriptionResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	CreateSubscriptionResponse getCreateSubscriptionResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSubscriptionResponse <em>Create Subscription Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Subscription Response</em>' containment reference.
	 * @see #getCreateSubscriptionResponse()
	 * @generated
	 */
	void setCreateSubscriptionResponse(CreateSubscriptionResponse value);

	/**
	 * Returns the value of the '<em><b>Currency Unit Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Unit Type</em>' containment reference.
	 * @see #setCurrencyUnitType(CurrencyUnitType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_CurrencyUnitType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CurrencyUnitType' namespace='##targetNamespace'"
	 * @generated
	 */
	CurrencyUnitType getCurrencyUnitType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCurrencyUnitType <em>Currency Unit Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Unit Type</em>' containment reference.
	 * @see #getCurrencyUnitType()
	 * @generated
	 */
	void setCurrencyUnitType(CurrencyUnitType value);

	/**
	 * Returns the value of the '<em><b>Data Change Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Change Filter</em>' containment reference.
	 * @see #setDataChangeFilter(DataChangeFilter)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataChangeFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataChangeFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	DataChangeFilter getDataChangeFilter();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataChangeFilter <em>Data Change Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Change Filter</em>' containment reference.
	 * @see #getDataChangeFilter()
	 * @generated
	 */
	void setDataChangeFilter(DataChangeFilter value);

	/**
	 * Returns the value of the '<em><b>Data Change Notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Change Notification</em>' containment reference.
	 * @see #setDataChangeNotification(DataChangeNotification)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataChangeNotification()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataChangeNotification' namespace='##targetNamespace'"
	 * @generated
	 */
	DataChangeNotification getDataChangeNotification();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataChangeNotification <em>Data Change Notification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Change Notification</em>' containment reference.
	 * @see #getDataChangeNotification()
	 * @generated
	 */
	void setDataChangeNotification(DataChangeNotification value);

	/**
	 * Returns the value of the '<em><b>Data Change Trigger</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.DataChangeTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Change Trigger</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.DataChangeTrigger
	 * @see #setDataChangeTrigger(DataChangeTrigger)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataChangeTrigger()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataChangeTrigger' namespace='##targetNamespace'"
	 * @generated
	 */
	DataChangeTrigger getDataChangeTrigger();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataChangeTrigger <em>Data Change Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Change Trigger</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.DataChangeTrigger
	 * @see #getDataChangeTrigger()
	 * @generated
	 */
	void setDataChangeTrigger(DataChangeTrigger value);

	/**
	 * Returns the value of the '<em><b>Datagram Connection Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datagram Connection Transport Data Type</em>' containment reference.
	 * @see #setDatagramConnectionTransportDataType(DatagramConnectionTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DatagramConnectionTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DatagramConnectionTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	DatagramConnectionTransportDataType getDatagramConnectionTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDatagramConnectionTransportDataType <em>Datagram Connection Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datagram Connection Transport Data Type</em>' containment reference.
	 * @see #getDatagramConnectionTransportDataType()
	 * @generated
	 */
	void setDatagramConnectionTransportDataType(DatagramConnectionTransportDataType value);

	/**
	 * Returns the value of the '<em><b>Datagram Writer Group Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datagram Writer Group Transport Data Type</em>' containment reference.
	 * @see #setDatagramWriterGroupTransportDataType(DatagramWriterGroupTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DatagramWriterGroupTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DatagramWriterGroupTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	DatagramWriterGroupTransportDataType getDatagramWriterGroupTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDatagramWriterGroupTransportDataType <em>Datagram Writer Group Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datagram Writer Group Transport Data Type</em>' containment reference.
	 * @see #getDatagramWriterGroupTransportDataType()
	 * @generated
	 */
	void setDatagramWriterGroupTransportDataType(DatagramWriterGroupTransportDataType value);

	/**
	 * Returns the value of the '<em><b>Data Set Field Content Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Field Content Mask</em>' attribute.
	 * @see #setDataSetFieldContentMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataSetFieldContentMask()
	 * @model unique="false" dataType="org.opcfoundation.ua._2008._02.types.DataSetFieldContentMask" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataSetFieldContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getDataSetFieldContentMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetFieldContentMask <em>Data Set Field Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Field Content Mask</em>' attribute.
	 * @see #getDataSetFieldContentMask()
	 * @generated
	 */
	void setDataSetFieldContentMask(long value);

	/**
	 * Returns the value of the '<em><b>Data Set Field Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Field Flags</em>' attribute.
	 * @see #setDataSetFieldFlags(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataSetFieldFlags()
	 * @model unique="false" dataType="org.opcfoundation.ua._2008._02.types.DataSetFieldFlags" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataSetFieldFlags' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDataSetFieldFlags();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetFieldFlags <em>Data Set Field Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Field Flags</em>' attribute.
	 * @see #getDataSetFieldFlags()
	 * @generated
	 */
	void setDataSetFieldFlags(int value);

	/**
	 * Returns the value of the '<em><b>Data Set Meta Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Meta Data Type</em>' containment reference.
	 * @see #setDataSetMetaDataType(DataSetMetaDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataSetMetaDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataSetMetaDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	DataSetMetaDataType getDataSetMetaDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetMetaDataType <em>Data Set Meta Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Meta Data Type</em>' containment reference.
	 * @see #getDataSetMetaDataType()
	 * @generated
	 */
	void setDataSetMetaDataType(DataSetMetaDataType value);

	/**
	 * Returns the value of the '<em><b>Data Set Ordering Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.DataSetOrderingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Ordering Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.DataSetOrderingType
	 * @see #setDataSetOrderingType(DataSetOrderingType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataSetOrderingType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataSetOrderingType' namespace='##targetNamespace'"
	 * @generated
	 */
	DataSetOrderingType getDataSetOrderingType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetOrderingType <em>Data Set Ordering Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Ordering Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.DataSetOrderingType
	 * @see #getDataSetOrderingType()
	 * @generated
	 */
	void setDataSetOrderingType(DataSetOrderingType value);

	/**
	 * Returns the value of the '<em><b>Data Set Reader Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Reader Data Type</em>' containment reference.
	 * @see #setDataSetReaderDataType(DataSetReaderDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataSetReaderDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataSetReaderDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	DataSetReaderDataType getDataSetReaderDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetReaderDataType <em>Data Set Reader Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Reader Data Type</em>' containment reference.
	 * @see #getDataSetReaderDataType()
	 * @generated
	 */
	void setDataSetReaderDataType(DataSetReaderDataType value);

	/**
	 * Returns the value of the '<em><b>Data Set Reader Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Reader Message Data Type</em>' containment reference.
	 * @see #setDataSetReaderMessageDataType(DataSetReaderMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataSetReaderMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataSetReaderMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	DataSetReaderMessageDataType getDataSetReaderMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetReaderMessageDataType <em>Data Set Reader Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Reader Message Data Type</em>' containment reference.
	 * @see #getDataSetReaderMessageDataType()
	 * @generated
	 */
	void setDataSetReaderMessageDataType(DataSetReaderMessageDataType value);

	/**
	 * Returns the value of the '<em><b>Data Set Reader Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Reader Transport Data Type</em>' containment reference.
	 * @see #setDataSetReaderTransportDataType(DataSetReaderTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataSetReaderTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataSetReaderTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	DataSetReaderTransportDataType getDataSetReaderTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetReaderTransportDataType <em>Data Set Reader Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Reader Transport Data Type</em>' containment reference.
	 * @see #getDataSetReaderTransportDataType()
	 * @generated
	 */
	void setDataSetReaderTransportDataType(DataSetReaderTransportDataType value);

	/**
	 * Returns the value of the '<em><b>Data Set Writer Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Writer Data Type</em>' containment reference.
	 * @see #setDataSetWriterDataType(DataSetWriterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataSetWriterDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataSetWriterDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	DataSetWriterDataType getDataSetWriterDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetWriterDataType <em>Data Set Writer Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Writer Data Type</em>' containment reference.
	 * @see #getDataSetWriterDataType()
	 * @generated
	 */
	void setDataSetWriterDataType(DataSetWriterDataType value);

	/**
	 * Returns the value of the '<em><b>Data Set Writer Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Writer Message Data Type</em>' containment reference.
	 * @see #setDataSetWriterMessageDataType(DataSetWriterMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataSetWriterMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataSetWriterMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	DataSetWriterMessageDataType getDataSetWriterMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetWriterMessageDataType <em>Data Set Writer Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Writer Message Data Type</em>' containment reference.
	 * @see #getDataSetWriterMessageDataType()
	 * @generated
	 */
	void setDataSetWriterMessageDataType(DataSetWriterMessageDataType value);

	/**
	 * Returns the value of the '<em><b>Data Set Writer Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Writer Transport Data Type</em>' containment reference.
	 * @see #setDataSetWriterTransportDataType(DataSetWriterTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataSetWriterTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataSetWriterTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	DataSetWriterTransportDataType getDataSetWriterTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetWriterTransportDataType <em>Data Set Writer Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Writer Transport Data Type</em>' containment reference.
	 * @see #getDataSetWriterTransportDataType()
	 * @generated
	 */
	void setDataSetWriterTransportDataType(DataSetWriterTransportDataType value);

	/**
	 * Returns the value of the '<em><b>Data Type Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Attributes</em>' containment reference.
	 * @see #setDataTypeAttributes(DataTypeAttributes)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataTypeAttributes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataTypeAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	DataTypeAttributes getDataTypeAttributes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeAttributes <em>Data Type Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Attributes</em>' containment reference.
	 * @see #getDataTypeAttributes()
	 * @generated
	 */
	void setDataTypeAttributes(DataTypeAttributes value);

	/**
	 * Returns the value of the '<em><b>Data Type Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Definition</em>' containment reference.
	 * @see #setDataTypeDefinition(DataTypeDefinition)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataTypeDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataTypeDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	DataTypeDefinition getDataTypeDefinition();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeDefinition <em>Data Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Definition</em>' containment reference.
	 * @see #getDataTypeDefinition()
	 * @generated
	 */
	void setDataTypeDefinition(DataTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Data Type Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Description</em>' containment reference.
	 * @see #setDataTypeDescription(DataTypeDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataTypeDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataTypeDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	DataTypeDescription getDataTypeDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeDescription <em>Data Type Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Description</em>' containment reference.
	 * @see #getDataTypeDescription()
	 * @generated
	 */
	void setDataTypeDescription(DataTypeDescription value);

	/**
	 * Returns the value of the '<em><b>Data Type Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Node</em>' containment reference.
	 * @see #setDataTypeNode(DataTypeNode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataTypeNode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataTypeNode' namespace='##targetNamespace'"
	 * @generated
	 */
	DataTypeNode getDataTypeNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeNode <em>Data Type Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Node</em>' containment reference.
	 * @see #getDataTypeNode()
	 * @generated
	 */
	void setDataTypeNode(DataTypeNode value);

	/**
	 * Returns the value of the '<em><b>Data Type Schema Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Schema Header</em>' containment reference.
	 * @see #setDataTypeSchemaHeader(DataTypeSchemaHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataTypeSchemaHeader()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataTypeSchemaHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	DataTypeSchemaHeader getDataTypeSchemaHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeSchemaHeader <em>Data Type Schema Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Schema Header</em>' containment reference.
	 * @see #getDataTypeSchemaHeader()
	 * @generated
	 */
	void setDataTypeSchemaHeader(DataTypeSchemaHeader value);

	/**
	 * Returns the value of the '<em><b>Data Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Value</em>' containment reference.
	 * @see #setDataValue(DataValue)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DataValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataValue' namespace='##targetNamespace'"
	 * @generated
	 */
	DataValue getDataValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataValue <em>Data Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Value</em>' containment reference.
	 * @see #getDataValue()
	 * @generated
	 */
	void setDataValue(DataValue value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Date()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Date' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDate();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date String</em>' attribute.
	 * @see #setDateString(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DateString()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DateString' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDateString();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDateString <em>Date String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date String</em>' attribute.
	 * @see #getDateString()
	 * @generated
	 */
	void setDateString(String value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #setDateTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DateTime()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDateTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Deadband Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.DeadbandType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadband Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.DeadbandType
	 * @see #setDeadbandType(DeadbandType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DeadbandType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeadbandType' namespace='##targetNamespace'"
	 * @generated
	 */
	DeadbandType getDeadbandType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeadbandType <em>Deadband Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadband Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.DeadbandType
	 * @see #getDeadbandType()
	 * @generated
	 */
	void setDeadbandType(DeadbandType value);

	/**
	 * Returns the value of the '<em><b>Decimal Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Data Type</em>' containment reference.
	 * @see #setDecimalDataType(DecimalDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DecimalDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DecimalDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	DecimalDataType getDecimalDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDecimalDataType <em>Decimal Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Data Type</em>' containment reference.
	 * @see #getDecimalDataType()
	 * @generated
	 */
	void setDecimalDataType(DecimalDataType value);

	/**
	 * Returns the value of the '<em><b>Decimal String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal String</em>' attribute.
	 * @see #setDecimalString(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DecimalString()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DecimalString' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDecimalString();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDecimalString <em>Decimal String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal String</em>' attribute.
	 * @see #getDecimalString()
	 * @generated
	 */
	void setDecimalString(String value);

	/**
	 * Returns the value of the '<em><b>Delete At Time Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete At Time Details</em>' containment reference.
	 * @see #setDeleteAtTimeDetails(DeleteAtTimeDetails)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DeleteAtTimeDetails()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeleteAtTimeDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteAtTimeDetails getDeleteAtTimeDetails();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteAtTimeDetails <em>Delete At Time Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete At Time Details</em>' containment reference.
	 * @see #getDeleteAtTimeDetails()
	 * @generated
	 */
	void setDeleteAtTimeDetails(DeleteAtTimeDetails value);

	/**
	 * Returns the value of the '<em><b>Delete Event Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Event Details</em>' containment reference.
	 * @see #setDeleteEventDetails(DeleteEventDetails)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DeleteEventDetails()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeleteEventDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteEventDetails getDeleteEventDetails();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteEventDetails <em>Delete Event Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Event Details</em>' containment reference.
	 * @see #getDeleteEventDetails()
	 * @generated
	 */
	void setDeleteEventDetails(DeleteEventDetails value);

	/**
	 * Returns the value of the '<em><b>Delete Monitored Items Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Monitored Items Request</em>' containment reference.
	 * @see #setDeleteMonitoredItemsRequest(DeleteMonitoredItemsRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DeleteMonitoredItemsRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeleteMonitoredItemsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteMonitoredItemsRequest getDeleteMonitoredItemsRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteMonitoredItemsRequest <em>Delete Monitored Items Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Monitored Items Request</em>' containment reference.
	 * @see #getDeleteMonitoredItemsRequest()
	 * @generated
	 */
	void setDeleteMonitoredItemsRequest(DeleteMonitoredItemsRequest value);

	/**
	 * Returns the value of the '<em><b>Delete Monitored Items Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Monitored Items Response</em>' containment reference.
	 * @see #setDeleteMonitoredItemsResponse(DeleteMonitoredItemsResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DeleteMonitoredItemsResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeleteMonitoredItemsResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteMonitoredItemsResponse getDeleteMonitoredItemsResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteMonitoredItemsResponse <em>Delete Monitored Items Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Monitored Items Response</em>' containment reference.
	 * @see #getDeleteMonitoredItemsResponse()
	 * @generated
	 */
	void setDeleteMonitoredItemsResponse(DeleteMonitoredItemsResponse value);

	/**
	 * Returns the value of the '<em><b>Delete Nodes Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Nodes Item</em>' containment reference.
	 * @see #setDeleteNodesItem(DeleteNodesItem)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DeleteNodesItem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeleteNodesItem' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteNodesItem getDeleteNodesItem();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteNodesItem <em>Delete Nodes Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Nodes Item</em>' containment reference.
	 * @see #getDeleteNodesItem()
	 * @generated
	 */
	void setDeleteNodesItem(DeleteNodesItem value);

	/**
	 * Returns the value of the '<em><b>Delete Nodes Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Nodes Request</em>' containment reference.
	 * @see #setDeleteNodesRequest(DeleteNodesRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DeleteNodesRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeleteNodesRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteNodesRequest getDeleteNodesRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteNodesRequest <em>Delete Nodes Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Nodes Request</em>' containment reference.
	 * @see #getDeleteNodesRequest()
	 * @generated
	 */
	void setDeleteNodesRequest(DeleteNodesRequest value);

	/**
	 * Returns the value of the '<em><b>Delete Nodes Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Nodes Response</em>' containment reference.
	 * @see #setDeleteNodesResponse(DeleteNodesResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DeleteNodesResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeleteNodesResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteNodesResponse getDeleteNodesResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteNodesResponse <em>Delete Nodes Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Nodes Response</em>' containment reference.
	 * @see #getDeleteNodesResponse()
	 * @generated
	 */
	void setDeleteNodesResponse(DeleteNodesResponse value);

	/**
	 * Returns the value of the '<em><b>Delete Raw Modified Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Raw Modified Details</em>' containment reference.
	 * @see #setDeleteRawModifiedDetails(DeleteRawModifiedDetails)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DeleteRawModifiedDetails()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeleteRawModifiedDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteRawModifiedDetails getDeleteRawModifiedDetails();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteRawModifiedDetails <em>Delete Raw Modified Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Raw Modified Details</em>' containment reference.
	 * @see #getDeleteRawModifiedDetails()
	 * @generated
	 */
	void setDeleteRawModifiedDetails(DeleteRawModifiedDetails value);

	/**
	 * Returns the value of the '<em><b>Delete References Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete References Item</em>' containment reference.
	 * @see #setDeleteReferencesItem(DeleteReferencesItem)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DeleteReferencesItem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeleteReferencesItem' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteReferencesItem getDeleteReferencesItem();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteReferencesItem <em>Delete References Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete References Item</em>' containment reference.
	 * @see #getDeleteReferencesItem()
	 * @generated
	 */
	void setDeleteReferencesItem(DeleteReferencesItem value);

	/**
	 * Returns the value of the '<em><b>Delete References Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete References Request</em>' containment reference.
	 * @see #setDeleteReferencesRequest(DeleteReferencesRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DeleteReferencesRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeleteReferencesRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteReferencesRequest getDeleteReferencesRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteReferencesRequest <em>Delete References Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete References Request</em>' containment reference.
	 * @see #getDeleteReferencesRequest()
	 * @generated
	 */
	void setDeleteReferencesRequest(DeleteReferencesRequest value);

	/**
	 * Returns the value of the '<em><b>Delete References Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete References Response</em>' containment reference.
	 * @see #setDeleteReferencesResponse(DeleteReferencesResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DeleteReferencesResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeleteReferencesResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteReferencesResponse getDeleteReferencesResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteReferencesResponse <em>Delete References Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete References Response</em>' containment reference.
	 * @see #getDeleteReferencesResponse()
	 * @generated
	 */
	void setDeleteReferencesResponse(DeleteReferencesResponse value);

	/**
	 * Returns the value of the '<em><b>Delete Subscriptions Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Subscriptions Request</em>' containment reference.
	 * @see #setDeleteSubscriptionsRequest(DeleteSubscriptionsRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DeleteSubscriptionsRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeleteSubscriptionsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteSubscriptionsRequest getDeleteSubscriptionsRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteSubscriptionsRequest <em>Delete Subscriptions Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Subscriptions Request</em>' containment reference.
	 * @see #getDeleteSubscriptionsRequest()
	 * @generated
	 */
	void setDeleteSubscriptionsRequest(DeleteSubscriptionsRequest value);

	/**
	 * Returns the value of the '<em><b>Delete Subscriptions Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Subscriptions Response</em>' containment reference.
	 * @see #setDeleteSubscriptionsResponse(DeleteSubscriptionsResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DeleteSubscriptionsResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeleteSubscriptionsResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteSubscriptionsResponse getDeleteSubscriptionsResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteSubscriptionsResponse <em>Delete Subscriptions Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Subscriptions Response</em>' containment reference.
	 * @see #getDeleteSubscriptionsResponse()
	 * @generated
	 */
	void setDeleteSubscriptionsResponse(DeleteSubscriptionsResponse value);

	/**
	 * Returns the value of the '<em><b>Diagnostic Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostic Info</em>' containment reference.
	 * @see #setDiagnosticInfo(DiagnosticInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DiagnosticInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DiagnosticInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticInfo getDiagnosticInfo();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDiagnosticInfo <em>Diagnostic Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Info</em>' containment reference.
	 * @see #getDiagnosticInfo()
	 * @generated
	 */
	void setDiagnosticInfo(DiagnosticInfo value);

	/**
	 * Returns the value of the '<em><b>Diagnostics Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.DiagnosticsLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostics Level</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.DiagnosticsLevel
	 * @see #setDiagnosticsLevel(DiagnosticsLevel)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DiagnosticsLevel()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DiagnosticsLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticsLevel getDiagnosticsLevel();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDiagnosticsLevel <em>Diagnostics Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostics Level</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.DiagnosticsLevel
	 * @see #getDiagnosticsLevel()
	 * @generated
	 */
	void setDiagnosticsLevel(DiagnosticsLevel value);

	/**
	 * Returns the value of the '<em><b>Discovery Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovery Configuration</em>' containment reference.
	 * @see #setDiscoveryConfiguration(DiscoveryConfiguration)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DiscoveryConfiguration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DiscoveryConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	DiscoveryConfiguration getDiscoveryConfiguration();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDiscoveryConfiguration <em>Discovery Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovery Configuration</em>' containment reference.
	 * @see #getDiscoveryConfiguration()
	 * @generated
	 */
	void setDiscoveryConfiguration(DiscoveryConfiguration value);

	/**
	 * Returns the value of the '<em><b>Double</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double</em>' attribute.
	 * @see #setDouble(Double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Double()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DoubleObject" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Double' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getDouble();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDouble <em>Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double</em>' attribute.
	 * @see #getDouble()
	 * @generated
	 */
	void setDouble(Double value);

	/**
	 * Returns the value of the '<em><b>Double Complex Number Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double Complex Number Type</em>' containment reference.
	 * @see #setDoubleComplexNumberType(DoubleComplexNumberType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DoubleComplexNumberType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DoubleComplexNumberType' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleComplexNumberType getDoubleComplexNumberType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDoubleComplexNumberType <em>Double Complex Number Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double Complex Number Type</em>' containment reference.
	 * @see #getDoubleComplexNumberType()
	 * @generated
	 */
	void setDoubleComplexNumberType(DoubleComplexNumberType value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Duration()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Duration' namespace='##targetNamespace'"
	 * @generated
	 */
	double getDuration();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

	/**
	 * Returns the value of the '<em><b>Duration String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration String</em>' attribute.
	 * @see #setDurationString(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_DurationString()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DurationString' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDurationString();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDurationString <em>Duration String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration String</em>' attribute.
	 * @see #getDurationString()
	 * @generated
	 */
	void setDurationString(String value);

	/**
	 * Returns the value of the '<em><b>Element Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Operand</em>' containment reference.
	 * @see #setElementOperand(ElementOperand)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ElementOperand()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ElementOperand' namespace='##targetNamespace'"
	 * @generated
	 */
	ElementOperand getElementOperand();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getElementOperand <em>Element Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Operand</em>' containment reference.
	 * @see #getElementOperand()
	 * @generated
	 */
	void setElementOperand(ElementOperand value);

	/**
	 * Returns the value of the '<em><b>Endpoint Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Configuration</em>' containment reference.
	 * @see #setEndpointConfiguration(EndpointConfiguration)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_EndpointConfiguration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EndpointConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointConfiguration getEndpointConfiguration();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointConfiguration <em>Endpoint Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Configuration</em>' containment reference.
	 * @see #getEndpointConfiguration()
	 * @generated
	 */
	void setEndpointConfiguration(EndpointConfiguration value);

	/**
	 * Returns the value of the '<em><b>Endpoint Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Description</em>' containment reference.
	 * @see #setEndpointDescription(EndpointDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_EndpointDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EndpointDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointDescription getEndpointDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointDescription <em>Endpoint Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Description</em>' containment reference.
	 * @see #getEndpointDescription()
	 * @generated
	 */
	void setEndpointDescription(EndpointDescription value);

	/**
	 * Returns the value of the '<em><b>Endpoint Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Type</em>' containment reference.
	 * @see #setEndpointType(EndpointType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_EndpointType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EndpointType' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointType getEndpointType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointType <em>Endpoint Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Type</em>' containment reference.
	 * @see #getEndpointType()
	 * @generated
	 */
	void setEndpointType(EndpointType value);

	/**
	 * Returns the value of the '<em><b>Endpoint Url List Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Url List Data Type</em>' containment reference.
	 * @see #setEndpointUrlListDataType(EndpointUrlListDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_EndpointUrlListDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EndpointUrlListDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointUrlListDataType getEndpointUrlListDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointUrlListDataType <em>Endpoint Url List Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Url List Data Type</em>' containment reference.
	 * @see #getEndpointUrlListDataType()
	 * @generated
	 */
	void setEndpointUrlListDataType(EndpointUrlListDataType value);

	/**
	 * Returns the value of the '<em><b>Enum Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Definition</em>' containment reference.
	 * @see #setEnumDefinition(EnumDefinition)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_EnumDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EnumDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EnumDefinition getEnumDefinition();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumDefinition <em>Enum Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Definition</em>' containment reference.
	 * @see #getEnumDefinition()
	 * @generated
	 */
	void setEnumDefinition(EnumDefinition value);

	/**
	 * Returns the value of the '<em><b>Enum Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Description</em>' containment reference.
	 * @see #setEnumDescription(EnumDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_EnumDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EnumDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EnumDescription getEnumDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumDescription <em>Enum Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Description</em>' containment reference.
	 * @see #getEnumDescription()
	 * @generated
	 */
	void setEnumDescription(EnumDescription value);

	/**
	 * Returns the value of the '<em><b>Enum Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Field</em>' containment reference.
	 * @see #setEnumField(EnumField)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_EnumField()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EnumField' namespace='##targetNamespace'"
	 * @generated
	 */
	EnumField getEnumField();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumField <em>Enum Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Field</em>' containment reference.
	 * @see #getEnumField()
	 * @generated
	 */
	void setEnumField(EnumField value);

	/**
	 * Returns the value of the '<em><b>Enum Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Value Type</em>' containment reference.
	 * @see #setEnumValueType(EnumValueType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_EnumValueType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EnumValueType' namespace='##targetNamespace'"
	 * @generated
	 */
	EnumValueType getEnumValueType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumValueType <em>Enum Value Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Value Type</em>' containment reference.
	 * @see #getEnumValueType()
	 * @generated
	 */
	void setEnumValueType(EnumValueType value);

	/**
	 * Returns the value of the '<em><b>EU Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EU Information</em>' containment reference.
	 * @see #setEUInformation(EUInformation)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_EUInformation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EUInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EUInformation getEUInformation();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEUInformation <em>EU Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EU Information</em>' containment reference.
	 * @see #getEUInformation()
	 * @generated
	 */
	void setEUInformation(EUInformation value);

	/**
	 * Returns the value of the '<em><b>Event Field List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Field List</em>' containment reference.
	 * @see #setEventFieldList(EventFieldList)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_EventFieldList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EventFieldList' namespace='##targetNamespace'"
	 * @generated
	 */
	EventFieldList getEventFieldList();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventFieldList <em>Event Field List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Field List</em>' containment reference.
	 * @see #getEventFieldList()
	 * @generated
	 */
	void setEventFieldList(EventFieldList value);

	/**
	 * Returns the value of the '<em><b>Event Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Filter</em>' containment reference.
	 * @see #setEventFilter(EventFilter)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_EventFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EventFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EventFilter getEventFilter();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventFilter <em>Event Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Filter</em>' containment reference.
	 * @see #getEventFilter()
	 * @generated
	 */
	void setEventFilter(EventFilter value);

	/**
	 * Returns the value of the '<em><b>Event Filter Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Filter Result</em>' containment reference.
	 * @see #setEventFilterResult(EventFilterResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_EventFilterResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EventFilterResult' namespace='##targetNamespace'"
	 * @generated
	 */
	EventFilterResult getEventFilterResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventFilterResult <em>Event Filter Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Filter Result</em>' containment reference.
	 * @see #getEventFilterResult()
	 * @generated
	 */
	void setEventFilterResult(EventFilterResult value);

	/**
	 * Returns the value of the '<em><b>Event Notification List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Notification List</em>' containment reference.
	 * @see #setEventNotificationList(EventNotificationList)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_EventNotificationList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EventNotificationList' namespace='##targetNamespace'"
	 * @generated
	 */
	EventNotificationList getEventNotificationList();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventNotificationList <em>Event Notification List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Notification List</em>' containment reference.
	 * @see #getEventNotificationList()
	 * @generated
	 */
	void setEventNotificationList(EventNotificationList value);

	/**
	 * Returns the value of the '<em><b>Event Notifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Notifier Type</em>' attribute.
	 * @see #setEventNotifierType(short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_EventNotifierType()
	 * @model unique="false" dataType="org.opcfoundation.ua._2008._02.types.EventNotifierType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EventNotifierType' namespace='##targetNamespace'"
	 * @generated
	 */
	short getEventNotifierType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventNotifierType <em>Event Notifier Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Notifier Type</em>' attribute.
	 * @see #getEventNotifierType()
	 * @generated
	 */
	void setEventNotifierType(short value);

	/**
	 * Returns the value of the '<em><b>Exception Deviation Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.ExceptionDeviationFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Deviation Format</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.ExceptionDeviationFormat
	 * @see #setExceptionDeviationFormat(ExceptionDeviationFormat)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ExceptionDeviationFormat()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExceptionDeviationFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	ExceptionDeviationFormat getExceptionDeviationFormat();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getExceptionDeviationFormat <em>Exception Deviation Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Deviation Format</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.ExceptionDeviationFormat
	 * @see #getExceptionDeviationFormat()
	 * @generated
	 */
	void setExceptionDeviationFormat(ExceptionDeviationFormat value);

	/**
	 * Returns the value of the '<em><b>Expanded Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expanded Node Id</em>' containment reference.
	 * @see #setExpandedNodeId(ExpandedNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ExpandedNodeId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExpandedNodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpandedNodeId getExpandedNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getExpandedNodeId <em>Expanded Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expanded Node Id</em>' containment reference.
	 * @see #getExpandedNodeId()
	 * @generated
	 */
	void setExpandedNodeId(ExpandedNodeId value);

	/**
	 * Returns the value of the '<em><b>Extension Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Object</em>' containment reference.
	 * @see #setExtensionObject(ExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ExtensionObject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExtensionObject' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionObject getExtensionObject();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getExtensionObject <em>Extension Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Object</em>' containment reference.
	 * @see #getExtensionObject()
	 * @generated
	 */
	void setExtensionObject(ExtensionObject value);

	/**
	 * Returns the value of the '<em><b>Field Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Meta Data</em>' containment reference.
	 * @see #setFieldMetaData(FieldMetaData)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_FieldMetaData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FieldMetaData' namespace='##targetNamespace'"
	 * @generated
	 */
	FieldMetaData getFieldMetaData();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFieldMetaData <em>Field Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Meta Data</em>' containment reference.
	 * @see #getFieldMetaData()
	 * @generated
	 */
	void setFieldMetaData(FieldMetaData value);

	/**
	 * Returns the value of the '<em><b>Field Target Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Target Data Type</em>' containment reference.
	 * @see #setFieldTargetDataType(FieldTargetDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_FieldTargetDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FieldTargetDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	FieldTargetDataType getFieldTargetDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFieldTargetDataType <em>Field Target Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Target Data Type</em>' containment reference.
	 * @see #getFieldTargetDataType()
	 * @generated
	 */
	void setFieldTargetDataType(FieldTargetDataType value);

	/**
	 * Returns the value of the '<em><b>Filter Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Operand</em>' containment reference.
	 * @see #setFilterOperand(FilterOperand)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_FilterOperand()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FilterOperand' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterOperand getFilterOperand();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFilterOperand <em>Filter Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Operand</em>' containment reference.
	 * @see #getFilterOperand()
	 * @generated
	 */
	void setFilterOperand(FilterOperand value);

	/**
	 * Returns the value of the '<em><b>Filter Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.FilterOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Operator</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.FilterOperator
	 * @see #setFilterOperator(FilterOperator)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_FilterOperator()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FilterOperator' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterOperator getFilterOperator();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFilterOperator <em>Filter Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Operator</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.FilterOperator
	 * @see #getFilterOperator()
	 * @generated
	 */
	void setFilterOperator(FilterOperator value);

	/**
	 * Returns the value of the '<em><b>Find Servers On Network Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find Servers On Network Request</em>' containment reference.
	 * @see #setFindServersOnNetworkRequest(FindServersOnNetworkRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_FindServersOnNetworkRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FindServersOnNetworkRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	FindServersOnNetworkRequest getFindServersOnNetworkRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersOnNetworkRequest <em>Find Servers On Network Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find Servers On Network Request</em>' containment reference.
	 * @see #getFindServersOnNetworkRequest()
	 * @generated
	 */
	void setFindServersOnNetworkRequest(FindServersOnNetworkRequest value);

	/**
	 * Returns the value of the '<em><b>Find Servers On Network Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find Servers On Network Response</em>' containment reference.
	 * @see #setFindServersOnNetworkResponse(FindServersOnNetworkResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_FindServersOnNetworkResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FindServersOnNetworkResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	FindServersOnNetworkResponse getFindServersOnNetworkResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersOnNetworkResponse <em>Find Servers On Network Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find Servers On Network Response</em>' containment reference.
	 * @see #getFindServersOnNetworkResponse()
	 * @generated
	 */
	void setFindServersOnNetworkResponse(FindServersOnNetworkResponse value);

	/**
	 * Returns the value of the '<em><b>Find Servers Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find Servers Request</em>' containment reference.
	 * @see #setFindServersRequest(FindServersRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_FindServersRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FindServersRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	FindServersRequest getFindServersRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersRequest <em>Find Servers Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find Servers Request</em>' containment reference.
	 * @see #getFindServersRequest()
	 * @generated
	 */
	void setFindServersRequest(FindServersRequest value);

	/**
	 * Returns the value of the '<em><b>Find Servers Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find Servers Response</em>' containment reference.
	 * @see #setFindServersResponse(FindServersResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_FindServersResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FindServersResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	FindServersResponse getFindServersResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersResponse <em>Find Servers Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find Servers Response</em>' containment reference.
	 * @see #getFindServersResponse()
	 * @generated
	 */
	void setFindServersResponse(FindServersResponse value);

	/**
	 * Returns the value of the '<em><b>Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float</em>' attribute.
	 * @see #setFloat(Float)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Float()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.FloatObject" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Float' namespace='##targetNamespace'"
	 * @generated
	 */
	Float getFloat();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFloat <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float</em>' attribute.
	 * @see #getFloat()
	 * @generated
	 */
	void setFloat(Float value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' containment reference.
	 * @see #setFrame(Frame)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Frame()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Frame' namespace='##targetNamespace'"
	 * @generated
	 */
	Frame getFrame();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFrame <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' containment reference.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(Frame value);

	/**
	 * Returns the value of the '<em><b>Generic Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Attributes</em>' containment reference.
	 * @see #setGenericAttributes(GenericAttributes)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_GenericAttributes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GenericAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericAttributes getGenericAttributes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGenericAttributes <em>Generic Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Attributes</em>' containment reference.
	 * @see #getGenericAttributes()
	 * @generated
	 */
	void setGenericAttributes(GenericAttributes value);

	/**
	 * Returns the value of the '<em><b>Generic Attribute Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Attribute Value</em>' containment reference.
	 * @see #setGenericAttributeValue(GenericAttributeValue)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_GenericAttributeValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GenericAttributeValue' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericAttributeValue getGenericAttributeValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGenericAttributeValue <em>Generic Attribute Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Attribute Value</em>' containment reference.
	 * @see #getGenericAttributeValue()
	 * @generated
	 */
	void setGenericAttributeValue(GenericAttributeValue value);

	/**
	 * Returns the value of the '<em><b>Get Endpoints Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Endpoints Request</em>' containment reference.
	 * @see #setGetEndpointsRequest(GetEndpointsRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_GetEndpointsRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GetEndpointsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	GetEndpointsRequest getGetEndpointsRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGetEndpointsRequest <em>Get Endpoints Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Endpoints Request</em>' containment reference.
	 * @see #getGetEndpointsRequest()
	 * @generated
	 */
	void setGetEndpointsRequest(GetEndpointsRequest value);

	/**
	 * Returns the value of the '<em><b>Get Endpoints Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Endpoints Response</em>' containment reference.
	 * @see #setGetEndpointsResponse(GetEndpointsResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_GetEndpointsResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GetEndpointsResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetEndpointsResponse getGetEndpointsResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGetEndpointsResponse <em>Get Endpoints Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Endpoints Response</em>' containment reference.
	 * @see #getGetEndpointsResponse()
	 * @generated
	 */
	void setGetEndpointsResponse(GetEndpointsResponse value);

	/**
	 * Returns the value of the '<em><b>Guid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guid</em>' containment reference.
	 * @see #setGuid(Guid)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Guid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Guid' namespace='##targetNamespace'"
	 * @generated
	 */
	Guid getGuid();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGuid <em>Guid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guid</em>' containment reference.
	 * @see #getGuid()
	 * @generated
	 */
	void setGuid(Guid value);

	/**
	 * Returns the value of the '<em><b>History Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Data</em>' containment reference.
	 * @see #setHistoryData(HistoryData)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_HistoryData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HistoryData' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryData getHistoryData();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryData <em>History Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Data</em>' containment reference.
	 * @see #getHistoryData()
	 * @generated
	 */
	void setHistoryData(HistoryData value);

	/**
	 * Returns the value of the '<em><b>History Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Event</em>' containment reference.
	 * @see #setHistoryEvent(HistoryEvent)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_HistoryEvent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HistoryEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryEvent getHistoryEvent();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryEvent <em>History Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Event</em>' containment reference.
	 * @see #getHistoryEvent()
	 * @generated
	 */
	void setHistoryEvent(HistoryEvent value);

	/**
	 * Returns the value of the '<em><b>History Event Field List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Event Field List</em>' containment reference.
	 * @see #setHistoryEventFieldList(HistoryEventFieldList)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_HistoryEventFieldList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HistoryEventFieldList' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryEventFieldList getHistoryEventFieldList();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryEventFieldList <em>History Event Field List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Event Field List</em>' containment reference.
	 * @see #getHistoryEventFieldList()
	 * @generated
	 */
	void setHistoryEventFieldList(HistoryEventFieldList value);

	/**
	 * Returns the value of the '<em><b>History Modified Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Modified Data</em>' containment reference.
	 * @see #setHistoryModifiedData(HistoryModifiedData)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_HistoryModifiedData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HistoryModifiedData' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryModifiedData getHistoryModifiedData();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryModifiedData <em>History Modified Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Modified Data</em>' containment reference.
	 * @see #getHistoryModifiedData()
	 * @generated
	 */
	void setHistoryModifiedData(HistoryModifiedData value);

	/**
	 * Returns the value of the '<em><b>History Read Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Read Details</em>' containment reference.
	 * @see #setHistoryReadDetails(HistoryReadDetails)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_HistoryReadDetails()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HistoryReadDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryReadDetails getHistoryReadDetails();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadDetails <em>History Read Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Read Details</em>' containment reference.
	 * @see #getHistoryReadDetails()
	 * @generated
	 */
	void setHistoryReadDetails(HistoryReadDetails value);

	/**
	 * Returns the value of the '<em><b>History Read Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Read Request</em>' containment reference.
	 * @see #setHistoryReadRequest(HistoryReadRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_HistoryReadRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HistoryReadRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryReadRequest getHistoryReadRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadRequest <em>History Read Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Read Request</em>' containment reference.
	 * @see #getHistoryReadRequest()
	 * @generated
	 */
	void setHistoryReadRequest(HistoryReadRequest value);

	/**
	 * Returns the value of the '<em><b>History Read Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Read Response</em>' containment reference.
	 * @see #setHistoryReadResponse(HistoryReadResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_HistoryReadResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HistoryReadResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryReadResponse getHistoryReadResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadResponse <em>History Read Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Read Response</em>' containment reference.
	 * @see #getHistoryReadResponse()
	 * @generated
	 */
	void setHistoryReadResponse(HistoryReadResponse value);

	/**
	 * Returns the value of the '<em><b>History Read Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Read Result</em>' containment reference.
	 * @see #setHistoryReadResult(HistoryReadResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_HistoryReadResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HistoryReadResult' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryReadResult getHistoryReadResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadResult <em>History Read Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Read Result</em>' containment reference.
	 * @see #getHistoryReadResult()
	 * @generated
	 */
	void setHistoryReadResult(HistoryReadResult value);

	/**
	 * Returns the value of the '<em><b>History Read Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Read Value Id</em>' containment reference.
	 * @see #setHistoryReadValueId(HistoryReadValueId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_HistoryReadValueId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HistoryReadValueId' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryReadValueId getHistoryReadValueId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadValueId <em>History Read Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Read Value Id</em>' containment reference.
	 * @see #getHistoryReadValueId()
	 * @generated
	 */
	void setHistoryReadValueId(HistoryReadValueId value);

	/**
	 * Returns the value of the '<em><b>History Update Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Update Details</em>' containment reference.
	 * @see #setHistoryUpdateDetails(HistoryUpdateDetails)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_HistoryUpdateDetails()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HistoryUpdateDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryUpdateDetails getHistoryUpdateDetails();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateDetails <em>History Update Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Update Details</em>' containment reference.
	 * @see #getHistoryUpdateDetails()
	 * @generated
	 */
	void setHistoryUpdateDetails(HistoryUpdateDetails value);

	/**
	 * Returns the value of the '<em><b>History Update Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Update Request</em>' containment reference.
	 * @see #setHistoryUpdateRequest(HistoryUpdateRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_HistoryUpdateRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HistoryUpdateRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryUpdateRequest getHistoryUpdateRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateRequest <em>History Update Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Update Request</em>' containment reference.
	 * @see #getHistoryUpdateRequest()
	 * @generated
	 */
	void setHistoryUpdateRequest(HistoryUpdateRequest value);

	/**
	 * Returns the value of the '<em><b>History Update Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Update Response</em>' containment reference.
	 * @see #setHistoryUpdateResponse(HistoryUpdateResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_HistoryUpdateResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HistoryUpdateResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryUpdateResponse getHistoryUpdateResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateResponse <em>History Update Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Update Response</em>' containment reference.
	 * @see #getHistoryUpdateResponse()
	 * @generated
	 */
	void setHistoryUpdateResponse(HistoryUpdateResponse value);

	/**
	 * Returns the value of the '<em><b>History Update Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Update Result</em>' containment reference.
	 * @see #setHistoryUpdateResult(HistoryUpdateResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_HistoryUpdateResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HistoryUpdateResult' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryUpdateResult getHistoryUpdateResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateResult <em>History Update Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Update Result</em>' containment reference.
	 * @see #getHistoryUpdateResult()
	 * @generated
	 */
	void setHistoryUpdateResult(HistoryUpdateResult value);

	/**
	 * Returns the value of the '<em><b>History Update Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.HistoryUpdateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Update Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.HistoryUpdateType
	 * @see #setHistoryUpdateType(HistoryUpdateType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_HistoryUpdateType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HistoryUpdateType' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryUpdateType getHistoryUpdateType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateType <em>History Update Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Update Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.HistoryUpdateType
	 * @see #getHistoryUpdateType()
	 * @generated
	 */
	void setHistoryUpdateType(HistoryUpdateType value);

	/**
	 * Returns the value of the '<em><b>Identity Criteria Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.IdentityCriteriaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity Criteria Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.IdentityCriteriaType
	 * @see #setIdentityCriteriaType(IdentityCriteriaType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_IdentityCriteriaType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IdentityCriteriaType' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentityCriteriaType getIdentityCriteriaType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIdentityCriteriaType <em>Identity Criteria Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity Criteria Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.IdentityCriteriaType
	 * @see #getIdentityCriteriaType()
	 * @generated
	 */
	void setIdentityCriteriaType(IdentityCriteriaType value);

	/**
	 * Returns the value of the '<em><b>Identity Mapping Rule Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity Mapping Rule Type</em>' containment reference.
	 * @see #setIdentityMappingRuleType(IdentityMappingRuleType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_IdentityMappingRuleType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IdentityMappingRuleType' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentityMappingRuleType getIdentityMappingRuleType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIdentityMappingRuleType <em>Identity Mapping Rule Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity Mapping Rule Type</em>' containment reference.
	 * @see #getIdentityMappingRuleType()
	 * @generated
	 */
	void setIdentityMappingRuleType(IdentityMappingRuleType value);

	/**
	 * Returns the value of the '<em><b>Id Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.IdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.IdType
	 * @see #setIdType(IdType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_IdType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IdType' namespace='##targetNamespace'"
	 * @generated
	 */
	IdType getIdType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIdType <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.IdType
	 * @see #getIdType()
	 * @generated
	 */
	void setIdType(IdType value);

	/**
	 * Returns the value of the '<em><b>Image BMP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image BMP</em>' attribute.
	 * @see #setImageBMP(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ImageBMP()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImageBMP' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getImageBMP();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getImageBMP <em>Image BMP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image BMP</em>' attribute.
	 * @see #getImageBMP()
	 * @generated
	 */
	void setImageBMP(byte[] value);

	/**
	 * Returns the value of the '<em><b>Image GIF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image GIF</em>' attribute.
	 * @see #setImageGIF(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ImageGIF()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImageGIF' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getImageGIF();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getImageGIF <em>Image GIF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image GIF</em>' attribute.
	 * @see #getImageGIF()
	 * @generated
	 */
	void setImageGIF(byte[] value);

	/**
	 * Returns the value of the '<em><b>Image JPG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image JPG</em>' attribute.
	 * @see #setImageJPG(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ImageJPG()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImageJPG' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getImageJPG();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getImageJPG <em>Image JPG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image JPG</em>' attribute.
	 * @see #getImageJPG()
	 * @generated
	 */
	void setImageJPG(byte[] value);

	/**
	 * Returns the value of the '<em><b>Image PNG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image PNG</em>' attribute.
	 * @see #setImagePNG(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ImagePNG()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImagePNG' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getImagePNG();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getImagePNG <em>Image PNG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image PNG</em>' attribute.
	 * @see #getImagePNG()
	 * @generated
	 */
	void setImagePNG(byte[] value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Index()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Index' namespace='##targetNamespace'"
	 * @generated
	 */
	long getIndex();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(long value);

	/**
	 * Returns the value of the '<em><b>Instance Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Node</em>' containment reference.
	 * @see #setInstanceNode(InstanceNode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_InstanceNode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InstanceNode' namespace='##targetNamespace'"
	 * @generated
	 */
	InstanceNode getInstanceNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInstanceNode <em>Instance Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Node</em>' containment reference.
	 * @see #getInstanceNode()
	 * @generated
	 */
	void setInstanceNode(InstanceNode value);

	/**
	 * Returns the value of the '<em><b>Int16</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int16</em>' attribute.
	 * @see #setInt16(Short)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Int16()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.ShortObject" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Int16' namespace='##targetNamespace'"
	 * @generated
	 */
	Short getInt16();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInt16 <em>Int16</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int16</em>' attribute.
	 * @see #getInt16()
	 * @generated
	 */
	void setInt16(Short value);

	/**
	 * Returns the value of the '<em><b>Int32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int32</em>' attribute.
	 * @see #setInt32(Integer)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Int32()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IntObject" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Int32' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getInt32();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInt32 <em>Int32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int32</em>' attribute.
	 * @see #getInt32()
	 * @generated
	 */
	void setInt32(Integer value);

	/**
	 * Returns the value of the '<em><b>Int64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int64</em>' attribute.
	 * @see #setInt64(Long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Int64()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.LongObject" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Int64' namespace='##targetNamespace'"
	 * @generated
	 */
	Long getInt64();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInt64 <em>Int64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int64</em>' attribute.
	 * @see #getInt64()
	 * @generated
	 */
	void setInt64(Long value);

	/**
	 * Returns the value of the '<em><b>Integer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Id</em>' attribute.
	 * @see #setIntegerId(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_IntegerId()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IntegerId' namespace='##targetNamespace'"
	 * @generated
	 */
	long getIntegerId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIntegerId <em>Integer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Id</em>' attribute.
	 * @see #getIntegerId()
	 * @generated
	 */
	void setIntegerId(long value);

	/**
	 * Returns the value of the '<em><b>Invoke Service Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoke Service Request</em>' attribute.
	 * @see #setInvokeServiceRequest(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_InvokeServiceRequest()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvokeServiceRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getInvokeServiceRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInvokeServiceRequest <em>Invoke Service Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoke Service Request</em>' attribute.
	 * @see #getInvokeServiceRequest()
	 * @generated
	 */
	void setInvokeServiceRequest(byte[] value);

	/**
	 * Returns the value of the '<em><b>Invoke Service Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoke Service Response</em>' attribute.
	 * @see #setInvokeServiceResponse(byte[])
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_InvokeServiceResponse()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvokeServiceResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getInvokeServiceResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInvokeServiceResponse <em>Invoke Service Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoke Service Response</em>' attribute.
	 * @see #getInvokeServiceResponse()
	 * @generated
	 */
	void setInvokeServiceResponse(byte[] value);

	/**
	 * Returns the value of the '<em><b>Issued Identity Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued Identity Token</em>' containment reference.
	 * @see #setIssuedIdentityToken(IssuedIdentityToken)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_IssuedIdentityToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IssuedIdentityToken' namespace='##targetNamespace'"
	 * @generated
	 */
	IssuedIdentityToken getIssuedIdentityToken();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIssuedIdentityToken <em>Issued Identity Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued Identity Token</em>' containment reference.
	 * @see #getIssuedIdentityToken()
	 * @generated
	 */
	void setIssuedIdentityToken(IssuedIdentityToken value);

	/**
	 * Returns the value of the '<em><b>Json Data Set Message Content Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Data Set Message Content Mask</em>' attribute.
	 * @see #setJsonDataSetMessageContentMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_JsonDataSetMessageContentMask()
	 * @model unique="false" dataType="org.opcfoundation.ua._2008._02.types.JsonDataSetMessageContentMask" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='JsonDataSetMessageContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getJsonDataSetMessageContentMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonDataSetMessageContentMask <em>Json Data Set Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Data Set Message Content Mask</em>' attribute.
	 * @see #getJsonDataSetMessageContentMask()
	 * @generated
	 */
	void setJsonDataSetMessageContentMask(long value);

	/**
	 * Returns the value of the '<em><b>Json Data Set Reader Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Data Set Reader Message Data Type</em>' containment reference.
	 * @see #setJsonDataSetReaderMessageDataType(JsonDataSetReaderMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_JsonDataSetReaderMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='JsonDataSetReaderMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	JsonDataSetReaderMessageDataType getJsonDataSetReaderMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonDataSetReaderMessageDataType <em>Json Data Set Reader Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Data Set Reader Message Data Type</em>' containment reference.
	 * @see #getJsonDataSetReaderMessageDataType()
	 * @generated
	 */
	void setJsonDataSetReaderMessageDataType(JsonDataSetReaderMessageDataType value);

	/**
	 * Returns the value of the '<em><b>Json Data Set Writer Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Data Set Writer Message Data Type</em>' containment reference.
	 * @see #setJsonDataSetWriterMessageDataType(JsonDataSetWriterMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_JsonDataSetWriterMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='JsonDataSetWriterMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	JsonDataSetWriterMessageDataType getJsonDataSetWriterMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonDataSetWriterMessageDataType <em>Json Data Set Writer Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Data Set Writer Message Data Type</em>' containment reference.
	 * @see #getJsonDataSetWriterMessageDataType()
	 * @generated
	 */
	void setJsonDataSetWriterMessageDataType(JsonDataSetWriterMessageDataType value);

	/**
	 * Returns the value of the '<em><b>Json Network Message Content Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Network Message Content Mask</em>' attribute.
	 * @see #setJsonNetworkMessageContentMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_JsonNetworkMessageContentMask()
	 * @model unique="false" dataType="org.opcfoundation.ua._2008._02.types.JsonNetworkMessageContentMask" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='JsonNetworkMessageContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getJsonNetworkMessageContentMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonNetworkMessageContentMask <em>Json Network Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Network Message Content Mask</em>' attribute.
	 * @see #getJsonNetworkMessageContentMask()
	 * @generated
	 */
	void setJsonNetworkMessageContentMask(long value);

	/**
	 * Returns the value of the '<em><b>Json Writer Group Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Writer Group Message Data Type</em>' containment reference.
	 * @see #setJsonWriterGroupMessageDataType(JsonWriterGroupMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_JsonWriterGroupMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='JsonWriterGroupMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	JsonWriterGroupMessageDataType getJsonWriterGroupMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonWriterGroupMessageDataType <em>Json Writer Group Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Writer Group Message Data Type</em>' containment reference.
	 * @see #getJsonWriterGroupMessageDataType()
	 * @generated
	 */
	void setJsonWriterGroupMessageDataType(JsonWriterGroupMessageDataType value);

	/**
	 * Returns the value of the '<em><b>Key Value Pair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Value Pair</em>' containment reference.
	 * @see #setKeyValuePair(KeyValuePair)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_KeyValuePair()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyValuePair' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyValuePair getKeyValuePair();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getKeyValuePair <em>Key Value Pair</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Value Pair</em>' containment reference.
	 * @see #getKeyValuePair()
	 * @generated
	 */
	void setKeyValuePair(KeyValuePair value);

	/**
	 * Returns the value of the '<em><b>List Of Add Nodes Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Add Nodes Item</em>' containment reference.
	 * @see #setListOfAddNodesItem(ListOfAddNodesItem)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfAddNodesItem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfAddNodesItem' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfAddNodesItem getListOfAddNodesItem();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAddNodesItem <em>List Of Add Nodes Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Add Nodes Item</em>' containment reference.
	 * @see #getListOfAddNodesItem()
	 * @generated
	 */
	void setListOfAddNodesItem(ListOfAddNodesItem value);

	/**
	 * Returns the value of the '<em><b>List Of Add Nodes Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Add Nodes Result</em>' containment reference.
	 * @see #setListOfAddNodesResult(ListOfAddNodesResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfAddNodesResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfAddNodesResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfAddNodesResult getListOfAddNodesResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAddNodesResult <em>List Of Add Nodes Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Add Nodes Result</em>' containment reference.
	 * @see #getListOfAddNodesResult()
	 * @generated
	 */
	void setListOfAddNodesResult(ListOfAddNodesResult value);

	/**
	 * Returns the value of the '<em><b>List Of Add References Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Add References Item</em>' containment reference.
	 * @see #setListOfAddReferencesItem(ListOfAddReferencesItem)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfAddReferencesItem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfAddReferencesItem' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfAddReferencesItem getListOfAddReferencesItem();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAddReferencesItem <em>List Of Add References Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Add References Item</em>' containment reference.
	 * @see #getListOfAddReferencesItem()
	 * @generated
	 */
	void setListOfAddReferencesItem(ListOfAddReferencesItem value);

	/**
	 * Returns the value of the '<em><b>List Of Alias Name Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Alias Name Data Type</em>' containment reference.
	 * @see #setListOfAliasNameDataType(ListOfAliasNameDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfAliasNameDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfAliasNameDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfAliasNameDataType getListOfAliasNameDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAliasNameDataType <em>List Of Alias Name Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Alias Name Data Type</em>' containment reference.
	 * @see #getListOfAliasNameDataType()
	 * @generated
	 */
	void setListOfAliasNameDataType(ListOfAliasNameDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Application Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Application Description</em>' containment reference.
	 * @see #setListOfApplicationDescription(ListOfApplicationDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfApplicationDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfApplicationDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfApplicationDescription getListOfApplicationDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfApplicationDescription <em>List Of Application Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Application Description</em>' containment reference.
	 * @see #getListOfApplicationDescription()
	 * @generated
	 */
	void setListOfApplicationDescription(ListOfApplicationDescription value);

	/**
	 * Returns the value of the '<em><b>List Of Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Argument</em>' containment reference.
	 * @see #setListOfArgument(ListOfArgument)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfArgument()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfArgument' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfArgument getListOfArgument();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfArgument <em>List Of Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Argument</em>' containment reference.
	 * @see #getListOfArgument()
	 * @generated
	 */
	void setListOfArgument(ListOfArgument value);

	/**
	 * Returns the value of the '<em><b>List Of Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Boolean</em>' containment reference.
	 * @see #setListOfBoolean(ListOfBoolean)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfBoolean()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfBoolean getListOfBoolean();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBoolean <em>List Of Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Boolean</em>' containment reference.
	 * @see #getListOfBoolean()
	 * @generated
	 */
	void setListOfBoolean(ListOfBoolean value);

	/**
	 * Returns the value of the '<em><b>List Of Broker Connection Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Broker Connection Transport Data Type</em>' containment reference.
	 * @see #setListOfBrokerConnectionTransportDataType(ListOfBrokerConnectionTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfBrokerConnectionTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfBrokerConnectionTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfBrokerConnectionTransportDataType getListOfBrokerConnectionTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerConnectionTransportDataType <em>List Of Broker Connection Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Broker Connection Transport Data Type</em>' containment reference.
	 * @see #getListOfBrokerConnectionTransportDataType()
	 * @generated
	 */
	void setListOfBrokerConnectionTransportDataType(ListOfBrokerConnectionTransportDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Broker Data Set Reader Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Broker Data Set Reader Transport Data Type</em>' containment reference.
	 * @see #setListOfBrokerDataSetReaderTransportDataType(ListOfBrokerDataSetReaderTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfBrokerDataSetReaderTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfBrokerDataSetReaderTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfBrokerDataSetReaderTransportDataType getListOfBrokerDataSetReaderTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerDataSetReaderTransportDataType <em>List Of Broker Data Set Reader Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Broker Data Set Reader Transport Data Type</em>' containment reference.
	 * @see #getListOfBrokerDataSetReaderTransportDataType()
	 * @generated
	 */
	void setListOfBrokerDataSetReaderTransportDataType(ListOfBrokerDataSetReaderTransportDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Broker Data Set Writer Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Broker Data Set Writer Transport Data Type</em>' containment reference.
	 * @see #setListOfBrokerDataSetWriterTransportDataType(ListOfBrokerDataSetWriterTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfBrokerDataSetWriterTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfBrokerDataSetWriterTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfBrokerDataSetWriterTransportDataType getListOfBrokerDataSetWriterTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerDataSetWriterTransportDataType <em>List Of Broker Data Set Writer Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Broker Data Set Writer Transport Data Type</em>' containment reference.
	 * @see #getListOfBrokerDataSetWriterTransportDataType()
	 * @generated
	 */
	void setListOfBrokerDataSetWriterTransportDataType(ListOfBrokerDataSetWriterTransportDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Broker Transport Quality Of Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Broker Transport Quality Of Service</em>' containment reference.
	 * @see #setListOfBrokerTransportQualityOfService(ListOfBrokerTransportQualityOfService)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfBrokerTransportQualityOfService()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfBrokerTransportQualityOfService' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfBrokerTransportQualityOfService getListOfBrokerTransportQualityOfService();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerTransportQualityOfService <em>List Of Broker Transport Quality Of Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Broker Transport Quality Of Service</em>' containment reference.
	 * @see #getListOfBrokerTransportQualityOfService()
	 * @generated
	 */
	void setListOfBrokerTransportQualityOfService(ListOfBrokerTransportQualityOfService value);

	/**
	 * Returns the value of the '<em><b>List Of Broker Writer Group Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Broker Writer Group Transport Data Type</em>' containment reference.
	 * @see #setListOfBrokerWriterGroupTransportDataType(ListOfBrokerWriterGroupTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfBrokerWriterGroupTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfBrokerWriterGroupTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfBrokerWriterGroupTransportDataType getListOfBrokerWriterGroupTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerWriterGroupTransportDataType <em>List Of Broker Writer Group Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Broker Writer Group Transport Data Type</em>' containment reference.
	 * @see #getListOfBrokerWriterGroupTransportDataType()
	 * @generated
	 */
	void setListOfBrokerWriterGroupTransportDataType(ListOfBrokerWriterGroupTransportDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Browse Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Browse Description</em>' containment reference.
	 * @see #setListOfBrowseDescription(ListOfBrowseDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfBrowseDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfBrowseDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfBrowseDescription getListOfBrowseDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowseDescription <em>List Of Browse Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Browse Description</em>' containment reference.
	 * @see #getListOfBrowseDescription()
	 * @generated
	 */
	void setListOfBrowseDescription(ListOfBrowseDescription value);

	/**
	 * Returns the value of the '<em><b>List Of Browse Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Browse Path</em>' containment reference.
	 * @see #setListOfBrowsePath(ListOfBrowsePath)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfBrowsePath()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfBrowsePath' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfBrowsePath getListOfBrowsePath();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowsePath <em>List Of Browse Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Browse Path</em>' containment reference.
	 * @see #getListOfBrowsePath()
	 * @generated
	 */
	void setListOfBrowsePath(ListOfBrowsePath value);

	/**
	 * Returns the value of the '<em><b>List Of Browse Path Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Browse Path Result</em>' containment reference.
	 * @see #setListOfBrowsePathResult(ListOfBrowsePathResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfBrowsePathResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfBrowsePathResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfBrowsePathResult getListOfBrowsePathResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowsePathResult <em>List Of Browse Path Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Browse Path Result</em>' containment reference.
	 * @see #getListOfBrowsePathResult()
	 * @generated
	 */
	void setListOfBrowsePathResult(ListOfBrowsePathResult value);

	/**
	 * Returns the value of the '<em><b>List Of Browse Path Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Browse Path Target</em>' containment reference.
	 * @see #setListOfBrowsePathTarget(ListOfBrowsePathTarget)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfBrowsePathTarget()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfBrowsePathTarget' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfBrowsePathTarget getListOfBrowsePathTarget();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowsePathTarget <em>List Of Browse Path Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Browse Path Target</em>' containment reference.
	 * @see #getListOfBrowsePathTarget()
	 * @generated
	 */
	void setListOfBrowsePathTarget(ListOfBrowsePathTarget value);

	/**
	 * Returns the value of the '<em><b>List Of Browse Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Browse Result</em>' containment reference.
	 * @see #setListOfBrowseResult(ListOfBrowseResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfBrowseResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfBrowseResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfBrowseResult getListOfBrowseResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowseResult <em>List Of Browse Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Browse Result</em>' containment reference.
	 * @see #getListOfBrowseResult()
	 * @generated
	 */
	void setListOfBrowseResult(ListOfBrowseResult value);

	/**
	 * Returns the value of the '<em><b>List Of Byte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Byte</em>' containment reference.
	 * @see #setListOfByte(ListOfByte)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfByte()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfByte' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfByte getListOfByte();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfByte <em>List Of Byte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Byte</em>' containment reference.
	 * @see #getListOfByte()
	 * @generated
	 */
	void setListOfByte(ListOfByte value);

	/**
	 * Returns the value of the '<em><b>List Of Byte String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Byte String</em>' containment reference.
	 * @see #setListOfByteString(ListOfByteString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfByteString()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfByteString' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfByteString getListOfByteString();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfByteString <em>List Of Byte String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Byte String</em>' containment reference.
	 * @see #getListOfByteString()
	 * @generated
	 */
	void setListOfByteString(ListOfByteString value);

	/**
	 * Returns the value of the '<em><b>List Of Call Method Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Call Method Request</em>' containment reference.
	 * @see #setListOfCallMethodRequest(ListOfCallMethodRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfCallMethodRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfCallMethodRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfCallMethodRequest getListOfCallMethodRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCallMethodRequest <em>List Of Call Method Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Call Method Request</em>' containment reference.
	 * @see #getListOfCallMethodRequest()
	 * @generated
	 */
	void setListOfCallMethodRequest(ListOfCallMethodRequest value);

	/**
	 * Returns the value of the '<em><b>List Of Call Method Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Call Method Result</em>' containment reference.
	 * @see #setListOfCallMethodResult(ListOfCallMethodResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfCallMethodResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfCallMethodResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfCallMethodResult getListOfCallMethodResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCallMethodResult <em>List Of Call Method Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Call Method Result</em>' containment reference.
	 * @see #getListOfCallMethodResult()
	 * @generated
	 */
	void setListOfCallMethodResult(ListOfCallMethodResult value);

	/**
	 * Returns the value of the '<em><b>List Of Cartesian Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Cartesian Coordinates</em>' containment reference.
	 * @see #setListOfCartesianCoordinates(ListOfCartesianCoordinates)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfCartesianCoordinates()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfCartesianCoordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfCartesianCoordinates getListOfCartesianCoordinates();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCartesianCoordinates <em>List Of Cartesian Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Cartesian Coordinates</em>' containment reference.
	 * @see #getListOfCartesianCoordinates()
	 * @generated
	 */
	void setListOfCartesianCoordinates(ListOfCartesianCoordinates value);

	/**
	 * Returns the value of the '<em><b>List Of Configuration Version Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Configuration Version Data Type</em>' containment reference.
	 * @see #setListOfConfigurationVersionDataType(ListOfConfigurationVersionDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfConfigurationVersionDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfConfigurationVersionDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfConfigurationVersionDataType getListOfConfigurationVersionDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfConfigurationVersionDataType <em>List Of Configuration Version Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Configuration Version Data Type</em>' containment reference.
	 * @see #getListOfConfigurationVersionDataType()
	 * @generated
	 */
	void setListOfConfigurationVersionDataType(ListOfConfigurationVersionDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Connection Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Connection Transport Data Type</em>' containment reference.
	 * @see #setListOfConnectionTransportDataType(ListOfConnectionTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfConnectionTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfConnectionTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfConnectionTransportDataType getListOfConnectionTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfConnectionTransportDataType <em>List Of Connection Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Connection Transport Data Type</em>' containment reference.
	 * @see #getListOfConnectionTransportDataType()
	 * @generated
	 */
	void setListOfConnectionTransportDataType(ListOfConnectionTransportDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Content Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Content Filter</em>' containment reference.
	 * @see #setListOfContentFilter(ListOfContentFilter)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfContentFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfContentFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfContentFilter getListOfContentFilter();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfContentFilter <em>List Of Content Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Content Filter</em>' containment reference.
	 * @see #getListOfContentFilter()
	 * @generated
	 */
	void setListOfContentFilter(ListOfContentFilter value);

	/**
	 * Returns the value of the '<em><b>List Of Content Filter Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Content Filter Element</em>' containment reference.
	 * @see #setListOfContentFilterElement(ListOfContentFilterElement)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfContentFilterElement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfContentFilterElement' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfContentFilterElement getListOfContentFilterElement();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfContentFilterElement <em>List Of Content Filter Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Content Filter Element</em>' containment reference.
	 * @see #getListOfContentFilterElement()
	 * @generated
	 */
	void setListOfContentFilterElement(ListOfContentFilterElement value);

	/**
	 * Returns the value of the '<em><b>List Of Content Filter Element Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Content Filter Element Result</em>' containment reference.
	 * @see #setListOfContentFilterElementResult(ListOfContentFilterElementResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfContentFilterElementResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfContentFilterElementResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfContentFilterElementResult getListOfContentFilterElementResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfContentFilterElementResult <em>List Of Content Filter Element Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Content Filter Element Result</em>' containment reference.
	 * @see #getListOfContentFilterElementResult()
	 * @generated
	 */
	void setListOfContentFilterElementResult(ListOfContentFilterElementResult value);

	/**
	 * Returns the value of the '<em><b>List Of Currency Unit Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Currency Unit Type</em>' containment reference.
	 * @see #setListOfCurrencyUnitType(ListOfCurrencyUnitType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfCurrencyUnitType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfCurrencyUnitType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfCurrencyUnitType getListOfCurrencyUnitType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCurrencyUnitType <em>List Of Currency Unit Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Currency Unit Type</em>' containment reference.
	 * @see #getListOfCurrencyUnitType()
	 * @generated
	 */
	void setListOfCurrencyUnitType(ListOfCurrencyUnitType value);

	/**
	 * Returns the value of the '<em><b>List Of Datagram Connection Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Datagram Connection Transport Data Type</em>' containment reference.
	 * @see #setListOfDatagramConnectionTransportDataType(ListOfDatagramConnectionTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDatagramConnectionTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDatagramConnectionTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDatagramConnectionTransportDataType getListOfDatagramConnectionTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDatagramConnectionTransportDataType <em>List Of Datagram Connection Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Datagram Connection Transport Data Type</em>' containment reference.
	 * @see #getListOfDatagramConnectionTransportDataType()
	 * @generated
	 */
	void setListOfDatagramConnectionTransportDataType(ListOfDatagramConnectionTransportDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Datagram Writer Group Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Datagram Writer Group Transport Data Type</em>' containment reference.
	 * @see #setListOfDatagramWriterGroupTransportDataType(ListOfDatagramWriterGroupTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDatagramWriterGroupTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDatagramWriterGroupTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDatagramWriterGroupTransportDataType getListOfDatagramWriterGroupTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDatagramWriterGroupTransportDataType <em>List Of Datagram Writer Group Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Datagram Writer Group Transport Data Type</em>' containment reference.
	 * @see #getListOfDatagramWriterGroupTransportDataType()
	 * @generated
	 */
	void setListOfDatagramWriterGroupTransportDataType(ListOfDatagramWriterGroupTransportDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Data Set Field Content Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Data Set Field Content Mask</em>' containment reference.
	 * @see #setListOfDataSetFieldContentMask(ListOfDataSetFieldContentMask)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDataSetFieldContentMask()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDataSetFieldContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDataSetFieldContentMask getListOfDataSetFieldContentMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetFieldContentMask <em>List Of Data Set Field Content Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Data Set Field Content Mask</em>' containment reference.
	 * @see #getListOfDataSetFieldContentMask()
	 * @generated
	 */
	void setListOfDataSetFieldContentMask(ListOfDataSetFieldContentMask value);

	/**
	 * Returns the value of the '<em><b>List Of Data Set Meta Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Data Set Meta Data Type</em>' containment reference.
	 * @see #setListOfDataSetMetaDataType(ListOfDataSetMetaDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDataSetMetaDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDataSetMetaDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDataSetMetaDataType getListOfDataSetMetaDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetMetaDataType <em>List Of Data Set Meta Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Data Set Meta Data Type</em>' containment reference.
	 * @see #getListOfDataSetMetaDataType()
	 * @generated
	 */
	void setListOfDataSetMetaDataType(ListOfDataSetMetaDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Data Set Ordering Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Data Set Ordering Type</em>' containment reference.
	 * @see #setListOfDataSetOrderingType(ListOfDataSetOrderingType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDataSetOrderingType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDataSetOrderingType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDataSetOrderingType getListOfDataSetOrderingType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetOrderingType <em>List Of Data Set Ordering Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Data Set Ordering Type</em>' containment reference.
	 * @see #getListOfDataSetOrderingType()
	 * @generated
	 */
	void setListOfDataSetOrderingType(ListOfDataSetOrderingType value);

	/**
	 * Returns the value of the '<em><b>List Of Data Set Reader Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Data Set Reader Data Type</em>' containment reference.
	 * @see #setListOfDataSetReaderDataType(ListOfDataSetReaderDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDataSetReaderDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDataSetReaderDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDataSetReaderDataType getListOfDataSetReaderDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetReaderDataType <em>List Of Data Set Reader Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Data Set Reader Data Type</em>' containment reference.
	 * @see #getListOfDataSetReaderDataType()
	 * @generated
	 */
	void setListOfDataSetReaderDataType(ListOfDataSetReaderDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Data Set Reader Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Data Set Reader Message Data Type</em>' containment reference.
	 * @see #setListOfDataSetReaderMessageDataType(ListOfDataSetReaderMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDataSetReaderMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDataSetReaderMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDataSetReaderMessageDataType getListOfDataSetReaderMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetReaderMessageDataType <em>List Of Data Set Reader Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Data Set Reader Message Data Type</em>' containment reference.
	 * @see #getListOfDataSetReaderMessageDataType()
	 * @generated
	 */
	void setListOfDataSetReaderMessageDataType(ListOfDataSetReaderMessageDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Data Set Reader Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Data Set Reader Transport Data Type</em>' containment reference.
	 * @see #setListOfDataSetReaderTransportDataType(ListOfDataSetReaderTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDataSetReaderTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDataSetReaderTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDataSetReaderTransportDataType getListOfDataSetReaderTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetReaderTransportDataType <em>List Of Data Set Reader Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Data Set Reader Transport Data Type</em>' containment reference.
	 * @see #getListOfDataSetReaderTransportDataType()
	 * @generated
	 */
	void setListOfDataSetReaderTransportDataType(ListOfDataSetReaderTransportDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Data Set Writer Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Data Set Writer Data Type</em>' containment reference.
	 * @see #setListOfDataSetWriterDataType(ListOfDataSetWriterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDataSetWriterDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDataSetWriterDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDataSetWriterDataType getListOfDataSetWriterDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetWriterDataType <em>List Of Data Set Writer Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Data Set Writer Data Type</em>' containment reference.
	 * @see #getListOfDataSetWriterDataType()
	 * @generated
	 */
	void setListOfDataSetWriterDataType(ListOfDataSetWriterDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Data Set Writer Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Data Set Writer Message Data Type</em>' containment reference.
	 * @see #setListOfDataSetWriterMessageDataType(ListOfDataSetWriterMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDataSetWriterMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDataSetWriterMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDataSetWriterMessageDataType getListOfDataSetWriterMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetWriterMessageDataType <em>List Of Data Set Writer Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Data Set Writer Message Data Type</em>' containment reference.
	 * @see #getListOfDataSetWriterMessageDataType()
	 * @generated
	 */
	void setListOfDataSetWriterMessageDataType(ListOfDataSetWriterMessageDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Data Set Writer Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Data Set Writer Transport Data Type</em>' containment reference.
	 * @see #setListOfDataSetWriterTransportDataType(ListOfDataSetWriterTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDataSetWriterTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDataSetWriterTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDataSetWriterTransportDataType getListOfDataSetWriterTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetWriterTransportDataType <em>List Of Data Set Writer Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Data Set Writer Transport Data Type</em>' containment reference.
	 * @see #getListOfDataSetWriterTransportDataType()
	 * @generated
	 */
	void setListOfDataSetWriterTransportDataType(ListOfDataSetWriterTransportDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Data Type Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Data Type Definition</em>' containment reference.
	 * @see #setListOfDataTypeDefinition(ListOfDataTypeDefinition)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDataTypeDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDataTypeDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDataTypeDefinition getListOfDataTypeDefinition();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataTypeDefinition <em>List Of Data Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Data Type Definition</em>' containment reference.
	 * @see #getListOfDataTypeDefinition()
	 * @generated
	 */
	void setListOfDataTypeDefinition(ListOfDataTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>List Of Data Type Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Data Type Description</em>' containment reference.
	 * @see #setListOfDataTypeDescription(ListOfDataTypeDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDataTypeDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDataTypeDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDataTypeDescription getListOfDataTypeDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataTypeDescription <em>List Of Data Type Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Data Type Description</em>' containment reference.
	 * @see #getListOfDataTypeDescription()
	 * @generated
	 */
	void setListOfDataTypeDescription(ListOfDataTypeDescription value);

	/**
	 * Returns the value of the '<em><b>List Of Data Type Schema Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Data Type Schema Header</em>' containment reference.
	 * @see #setListOfDataTypeSchemaHeader(ListOfDataTypeSchemaHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDataTypeSchemaHeader()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDataTypeSchemaHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDataTypeSchemaHeader getListOfDataTypeSchemaHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataTypeSchemaHeader <em>List Of Data Type Schema Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Data Type Schema Header</em>' containment reference.
	 * @see #getListOfDataTypeSchemaHeader()
	 * @generated
	 */
	void setListOfDataTypeSchemaHeader(ListOfDataTypeSchemaHeader value);

	/**
	 * Returns the value of the '<em><b>List Of Data Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Data Value</em>' containment reference.
	 * @see #setListOfDataValue(ListOfDataValue)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDataValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDataValue' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDataValue getListOfDataValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataValue <em>List Of Data Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Data Value</em>' containment reference.
	 * @see #getListOfDataValue()
	 * @generated
	 */
	void setListOfDataValue(ListOfDataValue value);

	/**
	 * Returns the value of the '<em><b>List Of Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Date Time</em>' containment reference.
	 * @see #setListOfDateTime(ListOfDateTime)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDateTime()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDateTime getListOfDateTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDateTime <em>List Of Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Date Time</em>' containment reference.
	 * @see #getListOfDateTime()
	 * @generated
	 */
	void setListOfDateTime(ListOfDateTime value);

	/**
	 * Returns the value of the '<em><b>List Of Delete Nodes Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Delete Nodes Item</em>' containment reference.
	 * @see #setListOfDeleteNodesItem(ListOfDeleteNodesItem)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDeleteNodesItem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDeleteNodesItem' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDeleteNodesItem getListOfDeleteNodesItem();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDeleteNodesItem <em>List Of Delete Nodes Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Delete Nodes Item</em>' containment reference.
	 * @see #getListOfDeleteNodesItem()
	 * @generated
	 */
	void setListOfDeleteNodesItem(ListOfDeleteNodesItem value);

	/**
	 * Returns the value of the '<em><b>List Of Delete References Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Delete References Item</em>' containment reference.
	 * @see #setListOfDeleteReferencesItem(ListOfDeleteReferencesItem)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDeleteReferencesItem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDeleteReferencesItem' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDeleteReferencesItem getListOfDeleteReferencesItem();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDeleteReferencesItem <em>List Of Delete References Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Delete References Item</em>' containment reference.
	 * @see #getListOfDeleteReferencesItem()
	 * @generated
	 */
	void setListOfDeleteReferencesItem(ListOfDeleteReferencesItem value);

	/**
	 * Returns the value of the '<em><b>List Of Diagnostic Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Diagnostic Info</em>' containment reference.
	 * @see #setListOfDiagnosticInfo(ListOfDiagnosticInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDiagnosticInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDiagnosticInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDiagnosticInfo getListOfDiagnosticInfo();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDiagnosticInfo <em>List Of Diagnostic Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Diagnostic Info</em>' containment reference.
	 * @see #getListOfDiagnosticInfo()
	 * @generated
	 */
	void setListOfDiagnosticInfo(ListOfDiagnosticInfo value);

	/**
	 * Returns the value of the '<em><b>List Of Diagnostics Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Diagnostics Level</em>' containment reference.
	 * @see #setListOfDiagnosticsLevel(ListOfDiagnosticsLevel)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDiagnosticsLevel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDiagnosticsLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDiagnosticsLevel getListOfDiagnosticsLevel();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDiagnosticsLevel <em>List Of Diagnostics Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Diagnostics Level</em>' containment reference.
	 * @see #getListOfDiagnosticsLevel()
	 * @generated
	 */
	void setListOfDiagnosticsLevel(ListOfDiagnosticsLevel value);

	/**
	 * Returns the value of the '<em><b>List Of Double</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Double</em>' containment reference.
	 * @see #setListOfDouble(ListOfDouble)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfDouble()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfDouble' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDouble getListOfDouble();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDouble <em>List Of Double</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Double</em>' containment reference.
	 * @see #getListOfDouble()
	 * @generated
	 */
	void setListOfDouble(ListOfDouble value);

	/**
	 * Returns the value of the '<em><b>List Of Endpoint Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Endpoint Configuration</em>' containment reference.
	 * @see #setListOfEndpointConfiguration(ListOfEndpointConfiguration)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfEndpointConfiguration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfEndpointConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfEndpointConfiguration getListOfEndpointConfiguration();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointConfiguration <em>List Of Endpoint Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Endpoint Configuration</em>' containment reference.
	 * @see #getListOfEndpointConfiguration()
	 * @generated
	 */
	void setListOfEndpointConfiguration(ListOfEndpointConfiguration value);

	/**
	 * Returns the value of the '<em><b>List Of Endpoint Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Endpoint Description</em>' containment reference.
	 * @see #setListOfEndpointDescription(ListOfEndpointDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfEndpointDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfEndpointDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfEndpointDescription getListOfEndpointDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointDescription <em>List Of Endpoint Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Endpoint Description</em>' containment reference.
	 * @see #getListOfEndpointDescription()
	 * @generated
	 */
	void setListOfEndpointDescription(ListOfEndpointDescription value);

	/**
	 * Returns the value of the '<em><b>List Of Endpoint Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Endpoint Type</em>' containment reference.
	 * @see #setListOfEndpointType(ListOfEndpointType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfEndpointType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfEndpointType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfEndpointType getListOfEndpointType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointType <em>List Of Endpoint Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Endpoint Type</em>' containment reference.
	 * @see #getListOfEndpointType()
	 * @generated
	 */
	void setListOfEndpointType(ListOfEndpointType value);

	/**
	 * Returns the value of the '<em><b>List Of Endpoint Url List Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Endpoint Url List Data Type</em>' containment reference.
	 * @see #setListOfEndpointUrlListDataType(ListOfEndpointUrlListDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfEndpointUrlListDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfEndpointUrlListDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfEndpointUrlListDataType getListOfEndpointUrlListDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointUrlListDataType <em>List Of Endpoint Url List Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Endpoint Url List Data Type</em>' containment reference.
	 * @see #getListOfEndpointUrlListDataType()
	 * @generated
	 */
	void setListOfEndpointUrlListDataType(ListOfEndpointUrlListDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Enum Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Enum Definition</em>' containment reference.
	 * @see #setListOfEnumDefinition(ListOfEnumDefinition)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfEnumDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfEnumDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfEnumDefinition getListOfEnumDefinition();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumDefinition <em>List Of Enum Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Enum Definition</em>' containment reference.
	 * @see #getListOfEnumDefinition()
	 * @generated
	 */
	void setListOfEnumDefinition(ListOfEnumDefinition value);

	/**
	 * Returns the value of the '<em><b>List Of Enum Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Enum Description</em>' containment reference.
	 * @see #setListOfEnumDescription(ListOfEnumDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfEnumDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfEnumDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfEnumDescription getListOfEnumDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumDescription <em>List Of Enum Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Enum Description</em>' containment reference.
	 * @see #getListOfEnumDescription()
	 * @generated
	 */
	void setListOfEnumDescription(ListOfEnumDescription value);

	/**
	 * Returns the value of the '<em><b>List Of Enum Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Enum Field</em>' containment reference.
	 * @see #setListOfEnumField(ListOfEnumField)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfEnumField()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfEnumField' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfEnumField getListOfEnumField();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumField <em>List Of Enum Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Enum Field</em>' containment reference.
	 * @see #getListOfEnumField()
	 * @generated
	 */
	void setListOfEnumField(ListOfEnumField value);

	/**
	 * Returns the value of the '<em><b>List Of Enum Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Enum Value Type</em>' containment reference.
	 * @see #setListOfEnumValueType(ListOfEnumValueType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfEnumValueType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfEnumValueType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfEnumValueType getListOfEnumValueType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumValueType <em>List Of Enum Value Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Enum Value Type</em>' containment reference.
	 * @see #getListOfEnumValueType()
	 * @generated
	 */
	void setListOfEnumValueType(ListOfEnumValueType value);

	/**
	 * Returns the value of the '<em><b>List Of Event Field List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Event Field List</em>' containment reference.
	 * @see #setListOfEventFieldList(ListOfEventFieldList)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfEventFieldList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfEventFieldList' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfEventFieldList getListOfEventFieldList();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEventFieldList <em>List Of Event Field List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Event Field List</em>' containment reference.
	 * @see #getListOfEventFieldList()
	 * @generated
	 */
	void setListOfEventFieldList(ListOfEventFieldList value);

	/**
	 * Returns the value of the '<em><b>List Of Expanded Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Expanded Node Id</em>' containment reference.
	 * @see #setListOfExpandedNodeId(ListOfExpandedNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfExpandedNodeId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfExpandedNodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfExpandedNodeId getListOfExpandedNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfExpandedNodeId <em>List Of Expanded Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Expanded Node Id</em>' containment reference.
	 * @see #getListOfExpandedNodeId()
	 * @generated
	 */
	void setListOfExpandedNodeId(ListOfExpandedNodeId value);

	/**
	 * Returns the value of the '<em><b>List Of Extension Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Extension Object</em>' containment reference.
	 * @see #setListOfExtensionObject(ListOfExtensionObject)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfExtensionObject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfExtensionObject' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfExtensionObject getListOfExtensionObject();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfExtensionObject <em>List Of Extension Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Extension Object</em>' containment reference.
	 * @see #getListOfExtensionObject()
	 * @generated
	 */
	void setListOfExtensionObject(ListOfExtensionObject value);

	/**
	 * Returns the value of the '<em><b>List Of Field Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Field Meta Data</em>' containment reference.
	 * @see #setListOfFieldMetaData(ListOfFieldMetaData)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfFieldMetaData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfFieldMetaData' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfFieldMetaData getListOfFieldMetaData();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFieldMetaData <em>List Of Field Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Field Meta Data</em>' containment reference.
	 * @see #getListOfFieldMetaData()
	 * @generated
	 */
	void setListOfFieldMetaData(ListOfFieldMetaData value);

	/**
	 * Returns the value of the '<em><b>List Of Field Target Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Field Target Data Type</em>' containment reference.
	 * @see #setListOfFieldTargetDataType(ListOfFieldTargetDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfFieldTargetDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfFieldTargetDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfFieldTargetDataType getListOfFieldTargetDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFieldTargetDataType <em>List Of Field Target Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Field Target Data Type</em>' containment reference.
	 * @see #getListOfFieldTargetDataType()
	 * @generated
	 */
	void setListOfFieldTargetDataType(ListOfFieldTargetDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Float</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Float</em>' containment reference.
	 * @see #setListOfFloat(ListOfFloat)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfFloat()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfFloat' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfFloat getListOfFloat();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFloat <em>List Of Float</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Float</em>' containment reference.
	 * @see #getListOfFloat()
	 * @generated
	 */
	void setListOfFloat(ListOfFloat value);

	/**
	 * Returns the value of the '<em><b>List Of Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Frame</em>' containment reference.
	 * @see #setListOfFrame(ListOfFrame)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfFrame()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfFrame' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfFrame getListOfFrame();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFrame <em>List Of Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Frame</em>' containment reference.
	 * @see #getListOfFrame()
	 * @generated
	 */
	void setListOfFrame(ListOfFrame value);

	/**
	 * Returns the value of the '<em><b>List Of Generic Attribute Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Generic Attribute Value</em>' containment reference.
	 * @see #setListOfGenericAttributeValue(ListOfGenericAttributeValue)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfGenericAttributeValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfGenericAttributeValue' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfGenericAttributeValue getListOfGenericAttributeValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfGenericAttributeValue <em>List Of Generic Attribute Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Generic Attribute Value</em>' containment reference.
	 * @see #getListOfGenericAttributeValue()
	 * @generated
	 */
	void setListOfGenericAttributeValue(ListOfGenericAttributeValue value);

	/**
	 * Returns the value of the '<em><b>List Of Guid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Guid</em>' containment reference.
	 * @see #setListOfGuid(ListOfGuid)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfGuid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfGuid' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfGuid getListOfGuid();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfGuid <em>List Of Guid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Guid</em>' containment reference.
	 * @see #getListOfGuid()
	 * @generated
	 */
	void setListOfGuid(ListOfGuid value);

	/**
	 * Returns the value of the '<em><b>List Of History Event Field List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of History Event Field List</em>' containment reference.
	 * @see #setListOfHistoryEventFieldList(ListOfHistoryEventFieldList)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfHistoryEventFieldList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfHistoryEventFieldList' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfHistoryEventFieldList getListOfHistoryEventFieldList();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryEventFieldList <em>List Of History Event Field List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of History Event Field List</em>' containment reference.
	 * @see #getListOfHistoryEventFieldList()
	 * @generated
	 */
	void setListOfHistoryEventFieldList(ListOfHistoryEventFieldList value);

	/**
	 * Returns the value of the '<em><b>List Of History Read Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of History Read Result</em>' containment reference.
	 * @see #setListOfHistoryReadResult(ListOfHistoryReadResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfHistoryReadResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfHistoryReadResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfHistoryReadResult getListOfHistoryReadResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryReadResult <em>List Of History Read Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of History Read Result</em>' containment reference.
	 * @see #getListOfHistoryReadResult()
	 * @generated
	 */
	void setListOfHistoryReadResult(ListOfHistoryReadResult value);

	/**
	 * Returns the value of the '<em><b>List Of History Read Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of History Read Value Id</em>' containment reference.
	 * @see #setListOfHistoryReadValueId(ListOfHistoryReadValueId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfHistoryReadValueId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfHistoryReadValueId' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfHistoryReadValueId getListOfHistoryReadValueId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryReadValueId <em>List Of History Read Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of History Read Value Id</em>' containment reference.
	 * @see #getListOfHistoryReadValueId()
	 * @generated
	 */
	void setListOfHistoryReadValueId(ListOfHistoryReadValueId value);

	/**
	 * Returns the value of the '<em><b>List Of History Update Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of History Update Result</em>' containment reference.
	 * @see #setListOfHistoryUpdateResult(ListOfHistoryUpdateResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfHistoryUpdateResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfHistoryUpdateResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfHistoryUpdateResult getListOfHistoryUpdateResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryUpdateResult <em>List Of History Update Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of History Update Result</em>' containment reference.
	 * @see #getListOfHistoryUpdateResult()
	 * @generated
	 */
	void setListOfHistoryUpdateResult(ListOfHistoryUpdateResult value);

	/**
	 * Returns the value of the '<em><b>List Of Identity Criteria Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Identity Criteria Type</em>' containment reference.
	 * @see #setListOfIdentityCriteriaType(ListOfIdentityCriteriaType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfIdentityCriteriaType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfIdentityCriteriaType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfIdentityCriteriaType getListOfIdentityCriteriaType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfIdentityCriteriaType <em>List Of Identity Criteria Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Identity Criteria Type</em>' containment reference.
	 * @see #getListOfIdentityCriteriaType()
	 * @generated
	 */
	void setListOfIdentityCriteriaType(ListOfIdentityCriteriaType value);

	/**
	 * Returns the value of the '<em><b>List Of Identity Mapping Rule Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Identity Mapping Rule Type</em>' containment reference.
	 * @see #setListOfIdentityMappingRuleType(ListOfIdentityMappingRuleType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfIdentityMappingRuleType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfIdentityMappingRuleType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfIdentityMappingRuleType getListOfIdentityMappingRuleType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfIdentityMappingRuleType <em>List Of Identity Mapping Rule Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Identity Mapping Rule Type</em>' containment reference.
	 * @see #getListOfIdentityMappingRuleType()
	 * @generated
	 */
	void setListOfIdentityMappingRuleType(ListOfIdentityMappingRuleType value);

	/**
	 * Returns the value of the '<em><b>List Of Id Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Id Type</em>' containment reference.
	 * @see #setListOfIdType(ListOfIdType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfIdType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfIdType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfIdType getListOfIdType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfIdType <em>List Of Id Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Id Type</em>' containment reference.
	 * @see #getListOfIdType()
	 * @generated
	 */
	void setListOfIdType(ListOfIdType value);

	/**
	 * Returns the value of the '<em><b>List Of Int16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Int16</em>' containment reference.
	 * @see #setListOfInt16(ListOfInt16)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfInt16()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfInt16' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfInt16 getListOfInt16();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfInt16 <em>List Of Int16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Int16</em>' containment reference.
	 * @see #getListOfInt16()
	 * @generated
	 */
	void setListOfInt16(ListOfInt16 value);

	/**
	 * Returns the value of the '<em><b>List Of Int32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Int32</em>' containment reference.
	 * @see #setListOfInt32(ListOfInt32)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfInt32()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfInt32' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfInt32 getListOfInt32();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfInt32 <em>List Of Int32</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Int32</em>' containment reference.
	 * @see #getListOfInt32()
	 * @generated
	 */
	void setListOfInt32(ListOfInt32 value);

	/**
	 * Returns the value of the '<em><b>List Of Int64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Int64</em>' containment reference.
	 * @see #setListOfInt64(ListOfInt64)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfInt64()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfInt64' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfInt64 getListOfInt64();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfInt64 <em>List Of Int64</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Int64</em>' containment reference.
	 * @see #getListOfInt64()
	 * @generated
	 */
	void setListOfInt64(ListOfInt64 value);

	/**
	 * Returns the value of the '<em><b>List Of Json Data Set Message Content Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Json Data Set Message Content Mask</em>' containment reference.
	 * @see #setListOfJsonDataSetMessageContentMask(ListOfJsonDataSetMessageContentMask)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfJsonDataSetMessageContentMask()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfJsonDataSetMessageContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfJsonDataSetMessageContentMask getListOfJsonDataSetMessageContentMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonDataSetMessageContentMask <em>List Of Json Data Set Message Content Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Json Data Set Message Content Mask</em>' containment reference.
	 * @see #getListOfJsonDataSetMessageContentMask()
	 * @generated
	 */
	void setListOfJsonDataSetMessageContentMask(ListOfJsonDataSetMessageContentMask value);

	/**
	 * Returns the value of the '<em><b>List Of Json Data Set Reader Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Json Data Set Reader Message Data Type</em>' containment reference.
	 * @see #setListOfJsonDataSetReaderMessageDataType(ListOfJsonDataSetReaderMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfJsonDataSetReaderMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfJsonDataSetReaderMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfJsonDataSetReaderMessageDataType getListOfJsonDataSetReaderMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonDataSetReaderMessageDataType <em>List Of Json Data Set Reader Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Json Data Set Reader Message Data Type</em>' containment reference.
	 * @see #getListOfJsonDataSetReaderMessageDataType()
	 * @generated
	 */
	void setListOfJsonDataSetReaderMessageDataType(ListOfJsonDataSetReaderMessageDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Json Data Set Writer Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Json Data Set Writer Message Data Type</em>' containment reference.
	 * @see #setListOfJsonDataSetWriterMessageDataType(ListOfJsonDataSetWriterMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfJsonDataSetWriterMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfJsonDataSetWriterMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfJsonDataSetWriterMessageDataType getListOfJsonDataSetWriterMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonDataSetWriterMessageDataType <em>List Of Json Data Set Writer Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Json Data Set Writer Message Data Type</em>' containment reference.
	 * @see #getListOfJsonDataSetWriterMessageDataType()
	 * @generated
	 */
	void setListOfJsonDataSetWriterMessageDataType(ListOfJsonDataSetWriterMessageDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Json Network Message Content Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Json Network Message Content Mask</em>' containment reference.
	 * @see #setListOfJsonNetworkMessageContentMask(ListOfJsonNetworkMessageContentMask)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfJsonNetworkMessageContentMask()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfJsonNetworkMessageContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfJsonNetworkMessageContentMask getListOfJsonNetworkMessageContentMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonNetworkMessageContentMask <em>List Of Json Network Message Content Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Json Network Message Content Mask</em>' containment reference.
	 * @see #getListOfJsonNetworkMessageContentMask()
	 * @generated
	 */
	void setListOfJsonNetworkMessageContentMask(ListOfJsonNetworkMessageContentMask value);

	/**
	 * Returns the value of the '<em><b>List Of Json Writer Group Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Json Writer Group Message Data Type</em>' containment reference.
	 * @see #setListOfJsonWriterGroupMessageDataType(ListOfJsonWriterGroupMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfJsonWriterGroupMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfJsonWriterGroupMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfJsonWriterGroupMessageDataType getListOfJsonWriterGroupMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonWriterGroupMessageDataType <em>List Of Json Writer Group Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Json Writer Group Message Data Type</em>' containment reference.
	 * @see #getListOfJsonWriterGroupMessageDataType()
	 * @generated
	 */
	void setListOfJsonWriterGroupMessageDataType(ListOfJsonWriterGroupMessageDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Key Value Pair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Key Value Pair</em>' containment reference.
	 * @see #setListOfKeyValuePair(ListOfKeyValuePair)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfKeyValuePair()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfKeyValuePair' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfKeyValuePair getListOfKeyValuePair();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfKeyValuePair <em>List Of Key Value Pair</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Key Value Pair</em>' containment reference.
	 * @see #getListOfKeyValuePair()
	 * @generated
	 */
	void setListOfKeyValuePair(ListOfKeyValuePair value);

	/**
	 * Returns the value of the '<em><b>List Of Localized Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Localized Text</em>' containment reference.
	 * @see #setListOfLocalizedText(ListOfLocalizedText)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfLocalizedText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfLocalizedText' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfLocalizedText getListOfLocalizedText();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfLocalizedText <em>List Of Localized Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Localized Text</em>' containment reference.
	 * @see #getListOfLocalizedText()
	 * @generated
	 */
	void setListOfLocalizedText(ListOfLocalizedText value);

	/**
	 * Returns the value of the '<em><b>List Of Model Change Structure Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Model Change Structure Data Type</em>' containment reference.
	 * @see #setListOfModelChangeStructureDataType(ListOfModelChangeStructureDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfModelChangeStructureDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfModelChangeStructureDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfModelChangeStructureDataType getListOfModelChangeStructureDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfModelChangeStructureDataType <em>List Of Model Change Structure Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Model Change Structure Data Type</em>' containment reference.
	 * @see #getListOfModelChangeStructureDataType()
	 * @generated
	 */
	void setListOfModelChangeStructureDataType(ListOfModelChangeStructureDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Modification Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Modification Info</em>' containment reference.
	 * @see #setListOfModificationInfo(ListOfModificationInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfModificationInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfModificationInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfModificationInfo getListOfModificationInfo();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfModificationInfo <em>List Of Modification Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Modification Info</em>' containment reference.
	 * @see #getListOfModificationInfo()
	 * @generated
	 */
	void setListOfModificationInfo(ListOfModificationInfo value);

	/**
	 * Returns the value of the '<em><b>List Of Monitored Item Create Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Monitored Item Create Request</em>' containment reference.
	 * @see #setListOfMonitoredItemCreateRequest(ListOfMonitoredItemCreateRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfMonitoredItemCreateRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfMonitoredItemCreateRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfMonitoredItemCreateRequest getListOfMonitoredItemCreateRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemCreateRequest <em>List Of Monitored Item Create Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Monitored Item Create Request</em>' containment reference.
	 * @see #getListOfMonitoredItemCreateRequest()
	 * @generated
	 */
	void setListOfMonitoredItemCreateRequest(ListOfMonitoredItemCreateRequest value);

	/**
	 * Returns the value of the '<em><b>List Of Monitored Item Create Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Monitored Item Create Result</em>' containment reference.
	 * @see #setListOfMonitoredItemCreateResult(ListOfMonitoredItemCreateResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfMonitoredItemCreateResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfMonitoredItemCreateResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfMonitoredItemCreateResult getListOfMonitoredItemCreateResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemCreateResult <em>List Of Monitored Item Create Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Monitored Item Create Result</em>' containment reference.
	 * @see #getListOfMonitoredItemCreateResult()
	 * @generated
	 */
	void setListOfMonitoredItemCreateResult(ListOfMonitoredItemCreateResult value);

	/**
	 * Returns the value of the '<em><b>List Of Monitored Item Modify Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Monitored Item Modify Request</em>' containment reference.
	 * @see #setListOfMonitoredItemModifyRequest(ListOfMonitoredItemModifyRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfMonitoredItemModifyRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfMonitoredItemModifyRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfMonitoredItemModifyRequest getListOfMonitoredItemModifyRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemModifyRequest <em>List Of Monitored Item Modify Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Monitored Item Modify Request</em>' containment reference.
	 * @see #getListOfMonitoredItemModifyRequest()
	 * @generated
	 */
	void setListOfMonitoredItemModifyRequest(ListOfMonitoredItemModifyRequest value);

	/**
	 * Returns the value of the '<em><b>List Of Monitored Item Modify Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Monitored Item Modify Result</em>' containment reference.
	 * @see #setListOfMonitoredItemModifyResult(ListOfMonitoredItemModifyResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfMonitoredItemModifyResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfMonitoredItemModifyResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfMonitoredItemModifyResult getListOfMonitoredItemModifyResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemModifyResult <em>List Of Monitored Item Modify Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Monitored Item Modify Result</em>' containment reference.
	 * @see #getListOfMonitoredItemModifyResult()
	 * @generated
	 */
	void setListOfMonitoredItemModifyResult(ListOfMonitoredItemModifyResult value);

	/**
	 * Returns the value of the '<em><b>List Of Monitored Item Notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Monitored Item Notification</em>' containment reference.
	 * @see #setListOfMonitoredItemNotification(ListOfMonitoredItemNotification)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfMonitoredItemNotification()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfMonitoredItemNotification' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfMonitoredItemNotification getListOfMonitoredItemNotification();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemNotification <em>List Of Monitored Item Notification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Monitored Item Notification</em>' containment reference.
	 * @see #getListOfMonitoredItemNotification()
	 * @generated
	 */
	void setListOfMonitoredItemNotification(ListOfMonitoredItemNotification value);

	/**
	 * Returns the value of the '<em><b>List Of Network Address Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Network Address Data Type</em>' containment reference.
	 * @see #setListOfNetworkAddressDataType(ListOfNetworkAddressDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfNetworkAddressDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfNetworkAddressDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfNetworkAddressDataType getListOfNetworkAddressDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNetworkAddressDataType <em>List Of Network Address Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Network Address Data Type</em>' containment reference.
	 * @see #getListOfNetworkAddressDataType()
	 * @generated
	 */
	void setListOfNetworkAddressDataType(ListOfNetworkAddressDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Network Address Url Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Network Address Url Data Type</em>' containment reference.
	 * @see #setListOfNetworkAddressUrlDataType(ListOfNetworkAddressUrlDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfNetworkAddressUrlDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfNetworkAddressUrlDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfNetworkAddressUrlDataType getListOfNetworkAddressUrlDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNetworkAddressUrlDataType <em>List Of Network Address Url Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Network Address Url Data Type</em>' containment reference.
	 * @see #getListOfNetworkAddressUrlDataType()
	 * @generated
	 */
	void setListOfNetworkAddressUrlDataType(ListOfNetworkAddressUrlDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Network Group Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Network Group Data Type</em>' containment reference.
	 * @see #setListOfNetworkGroupDataType(ListOfNetworkGroupDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfNetworkGroupDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfNetworkGroupDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfNetworkGroupDataType getListOfNetworkGroupDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNetworkGroupDataType <em>List Of Network Group Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Network Group Data Type</em>' containment reference.
	 * @see #getListOfNetworkGroupDataType()
	 * @generated
	 */
	void setListOfNetworkGroupDataType(ListOfNetworkGroupDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Node</em>' containment reference.
	 * @see #setListOfNode(ListOfNode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfNode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfNode' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfNode getListOfNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNode <em>List Of Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Node</em>' containment reference.
	 * @see #getListOfNode()
	 * @generated
	 */
	void setListOfNode(ListOfNode value);

	/**
	 * Returns the value of the '<em><b>List Of Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Node Id</em>' containment reference.
	 * @see #setListOfNodeId(ListOfNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfNodeId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfNodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfNodeId getListOfNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNodeId <em>List Of Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Node Id</em>' containment reference.
	 * @see #getListOfNodeId()
	 * @generated
	 */
	void setListOfNodeId(ListOfNodeId value);

	/**
	 * Returns the value of the '<em><b>List Of Node Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Node Reference</em>' containment reference.
	 * @see #setListOfNodeReference(ListOfNodeReference)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfNodeReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfNodeReference' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfNodeReference getListOfNodeReference();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNodeReference <em>List Of Node Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Node Reference</em>' containment reference.
	 * @see #getListOfNodeReference()
	 * @generated
	 */
	void setListOfNodeReference(ListOfNodeReference value);

	/**
	 * Returns the value of the '<em><b>List Of Node Type Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Node Type Description</em>' containment reference.
	 * @see #setListOfNodeTypeDescription(ListOfNodeTypeDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfNodeTypeDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfNodeTypeDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfNodeTypeDescription getListOfNodeTypeDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNodeTypeDescription <em>List Of Node Type Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Node Type Description</em>' containment reference.
	 * @see #getListOfNodeTypeDescription()
	 * @generated
	 */
	void setListOfNodeTypeDescription(ListOfNodeTypeDescription value);

	/**
	 * Returns the value of the '<em><b>List Of Open File Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Open File Mode</em>' containment reference.
	 * @see #setListOfOpenFileMode(ListOfOpenFileMode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfOpenFileMode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfOpenFileMode' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfOpenFileMode getListOfOpenFileMode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOpenFileMode <em>List Of Open File Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Open File Mode</em>' containment reference.
	 * @see #getListOfOpenFileMode()
	 * @generated
	 */
	void setListOfOpenFileMode(ListOfOpenFileMode value);

	/**
	 * Returns the value of the '<em><b>List Of Option Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Option Set</em>' containment reference.
	 * @see #setListOfOptionSet(ListOfOptionSet)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfOptionSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfOptionSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfOptionSet getListOfOptionSet();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOptionSet <em>List Of Option Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Option Set</em>' containment reference.
	 * @see #getListOfOptionSet()
	 * @generated
	 */
	void setListOfOptionSet(ListOfOptionSet value);

	/**
	 * Returns the value of the '<em><b>List Of Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Orientation</em>' containment reference.
	 * @see #setListOfOrientation(ListOfOrientation)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfOrientation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfOrientation' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfOrientation getListOfOrientation();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOrientation <em>List Of Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Orientation</em>' containment reference.
	 * @see #getListOfOrientation()
	 * @generated
	 */
	void setListOfOrientation(ListOfOrientation value);

	/**
	 * Returns the value of the '<em><b>List Of Override Value Handling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Override Value Handling</em>' containment reference.
	 * @see #setListOfOverrideValueHandling(ListOfOverrideValueHandling)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfOverrideValueHandling()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfOverrideValueHandling' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfOverrideValueHandling getListOfOverrideValueHandling();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOverrideValueHandling <em>List Of Override Value Handling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Override Value Handling</em>' containment reference.
	 * @see #getListOfOverrideValueHandling()
	 * @generated
	 */
	void setListOfOverrideValueHandling(ListOfOverrideValueHandling value);

	/**
	 * Returns the value of the '<em><b>List Of Parsing Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Parsing Result</em>' containment reference.
	 * @see #setListOfParsingResult(ListOfParsingResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfParsingResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfParsingResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfParsingResult getListOfParsingResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfParsingResult <em>List Of Parsing Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Parsing Result</em>' containment reference.
	 * @see #getListOfParsingResult()
	 * @generated
	 */
	void setListOfParsingResult(ListOfParsingResult value);

	/**
	 * Returns the value of the '<em><b>List Of Published Data Items Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Published Data Items Data Type</em>' containment reference.
	 * @see #setListOfPublishedDataItemsDataType(ListOfPublishedDataItemsDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfPublishedDataItemsDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfPublishedDataItemsDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfPublishedDataItemsDataType getListOfPublishedDataItemsDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedDataItemsDataType <em>List Of Published Data Items Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Published Data Items Data Type</em>' containment reference.
	 * @see #getListOfPublishedDataItemsDataType()
	 * @generated
	 */
	void setListOfPublishedDataItemsDataType(ListOfPublishedDataItemsDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Published Data Set Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Published Data Set Data Type</em>' containment reference.
	 * @see #setListOfPublishedDataSetDataType(ListOfPublishedDataSetDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfPublishedDataSetDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfPublishedDataSetDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfPublishedDataSetDataType getListOfPublishedDataSetDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedDataSetDataType <em>List Of Published Data Set Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Published Data Set Data Type</em>' containment reference.
	 * @see #getListOfPublishedDataSetDataType()
	 * @generated
	 */
	void setListOfPublishedDataSetDataType(ListOfPublishedDataSetDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Published Data Set Source Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Published Data Set Source Data Type</em>' containment reference.
	 * @see #setListOfPublishedDataSetSourceDataType(ListOfPublishedDataSetSourceDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfPublishedDataSetSourceDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfPublishedDataSetSourceDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfPublishedDataSetSourceDataType getListOfPublishedDataSetSourceDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedDataSetSourceDataType <em>List Of Published Data Set Source Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Published Data Set Source Data Type</em>' containment reference.
	 * @see #getListOfPublishedDataSetSourceDataType()
	 * @generated
	 */
	void setListOfPublishedDataSetSourceDataType(ListOfPublishedDataSetSourceDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Published Events Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Published Events Data Type</em>' containment reference.
	 * @see #setListOfPublishedEventsDataType(ListOfPublishedEventsDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfPublishedEventsDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfPublishedEventsDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfPublishedEventsDataType getListOfPublishedEventsDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedEventsDataType <em>List Of Published Events Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Published Events Data Type</em>' containment reference.
	 * @see #getListOfPublishedEventsDataType()
	 * @generated
	 */
	void setListOfPublishedEventsDataType(ListOfPublishedEventsDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Published Variable Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Published Variable Data Type</em>' containment reference.
	 * @see #setListOfPublishedVariableDataType(ListOfPublishedVariableDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfPublishedVariableDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfPublishedVariableDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfPublishedVariableDataType getListOfPublishedVariableDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedVariableDataType <em>List Of Published Variable Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Published Variable Data Type</em>' containment reference.
	 * @see #getListOfPublishedVariableDataType()
	 * @generated
	 */
	void setListOfPublishedVariableDataType(ListOfPublishedVariableDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Pub Sub Configuration Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Pub Sub Configuration Data Type</em>' containment reference.
	 * @see #setListOfPubSubConfigurationDataType(ListOfPubSubConfigurationDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfPubSubConfigurationDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfPubSubConfigurationDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfPubSubConfigurationDataType getListOfPubSubConfigurationDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubConfigurationDataType <em>List Of Pub Sub Configuration Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Pub Sub Configuration Data Type</em>' containment reference.
	 * @see #getListOfPubSubConfigurationDataType()
	 * @generated
	 */
	void setListOfPubSubConfigurationDataType(ListOfPubSubConfigurationDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Pub Sub Connection Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Pub Sub Connection Data Type</em>' containment reference.
	 * @see #setListOfPubSubConnectionDataType(ListOfPubSubConnectionDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfPubSubConnectionDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfPubSubConnectionDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfPubSubConnectionDataType getListOfPubSubConnectionDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubConnectionDataType <em>List Of Pub Sub Connection Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Pub Sub Connection Data Type</em>' containment reference.
	 * @see #getListOfPubSubConnectionDataType()
	 * @generated
	 */
	void setListOfPubSubConnectionDataType(ListOfPubSubConnectionDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Pub Sub Diagnostics Counter Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Pub Sub Diagnostics Counter Classification</em>' containment reference.
	 * @see #setListOfPubSubDiagnosticsCounterClassification(ListOfPubSubDiagnosticsCounterClassification)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfPubSubDiagnosticsCounterClassification()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfPubSubDiagnosticsCounterClassification' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfPubSubDiagnosticsCounterClassification getListOfPubSubDiagnosticsCounterClassification();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubDiagnosticsCounterClassification <em>List Of Pub Sub Diagnostics Counter Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Pub Sub Diagnostics Counter Classification</em>' containment reference.
	 * @see #getListOfPubSubDiagnosticsCounterClassification()
	 * @generated
	 */
	void setListOfPubSubDiagnosticsCounterClassification(ListOfPubSubDiagnosticsCounterClassification value);

	/**
	 * Returns the value of the '<em><b>List Of Pub Sub Group Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Pub Sub Group Data Type</em>' containment reference.
	 * @see #setListOfPubSubGroupDataType(ListOfPubSubGroupDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfPubSubGroupDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfPubSubGroupDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfPubSubGroupDataType getListOfPubSubGroupDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubGroupDataType <em>List Of Pub Sub Group Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Pub Sub Group Data Type</em>' containment reference.
	 * @see #getListOfPubSubGroupDataType()
	 * @generated
	 */
	void setListOfPubSubGroupDataType(ListOfPubSubGroupDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Pub Sub State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Pub Sub State</em>' containment reference.
	 * @see #setListOfPubSubState(ListOfPubSubState)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfPubSubState()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfPubSubState' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfPubSubState getListOfPubSubState();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubState <em>List Of Pub Sub State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Pub Sub State</em>' containment reference.
	 * @see #getListOfPubSubState()
	 * @generated
	 */
	void setListOfPubSubState(ListOfPubSubState value);

	/**
	 * Returns the value of the '<em><b>List Of Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Qualified Name</em>' containment reference.
	 * @see #setListOfQualifiedName(ListOfQualifiedName)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfQualifiedName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfQualifiedName' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfQualifiedName getListOfQualifiedName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfQualifiedName <em>List Of Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Qualified Name</em>' containment reference.
	 * @see #getListOfQualifiedName()
	 * @generated
	 */
	void setListOfQualifiedName(ListOfQualifiedName value);

	/**
	 * Returns the value of the '<em><b>List Of Query Data Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Query Data Description</em>' containment reference.
	 * @see #setListOfQueryDataDescription(ListOfQueryDataDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfQueryDataDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfQueryDataDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfQueryDataDescription getListOfQueryDataDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfQueryDataDescription <em>List Of Query Data Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Query Data Description</em>' containment reference.
	 * @see #getListOfQueryDataDescription()
	 * @generated
	 */
	void setListOfQueryDataDescription(ListOfQueryDataDescription value);

	/**
	 * Returns the value of the '<em><b>List Of Query Data Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Query Data Set</em>' containment reference.
	 * @see #setListOfQueryDataSet(ListOfQueryDataSet)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfQueryDataSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfQueryDataSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfQueryDataSet getListOfQueryDataSet();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfQueryDataSet <em>List Of Query Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Query Data Set</em>' containment reference.
	 * @see #getListOfQueryDataSet()
	 * @generated
	 */
	void setListOfQueryDataSet(ListOfQueryDataSet value);

	/**
	 * Returns the value of the '<em><b>List Of Rational Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Rational Number</em>' containment reference.
	 * @see #setListOfRationalNumber(ListOfRationalNumber)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfRationalNumber()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfRationalNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfRationalNumber getListOfRationalNumber();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRationalNumber <em>List Of Rational Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Rational Number</em>' containment reference.
	 * @see #getListOfRationalNumber()
	 * @generated
	 */
	void setListOfRationalNumber(ListOfRationalNumber value);

	/**
	 * Returns the value of the '<em><b>List Of Reader Group Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Reader Group Data Type</em>' containment reference.
	 * @see #setListOfReaderGroupDataType(ListOfReaderGroupDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfReaderGroupDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfReaderGroupDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfReaderGroupDataType getListOfReaderGroupDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReaderGroupDataType <em>List Of Reader Group Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Reader Group Data Type</em>' containment reference.
	 * @see #getListOfReaderGroupDataType()
	 * @generated
	 */
	void setListOfReaderGroupDataType(ListOfReaderGroupDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Reader Group Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Reader Group Message Data Type</em>' containment reference.
	 * @see #setListOfReaderGroupMessageDataType(ListOfReaderGroupMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfReaderGroupMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfReaderGroupMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfReaderGroupMessageDataType getListOfReaderGroupMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReaderGroupMessageDataType <em>List Of Reader Group Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Reader Group Message Data Type</em>' containment reference.
	 * @see #getListOfReaderGroupMessageDataType()
	 * @generated
	 */
	void setListOfReaderGroupMessageDataType(ListOfReaderGroupMessageDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Reader Group Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Reader Group Transport Data Type</em>' containment reference.
	 * @see #setListOfReaderGroupTransportDataType(ListOfReaderGroupTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfReaderGroupTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfReaderGroupTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfReaderGroupTransportDataType getListOfReaderGroupTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReaderGroupTransportDataType <em>List Of Reader Group Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Reader Group Transport Data Type</em>' containment reference.
	 * @see #getListOfReaderGroupTransportDataType()
	 * @generated
	 */
	void setListOfReaderGroupTransportDataType(ListOfReaderGroupTransportDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Read Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Read Value Id</em>' containment reference.
	 * @see #setListOfReadValueId(ListOfReadValueId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfReadValueId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfReadValueId' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfReadValueId getListOfReadValueId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReadValueId <em>List Of Read Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Read Value Id</em>' containment reference.
	 * @see #getListOfReadValueId()
	 * @generated
	 */
	void setListOfReadValueId(ListOfReadValueId value);

	/**
	 * Returns the value of the '<em><b>List Of Redundant Server Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Redundant Server Data Type</em>' containment reference.
	 * @see #setListOfRedundantServerDataType(ListOfRedundantServerDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfRedundantServerDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfRedundantServerDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfRedundantServerDataType getListOfRedundantServerDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRedundantServerDataType <em>List Of Redundant Server Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Redundant Server Data Type</em>' containment reference.
	 * @see #getListOfRedundantServerDataType()
	 * @generated
	 */
	void setListOfRedundantServerDataType(ListOfRedundantServerDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Reference Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Reference Description</em>' containment reference.
	 * @see #setListOfReferenceDescription(ListOfReferenceDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfReferenceDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfReferenceDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfReferenceDescription getListOfReferenceDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReferenceDescription <em>List Of Reference Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Reference Description</em>' containment reference.
	 * @see #getListOfReferenceDescription()
	 * @generated
	 */
	void setListOfReferenceDescription(ListOfReferenceDescription value);

	/**
	 * Returns the value of the '<em><b>List Of Reference Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Reference Node</em>' containment reference.
	 * @see #setListOfReferenceNode(ListOfReferenceNode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfReferenceNode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfReferenceNode' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfReferenceNode getListOfReferenceNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReferenceNode <em>List Of Reference Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Reference Node</em>' containment reference.
	 * @see #getListOfReferenceNode()
	 * @generated
	 */
	void setListOfReferenceNode(ListOfReferenceNode value);

	/**
	 * Returns the value of the '<em><b>List Of Registered Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Registered Server</em>' containment reference.
	 * @see #setListOfRegisteredServer(ListOfRegisteredServer)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfRegisteredServer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfRegisteredServer' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfRegisteredServer getListOfRegisteredServer();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRegisteredServer <em>List Of Registered Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Registered Server</em>' containment reference.
	 * @see #getListOfRegisteredServer()
	 * @generated
	 */
	void setListOfRegisteredServer(ListOfRegisteredServer value);

	/**
	 * Returns the value of the '<em><b>List Of Relative Path Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Relative Path Element</em>' containment reference.
	 * @see #setListOfRelativePathElement(ListOfRelativePathElement)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfRelativePathElement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfRelativePathElement' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfRelativePathElement getListOfRelativePathElement();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRelativePathElement <em>List Of Relative Path Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Relative Path Element</em>' containment reference.
	 * @see #getListOfRelativePathElement()
	 * @generated
	 */
	void setListOfRelativePathElement(ListOfRelativePathElement value);

	/**
	 * Returns the value of the '<em><b>List Of Role Permission Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Role Permission Type</em>' containment reference.
	 * @see #setListOfRolePermissionType(ListOfRolePermissionType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfRolePermissionType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfRolePermissionType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfRolePermissionType getListOfRolePermissionType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRolePermissionType <em>List Of Role Permission Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Role Permission Type</em>' containment reference.
	 * @see #getListOfRolePermissionType()
	 * @generated
	 */
	void setListOfRolePermissionType(ListOfRolePermissionType value);

	/**
	 * Returns the value of the '<em><b>List Of Sampling Interval Diagnostics Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Sampling Interval Diagnostics Data Type</em>' containment reference.
	 * @see #setListOfSamplingIntervalDiagnosticsDataType(ListOfSamplingIntervalDiagnosticsDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfSamplingIntervalDiagnosticsDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfSamplingIntervalDiagnosticsDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfSamplingIntervalDiagnosticsDataType getListOfSamplingIntervalDiagnosticsDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSamplingIntervalDiagnosticsDataType <em>List Of Sampling Interval Diagnostics Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Sampling Interval Diagnostics Data Type</em>' containment reference.
	 * @see #getListOfSamplingIntervalDiagnosticsDataType()
	 * @generated
	 */
	void setListOfSamplingIntervalDiagnosticsDataType(ListOfSamplingIntervalDiagnosticsDataType value);

	/**
	 * Returns the value of the '<em><b>List Of SByte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of SByte</em>' containment reference.
	 * @see #setListOfSByte(ListOfSByte)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfSByte()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfSByte' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfSByte getListOfSByte();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSByte <em>List Of SByte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of SByte</em>' containment reference.
	 * @see #getListOfSByte()
	 * @generated
	 */
	void setListOfSByte(ListOfSByte value);

	/**
	 * Returns the value of the '<em><b>List Of Semantic Change Structure Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Semantic Change Structure Data Type</em>' containment reference.
	 * @see #setListOfSemanticChangeStructureDataType(ListOfSemanticChangeStructureDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfSemanticChangeStructureDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfSemanticChangeStructureDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfSemanticChangeStructureDataType getListOfSemanticChangeStructureDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSemanticChangeStructureDataType <em>List Of Semantic Change Structure Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Semantic Change Structure Data Type</em>' containment reference.
	 * @see #getListOfSemanticChangeStructureDataType()
	 * @generated
	 */
	void setListOfSemanticChangeStructureDataType(ListOfSemanticChangeStructureDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Server On Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Server On Network</em>' containment reference.
	 * @see #setListOfServerOnNetwork(ListOfServerOnNetwork)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfServerOnNetwork()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfServerOnNetwork' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfServerOnNetwork getListOfServerOnNetwork();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfServerOnNetwork <em>List Of Server On Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Server On Network</em>' containment reference.
	 * @see #getListOfServerOnNetwork()
	 * @generated
	 */
	void setListOfServerOnNetwork(ListOfServerOnNetwork value);

	/**
	 * Returns the value of the '<em><b>List Of Session Diagnostics Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Session Diagnostics Data Type</em>' containment reference.
	 * @see #setListOfSessionDiagnosticsDataType(ListOfSessionDiagnosticsDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfSessionDiagnosticsDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfSessionDiagnosticsDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfSessionDiagnosticsDataType getListOfSessionDiagnosticsDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSessionDiagnosticsDataType <em>List Of Session Diagnostics Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Session Diagnostics Data Type</em>' containment reference.
	 * @see #getListOfSessionDiagnosticsDataType()
	 * @generated
	 */
	void setListOfSessionDiagnosticsDataType(ListOfSessionDiagnosticsDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Session Security Diagnostics Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Session Security Diagnostics Data Type</em>' containment reference.
	 * @see #setListOfSessionSecurityDiagnosticsDataType(ListOfSessionSecurityDiagnosticsDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfSessionSecurityDiagnosticsDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfSessionSecurityDiagnosticsDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfSessionSecurityDiagnosticsDataType getListOfSessionSecurityDiagnosticsDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSessionSecurityDiagnosticsDataType <em>List Of Session Security Diagnostics Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Session Security Diagnostics Data Type</em>' containment reference.
	 * @see #getListOfSessionSecurityDiagnosticsDataType()
	 * @generated
	 */
	void setListOfSessionSecurityDiagnosticsDataType(ListOfSessionSecurityDiagnosticsDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Signed Software Certificate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Signed Software Certificate</em>' containment reference.
	 * @see #setListOfSignedSoftwareCertificate(ListOfSignedSoftwareCertificate)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfSignedSoftwareCertificate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfSignedSoftwareCertificate' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfSignedSoftwareCertificate getListOfSignedSoftwareCertificate();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSignedSoftwareCertificate <em>List Of Signed Software Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Signed Software Certificate</em>' containment reference.
	 * @see #getListOfSignedSoftwareCertificate()
	 * @generated
	 */
	void setListOfSignedSoftwareCertificate(ListOfSignedSoftwareCertificate value);

	/**
	 * Returns the value of the '<em><b>List Of Simple Attribute Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Simple Attribute Operand</em>' containment reference.
	 * @see #setListOfSimpleAttributeOperand(ListOfSimpleAttributeOperand)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfSimpleAttributeOperand()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfSimpleAttributeOperand' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfSimpleAttributeOperand getListOfSimpleAttributeOperand();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSimpleAttributeOperand <em>List Of Simple Attribute Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Simple Attribute Operand</em>' containment reference.
	 * @see #getListOfSimpleAttributeOperand()
	 * @generated
	 */
	void setListOfSimpleAttributeOperand(ListOfSimpleAttributeOperand value);

	/**
	 * Returns the value of the '<em><b>List Of Simple Type Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Simple Type Description</em>' containment reference.
	 * @see #setListOfSimpleTypeDescription(ListOfSimpleTypeDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfSimpleTypeDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfSimpleTypeDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfSimpleTypeDescription getListOfSimpleTypeDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSimpleTypeDescription <em>List Of Simple Type Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Simple Type Description</em>' containment reference.
	 * @see #getListOfSimpleTypeDescription()
	 * @generated
	 */
	void setListOfSimpleTypeDescription(ListOfSimpleTypeDescription value);

	/**
	 * Returns the value of the '<em><b>List Of Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Status Code</em>' containment reference.
	 * @see #setListOfStatusCode(ListOfStatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfStatusCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfStatusCode' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfStatusCode getListOfStatusCode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStatusCode <em>List Of Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Status Code</em>' containment reference.
	 * @see #getListOfStatusCode()
	 * @generated
	 */
	void setListOfStatusCode(ListOfStatusCode value);

	/**
	 * Returns the value of the '<em><b>List Of Status Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Status Result</em>' containment reference.
	 * @see #setListOfStatusResult(ListOfStatusResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfStatusResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfStatusResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfStatusResult getListOfStatusResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStatusResult <em>List Of Status Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Status Result</em>' containment reference.
	 * @see #getListOfStatusResult()
	 * @generated
	 */
	void setListOfStatusResult(ListOfStatusResult value);

	/**
	 * Returns the value of the '<em><b>List Of String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of String</em>' containment reference.
	 * @see #setListOfString(ListOfString)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfString()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfString' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfString getListOfString();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfString <em>List Of String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of String</em>' containment reference.
	 * @see #getListOfString()
	 * @generated
	 */
	void setListOfString(ListOfString value);

	/**
	 * Returns the value of the '<em><b>List Of Structure Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Structure Definition</em>' containment reference.
	 * @see #setListOfStructureDefinition(ListOfStructureDefinition)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfStructureDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfStructureDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfStructureDefinition getListOfStructureDefinition();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStructureDefinition <em>List Of Structure Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Structure Definition</em>' containment reference.
	 * @see #getListOfStructureDefinition()
	 * @generated
	 */
	void setListOfStructureDefinition(ListOfStructureDefinition value);

	/**
	 * Returns the value of the '<em><b>List Of Structure Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Structure Description</em>' containment reference.
	 * @see #setListOfStructureDescription(ListOfStructureDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfStructureDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfStructureDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfStructureDescription getListOfStructureDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStructureDescription <em>List Of Structure Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Structure Description</em>' containment reference.
	 * @see #getListOfStructureDescription()
	 * @generated
	 */
	void setListOfStructureDescription(ListOfStructureDescription value);

	/**
	 * Returns the value of the '<em><b>List Of Structure Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Structure Field</em>' containment reference.
	 * @see #setListOfStructureField(ListOfStructureField)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfStructureField()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfStructureField' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfStructureField getListOfStructureField();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStructureField <em>List Of Structure Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Structure Field</em>' containment reference.
	 * @see #getListOfStructureField()
	 * @generated
	 */
	void setListOfStructureField(ListOfStructureField value);

	/**
	 * Returns the value of the '<em><b>List Of Subscribed Data Set Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Subscribed Data Set Data Type</em>' containment reference.
	 * @see #setListOfSubscribedDataSetDataType(ListOfSubscribedDataSetDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfSubscribedDataSetDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfSubscribedDataSetDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfSubscribedDataSetDataType getListOfSubscribedDataSetDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscribedDataSetDataType <em>List Of Subscribed Data Set Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Subscribed Data Set Data Type</em>' containment reference.
	 * @see #getListOfSubscribedDataSetDataType()
	 * @generated
	 */
	void setListOfSubscribedDataSetDataType(ListOfSubscribedDataSetDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Subscribed Data Set Mirror Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Subscribed Data Set Mirror Data Type</em>' containment reference.
	 * @see #setListOfSubscribedDataSetMirrorDataType(ListOfSubscribedDataSetMirrorDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfSubscribedDataSetMirrorDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfSubscribedDataSetMirrorDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfSubscribedDataSetMirrorDataType getListOfSubscribedDataSetMirrorDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscribedDataSetMirrorDataType <em>List Of Subscribed Data Set Mirror Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Subscribed Data Set Mirror Data Type</em>' containment reference.
	 * @see #getListOfSubscribedDataSetMirrorDataType()
	 * @generated
	 */
	void setListOfSubscribedDataSetMirrorDataType(ListOfSubscribedDataSetMirrorDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Subscription Acknowledgement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Subscription Acknowledgement</em>' containment reference.
	 * @see #setListOfSubscriptionAcknowledgement(ListOfSubscriptionAcknowledgement)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfSubscriptionAcknowledgement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfSubscriptionAcknowledgement' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfSubscriptionAcknowledgement getListOfSubscriptionAcknowledgement();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscriptionAcknowledgement <em>List Of Subscription Acknowledgement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Subscription Acknowledgement</em>' containment reference.
	 * @see #getListOfSubscriptionAcknowledgement()
	 * @generated
	 */
	void setListOfSubscriptionAcknowledgement(ListOfSubscriptionAcknowledgement value);

	/**
	 * Returns the value of the '<em><b>List Of Subscription Diagnostics Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Subscription Diagnostics Data Type</em>' containment reference.
	 * @see #setListOfSubscriptionDiagnosticsDataType(ListOfSubscriptionDiagnosticsDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfSubscriptionDiagnosticsDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfSubscriptionDiagnosticsDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfSubscriptionDiagnosticsDataType getListOfSubscriptionDiagnosticsDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscriptionDiagnosticsDataType <em>List Of Subscription Diagnostics Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Subscription Diagnostics Data Type</em>' containment reference.
	 * @see #getListOfSubscriptionDiagnosticsDataType()
	 * @generated
	 */
	void setListOfSubscriptionDiagnosticsDataType(ListOfSubscriptionDiagnosticsDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Target Variables Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Target Variables Data Type</em>' containment reference.
	 * @see #setListOfTargetVariablesDataType(ListOfTargetVariablesDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfTargetVariablesDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfTargetVariablesDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfTargetVariablesDataType getListOfTargetVariablesDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTargetVariablesDataType <em>List Of Target Variables Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Target Variables Data Type</em>' containment reference.
	 * @see #getListOfTargetVariablesDataType()
	 * @generated
	 */
	void setListOfTargetVariablesDataType(ListOfTargetVariablesDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Three DCartesian Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Three DCartesian Coordinates</em>' containment reference.
	 * @see #setListOfThreeDCartesianCoordinates(ListOfThreeDCartesianCoordinates)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfThreeDCartesianCoordinates()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfThreeDCartesianCoordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfThreeDCartesianCoordinates getListOfThreeDCartesianCoordinates();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDCartesianCoordinates <em>List Of Three DCartesian Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Three DCartesian Coordinates</em>' containment reference.
	 * @see #getListOfThreeDCartesianCoordinates()
	 * @generated
	 */
	void setListOfThreeDCartesianCoordinates(ListOfThreeDCartesianCoordinates value);

	/**
	 * Returns the value of the '<em><b>List Of Three DFrame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Three DFrame</em>' containment reference.
	 * @see #setListOfThreeDFrame(ListOfThreeDFrame)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfThreeDFrame()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfThreeDFrame' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfThreeDFrame getListOfThreeDFrame();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDFrame <em>List Of Three DFrame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Three DFrame</em>' containment reference.
	 * @see #getListOfThreeDFrame()
	 * @generated
	 */
	void setListOfThreeDFrame(ListOfThreeDFrame value);

	/**
	 * Returns the value of the '<em><b>List Of Three DOrientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Three DOrientation</em>' containment reference.
	 * @see #setListOfThreeDOrientation(ListOfThreeDOrientation)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfThreeDOrientation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfThreeDOrientation' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfThreeDOrientation getListOfThreeDOrientation();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDOrientation <em>List Of Three DOrientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Three DOrientation</em>' containment reference.
	 * @see #getListOfThreeDOrientation()
	 * @generated
	 */
	void setListOfThreeDOrientation(ListOfThreeDOrientation value);

	/**
	 * Returns the value of the '<em><b>List Of Three DVector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Three DVector</em>' containment reference.
	 * @see #setListOfThreeDVector(ListOfThreeDVector)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfThreeDVector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfThreeDVector' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfThreeDVector getListOfThreeDVector();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDVector <em>List Of Three DVector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Three DVector</em>' containment reference.
	 * @see #getListOfThreeDVector()
	 * @generated
	 */
	void setListOfThreeDVector(ListOfThreeDVector value);

	/**
	 * Returns the value of the '<em><b>List Of Time Zone Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Time Zone Data Type</em>' containment reference.
	 * @see #setListOfTimeZoneDataType(ListOfTimeZoneDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfTimeZoneDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfTimeZoneDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfTimeZoneDataType getListOfTimeZoneDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTimeZoneDataType <em>List Of Time Zone Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Time Zone Data Type</em>' containment reference.
	 * @see #getListOfTimeZoneDataType()
	 * @generated
	 */
	void setListOfTimeZoneDataType(ListOfTimeZoneDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Transfer Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Transfer Result</em>' containment reference.
	 * @see #setListOfTransferResult(ListOfTransferResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfTransferResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfTransferResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfTransferResult getListOfTransferResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTransferResult <em>List Of Transfer Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Transfer Result</em>' containment reference.
	 * @see #getListOfTransferResult()
	 * @generated
	 */
	void setListOfTransferResult(ListOfTransferResult value);

	/**
	 * Returns the value of the '<em><b>List Of Trust List Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Trust List Data Type</em>' containment reference.
	 * @see #setListOfTrustListDataType(ListOfTrustListDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfTrustListDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfTrustListDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfTrustListDataType getListOfTrustListDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTrustListDataType <em>List Of Trust List Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Trust List Data Type</em>' containment reference.
	 * @see #getListOfTrustListDataType()
	 * @generated
	 */
	void setListOfTrustListDataType(ListOfTrustListDataType value);

	/**
	 * Returns the value of the '<em><b>List Of UA Binary File Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of UA Binary File Data Type</em>' containment reference.
	 * @see #setListOfUABinaryFileDataType(ListOfUABinaryFileDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfUABinaryFileDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfUABinaryFileDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUABinaryFileDataType getListOfUABinaryFileDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUABinaryFileDataType <em>List Of UA Binary File Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of UA Binary File Data Type</em>' containment reference.
	 * @see #getListOfUABinaryFileDataType()
	 * @generated
	 */
	void setListOfUABinaryFileDataType(ListOfUABinaryFileDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Uadp Data Set Message Content Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Uadp Data Set Message Content Mask</em>' containment reference.
	 * @see #setListOfUadpDataSetMessageContentMask(ListOfUadpDataSetMessageContentMask)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfUadpDataSetMessageContentMask()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfUadpDataSetMessageContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUadpDataSetMessageContentMask getListOfUadpDataSetMessageContentMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpDataSetMessageContentMask <em>List Of Uadp Data Set Message Content Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Uadp Data Set Message Content Mask</em>' containment reference.
	 * @see #getListOfUadpDataSetMessageContentMask()
	 * @generated
	 */
	void setListOfUadpDataSetMessageContentMask(ListOfUadpDataSetMessageContentMask value);

	/**
	 * Returns the value of the '<em><b>List Of Uadp Data Set Reader Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Uadp Data Set Reader Message Data Type</em>' containment reference.
	 * @see #setListOfUadpDataSetReaderMessageDataType(ListOfUadpDataSetReaderMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfUadpDataSetReaderMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfUadpDataSetReaderMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUadpDataSetReaderMessageDataType getListOfUadpDataSetReaderMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpDataSetReaderMessageDataType <em>List Of Uadp Data Set Reader Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Uadp Data Set Reader Message Data Type</em>' containment reference.
	 * @see #getListOfUadpDataSetReaderMessageDataType()
	 * @generated
	 */
	void setListOfUadpDataSetReaderMessageDataType(ListOfUadpDataSetReaderMessageDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Uadp Data Set Writer Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Uadp Data Set Writer Message Data Type</em>' containment reference.
	 * @see #setListOfUadpDataSetWriterMessageDataType(ListOfUadpDataSetWriterMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfUadpDataSetWriterMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfUadpDataSetWriterMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUadpDataSetWriterMessageDataType getListOfUadpDataSetWriterMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpDataSetWriterMessageDataType <em>List Of Uadp Data Set Writer Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Uadp Data Set Writer Message Data Type</em>' containment reference.
	 * @see #getListOfUadpDataSetWriterMessageDataType()
	 * @generated
	 */
	void setListOfUadpDataSetWriterMessageDataType(ListOfUadpDataSetWriterMessageDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Uadp Network Message Content Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Uadp Network Message Content Mask</em>' containment reference.
	 * @see #setListOfUadpNetworkMessageContentMask(ListOfUadpNetworkMessageContentMask)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfUadpNetworkMessageContentMask()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfUadpNetworkMessageContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUadpNetworkMessageContentMask getListOfUadpNetworkMessageContentMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpNetworkMessageContentMask <em>List Of Uadp Network Message Content Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Uadp Network Message Content Mask</em>' containment reference.
	 * @see #getListOfUadpNetworkMessageContentMask()
	 * @generated
	 */
	void setListOfUadpNetworkMessageContentMask(ListOfUadpNetworkMessageContentMask value);

	/**
	 * Returns the value of the '<em><b>List Of Uadp Writer Group Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Uadp Writer Group Message Data Type</em>' containment reference.
	 * @see #setListOfUadpWriterGroupMessageDataType(ListOfUadpWriterGroupMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfUadpWriterGroupMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfUadpWriterGroupMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUadpWriterGroupMessageDataType getListOfUadpWriterGroupMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpWriterGroupMessageDataType <em>List Of Uadp Writer Group Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Uadp Writer Group Message Data Type</em>' containment reference.
	 * @see #getListOfUadpWriterGroupMessageDataType()
	 * @generated
	 */
	void setListOfUadpWriterGroupMessageDataType(ListOfUadpWriterGroupMessageDataType value);

	/**
	 * Returns the value of the '<em><b>List Of UInt16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of UInt16</em>' containment reference.
	 * @see #setListOfUInt16(ListOfUInt16)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfUInt16()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfUInt16' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUInt16 getListOfUInt16();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUInt16 <em>List Of UInt16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of UInt16</em>' containment reference.
	 * @see #getListOfUInt16()
	 * @generated
	 */
	void setListOfUInt16(ListOfUInt16 value);

	/**
	 * Returns the value of the '<em><b>List Of UInt32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of UInt32</em>' containment reference.
	 * @see #setListOfUInt32(ListOfUInt32)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfUInt32()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfUInt32' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUInt32 getListOfUInt32();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUInt32 <em>List Of UInt32</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of UInt32</em>' containment reference.
	 * @see #getListOfUInt32()
	 * @generated
	 */
	void setListOfUInt32(ListOfUInt32 value);

	/**
	 * Returns the value of the '<em><b>List Of UInt64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of UInt64</em>' containment reference.
	 * @see #setListOfUInt64(ListOfUInt64)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfUInt64()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfUInt64' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUInt64 getListOfUInt64();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUInt64 <em>List Of UInt64</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of UInt64</em>' containment reference.
	 * @see #getListOfUInt64()
	 * @generated
	 */
	void setListOfUInt64(ListOfUInt64 value);

	/**
	 * Returns the value of the '<em><b>List Of Union</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Union</em>' containment reference.
	 * @see #setListOfUnion(ListOfUnion)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfUnion()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfUnion' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUnion getListOfUnion();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUnion <em>List Of Union</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Union</em>' containment reference.
	 * @see #getListOfUnion()
	 * @generated
	 */
	void setListOfUnion(ListOfUnion value);

	/**
	 * Returns the value of the '<em><b>List Of User Token Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of User Token Policy</em>' containment reference.
	 * @see #setListOfUserTokenPolicy(ListOfUserTokenPolicy)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfUserTokenPolicy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfUserTokenPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfUserTokenPolicy getListOfUserTokenPolicy();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUserTokenPolicy <em>List Of User Token Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of User Token Policy</em>' containment reference.
	 * @see #getListOfUserTokenPolicy()
	 * @generated
	 */
	void setListOfUserTokenPolicy(ListOfUserTokenPolicy value);

	/**
	 * Returns the value of the '<em><b>List Of Variant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Variant</em>' containment reference.
	 * @see #setListOfVariant(ListOfVariant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfVariant()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfVariant' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfVariant getListOfVariant();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfVariant <em>List Of Variant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Variant</em>' containment reference.
	 * @see #getListOfVariant()
	 * @generated
	 */
	void setListOfVariant(ListOfVariant value);

	/**
	 * Returns the value of the '<em><b>List Of Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Vector</em>' containment reference.
	 * @see #setListOfVector(ListOfVector)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfVector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfVector' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfVector getListOfVector();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfVector <em>List Of Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Vector</em>' containment reference.
	 * @see #getListOfVector()
	 * @generated
	 */
	void setListOfVector(ListOfVector value);

	/**
	 * Returns the value of the '<em><b>List Of Writer Group Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Writer Group Data Type</em>' containment reference.
	 * @see #setListOfWriterGroupDataType(ListOfWriterGroupDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfWriterGroupDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfWriterGroupDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfWriterGroupDataType getListOfWriterGroupDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriterGroupDataType <em>List Of Writer Group Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Writer Group Data Type</em>' containment reference.
	 * @see #getListOfWriterGroupDataType()
	 * @generated
	 */
	void setListOfWriterGroupDataType(ListOfWriterGroupDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Writer Group Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Writer Group Message Data Type</em>' containment reference.
	 * @see #setListOfWriterGroupMessageDataType(ListOfWriterGroupMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfWriterGroupMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfWriterGroupMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfWriterGroupMessageDataType getListOfWriterGroupMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriterGroupMessageDataType <em>List Of Writer Group Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Writer Group Message Data Type</em>' containment reference.
	 * @see #getListOfWriterGroupMessageDataType()
	 * @generated
	 */
	void setListOfWriterGroupMessageDataType(ListOfWriterGroupMessageDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Writer Group Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Writer Group Transport Data Type</em>' containment reference.
	 * @see #setListOfWriterGroupTransportDataType(ListOfWriterGroupTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfWriterGroupTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfWriterGroupTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfWriterGroupTransportDataType getListOfWriterGroupTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriterGroupTransportDataType <em>List Of Writer Group Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Writer Group Transport Data Type</em>' containment reference.
	 * @see #getListOfWriterGroupTransportDataType()
	 * @generated
	 */
	void setListOfWriterGroupTransportDataType(ListOfWriterGroupTransportDataType value);

	/**
	 * Returns the value of the '<em><b>List Of Write Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Write Value</em>' containment reference.
	 * @see #setListOfWriteValue(ListOfWriteValue)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfWriteValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfWriteValue' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfWriteValue getListOfWriteValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriteValue <em>List Of Write Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Write Value</em>' containment reference.
	 * @see #getListOfWriteValue()
	 * @generated
	 */
	void setListOfWriteValue(ListOfWriteValue value);

	/**
	 * Returns the value of the '<em><b>List Of Xml Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Xml Element</em>' containment reference.
	 * @see #setListOfXmlElement(ListOfXmlElement)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ListOfXmlElement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListOfXmlElement' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfXmlElement getListOfXmlElement();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfXmlElement <em>List Of Xml Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Xml Element</em>' containment reference.
	 * @see #getListOfXmlElement()
	 * @generated
	 */
	void setListOfXmlElement(ListOfXmlElement value);

	/**
	 * Returns the value of the '<em><b>Literal Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Operand</em>' containment reference.
	 * @see #setLiteralOperand(LiteralOperand)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_LiteralOperand()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LiteralOperand' namespace='##targetNamespace'"
	 * @generated
	 */
	LiteralOperand getLiteralOperand();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getLiteralOperand <em>Literal Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal Operand</em>' containment reference.
	 * @see #getLiteralOperand()
	 * @generated
	 */
	void setLiteralOperand(LiteralOperand value);

	/**
	 * Returns the value of the '<em><b>Locale Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale Id</em>' attribute.
	 * @see #setLocaleId(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_LocaleId()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocaleId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocaleId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getLocaleId <em>Locale Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale Id</em>' attribute.
	 * @see #getLocaleId()
	 * @generated
	 */
	void setLocaleId(String value);

	/**
	 * Returns the value of the '<em><b>Localized Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localized Text</em>' containment reference.
	 * @see #setLocalizedText(LocalizedText)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_LocalizedText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocalizedText' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedText getLocalizedText();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getLocalizedText <em>Localized Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localized Text</em>' containment reference.
	 * @see #getLocalizedText()
	 * @generated
	 */
	void setLocalizedText(LocalizedText value);

	/**
	 * Returns the value of the '<em><b>Mdns Discovery Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdns Discovery Configuration</em>' containment reference.
	 * @see #setMdnsDiscoveryConfiguration(MdnsDiscoveryConfiguration)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_MdnsDiscoveryConfiguration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MdnsDiscoveryConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	MdnsDiscoveryConfiguration getMdnsDiscoveryConfiguration();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMdnsDiscoveryConfiguration <em>Mdns Discovery Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdns Discovery Configuration</em>' containment reference.
	 * @see #getMdnsDiscoveryConfiguration()
	 * @generated
	 */
	void setMdnsDiscoveryConfiguration(MdnsDiscoveryConfiguration value);

	/**
	 * Returns the value of the '<em><b>Message Security Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.MessageSecurityMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Security Mode</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.MessageSecurityMode
	 * @see #setMessageSecurityMode(MessageSecurityMode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_MessageSecurityMode()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MessageSecurityMode' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageSecurityMode getMessageSecurityMode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMessageSecurityMode <em>Message Security Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Security Mode</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.MessageSecurityMode
	 * @see #getMessageSecurityMode()
	 * @generated
	 */
	void setMessageSecurityMode(MessageSecurityMode value);

	/**
	 * Returns the value of the '<em><b>Method Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Attributes</em>' containment reference.
	 * @see #setMethodAttributes(MethodAttributes)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_MethodAttributes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MethodAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodAttributes getMethodAttributes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMethodAttributes <em>Method Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Attributes</em>' containment reference.
	 * @see #getMethodAttributes()
	 * @generated
	 */
	void setMethodAttributes(MethodAttributes value);

	/**
	 * Returns the value of the '<em><b>Method Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Node</em>' containment reference.
	 * @see #setMethodNode(MethodNode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_MethodNode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MethodNode' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodNode getMethodNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMethodNode <em>Method Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Node</em>' containment reference.
	 * @see #getMethodNode()
	 * @generated
	 */
	void setMethodNode(MethodNode value);

	/**
	 * Returns the value of the '<em><b>Model Change Structure Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Change Structure Data Type</em>' containment reference.
	 * @see #setModelChangeStructureDataType(ModelChangeStructureDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ModelChangeStructureDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModelChangeStructureDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelChangeStructureDataType getModelChangeStructureDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModelChangeStructureDataType <em>Model Change Structure Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Change Structure Data Type</em>' containment reference.
	 * @see #getModelChangeStructureDataType()
	 * @generated
	 */
	void setModelChangeStructureDataType(ModelChangeStructureDataType value);

	/**
	 * Returns the value of the '<em><b>Model Change Structure Verb Mask</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.ModelChangeStructureVerbMask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Change Structure Verb Mask</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.ModelChangeStructureVerbMask
	 * @see #setModelChangeStructureVerbMask(ModelChangeStructureVerbMask)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ModelChangeStructureVerbMask()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModelChangeStructureVerbMask' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelChangeStructureVerbMask getModelChangeStructureVerbMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModelChangeStructureVerbMask <em>Model Change Structure Verb Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Change Structure Verb Mask</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.ModelChangeStructureVerbMask
	 * @see #getModelChangeStructureVerbMask()
	 * @generated
	 */
	void setModelChangeStructureVerbMask(ModelChangeStructureVerbMask value);

	/**
	 * Returns the value of the '<em><b>Modification Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification Info</em>' containment reference.
	 * @see #setModificationInfo(ModificationInfo)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ModificationInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModificationInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	ModificationInfo getModificationInfo();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModificationInfo <em>Modification Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification Info</em>' containment reference.
	 * @see #getModificationInfo()
	 * @generated
	 */
	void setModificationInfo(ModificationInfo value);

	/**
	 * Returns the value of the '<em><b>Modify Monitored Items Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Monitored Items Request</em>' containment reference.
	 * @see #setModifyMonitoredItemsRequest(ModifyMonitoredItemsRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ModifyMonitoredItemsRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModifyMonitoredItemsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ModifyMonitoredItemsRequest getModifyMonitoredItemsRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifyMonitoredItemsRequest <em>Modify Monitored Items Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify Monitored Items Request</em>' containment reference.
	 * @see #getModifyMonitoredItemsRequest()
	 * @generated
	 */
	void setModifyMonitoredItemsRequest(ModifyMonitoredItemsRequest value);

	/**
	 * Returns the value of the '<em><b>Modify Monitored Items Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Monitored Items Response</em>' containment reference.
	 * @see #setModifyMonitoredItemsResponse(ModifyMonitoredItemsResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ModifyMonitoredItemsResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModifyMonitoredItemsResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ModifyMonitoredItemsResponse getModifyMonitoredItemsResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifyMonitoredItemsResponse <em>Modify Monitored Items Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify Monitored Items Response</em>' containment reference.
	 * @see #getModifyMonitoredItemsResponse()
	 * @generated
	 */
	void setModifyMonitoredItemsResponse(ModifyMonitoredItemsResponse value);

	/**
	 * Returns the value of the '<em><b>Modify Subscription Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Subscription Request</em>' containment reference.
	 * @see #setModifySubscriptionRequest(ModifySubscriptionRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ModifySubscriptionRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModifySubscriptionRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ModifySubscriptionRequest getModifySubscriptionRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifySubscriptionRequest <em>Modify Subscription Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify Subscription Request</em>' containment reference.
	 * @see #getModifySubscriptionRequest()
	 * @generated
	 */
	void setModifySubscriptionRequest(ModifySubscriptionRequest value);

	/**
	 * Returns the value of the '<em><b>Modify Subscription Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Subscription Response</em>' containment reference.
	 * @see #setModifySubscriptionResponse(ModifySubscriptionResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ModifySubscriptionResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModifySubscriptionResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ModifySubscriptionResponse getModifySubscriptionResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifySubscriptionResponse <em>Modify Subscription Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify Subscription Response</em>' containment reference.
	 * @see #getModifySubscriptionResponse()
	 * @generated
	 */
	void setModifySubscriptionResponse(ModifySubscriptionResponse value);

	/**
	 * Returns the value of the '<em><b>Monitored Item Create Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Item Create Request</em>' containment reference.
	 * @see #setMonitoredItemCreateRequest(MonitoredItemCreateRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_MonitoredItemCreateRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MonitoredItemCreateRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	MonitoredItemCreateRequest getMonitoredItemCreateRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemCreateRequest <em>Monitored Item Create Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored Item Create Request</em>' containment reference.
	 * @see #getMonitoredItemCreateRequest()
	 * @generated
	 */
	void setMonitoredItemCreateRequest(MonitoredItemCreateRequest value);

	/**
	 * Returns the value of the '<em><b>Monitored Item Create Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Item Create Result</em>' containment reference.
	 * @see #setMonitoredItemCreateResult(MonitoredItemCreateResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_MonitoredItemCreateResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MonitoredItemCreateResult' namespace='##targetNamespace'"
	 * @generated
	 */
	MonitoredItemCreateResult getMonitoredItemCreateResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemCreateResult <em>Monitored Item Create Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored Item Create Result</em>' containment reference.
	 * @see #getMonitoredItemCreateResult()
	 * @generated
	 */
	void setMonitoredItemCreateResult(MonitoredItemCreateResult value);

	/**
	 * Returns the value of the '<em><b>Monitored Item Modify Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Item Modify Request</em>' containment reference.
	 * @see #setMonitoredItemModifyRequest(MonitoredItemModifyRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_MonitoredItemModifyRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MonitoredItemModifyRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	MonitoredItemModifyRequest getMonitoredItemModifyRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemModifyRequest <em>Monitored Item Modify Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored Item Modify Request</em>' containment reference.
	 * @see #getMonitoredItemModifyRequest()
	 * @generated
	 */
	void setMonitoredItemModifyRequest(MonitoredItemModifyRequest value);

	/**
	 * Returns the value of the '<em><b>Monitored Item Modify Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Item Modify Result</em>' containment reference.
	 * @see #setMonitoredItemModifyResult(MonitoredItemModifyResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_MonitoredItemModifyResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MonitoredItemModifyResult' namespace='##targetNamespace'"
	 * @generated
	 */
	MonitoredItemModifyResult getMonitoredItemModifyResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemModifyResult <em>Monitored Item Modify Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored Item Modify Result</em>' containment reference.
	 * @see #getMonitoredItemModifyResult()
	 * @generated
	 */
	void setMonitoredItemModifyResult(MonitoredItemModifyResult value);

	/**
	 * Returns the value of the '<em><b>Monitored Item Notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Item Notification</em>' containment reference.
	 * @see #setMonitoredItemNotification(MonitoredItemNotification)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_MonitoredItemNotification()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MonitoredItemNotification' namespace='##targetNamespace'"
	 * @generated
	 */
	MonitoredItemNotification getMonitoredItemNotification();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemNotification <em>Monitored Item Notification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored Item Notification</em>' containment reference.
	 * @see #getMonitoredItemNotification()
	 * @generated
	 */
	void setMonitoredItemNotification(MonitoredItemNotification value);

	/**
	 * Returns the value of the '<em><b>Monitoring Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring Filter</em>' containment reference.
	 * @see #setMonitoringFilter(MonitoringFilter)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_MonitoringFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MonitoringFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	MonitoringFilter getMonitoringFilter();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringFilter <em>Monitoring Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring Filter</em>' containment reference.
	 * @see #getMonitoringFilter()
	 * @generated
	 */
	void setMonitoringFilter(MonitoringFilter value);

	/**
	 * Returns the value of the '<em><b>Monitoring Filter Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring Filter Result</em>' containment reference.
	 * @see #setMonitoringFilterResult(MonitoringFilterResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_MonitoringFilterResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MonitoringFilterResult' namespace='##targetNamespace'"
	 * @generated
	 */
	MonitoringFilterResult getMonitoringFilterResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringFilterResult <em>Monitoring Filter Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring Filter Result</em>' containment reference.
	 * @see #getMonitoringFilterResult()
	 * @generated
	 */
	void setMonitoringFilterResult(MonitoringFilterResult value);

	/**
	 * Returns the value of the '<em><b>Monitoring Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.MonitoringMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring Mode</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.MonitoringMode
	 * @see #setMonitoringMode(MonitoringMode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_MonitoringMode()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MonitoringMode' namespace='##targetNamespace'"
	 * @generated
	 */
	MonitoringMode getMonitoringMode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringMode <em>Monitoring Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring Mode</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.MonitoringMode
	 * @see #getMonitoringMode()
	 * @generated
	 */
	void setMonitoringMode(MonitoringMode value);

	/**
	 * Returns the value of the '<em><b>Monitoring Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring Parameters</em>' containment reference.
	 * @see #setMonitoringParameters(MonitoringParameters)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_MonitoringParameters()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MonitoringParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	MonitoringParameters getMonitoringParameters();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringParameters <em>Monitoring Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring Parameters</em>' containment reference.
	 * @see #getMonitoringParameters()
	 * @generated
	 */
	void setMonitoringParameters(MonitoringParameters value);

	/**
	 * Returns the value of the '<em><b>Network Address Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Address Data Type</em>' containment reference.
	 * @see #setNetworkAddressDataType(NetworkAddressDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_NetworkAddressDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NetworkAddressDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	NetworkAddressDataType getNetworkAddressDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNetworkAddressDataType <em>Network Address Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Address Data Type</em>' containment reference.
	 * @see #getNetworkAddressDataType()
	 * @generated
	 */
	void setNetworkAddressDataType(NetworkAddressDataType value);

	/**
	 * Returns the value of the '<em><b>Network Address Url Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Address Url Data Type</em>' containment reference.
	 * @see #setNetworkAddressUrlDataType(NetworkAddressUrlDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_NetworkAddressUrlDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NetworkAddressUrlDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	NetworkAddressUrlDataType getNetworkAddressUrlDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNetworkAddressUrlDataType <em>Network Address Url Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Address Url Data Type</em>' containment reference.
	 * @see #getNetworkAddressUrlDataType()
	 * @generated
	 */
	void setNetworkAddressUrlDataType(NetworkAddressUrlDataType value);

	/**
	 * Returns the value of the '<em><b>Network Group Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Group Data Type</em>' containment reference.
	 * @see #setNetworkGroupDataType(NetworkGroupDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_NetworkGroupDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NetworkGroupDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	NetworkGroupDataType getNetworkGroupDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNetworkGroupDataType <em>Network Group Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Group Data Type</em>' containment reference.
	 * @see #getNetworkGroupDataType()
	 * @generated
	 */
	void setNetworkGroupDataType(NetworkGroupDataType value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference.
	 * @see #setNode(Node)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Node()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Node' namespace='##targetNamespace'"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNode <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' containment reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

	/**
	 * Returns the value of the '<em><b>Node Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Attributes</em>' containment reference.
	 * @see #setNodeAttributes(NodeAttributes)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_NodeAttributes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NodeAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeAttributes getNodeAttributes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeAttributes <em>Node Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Attributes</em>' containment reference.
	 * @see #getNodeAttributes()
	 * @generated
	 */
	void setNodeAttributes(NodeAttributes value);

	/**
	 * Returns the value of the '<em><b>Node Attributes Mask</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.NodeAttributesMask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Attributes Mask</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.NodeAttributesMask
	 * @see #setNodeAttributesMask(NodeAttributesMask)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_NodeAttributesMask()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NodeAttributesMask' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeAttributesMask getNodeAttributesMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeAttributesMask <em>Node Attributes Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Attributes Mask</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.NodeAttributesMask
	 * @see #getNodeAttributesMask()
	 * @generated
	 */
	void setNodeAttributesMask(NodeAttributesMask value);

	/**
	 * Returns the value of the '<em><b>Node Class</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.NodeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Class</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.NodeClass
	 * @see #setNodeClass(NodeClass)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_NodeClass()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NodeClass' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeClass getNodeClass();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeClass <em>Node Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Class</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.NodeClass
	 * @see #getNodeClass()
	 * @generated
	 */
	void setNodeClass(NodeClass value);

	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' containment reference.
	 * @see #setNodeId(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_NodeId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NodeId' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getNodeId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeId <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' containment reference.
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(NodeId value);

	/**
	 * Returns the value of the '<em><b>Node Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Reference</em>' containment reference.
	 * @see #setNodeReference(NodeReference)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_NodeReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NodeReference' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeReference getNodeReference();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeReference <em>Node Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Reference</em>' containment reference.
	 * @see #getNodeReference()
	 * @generated
	 */
	void setNodeReference(NodeReference value);

	/**
	 * Returns the value of the '<em><b>Node Type Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type Description</em>' containment reference.
	 * @see #setNodeTypeDescription(NodeTypeDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_NodeTypeDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NodeTypeDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeTypeDescription getNodeTypeDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeTypeDescription <em>Node Type Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Type Description</em>' containment reference.
	 * @see #getNodeTypeDescription()
	 * @generated
	 */
	void setNodeTypeDescription(NodeTypeDescription value);

	/**
	 * Returns the value of the '<em><b>Normalized String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normalized String</em>' attribute.
	 * @see #setNormalizedString(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_NormalizedString()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NormalizedString' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNormalizedString();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNormalizedString <em>Normalized String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normalized String</em>' attribute.
	 * @see #getNormalizedString()
	 * @generated
	 */
	void setNormalizedString(String value);

	/**
	 * Returns the value of the '<em><b>Notification Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Data</em>' containment reference.
	 * @see #setNotificationData(NotificationData)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_NotificationData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NotificationData' namespace='##targetNamespace'"
	 * @generated
	 */
	NotificationData getNotificationData();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNotificationData <em>Notification Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Data</em>' containment reference.
	 * @see #getNotificationData()
	 * @generated
	 */
	void setNotificationData(NotificationData value);

	/**
	 * Returns the value of the '<em><b>Notification Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Message</em>' containment reference.
	 * @see #setNotificationMessage(NotificationMessage)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_NotificationMessage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NotificationMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	NotificationMessage getNotificationMessage();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNotificationMessage <em>Notification Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Message</em>' containment reference.
	 * @see #getNotificationMessage()
	 * @generated
	 */
	void setNotificationMessage(NotificationMessage value);

	/**
	 * Returns the value of the '<em><b>Numeric Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numeric Range</em>' attribute.
	 * @see #setNumericRange(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_NumericRange()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NumericRange' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNumericRange();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNumericRange <em>Numeric Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numeric Range</em>' attribute.
	 * @see #getNumericRange()
	 * @generated
	 */
	void setNumericRange(String value);

	/**
	 * Returns the value of the '<em><b>Object Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Attributes</em>' containment reference.
	 * @see #setObjectAttributes(ObjectAttributes)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ObjectAttributes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectAttributes getObjectAttributes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectAttributes <em>Object Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Attributes</em>' containment reference.
	 * @see #getObjectAttributes()
	 * @generated
	 */
	void setObjectAttributes(ObjectAttributes value);

	/**
	 * Returns the value of the '<em><b>Object Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Node</em>' containment reference.
	 * @see #setObjectNode(ObjectNode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ObjectNode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectNode' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectNode getObjectNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectNode <em>Object Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Node</em>' containment reference.
	 * @see #getObjectNode()
	 * @generated
	 */
	void setObjectNode(ObjectNode value);

	/**
	 * Returns the value of the '<em><b>Object Type Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type Attributes</em>' containment reference.
	 * @see #setObjectTypeAttributes(ObjectTypeAttributes)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ObjectTypeAttributes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectTypeAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectTypeAttributes getObjectTypeAttributes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectTypeAttributes <em>Object Type Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type Attributes</em>' containment reference.
	 * @see #getObjectTypeAttributes()
	 * @generated
	 */
	void setObjectTypeAttributes(ObjectTypeAttributes value);

	/**
	 * Returns the value of the '<em><b>Object Type Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type Node</em>' containment reference.
	 * @see #setObjectTypeNode(ObjectTypeNode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ObjectTypeNode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectTypeNode' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectTypeNode getObjectTypeNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectTypeNode <em>Object Type Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type Node</em>' containment reference.
	 * @see #getObjectTypeNode()
	 * @generated
	 */
	void setObjectTypeNode(ObjectTypeNode value);

	/**
	 * Returns the value of the '<em><b>Open File Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.OpenFileMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open File Mode</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.OpenFileMode
	 * @see #setOpenFileMode(OpenFileMode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_OpenFileMode()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OpenFileMode' namespace='##targetNamespace'"
	 * @generated
	 */
	OpenFileMode getOpenFileMode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOpenFileMode <em>Open File Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open File Mode</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.OpenFileMode
	 * @see #getOpenFileMode()
	 * @generated
	 */
	void setOpenFileMode(OpenFileMode value);

	/**
	 * Returns the value of the '<em><b>Open Secure Channel Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Secure Channel Request</em>' containment reference.
	 * @see #setOpenSecureChannelRequest(OpenSecureChannelRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_OpenSecureChannelRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OpenSecureChannelRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	OpenSecureChannelRequest getOpenSecureChannelRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOpenSecureChannelRequest <em>Open Secure Channel Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Secure Channel Request</em>' containment reference.
	 * @see #getOpenSecureChannelRequest()
	 * @generated
	 */
	void setOpenSecureChannelRequest(OpenSecureChannelRequest value);

	/**
	 * Returns the value of the '<em><b>Open Secure Channel Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Secure Channel Response</em>' containment reference.
	 * @see #setOpenSecureChannelResponse(OpenSecureChannelResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_OpenSecureChannelResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OpenSecureChannelResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	OpenSecureChannelResponse getOpenSecureChannelResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOpenSecureChannelResponse <em>Open Secure Channel Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Secure Channel Response</em>' containment reference.
	 * @see #getOpenSecureChannelResponse()
	 * @generated
	 */
	void setOpenSecureChannelResponse(OpenSecureChannelResponse value);

	/**
	 * Returns the value of the '<em><b>Option Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Set</em>' containment reference.
	 * @see #setOptionSet(OptionSet)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_OptionSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OptionSet' namespace='##targetNamespace'"
	 * @generated
	 */
	OptionSet getOptionSet();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOptionSet <em>Option Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Set</em>' containment reference.
	 * @see #getOptionSet()
	 * @generated
	 */
	void setOptionSet(OptionSet value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(Orientation)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Orientation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	Orientation getOrientation();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Orientation value);

	/**
	 * Returns the value of the '<em><b>Override Value Handling</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.OverrideValueHandling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Value Handling</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.OverrideValueHandling
	 * @see #setOverrideValueHandling(OverrideValueHandling)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_OverrideValueHandling()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OverrideValueHandling' namespace='##targetNamespace'"
	 * @generated
	 */
	OverrideValueHandling getOverrideValueHandling();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOverrideValueHandling <em>Override Value Handling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Value Handling</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.OverrideValueHandling
	 * @see #getOverrideValueHandling()
	 * @generated
	 */
	void setOverrideValueHandling(OverrideValueHandling value);

	/**
	 * Returns the value of the '<em><b>Parsing Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parsing Result</em>' containment reference.
	 * @see #setParsingResult(ParsingResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ParsingResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ParsingResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ParsingResult getParsingResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getParsingResult <em>Parsing Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parsing Result</em>' containment reference.
	 * @see #getParsingResult()
	 * @generated
	 */
	void setParsingResult(ParsingResult value);

	/**
	 * Returns the value of the '<em><b>Perform Update Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.PerformUpdateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perform Update Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.PerformUpdateType
	 * @see #setPerformUpdateType(PerformUpdateType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_PerformUpdateType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PerformUpdateType' namespace='##targetNamespace'"
	 * @generated
	 */
	PerformUpdateType getPerformUpdateType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPerformUpdateType <em>Perform Update Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perform Update Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.PerformUpdateType
	 * @see #getPerformUpdateType()
	 * @generated
	 */
	void setPerformUpdateType(PerformUpdateType value);

	/**
	 * Returns the value of the '<em><b>Permission Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission Type</em>' attribute.
	 * @see #setPermissionType(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_PermissionType()
	 * @model unique="false" dataType="org.opcfoundation.ua._2008._02.types.PermissionType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PermissionType' namespace='##targetNamespace'"
	 * @generated
	 */
	long getPermissionType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPermissionType <em>Permission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission Type</em>' attribute.
	 * @see #getPermissionType()
	 * @generated
	 */
	void setPermissionType(long value);

	/**
	 * Returns the value of the '<em><b>Program Diagnostic2 Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Diagnostic2 Data Type</em>' containment reference.
	 * @see #setProgramDiagnostic2DataType(ProgramDiagnostic2DataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ProgramDiagnostic2DataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProgramDiagnostic2DataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ProgramDiagnostic2DataType getProgramDiagnostic2DataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getProgramDiagnostic2DataType <em>Program Diagnostic2 Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Diagnostic2 Data Type</em>' containment reference.
	 * @see #getProgramDiagnostic2DataType()
	 * @generated
	 */
	void setProgramDiagnostic2DataType(ProgramDiagnostic2DataType value);

	/**
	 * Returns the value of the '<em><b>Program Diagnostic Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Diagnostic Data Type</em>' containment reference.
	 * @see #setProgramDiagnosticDataType(ProgramDiagnosticDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ProgramDiagnosticDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProgramDiagnosticDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ProgramDiagnosticDataType getProgramDiagnosticDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getProgramDiagnosticDataType <em>Program Diagnostic Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Diagnostic Data Type</em>' containment reference.
	 * @see #getProgramDiagnosticDataType()
	 * @generated
	 */
	void setProgramDiagnosticDataType(ProgramDiagnosticDataType value);

	/**
	 * Returns the value of the '<em><b>Published Data Items Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published Data Items Data Type</em>' containment reference.
	 * @see #setPublishedDataItemsDataType(PublishedDataItemsDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_PublishedDataItemsDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PublishedDataItemsDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	PublishedDataItemsDataType getPublishedDataItemsDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedDataItemsDataType <em>Published Data Items Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published Data Items Data Type</em>' containment reference.
	 * @see #getPublishedDataItemsDataType()
	 * @generated
	 */
	void setPublishedDataItemsDataType(PublishedDataItemsDataType value);

	/**
	 * Returns the value of the '<em><b>Published Data Set Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published Data Set Data Type</em>' containment reference.
	 * @see #setPublishedDataSetDataType(PublishedDataSetDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_PublishedDataSetDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PublishedDataSetDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	PublishedDataSetDataType getPublishedDataSetDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedDataSetDataType <em>Published Data Set Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published Data Set Data Type</em>' containment reference.
	 * @see #getPublishedDataSetDataType()
	 * @generated
	 */
	void setPublishedDataSetDataType(PublishedDataSetDataType value);

	/**
	 * Returns the value of the '<em><b>Published Data Set Source Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published Data Set Source Data Type</em>' containment reference.
	 * @see #setPublishedDataSetSourceDataType(PublishedDataSetSourceDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_PublishedDataSetSourceDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PublishedDataSetSourceDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	PublishedDataSetSourceDataType getPublishedDataSetSourceDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedDataSetSourceDataType <em>Published Data Set Source Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published Data Set Source Data Type</em>' containment reference.
	 * @see #getPublishedDataSetSourceDataType()
	 * @generated
	 */
	void setPublishedDataSetSourceDataType(PublishedDataSetSourceDataType value);

	/**
	 * Returns the value of the '<em><b>Published Events Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published Events Data Type</em>' containment reference.
	 * @see #setPublishedEventsDataType(PublishedEventsDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_PublishedEventsDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PublishedEventsDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	PublishedEventsDataType getPublishedEventsDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedEventsDataType <em>Published Events Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published Events Data Type</em>' containment reference.
	 * @see #getPublishedEventsDataType()
	 * @generated
	 */
	void setPublishedEventsDataType(PublishedEventsDataType value);

	/**
	 * Returns the value of the '<em><b>Published Variable Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published Variable Data Type</em>' containment reference.
	 * @see #setPublishedVariableDataType(PublishedVariableDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_PublishedVariableDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PublishedVariableDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	PublishedVariableDataType getPublishedVariableDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedVariableDataType <em>Published Variable Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published Variable Data Type</em>' containment reference.
	 * @see #getPublishedVariableDataType()
	 * @generated
	 */
	void setPublishedVariableDataType(PublishedVariableDataType value);

	/**
	 * Returns the value of the '<em><b>Publish Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish Request</em>' containment reference.
	 * @see #setPublishRequest(PublishRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_PublishRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PublishRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	PublishRequest getPublishRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishRequest <em>Publish Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish Request</em>' containment reference.
	 * @see #getPublishRequest()
	 * @generated
	 */
	void setPublishRequest(PublishRequest value);

	/**
	 * Returns the value of the '<em><b>Publish Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish Response</em>' containment reference.
	 * @see #setPublishResponse(PublishResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_PublishResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PublishResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	PublishResponse getPublishResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishResponse <em>Publish Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish Response</em>' containment reference.
	 * @see #getPublishResponse()
	 * @generated
	 */
	void setPublishResponse(PublishResponse value);

	/**
	 * Returns the value of the '<em><b>Pub Sub Configuration Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub Sub Configuration Data Type</em>' containment reference.
	 * @see #setPubSubConfigurationDataType(PubSubConfigurationDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_PubSubConfigurationDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PubSubConfigurationDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	PubSubConfigurationDataType getPubSubConfigurationDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubConfigurationDataType <em>Pub Sub Configuration Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub Sub Configuration Data Type</em>' containment reference.
	 * @see #getPubSubConfigurationDataType()
	 * @generated
	 */
	void setPubSubConfigurationDataType(PubSubConfigurationDataType value);

	/**
	 * Returns the value of the '<em><b>Pub Sub Connection Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub Sub Connection Data Type</em>' containment reference.
	 * @see #setPubSubConnectionDataType(PubSubConnectionDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_PubSubConnectionDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PubSubConnectionDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	PubSubConnectionDataType getPubSubConnectionDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubConnectionDataType <em>Pub Sub Connection Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub Sub Connection Data Type</em>' containment reference.
	 * @see #getPubSubConnectionDataType()
	 * @generated
	 */
	void setPubSubConnectionDataType(PubSubConnectionDataType value);

	/**
	 * Returns the value of the '<em><b>Pub Sub Diagnostics Counter Classification</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.PubSubDiagnosticsCounterClassification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub Sub Diagnostics Counter Classification</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.PubSubDiagnosticsCounterClassification
	 * @see #setPubSubDiagnosticsCounterClassification(PubSubDiagnosticsCounterClassification)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_PubSubDiagnosticsCounterClassification()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PubSubDiagnosticsCounterClassification' namespace='##targetNamespace'"
	 * @generated
	 */
	PubSubDiagnosticsCounterClassification getPubSubDiagnosticsCounterClassification();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubDiagnosticsCounterClassification <em>Pub Sub Diagnostics Counter Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub Sub Diagnostics Counter Classification</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.PubSubDiagnosticsCounterClassification
	 * @see #getPubSubDiagnosticsCounterClassification()
	 * @generated
	 */
	void setPubSubDiagnosticsCounterClassification(PubSubDiagnosticsCounterClassification value);

	/**
	 * Returns the value of the '<em><b>Pub Sub Group Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub Sub Group Data Type</em>' containment reference.
	 * @see #setPubSubGroupDataType(PubSubGroupDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_PubSubGroupDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PubSubGroupDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	PubSubGroupDataType getPubSubGroupDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubGroupDataType <em>Pub Sub Group Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub Sub Group Data Type</em>' containment reference.
	 * @see #getPubSubGroupDataType()
	 * @generated
	 */
	void setPubSubGroupDataType(PubSubGroupDataType value);

	/**
	 * Returns the value of the '<em><b>Pub Sub State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.PubSubState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub Sub State</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.PubSubState
	 * @see #setPubSubState(PubSubState)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_PubSubState()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PubSubState' namespace='##targetNamespace'"
	 * @generated
	 */
	PubSubState getPubSubState();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubState <em>Pub Sub State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub Sub State</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.PubSubState
	 * @see #getPubSubState()
	 * @generated
	 */
	void setPubSubState(PubSubState value);

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' containment reference.
	 * @see #setQualifiedName(QualifiedName)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_QualifiedName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='QualifiedName' namespace='##targetNamespace'"
	 * @generated
	 */
	QualifiedName getQualifiedName();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQualifiedName <em>Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' containment reference.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(QualifiedName value);

	/**
	 * Returns the value of the '<em><b>Query Data Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Data Description</em>' containment reference.
	 * @see #setQueryDataDescription(QueryDataDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_QueryDataDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='QueryDataDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryDataDescription getQueryDataDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryDataDescription <em>Query Data Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Data Description</em>' containment reference.
	 * @see #getQueryDataDescription()
	 * @generated
	 */
	void setQueryDataDescription(QueryDataDescription value);

	/**
	 * Returns the value of the '<em><b>Query Data Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Data Set</em>' containment reference.
	 * @see #setQueryDataSet(QueryDataSet)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_QueryDataSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='QueryDataSet' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryDataSet getQueryDataSet();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryDataSet <em>Query Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Data Set</em>' containment reference.
	 * @see #getQueryDataSet()
	 * @generated
	 */
	void setQueryDataSet(QueryDataSet value);

	/**
	 * Returns the value of the '<em><b>Query First Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query First Request</em>' containment reference.
	 * @see #setQueryFirstRequest(QueryFirstRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_QueryFirstRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='QueryFirstRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryFirstRequest getQueryFirstRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryFirstRequest <em>Query First Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query First Request</em>' containment reference.
	 * @see #getQueryFirstRequest()
	 * @generated
	 */
	void setQueryFirstRequest(QueryFirstRequest value);

	/**
	 * Returns the value of the '<em><b>Query First Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query First Response</em>' containment reference.
	 * @see #setQueryFirstResponse(QueryFirstResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_QueryFirstResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='QueryFirstResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryFirstResponse getQueryFirstResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryFirstResponse <em>Query First Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query First Response</em>' containment reference.
	 * @see #getQueryFirstResponse()
	 * @generated
	 */
	void setQueryFirstResponse(QueryFirstResponse value);

	/**
	 * Returns the value of the '<em><b>Query Next Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Next Request</em>' containment reference.
	 * @see #setQueryNextRequest(QueryNextRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_QueryNextRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='QueryNextRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryNextRequest getQueryNextRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryNextRequest <em>Query Next Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Next Request</em>' containment reference.
	 * @see #getQueryNextRequest()
	 * @generated
	 */
	void setQueryNextRequest(QueryNextRequest value);

	/**
	 * Returns the value of the '<em><b>Query Next Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Next Response</em>' containment reference.
	 * @see #setQueryNextResponse(QueryNextResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_QueryNextResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='QueryNextResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryNextResponse getQueryNextResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryNextResponse <em>Query Next Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Next Response</em>' containment reference.
	 * @see #getQueryNextResponse()
	 * @generated
	 */
	void setQueryNextResponse(QueryNextResponse value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Range)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Range()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Range' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

	/**
	 * Returns the value of the '<em><b>Rational Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rational Number</em>' containment reference.
	 * @see #setRationalNumber(RationalNumber)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_RationalNumber()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RationalNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	RationalNumber getRationalNumber();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRationalNumber <em>Rational Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rational Number</em>' containment reference.
	 * @see #getRationalNumber()
	 * @generated
	 */
	void setRationalNumber(RationalNumber value);

	/**
	 * Returns the value of the '<em><b>Read Annotation Data Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Annotation Data Details</em>' containment reference.
	 * @see #setReadAnnotationDataDetails(ReadAnnotationDataDetails)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ReadAnnotationDataDetails()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReadAnnotationDataDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadAnnotationDataDetails getReadAnnotationDataDetails();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadAnnotationDataDetails <em>Read Annotation Data Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Annotation Data Details</em>' containment reference.
	 * @see #getReadAnnotationDataDetails()
	 * @generated
	 */
	void setReadAnnotationDataDetails(ReadAnnotationDataDetails value);

	/**
	 * Returns the value of the '<em><b>Read At Time Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read At Time Details</em>' containment reference.
	 * @see #setReadAtTimeDetails(ReadAtTimeDetails)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ReadAtTimeDetails()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReadAtTimeDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadAtTimeDetails getReadAtTimeDetails();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadAtTimeDetails <em>Read At Time Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read At Time Details</em>' containment reference.
	 * @see #getReadAtTimeDetails()
	 * @generated
	 */
	void setReadAtTimeDetails(ReadAtTimeDetails value);

	/**
	 * Returns the value of the '<em><b>Reader Group Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader Group Data Type</em>' containment reference.
	 * @see #setReaderGroupDataType(ReaderGroupDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ReaderGroupDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReaderGroupDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ReaderGroupDataType getReaderGroupDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReaderGroupDataType <em>Reader Group Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reader Group Data Type</em>' containment reference.
	 * @see #getReaderGroupDataType()
	 * @generated
	 */
	void setReaderGroupDataType(ReaderGroupDataType value);

	/**
	 * Returns the value of the '<em><b>Reader Group Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader Group Message Data Type</em>' containment reference.
	 * @see #setReaderGroupMessageDataType(ReaderGroupMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ReaderGroupMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReaderGroupMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ReaderGroupMessageDataType getReaderGroupMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReaderGroupMessageDataType <em>Reader Group Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reader Group Message Data Type</em>' containment reference.
	 * @see #getReaderGroupMessageDataType()
	 * @generated
	 */
	void setReaderGroupMessageDataType(ReaderGroupMessageDataType value);

	/**
	 * Returns the value of the '<em><b>Reader Group Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader Group Transport Data Type</em>' containment reference.
	 * @see #setReaderGroupTransportDataType(ReaderGroupTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ReaderGroupTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReaderGroupTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ReaderGroupTransportDataType getReaderGroupTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReaderGroupTransportDataType <em>Reader Group Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reader Group Transport Data Type</em>' containment reference.
	 * @see #getReaderGroupTransportDataType()
	 * @generated
	 */
	void setReaderGroupTransportDataType(ReaderGroupTransportDataType value);

	/**
	 * Returns the value of the '<em><b>Read Event Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Event Details</em>' containment reference.
	 * @see #setReadEventDetails(ReadEventDetails)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ReadEventDetails()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReadEventDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadEventDetails getReadEventDetails();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadEventDetails <em>Read Event Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Event Details</em>' containment reference.
	 * @see #getReadEventDetails()
	 * @generated
	 */
	void setReadEventDetails(ReadEventDetails value);

	/**
	 * Returns the value of the '<em><b>Read Processed Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Processed Details</em>' containment reference.
	 * @see #setReadProcessedDetails(ReadProcessedDetails)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ReadProcessedDetails()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReadProcessedDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadProcessedDetails getReadProcessedDetails();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadProcessedDetails <em>Read Processed Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Processed Details</em>' containment reference.
	 * @see #getReadProcessedDetails()
	 * @generated
	 */
	void setReadProcessedDetails(ReadProcessedDetails value);

	/**
	 * Returns the value of the '<em><b>Read Raw Modified Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Raw Modified Details</em>' containment reference.
	 * @see #setReadRawModifiedDetails(ReadRawModifiedDetails)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ReadRawModifiedDetails()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReadRawModifiedDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadRawModifiedDetails getReadRawModifiedDetails();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadRawModifiedDetails <em>Read Raw Modified Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Raw Modified Details</em>' containment reference.
	 * @see #getReadRawModifiedDetails()
	 * @generated
	 */
	void setReadRawModifiedDetails(ReadRawModifiedDetails value);

	/**
	 * Returns the value of the '<em><b>Read Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Request</em>' containment reference.
	 * @see #setReadRequest(ReadRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ReadRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReadRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadRequest getReadRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadRequest <em>Read Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Request</em>' containment reference.
	 * @see #getReadRequest()
	 * @generated
	 */
	void setReadRequest(ReadRequest value);

	/**
	 * Returns the value of the '<em><b>Read Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Response</em>' containment reference.
	 * @see #setReadResponse(ReadResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ReadResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReadResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadResponse getReadResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadResponse <em>Read Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Response</em>' containment reference.
	 * @see #getReadResponse()
	 * @generated
	 */
	void setReadResponse(ReadResponse value);

	/**
	 * Returns the value of the '<em><b>Read Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Value Id</em>' containment reference.
	 * @see #setReadValueId(ReadValueId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ReadValueId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReadValueId' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadValueId getReadValueId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadValueId <em>Read Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Value Id</em>' containment reference.
	 * @see #getReadValueId()
	 * @generated
	 */
	void setReadValueId(ReadValueId value);

	/**
	 * Returns the value of the '<em><b>Redundancy Support</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.RedundancySupport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redundancy Support</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.RedundancySupport
	 * @see #setRedundancySupport(RedundancySupport)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_RedundancySupport()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RedundancySupport' namespace='##targetNamespace'"
	 * @generated
	 */
	RedundancySupport getRedundancySupport();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRedundancySupport <em>Redundancy Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redundancy Support</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.RedundancySupport
	 * @see #getRedundancySupport()
	 * @generated
	 */
	void setRedundancySupport(RedundancySupport value);

	/**
	 * Returns the value of the '<em><b>Redundant Server Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redundant Server Data Type</em>' containment reference.
	 * @see #setRedundantServerDataType(RedundantServerDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_RedundantServerDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RedundantServerDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	RedundantServerDataType getRedundantServerDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRedundantServerDataType <em>Redundant Server Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redundant Server Data Type</em>' containment reference.
	 * @see #getRedundantServerDataType()
	 * @generated
	 */
	void setRedundantServerDataType(RedundantServerDataType value);

	/**
	 * Returns the value of the '<em><b>Reference Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Description</em>' containment reference.
	 * @see #setReferenceDescription(ReferenceDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ReferenceDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReferenceDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceDescription getReferenceDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceDescription <em>Reference Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Description</em>' containment reference.
	 * @see #getReferenceDescription()
	 * @generated
	 */
	void setReferenceDescription(ReferenceDescription value);

	/**
	 * Returns the value of the '<em><b>Reference Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Node</em>' containment reference.
	 * @see #setReferenceNode(ReferenceNode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ReferenceNode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReferenceNode' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceNode getReferenceNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceNode <em>Reference Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Node</em>' containment reference.
	 * @see #getReferenceNode()
	 * @generated
	 */
	void setReferenceNode(ReferenceNode value);

	/**
	 * Returns the value of the '<em><b>Reference Type Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type Attributes</em>' containment reference.
	 * @see #setReferenceTypeAttributes(ReferenceTypeAttributes)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ReferenceTypeAttributes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReferenceTypeAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceTypeAttributes getReferenceTypeAttributes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceTypeAttributes <em>Reference Type Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Type Attributes</em>' containment reference.
	 * @see #getReferenceTypeAttributes()
	 * @generated
	 */
	void setReferenceTypeAttributes(ReferenceTypeAttributes value);

	/**
	 * Returns the value of the '<em><b>Reference Type Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type Node</em>' containment reference.
	 * @see #setReferenceTypeNode(ReferenceTypeNode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ReferenceTypeNode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReferenceTypeNode' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceTypeNode getReferenceTypeNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceTypeNode <em>Reference Type Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Type Node</em>' containment reference.
	 * @see #getReferenceTypeNode()
	 * @generated
	 */
	void setReferenceTypeNode(ReferenceTypeNode value);

	/**
	 * Returns the value of the '<em><b>Registered Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Server</em>' containment reference.
	 * @see #setRegisteredServer(RegisteredServer)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_RegisteredServer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegisteredServer' namespace='##targetNamespace'"
	 * @generated
	 */
	RegisteredServer getRegisteredServer();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisteredServer <em>Registered Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registered Server</em>' containment reference.
	 * @see #getRegisteredServer()
	 * @generated
	 */
	void setRegisteredServer(RegisteredServer value);

	/**
	 * Returns the value of the '<em><b>Register Nodes Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Nodes Request</em>' containment reference.
	 * @see #setRegisterNodesRequest(RegisterNodesRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_RegisterNodesRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegisterNodesRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	RegisterNodesRequest getRegisterNodesRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterNodesRequest <em>Register Nodes Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Nodes Request</em>' containment reference.
	 * @see #getRegisterNodesRequest()
	 * @generated
	 */
	void setRegisterNodesRequest(RegisterNodesRequest value);

	/**
	 * Returns the value of the '<em><b>Register Nodes Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Nodes Response</em>' containment reference.
	 * @see #setRegisterNodesResponse(RegisterNodesResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_RegisterNodesResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegisterNodesResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	RegisterNodesResponse getRegisterNodesResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterNodesResponse <em>Register Nodes Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Nodes Response</em>' containment reference.
	 * @see #getRegisterNodesResponse()
	 * @generated
	 */
	void setRegisterNodesResponse(RegisterNodesResponse value);

	/**
	 * Returns the value of the '<em><b>Register Server2 Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Server2 Request</em>' containment reference.
	 * @see #setRegisterServer2Request(RegisterServer2Request)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_RegisterServer2Request()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegisterServer2Request' namespace='##targetNamespace'"
	 * @generated
	 */
	RegisterServer2Request getRegisterServer2Request();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServer2Request <em>Register Server2 Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Server2 Request</em>' containment reference.
	 * @see #getRegisterServer2Request()
	 * @generated
	 */
	void setRegisterServer2Request(RegisterServer2Request value);

	/**
	 * Returns the value of the '<em><b>Register Server2 Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Server2 Response</em>' containment reference.
	 * @see #setRegisterServer2Response(RegisterServer2Response)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_RegisterServer2Response()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegisterServer2Response' namespace='##targetNamespace'"
	 * @generated
	 */
	RegisterServer2Response getRegisterServer2Response();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServer2Response <em>Register Server2 Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Server2 Response</em>' containment reference.
	 * @see #getRegisterServer2Response()
	 * @generated
	 */
	void setRegisterServer2Response(RegisterServer2Response value);

	/**
	 * Returns the value of the '<em><b>Register Server Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Server Request</em>' containment reference.
	 * @see #setRegisterServerRequest(RegisterServerRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_RegisterServerRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegisterServerRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	RegisterServerRequest getRegisterServerRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServerRequest <em>Register Server Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Server Request</em>' containment reference.
	 * @see #getRegisterServerRequest()
	 * @generated
	 */
	void setRegisterServerRequest(RegisterServerRequest value);

	/**
	 * Returns the value of the '<em><b>Register Server Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Server Response</em>' containment reference.
	 * @see #setRegisterServerResponse(RegisterServerResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_RegisterServerResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegisterServerResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	RegisterServerResponse getRegisterServerResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServerResponse <em>Register Server Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Server Response</em>' containment reference.
	 * @see #getRegisterServerResponse()
	 * @generated
	 */
	void setRegisterServerResponse(RegisterServerResponse value);

	/**
	 * Returns the value of the '<em><b>Relative Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Path</em>' containment reference.
	 * @see #setRelativePath(RelativePath)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_RelativePath()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelativePath' namespace='##targetNamespace'"
	 * @generated
	 */
	RelativePath getRelativePath();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRelativePath <em>Relative Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Path</em>' containment reference.
	 * @see #getRelativePath()
	 * @generated
	 */
	void setRelativePath(RelativePath value);

	/**
	 * Returns the value of the '<em><b>Relative Path Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Path Element</em>' containment reference.
	 * @see #setRelativePathElement(RelativePathElement)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_RelativePathElement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelativePathElement' namespace='##targetNamespace'"
	 * @generated
	 */
	RelativePathElement getRelativePathElement();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRelativePathElement <em>Relative Path Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Path Element</em>' containment reference.
	 * @see #getRelativePathElement()
	 * @generated
	 */
	void setRelativePathElement(RelativePathElement value);

	/**
	 * Returns the value of the '<em><b>Republish Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Republish Request</em>' containment reference.
	 * @see #setRepublishRequest(RepublishRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_RepublishRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RepublishRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	RepublishRequest getRepublishRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRepublishRequest <em>Republish Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Republish Request</em>' containment reference.
	 * @see #getRepublishRequest()
	 * @generated
	 */
	void setRepublishRequest(RepublishRequest value);

	/**
	 * Returns the value of the '<em><b>Republish Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Republish Response</em>' containment reference.
	 * @see #setRepublishResponse(RepublishResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_RepublishResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RepublishResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	RepublishResponse getRepublishResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRepublishResponse <em>Republish Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Republish Response</em>' containment reference.
	 * @see #getRepublishResponse()
	 * @generated
	 */
	void setRepublishResponse(RepublishResponse value);

	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference.
	 * @see #setRequestHeader(RequestHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_RequestHeader()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestHeader getRequestHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRequestHeader <em>Request Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Header</em>' containment reference.
	 * @see #getRequestHeader()
	 * @generated
	 */
	void setRequestHeader(RequestHeader value);

	/**
	 * Returns the value of the '<em><b>Response Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Header</em>' containment reference.
	 * @see #setResponseHeader(ResponseHeader)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ResponseHeader()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResponseHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseHeader getResponseHeader();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Header</em>' containment reference.
	 * @see #getResponseHeader()
	 * @generated
	 */
	void setResponseHeader(ResponseHeader value);

	/**
	 * Returns the value of the '<em><b>Role Permission Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Permission Type</em>' containment reference.
	 * @see #setRolePermissionType(RolePermissionType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_RolePermissionType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RolePermissionType' namespace='##targetNamespace'"
	 * @generated
	 */
	RolePermissionType getRolePermissionType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRolePermissionType <em>Role Permission Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Permission Type</em>' containment reference.
	 * @see #getRolePermissionType()
	 * @generated
	 */
	void setRolePermissionType(RolePermissionType value);

	/**
	 * Returns the value of the '<em><b>Rsa Encrypted Secret</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rsa Encrypted Secret</em>' containment reference.
	 * @see #setRsaEncryptedSecret(Variant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_RsaEncryptedSecret()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RsaEncryptedSecret' namespace='##targetNamespace'"
	 * @generated
	 */
	Variant getRsaEncryptedSecret();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRsaEncryptedSecret <em>Rsa Encrypted Secret</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rsa Encrypted Secret</em>' containment reference.
	 * @see #getRsaEncryptedSecret()
	 * @generated
	 */
	void setRsaEncryptedSecret(Variant value);

	/**
	 * Returns the value of the '<em><b>Sampling Interval Diagnostics Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Interval Diagnostics Data Type</em>' containment reference.
	 * @see #setSamplingIntervalDiagnosticsDataType(SamplingIntervalDiagnosticsDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SamplingIntervalDiagnosticsDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SamplingIntervalDiagnosticsDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	SamplingIntervalDiagnosticsDataType getSamplingIntervalDiagnosticsDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSamplingIntervalDiagnosticsDataType <em>Sampling Interval Diagnostics Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Interval Diagnostics Data Type</em>' containment reference.
	 * @see #getSamplingIntervalDiagnosticsDataType()
	 * @generated
	 */
	void setSamplingIntervalDiagnosticsDataType(SamplingIntervalDiagnosticsDataType value);

	/**
	 * Returns the value of the '<em><b>SByte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SByte</em>' attribute.
	 * @see #setSByte(Byte)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SByte()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.ByteObject" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SByte' namespace='##targetNamespace'"
	 * @generated
	 */
	Byte getSByte();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSByte <em>SByte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SByte</em>' attribute.
	 * @see #getSByte()
	 * @generated
	 */
	void setSByte(Byte value);

	/**
	 * Returns the value of the '<em><b>Security Token Request Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.SecurityTokenRequestType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Token Request Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.SecurityTokenRequestType
	 * @see #setSecurityTokenRequestType(SecurityTokenRequestType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SecurityTokenRequestType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SecurityTokenRequestType' namespace='##targetNamespace'"
	 * @generated
	 */
	SecurityTokenRequestType getSecurityTokenRequestType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSecurityTokenRequestType <em>Security Token Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Token Request Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.SecurityTokenRequestType
	 * @see #getSecurityTokenRequestType()
	 * @generated
	 */
	void setSecurityTokenRequestType(SecurityTokenRequestType value);

	/**
	 * Returns the value of the '<em><b>Semantic Change Structure Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Change Structure Data Type</em>' containment reference.
	 * @see #setSemanticChangeStructureDataType(SemanticChangeStructureDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SemanticChangeStructureDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SemanticChangeStructureDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	SemanticChangeStructureDataType getSemanticChangeStructureDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSemanticChangeStructureDataType <em>Semantic Change Structure Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Change Structure Data Type</em>' containment reference.
	 * @see #getSemanticChangeStructureDataType()
	 * @generated
	 */
	void setSemanticChangeStructureDataType(SemanticChangeStructureDataType value);

	/**
	 * Returns the value of the '<em><b>Server Diagnostics Summary Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Diagnostics Summary Data Type</em>' containment reference.
	 * @see #setServerDiagnosticsSummaryDataType(ServerDiagnosticsSummaryDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ServerDiagnosticsSummaryDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServerDiagnosticsSummaryDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ServerDiagnosticsSummaryDataType getServerDiagnosticsSummaryDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerDiagnosticsSummaryDataType <em>Server Diagnostics Summary Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Diagnostics Summary Data Type</em>' containment reference.
	 * @see #getServerDiagnosticsSummaryDataType()
	 * @generated
	 */
	void setServerDiagnosticsSummaryDataType(ServerDiagnosticsSummaryDataType value);

	/**
	 * Returns the value of the '<em><b>Server On Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server On Network</em>' containment reference.
	 * @see #setServerOnNetwork(ServerOnNetwork)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ServerOnNetwork()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServerOnNetwork' namespace='##targetNamespace'"
	 * @generated
	 */
	ServerOnNetwork getServerOnNetwork();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerOnNetwork <em>Server On Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server On Network</em>' containment reference.
	 * @see #getServerOnNetwork()
	 * @generated
	 */
	void setServerOnNetwork(ServerOnNetwork value);

	/**
	 * Returns the value of the '<em><b>Server State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.ServerState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server State</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.ServerState
	 * @see #setServerState(ServerState)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ServerState()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServerState' namespace='##targetNamespace'"
	 * @generated
	 */
	ServerState getServerState();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerState <em>Server State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server State</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.ServerState
	 * @see #getServerState()
	 * @generated
	 */
	void setServerState(ServerState value);

	/**
	 * Returns the value of the '<em><b>Server Status Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Status Data Type</em>' containment reference.
	 * @see #setServerStatusDataType(ServerStatusDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ServerStatusDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServerStatusDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ServerStatusDataType getServerStatusDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerStatusDataType <em>Server Status Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Status Data Type</em>' containment reference.
	 * @see #getServerStatusDataType()
	 * @generated
	 */
	void setServerStatusDataType(ServerStatusDataType value);

	/**
	 * Returns the value of the '<em><b>Service Counter Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Counter Data Type</em>' containment reference.
	 * @see #setServiceCounterDataType(ServiceCounterDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ServiceCounterDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceCounterDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCounterDataType getServiceCounterDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServiceCounterDataType <em>Service Counter Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Counter Data Type</em>' containment reference.
	 * @see #getServiceCounterDataType()
	 * @generated
	 */
	void setServiceCounterDataType(ServiceCounterDataType value);

	/**
	 * Returns the value of the '<em><b>Service Fault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Fault</em>' containment reference.
	 * @see #setServiceFault(ServiceFault)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ServiceFault()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceFault' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceFault getServiceFault();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServiceFault <em>Service Fault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Fault</em>' containment reference.
	 * @see #getServiceFault()
	 * @generated
	 */
	void setServiceFault(ServiceFault value);

	/**
	 * Returns the value of the '<em><b>Session Authentication Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Authentication Token</em>' containment reference.
	 * @see #setSessionAuthenticationToken(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SessionAuthenticationToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SessionAuthenticationToken' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getSessionAuthenticationToken();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionAuthenticationToken <em>Session Authentication Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Authentication Token</em>' containment reference.
	 * @see #getSessionAuthenticationToken()
	 * @generated
	 */
	void setSessionAuthenticationToken(NodeId value);

	/**
	 * Returns the value of the '<em><b>Session Diagnostics Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Diagnostics Data Type</em>' containment reference.
	 * @see #setSessionDiagnosticsDataType(SessionDiagnosticsDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SessionDiagnosticsDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SessionDiagnosticsDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	SessionDiagnosticsDataType getSessionDiagnosticsDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionDiagnosticsDataType <em>Session Diagnostics Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Diagnostics Data Type</em>' containment reference.
	 * @see #getSessionDiagnosticsDataType()
	 * @generated
	 */
	void setSessionDiagnosticsDataType(SessionDiagnosticsDataType value);

	/**
	 * Returns the value of the '<em><b>Sessionless Invoke Request Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sessionless Invoke Request Type</em>' containment reference.
	 * @see #setSessionlessInvokeRequestType(SessionlessInvokeRequestType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SessionlessInvokeRequestType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SessionlessInvokeRequestType' namespace='##targetNamespace'"
	 * @generated
	 */
	SessionlessInvokeRequestType getSessionlessInvokeRequestType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionlessInvokeRequestType <em>Sessionless Invoke Request Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sessionless Invoke Request Type</em>' containment reference.
	 * @see #getSessionlessInvokeRequestType()
	 * @generated
	 */
	void setSessionlessInvokeRequestType(SessionlessInvokeRequestType value);

	/**
	 * Returns the value of the '<em><b>Sessionless Invoke Response Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sessionless Invoke Response Type</em>' containment reference.
	 * @see #setSessionlessInvokeResponseType(SessionlessInvokeResponseType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SessionlessInvokeResponseType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SessionlessInvokeResponseType' namespace='##targetNamespace'"
	 * @generated
	 */
	SessionlessInvokeResponseType getSessionlessInvokeResponseType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionlessInvokeResponseType <em>Sessionless Invoke Response Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sessionless Invoke Response Type</em>' containment reference.
	 * @see #getSessionlessInvokeResponseType()
	 * @generated
	 */
	void setSessionlessInvokeResponseType(SessionlessInvokeResponseType value);

	/**
	 * Returns the value of the '<em><b>Session Security Diagnostics Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Security Diagnostics Data Type</em>' containment reference.
	 * @see #setSessionSecurityDiagnosticsDataType(SessionSecurityDiagnosticsDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SessionSecurityDiagnosticsDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SessionSecurityDiagnosticsDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	SessionSecurityDiagnosticsDataType getSessionSecurityDiagnosticsDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionSecurityDiagnosticsDataType <em>Session Security Diagnostics Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Security Diagnostics Data Type</em>' containment reference.
	 * @see #getSessionSecurityDiagnosticsDataType()
	 * @generated
	 */
	void setSessionSecurityDiagnosticsDataType(SessionSecurityDiagnosticsDataType value);

	/**
	 * Returns the value of the '<em><b>Set Monitoring Mode Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Monitoring Mode Request</em>' containment reference.
	 * @see #setSetMonitoringModeRequest(SetMonitoringModeRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SetMonitoringModeRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SetMonitoringModeRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	SetMonitoringModeRequest getSetMonitoringModeRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetMonitoringModeRequest <em>Set Monitoring Mode Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Monitoring Mode Request</em>' containment reference.
	 * @see #getSetMonitoringModeRequest()
	 * @generated
	 */
	void setSetMonitoringModeRequest(SetMonitoringModeRequest value);

	/**
	 * Returns the value of the '<em><b>Set Monitoring Mode Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Monitoring Mode Response</em>' containment reference.
	 * @see #setSetMonitoringModeResponse(SetMonitoringModeResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SetMonitoringModeResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SetMonitoringModeResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	SetMonitoringModeResponse getSetMonitoringModeResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetMonitoringModeResponse <em>Set Monitoring Mode Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Monitoring Mode Response</em>' containment reference.
	 * @see #getSetMonitoringModeResponse()
	 * @generated
	 */
	void setSetMonitoringModeResponse(SetMonitoringModeResponse value);

	/**
	 * Returns the value of the '<em><b>Set Publishing Mode Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Publishing Mode Request</em>' containment reference.
	 * @see #setSetPublishingModeRequest(SetPublishingModeRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SetPublishingModeRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SetPublishingModeRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	SetPublishingModeRequest getSetPublishingModeRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetPublishingModeRequest <em>Set Publishing Mode Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Publishing Mode Request</em>' containment reference.
	 * @see #getSetPublishingModeRequest()
	 * @generated
	 */
	void setSetPublishingModeRequest(SetPublishingModeRequest value);

	/**
	 * Returns the value of the '<em><b>Set Publishing Mode Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Publishing Mode Response</em>' containment reference.
	 * @see #setSetPublishingModeResponse(SetPublishingModeResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SetPublishingModeResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SetPublishingModeResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	SetPublishingModeResponse getSetPublishingModeResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetPublishingModeResponse <em>Set Publishing Mode Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Publishing Mode Response</em>' containment reference.
	 * @see #getSetPublishingModeResponse()
	 * @generated
	 */
	void setSetPublishingModeResponse(SetPublishingModeResponse value);

	/**
	 * Returns the value of the '<em><b>Set Triggering Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Triggering Request</em>' containment reference.
	 * @see #setSetTriggeringRequest(SetTriggeringRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SetTriggeringRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SetTriggeringRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	SetTriggeringRequest getSetTriggeringRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetTriggeringRequest <em>Set Triggering Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Triggering Request</em>' containment reference.
	 * @see #getSetTriggeringRequest()
	 * @generated
	 */
	void setSetTriggeringRequest(SetTriggeringRequest value);

	/**
	 * Returns the value of the '<em><b>Set Triggering Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Triggering Response</em>' containment reference.
	 * @see #setSetTriggeringResponse(SetTriggeringResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SetTriggeringResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SetTriggeringResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	SetTriggeringResponse getSetTriggeringResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetTriggeringResponse <em>Set Triggering Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Triggering Response</em>' containment reference.
	 * @see #getSetTriggeringResponse()
	 * @generated
	 */
	void setSetTriggeringResponse(SetTriggeringResponse value);

	/**
	 * Returns the value of the '<em><b>Signature Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Data</em>' containment reference.
	 * @see #setSignatureData(SignatureData)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SignatureData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignatureData' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatureData getSignatureData();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSignatureData <em>Signature Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Data</em>' containment reference.
	 * @see #getSignatureData()
	 * @generated
	 */
	void setSignatureData(SignatureData value);

	/**
	 * Returns the value of the '<em><b>Signed Software Certificate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signed Software Certificate</em>' containment reference.
	 * @see #setSignedSoftwareCertificate(SignedSoftwareCertificate)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SignedSoftwareCertificate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignedSoftwareCertificate' namespace='##targetNamespace'"
	 * @generated
	 */
	SignedSoftwareCertificate getSignedSoftwareCertificate();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSignedSoftwareCertificate <em>Signed Software Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signed Software Certificate</em>' containment reference.
	 * @see #getSignedSoftwareCertificate()
	 * @generated
	 */
	void setSignedSoftwareCertificate(SignedSoftwareCertificate value);

	/**
	 * Returns the value of the '<em><b>Simple Attribute Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Attribute Operand</em>' containment reference.
	 * @see #setSimpleAttributeOperand(SimpleAttributeOperand)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SimpleAttributeOperand()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SimpleAttributeOperand' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleAttributeOperand getSimpleAttributeOperand();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSimpleAttributeOperand <em>Simple Attribute Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Attribute Operand</em>' containment reference.
	 * @see #getSimpleAttributeOperand()
	 * @generated
	 */
	void setSimpleAttributeOperand(SimpleAttributeOperand value);

	/**
	 * Returns the value of the '<em><b>Simple Type Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Type Description</em>' containment reference.
	 * @see #setSimpleTypeDescription(SimpleTypeDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SimpleTypeDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SimpleTypeDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleTypeDescription getSimpleTypeDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSimpleTypeDescription <em>Simple Type Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Type Description</em>' containment reference.
	 * @see #getSimpleTypeDescription()
	 * @generated
	 */
	void setSimpleTypeDescription(SimpleTypeDescription value);

	/**
	 * Returns the value of the '<em><b>Status Change Notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Change Notification</em>' containment reference.
	 * @see #setStatusChangeNotification(StatusChangeNotification)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_StatusChangeNotification()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StatusChangeNotification' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusChangeNotification getStatusChangeNotification();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStatusChangeNotification <em>Status Change Notification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Change Notification</em>' containment reference.
	 * @see #getStatusChangeNotification()
	 * @generated
	 */
	void setStatusChangeNotification(StatusChangeNotification value);

	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code</em>' containment reference.
	 * @see #setStatusCode(StatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_StatusCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StatusCode' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusCode getStatusCode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStatusCode <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' containment reference.
	 * @see #getStatusCode()
	 * @generated
	 */
	void setStatusCode(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Status Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Result</em>' containment reference.
	 * @see #setStatusResult(StatusResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_StatusResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StatusResult' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusResult getStatusResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStatusResult <em>Status Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Result</em>' containment reference.
	 * @see #getStatusResult()
	 * @generated
	 */
	void setStatusResult(StatusResult value);

	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_String()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='String' namespace='##targetNamespace'"
	 * @generated
	 */
	String getString();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
	void setString(String value);

	/**
	 * Returns the value of the '<em><b>Structure Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Definition</em>' containment reference.
	 * @see #setStructureDefinition(StructureDefinition)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_StructureDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StructureDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureDefinition getStructureDefinition();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureDefinition <em>Structure Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Definition</em>' containment reference.
	 * @see #getStructureDefinition()
	 * @generated
	 */
	void setStructureDefinition(StructureDefinition value);

	/**
	 * Returns the value of the '<em><b>Structure Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Description</em>' containment reference.
	 * @see #setStructureDescription(StructureDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_StructureDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StructureDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureDescription getStructureDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureDescription <em>Structure Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Description</em>' containment reference.
	 * @see #getStructureDescription()
	 * @generated
	 */
	void setStructureDescription(StructureDescription value);

	/**
	 * Returns the value of the '<em><b>Structure Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Field</em>' containment reference.
	 * @see #setStructureField(StructureField)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_StructureField()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StructureField' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureField getStructureField();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureField <em>Structure Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Field</em>' containment reference.
	 * @see #getStructureField()
	 * @generated
	 */
	void setStructureField(StructureField value);

	/**
	 * Returns the value of the '<em><b>Structure Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.StructureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.StructureType
	 * @see #setStructureType(StructureType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_StructureType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StructureType' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureType getStructureType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureType <em>Structure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.StructureType
	 * @see #getStructureType()
	 * @generated
	 */
	void setStructureType(StructureType value);

	/**
	 * Returns the value of the '<em><b>Subscribed Data Set Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribed Data Set Data Type</em>' containment reference.
	 * @see #setSubscribedDataSetDataType(SubscribedDataSetDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SubscribedDataSetDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubscribedDataSetDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscribedDataSetDataType getSubscribedDataSetDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscribedDataSetDataType <em>Subscribed Data Set Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribed Data Set Data Type</em>' containment reference.
	 * @see #getSubscribedDataSetDataType()
	 * @generated
	 */
	void setSubscribedDataSetDataType(SubscribedDataSetDataType value);

	/**
	 * Returns the value of the '<em><b>Subscribed Data Set Mirror Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribed Data Set Mirror Data Type</em>' containment reference.
	 * @see #setSubscribedDataSetMirrorDataType(SubscribedDataSetMirrorDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SubscribedDataSetMirrorDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubscribedDataSetMirrorDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscribedDataSetMirrorDataType getSubscribedDataSetMirrorDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscribedDataSetMirrorDataType <em>Subscribed Data Set Mirror Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribed Data Set Mirror Data Type</em>' containment reference.
	 * @see #getSubscribedDataSetMirrorDataType()
	 * @generated
	 */
	void setSubscribedDataSetMirrorDataType(SubscribedDataSetMirrorDataType value);

	/**
	 * Returns the value of the '<em><b>Subscription Acknowledgement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Acknowledgement</em>' containment reference.
	 * @see #setSubscriptionAcknowledgement(SubscriptionAcknowledgement)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SubscriptionAcknowledgement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubscriptionAcknowledgement' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscriptionAcknowledgement getSubscriptionAcknowledgement();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscriptionAcknowledgement <em>Subscription Acknowledgement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Acknowledgement</em>' containment reference.
	 * @see #getSubscriptionAcknowledgement()
	 * @generated
	 */
	void setSubscriptionAcknowledgement(SubscriptionAcknowledgement value);

	/**
	 * Returns the value of the '<em><b>Subscription Diagnostics Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Diagnostics Data Type</em>' containment reference.
	 * @see #setSubscriptionDiagnosticsDataType(SubscriptionDiagnosticsDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_SubscriptionDiagnosticsDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubscriptionDiagnosticsDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscriptionDiagnosticsDataType getSubscriptionDiagnosticsDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscriptionDiagnosticsDataType <em>Subscription Diagnostics Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Diagnostics Data Type</em>' containment reference.
	 * @see #getSubscriptionDiagnosticsDataType()
	 * @generated
	 */
	void setSubscriptionDiagnosticsDataType(SubscriptionDiagnosticsDataType value);

	/**
	 * Returns the value of the '<em><b>Target Variables Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Variables Data Type</em>' containment reference.
	 * @see #setTargetVariablesDataType(TargetVariablesDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_TargetVariablesDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TargetVariablesDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetVariablesDataType getTargetVariablesDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTargetVariablesDataType <em>Target Variables Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Variables Data Type</em>' containment reference.
	 * @see #getTargetVariablesDataType()
	 * @generated
	 */
	void setTargetVariablesDataType(TargetVariablesDataType value);

	/**
	 * Returns the value of the '<em><b>Three DCartesian Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Three DCartesian Coordinates</em>' containment reference.
	 * @see #setThreeDCartesianCoordinates(ThreeDCartesianCoordinates)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ThreeDCartesianCoordinates()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ThreeDCartesianCoordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	ThreeDCartesianCoordinates getThreeDCartesianCoordinates();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDCartesianCoordinates <em>Three DCartesian Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Three DCartesian Coordinates</em>' containment reference.
	 * @see #getThreeDCartesianCoordinates()
	 * @generated
	 */
	void setThreeDCartesianCoordinates(ThreeDCartesianCoordinates value);

	/**
	 * Returns the value of the '<em><b>Three DFrame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Three DFrame</em>' containment reference.
	 * @see #setThreeDFrame(ThreeDFrame)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ThreeDFrame()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ThreeDFrame' namespace='##targetNamespace'"
	 * @generated
	 */
	ThreeDFrame getThreeDFrame();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDFrame <em>Three DFrame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Three DFrame</em>' containment reference.
	 * @see #getThreeDFrame()
	 * @generated
	 */
	void setThreeDFrame(ThreeDFrame value);

	/**
	 * Returns the value of the '<em><b>Three DOrientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Three DOrientation</em>' containment reference.
	 * @see #setThreeDOrientation(ThreeDOrientation)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ThreeDOrientation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ThreeDOrientation' namespace='##targetNamespace'"
	 * @generated
	 */
	ThreeDOrientation getThreeDOrientation();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDOrientation <em>Three DOrientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Three DOrientation</em>' containment reference.
	 * @see #getThreeDOrientation()
	 * @generated
	 */
	void setThreeDOrientation(ThreeDOrientation value);

	/**
	 * Returns the value of the '<em><b>Three DVector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Three DVector</em>' containment reference.
	 * @see #setThreeDVector(ThreeDVector)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ThreeDVector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ThreeDVector' namespace='##targetNamespace'"
	 * @generated
	 */
	ThreeDVector getThreeDVector();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDVector <em>Three DVector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Three DVector</em>' containment reference.
	 * @see #getThreeDVector()
	 * @generated
	 */
	void setThreeDVector(ThreeDVector value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Time()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Time' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

	/**
	 * Returns the value of the '<em><b>Timestamps To Return</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.TimestampsToReturn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamps To Return</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.TimestampsToReturn
	 * @see #setTimestampsToReturn(TimestampsToReturn)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_TimestampsToReturn()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimestampsToReturn' namespace='##targetNamespace'"
	 * @generated
	 */
	TimestampsToReturn getTimestampsToReturn();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTimestampsToReturn <em>Timestamps To Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamps To Return</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.TimestampsToReturn
	 * @see #getTimestampsToReturn()
	 * @generated
	 */
	void setTimestampsToReturn(TimestampsToReturn value);

	/**
	 * Returns the value of the '<em><b>Time String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time String</em>' attribute.
	 * @see #setTimeString(String)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_TimeString()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeString' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTimeString();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTimeString <em>Time String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time String</em>' attribute.
	 * @see #getTimeString()
	 * @generated
	 */
	void setTimeString(String value);

	/**
	 * Returns the value of the '<em><b>Time Zone Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Zone Data Type</em>' containment reference.
	 * @see #setTimeZoneDataType(TimeZoneDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_TimeZoneDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeZoneDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeZoneDataType getTimeZoneDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTimeZoneDataType <em>Time Zone Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Zone Data Type</em>' containment reference.
	 * @see #getTimeZoneDataType()
	 * @generated
	 */
	void setTimeZoneDataType(TimeZoneDataType value);

	/**
	 * Returns the value of the '<em><b>Transfer Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Result</em>' containment reference.
	 * @see #setTransferResult(TransferResult)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_TransferResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransferResult' namespace='##targetNamespace'"
	 * @generated
	 */
	TransferResult getTransferResult();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTransferResult <em>Transfer Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Result</em>' containment reference.
	 * @see #getTransferResult()
	 * @generated
	 */
	void setTransferResult(TransferResult value);

	/**
	 * Returns the value of the '<em><b>Transfer Subscriptions Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Subscriptions Request</em>' containment reference.
	 * @see #setTransferSubscriptionsRequest(TransferSubscriptionsRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_TransferSubscriptionsRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransferSubscriptionsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	TransferSubscriptionsRequest getTransferSubscriptionsRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTransferSubscriptionsRequest <em>Transfer Subscriptions Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Subscriptions Request</em>' containment reference.
	 * @see #getTransferSubscriptionsRequest()
	 * @generated
	 */
	void setTransferSubscriptionsRequest(TransferSubscriptionsRequest value);

	/**
	 * Returns the value of the '<em><b>Transfer Subscriptions Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Subscriptions Response</em>' containment reference.
	 * @see #setTransferSubscriptionsResponse(TransferSubscriptionsResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_TransferSubscriptionsResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransferSubscriptionsResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	TransferSubscriptionsResponse getTransferSubscriptionsResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTransferSubscriptionsResponse <em>Transfer Subscriptions Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Subscriptions Response</em>' containment reference.
	 * @see #getTransferSubscriptionsResponse()
	 * @generated
	 */
	void setTransferSubscriptionsResponse(TransferSubscriptionsResponse value);

	/**
	 * Returns the value of the '<em><b>Translate Browse Paths To Node Ids Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translate Browse Paths To Node Ids Request</em>' containment reference.
	 * @see #setTranslateBrowsePathsToNodeIdsRequest(TranslateBrowsePathsToNodeIdsRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_TranslateBrowsePathsToNodeIdsRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TranslateBrowsePathsToNodeIdsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	TranslateBrowsePathsToNodeIdsRequest getTranslateBrowsePathsToNodeIdsRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTranslateBrowsePathsToNodeIdsRequest <em>Translate Browse Paths To Node Ids Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translate Browse Paths To Node Ids Request</em>' containment reference.
	 * @see #getTranslateBrowsePathsToNodeIdsRequest()
	 * @generated
	 */
	void setTranslateBrowsePathsToNodeIdsRequest(TranslateBrowsePathsToNodeIdsRequest value);

	/**
	 * Returns the value of the '<em><b>Translate Browse Paths To Node Ids Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translate Browse Paths To Node Ids Response</em>' containment reference.
	 * @see #setTranslateBrowsePathsToNodeIdsResponse(TranslateBrowsePathsToNodeIdsResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_TranslateBrowsePathsToNodeIdsResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TranslateBrowsePathsToNodeIdsResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	TranslateBrowsePathsToNodeIdsResponse getTranslateBrowsePathsToNodeIdsResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTranslateBrowsePathsToNodeIdsResponse <em>Translate Browse Paths To Node Ids Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translate Browse Paths To Node Ids Response</em>' containment reference.
	 * @see #getTranslateBrowsePathsToNodeIdsResponse()
	 * @generated
	 */
	void setTranslateBrowsePathsToNodeIdsResponse(TranslateBrowsePathsToNodeIdsResponse value);

	/**
	 * Returns the value of the '<em><b>Trust List Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trust List Data Type</em>' containment reference.
	 * @see #setTrustListDataType(TrustListDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_TrustListDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TrustListDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	TrustListDataType getTrustListDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTrustListDataType <em>Trust List Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trust List Data Type</em>' containment reference.
	 * @see #getTrustListDataType()
	 * @generated
	 */
	void setTrustListDataType(TrustListDataType value);

	/**
	 * Returns the value of the '<em><b>Trust List Masks</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.TrustListMasks}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trust List Masks</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.TrustListMasks
	 * @see #setTrustListMasks(TrustListMasks)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_TrustListMasks()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TrustListMasks' namespace='##targetNamespace'"
	 * @generated
	 */
	TrustListMasks getTrustListMasks();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTrustListMasks <em>Trust List Masks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trust List Masks</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.TrustListMasks
	 * @see #getTrustListMasks()
	 * @generated
	 */
	void setTrustListMasks(TrustListMasks value);

	/**
	 * Returns the value of the '<em><b>Type Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Node</em>' containment reference.
	 * @see #setTypeNode(TypeNode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_TypeNode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeNode' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeNode getTypeNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTypeNode <em>Type Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Node</em>' containment reference.
	 * @see #getTypeNode()
	 * @generated
	 */
	void setTypeNode(TypeNode value);

	/**
	 * Returns the value of the '<em><b>UA Binary File Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UA Binary File Data Type</em>' containment reference.
	 * @see #setUABinaryFileDataType(UABinaryFileDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UABinaryFileDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UABinaryFileDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	UABinaryFileDataType getUABinaryFileDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUABinaryFileDataType <em>UA Binary File Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UA Binary File Data Type</em>' containment reference.
	 * @see #getUABinaryFileDataType()
	 * @generated
	 */
	void setUABinaryFileDataType(UABinaryFileDataType value);

	/**
	 * Returns the value of the '<em><b>Uadp Data Set Message Content Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uadp Data Set Message Content Mask</em>' attribute.
	 * @see #setUadpDataSetMessageContentMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UadpDataSetMessageContentMask()
	 * @model unique="false" dataType="org.opcfoundation.ua._2008._02.types.UadpDataSetMessageContentMask" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UadpDataSetMessageContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getUadpDataSetMessageContentMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpDataSetMessageContentMask <em>Uadp Data Set Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uadp Data Set Message Content Mask</em>' attribute.
	 * @see #getUadpDataSetMessageContentMask()
	 * @generated
	 */
	void setUadpDataSetMessageContentMask(long value);

	/**
	 * Returns the value of the '<em><b>Uadp Data Set Reader Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uadp Data Set Reader Message Data Type</em>' containment reference.
	 * @see #setUadpDataSetReaderMessageDataType(UadpDataSetReaderMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UadpDataSetReaderMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UadpDataSetReaderMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	UadpDataSetReaderMessageDataType getUadpDataSetReaderMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpDataSetReaderMessageDataType <em>Uadp Data Set Reader Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uadp Data Set Reader Message Data Type</em>' containment reference.
	 * @see #getUadpDataSetReaderMessageDataType()
	 * @generated
	 */
	void setUadpDataSetReaderMessageDataType(UadpDataSetReaderMessageDataType value);

	/**
	 * Returns the value of the '<em><b>Uadp Data Set Writer Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uadp Data Set Writer Message Data Type</em>' containment reference.
	 * @see #setUadpDataSetWriterMessageDataType(UadpDataSetWriterMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UadpDataSetWriterMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UadpDataSetWriterMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	UadpDataSetWriterMessageDataType getUadpDataSetWriterMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpDataSetWriterMessageDataType <em>Uadp Data Set Writer Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uadp Data Set Writer Message Data Type</em>' containment reference.
	 * @see #getUadpDataSetWriterMessageDataType()
	 * @generated
	 */
	void setUadpDataSetWriterMessageDataType(UadpDataSetWriterMessageDataType value);

	/**
	 * Returns the value of the '<em><b>Uadp Network Message Content Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uadp Network Message Content Mask</em>' attribute.
	 * @see #setUadpNetworkMessageContentMask(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UadpNetworkMessageContentMask()
	 * @model unique="false" dataType="org.opcfoundation.ua._2008._02.types.UadpNetworkMessageContentMask" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UadpNetworkMessageContentMask' namespace='##targetNamespace'"
	 * @generated
	 */
	long getUadpNetworkMessageContentMask();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpNetworkMessageContentMask <em>Uadp Network Message Content Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uadp Network Message Content Mask</em>' attribute.
	 * @see #getUadpNetworkMessageContentMask()
	 * @generated
	 */
	void setUadpNetworkMessageContentMask(long value);

	/**
	 * Returns the value of the '<em><b>Uadp Writer Group Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uadp Writer Group Message Data Type</em>' containment reference.
	 * @see #setUadpWriterGroupMessageDataType(UadpWriterGroupMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UadpWriterGroupMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UadpWriterGroupMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	UadpWriterGroupMessageDataType getUadpWriterGroupMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpWriterGroupMessageDataType <em>Uadp Writer Group Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uadp Writer Group Message Data Type</em>' containment reference.
	 * @see #getUadpWriterGroupMessageDataType()
	 * @generated
	 */
	void setUadpWriterGroupMessageDataType(UadpWriterGroupMessageDataType value);

	/**
	 * Returns the value of the '<em><b>UInt16</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UInt16</em>' attribute.
	 * @see #setUInt16(Integer)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UInt16()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShortObject" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UInt16' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getUInt16();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUInt16 <em>UInt16</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UInt16</em>' attribute.
	 * @see #getUInt16()
	 * @generated
	 */
	void setUInt16(Integer value);

	/**
	 * Returns the value of the '<em><b>UInt32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UInt32</em>' attribute.
	 * @see #setUInt32(Long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UInt32()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedIntObject" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UInt32' namespace='##targetNamespace'"
	 * @generated
	 */
	Long getUInt32();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUInt32 <em>UInt32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UInt32</em>' attribute.
	 * @see #getUInt32()
	 * @generated
	 */
	void setUInt32(Long value);

	/**
	 * Returns the value of the '<em><b>UInt64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UInt64</em>' attribute.
	 * @see #setUInt64(BigInteger)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UInt64()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UInt64' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getUInt64();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUInt64 <em>UInt64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UInt64</em>' attribute.
	 * @see #getUInt64()
	 * @generated
	 */
	void setUInt64(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Union</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union</em>' containment reference.
	 * @see #setUnion(Union)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Union()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Union' namespace='##targetNamespace'"
	 * @generated
	 */
	Union getUnion();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUnion <em>Union</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Union</em>' containment reference.
	 * @see #getUnion()
	 * @generated
	 */
	void setUnion(Union value);

	/**
	 * Returns the value of the '<em><b>Unregister Nodes Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unregister Nodes Request</em>' containment reference.
	 * @see #setUnregisterNodesRequest(UnregisterNodesRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UnregisterNodesRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnregisterNodesRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	UnregisterNodesRequest getUnregisterNodesRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUnregisterNodesRequest <em>Unregister Nodes Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unregister Nodes Request</em>' containment reference.
	 * @see #getUnregisterNodesRequest()
	 * @generated
	 */
	void setUnregisterNodesRequest(UnregisterNodesRequest value);

	/**
	 * Returns the value of the '<em><b>Unregister Nodes Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unregister Nodes Response</em>' containment reference.
	 * @see #setUnregisterNodesResponse(UnregisterNodesResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UnregisterNodesResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnregisterNodesResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	UnregisterNodesResponse getUnregisterNodesResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUnregisterNodesResponse <em>Unregister Nodes Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unregister Nodes Response</em>' containment reference.
	 * @see #getUnregisterNodesResponse()
	 * @generated
	 */
	void setUnregisterNodesResponse(UnregisterNodesResponse value);

	/**
	 * Returns the value of the '<em><b>Update Data Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Data Details</em>' containment reference.
	 * @see #setUpdateDataDetails(UpdateDataDetails)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UpdateDataDetails()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UpdateDataDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateDataDetails getUpdateDataDetails();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUpdateDataDetails <em>Update Data Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Data Details</em>' containment reference.
	 * @see #getUpdateDataDetails()
	 * @generated
	 */
	void setUpdateDataDetails(UpdateDataDetails value);

	/**
	 * Returns the value of the '<em><b>Update Event Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Event Details</em>' containment reference.
	 * @see #setUpdateEventDetails(UpdateEventDetails)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UpdateEventDetails()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UpdateEventDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateEventDetails getUpdateEventDetails();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUpdateEventDetails <em>Update Event Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Event Details</em>' containment reference.
	 * @see #getUpdateEventDetails()
	 * @generated
	 */
	void setUpdateEventDetails(UpdateEventDetails value);

	/**
	 * Returns the value of the '<em><b>Update Structure Data Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Structure Data Details</em>' containment reference.
	 * @see #setUpdateStructureDataDetails(UpdateStructureDataDetails)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UpdateStructureDataDetails()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UpdateStructureDataDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateStructureDataDetails getUpdateStructureDataDetails();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUpdateStructureDataDetails <em>Update Structure Data Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Structure Data Details</em>' containment reference.
	 * @see #getUpdateStructureDataDetails()
	 * @generated
	 */
	void setUpdateStructureDataDetails(UpdateStructureDataDetails value);

	/**
	 * Returns the value of the '<em><b>User Identity Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Identity Token</em>' containment reference.
	 * @see #setUserIdentityToken(UserIdentityToken)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UserIdentityToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UserIdentityToken' namespace='##targetNamespace'"
	 * @generated
	 */
	UserIdentityToken getUserIdentityToken();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserIdentityToken <em>User Identity Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Identity Token</em>' containment reference.
	 * @see #getUserIdentityToken()
	 * @generated
	 */
	void setUserIdentityToken(UserIdentityToken value);

	/**
	 * Returns the value of the '<em><b>User Name Identity Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name Identity Token</em>' containment reference.
	 * @see #setUserNameIdentityToken(UserNameIdentityToken)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UserNameIdentityToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UserNameIdentityToken' namespace='##targetNamespace'"
	 * @generated
	 */
	UserNameIdentityToken getUserNameIdentityToken();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserNameIdentityToken <em>User Name Identity Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name Identity Token</em>' containment reference.
	 * @see #getUserNameIdentityToken()
	 * @generated
	 */
	void setUserNameIdentityToken(UserNameIdentityToken value);

	/**
	 * Returns the value of the '<em><b>User Token Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Token Policy</em>' containment reference.
	 * @see #setUserTokenPolicy(UserTokenPolicy)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UserTokenPolicy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UserTokenPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	UserTokenPolicy getUserTokenPolicy();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserTokenPolicy <em>User Token Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Token Policy</em>' containment reference.
	 * @see #getUserTokenPolicy()
	 * @generated
	 */
	void setUserTokenPolicy(UserTokenPolicy value);

	/**
	 * Returns the value of the '<em><b>User Token Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.opcfoundation.ua._2008._02.types.UserTokenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Token Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.UserTokenType
	 * @see #setUserTokenType(UserTokenType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UserTokenType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UserTokenType' namespace='##targetNamespace'"
	 * @generated
	 */
	UserTokenType getUserTokenType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserTokenType <em>User Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Token Type</em>' attribute.
	 * @see org.opcfoundation.ua._2008._02.types.UserTokenType
	 * @see #getUserTokenType()
	 * @generated
	 */
	void setUserTokenType(UserTokenType value);

	/**
	 * Returns the value of the '<em><b>Utc Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utc Time</em>' attribute.
	 * @see #setUtcTime(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_UtcTime()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UtcTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getUtcTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUtcTime <em>Utc Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utc Time</em>' attribute.
	 * @see #getUtcTime()
	 * @generated
	 */
	void setUtcTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Variable Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Attributes</em>' containment reference.
	 * @see #setVariableAttributes(VariableAttributes)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_VariableAttributes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VariableAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableAttributes getVariableAttributes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableAttributes <em>Variable Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Attributes</em>' containment reference.
	 * @see #getVariableAttributes()
	 * @generated
	 */
	void setVariableAttributes(VariableAttributes value);

	/**
	 * Returns the value of the '<em><b>Variable Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Node</em>' containment reference.
	 * @see #setVariableNode(VariableNode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_VariableNode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VariableNode' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableNode getVariableNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableNode <em>Variable Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Node</em>' containment reference.
	 * @see #getVariableNode()
	 * @generated
	 */
	void setVariableNode(VariableNode value);

	/**
	 * Returns the value of the '<em><b>Variable Type Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Type Attributes</em>' containment reference.
	 * @see #setVariableTypeAttributes(VariableTypeAttributes)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_VariableTypeAttributes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VariableTypeAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableTypeAttributes getVariableTypeAttributes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableTypeAttributes <em>Variable Type Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Type Attributes</em>' containment reference.
	 * @see #getVariableTypeAttributes()
	 * @generated
	 */
	void setVariableTypeAttributes(VariableTypeAttributes value);

	/**
	 * Returns the value of the '<em><b>Variable Type Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Type Node</em>' containment reference.
	 * @see #setVariableTypeNode(VariableTypeNode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_VariableTypeNode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VariableTypeNode' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableTypeNode getVariableTypeNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableTypeNode <em>Variable Type Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Type Node</em>' containment reference.
	 * @see #getVariableTypeNode()
	 * @generated
	 */
	void setVariableTypeNode(VariableTypeNode value);

	/**
	 * Returns the value of the '<em><b>Variant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' containment reference.
	 * @see #setVariant(Variant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Variant()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Variant' namespace='##targetNamespace'"
	 * @generated
	 */
	Variant getVariant();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariant <em>Variant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant</em>' containment reference.
	 * @see #getVariant()
	 * @generated
	 */
	void setVariant(Variant value);

	/**
	 * Returns the value of the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector</em>' containment reference.
	 * @see #setVector(Vector)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_Vector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Vector' namespace='##targetNamespace'"
	 * @generated
	 */
	Vector getVector();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVector <em>Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector</em>' containment reference.
	 * @see #getVector()
	 * @generated
	 */
	void setVector(Vector value);

	/**
	 * Returns the value of the '<em><b>Version Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Time</em>' attribute.
	 * @see #setVersionTime(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_VersionTime()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VersionTime' namespace='##targetNamespace'"
	 * @generated
	 */
	long getVersionTime();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVersionTime <em>Version Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Time</em>' attribute.
	 * @see #getVersionTime()
	 * @generated
	 */
	void setVersionTime(long value);

	/**
	 * Returns the value of the '<em><b>View Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Attributes</em>' containment reference.
	 * @see #setViewAttributes(ViewAttributes)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ViewAttributes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ViewAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	ViewAttributes getViewAttributes();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getViewAttributes <em>View Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Attributes</em>' containment reference.
	 * @see #getViewAttributes()
	 * @generated
	 */
	void setViewAttributes(ViewAttributes value);

	/**
	 * Returns the value of the '<em><b>View Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Description</em>' containment reference.
	 * @see #setViewDescription(ViewDescription)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ViewDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ViewDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ViewDescription getViewDescription();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getViewDescription <em>View Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Description</em>' containment reference.
	 * @see #getViewDescription()
	 * @generated
	 */
	void setViewDescription(ViewDescription value);

	/**
	 * Returns the value of the '<em><b>View Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Node</em>' containment reference.
	 * @see #setViewNode(ViewNode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_ViewNode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ViewNode' namespace='##targetNamespace'"
	 * @generated
	 */
	ViewNode getViewNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getViewNode <em>View Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Node</em>' containment reference.
	 * @see #getViewNode()
	 * @generated
	 */
	void setViewNode(ViewNode value);

	/**
	 * Returns the value of the '<em><b>Write Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Request</em>' containment reference.
	 * @see #setWriteRequest(WriteRequest)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_WriteRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WriteRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	WriteRequest getWriteRequest();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriteRequest <em>Write Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Request</em>' containment reference.
	 * @see #getWriteRequest()
	 * @generated
	 */
	void setWriteRequest(WriteRequest value);

	/**
	 * Returns the value of the '<em><b>Write Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Response</em>' containment reference.
	 * @see #setWriteResponse(WriteResponse)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_WriteResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WriteResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	WriteResponse getWriteResponse();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriteResponse <em>Write Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Response</em>' containment reference.
	 * @see #getWriteResponse()
	 * @generated
	 */
	void setWriteResponse(WriteResponse value);

	/**
	 * Returns the value of the '<em><b>Writer Group Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writer Group Data Type</em>' containment reference.
	 * @see #setWriterGroupDataType(WriterGroupDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_WriterGroupDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WriterGroupDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	WriterGroupDataType getWriterGroupDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriterGroupDataType <em>Writer Group Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writer Group Data Type</em>' containment reference.
	 * @see #getWriterGroupDataType()
	 * @generated
	 */
	void setWriterGroupDataType(WriterGroupDataType value);

	/**
	 * Returns the value of the '<em><b>Writer Group Message Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writer Group Message Data Type</em>' containment reference.
	 * @see #setWriterGroupMessageDataType(WriterGroupMessageDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_WriterGroupMessageDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WriterGroupMessageDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	WriterGroupMessageDataType getWriterGroupMessageDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriterGroupMessageDataType <em>Writer Group Message Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writer Group Message Data Type</em>' containment reference.
	 * @see #getWriterGroupMessageDataType()
	 * @generated
	 */
	void setWriterGroupMessageDataType(WriterGroupMessageDataType value);

	/**
	 * Returns the value of the '<em><b>Writer Group Transport Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writer Group Transport Data Type</em>' containment reference.
	 * @see #setWriterGroupTransportDataType(WriterGroupTransportDataType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_WriterGroupTransportDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WriterGroupTransportDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	WriterGroupTransportDataType getWriterGroupTransportDataType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriterGroupTransportDataType <em>Writer Group Transport Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writer Group Transport Data Type</em>' containment reference.
	 * @see #getWriterGroupTransportDataType()
	 * @generated
	 */
	void setWriterGroupTransportDataType(WriterGroupTransportDataType value);

	/**
	 * Returns the value of the '<em><b>Write Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Value</em>' containment reference.
	 * @see #setWriteValue(WriteValue)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_WriteValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WriteValue' namespace='##targetNamespace'"
	 * @generated
	 */
	WriteValue getWriteValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriteValue <em>Write Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Value</em>' containment reference.
	 * @see #getWriteValue()
	 * @generated
	 */
	void setWriteValue(WriteValue value);

	/**
	 * Returns the value of the '<em><b>X509 Identity Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X509 Identity Token</em>' containment reference.
	 * @see #setX509IdentityToken(X509IdentityToken)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_X509IdentityToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='X509IdentityToken' namespace='##targetNamespace'"
	 * @generated
	 */
	X509IdentityToken getX509IdentityToken();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getX509IdentityToken <em>X509 Identity Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X509 Identity Token</em>' containment reference.
	 * @see #getX509IdentityToken()
	 * @generated
	 */
	void setX509IdentityToken(X509IdentityToken value);

	/**
	 * Returns the value of the '<em><b>XV Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XV Type</em>' containment reference.
	 * @see #setXVType(XVType)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDocumentRoot_XVType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='XVType' namespace='##targetNamespace'"
	 * @generated
	 */
	XVType getXVType();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getXVType <em>XV Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XV Type</em>' containment reference.
	 * @see #getXVType()
	 * @generated
	 */
	void setXVType(XVType value);

} // DocumentRoot
