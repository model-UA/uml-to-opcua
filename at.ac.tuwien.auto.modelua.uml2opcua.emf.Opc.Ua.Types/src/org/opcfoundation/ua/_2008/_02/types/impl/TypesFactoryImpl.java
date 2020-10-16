/**
 */
package org.opcfoundation.ua._2008._02.types.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.opcfoundation.ua._2008._02.types.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesFactoryImpl extends EFactoryImpl implements TypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypesFactory init() {
		try {
			TypesFactory theTypesFactory = (TypesFactory)EPackage.Registry.INSTANCE.getEFactory(TypesPackage.eNS_URI);
			if (theTypesFactory != null) {
				return theTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TypesPackage.ACTIVATE_SESSION_REQUEST: return createActivateSessionRequest();
			case TypesPackage.ACTIVATE_SESSION_RESPONSE: return createActivateSessionResponse();
			case TypesPackage.ADD_NODES_ITEM: return createAddNodesItem();
			case TypesPackage.ADD_NODES_REQUEST: return createAddNodesRequest();
			case TypesPackage.ADD_NODES_RESPONSE: return createAddNodesResponse();
			case TypesPackage.ADD_NODES_RESULT: return createAddNodesResult();
			case TypesPackage.ADD_REFERENCES_ITEM: return createAddReferencesItem();
			case TypesPackage.ADD_REFERENCES_REQUEST: return createAddReferencesRequest();
			case TypesPackage.ADD_REFERENCES_RESPONSE: return createAddReferencesResponse();
			case TypesPackage.AGGREGATE_CONFIGURATION: return createAggregateConfiguration();
			case TypesPackage.AGGREGATE_FILTER: return createAggregateFilter();
			case TypesPackage.AGGREGATE_FILTER_RESULT: return createAggregateFilterResult();
			case TypesPackage.ALIAS_NAME_DATA_TYPE: return createAliasNameDataType();
			case TypesPackage.ANNOTATION: return createAnnotation();
			case TypesPackage.ANONYMOUS_IDENTITY_TOKEN: return createAnonymousIdentityToken();
			case TypesPackage.APPLICATION_DESCRIPTION: return createApplicationDescription();
			case TypesPackage.ARGUMENT: return createArgument();
			case TypesPackage.ATTRIBUTE_OPERAND: return createAttributeOperand();
			case TypesPackage.AXIS_INFORMATION: return createAxisInformation();
			case TypesPackage.BODY_TYPE: return createBodyType();
			case TypesPackage.BROKER_CONNECTION_TRANSPORT_DATA_TYPE: return createBrokerConnectionTransportDataType();
			case TypesPackage.BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE: return createBrokerDataSetReaderTransportDataType();
			case TypesPackage.BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE: return createBrokerDataSetWriterTransportDataType();
			case TypesPackage.BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE: return createBrokerWriterGroupTransportDataType();
			case TypesPackage.BROWSE_DESCRIPTION: return createBrowseDescription();
			case TypesPackage.BROWSE_NEXT_REQUEST: return createBrowseNextRequest();
			case TypesPackage.BROWSE_NEXT_RESPONSE: return createBrowseNextResponse();
			case TypesPackage.BROWSE_PATH: return createBrowsePath();
			case TypesPackage.BROWSE_PATH_RESULT: return createBrowsePathResult();
			case TypesPackage.BROWSE_PATH_TARGET: return createBrowsePathTarget();
			case TypesPackage.BROWSE_REQUEST: return createBrowseRequest();
			case TypesPackage.BROWSE_RESPONSE: return createBrowseResponse();
			case TypesPackage.BROWSE_RESULT: return createBrowseResult();
			case TypesPackage.BUILD_INFO: return createBuildInfo();
			case TypesPackage.CALL_METHOD_REQUEST: return createCallMethodRequest();
			case TypesPackage.CALL_METHOD_RESULT: return createCallMethodResult();
			case TypesPackage.CALL_REQUEST: return createCallRequest();
			case TypesPackage.CALL_RESPONSE: return createCallResponse();
			case TypesPackage.CANCEL_REQUEST: return createCancelRequest();
			case TypesPackage.CANCEL_RESPONSE: return createCancelResponse();
			case TypesPackage.CARTESIAN_COORDINATES: return createCartesianCoordinates();
			case TypesPackage.CHANNEL_SECURITY_TOKEN: return createChannelSecurityToken();
			case TypesPackage.CLOSE_SECURE_CHANNEL_REQUEST: return createCloseSecureChannelRequest();
			case TypesPackage.CLOSE_SECURE_CHANNEL_RESPONSE: return createCloseSecureChannelResponse();
			case TypesPackage.CLOSE_SESSION_REQUEST: return createCloseSessionRequest();
			case TypesPackage.CLOSE_SESSION_RESPONSE: return createCloseSessionResponse();
			case TypesPackage.COMPLEX_NUMBER_TYPE: return createComplexNumberType();
			case TypesPackage.CONFIGURATION_VERSION_DATA_TYPE: return createConfigurationVersionDataType();
			case TypesPackage.CONNECTION_TRANSPORT_DATA_TYPE: return createConnectionTransportDataType();
			case TypesPackage.CONTENT_FILTER: return createContentFilter();
			case TypesPackage.CONTENT_FILTER_ELEMENT: return createContentFilterElement();
			case TypesPackage.CONTENT_FILTER_ELEMENT_RESULT: return createContentFilterElementResult();
			case TypesPackage.CONTENT_FILTER_RESULT: return createContentFilterResult();
			case TypesPackage.CREATE_MONITORED_ITEMS_REQUEST: return createCreateMonitoredItemsRequest();
			case TypesPackage.CREATE_MONITORED_ITEMS_RESPONSE: return createCreateMonitoredItemsResponse();
			case TypesPackage.CREATE_SESSION_REQUEST: return createCreateSessionRequest();
			case TypesPackage.CREATE_SESSION_RESPONSE: return createCreateSessionResponse();
			case TypesPackage.CREATE_SUBSCRIPTION_REQUEST: return createCreateSubscriptionRequest();
			case TypesPackage.CREATE_SUBSCRIPTION_RESPONSE: return createCreateSubscriptionResponse();
			case TypesPackage.CURRENCY_UNIT_TYPE: return createCurrencyUnitType();
			case TypesPackage.DATA_CHANGE_FILTER: return createDataChangeFilter();
			case TypesPackage.DATA_CHANGE_NOTIFICATION: return createDataChangeNotification();
			case TypesPackage.DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE: return createDatagramConnectionTransportDataType();
			case TypesPackage.DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE: return createDatagramWriterGroupTransportDataType();
			case TypesPackage.DATA_SET_META_DATA_TYPE: return createDataSetMetaDataType();
			case TypesPackage.DATA_SET_READER_DATA_TYPE: return createDataSetReaderDataType();
			case TypesPackage.DATA_SET_READER_MESSAGE_DATA_TYPE: return createDataSetReaderMessageDataType();
			case TypesPackage.DATA_SET_READER_TRANSPORT_DATA_TYPE: return createDataSetReaderTransportDataType();
			case TypesPackage.DATA_SET_WRITER_DATA_TYPE: return createDataSetWriterDataType();
			case TypesPackage.DATA_SET_WRITER_MESSAGE_DATA_TYPE: return createDataSetWriterMessageDataType();
			case TypesPackage.DATA_SET_WRITER_TRANSPORT_DATA_TYPE: return createDataSetWriterTransportDataType();
			case TypesPackage.DATA_TYPE_ATTRIBUTES: return createDataTypeAttributes();
			case TypesPackage.DATA_TYPE_DEFINITION: return createDataTypeDefinition();
			case TypesPackage.DATA_TYPE_DESCRIPTION: return createDataTypeDescription();
			case TypesPackage.DATA_TYPE_NODE: return createDataTypeNode();
			case TypesPackage.DATA_TYPE_SCHEMA_HEADER: return createDataTypeSchemaHeader();
			case TypesPackage.DATA_VALUE: return createDataValue();
			case TypesPackage.DECIMAL_DATA_TYPE: return createDecimalDataType();
			case TypesPackage.DELETE_AT_TIME_DETAILS: return createDeleteAtTimeDetails();
			case TypesPackage.DELETE_EVENT_DETAILS: return createDeleteEventDetails();
			case TypesPackage.DELETE_MONITORED_ITEMS_REQUEST: return createDeleteMonitoredItemsRequest();
			case TypesPackage.DELETE_MONITORED_ITEMS_RESPONSE: return createDeleteMonitoredItemsResponse();
			case TypesPackage.DELETE_NODES_ITEM: return createDeleteNodesItem();
			case TypesPackage.DELETE_NODES_REQUEST: return createDeleteNodesRequest();
			case TypesPackage.DELETE_NODES_RESPONSE: return createDeleteNodesResponse();
			case TypesPackage.DELETE_RAW_MODIFIED_DETAILS: return createDeleteRawModifiedDetails();
			case TypesPackage.DELETE_REFERENCES_ITEM: return createDeleteReferencesItem();
			case TypesPackage.DELETE_REFERENCES_REQUEST: return createDeleteReferencesRequest();
			case TypesPackage.DELETE_REFERENCES_RESPONSE: return createDeleteReferencesResponse();
			case TypesPackage.DELETE_SUBSCRIPTIONS_REQUEST: return createDeleteSubscriptionsRequest();
			case TypesPackage.DELETE_SUBSCRIPTIONS_RESPONSE: return createDeleteSubscriptionsResponse();
			case TypesPackage.DIAGNOSTIC_INFO: return createDiagnosticInfo();
			case TypesPackage.DISCOVERY_CONFIGURATION: return createDiscoveryConfiguration();
			case TypesPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case TypesPackage.DOUBLE_COMPLEX_NUMBER_TYPE: return createDoubleComplexNumberType();
			case TypesPackage.ELEMENT_OPERAND: return createElementOperand();
			case TypesPackage.ENDPOINT_CONFIGURATION: return createEndpointConfiguration();
			case TypesPackage.ENDPOINT_DESCRIPTION: return createEndpointDescription();
			case TypesPackage.ENDPOINT_TYPE: return createEndpointType();
			case TypesPackage.ENDPOINT_URL_LIST_DATA_TYPE: return createEndpointUrlListDataType();
			case TypesPackage.ENUM_DEFINITION: return createEnumDefinition();
			case TypesPackage.ENUM_DESCRIPTION: return createEnumDescription();
			case TypesPackage.ENUM_FIELD: return createEnumField();
			case TypesPackage.ENUM_VALUE_TYPE: return createEnumValueType();
			case TypesPackage.EU_INFORMATION: return createEUInformation();
			case TypesPackage.EVENT_FIELD_LIST: return createEventFieldList();
			case TypesPackage.EVENT_FILTER: return createEventFilter();
			case TypesPackage.EVENT_FILTER_RESULT: return createEventFilterResult();
			case TypesPackage.EVENT_NOTIFICATION_LIST: return createEventNotificationList();
			case TypesPackage.EXPANDED_NODE_ID: return createExpandedNodeId();
			case TypesPackage.EXTENSION_OBJECT: return createExtensionObject();
			case TypesPackage.FIELD_META_DATA: return createFieldMetaData();
			case TypesPackage.FIELD_TARGET_DATA_TYPE: return createFieldTargetDataType();
			case TypesPackage.FILTER_OPERAND: return createFilterOperand();
			case TypesPackage.FIND_SERVERS_ON_NETWORK_REQUEST: return createFindServersOnNetworkRequest();
			case TypesPackage.FIND_SERVERS_ON_NETWORK_RESPONSE: return createFindServersOnNetworkResponse();
			case TypesPackage.FIND_SERVERS_REQUEST: return createFindServersRequest();
			case TypesPackage.FIND_SERVERS_RESPONSE: return createFindServersResponse();
			case TypesPackage.FRAME: return createFrame();
			case TypesPackage.GENERIC_ATTRIBUTES: return createGenericAttributes();
			case TypesPackage.GENERIC_ATTRIBUTE_VALUE: return createGenericAttributeValue();
			case TypesPackage.GET_ENDPOINTS_REQUEST: return createGetEndpointsRequest();
			case TypesPackage.GET_ENDPOINTS_RESPONSE: return createGetEndpointsResponse();
			case TypesPackage.GUID: return createGuid();
			case TypesPackage.HISTORY_DATA: return createHistoryData();
			case TypesPackage.HISTORY_EVENT: return createHistoryEvent();
			case TypesPackage.HISTORY_EVENT_FIELD_LIST: return createHistoryEventFieldList();
			case TypesPackage.HISTORY_MODIFIED_DATA: return createHistoryModifiedData();
			case TypesPackage.HISTORY_READ_DETAILS: return createHistoryReadDetails();
			case TypesPackage.HISTORY_READ_REQUEST: return createHistoryReadRequest();
			case TypesPackage.HISTORY_READ_RESPONSE: return createHistoryReadResponse();
			case TypesPackage.HISTORY_READ_RESULT: return createHistoryReadResult();
			case TypesPackage.HISTORY_READ_VALUE_ID: return createHistoryReadValueId();
			case TypesPackage.HISTORY_UPDATE_DETAILS: return createHistoryUpdateDetails();
			case TypesPackage.HISTORY_UPDATE_REQUEST: return createHistoryUpdateRequest();
			case TypesPackage.HISTORY_UPDATE_RESPONSE: return createHistoryUpdateResponse();
			case TypesPackage.HISTORY_UPDATE_RESULT: return createHistoryUpdateResult();
			case TypesPackage.IDENTITY_MAPPING_RULE_TYPE: return createIdentityMappingRuleType();
			case TypesPackage.INSTANCE_NODE: return createInstanceNode();
			case TypesPackage.ISSUED_IDENTITY_TOKEN: return createIssuedIdentityToken();
			case TypesPackage.JSON_DATA_SET_READER_MESSAGE_DATA_TYPE: return createJsonDataSetReaderMessageDataType();
			case TypesPackage.JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE: return createJsonDataSetWriterMessageDataType();
			case TypesPackage.JSON_WRITER_GROUP_MESSAGE_DATA_TYPE: return createJsonWriterGroupMessageDataType();
			case TypesPackage.KEY_VALUE_PAIR: return createKeyValuePair();
			case TypesPackage.LIST_OF_ADD_NODES_ITEM: return createListOfAddNodesItem();
			case TypesPackage.LIST_OF_ADD_NODES_RESULT: return createListOfAddNodesResult();
			case TypesPackage.LIST_OF_ADD_REFERENCES_ITEM: return createListOfAddReferencesItem();
			case TypesPackage.LIST_OF_ALIAS_NAME_DATA_TYPE: return createListOfAliasNameDataType();
			case TypesPackage.LIST_OF_APPLICATION_DESCRIPTION: return createListOfApplicationDescription();
			case TypesPackage.LIST_OF_ARGUMENT: return createListOfArgument();
			case TypesPackage.LIST_OF_BOOLEAN: return createListOfBoolean();
			case TypesPackage.LIST_OF_BROKER_CONNECTION_TRANSPORT_DATA_TYPE: return createListOfBrokerConnectionTransportDataType();
			case TypesPackage.LIST_OF_BROKER_DATA_SET_READER_TRANSPORT_DATA_TYPE: return createListOfBrokerDataSetReaderTransportDataType();
			case TypesPackage.LIST_OF_BROKER_DATA_SET_WRITER_TRANSPORT_DATA_TYPE: return createListOfBrokerDataSetWriterTransportDataType();
			case TypesPackage.LIST_OF_BROKER_TRANSPORT_QUALITY_OF_SERVICE: return createListOfBrokerTransportQualityOfService();
			case TypesPackage.LIST_OF_BROKER_WRITER_GROUP_TRANSPORT_DATA_TYPE: return createListOfBrokerWriterGroupTransportDataType();
			case TypesPackage.LIST_OF_BROWSE_DESCRIPTION: return createListOfBrowseDescription();
			case TypesPackage.LIST_OF_BROWSE_PATH: return createListOfBrowsePath();
			case TypesPackage.LIST_OF_BROWSE_PATH_RESULT: return createListOfBrowsePathResult();
			case TypesPackage.LIST_OF_BROWSE_PATH_TARGET: return createListOfBrowsePathTarget();
			case TypesPackage.LIST_OF_BROWSE_RESULT: return createListOfBrowseResult();
			case TypesPackage.LIST_OF_BYTE: return createListOfByte();
			case TypesPackage.LIST_OF_BYTE_STRING: return createListOfByteString();
			case TypesPackage.LIST_OF_CALL_METHOD_REQUEST: return createListOfCallMethodRequest();
			case TypesPackage.LIST_OF_CALL_METHOD_RESULT: return createListOfCallMethodResult();
			case TypesPackage.LIST_OF_CARTESIAN_COORDINATES: return createListOfCartesianCoordinates();
			case TypesPackage.LIST_OF_CONFIGURATION_VERSION_DATA_TYPE: return createListOfConfigurationVersionDataType();
			case TypesPackage.LIST_OF_CONNECTION_TRANSPORT_DATA_TYPE: return createListOfConnectionTransportDataType();
			case TypesPackage.LIST_OF_CONTENT_FILTER: return createListOfContentFilter();
			case TypesPackage.LIST_OF_CONTENT_FILTER_ELEMENT: return createListOfContentFilterElement();
			case TypesPackage.LIST_OF_CONTENT_FILTER_ELEMENT_RESULT: return createListOfContentFilterElementResult();
			case TypesPackage.LIST_OF_CURRENCY_UNIT_TYPE: return createListOfCurrencyUnitType();
			case TypesPackage.LIST_OF_DATAGRAM_CONNECTION_TRANSPORT_DATA_TYPE: return createListOfDatagramConnectionTransportDataType();
			case TypesPackage.LIST_OF_DATAGRAM_WRITER_GROUP_TRANSPORT_DATA_TYPE: return createListOfDatagramWriterGroupTransportDataType();
			case TypesPackage.LIST_OF_DATA_SET_FIELD_CONTENT_MASK: return createListOfDataSetFieldContentMask();
			case TypesPackage.LIST_OF_DATA_SET_META_DATA_TYPE: return createListOfDataSetMetaDataType();
			case TypesPackage.LIST_OF_DATA_SET_ORDERING_TYPE: return createListOfDataSetOrderingType();
			case TypesPackage.LIST_OF_DATA_SET_READER_DATA_TYPE: return createListOfDataSetReaderDataType();
			case TypesPackage.LIST_OF_DATA_SET_READER_MESSAGE_DATA_TYPE: return createListOfDataSetReaderMessageDataType();
			case TypesPackage.LIST_OF_DATA_SET_READER_TRANSPORT_DATA_TYPE: return createListOfDataSetReaderTransportDataType();
			case TypesPackage.LIST_OF_DATA_SET_WRITER_DATA_TYPE: return createListOfDataSetWriterDataType();
			case TypesPackage.LIST_OF_DATA_SET_WRITER_MESSAGE_DATA_TYPE: return createListOfDataSetWriterMessageDataType();
			case TypesPackage.LIST_OF_DATA_SET_WRITER_TRANSPORT_DATA_TYPE: return createListOfDataSetWriterTransportDataType();
			case TypesPackage.LIST_OF_DATA_TYPE_DEFINITION: return createListOfDataTypeDefinition();
			case TypesPackage.LIST_OF_DATA_TYPE_DESCRIPTION: return createListOfDataTypeDescription();
			case TypesPackage.LIST_OF_DATA_TYPE_SCHEMA_HEADER: return createListOfDataTypeSchemaHeader();
			case TypesPackage.LIST_OF_DATA_VALUE: return createListOfDataValue();
			case TypesPackage.LIST_OF_DATE_TIME: return createListOfDateTime();
			case TypesPackage.LIST_OF_DELETE_NODES_ITEM: return createListOfDeleteNodesItem();
			case TypesPackage.LIST_OF_DELETE_REFERENCES_ITEM: return createListOfDeleteReferencesItem();
			case TypesPackage.LIST_OF_DIAGNOSTIC_INFO: return createListOfDiagnosticInfo();
			case TypesPackage.LIST_OF_DIAGNOSTICS_LEVEL: return createListOfDiagnosticsLevel();
			case TypesPackage.LIST_OF_DOUBLE: return createListOfDouble();
			case TypesPackage.LIST_OF_ENDPOINT_CONFIGURATION: return createListOfEndpointConfiguration();
			case TypesPackage.LIST_OF_ENDPOINT_DESCRIPTION: return createListOfEndpointDescription();
			case TypesPackage.LIST_OF_ENDPOINT_TYPE: return createListOfEndpointType();
			case TypesPackage.LIST_OF_ENDPOINT_URL_LIST_DATA_TYPE: return createListOfEndpointUrlListDataType();
			case TypesPackage.LIST_OF_ENUM_DEFINITION: return createListOfEnumDefinition();
			case TypesPackage.LIST_OF_ENUM_DESCRIPTION: return createListOfEnumDescription();
			case TypesPackage.LIST_OF_ENUM_FIELD: return createListOfEnumField();
			case TypesPackage.LIST_OF_ENUM_VALUE_TYPE: return createListOfEnumValueType();
			case TypesPackage.LIST_OF_EVENT_FIELD_LIST: return createListOfEventFieldList();
			case TypesPackage.LIST_OF_EXPANDED_NODE_ID: return createListOfExpandedNodeId();
			case TypesPackage.LIST_OF_EXTENSION_OBJECT: return createListOfExtensionObject();
			case TypesPackage.LIST_OF_FIELD_META_DATA: return createListOfFieldMetaData();
			case TypesPackage.LIST_OF_FIELD_TARGET_DATA_TYPE: return createListOfFieldTargetDataType();
			case TypesPackage.LIST_OF_FLOAT: return createListOfFloat();
			case TypesPackage.LIST_OF_FRAME: return createListOfFrame();
			case TypesPackage.LIST_OF_GENERIC_ATTRIBUTE_VALUE: return createListOfGenericAttributeValue();
			case TypesPackage.LIST_OF_GUID: return createListOfGuid();
			case TypesPackage.LIST_OF_HISTORY_EVENT_FIELD_LIST: return createListOfHistoryEventFieldList();
			case TypesPackage.LIST_OF_HISTORY_READ_RESULT: return createListOfHistoryReadResult();
			case TypesPackage.LIST_OF_HISTORY_READ_VALUE_ID: return createListOfHistoryReadValueId();
			case TypesPackage.LIST_OF_HISTORY_UPDATE_RESULT: return createListOfHistoryUpdateResult();
			case TypesPackage.LIST_OF_IDENTITY_CRITERIA_TYPE: return createListOfIdentityCriteriaType();
			case TypesPackage.LIST_OF_IDENTITY_MAPPING_RULE_TYPE: return createListOfIdentityMappingRuleType();
			case TypesPackage.LIST_OF_ID_TYPE: return createListOfIdType();
			case TypesPackage.LIST_OF_INT16: return createListOfInt16();
			case TypesPackage.LIST_OF_INT32: return createListOfInt32();
			case TypesPackage.LIST_OF_INT64: return createListOfInt64();
			case TypesPackage.LIST_OF_JSON_DATA_SET_MESSAGE_CONTENT_MASK: return createListOfJsonDataSetMessageContentMask();
			case TypesPackage.LIST_OF_JSON_DATA_SET_READER_MESSAGE_DATA_TYPE: return createListOfJsonDataSetReaderMessageDataType();
			case TypesPackage.LIST_OF_JSON_DATA_SET_WRITER_MESSAGE_DATA_TYPE: return createListOfJsonDataSetWriterMessageDataType();
			case TypesPackage.LIST_OF_JSON_NETWORK_MESSAGE_CONTENT_MASK: return createListOfJsonNetworkMessageContentMask();
			case TypesPackage.LIST_OF_JSON_WRITER_GROUP_MESSAGE_DATA_TYPE: return createListOfJsonWriterGroupMessageDataType();
			case TypesPackage.LIST_OF_KEY_VALUE_PAIR: return createListOfKeyValuePair();
			case TypesPackage.LIST_OF_LOCALIZED_TEXT: return createListOfLocalizedText();
			case TypesPackage.LIST_OF_MODEL_CHANGE_STRUCTURE_DATA_TYPE: return createListOfModelChangeStructureDataType();
			case TypesPackage.LIST_OF_MODIFICATION_INFO: return createListOfModificationInfo();
			case TypesPackage.LIST_OF_MONITORED_ITEM_CREATE_REQUEST: return createListOfMonitoredItemCreateRequest();
			case TypesPackage.LIST_OF_MONITORED_ITEM_CREATE_RESULT: return createListOfMonitoredItemCreateResult();
			case TypesPackage.LIST_OF_MONITORED_ITEM_MODIFY_REQUEST: return createListOfMonitoredItemModifyRequest();
			case TypesPackage.LIST_OF_MONITORED_ITEM_MODIFY_RESULT: return createListOfMonitoredItemModifyResult();
			case TypesPackage.LIST_OF_MONITORED_ITEM_NOTIFICATION: return createListOfMonitoredItemNotification();
			case TypesPackage.LIST_OF_NETWORK_ADDRESS_DATA_TYPE: return createListOfNetworkAddressDataType();
			case TypesPackage.LIST_OF_NETWORK_ADDRESS_URL_DATA_TYPE: return createListOfNetworkAddressUrlDataType();
			case TypesPackage.LIST_OF_NETWORK_GROUP_DATA_TYPE: return createListOfNetworkGroupDataType();
			case TypesPackage.LIST_OF_NODE: return createListOfNode();
			case TypesPackage.LIST_OF_NODE_ID: return createListOfNodeId();
			case TypesPackage.LIST_OF_NODE_REFERENCE: return createListOfNodeReference();
			case TypesPackage.LIST_OF_NODE_TYPE_DESCRIPTION: return createListOfNodeTypeDescription();
			case TypesPackage.LIST_OF_OPEN_FILE_MODE: return createListOfOpenFileMode();
			case TypesPackage.LIST_OF_OPTION_SET: return createListOfOptionSet();
			case TypesPackage.LIST_OF_ORIENTATION: return createListOfOrientation();
			case TypesPackage.LIST_OF_OVERRIDE_VALUE_HANDLING: return createListOfOverrideValueHandling();
			case TypesPackage.LIST_OF_PARSING_RESULT: return createListOfParsingResult();
			case TypesPackage.LIST_OF_PUBLISHED_DATA_ITEMS_DATA_TYPE: return createListOfPublishedDataItemsDataType();
			case TypesPackage.LIST_OF_PUBLISHED_DATA_SET_DATA_TYPE: return createListOfPublishedDataSetDataType();
			case TypesPackage.LIST_OF_PUBLISHED_DATA_SET_SOURCE_DATA_TYPE: return createListOfPublishedDataSetSourceDataType();
			case TypesPackage.LIST_OF_PUBLISHED_EVENTS_DATA_TYPE: return createListOfPublishedEventsDataType();
			case TypesPackage.LIST_OF_PUBLISHED_VARIABLE_DATA_TYPE: return createListOfPublishedVariableDataType();
			case TypesPackage.LIST_OF_PUB_SUB_CONFIGURATION_DATA_TYPE: return createListOfPubSubConfigurationDataType();
			case TypesPackage.LIST_OF_PUB_SUB_CONNECTION_DATA_TYPE: return createListOfPubSubConnectionDataType();
			case TypesPackage.LIST_OF_PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION: return createListOfPubSubDiagnosticsCounterClassification();
			case TypesPackage.LIST_OF_PUB_SUB_GROUP_DATA_TYPE: return createListOfPubSubGroupDataType();
			case TypesPackage.LIST_OF_PUB_SUB_STATE: return createListOfPubSubState();
			case TypesPackage.LIST_OF_QUALIFIED_NAME: return createListOfQualifiedName();
			case TypesPackage.LIST_OF_QUERY_DATA_DESCRIPTION: return createListOfQueryDataDescription();
			case TypesPackage.LIST_OF_QUERY_DATA_SET: return createListOfQueryDataSet();
			case TypesPackage.LIST_OF_RATIONAL_NUMBER: return createListOfRationalNumber();
			case TypesPackage.LIST_OF_READER_GROUP_DATA_TYPE: return createListOfReaderGroupDataType();
			case TypesPackage.LIST_OF_READER_GROUP_MESSAGE_DATA_TYPE: return createListOfReaderGroupMessageDataType();
			case TypesPackage.LIST_OF_READER_GROUP_TRANSPORT_DATA_TYPE: return createListOfReaderGroupTransportDataType();
			case TypesPackage.LIST_OF_READ_VALUE_ID: return createListOfReadValueId();
			case TypesPackage.LIST_OF_REDUNDANT_SERVER_DATA_TYPE: return createListOfRedundantServerDataType();
			case TypesPackage.LIST_OF_REFERENCE_DESCRIPTION: return createListOfReferenceDescription();
			case TypesPackage.LIST_OF_REFERENCE_NODE: return createListOfReferenceNode();
			case TypesPackage.LIST_OF_REGISTERED_SERVER: return createListOfRegisteredServer();
			case TypesPackage.LIST_OF_RELATIVE_PATH_ELEMENT: return createListOfRelativePathElement();
			case TypesPackage.LIST_OF_ROLE_PERMISSION_TYPE: return createListOfRolePermissionType();
			case TypesPackage.LIST_OF_SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE: return createListOfSamplingIntervalDiagnosticsDataType();
			case TypesPackage.LIST_OF_SBYTE: return createListOfSByte();
			case TypesPackage.LIST_OF_SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE: return createListOfSemanticChangeStructureDataType();
			case TypesPackage.LIST_OF_SERVER_ON_NETWORK: return createListOfServerOnNetwork();
			case TypesPackage.LIST_OF_SESSION_DIAGNOSTICS_DATA_TYPE: return createListOfSessionDiagnosticsDataType();
			case TypesPackage.LIST_OF_SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE: return createListOfSessionSecurityDiagnosticsDataType();
			case TypesPackage.LIST_OF_SIGNED_SOFTWARE_CERTIFICATE: return createListOfSignedSoftwareCertificate();
			case TypesPackage.LIST_OF_SIMPLE_ATTRIBUTE_OPERAND: return createListOfSimpleAttributeOperand();
			case TypesPackage.LIST_OF_SIMPLE_TYPE_DESCRIPTION: return createListOfSimpleTypeDescription();
			case TypesPackage.LIST_OF_STATUS_CODE: return createListOfStatusCode();
			case TypesPackage.LIST_OF_STATUS_RESULT: return createListOfStatusResult();
			case TypesPackage.LIST_OF_STRING: return createListOfString();
			case TypesPackage.LIST_OF_STRUCTURE_DEFINITION: return createListOfStructureDefinition();
			case TypesPackage.LIST_OF_STRUCTURE_DESCRIPTION: return createListOfStructureDescription();
			case TypesPackage.LIST_OF_STRUCTURE_FIELD: return createListOfStructureField();
			case TypesPackage.LIST_OF_SUBSCRIBED_DATA_SET_DATA_TYPE: return createListOfSubscribedDataSetDataType();
			case TypesPackage.LIST_OF_SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE: return createListOfSubscribedDataSetMirrorDataType();
			case TypesPackage.LIST_OF_SUBSCRIPTION_ACKNOWLEDGEMENT: return createListOfSubscriptionAcknowledgement();
			case TypesPackage.LIST_OF_SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE: return createListOfSubscriptionDiagnosticsDataType();
			case TypesPackage.LIST_OF_TARGET_VARIABLES_DATA_TYPE: return createListOfTargetVariablesDataType();
			case TypesPackage.LIST_OF_THREE_DCARTESIAN_COORDINATES: return createListOfThreeDCartesianCoordinates();
			case TypesPackage.LIST_OF_THREE_DFRAME: return createListOfThreeDFrame();
			case TypesPackage.LIST_OF_THREE_DORIENTATION: return createListOfThreeDOrientation();
			case TypesPackage.LIST_OF_THREE_DVECTOR: return createListOfThreeDVector();
			case TypesPackage.LIST_OF_TIME_ZONE_DATA_TYPE: return createListOfTimeZoneDataType();
			case TypesPackage.LIST_OF_TRANSFER_RESULT: return createListOfTransferResult();
			case TypesPackage.LIST_OF_TRUST_LIST_DATA_TYPE: return createListOfTrustListDataType();
			case TypesPackage.LIST_OF_UA_BINARY_FILE_DATA_TYPE: return createListOfUABinaryFileDataType();
			case TypesPackage.LIST_OF_UADP_DATA_SET_MESSAGE_CONTENT_MASK: return createListOfUadpDataSetMessageContentMask();
			case TypesPackage.LIST_OF_UADP_DATA_SET_READER_MESSAGE_DATA_TYPE: return createListOfUadpDataSetReaderMessageDataType();
			case TypesPackage.LIST_OF_UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE: return createListOfUadpDataSetWriterMessageDataType();
			case TypesPackage.LIST_OF_UADP_NETWORK_MESSAGE_CONTENT_MASK: return createListOfUadpNetworkMessageContentMask();
			case TypesPackage.LIST_OF_UADP_WRITER_GROUP_MESSAGE_DATA_TYPE: return createListOfUadpWriterGroupMessageDataType();
			case TypesPackage.LIST_OF_UINT16: return createListOfUInt16();
			case TypesPackage.LIST_OF_UINT32: return createListOfUInt32();
			case TypesPackage.LIST_OF_UINT64: return createListOfUInt64();
			case TypesPackage.LIST_OF_UNION: return createListOfUnion();
			case TypesPackage.LIST_OF_USER_TOKEN_POLICY: return createListOfUserTokenPolicy();
			case TypesPackage.LIST_OF_VARIANT: return createListOfVariant();
			case TypesPackage.LIST_OF_VECTOR: return createListOfVector();
			case TypesPackage.LIST_OF_WRITER_GROUP_DATA_TYPE: return createListOfWriterGroupDataType();
			case TypesPackage.LIST_OF_WRITER_GROUP_MESSAGE_DATA_TYPE: return createListOfWriterGroupMessageDataType();
			case TypesPackage.LIST_OF_WRITER_GROUP_TRANSPORT_DATA_TYPE: return createListOfWriterGroupTransportDataType();
			case TypesPackage.LIST_OF_WRITE_VALUE: return createListOfWriteValue();
			case TypesPackage.LIST_OF_XML_ELEMENT: return createListOfXmlElement();
			case TypesPackage.LITERAL_OPERAND: return createLiteralOperand();
			case TypesPackage.LOCALIZED_TEXT: return createLocalizedText();
			case TypesPackage.MDNS_DISCOVERY_CONFIGURATION: return createMdnsDiscoveryConfiguration();
			case TypesPackage.METHOD_ATTRIBUTES: return createMethodAttributes();
			case TypesPackage.METHOD_NODE: return createMethodNode();
			case TypesPackage.MODEL_CHANGE_STRUCTURE_DATA_TYPE: return createModelChangeStructureDataType();
			case TypesPackage.MODIFICATION_INFO: return createModificationInfo();
			case TypesPackage.MODIFY_MONITORED_ITEMS_REQUEST: return createModifyMonitoredItemsRequest();
			case TypesPackage.MODIFY_MONITORED_ITEMS_RESPONSE: return createModifyMonitoredItemsResponse();
			case TypesPackage.MODIFY_SUBSCRIPTION_REQUEST: return createModifySubscriptionRequest();
			case TypesPackage.MODIFY_SUBSCRIPTION_RESPONSE: return createModifySubscriptionResponse();
			case TypesPackage.MONITORED_ITEM_CREATE_REQUEST: return createMonitoredItemCreateRequest();
			case TypesPackage.MONITORED_ITEM_CREATE_RESULT: return createMonitoredItemCreateResult();
			case TypesPackage.MONITORED_ITEM_MODIFY_REQUEST: return createMonitoredItemModifyRequest();
			case TypesPackage.MONITORED_ITEM_MODIFY_RESULT: return createMonitoredItemModifyResult();
			case TypesPackage.MONITORED_ITEM_NOTIFICATION: return createMonitoredItemNotification();
			case TypesPackage.MONITORING_FILTER: return createMonitoringFilter();
			case TypesPackage.MONITORING_FILTER_RESULT: return createMonitoringFilterResult();
			case TypesPackage.MONITORING_PARAMETERS: return createMonitoringParameters();
			case TypesPackage.NETWORK_ADDRESS_DATA_TYPE: return createNetworkAddressDataType();
			case TypesPackage.NETWORK_ADDRESS_URL_DATA_TYPE: return createNetworkAddressUrlDataType();
			case TypesPackage.NETWORK_GROUP_DATA_TYPE: return createNetworkGroupDataType();
			case TypesPackage.NODE: return createNode();
			case TypesPackage.NODE_ATTRIBUTES: return createNodeAttributes();
			case TypesPackage.NODE_ID: return createNodeId();
			case TypesPackage.NODE_REFERENCE: return createNodeReference();
			case TypesPackage.NODE_TYPE_DESCRIPTION: return createNodeTypeDescription();
			case TypesPackage.NOTIFICATION_DATA: return createNotificationData();
			case TypesPackage.NOTIFICATION_MESSAGE: return createNotificationMessage();
			case TypesPackage.OBJECT_ATTRIBUTES: return createObjectAttributes();
			case TypesPackage.OBJECT_NODE: return createObjectNode();
			case TypesPackage.OBJECT_TYPE_ATTRIBUTES: return createObjectTypeAttributes();
			case TypesPackage.OBJECT_TYPE_NODE: return createObjectTypeNode();
			case TypesPackage.OPEN_SECURE_CHANNEL_REQUEST: return createOpenSecureChannelRequest();
			case TypesPackage.OPEN_SECURE_CHANNEL_RESPONSE: return createOpenSecureChannelResponse();
			case TypesPackage.OPTION_SET: return createOptionSet();
			case TypesPackage.ORIENTATION: return createOrientation();
			case TypesPackage.PARSING_RESULT: return createParsingResult();
			case TypesPackage.PROGRAM_DIAGNOSTIC2_DATA_TYPE: return createProgramDiagnostic2DataType();
			case TypesPackage.PROGRAM_DIAGNOSTIC_DATA_TYPE: return createProgramDiagnosticDataType();
			case TypesPackage.PUBLISHED_DATA_ITEMS_DATA_TYPE: return createPublishedDataItemsDataType();
			case TypesPackage.PUBLISHED_DATA_SET_DATA_TYPE: return createPublishedDataSetDataType();
			case TypesPackage.PUBLISHED_DATA_SET_SOURCE_DATA_TYPE: return createPublishedDataSetSourceDataType();
			case TypesPackage.PUBLISHED_EVENTS_DATA_TYPE: return createPublishedEventsDataType();
			case TypesPackage.PUBLISHED_VARIABLE_DATA_TYPE: return createPublishedVariableDataType();
			case TypesPackage.PUBLISH_REQUEST: return createPublishRequest();
			case TypesPackage.PUBLISH_RESPONSE: return createPublishResponse();
			case TypesPackage.PUB_SUB_CONFIGURATION_DATA_TYPE: return createPubSubConfigurationDataType();
			case TypesPackage.PUB_SUB_CONNECTION_DATA_TYPE: return createPubSubConnectionDataType();
			case TypesPackage.PUB_SUB_GROUP_DATA_TYPE: return createPubSubGroupDataType();
			case TypesPackage.QUALIFIED_NAME: return createQualifiedName();
			case TypesPackage.QUERY_DATA_DESCRIPTION: return createQueryDataDescription();
			case TypesPackage.QUERY_DATA_SET: return createQueryDataSet();
			case TypesPackage.QUERY_FIRST_REQUEST: return createQueryFirstRequest();
			case TypesPackage.QUERY_FIRST_RESPONSE: return createQueryFirstResponse();
			case TypesPackage.QUERY_NEXT_REQUEST: return createQueryNextRequest();
			case TypesPackage.QUERY_NEXT_RESPONSE: return createQueryNextResponse();
			case TypesPackage.RANGE: return createRange();
			case TypesPackage.RATIONAL_NUMBER: return createRationalNumber();
			case TypesPackage.READ_ANNOTATION_DATA_DETAILS: return createReadAnnotationDataDetails();
			case TypesPackage.READ_AT_TIME_DETAILS: return createReadAtTimeDetails();
			case TypesPackage.READER_GROUP_DATA_TYPE: return createReaderGroupDataType();
			case TypesPackage.READER_GROUP_MESSAGE_DATA_TYPE: return createReaderGroupMessageDataType();
			case TypesPackage.READER_GROUP_TRANSPORT_DATA_TYPE: return createReaderGroupTransportDataType();
			case TypesPackage.READ_EVENT_DETAILS: return createReadEventDetails();
			case TypesPackage.READ_PROCESSED_DETAILS: return createReadProcessedDetails();
			case TypesPackage.READ_RAW_MODIFIED_DETAILS: return createReadRawModifiedDetails();
			case TypesPackage.READ_REQUEST: return createReadRequest();
			case TypesPackage.READ_RESPONSE: return createReadResponse();
			case TypesPackage.READ_VALUE_ID: return createReadValueId();
			case TypesPackage.REDUNDANT_SERVER_DATA_TYPE: return createRedundantServerDataType();
			case TypesPackage.REFERENCE_DESCRIPTION: return createReferenceDescription();
			case TypesPackage.REFERENCE_NODE: return createReferenceNode();
			case TypesPackage.REFERENCE_TYPE_ATTRIBUTES: return createReferenceTypeAttributes();
			case TypesPackage.REFERENCE_TYPE_NODE: return createReferenceTypeNode();
			case TypesPackage.REGISTERED_SERVER: return createRegisteredServer();
			case TypesPackage.REGISTER_NODES_REQUEST: return createRegisterNodesRequest();
			case TypesPackage.REGISTER_NODES_RESPONSE: return createRegisterNodesResponse();
			case TypesPackage.REGISTER_SERVER2_REQUEST: return createRegisterServer2Request();
			case TypesPackage.REGISTER_SERVER2_RESPONSE: return createRegisterServer2Response();
			case TypesPackage.REGISTER_SERVER_REQUEST: return createRegisterServerRequest();
			case TypesPackage.REGISTER_SERVER_RESPONSE: return createRegisterServerResponse();
			case TypesPackage.RELATIVE_PATH: return createRelativePath();
			case TypesPackage.RELATIVE_PATH_ELEMENT: return createRelativePathElement();
			case TypesPackage.REPUBLISH_REQUEST: return createRepublishRequest();
			case TypesPackage.REPUBLISH_RESPONSE: return createRepublishResponse();
			case TypesPackage.REQUEST_HEADER: return createRequestHeader();
			case TypesPackage.RESPONSE_HEADER: return createResponseHeader();
			case TypesPackage.ROLE_PERMISSION_TYPE: return createRolePermissionType();
			case TypesPackage.SAMPLING_INTERVAL_DIAGNOSTICS_DATA_TYPE: return createSamplingIntervalDiagnosticsDataType();
			case TypesPackage.SEMANTIC_CHANGE_STRUCTURE_DATA_TYPE: return createSemanticChangeStructureDataType();
			case TypesPackage.SERVER_DIAGNOSTICS_SUMMARY_DATA_TYPE: return createServerDiagnosticsSummaryDataType();
			case TypesPackage.SERVER_ON_NETWORK: return createServerOnNetwork();
			case TypesPackage.SERVER_STATUS_DATA_TYPE: return createServerStatusDataType();
			case TypesPackage.SERVICE_COUNTER_DATA_TYPE: return createServiceCounterDataType();
			case TypesPackage.SERVICE_FAULT: return createServiceFault();
			case TypesPackage.SESSION_DIAGNOSTICS_DATA_TYPE: return createSessionDiagnosticsDataType();
			case TypesPackage.SESSIONLESS_INVOKE_REQUEST_TYPE: return createSessionlessInvokeRequestType();
			case TypesPackage.SESSIONLESS_INVOKE_RESPONSE_TYPE: return createSessionlessInvokeResponseType();
			case TypesPackage.SESSION_SECURITY_DIAGNOSTICS_DATA_TYPE: return createSessionSecurityDiagnosticsDataType();
			case TypesPackage.SET_MONITORING_MODE_REQUEST: return createSetMonitoringModeRequest();
			case TypesPackage.SET_MONITORING_MODE_RESPONSE: return createSetMonitoringModeResponse();
			case TypesPackage.SET_PUBLISHING_MODE_REQUEST: return createSetPublishingModeRequest();
			case TypesPackage.SET_PUBLISHING_MODE_RESPONSE: return createSetPublishingModeResponse();
			case TypesPackage.SET_TRIGGERING_REQUEST: return createSetTriggeringRequest();
			case TypesPackage.SET_TRIGGERING_RESPONSE: return createSetTriggeringResponse();
			case TypesPackage.SIGNATURE_DATA: return createSignatureData();
			case TypesPackage.SIGNED_SOFTWARE_CERTIFICATE: return createSignedSoftwareCertificate();
			case TypesPackage.SIMPLE_ATTRIBUTE_OPERAND: return createSimpleAttributeOperand();
			case TypesPackage.SIMPLE_TYPE_DESCRIPTION: return createSimpleTypeDescription();
			case TypesPackage.STATUS_CHANGE_NOTIFICATION: return createStatusChangeNotification();
			case TypesPackage.STATUS_CODE: return createStatusCode();
			case TypesPackage.STATUS_RESULT: return createStatusResult();
			case TypesPackage.STRUCTURE_DEFINITION: return createStructureDefinition();
			case TypesPackage.STRUCTURE_DESCRIPTION: return createStructureDescription();
			case TypesPackage.STRUCTURE_FIELD: return createStructureField();
			case TypesPackage.SUBSCRIBED_DATA_SET_DATA_TYPE: return createSubscribedDataSetDataType();
			case TypesPackage.SUBSCRIBED_DATA_SET_MIRROR_DATA_TYPE: return createSubscribedDataSetMirrorDataType();
			case TypesPackage.SUBSCRIPTION_ACKNOWLEDGEMENT: return createSubscriptionAcknowledgement();
			case TypesPackage.SUBSCRIPTION_DIAGNOSTICS_DATA_TYPE: return createSubscriptionDiagnosticsDataType();
			case TypesPackage.TARGET_VARIABLES_DATA_TYPE: return createTargetVariablesDataType();
			case TypesPackage.THREE_DCARTESIAN_COORDINATES: return createThreeDCartesianCoordinates();
			case TypesPackage.THREE_DFRAME: return createThreeDFrame();
			case TypesPackage.THREE_DORIENTATION: return createThreeDOrientation();
			case TypesPackage.THREE_DVECTOR: return createThreeDVector();
			case TypesPackage.TIME_ZONE_DATA_TYPE: return createTimeZoneDataType();
			case TypesPackage.TRANSFER_RESULT: return createTransferResult();
			case TypesPackage.TRANSFER_SUBSCRIPTIONS_REQUEST: return createTransferSubscriptionsRequest();
			case TypesPackage.TRANSFER_SUBSCRIPTIONS_RESPONSE: return createTransferSubscriptionsResponse();
			case TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_REQUEST: return createTranslateBrowsePathsToNodeIdsRequest();
			case TypesPackage.TRANSLATE_BROWSE_PATHS_TO_NODE_IDS_RESPONSE: return createTranslateBrowsePathsToNodeIdsResponse();
			case TypesPackage.TRUST_LIST_DATA_TYPE: return createTrustListDataType();
			case TypesPackage.TYPE_NODE: return createTypeNode();
			case TypesPackage.UA_BINARY_FILE_DATA_TYPE: return createUABinaryFileDataType();
			case TypesPackage.UADP_DATA_SET_READER_MESSAGE_DATA_TYPE: return createUadpDataSetReaderMessageDataType();
			case TypesPackage.UADP_DATA_SET_WRITER_MESSAGE_DATA_TYPE: return createUadpDataSetWriterMessageDataType();
			case TypesPackage.UADP_WRITER_GROUP_MESSAGE_DATA_TYPE: return createUadpWriterGroupMessageDataType();
			case TypesPackage.UNION: return createUnion();
			case TypesPackage.UNREGISTER_NODES_REQUEST: return createUnregisterNodesRequest();
			case TypesPackage.UNREGISTER_NODES_RESPONSE: return createUnregisterNodesResponse();
			case TypesPackage.UPDATE_DATA_DETAILS: return createUpdateDataDetails();
			case TypesPackage.UPDATE_EVENT_DETAILS: return createUpdateEventDetails();
			case TypesPackage.UPDATE_STRUCTURE_DATA_DETAILS: return createUpdateStructureDataDetails();
			case TypesPackage.USER_IDENTITY_TOKEN: return createUserIdentityToken();
			case TypesPackage.USER_NAME_IDENTITY_TOKEN: return createUserNameIdentityToken();
			case TypesPackage.USER_TOKEN_POLICY: return createUserTokenPolicy();
			case TypesPackage.VALUE_TYPE: return createValueType();
			case TypesPackage.VARIABLE_ATTRIBUTES: return createVariableAttributes();
			case TypesPackage.VARIABLE_NODE: return createVariableNode();
			case TypesPackage.VARIABLE_TYPE_ATTRIBUTES: return createVariableTypeAttributes();
			case TypesPackage.VARIABLE_TYPE_NODE: return createVariableTypeNode();
			case TypesPackage.VARIANT: return createVariant();
			case TypesPackage.VECTOR: return createVector();
			case TypesPackage.VIEW_ATTRIBUTES: return createViewAttributes();
			case TypesPackage.VIEW_DESCRIPTION: return createViewDescription();
			case TypesPackage.VIEW_NODE: return createViewNode();
			case TypesPackage.WRITE_REQUEST: return createWriteRequest();
			case TypesPackage.WRITE_RESPONSE: return createWriteResponse();
			case TypesPackage.WRITER_GROUP_DATA_TYPE: return createWriterGroupDataType();
			case TypesPackage.WRITER_GROUP_MESSAGE_DATA_TYPE: return createWriterGroupMessageDataType();
			case TypesPackage.WRITER_GROUP_TRANSPORT_DATA_TYPE: return createWriterGroupTransportDataType();
			case TypesPackage.WRITE_VALUE: return createWriteValue();
			case TypesPackage.X509_IDENTITY_TOKEN: return createX509IdentityToken();
			case TypesPackage.XML_ELEMENT_TYPE: return createXmlElementType();
			case TypesPackage.XV_TYPE: return createXVType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TypesPackage.APPLICATION_TYPE:
				return createApplicationTypeFromString(eDataType, initialValue);
			case TypesPackage.AXIS_SCALE_ENUMERATION:
				return createAxisScaleEnumerationFromString(eDataType, initialValue);
			case TypesPackage.BROKER_TRANSPORT_QUALITY_OF_SERVICE:
				return createBrokerTransportQualityOfServiceFromString(eDataType, initialValue);
			case TypesPackage.BROWSE_DIRECTION:
				return createBrowseDirectionFromString(eDataType, initialValue);
			case TypesPackage.BROWSE_RESULT_MASK:
				return createBrowseResultMaskFromString(eDataType, initialValue);
			case TypesPackage.DATA_CHANGE_TRIGGER:
				return createDataChangeTriggerFromString(eDataType, initialValue);
			case TypesPackage.DATA_SET_ORDERING_TYPE:
				return createDataSetOrderingTypeFromString(eDataType, initialValue);
			case TypesPackage.DEADBAND_TYPE:
				return createDeadbandTypeFromString(eDataType, initialValue);
			case TypesPackage.DIAGNOSTICS_LEVEL:
				return createDiagnosticsLevelFromString(eDataType, initialValue);
			case TypesPackage.EXCEPTION_DEVIATION_FORMAT:
				return createExceptionDeviationFormatFromString(eDataType, initialValue);
			case TypesPackage.FILTER_OPERATOR:
				return createFilterOperatorFromString(eDataType, initialValue);
			case TypesPackage.HISTORY_UPDATE_TYPE:
				return createHistoryUpdateTypeFromString(eDataType, initialValue);
			case TypesPackage.IDENTITY_CRITERIA_TYPE:
				return createIdentityCriteriaTypeFromString(eDataType, initialValue);
			case TypesPackage.ID_TYPE:
				return createIdTypeFromString(eDataType, initialValue);
			case TypesPackage.MESSAGE_SECURITY_MODE:
				return createMessageSecurityModeFromString(eDataType, initialValue);
			case TypesPackage.MODEL_CHANGE_STRUCTURE_VERB_MASK:
				return createModelChangeStructureVerbMaskFromString(eDataType, initialValue);
			case TypesPackage.MONITORING_MODE:
				return createMonitoringModeFromString(eDataType, initialValue);
			case TypesPackage.NODE_ATTRIBUTES_MASK:
				return createNodeAttributesMaskFromString(eDataType, initialValue);
			case TypesPackage.NODE_CLASS:
				return createNodeClassFromString(eDataType, initialValue);
			case TypesPackage.OPEN_FILE_MODE:
				return createOpenFileModeFromString(eDataType, initialValue);
			case TypesPackage.OVERRIDE_VALUE_HANDLING:
				return createOverrideValueHandlingFromString(eDataType, initialValue);
			case TypesPackage.PERFORM_UPDATE_TYPE:
				return createPerformUpdateTypeFromString(eDataType, initialValue);
			case TypesPackage.PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION:
				return createPubSubDiagnosticsCounterClassificationFromString(eDataType, initialValue);
			case TypesPackage.PUB_SUB_STATE:
				return createPubSubStateFromString(eDataType, initialValue);
			case TypesPackage.REDUNDANCY_SUPPORT:
				return createRedundancySupportFromString(eDataType, initialValue);
			case TypesPackage.SECURITY_TOKEN_REQUEST_TYPE:
				return createSecurityTokenRequestTypeFromString(eDataType, initialValue);
			case TypesPackage.SERVER_STATE:
				return createServerStateFromString(eDataType, initialValue);
			case TypesPackage.STRUCTURE_TYPE:
				return createStructureTypeFromString(eDataType, initialValue);
			case TypesPackage.TIMESTAMPS_TO_RETURN:
				return createTimestampsToReturnFromString(eDataType, initialValue);
			case TypesPackage.TRUST_LIST_MASKS:
				return createTrustListMasksFromString(eDataType, initialValue);
			case TypesPackage.USER_TOKEN_TYPE:
				return createUserTokenTypeFromString(eDataType, initialValue);
			case TypesPackage.ACCESS_LEVEL_EX_TYPE:
				return createAccessLevelExTypeFromString(eDataType, initialValue);
			case TypesPackage.ACCESS_LEVEL_EX_TYPE_OBJECT:
				return createAccessLevelExTypeObjectFromString(eDataType, initialValue);
			case TypesPackage.ACCESS_LEVEL_TYPE:
				return createAccessLevelTypeFromString(eDataType, initialValue);
			case TypesPackage.ACCESS_LEVEL_TYPE_OBJECT:
				return createAccessLevelTypeObjectFromString(eDataType, initialValue);
			case TypesPackage.APPLICATION_TYPE_OBJECT:
				return createApplicationTypeObjectFromString(eDataType, initialValue);
			case TypesPackage.ATTRIBUTE_WRITE_MASK:
				return createAttributeWriteMaskFromString(eDataType, initialValue);
			case TypesPackage.ATTRIBUTE_WRITE_MASK_OBJECT:
				return createAttributeWriteMaskObjectFromString(eDataType, initialValue);
			case TypesPackage.AXIS_SCALE_ENUMERATION_OBJECT:
				return createAxisScaleEnumerationObjectFromString(eDataType, initialValue);
			case TypesPackage.BROKER_TRANSPORT_QUALITY_OF_SERVICE_OBJECT:
				return createBrokerTransportQualityOfServiceObjectFromString(eDataType, initialValue);
			case TypesPackage.BROWSE_DIRECTION_OBJECT:
				return createBrowseDirectionObjectFromString(eDataType, initialValue);
			case TypesPackage.BROWSE_RESULT_MASK_OBJECT:
				return createBrowseResultMaskObjectFromString(eDataType, initialValue);
			case TypesPackage.DATA_CHANGE_TRIGGER_OBJECT:
				return createDataChangeTriggerObjectFromString(eDataType, initialValue);
			case TypesPackage.DATA_SET_FIELD_CONTENT_MASK:
				return createDataSetFieldContentMaskFromString(eDataType, initialValue);
			case TypesPackage.DATA_SET_FIELD_CONTENT_MASK_OBJECT:
				return createDataSetFieldContentMaskObjectFromString(eDataType, initialValue);
			case TypesPackage.DATA_SET_FIELD_FLAGS:
				return createDataSetFieldFlagsFromString(eDataType, initialValue);
			case TypesPackage.DATA_SET_FIELD_FLAGS_OBJECT:
				return createDataSetFieldFlagsObjectFromString(eDataType, initialValue);
			case TypesPackage.DATA_SET_ORDERING_TYPE_OBJECT:
				return createDataSetOrderingTypeObjectFromString(eDataType, initialValue);
			case TypesPackage.DEADBAND_TYPE_OBJECT:
				return createDeadbandTypeObjectFromString(eDataType, initialValue);
			case TypesPackage.DIAGNOSTICS_LEVEL_OBJECT:
				return createDiagnosticsLevelObjectFromString(eDataType, initialValue);
			case TypesPackage.EVENT_NOTIFIER_TYPE:
				return createEventNotifierTypeFromString(eDataType, initialValue);
			case TypesPackage.EVENT_NOTIFIER_TYPE_OBJECT:
				return createEventNotifierTypeObjectFromString(eDataType, initialValue);
			case TypesPackage.EXCEPTION_DEVIATION_FORMAT_OBJECT:
				return createExceptionDeviationFormatObjectFromString(eDataType, initialValue);
			case TypesPackage.FILTER_OPERATOR_OBJECT:
				return createFilterOperatorObjectFromString(eDataType, initialValue);
			case TypesPackage.HISTORY_UPDATE_TYPE_OBJECT:
				return createHistoryUpdateTypeObjectFromString(eDataType, initialValue);
			case TypesPackage.IDENTITY_CRITERIA_TYPE_OBJECT:
				return createIdentityCriteriaTypeObjectFromString(eDataType, initialValue);
			case TypesPackage.ID_TYPE_OBJECT:
				return createIdTypeObjectFromString(eDataType, initialValue);
			case TypesPackage.JSON_DATA_SET_MESSAGE_CONTENT_MASK:
				return createJsonDataSetMessageContentMaskFromString(eDataType, initialValue);
			case TypesPackage.JSON_DATA_SET_MESSAGE_CONTENT_MASK_OBJECT:
				return createJsonDataSetMessageContentMaskObjectFromString(eDataType, initialValue);
			case TypesPackage.JSON_NETWORK_MESSAGE_CONTENT_MASK:
				return createJsonNetworkMessageContentMaskFromString(eDataType, initialValue);
			case TypesPackage.JSON_NETWORK_MESSAGE_CONTENT_MASK_OBJECT:
				return createJsonNetworkMessageContentMaskObjectFromString(eDataType, initialValue);
			case TypesPackage.MESSAGE_SECURITY_MODE_OBJECT:
				return createMessageSecurityModeObjectFromString(eDataType, initialValue);
			case TypesPackage.MODEL_CHANGE_STRUCTURE_VERB_MASK_OBJECT:
				return createModelChangeStructureVerbMaskObjectFromString(eDataType, initialValue);
			case TypesPackage.MONITORING_MODE_OBJECT:
				return createMonitoringModeObjectFromString(eDataType, initialValue);
			case TypesPackage.NODE_ATTRIBUTES_MASK_OBJECT:
				return createNodeAttributesMaskObjectFromString(eDataType, initialValue);
			case TypesPackage.NODE_CLASS_OBJECT:
				return createNodeClassObjectFromString(eDataType, initialValue);
			case TypesPackage.OPEN_FILE_MODE_OBJECT:
				return createOpenFileModeObjectFromString(eDataType, initialValue);
			case TypesPackage.OVERRIDE_VALUE_HANDLING_OBJECT:
				return createOverrideValueHandlingObjectFromString(eDataType, initialValue);
			case TypesPackage.PERFORM_UPDATE_TYPE_OBJECT:
				return createPerformUpdateTypeObjectFromString(eDataType, initialValue);
			case TypesPackage.PERMISSION_TYPE:
				return createPermissionTypeFromString(eDataType, initialValue);
			case TypesPackage.PERMISSION_TYPE_OBJECT:
				return createPermissionTypeObjectFromString(eDataType, initialValue);
			case TypesPackage.PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION_OBJECT:
				return createPubSubDiagnosticsCounterClassificationObjectFromString(eDataType, initialValue);
			case TypesPackage.PUB_SUB_STATE_OBJECT:
				return createPubSubStateObjectFromString(eDataType, initialValue);
			case TypesPackage.REDUNDANCY_SUPPORT_OBJECT:
				return createRedundancySupportObjectFromString(eDataType, initialValue);
			case TypesPackage.SECURITY_TOKEN_REQUEST_TYPE_OBJECT:
				return createSecurityTokenRequestTypeObjectFromString(eDataType, initialValue);
			case TypesPackage.SERVER_STATE_OBJECT:
				return createServerStateObjectFromString(eDataType, initialValue);
			case TypesPackage.STRUCTURE_TYPE_OBJECT:
				return createStructureTypeObjectFromString(eDataType, initialValue);
			case TypesPackage.TIMESTAMPS_TO_RETURN_OBJECT:
				return createTimestampsToReturnObjectFromString(eDataType, initialValue);
			case TypesPackage.TRUST_LIST_MASKS_OBJECT:
				return createTrustListMasksObjectFromString(eDataType, initialValue);
			case TypesPackage.UADP_DATA_SET_MESSAGE_CONTENT_MASK:
				return createUadpDataSetMessageContentMaskFromString(eDataType, initialValue);
			case TypesPackage.UADP_DATA_SET_MESSAGE_CONTENT_MASK_OBJECT:
				return createUadpDataSetMessageContentMaskObjectFromString(eDataType, initialValue);
			case TypesPackage.UADP_NETWORK_MESSAGE_CONTENT_MASK:
				return createUadpNetworkMessageContentMaskFromString(eDataType, initialValue);
			case TypesPackage.UADP_NETWORK_MESSAGE_CONTENT_MASK_OBJECT:
				return createUadpNetworkMessageContentMaskObjectFromString(eDataType, initialValue);
			case TypesPackage.USER_TOKEN_TYPE_OBJECT:
				return createUserTokenTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TypesPackage.APPLICATION_TYPE:
				return convertApplicationTypeToString(eDataType, instanceValue);
			case TypesPackage.AXIS_SCALE_ENUMERATION:
				return convertAxisScaleEnumerationToString(eDataType, instanceValue);
			case TypesPackage.BROKER_TRANSPORT_QUALITY_OF_SERVICE:
				return convertBrokerTransportQualityOfServiceToString(eDataType, instanceValue);
			case TypesPackage.BROWSE_DIRECTION:
				return convertBrowseDirectionToString(eDataType, instanceValue);
			case TypesPackage.BROWSE_RESULT_MASK:
				return convertBrowseResultMaskToString(eDataType, instanceValue);
			case TypesPackage.DATA_CHANGE_TRIGGER:
				return convertDataChangeTriggerToString(eDataType, instanceValue);
			case TypesPackage.DATA_SET_ORDERING_TYPE:
				return convertDataSetOrderingTypeToString(eDataType, instanceValue);
			case TypesPackage.DEADBAND_TYPE:
				return convertDeadbandTypeToString(eDataType, instanceValue);
			case TypesPackage.DIAGNOSTICS_LEVEL:
				return convertDiagnosticsLevelToString(eDataType, instanceValue);
			case TypesPackage.EXCEPTION_DEVIATION_FORMAT:
				return convertExceptionDeviationFormatToString(eDataType, instanceValue);
			case TypesPackage.FILTER_OPERATOR:
				return convertFilterOperatorToString(eDataType, instanceValue);
			case TypesPackage.HISTORY_UPDATE_TYPE:
				return convertHistoryUpdateTypeToString(eDataType, instanceValue);
			case TypesPackage.IDENTITY_CRITERIA_TYPE:
				return convertIdentityCriteriaTypeToString(eDataType, instanceValue);
			case TypesPackage.ID_TYPE:
				return convertIdTypeToString(eDataType, instanceValue);
			case TypesPackage.MESSAGE_SECURITY_MODE:
				return convertMessageSecurityModeToString(eDataType, instanceValue);
			case TypesPackage.MODEL_CHANGE_STRUCTURE_VERB_MASK:
				return convertModelChangeStructureVerbMaskToString(eDataType, instanceValue);
			case TypesPackage.MONITORING_MODE:
				return convertMonitoringModeToString(eDataType, instanceValue);
			case TypesPackage.NODE_ATTRIBUTES_MASK:
				return convertNodeAttributesMaskToString(eDataType, instanceValue);
			case TypesPackage.NODE_CLASS:
				return convertNodeClassToString(eDataType, instanceValue);
			case TypesPackage.OPEN_FILE_MODE:
				return convertOpenFileModeToString(eDataType, instanceValue);
			case TypesPackage.OVERRIDE_VALUE_HANDLING:
				return convertOverrideValueHandlingToString(eDataType, instanceValue);
			case TypesPackage.PERFORM_UPDATE_TYPE:
				return convertPerformUpdateTypeToString(eDataType, instanceValue);
			case TypesPackage.PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION:
				return convertPubSubDiagnosticsCounterClassificationToString(eDataType, instanceValue);
			case TypesPackage.PUB_SUB_STATE:
				return convertPubSubStateToString(eDataType, instanceValue);
			case TypesPackage.REDUNDANCY_SUPPORT:
				return convertRedundancySupportToString(eDataType, instanceValue);
			case TypesPackage.SECURITY_TOKEN_REQUEST_TYPE:
				return convertSecurityTokenRequestTypeToString(eDataType, instanceValue);
			case TypesPackage.SERVER_STATE:
				return convertServerStateToString(eDataType, instanceValue);
			case TypesPackage.STRUCTURE_TYPE:
				return convertStructureTypeToString(eDataType, instanceValue);
			case TypesPackage.TIMESTAMPS_TO_RETURN:
				return convertTimestampsToReturnToString(eDataType, instanceValue);
			case TypesPackage.TRUST_LIST_MASKS:
				return convertTrustListMasksToString(eDataType, instanceValue);
			case TypesPackage.USER_TOKEN_TYPE:
				return convertUserTokenTypeToString(eDataType, instanceValue);
			case TypesPackage.ACCESS_LEVEL_EX_TYPE:
				return convertAccessLevelExTypeToString(eDataType, instanceValue);
			case TypesPackage.ACCESS_LEVEL_EX_TYPE_OBJECT:
				return convertAccessLevelExTypeObjectToString(eDataType, instanceValue);
			case TypesPackage.ACCESS_LEVEL_TYPE:
				return convertAccessLevelTypeToString(eDataType, instanceValue);
			case TypesPackage.ACCESS_LEVEL_TYPE_OBJECT:
				return convertAccessLevelTypeObjectToString(eDataType, instanceValue);
			case TypesPackage.APPLICATION_TYPE_OBJECT:
				return convertApplicationTypeObjectToString(eDataType, instanceValue);
			case TypesPackage.ATTRIBUTE_WRITE_MASK:
				return convertAttributeWriteMaskToString(eDataType, instanceValue);
			case TypesPackage.ATTRIBUTE_WRITE_MASK_OBJECT:
				return convertAttributeWriteMaskObjectToString(eDataType, instanceValue);
			case TypesPackage.AXIS_SCALE_ENUMERATION_OBJECT:
				return convertAxisScaleEnumerationObjectToString(eDataType, instanceValue);
			case TypesPackage.BROKER_TRANSPORT_QUALITY_OF_SERVICE_OBJECT:
				return convertBrokerTransportQualityOfServiceObjectToString(eDataType, instanceValue);
			case TypesPackage.BROWSE_DIRECTION_OBJECT:
				return convertBrowseDirectionObjectToString(eDataType, instanceValue);
			case TypesPackage.BROWSE_RESULT_MASK_OBJECT:
				return convertBrowseResultMaskObjectToString(eDataType, instanceValue);
			case TypesPackage.DATA_CHANGE_TRIGGER_OBJECT:
				return convertDataChangeTriggerObjectToString(eDataType, instanceValue);
			case TypesPackage.DATA_SET_FIELD_CONTENT_MASK:
				return convertDataSetFieldContentMaskToString(eDataType, instanceValue);
			case TypesPackage.DATA_SET_FIELD_CONTENT_MASK_OBJECT:
				return convertDataSetFieldContentMaskObjectToString(eDataType, instanceValue);
			case TypesPackage.DATA_SET_FIELD_FLAGS:
				return convertDataSetFieldFlagsToString(eDataType, instanceValue);
			case TypesPackage.DATA_SET_FIELD_FLAGS_OBJECT:
				return convertDataSetFieldFlagsObjectToString(eDataType, instanceValue);
			case TypesPackage.DATA_SET_ORDERING_TYPE_OBJECT:
				return convertDataSetOrderingTypeObjectToString(eDataType, instanceValue);
			case TypesPackage.DEADBAND_TYPE_OBJECT:
				return convertDeadbandTypeObjectToString(eDataType, instanceValue);
			case TypesPackage.DIAGNOSTICS_LEVEL_OBJECT:
				return convertDiagnosticsLevelObjectToString(eDataType, instanceValue);
			case TypesPackage.EVENT_NOTIFIER_TYPE:
				return convertEventNotifierTypeToString(eDataType, instanceValue);
			case TypesPackage.EVENT_NOTIFIER_TYPE_OBJECT:
				return convertEventNotifierTypeObjectToString(eDataType, instanceValue);
			case TypesPackage.EXCEPTION_DEVIATION_FORMAT_OBJECT:
				return convertExceptionDeviationFormatObjectToString(eDataType, instanceValue);
			case TypesPackage.FILTER_OPERATOR_OBJECT:
				return convertFilterOperatorObjectToString(eDataType, instanceValue);
			case TypesPackage.HISTORY_UPDATE_TYPE_OBJECT:
				return convertHistoryUpdateTypeObjectToString(eDataType, instanceValue);
			case TypesPackage.IDENTITY_CRITERIA_TYPE_OBJECT:
				return convertIdentityCriteriaTypeObjectToString(eDataType, instanceValue);
			case TypesPackage.ID_TYPE_OBJECT:
				return convertIdTypeObjectToString(eDataType, instanceValue);
			case TypesPackage.JSON_DATA_SET_MESSAGE_CONTENT_MASK:
				return convertJsonDataSetMessageContentMaskToString(eDataType, instanceValue);
			case TypesPackage.JSON_DATA_SET_MESSAGE_CONTENT_MASK_OBJECT:
				return convertJsonDataSetMessageContentMaskObjectToString(eDataType, instanceValue);
			case TypesPackage.JSON_NETWORK_MESSAGE_CONTENT_MASK:
				return convertJsonNetworkMessageContentMaskToString(eDataType, instanceValue);
			case TypesPackage.JSON_NETWORK_MESSAGE_CONTENT_MASK_OBJECT:
				return convertJsonNetworkMessageContentMaskObjectToString(eDataType, instanceValue);
			case TypesPackage.MESSAGE_SECURITY_MODE_OBJECT:
				return convertMessageSecurityModeObjectToString(eDataType, instanceValue);
			case TypesPackage.MODEL_CHANGE_STRUCTURE_VERB_MASK_OBJECT:
				return convertModelChangeStructureVerbMaskObjectToString(eDataType, instanceValue);
			case TypesPackage.MONITORING_MODE_OBJECT:
				return convertMonitoringModeObjectToString(eDataType, instanceValue);
			case TypesPackage.NODE_ATTRIBUTES_MASK_OBJECT:
				return convertNodeAttributesMaskObjectToString(eDataType, instanceValue);
			case TypesPackage.NODE_CLASS_OBJECT:
				return convertNodeClassObjectToString(eDataType, instanceValue);
			case TypesPackage.OPEN_FILE_MODE_OBJECT:
				return convertOpenFileModeObjectToString(eDataType, instanceValue);
			case TypesPackage.OVERRIDE_VALUE_HANDLING_OBJECT:
				return convertOverrideValueHandlingObjectToString(eDataType, instanceValue);
			case TypesPackage.PERFORM_UPDATE_TYPE_OBJECT:
				return convertPerformUpdateTypeObjectToString(eDataType, instanceValue);
			case TypesPackage.PERMISSION_TYPE:
				return convertPermissionTypeToString(eDataType, instanceValue);
			case TypesPackage.PERMISSION_TYPE_OBJECT:
				return convertPermissionTypeObjectToString(eDataType, instanceValue);
			case TypesPackage.PUB_SUB_DIAGNOSTICS_COUNTER_CLASSIFICATION_OBJECT:
				return convertPubSubDiagnosticsCounterClassificationObjectToString(eDataType, instanceValue);
			case TypesPackage.PUB_SUB_STATE_OBJECT:
				return convertPubSubStateObjectToString(eDataType, instanceValue);
			case TypesPackage.REDUNDANCY_SUPPORT_OBJECT:
				return convertRedundancySupportObjectToString(eDataType, instanceValue);
			case TypesPackage.SECURITY_TOKEN_REQUEST_TYPE_OBJECT:
				return convertSecurityTokenRequestTypeObjectToString(eDataType, instanceValue);
			case TypesPackage.SERVER_STATE_OBJECT:
				return convertServerStateObjectToString(eDataType, instanceValue);
			case TypesPackage.STRUCTURE_TYPE_OBJECT:
				return convertStructureTypeObjectToString(eDataType, instanceValue);
			case TypesPackage.TIMESTAMPS_TO_RETURN_OBJECT:
				return convertTimestampsToReturnObjectToString(eDataType, instanceValue);
			case TypesPackage.TRUST_LIST_MASKS_OBJECT:
				return convertTrustListMasksObjectToString(eDataType, instanceValue);
			case TypesPackage.UADP_DATA_SET_MESSAGE_CONTENT_MASK:
				return convertUadpDataSetMessageContentMaskToString(eDataType, instanceValue);
			case TypesPackage.UADP_DATA_SET_MESSAGE_CONTENT_MASK_OBJECT:
				return convertUadpDataSetMessageContentMaskObjectToString(eDataType, instanceValue);
			case TypesPackage.UADP_NETWORK_MESSAGE_CONTENT_MASK:
				return convertUadpNetworkMessageContentMaskToString(eDataType, instanceValue);
			case TypesPackage.UADP_NETWORK_MESSAGE_CONTENT_MASK_OBJECT:
				return convertUadpNetworkMessageContentMaskObjectToString(eDataType, instanceValue);
			case TypesPackage.USER_TOKEN_TYPE_OBJECT:
				return convertUserTokenTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivateSessionRequest createActivateSessionRequest() {
		ActivateSessionRequestImpl activateSessionRequest = new ActivateSessionRequestImpl();
		return activateSessionRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivateSessionResponse createActivateSessionResponse() {
		ActivateSessionResponseImpl activateSessionResponse = new ActivateSessionResponseImpl();
		return activateSessionResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddNodesItem createAddNodesItem() {
		AddNodesItemImpl addNodesItem = new AddNodesItemImpl();
		return addNodesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddNodesRequest createAddNodesRequest() {
		AddNodesRequestImpl addNodesRequest = new AddNodesRequestImpl();
		return addNodesRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddNodesResponse createAddNodesResponse() {
		AddNodesResponseImpl addNodesResponse = new AddNodesResponseImpl();
		return addNodesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddNodesResult createAddNodesResult() {
		AddNodesResultImpl addNodesResult = new AddNodesResultImpl();
		return addNodesResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddReferencesItem createAddReferencesItem() {
		AddReferencesItemImpl addReferencesItem = new AddReferencesItemImpl();
		return addReferencesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddReferencesRequest createAddReferencesRequest() {
		AddReferencesRequestImpl addReferencesRequest = new AddReferencesRequestImpl();
		return addReferencesRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddReferencesResponse createAddReferencesResponse() {
		AddReferencesResponseImpl addReferencesResponse = new AddReferencesResponseImpl();
		return addReferencesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateConfiguration createAggregateConfiguration() {
		AggregateConfigurationImpl aggregateConfiguration = new AggregateConfigurationImpl();
		return aggregateConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateFilter createAggregateFilter() {
		AggregateFilterImpl aggregateFilter = new AggregateFilterImpl();
		return aggregateFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateFilterResult createAggregateFilterResult() {
		AggregateFilterResultImpl aggregateFilterResult = new AggregateFilterResultImpl();
		return aggregateFilterResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasNameDataType createAliasNameDataType() {
		AliasNameDataTypeImpl aliasNameDataType = new AliasNameDataTypeImpl();
		return aliasNameDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousIdentityToken createAnonymousIdentityToken() {
		AnonymousIdentityTokenImpl anonymousIdentityToken = new AnonymousIdentityTokenImpl();
		return anonymousIdentityToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDescription createApplicationDescription() {
		ApplicationDescriptionImpl applicationDescription = new ApplicationDescriptionImpl();
		return applicationDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOperand createAttributeOperand() {
		AttributeOperandImpl attributeOperand = new AttributeOperandImpl();
		return attributeOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisInformation createAxisInformation() {
		AxisInformationImpl axisInformation = new AxisInformationImpl();
		return axisInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyType createBodyType() {
		BodyTypeImpl bodyType = new BodyTypeImpl();
		return bodyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerConnectionTransportDataType createBrokerConnectionTransportDataType() {
		BrokerConnectionTransportDataTypeImpl brokerConnectionTransportDataType = new BrokerConnectionTransportDataTypeImpl();
		return brokerConnectionTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerDataSetReaderTransportDataType createBrokerDataSetReaderTransportDataType() {
		BrokerDataSetReaderTransportDataTypeImpl brokerDataSetReaderTransportDataType = new BrokerDataSetReaderTransportDataTypeImpl();
		return brokerDataSetReaderTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerDataSetWriterTransportDataType createBrokerDataSetWriterTransportDataType() {
		BrokerDataSetWriterTransportDataTypeImpl brokerDataSetWriterTransportDataType = new BrokerDataSetWriterTransportDataTypeImpl();
		return brokerDataSetWriterTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerWriterGroupTransportDataType createBrokerWriterGroupTransportDataType() {
		BrokerWriterGroupTransportDataTypeImpl brokerWriterGroupTransportDataType = new BrokerWriterGroupTransportDataTypeImpl();
		return brokerWriterGroupTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseDescription createBrowseDescription() {
		BrowseDescriptionImpl browseDescription = new BrowseDescriptionImpl();
		return browseDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseNextRequest createBrowseNextRequest() {
		BrowseNextRequestImpl browseNextRequest = new BrowseNextRequestImpl();
		return browseNextRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseNextResponse createBrowseNextResponse() {
		BrowseNextResponseImpl browseNextResponse = new BrowseNextResponseImpl();
		return browseNextResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowsePath createBrowsePath() {
		BrowsePathImpl browsePath = new BrowsePathImpl();
		return browsePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowsePathResult createBrowsePathResult() {
		BrowsePathResultImpl browsePathResult = new BrowsePathResultImpl();
		return browsePathResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowsePathTarget createBrowsePathTarget() {
		BrowsePathTargetImpl browsePathTarget = new BrowsePathTargetImpl();
		return browsePathTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseRequest createBrowseRequest() {
		BrowseRequestImpl browseRequest = new BrowseRequestImpl();
		return browseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseResponse createBrowseResponse() {
		BrowseResponseImpl browseResponse = new BrowseResponseImpl();
		return browseResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseResult createBrowseResult() {
		BrowseResultImpl browseResult = new BrowseResultImpl();
		return browseResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildInfo createBuildInfo() {
		BuildInfoImpl buildInfo = new BuildInfoImpl();
		return buildInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallMethodRequest createCallMethodRequest() {
		CallMethodRequestImpl callMethodRequest = new CallMethodRequestImpl();
		return callMethodRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallMethodResult createCallMethodResult() {
		CallMethodResultImpl callMethodResult = new CallMethodResultImpl();
		return callMethodResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallRequest createCallRequest() {
		CallRequestImpl callRequest = new CallRequestImpl();
		return callRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallResponse createCallResponse() {
		CallResponseImpl callResponse = new CallResponseImpl();
		return callResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelRequest createCancelRequest() {
		CancelRequestImpl cancelRequest = new CancelRequestImpl();
		return cancelRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelResponse createCancelResponse() {
		CancelResponseImpl cancelResponse = new CancelResponseImpl();
		return cancelResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinates createCartesianCoordinates() {
		CartesianCoordinatesImpl cartesianCoordinates = new CartesianCoordinatesImpl();
		return cartesianCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelSecurityToken createChannelSecurityToken() {
		ChannelSecurityTokenImpl channelSecurityToken = new ChannelSecurityTokenImpl();
		return channelSecurityToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloseSecureChannelRequest createCloseSecureChannelRequest() {
		CloseSecureChannelRequestImpl closeSecureChannelRequest = new CloseSecureChannelRequestImpl();
		return closeSecureChannelRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloseSecureChannelResponse createCloseSecureChannelResponse() {
		CloseSecureChannelResponseImpl closeSecureChannelResponse = new CloseSecureChannelResponseImpl();
		return closeSecureChannelResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloseSessionRequest createCloseSessionRequest() {
		CloseSessionRequestImpl closeSessionRequest = new CloseSessionRequestImpl();
		return closeSessionRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloseSessionResponse createCloseSessionResponse() {
		CloseSessionResponseImpl closeSessionResponse = new CloseSessionResponseImpl();
		return closeSessionResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexNumberType createComplexNumberType() {
		ComplexNumberTypeImpl complexNumberType = new ComplexNumberTypeImpl();
		return complexNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationVersionDataType createConfigurationVersionDataType() {
		ConfigurationVersionDataTypeImpl configurationVersionDataType = new ConfigurationVersionDataTypeImpl();
		return configurationVersionDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionTransportDataType createConnectionTransportDataType() {
		ConnectionTransportDataTypeImpl connectionTransportDataType = new ConnectionTransportDataTypeImpl();
		return connectionTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFilter createContentFilter() {
		ContentFilterImpl contentFilter = new ContentFilterImpl();
		return contentFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFilterElement createContentFilterElement() {
		ContentFilterElementImpl contentFilterElement = new ContentFilterElementImpl();
		return contentFilterElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFilterElementResult createContentFilterElementResult() {
		ContentFilterElementResultImpl contentFilterElementResult = new ContentFilterElementResultImpl();
		return contentFilterElementResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFilterResult createContentFilterResult() {
		ContentFilterResultImpl contentFilterResult = new ContentFilterResultImpl();
		return contentFilterResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateMonitoredItemsRequest createCreateMonitoredItemsRequest() {
		CreateMonitoredItemsRequestImpl createMonitoredItemsRequest = new CreateMonitoredItemsRequestImpl();
		return createMonitoredItemsRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateMonitoredItemsResponse createCreateMonitoredItemsResponse() {
		CreateMonitoredItemsResponseImpl createMonitoredItemsResponse = new CreateMonitoredItemsResponseImpl();
		return createMonitoredItemsResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateSessionRequest createCreateSessionRequest() {
		CreateSessionRequestImpl createSessionRequest = new CreateSessionRequestImpl();
		return createSessionRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateSessionResponse createCreateSessionResponse() {
		CreateSessionResponseImpl createSessionResponse = new CreateSessionResponseImpl();
		return createSessionResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateSubscriptionRequest createCreateSubscriptionRequest() {
		CreateSubscriptionRequestImpl createSubscriptionRequest = new CreateSubscriptionRequestImpl();
		return createSubscriptionRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateSubscriptionResponse createCreateSubscriptionResponse() {
		CreateSubscriptionResponseImpl createSubscriptionResponse = new CreateSubscriptionResponseImpl();
		return createSubscriptionResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyUnitType createCurrencyUnitType() {
		CurrencyUnitTypeImpl currencyUnitType = new CurrencyUnitTypeImpl();
		return currencyUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataChangeFilter createDataChangeFilter() {
		DataChangeFilterImpl dataChangeFilter = new DataChangeFilterImpl();
		return dataChangeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataChangeNotification createDataChangeNotification() {
		DataChangeNotificationImpl dataChangeNotification = new DataChangeNotificationImpl();
		return dataChangeNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatagramConnectionTransportDataType createDatagramConnectionTransportDataType() {
		DatagramConnectionTransportDataTypeImpl datagramConnectionTransportDataType = new DatagramConnectionTransportDataTypeImpl();
		return datagramConnectionTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatagramWriterGroupTransportDataType createDatagramWriterGroupTransportDataType() {
		DatagramWriterGroupTransportDataTypeImpl datagramWriterGroupTransportDataType = new DatagramWriterGroupTransportDataTypeImpl();
		return datagramWriterGroupTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetMetaDataType createDataSetMetaDataType() {
		DataSetMetaDataTypeImpl dataSetMetaDataType = new DataSetMetaDataTypeImpl();
		return dataSetMetaDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetReaderDataType createDataSetReaderDataType() {
		DataSetReaderDataTypeImpl dataSetReaderDataType = new DataSetReaderDataTypeImpl();
		return dataSetReaderDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetReaderMessageDataType createDataSetReaderMessageDataType() {
		DataSetReaderMessageDataTypeImpl dataSetReaderMessageDataType = new DataSetReaderMessageDataTypeImpl();
		return dataSetReaderMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetReaderTransportDataType createDataSetReaderTransportDataType() {
		DataSetReaderTransportDataTypeImpl dataSetReaderTransportDataType = new DataSetReaderTransportDataTypeImpl();
		return dataSetReaderTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetWriterDataType createDataSetWriterDataType() {
		DataSetWriterDataTypeImpl dataSetWriterDataType = new DataSetWriterDataTypeImpl();
		return dataSetWriterDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetWriterMessageDataType createDataSetWriterMessageDataType() {
		DataSetWriterMessageDataTypeImpl dataSetWriterMessageDataType = new DataSetWriterMessageDataTypeImpl();
		return dataSetWriterMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetWriterTransportDataType createDataSetWriterTransportDataType() {
		DataSetWriterTransportDataTypeImpl dataSetWriterTransportDataType = new DataSetWriterTransportDataTypeImpl();
		return dataSetWriterTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeAttributes createDataTypeAttributes() {
		DataTypeAttributesImpl dataTypeAttributes = new DataTypeAttributesImpl();
		return dataTypeAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeDefinition createDataTypeDefinition() {
		DataTypeDefinitionImpl dataTypeDefinition = new DataTypeDefinitionImpl();
		return dataTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeDescription createDataTypeDescription() {
		DataTypeDescriptionImpl dataTypeDescription = new DataTypeDescriptionImpl();
		return dataTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeNode createDataTypeNode() {
		DataTypeNodeImpl dataTypeNode = new DataTypeNodeImpl();
		return dataTypeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeSchemaHeader createDataTypeSchemaHeader() {
		DataTypeSchemaHeaderImpl dataTypeSchemaHeader = new DataTypeSchemaHeaderImpl();
		return dataTypeSchemaHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue createDataValue() {
		DataValueImpl dataValue = new DataValueImpl();
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalDataType createDecimalDataType() {
		DecimalDataTypeImpl decimalDataType = new DecimalDataTypeImpl();
		return decimalDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteAtTimeDetails createDeleteAtTimeDetails() {
		DeleteAtTimeDetailsImpl deleteAtTimeDetails = new DeleteAtTimeDetailsImpl();
		return deleteAtTimeDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteEventDetails createDeleteEventDetails() {
		DeleteEventDetailsImpl deleteEventDetails = new DeleteEventDetailsImpl();
		return deleteEventDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteMonitoredItemsRequest createDeleteMonitoredItemsRequest() {
		DeleteMonitoredItemsRequestImpl deleteMonitoredItemsRequest = new DeleteMonitoredItemsRequestImpl();
		return deleteMonitoredItemsRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteMonitoredItemsResponse createDeleteMonitoredItemsResponse() {
		DeleteMonitoredItemsResponseImpl deleteMonitoredItemsResponse = new DeleteMonitoredItemsResponseImpl();
		return deleteMonitoredItemsResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteNodesItem createDeleteNodesItem() {
		DeleteNodesItemImpl deleteNodesItem = new DeleteNodesItemImpl();
		return deleteNodesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteNodesRequest createDeleteNodesRequest() {
		DeleteNodesRequestImpl deleteNodesRequest = new DeleteNodesRequestImpl();
		return deleteNodesRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteNodesResponse createDeleteNodesResponse() {
		DeleteNodesResponseImpl deleteNodesResponse = new DeleteNodesResponseImpl();
		return deleteNodesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteRawModifiedDetails createDeleteRawModifiedDetails() {
		DeleteRawModifiedDetailsImpl deleteRawModifiedDetails = new DeleteRawModifiedDetailsImpl();
		return deleteRawModifiedDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteReferencesItem createDeleteReferencesItem() {
		DeleteReferencesItemImpl deleteReferencesItem = new DeleteReferencesItemImpl();
		return deleteReferencesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteReferencesRequest createDeleteReferencesRequest() {
		DeleteReferencesRequestImpl deleteReferencesRequest = new DeleteReferencesRequestImpl();
		return deleteReferencesRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteReferencesResponse createDeleteReferencesResponse() {
		DeleteReferencesResponseImpl deleteReferencesResponse = new DeleteReferencesResponseImpl();
		return deleteReferencesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteSubscriptionsRequest createDeleteSubscriptionsRequest() {
		DeleteSubscriptionsRequestImpl deleteSubscriptionsRequest = new DeleteSubscriptionsRequestImpl();
		return deleteSubscriptionsRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteSubscriptionsResponse createDeleteSubscriptionsResponse() {
		DeleteSubscriptionsResponseImpl deleteSubscriptionsResponse = new DeleteSubscriptionsResponseImpl();
		return deleteSubscriptionsResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticInfo createDiagnosticInfo() {
		DiagnosticInfoImpl diagnosticInfo = new DiagnosticInfoImpl();
		return diagnosticInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoveryConfiguration createDiscoveryConfiguration() {
		DiscoveryConfigurationImpl discoveryConfiguration = new DiscoveryConfigurationImpl();
		return discoveryConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleComplexNumberType createDoubleComplexNumberType() {
		DoubleComplexNumberTypeImpl doubleComplexNumberType = new DoubleComplexNumberTypeImpl();
		return doubleComplexNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementOperand createElementOperand() {
		ElementOperandImpl elementOperand = new ElementOperandImpl();
		return elementOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointConfiguration createEndpointConfiguration() {
		EndpointConfigurationImpl endpointConfiguration = new EndpointConfigurationImpl();
		return endpointConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointDescription createEndpointDescription() {
		EndpointDescriptionImpl endpointDescription = new EndpointDescriptionImpl();
		return endpointDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointType createEndpointType() {
		EndpointTypeImpl endpointType = new EndpointTypeImpl();
		return endpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointUrlListDataType createEndpointUrlListDataType() {
		EndpointUrlListDataTypeImpl endpointUrlListDataType = new EndpointUrlListDataTypeImpl();
		return endpointUrlListDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDefinition createEnumDefinition() {
		EnumDefinitionImpl enumDefinition = new EnumDefinitionImpl();
		return enumDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDescription createEnumDescription() {
		EnumDescriptionImpl enumDescription = new EnumDescriptionImpl();
		return enumDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumField createEnumField() {
		EnumFieldImpl enumField = new EnumFieldImpl();
		return enumField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValueType createEnumValueType() {
		EnumValueTypeImpl enumValueType = new EnumValueTypeImpl();
		return enumValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EUInformation createEUInformation() {
		EUInformationImpl euInformation = new EUInformationImpl();
		return euInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventFieldList createEventFieldList() {
		EventFieldListImpl eventFieldList = new EventFieldListImpl();
		return eventFieldList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventFilter createEventFilter() {
		EventFilterImpl eventFilter = new EventFilterImpl();
		return eventFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventFilterResult createEventFilterResult() {
		EventFilterResultImpl eventFilterResult = new EventFilterResultImpl();
		return eventFilterResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventNotificationList createEventNotificationList() {
		EventNotificationListImpl eventNotificationList = new EventNotificationListImpl();
		return eventNotificationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandedNodeId createExpandedNodeId() {
		ExpandedNodeIdImpl expandedNodeId = new ExpandedNodeIdImpl();
		return expandedNodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionObject createExtensionObject() {
		ExtensionObjectImpl extensionObject = new ExtensionObjectImpl();
		return extensionObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldMetaData createFieldMetaData() {
		FieldMetaDataImpl fieldMetaData = new FieldMetaDataImpl();
		return fieldMetaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldTargetDataType createFieldTargetDataType() {
		FieldTargetDataTypeImpl fieldTargetDataType = new FieldTargetDataTypeImpl();
		return fieldTargetDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperand createFilterOperand() {
		FilterOperandImpl filterOperand = new FilterOperandImpl();
		return filterOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindServersOnNetworkRequest createFindServersOnNetworkRequest() {
		FindServersOnNetworkRequestImpl findServersOnNetworkRequest = new FindServersOnNetworkRequestImpl();
		return findServersOnNetworkRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindServersOnNetworkResponse createFindServersOnNetworkResponse() {
		FindServersOnNetworkResponseImpl findServersOnNetworkResponse = new FindServersOnNetworkResponseImpl();
		return findServersOnNetworkResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindServersRequest createFindServersRequest() {
		FindServersRequestImpl findServersRequest = new FindServersRequestImpl();
		return findServersRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindServersResponse createFindServersResponse() {
		FindServersResponseImpl findServersResponse = new FindServersResponseImpl();
		return findServersResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame createFrame() {
		FrameImpl frame = new FrameImpl();
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAttributes createGenericAttributes() {
		GenericAttributesImpl genericAttributes = new GenericAttributesImpl();
		return genericAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAttributeValue createGenericAttributeValue() {
		GenericAttributeValueImpl genericAttributeValue = new GenericAttributeValueImpl();
		return genericAttributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetEndpointsRequest createGetEndpointsRequest() {
		GetEndpointsRequestImpl getEndpointsRequest = new GetEndpointsRequestImpl();
		return getEndpointsRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetEndpointsResponse createGetEndpointsResponse() {
		GetEndpointsResponseImpl getEndpointsResponse = new GetEndpointsResponseImpl();
		return getEndpointsResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guid createGuid() {
		GuidImpl guid = new GuidImpl();
		return guid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryData createHistoryData() {
		HistoryDataImpl historyData = new HistoryDataImpl();
		return historyData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryEvent createHistoryEvent() {
		HistoryEventImpl historyEvent = new HistoryEventImpl();
		return historyEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryEventFieldList createHistoryEventFieldList() {
		HistoryEventFieldListImpl historyEventFieldList = new HistoryEventFieldListImpl();
		return historyEventFieldList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryModifiedData createHistoryModifiedData() {
		HistoryModifiedDataImpl historyModifiedData = new HistoryModifiedDataImpl();
		return historyModifiedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryReadDetails createHistoryReadDetails() {
		HistoryReadDetailsImpl historyReadDetails = new HistoryReadDetailsImpl();
		return historyReadDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryReadRequest createHistoryReadRequest() {
		HistoryReadRequestImpl historyReadRequest = new HistoryReadRequestImpl();
		return historyReadRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryReadResponse createHistoryReadResponse() {
		HistoryReadResponseImpl historyReadResponse = new HistoryReadResponseImpl();
		return historyReadResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryReadResult createHistoryReadResult() {
		HistoryReadResultImpl historyReadResult = new HistoryReadResultImpl();
		return historyReadResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryReadValueId createHistoryReadValueId() {
		HistoryReadValueIdImpl historyReadValueId = new HistoryReadValueIdImpl();
		return historyReadValueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryUpdateDetails createHistoryUpdateDetails() {
		HistoryUpdateDetailsImpl historyUpdateDetails = new HistoryUpdateDetailsImpl();
		return historyUpdateDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryUpdateRequest createHistoryUpdateRequest() {
		HistoryUpdateRequestImpl historyUpdateRequest = new HistoryUpdateRequestImpl();
		return historyUpdateRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryUpdateResponse createHistoryUpdateResponse() {
		HistoryUpdateResponseImpl historyUpdateResponse = new HistoryUpdateResponseImpl();
		return historyUpdateResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryUpdateResult createHistoryUpdateResult() {
		HistoryUpdateResultImpl historyUpdateResult = new HistoryUpdateResultImpl();
		return historyUpdateResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityMappingRuleType createIdentityMappingRuleType() {
		IdentityMappingRuleTypeImpl identityMappingRuleType = new IdentityMappingRuleTypeImpl();
		return identityMappingRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceNode createInstanceNode() {
		InstanceNodeImpl instanceNode = new InstanceNodeImpl();
		return instanceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssuedIdentityToken createIssuedIdentityToken() {
		IssuedIdentityTokenImpl issuedIdentityToken = new IssuedIdentityTokenImpl();
		return issuedIdentityToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonDataSetReaderMessageDataType createJsonDataSetReaderMessageDataType() {
		JsonDataSetReaderMessageDataTypeImpl jsonDataSetReaderMessageDataType = new JsonDataSetReaderMessageDataTypeImpl();
		return jsonDataSetReaderMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonDataSetWriterMessageDataType createJsonDataSetWriterMessageDataType() {
		JsonDataSetWriterMessageDataTypeImpl jsonDataSetWriterMessageDataType = new JsonDataSetWriterMessageDataTypeImpl();
		return jsonDataSetWriterMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonWriterGroupMessageDataType createJsonWriterGroupMessageDataType() {
		JsonWriterGroupMessageDataTypeImpl jsonWriterGroupMessageDataType = new JsonWriterGroupMessageDataTypeImpl();
		return jsonWriterGroupMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValuePair createKeyValuePair() {
		KeyValuePairImpl keyValuePair = new KeyValuePairImpl();
		return keyValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfAddNodesItem createListOfAddNodesItem() {
		ListOfAddNodesItemImpl listOfAddNodesItem = new ListOfAddNodesItemImpl();
		return listOfAddNodesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfAddNodesResult createListOfAddNodesResult() {
		ListOfAddNodesResultImpl listOfAddNodesResult = new ListOfAddNodesResultImpl();
		return listOfAddNodesResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfAddReferencesItem createListOfAddReferencesItem() {
		ListOfAddReferencesItemImpl listOfAddReferencesItem = new ListOfAddReferencesItemImpl();
		return listOfAddReferencesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfAliasNameDataType createListOfAliasNameDataType() {
		ListOfAliasNameDataTypeImpl listOfAliasNameDataType = new ListOfAliasNameDataTypeImpl();
		return listOfAliasNameDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfApplicationDescription createListOfApplicationDescription() {
		ListOfApplicationDescriptionImpl listOfApplicationDescription = new ListOfApplicationDescriptionImpl();
		return listOfApplicationDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfArgument createListOfArgument() {
		ListOfArgumentImpl listOfArgument = new ListOfArgumentImpl();
		return listOfArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBoolean createListOfBoolean() {
		ListOfBooleanImpl listOfBoolean = new ListOfBooleanImpl();
		return listOfBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrokerConnectionTransportDataType createListOfBrokerConnectionTransportDataType() {
		ListOfBrokerConnectionTransportDataTypeImpl listOfBrokerConnectionTransportDataType = new ListOfBrokerConnectionTransportDataTypeImpl();
		return listOfBrokerConnectionTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrokerDataSetReaderTransportDataType createListOfBrokerDataSetReaderTransportDataType() {
		ListOfBrokerDataSetReaderTransportDataTypeImpl listOfBrokerDataSetReaderTransportDataType = new ListOfBrokerDataSetReaderTransportDataTypeImpl();
		return listOfBrokerDataSetReaderTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrokerDataSetWriterTransportDataType createListOfBrokerDataSetWriterTransportDataType() {
		ListOfBrokerDataSetWriterTransportDataTypeImpl listOfBrokerDataSetWriterTransportDataType = new ListOfBrokerDataSetWriterTransportDataTypeImpl();
		return listOfBrokerDataSetWriterTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrokerTransportQualityOfService createListOfBrokerTransportQualityOfService() {
		ListOfBrokerTransportQualityOfServiceImpl listOfBrokerTransportQualityOfService = new ListOfBrokerTransportQualityOfServiceImpl();
		return listOfBrokerTransportQualityOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrokerWriterGroupTransportDataType createListOfBrokerWriterGroupTransportDataType() {
		ListOfBrokerWriterGroupTransportDataTypeImpl listOfBrokerWriterGroupTransportDataType = new ListOfBrokerWriterGroupTransportDataTypeImpl();
		return listOfBrokerWriterGroupTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrowseDescription createListOfBrowseDescription() {
		ListOfBrowseDescriptionImpl listOfBrowseDescription = new ListOfBrowseDescriptionImpl();
		return listOfBrowseDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrowsePath createListOfBrowsePath() {
		ListOfBrowsePathImpl listOfBrowsePath = new ListOfBrowsePathImpl();
		return listOfBrowsePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrowsePathResult createListOfBrowsePathResult() {
		ListOfBrowsePathResultImpl listOfBrowsePathResult = new ListOfBrowsePathResultImpl();
		return listOfBrowsePathResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrowsePathTarget createListOfBrowsePathTarget() {
		ListOfBrowsePathTargetImpl listOfBrowsePathTarget = new ListOfBrowsePathTargetImpl();
		return listOfBrowsePathTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfBrowseResult createListOfBrowseResult() {
		ListOfBrowseResultImpl listOfBrowseResult = new ListOfBrowseResultImpl();
		return listOfBrowseResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfByte createListOfByte() {
		ListOfByteImpl listOfByte = new ListOfByteImpl();
		return listOfByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfByteString createListOfByteString() {
		ListOfByteStringImpl listOfByteString = new ListOfByteStringImpl();
		return listOfByteString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfCallMethodRequest createListOfCallMethodRequest() {
		ListOfCallMethodRequestImpl listOfCallMethodRequest = new ListOfCallMethodRequestImpl();
		return listOfCallMethodRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfCallMethodResult createListOfCallMethodResult() {
		ListOfCallMethodResultImpl listOfCallMethodResult = new ListOfCallMethodResultImpl();
		return listOfCallMethodResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfCartesianCoordinates createListOfCartesianCoordinates() {
		ListOfCartesianCoordinatesImpl listOfCartesianCoordinates = new ListOfCartesianCoordinatesImpl();
		return listOfCartesianCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfConfigurationVersionDataType createListOfConfigurationVersionDataType() {
		ListOfConfigurationVersionDataTypeImpl listOfConfigurationVersionDataType = new ListOfConfigurationVersionDataTypeImpl();
		return listOfConfigurationVersionDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfConnectionTransportDataType createListOfConnectionTransportDataType() {
		ListOfConnectionTransportDataTypeImpl listOfConnectionTransportDataType = new ListOfConnectionTransportDataTypeImpl();
		return listOfConnectionTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfContentFilter createListOfContentFilter() {
		ListOfContentFilterImpl listOfContentFilter = new ListOfContentFilterImpl();
		return listOfContentFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfContentFilterElement createListOfContentFilterElement() {
		ListOfContentFilterElementImpl listOfContentFilterElement = new ListOfContentFilterElementImpl();
		return listOfContentFilterElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfContentFilterElementResult createListOfContentFilterElementResult() {
		ListOfContentFilterElementResultImpl listOfContentFilterElementResult = new ListOfContentFilterElementResultImpl();
		return listOfContentFilterElementResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfCurrencyUnitType createListOfCurrencyUnitType() {
		ListOfCurrencyUnitTypeImpl listOfCurrencyUnitType = new ListOfCurrencyUnitTypeImpl();
		return listOfCurrencyUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDatagramConnectionTransportDataType createListOfDatagramConnectionTransportDataType() {
		ListOfDatagramConnectionTransportDataTypeImpl listOfDatagramConnectionTransportDataType = new ListOfDatagramConnectionTransportDataTypeImpl();
		return listOfDatagramConnectionTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDatagramWriterGroupTransportDataType createListOfDatagramWriterGroupTransportDataType() {
		ListOfDatagramWriterGroupTransportDataTypeImpl listOfDatagramWriterGroupTransportDataType = new ListOfDatagramWriterGroupTransportDataTypeImpl();
		return listOfDatagramWriterGroupTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetFieldContentMask createListOfDataSetFieldContentMask() {
		ListOfDataSetFieldContentMaskImpl listOfDataSetFieldContentMask = new ListOfDataSetFieldContentMaskImpl();
		return listOfDataSetFieldContentMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetMetaDataType createListOfDataSetMetaDataType() {
		ListOfDataSetMetaDataTypeImpl listOfDataSetMetaDataType = new ListOfDataSetMetaDataTypeImpl();
		return listOfDataSetMetaDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetOrderingType createListOfDataSetOrderingType() {
		ListOfDataSetOrderingTypeImpl listOfDataSetOrderingType = new ListOfDataSetOrderingTypeImpl();
		return listOfDataSetOrderingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetReaderDataType createListOfDataSetReaderDataType() {
		ListOfDataSetReaderDataTypeImpl listOfDataSetReaderDataType = new ListOfDataSetReaderDataTypeImpl();
		return listOfDataSetReaderDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetReaderMessageDataType createListOfDataSetReaderMessageDataType() {
		ListOfDataSetReaderMessageDataTypeImpl listOfDataSetReaderMessageDataType = new ListOfDataSetReaderMessageDataTypeImpl();
		return listOfDataSetReaderMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetReaderTransportDataType createListOfDataSetReaderTransportDataType() {
		ListOfDataSetReaderTransportDataTypeImpl listOfDataSetReaderTransportDataType = new ListOfDataSetReaderTransportDataTypeImpl();
		return listOfDataSetReaderTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetWriterDataType createListOfDataSetWriterDataType() {
		ListOfDataSetWriterDataTypeImpl listOfDataSetWriterDataType = new ListOfDataSetWriterDataTypeImpl();
		return listOfDataSetWriterDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetWriterMessageDataType createListOfDataSetWriterMessageDataType() {
		ListOfDataSetWriterMessageDataTypeImpl listOfDataSetWriterMessageDataType = new ListOfDataSetWriterMessageDataTypeImpl();
		return listOfDataSetWriterMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataSetWriterTransportDataType createListOfDataSetWriterTransportDataType() {
		ListOfDataSetWriterTransportDataTypeImpl listOfDataSetWriterTransportDataType = new ListOfDataSetWriterTransportDataTypeImpl();
		return listOfDataSetWriterTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataTypeDefinition createListOfDataTypeDefinition() {
		ListOfDataTypeDefinitionImpl listOfDataTypeDefinition = new ListOfDataTypeDefinitionImpl();
		return listOfDataTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataTypeDescription createListOfDataTypeDescription() {
		ListOfDataTypeDescriptionImpl listOfDataTypeDescription = new ListOfDataTypeDescriptionImpl();
		return listOfDataTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataTypeSchemaHeader createListOfDataTypeSchemaHeader() {
		ListOfDataTypeSchemaHeaderImpl listOfDataTypeSchemaHeader = new ListOfDataTypeSchemaHeaderImpl();
		return listOfDataTypeSchemaHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDataValue createListOfDataValue() {
		ListOfDataValueImpl listOfDataValue = new ListOfDataValueImpl();
		return listOfDataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDateTime createListOfDateTime() {
		ListOfDateTimeImpl listOfDateTime = new ListOfDateTimeImpl();
		return listOfDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDeleteNodesItem createListOfDeleteNodesItem() {
		ListOfDeleteNodesItemImpl listOfDeleteNodesItem = new ListOfDeleteNodesItemImpl();
		return listOfDeleteNodesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDeleteReferencesItem createListOfDeleteReferencesItem() {
		ListOfDeleteReferencesItemImpl listOfDeleteReferencesItem = new ListOfDeleteReferencesItemImpl();
		return listOfDeleteReferencesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDiagnosticInfo createListOfDiagnosticInfo() {
		ListOfDiagnosticInfoImpl listOfDiagnosticInfo = new ListOfDiagnosticInfoImpl();
		return listOfDiagnosticInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDiagnosticsLevel createListOfDiagnosticsLevel() {
		ListOfDiagnosticsLevelImpl listOfDiagnosticsLevel = new ListOfDiagnosticsLevelImpl();
		return listOfDiagnosticsLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDouble createListOfDouble() {
		ListOfDoubleImpl listOfDouble = new ListOfDoubleImpl();
		return listOfDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEndpointConfiguration createListOfEndpointConfiguration() {
		ListOfEndpointConfigurationImpl listOfEndpointConfiguration = new ListOfEndpointConfigurationImpl();
		return listOfEndpointConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEndpointDescription createListOfEndpointDescription() {
		ListOfEndpointDescriptionImpl listOfEndpointDescription = new ListOfEndpointDescriptionImpl();
		return listOfEndpointDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEndpointType createListOfEndpointType() {
		ListOfEndpointTypeImpl listOfEndpointType = new ListOfEndpointTypeImpl();
		return listOfEndpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEndpointUrlListDataType createListOfEndpointUrlListDataType() {
		ListOfEndpointUrlListDataTypeImpl listOfEndpointUrlListDataType = new ListOfEndpointUrlListDataTypeImpl();
		return listOfEndpointUrlListDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEnumDefinition createListOfEnumDefinition() {
		ListOfEnumDefinitionImpl listOfEnumDefinition = new ListOfEnumDefinitionImpl();
		return listOfEnumDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEnumDescription createListOfEnumDescription() {
		ListOfEnumDescriptionImpl listOfEnumDescription = new ListOfEnumDescriptionImpl();
		return listOfEnumDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEnumField createListOfEnumField() {
		ListOfEnumFieldImpl listOfEnumField = new ListOfEnumFieldImpl();
		return listOfEnumField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEnumValueType createListOfEnumValueType() {
		ListOfEnumValueTypeImpl listOfEnumValueType = new ListOfEnumValueTypeImpl();
		return listOfEnumValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfEventFieldList createListOfEventFieldList() {
		ListOfEventFieldListImpl listOfEventFieldList = new ListOfEventFieldListImpl();
		return listOfEventFieldList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfExpandedNodeId createListOfExpandedNodeId() {
		ListOfExpandedNodeIdImpl listOfExpandedNodeId = new ListOfExpandedNodeIdImpl();
		return listOfExpandedNodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfExtensionObject createListOfExtensionObject() {
		ListOfExtensionObjectImpl listOfExtensionObject = new ListOfExtensionObjectImpl();
		return listOfExtensionObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfFieldMetaData createListOfFieldMetaData() {
		ListOfFieldMetaDataImpl listOfFieldMetaData = new ListOfFieldMetaDataImpl();
		return listOfFieldMetaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfFieldTargetDataType createListOfFieldTargetDataType() {
		ListOfFieldTargetDataTypeImpl listOfFieldTargetDataType = new ListOfFieldTargetDataTypeImpl();
		return listOfFieldTargetDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfFloat createListOfFloat() {
		ListOfFloatImpl listOfFloat = new ListOfFloatImpl();
		return listOfFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfFrame createListOfFrame() {
		ListOfFrameImpl listOfFrame = new ListOfFrameImpl();
		return listOfFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfGenericAttributeValue createListOfGenericAttributeValue() {
		ListOfGenericAttributeValueImpl listOfGenericAttributeValue = new ListOfGenericAttributeValueImpl();
		return listOfGenericAttributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfGuid createListOfGuid() {
		ListOfGuidImpl listOfGuid = new ListOfGuidImpl();
		return listOfGuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfHistoryEventFieldList createListOfHistoryEventFieldList() {
		ListOfHistoryEventFieldListImpl listOfHistoryEventFieldList = new ListOfHistoryEventFieldListImpl();
		return listOfHistoryEventFieldList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfHistoryReadResult createListOfHistoryReadResult() {
		ListOfHistoryReadResultImpl listOfHistoryReadResult = new ListOfHistoryReadResultImpl();
		return listOfHistoryReadResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfHistoryReadValueId createListOfHistoryReadValueId() {
		ListOfHistoryReadValueIdImpl listOfHistoryReadValueId = new ListOfHistoryReadValueIdImpl();
		return listOfHistoryReadValueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfHistoryUpdateResult createListOfHistoryUpdateResult() {
		ListOfHistoryUpdateResultImpl listOfHistoryUpdateResult = new ListOfHistoryUpdateResultImpl();
		return listOfHistoryUpdateResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfIdentityCriteriaType createListOfIdentityCriteriaType() {
		ListOfIdentityCriteriaTypeImpl listOfIdentityCriteriaType = new ListOfIdentityCriteriaTypeImpl();
		return listOfIdentityCriteriaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfIdentityMappingRuleType createListOfIdentityMappingRuleType() {
		ListOfIdentityMappingRuleTypeImpl listOfIdentityMappingRuleType = new ListOfIdentityMappingRuleTypeImpl();
		return listOfIdentityMappingRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfIdType createListOfIdType() {
		ListOfIdTypeImpl listOfIdType = new ListOfIdTypeImpl();
		return listOfIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfInt16 createListOfInt16() {
		ListOfInt16Impl listOfInt16 = new ListOfInt16Impl();
		return listOfInt16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfInt32 createListOfInt32() {
		ListOfInt32Impl listOfInt32 = new ListOfInt32Impl();
		return listOfInt32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfInt64 createListOfInt64() {
		ListOfInt64Impl listOfInt64 = new ListOfInt64Impl();
		return listOfInt64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfJsonDataSetMessageContentMask createListOfJsonDataSetMessageContentMask() {
		ListOfJsonDataSetMessageContentMaskImpl listOfJsonDataSetMessageContentMask = new ListOfJsonDataSetMessageContentMaskImpl();
		return listOfJsonDataSetMessageContentMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfJsonDataSetReaderMessageDataType createListOfJsonDataSetReaderMessageDataType() {
		ListOfJsonDataSetReaderMessageDataTypeImpl listOfJsonDataSetReaderMessageDataType = new ListOfJsonDataSetReaderMessageDataTypeImpl();
		return listOfJsonDataSetReaderMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfJsonDataSetWriterMessageDataType createListOfJsonDataSetWriterMessageDataType() {
		ListOfJsonDataSetWriterMessageDataTypeImpl listOfJsonDataSetWriterMessageDataType = new ListOfJsonDataSetWriterMessageDataTypeImpl();
		return listOfJsonDataSetWriterMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfJsonNetworkMessageContentMask createListOfJsonNetworkMessageContentMask() {
		ListOfJsonNetworkMessageContentMaskImpl listOfJsonNetworkMessageContentMask = new ListOfJsonNetworkMessageContentMaskImpl();
		return listOfJsonNetworkMessageContentMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfJsonWriterGroupMessageDataType createListOfJsonWriterGroupMessageDataType() {
		ListOfJsonWriterGroupMessageDataTypeImpl listOfJsonWriterGroupMessageDataType = new ListOfJsonWriterGroupMessageDataTypeImpl();
		return listOfJsonWriterGroupMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfKeyValuePair createListOfKeyValuePair() {
		ListOfKeyValuePairImpl listOfKeyValuePair = new ListOfKeyValuePairImpl();
		return listOfKeyValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfLocalizedText createListOfLocalizedText() {
		ListOfLocalizedTextImpl listOfLocalizedText = new ListOfLocalizedTextImpl();
		return listOfLocalizedText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfModelChangeStructureDataType createListOfModelChangeStructureDataType() {
		ListOfModelChangeStructureDataTypeImpl listOfModelChangeStructureDataType = new ListOfModelChangeStructureDataTypeImpl();
		return listOfModelChangeStructureDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfModificationInfo createListOfModificationInfo() {
		ListOfModificationInfoImpl listOfModificationInfo = new ListOfModificationInfoImpl();
		return listOfModificationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfMonitoredItemCreateRequest createListOfMonitoredItemCreateRequest() {
		ListOfMonitoredItemCreateRequestImpl listOfMonitoredItemCreateRequest = new ListOfMonitoredItemCreateRequestImpl();
		return listOfMonitoredItemCreateRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfMonitoredItemCreateResult createListOfMonitoredItemCreateResult() {
		ListOfMonitoredItemCreateResultImpl listOfMonitoredItemCreateResult = new ListOfMonitoredItemCreateResultImpl();
		return listOfMonitoredItemCreateResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfMonitoredItemModifyRequest createListOfMonitoredItemModifyRequest() {
		ListOfMonitoredItemModifyRequestImpl listOfMonitoredItemModifyRequest = new ListOfMonitoredItemModifyRequestImpl();
		return listOfMonitoredItemModifyRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfMonitoredItemModifyResult createListOfMonitoredItemModifyResult() {
		ListOfMonitoredItemModifyResultImpl listOfMonitoredItemModifyResult = new ListOfMonitoredItemModifyResultImpl();
		return listOfMonitoredItemModifyResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfMonitoredItemNotification createListOfMonitoredItemNotification() {
		ListOfMonitoredItemNotificationImpl listOfMonitoredItemNotification = new ListOfMonitoredItemNotificationImpl();
		return listOfMonitoredItemNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfNetworkAddressDataType createListOfNetworkAddressDataType() {
		ListOfNetworkAddressDataTypeImpl listOfNetworkAddressDataType = new ListOfNetworkAddressDataTypeImpl();
		return listOfNetworkAddressDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfNetworkAddressUrlDataType createListOfNetworkAddressUrlDataType() {
		ListOfNetworkAddressUrlDataTypeImpl listOfNetworkAddressUrlDataType = new ListOfNetworkAddressUrlDataTypeImpl();
		return listOfNetworkAddressUrlDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfNetworkGroupDataType createListOfNetworkGroupDataType() {
		ListOfNetworkGroupDataTypeImpl listOfNetworkGroupDataType = new ListOfNetworkGroupDataTypeImpl();
		return listOfNetworkGroupDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfNode createListOfNode() {
		ListOfNodeImpl listOfNode = new ListOfNodeImpl();
		return listOfNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfNodeId createListOfNodeId() {
		ListOfNodeIdImpl listOfNodeId = new ListOfNodeIdImpl();
		return listOfNodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfNodeReference createListOfNodeReference() {
		ListOfNodeReferenceImpl listOfNodeReference = new ListOfNodeReferenceImpl();
		return listOfNodeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfNodeTypeDescription createListOfNodeTypeDescription() {
		ListOfNodeTypeDescriptionImpl listOfNodeTypeDescription = new ListOfNodeTypeDescriptionImpl();
		return listOfNodeTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfOpenFileMode createListOfOpenFileMode() {
		ListOfOpenFileModeImpl listOfOpenFileMode = new ListOfOpenFileModeImpl();
		return listOfOpenFileMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfOptionSet createListOfOptionSet() {
		ListOfOptionSetImpl listOfOptionSet = new ListOfOptionSetImpl();
		return listOfOptionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfOrientation createListOfOrientation() {
		ListOfOrientationImpl listOfOrientation = new ListOfOrientationImpl();
		return listOfOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfOverrideValueHandling createListOfOverrideValueHandling() {
		ListOfOverrideValueHandlingImpl listOfOverrideValueHandling = new ListOfOverrideValueHandlingImpl();
		return listOfOverrideValueHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfParsingResult createListOfParsingResult() {
		ListOfParsingResultImpl listOfParsingResult = new ListOfParsingResultImpl();
		return listOfParsingResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPublishedDataItemsDataType createListOfPublishedDataItemsDataType() {
		ListOfPublishedDataItemsDataTypeImpl listOfPublishedDataItemsDataType = new ListOfPublishedDataItemsDataTypeImpl();
		return listOfPublishedDataItemsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPublishedDataSetDataType createListOfPublishedDataSetDataType() {
		ListOfPublishedDataSetDataTypeImpl listOfPublishedDataSetDataType = new ListOfPublishedDataSetDataTypeImpl();
		return listOfPublishedDataSetDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPublishedDataSetSourceDataType createListOfPublishedDataSetSourceDataType() {
		ListOfPublishedDataSetSourceDataTypeImpl listOfPublishedDataSetSourceDataType = new ListOfPublishedDataSetSourceDataTypeImpl();
		return listOfPublishedDataSetSourceDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPublishedEventsDataType createListOfPublishedEventsDataType() {
		ListOfPublishedEventsDataTypeImpl listOfPublishedEventsDataType = new ListOfPublishedEventsDataTypeImpl();
		return listOfPublishedEventsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPublishedVariableDataType createListOfPublishedVariableDataType() {
		ListOfPublishedVariableDataTypeImpl listOfPublishedVariableDataType = new ListOfPublishedVariableDataTypeImpl();
		return listOfPublishedVariableDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPubSubConfigurationDataType createListOfPubSubConfigurationDataType() {
		ListOfPubSubConfigurationDataTypeImpl listOfPubSubConfigurationDataType = new ListOfPubSubConfigurationDataTypeImpl();
		return listOfPubSubConfigurationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPubSubConnectionDataType createListOfPubSubConnectionDataType() {
		ListOfPubSubConnectionDataTypeImpl listOfPubSubConnectionDataType = new ListOfPubSubConnectionDataTypeImpl();
		return listOfPubSubConnectionDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPubSubDiagnosticsCounterClassification createListOfPubSubDiagnosticsCounterClassification() {
		ListOfPubSubDiagnosticsCounterClassificationImpl listOfPubSubDiagnosticsCounterClassification = new ListOfPubSubDiagnosticsCounterClassificationImpl();
		return listOfPubSubDiagnosticsCounterClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPubSubGroupDataType createListOfPubSubGroupDataType() {
		ListOfPubSubGroupDataTypeImpl listOfPubSubGroupDataType = new ListOfPubSubGroupDataTypeImpl();
		return listOfPubSubGroupDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfPubSubState createListOfPubSubState() {
		ListOfPubSubStateImpl listOfPubSubState = new ListOfPubSubStateImpl();
		return listOfPubSubState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfQualifiedName createListOfQualifiedName() {
		ListOfQualifiedNameImpl listOfQualifiedName = new ListOfQualifiedNameImpl();
		return listOfQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfQueryDataDescription createListOfQueryDataDescription() {
		ListOfQueryDataDescriptionImpl listOfQueryDataDescription = new ListOfQueryDataDescriptionImpl();
		return listOfQueryDataDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfQueryDataSet createListOfQueryDataSet() {
		ListOfQueryDataSetImpl listOfQueryDataSet = new ListOfQueryDataSetImpl();
		return listOfQueryDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfRationalNumber createListOfRationalNumber() {
		ListOfRationalNumberImpl listOfRationalNumber = new ListOfRationalNumberImpl();
		return listOfRationalNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfReaderGroupDataType createListOfReaderGroupDataType() {
		ListOfReaderGroupDataTypeImpl listOfReaderGroupDataType = new ListOfReaderGroupDataTypeImpl();
		return listOfReaderGroupDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfReaderGroupMessageDataType createListOfReaderGroupMessageDataType() {
		ListOfReaderGroupMessageDataTypeImpl listOfReaderGroupMessageDataType = new ListOfReaderGroupMessageDataTypeImpl();
		return listOfReaderGroupMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfReaderGroupTransportDataType createListOfReaderGroupTransportDataType() {
		ListOfReaderGroupTransportDataTypeImpl listOfReaderGroupTransportDataType = new ListOfReaderGroupTransportDataTypeImpl();
		return listOfReaderGroupTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfReadValueId createListOfReadValueId() {
		ListOfReadValueIdImpl listOfReadValueId = new ListOfReadValueIdImpl();
		return listOfReadValueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfRedundantServerDataType createListOfRedundantServerDataType() {
		ListOfRedundantServerDataTypeImpl listOfRedundantServerDataType = new ListOfRedundantServerDataTypeImpl();
		return listOfRedundantServerDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfReferenceDescription createListOfReferenceDescription() {
		ListOfReferenceDescriptionImpl listOfReferenceDescription = new ListOfReferenceDescriptionImpl();
		return listOfReferenceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfReferenceNode createListOfReferenceNode() {
		ListOfReferenceNodeImpl listOfReferenceNode = new ListOfReferenceNodeImpl();
		return listOfReferenceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfRegisteredServer createListOfRegisteredServer() {
		ListOfRegisteredServerImpl listOfRegisteredServer = new ListOfRegisteredServerImpl();
		return listOfRegisteredServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfRelativePathElement createListOfRelativePathElement() {
		ListOfRelativePathElementImpl listOfRelativePathElement = new ListOfRelativePathElementImpl();
		return listOfRelativePathElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfRolePermissionType createListOfRolePermissionType() {
		ListOfRolePermissionTypeImpl listOfRolePermissionType = new ListOfRolePermissionTypeImpl();
		return listOfRolePermissionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSamplingIntervalDiagnosticsDataType createListOfSamplingIntervalDiagnosticsDataType() {
		ListOfSamplingIntervalDiagnosticsDataTypeImpl listOfSamplingIntervalDiagnosticsDataType = new ListOfSamplingIntervalDiagnosticsDataTypeImpl();
		return listOfSamplingIntervalDiagnosticsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSByte createListOfSByte() {
		ListOfSByteImpl listOfSByte = new ListOfSByteImpl();
		return listOfSByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSemanticChangeStructureDataType createListOfSemanticChangeStructureDataType() {
		ListOfSemanticChangeStructureDataTypeImpl listOfSemanticChangeStructureDataType = new ListOfSemanticChangeStructureDataTypeImpl();
		return listOfSemanticChangeStructureDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfServerOnNetwork createListOfServerOnNetwork() {
		ListOfServerOnNetworkImpl listOfServerOnNetwork = new ListOfServerOnNetworkImpl();
		return listOfServerOnNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSessionDiagnosticsDataType createListOfSessionDiagnosticsDataType() {
		ListOfSessionDiagnosticsDataTypeImpl listOfSessionDiagnosticsDataType = new ListOfSessionDiagnosticsDataTypeImpl();
		return listOfSessionDiagnosticsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSessionSecurityDiagnosticsDataType createListOfSessionSecurityDiagnosticsDataType() {
		ListOfSessionSecurityDiagnosticsDataTypeImpl listOfSessionSecurityDiagnosticsDataType = new ListOfSessionSecurityDiagnosticsDataTypeImpl();
		return listOfSessionSecurityDiagnosticsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSignedSoftwareCertificate createListOfSignedSoftwareCertificate() {
		ListOfSignedSoftwareCertificateImpl listOfSignedSoftwareCertificate = new ListOfSignedSoftwareCertificateImpl();
		return listOfSignedSoftwareCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSimpleAttributeOperand createListOfSimpleAttributeOperand() {
		ListOfSimpleAttributeOperandImpl listOfSimpleAttributeOperand = new ListOfSimpleAttributeOperandImpl();
		return listOfSimpleAttributeOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSimpleTypeDescription createListOfSimpleTypeDescription() {
		ListOfSimpleTypeDescriptionImpl listOfSimpleTypeDescription = new ListOfSimpleTypeDescriptionImpl();
		return listOfSimpleTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStatusCode createListOfStatusCode() {
		ListOfStatusCodeImpl listOfStatusCode = new ListOfStatusCodeImpl();
		return listOfStatusCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStatusResult createListOfStatusResult() {
		ListOfStatusResultImpl listOfStatusResult = new ListOfStatusResultImpl();
		return listOfStatusResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfString createListOfString() {
		ListOfStringImpl listOfString = new ListOfStringImpl();
		return listOfString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStructureDefinition createListOfStructureDefinition() {
		ListOfStructureDefinitionImpl listOfStructureDefinition = new ListOfStructureDefinitionImpl();
		return listOfStructureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStructureDescription createListOfStructureDescription() {
		ListOfStructureDescriptionImpl listOfStructureDescription = new ListOfStructureDescriptionImpl();
		return listOfStructureDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfStructureField createListOfStructureField() {
		ListOfStructureFieldImpl listOfStructureField = new ListOfStructureFieldImpl();
		return listOfStructureField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSubscribedDataSetDataType createListOfSubscribedDataSetDataType() {
		ListOfSubscribedDataSetDataTypeImpl listOfSubscribedDataSetDataType = new ListOfSubscribedDataSetDataTypeImpl();
		return listOfSubscribedDataSetDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSubscribedDataSetMirrorDataType createListOfSubscribedDataSetMirrorDataType() {
		ListOfSubscribedDataSetMirrorDataTypeImpl listOfSubscribedDataSetMirrorDataType = new ListOfSubscribedDataSetMirrorDataTypeImpl();
		return listOfSubscribedDataSetMirrorDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSubscriptionAcknowledgement createListOfSubscriptionAcknowledgement() {
		ListOfSubscriptionAcknowledgementImpl listOfSubscriptionAcknowledgement = new ListOfSubscriptionAcknowledgementImpl();
		return listOfSubscriptionAcknowledgement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSubscriptionDiagnosticsDataType createListOfSubscriptionDiagnosticsDataType() {
		ListOfSubscriptionDiagnosticsDataTypeImpl listOfSubscriptionDiagnosticsDataType = new ListOfSubscriptionDiagnosticsDataTypeImpl();
		return listOfSubscriptionDiagnosticsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfTargetVariablesDataType createListOfTargetVariablesDataType() {
		ListOfTargetVariablesDataTypeImpl listOfTargetVariablesDataType = new ListOfTargetVariablesDataTypeImpl();
		return listOfTargetVariablesDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfThreeDCartesianCoordinates createListOfThreeDCartesianCoordinates() {
		ListOfThreeDCartesianCoordinatesImpl listOfThreeDCartesianCoordinates = new ListOfThreeDCartesianCoordinatesImpl();
		return listOfThreeDCartesianCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfThreeDFrame createListOfThreeDFrame() {
		ListOfThreeDFrameImpl listOfThreeDFrame = new ListOfThreeDFrameImpl();
		return listOfThreeDFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfThreeDOrientation createListOfThreeDOrientation() {
		ListOfThreeDOrientationImpl listOfThreeDOrientation = new ListOfThreeDOrientationImpl();
		return listOfThreeDOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfThreeDVector createListOfThreeDVector() {
		ListOfThreeDVectorImpl listOfThreeDVector = new ListOfThreeDVectorImpl();
		return listOfThreeDVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfTimeZoneDataType createListOfTimeZoneDataType() {
		ListOfTimeZoneDataTypeImpl listOfTimeZoneDataType = new ListOfTimeZoneDataTypeImpl();
		return listOfTimeZoneDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfTransferResult createListOfTransferResult() {
		ListOfTransferResultImpl listOfTransferResult = new ListOfTransferResultImpl();
		return listOfTransferResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfTrustListDataType createListOfTrustListDataType() {
		ListOfTrustListDataTypeImpl listOfTrustListDataType = new ListOfTrustListDataTypeImpl();
		return listOfTrustListDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUABinaryFileDataType createListOfUABinaryFileDataType() {
		ListOfUABinaryFileDataTypeImpl listOfUABinaryFileDataType = new ListOfUABinaryFileDataTypeImpl();
		return listOfUABinaryFileDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUadpDataSetMessageContentMask createListOfUadpDataSetMessageContentMask() {
		ListOfUadpDataSetMessageContentMaskImpl listOfUadpDataSetMessageContentMask = new ListOfUadpDataSetMessageContentMaskImpl();
		return listOfUadpDataSetMessageContentMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUadpDataSetReaderMessageDataType createListOfUadpDataSetReaderMessageDataType() {
		ListOfUadpDataSetReaderMessageDataTypeImpl listOfUadpDataSetReaderMessageDataType = new ListOfUadpDataSetReaderMessageDataTypeImpl();
		return listOfUadpDataSetReaderMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUadpDataSetWriterMessageDataType createListOfUadpDataSetWriterMessageDataType() {
		ListOfUadpDataSetWriterMessageDataTypeImpl listOfUadpDataSetWriterMessageDataType = new ListOfUadpDataSetWriterMessageDataTypeImpl();
		return listOfUadpDataSetWriterMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUadpNetworkMessageContentMask createListOfUadpNetworkMessageContentMask() {
		ListOfUadpNetworkMessageContentMaskImpl listOfUadpNetworkMessageContentMask = new ListOfUadpNetworkMessageContentMaskImpl();
		return listOfUadpNetworkMessageContentMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUadpWriterGroupMessageDataType createListOfUadpWriterGroupMessageDataType() {
		ListOfUadpWriterGroupMessageDataTypeImpl listOfUadpWriterGroupMessageDataType = new ListOfUadpWriterGroupMessageDataTypeImpl();
		return listOfUadpWriterGroupMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUInt16 createListOfUInt16() {
		ListOfUInt16Impl listOfUInt16 = new ListOfUInt16Impl();
		return listOfUInt16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUInt32 createListOfUInt32() {
		ListOfUInt32Impl listOfUInt32 = new ListOfUInt32Impl();
		return listOfUInt32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUInt64 createListOfUInt64() {
		ListOfUInt64Impl listOfUInt64 = new ListOfUInt64Impl();
		return listOfUInt64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUnion createListOfUnion() {
		ListOfUnionImpl listOfUnion = new ListOfUnionImpl();
		return listOfUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfUserTokenPolicy createListOfUserTokenPolicy() {
		ListOfUserTokenPolicyImpl listOfUserTokenPolicy = new ListOfUserTokenPolicyImpl();
		return listOfUserTokenPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfVariant createListOfVariant() {
		ListOfVariantImpl listOfVariant = new ListOfVariantImpl();
		return listOfVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfVector createListOfVector() {
		ListOfVectorImpl listOfVector = new ListOfVectorImpl();
		return listOfVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfWriterGroupDataType createListOfWriterGroupDataType() {
		ListOfWriterGroupDataTypeImpl listOfWriterGroupDataType = new ListOfWriterGroupDataTypeImpl();
		return listOfWriterGroupDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfWriterGroupMessageDataType createListOfWriterGroupMessageDataType() {
		ListOfWriterGroupMessageDataTypeImpl listOfWriterGroupMessageDataType = new ListOfWriterGroupMessageDataTypeImpl();
		return listOfWriterGroupMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfWriterGroupTransportDataType createListOfWriterGroupTransportDataType() {
		ListOfWriterGroupTransportDataTypeImpl listOfWriterGroupTransportDataType = new ListOfWriterGroupTransportDataTypeImpl();
		return listOfWriterGroupTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfWriteValue createListOfWriteValue() {
		ListOfWriteValueImpl listOfWriteValue = new ListOfWriteValueImpl();
		return listOfWriteValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfXmlElement createListOfXmlElement() {
		ListOfXmlElementImpl listOfXmlElement = new ListOfXmlElementImpl();
		return listOfXmlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralOperand createLiteralOperand() {
		LiteralOperandImpl literalOperand = new LiteralOperandImpl();
		return literalOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalizedText createLocalizedText() {
		LocalizedTextImpl localizedText = new LocalizedTextImpl();
		return localizedText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdnsDiscoveryConfiguration createMdnsDiscoveryConfiguration() {
		MdnsDiscoveryConfigurationImpl mdnsDiscoveryConfiguration = new MdnsDiscoveryConfigurationImpl();
		return mdnsDiscoveryConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodAttributes createMethodAttributes() {
		MethodAttributesImpl methodAttributes = new MethodAttributesImpl();
		return methodAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodNode createMethodNode() {
		MethodNodeImpl methodNode = new MethodNodeImpl();
		return methodNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelChangeStructureDataType createModelChangeStructureDataType() {
		ModelChangeStructureDataTypeImpl modelChangeStructureDataType = new ModelChangeStructureDataTypeImpl();
		return modelChangeStructureDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationInfo createModificationInfo() {
		ModificationInfoImpl modificationInfo = new ModificationInfoImpl();
		return modificationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyMonitoredItemsRequest createModifyMonitoredItemsRequest() {
		ModifyMonitoredItemsRequestImpl modifyMonitoredItemsRequest = new ModifyMonitoredItemsRequestImpl();
		return modifyMonitoredItemsRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyMonitoredItemsResponse createModifyMonitoredItemsResponse() {
		ModifyMonitoredItemsResponseImpl modifyMonitoredItemsResponse = new ModifyMonitoredItemsResponseImpl();
		return modifyMonitoredItemsResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifySubscriptionRequest createModifySubscriptionRequest() {
		ModifySubscriptionRequestImpl modifySubscriptionRequest = new ModifySubscriptionRequestImpl();
		return modifySubscriptionRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifySubscriptionResponse createModifySubscriptionResponse() {
		ModifySubscriptionResponseImpl modifySubscriptionResponse = new ModifySubscriptionResponseImpl();
		return modifySubscriptionResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoredItemCreateRequest createMonitoredItemCreateRequest() {
		MonitoredItemCreateRequestImpl monitoredItemCreateRequest = new MonitoredItemCreateRequestImpl();
		return monitoredItemCreateRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoredItemCreateResult createMonitoredItemCreateResult() {
		MonitoredItemCreateResultImpl monitoredItemCreateResult = new MonitoredItemCreateResultImpl();
		return monitoredItemCreateResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoredItemModifyRequest createMonitoredItemModifyRequest() {
		MonitoredItemModifyRequestImpl monitoredItemModifyRequest = new MonitoredItemModifyRequestImpl();
		return monitoredItemModifyRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoredItemModifyResult createMonitoredItemModifyResult() {
		MonitoredItemModifyResultImpl monitoredItemModifyResult = new MonitoredItemModifyResultImpl();
		return monitoredItemModifyResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoredItemNotification createMonitoredItemNotification() {
		MonitoredItemNotificationImpl monitoredItemNotification = new MonitoredItemNotificationImpl();
		return monitoredItemNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringFilter createMonitoringFilter() {
		MonitoringFilterImpl monitoringFilter = new MonitoringFilterImpl();
		return monitoringFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringFilterResult createMonitoringFilterResult() {
		MonitoringFilterResultImpl monitoringFilterResult = new MonitoringFilterResultImpl();
		return monitoringFilterResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringParameters createMonitoringParameters() {
		MonitoringParametersImpl monitoringParameters = new MonitoringParametersImpl();
		return monitoringParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkAddressDataType createNetworkAddressDataType() {
		NetworkAddressDataTypeImpl networkAddressDataType = new NetworkAddressDataTypeImpl();
		return networkAddressDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkAddressUrlDataType createNetworkAddressUrlDataType() {
		NetworkAddressUrlDataTypeImpl networkAddressUrlDataType = new NetworkAddressUrlDataTypeImpl();
		return networkAddressUrlDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkGroupDataType createNetworkGroupDataType() {
		NetworkGroupDataTypeImpl networkGroupDataType = new NetworkGroupDataTypeImpl();
		return networkGroupDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeAttributes createNodeAttributes() {
		NodeAttributesImpl nodeAttributes = new NodeAttributesImpl();
		return nodeAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeId createNodeId() {
		NodeIdImpl nodeId = new NodeIdImpl();
		return nodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeReference createNodeReference() {
		NodeReferenceImpl nodeReference = new NodeReferenceImpl();
		return nodeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTypeDescription createNodeTypeDescription() {
		NodeTypeDescriptionImpl nodeTypeDescription = new NodeTypeDescriptionImpl();
		return nodeTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationData createNotificationData() {
		NotificationDataImpl notificationData = new NotificationDataImpl();
		return notificationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationMessage createNotificationMessage() {
		NotificationMessageImpl notificationMessage = new NotificationMessageImpl();
		return notificationMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectAttributes createObjectAttributes() {
		ObjectAttributesImpl objectAttributes = new ObjectAttributesImpl();
		return objectAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNode createObjectNode() {
		ObjectNodeImpl objectNode = new ObjectNodeImpl();
		return objectNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeAttributes createObjectTypeAttributes() {
		ObjectTypeAttributesImpl objectTypeAttributes = new ObjectTypeAttributesImpl();
		return objectTypeAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeNode createObjectTypeNode() {
		ObjectTypeNodeImpl objectTypeNode = new ObjectTypeNodeImpl();
		return objectTypeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenSecureChannelRequest createOpenSecureChannelRequest() {
		OpenSecureChannelRequestImpl openSecureChannelRequest = new OpenSecureChannelRequestImpl();
		return openSecureChannelRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenSecureChannelResponse createOpenSecureChannelResponse() {
		OpenSecureChannelResponseImpl openSecureChannelResponse = new OpenSecureChannelResponseImpl();
		return openSecureChannelResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionSet createOptionSet() {
		OptionSetImpl optionSet = new OptionSetImpl();
		return optionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation createOrientation() {
		OrientationImpl orientation = new OrientationImpl();
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParsingResult createParsingResult() {
		ParsingResultImpl parsingResult = new ParsingResultImpl();
		return parsingResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramDiagnostic2DataType createProgramDiagnostic2DataType() {
		ProgramDiagnostic2DataTypeImpl programDiagnostic2DataType = new ProgramDiagnostic2DataTypeImpl();
		return programDiagnostic2DataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramDiagnosticDataType createProgramDiagnosticDataType() {
		ProgramDiagnosticDataTypeImpl programDiagnosticDataType = new ProgramDiagnosticDataTypeImpl();
		return programDiagnosticDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishedDataItemsDataType createPublishedDataItemsDataType() {
		PublishedDataItemsDataTypeImpl publishedDataItemsDataType = new PublishedDataItemsDataTypeImpl();
		return publishedDataItemsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishedDataSetDataType createPublishedDataSetDataType() {
		PublishedDataSetDataTypeImpl publishedDataSetDataType = new PublishedDataSetDataTypeImpl();
		return publishedDataSetDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishedDataSetSourceDataType createPublishedDataSetSourceDataType() {
		PublishedDataSetSourceDataTypeImpl publishedDataSetSourceDataType = new PublishedDataSetSourceDataTypeImpl();
		return publishedDataSetSourceDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishedEventsDataType createPublishedEventsDataType() {
		PublishedEventsDataTypeImpl publishedEventsDataType = new PublishedEventsDataTypeImpl();
		return publishedEventsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishedVariableDataType createPublishedVariableDataType() {
		PublishedVariableDataTypeImpl publishedVariableDataType = new PublishedVariableDataTypeImpl();
		return publishedVariableDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishRequest createPublishRequest() {
		PublishRequestImpl publishRequest = new PublishRequestImpl();
		return publishRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishResponse createPublishResponse() {
		PublishResponseImpl publishResponse = new PublishResponseImpl();
		return publishResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubSubConfigurationDataType createPubSubConfigurationDataType() {
		PubSubConfigurationDataTypeImpl pubSubConfigurationDataType = new PubSubConfigurationDataTypeImpl();
		return pubSubConfigurationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubSubConnectionDataType createPubSubConnectionDataType() {
		PubSubConnectionDataTypeImpl pubSubConnectionDataType = new PubSubConnectionDataTypeImpl();
		return pubSubConnectionDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubSubGroupDataType createPubSubGroupDataType() {
		PubSubGroupDataTypeImpl pubSubGroupDataType = new PubSubGroupDataTypeImpl();
		return pubSubGroupDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedName createQualifiedName() {
		QualifiedNameImpl qualifiedName = new QualifiedNameImpl();
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryDataDescription createQueryDataDescription() {
		QueryDataDescriptionImpl queryDataDescription = new QueryDataDescriptionImpl();
		return queryDataDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryDataSet createQueryDataSet() {
		QueryDataSetImpl queryDataSet = new QueryDataSetImpl();
		return queryDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFirstRequest createQueryFirstRequest() {
		QueryFirstRequestImpl queryFirstRequest = new QueryFirstRequestImpl();
		return queryFirstRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFirstResponse createQueryFirstResponse() {
		QueryFirstResponseImpl queryFirstResponse = new QueryFirstResponseImpl();
		return queryFirstResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryNextRequest createQueryNextRequest() {
		QueryNextRequestImpl queryNextRequest = new QueryNextRequestImpl();
		return queryNextRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryNextResponse createQueryNextResponse() {
		QueryNextResponseImpl queryNextResponse = new QueryNextResponseImpl();
		return queryNextResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RationalNumber createRationalNumber() {
		RationalNumberImpl rationalNumber = new RationalNumberImpl();
		return rationalNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadAnnotationDataDetails createReadAnnotationDataDetails() {
		ReadAnnotationDataDetailsImpl readAnnotationDataDetails = new ReadAnnotationDataDetailsImpl();
		return readAnnotationDataDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadAtTimeDetails createReadAtTimeDetails() {
		ReadAtTimeDetailsImpl readAtTimeDetails = new ReadAtTimeDetailsImpl();
		return readAtTimeDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReaderGroupDataType createReaderGroupDataType() {
		ReaderGroupDataTypeImpl readerGroupDataType = new ReaderGroupDataTypeImpl();
		return readerGroupDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReaderGroupMessageDataType createReaderGroupMessageDataType() {
		ReaderGroupMessageDataTypeImpl readerGroupMessageDataType = new ReaderGroupMessageDataTypeImpl();
		return readerGroupMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReaderGroupTransportDataType createReaderGroupTransportDataType() {
		ReaderGroupTransportDataTypeImpl readerGroupTransportDataType = new ReaderGroupTransportDataTypeImpl();
		return readerGroupTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadEventDetails createReadEventDetails() {
		ReadEventDetailsImpl readEventDetails = new ReadEventDetailsImpl();
		return readEventDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadProcessedDetails createReadProcessedDetails() {
		ReadProcessedDetailsImpl readProcessedDetails = new ReadProcessedDetailsImpl();
		return readProcessedDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadRawModifiedDetails createReadRawModifiedDetails() {
		ReadRawModifiedDetailsImpl readRawModifiedDetails = new ReadRawModifiedDetailsImpl();
		return readRawModifiedDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadRequest createReadRequest() {
		ReadRequestImpl readRequest = new ReadRequestImpl();
		return readRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadResponse createReadResponse() {
		ReadResponseImpl readResponse = new ReadResponseImpl();
		return readResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadValueId createReadValueId() {
		ReadValueIdImpl readValueId = new ReadValueIdImpl();
		return readValueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedundantServerDataType createRedundantServerDataType() {
		RedundantServerDataTypeImpl redundantServerDataType = new RedundantServerDataTypeImpl();
		return redundantServerDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceDescription createReferenceDescription() {
		ReferenceDescriptionImpl referenceDescription = new ReferenceDescriptionImpl();
		return referenceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceNode createReferenceNode() {
		ReferenceNodeImpl referenceNode = new ReferenceNodeImpl();
		return referenceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceTypeAttributes createReferenceTypeAttributes() {
		ReferenceTypeAttributesImpl referenceTypeAttributes = new ReferenceTypeAttributesImpl();
		return referenceTypeAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceTypeNode createReferenceTypeNode() {
		ReferenceTypeNodeImpl referenceTypeNode = new ReferenceTypeNodeImpl();
		return referenceTypeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredServer createRegisteredServer() {
		RegisteredServerImpl registeredServer = new RegisteredServerImpl();
		return registeredServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterNodesRequest createRegisterNodesRequest() {
		RegisterNodesRequestImpl registerNodesRequest = new RegisterNodesRequestImpl();
		return registerNodesRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterNodesResponse createRegisterNodesResponse() {
		RegisterNodesResponseImpl registerNodesResponse = new RegisterNodesResponseImpl();
		return registerNodesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterServer2Request createRegisterServer2Request() {
		RegisterServer2RequestImpl registerServer2Request = new RegisterServer2RequestImpl();
		return registerServer2Request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterServer2Response createRegisterServer2Response() {
		RegisterServer2ResponseImpl registerServer2Response = new RegisterServer2ResponseImpl();
		return registerServer2Response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterServerRequest createRegisterServerRequest() {
		RegisterServerRequestImpl registerServerRequest = new RegisterServerRequestImpl();
		return registerServerRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterServerResponse createRegisterServerResponse() {
		RegisterServerResponseImpl registerServerResponse = new RegisterServerResponseImpl();
		return registerServerResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativePath createRelativePath() {
		RelativePathImpl relativePath = new RelativePathImpl();
		return relativePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativePathElement createRelativePathElement() {
		RelativePathElementImpl relativePathElement = new RelativePathElementImpl();
		return relativePathElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepublishRequest createRepublishRequest() {
		RepublishRequestImpl republishRequest = new RepublishRequestImpl();
		return republishRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepublishResponse createRepublishResponse() {
		RepublishResponseImpl republishResponse = new RepublishResponseImpl();
		return republishResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestHeader createRequestHeader() {
		RequestHeaderImpl requestHeader = new RequestHeaderImpl();
		return requestHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseHeader createResponseHeader() {
		ResponseHeaderImpl responseHeader = new ResponseHeaderImpl();
		return responseHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePermissionType createRolePermissionType() {
		RolePermissionTypeImpl rolePermissionType = new RolePermissionTypeImpl();
		return rolePermissionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplingIntervalDiagnosticsDataType createSamplingIntervalDiagnosticsDataType() {
		SamplingIntervalDiagnosticsDataTypeImpl samplingIntervalDiagnosticsDataType = new SamplingIntervalDiagnosticsDataTypeImpl();
		return samplingIntervalDiagnosticsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticChangeStructureDataType createSemanticChangeStructureDataType() {
		SemanticChangeStructureDataTypeImpl semanticChangeStructureDataType = new SemanticChangeStructureDataTypeImpl();
		return semanticChangeStructureDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerDiagnosticsSummaryDataType createServerDiagnosticsSummaryDataType() {
		ServerDiagnosticsSummaryDataTypeImpl serverDiagnosticsSummaryDataType = new ServerDiagnosticsSummaryDataTypeImpl();
		return serverDiagnosticsSummaryDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerOnNetwork createServerOnNetwork() {
		ServerOnNetworkImpl serverOnNetwork = new ServerOnNetworkImpl();
		return serverOnNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerStatusDataType createServerStatusDataType() {
		ServerStatusDataTypeImpl serverStatusDataType = new ServerStatusDataTypeImpl();
		return serverStatusDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCounterDataType createServiceCounterDataType() {
		ServiceCounterDataTypeImpl serviceCounterDataType = new ServiceCounterDataTypeImpl();
		return serviceCounterDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFault createServiceFault() {
		ServiceFaultImpl serviceFault = new ServiceFaultImpl();
		return serviceFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionDiagnosticsDataType createSessionDiagnosticsDataType() {
		SessionDiagnosticsDataTypeImpl sessionDiagnosticsDataType = new SessionDiagnosticsDataTypeImpl();
		return sessionDiagnosticsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionlessInvokeRequestType createSessionlessInvokeRequestType() {
		SessionlessInvokeRequestTypeImpl sessionlessInvokeRequestType = new SessionlessInvokeRequestTypeImpl();
		return sessionlessInvokeRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionlessInvokeResponseType createSessionlessInvokeResponseType() {
		SessionlessInvokeResponseTypeImpl sessionlessInvokeResponseType = new SessionlessInvokeResponseTypeImpl();
		return sessionlessInvokeResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionSecurityDiagnosticsDataType createSessionSecurityDiagnosticsDataType() {
		SessionSecurityDiagnosticsDataTypeImpl sessionSecurityDiagnosticsDataType = new SessionSecurityDiagnosticsDataTypeImpl();
		return sessionSecurityDiagnosticsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetMonitoringModeRequest createSetMonitoringModeRequest() {
		SetMonitoringModeRequestImpl setMonitoringModeRequest = new SetMonitoringModeRequestImpl();
		return setMonitoringModeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetMonitoringModeResponse createSetMonitoringModeResponse() {
		SetMonitoringModeResponseImpl setMonitoringModeResponse = new SetMonitoringModeResponseImpl();
		return setMonitoringModeResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetPublishingModeRequest createSetPublishingModeRequest() {
		SetPublishingModeRequestImpl setPublishingModeRequest = new SetPublishingModeRequestImpl();
		return setPublishingModeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetPublishingModeResponse createSetPublishingModeResponse() {
		SetPublishingModeResponseImpl setPublishingModeResponse = new SetPublishingModeResponseImpl();
		return setPublishingModeResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetTriggeringRequest createSetTriggeringRequest() {
		SetTriggeringRequestImpl setTriggeringRequest = new SetTriggeringRequestImpl();
		return setTriggeringRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetTriggeringResponse createSetTriggeringResponse() {
		SetTriggeringResponseImpl setTriggeringResponse = new SetTriggeringResponseImpl();
		return setTriggeringResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureData createSignatureData() {
		SignatureDataImpl signatureData = new SignatureDataImpl();
		return signatureData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedSoftwareCertificate createSignedSoftwareCertificate() {
		SignedSoftwareCertificateImpl signedSoftwareCertificate = new SignedSoftwareCertificateImpl();
		return signedSoftwareCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAttributeOperand createSimpleAttributeOperand() {
		SimpleAttributeOperandImpl simpleAttributeOperand = new SimpleAttributeOperandImpl();
		return simpleAttributeOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypeDescription createSimpleTypeDescription() {
		SimpleTypeDescriptionImpl simpleTypeDescription = new SimpleTypeDescriptionImpl();
		return simpleTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusChangeNotification createStatusChangeNotification() {
		StatusChangeNotificationImpl statusChangeNotification = new StatusChangeNotificationImpl();
		return statusChangeNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCode createStatusCode() {
		StatusCodeImpl statusCode = new StatusCodeImpl();
		return statusCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusResult createStatusResult() {
		StatusResultImpl statusResult = new StatusResultImpl();
		return statusResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition createStructureDefinition() {
		StructureDefinitionImpl structureDefinition = new StructureDefinitionImpl();
		return structureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDescription createStructureDescription() {
		StructureDescriptionImpl structureDescription = new StructureDescriptionImpl();
		return structureDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureField createStructureField() {
		StructureFieldImpl structureField = new StructureFieldImpl();
		return structureField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribedDataSetDataType createSubscribedDataSetDataType() {
		SubscribedDataSetDataTypeImpl subscribedDataSetDataType = new SubscribedDataSetDataTypeImpl();
		return subscribedDataSetDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribedDataSetMirrorDataType createSubscribedDataSetMirrorDataType() {
		SubscribedDataSetMirrorDataTypeImpl subscribedDataSetMirrorDataType = new SubscribedDataSetMirrorDataTypeImpl();
		return subscribedDataSetMirrorDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionAcknowledgement createSubscriptionAcknowledgement() {
		SubscriptionAcknowledgementImpl subscriptionAcknowledgement = new SubscriptionAcknowledgementImpl();
		return subscriptionAcknowledgement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionDiagnosticsDataType createSubscriptionDiagnosticsDataType() {
		SubscriptionDiagnosticsDataTypeImpl subscriptionDiagnosticsDataType = new SubscriptionDiagnosticsDataTypeImpl();
		return subscriptionDiagnosticsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetVariablesDataType createTargetVariablesDataType() {
		TargetVariablesDataTypeImpl targetVariablesDataType = new TargetVariablesDataTypeImpl();
		return targetVariablesDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreeDCartesianCoordinates createThreeDCartesianCoordinates() {
		ThreeDCartesianCoordinatesImpl threeDCartesianCoordinates = new ThreeDCartesianCoordinatesImpl();
		return threeDCartesianCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreeDFrame createThreeDFrame() {
		ThreeDFrameImpl threeDFrame = new ThreeDFrameImpl();
		return threeDFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreeDOrientation createThreeDOrientation() {
		ThreeDOrientationImpl threeDOrientation = new ThreeDOrientationImpl();
		return threeDOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreeDVector createThreeDVector() {
		ThreeDVectorImpl threeDVector = new ThreeDVectorImpl();
		return threeDVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeZoneDataType createTimeZoneDataType() {
		TimeZoneDataTypeImpl timeZoneDataType = new TimeZoneDataTypeImpl();
		return timeZoneDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferResult createTransferResult() {
		TransferResultImpl transferResult = new TransferResultImpl();
		return transferResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferSubscriptionsRequest createTransferSubscriptionsRequest() {
		TransferSubscriptionsRequestImpl transferSubscriptionsRequest = new TransferSubscriptionsRequestImpl();
		return transferSubscriptionsRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferSubscriptionsResponse createTransferSubscriptionsResponse() {
		TransferSubscriptionsResponseImpl transferSubscriptionsResponse = new TransferSubscriptionsResponseImpl();
		return transferSubscriptionsResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslateBrowsePathsToNodeIdsRequest createTranslateBrowsePathsToNodeIdsRequest() {
		TranslateBrowsePathsToNodeIdsRequestImpl translateBrowsePathsToNodeIdsRequest = new TranslateBrowsePathsToNodeIdsRequestImpl();
		return translateBrowsePathsToNodeIdsRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslateBrowsePathsToNodeIdsResponse createTranslateBrowsePathsToNodeIdsResponse() {
		TranslateBrowsePathsToNodeIdsResponseImpl translateBrowsePathsToNodeIdsResponse = new TranslateBrowsePathsToNodeIdsResponseImpl();
		return translateBrowsePathsToNodeIdsResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustListDataType createTrustListDataType() {
		TrustListDataTypeImpl trustListDataType = new TrustListDataTypeImpl();
		return trustListDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeNode createTypeNode() {
		TypeNodeImpl typeNode = new TypeNodeImpl();
		return typeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UABinaryFileDataType createUABinaryFileDataType() {
		UABinaryFileDataTypeImpl uaBinaryFileDataType = new UABinaryFileDataTypeImpl();
		return uaBinaryFileDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UadpDataSetReaderMessageDataType createUadpDataSetReaderMessageDataType() {
		UadpDataSetReaderMessageDataTypeImpl uadpDataSetReaderMessageDataType = new UadpDataSetReaderMessageDataTypeImpl();
		return uadpDataSetReaderMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UadpDataSetWriterMessageDataType createUadpDataSetWriterMessageDataType() {
		UadpDataSetWriterMessageDataTypeImpl uadpDataSetWriterMessageDataType = new UadpDataSetWriterMessageDataTypeImpl();
		return uadpDataSetWriterMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UadpWriterGroupMessageDataType createUadpWriterGroupMessageDataType() {
		UadpWriterGroupMessageDataTypeImpl uadpWriterGroupMessageDataType = new UadpWriterGroupMessageDataTypeImpl();
		return uadpWriterGroupMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Union createUnion() {
		UnionImpl union = new UnionImpl();
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnregisterNodesRequest createUnregisterNodesRequest() {
		UnregisterNodesRequestImpl unregisterNodesRequest = new UnregisterNodesRequestImpl();
		return unregisterNodesRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnregisterNodesResponse createUnregisterNodesResponse() {
		UnregisterNodesResponseImpl unregisterNodesResponse = new UnregisterNodesResponseImpl();
		return unregisterNodesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateDataDetails createUpdateDataDetails() {
		UpdateDataDetailsImpl updateDataDetails = new UpdateDataDetailsImpl();
		return updateDataDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateEventDetails createUpdateEventDetails() {
		UpdateEventDetailsImpl updateEventDetails = new UpdateEventDetailsImpl();
		return updateEventDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateStructureDataDetails createUpdateStructureDataDetails() {
		UpdateStructureDataDetailsImpl updateStructureDataDetails = new UpdateStructureDataDetailsImpl();
		return updateStructureDataDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIdentityToken createUserIdentityToken() {
		UserIdentityTokenImpl userIdentityToken = new UserIdentityTokenImpl();
		return userIdentityToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserNameIdentityToken createUserNameIdentityToken() {
		UserNameIdentityTokenImpl userNameIdentityToken = new UserNameIdentityTokenImpl();
		return userNameIdentityToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTokenPolicy createUserTokenPolicy() {
		UserTokenPolicyImpl userTokenPolicy = new UserTokenPolicyImpl();
		return userTokenPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAttributes createVariableAttributes() {
		VariableAttributesImpl variableAttributes = new VariableAttributesImpl();
		return variableAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableNode createVariableNode() {
		VariableNodeImpl variableNode = new VariableNodeImpl();
		return variableNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableTypeAttributes createVariableTypeAttributes() {
		VariableTypeAttributesImpl variableTypeAttributes = new VariableTypeAttributesImpl();
		return variableTypeAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableTypeNode createVariableTypeNode() {
		VariableTypeNodeImpl variableTypeNode = new VariableTypeNodeImpl();
		return variableTypeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant createVariant() {
		VariantImpl variant = new VariantImpl();
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector createVector() {
		VectorImpl vector = new VectorImpl();
		return vector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewAttributes createViewAttributes() {
		ViewAttributesImpl viewAttributes = new ViewAttributesImpl();
		return viewAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewDescription createViewDescription() {
		ViewDescriptionImpl viewDescription = new ViewDescriptionImpl();
		return viewDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewNode createViewNode() {
		ViewNodeImpl viewNode = new ViewNodeImpl();
		return viewNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteRequest createWriteRequest() {
		WriteRequestImpl writeRequest = new WriteRequestImpl();
		return writeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteResponse createWriteResponse() {
		WriteResponseImpl writeResponse = new WriteResponseImpl();
		return writeResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriterGroupDataType createWriterGroupDataType() {
		WriterGroupDataTypeImpl writerGroupDataType = new WriterGroupDataTypeImpl();
		return writerGroupDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriterGroupMessageDataType createWriterGroupMessageDataType() {
		WriterGroupMessageDataTypeImpl writerGroupMessageDataType = new WriterGroupMessageDataTypeImpl();
		return writerGroupMessageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriterGroupTransportDataType createWriterGroupTransportDataType() {
		WriterGroupTransportDataTypeImpl writerGroupTransportDataType = new WriterGroupTransportDataTypeImpl();
		return writerGroupTransportDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteValue createWriteValue() {
		WriteValueImpl writeValue = new WriteValueImpl();
		return writeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X509IdentityToken createX509IdentityToken() {
		X509IdentityTokenImpl x509IdentityToken = new X509IdentityTokenImpl();
		return x509IdentityToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlElementType createXmlElementType() {
		XmlElementTypeImpl xmlElementType = new XmlElementTypeImpl();
		return xmlElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XVType createXVType() {
		XVTypeImpl xvType = new XVTypeImpl();
		return xvType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationType createApplicationTypeFromString(EDataType eDataType, String initialValue) {
		ApplicationType result = ApplicationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisScaleEnumeration createAxisScaleEnumerationFromString(EDataType eDataType, String initialValue) {
		AxisScaleEnumeration result = AxisScaleEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAxisScaleEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerTransportQualityOfService createBrokerTransportQualityOfServiceFromString(EDataType eDataType, String initialValue) {
		BrokerTransportQualityOfService result = BrokerTransportQualityOfService.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBrokerTransportQualityOfServiceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseDirection createBrowseDirectionFromString(EDataType eDataType, String initialValue) {
		BrowseDirection result = BrowseDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBrowseDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseResultMask createBrowseResultMaskFromString(EDataType eDataType, String initialValue) {
		BrowseResultMask result = BrowseResultMask.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBrowseResultMaskToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataChangeTrigger createDataChangeTriggerFromString(EDataType eDataType, String initialValue) {
		DataChangeTrigger result = DataChangeTrigger.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataChangeTriggerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetOrderingType createDataSetOrderingTypeFromString(EDataType eDataType, String initialValue) {
		DataSetOrderingType result = DataSetOrderingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSetOrderingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeadbandType createDeadbandTypeFromString(EDataType eDataType, String initialValue) {
		DeadbandType result = DeadbandType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeadbandTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticsLevel createDiagnosticsLevelFromString(EDataType eDataType, String initialValue) {
		DiagnosticsLevel result = DiagnosticsLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticsLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionDeviationFormat createExceptionDeviationFormatFromString(EDataType eDataType, String initialValue) {
		ExceptionDeviationFormat result = ExceptionDeviationFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionDeviationFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperator createFilterOperatorFromString(EDataType eDataType, String initialValue) {
		FilterOperator result = FilterOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryUpdateType createHistoryUpdateTypeFromString(EDataType eDataType, String initialValue) {
		HistoryUpdateType result = HistoryUpdateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHistoryUpdateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityCriteriaType createIdentityCriteriaTypeFromString(EDataType eDataType, String initialValue) {
		IdentityCriteriaType result = IdentityCriteriaType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentityCriteriaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdType createIdTypeFromString(EDataType eDataType, String initialValue) {
		IdType result = IdType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSecurityMode createMessageSecurityModeFromString(EDataType eDataType, String initialValue) {
		MessageSecurityMode result = MessageSecurityMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSecurityModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelChangeStructureVerbMask createModelChangeStructureVerbMaskFromString(EDataType eDataType, String initialValue) {
		ModelChangeStructureVerbMask result = ModelChangeStructureVerbMask.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelChangeStructureVerbMaskToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringMode createMonitoringModeFromString(EDataType eDataType, String initialValue) {
		MonitoringMode result = MonitoringMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonitoringModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeAttributesMask createNodeAttributesMaskFromString(EDataType eDataType, String initialValue) {
		NodeAttributesMask result = NodeAttributesMask.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeAttributesMaskToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeClass createNodeClassFromString(EDataType eDataType, String initialValue) {
		NodeClass result = NodeClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenFileMode createOpenFileModeFromString(EDataType eDataType, String initialValue) {
		OpenFileMode result = OpenFileMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpenFileModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverrideValueHandling createOverrideValueHandlingFromString(EDataType eDataType, String initialValue) {
		OverrideValueHandling result = OverrideValueHandling.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOverrideValueHandlingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformUpdateType createPerformUpdateTypeFromString(EDataType eDataType, String initialValue) {
		PerformUpdateType result = PerformUpdateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPerformUpdateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubSubDiagnosticsCounterClassification createPubSubDiagnosticsCounterClassificationFromString(EDataType eDataType, String initialValue) {
		PubSubDiagnosticsCounterClassification result = PubSubDiagnosticsCounterClassification.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPubSubDiagnosticsCounterClassificationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubSubState createPubSubStateFromString(EDataType eDataType, String initialValue) {
		PubSubState result = PubSubState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPubSubStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedundancySupport createRedundancySupportFromString(EDataType eDataType, String initialValue) {
		RedundancySupport result = RedundancySupport.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRedundancySupportToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityTokenRequestType createSecurityTokenRequestTypeFromString(EDataType eDataType, String initialValue) {
		SecurityTokenRequestType result = SecurityTokenRequestType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityTokenRequestTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerState createServerStateFromString(EDataType eDataType, String initialValue) {
		ServerState result = ServerState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServerStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureType createStructureTypeFromString(EDataType eDataType, String initialValue) {
		StructureType result = StructureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampsToReturn createTimestampsToReturnFromString(EDataType eDataType, String initialValue) {
		TimestampsToReturn result = TimestampsToReturn.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimestampsToReturnToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustListMasks createTrustListMasksFromString(EDataType eDataType, String initialValue) {
		TrustListMasks result = TrustListMasks.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrustListMasksToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTokenType createUserTokenTypeFromString(EDataType eDataType, String initialValue) {
		UserTokenType result = UserTokenType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserTokenTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createAccessLevelExTypeFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessLevelExTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.UNSIGNED_INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createAccessLevelExTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAccessLevelExTypeFromString(TypesPackage.eINSTANCE.getAccessLevelExType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessLevelExTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccessLevelExTypeToString(TypesPackage.eINSTANCE.getAccessLevelExType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createAccessLevelTypeFromString(EDataType eDataType, String initialValue) {
		return (Short)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_BYTE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.UNSIGNED_BYTE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createAccessLevelTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAccessLevelTypeFromString(TypesPackage.eINSTANCE.getAccessLevelType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessLevelTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccessLevelTypeToString(TypesPackage.eINSTANCE.getAccessLevelType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationType createApplicationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createApplicationTypeFromString(TypesPackage.eINSTANCE.getApplicationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertApplicationTypeToString(TypesPackage.eINSTANCE.getApplicationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createAttributeWriteMaskFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeWriteMaskToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.UNSIGNED_INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createAttributeWriteMaskObjectFromString(EDataType eDataType, String initialValue) {
		return createAttributeWriteMaskFromString(TypesPackage.eINSTANCE.getAttributeWriteMask(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeWriteMaskObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAttributeWriteMaskToString(TypesPackage.eINSTANCE.getAttributeWriteMask(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisScaleEnumeration createAxisScaleEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createAxisScaleEnumerationFromString(TypesPackage.eINSTANCE.getAxisScaleEnumeration(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAxisScaleEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAxisScaleEnumerationToString(TypesPackage.eINSTANCE.getAxisScaleEnumeration(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerTransportQualityOfService createBrokerTransportQualityOfServiceObjectFromString(EDataType eDataType, String initialValue) {
		return createBrokerTransportQualityOfServiceFromString(TypesPackage.eINSTANCE.getBrokerTransportQualityOfService(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBrokerTransportQualityOfServiceObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBrokerTransportQualityOfServiceToString(TypesPackage.eINSTANCE.getBrokerTransportQualityOfService(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseDirection createBrowseDirectionObjectFromString(EDataType eDataType, String initialValue) {
		return createBrowseDirectionFromString(TypesPackage.eINSTANCE.getBrowseDirection(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBrowseDirectionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBrowseDirectionToString(TypesPackage.eINSTANCE.getBrowseDirection(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseResultMask createBrowseResultMaskObjectFromString(EDataType eDataType, String initialValue) {
		return createBrowseResultMaskFromString(TypesPackage.eINSTANCE.getBrowseResultMask(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBrowseResultMaskObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBrowseResultMaskToString(TypesPackage.eINSTANCE.getBrowseResultMask(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataChangeTrigger createDataChangeTriggerObjectFromString(EDataType eDataType, String initialValue) {
		return createDataChangeTriggerFromString(TypesPackage.eINSTANCE.getDataChangeTrigger(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataChangeTriggerObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataChangeTriggerToString(TypesPackage.eINSTANCE.getDataChangeTrigger(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createDataSetFieldContentMaskFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSetFieldContentMaskToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.UNSIGNED_INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createDataSetFieldContentMaskObjectFromString(EDataType eDataType, String initialValue) {
		return createDataSetFieldContentMaskFromString(TypesPackage.eINSTANCE.getDataSetFieldContentMask(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSetFieldContentMaskObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataSetFieldContentMaskToString(TypesPackage.eINSTANCE.getDataSetFieldContentMask(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createDataSetFieldFlagsFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_SHORT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSetFieldFlagsToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.UNSIGNED_SHORT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createDataSetFieldFlagsObjectFromString(EDataType eDataType, String initialValue) {
		return createDataSetFieldFlagsFromString(TypesPackage.eINSTANCE.getDataSetFieldFlags(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSetFieldFlagsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataSetFieldFlagsToString(TypesPackage.eINSTANCE.getDataSetFieldFlags(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetOrderingType createDataSetOrderingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDataSetOrderingTypeFromString(TypesPackage.eINSTANCE.getDataSetOrderingType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSetOrderingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataSetOrderingTypeToString(TypesPackage.eINSTANCE.getDataSetOrderingType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeadbandType createDeadbandTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDeadbandTypeFromString(TypesPackage.eINSTANCE.getDeadbandType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeadbandTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeadbandTypeToString(TypesPackage.eINSTANCE.getDeadbandType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticsLevel createDiagnosticsLevelObjectFromString(EDataType eDataType, String initialValue) {
		return createDiagnosticsLevelFromString(TypesPackage.eINSTANCE.getDiagnosticsLevel(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticsLevelObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDiagnosticsLevelToString(TypesPackage.eINSTANCE.getDiagnosticsLevel(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createEventNotifierTypeFromString(EDataType eDataType, String initialValue) {
		return (Short)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_BYTE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventNotifierTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.UNSIGNED_BYTE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createEventNotifierTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEventNotifierTypeFromString(TypesPackage.eINSTANCE.getEventNotifierType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventNotifierTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventNotifierTypeToString(TypesPackage.eINSTANCE.getEventNotifierType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionDeviationFormat createExceptionDeviationFormatObjectFromString(EDataType eDataType, String initialValue) {
		return createExceptionDeviationFormatFromString(TypesPackage.eINSTANCE.getExceptionDeviationFormat(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionDeviationFormatObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExceptionDeviationFormatToString(TypesPackage.eINSTANCE.getExceptionDeviationFormat(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperator createFilterOperatorObjectFromString(EDataType eDataType, String initialValue) {
		return createFilterOperatorFromString(TypesPackage.eINSTANCE.getFilterOperator(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterOperatorObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFilterOperatorToString(TypesPackage.eINSTANCE.getFilterOperator(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryUpdateType createHistoryUpdateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHistoryUpdateTypeFromString(TypesPackage.eINSTANCE.getHistoryUpdateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHistoryUpdateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHistoryUpdateTypeToString(TypesPackage.eINSTANCE.getHistoryUpdateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityCriteriaType createIdentityCriteriaTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIdentityCriteriaTypeFromString(TypesPackage.eINSTANCE.getIdentityCriteriaType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentityCriteriaTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIdentityCriteriaTypeToString(TypesPackage.eINSTANCE.getIdentityCriteriaType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdType createIdTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIdTypeFromString(TypesPackage.eINSTANCE.getIdType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIdTypeToString(TypesPackage.eINSTANCE.getIdType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createJsonDataSetMessageContentMaskFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJsonDataSetMessageContentMaskToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.UNSIGNED_INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createJsonDataSetMessageContentMaskObjectFromString(EDataType eDataType, String initialValue) {
		return createJsonDataSetMessageContentMaskFromString(TypesPackage.eINSTANCE.getJsonDataSetMessageContentMask(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJsonDataSetMessageContentMaskObjectToString(EDataType eDataType, Object instanceValue) {
		return convertJsonDataSetMessageContentMaskToString(TypesPackage.eINSTANCE.getJsonDataSetMessageContentMask(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createJsonNetworkMessageContentMaskFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJsonNetworkMessageContentMaskToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.UNSIGNED_INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createJsonNetworkMessageContentMaskObjectFromString(EDataType eDataType, String initialValue) {
		return createJsonNetworkMessageContentMaskFromString(TypesPackage.eINSTANCE.getJsonNetworkMessageContentMask(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJsonNetworkMessageContentMaskObjectToString(EDataType eDataType, Object instanceValue) {
		return convertJsonNetworkMessageContentMaskToString(TypesPackage.eINSTANCE.getJsonNetworkMessageContentMask(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSecurityMode createMessageSecurityModeObjectFromString(EDataType eDataType, String initialValue) {
		return createMessageSecurityModeFromString(TypesPackage.eINSTANCE.getMessageSecurityMode(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSecurityModeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageSecurityModeToString(TypesPackage.eINSTANCE.getMessageSecurityMode(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelChangeStructureVerbMask createModelChangeStructureVerbMaskObjectFromString(EDataType eDataType, String initialValue) {
		return createModelChangeStructureVerbMaskFromString(TypesPackage.eINSTANCE.getModelChangeStructureVerbMask(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelChangeStructureVerbMaskObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModelChangeStructureVerbMaskToString(TypesPackage.eINSTANCE.getModelChangeStructureVerbMask(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringMode createMonitoringModeObjectFromString(EDataType eDataType, String initialValue) {
		return createMonitoringModeFromString(TypesPackage.eINSTANCE.getMonitoringMode(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonitoringModeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMonitoringModeToString(TypesPackage.eINSTANCE.getMonitoringMode(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeAttributesMask createNodeAttributesMaskObjectFromString(EDataType eDataType, String initialValue) {
		return createNodeAttributesMaskFromString(TypesPackage.eINSTANCE.getNodeAttributesMask(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeAttributesMaskObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNodeAttributesMaskToString(TypesPackage.eINSTANCE.getNodeAttributesMask(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeClass createNodeClassObjectFromString(EDataType eDataType, String initialValue) {
		return createNodeClassFromString(TypesPackage.eINSTANCE.getNodeClass(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeClassObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNodeClassToString(TypesPackage.eINSTANCE.getNodeClass(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenFileMode createOpenFileModeObjectFromString(EDataType eDataType, String initialValue) {
		return createOpenFileModeFromString(TypesPackage.eINSTANCE.getOpenFileMode(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpenFileModeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOpenFileModeToString(TypesPackage.eINSTANCE.getOpenFileMode(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverrideValueHandling createOverrideValueHandlingObjectFromString(EDataType eDataType, String initialValue) {
		return createOverrideValueHandlingFromString(TypesPackage.eINSTANCE.getOverrideValueHandling(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOverrideValueHandlingObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOverrideValueHandlingToString(TypesPackage.eINSTANCE.getOverrideValueHandling(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformUpdateType createPerformUpdateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPerformUpdateTypeFromString(TypesPackage.eINSTANCE.getPerformUpdateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPerformUpdateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPerformUpdateTypeToString(TypesPackage.eINSTANCE.getPerformUpdateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createPermissionTypeFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.UNSIGNED_INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createPermissionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPermissionTypeFromString(TypesPackage.eINSTANCE.getPermissionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPermissionTypeToString(TypesPackage.eINSTANCE.getPermissionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubSubDiagnosticsCounterClassification createPubSubDiagnosticsCounterClassificationObjectFromString(EDataType eDataType, String initialValue) {
		return createPubSubDiagnosticsCounterClassificationFromString(TypesPackage.eINSTANCE.getPubSubDiagnosticsCounterClassification(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPubSubDiagnosticsCounterClassificationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPubSubDiagnosticsCounterClassificationToString(TypesPackage.eINSTANCE.getPubSubDiagnosticsCounterClassification(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubSubState createPubSubStateObjectFromString(EDataType eDataType, String initialValue) {
		return createPubSubStateFromString(TypesPackage.eINSTANCE.getPubSubState(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPubSubStateObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPubSubStateToString(TypesPackage.eINSTANCE.getPubSubState(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedundancySupport createRedundancySupportObjectFromString(EDataType eDataType, String initialValue) {
		return createRedundancySupportFromString(TypesPackage.eINSTANCE.getRedundancySupport(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRedundancySupportObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRedundancySupportToString(TypesPackage.eINSTANCE.getRedundancySupport(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityTokenRequestType createSecurityTokenRequestTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSecurityTokenRequestTypeFromString(TypesPackage.eINSTANCE.getSecurityTokenRequestType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityTokenRequestTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSecurityTokenRequestTypeToString(TypesPackage.eINSTANCE.getSecurityTokenRequestType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerState createServerStateObjectFromString(EDataType eDataType, String initialValue) {
		return createServerStateFromString(TypesPackage.eINSTANCE.getServerState(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServerStateObjectToString(EDataType eDataType, Object instanceValue) {
		return convertServerStateToString(TypesPackage.eINSTANCE.getServerState(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureType createStructureTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureTypeFromString(TypesPackage.eINSTANCE.getStructureType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureTypeToString(TypesPackage.eINSTANCE.getStructureType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampsToReturn createTimestampsToReturnObjectFromString(EDataType eDataType, String initialValue) {
		return createTimestampsToReturnFromString(TypesPackage.eINSTANCE.getTimestampsToReturn(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimestampsToReturnObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimestampsToReturnToString(TypesPackage.eINSTANCE.getTimestampsToReturn(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustListMasks createTrustListMasksObjectFromString(EDataType eDataType, String initialValue) {
		return createTrustListMasksFromString(TypesPackage.eINSTANCE.getTrustListMasks(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrustListMasksObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTrustListMasksToString(TypesPackage.eINSTANCE.getTrustListMasks(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createUadpDataSetMessageContentMaskFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUadpDataSetMessageContentMaskToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.UNSIGNED_INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createUadpDataSetMessageContentMaskObjectFromString(EDataType eDataType, String initialValue) {
		return createUadpDataSetMessageContentMaskFromString(TypesPackage.eINSTANCE.getUadpDataSetMessageContentMask(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUadpDataSetMessageContentMaskObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUadpDataSetMessageContentMaskToString(TypesPackage.eINSTANCE.getUadpDataSetMessageContentMask(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createUadpNetworkMessageContentMaskFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUadpNetworkMessageContentMaskToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.UNSIGNED_INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createUadpNetworkMessageContentMaskObjectFromString(EDataType eDataType, String initialValue) {
		return createUadpNetworkMessageContentMaskFromString(TypesPackage.eINSTANCE.getUadpNetworkMessageContentMask(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUadpNetworkMessageContentMaskObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUadpNetworkMessageContentMaskToString(TypesPackage.eINSTANCE.getUadpNetworkMessageContentMask(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTokenType createUserTokenTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUserTokenTypeFromString(TypesPackage.eINSTANCE.getUserTokenType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserTokenTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUserTokenTypeToString(TypesPackage.eINSTANCE.getUserTokenType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesPackage getTypesPackage() {
		return (TypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypesPackage getPackage() {
		return TypesPackage.eINSTANCE;
	}

} //TypesFactoryImpl
