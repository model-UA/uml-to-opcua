/**
 */
package org.opcfoundation.ua._2008._02.types.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.opcfoundation.ua._2008._02.types.DocumentRoot;
import org.opcfoundation.ua._2008._02.types.TypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAccessLevelExType() <em>Access Level Ex Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAccessLevelType() <em>Access Level Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getActivateSessionRequest() <em>Activate Session Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getActivateSessionResponse() <em>Activate Session Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesItem() <em>Add Nodes Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesRequest() <em>Add Nodes Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesResponse() <em>Add Nodes Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesResult() <em>Add Nodes Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddReferencesItem() <em>Add References Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddReferencesRequest() <em>Add References Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddReferencesResponse() <em>Add References Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAggregateConfiguration() <em>Aggregate Configuration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAggregateFilter() <em>Aggregate Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAggregateFilterResult() <em>Aggregate Filter Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAliasNameDataType() <em>Alias Name Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAnnotation() <em>Annotation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAnonymousIdentityToken() <em>Anonymous Identity Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getApplicationDescription() <em>Application Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getApplicationInstanceCertificate() <em>Application Instance Certificate</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getApplicationType() <em>Application Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getArgument() <em>Argument</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAttributeOperand() <em>Attribute Operand</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAttributeWriteMask() <em>Attribute Write Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAudioDataType() <em>Audio Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAxisInformation() <em>Axis Information</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAxisScaleEnumeration() <em>Axis Scale Enumeration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBitFieldMaskDataType() <em>Bit Field Mask Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBoolean() <em>Boolean</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerConnectionTransportDataType() <em>Broker Connection Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerDataSetReaderTransportDataType() <em>Broker Data Set Reader Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerDataSetWriterTransportDataType() <em>Broker Data Set Writer Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerTransportQualityOfService() <em>Broker Transport Quality Of Service</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerWriterGroupTransportDataType() <em>Broker Writer Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseDescription() <em>Browse Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseDirection() <em>Browse Direction</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseNextRequest() <em>Browse Next Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseNextResponse() <em>Browse Next Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowsePath() <em>Browse Path</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowsePathResult() <em>Browse Path Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowsePathTarget() <em>Browse Path Target</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseRequest() <em>Browse Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseResponse() <em>Browse Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseResult() <em>Browse Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseResultMask() <em>Browse Result Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBuildInfo() <em>Build Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getByte() <em>Byte</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getByteString() <em>Byte String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallMethodRequest() <em>Call Method Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallMethodResult() <em>Call Method Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallRequest() <em>Call Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallResponse() <em>Call Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCancelRequest() <em>Cancel Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCancelResponse() <em>Cancel Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCartesianCoordinates() <em>Cartesian Coordinates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getChannelSecurityToken() <em>Channel Security Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSecureChannelRequest() <em>Close Secure Channel Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSecureChannelResponse() <em>Close Secure Channel Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSessionRequest() <em>Close Session Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSessionResponse() <em>Close Session Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getComplexNumberType() <em>Complex Number Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getConfigurationVersionDataType() <em>Configuration Version Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getConnectionTransportDataType() <em>Connection Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilter() <em>Content Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilterElement() <em>Content Filter Element</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilterElementResult() <em>Content Filter Element Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilterResult() <em>Content Filter Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContinuationPoint() <em>Continuation Point</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCounter() <em>Counter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateMonitoredItemsRequest() <em>Create Monitored Items Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateMonitoredItemsResponse() <em>Create Monitored Items Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSessionRequest() <em>Create Session Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSessionResponse() <em>Create Session Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSubscriptionRequest() <em>Create Subscription Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSubscriptionResponse() <em>Create Subscription Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCurrencyUnitType() <em>Currency Unit Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataChangeFilter() <em>Data Change Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataChangeNotification() <em>Data Change Notification</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataChangeTrigger() <em>Data Change Trigger</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDatagramConnectionTransportDataType() <em>Datagram Connection Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDatagramWriterGroupTransportDataType() <em>Datagram Writer Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetFieldContentMask() <em>Data Set Field Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetFieldFlags() <em>Data Set Field Flags</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetMetaDataType() <em>Data Set Meta Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetOrderingType() <em>Data Set Ordering Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetReaderDataType() <em>Data Set Reader Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetReaderMessageDataType() <em>Data Set Reader Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetReaderTransportDataType() <em>Data Set Reader Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetWriterDataType() <em>Data Set Writer Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetWriterMessageDataType() <em>Data Set Writer Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetWriterTransportDataType() <em>Data Set Writer Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeAttributes() <em>Data Type Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeDefinition() <em>Data Type Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeDescription() <em>Data Type Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeNode() <em>Data Type Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeSchemaHeader() <em>Data Type Schema Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataValue() <em>Data Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDate() <em>Date</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDateString() <em>Date String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDateTime() <em>Date Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeadbandType() <em>Deadband Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDecimalDataType() <em>Decimal Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDecimalString() <em>Decimal String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteAtTimeDetails() <em>Delete At Time Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteEventDetails() <em>Delete Event Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteMonitoredItemsRequest() <em>Delete Monitored Items Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteMonitoredItemsResponse() <em>Delete Monitored Items Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteNodesItem() <em>Delete Nodes Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteNodesRequest() <em>Delete Nodes Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteNodesResponse() <em>Delete Nodes Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteRawModifiedDetails() <em>Delete Raw Modified Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteReferencesItem() <em>Delete References Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteReferencesRequest() <em>Delete References Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteReferencesResponse() <em>Delete References Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteSubscriptionsRequest() <em>Delete Subscriptions Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteSubscriptionsResponse() <em>Delete Subscriptions Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDiagnosticInfo() <em>Diagnostic Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDiagnosticsLevel() <em>Diagnostics Level</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDiscoveryConfiguration() <em>Discovery Configuration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDouble() <em>Double</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDoubleComplexNumberType() <em>Double Complex Number Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDuration() <em>Duration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDurationString() <em>Duration String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getElementOperand() <em>Element Operand</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointConfiguration() <em>Endpoint Configuration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointDescription() <em>Endpoint Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointType() <em>Endpoint Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointUrlListDataType() <em>Endpoint Url List Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumDefinition() <em>Enum Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumDescription() <em>Enum Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumField() <em>Enum Field</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumValueType() <em>Enum Value Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEUInformation() <em>EU Information</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventFieldList() <em>Event Field List</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventFilter() <em>Event Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventFilterResult() <em>Event Filter Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventNotificationList() <em>Event Notification List</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventNotifierType() <em>Event Notifier Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getExceptionDeviationFormat() <em>Exception Deviation Format</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getExpandedNodeId() <em>Expanded Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getExtensionObject() <em>Extension Object</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFieldMetaData() <em>Field Meta Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFieldTargetDataType() <em>Field Target Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFilterOperand() <em>Filter Operand</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFilterOperator() <em>Filter Operator</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersOnNetworkRequest() <em>Find Servers On Network Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersOnNetworkResponse() <em>Find Servers On Network Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersRequest() <em>Find Servers Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersResponse() <em>Find Servers Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFloat() <em>Float</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFrame() <em>Frame</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGenericAttributes() <em>Generic Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGenericAttributeValue() <em>Generic Attribute Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGetEndpointsRequest() <em>Get Endpoints Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGetEndpointsResponse() <em>Get Endpoints Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGuid() <em>Guid</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryData() <em>History Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryEvent() <em>History Event</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryEventFieldList() <em>History Event Field List</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryModifiedData() <em>History Modified Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadDetails() <em>History Read Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadRequest() <em>History Read Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadResponse() <em>History Read Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadResult() <em>History Read Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadValueId() <em>History Read Value Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateDetails() <em>History Update Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateRequest() <em>History Update Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateResponse() <em>History Update Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateResult() <em>History Update Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateType() <em>History Update Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIdentityCriteriaType() <em>Identity Criteria Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIdentityMappingRuleType() <em>Identity Mapping Rule Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIdType() <em>Id Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getImageBMP() <em>Image BMP</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getImageGIF() <em>Image GIF</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getImageJPG() <em>Image JPG</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getImagePNG() <em>Image PNG</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIndex() <em>Index</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInstanceNode() <em>Instance Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInt16() <em>Int16</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInt32() <em>Int32</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInt64() <em>Int64</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIntegerId() <em>Integer Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInvokeServiceRequest() <em>Invoke Service Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInvokeServiceResponse() <em>Invoke Service Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIssuedIdentityToken() <em>Issued Identity Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonDataSetMessageContentMask() <em>Json Data Set Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonDataSetReaderMessageDataType() <em>Json Data Set Reader Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonDataSetWriterMessageDataType() <em>Json Data Set Writer Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonNetworkMessageContentMask() <em>Json Network Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonWriterGroupMessageDataType() <em>Json Writer Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getKeyValuePair() <em>Key Value Pair</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAddNodesItem() <em>List Of Add Nodes Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAddNodesResult() <em>List Of Add Nodes Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAddReferencesItem() <em>List Of Add References Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAliasNameDataType() <em>List Of Alias Name Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfApplicationDescription() <em>List Of Application Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfArgument() <em>List Of Argument</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBoolean() <em>List Of Boolean</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerConnectionTransportDataType() <em>List Of Broker Connection Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerDataSetReaderTransportDataType() <em>List Of Broker Data Set Reader Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerDataSetWriterTransportDataType() <em>List Of Broker Data Set Writer Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerTransportQualityOfService() <em>List Of Broker Transport Quality Of Service</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerWriterGroupTransportDataType() <em>List Of Broker Writer Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowseDescription() <em>List Of Browse Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowsePath() <em>List Of Browse Path</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowsePathResult() <em>List Of Browse Path Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowsePathTarget() <em>List Of Browse Path Target</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowseResult() <em>List Of Browse Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfByte() <em>List Of Byte</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfByteString() <em>List Of Byte String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCallMethodRequest() <em>List Of Call Method Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCallMethodResult() <em>List Of Call Method Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCartesianCoordinates() <em>List Of Cartesian Coordinates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfConfigurationVersionDataType() <em>List Of Configuration Version Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfConnectionTransportDataType() <em>List Of Connection Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfContentFilter() <em>List Of Content Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfContentFilterElement() <em>List Of Content Filter Element</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfContentFilterElementResult() <em>List Of Content Filter Element Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCurrencyUnitType() <em>List Of Currency Unit Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDatagramConnectionTransportDataType() <em>List Of Datagram Connection Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDatagramWriterGroupTransportDataType() <em>List Of Datagram Writer Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetFieldContentMask() <em>List Of Data Set Field Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetMetaDataType() <em>List Of Data Set Meta Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetOrderingType() <em>List Of Data Set Ordering Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetReaderDataType() <em>List Of Data Set Reader Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetReaderMessageDataType() <em>List Of Data Set Reader Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetReaderTransportDataType() <em>List Of Data Set Reader Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetWriterDataType() <em>List Of Data Set Writer Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetWriterMessageDataType() <em>List Of Data Set Writer Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetWriterTransportDataType() <em>List Of Data Set Writer Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataTypeDefinition() <em>List Of Data Type Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataTypeDescription() <em>List Of Data Type Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataTypeSchemaHeader() <em>List Of Data Type Schema Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataValue() <em>List Of Data Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDateTime() <em>List Of Date Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDeleteNodesItem() <em>List Of Delete Nodes Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDeleteReferencesItem() <em>List Of Delete References Item</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDiagnosticInfo() <em>List Of Diagnostic Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDiagnosticsLevel() <em>List Of Diagnostics Level</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDouble() <em>List Of Double</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointConfiguration() <em>List Of Endpoint Configuration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointDescription() <em>List Of Endpoint Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointType() <em>List Of Endpoint Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointUrlListDataType() <em>List Of Endpoint Url List Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumDefinition() <em>List Of Enum Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumDescription() <em>List Of Enum Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumField() <em>List Of Enum Field</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumValueType() <em>List Of Enum Value Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEventFieldList() <em>List Of Event Field List</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfExpandedNodeId() <em>List Of Expanded Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfExtensionObject() <em>List Of Extension Object</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFieldMetaData() <em>List Of Field Meta Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFieldTargetDataType() <em>List Of Field Target Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFloat() <em>List Of Float</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFrame() <em>List Of Frame</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfGenericAttributeValue() <em>List Of Generic Attribute Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfGuid() <em>List Of Guid</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryEventFieldList() <em>List Of History Event Field List</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryReadResult() <em>List Of History Read Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryReadValueId() <em>List Of History Read Value Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryUpdateResult() <em>List Of History Update Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfIdentityCriteriaType() <em>List Of Identity Criteria Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfIdentityMappingRuleType() <em>List Of Identity Mapping Rule Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfIdType() <em>List Of Id Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfInt16() <em>List Of Int16</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfInt32() <em>List Of Int32</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfInt64() <em>List Of Int64</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonDataSetMessageContentMask() <em>List Of Json Data Set Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonDataSetReaderMessageDataType() <em>List Of Json Data Set Reader Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonDataSetWriterMessageDataType() <em>List Of Json Data Set Writer Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonNetworkMessageContentMask() <em>List Of Json Network Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonWriterGroupMessageDataType() <em>List Of Json Writer Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfKeyValuePair() <em>List Of Key Value Pair</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfLocalizedText() <em>List Of Localized Text</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfModelChangeStructureDataType() <em>List Of Model Change Structure Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfModificationInfo() <em>List Of Modification Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemCreateRequest() <em>List Of Monitored Item Create Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemCreateResult() <em>List Of Monitored Item Create Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemModifyRequest() <em>List Of Monitored Item Modify Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemModifyResult() <em>List Of Monitored Item Modify Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemNotification() <em>List Of Monitored Item Notification</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNetworkAddressDataType() <em>List Of Network Address Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNetworkAddressUrlDataType() <em>List Of Network Address Url Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNetworkGroupDataType() <em>List Of Network Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNode() <em>List Of Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNodeId() <em>List Of Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNodeReference() <em>List Of Node Reference</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNodeTypeDescription() <em>List Of Node Type Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOpenFileMode() <em>List Of Open File Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOptionSet() <em>List Of Option Set</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOrientation() <em>List Of Orientation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOverrideValueHandling() <em>List Of Override Value Handling</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfParsingResult() <em>List Of Parsing Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedDataItemsDataType() <em>List Of Published Data Items Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedDataSetDataType() <em>List Of Published Data Set Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedDataSetSourceDataType() <em>List Of Published Data Set Source Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedEventsDataType() <em>List Of Published Events Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedVariableDataType() <em>List Of Published Variable Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubConfigurationDataType() <em>List Of Pub Sub Configuration Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubConnectionDataType() <em>List Of Pub Sub Connection Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubDiagnosticsCounterClassification() <em>List Of Pub Sub Diagnostics Counter Classification</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubGroupDataType() <em>List Of Pub Sub Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubState() <em>List Of Pub Sub State</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfQualifiedName() <em>List Of Qualified Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfQueryDataDescription() <em>List Of Query Data Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfQueryDataSet() <em>List Of Query Data Set</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRationalNumber() <em>List Of Rational Number</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReaderGroupDataType() <em>List Of Reader Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReaderGroupMessageDataType() <em>List Of Reader Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReaderGroupTransportDataType() <em>List Of Reader Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReadValueId() <em>List Of Read Value Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRedundantServerDataType() <em>List Of Redundant Server Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReferenceDescription() <em>List Of Reference Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReferenceNode() <em>List Of Reference Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRegisteredServer() <em>List Of Registered Server</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRelativePathElement() <em>List Of Relative Path Element</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRolePermissionType() <em>List Of Role Permission Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSamplingIntervalDiagnosticsDataType() <em>List Of Sampling Interval Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSByte() <em>List Of SByte</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSemanticChangeStructureDataType() <em>List Of Semantic Change Structure Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfServerOnNetwork() <em>List Of Server On Network</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSessionDiagnosticsDataType() <em>List Of Session Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSessionSecurityDiagnosticsDataType() <em>List Of Session Security Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSignedSoftwareCertificate() <em>List Of Signed Software Certificate</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSimpleAttributeOperand() <em>List Of Simple Attribute Operand</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSimpleTypeDescription() <em>List Of Simple Type Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStatusCode() <em>List Of Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStatusResult() <em>List Of Status Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfString() <em>List Of String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStructureDefinition() <em>List Of Structure Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStructureDescription() <em>List Of Structure Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStructureField() <em>List Of Structure Field</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscribedDataSetDataType() <em>List Of Subscribed Data Set Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscribedDataSetMirrorDataType() <em>List Of Subscribed Data Set Mirror Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscriptionAcknowledgement() <em>List Of Subscription Acknowledgement</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscriptionDiagnosticsDataType() <em>List Of Subscription Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTargetVariablesDataType() <em>List Of Target Variables Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDCartesianCoordinates() <em>List Of Three DCartesian Coordinates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDFrame() <em>List Of Three DFrame</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDOrientation() <em>List Of Three DOrientation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDVector() <em>List Of Three DVector</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTimeZoneDataType() <em>List Of Time Zone Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTransferResult() <em>List Of Transfer Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTrustListDataType() <em>List Of Trust List Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUABinaryFileDataType() <em>List Of UA Binary File Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpDataSetMessageContentMask() <em>List Of Uadp Data Set Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpDataSetReaderMessageDataType() <em>List Of Uadp Data Set Reader Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpDataSetWriterMessageDataType() <em>List Of Uadp Data Set Writer Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpNetworkMessageContentMask() <em>List Of Uadp Network Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpWriterGroupMessageDataType() <em>List Of Uadp Writer Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUInt16() <em>List Of UInt16</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUInt32() <em>List Of UInt32</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUInt64() <em>List Of UInt64</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUnion() <em>List Of Union</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUserTokenPolicy() <em>List Of User Token Policy</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfVariant() <em>List Of Variant</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfVector() <em>List Of Vector</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriterGroupDataType() <em>List Of Writer Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriterGroupMessageDataType() <em>List Of Writer Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriterGroupTransportDataType() <em>List Of Writer Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriteValue() <em>List Of Write Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfXmlElement() <em>List Of Xml Element</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getLiteralOperand() <em>Literal Operand</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getLocaleId() <em>Locale Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getLocalizedText() <em>Localized Text</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMdnsDiscoveryConfiguration() <em>Mdns Discovery Configuration</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMessageSecurityMode() <em>Message Security Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMethodAttributes() <em>Method Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMethodNode() <em>Method Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModelChangeStructureDataType() <em>Model Change Structure Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModelChangeStructureVerbMask() <em>Model Change Structure Verb Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModificationInfo() <em>Modification Info</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifyMonitoredItemsRequest() <em>Modify Monitored Items Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifyMonitoredItemsResponse() <em>Modify Monitored Items Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifySubscriptionRequest() <em>Modify Subscription Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifySubscriptionResponse() <em>Modify Subscription Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemCreateRequest() <em>Monitored Item Create Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemCreateResult() <em>Monitored Item Create Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemModifyRequest() <em>Monitored Item Modify Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemModifyResult() <em>Monitored Item Modify Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemNotification() <em>Monitored Item Notification</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringFilter() <em>Monitoring Filter</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringFilterResult() <em>Monitoring Filter Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringMode() <em>Monitoring Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringParameters() <em>Monitoring Parameters</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNetworkAddressDataType() <em>Network Address Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNetworkAddressUrlDataType() <em>Network Address Url Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNetworkGroupDataType() <em>Network Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNode() <em>Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeAttributes() <em>Node Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeAttributesMask() <em>Node Attributes Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeClass() <em>Node Class</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeId() <em>Node Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeReference() <em>Node Reference</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeTypeDescription() <em>Node Type Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNormalizedString() <em>Normalized String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNotificationData() <em>Notification Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNotificationMessage() <em>Notification Message</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNumericRange() <em>Numeric Range</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectAttributes() <em>Object Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectNode() <em>Object Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectTypeAttributes() <em>Object Type Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectTypeNode() <em>Object Type Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOpenFileMode() <em>Open File Mode</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOpenSecureChannelRequest() <em>Open Secure Channel Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOpenSecureChannelResponse() <em>Open Secure Channel Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOptionSet() <em>Option Set</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOrientation() <em>Orientation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOverrideValueHandling() <em>Override Value Handling</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getParsingResult() <em>Parsing Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPerformUpdateType() <em>Perform Update Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPermissionType() <em>Permission Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getProgramDiagnostic2DataType() <em>Program Diagnostic2 Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getProgramDiagnosticDataType() <em>Program Diagnostic Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedDataItemsDataType() <em>Published Data Items Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedDataSetDataType() <em>Published Data Set Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedDataSetSourceDataType() <em>Published Data Set Source Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedEventsDataType() <em>Published Events Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedVariableDataType() <em>Published Variable Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishRequest() <em>Publish Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishResponse() <em>Publish Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubConfigurationDataType() <em>Pub Sub Configuration Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubConnectionDataType() <em>Pub Sub Connection Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubDiagnosticsCounterClassification() <em>Pub Sub Diagnostics Counter Classification</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubGroupDataType() <em>Pub Sub Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubState() <em>Pub Sub State</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQualifiedName() <em>Qualified Name</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryDataDescription() <em>Query Data Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryDataSet() <em>Query Data Set</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryFirstRequest() <em>Query First Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryFirstResponse() <em>Query First Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryNextRequest() <em>Query Next Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryNextResponse() <em>Query Next Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRange() <em>Range</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRationalNumber() <em>Rational Number</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadAnnotationDataDetails() <em>Read Annotation Data Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadAtTimeDetails() <em>Read At Time Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReaderGroupDataType() <em>Reader Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReaderGroupMessageDataType() <em>Reader Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReaderGroupTransportDataType() <em>Reader Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadEventDetails() <em>Read Event Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadProcessedDetails() <em>Read Processed Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadRawModifiedDetails() <em>Read Raw Modified Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadRequest() <em>Read Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadResponse() <em>Read Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadValueId() <em>Read Value Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRedundancySupport() <em>Redundancy Support</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRedundantServerDataType() <em>Redundant Server Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceDescription() <em>Reference Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceNode() <em>Reference Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceTypeAttributes() <em>Reference Type Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceTypeNode() <em>Reference Type Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisteredServer() <em>Registered Server</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterNodesRequest() <em>Register Nodes Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterNodesResponse() <em>Register Nodes Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServer2Request() <em>Register Server2 Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServer2Response() <em>Register Server2 Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServerRequest() <em>Register Server Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServerResponse() <em>Register Server Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRelativePath() <em>Relative Path</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRelativePathElement() <em>Relative Path Element</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRepublishRequest() <em>Republish Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRepublishResponse() <em>Republish Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRequestHeader() <em>Request Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getResponseHeader() <em>Response Header</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRolePermissionType() <em>Role Permission Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRsaEncryptedSecret() <em>Rsa Encrypted Secret</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSamplingIntervalDiagnosticsDataType() <em>Sampling Interval Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSByte() <em>SByte</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSecurityTokenRequestType() <em>Security Token Request Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSemanticChangeStructureDataType() <em>Semantic Change Structure Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerDiagnosticsSummaryDataType() <em>Server Diagnostics Summary Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerOnNetwork() <em>Server On Network</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerState() <em>Server State</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerStatusDataType() <em>Server Status Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServiceCounterDataType() <em>Service Counter Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServiceFault() <em>Service Fault</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionAuthenticationToken() <em>Session Authentication Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionDiagnosticsDataType() <em>Session Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionlessInvokeRequestType() <em>Sessionless Invoke Request Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionlessInvokeResponseType() <em>Sessionless Invoke Response Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionSecurityDiagnosticsDataType() <em>Session Security Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetMonitoringModeRequest() <em>Set Monitoring Mode Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetMonitoringModeResponse() <em>Set Monitoring Mode Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetPublishingModeRequest() <em>Set Publishing Mode Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetPublishingModeResponse() <em>Set Publishing Mode Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetTriggeringRequest() <em>Set Triggering Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetTriggeringResponse() <em>Set Triggering Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSignatureData() <em>Signature Data</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSignedSoftwareCertificate() <em>Signed Software Certificate</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSimpleAttributeOperand() <em>Simple Attribute Operand</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSimpleTypeDescription() <em>Simple Type Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStatusChangeNotification() <em>Status Change Notification</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStatusCode() <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStatusResult() <em>Status Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getString() <em>String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureDefinition() <em>Structure Definition</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureDescription() <em>Structure Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureField() <em>Structure Field</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureType() <em>Structure Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscribedDataSetDataType() <em>Subscribed Data Set Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscribedDataSetMirrorDataType() <em>Subscribed Data Set Mirror Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscriptionAcknowledgement() <em>Subscription Acknowledgement</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscriptionDiagnosticsDataType() <em>Subscription Diagnostics Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTargetVariablesDataType() <em>Target Variables Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDCartesianCoordinates() <em>Three DCartesian Coordinates</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDFrame() <em>Three DFrame</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDOrientation() <em>Three DOrientation</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDVector() <em>Three DVector</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTime() <em>Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTimestampsToReturn() <em>Timestamps To Return</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTimeString() <em>Time String</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTimeZoneDataType() <em>Time Zone Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTransferResult() <em>Transfer Result</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTransferSubscriptionsRequest() <em>Transfer Subscriptions Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTransferSubscriptionsResponse() <em>Transfer Subscriptions Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTranslateBrowsePathsToNodeIdsRequest() <em>Translate Browse Paths To Node Ids Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTranslateBrowsePathsToNodeIdsResponse() <em>Translate Browse Paths To Node Ids Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTrustListDataType() <em>Trust List Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTrustListMasks() <em>Trust List Masks</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTypeNode() <em>Type Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUABinaryFileDataType() <em>UA Binary File Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpDataSetMessageContentMask() <em>Uadp Data Set Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpDataSetReaderMessageDataType() <em>Uadp Data Set Reader Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpDataSetWriterMessageDataType() <em>Uadp Data Set Writer Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpNetworkMessageContentMask() <em>Uadp Network Message Content Mask</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpWriterGroupMessageDataType() <em>Uadp Writer Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUInt16() <em>UInt16</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUInt32() <em>UInt32</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUInt64() <em>UInt64</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUnion() <em>Union</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUnregisterNodesRequest() <em>Unregister Nodes Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUnregisterNodesResponse() <em>Unregister Nodes Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUpdateDataDetails() <em>Update Data Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUpdateEventDetails() <em>Update Event Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUpdateStructureDataDetails() <em>Update Structure Data Details</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserIdentityToken() <em>User Identity Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserNameIdentityToken() <em>User Name Identity Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserTokenPolicy() <em>User Token Policy</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserTokenType() <em>User Token Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUtcTime() <em>Utc Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableAttributes() <em>Variable Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableNode() <em>Variable Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableTypeAttributes() <em>Variable Type Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableTypeNode() <em>Variable Type Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariant() <em>Variant</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVector() <em>Vector</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVersionTime() <em>Version Time</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getViewAttributes() <em>View Attributes</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getViewDescription() <em>View Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getViewNode() <em>View Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriteRequest() <em>Write Request</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriteResponse() <em>Write Response</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriterGroupDataType() <em>Writer Group Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriterGroupMessageDataType() <em>Writer Group Message Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriterGroupTransportDataType() <em>Writer Group Transport Data Type</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriteValue() <em>Write Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getX509IdentityToken() <em>X509 Identity Token</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getXVType() <em>XV Type</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DocumentRootTest extends TestCase {

	/**
	 * The fixture for this Document Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRoot fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DocumentRootTest.class);
	}

	/**
	 * Constructs a new Document Root test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Document Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DocumentRoot fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Document Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRoot getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createDocumentRoot());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAccessLevelExType() <em>Access Level Ex Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAccessLevelExType()
	 * @generated
	 */
	public void testGetAccessLevelExType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAccessLevelExType(long) <em>Access Level Ex Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAccessLevelExType(long)
	 * @generated
	 */
	public void testSetAccessLevelExType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAccessLevelType() <em>Access Level Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAccessLevelType()
	 * @generated
	 */
	public void testGetAccessLevelType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAccessLevelType(short) <em>Access Level Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAccessLevelType(short)
	 * @generated
	 */
	public void testSetAccessLevelType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getActivateSessionRequest() <em>Activate Session Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getActivateSessionRequest()
	 * @generated
	 */
	public void testGetActivateSessionRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setActivateSessionRequest(org.opcfoundation.ua._2008._02.types.ActivateSessionRequest) <em>Activate Session Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setActivateSessionRequest(org.opcfoundation.ua._2008._02.types.ActivateSessionRequest)
	 * @generated
	 */
	public void testSetActivateSessionRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getActivateSessionResponse() <em>Activate Session Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getActivateSessionResponse()
	 * @generated
	 */
	public void testGetActivateSessionResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setActivateSessionResponse(org.opcfoundation.ua._2008._02.types.ActivateSessionResponse) <em>Activate Session Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setActivateSessionResponse(org.opcfoundation.ua._2008._02.types.ActivateSessionResponse)
	 * @generated
	 */
	public void testSetActivateSessionResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesItem() <em>Add Nodes Item</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesItem()
	 * @generated
	 */
	public void testGetAddNodesItem() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAddNodesItem(org.opcfoundation.ua._2008._02.types.AddNodesItem) <em>Add Nodes Item</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAddNodesItem(org.opcfoundation.ua._2008._02.types.AddNodesItem)
	 * @generated
	 */
	public void testSetAddNodesItem() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesRequest() <em>Add Nodes Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesRequest()
	 * @generated
	 */
	public void testGetAddNodesRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAddNodesRequest(org.opcfoundation.ua._2008._02.types.AddNodesRequest) <em>Add Nodes Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAddNodesRequest(org.opcfoundation.ua._2008._02.types.AddNodesRequest)
	 * @generated
	 */
	public void testSetAddNodesRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesResponse() <em>Add Nodes Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesResponse()
	 * @generated
	 */
	public void testGetAddNodesResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAddNodesResponse(org.opcfoundation.ua._2008._02.types.AddNodesResponse) <em>Add Nodes Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAddNodesResponse(org.opcfoundation.ua._2008._02.types.AddNodesResponse)
	 * @generated
	 */
	public void testSetAddNodesResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesResult() <em>Add Nodes Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddNodesResult()
	 * @generated
	 */
	public void testGetAddNodesResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAddNodesResult(org.opcfoundation.ua._2008._02.types.AddNodesResult) <em>Add Nodes Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAddNodesResult(org.opcfoundation.ua._2008._02.types.AddNodesResult)
	 * @generated
	 */
	public void testSetAddNodesResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddReferencesItem() <em>Add References Item</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddReferencesItem()
	 * @generated
	 */
	public void testGetAddReferencesItem() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAddReferencesItem(org.opcfoundation.ua._2008._02.types.AddReferencesItem) <em>Add References Item</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAddReferencesItem(org.opcfoundation.ua._2008._02.types.AddReferencesItem)
	 * @generated
	 */
	public void testSetAddReferencesItem() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddReferencesRequest() <em>Add References Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddReferencesRequest()
	 * @generated
	 */
	public void testGetAddReferencesRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAddReferencesRequest(org.opcfoundation.ua._2008._02.types.AddReferencesRequest) <em>Add References Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAddReferencesRequest(org.opcfoundation.ua._2008._02.types.AddReferencesRequest)
	 * @generated
	 */
	public void testSetAddReferencesRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddReferencesResponse() <em>Add References Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAddReferencesResponse()
	 * @generated
	 */
	public void testGetAddReferencesResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAddReferencesResponse(org.opcfoundation.ua._2008._02.types.AddReferencesResponse) <em>Add References Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAddReferencesResponse(org.opcfoundation.ua._2008._02.types.AddReferencesResponse)
	 * @generated
	 */
	public void testSetAddReferencesResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAggregateConfiguration() <em>Aggregate Configuration</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAggregateConfiguration()
	 * @generated
	 */
	public void testGetAggregateConfiguration() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAggregateConfiguration(org.opcfoundation.ua._2008._02.types.AggregateConfiguration) <em>Aggregate Configuration</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAggregateConfiguration(org.opcfoundation.ua._2008._02.types.AggregateConfiguration)
	 * @generated
	 */
	public void testSetAggregateConfiguration() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAggregateFilter() <em>Aggregate Filter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAggregateFilter()
	 * @generated
	 */
	public void testGetAggregateFilter() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAggregateFilter(org.opcfoundation.ua._2008._02.types.AggregateFilter) <em>Aggregate Filter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAggregateFilter(org.opcfoundation.ua._2008._02.types.AggregateFilter)
	 * @generated
	 */
	public void testSetAggregateFilter() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAggregateFilterResult() <em>Aggregate Filter Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAggregateFilterResult()
	 * @generated
	 */
	public void testGetAggregateFilterResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAggregateFilterResult(org.opcfoundation.ua._2008._02.types.AggregateFilterResult) <em>Aggregate Filter Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAggregateFilterResult(org.opcfoundation.ua._2008._02.types.AggregateFilterResult)
	 * @generated
	 */
	public void testSetAggregateFilterResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAliasNameDataType() <em>Alias Name Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAliasNameDataType()
	 * @generated
	 */
	public void testGetAliasNameDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAliasNameDataType(org.opcfoundation.ua._2008._02.types.AliasNameDataType) <em>Alias Name Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAliasNameDataType(org.opcfoundation.ua._2008._02.types.AliasNameDataType)
	 * @generated
	 */
	public void testSetAliasNameDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAnnotation() <em>Annotation</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAnnotation()
	 * @generated
	 */
	public void testGetAnnotation() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAnnotation(org.opcfoundation.ua._2008._02.types.Annotation) <em>Annotation</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAnnotation(org.opcfoundation.ua._2008._02.types.Annotation)
	 * @generated
	 */
	public void testSetAnnotation() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAnonymousIdentityToken() <em>Anonymous Identity Token</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAnonymousIdentityToken()
	 * @generated
	 */
	public void testGetAnonymousIdentityToken() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAnonymousIdentityToken(org.opcfoundation.ua._2008._02.types.AnonymousIdentityToken) <em>Anonymous Identity Token</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAnonymousIdentityToken(org.opcfoundation.ua._2008._02.types.AnonymousIdentityToken)
	 * @generated
	 */
	public void testSetAnonymousIdentityToken() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getApplicationDescription() <em>Application Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getApplicationDescription()
	 * @generated
	 */
	public void testGetApplicationDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setApplicationDescription(org.opcfoundation.ua._2008._02.types.ApplicationDescription) <em>Application Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setApplicationDescription(org.opcfoundation.ua._2008._02.types.ApplicationDescription)
	 * @generated
	 */
	public void testSetApplicationDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getApplicationInstanceCertificate() <em>Application Instance Certificate</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getApplicationInstanceCertificate()
	 * @generated
	 */
	public void testGetApplicationInstanceCertificate() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setApplicationInstanceCertificate(byte[]) <em>Application Instance Certificate</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setApplicationInstanceCertificate(byte[])
	 * @generated
	 */
	public void testSetApplicationInstanceCertificate() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getApplicationType() <em>Application Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getApplicationType()
	 * @generated
	 */
	public void testGetApplicationType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setApplicationType(org.opcfoundation.ua._2008._02.types.ApplicationType) <em>Application Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setApplicationType(org.opcfoundation.ua._2008._02.types.ApplicationType)
	 * @generated
	 */
	public void testSetApplicationType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getArgument() <em>Argument</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getArgument()
	 * @generated
	 */
	public void testGetArgument() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setArgument(org.opcfoundation.ua._2008._02.types.Argument) <em>Argument</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setArgument(org.opcfoundation.ua._2008._02.types.Argument)
	 * @generated
	 */
	public void testSetArgument() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAttributeOperand() <em>Attribute Operand</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAttributeOperand()
	 * @generated
	 */
	public void testGetAttributeOperand() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAttributeOperand(org.opcfoundation.ua._2008._02.types.AttributeOperand) <em>Attribute Operand</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAttributeOperand(org.opcfoundation.ua._2008._02.types.AttributeOperand)
	 * @generated
	 */
	public void testSetAttributeOperand() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAttributeWriteMask() <em>Attribute Write Mask</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAttributeWriteMask()
	 * @generated
	 */
	public void testGetAttributeWriteMask() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAttributeWriteMask(long) <em>Attribute Write Mask</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAttributeWriteMask(long)
	 * @generated
	 */
	public void testSetAttributeWriteMask() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAudioDataType() <em>Audio Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAudioDataType()
	 * @generated
	 */
	public void testGetAudioDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAudioDataType(byte[]) <em>Audio Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAudioDataType(byte[])
	 * @generated
	 */
	public void testSetAudioDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAxisInformation() <em>Axis Information</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAxisInformation()
	 * @generated
	 */
	public void testGetAxisInformation() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAxisInformation(org.opcfoundation.ua._2008._02.types.AxisInformation) <em>Axis Information</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAxisInformation(org.opcfoundation.ua._2008._02.types.AxisInformation)
	 * @generated
	 */
	public void testSetAxisInformation() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getAxisScaleEnumeration() <em>Axis Scale Enumeration</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getAxisScaleEnumeration()
	 * @generated
	 */
	public void testGetAxisScaleEnumeration() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setAxisScaleEnumeration(org.opcfoundation.ua._2008._02.types.AxisScaleEnumeration) <em>Axis Scale Enumeration</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setAxisScaleEnumeration(org.opcfoundation.ua._2008._02.types.AxisScaleEnumeration)
	 * @generated
	 */
	public void testSetAxisScaleEnumeration() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBitFieldMaskDataType() <em>Bit Field Mask Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBitFieldMaskDataType()
	 * @generated
	 */
	public void testGetBitFieldMaskDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBitFieldMaskDataType(java.math.BigInteger) <em>Bit Field Mask Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBitFieldMaskDataType(java.math.BigInteger)
	 * @generated
	 */
	public void testSetBitFieldMaskDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBoolean() <em>Boolean</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBoolean()
	 * @generated
	 */
	public void testGetBoolean() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBoolean(java.lang.Boolean) <em>Boolean</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBoolean(java.lang.Boolean)
	 * @generated
	 */
	public void testSetBoolean() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerConnectionTransportDataType() <em>Broker Connection Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerConnectionTransportDataType()
	 * @generated
	 */
	public void testGetBrokerConnectionTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrokerConnectionTransportDataType(org.opcfoundation.ua._2008._02.types.BrokerConnectionTransportDataType) <em>Broker Connection Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrokerConnectionTransportDataType(org.opcfoundation.ua._2008._02.types.BrokerConnectionTransportDataType)
	 * @generated
	 */
	public void testSetBrokerConnectionTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerDataSetReaderTransportDataType() <em>Broker Data Set Reader Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerDataSetReaderTransportDataType()
	 * @generated
	 */
	public void testGetBrokerDataSetReaderTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrokerDataSetReaderTransportDataType(org.opcfoundation.ua._2008._02.types.BrokerDataSetReaderTransportDataType) <em>Broker Data Set Reader Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrokerDataSetReaderTransportDataType(org.opcfoundation.ua._2008._02.types.BrokerDataSetReaderTransportDataType)
	 * @generated
	 */
	public void testSetBrokerDataSetReaderTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerDataSetWriterTransportDataType() <em>Broker Data Set Writer Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerDataSetWriterTransportDataType()
	 * @generated
	 */
	public void testGetBrokerDataSetWriterTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrokerDataSetWriterTransportDataType(org.opcfoundation.ua._2008._02.types.BrokerDataSetWriterTransportDataType) <em>Broker Data Set Writer Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrokerDataSetWriterTransportDataType(org.opcfoundation.ua._2008._02.types.BrokerDataSetWriterTransportDataType)
	 * @generated
	 */
	public void testSetBrokerDataSetWriterTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerTransportQualityOfService() <em>Broker Transport Quality Of Service</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerTransportQualityOfService()
	 * @generated
	 */
	public void testGetBrokerTransportQualityOfService() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrokerTransportQualityOfService(org.opcfoundation.ua._2008._02.types.BrokerTransportQualityOfService) <em>Broker Transport Quality Of Service</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrokerTransportQualityOfService(org.opcfoundation.ua._2008._02.types.BrokerTransportQualityOfService)
	 * @generated
	 */
	public void testSetBrokerTransportQualityOfService() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerWriterGroupTransportDataType() <em>Broker Writer Group Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrokerWriterGroupTransportDataType()
	 * @generated
	 */
	public void testGetBrokerWriterGroupTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrokerWriterGroupTransportDataType(org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType) <em>Broker Writer Group Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrokerWriterGroupTransportDataType(org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType)
	 * @generated
	 */
	public void testSetBrokerWriterGroupTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseDescription() <em>Browse Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseDescription()
	 * @generated
	 */
	public void testGetBrowseDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowseDescription(org.opcfoundation.ua._2008._02.types.BrowseDescription) <em>Browse Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowseDescription(org.opcfoundation.ua._2008._02.types.BrowseDescription)
	 * @generated
	 */
	public void testSetBrowseDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseDirection() <em>Browse Direction</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseDirection()
	 * @generated
	 */
	public void testGetBrowseDirection() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowseDirection(org.opcfoundation.ua._2008._02.types.BrowseDirection) <em>Browse Direction</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowseDirection(org.opcfoundation.ua._2008._02.types.BrowseDirection)
	 * @generated
	 */
	public void testSetBrowseDirection() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseNextRequest() <em>Browse Next Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseNextRequest()
	 * @generated
	 */
	public void testGetBrowseNextRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowseNextRequest(org.opcfoundation.ua._2008._02.types.BrowseNextRequest) <em>Browse Next Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowseNextRequest(org.opcfoundation.ua._2008._02.types.BrowseNextRequest)
	 * @generated
	 */
	public void testSetBrowseNextRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseNextResponse() <em>Browse Next Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseNextResponse()
	 * @generated
	 */
	public void testGetBrowseNextResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowseNextResponse(org.opcfoundation.ua._2008._02.types.BrowseNextResponse) <em>Browse Next Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowseNextResponse(org.opcfoundation.ua._2008._02.types.BrowseNextResponse)
	 * @generated
	 */
	public void testSetBrowseNextResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowsePath() <em>Browse Path</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowsePath()
	 * @generated
	 */
	public void testGetBrowsePath() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowsePath(org.opcfoundation.ua._2008._02.types.BrowsePath) <em>Browse Path</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowsePath(org.opcfoundation.ua._2008._02.types.BrowsePath)
	 * @generated
	 */
	public void testSetBrowsePath() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowsePathResult() <em>Browse Path Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowsePathResult()
	 * @generated
	 */
	public void testGetBrowsePathResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowsePathResult(org.opcfoundation.ua._2008._02.types.BrowsePathResult) <em>Browse Path Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowsePathResult(org.opcfoundation.ua._2008._02.types.BrowsePathResult)
	 * @generated
	 */
	public void testSetBrowsePathResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowsePathTarget() <em>Browse Path Target</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowsePathTarget()
	 * @generated
	 */
	public void testGetBrowsePathTarget() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowsePathTarget(org.opcfoundation.ua._2008._02.types.BrowsePathTarget) <em>Browse Path Target</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowsePathTarget(org.opcfoundation.ua._2008._02.types.BrowsePathTarget)
	 * @generated
	 */
	public void testSetBrowsePathTarget() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseRequest() <em>Browse Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseRequest()
	 * @generated
	 */
	public void testGetBrowseRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowseRequest(org.opcfoundation.ua._2008._02.types.BrowseRequest) <em>Browse Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowseRequest(org.opcfoundation.ua._2008._02.types.BrowseRequest)
	 * @generated
	 */
	public void testSetBrowseRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseResponse() <em>Browse Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseResponse()
	 * @generated
	 */
	public void testGetBrowseResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowseResponse(org.opcfoundation.ua._2008._02.types.BrowseResponse) <em>Browse Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowseResponse(org.opcfoundation.ua._2008._02.types.BrowseResponse)
	 * @generated
	 */
	public void testSetBrowseResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseResult() <em>Browse Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseResult()
	 * @generated
	 */
	public void testGetBrowseResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowseResult(org.opcfoundation.ua._2008._02.types.BrowseResult) <em>Browse Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowseResult(org.opcfoundation.ua._2008._02.types.BrowseResult)
	 * @generated
	 */
	public void testSetBrowseResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseResultMask() <em>Browse Result Mask</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBrowseResultMask()
	 * @generated
	 */
	public void testGetBrowseResultMask() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowseResultMask(org.opcfoundation.ua._2008._02.types.BrowseResultMask) <em>Browse Result Mask</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBrowseResultMask(org.opcfoundation.ua._2008._02.types.BrowseResultMask)
	 * @generated
	 */
	public void testSetBrowseResultMask() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getBuildInfo() <em>Build Info</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getBuildInfo()
	 * @generated
	 */
	public void testGetBuildInfo() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setBuildInfo(org.opcfoundation.ua._2008._02.types.BuildInfo) <em>Build Info</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setBuildInfo(org.opcfoundation.ua._2008._02.types.BuildInfo)
	 * @generated
	 */
	public void testSetBuildInfo() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getByte() <em>Byte</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getByte()
	 * @generated
	 */
	public void testGetByte() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setByte(java.lang.Short) <em>Byte</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setByte(java.lang.Short)
	 * @generated
	 */
	public void testSetByte() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getByteString() <em>Byte String</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getByteString()
	 * @generated
	 */
	public void testGetByteString() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setByteString(byte[]) <em>Byte String</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setByteString(byte[])
	 * @generated
	 */
	public void testSetByteString() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallMethodRequest() <em>Call Method Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallMethodRequest()
	 * @generated
	 */
	public void testGetCallMethodRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCallMethodRequest(org.opcfoundation.ua._2008._02.types.CallMethodRequest) <em>Call Method Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCallMethodRequest(org.opcfoundation.ua._2008._02.types.CallMethodRequest)
	 * @generated
	 */
	public void testSetCallMethodRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallMethodResult() <em>Call Method Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallMethodResult()
	 * @generated
	 */
	public void testGetCallMethodResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCallMethodResult(org.opcfoundation.ua._2008._02.types.CallMethodResult) <em>Call Method Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCallMethodResult(org.opcfoundation.ua._2008._02.types.CallMethodResult)
	 * @generated
	 */
	public void testSetCallMethodResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallRequest() <em>Call Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallRequest()
	 * @generated
	 */
	public void testGetCallRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCallRequest(org.opcfoundation.ua._2008._02.types.CallRequest) <em>Call Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCallRequest(org.opcfoundation.ua._2008._02.types.CallRequest)
	 * @generated
	 */
	public void testSetCallRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallResponse() <em>Call Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCallResponse()
	 * @generated
	 */
	public void testGetCallResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCallResponse(org.opcfoundation.ua._2008._02.types.CallResponse) <em>Call Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCallResponse(org.opcfoundation.ua._2008._02.types.CallResponse)
	 * @generated
	 */
	public void testSetCallResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCancelRequest() <em>Cancel Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCancelRequest()
	 * @generated
	 */
	public void testGetCancelRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCancelRequest(org.opcfoundation.ua._2008._02.types.CancelRequest) <em>Cancel Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCancelRequest(org.opcfoundation.ua._2008._02.types.CancelRequest)
	 * @generated
	 */
	public void testSetCancelRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCancelResponse() <em>Cancel Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCancelResponse()
	 * @generated
	 */
	public void testGetCancelResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCancelResponse(org.opcfoundation.ua._2008._02.types.CancelResponse) <em>Cancel Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCancelResponse(org.opcfoundation.ua._2008._02.types.CancelResponse)
	 * @generated
	 */
	public void testSetCancelResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCartesianCoordinates() <em>Cartesian Coordinates</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCartesianCoordinates()
	 * @generated
	 */
	public void testGetCartesianCoordinates() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCartesianCoordinates(org.opcfoundation.ua._2008._02.types.CartesianCoordinates) <em>Cartesian Coordinates</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCartesianCoordinates(org.opcfoundation.ua._2008._02.types.CartesianCoordinates)
	 * @generated
	 */
	public void testSetCartesianCoordinates() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getChannelSecurityToken() <em>Channel Security Token</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getChannelSecurityToken()
	 * @generated
	 */
	public void testGetChannelSecurityToken() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setChannelSecurityToken(org.opcfoundation.ua._2008._02.types.ChannelSecurityToken) <em>Channel Security Token</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setChannelSecurityToken(org.opcfoundation.ua._2008._02.types.ChannelSecurityToken)
	 * @generated
	 */
	public void testSetChannelSecurityToken() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSecureChannelRequest() <em>Close Secure Channel Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSecureChannelRequest()
	 * @generated
	 */
	public void testGetCloseSecureChannelRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCloseSecureChannelRequest(org.opcfoundation.ua._2008._02.types.CloseSecureChannelRequest) <em>Close Secure Channel Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCloseSecureChannelRequest(org.opcfoundation.ua._2008._02.types.CloseSecureChannelRequest)
	 * @generated
	 */
	public void testSetCloseSecureChannelRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSecureChannelResponse() <em>Close Secure Channel Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSecureChannelResponse()
	 * @generated
	 */
	public void testGetCloseSecureChannelResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCloseSecureChannelResponse(org.opcfoundation.ua._2008._02.types.CloseSecureChannelResponse) <em>Close Secure Channel Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCloseSecureChannelResponse(org.opcfoundation.ua._2008._02.types.CloseSecureChannelResponse)
	 * @generated
	 */
	public void testSetCloseSecureChannelResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSessionRequest() <em>Close Session Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSessionRequest()
	 * @generated
	 */
	public void testGetCloseSessionRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCloseSessionRequest(org.opcfoundation.ua._2008._02.types.CloseSessionRequest) <em>Close Session Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCloseSessionRequest(org.opcfoundation.ua._2008._02.types.CloseSessionRequest)
	 * @generated
	 */
	public void testSetCloseSessionRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSessionResponse() <em>Close Session Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCloseSessionResponse()
	 * @generated
	 */
	public void testGetCloseSessionResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCloseSessionResponse(org.opcfoundation.ua._2008._02.types.CloseSessionResponse) <em>Close Session Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCloseSessionResponse(org.opcfoundation.ua._2008._02.types.CloseSessionResponse)
	 * @generated
	 */
	public void testSetCloseSessionResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getComplexNumberType() <em>Complex Number Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getComplexNumberType()
	 * @generated
	 */
	public void testGetComplexNumberType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setComplexNumberType(org.opcfoundation.ua._2008._02.types.ComplexNumberType) <em>Complex Number Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setComplexNumberType(org.opcfoundation.ua._2008._02.types.ComplexNumberType)
	 * @generated
	 */
	public void testSetComplexNumberType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getConfigurationVersionDataType() <em>Configuration Version Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getConfigurationVersionDataType()
	 * @generated
	 */
	public void testGetConfigurationVersionDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setConfigurationVersionDataType(org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType) <em>Configuration Version Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setConfigurationVersionDataType(org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType)
	 * @generated
	 */
	public void testSetConfigurationVersionDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getConnectionTransportDataType() <em>Connection Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getConnectionTransportDataType()
	 * @generated
	 */
	public void testGetConnectionTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setConnectionTransportDataType(org.opcfoundation.ua._2008._02.types.ConnectionTransportDataType) <em>Connection Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setConnectionTransportDataType(org.opcfoundation.ua._2008._02.types.ConnectionTransportDataType)
	 * @generated
	 */
	public void testSetConnectionTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilter() <em>Content Filter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilter()
	 * @generated
	 */
	public void testGetContentFilter() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setContentFilter(org.opcfoundation.ua._2008._02.types.ContentFilter) <em>Content Filter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setContentFilter(org.opcfoundation.ua._2008._02.types.ContentFilter)
	 * @generated
	 */
	public void testSetContentFilter() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilterElement() <em>Content Filter Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilterElement()
	 * @generated
	 */
	public void testGetContentFilterElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setContentFilterElement(org.opcfoundation.ua._2008._02.types.ContentFilterElement) <em>Content Filter Element</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setContentFilterElement(org.opcfoundation.ua._2008._02.types.ContentFilterElement)
	 * @generated
	 */
	public void testSetContentFilterElement() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilterElementResult() <em>Content Filter Element Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilterElementResult()
	 * @generated
	 */
	public void testGetContentFilterElementResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setContentFilterElementResult(org.opcfoundation.ua._2008._02.types.ContentFilterElementResult) <em>Content Filter Element Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setContentFilterElementResult(org.opcfoundation.ua._2008._02.types.ContentFilterElementResult)
	 * @generated
	 */
	public void testSetContentFilterElementResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilterResult() <em>Content Filter Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getContentFilterResult()
	 * @generated
	 */
	public void testGetContentFilterResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setContentFilterResult(org.opcfoundation.ua._2008._02.types.ContentFilterResult) <em>Content Filter Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setContentFilterResult(org.opcfoundation.ua._2008._02.types.ContentFilterResult)
	 * @generated
	 */
	public void testSetContentFilterResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getContinuationPoint() <em>Continuation Point</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getContinuationPoint()
	 * @generated
	 */
	public void testGetContinuationPoint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setContinuationPoint(byte[]) <em>Continuation Point</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setContinuationPoint(byte[])
	 * @generated
	 */
	public void testSetContinuationPoint() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCounter() <em>Counter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCounter()
	 * @generated
	 */
	public void testGetCounter() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCounter(long) <em>Counter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCounter(long)
	 * @generated
	 */
	public void testSetCounter() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateMonitoredItemsRequest() <em>Create Monitored Items Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateMonitoredItemsRequest()
	 * @generated
	 */
	public void testGetCreateMonitoredItemsRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCreateMonitoredItemsRequest(org.opcfoundation.ua._2008._02.types.CreateMonitoredItemsRequest) <em>Create Monitored Items Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCreateMonitoredItemsRequest(org.opcfoundation.ua._2008._02.types.CreateMonitoredItemsRequest)
	 * @generated
	 */
	public void testSetCreateMonitoredItemsRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateMonitoredItemsResponse() <em>Create Monitored Items Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateMonitoredItemsResponse()
	 * @generated
	 */
	public void testGetCreateMonitoredItemsResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCreateMonitoredItemsResponse(org.opcfoundation.ua._2008._02.types.CreateMonitoredItemsResponse) <em>Create Monitored Items Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCreateMonitoredItemsResponse(org.opcfoundation.ua._2008._02.types.CreateMonitoredItemsResponse)
	 * @generated
	 */
	public void testSetCreateMonitoredItemsResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSessionRequest() <em>Create Session Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSessionRequest()
	 * @generated
	 */
	public void testGetCreateSessionRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCreateSessionRequest(org.opcfoundation.ua._2008._02.types.CreateSessionRequest) <em>Create Session Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCreateSessionRequest(org.opcfoundation.ua._2008._02.types.CreateSessionRequest)
	 * @generated
	 */
	public void testSetCreateSessionRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSessionResponse() <em>Create Session Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSessionResponse()
	 * @generated
	 */
	public void testGetCreateSessionResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCreateSessionResponse(org.opcfoundation.ua._2008._02.types.CreateSessionResponse) <em>Create Session Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCreateSessionResponse(org.opcfoundation.ua._2008._02.types.CreateSessionResponse)
	 * @generated
	 */
	public void testSetCreateSessionResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSubscriptionRequest() <em>Create Subscription Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSubscriptionRequest()
	 * @generated
	 */
	public void testGetCreateSubscriptionRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCreateSubscriptionRequest(org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest) <em>Create Subscription Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCreateSubscriptionRequest(org.opcfoundation.ua._2008._02.types.CreateSubscriptionRequest)
	 * @generated
	 */
	public void testSetCreateSubscriptionRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSubscriptionResponse() <em>Create Subscription Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCreateSubscriptionResponse()
	 * @generated
	 */
	public void testGetCreateSubscriptionResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCreateSubscriptionResponse(org.opcfoundation.ua._2008._02.types.CreateSubscriptionResponse) <em>Create Subscription Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCreateSubscriptionResponse(org.opcfoundation.ua._2008._02.types.CreateSubscriptionResponse)
	 * @generated
	 */
	public void testSetCreateSubscriptionResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getCurrencyUnitType() <em>Currency Unit Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getCurrencyUnitType()
	 * @generated
	 */
	public void testGetCurrencyUnitType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setCurrencyUnitType(org.opcfoundation.ua._2008._02.types.CurrencyUnitType) <em>Currency Unit Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setCurrencyUnitType(org.opcfoundation.ua._2008._02.types.CurrencyUnitType)
	 * @generated
	 */
	public void testSetCurrencyUnitType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataChangeFilter() <em>Data Change Filter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataChangeFilter()
	 * @generated
	 */
	public void testGetDataChangeFilter() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataChangeFilter(org.opcfoundation.ua._2008._02.types.DataChangeFilter) <em>Data Change Filter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataChangeFilter(org.opcfoundation.ua._2008._02.types.DataChangeFilter)
	 * @generated
	 */
	public void testSetDataChangeFilter() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataChangeNotification() <em>Data Change Notification</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataChangeNotification()
	 * @generated
	 */
	public void testGetDataChangeNotification() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataChangeNotification(org.opcfoundation.ua._2008._02.types.DataChangeNotification) <em>Data Change Notification</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataChangeNotification(org.opcfoundation.ua._2008._02.types.DataChangeNotification)
	 * @generated
	 */
	public void testSetDataChangeNotification() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataChangeTrigger() <em>Data Change Trigger</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataChangeTrigger()
	 * @generated
	 */
	public void testGetDataChangeTrigger() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataChangeTrigger(org.opcfoundation.ua._2008._02.types.DataChangeTrigger) <em>Data Change Trigger</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataChangeTrigger(org.opcfoundation.ua._2008._02.types.DataChangeTrigger)
	 * @generated
	 */
	public void testSetDataChangeTrigger() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDatagramConnectionTransportDataType() <em>Datagram Connection Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDatagramConnectionTransportDataType()
	 * @generated
	 */
	public void testGetDatagramConnectionTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDatagramConnectionTransportDataType(org.opcfoundation.ua._2008._02.types.DatagramConnectionTransportDataType) <em>Datagram Connection Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDatagramConnectionTransportDataType(org.opcfoundation.ua._2008._02.types.DatagramConnectionTransportDataType)
	 * @generated
	 */
	public void testSetDatagramConnectionTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDatagramWriterGroupTransportDataType() <em>Datagram Writer Group Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDatagramWriterGroupTransportDataType()
	 * @generated
	 */
	public void testGetDatagramWriterGroupTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDatagramWriterGroupTransportDataType(org.opcfoundation.ua._2008._02.types.DatagramWriterGroupTransportDataType) <em>Datagram Writer Group Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDatagramWriterGroupTransportDataType(org.opcfoundation.ua._2008._02.types.DatagramWriterGroupTransportDataType)
	 * @generated
	 */
	public void testSetDatagramWriterGroupTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetFieldContentMask() <em>Data Set Field Content Mask</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetFieldContentMask()
	 * @generated
	 */
	public void testGetDataSetFieldContentMask() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetFieldContentMask(long) <em>Data Set Field Content Mask</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetFieldContentMask(long)
	 * @generated
	 */
	public void testSetDataSetFieldContentMask() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetFieldFlags() <em>Data Set Field Flags</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetFieldFlags()
	 * @generated
	 */
	public void testGetDataSetFieldFlags() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetFieldFlags(int) <em>Data Set Field Flags</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetFieldFlags(int)
	 * @generated
	 */
	public void testSetDataSetFieldFlags() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetMetaDataType() <em>Data Set Meta Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetMetaDataType()
	 * @generated
	 */
	public void testGetDataSetMetaDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetMetaDataType(org.opcfoundation.ua._2008._02.types.DataSetMetaDataType) <em>Data Set Meta Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetMetaDataType(org.opcfoundation.ua._2008._02.types.DataSetMetaDataType)
	 * @generated
	 */
	public void testSetDataSetMetaDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetOrderingType() <em>Data Set Ordering Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetOrderingType()
	 * @generated
	 */
	public void testGetDataSetOrderingType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetOrderingType(org.opcfoundation.ua._2008._02.types.DataSetOrderingType) <em>Data Set Ordering Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetOrderingType(org.opcfoundation.ua._2008._02.types.DataSetOrderingType)
	 * @generated
	 */
	public void testSetDataSetOrderingType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetReaderDataType() <em>Data Set Reader Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetReaderDataType()
	 * @generated
	 */
	public void testGetDataSetReaderDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetReaderDataType(org.opcfoundation.ua._2008._02.types.DataSetReaderDataType) <em>Data Set Reader Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetReaderDataType(org.opcfoundation.ua._2008._02.types.DataSetReaderDataType)
	 * @generated
	 */
	public void testSetDataSetReaderDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetReaderMessageDataType() <em>Data Set Reader Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetReaderMessageDataType()
	 * @generated
	 */
	public void testGetDataSetReaderMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetReaderMessageDataType(org.opcfoundation.ua._2008._02.types.DataSetReaderMessageDataType) <em>Data Set Reader Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetReaderMessageDataType(org.opcfoundation.ua._2008._02.types.DataSetReaderMessageDataType)
	 * @generated
	 */
	public void testSetDataSetReaderMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetReaderTransportDataType() <em>Data Set Reader Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetReaderTransportDataType()
	 * @generated
	 */
	public void testGetDataSetReaderTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetReaderTransportDataType(org.opcfoundation.ua._2008._02.types.DataSetReaderTransportDataType) <em>Data Set Reader Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetReaderTransportDataType(org.opcfoundation.ua._2008._02.types.DataSetReaderTransportDataType)
	 * @generated
	 */
	public void testSetDataSetReaderTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetWriterDataType() <em>Data Set Writer Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetWriterDataType()
	 * @generated
	 */
	public void testGetDataSetWriterDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetWriterDataType(org.opcfoundation.ua._2008._02.types.DataSetWriterDataType) <em>Data Set Writer Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetWriterDataType(org.opcfoundation.ua._2008._02.types.DataSetWriterDataType)
	 * @generated
	 */
	public void testSetDataSetWriterDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetWriterMessageDataType() <em>Data Set Writer Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetWriterMessageDataType()
	 * @generated
	 */
	public void testGetDataSetWriterMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetWriterMessageDataType(org.opcfoundation.ua._2008._02.types.DataSetWriterMessageDataType) <em>Data Set Writer Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetWriterMessageDataType(org.opcfoundation.ua._2008._02.types.DataSetWriterMessageDataType)
	 * @generated
	 */
	public void testSetDataSetWriterMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetWriterTransportDataType() <em>Data Set Writer Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataSetWriterTransportDataType()
	 * @generated
	 */
	public void testGetDataSetWriterTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetWriterTransportDataType(org.opcfoundation.ua._2008._02.types.DataSetWriterTransportDataType) <em>Data Set Writer Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataSetWriterTransportDataType(org.opcfoundation.ua._2008._02.types.DataSetWriterTransportDataType)
	 * @generated
	 */
	public void testSetDataSetWriterTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeAttributes() <em>Data Type Attributes</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeAttributes()
	 * @generated
	 */
	public void testGetDataTypeAttributes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataTypeAttributes(org.opcfoundation.ua._2008._02.types.DataTypeAttributes) <em>Data Type Attributes</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataTypeAttributes(org.opcfoundation.ua._2008._02.types.DataTypeAttributes)
	 * @generated
	 */
	public void testSetDataTypeAttributes() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeDefinition() <em>Data Type Definition</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeDefinition()
	 * @generated
	 */
	public void testGetDataTypeDefinition() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataTypeDefinition(org.opcfoundation.ua._2008._02.types.DataTypeDefinition) <em>Data Type Definition</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataTypeDefinition(org.opcfoundation.ua._2008._02.types.DataTypeDefinition)
	 * @generated
	 */
	public void testSetDataTypeDefinition() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeDescription() <em>Data Type Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeDescription()
	 * @generated
	 */
	public void testGetDataTypeDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataTypeDescription(org.opcfoundation.ua._2008._02.types.DataTypeDescription) <em>Data Type Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataTypeDescription(org.opcfoundation.ua._2008._02.types.DataTypeDescription)
	 * @generated
	 */
	public void testSetDataTypeDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeNode() <em>Data Type Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeNode()
	 * @generated
	 */
	public void testGetDataTypeNode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataTypeNode(org.opcfoundation.ua._2008._02.types.DataTypeNode) <em>Data Type Node</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataTypeNode(org.opcfoundation.ua._2008._02.types.DataTypeNode)
	 * @generated
	 */
	public void testSetDataTypeNode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeSchemaHeader() <em>Data Type Schema Header</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataTypeSchemaHeader()
	 * @generated
	 */
	public void testGetDataTypeSchemaHeader() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataTypeSchemaHeader(org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader) <em>Data Type Schema Header</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataTypeSchemaHeader(org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader)
	 * @generated
	 */
	public void testSetDataTypeSchemaHeader() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataValue() <em>Data Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDataValue()
	 * @generated
	 */
	public void testGetDataValue() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataValue(org.opcfoundation.ua._2008._02.types.DataValue) <em>Data Value</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDataValue(org.opcfoundation.ua._2008._02.types.DataValue)
	 * @generated
	 */
	public void testSetDataValue() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDate() <em>Date</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDate()
	 * @generated
	 */
	public void testGetDate() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDate(javax.xml.datatype.XMLGregorianCalendar) <em>Date</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDate(javax.xml.datatype.XMLGregorianCalendar)
	 * @generated
	 */
	public void testSetDate() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDateString() <em>Date String</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDateString()
	 * @generated
	 */
	public void testGetDateString() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDateString(java.lang.String) <em>Date String</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDateString(java.lang.String)
	 * @generated
	 */
	public void testSetDateString() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDateTime() <em>Date Time</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDateTime()
	 * @generated
	 */
	public void testGetDateTime() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDateTime(javax.xml.datatype.XMLGregorianCalendar) <em>Date Time</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDateTime(javax.xml.datatype.XMLGregorianCalendar)
	 * @generated
	 */
	public void testSetDateTime() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeadbandType() <em>Deadband Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeadbandType()
	 * @generated
	 */
	public void testGetDeadbandType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeadbandType(org.opcfoundation.ua._2008._02.types.DeadbandType) <em>Deadband Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeadbandType(org.opcfoundation.ua._2008._02.types.DeadbandType)
	 * @generated
	 */
	public void testSetDeadbandType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDecimalDataType() <em>Decimal Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDecimalDataType()
	 * @generated
	 */
	public void testGetDecimalDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDecimalDataType(org.opcfoundation.ua._2008._02.types.DecimalDataType) <em>Decimal Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDecimalDataType(org.opcfoundation.ua._2008._02.types.DecimalDataType)
	 * @generated
	 */
	public void testSetDecimalDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDecimalString() <em>Decimal String</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDecimalString()
	 * @generated
	 */
	public void testGetDecimalString() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDecimalString(java.lang.String) <em>Decimal String</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDecimalString(java.lang.String)
	 * @generated
	 */
	public void testSetDecimalString() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteAtTimeDetails() <em>Delete At Time Details</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteAtTimeDetails()
	 * @generated
	 */
	public void testGetDeleteAtTimeDetails() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteAtTimeDetails(org.opcfoundation.ua._2008._02.types.DeleteAtTimeDetails) <em>Delete At Time Details</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteAtTimeDetails(org.opcfoundation.ua._2008._02.types.DeleteAtTimeDetails)
	 * @generated
	 */
	public void testSetDeleteAtTimeDetails() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteEventDetails() <em>Delete Event Details</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteEventDetails()
	 * @generated
	 */
	public void testGetDeleteEventDetails() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteEventDetails(org.opcfoundation.ua._2008._02.types.DeleteEventDetails) <em>Delete Event Details</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteEventDetails(org.opcfoundation.ua._2008._02.types.DeleteEventDetails)
	 * @generated
	 */
	public void testSetDeleteEventDetails() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteMonitoredItemsRequest() <em>Delete Monitored Items Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteMonitoredItemsRequest()
	 * @generated
	 */
	public void testGetDeleteMonitoredItemsRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteMonitoredItemsRequest(org.opcfoundation.ua._2008._02.types.DeleteMonitoredItemsRequest) <em>Delete Monitored Items Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteMonitoredItemsRequest(org.opcfoundation.ua._2008._02.types.DeleteMonitoredItemsRequest)
	 * @generated
	 */
	public void testSetDeleteMonitoredItemsRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteMonitoredItemsResponse() <em>Delete Monitored Items Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteMonitoredItemsResponse()
	 * @generated
	 */
	public void testGetDeleteMonitoredItemsResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteMonitoredItemsResponse(org.opcfoundation.ua._2008._02.types.DeleteMonitoredItemsResponse) <em>Delete Monitored Items Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteMonitoredItemsResponse(org.opcfoundation.ua._2008._02.types.DeleteMonitoredItemsResponse)
	 * @generated
	 */
	public void testSetDeleteMonitoredItemsResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteNodesItem() <em>Delete Nodes Item</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteNodesItem()
	 * @generated
	 */
	public void testGetDeleteNodesItem() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteNodesItem(org.opcfoundation.ua._2008._02.types.DeleteNodesItem) <em>Delete Nodes Item</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteNodesItem(org.opcfoundation.ua._2008._02.types.DeleteNodesItem)
	 * @generated
	 */
	public void testSetDeleteNodesItem() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteNodesRequest() <em>Delete Nodes Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteNodesRequest()
	 * @generated
	 */
	public void testGetDeleteNodesRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteNodesRequest(org.opcfoundation.ua._2008._02.types.DeleteNodesRequest) <em>Delete Nodes Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteNodesRequest(org.opcfoundation.ua._2008._02.types.DeleteNodesRequest)
	 * @generated
	 */
	public void testSetDeleteNodesRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteNodesResponse() <em>Delete Nodes Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteNodesResponse()
	 * @generated
	 */
	public void testGetDeleteNodesResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteNodesResponse(org.opcfoundation.ua._2008._02.types.DeleteNodesResponse) <em>Delete Nodes Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteNodesResponse(org.opcfoundation.ua._2008._02.types.DeleteNodesResponse)
	 * @generated
	 */
	public void testSetDeleteNodesResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteRawModifiedDetails() <em>Delete Raw Modified Details</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteRawModifiedDetails()
	 * @generated
	 */
	public void testGetDeleteRawModifiedDetails() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteRawModifiedDetails(org.opcfoundation.ua._2008._02.types.DeleteRawModifiedDetails) <em>Delete Raw Modified Details</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteRawModifiedDetails(org.opcfoundation.ua._2008._02.types.DeleteRawModifiedDetails)
	 * @generated
	 */
	public void testSetDeleteRawModifiedDetails() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteReferencesItem() <em>Delete References Item</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteReferencesItem()
	 * @generated
	 */
	public void testGetDeleteReferencesItem() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteReferencesItem(org.opcfoundation.ua._2008._02.types.DeleteReferencesItem) <em>Delete References Item</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteReferencesItem(org.opcfoundation.ua._2008._02.types.DeleteReferencesItem)
	 * @generated
	 */
	public void testSetDeleteReferencesItem() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteReferencesRequest() <em>Delete References Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteReferencesRequest()
	 * @generated
	 */
	public void testGetDeleteReferencesRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteReferencesRequest(org.opcfoundation.ua._2008._02.types.DeleteReferencesRequest) <em>Delete References Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteReferencesRequest(org.opcfoundation.ua._2008._02.types.DeleteReferencesRequest)
	 * @generated
	 */
	public void testSetDeleteReferencesRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteReferencesResponse() <em>Delete References Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteReferencesResponse()
	 * @generated
	 */
	public void testGetDeleteReferencesResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteReferencesResponse(org.opcfoundation.ua._2008._02.types.DeleteReferencesResponse) <em>Delete References Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteReferencesResponse(org.opcfoundation.ua._2008._02.types.DeleteReferencesResponse)
	 * @generated
	 */
	public void testSetDeleteReferencesResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteSubscriptionsRequest() <em>Delete Subscriptions Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteSubscriptionsRequest()
	 * @generated
	 */
	public void testGetDeleteSubscriptionsRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteSubscriptionsRequest(org.opcfoundation.ua._2008._02.types.DeleteSubscriptionsRequest) <em>Delete Subscriptions Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteSubscriptionsRequest(org.opcfoundation.ua._2008._02.types.DeleteSubscriptionsRequest)
	 * @generated
	 */
	public void testSetDeleteSubscriptionsRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteSubscriptionsResponse() <em>Delete Subscriptions Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDeleteSubscriptionsResponse()
	 * @generated
	 */
	public void testGetDeleteSubscriptionsResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteSubscriptionsResponse(org.opcfoundation.ua._2008._02.types.DeleteSubscriptionsResponse) <em>Delete Subscriptions Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDeleteSubscriptionsResponse(org.opcfoundation.ua._2008._02.types.DeleteSubscriptionsResponse)
	 * @generated
	 */
	public void testSetDeleteSubscriptionsResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDiagnosticInfo() <em>Diagnostic Info</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDiagnosticInfo()
	 * @generated
	 */
	public void testGetDiagnosticInfo() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDiagnosticInfo(org.opcfoundation.ua._2008._02.types.DiagnosticInfo) <em>Diagnostic Info</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDiagnosticInfo(org.opcfoundation.ua._2008._02.types.DiagnosticInfo)
	 * @generated
	 */
	public void testSetDiagnosticInfo() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDiagnosticsLevel() <em>Diagnostics Level</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDiagnosticsLevel()
	 * @generated
	 */
	public void testGetDiagnosticsLevel() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDiagnosticsLevel(org.opcfoundation.ua._2008._02.types.DiagnosticsLevel) <em>Diagnostics Level</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDiagnosticsLevel(org.opcfoundation.ua._2008._02.types.DiagnosticsLevel)
	 * @generated
	 */
	public void testSetDiagnosticsLevel() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDiscoveryConfiguration() <em>Discovery Configuration</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDiscoveryConfiguration()
	 * @generated
	 */
	public void testGetDiscoveryConfiguration() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDiscoveryConfiguration(org.opcfoundation.ua._2008._02.types.DiscoveryConfiguration) <em>Discovery Configuration</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDiscoveryConfiguration(org.opcfoundation.ua._2008._02.types.DiscoveryConfiguration)
	 * @generated
	 */
	public void testSetDiscoveryConfiguration() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDouble() <em>Double</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDouble()
	 * @generated
	 */
	public void testGetDouble() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDouble(java.lang.Double) <em>Double</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDouble(java.lang.Double)
	 * @generated
	 */
	public void testSetDouble() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDoubleComplexNumberType() <em>Double Complex Number Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDoubleComplexNumberType()
	 * @generated
	 */
	public void testGetDoubleComplexNumberType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDoubleComplexNumberType(org.opcfoundation.ua._2008._02.types.DoubleComplexNumberType) <em>Double Complex Number Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDoubleComplexNumberType(org.opcfoundation.ua._2008._02.types.DoubleComplexNumberType)
	 * @generated
	 */
	public void testSetDoubleComplexNumberType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDuration() <em>Duration</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDuration()
	 * @generated
	 */
	public void testGetDuration() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDuration(double) <em>Duration</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDuration(double)
	 * @generated
	 */
	public void testSetDuration() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getDurationString() <em>Duration String</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getDurationString()
	 * @generated
	 */
	public void testGetDurationString() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setDurationString(java.lang.String) <em>Duration String</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setDurationString(java.lang.String)
	 * @generated
	 */
	public void testSetDurationString() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getElementOperand() <em>Element Operand</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getElementOperand()
	 * @generated
	 */
	public void testGetElementOperand() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setElementOperand(org.opcfoundation.ua._2008._02.types.ElementOperand) <em>Element Operand</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setElementOperand(org.opcfoundation.ua._2008._02.types.ElementOperand)
	 * @generated
	 */
	public void testSetElementOperand() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointConfiguration() <em>Endpoint Configuration</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointConfiguration()
	 * @generated
	 */
	public void testGetEndpointConfiguration() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setEndpointConfiguration(org.opcfoundation.ua._2008._02.types.EndpointConfiguration) <em>Endpoint Configuration</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setEndpointConfiguration(org.opcfoundation.ua._2008._02.types.EndpointConfiguration)
	 * @generated
	 */
	public void testSetEndpointConfiguration() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointDescription() <em>Endpoint Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointDescription()
	 * @generated
	 */
	public void testGetEndpointDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setEndpointDescription(org.opcfoundation.ua._2008._02.types.EndpointDescription) <em>Endpoint Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setEndpointDescription(org.opcfoundation.ua._2008._02.types.EndpointDescription)
	 * @generated
	 */
	public void testSetEndpointDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointType() <em>Endpoint Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointType()
	 * @generated
	 */
	public void testGetEndpointType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setEndpointType(org.opcfoundation.ua._2008._02.types.EndpointType) <em>Endpoint Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setEndpointType(org.opcfoundation.ua._2008._02.types.EndpointType)
	 * @generated
	 */
	public void testSetEndpointType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointUrlListDataType() <em>Endpoint Url List Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getEndpointUrlListDataType()
	 * @generated
	 */
	public void testGetEndpointUrlListDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setEndpointUrlListDataType(org.opcfoundation.ua._2008._02.types.EndpointUrlListDataType) <em>Endpoint Url List Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setEndpointUrlListDataType(org.opcfoundation.ua._2008._02.types.EndpointUrlListDataType)
	 * @generated
	 */
	public void testSetEndpointUrlListDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumDefinition() <em>Enum Definition</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumDefinition()
	 * @generated
	 */
	public void testGetEnumDefinition() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setEnumDefinition(org.opcfoundation.ua._2008._02.types.EnumDefinition) <em>Enum Definition</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setEnumDefinition(org.opcfoundation.ua._2008._02.types.EnumDefinition)
	 * @generated
	 */
	public void testSetEnumDefinition() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumDescription() <em>Enum Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumDescription()
	 * @generated
	 */
	public void testGetEnumDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setEnumDescription(org.opcfoundation.ua._2008._02.types.EnumDescription) <em>Enum Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setEnumDescription(org.opcfoundation.ua._2008._02.types.EnumDescription)
	 * @generated
	 */
	public void testSetEnumDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumField() <em>Enum Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumField()
	 * @generated
	 */
	public void testGetEnumField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setEnumField(org.opcfoundation.ua._2008._02.types.EnumField) <em>Enum Field</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setEnumField(org.opcfoundation.ua._2008._02.types.EnumField)
	 * @generated
	 */
	public void testSetEnumField() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumValueType() <em>Enum Value Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getEnumValueType()
	 * @generated
	 */
	public void testGetEnumValueType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setEnumValueType(org.opcfoundation.ua._2008._02.types.EnumValueType) <em>Enum Value Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setEnumValueType(org.opcfoundation.ua._2008._02.types.EnumValueType)
	 * @generated
	 */
	public void testSetEnumValueType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEUInformation() <em>EU Information</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getEUInformation()
	 * @generated
	 */
	public void testGetEUInformation() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setEUInformation(org.opcfoundation.ua._2008._02.types.EUInformation) <em>EU Information</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setEUInformation(org.opcfoundation.ua._2008._02.types.EUInformation)
	 * @generated
	 */
	public void testSetEUInformation() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventFieldList() <em>Event Field List</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventFieldList()
	 * @generated
	 */
	public void testGetEventFieldList() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setEventFieldList(org.opcfoundation.ua._2008._02.types.EventFieldList) <em>Event Field List</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setEventFieldList(org.opcfoundation.ua._2008._02.types.EventFieldList)
	 * @generated
	 */
	public void testSetEventFieldList() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventFilter() <em>Event Filter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventFilter()
	 * @generated
	 */
	public void testGetEventFilter() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setEventFilter(org.opcfoundation.ua._2008._02.types.EventFilter) <em>Event Filter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setEventFilter(org.opcfoundation.ua._2008._02.types.EventFilter)
	 * @generated
	 */
	public void testSetEventFilter() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventFilterResult() <em>Event Filter Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventFilterResult()
	 * @generated
	 */
	public void testGetEventFilterResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setEventFilterResult(org.opcfoundation.ua._2008._02.types.EventFilterResult) <em>Event Filter Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setEventFilterResult(org.opcfoundation.ua._2008._02.types.EventFilterResult)
	 * @generated
	 */
	public void testSetEventFilterResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventNotificationList() <em>Event Notification List</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventNotificationList()
	 * @generated
	 */
	public void testGetEventNotificationList() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setEventNotificationList(org.opcfoundation.ua._2008._02.types.EventNotificationList) <em>Event Notification List</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setEventNotificationList(org.opcfoundation.ua._2008._02.types.EventNotificationList)
	 * @generated
	 */
	public void testSetEventNotificationList() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventNotifierType() <em>Event Notifier Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getEventNotifierType()
	 * @generated
	 */
	public void testGetEventNotifierType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setEventNotifierType(short) <em>Event Notifier Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setEventNotifierType(short)
	 * @generated
	 */
	public void testSetEventNotifierType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getExceptionDeviationFormat() <em>Exception Deviation Format</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getExceptionDeviationFormat()
	 * @generated
	 */
	public void testGetExceptionDeviationFormat() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setExceptionDeviationFormat(org.opcfoundation.ua._2008._02.types.ExceptionDeviationFormat) <em>Exception Deviation Format</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setExceptionDeviationFormat(org.opcfoundation.ua._2008._02.types.ExceptionDeviationFormat)
	 * @generated
	 */
	public void testSetExceptionDeviationFormat() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getExpandedNodeId() <em>Expanded Node Id</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getExpandedNodeId()
	 * @generated
	 */
	public void testGetExpandedNodeId() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setExpandedNodeId(org.opcfoundation.ua._2008._02.types.ExpandedNodeId) <em>Expanded Node Id</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setExpandedNodeId(org.opcfoundation.ua._2008._02.types.ExpandedNodeId)
	 * @generated
	 */
	public void testSetExpandedNodeId() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getExtensionObject() <em>Extension Object</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getExtensionObject()
	 * @generated
	 */
	public void testGetExtensionObject() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setExtensionObject(org.opcfoundation.ua._2008._02.types.ExtensionObject) <em>Extension Object</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setExtensionObject(org.opcfoundation.ua._2008._02.types.ExtensionObject)
	 * @generated
	 */
	public void testSetExtensionObject() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFieldMetaData() <em>Field Meta Data</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getFieldMetaData()
	 * @generated
	 */
	public void testGetFieldMetaData() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setFieldMetaData(org.opcfoundation.ua._2008._02.types.FieldMetaData) <em>Field Meta Data</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setFieldMetaData(org.opcfoundation.ua._2008._02.types.FieldMetaData)
	 * @generated
	 */
	public void testSetFieldMetaData() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFieldTargetDataType() <em>Field Target Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getFieldTargetDataType()
	 * @generated
	 */
	public void testGetFieldTargetDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setFieldTargetDataType(org.opcfoundation.ua._2008._02.types.FieldTargetDataType) <em>Field Target Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setFieldTargetDataType(org.opcfoundation.ua._2008._02.types.FieldTargetDataType)
	 * @generated
	 */
	public void testSetFieldTargetDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFilterOperand() <em>Filter Operand</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getFilterOperand()
	 * @generated
	 */
	public void testGetFilterOperand() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setFilterOperand(org.opcfoundation.ua._2008._02.types.FilterOperand) <em>Filter Operand</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setFilterOperand(org.opcfoundation.ua._2008._02.types.FilterOperand)
	 * @generated
	 */
	public void testSetFilterOperand() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFilterOperator() <em>Filter Operator</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getFilterOperator()
	 * @generated
	 */
	public void testGetFilterOperator() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setFilterOperator(org.opcfoundation.ua._2008._02.types.FilterOperator) <em>Filter Operator</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setFilterOperator(org.opcfoundation.ua._2008._02.types.FilterOperator)
	 * @generated
	 */
	public void testSetFilterOperator() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersOnNetworkRequest() <em>Find Servers On Network Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersOnNetworkRequest()
	 * @generated
	 */
	public void testGetFindServersOnNetworkRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setFindServersOnNetworkRequest(org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest) <em>Find Servers On Network Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setFindServersOnNetworkRequest(org.opcfoundation.ua._2008._02.types.FindServersOnNetworkRequest)
	 * @generated
	 */
	public void testSetFindServersOnNetworkRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersOnNetworkResponse() <em>Find Servers On Network Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersOnNetworkResponse()
	 * @generated
	 */
	public void testGetFindServersOnNetworkResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setFindServersOnNetworkResponse(org.opcfoundation.ua._2008._02.types.FindServersOnNetworkResponse) <em>Find Servers On Network Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setFindServersOnNetworkResponse(org.opcfoundation.ua._2008._02.types.FindServersOnNetworkResponse)
	 * @generated
	 */
	public void testSetFindServersOnNetworkResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersRequest() <em>Find Servers Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersRequest()
	 * @generated
	 */
	public void testGetFindServersRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setFindServersRequest(org.opcfoundation.ua._2008._02.types.FindServersRequest) <em>Find Servers Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setFindServersRequest(org.opcfoundation.ua._2008._02.types.FindServersRequest)
	 * @generated
	 */
	public void testSetFindServersRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersResponse() <em>Find Servers Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getFindServersResponse()
	 * @generated
	 */
	public void testGetFindServersResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setFindServersResponse(org.opcfoundation.ua._2008._02.types.FindServersResponse) <em>Find Servers Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setFindServersResponse(org.opcfoundation.ua._2008._02.types.FindServersResponse)
	 * @generated
	 */
	public void testSetFindServersResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFloat() <em>Float</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getFloat()
	 * @generated
	 */
	public void testGetFloat() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setFloat(java.lang.Float) <em>Float</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setFloat(java.lang.Float)
	 * @generated
	 */
	public void testSetFloat() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getFrame() <em>Frame</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getFrame()
	 * @generated
	 */
	public void testGetFrame() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setFrame(org.opcfoundation.ua._2008._02.types.Frame) <em>Frame</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setFrame(org.opcfoundation.ua._2008._02.types.Frame)
	 * @generated
	 */
	public void testSetFrame() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGenericAttributes() <em>Generic Attributes</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getGenericAttributes()
	 * @generated
	 */
	public void testGetGenericAttributes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setGenericAttributes(org.opcfoundation.ua._2008._02.types.GenericAttributes) <em>Generic Attributes</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setGenericAttributes(org.opcfoundation.ua._2008._02.types.GenericAttributes)
	 * @generated
	 */
	public void testSetGenericAttributes() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGenericAttributeValue() <em>Generic Attribute Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getGenericAttributeValue()
	 * @generated
	 */
	public void testGetGenericAttributeValue() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setGenericAttributeValue(org.opcfoundation.ua._2008._02.types.GenericAttributeValue) <em>Generic Attribute Value</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setGenericAttributeValue(org.opcfoundation.ua._2008._02.types.GenericAttributeValue)
	 * @generated
	 */
	public void testSetGenericAttributeValue() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGetEndpointsRequest() <em>Get Endpoints Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getGetEndpointsRequest()
	 * @generated
	 */
	public void testGetGetEndpointsRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setGetEndpointsRequest(org.opcfoundation.ua._2008._02.types.GetEndpointsRequest) <em>Get Endpoints Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setGetEndpointsRequest(org.opcfoundation.ua._2008._02.types.GetEndpointsRequest)
	 * @generated
	 */
	public void testSetGetEndpointsRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGetEndpointsResponse() <em>Get Endpoints Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getGetEndpointsResponse()
	 * @generated
	 */
	public void testGetGetEndpointsResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setGetEndpointsResponse(org.opcfoundation.ua._2008._02.types.GetEndpointsResponse) <em>Get Endpoints Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setGetEndpointsResponse(org.opcfoundation.ua._2008._02.types.GetEndpointsResponse)
	 * @generated
	 */
	public void testSetGetEndpointsResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getGuid() <em>Guid</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getGuid()
	 * @generated
	 */
	public void testGetGuid() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setGuid(org.opcfoundation.ua._2008._02.types.Guid) <em>Guid</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setGuid(org.opcfoundation.ua._2008._02.types.Guid)
	 * @generated
	 */
	public void testSetGuid() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryData() <em>History Data</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryData()
	 * @generated
	 */
	public void testGetHistoryData() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryData(org.opcfoundation.ua._2008._02.types.HistoryData) <em>History Data</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryData(org.opcfoundation.ua._2008._02.types.HistoryData)
	 * @generated
	 */
	public void testSetHistoryData() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryEvent() <em>History Event</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryEvent()
	 * @generated
	 */
	public void testGetHistoryEvent() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryEvent(org.opcfoundation.ua._2008._02.types.HistoryEvent) <em>History Event</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryEvent(org.opcfoundation.ua._2008._02.types.HistoryEvent)
	 * @generated
	 */
	public void testSetHistoryEvent() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryEventFieldList() <em>History Event Field List</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryEventFieldList()
	 * @generated
	 */
	public void testGetHistoryEventFieldList() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryEventFieldList(org.opcfoundation.ua._2008._02.types.HistoryEventFieldList) <em>History Event Field List</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryEventFieldList(org.opcfoundation.ua._2008._02.types.HistoryEventFieldList)
	 * @generated
	 */
	public void testSetHistoryEventFieldList() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryModifiedData() <em>History Modified Data</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryModifiedData()
	 * @generated
	 */
	public void testGetHistoryModifiedData() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryModifiedData(org.opcfoundation.ua._2008._02.types.HistoryModifiedData) <em>History Modified Data</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryModifiedData(org.opcfoundation.ua._2008._02.types.HistoryModifiedData)
	 * @generated
	 */
	public void testSetHistoryModifiedData() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadDetails() <em>History Read Details</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadDetails()
	 * @generated
	 */
	public void testGetHistoryReadDetails() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryReadDetails(org.opcfoundation.ua._2008._02.types.HistoryReadDetails) <em>History Read Details</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryReadDetails(org.opcfoundation.ua._2008._02.types.HistoryReadDetails)
	 * @generated
	 */
	public void testSetHistoryReadDetails() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadRequest() <em>History Read Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadRequest()
	 * @generated
	 */
	public void testGetHistoryReadRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryReadRequest(org.opcfoundation.ua._2008._02.types.HistoryReadRequest) <em>History Read Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryReadRequest(org.opcfoundation.ua._2008._02.types.HistoryReadRequest)
	 * @generated
	 */
	public void testSetHistoryReadRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadResponse() <em>History Read Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadResponse()
	 * @generated
	 */
	public void testGetHistoryReadResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryReadResponse(org.opcfoundation.ua._2008._02.types.HistoryReadResponse) <em>History Read Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryReadResponse(org.opcfoundation.ua._2008._02.types.HistoryReadResponse)
	 * @generated
	 */
	public void testSetHistoryReadResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadResult() <em>History Read Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadResult()
	 * @generated
	 */
	public void testGetHistoryReadResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryReadResult(org.opcfoundation.ua._2008._02.types.HistoryReadResult) <em>History Read Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryReadResult(org.opcfoundation.ua._2008._02.types.HistoryReadResult)
	 * @generated
	 */
	public void testSetHistoryReadResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadValueId() <em>History Read Value Id</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryReadValueId()
	 * @generated
	 */
	public void testGetHistoryReadValueId() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryReadValueId(org.opcfoundation.ua._2008._02.types.HistoryReadValueId) <em>History Read Value Id</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryReadValueId(org.opcfoundation.ua._2008._02.types.HistoryReadValueId)
	 * @generated
	 */
	public void testSetHistoryReadValueId() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateDetails() <em>History Update Details</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateDetails()
	 * @generated
	 */
	public void testGetHistoryUpdateDetails() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryUpdateDetails(org.opcfoundation.ua._2008._02.types.HistoryUpdateDetails) <em>History Update Details</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryUpdateDetails(org.opcfoundation.ua._2008._02.types.HistoryUpdateDetails)
	 * @generated
	 */
	public void testSetHistoryUpdateDetails() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateRequest() <em>History Update Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateRequest()
	 * @generated
	 */
	public void testGetHistoryUpdateRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryUpdateRequest(org.opcfoundation.ua._2008._02.types.HistoryUpdateRequest) <em>History Update Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryUpdateRequest(org.opcfoundation.ua._2008._02.types.HistoryUpdateRequest)
	 * @generated
	 */
	public void testSetHistoryUpdateRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateResponse() <em>History Update Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateResponse()
	 * @generated
	 */
	public void testGetHistoryUpdateResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryUpdateResponse(org.opcfoundation.ua._2008._02.types.HistoryUpdateResponse) <em>History Update Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryUpdateResponse(org.opcfoundation.ua._2008._02.types.HistoryUpdateResponse)
	 * @generated
	 */
	public void testSetHistoryUpdateResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateResult() <em>History Update Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateResult()
	 * @generated
	 */
	public void testGetHistoryUpdateResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryUpdateResult(org.opcfoundation.ua._2008._02.types.HistoryUpdateResult) <em>History Update Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryUpdateResult(org.opcfoundation.ua._2008._02.types.HistoryUpdateResult)
	 * @generated
	 */
	public void testSetHistoryUpdateResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateType() <em>History Update Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getHistoryUpdateType()
	 * @generated
	 */
	public void testGetHistoryUpdateType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryUpdateType(org.opcfoundation.ua._2008._02.types.HistoryUpdateType) <em>History Update Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setHistoryUpdateType(org.opcfoundation.ua._2008._02.types.HistoryUpdateType)
	 * @generated
	 */
	public void testSetHistoryUpdateType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIdentityCriteriaType() <em>Identity Criteria Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getIdentityCriteriaType()
	 * @generated
	 */
	public void testGetIdentityCriteriaType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setIdentityCriteriaType(org.opcfoundation.ua._2008._02.types.IdentityCriteriaType) <em>Identity Criteria Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setIdentityCriteriaType(org.opcfoundation.ua._2008._02.types.IdentityCriteriaType)
	 * @generated
	 */
	public void testSetIdentityCriteriaType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIdentityMappingRuleType() <em>Identity Mapping Rule Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getIdentityMappingRuleType()
	 * @generated
	 */
	public void testGetIdentityMappingRuleType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setIdentityMappingRuleType(org.opcfoundation.ua._2008._02.types.IdentityMappingRuleType) <em>Identity Mapping Rule Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setIdentityMappingRuleType(org.opcfoundation.ua._2008._02.types.IdentityMappingRuleType)
	 * @generated
	 */
	public void testSetIdentityMappingRuleType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIdType() <em>Id Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getIdType()
	 * @generated
	 */
	public void testGetIdType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setIdType(org.opcfoundation.ua._2008._02.types.IdType) <em>Id Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setIdType(org.opcfoundation.ua._2008._02.types.IdType)
	 * @generated
	 */
	public void testSetIdType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getImageBMP() <em>Image BMP</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getImageBMP()
	 * @generated
	 */
	public void testGetImageBMP() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setImageBMP(byte[]) <em>Image BMP</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setImageBMP(byte[])
	 * @generated
	 */
	public void testSetImageBMP() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getImageGIF() <em>Image GIF</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getImageGIF()
	 * @generated
	 */
	public void testGetImageGIF() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setImageGIF(byte[]) <em>Image GIF</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setImageGIF(byte[])
	 * @generated
	 */
	public void testSetImageGIF() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getImageJPG() <em>Image JPG</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getImageJPG()
	 * @generated
	 */
	public void testGetImageJPG() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setImageJPG(byte[]) <em>Image JPG</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setImageJPG(byte[])
	 * @generated
	 */
	public void testSetImageJPG() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getImagePNG() <em>Image PNG</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getImagePNG()
	 * @generated
	 */
	public void testGetImagePNG() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setImagePNG(byte[]) <em>Image PNG</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setImagePNG(byte[])
	 * @generated
	 */
	public void testSetImagePNG() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIndex() <em>Index</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getIndex()
	 * @generated
	 */
	public void testGetIndex() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setIndex(long) <em>Index</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setIndex(long)
	 * @generated
	 */
	public void testSetIndex() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInstanceNode() <em>Instance Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getInstanceNode()
	 * @generated
	 */
	public void testGetInstanceNode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setInstanceNode(org.opcfoundation.ua._2008._02.types.InstanceNode) <em>Instance Node</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setInstanceNode(org.opcfoundation.ua._2008._02.types.InstanceNode)
	 * @generated
	 */
	public void testSetInstanceNode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInt16() <em>Int16</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getInt16()
	 * @generated
	 */
	public void testGetInt16() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setInt16(java.lang.Short) <em>Int16</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setInt16(java.lang.Short)
	 * @generated
	 */
	public void testSetInt16() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInt32() <em>Int32</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getInt32()
	 * @generated
	 */
	public void testGetInt32() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setInt32(java.lang.Integer) <em>Int32</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setInt32(java.lang.Integer)
	 * @generated
	 */
	public void testSetInt32() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInt64() <em>Int64</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getInt64()
	 * @generated
	 */
	public void testGetInt64() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setInt64(java.lang.Long) <em>Int64</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setInt64(java.lang.Long)
	 * @generated
	 */
	public void testSetInt64() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIntegerId() <em>Integer Id</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getIntegerId()
	 * @generated
	 */
	public void testGetIntegerId() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setIntegerId(long) <em>Integer Id</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setIntegerId(long)
	 * @generated
	 */
	public void testSetIntegerId() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInvokeServiceRequest() <em>Invoke Service Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getInvokeServiceRequest()
	 * @generated
	 */
	public void testGetInvokeServiceRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setInvokeServiceRequest(byte[]) <em>Invoke Service Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setInvokeServiceRequest(byte[])
	 * @generated
	 */
	public void testSetInvokeServiceRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getInvokeServiceResponse() <em>Invoke Service Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getInvokeServiceResponse()
	 * @generated
	 */
	public void testGetInvokeServiceResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setInvokeServiceResponse(byte[]) <em>Invoke Service Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setInvokeServiceResponse(byte[])
	 * @generated
	 */
	public void testSetInvokeServiceResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getIssuedIdentityToken() <em>Issued Identity Token</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getIssuedIdentityToken()
	 * @generated
	 */
	public void testGetIssuedIdentityToken() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setIssuedIdentityToken(org.opcfoundation.ua._2008._02.types.IssuedIdentityToken) <em>Issued Identity Token</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setIssuedIdentityToken(org.opcfoundation.ua._2008._02.types.IssuedIdentityToken)
	 * @generated
	 */
	public void testSetIssuedIdentityToken() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonDataSetMessageContentMask() <em>Json Data Set Message Content Mask</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonDataSetMessageContentMask()
	 * @generated
	 */
	public void testGetJsonDataSetMessageContentMask() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setJsonDataSetMessageContentMask(long) <em>Json Data Set Message Content Mask</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setJsonDataSetMessageContentMask(long)
	 * @generated
	 */
	public void testSetJsonDataSetMessageContentMask() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonDataSetReaderMessageDataType() <em>Json Data Set Reader Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonDataSetReaderMessageDataType()
	 * @generated
	 */
	public void testGetJsonDataSetReaderMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setJsonDataSetReaderMessageDataType(org.opcfoundation.ua._2008._02.types.JsonDataSetReaderMessageDataType) <em>Json Data Set Reader Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setJsonDataSetReaderMessageDataType(org.opcfoundation.ua._2008._02.types.JsonDataSetReaderMessageDataType)
	 * @generated
	 */
	public void testSetJsonDataSetReaderMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonDataSetWriterMessageDataType() <em>Json Data Set Writer Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonDataSetWriterMessageDataType()
	 * @generated
	 */
	public void testGetJsonDataSetWriterMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setJsonDataSetWriterMessageDataType(org.opcfoundation.ua._2008._02.types.JsonDataSetWriterMessageDataType) <em>Json Data Set Writer Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setJsonDataSetWriterMessageDataType(org.opcfoundation.ua._2008._02.types.JsonDataSetWriterMessageDataType)
	 * @generated
	 */
	public void testSetJsonDataSetWriterMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonNetworkMessageContentMask() <em>Json Network Message Content Mask</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonNetworkMessageContentMask()
	 * @generated
	 */
	public void testGetJsonNetworkMessageContentMask() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setJsonNetworkMessageContentMask(long) <em>Json Network Message Content Mask</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setJsonNetworkMessageContentMask(long)
	 * @generated
	 */
	public void testSetJsonNetworkMessageContentMask() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonWriterGroupMessageDataType() <em>Json Writer Group Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getJsonWriterGroupMessageDataType()
	 * @generated
	 */
	public void testGetJsonWriterGroupMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setJsonWriterGroupMessageDataType(org.opcfoundation.ua._2008._02.types.JsonWriterGroupMessageDataType) <em>Json Writer Group Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setJsonWriterGroupMessageDataType(org.opcfoundation.ua._2008._02.types.JsonWriterGroupMessageDataType)
	 * @generated
	 */
	public void testSetJsonWriterGroupMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getKeyValuePair() <em>Key Value Pair</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getKeyValuePair()
	 * @generated
	 */
	public void testGetKeyValuePair() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setKeyValuePair(org.opcfoundation.ua._2008._02.types.KeyValuePair) <em>Key Value Pair</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setKeyValuePair(org.opcfoundation.ua._2008._02.types.KeyValuePair)
	 * @generated
	 */
	public void testSetKeyValuePair() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAddNodesItem() <em>List Of Add Nodes Item</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAddNodesItem()
	 * @generated
	 */
	public void testGetListOfAddNodesItem() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfAddNodesItem(org.opcfoundation.ua._2008._02.types.ListOfAddNodesItem) <em>List Of Add Nodes Item</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfAddNodesItem(org.opcfoundation.ua._2008._02.types.ListOfAddNodesItem)
	 * @generated
	 */
	public void testSetListOfAddNodesItem() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAddNodesResult() <em>List Of Add Nodes Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAddNodesResult()
	 * @generated
	 */
	public void testGetListOfAddNodesResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfAddNodesResult(org.opcfoundation.ua._2008._02.types.ListOfAddNodesResult) <em>List Of Add Nodes Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfAddNodesResult(org.opcfoundation.ua._2008._02.types.ListOfAddNodesResult)
	 * @generated
	 */
	public void testSetListOfAddNodesResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAddReferencesItem() <em>List Of Add References Item</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAddReferencesItem()
	 * @generated
	 */
	public void testGetListOfAddReferencesItem() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfAddReferencesItem(org.opcfoundation.ua._2008._02.types.ListOfAddReferencesItem) <em>List Of Add References Item</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfAddReferencesItem(org.opcfoundation.ua._2008._02.types.ListOfAddReferencesItem)
	 * @generated
	 */
	public void testSetListOfAddReferencesItem() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAliasNameDataType() <em>List Of Alias Name Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfAliasNameDataType()
	 * @generated
	 */
	public void testGetListOfAliasNameDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfAliasNameDataType(org.opcfoundation.ua._2008._02.types.ListOfAliasNameDataType) <em>List Of Alias Name Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfAliasNameDataType(org.opcfoundation.ua._2008._02.types.ListOfAliasNameDataType)
	 * @generated
	 */
	public void testSetListOfAliasNameDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfApplicationDescription() <em>List Of Application Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfApplicationDescription()
	 * @generated
	 */
	public void testGetListOfApplicationDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfApplicationDescription(org.opcfoundation.ua._2008._02.types.ListOfApplicationDescription) <em>List Of Application Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfApplicationDescription(org.opcfoundation.ua._2008._02.types.ListOfApplicationDescription)
	 * @generated
	 */
	public void testSetListOfApplicationDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfArgument() <em>List Of Argument</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfArgument()
	 * @generated
	 */
	public void testGetListOfArgument() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfArgument(org.opcfoundation.ua._2008._02.types.ListOfArgument) <em>List Of Argument</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfArgument(org.opcfoundation.ua._2008._02.types.ListOfArgument)
	 * @generated
	 */
	public void testSetListOfArgument() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBoolean() <em>List Of Boolean</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBoolean()
	 * @generated
	 */
	public void testGetListOfBoolean() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBoolean(org.opcfoundation.ua._2008._02.types.ListOfBoolean) <em>List Of Boolean</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBoolean(org.opcfoundation.ua._2008._02.types.ListOfBoolean)
	 * @generated
	 */
	public void testSetListOfBoolean() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerConnectionTransportDataType() <em>List Of Broker Connection Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerConnectionTransportDataType()
	 * @generated
	 */
	public void testGetListOfBrokerConnectionTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrokerConnectionTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfBrokerConnectionTransportDataType) <em>List Of Broker Connection Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrokerConnectionTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfBrokerConnectionTransportDataType)
	 * @generated
	 */
	public void testSetListOfBrokerConnectionTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerDataSetReaderTransportDataType() <em>List Of Broker Data Set Reader Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerDataSetReaderTransportDataType()
	 * @generated
	 */
	public void testGetListOfBrokerDataSetReaderTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrokerDataSetReaderTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfBrokerDataSetReaderTransportDataType) <em>List Of Broker Data Set Reader Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrokerDataSetReaderTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfBrokerDataSetReaderTransportDataType)
	 * @generated
	 */
	public void testSetListOfBrokerDataSetReaderTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerDataSetWriterTransportDataType() <em>List Of Broker Data Set Writer Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerDataSetWriterTransportDataType()
	 * @generated
	 */
	public void testGetListOfBrokerDataSetWriterTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrokerDataSetWriterTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfBrokerDataSetWriterTransportDataType) <em>List Of Broker Data Set Writer Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrokerDataSetWriterTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfBrokerDataSetWriterTransportDataType)
	 * @generated
	 */
	public void testSetListOfBrokerDataSetWriterTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerTransportQualityOfService() <em>List Of Broker Transport Quality Of Service</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerTransportQualityOfService()
	 * @generated
	 */
	public void testGetListOfBrokerTransportQualityOfService() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrokerTransportQualityOfService(org.opcfoundation.ua._2008._02.types.ListOfBrokerTransportQualityOfService) <em>List Of Broker Transport Quality Of Service</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrokerTransportQualityOfService(org.opcfoundation.ua._2008._02.types.ListOfBrokerTransportQualityOfService)
	 * @generated
	 */
	public void testSetListOfBrokerTransportQualityOfService() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerWriterGroupTransportDataType() <em>List Of Broker Writer Group Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrokerWriterGroupTransportDataType()
	 * @generated
	 */
	public void testGetListOfBrokerWriterGroupTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrokerWriterGroupTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfBrokerWriterGroupTransportDataType) <em>List Of Broker Writer Group Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrokerWriterGroupTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfBrokerWriterGroupTransportDataType)
	 * @generated
	 */
	public void testSetListOfBrokerWriterGroupTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowseDescription() <em>List Of Browse Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowseDescription()
	 * @generated
	 */
	public void testGetListOfBrowseDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrowseDescription(org.opcfoundation.ua._2008._02.types.ListOfBrowseDescription) <em>List Of Browse Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrowseDescription(org.opcfoundation.ua._2008._02.types.ListOfBrowseDescription)
	 * @generated
	 */
	public void testSetListOfBrowseDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowsePath() <em>List Of Browse Path</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowsePath()
	 * @generated
	 */
	public void testGetListOfBrowsePath() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrowsePath(org.opcfoundation.ua._2008._02.types.ListOfBrowsePath) <em>List Of Browse Path</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrowsePath(org.opcfoundation.ua._2008._02.types.ListOfBrowsePath)
	 * @generated
	 */
	public void testSetListOfBrowsePath() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowsePathResult() <em>List Of Browse Path Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowsePathResult()
	 * @generated
	 */
	public void testGetListOfBrowsePathResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrowsePathResult(org.opcfoundation.ua._2008._02.types.ListOfBrowsePathResult) <em>List Of Browse Path Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrowsePathResult(org.opcfoundation.ua._2008._02.types.ListOfBrowsePathResult)
	 * @generated
	 */
	public void testSetListOfBrowsePathResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowsePathTarget() <em>List Of Browse Path Target</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowsePathTarget()
	 * @generated
	 */
	public void testGetListOfBrowsePathTarget() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrowsePathTarget(org.opcfoundation.ua._2008._02.types.ListOfBrowsePathTarget) <em>List Of Browse Path Target</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrowsePathTarget(org.opcfoundation.ua._2008._02.types.ListOfBrowsePathTarget)
	 * @generated
	 */
	public void testSetListOfBrowsePathTarget() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowseResult() <em>List Of Browse Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfBrowseResult()
	 * @generated
	 */
	public void testGetListOfBrowseResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrowseResult(org.opcfoundation.ua._2008._02.types.ListOfBrowseResult) <em>List Of Browse Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfBrowseResult(org.opcfoundation.ua._2008._02.types.ListOfBrowseResult)
	 * @generated
	 */
	public void testSetListOfBrowseResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfByte() <em>List Of Byte</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfByte()
	 * @generated
	 */
	public void testGetListOfByte() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfByte(org.opcfoundation.ua._2008._02.types.ListOfByte) <em>List Of Byte</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfByte(org.opcfoundation.ua._2008._02.types.ListOfByte)
	 * @generated
	 */
	public void testSetListOfByte() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfByteString() <em>List Of Byte String</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfByteString()
	 * @generated
	 */
	public void testGetListOfByteString() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfByteString(org.opcfoundation.ua._2008._02.types.ListOfByteString) <em>List Of Byte String</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfByteString(org.opcfoundation.ua._2008._02.types.ListOfByteString)
	 * @generated
	 */
	public void testSetListOfByteString() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCallMethodRequest() <em>List Of Call Method Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCallMethodRequest()
	 * @generated
	 */
	public void testGetListOfCallMethodRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfCallMethodRequest(org.opcfoundation.ua._2008._02.types.ListOfCallMethodRequest) <em>List Of Call Method Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfCallMethodRequest(org.opcfoundation.ua._2008._02.types.ListOfCallMethodRequest)
	 * @generated
	 */
	public void testSetListOfCallMethodRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCallMethodResult() <em>List Of Call Method Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCallMethodResult()
	 * @generated
	 */
	public void testGetListOfCallMethodResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfCallMethodResult(org.opcfoundation.ua._2008._02.types.ListOfCallMethodResult) <em>List Of Call Method Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfCallMethodResult(org.opcfoundation.ua._2008._02.types.ListOfCallMethodResult)
	 * @generated
	 */
	public void testSetListOfCallMethodResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCartesianCoordinates() <em>List Of Cartesian Coordinates</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCartesianCoordinates()
	 * @generated
	 */
	public void testGetListOfCartesianCoordinates() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfCartesianCoordinates(org.opcfoundation.ua._2008._02.types.ListOfCartesianCoordinates) <em>List Of Cartesian Coordinates</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfCartesianCoordinates(org.opcfoundation.ua._2008._02.types.ListOfCartesianCoordinates)
	 * @generated
	 */
	public void testSetListOfCartesianCoordinates() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfConfigurationVersionDataType() <em>List Of Configuration Version Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfConfigurationVersionDataType()
	 * @generated
	 */
	public void testGetListOfConfigurationVersionDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfConfigurationVersionDataType(org.opcfoundation.ua._2008._02.types.ListOfConfigurationVersionDataType) <em>List Of Configuration Version Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfConfigurationVersionDataType(org.opcfoundation.ua._2008._02.types.ListOfConfigurationVersionDataType)
	 * @generated
	 */
	public void testSetListOfConfigurationVersionDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfConnectionTransportDataType() <em>List Of Connection Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfConnectionTransportDataType()
	 * @generated
	 */
	public void testGetListOfConnectionTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfConnectionTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfConnectionTransportDataType) <em>List Of Connection Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfConnectionTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfConnectionTransportDataType)
	 * @generated
	 */
	public void testSetListOfConnectionTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfContentFilter() <em>List Of Content Filter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfContentFilter()
	 * @generated
	 */
	public void testGetListOfContentFilter() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfContentFilter(org.opcfoundation.ua._2008._02.types.ListOfContentFilter) <em>List Of Content Filter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfContentFilter(org.opcfoundation.ua._2008._02.types.ListOfContentFilter)
	 * @generated
	 */
	public void testSetListOfContentFilter() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfContentFilterElement() <em>List Of Content Filter Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfContentFilterElement()
	 * @generated
	 */
	public void testGetListOfContentFilterElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfContentFilterElement(org.opcfoundation.ua._2008._02.types.ListOfContentFilterElement) <em>List Of Content Filter Element</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfContentFilterElement(org.opcfoundation.ua._2008._02.types.ListOfContentFilterElement)
	 * @generated
	 */
	public void testSetListOfContentFilterElement() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfContentFilterElementResult() <em>List Of Content Filter Element Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfContentFilterElementResult()
	 * @generated
	 */
	public void testGetListOfContentFilterElementResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfContentFilterElementResult(org.opcfoundation.ua._2008._02.types.ListOfContentFilterElementResult) <em>List Of Content Filter Element Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfContentFilterElementResult(org.opcfoundation.ua._2008._02.types.ListOfContentFilterElementResult)
	 * @generated
	 */
	public void testSetListOfContentFilterElementResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCurrencyUnitType() <em>List Of Currency Unit Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfCurrencyUnitType()
	 * @generated
	 */
	public void testGetListOfCurrencyUnitType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfCurrencyUnitType(org.opcfoundation.ua._2008._02.types.ListOfCurrencyUnitType) <em>List Of Currency Unit Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfCurrencyUnitType(org.opcfoundation.ua._2008._02.types.ListOfCurrencyUnitType)
	 * @generated
	 */
	public void testSetListOfCurrencyUnitType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDatagramConnectionTransportDataType() <em>List Of Datagram Connection Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDatagramConnectionTransportDataType()
	 * @generated
	 */
	public void testGetListOfDatagramConnectionTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDatagramConnectionTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfDatagramConnectionTransportDataType) <em>List Of Datagram Connection Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDatagramConnectionTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfDatagramConnectionTransportDataType)
	 * @generated
	 */
	public void testSetListOfDatagramConnectionTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDatagramWriterGroupTransportDataType() <em>List Of Datagram Writer Group Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDatagramWriterGroupTransportDataType()
	 * @generated
	 */
	public void testGetListOfDatagramWriterGroupTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDatagramWriterGroupTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfDatagramWriterGroupTransportDataType) <em>List Of Datagram Writer Group Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDatagramWriterGroupTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfDatagramWriterGroupTransportDataType)
	 * @generated
	 */
	public void testSetListOfDatagramWriterGroupTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetFieldContentMask() <em>List Of Data Set Field Content Mask</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetFieldContentMask()
	 * @generated
	 */
	public void testGetListOfDataSetFieldContentMask() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataSetFieldContentMask(org.opcfoundation.ua._2008._02.types.ListOfDataSetFieldContentMask) <em>List Of Data Set Field Content Mask</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataSetFieldContentMask(org.opcfoundation.ua._2008._02.types.ListOfDataSetFieldContentMask)
	 * @generated
	 */
	public void testSetListOfDataSetFieldContentMask() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetMetaDataType() <em>List Of Data Set Meta Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetMetaDataType()
	 * @generated
	 */
	public void testGetListOfDataSetMetaDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataSetMetaDataType(org.opcfoundation.ua._2008._02.types.ListOfDataSetMetaDataType) <em>List Of Data Set Meta Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataSetMetaDataType(org.opcfoundation.ua._2008._02.types.ListOfDataSetMetaDataType)
	 * @generated
	 */
	public void testSetListOfDataSetMetaDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetOrderingType() <em>List Of Data Set Ordering Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetOrderingType()
	 * @generated
	 */
	public void testGetListOfDataSetOrderingType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataSetOrderingType(org.opcfoundation.ua._2008._02.types.ListOfDataSetOrderingType) <em>List Of Data Set Ordering Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataSetOrderingType(org.opcfoundation.ua._2008._02.types.ListOfDataSetOrderingType)
	 * @generated
	 */
	public void testSetListOfDataSetOrderingType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetReaderDataType() <em>List Of Data Set Reader Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetReaderDataType()
	 * @generated
	 */
	public void testGetListOfDataSetReaderDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataSetReaderDataType(org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderDataType) <em>List Of Data Set Reader Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataSetReaderDataType(org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderDataType)
	 * @generated
	 */
	public void testSetListOfDataSetReaderDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetReaderMessageDataType() <em>List Of Data Set Reader Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetReaderMessageDataType()
	 * @generated
	 */
	public void testGetListOfDataSetReaderMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataSetReaderMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderMessageDataType) <em>List Of Data Set Reader Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataSetReaderMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderMessageDataType)
	 * @generated
	 */
	public void testSetListOfDataSetReaderMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetReaderTransportDataType() <em>List Of Data Set Reader Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetReaderTransportDataType()
	 * @generated
	 */
	public void testGetListOfDataSetReaderTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataSetReaderTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderTransportDataType) <em>List Of Data Set Reader Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataSetReaderTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfDataSetReaderTransportDataType)
	 * @generated
	 */
	public void testSetListOfDataSetReaderTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetWriterDataType() <em>List Of Data Set Writer Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetWriterDataType()
	 * @generated
	 */
	public void testGetListOfDataSetWriterDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataSetWriterDataType(org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterDataType) <em>List Of Data Set Writer Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataSetWriterDataType(org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterDataType)
	 * @generated
	 */
	public void testSetListOfDataSetWriterDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetWriterMessageDataType() <em>List Of Data Set Writer Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetWriterMessageDataType()
	 * @generated
	 */
	public void testGetListOfDataSetWriterMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataSetWriterMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterMessageDataType) <em>List Of Data Set Writer Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataSetWriterMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterMessageDataType)
	 * @generated
	 */
	public void testSetListOfDataSetWriterMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetWriterTransportDataType() <em>List Of Data Set Writer Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataSetWriterTransportDataType()
	 * @generated
	 */
	public void testGetListOfDataSetWriterTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataSetWriterTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterTransportDataType) <em>List Of Data Set Writer Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataSetWriterTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfDataSetWriterTransportDataType)
	 * @generated
	 */
	public void testSetListOfDataSetWriterTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataTypeDefinition() <em>List Of Data Type Definition</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataTypeDefinition()
	 * @generated
	 */
	public void testGetListOfDataTypeDefinition() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataTypeDefinition(org.opcfoundation.ua._2008._02.types.ListOfDataTypeDefinition) <em>List Of Data Type Definition</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataTypeDefinition(org.opcfoundation.ua._2008._02.types.ListOfDataTypeDefinition)
	 * @generated
	 */
	public void testSetListOfDataTypeDefinition() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataTypeDescription() <em>List Of Data Type Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataTypeDescription()
	 * @generated
	 */
	public void testGetListOfDataTypeDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataTypeDescription(org.opcfoundation.ua._2008._02.types.ListOfDataTypeDescription) <em>List Of Data Type Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataTypeDescription(org.opcfoundation.ua._2008._02.types.ListOfDataTypeDescription)
	 * @generated
	 */
	public void testSetListOfDataTypeDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataTypeSchemaHeader() <em>List Of Data Type Schema Header</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataTypeSchemaHeader()
	 * @generated
	 */
	public void testGetListOfDataTypeSchemaHeader() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataTypeSchemaHeader(org.opcfoundation.ua._2008._02.types.ListOfDataTypeSchemaHeader) <em>List Of Data Type Schema Header</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataTypeSchemaHeader(org.opcfoundation.ua._2008._02.types.ListOfDataTypeSchemaHeader)
	 * @generated
	 */
	public void testSetListOfDataTypeSchemaHeader() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataValue() <em>List Of Data Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDataValue()
	 * @generated
	 */
	public void testGetListOfDataValue() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataValue(org.opcfoundation.ua._2008._02.types.ListOfDataValue) <em>List Of Data Value</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDataValue(org.opcfoundation.ua._2008._02.types.ListOfDataValue)
	 * @generated
	 */
	public void testSetListOfDataValue() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDateTime() <em>List Of Date Time</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDateTime()
	 * @generated
	 */
	public void testGetListOfDateTime() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDateTime(org.opcfoundation.ua._2008._02.types.ListOfDateTime) <em>List Of Date Time</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDateTime(org.opcfoundation.ua._2008._02.types.ListOfDateTime)
	 * @generated
	 */
	public void testSetListOfDateTime() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDeleteNodesItem() <em>List Of Delete Nodes Item</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDeleteNodesItem()
	 * @generated
	 */
	public void testGetListOfDeleteNodesItem() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDeleteNodesItem(org.opcfoundation.ua._2008._02.types.ListOfDeleteNodesItem) <em>List Of Delete Nodes Item</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDeleteNodesItem(org.opcfoundation.ua._2008._02.types.ListOfDeleteNodesItem)
	 * @generated
	 */
	public void testSetListOfDeleteNodesItem() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDeleteReferencesItem() <em>List Of Delete References Item</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDeleteReferencesItem()
	 * @generated
	 */
	public void testGetListOfDeleteReferencesItem() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDeleteReferencesItem(org.opcfoundation.ua._2008._02.types.ListOfDeleteReferencesItem) <em>List Of Delete References Item</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDeleteReferencesItem(org.opcfoundation.ua._2008._02.types.ListOfDeleteReferencesItem)
	 * @generated
	 */
	public void testSetListOfDeleteReferencesItem() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDiagnosticInfo() <em>List Of Diagnostic Info</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDiagnosticInfo()
	 * @generated
	 */
	public void testGetListOfDiagnosticInfo() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDiagnosticInfo(org.opcfoundation.ua._2008._02.types.ListOfDiagnosticInfo) <em>List Of Diagnostic Info</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDiagnosticInfo(org.opcfoundation.ua._2008._02.types.ListOfDiagnosticInfo)
	 * @generated
	 */
	public void testSetListOfDiagnosticInfo() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDiagnosticsLevel() <em>List Of Diagnostics Level</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDiagnosticsLevel()
	 * @generated
	 */
	public void testGetListOfDiagnosticsLevel() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDiagnosticsLevel(org.opcfoundation.ua._2008._02.types.ListOfDiagnosticsLevel) <em>List Of Diagnostics Level</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDiagnosticsLevel(org.opcfoundation.ua._2008._02.types.ListOfDiagnosticsLevel)
	 * @generated
	 */
	public void testSetListOfDiagnosticsLevel() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDouble() <em>List Of Double</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfDouble()
	 * @generated
	 */
	public void testGetListOfDouble() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDouble(org.opcfoundation.ua._2008._02.types.ListOfDouble) <em>List Of Double</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfDouble(org.opcfoundation.ua._2008._02.types.ListOfDouble)
	 * @generated
	 */
	public void testSetListOfDouble() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointConfiguration() <em>List Of Endpoint Configuration</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointConfiguration()
	 * @generated
	 */
	public void testGetListOfEndpointConfiguration() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfEndpointConfiguration(org.opcfoundation.ua._2008._02.types.ListOfEndpointConfiguration) <em>List Of Endpoint Configuration</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfEndpointConfiguration(org.opcfoundation.ua._2008._02.types.ListOfEndpointConfiguration)
	 * @generated
	 */
	public void testSetListOfEndpointConfiguration() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointDescription() <em>List Of Endpoint Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointDescription()
	 * @generated
	 */
	public void testGetListOfEndpointDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfEndpointDescription(org.opcfoundation.ua._2008._02.types.ListOfEndpointDescription) <em>List Of Endpoint Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfEndpointDescription(org.opcfoundation.ua._2008._02.types.ListOfEndpointDescription)
	 * @generated
	 */
	public void testSetListOfEndpointDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointType() <em>List Of Endpoint Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointType()
	 * @generated
	 */
	public void testGetListOfEndpointType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfEndpointType(org.opcfoundation.ua._2008._02.types.ListOfEndpointType) <em>List Of Endpoint Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfEndpointType(org.opcfoundation.ua._2008._02.types.ListOfEndpointType)
	 * @generated
	 */
	public void testSetListOfEndpointType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointUrlListDataType() <em>List Of Endpoint Url List Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEndpointUrlListDataType()
	 * @generated
	 */
	public void testGetListOfEndpointUrlListDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfEndpointUrlListDataType(org.opcfoundation.ua._2008._02.types.ListOfEndpointUrlListDataType) <em>List Of Endpoint Url List Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfEndpointUrlListDataType(org.opcfoundation.ua._2008._02.types.ListOfEndpointUrlListDataType)
	 * @generated
	 */
	public void testSetListOfEndpointUrlListDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumDefinition() <em>List Of Enum Definition</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumDefinition()
	 * @generated
	 */
	public void testGetListOfEnumDefinition() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfEnumDefinition(org.opcfoundation.ua._2008._02.types.ListOfEnumDefinition) <em>List Of Enum Definition</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfEnumDefinition(org.opcfoundation.ua._2008._02.types.ListOfEnumDefinition)
	 * @generated
	 */
	public void testSetListOfEnumDefinition() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumDescription() <em>List Of Enum Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumDescription()
	 * @generated
	 */
	public void testGetListOfEnumDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfEnumDescription(org.opcfoundation.ua._2008._02.types.ListOfEnumDescription) <em>List Of Enum Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfEnumDescription(org.opcfoundation.ua._2008._02.types.ListOfEnumDescription)
	 * @generated
	 */
	public void testSetListOfEnumDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumField() <em>List Of Enum Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumField()
	 * @generated
	 */
	public void testGetListOfEnumField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfEnumField(org.opcfoundation.ua._2008._02.types.ListOfEnumField) <em>List Of Enum Field</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfEnumField(org.opcfoundation.ua._2008._02.types.ListOfEnumField)
	 * @generated
	 */
	public void testSetListOfEnumField() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumValueType() <em>List Of Enum Value Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEnumValueType()
	 * @generated
	 */
	public void testGetListOfEnumValueType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfEnumValueType(org.opcfoundation.ua._2008._02.types.ListOfEnumValueType) <em>List Of Enum Value Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfEnumValueType(org.opcfoundation.ua._2008._02.types.ListOfEnumValueType)
	 * @generated
	 */
	public void testSetListOfEnumValueType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEventFieldList() <em>List Of Event Field List</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfEventFieldList()
	 * @generated
	 */
	public void testGetListOfEventFieldList() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfEventFieldList(org.opcfoundation.ua._2008._02.types.ListOfEventFieldList) <em>List Of Event Field List</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfEventFieldList(org.opcfoundation.ua._2008._02.types.ListOfEventFieldList)
	 * @generated
	 */
	public void testSetListOfEventFieldList() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfExpandedNodeId() <em>List Of Expanded Node Id</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfExpandedNodeId()
	 * @generated
	 */
	public void testGetListOfExpandedNodeId() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfExpandedNodeId(org.opcfoundation.ua._2008._02.types.ListOfExpandedNodeId) <em>List Of Expanded Node Id</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfExpandedNodeId(org.opcfoundation.ua._2008._02.types.ListOfExpandedNodeId)
	 * @generated
	 */
	public void testSetListOfExpandedNodeId() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfExtensionObject() <em>List Of Extension Object</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfExtensionObject()
	 * @generated
	 */
	public void testGetListOfExtensionObject() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfExtensionObject(org.opcfoundation.ua._2008._02.types.ListOfExtensionObject) <em>List Of Extension Object</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfExtensionObject(org.opcfoundation.ua._2008._02.types.ListOfExtensionObject)
	 * @generated
	 */
	public void testSetListOfExtensionObject() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFieldMetaData() <em>List Of Field Meta Data</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFieldMetaData()
	 * @generated
	 */
	public void testGetListOfFieldMetaData() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfFieldMetaData(org.opcfoundation.ua._2008._02.types.ListOfFieldMetaData) <em>List Of Field Meta Data</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfFieldMetaData(org.opcfoundation.ua._2008._02.types.ListOfFieldMetaData)
	 * @generated
	 */
	public void testSetListOfFieldMetaData() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFieldTargetDataType() <em>List Of Field Target Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFieldTargetDataType()
	 * @generated
	 */
	public void testGetListOfFieldTargetDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfFieldTargetDataType(org.opcfoundation.ua._2008._02.types.ListOfFieldTargetDataType) <em>List Of Field Target Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfFieldTargetDataType(org.opcfoundation.ua._2008._02.types.ListOfFieldTargetDataType)
	 * @generated
	 */
	public void testSetListOfFieldTargetDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFloat() <em>List Of Float</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFloat()
	 * @generated
	 */
	public void testGetListOfFloat() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfFloat(org.opcfoundation.ua._2008._02.types.ListOfFloat) <em>List Of Float</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfFloat(org.opcfoundation.ua._2008._02.types.ListOfFloat)
	 * @generated
	 */
	public void testSetListOfFloat() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFrame() <em>List Of Frame</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfFrame()
	 * @generated
	 */
	public void testGetListOfFrame() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfFrame(org.opcfoundation.ua._2008._02.types.ListOfFrame) <em>List Of Frame</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfFrame(org.opcfoundation.ua._2008._02.types.ListOfFrame)
	 * @generated
	 */
	public void testSetListOfFrame() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfGenericAttributeValue() <em>List Of Generic Attribute Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfGenericAttributeValue()
	 * @generated
	 */
	public void testGetListOfGenericAttributeValue() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfGenericAttributeValue(org.opcfoundation.ua._2008._02.types.ListOfGenericAttributeValue) <em>List Of Generic Attribute Value</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfGenericAttributeValue(org.opcfoundation.ua._2008._02.types.ListOfGenericAttributeValue)
	 * @generated
	 */
	public void testSetListOfGenericAttributeValue() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfGuid() <em>List Of Guid</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfGuid()
	 * @generated
	 */
	public void testGetListOfGuid() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfGuid(org.opcfoundation.ua._2008._02.types.ListOfGuid) <em>List Of Guid</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfGuid(org.opcfoundation.ua._2008._02.types.ListOfGuid)
	 * @generated
	 */
	public void testSetListOfGuid() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryEventFieldList() <em>List Of History Event Field List</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryEventFieldList()
	 * @generated
	 */
	public void testGetListOfHistoryEventFieldList() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfHistoryEventFieldList(org.opcfoundation.ua._2008._02.types.ListOfHistoryEventFieldList) <em>List Of History Event Field List</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfHistoryEventFieldList(org.opcfoundation.ua._2008._02.types.ListOfHistoryEventFieldList)
	 * @generated
	 */
	public void testSetListOfHistoryEventFieldList() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryReadResult() <em>List Of History Read Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryReadResult()
	 * @generated
	 */
	public void testGetListOfHistoryReadResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfHistoryReadResult(org.opcfoundation.ua._2008._02.types.ListOfHistoryReadResult) <em>List Of History Read Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfHistoryReadResult(org.opcfoundation.ua._2008._02.types.ListOfHistoryReadResult)
	 * @generated
	 */
	public void testSetListOfHistoryReadResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryReadValueId() <em>List Of History Read Value Id</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryReadValueId()
	 * @generated
	 */
	public void testGetListOfHistoryReadValueId() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfHistoryReadValueId(org.opcfoundation.ua._2008._02.types.ListOfHistoryReadValueId) <em>List Of History Read Value Id</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfHistoryReadValueId(org.opcfoundation.ua._2008._02.types.ListOfHistoryReadValueId)
	 * @generated
	 */
	public void testSetListOfHistoryReadValueId() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryUpdateResult() <em>List Of History Update Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfHistoryUpdateResult()
	 * @generated
	 */
	public void testGetListOfHistoryUpdateResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfHistoryUpdateResult(org.opcfoundation.ua._2008._02.types.ListOfHistoryUpdateResult) <em>List Of History Update Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfHistoryUpdateResult(org.opcfoundation.ua._2008._02.types.ListOfHistoryUpdateResult)
	 * @generated
	 */
	public void testSetListOfHistoryUpdateResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfIdentityCriteriaType() <em>List Of Identity Criteria Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfIdentityCriteriaType()
	 * @generated
	 */
	public void testGetListOfIdentityCriteriaType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfIdentityCriteriaType(org.opcfoundation.ua._2008._02.types.ListOfIdentityCriteriaType) <em>List Of Identity Criteria Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfIdentityCriteriaType(org.opcfoundation.ua._2008._02.types.ListOfIdentityCriteriaType)
	 * @generated
	 */
	public void testSetListOfIdentityCriteriaType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfIdentityMappingRuleType() <em>List Of Identity Mapping Rule Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfIdentityMappingRuleType()
	 * @generated
	 */
	public void testGetListOfIdentityMappingRuleType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfIdentityMappingRuleType(org.opcfoundation.ua._2008._02.types.ListOfIdentityMappingRuleType) <em>List Of Identity Mapping Rule Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfIdentityMappingRuleType(org.opcfoundation.ua._2008._02.types.ListOfIdentityMappingRuleType)
	 * @generated
	 */
	public void testSetListOfIdentityMappingRuleType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfIdType() <em>List Of Id Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfIdType()
	 * @generated
	 */
	public void testGetListOfIdType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfIdType(org.opcfoundation.ua._2008._02.types.ListOfIdType) <em>List Of Id Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfIdType(org.opcfoundation.ua._2008._02.types.ListOfIdType)
	 * @generated
	 */
	public void testSetListOfIdType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfInt16() <em>List Of Int16</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfInt16()
	 * @generated
	 */
	public void testGetListOfInt16() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfInt16(org.opcfoundation.ua._2008._02.types.ListOfInt16) <em>List Of Int16</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfInt16(org.opcfoundation.ua._2008._02.types.ListOfInt16)
	 * @generated
	 */
	public void testSetListOfInt16() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfInt32() <em>List Of Int32</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfInt32()
	 * @generated
	 */
	public void testGetListOfInt32() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfInt32(org.opcfoundation.ua._2008._02.types.ListOfInt32) <em>List Of Int32</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfInt32(org.opcfoundation.ua._2008._02.types.ListOfInt32)
	 * @generated
	 */
	public void testSetListOfInt32() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfInt64() <em>List Of Int64</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfInt64()
	 * @generated
	 */
	public void testGetListOfInt64() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfInt64(org.opcfoundation.ua._2008._02.types.ListOfInt64) <em>List Of Int64</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfInt64(org.opcfoundation.ua._2008._02.types.ListOfInt64)
	 * @generated
	 */
	public void testSetListOfInt64() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonDataSetMessageContentMask() <em>List Of Json Data Set Message Content Mask</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonDataSetMessageContentMask()
	 * @generated
	 */
	public void testGetListOfJsonDataSetMessageContentMask() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfJsonDataSetMessageContentMask(org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetMessageContentMask) <em>List Of Json Data Set Message Content Mask</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfJsonDataSetMessageContentMask(org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetMessageContentMask)
	 * @generated
	 */
	public void testSetListOfJsonDataSetMessageContentMask() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonDataSetReaderMessageDataType() <em>List Of Json Data Set Reader Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonDataSetReaderMessageDataType()
	 * @generated
	 */
	public void testGetListOfJsonDataSetReaderMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfJsonDataSetReaderMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetReaderMessageDataType) <em>List Of Json Data Set Reader Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfJsonDataSetReaderMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetReaderMessageDataType)
	 * @generated
	 */
	public void testSetListOfJsonDataSetReaderMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonDataSetWriterMessageDataType() <em>List Of Json Data Set Writer Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonDataSetWriterMessageDataType()
	 * @generated
	 */
	public void testGetListOfJsonDataSetWriterMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfJsonDataSetWriterMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetWriterMessageDataType) <em>List Of Json Data Set Writer Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfJsonDataSetWriterMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfJsonDataSetWriterMessageDataType)
	 * @generated
	 */
	public void testSetListOfJsonDataSetWriterMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonNetworkMessageContentMask() <em>List Of Json Network Message Content Mask</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonNetworkMessageContentMask()
	 * @generated
	 */
	public void testGetListOfJsonNetworkMessageContentMask() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfJsonNetworkMessageContentMask(org.opcfoundation.ua._2008._02.types.ListOfJsonNetworkMessageContentMask) <em>List Of Json Network Message Content Mask</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfJsonNetworkMessageContentMask(org.opcfoundation.ua._2008._02.types.ListOfJsonNetworkMessageContentMask)
	 * @generated
	 */
	public void testSetListOfJsonNetworkMessageContentMask() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonWriterGroupMessageDataType() <em>List Of Json Writer Group Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfJsonWriterGroupMessageDataType()
	 * @generated
	 */
	public void testGetListOfJsonWriterGroupMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfJsonWriterGroupMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfJsonWriterGroupMessageDataType) <em>List Of Json Writer Group Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfJsonWriterGroupMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfJsonWriterGroupMessageDataType)
	 * @generated
	 */
	public void testSetListOfJsonWriterGroupMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfKeyValuePair() <em>List Of Key Value Pair</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfKeyValuePair()
	 * @generated
	 */
	public void testGetListOfKeyValuePair() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfKeyValuePair(org.opcfoundation.ua._2008._02.types.ListOfKeyValuePair) <em>List Of Key Value Pair</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfKeyValuePair(org.opcfoundation.ua._2008._02.types.ListOfKeyValuePair)
	 * @generated
	 */
	public void testSetListOfKeyValuePair() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfLocalizedText() <em>List Of Localized Text</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfLocalizedText()
	 * @generated
	 */
	public void testGetListOfLocalizedText() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfLocalizedText(org.opcfoundation.ua._2008._02.types.ListOfLocalizedText) <em>List Of Localized Text</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfLocalizedText(org.opcfoundation.ua._2008._02.types.ListOfLocalizedText)
	 * @generated
	 */
	public void testSetListOfLocalizedText() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfModelChangeStructureDataType() <em>List Of Model Change Structure Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfModelChangeStructureDataType()
	 * @generated
	 */
	public void testGetListOfModelChangeStructureDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfModelChangeStructureDataType(org.opcfoundation.ua._2008._02.types.ListOfModelChangeStructureDataType) <em>List Of Model Change Structure Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfModelChangeStructureDataType(org.opcfoundation.ua._2008._02.types.ListOfModelChangeStructureDataType)
	 * @generated
	 */
	public void testSetListOfModelChangeStructureDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfModificationInfo() <em>List Of Modification Info</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfModificationInfo()
	 * @generated
	 */
	public void testGetListOfModificationInfo() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfModificationInfo(org.opcfoundation.ua._2008._02.types.ListOfModificationInfo) <em>List Of Modification Info</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfModificationInfo(org.opcfoundation.ua._2008._02.types.ListOfModificationInfo)
	 * @generated
	 */
	public void testSetListOfModificationInfo() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemCreateRequest() <em>List Of Monitored Item Create Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemCreateRequest()
	 * @generated
	 */
	public void testGetListOfMonitoredItemCreateRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfMonitoredItemCreateRequest(org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemCreateRequest) <em>List Of Monitored Item Create Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfMonitoredItemCreateRequest(org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemCreateRequest)
	 * @generated
	 */
	public void testSetListOfMonitoredItemCreateRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemCreateResult() <em>List Of Monitored Item Create Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemCreateResult()
	 * @generated
	 */
	public void testGetListOfMonitoredItemCreateResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfMonitoredItemCreateResult(org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemCreateResult) <em>List Of Monitored Item Create Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfMonitoredItemCreateResult(org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemCreateResult)
	 * @generated
	 */
	public void testSetListOfMonitoredItemCreateResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemModifyRequest() <em>List Of Monitored Item Modify Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemModifyRequest()
	 * @generated
	 */
	public void testGetListOfMonitoredItemModifyRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfMonitoredItemModifyRequest(org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemModifyRequest) <em>List Of Monitored Item Modify Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfMonitoredItemModifyRequest(org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemModifyRequest)
	 * @generated
	 */
	public void testSetListOfMonitoredItemModifyRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemModifyResult() <em>List Of Monitored Item Modify Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemModifyResult()
	 * @generated
	 */
	public void testGetListOfMonitoredItemModifyResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfMonitoredItemModifyResult(org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemModifyResult) <em>List Of Monitored Item Modify Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfMonitoredItemModifyResult(org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemModifyResult)
	 * @generated
	 */
	public void testSetListOfMonitoredItemModifyResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemNotification() <em>List Of Monitored Item Notification</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfMonitoredItemNotification()
	 * @generated
	 */
	public void testGetListOfMonitoredItemNotification() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfMonitoredItemNotification(org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemNotification) <em>List Of Monitored Item Notification</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfMonitoredItemNotification(org.opcfoundation.ua._2008._02.types.ListOfMonitoredItemNotification)
	 * @generated
	 */
	public void testSetListOfMonitoredItemNotification() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNetworkAddressDataType() <em>List Of Network Address Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNetworkAddressDataType()
	 * @generated
	 */
	public void testGetListOfNetworkAddressDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfNetworkAddressDataType(org.opcfoundation.ua._2008._02.types.ListOfNetworkAddressDataType) <em>List Of Network Address Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfNetworkAddressDataType(org.opcfoundation.ua._2008._02.types.ListOfNetworkAddressDataType)
	 * @generated
	 */
	public void testSetListOfNetworkAddressDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNetworkAddressUrlDataType() <em>List Of Network Address Url Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNetworkAddressUrlDataType()
	 * @generated
	 */
	public void testGetListOfNetworkAddressUrlDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfNetworkAddressUrlDataType(org.opcfoundation.ua._2008._02.types.ListOfNetworkAddressUrlDataType) <em>List Of Network Address Url Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfNetworkAddressUrlDataType(org.opcfoundation.ua._2008._02.types.ListOfNetworkAddressUrlDataType)
	 * @generated
	 */
	public void testSetListOfNetworkAddressUrlDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNetworkGroupDataType() <em>List Of Network Group Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNetworkGroupDataType()
	 * @generated
	 */
	public void testGetListOfNetworkGroupDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfNetworkGroupDataType(org.opcfoundation.ua._2008._02.types.ListOfNetworkGroupDataType) <em>List Of Network Group Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfNetworkGroupDataType(org.opcfoundation.ua._2008._02.types.ListOfNetworkGroupDataType)
	 * @generated
	 */
	public void testSetListOfNetworkGroupDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNode() <em>List Of Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNode()
	 * @generated
	 */
	public void testGetListOfNode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfNode(org.opcfoundation.ua._2008._02.types.ListOfNode) <em>List Of Node</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfNode(org.opcfoundation.ua._2008._02.types.ListOfNode)
	 * @generated
	 */
	public void testSetListOfNode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNodeId() <em>List Of Node Id</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNodeId()
	 * @generated
	 */
	public void testGetListOfNodeId() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfNodeId(org.opcfoundation.ua._2008._02.types.ListOfNodeId) <em>List Of Node Id</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfNodeId(org.opcfoundation.ua._2008._02.types.ListOfNodeId)
	 * @generated
	 */
	public void testSetListOfNodeId() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNodeReference() <em>List Of Node Reference</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNodeReference()
	 * @generated
	 */
	public void testGetListOfNodeReference() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfNodeReference(org.opcfoundation.ua._2008._02.types.ListOfNodeReference) <em>List Of Node Reference</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfNodeReference(org.opcfoundation.ua._2008._02.types.ListOfNodeReference)
	 * @generated
	 */
	public void testSetListOfNodeReference() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNodeTypeDescription() <em>List Of Node Type Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfNodeTypeDescription()
	 * @generated
	 */
	public void testGetListOfNodeTypeDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfNodeTypeDescription(org.opcfoundation.ua._2008._02.types.ListOfNodeTypeDescription) <em>List Of Node Type Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfNodeTypeDescription(org.opcfoundation.ua._2008._02.types.ListOfNodeTypeDescription)
	 * @generated
	 */
	public void testSetListOfNodeTypeDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOpenFileMode() <em>List Of Open File Mode</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOpenFileMode()
	 * @generated
	 */
	public void testGetListOfOpenFileMode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfOpenFileMode(org.opcfoundation.ua._2008._02.types.ListOfOpenFileMode) <em>List Of Open File Mode</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfOpenFileMode(org.opcfoundation.ua._2008._02.types.ListOfOpenFileMode)
	 * @generated
	 */
	public void testSetListOfOpenFileMode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOptionSet() <em>List Of Option Set</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOptionSet()
	 * @generated
	 */
	public void testGetListOfOptionSet() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfOptionSet(org.opcfoundation.ua._2008._02.types.ListOfOptionSet) <em>List Of Option Set</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfOptionSet(org.opcfoundation.ua._2008._02.types.ListOfOptionSet)
	 * @generated
	 */
	public void testSetListOfOptionSet() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOrientation() <em>List Of Orientation</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOrientation()
	 * @generated
	 */
	public void testGetListOfOrientation() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfOrientation(org.opcfoundation.ua._2008._02.types.ListOfOrientation) <em>List Of Orientation</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfOrientation(org.opcfoundation.ua._2008._02.types.ListOfOrientation)
	 * @generated
	 */
	public void testSetListOfOrientation() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOverrideValueHandling() <em>List Of Override Value Handling</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfOverrideValueHandling()
	 * @generated
	 */
	public void testGetListOfOverrideValueHandling() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfOverrideValueHandling(org.opcfoundation.ua._2008._02.types.ListOfOverrideValueHandling) <em>List Of Override Value Handling</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfOverrideValueHandling(org.opcfoundation.ua._2008._02.types.ListOfOverrideValueHandling)
	 * @generated
	 */
	public void testSetListOfOverrideValueHandling() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfParsingResult() <em>List Of Parsing Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfParsingResult()
	 * @generated
	 */
	public void testGetListOfParsingResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfParsingResult(org.opcfoundation.ua._2008._02.types.ListOfParsingResult) <em>List Of Parsing Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfParsingResult(org.opcfoundation.ua._2008._02.types.ListOfParsingResult)
	 * @generated
	 */
	public void testSetListOfParsingResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedDataItemsDataType() <em>List Of Published Data Items Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedDataItemsDataType()
	 * @generated
	 */
	public void testGetListOfPublishedDataItemsDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPublishedDataItemsDataType(org.opcfoundation.ua._2008._02.types.ListOfPublishedDataItemsDataType) <em>List Of Published Data Items Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPublishedDataItemsDataType(org.opcfoundation.ua._2008._02.types.ListOfPublishedDataItemsDataType)
	 * @generated
	 */
	public void testSetListOfPublishedDataItemsDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedDataSetDataType() <em>List Of Published Data Set Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedDataSetDataType()
	 * @generated
	 */
	public void testGetListOfPublishedDataSetDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPublishedDataSetDataType(org.opcfoundation.ua._2008._02.types.ListOfPublishedDataSetDataType) <em>List Of Published Data Set Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPublishedDataSetDataType(org.opcfoundation.ua._2008._02.types.ListOfPublishedDataSetDataType)
	 * @generated
	 */
	public void testSetListOfPublishedDataSetDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedDataSetSourceDataType() <em>List Of Published Data Set Source Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedDataSetSourceDataType()
	 * @generated
	 */
	public void testGetListOfPublishedDataSetSourceDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPublishedDataSetSourceDataType(org.opcfoundation.ua._2008._02.types.ListOfPublishedDataSetSourceDataType) <em>List Of Published Data Set Source Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPublishedDataSetSourceDataType(org.opcfoundation.ua._2008._02.types.ListOfPublishedDataSetSourceDataType)
	 * @generated
	 */
	public void testSetListOfPublishedDataSetSourceDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedEventsDataType() <em>List Of Published Events Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedEventsDataType()
	 * @generated
	 */
	public void testGetListOfPublishedEventsDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPublishedEventsDataType(org.opcfoundation.ua._2008._02.types.ListOfPublishedEventsDataType) <em>List Of Published Events Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPublishedEventsDataType(org.opcfoundation.ua._2008._02.types.ListOfPublishedEventsDataType)
	 * @generated
	 */
	public void testSetListOfPublishedEventsDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedVariableDataType() <em>List Of Published Variable Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPublishedVariableDataType()
	 * @generated
	 */
	public void testGetListOfPublishedVariableDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPublishedVariableDataType(org.opcfoundation.ua._2008._02.types.ListOfPublishedVariableDataType) <em>List Of Published Variable Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPublishedVariableDataType(org.opcfoundation.ua._2008._02.types.ListOfPublishedVariableDataType)
	 * @generated
	 */
	public void testSetListOfPublishedVariableDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubConfigurationDataType() <em>List Of Pub Sub Configuration Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubConfigurationDataType()
	 * @generated
	 */
	public void testGetListOfPubSubConfigurationDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPubSubConfigurationDataType(org.opcfoundation.ua._2008._02.types.ListOfPubSubConfigurationDataType) <em>List Of Pub Sub Configuration Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPubSubConfigurationDataType(org.opcfoundation.ua._2008._02.types.ListOfPubSubConfigurationDataType)
	 * @generated
	 */
	public void testSetListOfPubSubConfigurationDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubConnectionDataType() <em>List Of Pub Sub Connection Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubConnectionDataType()
	 * @generated
	 */
	public void testGetListOfPubSubConnectionDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPubSubConnectionDataType(org.opcfoundation.ua._2008._02.types.ListOfPubSubConnectionDataType) <em>List Of Pub Sub Connection Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPubSubConnectionDataType(org.opcfoundation.ua._2008._02.types.ListOfPubSubConnectionDataType)
	 * @generated
	 */
	public void testSetListOfPubSubConnectionDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubDiagnosticsCounterClassification() <em>List Of Pub Sub Diagnostics Counter Classification</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubDiagnosticsCounterClassification()
	 * @generated
	 */
	public void testGetListOfPubSubDiagnosticsCounterClassification() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPubSubDiagnosticsCounterClassification(org.opcfoundation.ua._2008._02.types.ListOfPubSubDiagnosticsCounterClassification) <em>List Of Pub Sub Diagnostics Counter Classification</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPubSubDiagnosticsCounterClassification(org.opcfoundation.ua._2008._02.types.ListOfPubSubDiagnosticsCounterClassification)
	 * @generated
	 */
	public void testSetListOfPubSubDiagnosticsCounterClassification() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubGroupDataType() <em>List Of Pub Sub Group Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubGroupDataType()
	 * @generated
	 */
	public void testGetListOfPubSubGroupDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPubSubGroupDataType(org.opcfoundation.ua._2008._02.types.ListOfPubSubGroupDataType) <em>List Of Pub Sub Group Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPubSubGroupDataType(org.opcfoundation.ua._2008._02.types.ListOfPubSubGroupDataType)
	 * @generated
	 */
	public void testSetListOfPubSubGroupDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubState() <em>List Of Pub Sub State</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfPubSubState()
	 * @generated
	 */
	public void testGetListOfPubSubState() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPubSubState(org.opcfoundation.ua._2008._02.types.ListOfPubSubState) <em>List Of Pub Sub State</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfPubSubState(org.opcfoundation.ua._2008._02.types.ListOfPubSubState)
	 * @generated
	 */
	public void testSetListOfPubSubState() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfQualifiedName() <em>List Of Qualified Name</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfQualifiedName()
	 * @generated
	 */
	public void testGetListOfQualifiedName() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfQualifiedName(org.opcfoundation.ua._2008._02.types.ListOfQualifiedName) <em>List Of Qualified Name</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfQualifiedName(org.opcfoundation.ua._2008._02.types.ListOfQualifiedName)
	 * @generated
	 */
	public void testSetListOfQualifiedName() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfQueryDataDescription() <em>List Of Query Data Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfQueryDataDescription()
	 * @generated
	 */
	public void testGetListOfQueryDataDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfQueryDataDescription(org.opcfoundation.ua._2008._02.types.ListOfQueryDataDescription) <em>List Of Query Data Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfQueryDataDescription(org.opcfoundation.ua._2008._02.types.ListOfQueryDataDescription)
	 * @generated
	 */
	public void testSetListOfQueryDataDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfQueryDataSet() <em>List Of Query Data Set</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfQueryDataSet()
	 * @generated
	 */
	public void testGetListOfQueryDataSet() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfQueryDataSet(org.opcfoundation.ua._2008._02.types.ListOfQueryDataSet) <em>List Of Query Data Set</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfQueryDataSet(org.opcfoundation.ua._2008._02.types.ListOfQueryDataSet)
	 * @generated
	 */
	public void testSetListOfQueryDataSet() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRationalNumber() <em>List Of Rational Number</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRationalNumber()
	 * @generated
	 */
	public void testGetListOfRationalNumber() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfRationalNumber(org.opcfoundation.ua._2008._02.types.ListOfRationalNumber) <em>List Of Rational Number</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfRationalNumber(org.opcfoundation.ua._2008._02.types.ListOfRationalNumber)
	 * @generated
	 */
	public void testSetListOfRationalNumber() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReaderGroupDataType() <em>List Of Reader Group Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReaderGroupDataType()
	 * @generated
	 */
	public void testGetListOfReaderGroupDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfReaderGroupDataType(org.opcfoundation.ua._2008._02.types.ListOfReaderGroupDataType) <em>List Of Reader Group Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfReaderGroupDataType(org.opcfoundation.ua._2008._02.types.ListOfReaderGroupDataType)
	 * @generated
	 */
	public void testSetListOfReaderGroupDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReaderGroupMessageDataType() <em>List Of Reader Group Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReaderGroupMessageDataType()
	 * @generated
	 */
	public void testGetListOfReaderGroupMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfReaderGroupMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfReaderGroupMessageDataType) <em>List Of Reader Group Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfReaderGroupMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfReaderGroupMessageDataType)
	 * @generated
	 */
	public void testSetListOfReaderGroupMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReaderGroupTransportDataType() <em>List Of Reader Group Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReaderGroupTransportDataType()
	 * @generated
	 */
	public void testGetListOfReaderGroupTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfReaderGroupTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfReaderGroupTransportDataType) <em>List Of Reader Group Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfReaderGroupTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfReaderGroupTransportDataType)
	 * @generated
	 */
	public void testSetListOfReaderGroupTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReadValueId() <em>List Of Read Value Id</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReadValueId()
	 * @generated
	 */
	public void testGetListOfReadValueId() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfReadValueId(org.opcfoundation.ua._2008._02.types.ListOfReadValueId) <em>List Of Read Value Id</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfReadValueId(org.opcfoundation.ua._2008._02.types.ListOfReadValueId)
	 * @generated
	 */
	public void testSetListOfReadValueId() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRedundantServerDataType() <em>List Of Redundant Server Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRedundantServerDataType()
	 * @generated
	 */
	public void testGetListOfRedundantServerDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfRedundantServerDataType(org.opcfoundation.ua._2008._02.types.ListOfRedundantServerDataType) <em>List Of Redundant Server Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfRedundantServerDataType(org.opcfoundation.ua._2008._02.types.ListOfRedundantServerDataType)
	 * @generated
	 */
	public void testSetListOfRedundantServerDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReferenceDescription() <em>List Of Reference Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReferenceDescription()
	 * @generated
	 */
	public void testGetListOfReferenceDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfReferenceDescription(org.opcfoundation.ua._2008._02.types.ListOfReferenceDescription) <em>List Of Reference Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfReferenceDescription(org.opcfoundation.ua._2008._02.types.ListOfReferenceDescription)
	 * @generated
	 */
	public void testSetListOfReferenceDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReferenceNode() <em>List Of Reference Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfReferenceNode()
	 * @generated
	 */
	public void testGetListOfReferenceNode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfReferenceNode(org.opcfoundation.ua._2008._02.types.ListOfReferenceNode) <em>List Of Reference Node</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfReferenceNode(org.opcfoundation.ua._2008._02.types.ListOfReferenceNode)
	 * @generated
	 */
	public void testSetListOfReferenceNode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRegisteredServer() <em>List Of Registered Server</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRegisteredServer()
	 * @generated
	 */
	public void testGetListOfRegisteredServer() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfRegisteredServer(org.opcfoundation.ua._2008._02.types.ListOfRegisteredServer) <em>List Of Registered Server</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfRegisteredServer(org.opcfoundation.ua._2008._02.types.ListOfRegisteredServer)
	 * @generated
	 */
	public void testSetListOfRegisteredServer() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRelativePathElement() <em>List Of Relative Path Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRelativePathElement()
	 * @generated
	 */
	public void testGetListOfRelativePathElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfRelativePathElement(org.opcfoundation.ua._2008._02.types.ListOfRelativePathElement) <em>List Of Relative Path Element</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfRelativePathElement(org.opcfoundation.ua._2008._02.types.ListOfRelativePathElement)
	 * @generated
	 */
	public void testSetListOfRelativePathElement() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRolePermissionType() <em>List Of Role Permission Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfRolePermissionType()
	 * @generated
	 */
	public void testGetListOfRolePermissionType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfRolePermissionType(org.opcfoundation.ua._2008._02.types.ListOfRolePermissionType) <em>List Of Role Permission Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfRolePermissionType(org.opcfoundation.ua._2008._02.types.ListOfRolePermissionType)
	 * @generated
	 */
	public void testSetListOfRolePermissionType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSamplingIntervalDiagnosticsDataType() <em>List Of Sampling Interval Diagnostics Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSamplingIntervalDiagnosticsDataType()
	 * @generated
	 */
	public void testGetListOfSamplingIntervalDiagnosticsDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSamplingIntervalDiagnosticsDataType(org.opcfoundation.ua._2008._02.types.ListOfSamplingIntervalDiagnosticsDataType) <em>List Of Sampling Interval Diagnostics Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSamplingIntervalDiagnosticsDataType(org.opcfoundation.ua._2008._02.types.ListOfSamplingIntervalDiagnosticsDataType)
	 * @generated
	 */
	public void testSetListOfSamplingIntervalDiagnosticsDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSByte() <em>List Of SByte</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSByte()
	 * @generated
	 */
	public void testGetListOfSByte() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSByte(org.opcfoundation.ua._2008._02.types.ListOfSByte) <em>List Of SByte</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSByte(org.opcfoundation.ua._2008._02.types.ListOfSByte)
	 * @generated
	 */
	public void testSetListOfSByte() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSemanticChangeStructureDataType() <em>List Of Semantic Change Structure Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSemanticChangeStructureDataType()
	 * @generated
	 */
	public void testGetListOfSemanticChangeStructureDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSemanticChangeStructureDataType(org.opcfoundation.ua._2008._02.types.ListOfSemanticChangeStructureDataType) <em>List Of Semantic Change Structure Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSemanticChangeStructureDataType(org.opcfoundation.ua._2008._02.types.ListOfSemanticChangeStructureDataType)
	 * @generated
	 */
	public void testSetListOfSemanticChangeStructureDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfServerOnNetwork() <em>List Of Server On Network</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfServerOnNetwork()
	 * @generated
	 */
	public void testGetListOfServerOnNetwork() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfServerOnNetwork(org.opcfoundation.ua._2008._02.types.ListOfServerOnNetwork) <em>List Of Server On Network</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfServerOnNetwork(org.opcfoundation.ua._2008._02.types.ListOfServerOnNetwork)
	 * @generated
	 */
	public void testSetListOfServerOnNetwork() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSessionDiagnosticsDataType() <em>List Of Session Diagnostics Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSessionDiagnosticsDataType()
	 * @generated
	 */
	public void testGetListOfSessionDiagnosticsDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSessionDiagnosticsDataType(org.opcfoundation.ua._2008._02.types.ListOfSessionDiagnosticsDataType) <em>List Of Session Diagnostics Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSessionDiagnosticsDataType(org.opcfoundation.ua._2008._02.types.ListOfSessionDiagnosticsDataType)
	 * @generated
	 */
	public void testSetListOfSessionDiagnosticsDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSessionSecurityDiagnosticsDataType() <em>List Of Session Security Diagnostics Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSessionSecurityDiagnosticsDataType()
	 * @generated
	 */
	public void testGetListOfSessionSecurityDiagnosticsDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSessionSecurityDiagnosticsDataType(org.opcfoundation.ua._2008._02.types.ListOfSessionSecurityDiagnosticsDataType) <em>List Of Session Security Diagnostics Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSessionSecurityDiagnosticsDataType(org.opcfoundation.ua._2008._02.types.ListOfSessionSecurityDiagnosticsDataType)
	 * @generated
	 */
	public void testSetListOfSessionSecurityDiagnosticsDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSignedSoftwareCertificate() <em>List Of Signed Software Certificate</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSignedSoftwareCertificate()
	 * @generated
	 */
	public void testGetListOfSignedSoftwareCertificate() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSignedSoftwareCertificate(org.opcfoundation.ua._2008._02.types.ListOfSignedSoftwareCertificate) <em>List Of Signed Software Certificate</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSignedSoftwareCertificate(org.opcfoundation.ua._2008._02.types.ListOfSignedSoftwareCertificate)
	 * @generated
	 */
	public void testSetListOfSignedSoftwareCertificate() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSimpleAttributeOperand() <em>List Of Simple Attribute Operand</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSimpleAttributeOperand()
	 * @generated
	 */
	public void testGetListOfSimpleAttributeOperand() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSimpleAttributeOperand(org.opcfoundation.ua._2008._02.types.ListOfSimpleAttributeOperand) <em>List Of Simple Attribute Operand</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSimpleAttributeOperand(org.opcfoundation.ua._2008._02.types.ListOfSimpleAttributeOperand)
	 * @generated
	 */
	public void testSetListOfSimpleAttributeOperand() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSimpleTypeDescription() <em>List Of Simple Type Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSimpleTypeDescription()
	 * @generated
	 */
	public void testGetListOfSimpleTypeDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSimpleTypeDescription(org.opcfoundation.ua._2008._02.types.ListOfSimpleTypeDescription) <em>List Of Simple Type Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSimpleTypeDescription(org.opcfoundation.ua._2008._02.types.ListOfSimpleTypeDescription)
	 * @generated
	 */
	public void testSetListOfSimpleTypeDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStatusCode() <em>List Of Status Code</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStatusCode()
	 * @generated
	 */
	public void testGetListOfStatusCode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfStatusCode(org.opcfoundation.ua._2008._02.types.ListOfStatusCode) <em>List Of Status Code</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfStatusCode(org.opcfoundation.ua._2008._02.types.ListOfStatusCode)
	 * @generated
	 */
	public void testSetListOfStatusCode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStatusResult() <em>List Of Status Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStatusResult()
	 * @generated
	 */
	public void testGetListOfStatusResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfStatusResult(org.opcfoundation.ua._2008._02.types.ListOfStatusResult) <em>List Of Status Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfStatusResult(org.opcfoundation.ua._2008._02.types.ListOfStatusResult)
	 * @generated
	 */
	public void testSetListOfStatusResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfString() <em>List Of String</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfString()
	 * @generated
	 */
	public void testGetListOfString() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfString(org.opcfoundation.ua._2008._02.types.ListOfString) <em>List Of String</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfString(org.opcfoundation.ua._2008._02.types.ListOfString)
	 * @generated
	 */
	public void testSetListOfString() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStructureDefinition() <em>List Of Structure Definition</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStructureDefinition()
	 * @generated
	 */
	public void testGetListOfStructureDefinition() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfStructureDefinition(org.opcfoundation.ua._2008._02.types.ListOfStructureDefinition) <em>List Of Structure Definition</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfStructureDefinition(org.opcfoundation.ua._2008._02.types.ListOfStructureDefinition)
	 * @generated
	 */
	public void testSetListOfStructureDefinition() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStructureDescription() <em>List Of Structure Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStructureDescription()
	 * @generated
	 */
	public void testGetListOfStructureDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfStructureDescription(org.opcfoundation.ua._2008._02.types.ListOfStructureDescription) <em>List Of Structure Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfStructureDescription(org.opcfoundation.ua._2008._02.types.ListOfStructureDescription)
	 * @generated
	 */
	public void testSetListOfStructureDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStructureField() <em>List Of Structure Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfStructureField()
	 * @generated
	 */
	public void testGetListOfStructureField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfStructureField(org.opcfoundation.ua._2008._02.types.ListOfStructureField) <em>List Of Structure Field</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfStructureField(org.opcfoundation.ua._2008._02.types.ListOfStructureField)
	 * @generated
	 */
	public void testSetListOfStructureField() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscribedDataSetDataType() <em>List Of Subscribed Data Set Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscribedDataSetDataType()
	 * @generated
	 */
	public void testGetListOfSubscribedDataSetDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSubscribedDataSetDataType(org.opcfoundation.ua._2008._02.types.ListOfSubscribedDataSetDataType) <em>List Of Subscribed Data Set Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSubscribedDataSetDataType(org.opcfoundation.ua._2008._02.types.ListOfSubscribedDataSetDataType)
	 * @generated
	 */
	public void testSetListOfSubscribedDataSetDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscribedDataSetMirrorDataType() <em>List Of Subscribed Data Set Mirror Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscribedDataSetMirrorDataType()
	 * @generated
	 */
	public void testGetListOfSubscribedDataSetMirrorDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSubscribedDataSetMirrorDataType(org.opcfoundation.ua._2008._02.types.ListOfSubscribedDataSetMirrorDataType) <em>List Of Subscribed Data Set Mirror Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSubscribedDataSetMirrorDataType(org.opcfoundation.ua._2008._02.types.ListOfSubscribedDataSetMirrorDataType)
	 * @generated
	 */
	public void testSetListOfSubscribedDataSetMirrorDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscriptionAcknowledgement() <em>List Of Subscription Acknowledgement</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscriptionAcknowledgement()
	 * @generated
	 */
	public void testGetListOfSubscriptionAcknowledgement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSubscriptionAcknowledgement(org.opcfoundation.ua._2008._02.types.ListOfSubscriptionAcknowledgement) <em>List Of Subscription Acknowledgement</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSubscriptionAcknowledgement(org.opcfoundation.ua._2008._02.types.ListOfSubscriptionAcknowledgement)
	 * @generated
	 */
	public void testSetListOfSubscriptionAcknowledgement() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscriptionDiagnosticsDataType() <em>List Of Subscription Diagnostics Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfSubscriptionDiagnosticsDataType()
	 * @generated
	 */
	public void testGetListOfSubscriptionDiagnosticsDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSubscriptionDiagnosticsDataType(org.opcfoundation.ua._2008._02.types.ListOfSubscriptionDiagnosticsDataType) <em>List Of Subscription Diagnostics Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfSubscriptionDiagnosticsDataType(org.opcfoundation.ua._2008._02.types.ListOfSubscriptionDiagnosticsDataType)
	 * @generated
	 */
	public void testSetListOfSubscriptionDiagnosticsDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTargetVariablesDataType() <em>List Of Target Variables Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTargetVariablesDataType()
	 * @generated
	 */
	public void testGetListOfTargetVariablesDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfTargetVariablesDataType(org.opcfoundation.ua._2008._02.types.ListOfTargetVariablesDataType) <em>List Of Target Variables Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfTargetVariablesDataType(org.opcfoundation.ua._2008._02.types.ListOfTargetVariablesDataType)
	 * @generated
	 */
	public void testSetListOfTargetVariablesDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDCartesianCoordinates() <em>List Of Three DCartesian Coordinates</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDCartesianCoordinates()
	 * @generated
	 */
	public void testGetListOfThreeDCartesianCoordinates() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfThreeDCartesianCoordinates(org.opcfoundation.ua._2008._02.types.ListOfThreeDCartesianCoordinates) <em>List Of Three DCartesian Coordinates</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfThreeDCartesianCoordinates(org.opcfoundation.ua._2008._02.types.ListOfThreeDCartesianCoordinates)
	 * @generated
	 */
	public void testSetListOfThreeDCartesianCoordinates() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDFrame() <em>List Of Three DFrame</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDFrame()
	 * @generated
	 */
	public void testGetListOfThreeDFrame() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfThreeDFrame(org.opcfoundation.ua._2008._02.types.ListOfThreeDFrame) <em>List Of Three DFrame</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfThreeDFrame(org.opcfoundation.ua._2008._02.types.ListOfThreeDFrame)
	 * @generated
	 */
	public void testSetListOfThreeDFrame() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDOrientation() <em>List Of Three DOrientation</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDOrientation()
	 * @generated
	 */
	public void testGetListOfThreeDOrientation() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfThreeDOrientation(org.opcfoundation.ua._2008._02.types.ListOfThreeDOrientation) <em>List Of Three DOrientation</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfThreeDOrientation(org.opcfoundation.ua._2008._02.types.ListOfThreeDOrientation)
	 * @generated
	 */
	public void testSetListOfThreeDOrientation() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDVector() <em>List Of Three DVector</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfThreeDVector()
	 * @generated
	 */
	public void testGetListOfThreeDVector() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfThreeDVector(org.opcfoundation.ua._2008._02.types.ListOfThreeDVector) <em>List Of Three DVector</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfThreeDVector(org.opcfoundation.ua._2008._02.types.ListOfThreeDVector)
	 * @generated
	 */
	public void testSetListOfThreeDVector() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTimeZoneDataType() <em>List Of Time Zone Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTimeZoneDataType()
	 * @generated
	 */
	public void testGetListOfTimeZoneDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfTimeZoneDataType(org.opcfoundation.ua._2008._02.types.ListOfTimeZoneDataType) <em>List Of Time Zone Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfTimeZoneDataType(org.opcfoundation.ua._2008._02.types.ListOfTimeZoneDataType)
	 * @generated
	 */
	public void testSetListOfTimeZoneDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTransferResult() <em>List Of Transfer Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTransferResult()
	 * @generated
	 */
	public void testGetListOfTransferResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfTransferResult(org.opcfoundation.ua._2008._02.types.ListOfTransferResult) <em>List Of Transfer Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfTransferResult(org.opcfoundation.ua._2008._02.types.ListOfTransferResult)
	 * @generated
	 */
	public void testSetListOfTransferResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTrustListDataType() <em>List Of Trust List Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfTrustListDataType()
	 * @generated
	 */
	public void testGetListOfTrustListDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfTrustListDataType(org.opcfoundation.ua._2008._02.types.ListOfTrustListDataType) <em>List Of Trust List Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfTrustListDataType(org.opcfoundation.ua._2008._02.types.ListOfTrustListDataType)
	 * @generated
	 */
	public void testSetListOfTrustListDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUABinaryFileDataType() <em>List Of UA Binary File Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUABinaryFileDataType()
	 * @generated
	 */
	public void testGetListOfUABinaryFileDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUABinaryFileDataType(org.opcfoundation.ua._2008._02.types.ListOfUABinaryFileDataType) <em>List Of UA Binary File Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUABinaryFileDataType(org.opcfoundation.ua._2008._02.types.ListOfUABinaryFileDataType)
	 * @generated
	 */
	public void testSetListOfUABinaryFileDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpDataSetMessageContentMask() <em>List Of Uadp Data Set Message Content Mask</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpDataSetMessageContentMask()
	 * @generated
	 */
	public void testGetListOfUadpDataSetMessageContentMask() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUadpDataSetMessageContentMask(org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetMessageContentMask) <em>List Of Uadp Data Set Message Content Mask</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUadpDataSetMessageContentMask(org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetMessageContentMask)
	 * @generated
	 */
	public void testSetListOfUadpDataSetMessageContentMask() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpDataSetReaderMessageDataType() <em>List Of Uadp Data Set Reader Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpDataSetReaderMessageDataType()
	 * @generated
	 */
	public void testGetListOfUadpDataSetReaderMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUadpDataSetReaderMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetReaderMessageDataType) <em>List Of Uadp Data Set Reader Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUadpDataSetReaderMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetReaderMessageDataType)
	 * @generated
	 */
	public void testSetListOfUadpDataSetReaderMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpDataSetWriterMessageDataType() <em>List Of Uadp Data Set Writer Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpDataSetWriterMessageDataType()
	 * @generated
	 */
	public void testGetListOfUadpDataSetWriterMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUadpDataSetWriterMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetWriterMessageDataType) <em>List Of Uadp Data Set Writer Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUadpDataSetWriterMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfUadpDataSetWriterMessageDataType)
	 * @generated
	 */
	public void testSetListOfUadpDataSetWriterMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpNetworkMessageContentMask() <em>List Of Uadp Network Message Content Mask</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpNetworkMessageContentMask()
	 * @generated
	 */
	public void testGetListOfUadpNetworkMessageContentMask() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUadpNetworkMessageContentMask(org.opcfoundation.ua._2008._02.types.ListOfUadpNetworkMessageContentMask) <em>List Of Uadp Network Message Content Mask</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUadpNetworkMessageContentMask(org.opcfoundation.ua._2008._02.types.ListOfUadpNetworkMessageContentMask)
	 * @generated
	 */
	public void testSetListOfUadpNetworkMessageContentMask() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpWriterGroupMessageDataType() <em>List Of Uadp Writer Group Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUadpWriterGroupMessageDataType()
	 * @generated
	 */
	public void testGetListOfUadpWriterGroupMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUadpWriterGroupMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfUadpWriterGroupMessageDataType) <em>List Of Uadp Writer Group Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUadpWriterGroupMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfUadpWriterGroupMessageDataType)
	 * @generated
	 */
	public void testSetListOfUadpWriterGroupMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUInt16() <em>List Of UInt16</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUInt16()
	 * @generated
	 */
	public void testGetListOfUInt16() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUInt16(org.opcfoundation.ua._2008._02.types.ListOfUInt16) <em>List Of UInt16</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUInt16(org.opcfoundation.ua._2008._02.types.ListOfUInt16)
	 * @generated
	 */
	public void testSetListOfUInt16() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUInt32() <em>List Of UInt32</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUInt32()
	 * @generated
	 */
	public void testGetListOfUInt32() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUInt32(org.opcfoundation.ua._2008._02.types.ListOfUInt32) <em>List Of UInt32</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUInt32(org.opcfoundation.ua._2008._02.types.ListOfUInt32)
	 * @generated
	 */
	public void testSetListOfUInt32() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUInt64() <em>List Of UInt64</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUInt64()
	 * @generated
	 */
	public void testGetListOfUInt64() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUInt64(org.opcfoundation.ua._2008._02.types.ListOfUInt64) <em>List Of UInt64</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUInt64(org.opcfoundation.ua._2008._02.types.ListOfUInt64)
	 * @generated
	 */
	public void testSetListOfUInt64() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUnion() <em>List Of Union</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUnion()
	 * @generated
	 */
	public void testGetListOfUnion() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUnion(org.opcfoundation.ua._2008._02.types.ListOfUnion) <em>List Of Union</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUnion(org.opcfoundation.ua._2008._02.types.ListOfUnion)
	 * @generated
	 */
	public void testSetListOfUnion() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUserTokenPolicy() <em>List Of User Token Policy</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfUserTokenPolicy()
	 * @generated
	 */
	public void testGetListOfUserTokenPolicy() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUserTokenPolicy(org.opcfoundation.ua._2008._02.types.ListOfUserTokenPolicy) <em>List Of User Token Policy</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfUserTokenPolicy(org.opcfoundation.ua._2008._02.types.ListOfUserTokenPolicy)
	 * @generated
	 */
	public void testSetListOfUserTokenPolicy() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfVariant() <em>List Of Variant</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfVariant()
	 * @generated
	 */
	public void testGetListOfVariant() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfVariant(org.opcfoundation.ua._2008._02.types.ListOfVariant) <em>List Of Variant</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfVariant(org.opcfoundation.ua._2008._02.types.ListOfVariant)
	 * @generated
	 */
	public void testSetListOfVariant() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfVector() <em>List Of Vector</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfVector()
	 * @generated
	 */
	public void testGetListOfVector() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfVector(org.opcfoundation.ua._2008._02.types.ListOfVector) <em>List Of Vector</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfVector(org.opcfoundation.ua._2008._02.types.ListOfVector)
	 * @generated
	 */
	public void testSetListOfVector() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriterGroupDataType() <em>List Of Writer Group Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriterGroupDataType()
	 * @generated
	 */
	public void testGetListOfWriterGroupDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfWriterGroupDataType(org.opcfoundation.ua._2008._02.types.ListOfWriterGroupDataType) <em>List Of Writer Group Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfWriterGroupDataType(org.opcfoundation.ua._2008._02.types.ListOfWriterGroupDataType)
	 * @generated
	 */
	public void testSetListOfWriterGroupDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriterGroupMessageDataType() <em>List Of Writer Group Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriterGroupMessageDataType()
	 * @generated
	 */
	public void testGetListOfWriterGroupMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfWriterGroupMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfWriterGroupMessageDataType) <em>List Of Writer Group Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfWriterGroupMessageDataType(org.opcfoundation.ua._2008._02.types.ListOfWriterGroupMessageDataType)
	 * @generated
	 */
	public void testSetListOfWriterGroupMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriterGroupTransportDataType() <em>List Of Writer Group Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriterGroupTransportDataType()
	 * @generated
	 */
	public void testGetListOfWriterGroupTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfWriterGroupTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfWriterGroupTransportDataType) <em>List Of Writer Group Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfWriterGroupTransportDataType(org.opcfoundation.ua._2008._02.types.ListOfWriterGroupTransportDataType)
	 * @generated
	 */
	public void testSetListOfWriterGroupTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriteValue() <em>List Of Write Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfWriteValue()
	 * @generated
	 */
	public void testGetListOfWriteValue() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfWriteValue(org.opcfoundation.ua._2008._02.types.ListOfWriteValue) <em>List Of Write Value</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfWriteValue(org.opcfoundation.ua._2008._02.types.ListOfWriteValue)
	 * @generated
	 */
	public void testSetListOfWriteValue() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfXmlElement() <em>List Of Xml Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getListOfXmlElement()
	 * @generated
	 */
	public void testGetListOfXmlElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfXmlElement(org.opcfoundation.ua._2008._02.types.ListOfXmlElement) <em>List Of Xml Element</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setListOfXmlElement(org.opcfoundation.ua._2008._02.types.ListOfXmlElement)
	 * @generated
	 */
	public void testSetListOfXmlElement() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getLiteralOperand() <em>Literal Operand</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getLiteralOperand()
	 * @generated
	 */
	public void testGetLiteralOperand() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setLiteralOperand(org.opcfoundation.ua._2008._02.types.LiteralOperand) <em>Literal Operand</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setLiteralOperand(org.opcfoundation.ua._2008._02.types.LiteralOperand)
	 * @generated
	 */
	public void testSetLiteralOperand() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getLocaleId() <em>Locale Id</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getLocaleId()
	 * @generated
	 */
	public void testGetLocaleId() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setLocaleId(java.lang.String) <em>Locale Id</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setLocaleId(java.lang.String)
	 * @generated
	 */
	public void testSetLocaleId() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getLocalizedText() <em>Localized Text</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getLocalizedText()
	 * @generated
	 */
	public void testGetLocalizedText() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setLocalizedText(org.opcfoundation.ua._2008._02.types.LocalizedText) <em>Localized Text</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setLocalizedText(org.opcfoundation.ua._2008._02.types.LocalizedText)
	 * @generated
	 */
	public void testSetLocalizedText() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMdnsDiscoveryConfiguration() <em>Mdns Discovery Configuration</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getMdnsDiscoveryConfiguration()
	 * @generated
	 */
	public void testGetMdnsDiscoveryConfiguration() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setMdnsDiscoveryConfiguration(org.opcfoundation.ua._2008._02.types.MdnsDiscoveryConfiguration) <em>Mdns Discovery Configuration</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setMdnsDiscoveryConfiguration(org.opcfoundation.ua._2008._02.types.MdnsDiscoveryConfiguration)
	 * @generated
	 */
	public void testSetMdnsDiscoveryConfiguration() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMessageSecurityMode() <em>Message Security Mode</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getMessageSecurityMode()
	 * @generated
	 */
	public void testGetMessageSecurityMode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setMessageSecurityMode(org.opcfoundation.ua._2008._02.types.MessageSecurityMode) <em>Message Security Mode</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setMessageSecurityMode(org.opcfoundation.ua._2008._02.types.MessageSecurityMode)
	 * @generated
	 */
	public void testSetMessageSecurityMode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMethodAttributes() <em>Method Attributes</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getMethodAttributes()
	 * @generated
	 */
	public void testGetMethodAttributes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setMethodAttributes(org.opcfoundation.ua._2008._02.types.MethodAttributes) <em>Method Attributes</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setMethodAttributes(org.opcfoundation.ua._2008._02.types.MethodAttributes)
	 * @generated
	 */
	public void testSetMethodAttributes() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMethodNode() <em>Method Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getMethodNode()
	 * @generated
	 */
	public void testGetMethodNode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setMethodNode(org.opcfoundation.ua._2008._02.types.MethodNode) <em>Method Node</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setMethodNode(org.opcfoundation.ua._2008._02.types.MethodNode)
	 * @generated
	 */
	public void testSetMethodNode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModelChangeStructureDataType() <em>Model Change Structure Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getModelChangeStructureDataType()
	 * @generated
	 */
	public void testGetModelChangeStructureDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setModelChangeStructureDataType(org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType) <em>Model Change Structure Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setModelChangeStructureDataType(org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType)
	 * @generated
	 */
	public void testSetModelChangeStructureDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModelChangeStructureVerbMask() <em>Model Change Structure Verb Mask</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getModelChangeStructureVerbMask()
	 * @generated
	 */
	public void testGetModelChangeStructureVerbMask() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setModelChangeStructureVerbMask(org.opcfoundation.ua._2008._02.types.ModelChangeStructureVerbMask) <em>Model Change Structure Verb Mask</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setModelChangeStructureVerbMask(org.opcfoundation.ua._2008._02.types.ModelChangeStructureVerbMask)
	 * @generated
	 */
	public void testSetModelChangeStructureVerbMask() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModificationInfo() <em>Modification Info</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getModificationInfo()
	 * @generated
	 */
	public void testGetModificationInfo() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setModificationInfo(org.opcfoundation.ua._2008._02.types.ModificationInfo) <em>Modification Info</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setModificationInfo(org.opcfoundation.ua._2008._02.types.ModificationInfo)
	 * @generated
	 */
	public void testSetModificationInfo() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifyMonitoredItemsRequest() <em>Modify Monitored Items Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifyMonitoredItemsRequest()
	 * @generated
	 */
	public void testGetModifyMonitoredItemsRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setModifyMonitoredItemsRequest(org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest) <em>Modify Monitored Items Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setModifyMonitoredItemsRequest(org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsRequest)
	 * @generated
	 */
	public void testSetModifyMonitoredItemsRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifyMonitoredItemsResponse() <em>Modify Monitored Items Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifyMonitoredItemsResponse()
	 * @generated
	 */
	public void testGetModifyMonitoredItemsResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setModifyMonitoredItemsResponse(org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsResponse) <em>Modify Monitored Items Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setModifyMonitoredItemsResponse(org.opcfoundation.ua._2008._02.types.ModifyMonitoredItemsResponse)
	 * @generated
	 */
	public void testSetModifyMonitoredItemsResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifySubscriptionRequest() <em>Modify Subscription Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifySubscriptionRequest()
	 * @generated
	 */
	public void testGetModifySubscriptionRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setModifySubscriptionRequest(org.opcfoundation.ua._2008._02.types.ModifySubscriptionRequest) <em>Modify Subscription Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setModifySubscriptionRequest(org.opcfoundation.ua._2008._02.types.ModifySubscriptionRequest)
	 * @generated
	 */
	public void testSetModifySubscriptionRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifySubscriptionResponse() <em>Modify Subscription Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getModifySubscriptionResponse()
	 * @generated
	 */
	public void testGetModifySubscriptionResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setModifySubscriptionResponse(org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse) <em>Modify Subscription Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setModifySubscriptionResponse(org.opcfoundation.ua._2008._02.types.ModifySubscriptionResponse)
	 * @generated
	 */
	public void testSetModifySubscriptionResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemCreateRequest() <em>Monitored Item Create Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemCreateRequest()
	 * @generated
	 */
	public void testGetMonitoredItemCreateRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setMonitoredItemCreateRequest(org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest) <em>Monitored Item Create Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setMonitoredItemCreateRequest(org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest)
	 * @generated
	 */
	public void testSetMonitoredItemCreateRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemCreateResult() <em>Monitored Item Create Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemCreateResult()
	 * @generated
	 */
	public void testGetMonitoredItemCreateResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setMonitoredItemCreateResult(org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult) <em>Monitored Item Create Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setMonitoredItemCreateResult(org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult)
	 * @generated
	 */
	public void testSetMonitoredItemCreateResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemModifyRequest() <em>Monitored Item Modify Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemModifyRequest()
	 * @generated
	 */
	public void testGetMonitoredItemModifyRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setMonitoredItemModifyRequest(org.opcfoundation.ua._2008._02.types.MonitoredItemModifyRequest) <em>Monitored Item Modify Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setMonitoredItemModifyRequest(org.opcfoundation.ua._2008._02.types.MonitoredItemModifyRequest)
	 * @generated
	 */
	public void testSetMonitoredItemModifyRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemModifyResult() <em>Monitored Item Modify Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemModifyResult()
	 * @generated
	 */
	public void testGetMonitoredItemModifyResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setMonitoredItemModifyResult(org.opcfoundation.ua._2008._02.types.MonitoredItemModifyResult) <em>Monitored Item Modify Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setMonitoredItemModifyResult(org.opcfoundation.ua._2008._02.types.MonitoredItemModifyResult)
	 * @generated
	 */
	public void testSetMonitoredItemModifyResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemNotification() <em>Monitored Item Notification</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoredItemNotification()
	 * @generated
	 */
	public void testGetMonitoredItemNotification() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setMonitoredItemNotification(org.opcfoundation.ua._2008._02.types.MonitoredItemNotification) <em>Monitored Item Notification</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setMonitoredItemNotification(org.opcfoundation.ua._2008._02.types.MonitoredItemNotification)
	 * @generated
	 */
	public void testSetMonitoredItemNotification() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringFilter() <em>Monitoring Filter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringFilter()
	 * @generated
	 */
	public void testGetMonitoringFilter() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setMonitoringFilter(org.opcfoundation.ua._2008._02.types.MonitoringFilter) <em>Monitoring Filter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setMonitoringFilter(org.opcfoundation.ua._2008._02.types.MonitoringFilter)
	 * @generated
	 */
	public void testSetMonitoringFilter() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringFilterResult() <em>Monitoring Filter Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringFilterResult()
	 * @generated
	 */
	public void testGetMonitoringFilterResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setMonitoringFilterResult(org.opcfoundation.ua._2008._02.types.MonitoringFilterResult) <em>Monitoring Filter Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setMonitoringFilterResult(org.opcfoundation.ua._2008._02.types.MonitoringFilterResult)
	 * @generated
	 */
	public void testSetMonitoringFilterResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringMode() <em>Monitoring Mode</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringMode()
	 * @generated
	 */
	public void testGetMonitoringMode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setMonitoringMode(org.opcfoundation.ua._2008._02.types.MonitoringMode) <em>Monitoring Mode</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setMonitoringMode(org.opcfoundation.ua._2008._02.types.MonitoringMode)
	 * @generated
	 */
	public void testSetMonitoringMode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringParameters() <em>Monitoring Parameters</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getMonitoringParameters()
	 * @generated
	 */
	public void testGetMonitoringParameters() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setMonitoringParameters(org.opcfoundation.ua._2008._02.types.MonitoringParameters) <em>Monitoring Parameters</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setMonitoringParameters(org.opcfoundation.ua._2008._02.types.MonitoringParameters)
	 * @generated
	 */
	public void testSetMonitoringParameters() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNetworkAddressDataType() <em>Network Address Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getNetworkAddressDataType()
	 * @generated
	 */
	public void testGetNetworkAddressDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setNetworkAddressDataType(org.opcfoundation.ua._2008._02.types.NetworkAddressDataType) <em>Network Address Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setNetworkAddressDataType(org.opcfoundation.ua._2008._02.types.NetworkAddressDataType)
	 * @generated
	 */
	public void testSetNetworkAddressDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNetworkAddressUrlDataType() <em>Network Address Url Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getNetworkAddressUrlDataType()
	 * @generated
	 */
	public void testGetNetworkAddressUrlDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setNetworkAddressUrlDataType(org.opcfoundation.ua._2008._02.types.NetworkAddressUrlDataType) <em>Network Address Url Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setNetworkAddressUrlDataType(org.opcfoundation.ua._2008._02.types.NetworkAddressUrlDataType)
	 * @generated
	 */
	public void testSetNetworkAddressUrlDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNetworkGroupDataType() <em>Network Group Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getNetworkGroupDataType()
	 * @generated
	 */
	public void testGetNetworkGroupDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setNetworkGroupDataType(org.opcfoundation.ua._2008._02.types.NetworkGroupDataType) <em>Network Group Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setNetworkGroupDataType(org.opcfoundation.ua._2008._02.types.NetworkGroupDataType)
	 * @generated
	 */
	public void testSetNetworkGroupDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNode() <em>Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getNode()
	 * @generated
	 */
	public void testGetNode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setNode(org.opcfoundation.ua._2008._02.types.Node) <em>Node</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setNode(org.opcfoundation.ua._2008._02.types.Node)
	 * @generated
	 */
	public void testSetNode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeAttributes() <em>Node Attributes</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeAttributes()
	 * @generated
	 */
	public void testGetNodeAttributes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setNodeAttributes(org.opcfoundation.ua._2008._02.types.NodeAttributes) <em>Node Attributes</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setNodeAttributes(org.opcfoundation.ua._2008._02.types.NodeAttributes)
	 * @generated
	 */
	public void testSetNodeAttributes() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeAttributesMask() <em>Node Attributes Mask</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeAttributesMask()
	 * @generated
	 */
	public void testGetNodeAttributesMask() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setNodeAttributesMask(org.opcfoundation.ua._2008._02.types.NodeAttributesMask) <em>Node Attributes Mask</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setNodeAttributesMask(org.opcfoundation.ua._2008._02.types.NodeAttributesMask)
	 * @generated
	 */
	public void testSetNodeAttributesMask() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeClass() <em>Node Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeClass()
	 * @generated
	 */
	public void testGetNodeClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setNodeClass(org.opcfoundation.ua._2008._02.types.NodeClass) <em>Node Class</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setNodeClass(org.opcfoundation.ua._2008._02.types.NodeClass)
	 * @generated
	 */
	public void testSetNodeClass() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeId() <em>Node Id</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeId()
	 * @generated
	 */
	public void testGetNodeId() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setNodeId(org.opcfoundation.ua._2008._02.types.NodeId) <em>Node Id</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setNodeId(org.opcfoundation.ua._2008._02.types.NodeId)
	 * @generated
	 */
	public void testSetNodeId() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeReference() <em>Node Reference</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeReference()
	 * @generated
	 */
	public void testGetNodeReference() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setNodeReference(org.opcfoundation.ua._2008._02.types.NodeReference) <em>Node Reference</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setNodeReference(org.opcfoundation.ua._2008._02.types.NodeReference)
	 * @generated
	 */
	public void testSetNodeReference() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeTypeDescription() <em>Node Type Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getNodeTypeDescription()
	 * @generated
	 */
	public void testGetNodeTypeDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setNodeTypeDescription(org.opcfoundation.ua._2008._02.types.NodeTypeDescription) <em>Node Type Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setNodeTypeDescription(org.opcfoundation.ua._2008._02.types.NodeTypeDescription)
	 * @generated
	 */
	public void testSetNodeTypeDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNormalizedString() <em>Normalized String</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getNormalizedString()
	 * @generated
	 */
	public void testGetNormalizedString() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setNormalizedString(java.lang.String) <em>Normalized String</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setNormalizedString(java.lang.String)
	 * @generated
	 */
	public void testSetNormalizedString() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNotificationData() <em>Notification Data</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getNotificationData()
	 * @generated
	 */
	public void testGetNotificationData() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setNotificationData(org.opcfoundation.ua._2008._02.types.NotificationData) <em>Notification Data</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setNotificationData(org.opcfoundation.ua._2008._02.types.NotificationData)
	 * @generated
	 */
	public void testSetNotificationData() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNotificationMessage() <em>Notification Message</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getNotificationMessage()
	 * @generated
	 */
	public void testGetNotificationMessage() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setNotificationMessage(org.opcfoundation.ua._2008._02.types.NotificationMessage) <em>Notification Message</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setNotificationMessage(org.opcfoundation.ua._2008._02.types.NotificationMessage)
	 * @generated
	 */
	public void testSetNotificationMessage() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getNumericRange() <em>Numeric Range</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getNumericRange()
	 * @generated
	 */
	public void testGetNumericRange() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setNumericRange(java.lang.String) <em>Numeric Range</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setNumericRange(java.lang.String)
	 * @generated
	 */
	public void testSetNumericRange() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectAttributes() <em>Object Attributes</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectAttributes()
	 * @generated
	 */
	public void testGetObjectAttributes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setObjectAttributes(org.opcfoundation.ua._2008._02.types.ObjectAttributes) <em>Object Attributes</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setObjectAttributes(org.opcfoundation.ua._2008._02.types.ObjectAttributes)
	 * @generated
	 */
	public void testSetObjectAttributes() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectNode() <em>Object Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectNode()
	 * @generated
	 */
	public void testGetObjectNode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setObjectNode(org.opcfoundation.ua._2008._02.types.ObjectNode) <em>Object Node</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setObjectNode(org.opcfoundation.ua._2008._02.types.ObjectNode)
	 * @generated
	 */
	public void testSetObjectNode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectTypeAttributes() <em>Object Type Attributes</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectTypeAttributes()
	 * @generated
	 */
	public void testGetObjectTypeAttributes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setObjectTypeAttributes(org.opcfoundation.ua._2008._02.types.ObjectTypeAttributes) <em>Object Type Attributes</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setObjectTypeAttributes(org.opcfoundation.ua._2008._02.types.ObjectTypeAttributes)
	 * @generated
	 */
	public void testSetObjectTypeAttributes() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectTypeNode() <em>Object Type Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getObjectTypeNode()
	 * @generated
	 */
	public void testGetObjectTypeNode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setObjectTypeNode(org.opcfoundation.ua._2008._02.types.ObjectTypeNode) <em>Object Type Node</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setObjectTypeNode(org.opcfoundation.ua._2008._02.types.ObjectTypeNode)
	 * @generated
	 */
	public void testSetObjectTypeNode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOpenFileMode() <em>Open File Mode</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getOpenFileMode()
	 * @generated
	 */
	public void testGetOpenFileMode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setOpenFileMode(org.opcfoundation.ua._2008._02.types.OpenFileMode) <em>Open File Mode</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setOpenFileMode(org.opcfoundation.ua._2008._02.types.OpenFileMode)
	 * @generated
	 */
	public void testSetOpenFileMode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOpenSecureChannelRequest() <em>Open Secure Channel Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getOpenSecureChannelRequest()
	 * @generated
	 */
	public void testGetOpenSecureChannelRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setOpenSecureChannelRequest(org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest) <em>Open Secure Channel Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setOpenSecureChannelRequest(org.opcfoundation.ua._2008._02.types.OpenSecureChannelRequest)
	 * @generated
	 */
	public void testSetOpenSecureChannelRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOpenSecureChannelResponse() <em>Open Secure Channel Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getOpenSecureChannelResponse()
	 * @generated
	 */
	public void testGetOpenSecureChannelResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setOpenSecureChannelResponse(org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse) <em>Open Secure Channel Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setOpenSecureChannelResponse(org.opcfoundation.ua._2008._02.types.OpenSecureChannelResponse)
	 * @generated
	 */
	public void testSetOpenSecureChannelResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOptionSet() <em>Option Set</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getOptionSet()
	 * @generated
	 */
	public void testGetOptionSet() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setOptionSet(org.opcfoundation.ua._2008._02.types.OptionSet) <em>Option Set</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setOptionSet(org.opcfoundation.ua._2008._02.types.OptionSet)
	 * @generated
	 */
	public void testSetOptionSet() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOrientation() <em>Orientation</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getOrientation()
	 * @generated
	 */
	public void testGetOrientation() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setOrientation(org.opcfoundation.ua._2008._02.types.Orientation) <em>Orientation</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setOrientation(org.opcfoundation.ua._2008._02.types.Orientation)
	 * @generated
	 */
	public void testSetOrientation() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getOverrideValueHandling() <em>Override Value Handling</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getOverrideValueHandling()
	 * @generated
	 */
	public void testGetOverrideValueHandling() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setOverrideValueHandling(org.opcfoundation.ua._2008._02.types.OverrideValueHandling) <em>Override Value Handling</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setOverrideValueHandling(org.opcfoundation.ua._2008._02.types.OverrideValueHandling)
	 * @generated
	 */
	public void testSetOverrideValueHandling() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getParsingResult() <em>Parsing Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getParsingResult()
	 * @generated
	 */
	public void testGetParsingResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setParsingResult(org.opcfoundation.ua._2008._02.types.ParsingResult) <em>Parsing Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setParsingResult(org.opcfoundation.ua._2008._02.types.ParsingResult)
	 * @generated
	 */
	public void testSetParsingResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPerformUpdateType() <em>Perform Update Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getPerformUpdateType()
	 * @generated
	 */
	public void testGetPerformUpdateType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setPerformUpdateType(org.opcfoundation.ua._2008._02.types.PerformUpdateType) <em>Perform Update Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setPerformUpdateType(org.opcfoundation.ua._2008._02.types.PerformUpdateType)
	 * @generated
	 */
	public void testSetPerformUpdateType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPermissionType() <em>Permission Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getPermissionType()
	 * @generated
	 */
	public void testGetPermissionType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setPermissionType(long) <em>Permission Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setPermissionType(long)
	 * @generated
	 */
	public void testSetPermissionType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getProgramDiagnostic2DataType() <em>Program Diagnostic2 Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getProgramDiagnostic2DataType()
	 * @generated
	 */
	public void testGetProgramDiagnostic2DataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setProgramDiagnostic2DataType(org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType) <em>Program Diagnostic2 Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setProgramDiagnostic2DataType(org.opcfoundation.ua._2008._02.types.ProgramDiagnostic2DataType)
	 * @generated
	 */
	public void testSetProgramDiagnostic2DataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getProgramDiagnosticDataType() <em>Program Diagnostic Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getProgramDiagnosticDataType()
	 * @generated
	 */
	public void testGetProgramDiagnosticDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setProgramDiagnosticDataType(org.opcfoundation.ua._2008._02.types.ProgramDiagnosticDataType) <em>Program Diagnostic Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setProgramDiagnosticDataType(org.opcfoundation.ua._2008._02.types.ProgramDiagnosticDataType)
	 * @generated
	 */
	public void testSetProgramDiagnosticDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedDataItemsDataType() <em>Published Data Items Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedDataItemsDataType()
	 * @generated
	 */
	public void testGetPublishedDataItemsDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setPublishedDataItemsDataType(org.opcfoundation.ua._2008._02.types.PublishedDataItemsDataType) <em>Published Data Items Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setPublishedDataItemsDataType(org.opcfoundation.ua._2008._02.types.PublishedDataItemsDataType)
	 * @generated
	 */
	public void testSetPublishedDataItemsDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedDataSetDataType() <em>Published Data Set Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedDataSetDataType()
	 * @generated
	 */
	public void testGetPublishedDataSetDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setPublishedDataSetDataType(org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType) <em>Published Data Set Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setPublishedDataSetDataType(org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType)
	 * @generated
	 */
	public void testSetPublishedDataSetDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedDataSetSourceDataType() <em>Published Data Set Source Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedDataSetSourceDataType()
	 * @generated
	 */
	public void testGetPublishedDataSetSourceDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setPublishedDataSetSourceDataType(org.opcfoundation.ua._2008._02.types.PublishedDataSetSourceDataType) <em>Published Data Set Source Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setPublishedDataSetSourceDataType(org.opcfoundation.ua._2008._02.types.PublishedDataSetSourceDataType)
	 * @generated
	 */
	public void testSetPublishedDataSetSourceDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedEventsDataType() <em>Published Events Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedEventsDataType()
	 * @generated
	 */
	public void testGetPublishedEventsDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setPublishedEventsDataType(org.opcfoundation.ua._2008._02.types.PublishedEventsDataType) <em>Published Events Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setPublishedEventsDataType(org.opcfoundation.ua._2008._02.types.PublishedEventsDataType)
	 * @generated
	 */
	public void testSetPublishedEventsDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedVariableDataType() <em>Published Variable Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishedVariableDataType()
	 * @generated
	 */
	public void testGetPublishedVariableDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setPublishedVariableDataType(org.opcfoundation.ua._2008._02.types.PublishedVariableDataType) <em>Published Variable Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setPublishedVariableDataType(org.opcfoundation.ua._2008._02.types.PublishedVariableDataType)
	 * @generated
	 */
	public void testSetPublishedVariableDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishRequest() <em>Publish Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishRequest()
	 * @generated
	 */
	public void testGetPublishRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setPublishRequest(org.opcfoundation.ua._2008._02.types.PublishRequest) <em>Publish Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setPublishRequest(org.opcfoundation.ua._2008._02.types.PublishRequest)
	 * @generated
	 */
	public void testSetPublishRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishResponse() <em>Publish Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getPublishResponse()
	 * @generated
	 */
	public void testGetPublishResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setPublishResponse(org.opcfoundation.ua._2008._02.types.PublishResponse) <em>Publish Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setPublishResponse(org.opcfoundation.ua._2008._02.types.PublishResponse)
	 * @generated
	 */
	public void testSetPublishResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubConfigurationDataType() <em>Pub Sub Configuration Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubConfigurationDataType()
	 * @generated
	 */
	public void testGetPubSubConfigurationDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setPubSubConfigurationDataType(org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType) <em>Pub Sub Configuration Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setPubSubConfigurationDataType(org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType)
	 * @generated
	 */
	public void testSetPubSubConfigurationDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubConnectionDataType() <em>Pub Sub Connection Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubConnectionDataType()
	 * @generated
	 */
	public void testGetPubSubConnectionDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setPubSubConnectionDataType(org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType) <em>Pub Sub Connection Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setPubSubConnectionDataType(org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType)
	 * @generated
	 */
	public void testSetPubSubConnectionDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubDiagnosticsCounterClassification() <em>Pub Sub Diagnostics Counter Classification</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubDiagnosticsCounterClassification()
	 * @generated
	 */
	public void testGetPubSubDiagnosticsCounterClassification() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setPubSubDiagnosticsCounterClassification(org.opcfoundation.ua._2008._02.types.PubSubDiagnosticsCounterClassification) <em>Pub Sub Diagnostics Counter Classification</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setPubSubDiagnosticsCounterClassification(org.opcfoundation.ua._2008._02.types.PubSubDiagnosticsCounterClassification)
	 * @generated
	 */
	public void testSetPubSubDiagnosticsCounterClassification() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubGroupDataType() <em>Pub Sub Group Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubGroupDataType()
	 * @generated
	 */
	public void testGetPubSubGroupDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setPubSubGroupDataType(org.opcfoundation.ua._2008._02.types.PubSubGroupDataType) <em>Pub Sub Group Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setPubSubGroupDataType(org.opcfoundation.ua._2008._02.types.PubSubGroupDataType)
	 * @generated
	 */
	public void testSetPubSubGroupDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubState() <em>Pub Sub State</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getPubSubState()
	 * @generated
	 */
	public void testGetPubSubState() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setPubSubState(org.opcfoundation.ua._2008._02.types.PubSubState) <em>Pub Sub State</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setPubSubState(org.opcfoundation.ua._2008._02.types.PubSubState)
	 * @generated
	 */
	public void testSetPubSubState() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQualifiedName() <em>Qualified Name</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getQualifiedName()
	 * @generated
	 */
	public void testGetQualifiedName() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setQualifiedName(org.opcfoundation.ua._2008._02.types.QualifiedName) <em>Qualified Name</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setQualifiedName(org.opcfoundation.ua._2008._02.types.QualifiedName)
	 * @generated
	 */
	public void testSetQualifiedName() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryDataDescription() <em>Query Data Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryDataDescription()
	 * @generated
	 */
	public void testGetQueryDataDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setQueryDataDescription(org.opcfoundation.ua._2008._02.types.QueryDataDescription) <em>Query Data Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setQueryDataDescription(org.opcfoundation.ua._2008._02.types.QueryDataDescription)
	 * @generated
	 */
	public void testSetQueryDataDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryDataSet() <em>Query Data Set</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryDataSet()
	 * @generated
	 */
	public void testGetQueryDataSet() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setQueryDataSet(org.opcfoundation.ua._2008._02.types.QueryDataSet) <em>Query Data Set</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setQueryDataSet(org.opcfoundation.ua._2008._02.types.QueryDataSet)
	 * @generated
	 */
	public void testSetQueryDataSet() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryFirstRequest() <em>Query First Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryFirstRequest()
	 * @generated
	 */
	public void testGetQueryFirstRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setQueryFirstRequest(org.opcfoundation.ua._2008._02.types.QueryFirstRequest) <em>Query First Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setQueryFirstRequest(org.opcfoundation.ua._2008._02.types.QueryFirstRequest)
	 * @generated
	 */
	public void testSetQueryFirstRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryFirstResponse() <em>Query First Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryFirstResponse()
	 * @generated
	 */
	public void testGetQueryFirstResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setQueryFirstResponse(org.opcfoundation.ua._2008._02.types.QueryFirstResponse) <em>Query First Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setQueryFirstResponse(org.opcfoundation.ua._2008._02.types.QueryFirstResponse)
	 * @generated
	 */
	public void testSetQueryFirstResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryNextRequest() <em>Query Next Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryNextRequest()
	 * @generated
	 */
	public void testGetQueryNextRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setQueryNextRequest(org.opcfoundation.ua._2008._02.types.QueryNextRequest) <em>Query Next Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setQueryNextRequest(org.opcfoundation.ua._2008._02.types.QueryNextRequest)
	 * @generated
	 */
	public void testSetQueryNextRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryNextResponse() <em>Query Next Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getQueryNextResponse()
	 * @generated
	 */
	public void testGetQueryNextResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setQueryNextResponse(org.opcfoundation.ua._2008._02.types.QueryNextResponse) <em>Query Next Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setQueryNextResponse(org.opcfoundation.ua._2008._02.types.QueryNextResponse)
	 * @generated
	 */
	public void testSetQueryNextResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRange() <em>Range</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getRange()
	 * @generated
	 */
	public void testGetRange() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setRange(org.opcfoundation.ua._2008._02.types.Range) <em>Range</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setRange(org.opcfoundation.ua._2008._02.types.Range)
	 * @generated
	 */
	public void testSetRange() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRationalNumber() <em>Rational Number</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getRationalNumber()
	 * @generated
	 */
	public void testGetRationalNumber() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setRationalNumber(org.opcfoundation.ua._2008._02.types.RationalNumber) <em>Rational Number</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setRationalNumber(org.opcfoundation.ua._2008._02.types.RationalNumber)
	 * @generated
	 */
	public void testSetRationalNumber() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadAnnotationDataDetails() <em>Read Annotation Data Details</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadAnnotationDataDetails()
	 * @generated
	 */
	public void testGetReadAnnotationDataDetails() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setReadAnnotationDataDetails(org.opcfoundation.ua._2008._02.types.ReadAnnotationDataDetails) <em>Read Annotation Data Details</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setReadAnnotationDataDetails(org.opcfoundation.ua._2008._02.types.ReadAnnotationDataDetails)
	 * @generated
	 */
	public void testSetReadAnnotationDataDetails() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadAtTimeDetails() <em>Read At Time Details</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadAtTimeDetails()
	 * @generated
	 */
	public void testGetReadAtTimeDetails() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setReadAtTimeDetails(org.opcfoundation.ua._2008._02.types.ReadAtTimeDetails) <em>Read At Time Details</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setReadAtTimeDetails(org.opcfoundation.ua._2008._02.types.ReadAtTimeDetails)
	 * @generated
	 */
	public void testSetReadAtTimeDetails() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReaderGroupDataType() <em>Reader Group Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getReaderGroupDataType()
	 * @generated
	 */
	public void testGetReaderGroupDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setReaderGroupDataType(org.opcfoundation.ua._2008._02.types.ReaderGroupDataType) <em>Reader Group Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setReaderGroupDataType(org.opcfoundation.ua._2008._02.types.ReaderGroupDataType)
	 * @generated
	 */
	public void testSetReaderGroupDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReaderGroupMessageDataType() <em>Reader Group Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getReaderGroupMessageDataType()
	 * @generated
	 */
	public void testGetReaderGroupMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setReaderGroupMessageDataType(org.opcfoundation.ua._2008._02.types.ReaderGroupMessageDataType) <em>Reader Group Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setReaderGroupMessageDataType(org.opcfoundation.ua._2008._02.types.ReaderGroupMessageDataType)
	 * @generated
	 */
	public void testSetReaderGroupMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReaderGroupTransportDataType() <em>Reader Group Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getReaderGroupTransportDataType()
	 * @generated
	 */
	public void testGetReaderGroupTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setReaderGroupTransportDataType(org.opcfoundation.ua._2008._02.types.ReaderGroupTransportDataType) <em>Reader Group Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setReaderGroupTransportDataType(org.opcfoundation.ua._2008._02.types.ReaderGroupTransportDataType)
	 * @generated
	 */
	public void testSetReaderGroupTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadEventDetails() <em>Read Event Details</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadEventDetails()
	 * @generated
	 */
	public void testGetReadEventDetails() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setReadEventDetails(org.opcfoundation.ua._2008._02.types.ReadEventDetails) <em>Read Event Details</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setReadEventDetails(org.opcfoundation.ua._2008._02.types.ReadEventDetails)
	 * @generated
	 */
	public void testSetReadEventDetails() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadProcessedDetails() <em>Read Processed Details</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadProcessedDetails()
	 * @generated
	 */
	public void testGetReadProcessedDetails() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setReadProcessedDetails(org.opcfoundation.ua._2008._02.types.ReadProcessedDetails) <em>Read Processed Details</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setReadProcessedDetails(org.opcfoundation.ua._2008._02.types.ReadProcessedDetails)
	 * @generated
	 */
	public void testSetReadProcessedDetails() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadRawModifiedDetails() <em>Read Raw Modified Details</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadRawModifiedDetails()
	 * @generated
	 */
	public void testGetReadRawModifiedDetails() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setReadRawModifiedDetails(org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails) <em>Read Raw Modified Details</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setReadRawModifiedDetails(org.opcfoundation.ua._2008._02.types.ReadRawModifiedDetails)
	 * @generated
	 */
	public void testSetReadRawModifiedDetails() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadRequest() <em>Read Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadRequest()
	 * @generated
	 */
	public void testGetReadRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setReadRequest(org.opcfoundation.ua._2008._02.types.ReadRequest) <em>Read Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setReadRequest(org.opcfoundation.ua._2008._02.types.ReadRequest)
	 * @generated
	 */
	public void testSetReadRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadResponse() <em>Read Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadResponse()
	 * @generated
	 */
	public void testGetReadResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setReadResponse(org.opcfoundation.ua._2008._02.types.ReadResponse) <em>Read Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setReadResponse(org.opcfoundation.ua._2008._02.types.ReadResponse)
	 * @generated
	 */
	public void testSetReadResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadValueId() <em>Read Value Id</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getReadValueId()
	 * @generated
	 */
	public void testGetReadValueId() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setReadValueId(org.opcfoundation.ua._2008._02.types.ReadValueId) <em>Read Value Id</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setReadValueId(org.opcfoundation.ua._2008._02.types.ReadValueId)
	 * @generated
	 */
	public void testSetReadValueId() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRedundancySupport() <em>Redundancy Support</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getRedundancySupport()
	 * @generated
	 */
	public void testGetRedundancySupport() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setRedundancySupport(org.opcfoundation.ua._2008._02.types.RedundancySupport) <em>Redundancy Support</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setRedundancySupport(org.opcfoundation.ua._2008._02.types.RedundancySupport)
	 * @generated
	 */
	public void testSetRedundancySupport() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRedundantServerDataType() <em>Redundant Server Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getRedundantServerDataType()
	 * @generated
	 */
	public void testGetRedundantServerDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setRedundantServerDataType(org.opcfoundation.ua._2008._02.types.RedundantServerDataType) <em>Redundant Server Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setRedundantServerDataType(org.opcfoundation.ua._2008._02.types.RedundantServerDataType)
	 * @generated
	 */
	public void testSetRedundantServerDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceDescription() <em>Reference Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceDescription()
	 * @generated
	 */
	public void testGetReferenceDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setReferenceDescription(org.opcfoundation.ua._2008._02.types.ReferenceDescription) <em>Reference Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setReferenceDescription(org.opcfoundation.ua._2008._02.types.ReferenceDescription)
	 * @generated
	 */
	public void testSetReferenceDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceNode() <em>Reference Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceNode()
	 * @generated
	 */
	public void testGetReferenceNode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setReferenceNode(org.opcfoundation.ua._2008._02.types.ReferenceNode) <em>Reference Node</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setReferenceNode(org.opcfoundation.ua._2008._02.types.ReferenceNode)
	 * @generated
	 */
	public void testSetReferenceNode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceTypeAttributes() <em>Reference Type Attributes</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceTypeAttributes()
	 * @generated
	 */
	public void testGetReferenceTypeAttributes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setReferenceTypeAttributes(org.opcfoundation.ua._2008._02.types.ReferenceTypeAttributes) <em>Reference Type Attributes</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setReferenceTypeAttributes(org.opcfoundation.ua._2008._02.types.ReferenceTypeAttributes)
	 * @generated
	 */
	public void testSetReferenceTypeAttributes() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceTypeNode() <em>Reference Type Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getReferenceTypeNode()
	 * @generated
	 */
	public void testGetReferenceTypeNode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setReferenceTypeNode(org.opcfoundation.ua._2008._02.types.ReferenceTypeNode) <em>Reference Type Node</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setReferenceTypeNode(org.opcfoundation.ua._2008._02.types.ReferenceTypeNode)
	 * @generated
	 */
	public void testSetReferenceTypeNode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisteredServer() <em>Registered Server</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisteredServer()
	 * @generated
	 */
	public void testGetRegisteredServer() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setRegisteredServer(org.opcfoundation.ua._2008._02.types.RegisteredServer) <em>Registered Server</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setRegisteredServer(org.opcfoundation.ua._2008._02.types.RegisteredServer)
	 * @generated
	 */
	public void testSetRegisteredServer() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterNodesRequest() <em>Register Nodes Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterNodesRequest()
	 * @generated
	 */
	public void testGetRegisterNodesRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setRegisterNodesRequest(org.opcfoundation.ua._2008._02.types.RegisterNodesRequest) <em>Register Nodes Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setRegisterNodesRequest(org.opcfoundation.ua._2008._02.types.RegisterNodesRequest)
	 * @generated
	 */
	public void testSetRegisterNodesRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterNodesResponse() <em>Register Nodes Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterNodesResponse()
	 * @generated
	 */
	public void testGetRegisterNodesResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setRegisterNodesResponse(org.opcfoundation.ua._2008._02.types.RegisterNodesResponse) <em>Register Nodes Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setRegisterNodesResponse(org.opcfoundation.ua._2008._02.types.RegisterNodesResponse)
	 * @generated
	 */
	public void testSetRegisterNodesResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServer2Request() <em>Register Server2 Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServer2Request()
	 * @generated
	 */
	public void testGetRegisterServer2Request() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setRegisterServer2Request(org.opcfoundation.ua._2008._02.types.RegisterServer2Request) <em>Register Server2 Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setRegisterServer2Request(org.opcfoundation.ua._2008._02.types.RegisterServer2Request)
	 * @generated
	 */
	public void testSetRegisterServer2Request() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServer2Response() <em>Register Server2 Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServer2Response()
	 * @generated
	 */
	public void testGetRegisterServer2Response() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setRegisterServer2Response(org.opcfoundation.ua._2008._02.types.RegisterServer2Response) <em>Register Server2 Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setRegisterServer2Response(org.opcfoundation.ua._2008._02.types.RegisterServer2Response)
	 * @generated
	 */
	public void testSetRegisterServer2Response() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServerRequest() <em>Register Server Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServerRequest()
	 * @generated
	 */
	public void testGetRegisterServerRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setRegisterServerRequest(org.opcfoundation.ua._2008._02.types.RegisterServerRequest) <em>Register Server Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setRegisterServerRequest(org.opcfoundation.ua._2008._02.types.RegisterServerRequest)
	 * @generated
	 */
	public void testSetRegisterServerRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServerResponse() <em>Register Server Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getRegisterServerResponse()
	 * @generated
	 */
	public void testGetRegisterServerResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setRegisterServerResponse(org.opcfoundation.ua._2008._02.types.RegisterServerResponse) <em>Register Server Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setRegisterServerResponse(org.opcfoundation.ua._2008._02.types.RegisterServerResponse)
	 * @generated
	 */
	public void testSetRegisterServerResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRelativePath() <em>Relative Path</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getRelativePath()
	 * @generated
	 */
	public void testGetRelativePath() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setRelativePath(org.opcfoundation.ua._2008._02.types.RelativePath) <em>Relative Path</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setRelativePath(org.opcfoundation.ua._2008._02.types.RelativePath)
	 * @generated
	 */
	public void testSetRelativePath() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRelativePathElement() <em>Relative Path Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getRelativePathElement()
	 * @generated
	 */
	public void testGetRelativePathElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setRelativePathElement(org.opcfoundation.ua._2008._02.types.RelativePathElement) <em>Relative Path Element</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setRelativePathElement(org.opcfoundation.ua._2008._02.types.RelativePathElement)
	 * @generated
	 */
	public void testSetRelativePathElement() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRepublishRequest() <em>Republish Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getRepublishRequest()
	 * @generated
	 */
	public void testGetRepublishRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setRepublishRequest(org.opcfoundation.ua._2008._02.types.RepublishRequest) <em>Republish Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setRepublishRequest(org.opcfoundation.ua._2008._02.types.RepublishRequest)
	 * @generated
	 */
	public void testSetRepublishRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRepublishResponse() <em>Republish Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getRepublishResponse()
	 * @generated
	 */
	public void testGetRepublishResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setRepublishResponse(org.opcfoundation.ua._2008._02.types.RepublishResponse) <em>Republish Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setRepublishResponse(org.opcfoundation.ua._2008._02.types.RepublishResponse)
	 * @generated
	 */
	public void testSetRepublishResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRequestHeader() <em>Request Header</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getRequestHeader()
	 * @generated
	 */
	public void testGetRequestHeader() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setRequestHeader(org.opcfoundation.ua._2008._02.types.RequestHeader) <em>Request Header</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setRequestHeader(org.opcfoundation.ua._2008._02.types.RequestHeader)
	 * @generated
	 */
	public void testSetRequestHeader() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getResponseHeader() <em>Response Header</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getResponseHeader()
	 * @generated
	 */
	public void testGetResponseHeader() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setResponseHeader(org.opcfoundation.ua._2008._02.types.ResponseHeader) <em>Response Header</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setResponseHeader(org.opcfoundation.ua._2008._02.types.ResponseHeader)
	 * @generated
	 */
	public void testSetResponseHeader() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRolePermissionType() <em>Role Permission Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getRolePermissionType()
	 * @generated
	 */
	public void testGetRolePermissionType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setRolePermissionType(org.opcfoundation.ua._2008._02.types.RolePermissionType) <em>Role Permission Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setRolePermissionType(org.opcfoundation.ua._2008._02.types.RolePermissionType)
	 * @generated
	 */
	public void testSetRolePermissionType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getRsaEncryptedSecret() <em>Rsa Encrypted Secret</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getRsaEncryptedSecret()
	 * @generated
	 */
	public void testGetRsaEncryptedSecret() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setRsaEncryptedSecret(org.opcfoundation.ua._2008._02.types.Variant) <em>Rsa Encrypted Secret</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setRsaEncryptedSecret(org.opcfoundation.ua._2008._02.types.Variant)
	 * @generated
	 */
	public void testSetRsaEncryptedSecret() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSamplingIntervalDiagnosticsDataType() <em>Sampling Interval Diagnostics Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSamplingIntervalDiagnosticsDataType()
	 * @generated
	 */
	public void testGetSamplingIntervalDiagnosticsDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSamplingIntervalDiagnosticsDataType(org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType) <em>Sampling Interval Diagnostics Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSamplingIntervalDiagnosticsDataType(org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType)
	 * @generated
	 */
	public void testSetSamplingIntervalDiagnosticsDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSByte() <em>SByte</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSByte()
	 * @generated
	 */
	public void testGetSByte() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSByte(java.lang.Byte) <em>SByte</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSByte(java.lang.Byte)
	 * @generated
	 */
	public void testSetSByte() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSecurityTokenRequestType() <em>Security Token Request Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSecurityTokenRequestType()
	 * @generated
	 */
	public void testGetSecurityTokenRequestType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSecurityTokenRequestType(org.opcfoundation.ua._2008._02.types.SecurityTokenRequestType) <em>Security Token Request Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSecurityTokenRequestType(org.opcfoundation.ua._2008._02.types.SecurityTokenRequestType)
	 * @generated
	 */
	public void testSetSecurityTokenRequestType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSemanticChangeStructureDataType() <em>Semantic Change Structure Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSemanticChangeStructureDataType()
	 * @generated
	 */
	public void testGetSemanticChangeStructureDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSemanticChangeStructureDataType(org.opcfoundation.ua._2008._02.types.SemanticChangeStructureDataType) <em>Semantic Change Structure Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSemanticChangeStructureDataType(org.opcfoundation.ua._2008._02.types.SemanticChangeStructureDataType)
	 * @generated
	 */
	public void testSetSemanticChangeStructureDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerDiagnosticsSummaryDataType() <em>Server Diagnostics Summary Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerDiagnosticsSummaryDataType()
	 * @generated
	 */
	public void testGetServerDiagnosticsSummaryDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setServerDiagnosticsSummaryDataType(org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType) <em>Server Diagnostics Summary Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setServerDiagnosticsSummaryDataType(org.opcfoundation.ua._2008._02.types.ServerDiagnosticsSummaryDataType)
	 * @generated
	 */
	public void testSetServerDiagnosticsSummaryDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerOnNetwork() <em>Server On Network</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerOnNetwork()
	 * @generated
	 */
	public void testGetServerOnNetwork() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setServerOnNetwork(org.opcfoundation.ua._2008._02.types.ServerOnNetwork) <em>Server On Network</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setServerOnNetwork(org.opcfoundation.ua._2008._02.types.ServerOnNetwork)
	 * @generated
	 */
	public void testSetServerOnNetwork() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerState() <em>Server State</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerState()
	 * @generated
	 */
	public void testGetServerState() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setServerState(org.opcfoundation.ua._2008._02.types.ServerState) <em>Server State</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setServerState(org.opcfoundation.ua._2008._02.types.ServerState)
	 * @generated
	 */
	public void testSetServerState() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerStatusDataType() <em>Server Status Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getServerStatusDataType()
	 * @generated
	 */
	public void testGetServerStatusDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setServerStatusDataType(org.opcfoundation.ua._2008._02.types.ServerStatusDataType) <em>Server Status Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setServerStatusDataType(org.opcfoundation.ua._2008._02.types.ServerStatusDataType)
	 * @generated
	 */
	public void testSetServerStatusDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServiceCounterDataType() <em>Service Counter Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getServiceCounterDataType()
	 * @generated
	 */
	public void testGetServiceCounterDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setServiceCounterDataType(org.opcfoundation.ua._2008._02.types.ServiceCounterDataType) <em>Service Counter Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setServiceCounterDataType(org.opcfoundation.ua._2008._02.types.ServiceCounterDataType)
	 * @generated
	 */
	public void testSetServiceCounterDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getServiceFault() <em>Service Fault</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getServiceFault()
	 * @generated
	 */
	public void testGetServiceFault() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setServiceFault(org.opcfoundation.ua._2008._02.types.ServiceFault) <em>Service Fault</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setServiceFault(org.opcfoundation.ua._2008._02.types.ServiceFault)
	 * @generated
	 */
	public void testSetServiceFault() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionAuthenticationToken() <em>Session Authentication Token</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionAuthenticationToken()
	 * @generated
	 */
	public void testGetSessionAuthenticationToken() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSessionAuthenticationToken(org.opcfoundation.ua._2008._02.types.NodeId) <em>Session Authentication Token</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSessionAuthenticationToken(org.opcfoundation.ua._2008._02.types.NodeId)
	 * @generated
	 */
	public void testSetSessionAuthenticationToken() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionDiagnosticsDataType() <em>Session Diagnostics Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionDiagnosticsDataType()
	 * @generated
	 */
	public void testGetSessionDiagnosticsDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSessionDiagnosticsDataType(org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType) <em>Session Diagnostics Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSessionDiagnosticsDataType(org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType)
	 * @generated
	 */
	public void testSetSessionDiagnosticsDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionlessInvokeRequestType() <em>Sessionless Invoke Request Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionlessInvokeRequestType()
	 * @generated
	 */
	public void testGetSessionlessInvokeRequestType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSessionlessInvokeRequestType(org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType) <em>Sessionless Invoke Request Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSessionlessInvokeRequestType(org.opcfoundation.ua._2008._02.types.SessionlessInvokeRequestType)
	 * @generated
	 */
	public void testSetSessionlessInvokeRequestType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionlessInvokeResponseType() <em>Sessionless Invoke Response Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionlessInvokeResponseType()
	 * @generated
	 */
	public void testGetSessionlessInvokeResponseType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSessionlessInvokeResponseType(org.opcfoundation.ua._2008._02.types.SessionlessInvokeResponseType) <em>Sessionless Invoke Response Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSessionlessInvokeResponseType(org.opcfoundation.ua._2008._02.types.SessionlessInvokeResponseType)
	 * @generated
	 */
	public void testSetSessionlessInvokeResponseType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionSecurityDiagnosticsDataType() <em>Session Security Diagnostics Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSessionSecurityDiagnosticsDataType()
	 * @generated
	 */
	public void testGetSessionSecurityDiagnosticsDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSessionSecurityDiagnosticsDataType(org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType) <em>Session Security Diagnostics Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSessionSecurityDiagnosticsDataType(org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType)
	 * @generated
	 */
	public void testSetSessionSecurityDiagnosticsDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetMonitoringModeRequest() <em>Set Monitoring Mode Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetMonitoringModeRequest()
	 * @generated
	 */
	public void testGetSetMonitoringModeRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSetMonitoringModeRequest(org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest) <em>Set Monitoring Mode Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSetMonitoringModeRequest(org.opcfoundation.ua._2008._02.types.SetMonitoringModeRequest)
	 * @generated
	 */
	public void testSetSetMonitoringModeRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetMonitoringModeResponse() <em>Set Monitoring Mode Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetMonitoringModeResponse()
	 * @generated
	 */
	public void testGetSetMonitoringModeResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSetMonitoringModeResponse(org.opcfoundation.ua._2008._02.types.SetMonitoringModeResponse) <em>Set Monitoring Mode Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSetMonitoringModeResponse(org.opcfoundation.ua._2008._02.types.SetMonitoringModeResponse)
	 * @generated
	 */
	public void testSetSetMonitoringModeResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetPublishingModeRequest() <em>Set Publishing Mode Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetPublishingModeRequest()
	 * @generated
	 */
	public void testGetSetPublishingModeRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSetPublishingModeRequest(org.opcfoundation.ua._2008._02.types.SetPublishingModeRequest) <em>Set Publishing Mode Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSetPublishingModeRequest(org.opcfoundation.ua._2008._02.types.SetPublishingModeRequest)
	 * @generated
	 */
	public void testSetSetPublishingModeRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetPublishingModeResponse() <em>Set Publishing Mode Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetPublishingModeResponse()
	 * @generated
	 */
	public void testGetSetPublishingModeResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSetPublishingModeResponse(org.opcfoundation.ua._2008._02.types.SetPublishingModeResponse) <em>Set Publishing Mode Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSetPublishingModeResponse(org.opcfoundation.ua._2008._02.types.SetPublishingModeResponse)
	 * @generated
	 */
	public void testSetSetPublishingModeResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetTriggeringRequest() <em>Set Triggering Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetTriggeringRequest()
	 * @generated
	 */
	public void testGetSetTriggeringRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSetTriggeringRequest(org.opcfoundation.ua._2008._02.types.SetTriggeringRequest) <em>Set Triggering Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSetTriggeringRequest(org.opcfoundation.ua._2008._02.types.SetTriggeringRequest)
	 * @generated
	 */
	public void testSetSetTriggeringRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetTriggeringResponse() <em>Set Triggering Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSetTriggeringResponse()
	 * @generated
	 */
	public void testGetSetTriggeringResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSetTriggeringResponse(org.opcfoundation.ua._2008._02.types.SetTriggeringResponse) <em>Set Triggering Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSetTriggeringResponse(org.opcfoundation.ua._2008._02.types.SetTriggeringResponse)
	 * @generated
	 */
	public void testSetSetTriggeringResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSignatureData() <em>Signature Data</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSignatureData()
	 * @generated
	 */
	public void testGetSignatureData() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSignatureData(org.opcfoundation.ua._2008._02.types.SignatureData) <em>Signature Data</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSignatureData(org.opcfoundation.ua._2008._02.types.SignatureData)
	 * @generated
	 */
	public void testSetSignatureData() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSignedSoftwareCertificate() <em>Signed Software Certificate</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSignedSoftwareCertificate()
	 * @generated
	 */
	public void testGetSignedSoftwareCertificate() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSignedSoftwareCertificate(org.opcfoundation.ua._2008._02.types.SignedSoftwareCertificate) <em>Signed Software Certificate</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSignedSoftwareCertificate(org.opcfoundation.ua._2008._02.types.SignedSoftwareCertificate)
	 * @generated
	 */
	public void testSetSignedSoftwareCertificate() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSimpleAttributeOperand() <em>Simple Attribute Operand</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSimpleAttributeOperand()
	 * @generated
	 */
	public void testGetSimpleAttributeOperand() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSimpleAttributeOperand(org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand) <em>Simple Attribute Operand</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSimpleAttributeOperand(org.opcfoundation.ua._2008._02.types.SimpleAttributeOperand)
	 * @generated
	 */
	public void testSetSimpleAttributeOperand() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSimpleTypeDescription() <em>Simple Type Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSimpleTypeDescription()
	 * @generated
	 */
	public void testGetSimpleTypeDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSimpleTypeDescription(org.opcfoundation.ua._2008._02.types.SimpleTypeDescription) <em>Simple Type Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSimpleTypeDescription(org.opcfoundation.ua._2008._02.types.SimpleTypeDescription)
	 * @generated
	 */
	public void testSetSimpleTypeDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStatusChangeNotification() <em>Status Change Notification</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getStatusChangeNotification()
	 * @generated
	 */
	public void testGetStatusChangeNotification() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setStatusChangeNotification(org.opcfoundation.ua._2008._02.types.StatusChangeNotification) <em>Status Change Notification</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setStatusChangeNotification(org.opcfoundation.ua._2008._02.types.StatusChangeNotification)
	 * @generated
	 */
	public void testSetStatusChangeNotification() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStatusCode() <em>Status Code</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getStatusCode()
	 * @generated
	 */
	public void testGetStatusCode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setStatusCode(org.opcfoundation.ua._2008._02.types.StatusCode) <em>Status Code</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setStatusCode(org.opcfoundation.ua._2008._02.types.StatusCode)
	 * @generated
	 */
	public void testSetStatusCode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStatusResult() <em>Status Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getStatusResult()
	 * @generated
	 */
	public void testGetStatusResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setStatusResult(org.opcfoundation.ua._2008._02.types.StatusResult) <em>Status Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setStatusResult(org.opcfoundation.ua._2008._02.types.StatusResult)
	 * @generated
	 */
	public void testSetStatusResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getString() <em>String</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getString()
	 * @generated
	 */
	public void testGetString() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setString(java.lang.String) <em>String</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setString(java.lang.String)
	 * @generated
	 */
	public void testSetString() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureDefinition() <em>Structure Definition</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureDefinition()
	 * @generated
	 */
	public void testGetStructureDefinition() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setStructureDefinition(org.opcfoundation.ua._2008._02.types.StructureDefinition) <em>Structure Definition</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setStructureDefinition(org.opcfoundation.ua._2008._02.types.StructureDefinition)
	 * @generated
	 */
	public void testSetStructureDefinition() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureDescription() <em>Structure Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureDescription()
	 * @generated
	 */
	public void testGetStructureDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setStructureDescription(org.opcfoundation.ua._2008._02.types.StructureDescription) <em>Structure Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setStructureDescription(org.opcfoundation.ua._2008._02.types.StructureDescription)
	 * @generated
	 */
	public void testSetStructureDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureField() <em>Structure Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureField()
	 * @generated
	 */
	public void testGetStructureField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setStructureField(org.opcfoundation.ua._2008._02.types.StructureField) <em>Structure Field</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setStructureField(org.opcfoundation.ua._2008._02.types.StructureField)
	 * @generated
	 */
	public void testSetStructureField() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureType() <em>Structure Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getStructureType()
	 * @generated
	 */
	public void testGetStructureType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setStructureType(org.opcfoundation.ua._2008._02.types.StructureType) <em>Structure Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setStructureType(org.opcfoundation.ua._2008._02.types.StructureType)
	 * @generated
	 */
	public void testSetStructureType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscribedDataSetDataType() <em>Subscribed Data Set Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscribedDataSetDataType()
	 * @generated
	 */
	public void testGetSubscribedDataSetDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSubscribedDataSetDataType(org.opcfoundation.ua._2008._02.types.SubscribedDataSetDataType) <em>Subscribed Data Set Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSubscribedDataSetDataType(org.opcfoundation.ua._2008._02.types.SubscribedDataSetDataType)
	 * @generated
	 */
	public void testSetSubscribedDataSetDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscribedDataSetMirrorDataType() <em>Subscribed Data Set Mirror Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscribedDataSetMirrorDataType()
	 * @generated
	 */
	public void testGetSubscribedDataSetMirrorDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSubscribedDataSetMirrorDataType(org.opcfoundation.ua._2008._02.types.SubscribedDataSetMirrorDataType) <em>Subscribed Data Set Mirror Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSubscribedDataSetMirrorDataType(org.opcfoundation.ua._2008._02.types.SubscribedDataSetMirrorDataType)
	 * @generated
	 */
	public void testSetSubscribedDataSetMirrorDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscriptionAcknowledgement() <em>Subscription Acknowledgement</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscriptionAcknowledgement()
	 * @generated
	 */
	public void testGetSubscriptionAcknowledgement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSubscriptionAcknowledgement(org.opcfoundation.ua._2008._02.types.SubscriptionAcknowledgement) <em>Subscription Acknowledgement</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSubscriptionAcknowledgement(org.opcfoundation.ua._2008._02.types.SubscriptionAcknowledgement)
	 * @generated
	 */
	public void testSetSubscriptionAcknowledgement() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscriptionDiagnosticsDataType() <em>Subscription Diagnostics Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getSubscriptionDiagnosticsDataType()
	 * @generated
	 */
	public void testGetSubscriptionDiagnosticsDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setSubscriptionDiagnosticsDataType(org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType) <em>Subscription Diagnostics Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setSubscriptionDiagnosticsDataType(org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType)
	 * @generated
	 */
	public void testSetSubscriptionDiagnosticsDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTargetVariablesDataType() <em>Target Variables Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getTargetVariablesDataType()
	 * @generated
	 */
	public void testGetTargetVariablesDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setTargetVariablesDataType(org.opcfoundation.ua._2008._02.types.TargetVariablesDataType) <em>Target Variables Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setTargetVariablesDataType(org.opcfoundation.ua._2008._02.types.TargetVariablesDataType)
	 * @generated
	 */
	public void testSetTargetVariablesDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDCartesianCoordinates() <em>Three DCartesian Coordinates</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDCartesianCoordinates()
	 * @generated
	 */
	public void testGetThreeDCartesianCoordinates() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setThreeDCartesianCoordinates(org.opcfoundation.ua._2008._02.types.ThreeDCartesianCoordinates) <em>Three DCartesian Coordinates</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setThreeDCartesianCoordinates(org.opcfoundation.ua._2008._02.types.ThreeDCartesianCoordinates)
	 * @generated
	 */
	public void testSetThreeDCartesianCoordinates() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDFrame() <em>Three DFrame</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDFrame()
	 * @generated
	 */
	public void testGetThreeDFrame() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setThreeDFrame(org.opcfoundation.ua._2008._02.types.ThreeDFrame) <em>Three DFrame</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setThreeDFrame(org.opcfoundation.ua._2008._02.types.ThreeDFrame)
	 * @generated
	 */
	public void testSetThreeDFrame() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDOrientation() <em>Three DOrientation</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDOrientation()
	 * @generated
	 */
	public void testGetThreeDOrientation() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setThreeDOrientation(org.opcfoundation.ua._2008._02.types.ThreeDOrientation) <em>Three DOrientation</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setThreeDOrientation(org.opcfoundation.ua._2008._02.types.ThreeDOrientation)
	 * @generated
	 */
	public void testSetThreeDOrientation() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDVector() <em>Three DVector</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getThreeDVector()
	 * @generated
	 */
	public void testGetThreeDVector() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setThreeDVector(org.opcfoundation.ua._2008._02.types.ThreeDVector) <em>Three DVector</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setThreeDVector(org.opcfoundation.ua._2008._02.types.ThreeDVector)
	 * @generated
	 */
	public void testSetThreeDVector() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTime() <em>Time</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getTime()
	 * @generated
	 */
	public void testGetTime() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setTime(java.lang.String) <em>Time</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setTime(java.lang.String)
	 * @generated
	 */
	public void testSetTime() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTimestampsToReturn() <em>Timestamps To Return</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getTimestampsToReturn()
	 * @generated
	 */
	public void testGetTimestampsToReturn() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setTimestampsToReturn(org.opcfoundation.ua._2008._02.types.TimestampsToReturn) <em>Timestamps To Return</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setTimestampsToReturn(org.opcfoundation.ua._2008._02.types.TimestampsToReturn)
	 * @generated
	 */
	public void testSetTimestampsToReturn() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTimeString() <em>Time String</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getTimeString()
	 * @generated
	 */
	public void testGetTimeString() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setTimeString(java.lang.String) <em>Time String</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setTimeString(java.lang.String)
	 * @generated
	 */
	public void testSetTimeString() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTimeZoneDataType() <em>Time Zone Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getTimeZoneDataType()
	 * @generated
	 */
	public void testGetTimeZoneDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setTimeZoneDataType(org.opcfoundation.ua._2008._02.types.TimeZoneDataType) <em>Time Zone Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setTimeZoneDataType(org.opcfoundation.ua._2008._02.types.TimeZoneDataType)
	 * @generated
	 */
	public void testSetTimeZoneDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTransferResult() <em>Transfer Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getTransferResult()
	 * @generated
	 */
	public void testGetTransferResult() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setTransferResult(org.opcfoundation.ua._2008._02.types.TransferResult) <em>Transfer Result</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setTransferResult(org.opcfoundation.ua._2008._02.types.TransferResult)
	 * @generated
	 */
	public void testSetTransferResult() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTransferSubscriptionsRequest() <em>Transfer Subscriptions Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getTransferSubscriptionsRequest()
	 * @generated
	 */
	public void testGetTransferSubscriptionsRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setTransferSubscriptionsRequest(org.opcfoundation.ua._2008._02.types.TransferSubscriptionsRequest) <em>Transfer Subscriptions Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setTransferSubscriptionsRequest(org.opcfoundation.ua._2008._02.types.TransferSubscriptionsRequest)
	 * @generated
	 */
	public void testSetTransferSubscriptionsRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTransferSubscriptionsResponse() <em>Transfer Subscriptions Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getTransferSubscriptionsResponse()
	 * @generated
	 */
	public void testGetTransferSubscriptionsResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setTransferSubscriptionsResponse(org.opcfoundation.ua._2008._02.types.TransferSubscriptionsResponse) <em>Transfer Subscriptions Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setTransferSubscriptionsResponse(org.opcfoundation.ua._2008._02.types.TransferSubscriptionsResponse)
	 * @generated
	 */
	public void testSetTransferSubscriptionsResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTranslateBrowsePathsToNodeIdsRequest() <em>Translate Browse Paths To Node Ids Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getTranslateBrowsePathsToNodeIdsRequest()
	 * @generated
	 */
	public void testGetTranslateBrowsePathsToNodeIdsRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setTranslateBrowsePathsToNodeIdsRequest(org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsRequest) <em>Translate Browse Paths To Node Ids Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setTranslateBrowsePathsToNodeIdsRequest(org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsRequest)
	 * @generated
	 */
	public void testSetTranslateBrowsePathsToNodeIdsRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTranslateBrowsePathsToNodeIdsResponse() <em>Translate Browse Paths To Node Ids Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getTranslateBrowsePathsToNodeIdsResponse()
	 * @generated
	 */
	public void testGetTranslateBrowsePathsToNodeIdsResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setTranslateBrowsePathsToNodeIdsResponse(org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsResponse) <em>Translate Browse Paths To Node Ids Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setTranslateBrowsePathsToNodeIdsResponse(org.opcfoundation.ua._2008._02.types.TranslateBrowsePathsToNodeIdsResponse)
	 * @generated
	 */
	public void testSetTranslateBrowsePathsToNodeIdsResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTrustListDataType() <em>Trust List Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getTrustListDataType()
	 * @generated
	 */
	public void testGetTrustListDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setTrustListDataType(org.opcfoundation.ua._2008._02.types.TrustListDataType) <em>Trust List Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setTrustListDataType(org.opcfoundation.ua._2008._02.types.TrustListDataType)
	 * @generated
	 */
	public void testSetTrustListDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTrustListMasks() <em>Trust List Masks</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getTrustListMasks()
	 * @generated
	 */
	public void testGetTrustListMasks() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setTrustListMasks(org.opcfoundation.ua._2008._02.types.TrustListMasks) <em>Trust List Masks</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setTrustListMasks(org.opcfoundation.ua._2008._02.types.TrustListMasks)
	 * @generated
	 */
	public void testSetTrustListMasks() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getTypeNode() <em>Type Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getTypeNode()
	 * @generated
	 */
	public void testGetTypeNode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setTypeNode(org.opcfoundation.ua._2008._02.types.TypeNode) <em>Type Node</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setTypeNode(org.opcfoundation.ua._2008._02.types.TypeNode)
	 * @generated
	 */
	public void testSetTypeNode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUABinaryFileDataType() <em>UA Binary File Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUABinaryFileDataType()
	 * @generated
	 */
	public void testGetUABinaryFileDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUABinaryFileDataType(org.opcfoundation.ua._2008._02.types.UABinaryFileDataType) <em>UA Binary File Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUABinaryFileDataType(org.opcfoundation.ua._2008._02.types.UABinaryFileDataType)
	 * @generated
	 */
	public void testSetUABinaryFileDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpDataSetMessageContentMask() <em>Uadp Data Set Message Content Mask</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpDataSetMessageContentMask()
	 * @generated
	 */
	public void testGetUadpDataSetMessageContentMask() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUadpDataSetMessageContentMask(long) <em>Uadp Data Set Message Content Mask</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUadpDataSetMessageContentMask(long)
	 * @generated
	 */
	public void testSetUadpDataSetMessageContentMask() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpDataSetReaderMessageDataType() <em>Uadp Data Set Reader Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpDataSetReaderMessageDataType()
	 * @generated
	 */
	public void testGetUadpDataSetReaderMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUadpDataSetReaderMessageDataType(org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType) <em>Uadp Data Set Reader Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUadpDataSetReaderMessageDataType(org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType)
	 * @generated
	 */
	public void testSetUadpDataSetReaderMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpDataSetWriterMessageDataType() <em>Uadp Data Set Writer Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpDataSetWriterMessageDataType()
	 * @generated
	 */
	public void testGetUadpDataSetWriterMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUadpDataSetWriterMessageDataType(org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType) <em>Uadp Data Set Writer Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUadpDataSetWriterMessageDataType(org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType)
	 * @generated
	 */
	public void testSetUadpDataSetWriterMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpNetworkMessageContentMask() <em>Uadp Network Message Content Mask</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpNetworkMessageContentMask()
	 * @generated
	 */
	public void testGetUadpNetworkMessageContentMask() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUadpNetworkMessageContentMask(long) <em>Uadp Network Message Content Mask</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUadpNetworkMessageContentMask(long)
	 * @generated
	 */
	public void testSetUadpNetworkMessageContentMask() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpWriterGroupMessageDataType() <em>Uadp Writer Group Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUadpWriterGroupMessageDataType()
	 * @generated
	 */
	public void testGetUadpWriterGroupMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUadpWriterGroupMessageDataType(org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType) <em>Uadp Writer Group Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUadpWriterGroupMessageDataType(org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType)
	 * @generated
	 */
	public void testSetUadpWriterGroupMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUInt16() <em>UInt16</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUInt16()
	 * @generated
	 */
	public void testGetUInt16() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUInt16(java.lang.Integer) <em>UInt16</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUInt16(java.lang.Integer)
	 * @generated
	 */
	public void testSetUInt16() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUInt32() <em>UInt32</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUInt32()
	 * @generated
	 */
	public void testGetUInt32() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUInt32(java.lang.Long) <em>UInt32</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUInt32(java.lang.Long)
	 * @generated
	 */
	public void testSetUInt32() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUInt64() <em>UInt64</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUInt64()
	 * @generated
	 */
	public void testGetUInt64() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUInt64(java.math.BigInteger) <em>UInt64</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUInt64(java.math.BigInteger)
	 * @generated
	 */
	public void testSetUInt64() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUnion() <em>Union</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUnion()
	 * @generated
	 */
	public void testGetUnion() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUnion(org.opcfoundation.ua._2008._02.types.Union) <em>Union</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUnion(org.opcfoundation.ua._2008._02.types.Union)
	 * @generated
	 */
	public void testSetUnion() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUnregisterNodesRequest() <em>Unregister Nodes Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUnregisterNodesRequest()
	 * @generated
	 */
	public void testGetUnregisterNodesRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUnregisterNodesRequest(org.opcfoundation.ua._2008._02.types.UnregisterNodesRequest) <em>Unregister Nodes Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUnregisterNodesRequest(org.opcfoundation.ua._2008._02.types.UnregisterNodesRequest)
	 * @generated
	 */
	public void testSetUnregisterNodesRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUnregisterNodesResponse() <em>Unregister Nodes Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUnregisterNodesResponse()
	 * @generated
	 */
	public void testGetUnregisterNodesResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUnregisterNodesResponse(org.opcfoundation.ua._2008._02.types.UnregisterNodesResponse) <em>Unregister Nodes Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUnregisterNodesResponse(org.opcfoundation.ua._2008._02.types.UnregisterNodesResponse)
	 * @generated
	 */
	public void testSetUnregisterNodesResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUpdateDataDetails() <em>Update Data Details</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUpdateDataDetails()
	 * @generated
	 */
	public void testGetUpdateDataDetails() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUpdateDataDetails(org.opcfoundation.ua._2008._02.types.UpdateDataDetails) <em>Update Data Details</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUpdateDataDetails(org.opcfoundation.ua._2008._02.types.UpdateDataDetails)
	 * @generated
	 */
	public void testSetUpdateDataDetails() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUpdateEventDetails() <em>Update Event Details</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUpdateEventDetails()
	 * @generated
	 */
	public void testGetUpdateEventDetails() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUpdateEventDetails(org.opcfoundation.ua._2008._02.types.UpdateEventDetails) <em>Update Event Details</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUpdateEventDetails(org.opcfoundation.ua._2008._02.types.UpdateEventDetails)
	 * @generated
	 */
	public void testSetUpdateEventDetails() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUpdateStructureDataDetails() <em>Update Structure Data Details</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUpdateStructureDataDetails()
	 * @generated
	 */
	public void testGetUpdateStructureDataDetails() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUpdateStructureDataDetails(org.opcfoundation.ua._2008._02.types.UpdateStructureDataDetails) <em>Update Structure Data Details</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUpdateStructureDataDetails(org.opcfoundation.ua._2008._02.types.UpdateStructureDataDetails)
	 * @generated
	 */
	public void testSetUpdateStructureDataDetails() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserIdentityToken() <em>User Identity Token</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserIdentityToken()
	 * @generated
	 */
	public void testGetUserIdentityToken() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUserIdentityToken(org.opcfoundation.ua._2008._02.types.UserIdentityToken) <em>User Identity Token</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUserIdentityToken(org.opcfoundation.ua._2008._02.types.UserIdentityToken)
	 * @generated
	 */
	public void testSetUserIdentityToken() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserNameIdentityToken() <em>User Name Identity Token</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserNameIdentityToken()
	 * @generated
	 */
	public void testGetUserNameIdentityToken() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUserNameIdentityToken(org.opcfoundation.ua._2008._02.types.UserNameIdentityToken) <em>User Name Identity Token</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUserNameIdentityToken(org.opcfoundation.ua._2008._02.types.UserNameIdentityToken)
	 * @generated
	 */
	public void testSetUserNameIdentityToken() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserTokenPolicy() <em>User Token Policy</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserTokenPolicy()
	 * @generated
	 */
	public void testGetUserTokenPolicy() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUserTokenPolicy(org.opcfoundation.ua._2008._02.types.UserTokenPolicy) <em>User Token Policy</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUserTokenPolicy(org.opcfoundation.ua._2008._02.types.UserTokenPolicy)
	 * @generated
	 */
	public void testSetUserTokenPolicy() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserTokenType() <em>User Token Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUserTokenType()
	 * @generated
	 */
	public void testGetUserTokenType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUserTokenType(org.opcfoundation.ua._2008._02.types.UserTokenType) <em>User Token Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUserTokenType(org.opcfoundation.ua._2008._02.types.UserTokenType)
	 * @generated
	 */
	public void testSetUserTokenType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getUtcTime() <em>Utc Time</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getUtcTime()
	 * @generated
	 */
	public void testGetUtcTime() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setUtcTime(javax.xml.datatype.XMLGregorianCalendar) <em>Utc Time</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setUtcTime(javax.xml.datatype.XMLGregorianCalendar)
	 * @generated
	 */
	public void testSetUtcTime() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableAttributes() <em>Variable Attributes</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableAttributes()
	 * @generated
	 */
	public void testGetVariableAttributes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setVariableAttributes(org.opcfoundation.ua._2008._02.types.VariableAttributes) <em>Variable Attributes</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setVariableAttributes(org.opcfoundation.ua._2008._02.types.VariableAttributes)
	 * @generated
	 */
	public void testSetVariableAttributes() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableNode() <em>Variable Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableNode()
	 * @generated
	 */
	public void testGetVariableNode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setVariableNode(org.opcfoundation.ua._2008._02.types.VariableNode) <em>Variable Node</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setVariableNode(org.opcfoundation.ua._2008._02.types.VariableNode)
	 * @generated
	 */
	public void testSetVariableNode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableTypeAttributes() <em>Variable Type Attributes</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableTypeAttributes()
	 * @generated
	 */
	public void testGetVariableTypeAttributes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setVariableTypeAttributes(org.opcfoundation.ua._2008._02.types.VariableTypeAttributes) <em>Variable Type Attributes</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setVariableTypeAttributes(org.opcfoundation.ua._2008._02.types.VariableTypeAttributes)
	 * @generated
	 */
	public void testSetVariableTypeAttributes() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableTypeNode() <em>Variable Type Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariableTypeNode()
	 * @generated
	 */
	public void testGetVariableTypeNode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setVariableTypeNode(org.opcfoundation.ua._2008._02.types.VariableTypeNode) <em>Variable Type Node</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setVariableTypeNode(org.opcfoundation.ua._2008._02.types.VariableTypeNode)
	 * @generated
	 */
	public void testSetVariableTypeNode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariant() <em>Variant</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getVariant()
	 * @generated
	 */
	public void testGetVariant() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setVariant(org.opcfoundation.ua._2008._02.types.Variant) <em>Variant</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setVariant(org.opcfoundation.ua._2008._02.types.Variant)
	 * @generated
	 */
	public void testSetVariant() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVector() <em>Vector</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getVector()
	 * @generated
	 */
	public void testGetVector() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setVector(org.opcfoundation.ua._2008._02.types.Vector) <em>Vector</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setVector(org.opcfoundation.ua._2008._02.types.Vector)
	 * @generated
	 */
	public void testSetVector() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getVersionTime() <em>Version Time</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getVersionTime()
	 * @generated
	 */
	public void testGetVersionTime() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setVersionTime(long) <em>Version Time</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setVersionTime(long)
	 * @generated
	 */
	public void testSetVersionTime() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getViewAttributes() <em>View Attributes</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getViewAttributes()
	 * @generated
	 */
	public void testGetViewAttributes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setViewAttributes(org.opcfoundation.ua._2008._02.types.ViewAttributes) <em>View Attributes</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setViewAttributes(org.opcfoundation.ua._2008._02.types.ViewAttributes)
	 * @generated
	 */
	public void testSetViewAttributes() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getViewDescription() <em>View Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getViewDescription()
	 * @generated
	 */
	public void testGetViewDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setViewDescription(org.opcfoundation.ua._2008._02.types.ViewDescription) <em>View Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setViewDescription(org.opcfoundation.ua._2008._02.types.ViewDescription)
	 * @generated
	 */
	public void testSetViewDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getViewNode() <em>View Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getViewNode()
	 * @generated
	 */
	public void testGetViewNode() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setViewNode(org.opcfoundation.ua._2008._02.types.ViewNode) <em>View Node</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setViewNode(org.opcfoundation.ua._2008._02.types.ViewNode)
	 * @generated
	 */
	public void testSetViewNode() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriteRequest() <em>Write Request</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriteRequest()
	 * @generated
	 */
	public void testGetWriteRequest() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setWriteRequest(org.opcfoundation.ua._2008._02.types.WriteRequest) <em>Write Request</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setWriteRequest(org.opcfoundation.ua._2008._02.types.WriteRequest)
	 * @generated
	 */
	public void testSetWriteRequest() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriteResponse() <em>Write Response</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriteResponse()
	 * @generated
	 */
	public void testGetWriteResponse() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setWriteResponse(org.opcfoundation.ua._2008._02.types.WriteResponse) <em>Write Response</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setWriteResponse(org.opcfoundation.ua._2008._02.types.WriteResponse)
	 * @generated
	 */
	public void testSetWriteResponse() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriterGroupDataType() <em>Writer Group Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriterGroupDataType()
	 * @generated
	 */
	public void testGetWriterGroupDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setWriterGroupDataType(org.opcfoundation.ua._2008._02.types.WriterGroupDataType) <em>Writer Group Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setWriterGroupDataType(org.opcfoundation.ua._2008._02.types.WriterGroupDataType)
	 * @generated
	 */
	public void testSetWriterGroupDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriterGroupMessageDataType() <em>Writer Group Message Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriterGroupMessageDataType()
	 * @generated
	 */
	public void testGetWriterGroupMessageDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setWriterGroupMessageDataType(org.opcfoundation.ua._2008._02.types.WriterGroupMessageDataType) <em>Writer Group Message Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setWriterGroupMessageDataType(org.opcfoundation.ua._2008._02.types.WriterGroupMessageDataType)
	 * @generated
	 */
	public void testSetWriterGroupMessageDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriterGroupTransportDataType() <em>Writer Group Transport Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriterGroupTransportDataType()
	 * @generated
	 */
	public void testGetWriterGroupTransportDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setWriterGroupTransportDataType(org.opcfoundation.ua._2008._02.types.WriterGroupTransportDataType) <em>Writer Group Transport Data Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setWriterGroupTransportDataType(org.opcfoundation.ua._2008._02.types.WriterGroupTransportDataType)
	 * @generated
	 */
	public void testSetWriterGroupTransportDataType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriteValue() <em>Write Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getWriteValue()
	 * @generated
	 */
	public void testGetWriteValue() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setWriteValue(org.opcfoundation.ua._2008._02.types.WriteValue) <em>Write Value</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setWriteValue(org.opcfoundation.ua._2008._02.types.WriteValue)
	 * @generated
	 */
	public void testSetWriteValue() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getX509IdentityToken() <em>X509 Identity Token</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getX509IdentityToken()
	 * @generated
	 */
	public void testGetX509IdentityToken() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setX509IdentityToken(org.opcfoundation.ua._2008._02.types.X509IdentityToken) <em>X509 Identity Token</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setX509IdentityToken(org.opcfoundation.ua._2008._02.types.X509IdentityToken)
	 * @generated
	 */
	public void testSetX509IdentityToken() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#getXVType() <em>XV Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#getXVType()
	 * @generated
	 */
	public void testGetXVType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.opcfoundation.ua._2008._02.types.DocumentRoot#setXVType(org.opcfoundation.ua._2008._02.types.XVType) <em>XV Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opcfoundation.ua._2008._02.types.DocumentRoot#setXVType(org.opcfoundation.ua._2008._02.types.XVType)
	 * @generated
	 */
	public void testSetXVType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //DocumentRootTest
